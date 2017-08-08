/**
 */
package fr.tpt.mem4csd.dssl.model.dssl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Software Tool</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.tpt.mem4csd.dssl.model.dssl.SoftwareTool#getSupportedLanguages <em>Supported Languages</em>}</li>
 *   <li>{@link fr.tpt.mem4csd.dssl.model.dssl.SoftwareTool#getExecutedBy <em>Executed By</em>}</li>
 * </ul>
 *
 * @see fr.tpt.mem4csd.dssl.model.dssl.DsslPackage#getSoftwareTool()
 * @model
 * @generated
 */
public interface SoftwareTool extends Tool {
	/**
	 * Returns the value of the '<em><b>Supported Languages</b></em>' reference list.
	 * The list contents are of type {@link fr.tpt.mem4csd.dssl.model.dssl.Dsl}.
	 * It is bidirectional and its opposite is '{@link fr.tpt.mem4csd.dssl.model.dssl.Dsl#getSupportingTools <em>Supporting Tools</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supported Languages</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supported Languages</em>' reference list.
	 * @see fr.tpt.mem4csd.dssl.model.dssl.DsslPackage#getSoftwareTool_SupportedLanguages()
	 * @see fr.tpt.mem4csd.dssl.model.dssl.Dsl#getSupportingTools
	 * @model opposite="supportingTools"
	 * @generated
	 */
	EList<Dsl> getSupportedLanguages();

	/**
	 * Returns the value of the '<em><b>Executed By</b></em>' reference list.
	 * The list contents are of type {@link fr.tpt.mem4csd.dssl.model.dssl.Computer}.
	 * It is bidirectional and its opposite is '{@link fr.tpt.mem4csd.dssl.model.dssl.Computer#getExecutes <em>Executes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Executed By</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Executed By</em>' reference list.
	 * @see fr.tpt.mem4csd.dssl.model.dssl.DsslPackage#getSoftwareTool_ExecutedBy()
	 * @see fr.tpt.mem4csd.dssl.model.dssl.Computer#getExecutes
	 * @model opposite="executes" required="true"
	 * @generated
	 */
	EList<Computer> getExecutedBy();

} // SoftwareTool
