/**
 */
package pt.fct.unl.novalincs.useme.model.EvaluationModeling;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Evaluation Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationModel#getName <em>Name</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationModel#getEvaluationGoal <em>Evaluation Goal</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationModel#getEvaluationContext <em>Evaluation Context</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationModel#getLanguage <em>Language</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationModel#getProcess <em>Process</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationModel#getTestModel <em>Test Model</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationModel#getDoc <em>Doc</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationModel#getParticipant <em>Participant</em>}</li>
 * </ul>
 *
 * @see pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationModelingPackage#getEvaluationModel()
 * @model
 * @generated
 */
public interface EvaluationModel extends EObject {
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
	 * @see pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationModelingPackage#getEvaluationModel_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationModel#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Evaluation Goal</b></em>' reference list.
	 * The list contents are of type {@link pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationGoal}.
	 * It is bidirectional and its opposite is '{@link pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationGoal#getEvaluationModel <em>Evaluation Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Evaluation Goal</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Evaluation Goal</em>' reference list.
	 * @see pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationModelingPackage#getEvaluationModel_EvaluationGoal()
	 * @see pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationGoal#getEvaluationModel
	 * @model opposite="evaluationModel" required="true" ordered="false"
	 * @generated
	 */
	EList<EvaluationGoal> getEvaluationGoal();

	/**
	 * Returns the value of the '<em><b>Evaluation Context</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationContext#getEvaluationModel <em>Evaluation Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Evaluation Context</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Evaluation Context</em>' reference.
	 * @see #setEvaluationContext(EvaluationContext)
	 * @see pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationModelingPackage#getEvaluationModel_EvaluationContext()
	 * @see pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationContext#getEvaluationModel
	 * @model opposite="evaluationModel" required="true" ordered="false"
	 * @generated
	 */
	EvaluationContext getEvaluationContext();

	/**
	 * Sets the value of the '{@link pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationModel#getEvaluationContext <em>Evaluation Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Evaluation Context</em>' reference.
	 * @see #getEvaluationContext()
	 * @generated
	 */
	void setEvaluationContext(EvaluationContext value);

	/**
	 * Returns the value of the '<em><b>Language</b></em>' reference list.
	 * The list contents are of type {@link pt.fct.unl.novalincs.useme.model.EvaluationModeling.Language}.
	 * It is bidirectional and its opposite is '{@link pt.fct.unl.novalincs.useme.model.EvaluationModeling.Language#getEvaluationModel <em>Evaluation Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Language</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Language</em>' reference list.
	 * @see pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationModelingPackage#getEvaluationModel_Language()
	 * @see pt.fct.unl.novalincs.useme.model.EvaluationModeling.Language#getEvaluationModel
	 * @model opposite="evaluationModel" required="true" ordered="false"
	 * @generated
	 */
	EList<Language> getLanguage();

	/**
	 * Returns the value of the '<em><b>Process</b></em>' reference list.
	 * The list contents are of type {@link pt.fct.unl.novalincs.useme.model.EvaluationModeling.Process}.
	 * It is bidirectional and its opposite is '{@link pt.fct.unl.novalincs.useme.model.EvaluationModeling.Process#getEvaluationModel <em>Evaluation Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Process</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Process</em>' reference list.
	 * @see pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationModelingPackage#getEvaluationModel_Process()
	 * @see pt.fct.unl.novalincs.useme.model.EvaluationModeling.Process#getEvaluationModel
	 * @model opposite="evaluationModel" required="true" ordered="false"
	 * @generated
	 */
	EList<pt.fct.unl.novalincs.useme.model.EvaluationModeling.Process> getProcess();

	/**
	 * Returns the value of the '<em><b>Test Model</b></em>' reference list.
	 * The list contents are of type {@link pt.fct.unl.novalincs.useme.model.EvaluationModeling.TestModel}.
	 * It is bidirectional and its opposite is '{@link pt.fct.unl.novalincs.useme.model.EvaluationModeling.TestModel#getEvaluationModel <em>Evaluation Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Test Model</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Model</em>' reference list.
	 * @see pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationModelingPackage#getEvaluationModel_TestModel()
	 * @see pt.fct.unl.novalincs.useme.model.EvaluationModeling.TestModel#getEvaluationModel
	 * @model opposite="evaluationModel" required="true" ordered="false"
	 * @generated
	 */
	EList<TestModel> getTestModel();

	/**
	 * Returns the value of the '<em><b>Doc</b></em>' reference list.
	 * The list contents are of type {@link pt.fct.unl.novalincs.useme.model.EvaluationModeling.Documentation}.
	 * It is bidirectional and its opposite is '{@link pt.fct.unl.novalincs.useme.model.EvaluationModeling.Documentation#getEvaluationModel <em>Evaluation Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Doc</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Doc</em>' reference list.
	 * @see pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationModelingPackage#getEvaluationModel_Doc()
	 * @see pt.fct.unl.novalincs.useme.model.EvaluationModeling.Documentation#getEvaluationModel
	 * @model opposite="evaluationModel" ordered="false"
	 * @generated
	 */
	EList<Documentation> getDoc();

	/**
	 * Returns the value of the '<em><b>Participant</b></em>' reference list.
	 * The list contents are of type {@link pt.fct.unl.novalincs.useme.model.EvaluationModeling.Participant}.
	 * It is bidirectional and its opposite is '{@link pt.fct.unl.novalincs.useme.model.EvaluationModeling.Participant#getEvaluationModel <em>Evaluation Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Participant</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Participant</em>' reference list.
	 * @see pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationModelingPackage#getEvaluationModel_Participant()
	 * @see pt.fct.unl.novalincs.useme.model.EvaluationModeling.Participant#getEvaluationModel
	 * @model opposite="evaluationModel" required="true" ordered="false"
	 * @generated
	 */
	EList<Participant> getParticipant();

} // EvaluationModel
