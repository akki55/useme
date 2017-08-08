/**
 */
package fr.tpt.mem4csd.dssl.model.dssl.impl;

import fr.tpt.mem4csd.dssl.model.dssl.DsslPackage;
import fr.tpt.mem4csd.dssl.model.dssl.EntityInstance;
import fr.tpt.mem4csd.dssl.model.dssl.EntityType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.tpt.mem4csd.dssl.model.dssl.impl.EntityInstanceImpl#getEntityType <em>Entity Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EntityInstanceImpl extends IdentifiedElementImpl implements EntityInstance {
	/**
	 * The cached value of the '{@link #getEntityType() <em>Entity Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntityType()
	 * @generated
	 * @ordered
	 */
	protected EntityType entityType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntityInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DsslPackage.Literals.ENTITY_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityType getEntityType() {
		if (entityType != null && entityType.eIsProxy()) {
			InternalEObject oldEntityType = (InternalEObject)entityType;
			entityType = (EntityType)eResolveProxy(oldEntityType);
			if (entityType != oldEntityType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DsslPackage.ENTITY_INSTANCE__ENTITY_TYPE, oldEntityType, entityType));
			}
		}
		return entityType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityType basicGetEntityType() {
		return entityType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntityType(EntityType newEntityType) {
		EntityType oldEntityType = entityType;
		entityType = newEntityType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DsslPackage.ENTITY_INSTANCE__ENTITY_TYPE, oldEntityType, entityType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DsslPackage.ENTITY_INSTANCE__ENTITY_TYPE:
				if (resolve) return getEntityType();
				return basicGetEntityType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DsslPackage.ENTITY_INSTANCE__ENTITY_TYPE:
				setEntityType((EntityType)newValue);
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
			case DsslPackage.ENTITY_INSTANCE__ENTITY_TYPE:
				setEntityType((EntityType)null);
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
			case DsslPackage.ENTITY_INSTANCE__ENTITY_TYPE:
				return entityType != null;
		}
		return super.eIsSet(featureID);
	}

} //EntityInstanceImpl
