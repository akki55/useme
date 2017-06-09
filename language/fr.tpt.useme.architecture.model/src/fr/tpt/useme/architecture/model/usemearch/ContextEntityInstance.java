/**
 */
package fr.tpt.useme.architecture.model.usemearch;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Context Entity Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.tpt.useme.architecture.model.usemearch.ContextEntityInstance#getEntityType <em>Entity Type</em>}</li>
 * </ul>
 *
 * @see fr.tpt.useme.architecture.model.usemearch.UsemearchPackage#getContextEntityInstance()
 * @model
 * @generated
 */
public interface ContextEntityInstance extends IdentifiedElement {
	/**
	 * Returns the value of the '<em><b>Entity Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entity Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity Type</em>' reference.
	 * @see #setEntityType(ContextEntityType)
	 * @see fr.tpt.useme.architecture.model.usemearch.UsemearchPackage#getContextEntityInstance_EntityType()
	 * @model required="true"
	 * @generated
	 */
	ContextEntityType getEntityType();

	/**
	 * Sets the value of the '{@link fr.tpt.useme.architecture.model.usemearch.ContextEntityInstance#getEntityType <em>Entity Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entity Type</em>' reference.
	 * @see #getEntityType()
	 * @generated
	 */
	void setEntityType(ContextEntityType value);

} // ContextEntityInstance
