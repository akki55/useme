/**
 */
package pt.fct.unl.novalincs.useme.model.InteractionModeling;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import pt.fct.unl.novalincs.useme.model.GoalModeling.UsabilityRequirement;

import pt.fct.unl.novalincs.useme.model.Utility.RecordInput;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.InteractionModeling.Event#getName <em>Name</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.InteractionModeling.Event#getUsabilityRequirement <em>Usability Requirement</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.InteractionModeling.Event#getCapture <em>Capture</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.InteractionModeling.Event#getRecordEvent <em>Record Event</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.InteractionModeling.Event#isManual <em>Manual</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.InteractionModeling.Event#getAnalysisType <em>Analysis Type</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.InteractionModeling.Event#getInteractionModel <em>Interaction Model</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.InteractionModeling.Event#getCaptureAction <em>Capture Action</em>}</li>
 * </ul>
 *
 * @see pt.fct.unl.novalincs.useme.model.InteractionModeling.InteractionModelingPackage#getEvent()
 * @model
 * @generated
 */
public interface Event extends EObject {
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
	 * @see pt.fct.unl.novalincs.useme.model.InteractionModeling.InteractionModelingPackage#getEvent_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link pt.fct.unl.novalincs.useme.model.InteractionModeling.Event#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Usability Requirement</b></em>' reference list.
	 * The list contents are of type {@link pt.fct.unl.novalincs.useme.model.GoalModeling.UsabilityRequirement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Usability Requirement</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usability Requirement</em>' reference list.
	 * @see pt.fct.unl.novalincs.useme.model.InteractionModeling.InteractionModelingPackage#getEvent_UsabilityRequirement()
	 * @model
	 * @generated
	 */
	EList<UsabilityRequirement> getUsabilityRequirement();

	/**
	 * Returns the value of the '<em><b>Capture</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Capture</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capture</em>' attribute list.
	 * @see pt.fct.unl.novalincs.useme.model.InteractionModeling.InteractionModelingPackage#getEvent_Capture()
	 * @model
	 * @generated
	 */
	EList<String> getCapture();

	/**
	 * Returns the value of the '<em><b>Record Event</b></em>' attribute list.
	 * The list contents are of type {@link pt.fct.unl.novalincs.useme.model.Utility.RecordInput}.
	 * The literals are from the enumeration {@link pt.fct.unl.novalincs.useme.model.Utility.RecordInput}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Record Event</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Record Event</em>' attribute list.
	 * @see pt.fct.unl.novalincs.useme.model.Utility.RecordInput
	 * @see pt.fct.unl.novalincs.useme.model.InteractionModeling.InteractionModelingPackage#getEvent_RecordEvent()
	 * @model
	 * @generated
	 */
	EList<RecordInput> getRecordEvent();

	/**
	 * Returns the value of the '<em><b>Manual</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Manual</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Manual</em>' attribute.
	 * @see #setManual(boolean)
	 * @see pt.fct.unl.novalincs.useme.model.InteractionModeling.InteractionModelingPackage#getEvent_Manual()
	 * @model required="true"
	 * @generated
	 */
	boolean isManual();

	/**
	 * Sets the value of the '{@link pt.fct.unl.novalincs.useme.model.InteractionModeling.Event#isManual <em>Manual</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Manual</em>' attribute.
	 * @see #isManual()
	 * @generated
	 */
	void setManual(boolean value);

	/**
	 * Returns the value of the '<em><b>Analysis Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Analysis Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Analysis Type</em>' attribute.
	 * @see #setAnalysisType(String)
	 * @see pt.fct.unl.novalincs.useme.model.InteractionModeling.InteractionModelingPackage#getEvent_AnalysisType()
	 * @model
	 * @generated
	 */
	String getAnalysisType();

	/**
	 * Sets the value of the '{@link pt.fct.unl.novalincs.useme.model.InteractionModeling.Event#getAnalysisType <em>Analysis Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Analysis Type</em>' attribute.
	 * @see #getAnalysisType()
	 * @generated
	 */
	void setAnalysisType(String value);

	/**
	 * Returns the value of the '<em><b>Interaction Model</b></em>' reference list.
	 * The list contents are of type {@link pt.fct.unl.novalincs.useme.model.InteractionModeling.InteractionModel}.
	 * It is bidirectional and its opposite is '{@link pt.fct.unl.novalincs.useme.model.InteractionModeling.InteractionModel#getEvent <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interaction Model</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interaction Model</em>' reference list.
	 * @see pt.fct.unl.novalincs.useme.model.InteractionModeling.InteractionModelingPackage#getEvent_InteractionModel()
	 * @see pt.fct.unl.novalincs.useme.model.InteractionModeling.InteractionModel#getEvent
	 * @model opposite="event" required="true" ordered="false"
	 * @generated
	 */
	EList<InteractionModel> getInteractionModel();

	/**
	 * Returns the value of the '<em><b>Capture Action</b></em>' containment reference list.
	 * The list contents are of type {@link pt.fct.unl.novalincs.useme.model.InteractionModeling.CaptureAction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Capture Action</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capture Action</em>' containment reference list.
	 * @see pt.fct.unl.novalincs.useme.model.InteractionModeling.InteractionModelingPackage#getEvent_CaptureAction()
	 * @model containment="true"
	 * @generated
	 */
	EList<CaptureAction> getCaptureAction();

} // Event
