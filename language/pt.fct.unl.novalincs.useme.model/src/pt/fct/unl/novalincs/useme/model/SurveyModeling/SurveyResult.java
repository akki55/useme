/**
 */
package pt.fct.unl.novalincs.useme.model.SurveyModeling;

import org.eclipse.emf.common.util.EList;
import pt.fct.unl.novalincs.useme.model.ReportModeling.EvaluationResultAbstract;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Survey Result</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.SurveyModeling.SurveyResult#getSurveyModel <em>Survey Model</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.SurveyModeling.SurveyResult#getQuestionnaire <em>Questionnaire</em>}</li>
 * </ul>
 *
 * @see pt.fct.unl.novalincs.useme.model.SurveyModeling.SurveyModelingPackage#getSurveyResult()
 * @model
 * @generated
 */
public interface SurveyResult extends EvaluationResultAbstract {
	/**
	 * Returns the value of the '<em><b>Survey Model</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link pt.fct.unl.novalincs.useme.model.SurveyModeling.SurveyModel#getSurveyResult <em>Survey Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Survey Model</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Survey Model</em>' reference.
	 * @see #setSurveyModel(SurveyModel)
	 * @see pt.fct.unl.novalincs.useme.model.SurveyModeling.SurveyModelingPackage#getSurveyResult_SurveyModel()
	 * @see pt.fct.unl.novalincs.useme.model.SurveyModeling.SurveyModel#getSurveyResult
	 * @model opposite="surveyResult" required="true" ordered="false"
	 * @generated
	 */
	SurveyModel getSurveyModel();

	/**
	 * Sets the value of the '{@link pt.fct.unl.novalincs.useme.model.SurveyModeling.SurveyResult#getSurveyModel <em>Survey Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Survey Model</em>' reference.
	 * @see #getSurveyModel()
	 * @generated
	 */
	void setSurveyModel(SurveyModel value);

	/**
	 * Returns the value of the '<em><b>Questionnaire</b></em>' reference list.
	 * The list contents are of type {@link pt.fct.unl.novalincs.useme.model.SurveyModeling.Questionnaire}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Questionnaire</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Questionnaire</em>' reference list.
	 * @see pt.fct.unl.novalincs.useme.model.SurveyModeling.SurveyModelingPackage#getSurveyResult_Questionnaire()
	 * @model required="true"
	 * @generated
	 */
	EList<Questionnaire> getQuestionnaire();

} // SurveyResult
