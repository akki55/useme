/**
 */
package pt.fct.unl.novalincs.useme.model.ContextModeling;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User Hierarchy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.ContextModeling.UserHierarchy#getUserProfile <em>User Profile</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.ContextModeling.UserHierarchy#getContextModel <em>Context Model</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.ContextModeling.UserHierarchy#getUhDescription <em>Uh Description</em>}</li>
 * </ul>
 *
 * @see pt.fct.unl.novalincs.useme.model.ContextModeling.ContextModelingPackage#getUserHierarchy()
 * @model
 * @generated
 */
public interface UserHierarchy extends EObject {
	/**
	 * Returns the value of the '<em><b>User Profile</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link pt.fct.unl.novalincs.useme.model.ContextModeling.UserProfile#getUserHierarchy <em>User Hierarchy</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Profile</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Profile</em>' reference.
	 * @see #setUserProfile(UserProfile)
	 * @see pt.fct.unl.novalincs.useme.model.ContextModeling.ContextModelingPackage#getUserHierarchy_UserProfile()
	 * @see pt.fct.unl.novalincs.useme.model.ContextModeling.UserProfile#getUserHierarchy
	 * @model opposite="userHierarchy" ordered="false"
	 * @generated
	 */
	UserProfile getUserProfile();

	/**
	 * Sets the value of the '{@link pt.fct.unl.novalincs.useme.model.ContextModeling.UserHierarchy#getUserProfile <em>User Profile</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Profile</em>' reference.
	 * @see #getUserProfile()
	 * @generated
	 */
	void setUserProfile(UserProfile value);

	/**
	 * Returns the value of the '<em><b>Context Model</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link pt.fct.unl.novalincs.useme.model.ContextModeling.ContextModel#getUserHierarchy <em>User Hierarchy</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context Model</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context Model</em>' container reference.
	 * @see #setContextModel(ContextModel)
	 * @see pt.fct.unl.novalincs.useme.model.ContextModeling.ContextModelingPackage#getUserHierarchy_ContextModel()
	 * @see pt.fct.unl.novalincs.useme.model.ContextModeling.ContextModel#getUserHierarchy
	 * @model opposite="userHierarchy" required="true" transient="false" ordered="false"
	 * @generated
	 */
	ContextModel getContextModel();

	/**
	 * Sets the value of the '{@link pt.fct.unl.novalincs.useme.model.ContextModeling.UserHierarchy#getContextModel <em>Context Model</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context Model</em>' container reference.
	 * @see #getContextModel()
	 * @generated
	 */
	void setContextModel(ContextModel value);

	/**
	 * Returns the value of the '<em><b>Uh Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uh Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uh Description</em>' attribute.
	 * @see #setUhDescription(String)
	 * @see pt.fct.unl.novalincs.useme.model.ContextModeling.ContextModelingPackage#getUserHierarchy_UhDescription()
	 * @model ordered="false"
	 * @generated
	 */
	String getUhDescription();

	/**
	 * Sets the value of the '{@link pt.fct.unl.novalincs.useme.model.ContextModeling.UserHierarchy#getUhDescription <em>Uh Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uh Description</em>' attribute.
	 * @see #getUhDescription()
	 * @generated
	 */
	void setUhDescription(String value);

} // UserHierarchy
