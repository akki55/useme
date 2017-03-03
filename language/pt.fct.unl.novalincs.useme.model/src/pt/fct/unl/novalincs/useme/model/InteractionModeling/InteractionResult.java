/**
 */
package pt.fct.unl.novalincs.useme.model.InteractionModeling;

import org.eclipse.emf.common.util.EList;
import pt.fct.unl.novalincs.useme.model.ReportModeling.EvaluationResultAbstract;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interaction Result</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.InteractionModeling.InteractionResult#getInteractionModel <em>Interaction Model</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.InteractionModeling.InteractionResult#getEvent <em>Event</em>}</li>
 * </ul>
 *
 * @see pt.fct.unl.novalincs.useme.model.InteractionModeling.InteractionModelingPackage#getInteractionResult()
 * @model
 * @generated
 */
public interface InteractionResult extends EvaluationResultAbstract {
	/**
	 * Returns the value of the '<em><b>Interaction Model</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link pt.fct.unl.novalincs.useme.model.InteractionModeling.InteractionModel#getInteractionResult <em>Interaction Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interaction Model</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interaction Model</em>' reference.
	 * @see #setInteractionModel(InteractionModel)
	 * @see pt.fct.unl.novalincs.useme.model.InteractionModeling.InteractionModelingPackage#getInteractionResult_InteractionModel()
	 * @see pt.fct.unl.novalincs.useme.model.InteractionModeling.InteractionModel#getInteractionResult
	 * @model opposite="interactionResult" required="true" ordered="false"
	 * @generated
	 */
	InteractionModel getInteractionModel();

	/**
	 * Sets the value of the '{@link pt.fct.unl.novalincs.useme.model.InteractionModeling.InteractionResult#getInteractionModel <em>Interaction Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interaction Model</em>' reference.
	 * @see #getInteractionModel()
	 * @generated
	 */
	void setInteractionModel(InteractionModel value);

	/**
	 * Returns the value of the '<em><b>Event</b></em>' reference list.
	 * The list contents are of type {@link pt.fct.unl.novalincs.useme.model.InteractionModeling.Event}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event</em>' reference list.
	 * @see pt.fct.unl.novalincs.useme.model.InteractionModeling.InteractionModelingPackage#getInteractionResult_Event()
	 * @model required="true"
	 * @generated
	 */
	EList<Event> getEvent();

} // InteractionResult
