/**
 */
package org.gyro.metamodel.gyro;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sibling</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gyro.metamodel.gyro.Sibling#getSource <em>Source</em>}</li>
 *   <li>{@link org.gyro.metamodel.gyro.Sibling#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see org.gyro.metamodel.gyro.GyroPackage#getSibling()
 * @model
 * @generated
 */
public interface Sibling extends EObject {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference list.
	 * The list contents are of type {@link org.gyro.metamodel.gyro.Node}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference list.
	 * @see org.gyro.metamodel.gyro.GyroPackage#getSibling_Source()
	 * @model
	 * @generated
	 */
	EList<Node> getSource();

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference list.
	 * The list contents are of type {@link org.gyro.metamodel.gyro.Node}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference list.
	 * @see org.gyro.metamodel.gyro.GyroPackage#getSibling_Target()
	 * @model
	 * @generated
	 */
	EList<Node> getTarget();

} // Sibling
