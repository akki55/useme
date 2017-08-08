/**
 */
package org.gyro.metamodel.gyro;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Motor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gyro.metamodel.gyro.Motor#getLeftMotor <em>Left Motor</em>}</li>
 *   <li>{@link org.gyro.metamodel.gyro.Motor#getRightMotor <em>Right Motor</em>}</li>
 * </ul>
 *
 * @see org.gyro.metamodel.gyro.GyroPackage#getMotor()
 * @model
 * @generated
 */
public interface Motor extends Actuate {
	/**
	 * Returns the value of the '<em><b>Left Motor</b></em>' attribute.
	 * The default value is <code>"255"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left Motor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left Motor</em>' attribute.
	 * @see #setLeftMotor(int)
	 * @see org.gyro.metamodel.gyro.GyroPackage#getMotor_LeftMotor()
	 * @model default="255"
	 * @generated
	 */
	int getLeftMotor();

	/**
	 * Sets the value of the '{@link org.gyro.metamodel.gyro.Motor#getLeftMotor <em>Left Motor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left Motor</em>' attribute.
	 * @see #getLeftMotor()
	 * @generated
	 */
	void setLeftMotor(int value);

	/**
	 * Returns the value of the '<em><b>Right Motor</b></em>' attribute.
	 * The default value is <code>"255"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right Motor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right Motor</em>' attribute.
	 * @see #setRightMotor(int)
	 * @see org.gyro.metamodel.gyro.GyroPackage#getMotor_RightMotor()
	 * @model default="255"
	 * @generated
	 */
	int getRightMotor();

	/**
	 * Sets the value of the '{@link org.gyro.metamodel.gyro.Motor#getRightMotor <em>Right Motor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right Motor</em>' attribute.
	 * @see #getRightMotor()
	 * @generated
	 */
	void setRightMotor(int value);

} // Motor
