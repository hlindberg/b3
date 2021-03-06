/**
 * Copyright (c) 2010, Cloudsmith Inc and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 * - Cloudsmith Inc - initial API and implementation.
 * 
 */
package org.eclipse.b3.build.impl;

import java.net.URI;
import java.util.Collection;

import org.eclipse.b3.build.B3BuildFactory;
import org.eclipse.b3.build.B3BuildPackage;
import org.eclipse.b3.build.PathVector;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Path Vector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.b3.build.impl.PathVectorImpl#getPaths <em>Paths</em>}</li>
 * <li>{@link org.eclipse.b3.build.impl.PathVectorImpl#getBasePath <em>Base Path</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class PathVectorImpl extends EObjectImpl implements PathVector {
	/**
	 * The cached value of the '{@link #getPaths() <em>Paths</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getPaths()
	 * @generated
	 * @ordered
	 */
	protected EList<URI> paths;

	/**
	 * The default value of the '{@link #getBasePath() <em>Base Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getBasePath()
	 * @generated
	 * @ordered
	 */
	protected static final URI BASE_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBasePath() <em>Base Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getBasePath()
	 * @generated
	 * @ordered
	 */
	protected URI basePath = BASE_PATH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected PathVectorImpl() {
		super();
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
			case B3BuildPackage.PATH_VECTOR__PATHS:
				return getPaths();
			case B3BuildPackage.PATH_VECTOR__BASE_PATH:
				return getBasePath();
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
			case B3BuildPackage.PATH_VECTOR__PATHS:
				return paths != null && !paths.isEmpty();
			case B3BuildPackage.PATH_VECTOR__BASE_PATH:
				return BASE_PATH_EDEFAULT == null
						? basePath != null
						: !BASE_PATH_EDEFAULT.equals(basePath);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch(featureID) {
			case B3BuildPackage.PATH_VECTOR__PATHS:
				getPaths().clear();
				getPaths().addAll((Collection<? extends URI>) newValue);
				return;
			case B3BuildPackage.PATH_VECTOR__BASE_PATH:
				setBasePath((URI) newValue);
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
			case B3BuildPackage.PATH_VECTOR__PATHS:
				getPaths().clear();
				return;
			case B3BuildPackage.PATH_VECTOR__BASE_PATH:
				setBasePath(BASE_PATH_EDEFAULT);
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
	public URI getBasePath() {
		return basePath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<URI> getPaths() {
		if(paths == null) {
			paths = new EDataTypeUniqueEList<URI>(URI.class, this, B3BuildPackage.PATH_VECTOR__PATHS);
		}
		return paths;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Returns a resolved path vector. If the resulting path vector would be equal to the original
	 * the original (this) is returned. Resolving a path vector means that the basePath is resolved
	 * against the baseUri. If the path vector has no basePath,it will get the baseUri
	 * as its basePath. (i.e. a Path Vector is by default relative to the baseUri).
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public PathVector resolve(URI baseUri) {
		if(baseUri == null)
			throw new IllegalArgumentException("Can not resolve against a null baseUri");
		URI resolved = null;
		if(basePath == null)
			resolved = baseUri;
		else
			resolved = baseUri.resolve(basePath);
		if(basePath != null && resolved.equals(basePath))
			return this; // the resolved path vector is the same as the resolved - no need to copy.

		PathVector pv = B3BuildFactory.eINSTANCE.createPathVector();
		pv.setBasePath(resolved);
		pv.getPaths().addAll(getPaths());
		return pv;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setBasePath(URI newBasePath) {
		URI oldBasePath = basePath;
		basePath = newBasePath;
		if(eNotificationRequired())
			eNotify(new ENotificationImpl(
				this, Notification.SET, B3BuildPackage.PATH_VECTOR__BASE_PATH, oldBasePath, basePath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		if(eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (paths: ");
		result.append(paths);
		result.append(", basePath: ");
		result.append(basePath);
		result.append(')');
		return result.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return B3BuildPackage.Literals.PATH_VECTOR;
	}

} // PathVectorImpl
