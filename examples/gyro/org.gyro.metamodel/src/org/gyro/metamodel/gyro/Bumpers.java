/**
 */
package org.gyro.metamodel.gyro;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bumpers</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gyro.metamodel.gyro.Bumpers#getBumperKind <em>Bumper Kind</em>}</li>
 * </ul>
 *
 * @see org.gyro.metamodel.gyro.GyroPackage#getBumpers()
 * @model
 * @generated
 */
public interface Bumpers extends Condition {
	/**
	 * Returns the value of the '<em><b>Bumper Kind</b></em>' attribute.
	 * The default value is <code>"Left"</code>.
	 * The literals are from the enumeration {@link org.gyro.metamodel.gyro.BumperKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bumper Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bumper Kind</em>' attribute.
	 * @see org.gyro.metamodel.gyro.BumperKind
	 * @see #setBumperKind(BumperKind)
	 * @see org.gyro.metamodel.gyro.GyroPackage#getBumpers_BumperKind()
	 * @model default="Left"
	 * @generated
	 */
	BumperKind getBumperKind();

	/**
	 * Sets the value of the '{@link org.gyro.metamodel.gyro.Bumpers#getBumperKind <em>Bumper Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bumper Kind</em>' attribute.
	 * @see org.gyro.metamodel.gyro.BumperKind
	 * @see #getBumperKind()
	 * @generated
	 */
	void setBumperKind(BumperKind value);

} // Bumpers
