/**
 */
package fr.tpt.mem4csd.dssl.model.dssl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity Instances Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.tpt.mem4csd.dssl.model.dssl.EntityInstancesConnection#getSourceFeature <em>Source Feature</em>}</li>
 *   <li>{@link fr.tpt.mem4csd.dssl.model.dssl.EntityInstancesConnection#getDestinationFeature <em>Destination Feature</em>}</li>
 *   <li>{@link fr.tpt.mem4csd.dssl.model.dssl.EntityInstancesConnection#getSourceEntityInstance <em>Source Entity Instance</em>}</li>
 *   <li>{@link fr.tpt.mem4csd.dssl.model.dssl.EntityInstancesConnection#getDestinationEntityInstance <em>Destination Entity Instance</em>}</li>
 * </ul>
 *
 * @see fr.tpt.mem4csd.dssl.model.dssl.DsslPackage#getEntityInstancesConnection()
 * @model
 * @generated
 */
public interface EntityInstancesConnection extends IdentifiedElement {
	/**
	 * Returns the value of the '<em><b>Source Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Feature</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Feature</em>' reference.
	 * @see #setSourceFeature(InteractionFeature)
	 * @see fr.tpt.mem4csd.dssl.model.dssl.DsslPackage#getEntityInstancesConnection_SourceFeature()
	 * @model required="true"
	 * @generated
	 */
	InteractionFeature getSourceFeature();

	/**
	 * Sets the value of the '{@link fr.tpt.mem4csd.dssl.model.dssl.EntityInstancesConnection#getSourceFeature <em>Source Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Feature</em>' reference.
	 * @see #getSourceFeature()
	 * @generated
	 */
	void setSourceFeature(InteractionFeature value);

	/**
	 * Returns the value of the '<em><b>Destination Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Destination Feature</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destination Feature</em>' reference.
	 * @see #setDestinationFeature(InteractionFeature)
	 * @see fr.tpt.mem4csd.dssl.model.dssl.DsslPackage#getEntityInstancesConnection_DestinationFeature()
	 * @model required="true"
	 * @generated
	 */
	InteractionFeature getDestinationFeature();

	/**
	 * Sets the value of the '{@link fr.tpt.mem4csd.dssl.model.dssl.EntityInstancesConnection#getDestinationFeature <em>Destination Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destination Feature</em>' reference.
	 * @see #getDestinationFeature()
	 * @generated
	 */
	void setDestinationFeature(InteractionFeature value);

	/**
	 * Returns the value of the '<em><b>Source Entity Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Entity Instance</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Entity Instance</em>' reference.
	 * @see #setSourceEntityInstance(EntityInstance)
	 * @see fr.tpt.mem4csd.dssl.model.dssl.DsslPackage#getEntityInstancesConnection_SourceEntityInstance()
	 * @model required="true"
	 * @generated
	 */
	EntityInstance getSourceEntityInstance();

	/**
	 * Sets the value of the '{@link fr.tpt.mem4csd.dssl.model.dssl.EntityInstancesConnection#getSourceEntityInstance <em>Source Entity Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Entity Instance</em>' reference.
	 * @see #getSourceEntityInstance()
	 * @generated
	 */
	void setSourceEntityInstance(EntityInstance value);

	/**
	 * Returns the value of the '<em><b>Destination Entity Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Destination Entity Instance</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destination Entity Instance</em>' reference.
	 * @see #setDestinationEntityInstance(EntityInstance)
	 * @see fr.tpt.mem4csd.dssl.model.dssl.DsslPackage#getEntityInstancesConnection_DestinationEntityInstance()
	 * @model required="true"
	 * @generated
	 */
	EntityInstance getDestinationEntityInstance();

	/**
	 * Sets the value of the '{@link fr.tpt.mem4csd.dssl.model.dssl.EntityInstancesConnection#getDestinationEntityInstance <em>Destination Entity Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destination Entity Instance</em>' reference.
	 * @see #getDestinationEntityInstance()
	 * @generated
	 */
	void setDestinationEntityInstance(EntityInstance value);

} // EntityInstancesConnection
