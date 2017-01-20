/**
 */
package fr.tpt.useme.architecture.model.usemearch;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dsl Development Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.tpt.useme.architecture.model.usemearch.DslDevelopmentSpecification#getOwnedDsls <em>Owned Dsls</em>}</li>
 *   <li>{@link fr.tpt.useme.architecture.model.usemearch.DslDevelopmentSpecification#getOwnedTools <em>Owned Tools</em>}</li>
 *   <li>{@link fr.tpt.useme.architecture.model.usemearch.DslDevelopmentSpecification#getDevelopedDsl <em>Developed Dsl</em>}</li>
 *   <li>{@link fr.tpt.useme.architecture.model.usemearch.DslDevelopmentSpecification#getOwnedContexts <em>Owned Contexts</em>}</li>
 *   <li>{@link fr.tpt.useme.architecture.model.usemearch.DslDevelopmentSpecification#getOwnedUsers <em>Owned Users</em>}</li>
 * </ul>
 *
 * @see fr.tpt.useme.architecture.model.usemearch.UsemearchPackage#getDslDevelopmentSpecification()
 * @model
 * @generated
 */
public interface DslDevelopmentSpecification extends IdentifiedElement {
	/**
	 * Returns the value of the '<em><b>Owned Dsls</b></em>' containment reference list.
	 * The list contents are of type {@link fr.tpt.useme.architecture.model.usemearch.Dsl}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Dsls</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Dsls</em>' containment reference list.
	 * @see fr.tpt.useme.architecture.model.usemearch.UsemearchPackage#getDslDevelopmentSpecification_OwnedDsls()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Dsl> getOwnedDsls();

	/**
	 * Returns the value of the '<em><b>Owned Tools</b></em>' containment reference list.
	 * The list contents are of type {@link fr.tpt.useme.architecture.model.usemearch.Tool}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Tools</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Tools</em>' containment reference list.
	 * @see fr.tpt.useme.architecture.model.usemearch.UsemearchPackage#getDslDevelopmentSpecification_OwnedTools()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Tool> getOwnedTools();

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
	 * @see fr.tpt.useme.architecture.model.usemearch.UsemearchPackage#getDslDevelopmentSpecification_DevelopedDsl()
	 * @model required="true"
	 * @generated
	 */
	Dsl getDevelopedDsl();

	/**
	 * Sets the value of the '{@link fr.tpt.useme.architecture.model.usemearch.DslDevelopmentSpecification#getDevelopedDsl <em>Developed Dsl</em>}' reference.
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
	 * If the meaning of the '<em>Owned Contexts</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Contexts</em>' containment reference list.
	 * @see fr.tpt.useme.architecture.model.usemearch.UsemearchPackage#getDslDevelopmentSpecification_OwnedContexts()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ContextSpecification> getOwnedContexts();

	/**
	 * Returns the value of the '<em><b>Owned Users</b></em>' containment reference list.
	 * The list contents are of type {@link fr.tpt.useme.architecture.model.usemearch.User}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Users</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Users</em>' containment reference list.
	 * @see fr.tpt.useme.architecture.model.usemearch.UsemearchPackage#getDslDevelopmentSpecification_OwnedUsers()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<User> getOwnedUsers();

} // DslDevelopmentSpecification
