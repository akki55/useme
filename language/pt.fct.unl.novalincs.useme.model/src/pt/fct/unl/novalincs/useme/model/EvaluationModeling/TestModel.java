/**
 */
package pt.fct.unl.novalincs.useme.model.EvaluationModeling;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.EvaluationModeling.TestModel#getName <em>Name</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.EvaluationModeling.TestModel#getEvaluationModel <em>Evaluation Model</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.EvaluationModeling.TestModel#getParticipant <em>Participant</em>}</li>
 * </ul>
 *
 * @see pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationModelingPackage#getTestModel()
 * @model
 * @generated
 */
public interface TestModel extends EObject {
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
	 * @see pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationModelingPackage#getTestModel_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link pt.fct.unl.novalincs.useme.model.EvaluationModeling.TestModel#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Evaluation Model</b></em>' reference list.
	 * The list contents are of type {@link pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationModel}.
	 * It is bidirectional and its opposite is '{@link pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationModel#getTestModel <em>Test Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Evaluation Model</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Evaluation Model</em>' reference list.
	 * @see pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationModelingPackage#getTestModel_EvaluationModel()
	 * @see pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationModel#getTestModel
	 * @model opposite="testModel" required="true" ordered="false"
	 * @generated
	 */
	EList<EvaluationModel> getEvaluationModel();

	/**
	 * Returns the value of the '<em><b>Participant</b></em>' reference list.
	 * The list contents are of type {@link pt.fct.unl.novalincs.useme.model.EvaluationModeling.Participant}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Participant</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Participant</em>' reference list.
	 * @see pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationModelingPackage#getTestModel_Participant()
	 * @model
	 * @generated
	 */
	EList<Participant> getParticipant();

} // TestModel
