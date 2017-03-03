/**
 */
package fr.tpt.useme.architecture.model.usemearch;

import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instance Elements Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.tpt.useme.architecture.model.usemearch.InstanceElementsConnection#getSourceFeature <em>Source Feature</em>}</li>
 *   <li>{@link fr.tpt.useme.architecture.model.usemearch.InstanceElementsConnection#getDestinationFeature <em>Destination Feature</em>}</li>
 *   <li>{@link fr.tpt.useme.architecture.model.usemearch.InstanceElementsConnection#getSourceInstanceElement <em>Source Instance Element</em>}</li>
 *   <li>{@link fr.tpt.useme.architecture.model.usemearch.InstanceElementsConnection#getDestinationInstanceElement <em>Destination Instance Element</em>}</li>
 * </ul>
 *
 * @see fr.tpt.useme.architecture.model.usemearch.UsemearchPackage#getInstanceElementsConnection()
 * @model
 * @generated
 */
public interface InstanceElementsConnection extends IdentifiedElement {
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
	 * @see fr.tpt.useme.architecture.model.usemearch.UsemearchPackage#getInstanceElementsConnection_SourceFeature()
	 * @model required="true"
	 * @generated
	 */
	EReference getSourceFeature();

	/**
	 * Sets the value of the '{@link fr.tpt.useme.architecture.model.usemearch.InstanceElementsConnection#getSourceFeature <em>Source Feature</em>}' reference.
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
	 * @see fr.tpt.useme.architecture.model.usemearch.UsemearchPackage#getInstanceElementsConnection_DestinationFeature()
	 * @model required="true"
	 * @generated
	 */
	EReference getDestinationFeature();

	/**
	 * Sets the value of the '{@link fr.tpt.useme.architecture.model.usemearch.InstanceElementsConnection#getDestinationFeature <em>Destination Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destination Feature</em>' reference.
	 * @see #getDestinationFeature()
	 * @generated
	 */
	void setDestinationFeature(EReference value);

	/**
	 * Returns the value of the '<em><b>Source Instance Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Instance Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Instance Element</em>' reference.
	 * @see #setSourceInstanceElement(ContextInstanceElement)
	 * @see fr.tpt.useme.architecture.model.usemearch.UsemearchPackage#getInstanceElementsConnection_SourceInstanceElement()
	 * @model required="true"
	 * @generated
	 */
	ContextInstanceElement getSourceInstanceElement();

	/**
	 * Sets the value of the '{@link fr.tpt.useme.architecture.model.usemearch.InstanceElementsConnection#getSourceInstanceElement <em>Source Instance Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Instance Element</em>' reference.
	 * @see #getSourceInstanceElement()
	 * @generated
	 */
	void setSourceInstanceElement(ContextInstanceElement value);

	/**
	 * Returns the value of the '<em><b>Destination Instance Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Destination Instance Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destination Instance Element</em>' reference.
	 * @see #setDestinationInstanceElement(ContextInstanceElement)
	 * @see fr.tpt.useme.architecture.model.usemearch.UsemearchPackage#getInstanceElementsConnection_DestinationInstanceElement()
	 * @model required="true"
	 * @generated
	 */
	ContextInstanceElement getDestinationInstanceElement();

	/**
	 * Sets the value of the '{@link fr.tpt.useme.architecture.model.usemearch.InstanceElementsConnection#getDestinationInstanceElement <em>Destination Instance Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destination Instance Element</em>' reference.
	 * @see #getDestinationInstanceElement()
	 * @generated
	 */
	void setDestinationInstanceElement(ContextInstanceElement value);

} // InstanceElementsConnection
