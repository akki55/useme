/**
 */
package pt.fct.unl.novalincs.useme.model.Utility;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import pt.fct.unl.novalincs.useme.model.ContextModeling.Workflow;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Process Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.Utility.ProcessModel#getName <em>Name</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.Utility.ProcessModel#getWorkflow <em>Workflow</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.Utility.ProcessModel#getEvaluationProcess <em>Evaluation Process</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.Utility.ProcessModel#getOutsideRef <em>Outside Ref</em>}</li>
 * </ul>
 *
 * @see pt.fct.unl.novalincs.useme.model.Utility.UtilityPackage#getProcessModel()
 * @model
 * @generated
 */
public interface ProcessModel extends EObject {
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
	 * @see pt.fct.unl.novalincs.useme.model.Utility.UtilityPackage#getProcessModel_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link pt.fct.unl.novalincs.useme.model.Utility.ProcessModel#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Workflow</b></em>' reference list.
	 * The list contents are of type {@link pt.fct.unl.novalincs.useme.model.ContextModeling.Workflow}.
	 * It is bidirectional and its opposite is '{@link pt.fct.unl.novalincs.useme.model.ContextModeling.Workflow#getProcessModel <em>Process Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Workflow</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Workflow</em>' reference list.
	 * @see pt.fct.unl.novalincs.useme.model.Utility.UtilityPackage#getProcessModel_Workflow()
	 * @see pt.fct.unl.novalincs.useme.model.ContextModeling.Workflow#getProcessModel
	 * @model opposite="processModel" ordered="false"
	 * @generated
	 */
	EList<Workflow> getWorkflow();

	/**
	 * Returns the value of the '<em><b>Evaluation Process</b></em>' reference list.
	 * The list contents are of type {@link pt.fct.unl.novalincs.useme.model.EvaluationModeling.Process}.
	 * It is bidirectional and its opposite is '{@link pt.fct.unl.novalincs.useme.model.EvaluationModeling.Process#getProcessModel <em>Process Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Evaluation Process</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Evaluation Process</em>' reference list.
	 * @see pt.fct.unl.novalincs.useme.model.Utility.UtilityPackage#getProcessModel_EvaluationProcess()
	 * @see pt.fct.unl.novalincs.useme.model.EvaluationModeling.Process#getProcessModel
	 * @model opposite="processModel"
	 * @generated
	 */
	EList<pt.fct.unl.novalincs.useme.model.EvaluationModeling.Process> getEvaluationProcess();

	/**
	 * Returns the value of the '<em><b>Outside Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outside Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outside Ref</em>' reference.
	 * @see #setOutsideRef(OutsideRef)
	 * @see pt.fct.unl.novalincs.useme.model.Utility.UtilityPackage#getProcessModel_OutsideRef()
	 * @model
	 * @generated
	 */
	OutsideRef getOutsideRef();

	/**
	 * Sets the value of the '{@link pt.fct.unl.novalincs.useme.model.Utility.ProcessModel#getOutsideRef <em>Outside Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outside Ref</em>' reference.
	 * @see #getOutsideRef()
	 * @generated
	 */
	void setOutsideRef(OutsideRef value);

} // ProcessModel
