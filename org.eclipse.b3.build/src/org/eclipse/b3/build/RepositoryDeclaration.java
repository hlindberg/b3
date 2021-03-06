/**
 * Copyright (c) 2010, Cloudsmith Inc and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 * - Cloudsmith Inc - initial API and implementation.
 */
package org.eclipse.b3.build;

import java.lang.reflect.Type;
import java.net.URI;

import org.eclipse.b3.backend.evaluator.b3backend.BExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Repository Declaration</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.b3.build.RepositoryDeclaration#getLocation <em>Location</em>}</li>
 * <li>{@link org.eclipse.b3.build.RepositoryDeclaration#getResolverType <em>Resolver Type</em>}</li>
 * <li>{@link org.eclipse.b3.build.RepositoryDeclaration#getContextBlock <em>Context Block</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.b3.build.B3BuildPackage#getRepositoryDeclaration()
 * @model
 * @generated
 */
public interface RepositoryDeclaration extends RepositoryConfiguration {
	/**
	 * Returns the value of the '<em><b>Context Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context Block</em>' containment reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Context Block</em>' containment reference.
	 * @see #setContextBlock(BExpression)
	 * @see org.eclipse.b3.build.B3BuildPackage#getRepositoryDeclaration_ContextBlock()
	 * @model containment="true"
	 * @generated
	 */
	BExpression getContextBlock();

	/**
	 * Returns the value of the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Location</em>' attribute.
	 * @see #setLocation(URI)
	 * @see org.eclipse.b3.build.B3BuildPackage#getRepositoryDeclaration_Location()
	 * @model dataType="org.eclipse.b3.backend.evaluator.b3backend.URI"
	 * @generated
	 */
	URI getLocation();

	/**
	 * Returns the value of the '<em><b>Resolver Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resolver Type</em>' containment reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Resolver Type</em>' containment reference.
	 * @see #setResolverType(Type)
	 * @see org.eclipse.b3.build.B3BuildPackage#getRepositoryDeclaration_ResolverType()
	 * @model type="org.eclipse.b3.backend.evaluator.b3backend.IType" containment="true"
	 * @generated
	 */
	Type getResolverType();

	/**
	 * Sets the value of the '{@link org.eclipse.b3.build.RepositoryDeclaration#getContextBlock <em>Context Block</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Context Block</em>' containment reference.
	 * @see #getContextBlock()
	 * @generated
	 */
	void setContextBlock(BExpression value);

	/**
	 * Sets the value of the '{@link org.eclipse.b3.build.RepositoryDeclaration#getLocation <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Location</em>' attribute.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(URI value);

	/**
	 * Sets the value of the '{@link org.eclipse.b3.build.RepositoryDeclaration#getResolverType <em>Resolver Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Resolver Type</em>' containment reference.
	 * @see #getResolverType()
	 * @generated
	 */
	void setResolverType(Type value);

} // RepositoryDeclaration
