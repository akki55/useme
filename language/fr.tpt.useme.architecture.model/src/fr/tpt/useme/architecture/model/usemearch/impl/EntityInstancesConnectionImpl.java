/**
 */
package fr.tpt.useme.architecture.model.usemearch.impl;

import fr.tpt.useme.architecture.model.usemearch.EntityInstance;
import fr.tpt.useme.architecture.model.usemearch.EntityInstancesConnection;
import fr.tpt.useme.architecture.model.usemearch.InteractionFeature;
import fr.tpt.useme.architecture.model.usemearch.UsemearchPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity Instances Connection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.tpt.useme.architecture.model.usemearch.impl.EntityInstancesConnectionImpl#getSourceFeature <em>Source Feature</em>}</li>
 *   <li>{@link fr.tpt.useme.architecture.model.usemearch.impl.EntityInstancesConnectionImpl#getDestinationFeature <em>Destination Feature</em>}</li>
 *   <li>{@link fr.tpt.useme.architecture.model.usemearch.impl.EntityInstancesConnectionImpl#getSourceEntityInstance <em>Source Entity Instance</em>}</li>
 *   <li>{@link fr.tpt.useme.architecture.model.usemearch.impl.EntityInstancesConnectionImpl#getDestinationEntityInstance <em>Destination Entity Instance</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EntityInstancesConnectionImpl extends IdentifiedElementImpl implements EntityInstancesConnection {
	/**
	 * The cached value of the '{@link #getSourceFeature() <em>Source Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceFeature()
	 * @generated
	 * @ordered
	 */
	protected InteractionFeature sourceFeature;

	/**
	 * The cached value of the '{@link #getDestinationFeature() <em>Destination Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestinationFeature()
	 * @generated
	 * @ordered
	 */
	protected InteractionFeature destinationFeature;

	/**
	 * The cached value of the '{@link #getSourceEntityInstance() <em>Source Entity Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceEntityInstance()
	 * @generated
	 * @ordered
	 */
	protected EntityInstance sourceEntityInstance;

	/**
	 * The cached value of the '{@link #getDestinationEntityInstance() <em>Destination Entity Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestinationEntityInstance()
	 * @generated
	 * @ordered
	 */
	protected EntityInstance destinationEntityInstance;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntityInstancesConnectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UsemearchPackage.Literals.ENTITY_INSTANCES_CONNECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionFeature getSourceFeature() {
		if (sourceFeature != null && sourceFeature.eIsProxy()) {
			InternalEObject oldSourceFeature = (InternalEObject)sourceFeature;
			sourceFeature = (InteractionFeature)eResolveProxy(oldSourceFeature);
			if (sourceFeature != oldSourceFeature) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UsemearchPackage.ENTITY_INSTANCES_CONNECTION__SOURCE_FEATURE, oldSourceFeature, sourceFeature));
			}
		}
		return sourceFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionFeature basicGetSourceFeature() {
		return sourceFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceFeature(InteractionFeature newSourceFeature) {
		InteractionFeature oldSourceFeature = sourceFeature;
		sourceFeature = newSourceFeature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UsemearchPackage.ENTITY_INSTANCES_CONNECTION__SOURCE_FEATURE, oldSourceFeature, sourceFeature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionFeature getDestinationFeature() {
		if (destinationFeature != null && destinationFeature.eIsProxy()) {
			InternalEObject oldDestinationFeature = (InternalEObject)destinationFeature;
			destinationFeature = (InteractionFeature)eResolveProxy(oldDestinationFeature);
			if (destinationFeature != oldDestinationFeature) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UsemearchPackage.ENTITY_INSTANCES_CONNECTION__DESTINATION_FEATURE, oldDestinationFeature, destinationFeature));
			}
		}
		return destinationFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionFeature basicGetDestinationFeature() {
		return destinationFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDestinationFeature(InteractionFeature newDestinationFeature) {
		InteractionFeature oldDestinationFeature = destinationFeature;
		destinationFeature = newDestinationFeature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UsemearchPackage.ENTITY_INSTANCES_CONNECTION__DESTINATION_FEATURE, oldDestinationFeature, destinationFeature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityInstance getSourceEntityInstance() {
		if (sourceEntityInstance != null && sourceEntityInstance.eIsProxy()) {
			InternalEObject oldSourceEntityInstance = (InternalEObject)sourceEntityInstance;
			sourceEntityInstance = (EntityInstance)eResolveProxy(oldSourceEntityInstance);
			if (sourceEntityInstance != oldSourceEntityInstance) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UsemearchPackage.ENTITY_INSTANCES_CONNECTION__SOURCE_ENTITY_INSTANCE, oldSourceEntityInstance, sourceEntityInstance));
			}
		}
		return sourceEntityInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityInstance basicGetSourceEntityInstance() {
		return sourceEntityInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceEntityInstance(EntityInstance newSourceEntityInstance) {
		EntityInstance oldSourceEntityInstance = sourceEntityInstance;
		sourceEntityInstance = newSourceEntityInstance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UsemearchPackage.ENTITY_INSTANCES_CONNECTION__SOURCE_ENTITY_INSTANCE, oldSourceEntityInstance, sourceEntityInstance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityInstance getDestinationEntityInstance() {
		if (destinationEntityInstance != null && destinationEntityInstance.eIsProxy()) {
			InternalEObject oldDestinationEntityInstance = (InternalEObject)destinationEntityInstance;
			destinationEntityInstance = (EntityInstance)eResolveProxy(oldDestinationEntityInstance);
			if (destinationEntityInstance != oldDestinationEntityInstance) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UsemearchPackage.ENTITY_INSTANCES_CONNECTION__DESTINATION_ENTITY_INSTANCE, oldDestinationEntityInstance, destinationEntityInstance));
			}
		}
		return destinationEntityInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityInstance basicGetDestinationEntityInstance() {
		return destinationEntityInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDestinationEntityInstance(EntityInstance newDestinationEntityInstance) {
		EntityInstance oldDestinationEntityInstance = destinationEntityInstance;
		destinationEntityInstance = newDestinationEntityInstance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UsemearchPackage.ENTITY_INSTANCES_CONNECTION__DESTINATION_ENTITY_INSTANCE, oldDestinationEntityInstance, destinationEntityInstance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UsemearchPackage.ENTITY_INSTANCES_CONNECTION__SOURCE_FEATURE:
				if (resolve) return getSourceFeature();
				return basicGetSourceFeature();
			case UsemearchPackage.ENTITY_INSTANCES_CONNECTION__DESTINATION_FEATURE:
				if (resolve) return getDestinationFeature();
				return basicGetDestinationFeature();
			case UsemearchPackage.ENTITY_INSTANCES_CONNECTION__SOURCE_ENTITY_INSTANCE:
				if (resolve) return getSourceEntityInstance();
				return basicGetSourceEntityInstance();
			case UsemearchPackage.ENTITY_INSTANCES_CONNECTION__DESTINATION_ENTITY_INSTANCE:
				if (resolve) return getDestinationEntityInstance();
				return basicGetDestinationEntityInstance();
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
			case UsemearchPackage.ENTITY_INSTANCES_CONNECTION__SOURCE_FEATURE:
				setSourceFeature((InteractionFeature)newValue);
				return;
			case UsemearchPackage.ENTITY_INSTANCES_CONNECTION__DESTINATION_FEATURE:
				setDestinationFeature((InteractionFeature)newValue);
				return;
			case UsemearchPackage.ENTITY_INSTANCES_CONNECTION__SOURCE_ENTITY_INSTANCE:
				setSourceEntityInstance((EntityInstance)newValue);
				return;
			case UsemearchPackage.ENTITY_INSTANCES_CONNECTION__DESTINATION_ENTITY_INSTANCE:
				setDestinationEntityInstance((EntityInstance)newValue);
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
			case UsemearchPackage.ENTITY_INSTANCES_CONNECTION__SOURCE_FEATURE:
				setSourceFeature((InteractionFeature)null);
				return;
			case UsemearchPackage.ENTITY_INSTANCES_CONNECTION__DESTINATION_FEATURE:
				setDestinationFeature((InteractionFeature)null);
				return;
			case UsemearchPackage.ENTITY_INSTANCES_CONNECTION__SOURCE_ENTITY_INSTANCE:
				setSourceEntityInstance((EntityInstance)null);
				return;
			case UsemearchPackage.ENTITY_INSTANCES_CONNECTION__DESTINATION_ENTITY_INSTANCE:
				setDestinationEntityInstance((EntityInstance)null);
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
			case UsemearchPackage.ENTITY_INSTANCES_CONNECTION__SOURCE_FEATURE:
				return sourceFeature != null;
			case UsemearchPackage.ENTITY_INSTANCES_CONNECTION__DESTINATION_FEATURE:
				return destinationFeature != null;
			case UsemearchPackage.ENTITY_INSTANCES_CONNECTION__SOURCE_ENTITY_INSTANCE:
				return sourceEntityInstance != null;
			case UsemearchPackage.ENTITY_INSTANCES_CONNECTION__DESTINATION_ENTITY_INSTANCE:
				return destinationEntityInstance != null;
		}
		return super.eIsSet(featureID);
	}

} //EntityInstancesConnectionImpl
