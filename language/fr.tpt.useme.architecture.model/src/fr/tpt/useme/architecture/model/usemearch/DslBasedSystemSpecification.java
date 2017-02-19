/**
 */
package fr.tpt.useme.architecture.model.usemearch;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dsl Based System Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.tpt.useme.architecture.model.usemearch.DslBasedSystemSpecification#getDevelopedDsl <em>Developed Dsl</em>}</li>
 *   <li>{@link fr.tpt.useme.architecture.model.usemearch.DslBasedSystemSpecification#getOwnedContexts <em>Owned Contexts</em>}</li>
 *   <li>{@link fr.tpt.useme.architecture.model.usemearch.DslBasedSystemSpecification#getOwnedContextElementTypes <em>Owned Context Element Types</em>}</li>
 * </ul>
 *
 * @see fr.tpt.useme.architecture.model.usemearch.UsemearchPackage#getDslBasedSystemSpecification()
 * @model
 * @generated
 */
public interface DslBasedSystemSpecification extends IdentifiedElement {
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
	 * @see fr.tpt.useme.architecture.model.usemearch.UsemearchPackage#getDslBasedSystemSpecification_DevelopedDsl()
	 * @model required="true"
	 * @generated
	 */
	Dsl getDevelopedDsl();

	/**
	 * Sets the value of the '{@link fr.tpt.useme.architecture.model.usemearch.DslBasedSystemSpecification#getDevelopedDsl <em>Developed Dsl</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Developed Dsl</em>' reference.
	 * @see #getDevelopedDsl()
	 * @generated
	 */
	void setDevelopedDsl(Dsl value);

	/**
	 * Returns the value of the '<em><b>Owned Contexts</b></em>' containment reference list.
	 * The list contents are of type {@link fr.tpt.useme.architecture.model.usemearch.ContextSpecification}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Contexts</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Contexts</em>' containment reference list.
	 * @see fr.tpt.useme.architecture.model.usemearch.UsemearchPackage#getDslBasedSystemSpecification_OwnedContexts()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ContextSpecification> getOwnedContexts();

	/**
	 * Returns the value of the '<em><b>Owned Context Element Types</b></em>' containment reference list.
	 * The list contents are of type {@link fr.tpt.useme.architecture.model.usemearch.ContextElementType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Context Element Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Context Element Types</em>' containment reference list.
	 * @see fr.tpt.useme.architecture.model.usemearch.UsemearchPackage#getDslBasedSystemSpecification_OwnedContextElementTypes()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ContextElementType> getOwnedContextElementTypes();

} // DslBasedSystemSpecification
