/**
 */
package pt.fct.unl.novalincs.useme.model.GoalModeling;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationGoal;

import pt.fct.unl.novalincs.useme.model.Utility.FunctionalGoal;
import pt.fct.unl.novalincs.useme.model.Utility.PriorityValue;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Usability Goal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.GoalModeling.UsabilityGoal#getName <em>Name</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.GoalModeling.UsabilityGoal#getResponsibleActor <em>Responsible Actor</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.GoalModeling.UsabilityGoal#getPriority <em>Priority</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.GoalModeling.UsabilityGoal#getQuestion <em>Question</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.GoalModeling.UsabilityGoal#getMethod <em>Method</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.GoalModeling.UsabilityGoal#getSuccessCoverage <em>Success Coverage</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.GoalModeling.UsabilityGoal#getProvidedFunctionality <em>Provided Functionality</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.GoalModeling.UsabilityGoal#getScope <em>Scope</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.GoalModeling.UsabilityGoal#getSubGoal <em>Sub Goal</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.GoalModeling.UsabilityGoal#getEvaluationGoal <em>Evaluation Goal</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.GoalModeling.UsabilityGoal#getGoalModel <em>Goal Model</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.GoalModeling.UsabilityGoal#getParentGoal <em>Parent Goal</em>}</li>
 * </ul>
 *
 * @see pt.fct.unl.novalincs.useme.model.GoalModeling.GoalModelingPackage#getUsabilityGoal()
 * @model
 * @generated
 */
