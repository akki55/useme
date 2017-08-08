/**
 */
package org.gyro.metamodel.gyro.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.gyro.metamodel.gyro.FailureState;
import org.gyro.metamodel.gyro.GyroPackage;
import org.gyro.metamodel.gyro.RunningState;
import org.gyro.metamodel.gyro.StatusChange;
import org.gyro.metamodel.gyro.SuccessState;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Status Change</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.gyro.metamodel.gyro.impl.StatusChangeImpl#getChangeSuccess <em>Change Success</em>}</li>
 *   <li>{@link org.gyro.metamodel.gyro.impl.StatusChangeImpl#getChangeFailure <em>Change Failure</em>}</li>
 *   <li>{@link org.gyro.metamodel.gyro.impl.StatusChangeImpl#getChangeRunning <em>Change Running</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StatusChangeImpl extends BehaviorImpl implements StatusChange {
	/**
	 * The default value of the '{@link #getChangeSuccess() <em>Change Success</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChangeSuccess()
	 * @generated
	 * @ordered
	 */
	protected static final SuccessState CHANGE_SUCCESS_EDEFAULT = SuccessState.SUCCESS;

	/**
	 * The cached value of the '{@link #getChangeSuccess() <em>Change Success</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChangeSuccess()
	 * @generated
	 * @ordered
	 */
	protected SuccessState changeSuccess = CHANGE_SUCCESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getChangeFailure() <em>Change Failure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChangeFailure()
	 * @generated
	 * @ordered
	 */
	protected static final FailureState CHANGE_FAILURE_EDEFAULT = FailureState.FAILURE;

	/**
	 * The cached value of the '{@link #getChangeFailure() <em>Change Failure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChangeFailure()
	 * @generated
	 * @ordered
	 */
	protected FailureState changeFailure = CHANGE_FAILURE_EDEFAULT;

	/**
	 * The default value of the '{@link #getChangeRunning() <em>Change Running</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChangeRunning()
	 * @generated
	 * @ordered
	 */
	protected static final RunningState CHANGE_RUNNING_EDEFAULT = RunningState.RUNNING;

	/**
	 * The cached value of the '{@link #getChangeRunning() <em>Change Running</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChangeRunning()
	 * @generated
	 * @ordered
	 */
	protected RunningState changeRunning = CHANGE_RUNNING_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StatusChangeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GyroPackage.Literals.STATUS_CHANGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SuccessState getChangeSuccess() {
		return changeSuccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChangeSuccess(SuccessState newChangeSuccess) {
		SuccessState oldChangeSuccess = changeSuccess;
		changeSuccess = newChangeSuccess == null ? CHANGE_SUCCESS_EDEFAULT : newChangeSuccess;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GyroPackage.STATUS_CHANGE__CHANGE_SUCCESS, oldChangeSuccess, changeSuccess));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FailureState getChangeFailure() {
		return changeFailure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChangeFailure(FailureState newChangeFailure) {
		FailureState oldChangeFailure = changeFailure;
		changeFailure = newChangeFailure == null ? CHANGE_FAILURE_EDEFAULT : newChangeFailure;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GyroPackage.STATUS_CHANGE__CHANGE_FAILURE, oldChangeFailure, changeFailure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RunningState getChangeRunning() {
		return changeRunning;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChangeRunning(RunningState newChangeRunning) {
		RunningState oldChangeRunning = changeRunning;
		changeRunning = newChangeRunning == null ? CHANGE_RUNNING_EDEFAULT : newChangeRunning;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GyroPackage.STATUS_CHANGE__CHANGE_RUNNING, oldChangeRunning, changeRunning));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GyroPackage.STATUS_CHANGE__CHANGE_SUCCESS:
				return getChangeSuccess();
			case GyroPackage.STATUS_CHANGE__CHANGE_FAILURE:
				return getChangeFailure();
			case GyroPackage.STATUS_CHANGE__CHANGE_RUNNING:
				return getChangeRunning();
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
			case GyroPackage.STATUS_CHANGE__CHANGE_SUCCESS:
				setChangeSuccess((SuccessState)newValue);
				return;
			case GyroPackage.STATUS_CHANGE__CHANGE_FAILURE:
				setChangeFailure((FailureState)newValue);
				return;
			case GyroPackage.STATUS_CHANGE__CHANGE_RUNNING:
				setChangeRunning((RunningState)newValue);
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
			case GyroPackage.STATUS_CHANGE__CHANGE_SUCCESS:
				setChangeSuccess(CHANGE_SUCCESS_EDEFAULT);
				return;
			case GyroPackage.STATUS_CHANGE__CHANGE_FAILURE:
				setChangeFailure(CHANGE_FAILURE_EDEFAULT);
				return;
			case GyroPackage.STATUS_CHANGE__CHANGE_RUNNING:
				setChangeRunning(CHANGE_RUNNING_EDEFAULT);
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
			case GyroPackage.STATUS_CHANGE__CHANGE_SUCCESS:
				return changeSuccess != CHANGE_SUCCESS_EDEFAULT;
			case GyroPackage.STATUS_CHANGE__CHANGE_FAILURE:
				return changeFailure != CHANGE_FAILURE_EDEFAULT;
			case GyroPackage.STATUS_CHANGE__CHANGE_RUNNING:
				return changeRunning != CHANGE_RUNNING_EDEFAULT;
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
		result.append(" (changeSuccess: ");
		result.append(changeSuccess);
		result.append(", changeFailure: ");
		result.append(changeFailure);
		result.append(", changeRunning: ");
		result.append(changeRunning);
		result.append(')');
		return result.toString();
	}

} //StatusChangeImpl
