/**
 */
package org.gyro.metamodel.gyro.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.gyro.metamodel.gyro.BumperKind;
import org.gyro.metamodel.gyro.Bumpers;
import org.gyro.metamodel.gyro.GyroPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bumpers</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.gyro.metamodel.gyro.impl.BumpersImpl#getBumperKind <em>Bumper Kind</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BumpersImpl extends ConditionImpl implements Bumpers {
	/**
	 * The default value of the '{@link #getBumperKind() <em>Bumper Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBumperKind()
	 * @generated
	 * @ordered
	 */
	protected static final BumperKind BUMPER_KIND_EDEFAULT = BumperKind.LEFT;

	/**
	 * The cached value of the '{@link #getBumperKind() <em>Bumper Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBumperKind()
	 * @generated
	 * @ordered
	 */
	protected BumperKind bumperKind = BUMPER_KIND_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BumpersImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GyroPackage.Literals.BUMPERS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BumperKind getBumperKind() {
		return bumperKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBumperKind(BumperKind newBumperKind) {
		BumperKind oldBumperKind = bumperKind;
		bumperKind = newBumperKind == null ? BUMPER_KIND_EDEFAULT : newBumperKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GyroPackage.BUMPERS__BUMPER_KIND, oldBumperKind, bumperKind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GyroPackage.BUMPERS__BUMPER_KIND:
				return getBumperKind();
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
			case GyroPackage.BUMPERS__BUMPER_KIND:
				setBumperKind((BumperKind)newValue);
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
			case GyroPackage.BUMPERS__BUMPER_KIND:
				setBumperKind(BUMPER_KIND_EDEFAULT);
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
			case GyroPackage.BUMPERS__BUMPER_KIND:
				return bumperKind != BUMPER_KIND_EDEFAULT;
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
		result.append(" (bumperKind: ");
		result.append(bumperKind);
		result.append(')');
		return result.toString();
	}

} //BumpersImpl
