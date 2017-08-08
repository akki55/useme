/**
 */
package org.gyro.metamodel.gyro;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Distance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gyro.metamodel.gyro.Distance#getValue <em>Value</em>}</li>
 *   <li>{@link org.gyro.metamodel.gyro.Distance#getKind <em>Kind</em>}</li>
 * </ul>
 *
 * @see org.gyro.metamodel.gyro.GyroPackage#getDistance()
 * @model
 * @generated
 */
public interface Distance extends Condition {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The default value is <code>"300"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(int)
	 * @see org.gyro.metamodel.gyro.GyroPackage#getDistance_Value()
	 * @model default="300"
	 * @generated
	 */
	int getValue();

	/**
	 * Sets the value of the '{@link org.gyro.metamodel.gyro.Distance#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(int value);

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The default value is <code>"Major"</code>.
	 * The literals are from the enumeration {@link org.gyro.metamodel.gyro.DistanceKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see org.gyro.metamodel.gyro.DistanceKind
	 * @see #setKind(DistanceKind)
	 * @see org.gyro.metamodel.gyro.GyroPackage#getDistance_Kind()
	 * @model default="Major"
	 * @generated
	 */
	DistanceKind getKind();

	/**
	 * Sets the value of the '{@link org.gyro.metamodel.gyro.Distance#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see org.gyro.metamodel.gyro.DistanceKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(DistanceKind value);

} // Distance
