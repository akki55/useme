/**
 */
package pt.fct.unl.novalincs.useme.model.InteractionModeling;

import org.eclipse.emf.common.util.EList;

import pt.fct.unl.novalincs.useme.model.EvaluationModeling.TestModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interaction Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.InteractionModeling.InteractionModel#getInteractionResult <em>Interaction Result</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.InteractionModeling.InteractionModel#getInteractionSyntax <em>Interaction Syntax</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.InteractionModeling.InteractionModel#getEvent <em>Event</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.InteractionModeling.InteractionModel#getTask <em>Task</em>}</li>
 * </ul>
 *
 * @see pt.fct.unl.novalincs.useme.model.InteractionModeling.InteractionModelingPackage#getInteractionModel()
 * @model
 * @generated
 */
public interface InteractionModel extends TestModel {
	/**
	 * Returns the value of the '<em><b>Interaction Result</b></em>' reference list.
	 * The list contents are of type {@link pt.fct.unl.novalincs.useme.model.InteractionModeling.InteractionResult}.
	 * It is bidirectional and its opposite is '{@link pt.fct.unl.novalincs.useme.model.InteractionModeling.InteractionResult#getInteractionModel <em>Interaction Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interaction Result</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interaction Result</em>' reference list.
	 * @see pt.fct.unl.novalincs.useme.model.InteractionModeling.InteractionModelingPackage#getInteractionModel_InteractionResult()
	 * @see pt.fct.unl.novalincs.useme.model.InteractionModeling.InteractionResult#getInteractionModel
	 * @model opposite="interactionModel" ordered="false"
	 * @generated
	 */
	EList<InteractionResult> getInteractionResult();

	/**
	 * Returns the value of the '<em><b>Interaction Syntax</b></em>' reference list.
	 * The list contents are of type {@link pt.fct.unl.novalincs.useme.model.InteractionModeling.InteractionSyntax}.
	 * It is bidirectional and its opposite is '{@link pt.fct.unl.novalincs.useme.model.InteractionModeling.InteractionSyntax#getInteractionModel <em>Interaction Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interaction Syntax</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interaction Syntax</em>' reference list.
	 * @see pt.fct.unl.novalincs.useme.model.InteractionModeling.InteractionModelingPackage#getInteractionModel_InteractionSyntax()
	 * @see pt.fct.unl.novalincs.useme.model.InteractionModeling.InteractionSyntax#getInteractionModel
	 * @model opposite="interactionModel" required="true" ordered="false"
	 * @generated
	 */
	EList<InteractionSyntax> getInteractionSyntax();

	/**
	 * Returns the value of the '<em><b>Event</b></em>' reference list.
	 * The list contents are of type {@link pt.fct.unl.novalincs.useme.model.InteractionModeling.Event}.
	 * It is bidirectional and its opposite is '{@link pt.fct.unl.novalincs.useme.model.InteractionModeling.Event#getInteractionModel <em>Interaction Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event</em>' reference list.
	 * @see pt.fct.unl.novalincs.useme.model.InteractionModeling.InteractionModelingPackage#getInteractionModel_Event()
	 * @see pt.fct.unl.novalincs.useme.model.InteractionModeling.Event#getInteractionModel
	 * @model opposite="interactionModel" required="true" ordered="false"
	 * @generated
	 */
	EList<Event> getEvent();

	/**
	 * Returns the value of the '<em><b>Task</b></em>' reference list.
	 * The list contents are of type {@link pt.fct.unl.novalincs.useme.model.InteractionModeling.Task}.
	 * It is bidirectional and its opposite is '{@link pt.fct.unl.novalincs.useme.model.InteractionModeling.Task#getInteractionModel <em>Interaction Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Task</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Task</em>' reference list.
	 * @see pt.fct.unl.novalincs.useme.model.InteractionModeling.InteractionModelingPackage#getInteractionModel_Task()
	 * @see pt.fct.unl.novalincs.useme.model.InteractionModeling.Task#getInteractionModel
	 * @model opposite="interactionModel"
	 * @generated
	 */
	EList<Task> getTask();

} // InteractionModel
