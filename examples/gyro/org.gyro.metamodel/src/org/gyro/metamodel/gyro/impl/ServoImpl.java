/**
 */
package org.gyro.metamodel.gyro.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.gyro.metamodel.gyro.GyroPackage;
import org.gyro.metamodel.gyro.Servo;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Servo</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.gyro.metamodel.gyro.impl.ServoImpl#getMinimalPosition <em>Minimal Position</em>}</li>
 *   <li>{@link org.gyro.metamodel.gyro.impl.ServoImpl#getMaximalPosition <em>Maximal Position</em>}</li>
 *   <li>{@link org.gyro.metamodel.gyro.impl.ServoImpl#getStep <em>Step</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServoImpl extends ActuateImpl implements Servo {
	/**
	 * The default value of the '{@link #getMinimalPosition() <em>Minimal Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimalPosition()
	 * @generated
	 * @ordered
	 */
	protected static final int MINIMAL_POSITION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMinimalPosition() <em>Minimal Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimalPosition()
	 * @generated
	 * @ordered
	 */
	protected int minimalPosition = MINIMAL_POSITION_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaximalPosition() <em>Maximal Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximalPosition()
	 * @generated
	 * @ordered
	 */
	protected static final int MAXIMAL_POSITION_EDEFAULT = 160;

	/**
	 * The cached value of the '{@link #getMaximalPosition() <em>Maximal Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximalPosition()
	 * @generated
	 * @ordered
	 */
	protected int maximalPosition = MAXIMAL_POSITION_EDEFAULT;

	/**
	 * The default value of the '{@link #getStep() <em>Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStep()
	 * @generated
	 * @ordered
	 */
	protected static final int STEP_EDEFAULT = 10;

	/**
	 * The cached value of the '{@link #getStep() <em>Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStep()
	 * @generated
	 * @ordered
	 */
	protected int step = STEP_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GyroPackage.Literals.SERVO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMinimalPosition() {
		return minimalPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinimalPosition(int newMinimalPosition) {
		int oldMinimalPosition = minimalPosition;
		minimalPosition = newMinimalPosition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GyroPackage.SERVO__MINIMAL_POSITION, oldMinimalPosition, minimalPosition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaximalPosition() {
		return maximalPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaximalPosition(int newMaximalPosition) {
		int oldMaximalPosition = maximalPosition;
		maximalPosition = newMaximalPosition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GyroPackage.SERVO__MAXIMAL_POSITION, oldMaximalPosition, maximalPosition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getStep() {
		return step;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStep(int newStep) {
		int oldStep = step;
		step = newStep;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GyroPackage.SERVO__STEP, oldStep, step));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GyroPackage.SERVO__MINIMAL_POSITION:
				return getMinimalPosition();
			case GyroPackage.SERVO__MAXIMAL_POSITION:
				return getMaximalPosition();
			case GyroPackage.SERVO__STEP:
				return getStep();
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
			case GyroPackage.SERVO__MINIMAL_POSITION:
				setMinimalPosition((Integer)newValue);
				return;
			case GyroPackage.SERVO__MAXIMAL_POSITION:
				setMaximalPosition((Integer)newValue);
				return;
			case GyroPackage.SERVO__STEP:
				setStep((Integer)newValue);
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
			case GyroPackage.SERVO__MINIMAL_POSITION:
				setMinimalPosition(MINIMAL_POSITION_EDEFAULT);
				return;
			case GyroPackage.SERVO__MAXIMAL_POSITION:
				setMaximalPosition(MAXIMAL_POSITION_EDEFAULT);
				return;
			case GyroPackage.SERVO__STEP:
				setStep(STEP_EDEFAULT);
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
			case GyroPackage.SERVO__MINIMAL_POSITION:
				return minimalPosition != MINIMAL_POSITION_EDEFAULT;
			case GyroPackage.SERVO__MAXIMAL_POSITION:
				return maximalPosition != MAXIMAL_POSITION_EDEFAULT;
			case GyroPackage.SERVO__STEP:
				return step != STEP_EDEFAULT;
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
		result.append(" (minimalPosition: ");
		result.append(minimalPosition);
		result.append(", maximalPosition: ");
		result.append(maximalPosition);
		result.append(", step: ");
		result.append(step);
		result.append(')');
		return result.toString();
	}

} //ServoImpl
