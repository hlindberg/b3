/**
 * Copyright (c) 2009-2010, Cloudsmith Inc and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 * - Cloudsmith Inc - initial API and implementation.
 */

package org.eclipse.b3.build.impl;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import org.eclipse.b3.backend.core.IB3Evaluator;
import org.eclipse.b3.backend.core.exceptions.B3InternalError;
import org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext;
import org.eclipse.b3.backend.evaluator.b3backend.BExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BFunctionContainer;
import org.eclipse.b3.backend.evaluator.b3backend.BPropertySet;
import org.eclipse.b3.backend.evaluator.b3backend.impl.B3FunctionImpl;
import org.eclipse.b3.backend.evaluator.typesystem.TypeUtils;
import org.eclipse.b3.build.B3BuildFactory;
import org.eclipse.b3.build.B3BuildPackage;
import org.eclipse.b3.build.BuildUnit;
import org.eclipse.b3.build.Builder;
import org.eclipse.b3.build.BuilderInput;
import org.eclipse.b3.build.Capability;
import org.eclipse.b3.build.EffectiveCapabilityFacade;
import org.eclipse.b3.build.IBuilder;
import org.eclipse.b3.build.IProvidedCapabilityContainer;
import org.eclipse.b3.build.PathGroup;
import org.eclipse.b3.build.UnitParameterDeclaration;
import org.eclipse.b3.build.core.B3BuilderJob;
import org.eclipse.b3.build.core.adapters.BuildUnitProxyAdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Builder</b></em>'.
 * 
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.b3.build.impl.BuilderImpl#getProvidedCapabilities <em>Provided Capabilities</em>}</li>
 * <li>{@link org.eclipse.b3.build.impl.BuilderImpl#getPostcondExpr <em>Postcond Expr</em>}</li>
 * <li>{@link org.eclipse.b3.build.impl.BuilderImpl#getPrecondExpr <em>Precond Expr</em>}</li>
 * <li>{@link org.eclipse.b3.build.impl.BuilderImpl#getInput <em>Input</em>}</li>
 * <li>{@link org.eclipse.b3.build.impl.BuilderImpl#getOutput <em>Output</em>}</li>
 * <li>{@link org.eclipse.b3.build.impl.BuilderImpl#getDefaultProperties <em>Default Properties</em>}</li>
 * <li>{@link org.eclipse.b3.build.impl.BuilderImpl#getPostinputcondExpr <em>Postinputcond Expr</em>}</li>
 * <li>{@link org.eclipse.b3.build.impl.BuilderImpl#getUnitType <em>Unit Type</em>}</li>
 * <li>{@link org.eclipse.b3.build.impl.BuilderImpl#getExplicitUnitType <em>Explicit Unit Type</em>}</li>
 * <li>{@link org.eclipse.b3.build.impl.BuilderImpl#getSource <em>Source</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class BuilderImpl extends B3FunctionImpl implements Builder {

	/**
	 * The cached value of the '{@link #getProvidedCapabilities() <em>Provided Capabilities</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getProvidedCapabilities()
	 * @generated
	 * @ordered
	 */
	protected EList<Capability> providedCapabilities;

	/**
	 * The cached value of the '{@link #getPostcondExpr() <em>Postcond Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getPostcondExpr()
	 * @generated
	 * @ordered
	 */
	protected BExpression postcondExpr;

	/**
	 * The cached value of the '{@link #getPrecondExpr() <em>Precond Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getPrecondExpr()
	 * @generated
	 * @ordered
	 */
	protected BExpression precondExpr;

	/**
	 * The cached value of the '{@link #getInput() <em>Input</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getInput()
	 * @generated
	 * @ordered
	 */
	protected BuilderInput input;

	/**
	 * The cached value of the '{@link #getOutput() <em>Output</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getOutput()
	 * @generated
	 * @ordered
	 */
	protected PathGroup output;

	/**
	 * The cached value of the '{@link #getDefaultProperties() <em>Default Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getDefaultProperties()
	 * @generated
	 * @ordered
	 */
	protected BPropertySet defaultProperties;

	/**
	 * The cached value of the '{@link #getPostinputcondExpr() <em>Postinputcond Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getPostinputcondExpr()
	 * @generated
	 * @ordered
	 */
	protected BExpression postinputcondExpr;

	/**
	 * The cached value of the '{@link #getUnitType() <em>Unit Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getUnitType()
	 * @generated
	 * @ordered
	 */
	protected Class<? extends BuildUnit> unitType;

	/**
	 * The cached value of the '{@link #getExplicitUnitType() <em>Explicit Unit Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getExplicitUnitType()
	 * @generated
	 * @ordered
	 */
	protected UnitParameterDeclaration explicitUnitType;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected PathGroup source;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected BuilderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetDefaultProperties(BPropertySet newDefaultProperties, NotificationChain msgs) {
		BPropertySet oldDefaultProperties = defaultProperties;
		defaultProperties = newDefaultProperties;
		if(eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, B3BuildPackage.BUILDER__DEFAULT_PROPERTIES, oldDefaultProperties,
				newDefaultProperties);
			if(msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetExplicitUnitType(UnitParameterDeclaration newExplicitUnitType,
			NotificationChain msgs) {
		UnitParameterDeclaration oldExplicitUnitType = explicitUnitType;
		explicitUnitType = newExplicitUnitType;
		if(eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, B3BuildPackage.BUILDER__EXPLICIT_UNIT_TYPE, oldExplicitUnitType,
				newExplicitUnitType);
			if(msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetInput(BuilderInput newInput, NotificationChain msgs) {
		BuilderInput oldInput = input;
		input = newInput;
		if(eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, B3BuildPackage.BUILDER__INPUT, oldInput, newInput);
			if(msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetOutput(PathGroup newOutput, NotificationChain msgs) {
		PathGroup oldOutput = output;
		output = newOutput;
		if(eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, B3BuildPackage.BUILDER__OUTPUT, oldOutput, newOutput);
			if(msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetPostcondExpr(BExpression newPostcondExpr, NotificationChain msgs) {
		BExpression oldPostcondExpr = postcondExpr;
		postcondExpr = newPostcondExpr;
		if(eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, B3BuildPackage.BUILDER__POSTCOND_EXPR, oldPostcondExpr, newPostcondExpr);
			if(msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetPostinputcondExpr(BExpression newPostinputcondExpr, NotificationChain msgs) {
		BExpression oldPostinputcondExpr = postinputcondExpr;
		postinputcondExpr = newPostinputcondExpr;
		if(eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, B3BuildPackage.BUILDER__POSTINPUTCOND_EXPR, oldPostinputcondExpr,
				newPostinputcondExpr);
			if(msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetPrecondExpr(BExpression newPrecondExpr, NotificationChain msgs) {
		BExpression oldPrecondExpr = precondExpr;
		precondExpr = newPrecondExpr;
		if(eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, B3BuildPackage.BUILDER__PRECOND_EXPR, oldPrecondExpr, newPrecondExpr);
			if(msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetSource(PathGroup newSource, NotificationChain msgs) {
		PathGroup oldSource = source;
		source = newSource;
		if(eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, B3BuildPackage.BUILDER__SOURCE, oldSource, newSource);
			if(msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if(baseClass == IProvidedCapabilityContainer.class) {
			switch(derivedFeatureID) {
				case B3BuildPackage.BUILDER__PROVIDED_CAPABILITIES:
					return B3BuildPackage.IPROVIDED_CAPABILITY_CONTAINER__PROVIDED_CAPABILITIES;
				default:
					return -1;
			}
		}
		if(baseClass == IBuilder.class) {
			switch(derivedFeatureID) {
				case B3BuildPackage.BUILDER__POSTCOND_EXPR:
					return B3BuildPackage.IBUILDER__POSTCOND_EXPR;
				case B3BuildPackage.BUILDER__PRECOND_EXPR:
					return B3BuildPackage.IBUILDER__PRECOND_EXPR;
				case B3BuildPackage.BUILDER__INPUT:
					return B3BuildPackage.IBUILDER__INPUT;
				case B3BuildPackage.BUILDER__OUTPUT:
					return B3BuildPackage.IBUILDER__OUTPUT;
				case B3BuildPackage.BUILDER__DEFAULT_PROPERTIES:
					return B3BuildPackage.IBUILDER__DEFAULT_PROPERTIES;
				case B3BuildPackage.BUILDER__POSTINPUTCOND_EXPR:
					return B3BuildPackage.IBUILDER__POSTINPUTCOND_EXPR;
				case B3BuildPackage.BUILDER__UNIT_TYPE:
					return B3BuildPackage.IBUILDER__UNIT_TYPE;
				case B3BuildPackage.BUILDER__EXPLICIT_UNIT_TYPE:
					return B3BuildPackage.IBUILDER__EXPLICIT_UNIT_TYPE;
				case B3BuildPackage.BUILDER__SOURCE:
					return B3BuildPackage.IBUILDER__SOURCE;
				default:
					return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if(baseClass == IProvidedCapabilityContainer.class) {
			switch(baseFeatureID) {
				case B3BuildPackage.IPROVIDED_CAPABILITY_CONTAINER__PROVIDED_CAPABILITIES:
					return B3BuildPackage.BUILDER__PROVIDED_CAPABILITIES;
				default:
					return -1;
			}
		}
		if(baseClass == IBuilder.class) {
			switch(baseFeatureID) {
				case B3BuildPackage.IBUILDER__POSTCOND_EXPR:
					return B3BuildPackage.BUILDER__POSTCOND_EXPR;
				case B3BuildPackage.IBUILDER__PRECOND_EXPR:
					return B3BuildPackage.BUILDER__PRECOND_EXPR;
				case B3BuildPackage.IBUILDER__INPUT:
					return B3BuildPackage.BUILDER__INPUT;
				case B3BuildPackage.IBUILDER__OUTPUT:
					return B3BuildPackage.BUILDER__OUTPUT;
				case B3BuildPackage.IBUILDER__DEFAULT_PROPERTIES:
					return B3BuildPackage.BUILDER__DEFAULT_PROPERTIES;
				case B3BuildPackage.IBUILDER__POSTINPUTCOND_EXPR:
					return B3BuildPackage.BUILDER__POSTINPUTCOND_EXPR;
				case B3BuildPackage.IBUILDER__UNIT_TYPE:
					return B3BuildPackage.BUILDER__UNIT_TYPE;
				case B3BuildPackage.IBUILDER__EXPLICIT_UNIT_TYPE:
					return B3BuildPackage.BUILDER__EXPLICIT_UNIT_TYPE;
				case B3BuildPackage.IBUILDER__SOURCE:
					return B3BuildPackage.BUILDER__SOURCE;
				default:
					return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
			case B3BuildPackage.BUILDER__PROVIDED_CAPABILITIES:
				return getProvidedCapabilities();
			case B3BuildPackage.BUILDER__POSTCOND_EXPR:
				return getPostcondExpr();
			case B3BuildPackage.BUILDER__PRECOND_EXPR:
				return getPrecondExpr();
			case B3BuildPackage.BUILDER__INPUT:
				return getInput();
			case B3BuildPackage.BUILDER__OUTPUT:
				return getOutput();
			case B3BuildPackage.BUILDER__DEFAULT_PROPERTIES:
				return getDefaultProperties();
			case B3BuildPackage.BUILDER__POSTINPUTCOND_EXPR:
				return getPostinputcondExpr();
			case B3BuildPackage.BUILDER__UNIT_TYPE:
				return getUnitType();
			case B3BuildPackage.BUILDER__EXPLICIT_UNIT_TYPE:
				return getExplicitUnitType();
			case B3BuildPackage.BUILDER__SOURCE:
				return getSource();
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch(featureID) {
			case B3BuildPackage.BUILDER__PROVIDED_CAPABILITIES:
				return ((InternalEList<?>) getProvidedCapabilities()).basicRemove(otherEnd, msgs);
			case B3BuildPackage.BUILDER__POSTCOND_EXPR:
				return basicSetPostcondExpr(null, msgs);
			case B3BuildPackage.BUILDER__PRECOND_EXPR:
				return basicSetPrecondExpr(null, msgs);
			case B3BuildPackage.BUILDER__INPUT:
				return basicSetInput(null, msgs);
			case B3BuildPackage.BUILDER__OUTPUT:
				return basicSetOutput(null, msgs);
			case B3BuildPackage.BUILDER__DEFAULT_PROPERTIES:
				return basicSetDefaultProperties(null, msgs);
			case B3BuildPackage.BUILDER__POSTINPUTCOND_EXPR:
				return basicSetPostinputcondExpr(null, msgs);
			case B3BuildPackage.BUILDER__EXPLICIT_UNIT_TYPE:
				return basicSetExplicitUnitType(null, msgs);
			case B3BuildPackage.BUILDER__SOURCE:
				return basicSetSource(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
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
			case B3BuildPackage.BUILDER__PROVIDED_CAPABILITIES:
				return providedCapabilities != null && !providedCapabilities.isEmpty();
			case B3BuildPackage.BUILDER__POSTCOND_EXPR:
				return postcondExpr != null;
			case B3BuildPackage.BUILDER__PRECOND_EXPR:
				return precondExpr != null;
			case B3BuildPackage.BUILDER__INPUT:
				return input != null;
			case B3BuildPackage.BUILDER__OUTPUT:
				return output != null;
			case B3BuildPackage.BUILDER__DEFAULT_PROPERTIES:
				return defaultProperties != null;
			case B3BuildPackage.BUILDER__POSTINPUTCOND_EXPR:
				return postinputcondExpr != null;
			case B3BuildPackage.BUILDER__UNIT_TYPE:
				return unitType != null;
			case B3BuildPackage.BUILDER__EXPLICIT_UNIT_TYPE:
				return explicitUnitType != null;
			case B3BuildPackage.BUILDER__SOURCE:
				return source != null;
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
			case B3BuildPackage.BUILDER__PROVIDED_CAPABILITIES:
				getProvidedCapabilities().clear();
				getProvidedCapabilities().addAll((Collection<? extends Capability>) newValue);
				return;
			case B3BuildPackage.BUILDER__POSTCOND_EXPR:
				setPostcondExpr((BExpression) newValue);
				return;
			case B3BuildPackage.BUILDER__PRECOND_EXPR:
				setPrecondExpr((BExpression) newValue);
				return;
			case B3BuildPackage.BUILDER__INPUT:
				setInput((BuilderInput) newValue);
				return;
			case B3BuildPackage.BUILDER__OUTPUT:
				setOutput((PathGroup) newValue);
				return;
			case B3BuildPackage.BUILDER__DEFAULT_PROPERTIES:
				setDefaultProperties((BPropertySet) newValue);
				return;
			case B3BuildPackage.BUILDER__POSTINPUTCOND_EXPR:
				setPostinputcondExpr((BExpression) newValue);
				return;
			case B3BuildPackage.BUILDER__UNIT_TYPE:
				setUnitType((Class<? extends BuildUnit>) newValue);
				return;
			case B3BuildPackage.BUILDER__EXPLICIT_UNIT_TYPE:
				setExplicitUnitType((UnitParameterDeclaration) newValue);
				return;
			case B3BuildPackage.BUILDER__SOURCE:
				setSource((PathGroup) newValue);
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
			case B3BuildPackage.BUILDER__PROVIDED_CAPABILITIES:
				getProvidedCapabilities().clear();
				return;
			case B3BuildPackage.BUILDER__POSTCOND_EXPR:
				setPostcondExpr((BExpression) null);
				return;
			case B3BuildPackage.BUILDER__PRECOND_EXPR:
				setPrecondExpr((BExpression) null);
				return;
			case B3BuildPackage.BUILDER__INPUT:
				setInput((BuilderInput) null);
				return;
			case B3BuildPackage.BUILDER__OUTPUT:
				setOutput((PathGroup) null);
				return;
			case B3BuildPackage.BUILDER__DEFAULT_PROPERTIES:
				setDefaultProperties((BPropertySet) null);
				return;
			case B3BuildPackage.BUILDER__POSTINPUTCOND_EXPR:
				setPostinputcondExpr((BExpression) null);
				return;
			case B3BuildPackage.BUILDER__UNIT_TYPE:
				setUnitType((Class<? extends BuildUnit>) null);
				return;
			case B3BuildPackage.BUILDER__EXPLICIT_UNIT_TYPE:
				setExplicitUnitType((UnitParameterDeclaration) null);
				return;
			case B3BuildPackage.BUILDER__SOURCE:
				setSource((PathGroup) null);
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
	public BPropertySet getDefaultProperties() {
		return defaultProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public Iterator<EffectiveCapabilityFacade> getEffectiveCapabilities(BExecutionContext ctx) throws Throwable {
		IB3Evaluator evaluator = ctx.getInjector().getInstance(IB3Evaluator.class);
		ArrayList<EffectiveCapabilityFacade> list = new ArrayList<EffectiveCapabilityFacade>();
		BExecutionContext ctxToUse = ctx;
		BPropertySet defProp = getDefaultProperties();
		if(defProp != null) {
			ctxToUse = ctxToUse.createOuterContext();
			evaluator.doEvaluateDefaults(defProp, ctxToUse, true);
			// defProp.evaluateDefaults(ctxToUse, true);
		}
		for(Capability cap : getProvidedCapabilities()) {
			BExpression c = cap.getCondExpr();
			if(c != null) {
				Object include = evaluator.doEvaluate(c, ctxToUse);
				if(include != null && include instanceof Boolean && ((Boolean) include) == Boolean.FALSE)
					continue; // skip this requirement
			}
			EffectiveCapabilityFacade facade = B3BuildFactory.eINSTANCE.createEffectiveCapabilityFacade();
			facade.setContext(ctxToUse);
			facade.setProvidedCapability(cap);
			list.add(facade);
		}
		return list.iterator();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public UnitParameterDeclaration getExplicitUnitType() {
		return explicitUnitType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public BuilderInput getInput() {
		return input;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public PathGroup getOutput() {
		return output;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public BExpression getPostcondExpr() {
		return postcondExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public BExpression getPostinputcondExpr() {
		return postinputcondExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public BExpression getPrecondExpr() {
		return precondExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<Capability> getProvidedCapabilities() {
		if(providedCapabilities == null) {
			providedCapabilities = new EObjectContainmentEList<Capability>(
				Capability.class, this, B3BuildPackage.BUILDER__PROVIDED_CAPABILITIES);
		}
		return providedCapabilities;
	}

	/**
	 * Overrides the default - a Builder always returns a B3BuilderJob.
	 */
	@Override
	public Type getReturnType() {
		return B3BuilderJob.class;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public PathGroup getSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * If the Builder is contained in a BuildUnit, the type of the build unit is set. Otherwise, the set unitType
	 * is returned. If not contained by a build unit, and neither unitType nor explicitUnitType is set,
	 * an exception is thrown.
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@SuppressWarnings("unchecked")
	public Class<? extends BuildUnit> getUnitType() {
		BFunctionContainer c = getContainer();
		if(c == null || !(c instanceof BuildUnit)) {
			if(unitType != null)
				return unitType;
			if(explicitUnitType == null)
				throw new B3InternalError(
					"A builder was found that was neither contained in a BuildUnit nor has 'Class<? extends BuildUnit> unit' as its first parameter." +
							this.toString());
			Type explicit = explicitUnitType.getType();
			if(!TypeUtils.isAssignableFrom(BuildUnit.class, explicit))
				throw new B3InternalError("A builder with explicit unit type had a non BuildUnit as its type." +
						this.toString());
			return (Class<? extends BuildUnit>) TypeUtils.getRaw(explicit);
		}
		return BuildUnitProxyAdapterFactory.eINSTANCE.adapt((BuildUnit) c).getProxy().getClass();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setDefaultProperties(BPropertySet newDefaultProperties) {
		if(newDefaultProperties != defaultProperties) {
			NotificationChain msgs = null;
			if(defaultProperties != null)
				msgs = ((InternalEObject) defaultProperties).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						B3BuildPackage.BUILDER__DEFAULT_PROPERTIES, null, msgs);
			if(newDefaultProperties != null)
				msgs = ((InternalEObject) newDefaultProperties).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						B3BuildPackage.BUILDER__DEFAULT_PROPERTIES, null, msgs);
			msgs = basicSetDefaultProperties(newDefaultProperties, msgs);
			if(msgs != null)
				msgs.dispatch();
		}
		else if(eNotificationRequired())
			eNotify(new ENotificationImpl(
				this, Notification.SET, B3BuildPackage.BUILDER__DEFAULT_PROPERTIES, newDefaultProperties,
				newDefaultProperties));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setExplicitUnitType(UnitParameterDeclaration newExplicitUnitType) {
		if(newExplicitUnitType != explicitUnitType) {
			NotificationChain msgs = null;
			if(explicitUnitType != null)
				msgs = ((InternalEObject) explicitUnitType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						B3BuildPackage.BUILDER__EXPLICIT_UNIT_TYPE, null, msgs);
			if(newExplicitUnitType != null)
				msgs = ((InternalEObject) newExplicitUnitType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						B3BuildPackage.BUILDER__EXPLICIT_UNIT_TYPE, null, msgs);
			msgs = basicSetExplicitUnitType(newExplicitUnitType, msgs);
			if(msgs != null)
				msgs.dispatch();
		}
		else if(eNotificationRequired())
			eNotify(new ENotificationImpl(
				this, Notification.SET, B3BuildPackage.BUILDER__EXPLICIT_UNIT_TYPE, newExplicitUnitType,
				newExplicitUnitType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setInput(BuilderInput newInput) {
		if(newInput != input) {
			NotificationChain msgs = null;
			if(input != null)
				msgs = ((InternalEObject) input).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						B3BuildPackage.BUILDER__INPUT, null, msgs);
			if(newInput != null)
				msgs = ((InternalEObject) newInput).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						B3BuildPackage.BUILDER__INPUT, null, msgs);
			msgs = basicSetInput(newInput, msgs);
			if(msgs != null)
				msgs.dispatch();
		}
		else if(eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, B3BuildPackage.BUILDER__INPUT, newInput, newInput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setOutput(PathGroup newOutput) {
		if(newOutput != output) {
			NotificationChain msgs = null;
			if(output != null)
				msgs = ((InternalEObject) output).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						B3BuildPackage.BUILDER__OUTPUT, null, msgs);
			if(newOutput != null)
				msgs = ((InternalEObject) newOutput).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						B3BuildPackage.BUILDER__OUTPUT, null, msgs);
			msgs = basicSetOutput(newOutput, msgs);
			if(msgs != null)
				msgs.dispatch();
		}
		else if(eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, B3BuildPackage.BUILDER__OUTPUT, newOutput, newOutput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setPostcondExpr(BExpression newPostcondExpr) {
		if(newPostcondExpr != postcondExpr) {
			NotificationChain msgs = null;
			if(postcondExpr != null)
				msgs = ((InternalEObject) postcondExpr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						B3BuildPackage.BUILDER__POSTCOND_EXPR, null, msgs);
			if(newPostcondExpr != null)
				msgs = ((InternalEObject) newPostcondExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						B3BuildPackage.BUILDER__POSTCOND_EXPR, null, msgs);
			msgs = basicSetPostcondExpr(newPostcondExpr, msgs);
			if(msgs != null)
				msgs.dispatch();
		}
		else if(eNotificationRequired())
			eNotify(new ENotificationImpl(
				this, Notification.SET, B3BuildPackage.BUILDER__POSTCOND_EXPR, newPostcondExpr, newPostcondExpr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setPostinputcondExpr(BExpression newPostinputcondExpr) {
		if(newPostinputcondExpr != postinputcondExpr) {
			NotificationChain msgs = null;
			if(postinputcondExpr != null)
				msgs = ((InternalEObject) postinputcondExpr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						B3BuildPackage.BUILDER__POSTINPUTCOND_EXPR, null, msgs);
			if(newPostinputcondExpr != null)
				msgs = ((InternalEObject) newPostinputcondExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						B3BuildPackage.BUILDER__POSTINPUTCOND_EXPR, null, msgs);
			msgs = basicSetPostinputcondExpr(newPostinputcondExpr, msgs);
			if(msgs != null)
				msgs.dispatch();
		}
		else if(eNotificationRequired())
			eNotify(new ENotificationImpl(
				this, Notification.SET, B3BuildPackage.BUILDER__POSTINPUTCOND_EXPR, newPostinputcondExpr,
				newPostinputcondExpr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setPrecondExpr(BExpression newPrecondExpr) {
		if(newPrecondExpr != precondExpr) {
			NotificationChain msgs = null;
			if(precondExpr != null)
				msgs = ((InternalEObject) precondExpr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						B3BuildPackage.BUILDER__PRECOND_EXPR, null, msgs);
			if(newPrecondExpr != null)
				msgs = ((InternalEObject) newPrecondExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						B3BuildPackage.BUILDER__PRECOND_EXPR, null, msgs);
			msgs = basicSetPrecondExpr(newPrecondExpr, msgs);
			if(msgs != null)
				msgs.dispatch();
		}
		else if(eNotificationRequired())
			eNotify(new ENotificationImpl(
				this, Notification.SET, B3BuildPackage.BUILDER__PRECOND_EXPR, newPrecondExpr, newPrecondExpr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setSource(PathGroup newSource) {
		if(newSource != source) {
			NotificationChain msgs = null;
			if(source != null)
				msgs = ((InternalEObject) source).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						B3BuildPackage.BUILDER__SOURCE, null, msgs);
			if(newSource != null)
				msgs = ((InternalEObject) newSource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						B3BuildPackage.BUILDER__SOURCE, null, msgs);
			msgs = basicSetSource(newSource, msgs);
			if(msgs != null)
				msgs.dispatch();
		}
		else if(eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, B3BuildPackage.BUILDER__SOURCE, newSource, newSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setUnitType(Class<? extends BuildUnit> newUnitType) {
		Class<? extends BuildUnit> oldUnitType = unitType;
		unitType = newUnitType;
		if(eNotificationRequired())
			eNotify(new ENotificationImpl(
				this, Notification.SET, B3BuildPackage.BUILDER__UNIT_TYPE, oldUnitType, unitType));
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
		result.append(" (unitType: ");
		result.append(unitType);
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
		return B3BuildPackage.Literals.BUILDER;
	}

} // BuilderImpl
