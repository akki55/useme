/**
 */
package fr.tpt.mem4csd.dssl.model.dssl;

import fr.labsticc.framework.settings.model.settings.Category;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.tpt.mem4csd.dssl.model.dssl.EntityType#getCategory <em>Category</em>}</li>
 *   <li>{@link fr.tpt.mem4csd.dssl.model.dssl.EntityType#getOwnedInteractionFeatures <em>Owned Interaction Features</em>}</li>
 * </ul>
 *
 * @see fr.tpt.mem4csd.dssl.model.dssl.DsslPackage#getEntityType()
 * @model abstract="true"
 * @generated
 */
public interface EntityType extends IdentifiedElement {
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
	 * @see fr.tpt.mem4csd.dssl.model.dssl.DsslPackage#getEntityType_Category()
	 * @model
	 * @generated
	 */
	EList<Category> getCategory();

	/**
	 * Returns the value of the '<em><b>Owned Interaction Features</b></em>' containment reference list.
	 * The list contents are of type {@link fr.tpt.mem4csd.dssl.model.dssl.InteractionFeature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Interaction Features</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Interaction Features</em>' containment reference list.
	 * @see fr.tpt.mem4csd.dssl.model.dssl.DsslPackage#getEntityType_OwnedInteractionFeatures()
	 * @model containment="true"
	 * @generated
	 */
	EList<InteractionFeature> getOwnedInteractionFeatures();

} // EntityType
