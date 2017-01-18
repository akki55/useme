/**
 */
package fr.tpt.rdalte.useme.architecture.model.usemearch;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dsl Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.tpt.rdalte.useme.architecture.model.usemearch.DslSpecification#getOwnedDsls <em>Owned Dsls</em>}</li>
 * </ul>
 *
 * @see fr.tpt.rdalte.useme.architecture.model.usemearch.UsemearchPackage#getDslSpecification()
 * @model
 * @generated
 */
public interface DslSpecification extends IdentifiedElement {
	/**
	 * Returns the value of the '<em><b>Owned Dsls</b></em>' containment reference list.
	 * The list contents are of type {@link fr.tpt.rdalte.useme.architecture.model.usemearch.Dsl}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Dsls</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Dsls</em>' containment reference list.
	 * @see fr.tpt.rdalte.useme.architecture.model.usemearch.UsemearchPackage#getDslSpecification_OwnedDsls()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Dsl> getOwnedDsls();

} // DslSpecification
