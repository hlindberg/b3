/**
 * Copyright (c) 2009-2010, Cloudsmith Inc and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 * - Cloudsmith Inc - initial API and implementation.
 */
package org.eclipse.b3.backend.evaluator.b3backend;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * 
 * @see org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage
 * @generated
 */
public interface B3backendFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	B3backendFactory eINSTANCE = org.eclipse.b3.backend.evaluator.b3backend.impl.B3backendFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>B3 Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>B3 Function</em>'.
	 * @generated
	 */
	B3Function createB3Function();

	/**
	 * Returns a new object of class '<em>B3 Function Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>B3 Function Type</em>'.
	 * @generated
	 */
	B3FunctionType createB3FunctionType();

	/**
	 * Returns a new object of class '<em>B3 Func Type Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>B3 Func Type Variable</em>'.
	 * @generated
	 */
	B3FuncTypeVariable createB3FuncTypeVariable();

	/**
	 * Returns a new object of class '<em>B3 Java Import</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>B3 Java Import</em>'.
	 * @generated
	 */
	B3JavaImport createB3JavaImport();

	/**
	 * Returns a new object of class '<em>B3 Meta Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>B3 Meta Class</em>'.
	 * @generated
	 */
	B3MetaClass createB3MetaClass();

	/**
	 * Returns a new object of class '<em>B3 Parameterized Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>B3 Parameterized Type</em>'.
	 * @generated
	 */
	B3ParameterizedType createB3ParameterizedType();

	/**
	 * Returns a new object of class '<em>B3 Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>B3 Type</em>'.
	 * @generated
	 */
	B3Type createB3Type();

	/**
	 * Returns a new object of class '<em>B3 Wildcard Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>B3 Wildcard Type</em>'.
	 * @generated
	 */
	B3WildcardType createB3WildcardType();

	/**
	 * Returns a new object of class '<em>BAdvice</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>BAdvice</em>'.
	 * @generated
	 */
	BAdvice createBAdvice();

	/**
	 * Returns a new object of class '<em>BAnd Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>BAnd Expression</em>'.
	 * @generated
	 */
	BAndExpression createBAndExpression();

	/**
	 * Returns a new object of class '<em>BAssignment Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>BAssignment Expression</em>'.
	 * @generated
	 */
	BAssignmentExpression createBAssignmentExpression();

	/**
	 * Returns a new object of class '<em>BAt Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>BAt Expression</em>'.
	 * @generated
	 */
	BAtExpression createBAtExpression();

	/**
	 * Returns a new object of class '<em>BBinary Op Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>BBinary Op Expression</em>'.
	 * @generated
	 */
	BBinaryOpExpression createBBinaryOpExpression();

	/**
	 * Returns a new object of class '<em>BCached Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>BCached Expression</em>'.
	 * @generated
	 */
	BCachedExpression createBCachedExpression();

	/**
	 * Returns a new object of class '<em>BCall Feature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>BCall Feature</em>'.
	 * @generated
	 */
	BCallFeature createBCallFeature();

	/**
	 * Returns a new object of class '<em>BCall Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>BCall Function</em>'.
	 * @generated
	 */
	BCallFunction createBCallFunction();

	/**
	 * Returns a new object of class '<em>BCall Named Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>BCall Named Function</em>'.
	 * @generated
	 */
	BCallNamedFunction createBCallNamedFunction();

	/**
	 * Returns a new object of class '<em>BCase</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>BCase</em>'.
	 * @generated
	 */
	BCase createBCase();

	/**
	 * Returns a new object of class '<em>BCatch</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>BCatch</em>'.
	 * @generated
	 */
	BCatch createBCatch();

	/**
	 * Returns a new object of class '<em>BChained Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>BChained Expression</em>'.
	 * @generated
	 */
	BChainedExpression createBChainedExpression();

	/**
	 * Returns a new object of class '<em>BConcern</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>BConcern</em>'.
	 * @generated
	 */
	BConcern createBConcern();

	/**
	 * Returns a new object of class '<em>BConditional Property Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>BConditional Property Operation</em>'.
	 * @generated
	 */
	BConditionalPropertyOperation createBConditionalPropertyOperation();

	/**
	 * Returns a new object of class '<em>BContext</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>BContext</em>'.
	 * @generated
	 */
	BContext createBContext();

	/**
	 * Returns a new object of class '<em>BCreate Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>BCreate Expression</em>'.
	 * @generated
	 */
	BCreateExpression createBCreateExpression();

	/**
	 * Returns a new object of class '<em>BDefault Property Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>BDefault Property Set</em>'.
	 * @generated
	 */
	BDefaultPropertySet createBDefaultPropertySet();

	/**
	 * Returns a new object of class '<em>BDef Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>BDef Property</em>'.
	 * @generated
	 */
	BDefProperty createBDefProperty();

	/**
	 * Returns a new object of class '<em>BDef Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>BDef Value</em>'.
	 * @generated
	 */
	BDefValue createBDefValue();

	/**
	 * Returns a new object of class '<em>BDelegating Context</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>BDelegating Context</em>'.
	 * @generated
	 */
	BDelegatingContext createBDelegatingContext();

	/**
	 * Returns a new object of class '<em>BEcho Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>BEcho Expression</em>'.
	 * @generated
	 */
	BEchoExpression createBEchoExpression();

	/**
	 * Returns a new object of class '<em>BExpression Wrapper</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>BExpression Wrapper</em>'.
	 * @generated
	 */
	BExpressionWrapper createBExpressionWrapper();

	/**
	 * Returns a new object of class '<em>BFeature Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>BFeature Expression</em>'.
	 * @generated
	 */
	BFeatureExpression createBFeatureExpression();

	/**
	 * Returns a new object of class '<em>BFunction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>BFunction</em>'.
	 * @generated
	 */
	BFunction createBFunction();

	/**
	 * Returns a new object of class '<em>BFunction Concern Context</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>BFunction Concern Context</em>'.
	 * @generated
	 */
	BFunctionConcernContext createBFunctionConcernContext();

	/**
	 * Returns a new object of class '<em>BFunction Name Predicate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>BFunction Name Predicate</em>'.
	 * @generated
	 */
	BFunctionNamePredicate createBFunctionNamePredicate();

	/**
	 * Returns a new object of class '<em>BFunction Wrapper</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>BFunction Wrapper</em>'.
	 * @generated
	 */
	BFunctionWrapper createBFunctionWrapper();

	/**
	 * Returns a new object of class '<em>BGuard</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>BGuard</em>'.
	 * @generated
	 */
	BGuard createBGuard();

	/**
	 * Returns a new object of class '<em>BIf Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>BIf Expression</em>'.
	 * @generated
	 */
	BIfExpression createBIfExpression();

	/**
	 * Returns a new object of class '<em>BInner Context</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>BInner Context</em>'.
	 * @generated
	 */
	BInnerContext createBInnerContext();

	/**
	 * Returns a new object of class '<em>BInstance Context</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>BInstance Context</em>'.
	 * @generated
	 */
	BInstanceContext createBInstanceContext();

	/**
	 * Returns a new object of class '<em>BInvocation Context</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>BInvocation Context</em>'.
	 * @generated
	 */
	BInvocationContext createBInvocationContext();

	/**
	 * Returns a new object of class '<em>BJava Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>BJava Function</em>'.
	 * @generated
	 */
	BJavaFunction createBJavaFunction();

	/**
	 * Returns a new object of class '<em>BLiteral Any</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>BLiteral Any</em>'.
	 * @generated
	 */
	BLiteralAny createBLiteralAny();

	/**
	 * Returns a new object of class '<em>BLiteral Byte Array Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>BLiteral Byte Array Expression</em>'.
	 * @generated
	 */
	BLiteralByteArrayExpression createBLiteralByteArrayExpression();

	/**
	 * Returns a new object of class '<em>BLiteral Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>BLiteral Expression</em>'.
	 * @generated
	 */
	BLiteralExpression createBLiteralExpression();

	/**
	 * Returns a new object of class '<em>BLiteral Integer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>BLiteral Integer</em>'.
	 * @generated
	 */
	BLiteralInteger createBLiteralInteger();

	/**
	 * Returns a new object of class '<em>BLiteral List Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>BLiteral List Expression</em>'.
	 * @generated
	 */
	BLiteralListExpression createBLiteralListExpression();

	/**
	 * Returns a new object of class '<em>BLiteral Map Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>BLiteral Map Expression</em>'.
	 * @generated
	 */
	BLiteralMapExpression createBLiteralMapExpression();

	/**
	 * Returns a new object of class '<em>BLiteral Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>BLiteral Type</em>'.
	 * @generated
	 */
	BLiteralType createBLiteralType();

	/**
	 * Returns a new object of class '<em>BMap Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>BMap Entry</em>'.
	 * @generated
	 */
	BMapEntry createBMapEntry();

	/**
	 * Returns a new object of class '<em>BName Predicate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>BName Predicate</em>'.
	 * @generated
	 */
	BNamePredicate createBNamePredicate();

	/**
	 * Returns a new object of class '<em>BOr Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>BOr Expression</em>'.
	 * @generated
	 */
	BOrExpression createBOrExpression();

	/**
	 * Returns a new object of class '<em>BParameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>BParameter</em>'.
	 * @generated
	 */
	BParameter createBParameter();

	/**
	 * Returns a new object of class '<em>BParameter Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>BParameter Declaration</em>'.
	 * @generated
	 */
	BParameterDeclaration createBParameterDeclaration();

	/**
	 * Returns a new object of class '<em>BParameter List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>BParameter List</em>'.
	 * @generated
	 */
	BParameterList createBParameterList();

	/**
	 * Returns a new object of class '<em>BParameter Predicate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>BParameter Predicate</em>'.
	 * @generated
	 */
	BParameterPredicate createBParameterPredicate();

	/**
	 * Returns a new object of class '<em>BPattern Literal Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>BPattern Literal Expression</em>'.
	 * @generated
	 */
	BPatternLiteralExpression createBPatternLiteralExpression();

	/**
	 * Returns a new object of class '<em>BProceed Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>BProceed Expression</em>'.
	 * @generated
	 */
	BProceedExpression createBProceedExpression();

	/**
	 * Returns a new object of class '<em>BProperty Definition Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>BProperty Definition Operation</em>'.
	 * @generated
	 */
	BPropertyDefinitionOperation createBPropertyDefinitionOperation();

	/**
	 * Returns a new object of class '<em>BProperty Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>BProperty Set</em>'.
	 * @generated
	 */
	BPropertySet createBPropertySet();

	/**
	 * Returns a new object of class '<em>BProperty Set Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>BProperty Set Operation</em>'.
	 * @generated
	 */
	BPropertySetOperation createBPropertySetOperation();

	/**
	 * Returns a new object of class '<em>BRegular Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>BRegular Expression</em>'.
	 * @generated
	 */
	BRegularExpression createBRegularExpression();

	/**
	 * Returns a new object of class '<em>BSimple Pattern Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>BSimple Pattern Expression</em>'.
	 * @generated
	 */
	BSimplePatternExpression createBSimplePatternExpression();

	/**
	 * Returns a new object of class '<em>BSwitch Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>BSwitch Expression</em>'.
	 * @generated
	 */
	BSwitchExpression createBSwitchExpression();

	/**
	 * Returns a new object of class '<em>BSystem Context</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>BSystem Context</em>'.
	 * @generated
	 */
	BSystemContext createBSystemContext();

	/**
	 * Returns a new object of class '<em>BTC Boolean Lambda</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>BTC Boolean Lambda</em>'.
	 * @generated
	 */
	BTCBooleanLambda createBTCBooleanLambda();

	/**
	 * Returns a new object of class '<em>BTC First Lambda</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>BTC First Lambda</em>'.
	 * @generated
	 */
	BTCFirstLambda createBTCFirstLambda();

	/**
	 * Returns a new object of class '<em>BTC Integral</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>BTC Integral</em>'.
	 * @generated
	 */
	BTCIntegral createBTCIntegral();

	/**
	 * Returns a new object of class '<em>BTC Last Lambda</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>BTC Last Lambda</em>'.
	 * @generated
	 */
	BTCLastLambda createBTCLastLambda();

	/**
	 * Returns a new object of class '<em>BTC Number</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>BTC Number</em>'.
	 * @generated
	 */
	BTCNumber createBTCNumber();

	/**
	 * Returns a new object of class '<em>BTC Pluggable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>BTC Pluggable</em>'.
	 * @generated
	 */
	BTCPluggable createBTCPluggable();

	/**
	 * Returns a new object of class '<em>BTemplate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>BTemplate</em>'.
	 * @generated
	 */
	BTemplate createBTemplate();

	/**
	 * Returns a new object of class '<em>BThrow Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>BThrow Expression</em>'.
	 * @generated
	 */
	BThrowExpression createBThrowExpression();

	/**
	 * Returns a new object of class '<em>BTry Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>BTry Expression</em>'.
	 * @generated
	 */
	BTryExpression createBTryExpression();

	/**
	 * Returns a new object of class '<em>BUnary Op Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>BUnary Op Expression</em>'.
	 * @generated
	 */
	BUnaryOpExpression createBUnaryOpExpression();

	/**
	 * Returns a new object of class '<em>BUnary Post Op Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>BUnary Post Op Expression</em>'.
	 * @generated
	 */
	BUnaryPostOpExpression createBUnaryPostOpExpression();

	/**
	 * Returns a new object of class '<em>BUnary Pre Op Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>BUnary Pre Op Expression</em>'.
	 * @generated
	 */
	BUnaryPreOpExpression createBUnaryPreOpExpression();

	/**
	 * Returns a new object of class '<em>BVariable Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>BVariable Expression</em>'.
	 * @generated
	 */
	BVariableExpression createBVariableExpression();

	/**
	 * Returns a new object of class '<em>BWith Context Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>BWith Context Expression</em>'.
	 * @generated
	 */
	BWithContextExpression createBWithContextExpression();

	/**
	 * Returns a new object of class '<em>BWith Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>BWith Expression</em>'.
	 * @generated
	 */
	BWithExpression createBWithExpression();

	/**
	 * Returns a new object of class '<em>BWrapping Context</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>BWrapping Context</em>'.
	 * @generated
	 */
	BWrappingContext createBWrappingContext();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the package supported by this factory.
	 * @generated
	 */
	B3backendPackage getB3backendPackage();

} // B3backendFactory
