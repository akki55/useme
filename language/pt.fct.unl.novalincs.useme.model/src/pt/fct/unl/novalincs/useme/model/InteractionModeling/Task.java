/**
 */
package pt.fct.unl.novalincs.useme.model.InteractionModeling;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import pt.fct.unl.novalincs.useme.model.ContextModeling.Scenario;

import pt.fct.unl.novalincs.useme.model.EvaluationModeling.Documentation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.InteractionModeling.Task#getName <em>Name</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.InteractionModeling.Task#getScenario <em>Scenario</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.InteractionModeling.Task#getInteractionModel <em>Interaction Model</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.InteractionModeling.Task#getDocumentation <em>Documentation</em>}</li>
 * </ul>
 *
 * @see pt.fct.unl.novalincs.useme.model.InteractionModeling.InteractionModelingPackage#getTask()
 * @model
 * @generated
 */
public interface Task extends EObject {
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
	 * @see pt.fct.unl.novalincs.useme.model.InteractionModeling.InteractionModelingPackage#getTask_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link pt.fct.unl.novalincs.useme.model.InteractionModeling.Task#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Scenario</b></em>' reference list.
	 * The list contents are of type {@link pt.fct.unl.novalincs.useme.model.ContextModeling.Scenario}.
	 * It is bidirectional and its opposite is '{@link pt.fct.unl.novalincs.useme.model.ContextModeling.Scenario#getEvaluatedTask <em>Evaluated Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scenario</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scenario</em>' reference list.
	 * @see pt.fct.unl.novalincs.useme.model.InteractionModeling.InteractionModelingPackage#getTask_Scenario()
	 * @see pt.fct.unl.novalincs.useme.model.ContextModeling.Scenario#getEvaluatedTask
	 * @model opposite="evaluatedTask" required="true" ordered="false"
	 * @generated
	 */
	EList<Scenario> getScenario();

	/**
	 * Returns the value of the '<em><b>Interaction Model</b></em>' reference list.
	 * The list contents are of type {@link pt.fct.unl.novalincs.useme.model.InteractionModeling.InteractionModel}.
	 * It is bidirectional and its opposite is '{@link pt.fct.unl.novalincs.useme.model.InteractionModeling.InteractionModel#getTask <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interaction Model</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interaction Model</em>' reference list.
	 * @see pt.fct.unl.novalincs.useme.model.InteractionModeling.InteractionModelingPackage#getTask_InteractionModel()
	 * @see pt.fct.unl.novalincs.useme.model.InteractionModeling.InteractionModel#getTask
	 * @model opposite="task"
	 * @generated
	 */
	EList<InteractionModel> getInteractionModel();

	/**
	 * Returns the value of the '<em><b>Documentation</b></em>' reference list.
	 * The list contents are of type {@link pt.fct.unl.novalincs.useme.model.EvaluationModeling.Documentation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Documentation</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Documentation</em>' reference list.
	 * @see pt.fct.unl.novalincs.useme.model.InteractionModeling.InteractionModelingPackage#getTask_Documentation()
	 * @model
	 * @generated
	 */
	EList<Documentation> getDocumentation();

} // Task
