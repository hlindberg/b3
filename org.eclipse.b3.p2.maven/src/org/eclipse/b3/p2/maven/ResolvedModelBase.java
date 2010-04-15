/*******************************************************************************
 * Copyright (c) 2006-2007, Cloudsmith Inc.
 * The code, documentation and other materials contained herein have been
 * licensed under the Eclipse Public License - v 1.0 by the copyright holder
 * listed above, as the Initial Contributor under such license. The text of
 * such license is available at www.eclipse.org.
 ******************************************************************************/
package org.eclipse.b3.p2.maven;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.b3.p2.maven.pom.Build;
import org.eclipse.b3.p2.maven.pom.CiManagement;
import org.eclipse.b3.p2.maven.pom.ContributorsType;
import org.eclipse.b3.p2.maven.pom.DependenciesType;
import org.eclipse.b3.p2.maven.pom.DependencyManagement;
import org.eclipse.b3.p2.maven.pom.DevelopersType;
import org.eclipse.b3.p2.maven.pom.DistributionManagement;
import org.eclipse.b3.p2.maven.pom.IssueManagement;
import org.eclipse.b3.p2.maven.pom.LicensesType;
import org.eclipse.b3.p2.maven.pom.MailingListsType;
import org.eclipse.b3.p2.maven.pom.Model;
import org.eclipse.b3.p2.maven.pom.ModulesType;
import org.eclipse.b3.p2.maven.pom.Organization;
import org.eclipse.b3.p2.maven.pom.Parent;
import org.eclipse.b3.p2.maven.pom.PluginRepositoriesType;
import org.eclipse.b3.p2.maven.pom.Prerequisites;
import org.eclipse.b3.p2.maven.pom.ProfilesType;
import org.eclipse.b3.p2.maven.pom.PropertiesType;
import org.eclipse.b3.p2.maven.pom.Reporting;
import org.eclipse.b3.p2.maven.pom.ReportsType;
import org.eclipse.b3.p2.maven.pom.RepositoriesType;
import org.eclipse.b3.p2.maven.pom.Scm;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;

/**
 * @author Filip Hrbek (filip.hrbek@cloudsmith.com)
 * 
 */
abstract class ResolvedModelBase implements Model {
	public EList<Adapter> eAdapters() {
		throw new UnsupportedOperationException();
	}

	public TreeIterator<EObject> eAllContents() {
		throw new UnsupportedOperationException();
	}

	public EClass eClass() {
		throw new UnsupportedOperationException();
	}

	public EObject eContainer() {
		throw new UnsupportedOperationException();
	}

	public EStructuralFeature eContainingFeature() {
		throw new UnsupportedOperationException();
	}

	public EReference eContainmentFeature() {
		throw new UnsupportedOperationException();
	}

	public EList<EObject> eContents() {
		throw new UnsupportedOperationException();
	}

	public EList<EObject> eCrossReferences() {
		throw new UnsupportedOperationException();
	}

	public boolean eDeliver() {
		throw new UnsupportedOperationException();
	}

	public Object eGet(EStructuralFeature feature) {
		throw new UnsupportedOperationException();
	}

	public Object eGet(EStructuralFeature feature, boolean resolve) {
		throw new UnsupportedOperationException();
	}

	public Object eInvoke(EOperation arg0, EList<?> arg1) throws InvocationTargetException {
		throw new UnsupportedOperationException();
	}

	public boolean eIsProxy() {
		throw new UnsupportedOperationException();
	}

	public boolean eIsSet(EStructuralFeature feature) {
		throw new UnsupportedOperationException();
	}

	public void eNotify(Notification notification) {
		throw new UnsupportedOperationException();
	}

	public Resource eResource() {
		throw new UnsupportedOperationException();
	}

	public void eSet(EStructuralFeature feature, Object newValue) {
		throw new UnsupportedOperationException();
	}

	public void eSetDeliver(boolean deliver) {
		throw new UnsupportedOperationException();
	}

	public void eUnset(EStructuralFeature feature) {
		throw new UnsupportedOperationException();
	}

	public void setArtifactId(String value) {
		throw new UnsupportedOperationException();
	}

	public void setBuild(Build value) {
		throw new UnsupportedOperationException();
	}

	public void setCiManagement(CiManagement value) {
		throw new UnsupportedOperationException();
	}

	public void setContributors(ContributorsType value) {
		throw new UnsupportedOperationException();
	}

	public void setDependencies(DependenciesType value) {
		throw new UnsupportedOperationException();
	}

	public void setDependencyManagement(DependencyManagement value) {
		throw new UnsupportedOperationException();
	}

	public void setDescription(String value) {
		throw new UnsupportedOperationException();
	}

	public void setDevelopers(DevelopersType value) {
		throw new UnsupportedOperationException();
	}

	public void setDistributionManagement(DistributionManagement value) {
		throw new UnsupportedOperationException();
	}

	public void setGroupId(String value) {
		throw new UnsupportedOperationException();
	}

	public void setInceptionYear(String value) {
		throw new UnsupportedOperationException();
	}

	public void setIssueManagement(IssueManagement value) {
		throw new UnsupportedOperationException();
	}

	public void setLicenses(LicensesType value) {
		throw new UnsupportedOperationException();
	}

	public void setMailingLists(MailingListsType value) {
		throw new UnsupportedOperationException();
	}

	public void setModelVersion(String value) {
		throw new UnsupportedOperationException();
	}

	public void setModules(ModulesType value) {
		throw new UnsupportedOperationException();
	}

	public void setName(String value) {
		throw new UnsupportedOperationException();
	}

	public void setOrganization(Organization value) {
		throw new UnsupportedOperationException();
	}

	public void setPackaging(String value) {
		throw new UnsupportedOperationException();
	}

	public void setParent(Parent value) {
		throw new UnsupportedOperationException();
	}

	public void setPluginRepositories(PluginRepositoriesType value) {
		throw new UnsupportedOperationException();
	}

	public void setPrerequisites(Prerequisites value) {
		throw new UnsupportedOperationException();
	}

	public void setProfiles(ProfilesType value) {
		throw new UnsupportedOperationException();
	}

	public void setProperties(PropertiesType value) {
		throw new UnsupportedOperationException();
	}

	public void setReporting(Reporting value) {
		throw new UnsupportedOperationException();
	}

	public void setReports(ReportsType value) {
		throw new UnsupportedOperationException();
	}

	public void setRepositories(RepositoriesType value) {
		throw new UnsupportedOperationException();
	}

	public void setScm(Scm value) {
		throw new UnsupportedOperationException();
	}

	public void setUrl(String value) {
		throw new UnsupportedOperationException();
	}

	public void setVersion(String value) {
		throw new UnsupportedOperationException();
	}

	public void unsetPackaging() {
		throw new UnsupportedOperationException();
	}

}
