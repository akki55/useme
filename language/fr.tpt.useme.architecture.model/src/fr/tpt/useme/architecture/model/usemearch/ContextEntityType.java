/**
 */
package fr.tpt.useme.architecture.model.usemearch;

import fr.labsticc.framework.settings.model.settings.Category;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Context Entity Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.tpt.useme.architecture.model.usemearch.ContextEntityType#getCategory <em>Category</em>}</li>
 *   <li>{@link fr.tpt.useme.architecture.model.usemearch.ContextEntityType#getOwnedInteractionFeatures <em>Owned Interaction Features</em>}</li>
 * </ul>
 *
 * @see fr.tpt.useme.architecture.model.usemearch.UsemearchPackage#getContextEntityType()
 * @model abstract="true"
 * @generated
 */
public interface ContextEntityType extends IdentifiedElement {
	/**
	 * Returns the value of the '<em><b>Category</b></em>' reference list.
	 * The list contents are of type {@link fr.labsticc.framework.settings.model.settings.Category}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Category</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category</em>' reference list.
	 * @see fr.tpt.useme.architecture.model.usemearch.UsemearchPackage#getContextEntityType_Category()
	 * @model
	 * @generated
	 */
	EList<Category> getCategory();

	/**
	 * Returns the value of the '<em><b>Owned Interaction Features</b></em>' containment reference list.
	 * The list contents are of type {@link fr.tpt.useme.architecture.model.usemearch.InteractionFeature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Interaction Features</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Interaction Features</em>' containment reference list.
	 * @see fr.tpt.useme.architecture.model.usemearch.UsemearchPackage#getContextEntityType_OwnedInteractionFeatures()
	 * @model containment="true"
	 * @generated
	 */
	EList<InteractionFeature> getOwnedInteractionFeatures();

} // ContextEntityType
