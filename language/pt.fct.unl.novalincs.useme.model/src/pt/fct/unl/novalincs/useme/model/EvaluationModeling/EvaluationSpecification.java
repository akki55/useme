/**
 */
package pt.fct.unl.novalincs.useme.model.EvaluationModeling;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Evaluation Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationSpecification#getName <em>Name</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationSpecification#getEvaluationModel <em>Evaluation Model</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationSpecification#getEvaluationGoal <em>Evaluation Goal</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationSpecification#getParticipant <em>Participant</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationSpecification#getDocumentaton <em>Documentaton</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationSpecification#getLanguage <em>Language</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationSpecification#getEvaluationContext <em>Evaluation Context</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationSpecification#getProcess <em>Process</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationSpecification#getTestModel <em>Test Model</em>}</li>
 * </ul>
 *
 * @see pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationModelingPackage#getEvaluationSpecification()
 * @model
 * @generated
 */
public interface EvaluationSpecification extends EObject {
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
	 * @see pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationModelingPackage#getEvaluationSpecification_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationSpecification#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Evaluation Model</b></em>' containment reference list.
	 * The list contents are of type {@link pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationModel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Evaluation Model</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Evaluation Model</em>' containment reference list.
	 * @see pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationModelingPackage#getEvaluationSpecification_EvaluationModel()
	 * @model containment="true"
	 * @generated
	 */
	EList<EvaluationModel> getEvaluationModel();

	/**
	 * Returns the value of the '<em><b>Evaluation Goal</b></em>' containment reference list.
	 * The list contents are of type {@link pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationGoal}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Evaluation Goal</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Evaluation Goal</em>' containment reference list.
	 * @see pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationModelingPackage#getEvaluationSpecification_EvaluationGoal()
	 * @model containment="true"
	 * @generated
	 */
	EList<EvaluationGoal> getEvaluationGoal();

	/**
	 * Returns the value of the '<em><b>Participant</b></em>' containment reference list.
	 * The list contents are of type {@link pt.fct.unl.novalincs.useme.model.EvaluationModeling.Participant}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Participant</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Participant</em>' containment reference list.
	 * @see pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationModelingPackage#getEvaluationSpecification_Participant()
	 * @model containment="true"
	 * @generated
	 */
	EList<Participant> getParticipant();

	/**
	 * Returns the value of the '<em><b>Documentaton</b></em>' containment reference list.
	 * The list contents are of type {@link pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationDocumentation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Documentaton</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Documentaton</em>' containment reference list.
	 * @see pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationModelingPackage#getEvaluationSpecification_Documentaton()
	 * @model containment="true"
	 * @generated
	 */
	EList<EvaluationDocumentation> getDocumentaton();

	/**
	 * Returns the value of the '<em><b>Language</b></em>' containment reference list.
	 * The list contents are of type {@link pt.fct.unl.novalincs.useme.model.EvaluationModeling.Language}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Language</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Language</em>' containment reference list.
	 * @see pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationModelingPackage#getEvaluationSpecification_Language()
	 * @model containment="true"
	 * @generated
	 */
	EList<Language> getLanguage();

	/**
	 * Returns the value of the '<em><b>Evaluation Context</b></em>' containment reference list.
	 * The list contents are of type {@link pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationContext}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Evaluation Context</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Evaluation Context</em>' containment reference list.
	 * @see pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationModelingPackage#getEvaluationSpecification_EvaluationContext()
	 * @model containment="true"
	 * @generated
	 */
	EList<EvaluationContext> getEvaluationContext();

	/**
	 * Returns the value of the '<em><b>Process</b></em>' containment reference list.
	 * The list contents are of type {@link pt.fct.unl.novalincs.useme.model.EvaluationModeling.Process}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Process</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Process</em>' containment reference list.
	 * @see pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationModelingPackage#getEvaluationSpecification_Process()
	 * @model containment="true"
	 * @generated
	 */
	EList<pt.fct.unl.novalincs.useme.model.EvaluationModeling.Process> getProcess();

	/**
	 * Returns the value of the '<em><b>Test Model</b></em>' containment reference list.
	 * The list contents are of type {@link pt.fct.unl.novalincs.useme.model.EvaluationModeling.TestModel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Test Model</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Model</em>' containment reference list.
	 * @see pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationModelingPackage#getEvaluationSpecification_TestModel()
	 * @model containment="true"
	 * @generated
	 */
	EList<TestModel> getTestModel();

} // EvaluationSpecification
