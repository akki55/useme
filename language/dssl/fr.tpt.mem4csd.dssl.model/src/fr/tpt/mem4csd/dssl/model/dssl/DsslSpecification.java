/**
 */
package fr.tpt.mem4csd.dssl.model.dssl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.tpt.mem4csd.dssl.model.dssl.DsslSpecification#getDevelopedDsl <em>Developed Dsl</em>}</li>
 *   <li>{@link fr.tpt.mem4csd.dssl.model.dssl.DsslSpecification#getOwnedContexts <em>Owned Contexts</em>}</li>
 *   <li>{@link fr.tpt.mem4csd.dssl.model.dssl.DsslSpecification#getOwnedEntityTypes <em>Owned Entity Types</em>}</li>
 * </ul>
 *
 * @see fr.tpt.mem4csd.dssl.model.dssl.DsslPackage#getDsslSpecification()
 * @model
 * @generated
 */
public interface DsslSpecification extends IdentifiedElement {
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
	 * @see fr.tpt.mem4csd.dssl.model.dssl.DsslPackage#getDsslSpecification_DevelopedDsl()
	 * @model required="true"
	 * @generated
	 */
	Dsl getDevelopedDsl();

	/**
	 * Sets the value of the '{@link fr.tpt.mem4csd.dssl.model.dssl.DsslSpecification#getDevelopedDsl <em>Developed Dsl</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Developed Dsl</em>' reference.
	 * @see #getDevelopedDsl()
	 * @generated
	 */
	void setDevelopedDsl(Dsl value);

	/**
	 * Returns the value of the '<em><b>Owned Contexts</b></em>' containment reference list.
	 * The list contents are of type {@link fr.tpt.mem4csd.dssl.model.dssl.ContextSpecification}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Contexts</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Contexts</em>' containment reference list.
	 * @see fr.tpt.mem4csd.dssl.model.dssl.DsslPackage#getDsslSpecification_OwnedContexts()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ContextSpecification> getOwnedContexts();

	/**
	 * Returns the value of the '<em><b>Owned Entity Types</b></em>' containment reference list.
	 * The list contents are of type {@link fr.tpt.mem4csd.dssl.model.dssl.EntityType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Entity Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Entity Types</em>' containment reference list.
	 * @see fr.tpt.mem4csd.dssl.model.dssl.DsslPackage#getDsslSpecification_OwnedEntityTypes()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<EntityType> getOwnedEntityTypes();

} // DsslSpecification
