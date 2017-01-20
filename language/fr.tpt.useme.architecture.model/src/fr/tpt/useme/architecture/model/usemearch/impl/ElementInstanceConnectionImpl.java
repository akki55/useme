/**
 */
package fr.tpt.useme.architecture.model.usemearch.impl;

import fr.tpt.useme.architecture.model.usemearch.ContextElementInstance;
import fr.tpt.useme.architecture.model.usemearch.ElementInstanceConnection;
import fr.tpt.useme.architecture.model.usemearch.UsemearchPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element Instance Connection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.tpt.useme.architecture.model.usemearch.impl.ElementInstanceConnectionImpl#getSourceFeature <em>Source Feature</em>}</li>
 *   <li>{@link fr.tpt.useme.architecture.model.usemearch.impl.ElementInstanceConnectionImpl#getDestinationFeature <em>Destination Feature</em>}</li>
 *   <li>{@link fr.tpt.useme.architecture.model.usemearch.impl.ElementInstanceConnectionImpl#getSourceElementInstance <em>Source Element Instance</em>}</li>
 *   <li>{@link fr.tpt.useme.architecture.model.usemearch.impl.ElementInstanceConnectionImpl#getDestinationElementInstance <em>Destination Element Instance</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ElementInstanceConnectionImpl extends IdentifiedElementImpl implements ElementInstanceConnection {
	/**
	 * The cached value of the '{@link #getSourceFeature() <em>Source Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceFeature()
	 * @generated
	 * @ordered
	 */
	protected EReference sourceFeature;

	/**
	 * The cached value of the '{@link #getDestinationFeature() <em>Destination Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestinationFeature()
	 * @generated
	 * @ordered
	 */
	protected EReference destinationFeature;

	/**
	 * The cached value of the '{@link #getSourceElementInstance() <em>Source Element Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceElementInstance()
	 * @generated
	 * @ordered
	 */
	protected ContextElementInstance sourceElementInstance;

	/**
	 * The cached value of the '{@link #getDestinationElementInstance() <em>Destination Element Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestinationElementInstance()
	 * @generated
	 * @ordered
	 */
	protected ContextElementInstance destinationElementInstance;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElementInstanceConnectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UsemearchPackage.Literals.ELEMENT_INSTANCE_CONNECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSourceFeature() {
		if (sourceFeature != null && sourceFeature.eIsProxy()) {
			InternalEObject oldSourceFeature = (InternalEObject)sourceFeature;
			sourceFeature = (EReference)eResolveProxy(oldSourceFeature);
			if (sourceFeature != oldSourceFeature) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UsemearchPackage.ELEMENT_INSTANCE_CONNECTION__SOURCE_FEATURE, oldSourceFeature, sourceFeature));
			}
		}
		return sourceFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference basicGetSourceFeature() {
		return sourceFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceFeature(EReference newSourceFeature) {
		EReference oldSourceFeature = sourceFeature;
		sourceFeature = newSourceFeature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UsemearchPackage.ELEMENT_INSTANCE_CONNECTION__SOURCE_FEATURE, oldSourceFeature, sourceFeature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDestinationFeature() {
		if (destinationFeature != null && destinationFeature.eIsProxy()) {
			InternalEObject oldDestinationFeature = (InternalEObject)destinationFeature;
			destinationFeature = (EReference)eResolveProxy(oldDestinationFeature);
			if (destinationFeature != oldDestinationFeature) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UsemearchPackage.ELEMENT_INSTANCE_CONNECTION__DESTINATION_FEATURE, oldDestinationFeature, destinationFeature));
			}
		}
		return destinationFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference basicGetDestinationFeature() {
		return destinationFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDestinationFeature(EReference newDestinationFeature) {
		EReference oldDestinationFeature = destinationFeature;
		destinationFeature = newDestinationFeature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UsemearchPackage.ELEMENT_INSTANCE_CONNECTION__DESTINATION_FEATURE, oldDestinationFeature, destinationFeature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContextElementInstance getSourceElementInstance() {
		if (sourceElementInstance != null && sourceElementInstance.eIsProxy()) {
			InternalEObject oldSourceElementInstance = (InternalEObject)sourceElementInstance;
			sourceElementInstance = (ContextElementInstance)eResolveProxy(oldSourceElementInstance);
			if (sourceElementInstance != oldSourceElementInstance) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UsemearchPackage.ELEMENT_INSTANCE_CONNECTION__SOURCE_ELEMENT_INSTANCE, oldSourceElementInstance, sourceElementInstance));
			}
		}
		return sourceElementInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContextElementInstance basicGetSourceElementInstance() {
		return sourceElementInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceElementInstance(ContextElementInstance newSourceElementInstance) {
		ContextElementInstance oldSourceElementInstance = sourceElementInstance;
		sourceElementInstance = newSourceElementInstance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UsemearchPackage.ELEMENT_INSTANCE_CONNECTION__SOURCE_ELEMENT_INSTANCE, oldSourceElementInstance, sourceElementInstance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContextElementInstance getDestinationElementInstance() {
		if (destinationElementInstance != null && destinationElementInstance.eIsProxy()) {
			InternalEObject oldDestinationElementInstance = (InternalEObject)destinationElementInstance;
			destinationElementInstance = (ContextElementInstance)eResolveProxy(oldDestinationElementInstance);
			if (destinationElementInstance != oldDestinationElementInstance) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UsemearchPackage.ELEMENT_INSTANCE_CONNECTION__DESTINATION_ELEMENT_INSTANCE, oldDestinationElementInstance, destinationElementInstance));
			}
		}
		return destinationElementInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContextElementInstance basicGetDestinationElementInstance() {
		return destinationElementInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDestinationElementInstance(ContextElementInstance newDestinationElementInstance) {
		ContextElementInstance oldDestinationElementInstance = destinationElementInstance;
		destinationElementInstance = newDestinationElementInstance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UsemearchPackage.ELEMENT_INSTANCE_CONNECTION__DESTINATION_ELEMENT_INSTANCE, oldDestinationElementInstance, destinationElementInstance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UsemearchPackage.ELEMENT_INSTANCE_CONNECTION__SOURCE_FEATURE:
				if (resolve) return getSourceFeature();
				return basicGetSourceFeature();
			case UsemearchPackage.ELEMENT_INSTANCE_CONNECTION__DESTINATION_FEATURE:
				if (resolve) return getDestinationFeature();
				return basicGetDestinationFeature();
			case UsemearchPackage.ELEMENT_INSTANCE_CONNECTION__SOURCE_ELEMENT_INSTANCE:
				if (resolve) return getSourceElementInstance();
				return basicGetSourceElementInstance();
			case UsemearchPackage.ELEMENT_INSTANCE_CONNECTION__DESTINATION_ELEMENT_INSTANCE:
				if (resolve) return getDestinationElementInstance();
				return basicGetDestinationElementInstance();
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
			case UsemearchPackage.ELEMENT_INSTANCE_CONNECTION__SOURCE_FEATURE:
				setSourceFeature((EReference)newValue);
				return;
			case UsemearchPackage.ELEMENT_INSTANCE_CONNECTION__DESTINATION_FEATURE:
				setDestinationFeature((EReference)newValue);
				return;
			case UsemearchPackage.ELEMENT_INSTANCE_CONNECTION__SOURCE_ELEMENT_INSTANCE:
				setSourceElementInstance((ContextElementInstance)newValue);
				return;
			case UsemearchPackage.ELEMENT_INSTANCE_CONNECTION__DESTINATION_ELEMENT_INSTANCE:
				setDestinationElementInstance((ContextElementInstance)newValue);
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
			case UsemearchPackage.ELEMENT_INSTANCE_CONNECTION__SOURCE_FEATURE:
				setSourceFeature((EReference)null);
				return;
			case UsemearchPackage.ELEMENT_INSTANCE_CONNECTION__DESTINATION_FEATURE:
				setDestinationFeature((EReference)null);
				return;
			case UsemearchPackage.ELEMENT_INSTANCE_CONNECTION__SOURCE_ELEMENT_INSTANCE:
				setSourceElementInstance((ContextElementInstance)null);
				return;
			case UsemearchPackage.ELEMENT_INSTANCE_CONNECTION__DESTINATION_ELEMENT_INSTANCE:
				setDestinationElementInstance((ContextElementInstance)null);
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
			case UsemearchPackage.ELEMENT_INSTANCE_CONNECTION__SOURCE_FEATURE:
				return sourceFeature != null;
			case UsemearchPackage.ELEMENT_INSTANCE_CONNECTION__DESTINATION_FEATURE:
				return destinationFeature != null;
			case UsemearchPackage.ELEMENT_INSTANCE_CONNECTION__SOURCE_ELEMENT_INSTANCE:
				return sourceElementInstance != null;
			case UsemearchPackage.ELEMENT_INSTANCE_CONNECTION__DESTINATION_ELEMENT_INSTANCE:
				return destinationElementInstance != null;
		}
		return super.eIsSet(featureID);
	}

} //ElementInstanceConnectionImpl
