/**
 */
package pt.fct.unl.novalincs.useme.model.ContextModeling;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import pt.fct.unl.novalincs.useme.model.EvaluationModeling.Documentation;

import pt.fct.unl.novalincs.useme.model.InteractionModeling.Task;

import pt.fct.unl.novalincs.useme.model.SurveyModeling.FeedbackQs;

import pt.fct.unl.novalincs.useme.model.Utility.PriorityValue;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scenario</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.ContextModeling.Scenario#getName <em>Name</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.ContextModeling.Scenario#getPriority <em>Priority</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.ContextModeling.Scenario#getEvaluatedTask <em>Evaluated Task</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.ContextModeling.Scenario#getDoc <em>Doc</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.ContextModeling.Scenario#getAggregates <em>Aggregates</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.ContextModeling.Scenario#getQuestion <em>Question</em>}</li>
 * </ul>
 *
 * @see pt.fct.unl.novalincs.useme.model.ContextModeling.ContextModelingPackage#getScenario()
 * @model
 * @generated
 */
public interface Scenario extends EObject {
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
	 * @see pt.fct.unl.novalincs.useme.model.ContextModeling.ContextModelingPackage#getScenario_Name()
	 * @model ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link pt.fct.unl.novalincs.useme.model.ContextModeling.Scenario#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Priority</b></em>' attribute.
	 * The default value is <code>"High"</code>.
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
	 * @see pt.fct.unl.novalincs.useme.model.ContextModeling.ContextModelingPackage#getScenario_Priority()
	 * @model default="High" required="true" ordered="false"
	 * @generated
	 */
	PriorityValue getPriority();

	/**
	 * Sets the value of the '{@link pt.fct.unl.novalincs.useme.model.ContextModeling.Scenario#getPriority <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' attribute.
	 * @see pt.fct.unl.novalincs.useme.model.Utility.PriorityValue
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(PriorityValue value);

	/**
	 * Returns the value of the '<em><b>Evaluated Task</b></em>' reference list.
	 * The list contents are of type {@link pt.fct.unl.novalincs.useme.model.InteractionModeling.Task}.
	 * It is bidirectional and its opposite is '{@link pt.fct.unl.novalincs.useme.model.InteractionModeling.Task#getScenario <em>Scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Evaluated Task</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Evaluated Task</em>' reference list.
	 * @see pt.fct.unl.novalincs.useme.model.ContextModeling.ContextModelingPackage#getScenario_EvaluatedTask()
	 * @see pt.fct.unl.novalincs.useme.model.InteractionModeling.Task#getScenario
	 * @model opposite="scenario" ordered="false"
	 * @generated
	 */
	EList<Task> getEvaluatedTask();

	/**
	 * Returns the value of the '<em><b>Doc</b></em>' reference list.
	 * The list contents are of type {@link pt.fct.unl.novalincs.useme.model.EvaluationModeling.Documentation}.
	 * It is bidirectional and its opposite is '{@link pt.fct.unl.novalincs.useme.model.EvaluationModeling.Documentation#getScenario <em>Scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Doc</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Doc</em>' reference list.
	 * @see pt.fct.unl.novalincs.useme.model.ContextModeling.ContextModelingPackage#getScenario_Doc()
	 * @see pt.fct.unl.novalincs.useme.model.EvaluationModeling.Documentation#getScenario
	 * @model opposite="scenario" ordered="false"
	 * @generated
	 */
	EList<Documentation> getDoc();

	/**
	 * Returns the value of the '<em><b>Aggregates</b></em>' reference list.
	 * The list contents are of type {@link pt.fct.unl.novalincs.useme.model.ContextModeling.Scenario}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aggregates</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aggregates</em>' reference list.
	 * @see pt.fct.unl.novalincs.useme.model.ContextModeling.ContextModelingPackage#getScenario_Aggregates()
	 * @model
	 * @generated
	 */
	EList<Scenario> getAggregates();

	/**
	 * Returns the value of the '<em><b>Question</b></em>' reference list.
	 * The list contents are of type {@link pt.fct.unl.novalincs.useme.model.SurveyModeling.FeedbackQs}.
	 * It is bidirectional and its opposite is '{@link pt.fct.unl.novalincs.useme.model.SurveyModeling.FeedbackQs#getScenario <em>Scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Question</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Question</em>' reference list.
	 * @see pt.fct.unl.novalincs.useme.model.ContextModeling.ContextModelingPackage#getScenario_Question()
	 * @see pt.fct.unl.novalincs.useme.model.SurveyModeling.FeedbackQs#getScenario
	 * @model opposite="scenario"
	 * @generated
	 */
	EList<FeedbackQs> getQuestion();

} // Scenario
