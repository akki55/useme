/**
 */
package org.gyro.metamodel.gyro;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>LED</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gyro.metamodel.gyro.LED#getStatus <em>Status</em>}</li>
 * </ul>
 *
 * @see org.gyro.metamodel.gyro.GyroPackage#getLED()
 * @model
 * @generated
 */
public interface LED extends Actuate {
	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The default value is <code>"On"</code>.
	 * The literals are from the enumeration {@link org.gyro.metamodel.gyro.LightStatus}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see org.gyro.metamodel.gyro.LightStatus
	 * @see #setStatus(LightStatus)
	 * @see org.gyro.metamodel.gyro.GyroPackage#getLED_Status()
	 * @model default="On"
	 * @generated
	 */
	LightStatus getStatus();

	/**
	 * Sets the value of the '{@link org.gyro.metamodel.gyro.LED#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see org.gyro.metamodel.gyro.LightStatus
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(LightStatus value);

} // LED
