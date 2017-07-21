/**
 */
package pt.fct.unl.novalincs.useme.model.ReportModeling;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Report Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.ReportModeling.ReportModel#getName <em>Name</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.ReportModeling.ReportModel#getEvaluationResult <em>Evaluation Result</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.ReportModeling.ReportModel#getRecommendGM <em>Recommend GM</em>}</li>
 * </ul>
 *
 * @see pt.fct.unl.novalincs.useme.model.ReportModeling.ReportModelingPackage#getReportModel()
 * @model
 * @generated
 */
public interface ReportModel extends EObject {
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
	 * @see pt.fct.unl.novalincs.useme.model.ReportModeling.ReportModelingPackage#getReportModel_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link pt.fct.unl.novalincs.useme.model.ReportModeling.ReportModel#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Evaluation Result</b></em>' reference list.
	 * The list contents are of type {@link pt.fct.unl.novalincs.useme.model.ReportModeling.EvaluationResult}.
	 * It is bidirectional and its opposite is '{@link pt.fct.unl.novalincs.useme.model.ReportModeling.EvaluationResult#getReportModel <em>Report Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Evaluation Result</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Evaluation Result</em>' reference list.
	 * @see pt.fct.unl.novalincs.useme.model.ReportModeling.ReportModelingPackage#getReportModel_EvaluationResult()
	 * @see pt.fct.unl.novalincs.useme.model.ReportModeling.EvaluationResult#getReportModel
	 * @model opposite="reportModel" required="true" ordered="false"
	 * @generated
	 */
	EList<EvaluationResult> getEvaluationResult();

	/**
	 * Returns the value of the '<em><b>Recommend GM</b></em>' reference list.
	 * The list contents are of type {@link pt.fct.unl.novalincs.useme.model.ReportModeling.RecommendGM}.
	 * It is bidirectional and its opposite is '{@link pt.fct.unl.novalincs.useme.model.ReportModeling.RecommendGM#getReportModel <em>Report Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Recommend GM</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recommend GM</em>' reference list.
	 * @see pt.fct.unl.novalincs.useme.model.ReportModeling.ReportModelingPackage#getReportModel_RecommendGM()
	 * @see pt.fct.unl.novalincs.useme.model.ReportModeling.RecommendGM#getReportModel
	 * @model opposite="reportModel" ordered="false"
	 * @generated
	 */
	EList<RecommendGM> getRecommendGM();

} // ReportModel
