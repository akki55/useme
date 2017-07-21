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

import pt.fct.unl.novalincs.useme.model.ContextModeling.UserProfile;

import pt.fct.unl.novalincs.useme.model.GoalModeling.Actor;
import pt.fct.unl.novalincs.useme.model.GoalModeling.GoalModelingPackage;
import pt.fct.unl.novalincs.useme.model.GoalModeling.UsabilityGoal;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Actor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.GoalModeling.impl.ActorImpl#getName <em>Name</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.GoalModeling.impl.ActorImpl#getOrganization <em>Organization</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.GoalModeling.impl.ActorImpl#getResponsibleFor <em>Responsible For</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.GoalModeling.impl.ActorImpl#getStakeholder <em>Stakeholder</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActorImpl extends MinimalEObjectImpl.Container implements Actor {
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
	 * The default value of the '{@link #getOrganization() <em>Organization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganization()
	 * @generated
	 * @ordered
	 */
	protected static final String ORGANIZATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOrganization() <em>Organization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganization()
	 * @generated
	 * @ordered
	 */
	protected String organization = ORGANIZATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getResponsibleFor() <em>Responsible For</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponsibleFor()
	 * @generated
	 * @ordered
	 */
	protected EList<UsabilityGoal> responsibleFor;

	/**
	 * The cached value of the '{@link #getStakeholder() <em>Stakeholder</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStakeholder()
	 * @generated
	 * @ordered
	 */
	protected EList<UserProfile> stakeholder;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GoalModelingPackage.Literals.ACTOR;
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
			eNotify(new ENotificationImpl(this, Notification.SET, GoalModelingPackage.ACTOR__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOrganization() {
		return organization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrganization(String newOrganization) {
		String oldOrganization = organization;
		organization = newOrganization;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GoalModelingPackage.ACTOR__ORGANIZATION, oldOrganization, organization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UsabilityGoal> getResponsibleFor() {
		if (responsibleFor == null) {
			responsibleFor = new EObjectWithInverseResolvingEList.ManyInverse<UsabilityGoal>(UsabilityGoal.class, this, GoalModelingPackage.ACTOR__RESPONSIBLE_FOR, GoalModelingPackage.USABILITY_GOAL__RESPONSIBLE_ACTOR);
		}
		return responsibleFor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UserProfile> getStakeholder() {
		if (stakeholder == null) {
			stakeholder = new EObjectResolvingEList<UserProfile>(UserProfile.class, this, GoalModelingPackage.ACTOR__STAKEHOLDER);
		}
		return stakeholder;
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
			case GoalModelingPackage.ACTOR__RESPONSIBLE_FOR:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getResponsibleFor()).basicAdd(otherEnd, msgs);
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
			case GoalModelingPackage.ACTOR__RESPONSIBLE_FOR:
				return ((InternalEList<?>)getResponsibleFor()).basicRemove(otherEnd, msgs);
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
			case GoalModelingPackage.ACTOR__NAME:
				return getName();
			case GoalModelingPackage.ACTOR__ORGANIZATION:
				return getOrganization();
			case GoalModelingPackage.ACTOR__RESPONSIBLE_FOR:
				return getResponsibleFor();
			case GoalModelingPackage.ACTOR__STAKEHOLDER:
				return getStakeholder();
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
			case GoalModelingPackage.ACTOR__NAME:
				setName((String)newValue);
				return;
			case GoalModelingPackage.ACTOR__ORGANIZATION:
				setOrganization((String)newValue);
				return;
			case GoalModelingPackage.ACTOR__RESPONSIBLE_FOR:
				getResponsibleFor().clear();
				getResponsibleFor().addAll((Collection<? extends UsabilityGoal>)newValue);
				return;
			case GoalModelingPackage.ACTOR__STAKEHOLDER:
				getStakeholder().clear();
				getStakeholder().addAll((Collection<? extends UserProfile>)newValue);
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
			case GoalModelingPackage.ACTOR__NAME:
				setName(NAME_EDEFAULT);
				return;
			case GoalModelingPackage.ACTOR__ORGANIZATION:
				setOrganization(ORGANIZATION_EDEFAULT);
				return;
			case GoalModelingPackage.ACTOR__RESPONSIBLE_FOR:
				getResponsibleFor().clear();
				return;
			case GoalModelingPackage.ACTOR__STAKEHOLDER:
				getStakeholder().clear();
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
			case GoalModelingPackage.ACTOR__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case GoalModelingPackage.ACTOR__ORGANIZATION:
				return ORGANIZATION_EDEFAULT == null ? organization != null : !ORGANIZATION_EDEFAULT.equals(organization);
			case GoalModelingPackage.ACTOR__RESPONSIBLE_FOR:
				return responsibleFor != null && !responsibleFor.isEmpty();
			case GoalModelingPackage.ACTOR__STAKEHOLDER:
				return stakeholder != null && !stakeholder.isEmpty();
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
		result.append(", organization: ");
		result.append(organization);
		result.append(')');
		return result.toString();
	}

} //ActorImpl
