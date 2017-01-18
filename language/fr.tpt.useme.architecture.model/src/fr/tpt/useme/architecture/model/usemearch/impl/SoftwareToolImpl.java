/**
 */
package fr.tpt.useme.architecture.model.usemearch.impl;

import fr.tpt.useme.architecture.model.usemearch.Dsl;
import fr.tpt.useme.architecture.model.usemearch.SoftwareTool;
import fr.tpt.useme.architecture.model.usemearch.UsemearchPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Software Tool</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.tpt.useme.architecture.model.usemearch.impl.SoftwareToolImpl#getSupportedLanguages <em>Supported Languages</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SoftwareToolImpl extends ToolImpl implements SoftwareTool {
	/**
	 * The cached value of the '{@link #getSupportedLanguages() <em>Supported Languages</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedLanguages()
	 * @generated
	 * @ordered
	 */
	protected EList<Dsl> supportedLanguages;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SoftwareToolImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UsemearchPackage.Literals.SOFTWARE_TOOL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Dsl> getSupportedLanguages() {
		if (supportedLanguages == null) {
			supportedLanguages = new EObjectWithInverseResolvingEList.ManyInverse<Dsl>(Dsl.class, this, UsemearchPackage.SOFTWARE_TOOL__SUPPORTED_LANGUAGES, UsemearchPackage.DSL__SUPPORTING_TOOLS);
		}
		return supportedLanguages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UsemearchPackage.SOFTWARE_TOOL__SUPPORTED_LANGUAGES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSupportedLanguages()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UsemearchPackage.SOFTWARE_TOOL__SUPPORTED_LANGUAGES:
				return ((InternalEList<?>)getSupportedLanguages()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UsemearchPackage.SOFTWARE_TOOL__SUPPORTED_LANGUAGES:
				return getSupportedLanguages();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case UsemearchPackage.SOFTWARE_TOOL__SUPPORTED_LANGUAGES:
				getSupportedLanguages().clear();
				getSupportedLanguages().addAll((Collection<? extends Dsl>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case UsemearchPackage.SOFTWARE_TOOL__SUPPORTED_LANGUAGES:
				getSupportedLanguages().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case UsemearchPackage.SOFTWARE_TOOL__SUPPORTED_LANGUAGES:
				return supportedLanguages != null && !supportedLanguages.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SoftwareToolImpl
