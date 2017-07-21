/**
 */
package pt.fct.unl.novalincs.useme.model.GoalModeling;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import pt.fct.unl.novalincs.useme.model.Utility.DSL;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Goal Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.GoalModeling.GoalModel#getName <em>Name</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.GoalModeling.GoalModel#getLanguage <em>Language</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.GoalModeling.GoalModel#getUsabilityGoal <em>Usability Goal</em>}</li>
 * </ul>
 *
 * @see pt.fct.unl.novalincs.useme.model.GoalModeling.GoalModelingPackage#getGoalModel()
 * @model
 * @generated
 */
public interface GoalModel extends EObject {
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
	 * @see pt.fct.unl.novalincs.useme.model.GoalModeling.GoalModelingPackage#getGoalModel_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link pt.fct.unl.novalincs.useme.model.GoalModeling.GoalModel#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Language</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Language</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Language</em>' reference.
	 * @see #setLanguage(DSL)
	 * @see pt.fct.unl.novalincs.useme.model.GoalModeling.GoalModelingPackage#getGoalModel_Language()
	 * @model ordered="false"
	 * @generated
	 */
	DSL getLanguage();

	/**
	 * Sets the value of the '{@link pt.fct.unl.novalincs.useme.model.GoalModeling.GoalModel#getLanguage <em>Language</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language</em>' reference.
	 * @see #getLanguage()
	 * @generated
	 */
	void setLanguage(DSL value);

	/**
	 * Returns the value of the '<em><b>Usability Goal</b></em>' containment reference list.
	 * The list contents are of type {@link pt.fct.unl.novalincs.useme.model.GoalModeling.UsabilityGoal}.
	 * It is bidirectional and its opposite is '{@link pt.fct.unl.novalincs.useme.model.GoalModeling.UsabilityGoal#getGoalModel <em>Goal Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Usability Goal</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usability Goal</em>' containment reference list.
	 * @see pt.fct.unl.novalincs.useme.model.GoalModeling.GoalModelingPackage#getGoalModel_UsabilityGoal()
	 * @see pt.fct.unl.novalincs.useme.model.GoalModeling.UsabilityGoal#getGoalModel
	 * @model opposite="goalModel" containment="true" required="true" ordered="false"
	 * @generated
	 */
	EList<UsabilityGoal> getUsabilityGoal();

} // GoalModel
