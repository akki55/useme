/**
 */
package pt.fct.unl.novalincs.useme.model.ContextModeling;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import pt.fct.unl.novalincs.useme.model.EvaluationModeling.Participant;

import pt.fct.unl.novalincs.useme.model.SurveyModeling.BackgroundQs;

import pt.fct.unl.novalincs.useme.model.Utility.LogicalExpression;
import pt.fct.unl.novalincs.useme.model.Utility.PriorityValue;
import pt.fct.unl.novalincs.useme.model.Utility.ProfileTemplate;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User Profile</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.ContextModeling.UserProfile#getName <em>Name</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.ContextModeling.UserProfile#getBackgroundQs <em>Background Qs</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.ContextModeling.UserProfile#getPriority <em>Priority</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.ContextModeling.UserProfile#getParent <em>Parent</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.ContextModeling.UserProfile#getSubProfile <em>Sub Profile</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.ContextModeling.UserProfile#getParticipant <em>Participant</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.ContextModeling.UserProfile#getUserHierarchy <em>User Hierarchy</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.ContextModeling.UserProfile#getProfileTemplate <em>Profile Template</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.ContextModeling.UserProfile#getClassifier <em>Classifier</em>}</li>
 * </ul>
 *
 * @see pt.fct.unl.novalincs.useme.model.ContextModeling.ContextModelingPackage#getUserProfile()
 * @model
 * @generated
 */
public interface UserProfile extends EObject {
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
	 * @see pt.fct.unl.novalincs.useme.model.ContextModeling.ContextModelingPackage#getUserProfile_Name()
	 * @model ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link pt.fct.unl.novalincs.useme.model.ContextModeling.UserProfile#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Background Qs</b></em>' reference list.
	 * The list contents are of type {@link pt.fct.unl.novalincs.useme.model.SurveyModeling.BackgroundQs}.
	 * It is bidirectional and its opposite is '{@link pt.fct.unl.novalincs.useme.model.SurveyModeling.BackgroundQs#getUserProfile <em>User Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Background Qs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Background Qs</em>' reference list.
	 * @see pt.fct.unl.novalincs.useme.model.ContextModeling.ContextModelingPackage#getUserProfile_BackgroundQs()
	 * @see pt.fct.unl.novalincs.useme.model.SurveyModeling.BackgroundQs#getUserProfile
	 * @model opposite="userProfile" ordered="false"
	 * @generated
	 */
	EList<BackgroundQs> getBackgroundQs();

	/**
	 * Returns the value of the '<em><b>Priority</b></em>' attribute.
	 * The literals are from the enumeration {@link pt.fct.unl.novalincs.useme.model.Utility.PriorityValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Priority</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Priority</em>' attribute.
	 * @see pt.fct.unl.novalincs.useme.model.Utility.PriorityValue
	 * @see #setPriority(PriorityValue)
	 * @see pt.fct.unl.novalincs.useme.model.ContextModeling.ContextModelingPackage#getUserProfile_Priority()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	PriorityValue getPriority();

	/**
	 * Sets the value of the '{@link pt.fct.unl.novalincs.useme.model.ContextModeling.UserProfile#getPriority <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' attribute.
	 * @see pt.fct.unl.novalincs.useme.model.Utility.PriorityValue
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(PriorityValue value);

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' reference list.
	 * The list contents are of type {@link pt.fct.unl.novalincs.useme.model.ContextModeling.UserProfile}.
	 * It is bidirectional and its opposite is '{@link pt.fct.unl.novalincs.useme.model.ContextModeling.UserProfile#getSubProfile <em>Sub Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' reference list.
	 * @see pt.fct.unl.novalincs.useme.model.ContextModeling.ContextModelingPackage#getUserProfile_Parent()
	 * @see pt.fct.unl.novalincs.useme.model.ContextModeling.UserProfile#getSubProfile
	 * @model opposite="subProfile" ordered="false"
	 * @generated
	 */
	EList<UserProfile> getParent();

	/**
	 * Returns the value of the '<em><b>Sub Profile</b></em>' reference list.
	 * The list contents are of type {@link pt.fct.unl.novalincs.useme.model.ContextModeling.UserProfile}.
	 * It is bidirectional and its opposite is '{@link pt.fct.unl.novalincs.useme.model.ContextModeling.UserProfile#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Profile</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Profile</em>' reference list.
	 * @see pt.fct.unl.novalincs.useme.model.ContextModeling.ContextModelingPackage#getUserProfile_SubProfile()
	 * @see pt.fct.unl.novalincs.useme.model.ContextModeling.UserProfile#getParent
	 * @model opposite="parent" ordered="false"
	 * @generated
	 */
	EList<UserProfile> getSubProfile();

	/**
	 * Returns the value of the '<em><b>Participant</b></em>' reference list.
	 * The list contents are of type {@link pt.fct.unl.novalincs.useme.model.EvaluationModeling.Participant}.
	 * It is bidirectional and its opposite is '{@link pt.fct.unl.novalincs.useme.model.EvaluationModeling.Participant#getUserProfile <em>User Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Participant</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Participant</em>' reference list.
	 * @see pt.fct.unl.novalincs.useme.model.ContextModeling.ContextModelingPackage#getUserProfile_Participant()
	 * @see pt.fct.unl.novalincs.useme.model.EvaluationModeling.Participant#getUserProfile
	 * @model opposite="userProfile" ordered="false"
	 * @generated
	 */
	EList<Participant> getParticipant();

	/**
	 * Returns the value of the '<em><b>User Hierarchy</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link pt.fct.unl.novalincs.useme.model.ContextModeling.UserHierarchy#getUserProfile <em>User Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Hierarchy</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Hierarchy</em>' reference.
	 * @see #setUserHierarchy(UserHierarchy)
	 * @see pt.fct.unl.novalincs.useme.model.ContextModeling.ContextModelingPackage#getUserProfile_UserHierarchy()
	 * @see pt.fct.unl.novalincs.useme.model.ContextModeling.UserHierarchy#getUserProfile
	 * @model opposite="userProfile" ordered="false"
	 * @generated
	 */
	UserHierarchy getUserHierarchy();

	/**
	 * Sets the value of the '{@link pt.fct.unl.novalincs.useme.model.ContextModeling.UserProfile#getUserHierarchy <em>User Hierarchy</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Hierarchy</em>' reference.
	 * @see #getUserHierarchy()
	 * @generated
	 */
	void setUserHierarchy(UserHierarchy value);

	/**
	 * Returns the value of the '<em><b>Profile Template</b></em>' reference list.
	 * The list contents are of type {@link pt.fct.unl.novalincs.useme.model.Utility.ProfileTemplate}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Profile Template</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Profile Template</em>' reference list.
	 * @see pt.fct.unl.novalincs.useme.model.ContextModeling.ContextModelingPackage#getUserProfile_ProfileTemplate()
	 * @model ordered="false"
	 * @generated
	 */
	EList<ProfileTemplate> getProfileTemplate();

	/**
	 * Returns the value of the '<em><b>Classifier</b></em>' reference list.
	 * The list contents are of type {@link pt.fct.unl.novalincs.useme.model.Utility.LogicalExpression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classifier</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classifier</em>' reference list.
	 * @see pt.fct.unl.novalincs.useme.model.ContextModeling.ContextModelingPackage#getUserProfile_Classifier()
	 * @model ordered="false"
	 * @generated
	 */
	EList<LogicalExpression> getClassifier();

} // UserProfile
