/**
 */
package pt.fct.unl.novalincs.useme.model.ReportModeling;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import pt.fct.unl.novalincs.useme.model.Utility.OutsideRef;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Evaluation Result Abstract</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.ReportModeling.EvaluationResultAbstract#getName <em>Name</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.ReportModeling.EvaluationResultAbstract#getResultValue <em>Result Value</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.ReportModeling.EvaluationResultAbstract#getOutsifeReference <em>Outsife Reference</em>}</li>
 * </ul>
 *
 * @see pt.fct.unl.novalincs.useme.model.ReportModeling.ReportModelingPackage#getEvaluationResultAbstract()
 * @model
 * @generated
 */
public interface EvaluationResultAbstract extends EObject {
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
	 * @see pt.fct.unl.novalincs.useme.model.ReportModeling.ReportModelingPackage#getEvaluationResultAbstract_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link pt.fct.unl.novalincs.useme.model.ReportModeling.EvaluationResultAbstract#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Result Value</b></em>' containment reference list.
	 * The list contents are of type {@link pt.fct.unl.novalincs.useme.model.ReportModeling.ResultValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Result Value</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Result Value</em>' containment reference list.
	 * @see pt.fct.unl.novalincs.useme.model.ReportModeling.ReportModelingPackage#getEvaluationResultAbstract_ResultValue()
	 * @model containment="true"
	 * @generated
	 */
	EList<ResultValue> getResultValue();

	/**
	 * Returns the value of the '<em><b>Outsife Reference</b></em>' reference list.
	 * The list contents are of type {@link pt.fct.unl.novalincs.useme.model.Utility.OutsideRef}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outsife Reference</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outsife Reference</em>' reference list.
	 * @see pt.fct.unl.novalincs.useme.model.ReportModeling.ReportModelingPackage#getEvaluationResultAbstract_OutsifeReference()
	 * @model
	 * @generated
	 */
	EList<OutsideRef> getOutsifeReference();

} // EvaluationResultAbstract
