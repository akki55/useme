/**
 */
package fr.tpt.useme.architecture.model.usemearch;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Environment Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.tpt.useme.architecture.model.usemearch.EnvironmentSpecification#getOwnedDsls <em>Owned Dsls</em>}</li>
 *   <li>{@link fr.tpt.useme.architecture.model.usemearch.EnvironmentSpecification#getOwnedTools <em>Owned Tools</em>}</li>
 * </ul>
 *
 * @see fr.tpt.useme.architecture.model.usemearch.UsemearchPackage#getEnvironmentSpecification()
 * @model
 * @generated
 */
public interface EnvironmentSpecification extends IdentifiedElement {
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
	 * @see fr.tpt.useme.architecture.model.usemearch.UsemearchPackage#getEnvironmentSpecification_OwnedDsls()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Dsl> getOwnedDsls();

	/**
	 * Returns the value of the '<em><b>Owned Tools</b></em>' containment reference list.
	 * The list contents are of type {@link fr.tpt.useme.architecture.model.usemearch.Dsl}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Tools</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Tools</em>' containment reference list.
	 * @see fr.tpt.useme.architecture.model.usemearch.UsemearchPackage#getEnvironmentSpecification_OwnedTools()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Dsl> getOwnedTools();

} // EnvironmentSpecification
