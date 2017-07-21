/**
 */
package pt.fct.unl.novalincs.useme.model.InteractionModeling.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import pt.fct.unl.novalincs.useme.model.InteractionModeling.Event;
import pt.fct.unl.novalincs.useme.model.InteractionModeling.InteractionModel;
import pt.fct.unl.novalincs.useme.model.InteractionModeling.InteractionModelingPackage;
import pt.fct.unl.novalincs.useme.model.InteractionModeling.InteractionResult;
import pt.fct.unl.novalincs.useme.model.InteractionModeling.InteractionSpecification;
import pt.fct.unl.novalincs.useme.model.InteractionModeling.InteractionSyntax;
import pt.fct.unl.novalincs.useme.model.InteractionModeling.Task;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interaction Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.InteractionModeling.impl.InteractionSpecificationImpl#getName <em>Name</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.InteractionModeling.impl.InteractionSpecificationImpl#getInteractionModel <em>Interaction Model</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.InteractionModeling.impl.InteractionSpecificationImpl#getInteractionSyntax <em>Interaction Syntax</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.InteractionModeling.impl.InteractionSpecificationImpl#getEvent <em>Event</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.InteractionModeling.impl.InteractionSpecificationImpl#getTask <em>Task</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.InteractionModeling.impl.InteractionSpecificationImpl#getInteractionResult <em>Interaction Result</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InteractionSpecificationImpl extends MinimalEObjectImpl.Container implements InteractionSpecification {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInteractionModel() <em>Interaction Model</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInteractionModel()
	 * @generated
	 * @ordered
	 */
	protected EList<InteractionModel> interactionModel;

	/**
	 * The cached value of the '{@link #getInteractionSyntax() <em>Interaction Syntax</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInteractionSyntax()
	 * @generated
	 * @ordered
	 */
	protected EList<InteractionSyntax> interactionSyntax;

	/**
	 * The cached value of the '{@link #getEvent() <em>Event</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvent()
	 * @generated
	 * @ordered
	 */
	protected EList<Event> event;

	/**
	 * The cached value of the '{@link #getTask() <em>Task</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTask()
	 * @generated
	 * @ordered
	 */
	protected EList<Task> task;

	/**
	 * The cached value of the '{@link #getInteractionResult() <em>Interaction Result</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInteractionResult()
	 * @generated
	 * @ordered
	 */
	protected EList<InteractionResult> interactionResult;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InteractionSpecificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InteractionModelingPackage.Literals.INTERACTION_SPECIFICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InteractionModelingPackage.INTERACTION_SPECIFICATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InteractionModel> getInteractionModel() {
		if (interactionModel == null) {
			interactionModel = new EObjectContainmentEList<InteractionModel>(InteractionModel.class, this, InteractionModelingPackage.INTERACTION_SPECIFICATION__INTERACTION_MODEL);
		}
		return interactionModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InteractionSyntax> getInteractionSyntax() {
		if (interactionSyntax == null) {
			interactionSyntax = new EObjectContainmentEList<InteractionSyntax>(InteractionSyntax.class, this, InteractionModelingPackage.INTERACTION_SPECIFICATION__INTERACTION_SYNTAX);
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
			event = new EObjectContainmentEList<Event>(Event.class, this, InteractionModelingPackage.INTERACTION_SPECIFICATION__EVENT);
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
			task = new EObjectContainmentEList<Task>(Task.class, this, InteractionModelingPackage.INTERACTION_SPECIFICATION__TASK);
		}
		return task;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InteractionResult> getInteractionResult() {
		if (interactionResult == null) {
			interactionResult = new EObjectContainmentEList<InteractionResult>(InteractionResult.class, this, InteractionModelingPackage.INTERACTION_SPECIFICATION__INTERACTION_RESULT);
		}
		return interactionResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InteractionModelingPackage.INTERACTION_SPECIFICATION__INTERACTION_MODEL:
				return ((InternalEList<?>)getInteractionModel()).basicRemove(otherEnd, msgs);
			case InteractionModelingPackage.INTERACTION_SPECIFICATION__INTERACTION_SYNTAX:
				return ((InternalEList<?>)getInteractionSyntax()).basicRemove(otherEnd, msgs);
			case InteractionModelingPackage.INTERACTION_SPECIFICATION__EVENT:
				return ((InternalEList<?>)getEvent()).basicRemove(otherEnd, msgs);
			case InteractionModelingPackage.INTERACTION_SPECIFICATION__TASK:
				return ((InternalEList<?>)getTask()).basicRemove(otherEnd, msgs);
			case InteractionModelingPackage.INTERACTION_SPECIFICATION__INTERACTION_RESULT:
				return ((InternalEList<?>)getInteractionResult()).basicRemove(otherEnd, msgs);
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
			case InteractionModelingPackage.INTERACTION_SPECIFICATION__NAME:
				return getName();
			case InteractionModelingPackage.INTERACTION_SPECIFICATION__INTERACTION_MODEL:
				return getInteractionModel();
			case InteractionModelingPackage.INTERACTION_SPECIFICATION__INTERACTION_SYNTAX:
				return getInteractionSyntax();
			case InteractionModelingPackage.INTERACTION_SPECIFICATION__EVENT:
				return getEvent();
			case InteractionModelingPackage.INTERACTION_SPECIFICATION__TASK:
				return getTask();
			case InteractionModelingPackage.INTERACTION_SPECIFICATION__INTERACTION_RESULT:
				return getInteractionResult();
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
			case InteractionModelingPackage.INTERACTION_SPECIFICATION__NAME:
				setName((String)newValue);
				return;
			case InteractionModelingPackage.INTERACTION_SPECIFICATION__INTERACTION_MODEL:
				getInteractionModel().clear();
				getInteractionModel().addAll((Collection<? extends InteractionModel>)newValue);
				return;
			case InteractionModelingPackage.INTERACTION_SPECIFICATION__INTERACTION_SYNTAX:
				getInteractionSyntax().clear();
				getInteractionSyntax().addAll((Collection<? extends InteractionSyntax>)newValue);
				return;
			case InteractionModelingPackage.INTERACTION_SPECIFICATION__EVENT:
				getEvent().clear();
				getEvent().addAll((Collection<? extends Event>)newValue);
				return;
			case InteractionModelingPackage.INTERACTION_SPECIFICATION__TASK:
				getTask().clear();
				getTask().addAll((Collection<? extends Task>)newValue);
				return;
			case InteractionModelingPackage.INTERACTION_SPECIFICATION__INTERACTION_RESULT:
				getInteractionResult().clear();
				getInteractionResult().addAll((Collection<? extends InteractionResult>)newValue);
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
			case InteractionModelingPackage.INTERACTION_SPECIFICATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case InteractionModelingPackage.INTERACTION_SPECIFICATION__INTERACTION_MODEL:
				getInteractionModel().clear();
				return;
			case InteractionModelingPackage.INTERACTION_SPECIFICATION__INTERACTION_SYNTAX:
				getInteractionSyntax().clear();
				return;
			case InteractionModelingPackage.INTERACTION_SPECIFICATION__EVENT:
				getEvent().clear();
				return;
			case InteractionModelingPackage.INTERACTION_SPECIFICATION__TASK:
				getTask().clear();
				return;
			case InteractionModelingPackage.INTERACTION_SPECIFICATION__INTERACTION_RESULT:
				getInteractionResult().clear();
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
			case InteractionModelingPackage.INTERACTION_SPECIFICATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case InteractionModelingPackage.INTERACTION_SPECIFICATION__INTERACTION_MODEL:
				return interactionModel != null && !interactionModel.isEmpty();
			case InteractionModelingPackage.INTERACTION_SPECIFICATION__INTERACTION_SYNTAX:
				return interactionSyntax != null && !interactionSyntax.isEmpty();
			case InteractionModelingPackage.INTERACTION_SPECIFICATION__EVENT:
				return event != null && !event.isEmpty();
			case InteractionModelingPackage.INTERACTION_SPECIFICATION__TASK:
				return task != null && !task.isEmpty();
			case InteractionModelingPackage.INTERACTION_SPECIFICATION__INTERACTION_RESULT:
				return interactionResult != null && !interactionResult.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //InteractionSpecificationImpl
