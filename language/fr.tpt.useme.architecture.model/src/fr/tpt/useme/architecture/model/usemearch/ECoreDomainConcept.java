/**
 */
package fr.tpt.useme.architecture.model.usemearch;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ECore Domain Concept</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.tpt.useme.architecture.model.usemearch.ECoreDomainConcept#getDomainClass <em>Domain Class</em>}</li>
 * </ul>
 *
 * @see fr.tpt.useme.architecture.model.usemearch.UsemearchPackage#getECoreDomainConcept()
 * @model
 * @generated
 */
public interface ECoreDomainConcept extends DomainConcept {
	/**
	 * Returns the value of the '<em><b>Domain Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain Class</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Class</em>' reference.
	 * @see #setDomainClass(EClass)
	 * @see fr.tpt.useme.architecture.model.usemearch.UsemearchPackage#getECoreDomainConcept_DomainClass()
	 * @model required="true"
	 * @generated
	 */
	EClass getDomainClass();

	/**
	 * Sets the value of the '{@link fr.tpt.useme.architecture.model.usemearch.ECoreDomainConcept#getDomainClass <em>Domain Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain Class</em>' reference.
	 * @see #getDomainClass()
	 * @generated
	 */
	void setDomainClass(EClass value);

} // ECoreDomainConcept
