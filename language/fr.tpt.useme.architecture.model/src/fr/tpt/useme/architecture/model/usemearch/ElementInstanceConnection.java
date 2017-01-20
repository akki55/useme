/**
 */
package fr.tpt.useme.architecture.model.usemearch;

import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element Instance Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.tpt.useme.architecture.model.usemearch.ElementInstanceConnection#getSourceFeature <em>Source Feature</em>}</li>
 *   <li>{@link fr.tpt.useme.architecture.model.usemearch.ElementInstanceConnection#getDestinationFeature <em>Destination Feature</em>}</li>
 *   <li>{@link fr.tpt.useme.architecture.model.usemearch.ElementInstanceConnection#getSourceElementInstance <em>Source Element Instance</em>}</li>
 *   <li>{@link fr.tpt.useme.architecture.model.usemearch.ElementInstanceConnection#getDestinationElementInstance <em>Destination Element Instance</em>}</li>
 * </ul>
 *
 * @see fr.tpt.useme.architecture.model.usemearch.UsemearchPackage#getElementInstanceConnection()
 * @model
 * @generated
 */
public interface ElementInstanceConnection extends IdentifiedElement {
	/**
	 * Returns the value of the '<em><b>Source Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Feature</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Feature</em>' reference.
	 * @see #setSourceFeature(EReference)
	 * @see fr.tpt.useme.architecture.model.usemearch.UsemearchPackage#getElementInstanceConnection_SourceFeature()
	 * @model required="true"
	 * @generated
	 */
	EReference getSourceFeature();

	/**
	 * Sets the value of the '{@link fr.tpt.useme.architecture.model.usemearch.ElementInstanceConnection#getSourceFeature <em>Source Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Feature</em>' reference.
	 * @see #getSourceFeature()
	 * @generated
	 */
	void setSourceFeature(EReference value);

	/**
	 * Returns the value of the '<em><b>Destination Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Destination Feature</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destination Feature</em>' reference.
	 * @see #setDestinationFeature(EReference)
	 * @see fr.tpt.useme.architecture.model.usemearch.UsemearchPackage#getElementInstanceConnection_DestinationFeature()
	 * @model required="true"
	 * @generated
	 */
	EReference getDestinationFeature();

	/**
	 * Sets the value of the '{@link fr.tpt.useme.architecture.model.usemearch.ElementInstanceConnection#getDestinationFeature <em>Destination Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destination Feature</em>' reference.
	 * @see #getDestinationFeature()
	 * @generated
	 */
	void setDestinationFeature(EReference value);

	/**
	 * Returns the value of the '<em><b>Source Element Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Element Instance</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Element Instance</em>' reference.
	 * @see #setSourceElementInstance(ContextElementInstance)
	 * @see fr.tpt.useme.architecture.model.usemearch.UsemearchPackage#getElementInstanceConnection_SourceElementInstance()
	 * @model required="true"
	 * @generated
	 */
	ContextElementInstance getSourceElementInstance();

	/**
	 * Sets the value of the '{@link fr.tpt.useme.architecture.model.usemearch.ElementInstanceConnection#getSourceElementInstance <em>Source Element Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Element Instance</em>' reference.
	 * @see #getSourceElementInstance()
	 * @generated
	 */
	void setSourceElementInstance(ContextElementInstance value);

	/**
	 * Returns the value of the '<em><b>Destination Element Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Destination Element Instance</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destination Element Instance</em>' reference.
	 * @see #setDestinationElementInstance(ContextElementInstance)
	 * @see fr.tpt.useme.architecture.model.usemearch.UsemearchPackage#getElementInstanceConnection_DestinationElementInstance()
	 * @model required="true"
	 * @generated
	 */
	ContextElementInstance getDestinationElementInstance();

	/**
	 * Sets the value of the '{@link fr.tpt.useme.architecture.model.usemearch.ElementInstanceConnection#getDestinationElementInstance <em>Destination Element Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destination Element Instance</em>' reference.
	 * @see #getDestinationElementInstance()
	 * @generated
	 */
	void setDestinationElementInstance(ContextElementInstance value);

} // ElementInstanceConnection
