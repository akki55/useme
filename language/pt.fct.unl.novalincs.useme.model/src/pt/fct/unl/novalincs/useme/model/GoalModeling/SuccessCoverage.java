/**
 */
package pt.fct.unl.novalincs.useme.model.GoalModeling;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import pt.fct.unl.novalincs.useme.model.ReportModeling.EvaluationResultAbstract;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Success Coverage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.GoalModeling.SuccessCoverage#getName <em>Name</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.GoalModeling.SuccessCoverage#getUsabilityGoal <em>Usability Goal</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.GoalModeling.SuccessCoverage#getScope <em>Scope</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.GoalModeling.SuccessCoverage#getSuccessFactor <em>Success Factor</em>}</li>
 * </ul>
 *
 * @see pt.fct.unl.novalincs.useme.model.GoalModeling.GoalModelingPackage#getSuccessCoverage()
 * @model
 * @generated
 */
public interface SuccessCoverage extends EObject {
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
	 * @see pt.fct.unl.novalincs.useme.model.GoalModeling.GoalModelingPackage#getSuccessCoverage_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link pt.fct.unl.novalincs.useme.model.GoalModeling.SuccessCoverage#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Usability Goal</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link pt.fct.unl.novalincs.useme.model.GoalModeling.UsabilityGoal#getSuccessCoverage <em>Success Coverage</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Usability Goal</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usability Goal</em>' reference.
	 * @see #setUsabilityGoal(UsabilityGoal)
	 * @see pt.fct.unl.novalincs.useme.model.GoalModeling.GoalModelingPackage#getSuccessCoverage_UsabilityGoal()
	 * @see pt.fct.unl.novalincs.useme.model.GoalModeling.UsabilityGoal#getSuccessCoverage
	 * @model opposite="successCoverage" required="true" ordered="false"
	 * @generated
	 */
	UsabilityGoal getUsabilityGoal();

	/**
	 * Sets the value of the '{@link pt.fct.unl.novalincs.useme.model.GoalModeling.SuccessCoverage#getUsabilityGoal <em>Usability Goal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Usability Goal</em>' reference.
	 * @see #getUsabilityGoal()
	 * @generated
	 */
	void setUsabilityGoal(UsabilityGoal value);

	/**
	 * Returns the value of the '<em><b>Scope</b></em>' reference list.
	 * The list contents are of type {@link pt.fct.unl.novalincs.useme.model.GoalModeling.Scope}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scope</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scope</em>' reference list.
	 * @see pt.fct.unl.novalincs.useme.model.GoalModeling.GoalModelingPackage#getSuccessCoverage_Scope()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<Scope> getScope();

	/**
	 * Returns the value of the '<em><b>Success Factor</b></em>' reference list.
	 * The list contents are of type {@link pt.fct.unl.novalincs.useme.model.ReportModeling.EvaluationResultAbstract}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Success Factor</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Success Factor</em>' reference list.
	 * @see pt.fct.unl.novalincs.useme.model.GoalModeling.GoalModelingPackage#getSuccessCoverage_SuccessFactor()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<EvaluationResultAbstract> getSuccessFactor();

} // SuccessCoverage
