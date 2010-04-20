/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.b3.backend.evaluator.b3backend.util;

import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import org.eclipse.b3.backend.evaluator.b3backend.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * 
 * @see org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage
 * @generated
 */
public class B3backendAdapterFactory extends AdapterFactoryImpl {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2009, Cloudsmith Inc and others.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\rContributors:\n- Cloudsmith Inc - initial API and implementation.\r";

	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected static B3backendPackage modelPackage;

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected B3backendSwitch<Adapter> modelSwitch = new B3backendSwitch<Adapter>() {
		@Override
		public Adapter caseB3Function(B3Function object) {
			return createB3FunctionAdapter();
		}

		@Override
		public Adapter caseB3FunctionType(B3FunctionType object) {
			return createB3FunctionTypeAdapter();
		}

		@Override
		public Adapter caseB3FuncTypeVariable(B3FuncTypeVariable object) {
			return createB3FuncTypeVariableAdapter();
		}

		@Override
		public Adapter caseB3JavaImport(B3JavaImport object) {
			return createB3JavaImportAdapter();
		}

		@Override
		public Adapter caseB3MetaClass(B3MetaClass object) {
			return createB3MetaClassAdapter();
		}

		@Override
		public Adapter caseB3ParameterizedType(B3ParameterizedType object) {
			return createB3ParameterizedTypeAdapter();
		}

		@Override
		public Adapter caseB3WildcardType(B3WildcardType object) {
			return createB3WildcardTypeAdapter();
		}

		@Override
		public Adapter caseBAdvice(BAdvice object) {
			return createBAdviceAdapter();
		}

		@Override
		public Adapter caseBAndExpression(BAndExpression object) {
			return createBAndExpressionAdapter();
		}

		@Override
		public Adapter caseBAssignmentExpression(BAssignmentExpression object) {
			return createBAssignmentExpressionAdapter();
		}

		@Override
		public Adapter caseBAtExpression(BAtExpression object) {
			return createBAtExpressionAdapter();
		}

		@Override
		public Adapter caseBBinaryExpression(BBinaryExpression object) {
			return createBBinaryExpressionAdapter();
		}

		@Override
		public Adapter caseBBinaryOpExpression(BBinaryOpExpression object) {
			return createBBinaryOpExpressionAdapter();
		}

		@Override
		public Adapter caseBCachedExpression(BCachedExpression object) {
			return createBCachedExpressionAdapter();
		}

		@Override
		public Adapter caseBCallExpression(BCallExpression object) {
			return createBCallExpressionAdapter();
		}

		@Override
		public Adapter caseBCallFeature(BCallFeature object) {
			return createBCallFeatureAdapter();
		}

		@Override
		public Adapter caseBCallFunction(BCallFunction object) {
			return createBCallFunctionAdapter();
		}

		@Override
		public Adapter caseBCallNamedFunction(BCallNamedFunction object) {
			return createBCallNamedFunctionAdapter();
		}

		@Override
		public Adapter caseBCase(BCase object) {
			return createBCaseAdapter();
		}

		@Override
		public Adapter caseBCatch(BCatch object) {
			return createBCatchAdapter();
		}

		@Override
		public Adapter caseBChainedExpression(BChainedExpression object) {
			return createBChainedExpressionAdapter();
		}

		@Override
		public Adapter caseBConcern(BConcern object) {
			return createBConcernAdapter();
		}

		@Override
		public Adapter caseBConcernContext(BConcernContext object) {
			return createBConcernContextAdapter();
		}

		@Override
		public Adapter caseBConditionalPropertyOperation(BConditionalPropertyOperation object) {
			return createBConditionalPropertyOperationAdapter();
		}

		@Override
		public Adapter caseBContext(BContext object) {
			return createBContextAdapter();
		}

		@Override
		public Adapter caseBCreateExpression(BCreateExpression object) {
			return createBCreateExpressionAdapter();
		}

		@Override
		public Adapter caseBDefaultPropertySet(BDefaultPropertySet object) {
			return createBDefaultPropertySetAdapter();
		}

		@Override
		public Adapter caseBDefProperty(BDefProperty object) {
			return createBDefPropertyAdapter();
		}

		@Override
		public Adapter caseBDefValue(BDefValue object) {
			return createBDefValueAdapter();
		}

		@Override
		public Adapter caseBDelegatingContext(BDelegatingContext object) {
			return createBDelegatingContextAdapter();
		}

		@Override
		public Adapter caseBExecutionContext(BExecutionContext object) {
			return createBExecutionContextAdapter();
		}

		@Override
		public Adapter caseBExpression(BExpression object) {
			return createBExpressionAdapter();
		}

		@Override
		public Adapter caseBExpressionWrapper(BExpressionWrapper object) {
			return createBExpressionWrapperAdapter();
		}

		@Override
		public Adapter caseBFeatureExpression(BFeatureExpression object) {
			return createBFeatureExpressionAdapter();
		}

		@Override
		public Adapter caseBFunction(BFunction object) {
			return createBFunctionAdapter();
		}

		@Override
		public Adapter caseBFunctionConcernContext(BFunctionConcernContext object) {
			return createBFunctionConcernContextAdapter();
		}

		@Override
		public Adapter caseBFunctionContainer(BFunctionContainer object) {
			return createBFunctionContainerAdapter();
		}

		@Override
		public Adapter caseBFunctionNamePredicate(BFunctionNamePredicate object) {
			return createBFunctionNamePredicateAdapter();
		}

		@Override
		public Adapter caseBFunctionWrapper(BFunctionWrapper object) {
			return createBFunctionWrapperAdapter();
		}

		@Override
		public Adapter caseBGuard(BGuard object) {
			return createBGuardAdapter();
		}

		@Override
		public Adapter caseBGuardExpression(BGuardExpression object) {
			return createBGuardExpressionAdapter();
		}

		@Override
		public Adapter caseBGuardFunction(BGuardFunction object) {
			return createBGuardFunctionAdapter();
		}

		@Override
		public Adapter caseBIfExpression(BIfExpression object) {
			return createBIfExpressionAdapter();
		}

		@Override
		public Adapter caseBInnerContext(BInnerContext object) {
			return createBInnerContextAdapter();
		}

		@Override
		public Adapter caseBInstanceContext(BInstanceContext object) {
			return createBInstanceContextAdapter();
		}

		@Override
		public Adapter caseBInvocationContext(BInvocationContext object) {
			return createBInvocationContextAdapter();
		}

		@Override
		public Adapter caseBJavaFunction(BJavaFunction object) {
			return createBJavaFunctionAdapter();
		}

		@Override
		public Adapter caseBLineReference(BLineReference object) {
			return createBLineReferenceAdapter();
		}

		@Override
		public Adapter caseBLiteralAny(BLiteralAny object) {
			return createBLiteralAnyAdapter();
		}

		@Override
		public Adapter caseBLiteralExpression(BLiteralExpression object) {
			return createBLiteralExpressionAdapter();
		}

		@Override
		public Adapter caseBLiteralListExpression(BLiteralListExpression object) {
			return createBLiteralListExpressionAdapter();
		}

		@Override
		public Adapter caseBLiteralMapExpression(BLiteralMapExpression object) {
			return createBLiteralMapExpressionAdapter();
		}

		@Override
		public Adapter caseBLiteralType(BLiteralType object) {
			return createBLiteralTypeAdapter();
		}

		@Override
		public Adapter caseBMapEntry(BMapEntry object) {
			return createBMapEntryAdapter();
		}

		@Override
		public Adapter caseBNamePredicate(BNamePredicate object) {
			return createBNamePredicateAdapter();
		}

		@Override
		public Adapter caseBOrExpression(BOrExpression object) {
			return createBOrExpressionAdapter();
		}

		@Override
		public Adapter caseBParameter(BParameter object) {
			return createBParameterAdapter();
		}

		@Override
		public Adapter caseBParameterDeclaration(BParameterDeclaration object) {
			return createBParameterDeclarationAdapter();
		}

		@Override
		public Adapter caseBParameterizedExpression(BParameterizedExpression object) {
			return createBParameterizedExpressionAdapter();
		}

		@Override
		public Adapter caseBParameterList(BParameterList object) {
			return createBParameterListAdapter();
		}

		@Override
		public Adapter caseBParameterPredicate(BParameterPredicate object) {
			return createBParameterPredicateAdapter();
		}

		@Override
		public Adapter caseBProceedExpression(BProceedExpression object) {
			return createBProceedExpressionAdapter();
		}

		@Override
		public Adapter caseBPropertyDefinitionOperation(BPropertyDefinitionOperation object) {
			return createBPropertyDefinitionOperationAdapter();
		}

		@Override
		public Adapter caseBPropertyOperation(BPropertyOperation object) {
			return createBPropertyOperationAdapter();
		}

		@Override
		public Adapter caseBPropertySet(BPropertySet object) {
			return createBPropertySetAdapter();
		}

		@Override
		public Adapter caseBPropertySetOperation(BPropertySetOperation object) {
			return createBPropertySetOperationAdapter();
		}

		@Override
		public Adapter caseBRegularExpression(BRegularExpression object) {
			return createBRegularExpressionAdapter();
		}

		@Override
		public Adapter caseBSwitchExpression(BSwitchExpression object) {
			return createBSwitchExpressionAdapter();
		}

		@Override
		public Adapter caseBSystemContext(BSystemContext object) {
			return createBSystemContextAdapter();
		}

		@Override
		public Adapter caseBThrowExpression(BThrowExpression object) {
			return createBThrowExpressionAdapter();
		}

		@Override
		public Adapter caseBTryExpression(BTryExpression object) {
			return createBTryExpressionAdapter();
		}

		@Override
		public Adapter caseBTypeCalculator(BTypeCalculator object) {
			return createBTypeCalculatorAdapter();
		}

		@Override
		public Adapter caseBTypeCalculatorFunction(BTypeCalculatorFunction object) {
			return createBTypeCalculatorFunctionAdapter();
		}

		@Override
		public Adapter caseBUnaryExpression(BUnaryExpression object) {
			return createBUnaryExpressionAdapter();
		}

		@Override
		public Adapter caseBUnaryOpExpression(BUnaryOpExpression object) {
			return createBUnaryOpExpressionAdapter();
		}

		@Override
		public Adapter caseBUnaryPostOpExpression(BUnaryPostOpExpression object) {
			return createBUnaryPostOpExpressionAdapter();
		}

		@Override
		public Adapter caseBUnaryPreOpExpression(BUnaryPreOpExpression object) {
			return createBUnaryPreOpExpressionAdapter();
		}

		@Override
		public Adapter caseBVariableExpression(BVariableExpression object) {
			return createBVariableExpressionAdapter();
		}

		@Override
		public Adapter caseBWithContextExpression(BWithContextExpression object) {
			return createBWithContextExpressionAdapter();
		}

		@Override
		public Adapter caseBWithExpression(BWithExpression object) {
			return createBWithExpressionAdapter();
		}

		@Override
		public Adapter caseBWrappingContext(BWrappingContext object) {
			return createBWrappingContextAdapter();
		}

		@Override
		public Adapter caseIFunction(IFunction object) {
			return createIFunctionAdapter();
		}

		@Override
		public Adapter caseIGenericDeclaration(GenericDeclaration object) {
			return createIGenericDeclarationAdapter();
		}

		@Override
		public Adapter caseIParameterizedType(ParameterizedType object) {
			return createIParameterizedTypeAdapter();
		}

		@Override
		public Adapter caseIType(Type object) {
			return createITypeAdapter();
		}

		@Override
		public Adapter caseITypedValueContainer(ITypedValueContainer object) {
			return createITypedValueContainerAdapter();
		}

		@Override
		public <D extends GenericDeclaration> Adapter caseITypeVariable(TypeVariable<D> object) {
			return createITypeVariableAdapter();
		}

		@Override
		public Adapter caseIWildcardType(WildcardType object) {
			return createIWildcardTypeAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public B3backendAdapterFactory() {
		if(modelPackage == null) {
			modelPackage = B3backendPackage.eINSTANCE;
		}
	}

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param target
	 *            the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.b3.backend.evaluator.b3backend.B3Function
	 * <em>B3 Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.B3Function
	 * @generated
	 */
	public Adapter createB3FunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.b3.backend.evaluator.b3backend.B3FunctionType
	 * <em>B3 Function Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.B3FunctionType
	 * @generated
	 */
	public Adapter createB3FunctionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class ' {@link org.eclipse.b3.backend.evaluator.b3backend.B3FuncTypeVariable
	 * <em>B3 Func Type Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.B3FuncTypeVariable
	 * @generated
	 */
	public Adapter createB3FuncTypeVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.b3.backend.evaluator.b3backend.B3JavaImport
	 * <em>B3 Java Import</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.B3JavaImport
	 * @generated
	 */
	public Adapter createB3JavaImportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.b3.backend.evaluator.b3backend.B3MetaClass
	 * <em>B3 Meta Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.B3MetaClass
	 * @generated
	 */
	public Adapter createB3MetaClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class ' {@link org.eclipse.b3.backend.evaluator.b3backend.B3ParameterizedType
	 * <em>B3 Parameterized Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.B3ParameterizedType
	 * @generated
	 */
	public Adapter createB3ParameterizedTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.b3.backend.evaluator.b3backend.B3WildcardType
	 * <em>B3 Wildcard Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.B3WildcardType
	 * @generated
	 */
	public Adapter createB3WildcardTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.b3.backend.evaluator.b3backend.BAdvice
	 * <em>BAdvice</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BAdvice
	 * @generated
	 */
	public Adapter createBAdviceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.b3.backend.evaluator.b3backend.BAndExpression
	 * <em>BAnd Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BAndExpression
	 * @generated
	 */
	public Adapter createBAndExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class ' {@link org.eclipse.b3.backend.evaluator.b3backend.BAssignmentExpression
	 * <em>BAssignment Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BAssignmentExpression
	 * @generated
	 */
	public Adapter createBAssignmentExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.b3.backend.evaluator.b3backend.BAtExpression
	 * <em>BAt Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BAtExpression
	 * @generated
	 */
	public Adapter createBAtExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class ' {@link org.eclipse.b3.backend.evaluator.b3backend.BBinaryExpression <em>BBinary Expression</em>}
	 * '.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BBinaryExpression
	 * @generated
	 */
	public Adapter createBBinaryExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class ' {@link org.eclipse.b3.backend.evaluator.b3backend.BBinaryOpExpression
	 * <em>BBinary Op Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BBinaryOpExpression
	 * @generated
	 */
	public Adapter createBBinaryOpExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class ' {@link org.eclipse.b3.backend.evaluator.b3backend.BCachedExpression <em>BCached Expression</em>}
	 * '.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BCachedExpression
	 * @generated
	 */
	public Adapter createBCachedExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.b3.backend.evaluator.b3backend.BCallExpression
	 * <em>BCall Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BCallExpression
	 * @generated
	 */
	public Adapter createBCallExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.b3.backend.evaluator.b3backend.BCallFeature
	 * <em>BCall Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BCallFeature
	 * @generated
	 */
	public Adapter createBCallFeatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.b3.backend.evaluator.b3backend.BCallFunction
	 * <em>BCall Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BCallFunction
	 * @generated
	 */
	public Adapter createBCallFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class ' {@link org.eclipse.b3.backend.evaluator.b3backend.BCallNamedFunction
	 * <em>BCall Named Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BCallNamedFunction
	 * @generated
	 */
	public Adapter createBCallNamedFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.b3.backend.evaluator.b3backend.BCase
	 * <em>BCase</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BCase
	 * @generated
	 */
	public Adapter createBCaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.b3.backend.evaluator.b3backend.BCatch
	 * <em>BCatch</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BCatch
	 * @generated
	 */
	public Adapter createBCatchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class ' {@link org.eclipse.b3.backend.evaluator.b3backend.BChainedExpression
	 * <em>BChained Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BChainedExpression
	 * @generated
	 */
	public Adapter createBChainedExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.b3.backend.evaluator.b3backend.BConcern
	 * <em>BConcern</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BConcern
	 * @generated
	 */
	public Adapter createBConcernAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.b3.backend.evaluator.b3backend.BConcernContext
	 * <em>BConcern Context</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BConcernContext
	 * @generated
	 */
	public Adapter createBConcernContextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class ' {@link org.eclipse.b3.backend.evaluator.b3backend.BConditionalPropertyOperation
	 * <em>BConditional Property Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BConditionalPropertyOperation
	 * @generated
	 */
	public Adapter createBConditionalPropertyOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.b3.backend.evaluator.b3backend.BContext
	 * <em>BContext</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BContext
	 * @generated
	 */
	public Adapter createBContextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class ' {@link org.eclipse.b3.backend.evaluator.b3backend.BCreateExpression <em>BCreate Expression</em>}
	 * '.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BCreateExpression
	 * @generated
	 */
	public Adapter createBCreateExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class ' {@link org.eclipse.b3.backend.evaluator.b3backend.BDefaultPropertySet
	 * <em>BDefault Property Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BDefaultPropertySet
	 * @generated
	 */
	public Adapter createBDefaultPropertySetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.b3.backend.evaluator.b3backend.BDefProperty
	 * <em>BDef Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BDefProperty
	 * @generated
	 */
	public Adapter createBDefPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.b3.backend.evaluator.b3backend.BDefValue
	 * <em>BDef Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BDefValue
	 * @generated
	 */
	public Adapter createBDefValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class ' {@link org.eclipse.b3.backend.evaluator.b3backend.BDelegatingContext
	 * <em>BDelegating Context</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BDelegatingContext
	 * @generated
	 */
	public Adapter createBDelegatingContextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class ' {@link org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext <em>BExecution Context</em>}
	 * '.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext
	 * @generated
	 */
	public Adapter createBExecutionContextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.b3.backend.evaluator.b3backend.BExpression
	 * <em>BExpression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BExpression
	 * @generated
	 */
	public Adapter createBExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class ' {@link org.eclipse.b3.backend.evaluator.b3backend.BExpressionWrapper
	 * <em>BExpression Wrapper</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BExpressionWrapper
	 * @generated
	 */
	public Adapter createBExpressionWrapperAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class ' {@link org.eclipse.b3.backend.evaluator.b3backend.BFeatureExpression
	 * <em>BFeature Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BFeatureExpression
	 * @generated
	 */
	public Adapter createBFeatureExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.b3.backend.evaluator.b3backend.BFunction
	 * <em>BFunction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BFunction
	 * @generated
	 */
	public Adapter createBFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class ' {@link org.eclipse.b3.backend.evaluator.b3backend.BFunctionConcernContext
	 * <em>BFunction Concern Context</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BFunctionConcernContext
	 * @generated
	 */
	public Adapter createBFunctionConcernContextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class ' {@link org.eclipse.b3.backend.evaluator.b3backend.BFunctionContainer
	 * <em>BFunction Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BFunctionContainer
	 * @generated
	 */
	public Adapter createBFunctionContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class ' {@link org.eclipse.b3.backend.evaluator.b3backend.BFunctionNamePredicate
	 * <em>BFunction Name Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BFunctionNamePredicate
	 * @generated
	 */
	public Adapter createBFunctionNamePredicateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.b3.backend.evaluator.b3backend.BFunctionWrapper
	 * <em>BFunction Wrapper</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BFunctionWrapper
	 * @generated
	 */
	public Adapter createBFunctionWrapperAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.b3.backend.evaluator.b3backend.BGuard
	 * <em>BGuard</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BGuard
	 * @generated
	 */
	public Adapter createBGuardAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.b3.backend.evaluator.b3backend.BGuardExpression
	 * <em>BGuard Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BGuardExpression
	 * @generated
	 */
	public Adapter createBGuardExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.b3.backend.evaluator.b3backend.BGuardFunction
	 * <em>BGuard Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BGuardFunction
	 * @generated
	 */
	public Adapter createBGuardFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.b3.backend.evaluator.b3backend.BIfExpression
	 * <em>BIf Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BIfExpression
	 * @generated
	 */
	public Adapter createBIfExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.b3.backend.evaluator.b3backend.BInnerContext
	 * <em>BInner Context</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BInnerContext
	 * @generated
	 */
	public Adapter createBInnerContextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.b3.backend.evaluator.b3backend.BInstanceContext
	 * <em>BInstance Context</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BInstanceContext
	 * @generated
	 */
	public Adapter createBInstanceContextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class ' {@link org.eclipse.b3.backend.evaluator.b3backend.BInvocationContext
	 * <em>BInvocation Context</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BInvocationContext
	 * @generated
	 */
	public Adapter createBInvocationContextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.b3.backend.evaluator.b3backend.BJavaFunction
	 * <em>BJava Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BJavaFunction
	 * @generated
	 */
	public Adapter createBJavaFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.b3.backend.evaluator.b3backend.BLineReference
	 * <em>BLine Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BLineReference
	 * @generated
	 */
	public Adapter createBLineReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.b3.backend.evaluator.b3backend.BLiteralAny
	 * <em>BLiteral Any</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BLiteralAny
	 * @generated
	 */
	public Adapter createBLiteralAnyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class ' {@link org.eclipse.b3.backend.evaluator.b3backend.BLiteralExpression
	 * <em>BLiteral Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BLiteralExpression
	 * @generated
	 */
	public Adapter createBLiteralExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class ' {@link org.eclipse.b3.backend.evaluator.b3backend.BLiteralListExpression
	 * <em>BLiteral List Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BLiteralListExpression
	 * @generated
	 */
	public Adapter createBLiteralListExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class ' {@link org.eclipse.b3.backend.evaluator.b3backend.BLiteralMapExpression
	 * <em>BLiteral Map Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BLiteralMapExpression
	 * @generated
	 */
	public Adapter createBLiteralMapExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.b3.backend.evaluator.b3backend.BLiteralType
	 * <em>BLiteral Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BLiteralType
	 * @generated
	 */
	public Adapter createBLiteralTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.b3.backend.evaluator.b3backend.BMapEntry
	 * <em>BMap Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BMapEntry
	 * @generated
	 */
	public Adapter createBMapEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.b3.backend.evaluator.b3backend.BNamePredicate
	 * <em>BName Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BNamePredicate
	 * @generated
	 */
	public Adapter createBNamePredicateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.b3.backend.evaluator.b3backend.BOrExpression
	 * <em>BOr Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BOrExpression
	 * @generated
	 */
	public Adapter createBOrExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.b3.backend.evaluator.b3backend.BParameter
	 * <em>BParameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BParameter
	 * @generated
	 */
	public Adapter createBParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class ' {@link org.eclipse.b3.backend.evaluator.b3backend.BParameterDeclaration
	 * <em>BParameter Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BParameterDeclaration
	 * @generated
	 */
	public Adapter createBParameterDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class ' {@link org.eclipse.b3.backend.evaluator.b3backend.BParameterizedExpression
	 * <em>BParameterized Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BParameterizedExpression
	 * @generated
	 */
	public Adapter createBParameterizedExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.b3.backend.evaluator.b3backend.BParameterList
	 * <em>BParameter List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BParameterList
	 * @generated
	 */
	public Adapter createBParameterListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class ' {@link org.eclipse.b3.backend.evaluator.b3backend.BParameterPredicate
	 * <em>BParameter Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BParameterPredicate
	 * @generated
	 */
	public Adapter createBParameterPredicateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class ' {@link org.eclipse.b3.backend.evaluator.b3backend.BProceedExpression
	 * <em>BProceed Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BProceedExpression
	 * @generated
	 */
	public Adapter createBProceedExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class ' {@link org.eclipse.b3.backend.evaluator.b3backend.BPropertyDefinitionOperation
	 * <em>BProperty Definition Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BPropertyDefinitionOperation
	 * @generated
	 */
	public Adapter createBPropertyDefinitionOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class ' {@link org.eclipse.b3.backend.evaluator.b3backend.BPropertyOperation
	 * <em>BProperty Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BPropertyOperation
	 * @generated
	 */
	public Adapter createBPropertyOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.b3.backend.evaluator.b3backend.BPropertySet
	 * <em>BProperty Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BPropertySet
	 * @generated
	 */
	public Adapter createBPropertySetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class ' {@link org.eclipse.b3.backend.evaluator.b3backend.BPropertySetOperation
	 * <em>BProperty Set Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BPropertySetOperation
	 * @generated
	 */
	public Adapter createBPropertySetOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class ' {@link org.eclipse.b3.backend.evaluator.b3backend.BRegularExpression
	 * <em>BRegular Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BRegularExpression
	 * @generated
	 */
	public Adapter createBRegularExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class ' {@link org.eclipse.b3.backend.evaluator.b3backend.BSwitchExpression <em>BSwitch Expression</em>}
	 * '.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BSwitchExpression
	 * @generated
	 */
	public Adapter createBSwitchExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.b3.backend.evaluator.b3backend.BSystemContext
	 * <em>BSystem Context</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BSystemContext
	 * @generated
	 */
	public Adapter createBSystemContextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.b3.backend.evaluator.b3backend.BThrowExpression
	 * <em>BThrow Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BThrowExpression
	 * @generated
	 */
	public Adapter createBThrowExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.b3.backend.evaluator.b3backend.BTryExpression
	 * <em>BTry Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BTryExpression
	 * @generated
	 */
	public Adapter createBTryExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.b3.backend.evaluator.b3backend.BTypeCalculator
	 * <em>BType Calculator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BTypeCalculator
	 * @generated
	 */
	public Adapter createBTypeCalculatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class ' {@link org.eclipse.b3.backend.evaluator.b3backend.BTypeCalculatorFunction
	 * <em>BType Calculator Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BTypeCalculatorFunction
	 * @generated
	 */
	public Adapter createBTypeCalculatorFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.b3.backend.evaluator.b3backend.BUnaryExpression
	 * <em>BUnary Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BUnaryExpression
	 * @generated
	 */
	public Adapter createBUnaryExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class ' {@link org.eclipse.b3.backend.evaluator.b3backend.BUnaryOpExpression
	 * <em>BUnary Op Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BUnaryOpExpression
	 * @generated
	 */
	public Adapter createBUnaryOpExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class ' {@link org.eclipse.b3.backend.evaluator.b3backend.BUnaryPostOpExpression
	 * <em>BUnary Post Op Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BUnaryPostOpExpression
	 * @generated
	 */
	public Adapter createBUnaryPostOpExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class ' {@link org.eclipse.b3.backend.evaluator.b3backend.BUnaryPreOpExpression
	 * <em>BUnary Pre Op Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BUnaryPreOpExpression
	 * @generated
	 */
	public Adapter createBUnaryPreOpExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class ' {@link org.eclipse.b3.backend.evaluator.b3backend.BVariableExpression
	 * <em>BVariable Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BVariableExpression
	 * @generated
	 */
	public Adapter createBVariableExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class ' {@link org.eclipse.b3.backend.evaluator.b3backend.BWithContextExpression
	 * <em>BWith Context Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BWithContextExpression
	 * @generated
	 */
	public Adapter createBWithContextExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.b3.backend.evaluator.b3backend.BWithExpression
	 * <em>BWith Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BWithExpression
	 * @generated
	 */
	public Adapter createBWithExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.b3.backend.evaluator.b3backend.BWrappingContext
	 * <em>BWrapping Context</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BWrappingContext
	 * @generated
	 */
	public Adapter createBWrappingContextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.b3.backend.evaluator.b3backend.IFunction
	 * <em>IFunction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.IFunction
	 * @generated
	 */
	public Adapter createIFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link java.lang.reflect.GenericDeclaration
	 * <em>IGeneric Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see java.lang.reflect.GenericDeclaration
	 * @generated
	 */
	public Adapter createIGenericDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link java.lang.reflect.ParameterizedType
	 * <em>IParameterized Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see java.lang.reflect.ParameterizedType
	 * @generated
	 */
	public Adapter createIParameterizedTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link java.lang.reflect.Type <em>IType</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see java.lang.reflect.Type
	 * @generated
	 */
	public Adapter createITypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class ' {@link org.eclipse.b3.backend.evaluator.b3backend.ITypedValueContainer
	 * <em>ITyped Value Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.ITypedValueContainer
	 * @generated
	 */
	public Adapter createITypedValueContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link java.lang.reflect.TypeVariable <em>IType Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see java.lang.reflect.TypeVariable
	 * @generated
	 */
	public Adapter createITypeVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link java.lang.reflect.WildcardType <em>IWildcard Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see java.lang.reflect.WildcardType
	 * @generated
	 */
	public Adapter createIWildcardTypeAdapter() {
		return null;
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance
	 * object of the model.
	 * <!-- end-user-doc -->
	 * 
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if(object == modelPackage) {
			return true;
		}
		if(object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

} // B3backendAdapterFactory
