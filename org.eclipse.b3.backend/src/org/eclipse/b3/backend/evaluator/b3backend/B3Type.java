/**
 * Copyright (c) 2009, Cloudsmith Inc and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 * - Cloudsmith Inc - initial API and implementation.
 * 
 */
package org.eclipse.b3.backend.evaluator.b3backend;

import java.lang.reflect.Type;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>B3 Type</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.b3.backend.evaluator.b3backend.B3Type#getRawType <em>Raw Type</em>}</li>
 * <li>{@link org.eclipse.b3.backend.evaluator.b3backend.B3Type#isDefaultInference <em>Default Inference</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage#getB3Type()
 * @model superTypes="org.eclipse.b3.backend.evaluator.b3backend.IType"
 * @generated
 */
public interface B3Type extends EObject, Type {
	/**
	 * Returns the value of the '<em><b>Raw Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Raw Type</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Raw Type</em>' attribute.
	 * @see #setRawType(Type)
	 * @see org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage#getB3Type_RawType()
	 * @model dataType="org.eclipse.b3.backend.evaluator.b3backend.Type"
	 * @generated
	 */
	Type getRawType();

	/**
	 * Returns the value of the '<em><b>Default Inference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Inference</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Default Inference</em>' attribute.
	 * @see #setDefaultInference(boolean)
	 * @see org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage#getB3Type_DefaultInference()
	 * @model
	 * @generated
	 */
	boolean isDefaultInference();

	/**
	 * Sets the value of the '{@link org.eclipse.b3.backend.evaluator.b3backend.B3Type#isDefaultInference <em>Default Inference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Default Inference</em>' attribute.
	 * @see #isDefaultInference()
	 * @generated
	 */
	void setDefaultInference(boolean value);

	/**
	 * Sets the value of the '{@link org.eclipse.b3.backend.evaluator.b3backend.B3Type#getRawType <em>Raw Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Raw Type</em>' attribute.
	 * @see #getRawType()
	 * @generated
	 */
	void setRawType(Type value);

} // B3Type
