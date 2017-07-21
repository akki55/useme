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

import pt.fct.unl.novalincs.useme.model.ContextModeling.Scenario;

import pt.fct.unl.novalincs.useme.model.GoalModeling.GoalModelingPackage;
import pt.fct.unl.novalincs.useme.model.GoalModeling.Method;
import pt.fct.unl.novalincs.useme.model.GoalModeling.UsabilityGoal;
import pt.fct.unl.novalincs.useme.model.GoalModeling.UsabilityRequirement;

import pt.fct.unl.novalincs.useme.model.Utility.FunctionalGoal;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Method</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.GoalModeling.impl.MethodImpl#getName <em>Name</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.GoalModeling.impl.MethodImpl#getMethodDescription <em>Method Description</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.GoalModeling.impl.MethodImpl#getUsabilityGoal <em>Usability Goal</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.GoalModeling.impl.MethodImpl#getTestCase <em>Test Case</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.GoalModeling.impl.MethodImpl#getUsabilityRequirement <em>Usability Requirement</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.GoalModeling.impl.MethodImpl#getFunctionalGoal <em>Functional Goal</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MethodImpl extends MinimalEObjectImpl.Container implements Method {
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
	 * The default value of the '{@link #getMethodDescription() <em>Method Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethodDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String METHOD_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMethodDescription() <em>Method Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethodDescription()
	 * @generated
	 * @ordered
	 */
	protected String methodDescription = METHOD_DESCRIPTION_EDEFAULT;

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
	 * The cached value of the '{@link #getTestCase() <em>Test Case</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestCase()
	 * @generated
	 * @ordered
	 */
	protected EList<Scenario> testCase;

	/**
	 * The cached value of the '{@link #getUsabilityRequirement() <em>Usability Requirement</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsabilityRequirement()
	 * @generated
	 * @ordered
	 */
	protected EList<UsabilityRequirement> usabilityRequirement;

	/**
	 * The cached value of the '{@link #getFunctionalGoal() <em>Functional Goal</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctionalGoal()
	 * @generated
	 * @ordered
	 */
	protected EList<FunctionalGoal> functionalGoal;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MethodImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GoalModelingPackage.Literals.METHOD;
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
			eNotify(new ENotificationImpl(this, Notification.SET, GoalModelingPackage.METHOD__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMethodDescription() {
		return methodDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMethodDescription(String newMethodDescription) {
		String oldMethodDescription = methodDescription;
		methodDescription = newMethodDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GoalModelingPackage.METHOD__METHOD_DESCRIPTION, oldMethodDescription, methodDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UsabilityGoal> getUsabilityGoal() {
		if (usabilityGoal == null) {
			usabilityGoal = new EObjectWithInverseResolvingEList.ManyInverse<UsabilityGoal>(UsabilityGoal.class, this, GoalModelingPackage.METHOD__USABILITY_GOAL, GoalModelingPackage.USABILITY_GOAL__METHOD);
		}
		return usabilityGoal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Scenario> getTestCase() {
		if (testCase == null) {
			testCase = new EObjectResolvingEList<Scenario>(Scenario.class, this, GoalModelingPackage.METHOD__TEST_CASE);
		}
		return testCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UsabilityRequirement> getUsabilityRequirement() {
		if (usabilityRequirement == null) {
			usabilityRequirement = new EObjectResolvingEList<UsabilityRequirement>(UsabilityRequirement.class, this, GoalModelingPackage.METHOD__USABILITY_REQUIREMENT);
		}
		return usabilityRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FunctionalGoal> getFunctionalGoal() {
		if (functionalGoal == null) {
			functionalGoal = new EObjectResolvingEList<FunctionalGoal>(FunctionalGoal.class, this, GoalModelingPackage.METHOD__FUNCTIONAL_GOAL);
		}
		return functionalGoal;
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
			case GoalModelingPackage.METHOD__USABILITY_GOAL:
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
			case GoalModelingPackage.METHOD__USABILITY_GOAL:
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
			case GoalModelingPackage.METHOD__NAME:
				return getName();
			case GoalModelingPackage.METHOD__METHOD_DESCRIPTION:
				return getMethodDescription();
			case GoalModelingPackage.METHOD__USABILITY_GOAL:
				return getUsabilityGoal();
			case GoalModelingPackage.METHOD__TEST_CASE:
				return getTestCase();
			case GoalModelingPackage.METHOD__USABILITY_REQUIREMENT:
				return getUsabilityRequirement();
			case GoalModelingPackage.METHOD__FUNCTIONAL_GOAL:
				return getFunctionalGoal();
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
			case GoalModelingPackage.METHOD__NAME:
				setName((String)newValue);
				return;
			case GoalModelingPackage.METHOD__METHOD_DESCRIPTION:
				setMethodDescription((String)newValue);
				return;
			case GoalModelingPackage.METHOD__USABILITY_GOAL:
				getUsabilityGoal().clear();
				getUsabilityGoal().addAll((Collection<? extends UsabilityGoal>)newValue);
				return;
			case GoalModelingPackage.METHOD__TEST_CASE:
				getTestCase().clear();
				getTestCase().addAll((Collection<? extends Scenario>)newValue);
				return;
			case GoalModelingPackage.METHOD__USABILITY_REQUIREMENT:
				getUsabilityRequirement().clear();
				getUsabilityRequirement().addAll((Collection<? extends UsabilityRequirement>)newValue);
				return;
			case GoalModelingPackage.METHOD__FUNCTIONAL_GOAL:
				getFunctionalGoal().clear();
				getFunctionalGoal().addAll((Collection<? extends FunctionalGoal>)newValue);
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
			case GoalModelingPackage.METHOD__NAME:
				setName(NAME_EDEFAULT);
				return;
			case GoalModelingPackage.METHOD__METHOD_DESCRIPTION:
				setMethodDescription(METHOD_DESCRIPTION_EDEFAULT);
				return;
			case GoalModelingPackage.METHOD__USABILITY_GOAL:
				getUsabilityGoal().clear();
				return;
			case GoalModelingPackage.METHOD__TEST_CASE:
				getTestCase().clear();
				return;
			case GoalModelingPackage.METHOD__USABILITY_REQUIREMENT:
				getUsabilityRequirement().clear();
				return;
			case GoalModelingPackage.METHOD__FUNCTIONAL_GOAL:
				getFunctionalGoal().clear();
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
			case GoalModelingPackage.METHOD__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case GoalModelingPackage.METHOD__METHOD_DESCRIPTION:
				return METHOD_DESCRIPTION_EDEFAULT == null ? methodDescription != null : !METHOD_DESCRIPTION_EDEFAULT.equals(methodDescription);
			case GoalModelingPackage.METHOD__USABILITY_GOAL:
				return usabilityGoal != null && !usabilityGoal.isEmpty();
			case GoalModelingPackage.METHOD__TEST_CASE:
				return testCase != null && !testCase.isEmpty();
			case GoalModelingPackage.METHOD__USABILITY_REQUIREMENT:
				return usabilityRequirement != null && !usabilityRequirement.isEmpty();
			case GoalModelingPackage.METHOD__FUNCTIONAL_GOAL:
				return functionalGoal != null && !functionalGoal.isEmpty();
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
		result.append(", methodDescription: ");
		result.append(methodDescription);
		result.append(')');
		return result.toString();
	}

} //MethodImpl
