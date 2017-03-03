/**
 */
package pt.fct.unl.novalincs.useme.model.ReportModeling;

import org.eclipse.emf.common.util.EList;
import pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationContext;
import pt.fct.unl.novalincs.useme.model.InteractionModeling.InteractionResult;
import pt.fct.unl.novalincs.useme.model.SurveyModeling.SurveyResult;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Evaluation Result</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.ReportModeling.EvaluationResult#getSurveyResult <em>Survey Result</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.ReportModeling.EvaluationResult#getInteractionResult <em>Interaction Result</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.ReportModeling.EvaluationResult#getReportModel <em>Report Model</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.ReportModeling.EvaluationResult#getEvaluationContext <em>Evaluation Context</em>}</li>
 * </ul>
 *
 * @see pt.fct.unl.novalincs.useme.model.ReportModeling.ReportModelingPackage#getEvaluationResult()
 * @model
 * @generated
 */
public interface EvaluationResult extends EvaluationResultAbstract {
	/**
	 * Returns the value of the '<em><b>Survey Result</b></em>' reference list.
	 * The list contents are of type {@link pt.fct.unl.novalincs.useme.model.SurveyModeling.SurveyResult}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Survey Result</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Survey Result</em>' reference list.
	 * @see pt.fct.unl.novalincs.useme.model.ReportModeling.ReportModelingPackage#getEvaluationResult_SurveyResult()
	 * @model
	 * @generated
	 */
	EList<SurveyResult> getSurveyResult();

	/**
	 * Returns the value of the '<em><b>Interaction Result</b></em>' reference list.
	 * The list contents are of type {@link pt.fct.unl.novalincs.useme.model.InteractionModeling.InteractionResult}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interaction Result</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interaction Result</em>' reference list.
	 * @see pt.fct.unl.novalincs.useme.model.ReportModeling.ReportModelingPackage#getEvaluationResult_InteractionResult()
	 * @model
	 * @generated
	 */
	EList<InteractionResult> getInteractionResult();

	/**
	 * Returns the value of the '<em><b>Report Model</b></em>' reference list.
	 * The list contents are of type {@link pt.fct.unl.novalincs.useme.model.ReportModeling.ReportModel}.
	 * It is bidirectional and its opposite is '{@link pt.fct.unl.novalincs.useme.model.ReportModeling.ReportModel#getEvaluationResult <em>Evaluation Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Report Model</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Report Model</em>' reference list.
	 * @see pt.fct.unl.novalincs.useme.model.ReportModeling.ReportModelingPackage#getEvaluationResult_ReportModel()
	 * @see pt.fct.unl.novalincs.useme.model.ReportModeling.ReportModel#getEvaluationResult
	 * @model opposite="evaluationResult" ordered="false"
	 * @generated
	 */
	EList<ReportModel> getReportModel();

	/**
	 * Returns the value of the '<em><b>Evaluation Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Evaluation Context</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Evaluation Context</em>' reference.
	 * @see #setEvaluationContext(EvaluationContext)
	 * @see pt.fct.unl.novalincs.useme.model.ReportModeling.ReportModelingPackage#getEvaluationResult_EvaluationContext()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EvaluationContext getEvaluationContext();

	/**
	 * Sets the value of the '{@link pt.fct.unl.novalincs.useme.model.ReportModeling.EvaluationResult#getEvaluationContext <em>Evaluation Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Evaluation Context</em>' reference.
	 * @see #getEvaluationContext()
	 * @generated
	 */
	void setEvaluationContext(EvaluationContext value);

} // EvaluationResult
