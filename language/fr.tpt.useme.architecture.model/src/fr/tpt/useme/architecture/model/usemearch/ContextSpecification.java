/**
 */
package fr.tpt.useme.architecture.model.usemearch;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Context Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.tpt.useme.architecture.model.usemearch.ContextSpecification#getDevelopedDsl <em>Developed Dsl</em>}</li>
 *   <li>{@link fr.tpt.useme.architecture.model.usemearch.ContextSpecification#getEnvironmentalElements <em>Environmental Elements</em>}</li>
 * </ul>
 *
 * @see fr.tpt.useme.architecture.model.usemearch.UsemearchPackage#getContextSpecification()
 * @model
 * @generated
 */
public interface ContextSpecification extends IdentifiedElement {
	/**
	 * Returns the value of the '<em><b>Developed Dsl</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Developed Dsl</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Developed Dsl</em>' reference.
	 * @see #setDevelopedDsl(Dsl)
	 * @see fr.tpt.useme.architecture.model.usemearch.UsemearchPackage#getContextSpecification_DevelopedDsl()
	 * @model required="true"
	 * @generated
	 */
	Dsl getDevelopedDsl();

	/**
	 * Sets the value of the '{@link fr.tpt.useme.architecture.model.usemearch.ContextSpecification#getDevelopedDsl <em>Developed Dsl</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Developed Dsl</em>' reference.
	 * @see #getDevelopedDsl()
	 * @generated
	 */
	void setDevelopedDsl(Dsl value);

	/**
	 * Returns the value of the '<em><b>Environmental Elements</b></em>' reference list.
	 * The list contents are of type {@link fr.tpt.useme.architecture.model.usemearch.EnvironmentalElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Environmental Elements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Environmental Elements</em>' reference list.
	 * @see fr.tpt.useme.architecture.model.usemearch.UsemearchPackage#getContextSpecification_EnvironmentalElements()
	 * @model required="true"
	 * @generated
	 */
	EList<EnvironmentalElement> getEnvironmentalElements();

} // ContextSpecification
