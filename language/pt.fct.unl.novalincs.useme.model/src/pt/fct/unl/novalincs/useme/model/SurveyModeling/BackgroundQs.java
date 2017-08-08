/**
 */
package pt.fct.unl.novalincs.useme.model.SurveyModeling;

import org.eclipse.emf.common.util.EList;

import pt.fct.unl.novalincs.useme.model.ContextModeling.UserProfile;

import pt.fct.unl.novalincs.useme.model.Utility.LogicalExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Background Qs</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.SurveyModeling.BackgroundQs#getUserProfile <em>User Profile</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.SurveyModeling.BackgroundQs#getLogicalExpression <em>Logical Expression</em>}</li>
 * </ul>
 *
 * @see pt.fct.unl.novalincs.useme.model.SurveyModeling.SurveyModelingPackage#getBackgroundQs()
 * @model
 * @generated
 */
public interface BackgroundQs extends Question {
	/**
	 * Returns the value of the '<em><b>User Profile</b></em>' reference list.
	 * The list contents are of type {@link pt.fct.unl.novalincs.useme.model.ContextModeling.UserProfile}.
	 * It is bidirectional and its opposite is '{@link pt.fct.unl.novalincs.useme.model.ContextModeling.UserProfile#getBackgroundQs <em>Background Qs</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Profile</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Profile</em>' reference list.
	 * @see pt.fct.unl.novalincs.useme.model.SurveyModeling.SurveyModelingPackage#getBackgroundQs_UserProfile()
	 * @see pt.fct.unl.novalincs.useme.model.ContextModeling.UserProfile#getBackgroundQs
	 * @model opposite="backgroundQs" required="true" ordered="false"
	 * @generated
	 */
	EList<UserProfile> getUserProfile();

	/**
	 * Returns the value of the '<em><b>Logical Expression</b></em>' reference list.
	 * The list contents are of type {@link pt.fct.unl.novalincs.useme.model.Utility.LogicalExpression}.
	 * It is bidirectional and its opposite is '{@link pt.fct.unl.novalincs.useme.model.Utility.LogicalExpression#getQuestion <em>Question</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Logical Expression</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Logical Expression</em>' reference list.
	 * @see pt.fct.unl.novalincs.useme.model.SurveyModeling.SurveyModelingPackage#getBackgroundQs_LogicalExpression()
	 * @see pt.fct.unl.novalincs.useme.model.Utility.LogicalExpression#getQuestion
	 * @model opposite="question"
	 * @generated
	 */
	EList<LogicalExpression> getLogicalExpression();

} // BackgroundQs
