/**
 */
package pt.fct.unl.novalincs.useme.model.GoalModeling.impl;

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

import pt.fct.unl.novalincs.useme.model.ContextModeling.ContextEnvironment;
import pt.fct.unl.novalincs.useme.model.ContextModeling.ContextModel;
import pt.fct.unl.novalincs.useme.model.ContextModeling.UserProfile;
import pt.fct.unl.novalincs.useme.model.ContextModeling.Workflow;

import pt.fct.unl.novalincs.useme.model.GoalModeling.GoalModelingPackage;
import pt.fct.unl.novalincs.useme.model.GoalModeling.Scope;
import pt.fct.unl.novalincs.useme.model.GoalModeling.UsabilityGoal;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scope</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.GoalModeling.impl.ScopeImpl#getName <em>Name</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.GoalModeling.impl.ScopeImpl#getContextModel <em>Context Model</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.GoalModeling.impl.ScopeImpl#getUsabilityGoal <em>Usability Goal</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.GoalModeling.impl.ScopeImpl#getUserProfileSelection <em>User Profile Selection</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.GoalModeling.impl.ScopeImpl#getContextEnvironment <em>Context Environment</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.GoalModeling.impl.ScopeImpl#getWorkflow <em>Workflow</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ScopeImpl extends MinimalEObjectImpl.Container implements Scope {
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
	 * The cached value of the '{@link #getContextModel() <em>Context Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContextModel()
	 * @generated
	 * @ordered
	 */
	protected ContextModel contextModel;

	/**
	 * The cached value of the '{@link #getUsabilityGoal() <em>Usability Goal</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsabilityGoal()
	 * @generated
	 * @ordered
	 */
	protected EList<UsabilityGoal> usabilityGoal;

	/**
	 * The cached value of the '{@link #getUserProfileSelection() <em>User Profile Selection</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserProfileSelection()
	 * @generated
	 * @ordered
	 */
	protected EList<UserProfile> userProfileSelection;

	/**
	 * The cached value of the '{@link #getContextEnvironment() <em>Context Environment</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContextEnvironment()
	 * @generated
	 * @ordered
	 */
	protected EList<ContextEnvironment> contextEnvironment;

	/**
	 * The cached value of the '{@link #getWorkflow() <em>Workflow</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkflow()
	 * @generated
	 * @ordered
	 */
	protected EList<Workflow> workflow;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScopeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GoalModelingPackage.Literals.SCOPE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, GoalModelingPackage.SCOPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContextModel getContextModel() {
		if (contextModel != null && contextModel.eIsProxy()) {
			InternalEObject oldContextModel = (InternalEObject)contextModel;
			contextModel = (ContextModel)eResolveProxy(oldContextModel);
			if (contextModel != oldContextModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GoalModelingPackage.SCOPE__CONTEXT_MODEL, oldContextModel, contextModel));
			}
		}
		return contextModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContextModel basicGetContextModel() {
		return contextModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContextModel(ContextModel newContextModel) {
		ContextModel oldContextModel = contextModel;
		contextModel = newContextModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GoalModelingPackage.SCOPE__CONTEXT_MODEL, oldContextModel, contextModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UsabilityGoal> getUsabilityGoal() {
		if (usabilityGoal == null) {
			usabilityGoal = new EObjectWithInverseResolvingEList.ManyInverse<UsabilityGoal>(UsabilityGoal.class, this, GoalModelingPackage.SCOPE__USABILITY_GOAL, GoalModelingPackage.USABILITY_GOAL__SCOPE);
		}
		return usabilityGoal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UserProfile> getUserProfileSelection() {
		if (userProfileSelection == null) {
			userProfileSelection = new EObjectResolvingEList<UserProfile>(UserProfile.class, this, GoalModelingPackage.SCOPE__USER_PROFILE_SELECTION);
		}
		return userProfileSelection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContextEnvironment> getContextEnvironment() {
		if (contextEnvironment == null) {
			contextEnvironment = new EObjectResolvingEList<ContextEnvironment>(ContextEnvironment.class, this, GoalModelingPackage.SCOPE__CONTEXT_ENVIRONMENT);
		}
		return contextEnvironment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Workflow> getWorkflow() {
		if (workflow == null) {
			workflow = new EObjectResolvingEList<Workflow>(Workflow.class, this, GoalModelingPackage.SCOPE__WORKFLOW);
		}
		return workflow;
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
			case GoalModelingPackage.SCOPE__USABILITY_GOAL:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getUsabilityGoal()).basicAdd(otherEnd, msgs);
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
			case GoalModelingPackage.SCOPE__USABILITY_GOAL:
				return ((InternalEList<?>)getUsabilityGoal()).basicRemove(otherEnd, msgs);
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
			case GoalModelingPackage.SCOPE__NAME:
				return getName();
			case GoalModelingPackage.SCOPE__CONTEXT_MODEL:
				if (resolve) return getContextModel();
				return basicGetContextModel();
			case GoalModelingPackage.SCOPE__USABILITY_GOAL:
				return getUsabilityGoal();
			case GoalModelingPackage.SCOPE__USER_PROFILE_SELECTION:
				return getUserProfileSelection();
			case GoalModelingPackage.SCOPE__CONTEXT_ENVIRONMENT:
				return getContextEnvironment();
			case GoalModelingPackage.SCOPE__WORKFLOW:
				return getWorkflow();
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
			case GoalModelingPackage.SCOPE__NAME:
				setName((String)newValue);
				return;
			case GoalModelingPackage.SCOPE__CONTEXT_MODEL:
				setContextModel((ContextModel)newValue);
				return;
			case GoalModelingPackage.SCOPE__USABILITY_GOAL:
				getUsabilityGoal().clear();
				getUsabilityGoal().addAll((Collection<? extends UsabilityGoal>)newValue);
				return;
			case GoalModelingPackage.SCOPE__USER_PROFILE_SELECTION:
				getUserProfileSelection().clear();
				getUserProfileSelection().addAll((Collection<? extends UserProfile>)newValue);
				return;
			case GoalModelingPackage.SCOPE__CONTEXT_ENVIRONMENT:
				getContextEnvironment().clear();
				getContextEnvironment().addAll((Collection<? extends ContextEnvironment>)newValue);
				return;
			case GoalModelingPackage.SCOPE__WORKFLOW:
				getWorkflow().clear();
				getWorkflow().addAll((Collection<? extends Workflow>)newValue);
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
			case GoalModelingPackage.SCOPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case GoalModelingPackage.SCOPE__CONTEXT_MODEL:
				setContextModel((ContextModel)null);
				return;
			case GoalModelingPackage.SCOPE__USABILITY_GOAL:
				getUsabilityGoal().clear();
				return;
			case GoalModelingPackage.SCOPE__USER_PROFILE_SELECTION:
				getUserProfileSelection().clear();
				return;
			case GoalModelingPackage.SCOPE__CONTEXT_ENVIRONMENT:
				getContextEnvironment().clear();
				return;
			case GoalModelingPackage.SCOPE__WORKFLOW:
				getWorkflow().clear();
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
			case GoalModelingPackage.SCOPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case GoalModelingPackage.SCOPE__CONTEXT_MODEL:
				return contextModel != null;
			case GoalModelingPackage.SCOPE__USABILITY_GOAL:
				return usabilityGoal != null && !usabilityGoal.isEmpty();
			case GoalModelingPackage.SCOPE__USER_PROFILE_SELECTION:
				return userProfileSelection != null && !userProfileSelection.isEmpty();
			case GoalModelingPackage.SCOPE__CONTEXT_ENVIRONMENT:
				return contextEnvironment != null && !contextEnvironment.isEmpty();
			case GoalModelingPackage.SCOPE__WORKFLOW:
				return workflow != null && !workflow.isEmpty();
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

} //ScopeImpl
