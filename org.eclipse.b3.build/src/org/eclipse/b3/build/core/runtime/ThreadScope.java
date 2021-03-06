/**
 * Copyright (c) 2010, Cloudsmith Inc.
 * The code, documentation and other materials contained herein have been
 * licensed under the Eclipse Public License - v 1.0 by the copyright holder
 * listed above, as the Initial Contributor under such license. The text of
 * such license is available at www.eclipse.org.
 */

package org.eclipse.b3.build.core.runtime;

import static com.google.common.base.Preconditions.checkState;

import java.util.Map;

import com.google.common.collect.Maps;
import com.google.inject.Key;
import com.google.inject.OutOfScopeException;
import com.google.inject.Provider;
import com.google.inject.Scope;

/**
 * Scopes a single execution of a block of code. Apply this scope with a
 * try/finally block:
 * 
 * <pre>
 * @code
 * 
 *   scope.enter();
 *   try {
 *     // explicitly seed some seed objects...
 *     scope.seed(Key.get(SomeObject.class), someObject);
 *     // create and access scoped objects
 *   } finally {
 *     scope.exit();
 *   }
 * }
 * </pre>
 * 
 * The scope can be initialized with one or more seed values by
 * calling <code>seed(key, value)</code> before the injector will be called upon to
 * provide for this key. A typical use is for a servlet filter to enter/exit the
 * scope, representing a Request Scope, and seed HttpServletRequest and
 * HttpServletResponse. For each key inserted with seed(), it's good practice
 * (since you have to provide <i>some</i> binding anyhow) to include a
 * corresponding binding that will throw an exception if Guice is asked to
 * provide for that key if it was not yet seeded:
 * 
 * <pre>
 * @code
 * 
 *   bind(key)
 *       .toProvider(ThreadScope.<KeyClass>seededKeyProvider())
 *       .in(ScopeAnnotation.class);
 * }
 * </pre>
 * 
 * @author Jesse Wilson
 * @author Fedor Karpelevitch
 */
public class ThreadScope implements Scope {

	private static final Provider<Object> SEEDED_KEY_PROVIDER = new Provider<Object>() {
		public Object get() {
			throw new IllegalStateException("If you got here then it means that"
					+ " your code asked for scoped object which should have been"
					+ " explicitly seeded in this scope by calling" + " ThreadScope.seed(), but was not.");
		}
	};

	/**
	 * Returns a provider that always throws exception complaining that the object
	 * in question must be seeded before it can be injected.
	 * 
	 * @return typed provider
	 */
	@SuppressWarnings({ "unchecked" })
	public static <T> Provider<T> seededKeyProvider() {
		return (Provider<T>) SEEDED_KEY_PROVIDER;
	}

	private final ThreadLocal<Map<Key<?>, Object>> values = new ThreadLocal<Map<Key<?>, Object>>();

	public void enter() {
		checkState(values.get() == null, "A scoping block is already in progress");
		values.set(Maps.<Key<?>, Object> newHashMap());
	}

	public void exit() {
		checkState(values.get() != null, "No scoping block in progress");
		values.remove();
	}

	public <T> Provider<T> scope(final Key<T> key, final Provider<T> unscoped) {
		return new Provider<T>() {
			public T get() {
				Map<Key<?>, Object> scopedObjects = getScopedObjectMap(key);

				@SuppressWarnings("unchecked")
				T current = (T) scopedObjects.get(key);
				if(current == null && !scopedObjects.containsKey(key)) {
					current = unscoped.get();
					scopedObjects.put(key, current);
				}
				return current;
			}
		};
	}

	public <T> void seed(Class<T> clazz, T value) {
		seed(Key.get(clazz), value);
	}

	public <T> void seed(Key<T> key, T value) {
		Map<Key<?>, Object> scopedObjects = getScopedObjectMap(key);
		checkState(!scopedObjects.containsKey(key), "A value for the key %s was "
				+ "already seeded in this scope. Old value: %s New value: %s", key, scopedObjects.get(key), value);
		scopedObjects.put(key, value);
	}

	private <T> Map<Key<?>, Object> getScopedObjectMap(Key<T> key) {
		Map<Key<?>, Object> scopedObjects = values.get();
		if(scopedObjects == null) {
			throw new OutOfScopeException("Cannot access " + key + " outside of a scoping block");
		}
		return scopedObjects;
	}
}
