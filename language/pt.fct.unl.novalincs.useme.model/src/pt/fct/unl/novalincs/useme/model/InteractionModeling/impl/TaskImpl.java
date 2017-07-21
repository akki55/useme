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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import pt.fct.unl.novalincs.useme.model.ContextModeling.ContextModelingPackage;
import pt.fct.unl.novalincs.useme.model.ContextModeling.Scenario;

import pt.fct.unl.novalincs.useme.model.EvaluationModeling.Documentation;

import pt.fct.unl.novalincs.useme.model.InteractionModeling.InteractionModel;
import pt.fct.unl.novalincs.useme.model.InteractionModeling.InteractionModelingPackage;
import pt.fct.unl.novalincs.useme.model.InteractionModeling.Task;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.InteractionModeling.impl.TaskImpl#getName <em>Name</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.InteractionModeling.impl.TaskImpl#getScenario <em>Scenario</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.InteractionModeling.impl.TaskImpl#getInteractionModel <em>Interaction Model</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.InteractionModeling.impl.TaskImpl#getDocumentation <em>Documentation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TaskImpl extends MinimalEObjectImpl.Container implements Task {
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
	 * The cached value of the '{@link #getScenario() <em>Scenario</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScenario()
	 * @generated
	 * @ordered
	 */
	protected EList<Scenario> scenario;

	/**
	 * The cached value of the '{@link #getInteractionModel() <em>Interaction Model</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInteractionModel()
	 * @generated
	 * @ordered
	 */
	protected EList<InteractionModel> interactionModel;

	/**
	 * The cached value of the '{@link #getDocumentation() <em>Documentation</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentation()
	 * @generated
	 * @ordered
	 */
	protected EList<Documentation> documentation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InteractionModelingPackage.Literals.TASK;
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
			eNotify(new ENotificationImpl(this, Notification.SET, InteractionModelingPackage.TASK__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Scenario> getScenario() {
		if (scenario == null) {
			scenario = new EObjectWithInverseResolvingEList.ManyInverse<Scenario>(Scenario.class, this, InteractionModelingPackage.TASK__SCENARIO, ContextModelingPackage.SCENARIO__EVALUATED_TASK);
		}
		return scenario;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InteractionModel> getInteractionModel() {
		if (interactionModel == null) {
			interactionModel = new EObjectWithInverseResolvingEList.ManyInverse<InteractionModel>(InteractionModel.class, this, InteractionModelingPackage.TASK__INTERACTION_MODEL, InteractionModelingPackage.INTERACTION_MODEL__TASK);
		}
		return interactionModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Documentation> getDocumentation() {
		if (documentation == null) {
			documentation = new EObjectResolvingEList<Documentation>(Documentation.class, this, InteractionModelingPackage.TASK__DOCUMENTATION);
		}
		return documentation;
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
			case InteractionModelingPackage.TASK__SCENARIO:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getScenario()).basicAdd(otherEnd, msgs);
			case InteractionModelingPackage.TASK__INTERACTION_MODEL:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInteractionModel()).basicAdd(otherEnd, msgs);
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
			case InteractionModelingPackage.TASK__SCENARIO:
				return ((InternalEList<?>)getScenario()).basicRemove(otherEnd, msgs);
			case InteractionModelingPackage.TASK__INTERACTION_MODEL:
				return ((InternalEList<?>)getInteractionModel()).basicRemove(otherEnd, msgs);
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
			case InteractionModelingPackage.TASK__NAME:
				return getName();
			case InteractionModelingPackage.TASK__SCENARIO:
				return getScenario();
			case InteractionModelingPackage.TASK__INTERACTION_MODEL:
				return getInteractionModel();
			case InteractionModelingPackage.TASK__DOCUMENTATION:
				return getDocumentation();
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
			case InteractionModelingPackage.TASK__NAME:
				setName((String)newValue);
				return;
			case InteractionModelingPackage.TASK__SCENARIO:
				getScenario().clear();
				getScenario().addAll((Collection<? extends Scenario>)newValue);
				return;
			case InteractionModelingPackage.TASK__INTERACTION_MODEL:
				getInteractionModel().clear();
				getInteractionModel().addAll((Collection<? extends InteractionModel>)newValue);
				return;
			case InteractionModelingPackage.TASK__DOCUMENTATION:
				getDocumentation().clear();
				getDocumentation().addAll((Collection<? extends Documentation>)newValue);
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
			case InteractionModelingPackage.TASK__NAME:
				setName(NAME_EDEFAULT);
				return;
			case InteractionModelingPackage.TASK__SCENARIO:
				getScenario().clear();
				return;
			case InteractionModelingPackage.TASK__INTERACTION_MODEL:
				getInteractionModel().clear();
				return;
			case InteractionModelingPackage.TASK__DOCUMENTATION:
				getDocumentation().clear();
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
			case InteractionModelingPackage.TASK__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case InteractionModelingPackage.TASK__SCENARIO:
				return scenario != null && !scenario.isEmpty();
			case InteractionModelingPackage.TASK__INTERACTION_MODEL:
				return interactionModel != null && !interactionModel.isEmpty();
			case InteractionModelingPackage.TASK__DOCUMENTATION:
				return documentation != null && !documentation.isEmpty();
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

} //TaskImpl
