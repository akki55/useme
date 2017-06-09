/**
 */
package fr.tpt.useme.architecture.model.usemearch.impl;

import fr.labsticc.framework.settings.model.settings.Category;

import fr.tpt.useme.architecture.model.usemearch.ContextEntityType;
import fr.tpt.useme.architecture.model.usemearch.InteractionFeature;
import fr.tpt.useme.architecture.model.usemearch.UsemearchPackage;

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
 * An implementation of the model object '<em><b>Context Entity Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.tpt.useme.architecture.model.usemearch.impl.ContextEntityTypeImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link fr.tpt.useme.architecture.model.usemearch.impl.ContextEntityTypeImpl#getOwnedInteractionFeatures <em>Owned Interaction Features</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ContextEntityTypeImpl extends IdentifiedElementImpl implements ContextEntityType {
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
	protected ContextEntityTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UsemearchPackage.Literals.CONTEXT_ENTITY_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Category> getCategory() {
		if (category == null) {
			category = new EObjectResolvingEList<Category>(Category.class, this, UsemearchPackage.CONTEXT_ENTITY_TYPE__CATEGORY);
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
			ownedInteractionFeatures = new EObjectContainmentEList<InteractionFeature>(InteractionFeature.class, this, UsemearchPackage.CONTEXT_ENTITY_TYPE__OWNED_INTERACTION_FEATURES);
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
			case UsemearchPackage.CONTEXT_ENTITY_TYPE__OWNED_INTERACTION_FEATURES:
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
			case UsemearchPackage.CONTEXT_ENTITY_TYPE__CATEGORY:
				return getCategory();
			case UsemearchPackage.CONTEXT_ENTITY_TYPE__OWNED_INTERACTION_FEATURES:
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
			case UsemearchPackage.CONTEXT_ENTITY_TYPE__CATEGORY:
				getCategory().clear();
				getCategory().addAll((Collection<? extends Category>)newValue);
				return;
			case UsemearchPackage.CONTEXT_ENTITY_TYPE__OWNED_INTERACTION_FEATURES:
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
			case UsemearchPackage.CONTEXT_ENTITY_TYPE__CATEGORY:
				getCategory().clear();
				return;
			case UsemearchPackage.CONTEXT_ENTITY_TYPE__OWNED_INTERACTION_FEATURES:
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
			case UsemearchPackage.CONTEXT_ENTITY_TYPE__CATEGORY:
				return category != null && !category.isEmpty();
			case UsemearchPackage.CONTEXT_ENTITY_TYPE__OWNED_INTERACTION_FEATURES:
				return ownedInteractionFeatures != null && !ownedInteractionFeatures.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ContextEntityTypeImpl
