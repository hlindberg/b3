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
package org.eclipse.b3.build.build.impl;

import org.eclipse.b3.backend.core.B3InternalError;
import org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext;
import org.eclipse.b3.build.build.B3BuildPackage;
import org.eclipse.b3.build.build.IBuilder;
import org.eclipse.b3.build.build.PathGroup;
import org.eclipse.b3.build.build.SourcePredicate;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Source Predicate</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 * 
 * @generated
 */
public class SourcePredicateImpl extends PathGroupPredicateImpl implements SourcePredicate {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected SourcePredicateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return B3BuildPackage.Literals.SOURCE_PREDICATE;
	}

	/**
	 * Evaluates the source of the IBuilder assigned to the context variable "@test" and matches that against
	 * either the path vector or pathPattern (a literal any or literal regexp). In the case of a path vector,
	 * the source specification must contain all paths in the predicate path vector (i.e. containsAll semantics).
	 * 
	 * Note: Matching is performed on unfiltered output.
	 */
	@Override
	public Object evaluate(BExecutionContext ctx) throws Throwable {
		// pick up "@test" parameter from context
		Object test = ctx.getValue("@test");
		if(!(test instanceof IBuilder))
			throw new B3InternalError("Attempt to evaluate OutputPredicate against non IBuilder");

		IBuilder b = (IBuilder) test;
		PathGroup pg = b.getSource();
		ctx.defineVariableValue("@test.pathgroup", pg, PathGroup.class);
		return super.evaluate(ctx);
	}

} // SourcePredicateImpl