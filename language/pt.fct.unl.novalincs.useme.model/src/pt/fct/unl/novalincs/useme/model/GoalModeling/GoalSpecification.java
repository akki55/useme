/**
 */
package pt.fct.unl.novalincs.useme.model.GoalModeling;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Goal Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.GoalModeling.GoalSpecification#getName <em>Name</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.GoalModeling.GoalSpecification#getUsabilityRequirement <em>Usability Requirement</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.GoalModeling.GoalSpecification#getMethod <em>Method</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.GoalModeling.GoalSpecification#getActor <em>Actor</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.GoalModeling.GoalSpecification#getScope <em>Scope</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.GoalModeling.GoalSpecification#getSuccessCoverage <em>Success Coverage</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.GoalModeling.GoalSpecification#getGoalModel <em>Goal Model</em>}</li>
 * </ul>
 *
 * @see pt.fct.unl.novalincs.useme.model.GoalModeling.GoalModelingPackage#getGoalSpecification()
 * @model
 * @generated
 */
public interface GoalSpecification extends EObject {
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
	 * @see pt.fct.unl.novalincs.useme.model.GoalModeling.GoalModelingPackage#getGoalSpecification_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link pt.fct.unl.novalincs.useme.model.GoalModeling.GoalSpecification#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Usability Requirement</b></em>' containment reference list.
	 * The list contents are of type {@link pt.fct.unl.novalincs.useme.model.GoalModeling.UsabilityRequirement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Usability Requirement</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usability Requirement</em>' containment reference list.
	 * @see pt.fct.unl.novalincs.useme.model.GoalModeling.GoalModelingPackage#getGoalSpecification_UsabilityRequirement()
	 * @model containment="true"
	 * @generated
	 */
	EList<UsabilityRequirement> getUsabilityRequirement();

	/**
	 * Returns the value of the '<em><b>Method</b></em>' containment reference list.
	 * The list contents are of type {@link pt.fct.unl.novalincs.useme.model.GoalModeling.Method}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Method</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method</em>' containment reference list.
	 * @see pt.fct.unl.novalincs.useme.model.GoalModeling.GoalModelingPackage#getGoalSpecification_Method()
	 * @model containment="true"
	 * @generated
	 */
	EList<Method> getMethod();

	/**
	 * Returns the value of the '<em><b>Actor</b></em>' containment reference list.
	 * The list contents are of type {@link pt.fct.unl.novalincs.useme.model.GoalModeling.Actor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actor</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actor</em>' containment reference list.
	 * @see pt.fct.unl.novalincs.useme.model.GoalModeling.GoalModelingPackage#getGoalSpecification_Actor()
	 * @model containment="true"
	 * @generated
	 */
	EList<Actor> getActor();

	/**
	 * Returns the value of the '<em><b>Scope</b></em>' containment reference list.
	 * The list contents are of type {@link pt.fct.unl.novalincs.useme.model.GoalModeling.Scope}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scope</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scope</em>' containment reference list.
	 * @see pt.fct.unl.novalincs.useme.model.GoalModeling.GoalModelingPackage#getGoalSpecification_Scope()
	 * @model containment="true"
	 * @generated
	 */
	EList<Scope> getScope();

	/**
	 * Returns the value of the '<em><b>Success Coverage</b></em>' containment reference list.
	 * The list contents are of type {@link pt.fct.unl.novalincs.useme.model.GoalModeling.SuccessCoverage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Success Coverage</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Success Coverage</em>' containment reference list.
	 * @see pt.fct.unl.novalincs.useme.model.GoalModeling.GoalModelingPackage#getGoalSpecification_SuccessCoverage()
	 * @model containment="true"
	 * @generated
	 */
	EList<SuccessCoverage> getSuccessCoverage();

	/**
	 * Returns the value of the '<em><b>Goal Model</b></em>' containment reference list.
	 * The list contents are of type {@link pt.fct.unl.novalincs.useme.model.GoalModeling.GoalModel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Goal Model</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Goal Model</em>' containment reference list.
	 * @see pt.fct.unl.novalincs.useme.model.GoalModeling.GoalModelingPackage#getGoalSpecification_GoalModel()
	 * @model containment="true"
	 * @generated
	 */
	EList<GoalModel> getGoalModel();

} // GoalSpecification
