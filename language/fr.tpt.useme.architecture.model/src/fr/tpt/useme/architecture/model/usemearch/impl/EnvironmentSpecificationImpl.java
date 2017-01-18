/**
 */
package fr.tpt.useme.architecture.model.usemearch.impl;

import fr.tpt.useme.architecture.model.usemearch.Dsl;
import fr.tpt.useme.architecture.model.usemearch.EnvironmentSpecification;
import fr.tpt.useme.architecture.model.usemearch.UsemearchPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Environment Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.tpt.useme.architecture.model.usemearch.impl.EnvironmentSpecificationImpl#getOwnedDsls <em>Owned Dsls</em>}</li>
 *   <li>{@link fr.tpt.useme.architecture.model.usemearch.impl.EnvironmentSpecificationImpl#getOwnedTools <em>Owned Tools</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EnvironmentSpecificationImpl extends IdentifiedElementImpl implements EnvironmentSpecification {
	/**
	 * The cached value of the '{@link #getOwnedDsls() <em>Owned Dsls</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedDsls()
	 * @generated
	 * @ordered
	 */
	protected EList<Dsl> ownedDsls;

	/**
	 * The cached value of the '{@link #getOwnedTools() <em>Owned Tools</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedTools()
	 * @generated
	 * @ordered
	 */
	protected EList<Dsl> ownedTools;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnvironmentSpecificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UsemearchPackage.Literals.ENVIRONMENT_SPECIFICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Dsl> getOwnedDsls() {
		if (ownedDsls == null) {
			ownedDsls = new EObjectContainmentEList<Dsl>(Dsl.class, this, UsemearchPackage.ENVIRONMENT_SPECIFICATION__OWNED_DSLS);
		}
		return ownedDsls;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Dsl> getOwnedTools() {
		if (ownedTools == null) {
			ownedTools = new EObjectContainmentEList<Dsl>(Dsl.class, this, UsemearchPackage.ENVIRONMENT_SPECIFICATION__OWNED_TOOLS);
		}
		return ownedTools;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UsemearchPackage.ENVIRONMENT_SPECIFICATION__OWNED_DSLS:
				return ((InternalEList<?>)getOwnedDsls()).basicRemove(otherEnd, msgs);
			case UsemearchPackage.ENVIRONMENT_SPECIFICATION__OWNED_TOOLS:
				return ((InternalEList<?>)getOwnedTools()).basicRemove(otherEnd, msgs);
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
			case UsemearchPackage.ENVIRONMENT_SPECIFICATION__OWNED_DSLS:
				return getOwnedDsls();
			case UsemearchPackage.ENVIRONMENT_SPECIFICATION__OWNED_TOOLS:
				return getOwnedTools();
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
			case UsemearchPackage.ENVIRONMENT_SPECIFICATION__OWNED_DSLS:
				getOwnedDsls().clear();
				getOwnedDsls().addAll((Collection<? extends Dsl>)newValue);
				return;
			case UsemearchPackage.ENVIRONMENT_SPECIFICATION__OWNED_TOOLS:
				getOwnedTools().clear();
				getOwnedTools().addAll((Collection<? extends Dsl>)newValue);
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
			case UsemearchPackage.ENVIRONMENT_SPECIFICATION__OWNED_DSLS:
				getOwnedDsls().clear();
				return;
			case UsemearchPackage.ENVIRONMENT_SPECIFICATION__OWNED_TOOLS:
				getOwnedTools().clear();
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
			case UsemearchPackage.ENVIRONMENT_SPECIFICATION__OWNED_DSLS:
				return ownedDsls != null && !ownedDsls.isEmpty();
			case UsemearchPackage.ENVIRONMENT_SPECIFICATION__OWNED_TOOLS:
				return ownedTools != null && !ownedTools.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EnvironmentSpecificationImpl
