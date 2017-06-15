/**
 */
package fr.tpt.useme.architecture.model.usemearch.impl;

import fr.tpt.useme.architecture.model.usemearch.ContextSpecification;
import fr.tpt.useme.architecture.model.usemearch.Dsl;
import fr.tpt.useme.architecture.model.usemearch.DsslSpecification;
import fr.tpt.useme.architecture.model.usemearch.EntityType;
import fr.tpt.useme.architecture.model.usemearch.UsemearchPackage;

import java.util.Collection;

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
 * An implementation of the model object '<em><b>Dssl Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.tpt.useme.architecture.model.usemearch.impl.DsslSpecificationImpl#getDevelopedDsl <em>Developed Dsl</em>}</li>
 *   <li>{@link fr.tpt.useme.architecture.model.usemearch.impl.DsslSpecificationImpl#getOwnedContexts <em>Owned Contexts</em>}</li>
 *   <li>{@link fr.tpt.useme.architecture.model.usemearch.impl.DsslSpecificationImpl#getOwnedEntityTypes <em>Owned Entity Types</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DsslSpecificationImpl extends IdentifiedElementImpl implements DsslSpecification {
	/**
	 * The cached value of the '{@link #getDevelopedDsl() <em>Developed Dsl</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDevelopedDsl()
	 * @generated
	 * @ordered
	 */
	protected Dsl developedDsl;

	/**
	 * The cached value of the '{@link #getOwnedContexts() <em>Owned Contexts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedContexts()
	 * @generated
	 * @ordered
	 */
	protected EList<ContextSpecification> ownedContexts;

	/**
	 * The cached value of the '{@link #getOwnedEntityTypes() <em>Owned Entity Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedEntityTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<EntityType> ownedEntityTypes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DsslSpecificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UsemearchPackage.Literals.DSSL_SPECIFICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dsl getDevelopedDsl() {
		if (developedDsl != null && developedDsl.eIsProxy()) {
			InternalEObject oldDevelopedDsl = (InternalEObject)developedDsl;
			developedDsl = (Dsl)eResolveProxy(oldDevelopedDsl);
			if (developedDsl != oldDevelopedDsl) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UsemearchPackage.DSSL_SPECIFICATION__DEVELOPED_DSL, oldDevelopedDsl, developedDsl));
			}
		}
		return developedDsl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dsl basicGetDevelopedDsl() {
		return developedDsl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDevelopedDsl(Dsl newDevelopedDsl) {
		Dsl oldDevelopedDsl = developedDsl;
		developedDsl = newDevelopedDsl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UsemearchPackage.DSSL_SPECIFICATION__DEVELOPED_DSL, oldDevelopedDsl, developedDsl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContextSpecification> getOwnedContexts() {
		if (ownedContexts == null) {
			ownedContexts = new EObjectContainmentEList<ContextSpecification>(ContextSpecification.class, this, UsemearchPackage.DSSL_SPECIFICATION__OWNED_CONTEXTS);
		}
		return ownedContexts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EntityType> getOwnedEntityTypes() {
		if (ownedEntityTypes == null) {
			ownedEntityTypes = new EObjectContainmentEList<EntityType>(EntityType.class, this, UsemearchPackage.DSSL_SPECIFICATION__OWNED_ENTITY_TYPES);
		}
		return ownedEntityTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UsemearchPackage.DSSL_SPECIFICATION__OWNED_CONTEXTS:
				return ((InternalEList<?>)getOwnedContexts()).basicRemove(otherEnd, msgs);
			case UsemearchPackage.DSSL_SPECIFICATION__OWNED_ENTITY_TYPES:
				return ((InternalEList<?>)getOwnedEntityTypes()).basicRemove(otherEnd, msgs);
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
			case UsemearchPackage.DSSL_SPECIFICATION__DEVELOPED_DSL:
				if (resolve) return getDevelopedDsl();
				return basicGetDevelopedDsl();
			case UsemearchPackage.DSSL_SPECIFICATION__OWNED_CONTEXTS:
				return getOwnedContexts();
			case UsemearchPackage.DSSL_SPECIFICATION__OWNED_ENTITY_TYPES:
				return getOwnedEntityTypes();
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
			case UsemearchPackage.DSSL_SPECIFICATION__DEVELOPED_DSL:
				setDevelopedDsl((Dsl)newValue);
				return;
			case UsemearchPackage.DSSL_SPECIFICATION__OWNED_CONTEXTS:
				getOwnedContexts().clear();
				getOwnedContexts().addAll((Collection<? extends ContextSpecification>)newValue);
				return;
			case UsemearchPackage.DSSL_SPECIFICATION__OWNED_ENTITY_TYPES:
				getOwnedEntityTypes().clear();
				getOwnedEntityTypes().addAll((Collection<? extends EntityType>)newValue);
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
			case UsemearchPackage.DSSL_SPECIFICATION__DEVELOPED_DSL:
				setDevelopedDsl((Dsl)null);
				return;
			case UsemearchPackage.DSSL_SPECIFICATION__OWNED_CONTEXTS:
				getOwnedContexts().clear();
				return;
			case UsemearchPackage.DSSL_SPECIFICATION__OWNED_ENTITY_TYPES:
				getOwnedEntityTypes().clear();
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
			case UsemearchPackage.DSSL_SPECIFICATION__DEVELOPED_DSL:
				return developedDsl != null;
			case UsemearchPackage.DSSL_SPECIFICATION__OWNED_CONTEXTS:
				return ownedContexts != null && !ownedContexts.isEmpty();
			case UsemearchPackage.DSSL_SPECIFICATION__OWNED_ENTITY_TYPES:
				return ownedEntityTypes != null && !ownedEntityTypes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DsslSpecificationImpl
