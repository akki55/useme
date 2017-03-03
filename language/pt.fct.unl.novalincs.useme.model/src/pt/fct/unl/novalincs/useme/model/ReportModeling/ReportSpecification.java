/**
 */
package pt.fct.unl.novalincs.useme.model.ReportModeling;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Report Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.ReportModeling.ReportSpecification#getReportModel <em>Report Model</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.ReportModeling.ReportSpecification#getRecommendedGM <em>Recommended GM</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.ReportModeling.ReportSpecification#getEvaluationResult <em>Evaluation Result</em>}</li>
 * </ul>
 *
 * @see pt.fct.unl.novalincs.useme.model.ReportModeling.ReportModelingPackage#getReportSpecification()
 * @model
 * @generated
 */
public interface ReportSpecification extends EObject {
	/**
	 * Returns the value of the '<em><b>Report Model</b></em>' containment reference list.
	 * The list contents are of type {@link pt.fct.unl.novalincs.useme.model.ReportModeling.ReportModel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Report Model</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Report Model</em>' containment reference list.
	 * @see pt.fct.unl.novalincs.useme.model.ReportModeling.ReportModelingPackage#getReportSpecification_ReportModel()
	 * @model containment="true"
	 * @generated
	 */
	EList<ReportModel> getReportModel();

	/**
	 * Returns the value of the '<em><b>Recommended GM</b></em>' containment reference list.
	 * The list contents are of type {@link pt.fct.unl.novalincs.useme.model.ReportModeling.RecommendGM}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Recommended GM</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recommended GM</em>' containment reference list.
	 * @see pt.fct.unl.novalincs.useme.model.ReportModeling.ReportModelingPackage#getReportSpecification_RecommendedGM()
	 * @model containment="true"
	 * @generated
	 */
	EList<RecommendGM> getRecommendedGM();

	/**
	 * Returns the value of the '<em><b>Evaluation Result</b></em>' containment reference list.
	 * The list contents are of type {@link pt.fct.unl.novalincs.useme.model.ReportModeling.EvaluationResultAbstract}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Evaluation Result</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Evaluation Result</em>' containment reference list.
	 * @see pt.fct.unl.novalincs.useme.model.ReportModeling.ReportModelingPackage#getReportSpecification_EvaluationResult()
	 * @model containment="true"
	 * @generated
	 */
	EList<EvaluationResultAbstract> getEvaluationResult();

} // ReportSpecification
