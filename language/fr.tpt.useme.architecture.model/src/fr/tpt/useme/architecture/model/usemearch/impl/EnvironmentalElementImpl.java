/**
 */
package fr.tpt.useme.architecture.model.usemearch.impl;

import fr.tpt.useme.architecture.model.usemearch.EnvironmentType;
import fr.tpt.useme.architecture.model.usemearch.EnvironmentalElement;
import fr.tpt.useme.architecture.model.usemearch.UsemearchPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Environmental Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.tpt.useme.architecture.model.usemearch.impl.EnvironmentalElementImpl#getEnvitonmentType <em>Envitonment Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class EnvironmentalElementImpl extends IdentifiedElementImpl implements EnvironmentalElement {
	/**
	 * The default value of the '{@link #getEnvitonmentType() <em>Envitonment Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnvitonmentType()
	 * @generated
	 * @ordered
	 */
	protected static final EnvironmentType ENVITONMENT_TYPE_EDEFAULT = EnvironmentType.TECHNICAL;

	/**
	 * The cached value of the '{@link #getEnvitonmentType() <em>Envitonment Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnvitonmentType()
	 * @generated
	 * @ordered
	 */
	protected EnvironmentType envitonmentType = ENVITONMENT_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnvironmentalElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UsemearchPackage.Literals.ENVIRONMENTAL_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnvironmentType getEnvitonmentType() {
		return envitonmentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnvitonmentType(EnvironmentType newEnvitonmentType) {
		EnvironmentType oldEnvitonmentType = envitonmentType;
		envitonmentType = newEnvitonmentType == null ? ENVITONMENT_TYPE_EDEFAULT : newEnvitonmentType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UsemearchPackage.ENVIRONMENTAL_ELEMENT__ENVITONMENT_TYPE, oldEnvitonmentType, envitonmentType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UsemearchPackage.ENVIRONMENTAL_ELEMENT__ENVITONMENT_TYPE:
				return getEnvitonmentType();
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
			case UsemearchPackage.ENVIRONMENTAL_ELEMENT__ENVITONMENT_TYPE:
				setEnvitonmentType((EnvironmentType)newValue);
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
			case UsemearchPackage.ENVIRONMENTAL_ELEMENT__ENVITONMENT_TYPE:
				setEnvitonmentType(ENVITONMENT_TYPE_EDEFAULT);
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
			case UsemearchPackage.ENVIRONMENTAL_ELEMENT__ENVITONMENT_TYPE:
				return envitonmentType != ENVITONMENT_TYPE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (envitonmentType: ");
		result.append(envitonmentType);
		result.append(')');
		return result.toString();
	}

} //EnvironmentalElementImpl
