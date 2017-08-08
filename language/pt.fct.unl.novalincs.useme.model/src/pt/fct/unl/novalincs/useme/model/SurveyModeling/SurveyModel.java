/**
 */
package pt.fct.unl.novalincs.useme.model.SurveyModeling;

import org.eclipse.emf.common.util.EList;

import pt.fct.unl.novalincs.useme.model.EvaluationModeling.TestModel;

import pt.fct.unl.novalincs.useme.model.Utility.SurveyEngine;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Survey Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.SurveyModeling.SurveyModel#getQuestionnaire <em>Questionnaire</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.SurveyModeling.SurveyModel#getSurveyEngine <em>Survey Engine</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.SurveyModeling.SurveyModel#getSurveyResult <em>Survey Result</em>}</li>
 * </ul>
 *
 * @see pt.fct.unl.novalincs.useme.model.SurveyModeling.SurveyModelingPackage#getSurveyModel()
 * @model
 * @generated
 */
public interface SurveyModel extends TestModel {
	/**
	 * Returns the value of the '<em><b>Questionnaire</b></em>' reference list.
	 * The list contents are of type {@link pt.fct.unl.novalincs.useme.model.SurveyModeling.Questionnaire}.
	 * It is bidirectional and its opposite is '{@link pt.fct.unl.novalincs.useme.model.SurveyModeling.Questionnaire#getSurveyModel <em>Survey Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Questionnaire</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Questionnaire</em>' reference list.
	 * @see pt.fct.unl.novalincs.useme.model.SurveyModeling.SurveyModelingPackage#getSurveyModel_Questionnaire()
	 * @see pt.fct.unl.novalincs.useme.model.SurveyModeling.Questionnaire#getSurveyModel
	 * @model opposite="surveyModel" required="true" ordered="false"
	 * @generated
	 */
	EList<Questionnaire> getQuestionnaire();

	/**
	 * Returns the value of the '<em><b>Survey Engine</b></em>' reference list.
	 * The list contents are of type {@link pt.fct.unl.novalincs.useme.model.Utility.SurveyEngine}.
	 * It is bidirectional and its opposite is '{@link pt.fct.unl.novalincs.useme.model.Utility.SurveyEngine#getSurveyModel <em>Survey Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Survey Engine</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Survey Engine</em>' reference list.
	 * @see pt.fct.unl.novalincs.useme.model.SurveyModeling.SurveyModelingPackage#getSurveyModel_SurveyEngine()
	 * @see pt.fct.unl.novalincs.useme.model.Utility.SurveyEngine#getSurveyModel
	 * @model opposite="surveyModel" ordered="false"
	 * @generated
	 */
	EList<SurveyEngine> getSurveyEngine();

	/**
	 * Returns the value of the '<em><b>Survey Result</b></em>' reference list.
	 * The list contents are of type {@link pt.fct.unl.novalincs.useme.model.SurveyModeling.SurveyResult}.
	 * It is bidirectional and its opposite is '{@link pt.fct.unl.novalincs.useme.model.SurveyModeling.SurveyResult#getSurveyModel <em>Survey Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Survey Result</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Survey Result</em>' reference list.
	 * @see pt.fct.unl.novalincs.useme.model.SurveyModeling.SurveyModelingPackage#getSurveyModel_SurveyResult()
	 * @see pt.fct.unl.novalincs.useme.model.SurveyModeling.SurveyResult#getSurveyModel
	 * @model opposite="surveyModel" ordered="false"
	 * @generated
	 */
	EList<SurveyResult> getSurveyResult();

} // SurveyModel
