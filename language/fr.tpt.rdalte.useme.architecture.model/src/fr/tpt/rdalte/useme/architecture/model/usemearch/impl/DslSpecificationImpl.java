/**
 */
package fr.tpt.rdalte.useme.architecture.model.usemearch.impl;

import fr.tpt.rdalte.useme.architecture.model.usemearch.Dsl;
import fr.tpt.rdalte.useme.architecture.model.usemearch.DslSpecification;
import fr.tpt.rdalte.useme.architecture.model.usemearch.UsemearchPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dsl Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.tpt.rdalte.useme.architecture.model.usemearch.impl.DslSpecificationImpl#getOwnedDsls <em>Owned Dsls</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DslSpecificationImpl extends IdentifiedElementImpl implements DslSpecification {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DslSpecificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UsemearchPackage.Literals.DSL_SPECIFICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Dsl> getOwnedDsls() {
		if (ownedDsls == null) {
			ownedDsls = new EObjectContainmentEList<Dsl>(Dsl.class, this, UsemearchPackage.DSL_SPECIFICATION__OWNED_DSLS);
		}
		return ownedDsls;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UsemearchPackage.DSL_SPECIFICATION__OWNED_DSLS:
				return ((InternalEList<?>)getOwnedDsls()).basicRemove(otherEnd, msgs);
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
			case UsemearchPackage.DSL_SPECIFICATION__OWNED_DSLS:
				return getOwnedDsls();
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
			case UsemearchPackage.DSL_SPECIFICATION__OWNED_DSLS:
				getOwnedDsls().clear();
				getOwnedDsls().addAll((Collection<? extends Dsl>)newValue);
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
			case UsemearchPackage.DSL_SPECIFICATION__OWNED_DSLS:
				getOwnedDsls().clear();
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
			case UsemearchPackage.DSL_SPECIFICATION__OWNED_DSLS:
				return ownedDsls != null && !ownedDsls.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DslSpecificationImpl