public interface UsabilityGoal extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>"Quality in Use"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see pt.fct.unl.novalincs.useme.model.GoalModeling.GoalModelingPackage#getUsabilityGoal_Name()
	 * @model default="Quality in Use" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link pt.fct.unl.novalincs.useme.model.GoalModeling.UsabilityGoal#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Responsible Actor</b></em>' reference list.
	 * The list contents are of type {@link pt.fct.unl.novalincs.useme.model.GoalModeling.Actor}.
	 * It is bidirectional and its opposite is '{@link pt.fct.unl.novalincs.useme.model.GoalModeling.Actor#getResponsibleFor <em>Responsible For</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Responsible Actor</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Responsible Actor</em>' reference list.
	 * @see pt.fct.unl.novalincs.useme.model.GoalModeling.GoalModelingPackage#getUsabilityGoal_ResponsibleActor()
	 * @see pt.fct.unl.novalincs.useme.model.GoalModeling.Actor#getResponsibleFor
	 * @model opposite="responsibleFor" ordered="false"
	 * @generated
	 */
	EList<Actor> getResponsibleActor();

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
	 * @see pt.fct.unl.novalincs.useme.model.GoalModeling.GoalModelingPackage#getUsabilityGoal_Priority()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	PriorityValue getPriority();

	/**
	 * Sets the value of the '{@link pt.fct.unl.novalincs.useme.model.GoalModeling.UsabilityGoal#getPriority <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' attribute.
	 * @see pt.fct.unl.novalincs.useme.model.Utility.PriorityValue
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(PriorityValue value);

	/**
	 * Returns the value of the '<em><b>Question</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Question</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Question</em>' attribute.
	 * @see #setQuestion(String)
	 * @see pt.fct.unl.novalincs.useme.model.GoalModeling.GoalModelingPackage#getUsabilityGoal_Question()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getQuestion();

	/**
	 * Sets the value of the '{@link pt.fct.unl.novalincs.useme.model.GoalModeling.UsabilityGoal#getQuestion <em>Question</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Question</em>' attribute.
	 * @see #getQuestion()
	 * @generated
	 */
	void setQuestion(String value);

	/**
	 * Returns the value of the '<em><b>Method</b></em>' reference list.
	 * The list contents are of type {@link pt.fct.unl.novalincs.useme.model.GoalModeling.Method}.
	 * It is bidirectional and its opposite is '{@link pt.fct.unl.novalincs.useme.model.GoalModeling.Method#getUsabilityGoal <em>Usability Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Method</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method</em>' reference list.
	 * @see pt.fct.unl.novalincs.useme.model.GoalModeling.GoalModelingPackage#getUsabilityGoal_Method()
	 * @see pt.fct.unl.novalincs.useme.model.GoalModeling.Method#getUsabilityGoal
	 * @model opposite="usabilityGoal" ordered="false"
	 * @generated
	 */
	EList<Method> getMethod();

	/**
	 * Returns the value of the '<em><b>Success Coverage</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link pt.fct.unl.novalincs.useme.model.GoalModeling.SuccessCoverage#getUsabilityGoal <em>Usability Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Success Coverage</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Success Coverage</em>' reference.
	 * @see #setSuccessCoverage(SuccessCoverage)
	 * @see pt.fct.unl.novalincs.useme.model.GoalModeling.GoalModelingPackage#getUsabilityGoal_SuccessCoverage()
	 * @see pt.fct.unl.novalincs.useme.model.GoalModeling.SuccessCoverage#getUsabilityGoal
	 * @model opposite="usabilityGoal" ordered="false"
	 * @generated
	 */
	SuccessCoverage getSuccessCoverage();

	/**
	 * Sets the value of the '{@link pt.fct.unl.novalincs.useme.model.GoalModeling.UsabilityGoal#getSuccessCoverage <em>Success Coverage</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Success Coverage</em>' reference.
	 * @see #getSuccessCoverage()
	 * @generated
	 */
	void setSuccessCoverage(SuccessCoverage value);

	/**
	 * Returns the value of the '<em><b>Provided Functionality</b></em>' reference list.
	 * The list contents are of type {@link pt.fct.unl.novalincs.useme.model.Utility.FunctionalGoal}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provided Functionality</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provided Functionality</em>' reference list.
	 * @see pt.fct.unl.novalincs.useme.model.GoalModeling.GoalModelingPackage#getUsabilityGoal_ProvidedFunctionality()
	 * @model ordered="false"
	 * @generated
	 */
	EList<FunctionalGoal> getProvidedFunctionality();

	/**
	 * Returns the value of the '<em><b>Scope</b></em>' reference list.
	 * The list contents are of type {@link pt.fct.unl.novalincs.useme.model.GoalModeling.Scope}.
	 * It is bidirectional and its opposite is '{@link pt.fct.unl.novalincs.useme.model.GoalModeling.Scope#getUsabilityGoal <em>Usability Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scope</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scope</em>' reference list.
	 * @see pt.fct.unl.novalincs.useme.model.GoalModeling.GoalModelingPackage#getUsabilityGoal_Scope()
	 * @see pt.fct.unl.novalincs.useme.model.GoalModeling.Scope#getUsabilityGoal
	 * @model opposite="usabilityGoal" required="true" ordered="false"
	 * @generated
	 */
	EList<Scope> getScope();

	/**
	 * Returns the value of the '<em><b>Sub Goal</b></em>' reference list.
	 * The list contents are of type {@link pt.fct.unl.novalincs.useme.model.GoalModeling.UsabilityGoal}.
	 * It is bidirectional and its opposite is '{@link pt.fct.unl.novalincs.useme.model.GoalModeling.UsabilityGoal#getParentGoal <em>Parent Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Goal</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Goal</em>' reference list.
	 * @see pt.fct.unl.novalincs.useme.model.GoalModeling.GoalModelingPackage#getUsabilityGoal_SubGoal()
	 * @see pt.fct.unl.novalincs.useme.model.GoalModeling.UsabilityGoal#getParentGoal
	 * @model opposite="parentGoal" ordered="false"
	 * @generated
	 */
	EList<UsabilityGoal> getSubGoal();

	/**
	 * Returns the value of the '<em><b>Evaluation Goal</b></em>' reference list.
	 * The list contents are of type {@link pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationGoal}.
	 * It is bidirectional and its opposite is '{@link pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationGoal#getUsabilityGoal <em>Usability Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Evaluation Goal</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Evaluation Goal</em>' reference list.
	 * @see pt.fct.unl.novalincs.useme.model.GoalModeling.GoalModelingPackage#getUsabilityGoal_EvaluationGoal()
	 * @see pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationGoal#getUsabilityGoal
	 * @model opposite="usabilityGoal" ordered="false"
	 * @generated
	 */
	EList<EvaluationGoal> getEvaluationGoal();

	/**
	 * Returns the value of the '<em><b>Goal Model</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link pt.fct.unl.novalincs.useme.model.GoalModeling.GoalModel#getUsabilityGoal <em>Usability Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Goal Model</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Goal Model</em>' container reference.
	 * @see #setGoalModel(GoalModel)
	 * @see pt.fct.unl.novalincs.useme.model.GoalModeling.GoalModelingPackage#getUsabilityGoal_GoalModel()
	 * @see pt.fct.unl.novalincs.useme.model.GoalModeling.GoalModel#getUsabilityGoal
	 * @model opposite="usabilityGoal" required="true" transient="false" ordered="false"
	 * @generated
	 */
	GoalModel getGoalModel();

	/**
	 * Sets the value of the '{@link pt.fct.unl.novalincs.useme.model.GoalModeling.UsabilityGoal#getGoalModel <em>Goal Model</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Goal Model</em>' container reference.
	 * @see #getGoalModel()
	 * @generated
	 */
	void setGoalModel(GoalModel value);

	/**
	 * Returns the value of the '<em><b>Parent Goal</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link pt.fct.unl.novalincs.useme.model.GoalModeling.UsabilityGoal#getSubGoal <em>Sub Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Goal</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Goal</em>' reference.
	 * @see #setParentGoal(UsabilityGoal)
	 * @see pt.fct.unl.novalincs.useme.model.GoalModeling.GoalModelingPackage#getUsabilityGoal_ParentGoal()
	 * @see pt.fct.unl.novalincs.useme.model.GoalModeling.UsabilityGoal#getSubGoal
	 * @model opposite="subGoal"
	 * @generated
	 */
	UsabilityGoal getParentGoal();

	/**
	 * Sets the value of the '{@link pt.fct.unl.novalincs.useme.model.GoalModeling.UsabilityGoal#getParentGoal <em>Parent Goal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Goal</em>' reference.
	 * @see #getParentGoal()
	 * @generated
	 */
	void setParentGoal(UsabilityGoal value);

} // UsabilityGoal
