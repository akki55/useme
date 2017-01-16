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

import pt.fct.unl.novalincs.useme.model.GoalModeling.GoalModelingPackage;
import pt.fct.unl.novalincs.useme.model.GoalModeling.Scope;
import pt.fct.unl.novalincs.useme.model.GoalModeling.SuccessCoverage;
import pt.fct.unl.novalincs.useme.model.GoalModeling.UsabilityGoal;

import pt.fct.unl.novalincs.useme.model.ReportModeling.EvaluationResult;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Success Coverage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.GoalModeling.impl.SuccessCoverageImpl#getName <em>Name</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.GoalModeling.impl.SuccessCoverageImpl#getUsabilityGoal <em>Usability Goal</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.GoalModeling.impl.SuccessCoverageImpl#getScope <em>Scope</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.GoalModeling.impl.SuccessCoverageImpl#getSuccessFactor <em>Success Factor</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SuccessCoverageImpl extends MinimalEObjectImpl.Container implements SuccessCoverage {
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
	 * The cached value of the '{@link #getUsabilityGoal() <em>Usability Goal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsabilityGoal()
	 * @generated
	 * @ordered
	 */
	protected UsabilityGoal usabilityGoal;

	/**
	 * The cached value of the '{@link #getScope() <em>Scope</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScope()
	 * @generated
	 * @ordered
	 */
	protected EList<Scope> scope;

	/**
	 * The cached value of the '{@link #getSuccessFactor() <em>Success Factor</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuccessFactor()
	 * @generated
	 * @ordered
	 */
	protected EList<EvaluationResult> successFactor;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SuccessCoverageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GoalModelingPackage.Literals.SUCCESS_COVERAGE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, GoalModelingPackage.SUCCESS_COVERAGE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UsabilityGoal getUsabilityGoal() {
		if (usabilityGoal != null && usabilityGoal.eIsProxy()) {
			InternalEObject oldUsabilityGoal = (InternalEObject)usabilityGoal;
			usabilityGoal = (UsabilityGoal)eResolveProxy(oldUsabilityGoal);
			if (usabilityGoal != oldUsabilityGoal) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GoalModelingPackage.SUCCESS_COVERAGE__USABILITY_GOAL, oldUsabilityGoal, usabilityGoal));
			}
		}
		return usabilityGoal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UsabilityGoal basicGetUsabilityGoal() {
		return usabilityGoal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUsabilityGoal(UsabilityGoal newUsabilityGoal, NotificationChain msgs) {
		UsabilityGoal oldUsabilityGoal = usabilityGoal;
		usabilityGoal = newUsabilityGoal;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GoalModelingPackage.SUCCESS_COVERAGE__USABILITY_GOAL, oldUsabilityGoal, newUsabilityGoal);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsabilityGoal(UsabilityGoal newUsabilityGoal) {
		if (newUsabilityGoal != usabilityGoal) {
			NotificationChain msgs = null;
			if (usabilityGoal != null)
				msgs = ((InternalEObject)usabilityGoal).eInverseRemove(this, GoalModelingPackage.USABILITY_GOAL__SUCCESS_COVERAGE, UsabilityGoal.class, msgs);
			if (newUsabilityGoal != null)
				msgs = ((InternalEObject)newUsabilityGoal).eInverseAdd(this, GoalModelingPackage.USABILITY_GOAL__SUCCESS_COVERAGE, UsabilityGoal.class, msgs);
			msgs = basicSetUsabilityGoal(newUsabilityGoal, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GoalModelingPackage.SUCCESS_COVERAGE__USABILITY_GOAL, newUsabilityGoal, newUsabilityGoal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Scope> getScope() {
		if (scope == null) {
			scope = new EObjectResolvingEList<Scope>(Scope.class, this, GoalModelingPackage.SUCCESS_COVERAGE__SCOPE);
		}
		return scope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EvaluationResult> getSuccessFactor() {
		if (successFactor == null) {
			successFactor = new EObjectResolvingEList<EvaluationResult>(EvaluationResult.class, this, GoalModelingPackage.SUCCESS_COVERAGE__SUCCESS_FACTOR);
		}
		return successFactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GoalModelingPackage.SUCCESS_COVERAGE__USABILITY_GOAL:
				if (usabilityGoal != null)
					msgs = ((InternalEObject)usabilityGoal).eInverseRemove(this, GoalModelingPackage.USABILITY_GOAL__SUCCESS_COVERAGE, UsabilityGoal.class, msgs);
				return basicSetUsabilityGoal((UsabilityGoal)otherEnd, msgs);
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
			case GoalModelingPackage.SUCCESS_COVERAGE__USABILITY_GOAL:
				return basicSetUsabilityGoal(null, msgs);
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
			case GoalModelingPackage.SUCCESS_COVERAGE__NAME:
				return getName();
			case GoalModelingPackage.SUCCESS_COVERAGE__USABILITY_GOAL:
				if (resolve) return getUsabilityGoal();
				return basicGetUsabilityGoal();
			case GoalModelingPackage.SUCCESS_COVERAGE__SCOPE:
				return getScope();
			case GoalModelingPackage.SUCCESS_COVERAGE__SUCCESS_FACTOR:
				return getSuccessFactor();
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
			case GoalModelingPackage.SUCCESS_COVERAGE__NAME:
				setName((String)newValue);
				return;
			case GoalModelingPackage.SUCCESS_COVERAGE__USABILITY_GOAL:
				setUsabilityGoal((UsabilityGoal)newValue);
				return;
			case GoalModelingPackage.SUCCESS_COVERAGE__SCOPE:
				getScope().clear();
				getScope().addAll((Collection<? extends Scope>)newValue);
				return;
			case GoalModelingPackage.SUCCESS_COVERAGE__SUCCESS_FACTOR:
				getSuccessFactor().clear();
				getSuccessFactor().addAll((Collection<? extends EvaluationResult>)newValue);
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
			case GoalModelingPackage.SUCCESS_COVERAGE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case GoalModelingPackage.SUCCESS_COVERAGE__USABILITY_GOAL:
				setUsabilityGoal((UsabilityGoal)null);
				return;
			case GoalModelingPackage.SUCCESS_COVERAGE__SCOPE:
				getScope().clear();
				return;
			case GoalModelingPackage.SUCCESS_COVERAGE__SUCCESS_FACTOR:
				getSuccessFactor().clear();
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
			case GoalModelingPackage.SUCCESS_COVERAGE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case GoalModelingPackage.SUCCESS_COVERAGE__USABILITY_GOAL:
				return usabilityGoal != null;
			case GoalModelingPackage.SUCCESS_COVERAGE__SCOPE:
				return scope != null && !scope.isEmpty();
			case GoalModelingPackage.SUCCESS_COVERAGE__SUCCESS_FACTOR:
				return successFactor != null && !successFactor.isEmpty();
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

} //SuccessCoverageImpl
