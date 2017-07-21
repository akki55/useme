/**
 */
package pt.fct.unl.novalincs.useme.model.UseMe;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import pt.fct.unl.novalincs.useme.model.ContextModeling.ContextSpecification;

import pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationSpecification;

import pt.fct.unl.novalincs.useme.model.GoalModeling.GoalSpecification;

import pt.fct.unl.novalincs.useme.model.InteractionModeling.InteractionSpecification;

import pt.fct.unl.novalincs.useme.model.ReportModeling.ReportSpecification;

import pt.fct.unl.novalincs.useme.model.SurveyModeling.SurveySpecification;

import pt.fct.unl.novalincs.useme.model.Utility.UtilitySpecification;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.UseMe.UseMeSpecification#getContextSpecification <em>Context Specification</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.UseMe.UseMeSpecification#getGoalSpecification <em>Goal Specification</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.UseMe.UseMeSpecification#getEvaluationSpecification <em>Evaluation Specification</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.UseMe.UseMeSpecification#getInteractionSpecification <em>Interaction Specification</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.UseMe.UseMeSpecification#getSurveySpecification <em>Survey Specification</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.UseMe.UseMeSpecification#getReportSpecification <em>Report Specification</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.UseMe.UseMeSpecification#getUtilitySpecification <em>Utility Specification</em>}</li>
 * </ul>
 *
 * @see pt.fct.unl.novalincs.useme.model.UseMe.UseMePackage#getUseMeSpecification()
 * @model
 * @generated
 */
public interface UseMeSpecification extends EObject {
	/**
	 * Returns the value of the '<em><b>Context Specification</b></em>' containment reference list.
	 * The list contents are of type {@link pt.fct.unl.novalincs.useme.model.ContextModeling.ContextSpecification}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context Specification</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context Specification</em>' containment reference list.
	 * @see pt.fct.unl.novalincs.useme.model.UseMe.UseMePackage#getUseMeSpecification_ContextSpecification()
	 * @model containment="true"
	 * @generated
	 */
	EList<ContextSpecification> getContextSpecification();

	/**
	 * Returns the value of the '<em><b>Goal Specification</b></em>' containment reference list.
	 * The list contents are of type {@link pt.fct.unl.novalincs.useme.model.GoalModeling.GoalSpecification}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Goal Specification</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Goal Specification</em>' containment reference list.
	 * @see pt.fct.unl.novalincs.useme.model.UseMe.UseMePackage#getUseMeSpecification_GoalSpecification()
	 * @model containment="true"
	 * @generated
	 */
	EList<GoalSpecification> getGoalSpecification();

	/**
	 * Returns the value of the '<em><b>Evaluation Specification</b></em>' containment reference list.
	 * The list contents are of type {@link pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationSpecification}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Evaluation Specification</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Evaluation Specification</em>' containment reference list.
	 * @see pt.fct.unl.novalincs.useme.model.UseMe.UseMePackage#getUseMeSpecification_EvaluationSpecification()
	 * @model containment="true"
	 * @generated
	 */
	EList<EvaluationSpecification> getEvaluationSpecification();

	/**
	 * Returns the value of the '<em><b>Interaction Specification</b></em>' containment reference list.
	 * The list contents are of type {@link pt.fct.unl.novalincs.useme.model.InteractionModeling.InteractionSpecification}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interaction Specification</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interaction Specification</em>' containment reference list.
	 * @see pt.fct.unl.novalincs.useme.model.UseMe.UseMePackage#getUseMeSpecification_InteractionSpecification()
	 * @model containment="true"
	 * @generated
	 */
	EList<InteractionSpecification> getInteractionSpecification();

	/**
	 * Returns the value of the '<em><b>Survey Specification</b></em>' containment reference list.
	 * The list contents are of type {@link pt.fct.unl.novalincs.useme.model.SurveyModeling.SurveySpecification}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Survey Specification</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Survey Specification</em>' containment reference list.
	 * @see pt.fct.unl.novalincs.useme.model.UseMe.UseMePackage#getUseMeSpecification_SurveySpecification()
	 * @model containment="true"
	 * @generated
	 */
	EList<SurveySpecification> getSurveySpecification();

	/**
	 * Returns the value of the '<em><b>Report Specification</b></em>' containment reference list.
	 * The list contents are of type {@link pt.fct.unl.novalincs.useme.model.ReportModeling.ReportSpecification}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Report Specification</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Report Specification</em>' containment reference list.
	 * @see pt.fct.unl.novalincs.useme.model.UseMe.UseMePackage#getUseMeSpecification_ReportSpecification()
	 * @model containment="true"
	 * @generated
	 */
	EList<ReportSpecification> getReportSpecification();

	/**
	 * Returns the value of the '<em><b>Utility Specification</b></em>' containment reference list.
	 * The list contents are of type {@link pt.fct.unl.novalincs.useme.model.Utility.UtilitySpecification}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Utility Specification</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Utility Specification</em>' containment reference list.
	 * @see pt.fct.unl.novalincs.useme.model.UseMe.UseMePackage#getUseMeSpecification_UtilitySpecification()
	 * @model containment="true"
	 * @generated
	 */
	EList<UtilitySpecification> getUtilitySpecification();

} // UseMeSpecification
