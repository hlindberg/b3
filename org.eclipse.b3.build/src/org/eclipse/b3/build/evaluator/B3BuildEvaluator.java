/**
 * Copyright (c) 2009-2010, Cloudsmith Inc.
 * The code, documentation and other materials contained herein have been
 * licensed under the Eclipse Public License - v 1.0 by the copyright holder
 * listed above, as the Initial Contributor under such license. The text of
 * such license is available at www.eclipse.org.
 */

package org.eclipse.b3.build.evaluator;

import java.lang.reflect.Type;
import java.net.URI;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

import org.eclipse.b3.backend.core.B3Debug;
import org.eclipse.b3.backend.core.IB3Weaver;
import org.eclipse.b3.backend.core.exceptions.B3EngineException;
import org.eclipse.b3.backend.core.exceptions.B3InternalError;
import org.eclipse.b3.backend.evaluator.B3BackendEvaluator;
import org.eclipse.b3.backend.evaluator.b3backend.B3JavaImport;
import org.eclipse.b3.backend.evaluator.b3backend.B3MetaClass;
import org.eclipse.b3.backend.evaluator.b3backend.B3backendFactory;
import org.eclipse.b3.backend.evaluator.b3backend.BChainedExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BContext;
import org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext;
import org.eclipse.b3.backend.evaluator.b3backend.BExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BLiteralAny;
import org.eclipse.b3.backend.evaluator.b3backend.BParameterDeclaration;
import org.eclipse.b3.backend.evaluator.b3backend.BRegularExpression;
import org.eclipse.b3.backend.evaluator.b3backend.IFunction;
import org.eclipse.b3.backend.evaluator.b3backend.impl.BExecutionContextImpl;
import org.eclipse.b3.backend.evaluator.typesystem.TypeUtils;
import org.eclipse.b3.build.BeeModel;
import org.eclipse.b3.build.BuildUnit;
import org.eclipse.b3.build.Builder;
import org.eclipse.b3.build.BuilderCallFacade;
import org.eclipse.b3.build.BuilderConcernContext;
import org.eclipse.b3.build.BuilderNamePredicate;
import org.eclipse.b3.build.BuilderWrapper;
import org.eclipse.b3.build.Capability;
import org.eclipse.b3.build.FirstFoundUnitProvider;
import org.eclipse.b3.build.IBuilder;
import org.eclipse.b3.build.ImplementsPredicate;
import org.eclipse.b3.build.InputPredicate;
import org.eclipse.b3.build.OutputPredicate;
import org.eclipse.b3.build.PathGroup;
import org.eclipse.b3.build.PathGroupPredicate;
import org.eclipse.b3.build.ProvidesPredicate;
import org.eclipse.b3.build.RepoOption;
import org.eclipse.b3.build.Repository;
import org.eclipse.b3.build.RequiredCapability;
import org.eclipse.b3.build.RequiresPredicate;
import org.eclipse.b3.build.SourcePredicate;
import org.eclipse.b3.build.UnitConcernContext;
import org.eclipse.b3.build.UnitNamePredicate;
import org.eclipse.b3.build.UnitProvider;
import org.eclipse.b3.build.core.B3BuildConstants;
import org.eclipse.b3.build.core.B3BuilderJob;
import org.eclipse.b3.build.core.adapters.BuildUnitProxyAdapter;
import org.eclipse.b3.build.core.adapters.BuildUnitProxyAdapterFactory;
import org.eclipse.b3.build.core.iterators.BuilderCallIteratorProvider;
import org.eclipse.b3.build.core.iterators.EffectiveUnitIterator;
import org.eclipse.b3.build.core.iterators.PathIterator;
import org.eclipse.b3.build.repository.IBuildUnitRepository;
import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.osgi.util.NLS;

import com.google.inject.Injector;
import com.google.inject.Key;
import com.google.inject.name.Names;

/**
 * Evaluator of Build package objects.
 * 
 */
public class B3BuildEvaluator extends B3BackendEvaluator {
	/**
	 * This specialization returns a B3BuilderJob that performs the evaluation.
	 */
	public Object call(Builder o, Object[] parameters, Type[] types, BExecutionContext ctx) throws Throwable {
		if(ctx.getProgressMonitor().isCanceled())
			throw new OperationCanceledException();
		return new B3BuilderJob(callPrepare(o, parameters, types, ctx), o);
	}

