/**
 */
package fr.tpt.useme.architecture.model.usemearch;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity Instances Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.tpt.useme.architecture.model.usemearch.EntityInstancesConnection#getSourceFeature <em>Source Feature</em>}</li>
 *   <li>{@link fr.tpt.useme.architecture.model.usemearch.EntityInstancesConnection#getDestinationFeature <em>Destination Feature</em>}</li>
 *   <li>{@link fr.tpt.useme.architecture.model.usemearch.EntityInstancesConnection#getSourceEntityInstance <em>Source Entity Instance</em>}</li>
 *   <li>{@link fr.tpt.useme.architecture.model.usemearch.EntityInstancesConnection#getDestinationEntityInstance <em>Destination Entity Instance</em>}</li>
 * </ul>
 *
 * @see fr.tpt.useme.architecture.model.usemearch.UsemearchPackage#getEntityInstancesConnection()
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
	 * @see fr.tpt.useme.architecture.model.usemearch.UsemearchPackage#getEntityInstancesConnection_SourceFeature()
	 * @model required="true"
	 * @generated
	 */
	InteractionFeature getSourceFeature();

	/**
	 * Sets the value of the '{@link fr.tpt.useme.architecture.model.usemearch.EntityInstancesConnection#getSourceFeature <em>Source Feature</em>}' reference.
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
	 * @see fr.tpt.useme.architecture.model.usemearch.UsemearchPackage#getEntityInstancesConnection_DestinationFeature()
	 * @model required="true"
	 * @generated
	 */
	InteractionFeature getDestinationFeature();

	/**
	 * Sets the value of the '{@link fr.tpt.useme.architecture.model.usemearch.EntityInstancesConnection#getDestinationFeature <em>Destination Feature</em>}' reference.
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
	 * @see #setSourceEntityInstance(ContextEntityInstance)
	 * @see fr.tpt.useme.architecture.model.usemearch.UsemearchPackage#getEntityInstancesConnection_SourceEntityInstance()
	 * @model required="true"
	 * @generated
	 */
	ContextEntityInstance getSourceEntityInstance();

	/**
	 * Sets the value of the '{@link fr.tpt.useme.architecture.model.usemearch.EntityInstancesConnection#getSourceEntityInstance <em>Source Entity Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Entity Instance</em>' reference.
	 * @see #getSourceEntityInstance()
	 * @generated
	 */
	void setSourceEntityInstance(ContextEntityInstance value);

	/**
	 * Returns the value of the '<em><b>Destination Entity Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Destination Entity Instance</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destination Entity Instance</em>' reference.
	 * @see #setDestinationEntityInstance(ContextEntityInstance)
	 * @see fr.tpt.useme.architecture.model.usemearch.UsemearchPackage#getEntityInstancesConnection_DestinationEntityInstance()
	 * @model required="true"
	 * @generated
	 */
	ContextEntityInstance getDestinationEntityInstance();

	/**
	 * Sets the value of the '{@link fr.tpt.useme.architecture.model.usemearch.EntityInstancesConnection#getDestinationEntityInstance <em>Destination Entity Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destination Entity Instance</em>' reference.
	 * @see #getDestinationEntityInstance()
	 * @generated
	 */
	void setDestinationEntityInstance(ContextEntityInstance value);

} // EntityInstancesConnection
