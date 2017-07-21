/**
 */
package pt.fct.unl.novalincs.useme.model.ContextModeling;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import pt.fct.unl.novalincs.useme.model.Utility.CEVariable;
import pt.fct.unl.novalincs.useme.model.Utility.PriorityValue;
import pt.fct.unl.novalincs.useme.model.Utility.ProcessModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Workflow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.ContextModeling.Workflow#getName <em>Name</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.ContextModeling.Workflow#getPriority <em>Priority</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.ContextModeling.Workflow#getActor <em>Actor</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.ContextModeling.Workflow#getContextElement <em>Context Element</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.ContextModeling.Workflow#getScenario <em>Scenario</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.ContextModeling.Workflow#getProcessModel <em>Process Model</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.ContextModeling.Workflow#getContextModel <em>Context Model</em>}</li>
 * </ul>
 *
 * @see pt.fct.unl.novalincs.useme.model.ContextModeling.ContextModelingPackage#getWorkflow()
 * @model
 * @generated
 */
public interface Workflow extends EObject {
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
	 * @see pt.fct.unl.novalincs.useme.model.ContextModeling.ContextModelingPackage#getWorkflow_Name()
	 * @model ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link pt.fct.unl.novalincs.useme.model.ContextModeling.Workflow#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Priority</b></em>' attribute.
	 * The literals are from the enumeration {@link pt.fct.unl.novalincs.useme.model.Utility.PriorityValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Priority</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Priority</em>' attribute.
	 * @see pt.fct.unl.novalincs.useme.model.Utility.PriorityValue
	 * @see #setPriority(PriorityValue)
	 * @see pt.fct.unl.novalincs.useme.model.ContextModeling.ContextModelingPackage#getWorkflow_Priority()
	 * @model required="true"
	 * @generated
	 */
	PriorityValue getPriority();

	/**
	 * Sets the value of the '{@link pt.fct.unl.novalincs.useme.model.ContextModeling.Workflow#getPriority <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' attribute.
	 * @see pt.fct.unl.novalincs.useme.model.Utility.PriorityValue
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(PriorityValue value);

	/**
	 * Returns the value of the '<em><b>Actor</b></em>' reference list.
	 * The list contents are of type {@link pt.fct.unl.novalincs.useme.model.ContextModeling.UserProfile}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actor</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actor</em>' reference list.
	 * @see pt.fct.unl.novalincs.useme.model.ContextModeling.ContextModelingPackage#getWorkflow_Actor()
	 * @model
	 * @generated
	 */
	EList<UserProfile> getActor();

	/**
	 * Returns the value of the '<em><b>Context Element</b></em>' reference list.
	 * The list contents are of type {@link pt.fct.unl.novalincs.useme.model.Utility.CEVariable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context Element</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context Element</em>' reference list.
	 * @see pt.fct.unl.novalincs.useme.model.ContextModeling.ContextModelingPackage#getWorkflow_ContextElement()
	 * @model
	 * @generated
	 */
	EList<CEVariable> getContextElement();

	/**
	 * Returns the value of the '<em><b>Scenario</b></em>' containment reference list.
	 * The list contents are of type {@link pt.fct.unl.novalincs.useme.model.ContextModeling.Scenario}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scenario</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scenario</em>' containment reference list.
	 * @see pt.fct.unl.novalincs.useme.model.ContextModeling.ContextModelingPackage#getWorkflow_Scenario()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Scenario> getScenario();

	/**
	 * Returns the value of the '<em><b>Process Model</b></em>' reference list.
	 * The list contents are of type {@link pt.fct.unl.novalincs.useme.model.Utility.ProcessModel}.
	 * It is bidirectional and its opposite is '{@link pt.fct.unl.novalincs.useme.model.Utility.ProcessModel#getWorkflow <em>Workflow</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Process Model</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Process Model</em>' reference list.
	 * @see pt.fct.unl.novalincs.useme.model.ContextModeling.ContextModelingPackage#getWorkflow_ProcessModel()
	 * @see pt.fct.unl.novalincs.useme.model.Utility.ProcessModel#getWorkflow
	 * @model opposite="workflow" ordered="false"
	 * @generated
	 */
	EList<ProcessModel> getProcessModel();

	/**
	 * Returns the value of the '<em><b>Context Model</b></em>' reference list.
	 * The list contents are of type {@link pt.fct.unl.novalincs.useme.model.ContextModeling.ContextModel}.
	 * It is bidirectional and its opposite is '{@link pt.fct.unl.novalincs.useme.model.ContextModeling.ContextModel#getWorkflow <em>Workflow</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context Model</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context Model</em>' reference list.
	 * @see pt.fct.unl.novalincs.useme.model.ContextModeling.ContextModelingPackage#getWorkflow_ContextModel()
	 * @see pt.fct.unl.novalincs.useme.model.ContextModeling.ContextModel#getWorkflow
	 * @model opposite="workflow" ordered="false"
	 * @generated
	 */
	EList<ContextModel> getContextModel();

} // Workflow
