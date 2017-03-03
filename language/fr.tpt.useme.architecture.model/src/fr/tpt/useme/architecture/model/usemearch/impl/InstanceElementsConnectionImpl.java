/**
 */
package fr.tpt.useme.architecture.model.usemearch.impl;

import fr.tpt.useme.architecture.model.usemearch.ContextInstanceElement;
import fr.tpt.useme.architecture.model.usemearch.InstanceElementsConnection;
import fr.tpt.useme.architecture.model.usemearch.UsemearchPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Instance Elements Connection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.tpt.useme.architecture.model.usemearch.impl.InstanceElementsConnectionImpl#getSourceFeature <em>Source Feature</em>}</li>
 *   <li>{@link fr.tpt.useme.architecture.model.usemearch.impl.InstanceElementsConnectionImpl#getDestinationFeature <em>Destination Feature</em>}</li>
 *   <li>{@link fr.tpt.useme.architecture.model.usemearch.impl.InstanceElementsConnectionImpl#getSourceInstanceElement <em>Source Instance Element</em>}</li>
 *   <li>{@link fr.tpt.useme.architecture.model.usemearch.impl.InstanceElementsConnectionImpl#getDestinationInstanceElement <em>Destination Instance Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InstanceElementsConnectionImpl extends IdentifiedElementImpl implements InstanceElementsConnection {
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
	 * The cached value of the '{@link #getSourceInstanceElement() <em>Source Instance Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceInstanceElement()
	 * @generated
	 * @ordered
	 */
	protected ContextInstanceElement sourceInstanceElement;

	/**
	 * The cached value of the '{@link #getDestinationInstanceElement() <em>Destination Instance Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestinationInstanceElement()
	 * @generated
	 * @ordered
	 */
	protected ContextInstanceElement destinationInstanceElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InstanceElementsConnectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UsemearchPackage.Literals.INSTANCE_ELEMENTS_CONNECTION;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UsemearchPackage.INSTANCE_ELEMENTS_CONNECTION__SOURCE_FEATURE, oldSourceFeature, sourceFeature));
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
			eNotify(new ENotificationImpl(this, Notification.SET, UsemearchPackage.INSTANCE_ELEMENTS_CONNECTION__SOURCE_FEATURE, oldSourceFeature, sourceFeature));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UsemearchPackage.INSTANCE_ELEMENTS_CONNECTION__DESTINATION_FEATURE, oldDestinationFeature, destinationFeature));
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
			eNotify(new ENotificationImpl(this, Notification.SET, UsemearchPackage.INSTANCE_ELEMENTS_CONNECTION__DESTINATION_FEATURE, oldDestinationFeature, destinationFeature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContextInstanceElement getSourceInstanceElement() {
		if (sourceInstanceElement != null && sourceInstanceElement.eIsProxy()) {
			InternalEObject oldSourceInstanceElement = (InternalEObject)sourceInstanceElement;
			sourceInstanceElement = (ContextInstanceElement)eResolveProxy(oldSourceInstanceElement);
			if (sourceInstanceElement != oldSourceInstanceElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UsemearchPackage.INSTANCE_ELEMENTS_CONNECTION__SOURCE_INSTANCE_ELEMENT, oldSourceInstanceElement, sourceInstanceElement));
			}
		}
		return sourceInstanceElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContextInstanceElement basicGetSourceInstanceElement() {
		return sourceInstanceElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceInstanceElement(ContextInstanceElement newSourceInstanceElement) {
		ContextInstanceElement oldSourceInstanceElement = sourceInstanceElement;
		sourceInstanceElement = newSourceInstanceElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UsemearchPackage.INSTANCE_ELEMENTS_CONNECTION__SOURCE_INSTANCE_ELEMENT, oldSourceInstanceElement, sourceInstanceElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContextInstanceElement getDestinationInstanceElement() {
		if (destinationInstanceElement != null && destinationInstanceElement.eIsProxy()) {
			InternalEObject oldDestinationInstanceElement = (InternalEObject)destinationInstanceElement;
			destinationInstanceElement = (ContextInstanceElement)eResolveProxy(oldDestinationInstanceElement);
			if (destinationInstanceElement != oldDestinationInstanceElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UsemearchPackage.INSTANCE_ELEMENTS_CONNECTION__DESTINATION_INSTANCE_ELEMENT, oldDestinationInstanceElement, destinationInstanceElement));
			}
		}
		return destinationInstanceElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContextInstanceElement basicGetDestinationInstanceElement() {
		return destinationInstanceElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDestinationInstanceElement(ContextInstanceElement newDestinationInstanceElement) {
		ContextInstanceElement oldDestinationInstanceElement = destinationInstanceElement;
		destinationInstanceElement = newDestinationInstanceElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UsemearchPackage.INSTANCE_ELEMENTS_CONNECTION__DESTINATION_INSTANCE_ELEMENT, oldDestinationInstanceElement, destinationInstanceElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UsemearchPackage.INSTANCE_ELEMENTS_CONNECTION__SOURCE_FEATURE:
				if (resolve) return getSourceFeature();
				return basicGetSourceFeature();
			case UsemearchPackage.INSTANCE_ELEMENTS_CONNECTION__DESTINATION_FEATURE:
				if (resolve) return getDestinationFeature();
				return basicGetDestinationFeature();
			case UsemearchPackage.INSTANCE_ELEMENTS_CONNECTION__SOURCE_INSTANCE_ELEMENT:
				if (resolve) return getSourceInstanceElement();
				return basicGetSourceInstanceElement();
			case UsemearchPackage.INSTANCE_ELEMENTS_CONNECTION__DESTINATION_INSTANCE_ELEMENT:
				if (resolve) return getDestinationInstanceElement();
				return basicGetDestinationInstanceElement();
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
			case UsemearchPackage.INSTANCE_ELEMENTS_CONNECTION__SOURCE_FEATURE:
				setSourceFeature((EReference)newValue);
				return;
			case UsemearchPackage.INSTANCE_ELEMENTS_CONNECTION__DESTINATION_FEATURE:
				setDestinationFeature((EReference)newValue);
				return;
			case UsemearchPackage.INSTANCE_ELEMENTS_CONNECTION__SOURCE_INSTANCE_ELEMENT:
				setSourceInstanceElement((ContextInstanceElement)newValue);
				return;
			case UsemearchPackage.INSTANCE_ELEMENTS_CONNECTION__DESTINATION_INSTANCE_ELEMENT:
				setDestinationInstanceElement((ContextInstanceElement)newValue);
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
			case UsemearchPackage.INSTANCE_ELEMENTS_CONNECTION__SOURCE_FEATURE:
				setSourceFeature((EReference)null);
				return;
			case UsemearchPackage.INSTANCE_ELEMENTS_CONNECTION__DESTINATION_FEATURE:
				setDestinationFeature((EReference)null);
				return;
			case UsemearchPackage.INSTANCE_ELEMENTS_CONNECTION__SOURCE_INSTANCE_ELEMENT:
				setSourceInstanceElement((ContextInstanceElement)null);
				return;
			case UsemearchPackage.INSTANCE_ELEMENTS_CONNECTION__DESTINATION_INSTANCE_ELEMENT:
				setDestinationInstanceElement((ContextInstanceElement)null);
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
			case UsemearchPackage.INSTANCE_ELEMENTS_CONNECTION__SOURCE_FEATURE:
				return sourceFeature != null;
			case UsemearchPackage.INSTANCE_ELEMENTS_CONNECTION__DESTINATION_FEATURE:
				return destinationFeature != null;
			case UsemearchPackage.INSTANCE_ELEMENTS_CONNECTION__SOURCE_INSTANCE_ELEMENT:
				return sourceInstanceElement != null;
			case UsemearchPackage.INSTANCE_ELEMENTS_CONNECTION__DESTINATION_INSTANCE_ELEMENT:
				return destinationInstanceElement != null;
		}
		return super.eIsSet(featureID);
	}

} //InstanceElementsConnectionImpl
