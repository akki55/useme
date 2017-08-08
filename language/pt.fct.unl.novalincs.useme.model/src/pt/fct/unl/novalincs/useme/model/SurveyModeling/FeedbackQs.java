/**
 */
package pt.fct.unl.novalincs.useme.model.SurveyModeling;

import org.eclipse.emf.common.util.EList;

import pt.fct.unl.novalincs.useme.model.ContextModeling.Scenario;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feedback Qs</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.SurveyModeling.FeedbackQs#getScenario <em>Scenario</em>}</li>
 * </ul>
 *
 * @see pt.fct.unl.novalincs.useme.model.SurveyModeling.SurveyModelingPackage#getFeedbackQs()
 * @model
 * @generated
 */
public interface FeedbackQs extends Question {
	/**
	 * Returns the value of the '<em><b>Scenario</b></em>' reference list.
	 * The list contents are of type {@link pt.fct.unl.novalincs.useme.model.ContextModeling.Scenario}.
	 * It is bidirectional and its opposite is '{@link pt.fct.unl.novalincs.useme.model.ContextModeling.Scenario#getQuestion <em>Question</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scenario</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scenario</em>' reference list.
	 * @see pt.fct.unl.novalincs.useme.model.SurveyModeling.SurveyModelingPackage#getFeedbackQs_Scenario()
	 * @see pt.fct.unl.novalincs.useme.model.ContextModeling.Scenario#getQuestion
	 * @model opposite="question"
	 * @generated
	 */
	EList<Scenario> getScenario();

} // FeedbackQs
