/**
 */
package fr.tpt.useme.architecture.model.usemearch;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tool</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.tpt.useme.architecture.model.usemearch.Tool#getUsedBy <em>Used By</em>}</li>
 *   <li>{@link fr.tpt.useme.architecture.model.usemearch.Tool#getControlledBy <em>Controlled By</em>}</li>
 *   <li>{@link fr.tpt.useme.architecture.model.usemearch.Tool#getControls <em>Controls</em>}</li>
 *   <li>{@link fr.tpt.useme.architecture.model.usemearch.Tool#getVersion <em>Version</em>}</li>
 * </ul>
 *
 * @see fr.tpt.useme.architecture.model.usemearch.UsemearchPackage#getTool()
 * @model abstract="true"
 * @generated
 */
public interface Tool extends EntityType {
	/**
	 * Returns the value of the '<em><b>Used By</b></em>' reference list.
	 * The list contents are of type {@link fr.tpt.useme.architecture.model.usemearch.User}.
	 * It is bidirectional and its opposite is '{@link fr.tpt.useme.architecture.model.usemearch.User#getUses <em>Uses</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Used By</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Used By</em>' reference list.
	 * @see fr.tpt.useme.architecture.model.usemearch.UsemearchPackage#getTool_UsedBy()
	 * @see fr.tpt.useme.architecture.model.usemearch.User#getUses
	 * @model opposite="uses"
	 * @generated
	 */
	EList<User> getUsedBy();

	/**
	 * Returns the value of the '<em><b>Controlled By</b></em>' reference list.
	 * The list contents are of type {@link fr.tpt.useme.architecture.model.usemearch.Tool}.
	 * It is bidirectional and its opposite is '{@link fr.tpt.useme.architecture.model.usemearch.Tool#getControls <em>Controls</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Controlled By</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Controlled By</em>' reference list.
	 * @see fr.tpt.useme.architecture.model.usemearch.UsemearchPackage#getTool_ControlledBy()
	 * @see fr.tpt.useme.architecture.model.usemearch.Tool#getControls
	 * @model opposite="controls"
	 * @generated
	 */
	EList<Tool> getControlledBy();

	/**
	 * Returns the value of the '<em><b>Controls</b></em>' reference list.
	 * The list contents are of type {@link fr.tpt.useme.architecture.model.usemearch.Tool}.
	 * It is bidirectional and its opposite is '{@link fr.tpt.useme.architecture.model.usemearch.Tool#getControlledBy <em>Controlled By</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Controls</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Controls</em>' reference list.
	 * @see fr.tpt.useme.architecture.model.usemearch.UsemearchPackage#getTool_Controls()
	 * @see fr.tpt.useme.architecture.model.usemearch.Tool#getControlledBy
	 * @model opposite="controlledBy"
	 * @generated
	 */
	EList<Tool> getControls();

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see fr.tpt.useme.architecture.model.usemearch.UsemearchPackage#getTool_Version()
	 * @model
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link fr.tpt.useme.architecture.model.usemearch.Tool#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

} // Tool
