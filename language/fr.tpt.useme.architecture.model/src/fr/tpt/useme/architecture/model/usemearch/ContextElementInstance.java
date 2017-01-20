/**
 */
package fr.tpt.useme.architecture.model.usemearch;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Context Element Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.tpt.useme.architecture.model.usemearch.ContextElementInstance#getElementType <em>Element Type</em>}</li>
 * </ul>
 *
 * @see fr.tpt.useme.architecture.model.usemearch.UsemearchPackage#getContextElementInstance()
 * @model
 * @generated
 */
public interface ContextElementInstance extends IdentifiedElement {
	/**
	 * Returns the value of the '<em><b>Element Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element Type</em>' reference.
	 * @see #setElementType(ContextElementType)
	 * @see fr.tpt.useme.architecture.model.usemearch.UsemearchPackage#getContextElementInstance_ElementType()
	 * @model required="true"
	 * @generated
	 */
	ContextElementType getElementType();

	/**
	 * Sets the value of the '{@link fr.tpt.useme.architecture.model.usemearch.ContextElementInstance#getElementType <em>Element Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element Type</em>' reference.
	 * @see #getElementType()
	 * @generated
	 */
	void setElementType(ContextElementType value);

} // ContextElementInstance
