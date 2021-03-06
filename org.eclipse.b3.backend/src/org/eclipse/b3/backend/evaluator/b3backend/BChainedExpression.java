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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BChained Expression</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.b3.backend.evaluator.b3backend.BChainedExpression#getExpressions <em>Expressions</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage#getBChainedExpression()
 * @model
 * @generated
 */
public interface BChainedExpression extends BExpression {
	/**
	 * Returns the value of the '<em><b>Expressions</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.b3.backend.evaluator.b3backend.BExpression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expressions</em>' containment reference list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Expressions</em>' containment reference list.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage#getBChainedExpression_Expressions()
	 * @model containment="true"
	 * @generated
	 */
	EList<BExpression> getExpressions();

} // BChainedExpression
