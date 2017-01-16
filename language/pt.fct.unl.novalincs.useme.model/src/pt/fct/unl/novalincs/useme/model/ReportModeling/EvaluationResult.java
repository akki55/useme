/**
 */
package pt.fct.unl.novalincs.useme.model.ReportModeling;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationContext;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Evaluation Result</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.ReportModeling.EvaluationResult#getName <em>Name</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.ReportModeling.EvaluationResult#getOutsideReference <em>Outside Reference</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.ReportModeling.EvaluationResult#getReportModel <em>Report Model</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.ReportModeling.EvaluationResult#getEvaluationContext <em>Evaluation Context</em>}</li>
 * </ul>
 *
 * @see pt.fct.unl.novalincs.useme.model.ReportModeling.ReportModelingPackage#getEvaluationResult()
 * @model
 * @generated
 */
public interface EvaluationResult extends EObject {
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
	 * @see pt.fct.unl.novalincs.useme.model.ReportModeling.ReportModelingPackage#getEvaluationResult_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link pt.fct.unl.novalincs.useme.model.ReportModeling.EvaluationResult#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Outside Reference</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outside Reference</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outside Reference</em>' attribute list.
	 * @see pt.fct.unl.novalincs.useme.model.ReportModeling.ReportModelingPackage#getEvaluationResult_OutsideReference()
	 * @model
	 * @generated
	 */
	EList<String> getOutsideReference();

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
