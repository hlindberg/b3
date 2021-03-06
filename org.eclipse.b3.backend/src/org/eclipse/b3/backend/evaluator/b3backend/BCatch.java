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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BCatch</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.b3.backend.evaluator.b3backend.BCatch#getCatchExpr <em>Catch Expr</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage#getBCatch()
 * @model
 * @generated
 */
public interface BCatch extends ITypedValue {
	/**
	 * Returns the value of the '<em><b>Catch Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Catch Expr</em>' containment reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Catch Expr</em>' containment reference.
	 * @see #setCatchExpr(BExpression)
	 * @see org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage#getBCatch_CatchExpr()
	 * @model containment="true"
	 * @generated
	 */
	BExpression getCatchExpr();

	/**
	 * Sets the value of the '{@link org.eclipse.b3.backend.evaluator.b3backend.BCatch#getCatchExpr <em>Catch Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Catch Expr</em>' containment reference.
	 * @see #getCatchExpr()
	 * @generated
	 */
	void setCatchExpr(BExpression value);

} // BCatch
