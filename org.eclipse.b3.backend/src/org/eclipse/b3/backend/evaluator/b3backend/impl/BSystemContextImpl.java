/**
 * Copyright (c) 2009-2010, Cloudsmith Inc and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 * - Cloudsmith Inc - initial API and implementation.
 */

package org.eclipse.b3.backend.evaluator.b3backend.impl;

import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Iterator;
import java.util.LinkedList;

import org.eclipse.b3.backend.core.exceptions.B3AmbiguousFunctionSignatureException;
import org.eclipse.b3.backend.core.exceptions.B3EngineException;
import org.eclipse.b3.backend.core.exceptions.B3InternalError;
import org.eclipse.b3.backend.core.exceptions.B3NoSuchFunctionSignatureException;
import org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage;
import org.eclipse.b3.backend.evaluator.b3backend.BSystemContext;
import org.eclipse.b3.backend.evaluator.b3backend.IFunction;
import org.eclipse.b3.backend.evaluator.typesystem.TypeUtils;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BSystem Context</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 * 
 * @generated
 */
public class BSystemContextImpl extends BExecutionContextImpl implements BSystemContext {
	private static class MethodCandidate extends TypeUtils.AdaptingJavaCandidate<Method> {

		public MethodCandidate(Method aMethod) {
			super(aMethod);
		}

		public Method getMethod() {
			return adaptedObject;
		}

		@Override
		public String getName() {
			return adaptedObject.getName();
		}

		public boolean isVarArgs() {
			return adaptedObject.isVarArgs();
		}

		@Override
		protected Type[] getJavaParameterTypes() {
			return adaptedObject.getGenericParameterTypes();
		}

	}

	private static class MethodCandidateSource extends TypeUtils.CandidateSource<MethodCandidate> {

		private class MethodCandidateIterator implements Iterator<MethodCandidate> {

			private int currentIndex;

			public boolean hasNext() {
				return currentIndex < methods.length;
			}

			public MethodCandidate next() {
				return new MethodCandidate(methods[currentIndex++]);
			}

			public void remove() {
				throw new UnsupportedOperationException();
			}

		}

		private Method[] methods;

		public MethodCandidateSource(Class<?> aClass) {
			methods = aClass.getMethods();
		}

		public Iterator<MethodCandidate> iterator() {
			return new MethodCandidateIterator();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	protected BSystemContextImpl() {
		super();
		BExecutionContextImpl.counter = 0;
		// must have a func store as functions are added after children are created.
		// A system context also never gets parent set, so there is no other chance of doing this.
		createFuncStore();
	}

	/**
	 * <!-- begin-user-doc -->
	 * Loads a method, and defines it in this context. If finding and loading a method worked, true is returned,
	 * else false. Error conditions that should surface to a a user are thrown as a {@link B3EngineException},
	 * most notably {@link B3AmbiguousFunctionSignatureException} which denotes that more than one signature
	 * was found for the type parameters.
	 * <!-- end-user-doc -->
	 * 
	 * @throws B3EngineException
	 * @throws B3AmbiguousFunctionSignatureException
	 * @generated NOT
	 */
	public IFunction loadMethod(String functionName, Type[] types) throws B3EngineException {
		Method method = null;
		try {
			method = findMethod(functionName, types);
		}
		catch(B3NoSuchFunctionSignatureException e) {
			return null;
		}
		catch(SecurityException e) {
			throw new B3InternalError("Security exception while loading method", e);
		}
		catch(NoSuchMethodException e) {
			return null;
		}
		return loadFunction(method);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return B3backendPackage.Literals.BSYSTEM_CONTEXT;
	}

	private Method findMethod(String methodName, Type[] types) throws B3NoSuchFunctionSignatureException,
			B3AmbiguousFunctionSignatureException, SecurityException, NoSuchMethodException {
		// in Java, all calls refer to an instance/class (which must be in the first parameter)
		if(types.length == 0)
			throw new B3NoSuchFunctionSignatureException(methodName, types);

		Class<?> objectType = TypeUtils.getRaw(types[0]);
		Type[] parameterTypes = new Type[types.length - 1];

		System.arraycopy(types, 1, parameterTypes, 0, parameterTypes.length);

		LinkedList<MethodCandidate> candidateMethods = TypeUtils.Candidate.findMostSpecificApplicableCandidates(
			methodName, parameterTypes, new MethodCandidateSource(objectType));

		switch(candidateMethods.size()) {
			case 0: // no candidate method found
				throw new B3NoSuchFunctionSignatureException(methodName, types);
			case 1: { // one candidate method found
				Method candidateMethod = candidateMethods.getFirst().getMethod();

				// return the result of a call to java.lang.Class.getMethod() to get the most specific implementation
				// of the candidate method
				return objectType.getMethod(candidateMethod.getName(), candidateMethod.getParameterTypes());
			}
			default: // more than one candidate method found (the method call is ambiguous)
				throw new B3AmbiguousFunctionSignatureException(methodName, types);
		}
	}

} // BSystemContextImpl
