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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import pt.fct.unl.novalincs.useme.model.GoalModeling.Actor;
import pt.fct.unl.novalincs.useme.model.GoalModeling.GoalModel;
import pt.fct.unl.novalincs.useme.model.GoalModeling.GoalModelingPackage;
import pt.fct.unl.novalincs.useme.model.GoalModeling.GoalSpecification;
import pt.fct.unl.novalincs.useme.model.GoalModeling.Method;
import pt.fct.unl.novalincs.useme.model.GoalModeling.Scope;
import pt.fct.unl.novalincs.useme.model.GoalModeling.SuccessCoverage;
import pt.fct.unl.novalincs.useme.model.GoalModeling.UsabilityRequirement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Goal Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.GoalModeling.impl.GoalSpecificationImpl#getName <em>Name</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.GoalModeling.impl.GoalSpecificationImpl#getUsabilityRequirement <em>Usability Requirement</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.GoalModeling.impl.GoalSpecificationImpl#getMethod <em>Method</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.GoalModeling.impl.GoalSpecificationImpl#getActor <em>Actor</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.GoalModeling.impl.GoalSpecificationImpl#getScope <em>Scope</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.GoalModeling.impl.GoalSpecificationImpl#getSuccessCoverage <em>Success Coverage</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.GoalModeling.impl.GoalSpecificationImpl#getGoalModel <em>Goal Model</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GoalSpecificationImpl extends MinimalEObjectImpl.Container implements GoalSpecification {
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
	 * The cached value of the '{@link #getUsabilityRequirement() <em>Usability Requirement</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsabilityRequirement()
	 * @generated
	 * @ordered
	 */
	protected EList<UsabilityRequirement> usabilityRequirement;

	/**
	 * The cached value of the '{@link #getMethod() <em>Method</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethod()
	 * @generated
	 * @ordered
	 */
	protected EList<Method> method;

	/**
	 * The cached value of the '{@link #getActor() <em>Actor</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActor()
	 * @generated
	 * @ordered
	 */
	protected EList<Actor> actor;

	/**
	 * The cached value of the '{@link #getScope() <em>Scope</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScope()
	 * @generated
	 * @ordered
	 */
	protected EList<Scope> scope;

	/**
	 * The cached value of the '{@link #getSuccessCoverage() <em>Success Coverage</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuccessCoverage()
	 * @generated
	 * @ordered
	 */
	protected EList<SuccessCoverage> successCoverage;

	/**
	 * The cached value of the '{@link #getGoalModel() <em>Goal Model</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGoalModel()
	 * @generated
	 * @ordered
	 */
	protected EList<GoalModel> goalModel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GoalSpecificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GoalModelingPackage.Literals.GOAL_SPECIFICATION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, GoalModelingPackage.GOAL_SPECIFICATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UsabilityRequirement> getUsabilityRequirement() {
		if (usabilityRequirement == null) {
			usabilityRequirement = new EObjectContainmentEList<UsabilityRequirement>(UsabilityRequirement.class, this, GoalModelingPackage.GOAL_SPECIFICATION__USABILITY_REQUIREMENT);
		}
		return usabilityRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Method> getMethod() {
		if (method == null) {
			method = new EObjectContainmentEList<Method>(Method.class, this, GoalModelingPackage.GOAL_SPECIFICATION__METHOD);
		}
		return method;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Actor> getActor() {
		if (actor == null) {
			actor = new EObjectContainmentEList<Actor>(Actor.class, this, GoalModelingPackage.GOAL_SPECIFICATION__ACTOR);
		}
		return actor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Scope> getScope() {
		if (scope == null) {
			scope = new EObjectContainmentEList<Scope>(Scope.class, this, GoalModelingPackage.GOAL_SPECIFICATION__SCOPE);
		}
		return scope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SuccessCoverage> getSuccessCoverage() {
		if (successCoverage == null) {
			successCoverage = new EObjectContainmentEList<SuccessCoverage>(SuccessCoverage.class, this, GoalModelingPackage.GOAL_SPECIFICATION__SUCCESS_COVERAGE);
		}
		return successCoverage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GoalModel> getGoalModel() {
		if (goalModel == null) {
			goalModel = new EObjectContainmentEList<GoalModel>(GoalModel.class, this, GoalModelingPackage.GOAL_SPECIFICATION__GOAL_MODEL);
		}
		return goalModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GoalModelingPackage.GOAL_SPECIFICATION__USABILITY_REQUIREMENT:
				return ((InternalEList<?>)getUsabilityRequirement()).basicRemove(otherEnd, msgs);
			case GoalModelingPackage.GOAL_SPECIFICATION__METHOD:
				return ((InternalEList<?>)getMethod()).basicRemove(otherEnd, msgs);
			case GoalModelingPackage.GOAL_SPECIFICATION__ACTOR:
				return ((InternalEList<?>)getActor()).basicRemove(otherEnd, msgs);
			case GoalModelingPackage.GOAL_SPECIFICATION__SCOPE:
				return ((InternalEList<?>)getScope()).basicRemove(otherEnd, msgs);
			case GoalModelingPackage.GOAL_SPECIFICATION__SUCCESS_COVERAGE:
				return ((InternalEList<?>)getSuccessCoverage()).basicRemove(otherEnd, msgs);
			case GoalModelingPackage.GOAL_SPECIFICATION__GOAL_MODEL:
				return ((InternalEList<?>)getGoalModel()).basicRemove(otherEnd, msgs);
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
			case GoalModelingPackage.GOAL_SPECIFICATION__NAME:
				return getName();
			case GoalModelingPackage.GOAL_SPECIFICATION__USABILITY_REQUIREMENT:
				return getUsabilityRequirement();
			case GoalModelingPackage.GOAL_SPECIFICATION__METHOD:
				return getMethod();
			case GoalModelingPackage.GOAL_SPECIFICATION__ACTOR:
				return getActor();
			case GoalModelingPackage.GOAL_SPECIFICATION__SCOPE:
				return getScope();
			case GoalModelingPackage.GOAL_SPECIFICATION__SUCCESS_COVERAGE:
				return getSuccessCoverage();
			case GoalModelingPackage.GOAL_SPECIFICATION__GOAL_MODEL:
				return getGoalModel();
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
			case GoalModelingPackage.GOAL_SPECIFICATION__NAME:
				setName((String)newValue);
				return;
			case GoalModelingPackage.GOAL_SPECIFICATION__USABILITY_REQUIREMENT:
				getUsabilityRequirement().clear();
				getUsabilityRequirement().addAll((Collection<? extends UsabilityRequirement>)newValue);
				return;
			case GoalModelingPackage.GOAL_SPECIFICATION__METHOD:
				getMethod().clear();
				getMethod().addAll((Collection<? extends Method>)newValue);
				return;
			case GoalModelingPackage.GOAL_SPECIFICATION__ACTOR:
				getActor().clear();
				getActor().addAll((Collection<? extends Actor>)newValue);
				return;
			case GoalModelingPackage.GOAL_SPECIFICATION__SCOPE:
				getScope().clear();
				getScope().addAll((Collection<? extends Scope>)newValue);
				return;
			case GoalModelingPackage.GOAL_SPECIFICATION__SUCCESS_COVERAGE:
				getSuccessCoverage().clear();
				getSuccessCoverage().addAll((Collection<? extends SuccessCoverage>)newValue);
				return;
			case GoalModelingPackage.GOAL_SPECIFICATION__GOAL_MODEL:
				getGoalModel().clear();
				getGoalModel().addAll((Collection<? extends GoalModel>)newValue);
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
			case GoalModelingPackage.GOAL_SPECIFICATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case GoalModelingPackage.GOAL_SPECIFICATION__USABILITY_REQUIREMENT:
				getUsabilityRequirement().clear();
				return;
			case GoalModelingPackage.GOAL_SPECIFICATION__METHOD:
				getMethod().clear();
				return;
			case GoalModelingPackage.GOAL_SPECIFICATION__ACTOR:
				getActor().clear();
				return;
			case GoalModelingPackage.GOAL_SPECIFICATION__SCOPE:
				getScope().clear();
				return;
			case GoalModelingPackage.GOAL_SPECIFICATION__SUCCESS_COVERAGE:
				getSuccessCoverage().clear();
				return;
			case GoalModelingPackage.GOAL_SPECIFICATION__GOAL_MODEL:
				getGoalModel().clear();
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
			case GoalModelingPackage.GOAL_SPECIFICATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case GoalModelingPackage.GOAL_SPECIFICATION__USABILITY_REQUIREMENT:
				return usabilityRequirement != null && !usabilityRequirement.isEmpty();
			case GoalModelingPackage.GOAL_SPECIFICATION__METHOD:
				return method != null && !method.isEmpty();
			case GoalModelingPackage.GOAL_SPECIFICATION__ACTOR:
				return actor != null && !actor.isEmpty();
			case GoalModelingPackage.GOAL_SPECIFICATION__SCOPE:
				return scope != null && !scope.isEmpty();
			case GoalModelingPackage.GOAL_SPECIFICATION__SUCCESS_COVERAGE:
				return successCoverage != null && !successCoverage.isEmpty();
			case GoalModelingPackage.GOAL_SPECIFICATION__GOAL_MODEL:
				return goalModel != null && !goalModel.isEmpty();
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

} //GoalSpecificationImpl
