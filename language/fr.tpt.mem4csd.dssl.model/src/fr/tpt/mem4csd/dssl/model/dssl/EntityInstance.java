/**
 */
package fr.tpt.mem4csd.dssl.model.dssl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.tpt.mem4csd.dssl.model.dssl.EntityInstance#getEntityType <em>Entity Type</em>}</li>
 * </ul>
 *
 * @see fr.tpt.mem4csd.dssl.model.dssl.DsslPackage#getEntityInstance()
 * @model
 * @generated
 */
public interface EntityInstance extends IdentifiedElement {
	/**
	 * Returns the value of the '<em><b>Entity Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entity Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity Type</em>' reference.
	 * @see #setEntityType(EntityType)
	 * @see fr.tpt.mem4csd.dssl.model.dssl.DsslPackage#getEntityInstance_EntityType()
	 * @model required="true"
	 * @generated
	 */
	EntityType getEntityType();

	/**
	 * Sets the value of the '{@link fr.tpt.mem4csd.dssl.model.dssl.EntityInstance#getEntityType <em>Entity Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entity Type</em>' reference.
	 * @see #getEntityType()
	 * @generated
	 */
	void setEntityType(EntityType value);

} // EntityInstance
