/**
 */
package pt.fct.unl.novalincs.useme.model.ContextModeling.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import pt.fct.unl.novalincs.useme.model.ContextModeling.ContextModel;
import pt.fct.unl.novalincs.useme.model.ContextModeling.ContextModelingPackage;
import pt.fct.unl.novalincs.useme.model.ContextModeling.Scenario;
import pt.fct.unl.novalincs.useme.model.ContextModeling.UserProfile;
import pt.fct.unl.novalincs.useme.model.ContextModeling.Workflow;

import pt.fct.unl.novalincs.useme.model.Utility.CEVariable;
import pt.fct.unl.novalincs.useme.model.Utility.PriorityValue;
import pt.fct.unl.novalincs.useme.model.Utility.ProcessModel;
import pt.fct.unl.novalincs.useme.model.Utility.UtilityPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Workflow</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.ContextModeling.impl.WorkflowImpl#getName <em>Name</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.ContextModeling.impl.WorkflowImpl#getPriority <em>Priority</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.ContextModeling.impl.WorkflowImpl#getActor <em>Actor</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.ContextModeling.impl.WorkflowImpl#getContextElement <em>Context Element</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.ContextModeling.impl.WorkflowImpl#getScenario <em>Scenario</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.ContextModeling.impl.WorkflowImpl#getProcessModel <em>Process Model</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.ContextModeling.impl.WorkflowImpl#getContextModel <em>Context Model</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WorkflowImpl extends MinimalEObjectImpl.Container implements Workflow {
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
	 * The default value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected static final PriorityValue PRIORITY_EDEFAULT = PriorityValue.HIGH;

	/**
	 * The cached value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected PriorityValue priority = PRIORITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getActor() <em>Actor</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActor()
	 * @generated
	 * @ordered
	 */
	protected EList<UserProfile> actor;

	/**
	 * The cached value of the '{@link #getContextElement() <em>Context Element</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContextElement()
	 * @generated
	 * @ordered
	 */
	protected EList<CEVariable> contextElement;

	/**
	 * The cached value of the '{@link #getScenario() <em>Scenario</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScenario()
	 * @generated
	 * @ordered
	 */
	protected EList<Scenario> scenario;

	/**
	 * The cached value of the '{@link #getProcessModel() <em>Process Model</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessModel()
	 * @generated
	 * @ordered
	 */
	protected EList<ProcessModel> processModel;

	/**
	 * The cached value of the '{@link #getContextModel() <em>Context Model</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContextModel()
	 * @generated
	 * @ordered
	 */
	protected EList<ContextModel> contextModel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkflowImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContextModelingPackage.Literals.WORKFLOW;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ContextModelingPackage.WORKFLOW__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PriorityValue getPriority() {
		return priority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPriority(PriorityValue newPriority) {
		PriorityValue oldPriority = priority;
		priority = newPriority == null ? PRIORITY_EDEFAULT : newPriority;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContextModelingPackage.WORKFLOW__PRIORITY, oldPriority, priority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UserProfile> getActor() {
		if (actor == null) {
			actor = new EObjectResolvingEList<UserProfile>(UserProfile.class, this, ContextModelingPackage.WORKFLOW__ACTOR);
		}
		return actor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CEVariable> getContextElement() {
		if (contextElement == null) {
			contextElement = new EObjectResolvingEList<CEVariable>(CEVariable.class, this, ContextModelingPackage.WORKFLOW__CONTEXT_ELEMENT);
		}
		return contextElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Scenario> getScenario() {
		if (scenario == null) {
			scenario = new EObjectContainmentEList<Scenario>(Scenario.class, this, ContextModelingPackage.WORKFLOW__SCENARIO);
		}
		return scenario;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProcessModel> getProcessModel() {
		if (processModel == null) {
			processModel = new EObjectWithInverseResolvingEList.ManyInverse<ProcessModel>(ProcessModel.class, this, ContextModelingPackage.WORKFLOW__PROCESS_MODEL, UtilityPackage.PROCESS_MODEL__WORKFLOW);
		}
		return processModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContextModel> getContextModel() {
		if (contextModel == null) {
			contextModel = new EObjectWithInverseResolvingEList.ManyInverse<ContextModel>(ContextModel.class, this, ContextModelingPackage.WORKFLOW__CONTEXT_MODEL, ContextModelingPackage.CONTEXT_MODEL__WORKFLOW);
		}
		return contextModel;
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
			case ContextModelingPackage.WORKFLOW__PROCESS_MODEL:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getProcessModel()).basicAdd(otherEnd, msgs);
			case ContextModelingPackage.WORKFLOW__CONTEXT_MODEL:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getContextModel()).basicAdd(otherEnd, msgs);
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
			case ContextModelingPackage.WORKFLOW__SCENARIO:
				return ((InternalEList<?>)getScenario()).basicRemove(otherEnd, msgs);
			case ContextModelingPackage.WORKFLOW__PROCESS_MODEL:
				return ((InternalEList<?>)getProcessModel()).basicRemove(otherEnd, msgs);
			case ContextModelingPackage.WORKFLOW__CONTEXT_MODEL:
				return ((InternalEList<?>)getContextModel()).basicRemove(otherEnd, msgs);
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
			case ContextModelingPackage.WORKFLOW__NAME:
				return getName();
			case ContextModelingPackage.WORKFLOW__PRIORITY:
				return getPriority();
			case ContextModelingPackage.WORKFLOW__ACTOR:
				return getActor();
			case ContextModelingPackage.WORKFLOW__CONTEXT_ELEMENT:
				return getContextElement();
			case ContextModelingPackage.WORKFLOW__SCENARIO:
				return getScenario();
			case ContextModelingPackage.WORKFLOW__PROCESS_MODEL:
				return getProcessModel();
			case ContextModelingPackage.WORKFLOW__CONTEXT_MODEL:
				return getContextModel();
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
			case ContextModelingPackage.WORKFLOW__NAME:
				setName((String)newValue);
				return;
			case ContextModelingPackage.WORKFLOW__PRIORITY:
				setPriority((PriorityValue)newValue);
				return;
			case ContextModelingPackage.WORKFLOW__ACTOR:
				getActor().clear();
				getActor().addAll((Collection<? extends UserProfile>)newValue);
				return;
			case ContextModelingPackage.WORKFLOW__CONTEXT_ELEMENT:
				getContextElement().clear();
				getContextElement().addAll((Collection<? extends CEVariable>)newValue);
				return;
			case ContextModelingPackage.WORKFLOW__SCENARIO:
				getScenario().clear();
				getScenario().addAll((Collection<? extends Scenario>)newValue);
				return;
			case ContextModelingPackage.WORKFLOW__PROCESS_MODEL:
				getProcessModel().clear();
				getProcessModel().addAll((Collection<? extends ProcessModel>)newValue);
				return;
			case ContextModelingPackage.WORKFLOW__CONTEXT_MODEL:
				getContextModel().clear();
				getContextModel().addAll((Collection<? extends ContextModel>)newValue);
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
			case ContextModelingPackage.WORKFLOW__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ContextModelingPackage.WORKFLOW__PRIORITY:
				setPriority(PRIORITY_EDEFAULT);
				return;
			case ContextModelingPackage.WORKFLOW__ACTOR:
				getActor().clear();
				return;
			case ContextModelingPackage.WORKFLOW__CONTEXT_ELEMENT:
				getContextElement().clear();
				return;
			case ContextModelingPackage.WORKFLOW__SCENARIO:
				getScenario().clear();
				return;
			case ContextModelingPackage.WORKFLOW__PROCESS_MODEL:
				getProcessModel().clear();
				return;
			case ContextModelingPackage.WORKFLOW__CONTEXT_MODEL:
				getContextModel().clear();
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
			case ContextModelingPackage.WORKFLOW__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ContextModelingPackage.WORKFLOW__PRIORITY:
				return priority != PRIORITY_EDEFAULT;
			case ContextModelingPackage.WORKFLOW__ACTOR:
				return actor != null && !actor.isEmpty();
			case ContextModelingPackage.WORKFLOW__CONTEXT_ELEMENT:
				return contextElement != null && !contextElement.isEmpty();
			case ContextModelingPackage.WORKFLOW__SCENARIO:
				return scenario != null && !scenario.isEmpty();
			case ContextModelingPackage.WORKFLOW__PROCESS_MODEL:
				return processModel != null && !processModel.isEmpty();
			case ContextModelingPackage.WORKFLOW__CONTEXT_MODEL:
				return contextModel != null && !contextModel.isEmpty();
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
		result.append(", priority: ");
		result.append(priority);
		result.append(')');
		return result.toString();
	}

} //WorkflowImpl
