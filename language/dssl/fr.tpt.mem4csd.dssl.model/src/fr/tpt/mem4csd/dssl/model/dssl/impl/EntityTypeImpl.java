/**
 */
package fr.tpt.mem4csd.dssl.model.dssl.impl;

import fr.labsticc.framework.settings.model.settings.Category;

import fr.tpt.mem4csd.dssl.model.dssl.DsslPackage;
import fr.tpt.mem4csd.dssl.model.dssl.EntityType;
import fr.tpt.mem4csd.dssl.model.dssl.InteractionFeature;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.tpt.mem4csd.dssl.model.dssl.impl.EntityTypeImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link fr.tpt.mem4csd.dssl.model.dssl.impl.EntityTypeImpl#getOwnedInteractionFeatures <em>Owned Interaction Features</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class EntityTypeImpl extends IdentifiedElementImpl implements EntityType {
	/**
	 * The cached value of the '{@link #getCategory() <em>Category</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected EList<Category> category;

	/**
	 * The cached value of the '{@link #getOwnedInteractionFeatures() <em>Owned Interaction Features</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedInteractionFeatures()
	 * @generated
	 * @ordered
	 */
	protected EList<InteractionFeature> ownedInteractionFeatures;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntityTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DsslPackage.Literals.ENTITY_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Category> getCategory() {
		if (category == null) {
			category = new EObjectResolvingEList<Category>(Category.class, this, DsslPackage.ENTITY_TYPE__CATEGORY);
		}
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InteractionFeature> getOwnedInteractionFeatures() {
		if (ownedInteractionFeatures == null) {
			ownedInteractionFeatures = new EObjectContainmentEList<InteractionFeature>(InteractionFeature.class, this, DsslPackage.ENTITY_TYPE__OWNED_INTERACTION_FEATURES);
		}
		return ownedInteractionFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DsslPackage.ENTITY_TYPE__OWNED_INTERACTION_FEATURES:
				return ((InternalEList<?>)getOwnedInteractionFeatures()).basicRemove(otherEnd, msgs);
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
			case DsslPackage.ENTITY_TYPE__CATEGORY:
				return getCategory();
			case DsslPackage.ENTITY_TYPE__OWNED_INTERACTION_FEATURES:
				return getOwnedInteractionFeatures();
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
			case DsslPackage.ENTITY_TYPE__CATEGORY:
				getCategory().clear();
				getCategory().addAll((Collection<? extends Category>)newValue);
				return;
			case DsslPackage.ENTITY_TYPE__OWNED_INTERACTION_FEATURES:
				getOwnedInteractionFeatures().clear();
				getOwnedInteractionFeatures().addAll((Collection<? extends InteractionFeature>)newValue);
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
			case DsslPackage.ENTITY_TYPE__CATEGORY:
				getCategory().clear();
				return;
			case DsslPackage.ENTITY_TYPE__OWNED_INTERACTION_FEATURES:
				getOwnedInteractionFeatures().clear();
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
			case DsslPackage.ENTITY_TYPE__CATEGORY:
				return category != null && !category.isEmpty();
			case DsslPackage.ENTITY_TYPE__OWNED_INTERACTION_FEATURES:
				return ownedInteractionFeatures != null && !ownedInteractionFeatures.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EntityTypeImpl
