/**
 */
package fr.tpt.mem4csd.dssl.model.dssl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Computer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.tpt.mem4csd.dssl.model.dssl.Computer#getExecutes <em>Executes</em>}</li>
 *   <li>{@link fr.tpt.mem4csd.dssl.model.dssl.Computer#getDisplays <em>Displays</em>}</li>
 *   <li>{@link fr.tpt.mem4csd.dssl.model.dssl.Computer#getMouses <em>Mouses</em>}</li>
 * </ul>
 *
 * @see fr.tpt.mem4csd.dssl.model.dssl.DsslPackage#getComputer()
 * @model
 * @generated
 */
public interface Computer extends HardwareTool {
	/**
	 * Returns the value of the '<em><b>Executes</b></em>' reference list.
	 * The list contents are of type {@link fr.tpt.mem4csd.dssl.model.dssl.SoftwareTool}.
	 * It is bidirectional and its opposite is '{@link fr.tpt.mem4csd.dssl.model.dssl.SoftwareTool#getExecutedBy <em>Executed By</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Executes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Executes</em>' reference list.
	 * @see fr.tpt.mem4csd.dssl.model.dssl.DsslPackage#getComputer_Executes()
	 * @see fr.tpt.mem4csd.dssl.model.dssl.SoftwareTool#getExecutedBy
	 * @model opposite="executedBy"
	 * @generated
	 */
	EList<SoftwareTool> getExecutes();

	/**
	 * Returns the value of the '<em><b>Displays</b></em>' reference list.
	 * The list contents are of type {@link fr.tpt.mem4csd.dssl.model.dssl.Display}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Displays</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Displays</em>' reference list.
	 * @see fr.tpt.mem4csd.dssl.model.dssl.DsslPackage#getComputer_Displays()
	 * @model
	 * @generated
	 */
	EList<Display> getDisplays();

	/**
	 * Returns the value of the '<em><b>Mouses</b></em>' reference list.
	 * The list contents are of type {@link fr.tpt.mem4csd.dssl.model.dssl.Mouse}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mouses</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mouses</em>' reference list.
	 * @see fr.tpt.mem4csd.dssl.model.dssl.DsslPackage#getComputer_Mouses()
	 * @model
	 * @generated
	 */
	EList<Mouse> getMouses();

} // Computer
