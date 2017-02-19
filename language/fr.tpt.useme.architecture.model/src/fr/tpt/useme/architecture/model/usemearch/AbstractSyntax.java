/**
 */
package fr.tpt.useme.architecture.model.usemearch;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Syntax</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.tpt.useme.architecture.model.usemearch.AbstractSyntax#getOwnedDomainConcepts <em>Owned Domain Concepts</em>}</li>
 * </ul>
 *
 * @see fr.tpt.useme.architecture.model.usemearch.UsemearchPackage#getAbstractSyntax()
 * @model abstract="true"
 * @generated
 */
public interface AbstractSyntax extends Syntax {

	/**
	 * Returns the value of the '<em><b>Owned Domain Concepts</b></em>' containment reference list.
	 * The list contents are of type {@link fr.tpt.useme.architecture.model.usemearch.DomainConcept}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Domain Concepts</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Domain Concepts</em>' containment reference list.
	 * @see fr.tpt.useme.architecture.model.usemearch.UsemearchPackage#getAbstractSyntax_OwnedDomainConcepts()
	 * @model containment="true"
	 * @generated
	 */
	EList<DomainConcept> getOwnedDomainConcepts();
} // AbstractSyntax
