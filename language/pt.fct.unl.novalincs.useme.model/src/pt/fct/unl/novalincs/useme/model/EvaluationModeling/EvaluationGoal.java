/**
 */
package pt.fct.unl.novalincs.useme.model.EvaluationModeling;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import pt.fct.unl.novalincs.useme.model.GoalModeling.Actor;
import pt.fct.unl.novalincs.useme.model.GoalModeling.Method;
import pt.fct.unl.novalincs.useme.model.GoalModeling.UsabilityGoal;
import pt.fct.unl.novalincs.useme.model.GoalModeling.UsabilityRequirement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Evaluation Goal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationGoal#getName <em>Name</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationGoal#getEvaluationModel <em>Evaluation Model</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationGoal#isComperative <em>Comperative</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationGoal#getLanguage <em>Language</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationGoal#getResearchQuestion <em>Research Question</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationGoal#getUsabilityGoal <em>Usability Goal</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationGoal#getMesurment <em>Mesurment</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationGoal#getUsabilityRequirement <em>Usability Requirement</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationGoal#getHypothesis <em>Hypothesis</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationGoal#getResponsible <em>Responsible</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationGoal#getProblemDescription <em>Problem Description</em>}</li>
 * </ul>
 *
 * @see pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationModelingPackage#getEvaluationGoal()
 * @model
 * @generated
 */
public interface EvaluationGoal extends EObject {
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
	 * @see pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationModelingPackage#getEvaluationGoal_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationGoal#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Evaluation Model</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationModel#getEvaluationGoal <em>Evaluation Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Evaluation Model</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Evaluation Model</em>' reference.
	 * @see #setEvaluationModel(EvaluationModel)
	 * @see pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationModelingPackage#getEvaluationGoal_EvaluationModel()
	 * @see pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationModel#getEvaluationGoal
	 * @model opposite="evaluationGoal" required="true" ordered="false"
	 * @generated
	 */
	EvaluationModel getEvaluationModel();

	/**
	 * Sets the value of the '{@link pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationGoal#getEvaluationModel <em>Evaluation Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Evaluation Model</em>' reference.
	 * @see #getEvaluationModel()
	 * @generated
	 */
	void setEvaluationModel(EvaluationModel value);

	/**
	 * Returns the value of the '<em><b>Comperative</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comperative</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comperative</em>' attribute.
	 * @see #setComperative(boolean)
	 * @see pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationModelingPackage#getEvaluationGoal_Comperative()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isComperative();

	/**
	 * Sets the value of the '{@link pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationGoal#isComperative <em>Comperative</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comperative</em>' attribute.
	 * @see #isComperative()
	 * @generated
	 */
	void setComperative(boolean value);

	/**
	 * Returns the value of the '<em><b>Language</b></em>' reference list.
	 * The list contents are of type {@link pt.fct.unl.novalincs.useme.model.EvaluationModeling.Language}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Language</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Language</em>' reference list.
	 * @see pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationModelingPackage#getEvaluationGoal_Language()
	 * @model
	 * @generated
	 */
	EList<Language> getLanguage();

	/**
	 * Returns the value of the '<em><b>Research Question</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Research Question</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Research Question</em>' attribute list.
	 * @see pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationModelingPackage#getEvaluationGoal_ResearchQuestion()
	 * @model ordered="false"
	 * @generated
	 */
	EList<String> getResearchQuestion();

	/**
	 * Returns the value of the '<em><b>Usability Goal</b></em>' reference list.
	 * The list contents are of type {@link pt.fct.unl.novalincs.useme.model.GoalModeling.UsabilityGoal}.
	 * It is bidirectional and its opposite is '{@link pt.fct.unl.novalincs.useme.model.GoalModeling.UsabilityGoal#getEvaluationGoal <em>Evaluation Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Usability Goal</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usability Goal</em>' reference list.
	 * @see pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationModelingPackage#getEvaluationGoal_UsabilityGoal()
	 * @see pt.fct.unl.novalincs.useme.model.GoalModeling.UsabilityGoal#getEvaluationGoal
	 * @model opposite="evaluationGoal" required="true" ordered="false"
	 * @generated
	 */
	EList<UsabilityGoal> getUsabilityGoal();

	/**
	 * Returns the value of the '<em><b>Mesurment</b></em>' reference list.
	 * The list contents are of type {@link pt.fct.unl.novalincs.useme.model.GoalModeling.Method}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mesurment</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mesurment</em>' reference list.
	 * @see pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationModelingPackage#getEvaluationGoal_Mesurment()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Method> getMesurment();

	/**
	 * Returns the value of the '<em><b>Usability Requirement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Usability Requirement</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usability Requirement</em>' reference.
	 * @see #setUsabilityRequirement(UsabilityRequirement)
	 * @see pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationModelingPackage#getEvaluationGoal_UsabilityRequirement()
	 * @model
	 * @generated
	 */
	UsabilityRequirement getUsabilityRequirement();

	/**
	 * Sets the value of the '{@link pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationGoal#getUsabilityRequirement <em>Usability Requirement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Usability Requirement</em>' reference.
	 * @see #getUsabilityRequirement()
	 * @generated
	 */
	void setUsabilityRequirement(UsabilityRequirement value);

	/**
	 * Returns the value of the '<em><b>Hypothesis</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hypothesis</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hypothesis</em>' attribute list.
	 * @see pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationModelingPackage#getEvaluationGoal_Hypothesis()
	 * @model ordered="false"
	 * @generated
	 */
	EList<String> getHypothesis();

	/**
	 * Returns the value of the '<em><b>Responsible</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Responsible</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Responsible</em>' reference.
	 * @see #setResponsible(Actor)
	 * @see pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationModelingPackage#getEvaluationGoal_Responsible()
	 * @model
	 * @generated
	 */
	Actor getResponsible();

	/**
	 * Sets the value of the '{@link pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationGoal#getResponsible <em>Responsible</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Responsible</em>' reference.
	 * @see #getResponsible()
	 * @generated
	 */
	void setResponsible(Actor value);

	/**
	 * Returns the value of the '<em><b>Problem Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Problem Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Problem Description</em>' attribute.
	 * @see #setProblemDescription(String)
	 * @see pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationModelingPackage#getEvaluationGoal_ProblemDescription()
	 * @model
	 * @generated
	 */
	String getProblemDescription();

	/**
	 * Sets the value of the '{@link pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationGoal#getProblemDescription <em>Problem Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Problem Description</em>' attribute.
	 * @see #getProblemDescription()
	 * @generated
	 */
	void setProblemDescription(String value);

} // EvaluationGoal
