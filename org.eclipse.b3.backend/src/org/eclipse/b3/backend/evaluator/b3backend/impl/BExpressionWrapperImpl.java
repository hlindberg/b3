/**
 * Copyright (c) 2009, Cloudsmith Inc and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 * - Cloudsmith Inc - initial API and implementation.
 * 
 *
 * $Id$
 */
package org.eclipse.b3.backend.evaluator.b3backend.impl;

import org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage;
import org.eclipse.b3.backend.evaluator.b3backend.BExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BExpressionWrapper;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BExpression Wrapper</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BExpressionWrapperImpl#getOriginal <em>Original</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class BExpressionWrapperImpl extends BExpressionImpl implements BExpressionWrapper {
	/**
	 * The cached value of the '{@link #getOriginal() <em>Original</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getOriginal()
	 * @generated
	 * @ordered
	 */
	protected BExpression original;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected BExpressionWrapperImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public BExpression basicGetOriginal() {
		return original;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch(featureID) {
			case B3backendPackage.BEXPRESSION_WRAPPER__ORIGINAL:
				if(resolve)
					return getOriginal();
				return basicGetOriginal();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch(featureID) {
			case B3backendPackage.BEXPRESSION_WRAPPER__ORIGINAL:
				return original != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch(featureID) {
			case B3backendPackage.BEXPRESSION_WRAPPER__ORIGINAL:
				setOriginal((BExpression) newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch(featureID) {
			case B3backendPackage.BEXPRESSION_WRAPPER__ORIGINAL:
				setOriginal((BExpression) null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public BExpression getOriginal() {
		if(original != null && original.eIsProxy()) {
			InternalEObject oldOriginal = (InternalEObject) original;
			original = (BExpression) eResolveProxy(oldOriginal);
			if(original != oldOriginal) {
				if(eNotificationRequired())
					eNotify(new ENotificationImpl(
						this, Notification.RESOLVE, B3backendPackage.BEXPRESSION_WRAPPER__ORIGINAL, oldOriginal,
						original));
			}
		}
		return original;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setOriginal(BExpression newOriginal) {
		BExpression oldOriginal = original;
		original = newOriginal;
		if(eNotificationRequired())
			eNotify(new ENotificationImpl(
				this, Notification.SET, B3backendPackage.BEXPRESSION_WRAPPER__ORIGINAL, oldOriginal, original));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return B3backendPackage.Literals.BEXPRESSION_WRAPPER;
	}
} // BExpressionWrapperImpl
