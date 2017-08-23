/**
 */
package fr.tpt.mem4csd.dssl.model.dssl;

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
 *   <li>{@link fr.tpt.mem4csd.dssl.model.dssl.ContextSpecification#getOwnedEntityInstances <em>Owned Entity Instances</em>}</li>
 *   <li>{@link fr.tpt.mem4csd.dssl.model.dssl.ContextSpecification#getDevelopedDsl <em>Developed Dsl</em>}</li>
 *   <li>{@link fr.tpt.mem4csd.dssl.model.dssl.ContextSpecification#getOwnedConnections <em>Owned Connections</em>}</li>
 * </ul>
 *
 * @see fr.tpt.mem4csd.dssl.model.dssl.DsslPackage#getContextSpecification()
 * @model
 * @generated
 */
public interface ContextSpecification extends IdentifiedElement {
	/**
	 * Returns the value of the '<em><b>Owned Entity Instances</b></em>' containment reference list.
	 * The list contents are of type {@link fr.tpt.mem4csd.dssl.model.dssl.EntityInstance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Entity Instances</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Entity Instances</em>' containment reference list.
	 * @see fr.tpt.mem4csd.dssl.model.dssl.DsslPackage#getContextSpecification_OwnedEntityInstances()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<EntityInstance> getOwnedEntityInstances();

	/**
	 * Returns the value of the '<em><b>Developed Dsl</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Developed Dsl</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Developed Dsl</em>' reference.
	 * @see fr.tpt.mem4csd.dssl.model.dssl.DsslPackage#getContextSpecification_DevelopedDsl()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	Dsl getDevelopedDsl();

	/**
	 * Returns the value of the '<em><b>Owned Connections</b></em>' containment reference list.
	 * The list contents are of type {@link fr.tpt.mem4csd.dssl.model.dssl.EntityInstancesConnection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Connections</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Connections</em>' containment reference list.
	 * @see fr.tpt.mem4csd.dssl.model.dssl.DsslPackage#getContextSpecification_OwnedConnections()
	 * @model containment="true"
	 * @generated
	 */
	EList<EntityInstancesConnection> getOwnedConnections();

} // ContextSpecification
