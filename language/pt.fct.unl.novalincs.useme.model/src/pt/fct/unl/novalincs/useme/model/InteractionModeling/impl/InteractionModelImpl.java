/**
 */
package pt.fct.unl.novalincs.useme.model.InteractionModeling.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import pt.fct.unl.novalincs.useme.model.EvaluationModeling.impl.TestModelImpl;

import pt.fct.unl.novalincs.useme.model.InteractionModeling.Event;
import pt.fct.unl.novalincs.useme.model.InteractionModeling.InteractionModel;
import pt.fct.unl.novalincs.useme.model.InteractionModeling.InteractionModelingPackage;
import pt.fct.unl.novalincs.useme.model.InteractionModeling.InteractionResult;
import pt.fct.unl.novalincs.useme.model.InteractionModeling.InteractionSyntax;
import pt.fct.unl.novalincs.useme.model.InteractionModeling.Task;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interaction Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.InteractionModeling.impl.InteractionModelImpl#getInteractionResult <em>Interaction Result</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.InteractionModeling.impl.InteractionModelImpl#getInteractionSyntax <em>Interaction Syntax</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.InteractionModeling.impl.InteractionModelImpl#getEvent <em>Event</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.InteractionModeling.impl.InteractionModelImpl#getTask <em>Task</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InteractionModelImpl extends TestModelImpl implements InteractionModel {
	/**
	 * The cached value of the '{@link #getInteractionResult() <em>Interaction Result</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInteractionResult()
	 * @generated
	 * @ordered
	 */
	protected EList<InteractionResult> interactionResult;

	/**
	 * The cached value of the '{@link #getInteractionSyntax() <em>Interaction Syntax</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInteractionSyntax()
	 * @generated
	 * @ordered
	 */
	protected EList<InteractionSyntax> interactionSyntax;

	/**
	 * The cached value of the '{@link #getEvent() <em>Event</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvent()
	 * @generated
	 * @ordered
	 */
	protected EList<Event> event;

	/**
	 * The cached value of the '{@link #getTask() <em>Task</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTask()
	 * @generated
	 * @ordered
	 */
	protected EList<Task> task;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InteractionModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InteractionModelingPackage.Literals.INTERACTION_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InteractionResult> getInteractionResult() {
		if (interactionResult == null) {
			interactionResult = new EObjectWithInverseResolvingEList<InteractionResult>(InteractionResult.class, this, InteractionModelingPackage.INTERACTION_MODEL__INTERACTION_RESULT, InteractionModelingPackage.INTERACTION_RESULT__INTERACTION_MODEL);
		}
		return interactionResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InteractionSyntax> getInteractionSyntax() {
		if (interactionSyntax == null) {
			interactionSyntax = new EObjectWithInverseResolvingEList.ManyInverse<InteractionSyntax>(InteractionSyntax.class, this, InteractionModelingPackage.INTERACTION_MODEL__INTERACTION_SYNTAX, InteractionModelingPackage.INTERACTION_SYNTAX__INTERACTION_MODEL);
		}
		return interactionSyntax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Event> getEvent() {
		if (event == null) {
			event = new EObjectWithInverseResolvingEList.ManyInverse<Event>(Event.class, this, InteractionModelingPackage.INTERACTION_MODEL__EVENT, InteractionModelingPackage.EVENT__INTERACTION_MODEL);
		}
		return event;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Task> getTask() {
		if (task == null) {
			task = new EObjectWithInverseResolvingEList.ManyInverse<Task>(Task.class, this, InteractionModelingPackage.INTERACTION_MODEL__TASK, InteractionModelingPackage.TASK__INTERACTION_MODEL);
		}
		return task;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InteractionModelingPackage.INTERACTION_MODEL__INTERACTION_RESULT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInteractionResult()).basicAdd(otherEnd, msgs);
			case InteractionModelingPackage.INTERACTION_MODEL__INTERACTION_SYNTAX:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInteractionSyntax()).basicAdd(otherEnd, msgs);
			case InteractionModelingPackage.INTERACTION_MODEL__EVENT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEvent()).basicAdd(otherEnd, msgs);
			case InteractionModelingPackage.INTERACTION_MODEL__TASK:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTask()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InteractionModelingPackage.INTERACTION_MODEL__INTERACTION_RESULT:
				return ((InternalEList<?>)getInteractionResult()).basicRemove(otherEnd, msgs);
			case InteractionModelingPackage.INTERACTION_MODEL__INTERACTION_SYNTAX:
				return ((InternalEList<?>)getInteractionSyntax()).basicRemove(otherEnd, msgs);
			case InteractionModelingPackage.INTERACTION_MODEL__EVENT:
				return ((InternalEList<?>)getEvent()).basicRemove(otherEnd, msgs);
			case InteractionModelingPackage.INTERACTION_MODEL__TASK:
				return ((InternalEList<?>)getTask()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InteractionModelingPackage.INTERACTION_MODEL__INTERACTION_RESULT:
				return getInteractionResult();
			case InteractionModelingPackage.INTERACTION_MODEL__INTERACTION_SYNTAX:
				return getInteractionSyntax();
			case InteractionModelingPackage.INTERACTION_MODEL__EVENT:
				return getEvent();
			case InteractionModelingPackage.INTERACTION_MODEL__TASK:
				return getTask();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case InteractionModelingPackage.INTERACTION_MODEL__INTERACTION_RESULT:
				getInteractionResult().clear();
				getInteractionResult().addAll((Collection<? extends InteractionResult>)newValue);
				return;
			case InteractionModelingPackage.INTERACTION_MODEL__INTERACTION_SYNTAX:
				getInteractionSyntax().clear();
				getInteractionSyntax().addAll((Collection<? extends InteractionSyntax>)newValue);
				return;
			case InteractionModelingPackage.INTERACTION_MODEL__EVENT:
				getEvent().clear();
				getEvent().addAll((Collection<? extends Event>)newValue);
				return;
			case InteractionModelingPackage.INTERACTION_MODEL__TASK:
				getTask().clear();
				getTask().addAll((Collection<? extends Task>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case InteractionModelingPackage.INTERACTION_MODEL__INTERACTION_RESULT:
				getInteractionResult().clear();
				return;
			case InteractionModelingPackage.INTERACTION_MODEL__INTERACTION_SYNTAX:
				getInteractionSyntax().clear();
				return;
			case InteractionModelingPackage.INTERACTION_MODEL__EVENT:
				getEvent().clear();
				return;
			case InteractionModelingPackage.INTERACTION_MODEL__TASK:
				getTask().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case InteractionModelingPackage.INTERACTION_MODEL__INTERACTION_RESULT:
				return interactionResult != null && !interactionResult.isEmpty();
			case InteractionModelingPackage.INTERACTION_MODEL__INTERACTION_SYNTAX:
				return interactionSyntax != null && !interactionSyntax.isEmpty();
			case InteractionModelingPackage.INTERACTION_MODEL__EVENT:
				return event != null && !event.isEmpty();
			case InteractionModelingPackage.INTERACTION_MODEL__TASK:
				return task != null && !task.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //InteractionModelImpl
