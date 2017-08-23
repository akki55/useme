/**
 */
package org.gyro.metamodel.gyro.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.gyro.metamodel.gyro.GyroPackage;
import org.gyro.metamodel.gyro.Motor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Motor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.gyro.metamodel.gyro.impl.MotorImpl#getLeftMotor <em>Left Motor</em>}</li>
 *   <li>{@link org.gyro.metamodel.gyro.impl.MotorImpl#getRightMotor <em>Right Motor</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MotorImpl extends ActuateImpl implements Motor {
	/**
	 * The default value of the '{@link #getLeftMotor() <em>Left Motor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeftMotor()
	 * @generated
	 * @ordered
	 */
	protected static final int LEFT_MOTOR_EDEFAULT = 255;

	/**
	 * The cached value of the '{@link #getLeftMotor() <em>Left Motor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeftMotor()
	 * @generated
	 * @ordered
	 */
	protected int leftMotor = LEFT_MOTOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getRightMotor() <em>Right Motor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRightMotor()
	 * @generated
	 * @ordered
	 */
	protected static final int RIGHT_MOTOR_EDEFAULT = 255;

	/**
	 * The cached value of the '{@link #getRightMotor() <em>Right Motor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRightMotor()
	 * @generated
	 * @ordered
	 */
	protected int rightMotor = RIGHT_MOTOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MotorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GyroPackage.Literals.MOTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLeftMotor() {
		return leftMotor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLeftMotor(int newLeftMotor) {
		int oldLeftMotor = leftMotor;
		leftMotor = newLeftMotor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GyroPackage.MOTOR__LEFT_MOTOR, oldLeftMotor, leftMotor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRightMotor() {
		return rightMotor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRightMotor(int newRightMotor) {
		int oldRightMotor = rightMotor;
		rightMotor = newRightMotor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GyroPackage.MOTOR__RIGHT_MOTOR, oldRightMotor, rightMotor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GyroPackage.MOTOR__LEFT_MOTOR:
				return getLeftMotor();
			case GyroPackage.MOTOR__RIGHT_MOTOR:
				return getRightMotor();
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
			case GyroPackage.MOTOR__LEFT_MOTOR:
				setLeftMotor((Integer)newValue);
				return;
			case GyroPackage.MOTOR__RIGHT_MOTOR:
				setRightMotor((Integer)newValue);
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
			case GyroPackage.MOTOR__LEFT_MOTOR:
				setLeftMotor(LEFT_MOTOR_EDEFAULT);
				return;
			case GyroPackage.MOTOR__RIGHT_MOTOR:
				setRightMotor(RIGHT_MOTOR_EDEFAULT);
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
			case GyroPackage.MOTOR__LEFT_MOTOR:
				return leftMotor != LEFT_MOTOR_EDEFAULT;
			case GyroPackage.MOTOR__RIGHT_MOTOR:
				return rightMotor != RIGHT_MOTOR_EDEFAULT;
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
		result.append(" (leftMotor: ");
		result.append(leftMotor);
		result.append(", rightMotor: ");
		result.append(rightMotor);
		result.append(')');
		return result.toString();
	}

} //MotorImpl
