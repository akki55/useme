/**
 */
package pt.fct.unl.novalincs.useme.model.EvaluationModeling;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import pt.fct.unl.novalincs.useme.model.ContextModeling.UserProfile;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Participant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.EvaluationModeling.Participant#getName <em>Name</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.EvaluationModeling.Participant#getContact <em>Contact</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.EvaluationModeling.Participant#getEvaluationModel <em>Evaluation Model</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.EvaluationModeling.Participant#getUserProfile <em>User Profile</em>}</li>
 * </ul>
 *
 * @see pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationModelingPackage#getParticipant()
 * @model
 * @generated
 */
public interface Participant extends EObject {
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
	 * @see pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationModelingPackage#getParticipant_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link pt.fct.unl.novalincs.useme.model.EvaluationModeling.Participant#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Contact</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contact</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contact</em>' attribute list.
	 * @see pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationModelingPackage#getParticipant_Contact()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<String> getContact();

	/**
	 * Returns the value of the '<em><b>Evaluation Model</b></em>' reference list.
	 * The list contents are of type {@link pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationModel}.
	 * It is bidirectional and its opposite is '{@link pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationModel#getParticipant <em>Participant</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Evaluation Model</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Evaluation Model</em>' reference list.
	 * @see pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationModelingPackage#getParticipant_EvaluationModel()
	 * @see pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationModel#getParticipant
	 * @model opposite="participant" required="true" ordered="false"
	 * @generated
	 */
	EList<EvaluationModel> getEvaluationModel();

	/**
	 * Returns the value of the '<em><b>User Profile</b></em>' reference list.
	 * The list contents are of type {@link pt.fct.unl.novalincs.useme.model.ContextModeling.UserProfile}.
	 * It is bidirectional and its opposite is '{@link pt.fct.unl.novalincs.useme.model.ContextModeling.UserProfile#getParticipant <em>Participant</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Profile</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Profile</em>' reference list.
	 * @see pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationModelingPackage#getParticipant_UserProfile()
	 * @see pt.fct.unl.novalincs.useme.model.ContextModeling.UserProfile#getParticipant
	 * @model opposite="participant" required="true" ordered="false"
	 * @generated
	 */
	EList<UserProfile> getUserProfile();

} // Participant
