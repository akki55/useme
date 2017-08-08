/**
 */
package pt.fct.unl.novalincs.useme.model.ContextModeling;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Context Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.ContextModeling.ContextSpecification#getName <em>Name</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.ContextModeling.ContextSpecification#getContextModel <em>Context Model</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.ContextModeling.ContextSpecification#getUserProfileSpecification <em>User Profile Specification</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.ContextModeling.ContextSpecification#getEnviromentSpecification <em>Enviroment Specification</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.ContextModeling.ContextSpecification#getWorkflowSpecification <em>Workflow Specification</em>}</li>
 * </ul>
 *
 * @see pt.fct.unl.novalincs.useme.model.ContextModeling.ContextModelingPackage#getContextSpecification()
 * @model
 * @generated
 */
public interface ContextSpecification extends EObject {
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
	 * @see pt.fct.unl.novalincs.useme.model.ContextModeling.ContextModelingPackage#getContextSpecification_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link pt.fct.unl.novalincs.useme.model.ContextModeling.ContextSpecification#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Context Model</b></em>' containment reference list.
	 * The list contents are of type {@link pt.fct.unl.novalincs.useme.model.ContextModeling.ContextModel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context Model</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context Model</em>' containment reference list.
	 * @see pt.fct.unl.novalincs.useme.model.ContextModeling.ContextModelingPackage#getContextSpecification_ContextModel()
	 * @model containment="true"
	 * @generated
	 */
	EList<ContextModel> getContextModel();

	/**
	 * Returns the value of the '<em><b>User Profile Specification</b></em>' containment reference list.
	 * The list contents are of type {@link pt.fct.unl.novalincs.useme.model.ContextModeling.UserProfileSpecification}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Profile Specification</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Profile Specification</em>' containment reference list.
	 * @see pt.fct.unl.novalincs.useme.model.ContextModeling.ContextModelingPackage#getContextSpecification_UserProfileSpecification()
	 * @model containment="true"
	 * @generated
	 */
	EList<UserProfileSpecification> getUserProfileSpecification();

	/**
	 * Returns the value of the '<em><b>Enviroment Specification</b></em>' containment reference list.
	 * The list contents are of type {@link pt.fct.unl.novalincs.useme.model.ContextModeling.EnviromentSpecification}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enviroment Specification</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enviroment Specification</em>' containment reference list.
	 * @see pt.fct.unl.novalincs.useme.model.ContextModeling.ContextModelingPackage#getContextSpecification_EnviromentSpecification()
	 * @model containment="true"
	 * @generated
	 */
	EList<EnviromentSpecification> getEnviromentSpecification();

	/**
	 * Returns the value of the '<em><b>Workflow Specification</b></em>' containment reference list.
	 * The list contents are of type {@link pt.fct.unl.novalincs.useme.model.ContextModeling.WorkflowSpecification}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Workflow Specification</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Workflow Specification</em>' containment reference list.
	 * @see pt.fct.unl.novalincs.useme.model.ContextModeling.ContextModelingPackage#getContextSpecification_WorkflowSpecification()
	 * @model containment="true"
	 * @generated
	 */
	EList<WorkflowSpecification> getWorkflowSpecification();

} // ContextSpecification
