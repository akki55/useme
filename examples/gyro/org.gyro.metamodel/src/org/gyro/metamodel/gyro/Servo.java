/**
 */
package org.gyro.metamodel.gyro;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Servo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gyro.metamodel.gyro.Servo#getMinimalPosition <em>Minimal Position</em>}</li>
 *   <li>{@link org.gyro.metamodel.gyro.Servo#getMaximalPosition <em>Maximal Position</em>}</li>
 *   <li>{@link org.gyro.metamodel.gyro.Servo#getStep <em>Step</em>}</li>
 * </ul>
 *
 * @see org.gyro.metamodel.gyro.GyroPackage#getServo()
 * @model
 * @generated
 */
public interface Servo extends Actuate {
	/**
	 * Returns the value of the '<em><b>Minimal Position</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Minimal Position</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minimal Position</em>' attribute.
	 * @see #setMinimalPosition(int)
	 * @see org.gyro.metamodel.gyro.GyroPackage#getServo_MinimalPosition()
	 * @model default="0"
	 * @generated
	 */
	int getMinimalPosition();

	/**
	 * Sets the value of the '{@link org.gyro.metamodel.gyro.Servo#getMinimalPosition <em>Minimal Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minimal Position</em>' attribute.
	 * @see #getMinimalPosition()
	 * @generated
	 */
	void setMinimalPosition(int value);

	/**
	 * Returns the value of the '<em><b>Maximal Position</b></em>' attribute.
	 * The default value is <code>"160"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maximal Position</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maximal Position</em>' attribute.
	 * @see #setMaximalPosition(int)
	 * @see org.gyro.metamodel.gyro.GyroPackage#getServo_MaximalPosition()
	 * @model default="160"
	 * @generated
	 */
	int getMaximalPosition();

	/**
	 * Sets the value of the '{@link org.gyro.metamodel.gyro.Servo#getMaximalPosition <em>Maximal Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximal Position</em>' attribute.
	 * @see #getMaximalPosition()
	 * @generated
	 */
	void setMaximalPosition(int value);

	/**
	 * Returns the value of the '<em><b>Step</b></em>' attribute.
	 * The default value is <code>"10"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Step</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Step</em>' attribute.
	 * @see #setStep(int)
	 * @see org.gyro.metamodel.gyro.GyroPackage#getServo_Step()
	 * @model default="10"
	 * @generated
	 */
	int getStep();

	/**
	 * Sets the value of the '{@link org.gyro.metamodel.gyro.Servo#getStep <em>Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Step</em>' attribute.
	 * @see #getStep()
	 * @generated
	 */
	void setStep(int value);

} // Servo