	public Object call(BuilderWrapper o, Object[] parameters, Type[] types, BExecutionContext ctx) throws Throwable {
		if(ctx.getProgressMonitor().isCanceled())
			throw new OperationCanceledException();
		return new B3BuilderJob(callPrepare(o, parameters, types, ctx), o);
	}

	public Object define(BuildUnit unit, BExecutionContext ctx) throws Throwable {
		return define(unit, ctx, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * Define a build unit. Any bequested matching advice is applied.
	 * TODO: SEMANTICS OF REDEFINING A UNIT (All sorts of bad things happen) - now exception is thrown
	 * <!-- end-user-doc -->
	 * 
	 * @throws IllegalArgumentException
	 *             if the unit has been defined in this context.
	 * @generated NOT
	 */
	public Object define(BuildUnit unit, BExecutionContext ctx, boolean isWeaving) throws Throwable {
		if(B3Debug.evaluator)
			B3Debug.trace(
				"[evaluate] - DEFINE Build unit : ", unit.getName(), " weaving: ", isWeaving, " ctxId: ",
				((BExecutionContextImpl) ctx).ctxIdentifier);

		BuildUnitProxyAdapter p = BuildUnitProxyAdapterFactory.eINSTANCE.adapt(unit);
		Class<? extends BuildUnit> iface = p.getIface();
		ctx.defineSomeThing(BuildUnit.class, iface, unit, false);
		// define all of the unit's builders
		for(IBuilder b : unit.getBuilders())
			ctx.defineFunction(b);

		// Evaluate REPOSITORIES
		// (This will create the repository impl instances
		// Resolvers using the repositories links to the repository instances and will pick up
		// the impl instances).
		Repository x = null; // remembered if there is an error
		for(Repository r : unit.getRepositories())
			try {
				x = r;
				doEvaluate(r, ctx);
			}
			catch(Throwable e) {
				throw new B3EngineException(NLS.bind(
					"Evaluation of repositories in unit {0} failed for repository {1}.", new Object[] {
							unit.getName(), x == null
									? "null"
									: x.getName() }), e);
			}
		return unit;
	}

	public Object evaluate(BeeModel o, BExecutionContext ctx) throws Throwable {
		if(B3Debug.evaluator)
			B3Debug.trace("[evaluate] - START BeeModel");
		// A BeeModel is a BChainedExpression, and can this contain any type of expression
		// evaluate these first. Return value is ignored.
		evaluate(((BChainedExpression) o), ctx);

		// if(!(ctx instanceof BuildContext))
		if(!(ctx instanceof BContext))
			throw new B3InternalError("A BeeModel must be defined in a BContext - got a context of class: " +
					ctx.getClass().toString());

		// BuildContext bctx = (BuildContext) ctx;
		BExecutionContext bctx = ctx;
		// Define all IMPORTS as constants
		for(Type t : o.getImports()) {
			if(t instanceof B3JavaImport) {
				Class<?> x = TypeUtils.getRaw(t);
				B3MetaClass metaClass = B3backendFactory.eINSTANCE.createB3MetaClass();
				metaClass.setInstanceClass(x);
				bctx.defineValue(((B3JavaImport) t).getName(), x, metaClass);
			}
		}

		// Define all FUNCTIONS
		for(IFunction f : o.getFunctions())
			bctx.defineFunction(f);

		// Evaluate default properties
		if(o.getDefaultProperties() != null)
			evaluateDefaults(o.getDefaultProperties(), ctx, true);

		// Evaluate REPOSITORIES
		// (This will create the repository impl instances
		// Resolvers using the repositories links to the repository instances and will pick up
		// the impl instances).
		for(Repository r : o.getRepositories())
			evaluate(r, bctx);

		// Define PROVIDERS
		// if model defines providers, define them in the outer context
		//
		FirstFoundUnitProvider up = o.getUnitProvider();
		if(up != null) {
			EList<UnitProvider> reposDecls = up.getProviders();
			if(reposDecls.size() > 0) {
				// wrap in a first found
				// TODO: Consider default repositories (workspace, target platform, etc)
				// TODO: Control default repositories used via preferences

				// if evaluating this in root context, there may be a default already defined - check and
				// reassign it.
				if(bctx.containsValue(B3BuildConstants.B3ENGINE_VAR_UNITPROVIDERS))
					bctx.getLValue(B3BuildConstants.B3ENGINE_VAR_UNITPROVIDERS).set(up);
				else
					bctx.defineValue(B3BuildConstants.B3ENGINE_VAR_UNITPROVIDERS, up, FirstFoundUnitProvider.class);

			}
		}
		// Define all BUILD UNITS
		for(BuildUnit u : o.getBuildUnits())
			if(u != null) {
				// System.err.print("DEFINING UNIT: " + u.getName() + "\n");
				doDefine(u, ctx);
			}
		// bctx.defineBuildUnit(u, false);
		if(B3Debug.evaluator)
			B3Debug.trace("[evaluate] - END BeeModel");

		return this;
	}

	/**
	 * Applies the advice to all already defined builders matching the query and type pattern specified
	 * in this context. Each matching builder is wrapped with a BuildWrapper and added to the context passed
	 * as a parameter.
	 * 
	 * @returns this
	 */
	public Object evaluate(BuilderConcernContext o, BExecutionContext ctx) throws Throwable {
		Iterator<IFunction> fItor = ctx.getFunctionIterator();
		ctx.getInjector().getInstance(IB3Weaver.class).doWeave(o, fItor, ctx);
		return this;
	}

	public Object evaluate(BuilderNamePredicate o, BExecutionContext ctx) throws Throwable {
		// pick up "@test" parameter from context
		Object test = ctx.getValue("@test");
		if(!(test instanceof IBuilder))
			throw new B3InternalError("Attempt to evaluate BuilderNamePredicate against non IBuilder");
		IBuilder b = (IBuilder) test;
		return Boolean.valueOf(o.getNamePredicate().matches(b.getName()));
	}

	/**
	 * Iterates over the BuildUnit referenced as the context value "@test" and returns true if one of the implements
	 * in the unit matches the predicate.
	 * A match is made testing if the specified implements is assignable to the type specified in this predicate.
	 */
	public Object evaluate(ImplementsPredicate o, BExecutionContext ctx) throws Throwable {
		// pick up "@test" parameter from context
		Object test = ctx.getValue("@test");
		if(!(test instanceof BuildUnit))
			throw new B3InternalError("Attempt to evaluate ImplementsPredicate against non BuildUnit or Builder");
		BuildUnit u = (BuildUnit) test;
		EList<Type> iList = u.getImplements();
		for(Type t : iList) {
			if(TypeUtils.isAssignableFrom(o.getType(), t))
				return Boolean.TRUE;
		}
		return Boolean.FALSE;
	}

	/**
	 * Evaluates the input of the IBuilder bound to the context variable "@test" against the input
	 * predicate(s) (builder name, and required capability). The evaulation uses unfiltered builder references.
	 */
	public Object evaluate(InputPredicate o, BExecutionContext ctx) throws Throwable {
		// pick up "@test" parameter from context
		Object test = ctx.getValue("@test");
		if(!(test instanceof IBuilder))
			throw new B3InternalError("Attempt to evaluate InputPredicate against non IBuilder");
		IBuilder b = (IBuilder) test;

		Iterator<BuilderCallFacade> bIterator = ctx.getInjector().getInstance(BuilderCallIteratorProvider.class).doGetIterator(
			b);
		while(bIterator.hasNext()) {
			BuilderCallFacade bn = bIterator.next();
			if(o.getBuilderPredicate() != null &&
					!o.getBuilderPredicate().matches(bn.getBuilderReference().getBuilderName()))
				continue;
			// RequiredCapability rc = bn.getRequiredCapability();
			// if(rc == null) {
			// throw new B3InternalError(
			// "A BuilderCallFacade did not have a RequiredCapability reference");
			// }
			if(o.getCapabilityPredicate() != null && !o.getCapabilityPredicate().matches(bn.getRequiredCapability()))
				continue;
			return Boolean.TRUE;
		}
		return Boolean.FALSE;
	}

	/**
	 * Evaluates the output of the IBuilder assigned to the context variable "@test" and matches that against
	 * either the path vector or pathPattern (a literal any or literal regexp). In the case of a path vector,
	 * the output specification must contain all paths in the predicate path vector (i.e. containsAll semantics).
	 * 
	 * Note: Matching is performed on unfiltered output.
	 */
	public Object evaluate(OutputPredicate o, BExecutionContext ctx) throws Throwable {
		// pick up "@test" parameter from context
		Object test = ctx.getValue("@test");
		if(!(test instanceof IBuilder))
			throw new B3InternalError("Attempt to evaluate OutputPredicate against non IBuilder");

		IBuilder b = (IBuilder) test;
		PathGroup pg = b.getOutput();
		ctx.defineVariableValue("@test.pathgroup", pg, PathGroup.class);
		return evaluate((PathGroupPredicate) o, ctx);
	}

	/**
	 * Evaluates the output of the IBuilder assigned to the context variable "@test" and matches that against
	 * either the path vector or pathPattern (a literal any or literal regexp). In the case of a path vector,
	 * the output specification must contain all paths in the predicate path vector (i.e. containsAll semantics).
	 * 
	 * Note: Matching is performed on unfiltered output.
	 */
	public Object evaluate(PathGroupPredicate o, BExecutionContext ctx) throws Throwable {
		// pick up "@test.pathgroup" parameter from context
		Object test = ctx.getValue("@test.pathgroup");
		// if the value is null (as opposed to not defined at all) this means there is nothing to match against
		// so result can never be true.
		if(test == null)
			return Boolean.FALSE;

		if(!(test instanceof PathGroup))
			throw new B3InternalError("Attempt to evaluate PathGroupPredicate against non PathGroup");

		PathGroup pg = (PathGroup) test;
		// strategy choice - either apply a pattern on all paths, or have a set of paths which must all be available

		// choice 1 - compare against a path vector
		if(o.getPathPattern() == null) {
			if(o.getPathVector() == null)
				throw new B3InternalError("OutputPredicate has neither pattern nor path vector");

			List<URI> predicates = new PathIterator(o.getPathVector()).toList();
			List<URI> candidate = new PathIterator(pg).toList();
			return Boolean.valueOf(candidate.containsAll(predicates));
		}
		// choice 2 - compare against a regexp or wildcard == ANY
		BExpression p = o.getPathPattern();
		if(p instanceof BLiteralAny)
			return Boolean.TRUE;
		if(p instanceof BRegularExpression) {
			Pattern pattern = ((BRegularExpression) p).getPattern();
			PathIterator paths = new PathIterator(pg);
			while(paths.hasNext()) {
				if(pattern.matcher(paths.next().toString()).matches())
					return Boolean.TRUE;
			}
		}
		return Boolean.FALSE;
	}

	public Object evaluate(ProvidesPredicate o, BExecutionContext ctx) throws Throwable {
		// pick up "@test" parameter from context
		Object test = ctx.getValue("@test");
		EList<Capability> pcList = null;
		if(test instanceof IBuilder)
			pcList = ((IBuilder) test).getProvidedCapabilities();
		else if(test instanceof BuildUnit)
			pcList = ((BuildUnit) test).getProvidedCapabilities();
		else
			throw new B3InternalError("Attempt to evaluate ProvidedPredicate against non IBuilder or BuildUnit");
		for(Capability c : pcList) {
			if(o.getCapabilityPredicate().matches(c))
				return Boolean.TRUE;
		}
		return Boolean.FALSE;
	}

	public Object evaluate(Repository o, BExecutionContext ctx) throws Throwable {
		EList<RepoOption> opts = o.getOptions();

		// create a map for evaluated options, and populate it
		Map<String, Object> evaluatedOptions = new HashMap<String, Object>(opts.size());
		for(RepoOption opt : opts)
			evaluatedOptions.put(opt.getName(), doEvaluate(opt.getExpr(), ctx));

		// get the injector and create a build unit repository implementation for the
		// handler-type.
		Injector injector = ctx.getInjector(); // .getInstance(Names.named(getHandlerType()));
		IBuildUnitRepository result = injector.getInstance(Key.get(
			IBuildUnitRepository.class, Names.named(o.getHandlerType())));
		result.initialize(ctx, o, evaluatedOptions);
		o.setBuildUnitRepository(result);
		return result;
	}

	/**
	 * Iterates over the BuildUnit referenced as the context value "@test" and returns true if one of the requirements
	 * matches the predicate. Handles the distinction between meta/env requirements and regular requirements.
	 */
	public Object evaluate(RequiresPredicate o, BExecutionContext ctx) throws Throwable {
		// pick up "@test" parameter from context
		Object test = ctx.getValue("@test");
		if(!(test instanceof BuildUnit))
			throw new B3InternalError("Attempt to evaluate RequiresPredicate against non BuildUnit or Builder");
		BuildUnit u = (BuildUnit) test;
		EList<RequiredCapability> rcList = o.isMeta()
				? u.getMetaRequiredCapabilities()
				: u.getRequiredCapabilities();
		for(RequiredCapability r : rcList) {
			if(o.getCapabilityPredicate().matches(r))
				return Boolean.TRUE;
		}
		return Boolean.FALSE;
	}

	/**
	 * Evaluates the source of the IBuilder assigned to the context variable "@test" and matches that against
	 * either the path vector or pathPattern (a literal any or literal regexp). In the case of a path vector,
	 * the source specification must contain all paths in the predicate path vector (i.e. containsAll semantics).
	 * 
	 * Note: Matching is performed on unfiltered output.
	 */
	public Object evaluate(SourcePredicate o, BExecutionContext ctx) throws Throwable {
		// pick up "@test" parameter from context
		Object test = ctx.getValue("@test");
		if(!(test instanceof IBuilder))
			throw new B3InternalError("Attempt to evaluate SourcePredicate against non IBuilder");

		IBuilder b = (IBuilder) test;
		PathGroup pg = b.getSource();
		ctx.defineVariableValue("@test.pathgroup", pg, PathGroup.class);
		return evaluate(((PathGroupPredicate) o), ctx);
	}

	/**
	 * Iterates over all BuildUnits visible in the current context, evaluates the predicates, and if matching,
	 * the unit is woven.
	 */
	public Object evaluate(UnitConcernContext o, BExecutionContext ctx) throws Throwable {
		BExecutionContext ictx = ctx.createInnerContext();
		ictx.defineVariableValue("@test", null, BuildUnit.class);
		ictx.getLValue("@test");
		ctx.getInjector().getInstance(IB3Weaver.class).doWeave(o, new EffectiveUnitIterator(ctx), ctx);
		return this;
	}

	public Object evaluate(UnitNamePredicate o, BExecutionContext ctx) throws Throwable {
		// pick up "@test" parameter from context
		Object test = ctx.getValue("@test");
		if(!(test instanceof BuildUnit))
			throw new B3InternalError("Attempt to evaluate UnitNamePredicate against non BuildUnit");
		BuildUnit u = (BuildUnit) test;
		return Boolean.valueOf(o.getNamePredicate().matches(u.getName()));
	}

	public Object evaluate(UnitProvider o, BExecutionContext ctx) throws Throwable {
		return o; // a unit provider is literal
	}

	public String[] parameterNames(Builder o) {
		EList<BParameterDeclaration> pList = o.getParameters();
		int insertUnit = (pList.size() > 0 && "unit".equals(pList.get(0).getName()))
				? 0
				: 1;

		String[] names = new String[pList.size() + insertUnit];
		int i = 0;
		if(insertUnit == 1)
			names[i++] = "unit";
		for(BParameterDeclaration p : pList)
			names[i++] = p.getName();
		if(B3Debug.evaluator) {
			Object[] args = new String[2 + names.length * 2];
			args[0] = o.getName();
			args[1] = ") returns: [";
			int j = 2;
			for(String s : names) {
				if(j != 2)
					args[j++] = ", ";
				args[j++] = s;
			}
			args[j] = "]";
			B3Debug.trace("[evaluator] - parameterNames(builder: ", args);
		}
		return names;
	}
}
