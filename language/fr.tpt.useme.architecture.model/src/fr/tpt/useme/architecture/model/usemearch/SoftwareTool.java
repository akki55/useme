/**
 */
package fr.tpt.useme.architecture.model.usemearch;

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
 *   <li>{@link fr.tpt.useme.architecture.model.usemearch.SoftwareTool#getSupportedLanguages <em>Supported Languages</em>}</li>
 * </ul>
 *
 * @see fr.tpt.useme.architecture.model.usemearch.UsemearchPackage#getSoftwareTool()
 * @model
 * @generated
 */
public interface SoftwareTool extends Tool {
	/**
	 * Returns the value of the '<em><b>Supported Languages</b></em>' reference list.
	 * The list contents are of type {@link fr.tpt.useme.architecture.model.usemearch.Dsl}.
	 * It is bidirectional and its opposite is '{@link fr.tpt.useme.architecture.model.usemearch.Dsl#getSupportingTools <em>Supporting Tools</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supported Languages</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supported Languages</em>' reference list.
	 * @see fr.tpt.useme.architecture.model.usemearch.UsemearchPackage#getSoftwareTool_SupportedLanguages()
	 * @see fr.tpt.useme.architecture.model.usemearch.Dsl#getSupportingTools
	 * @model opposite="supportingTools" required="true"
	 * @generated
	 */
	EList<Dsl> getSupportedLanguages();

} // SoftwareTool
