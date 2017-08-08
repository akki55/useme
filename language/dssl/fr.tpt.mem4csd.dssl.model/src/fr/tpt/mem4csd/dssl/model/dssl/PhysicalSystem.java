/**
 */
package fr.tpt.mem4csd.dssl.model.dssl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Physical System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.tpt.mem4csd.dssl.model.dssl.PhysicalSystem#getControlledBy <em>Controlled By</em>}</li>
 *   <li>{@link fr.tpt.mem4csd.dssl.model.dssl.PhysicalSystem#getInputs <em>Inputs</em>}</li>
 *   <li>{@link fr.tpt.mem4csd.dssl.model.dssl.PhysicalSystem#getVisual <em>Visual</em>}</li>
 * </ul>
 *
 * @see fr.tpt.mem4csd.dssl.model.dssl.DsslPackage#getPhysicalSystem()
 * @model
 * @generated
 */
public interface PhysicalSystem extends EntityType {
	/**
	 * Returns the value of the '<em><b>Controlled By</b></em>' reference list.
	 * The list contents are of type {@link fr.tpt.mem4csd.dssl.model.dssl.SoftwareTool}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Controlled By</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Controlled By</em>' reference list.
	 * @see fr.tpt.mem4csd.dssl.model.dssl.DsslPackage#getPhysicalSystem_ControlledBy()
	 * @model
	 * @generated
	 */
	EList<SoftwareTool> getControlledBy();

	/**
	 * Returns the value of the '<em><b>Inputs</b></em>' reference list.
	 * The list contents are of type {@link fr.tpt.mem4csd.dssl.model.dssl.Dsl}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inputs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inputs</em>' reference list.
	 * @see fr.tpt.mem4csd.dssl.model.dssl.DsslPackage#getPhysicalSystem_Inputs()
	 * @model
	 * @generated
	 */
	EList<Dsl> getInputs();

	/**
	 * Returns the value of the '<em><b>Visual</b></em>' reference list.
	 * The list contents are of type {@link fr.tpt.mem4csd.dssl.model.dssl.User}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Visual</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visual</em>' reference list.
	 * @see fr.tpt.mem4csd.dssl.model.dssl.DsslPackage#getPhysicalSystem_Visual()
	 * @model
	 * @generated
	 */
	EList<User> getVisual();

} // PhysicalSystem
