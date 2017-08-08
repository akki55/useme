/**
 */
package pt.fct.unl.novalincs.useme.model.ContextModeling;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import pt.fct.unl.novalincs.useme.model.Utility.LogicalExpression;
import pt.fct.unl.novalincs.useme.model.Utility.ProfileTemplate;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User Profile Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.ContextModeling.UserProfileSpecification#getName <em>Name</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.ContextModeling.UserProfileSpecification#getUserProfile <em>User Profile</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.ContextModeling.UserProfileSpecification#getProfileTemplate <em>Profile Template</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.ContextModeling.UserProfileSpecification#getLogicalExpression <em>Logical Expression</em>}</li>
 * </ul>
 *
 * @see pt.fct.unl.novalincs.useme.model.ContextModeling.ContextModelingPackage#getUserProfileSpecification()
 * @model
 * @generated
 */
public interface UserProfileSpecification extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see pt.fct.unl.novalincs.useme.model.ContextModeling.ContextModelingPackage#getUserProfileSpecification_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link pt.fct.unl.novalincs.useme.model.ContextModeling.UserProfileSpecification#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>User Profile</b></em>' containment reference list.
	 * The list contents are of type {@link pt.fct.unl.novalincs.useme.model.ContextModeling.UserProfile}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Profile</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Profile</em>' containment reference list.
	 * @see pt.fct.unl.novalincs.useme.model.ContextModeling.ContextModelingPackage#getUserProfileSpecification_UserProfile()
	 * @model containment="true"
	 * @generated
	 */
	EList<UserProfile> getUserProfile();

	/**
	 * Returns the value of the '<em><b>Profile Template</b></em>' containment reference list.
	 * The list contents are of type {@link pt.fct.unl.novalincs.useme.model.Utility.ProfileTemplate}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Profile Template</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Profile Template</em>' containment reference list.
	 * @see pt.fct.unl.novalincs.useme.model.ContextModeling.ContextModelingPackage#getUserProfileSpecification_ProfileTemplate()
	 * @model containment="true"
	 * @generated
	 */
	EList<ProfileTemplate> getProfileTemplate();

	/**
	 * Returns the value of the '<em><b>Logical Expression</b></em>' containment reference list.
	 * The list contents are of type {@link pt.fct.unl.novalincs.useme.model.Utility.LogicalExpression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Logical Expression</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Logical Expression</em>' containment reference list.
	 * @see pt.fct.unl.novalincs.useme.model.ContextModeling.ContextModelingPackage#getUserProfileSpecification_LogicalExpression()
	 * @model containment="true"
	 * @generated
	 */
	EList<LogicalExpression> getLogicalExpression();

} // UserProfileSpecification
