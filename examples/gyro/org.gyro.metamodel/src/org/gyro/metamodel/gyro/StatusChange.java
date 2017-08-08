/**
 */
package org.gyro.metamodel.gyro;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Status Change</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gyro.metamodel.gyro.StatusChange#getChangeSuccess <em>Change Success</em>}</li>
 *   <li>{@link org.gyro.metamodel.gyro.StatusChange#getChangeFailure <em>Change Failure</em>}</li>
 *   <li>{@link org.gyro.metamodel.gyro.StatusChange#getChangeRunning <em>Change Running</em>}</li>
 * </ul>
 *
 * @see org.gyro.metamodel.gyro.GyroPackage#getStatusChange()
 * @model
 * @generated
 */
public interface StatusChange extends Behavior {
	/**
	 * Returns the value of the '<em><b>Change Success</b></em>' attribute.
	 * The default value is <code>"Success"</code>.
	 * The literals are from the enumeration {@link org.gyro.metamodel.gyro.SuccessState}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Change Success</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Change Success</em>' attribute.
	 * @see org.gyro.metamodel.gyro.SuccessState
	 * @see #setChangeSuccess(SuccessState)
	 * @see org.gyro.metamodel.gyro.GyroPackage#getStatusChange_ChangeSuccess()
	 * @model default="Success"
	 * @generated
	 */
	SuccessState getChangeSuccess();

	/**
	 * Sets the value of the '{@link org.gyro.metamodel.gyro.StatusChange#getChangeSuccess <em>Change Success</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Change Success</em>' attribute.
	 * @see org.gyro.metamodel.gyro.SuccessState
	 * @see #getChangeSuccess()
	 * @generated
	 */
	void setChangeSuccess(SuccessState value);

	/**
	 * Returns the value of the '<em><b>Change Failure</b></em>' attribute.
	 * The default value is <code>"Failure"</code>.
	 * The literals are from the enumeration {@link org.gyro.metamodel.gyro.FailureState}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Change Failure</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Change Failure</em>' attribute.
	 * @see org.gyro.metamodel.gyro.FailureState
	 * @see #setChangeFailure(FailureState)
	 * @see org.gyro.metamodel.gyro.GyroPackage#getStatusChange_ChangeFailure()
	 * @model default="Failure"
	 * @generated
	 */
	FailureState getChangeFailure();

	/**
	 * Sets the value of the '{@link org.gyro.metamodel.gyro.StatusChange#getChangeFailure <em>Change Failure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Change Failure</em>' attribute.
	 * @see org.gyro.metamodel.gyro.FailureState
	 * @see #getChangeFailure()
	 * @generated
	 */
	void setChangeFailure(FailureState value);

	/**
	 * Returns the value of the '<em><b>Change Running</b></em>' attribute.
	 * The default value is <code>"Running"</code>.
	 * The literals are from the enumeration {@link org.gyro.metamodel.gyro.RunningState}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Change Running</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Change Running</em>' attribute.
	 * @see org.gyro.metamodel.gyro.RunningState
	 * @see #setChangeRunning(RunningState)
	 * @see org.gyro.metamodel.gyro.GyroPackage#getStatusChange_ChangeRunning()
	 * @model default="Running"
	 * @generated
	 */
	RunningState getChangeRunning();

	/**
	 * Sets the value of the '{@link org.gyro.metamodel.gyro.StatusChange#getChangeRunning <em>Change Running</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Change Running</em>' attribute.
	 * @see org.gyro.metamodel.gyro.RunningState
	 * @see #getChangeRunning()
	 * @generated
	 */
	void setChangeRunning(RunningState value);

} // StatusChange
