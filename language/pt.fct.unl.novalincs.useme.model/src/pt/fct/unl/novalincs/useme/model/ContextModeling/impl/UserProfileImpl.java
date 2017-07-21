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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import pt.fct.unl.novalincs.useme.model.ContextModeling.ContextModelingPackage;
import pt.fct.unl.novalincs.useme.model.ContextModeling.UserHierarchy;
import pt.fct.unl.novalincs.useme.model.ContextModeling.UserProfile;
import pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationModelingPackage;
import pt.fct.unl.novalincs.useme.model.EvaluationModeling.Participant;

import pt.fct.unl.novalincs.useme.model.SurveyModeling.BackgroundQs;
import pt.fct.unl.novalincs.useme.model.SurveyModeling.SurveyModelingPackage;
import pt.fct.unl.novalincs.useme.model.Utility.LogicalExpression;
import pt.fct.unl.novalincs.useme.model.Utility.PriorityValue;
import pt.fct.unl.novalincs.useme.model.Utility.ProfileTemplate;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>User Profile</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.ContextModeling.impl.UserProfileImpl#getName <em>Name</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.ContextModeling.impl.UserProfileImpl#getBackgroundQs <em>Background Qs</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.ContextModeling.impl.UserProfileImpl#getPriority <em>Priority</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.ContextModeling.impl.UserProfileImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.ContextModeling.impl.UserProfileImpl#getSubProfile <em>Sub Profile</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.ContextModeling.impl.UserProfileImpl#getParticipant <em>Participant</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.ContextModeling.impl.UserProfileImpl#getUserHierarchy <em>User Hierarchy</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.ContextModeling.impl.UserProfileImpl#getProfileTemplate <em>Profile Template</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.ContextModeling.impl.UserProfileImpl#getClassifier <em>Classifier</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UserProfileImpl extends MinimalEObjectImpl.Container implements UserProfile {
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
	 * The cached value of the '{@link #getBackgroundQs() <em>Background Qs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackgroundQs()
	 * @generated
	 * @ordered
	 */
	protected EList<BackgroundQs> backgroundQs;

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
	 * The cached value of the '{@link #getParent() <em>Parent</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParent()
	 * @generated
	 * @ordered
	 */
	protected EList<UserProfile> parent;

	/**
	 * The cached value of the '{@link #getSubProfile() <em>Sub Profile</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubProfile()
	 * @generated
	 * @ordered
	 */
	protected EList<UserProfile> subProfile;

	/**
	 * The cached value of the '{@link #getParticipant() <em>Participant</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParticipant()
	 * @generated
	 * @ordered
	 */
	protected EList<Participant> participant;

	/**
	 * The cached value of the '{@link #getUserHierarchy() <em>User Hierarchy</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserHierarchy()
	 * @generated
	 * @ordered
	 */
	protected UserHierarchy userHierarchy;

	/**
	 * The cached value of the '{@link #getProfileTemplate() <em>Profile Template</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProfileTemplate()
	 * @generated
	 * @ordered
	 */
	protected EList<ProfileTemplate> profileTemplate;

	/**
	 * The cached value of the '{@link #getClassifier() <em>Classifier</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassifier()
	 * @generated
	 * @ordered
	 */
	protected EList<LogicalExpression> classifier;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UserProfileImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContextModelingPackage.Literals.USER_PROFILE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ContextModelingPackage.USER_PROFILE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BackgroundQs> getBackgroundQs() {
		if (backgroundQs == null) {
			backgroundQs = new EObjectWithInverseResolvingEList.ManyInverse<BackgroundQs>(BackgroundQs.class, this, ContextModelingPackage.USER_PROFILE__BACKGROUND_QS, SurveyModelingPackage.BACKGROUND_QS__USER_PROFILE);
		}
		return backgroundQs;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ContextModelingPackage.USER_PROFILE__PRIORITY, oldPriority, priority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UserProfile> getParent() {
		if (parent == null) {
			parent = new EObjectWithInverseResolvingEList.ManyInverse<UserProfile>(UserProfile.class, this, ContextModelingPackage.USER_PROFILE__PARENT, ContextModelingPackage.USER_PROFILE__SUB_PROFILE);
		}
		return parent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UserProfile> getSubProfile() {
		if (subProfile == null) {
			subProfile = new EObjectWithInverseResolvingEList.ManyInverse<UserProfile>(UserProfile.class, this, ContextModelingPackage.USER_PROFILE__SUB_PROFILE, ContextModelingPackage.USER_PROFILE__PARENT);
		}
		return subProfile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Participant> getParticipant() {
		if (participant == null) {
			participant = new EObjectWithInverseResolvingEList.ManyInverse<Participant>(Participant.class, this, ContextModelingPackage.USER_PROFILE__PARTICIPANT, EvaluationModelingPackage.PARTICIPANT__USER_PROFILE);
		}
		return participant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserHierarchy getUserHierarchy() {
		if (userHierarchy != null && userHierarchy.eIsProxy()) {
			InternalEObject oldUserHierarchy = (InternalEObject)userHierarchy;
			userHierarchy = (UserHierarchy)eResolveProxy(oldUserHierarchy);
			if (userHierarchy != oldUserHierarchy) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ContextModelingPackage.USER_PROFILE__USER_HIERARCHY, oldUserHierarchy, userHierarchy));
			}
		}
		return userHierarchy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserHierarchy basicGetUserHierarchy() {
		return userHierarchy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUserHierarchy(UserHierarchy newUserHierarchy, NotificationChain msgs) {
		UserHierarchy oldUserHierarchy = userHierarchy;
		userHierarchy = newUserHierarchy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ContextModelingPackage.USER_PROFILE__USER_HIERARCHY, oldUserHierarchy, newUserHierarchy);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserHierarchy(UserHierarchy newUserHierarchy) {
		if (newUserHierarchy != userHierarchy) {
			NotificationChain msgs = null;
			if (userHierarchy != null)
				msgs = ((InternalEObject)userHierarchy).eInverseRemove(this, ContextModelingPackage.USER_HIERARCHY__USER_PROFILE, UserHierarchy.class, msgs);
			if (newUserHierarchy != null)
				msgs = ((InternalEObject)newUserHierarchy).eInverseAdd(this, ContextModelingPackage.USER_HIERARCHY__USER_PROFILE, UserHierarchy.class, msgs);
			msgs = basicSetUserHierarchy(newUserHierarchy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContextModelingPackage.USER_PROFILE__USER_HIERARCHY, newUserHierarchy, newUserHierarchy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProfileTemplate> getProfileTemplate() {
		if (profileTemplate == null) {
			profileTemplate = new EObjectResolvingEList<ProfileTemplate>(ProfileTemplate.class, this, ContextModelingPackage.USER_PROFILE__PROFILE_TEMPLATE);
		}
		return profileTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LogicalExpression> getClassifier() {
		if (classifier == null) {
			classifier = new EObjectResolvingEList<LogicalExpression>(LogicalExpression.class, this, ContextModelingPackage.USER_PROFILE__CLASSIFIER);
		}
		return classifier;
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
			case ContextModelingPackage.USER_PROFILE__BACKGROUND_QS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getBackgroundQs()).basicAdd(otherEnd, msgs);
			case ContextModelingPackage.USER_PROFILE__PARENT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getParent()).basicAdd(otherEnd, msgs);
			case ContextModelingPackage.USER_PROFILE__SUB_PROFILE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSubProfile()).basicAdd(otherEnd, msgs);
			case ContextModelingPackage.USER_PROFILE__PARTICIPANT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getParticipant()).basicAdd(otherEnd, msgs);
			case ContextModelingPackage.USER_PROFILE__USER_HIERARCHY:
				if (userHierarchy != null)
					msgs = ((InternalEObject)userHierarchy).eInverseRemove(this, ContextModelingPackage.USER_HIERARCHY__USER_PROFILE, UserHierarchy.class, msgs);
				return basicSetUserHierarchy((UserHierarchy)otherEnd, msgs);
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
			case ContextModelingPackage.USER_PROFILE__BACKGROUND_QS:
				return ((InternalEList<?>)getBackgroundQs()).basicRemove(otherEnd, msgs);
			case ContextModelingPackage.USER_PROFILE__PARENT:
				return ((InternalEList<?>)getParent()).basicRemove(otherEnd, msgs);
			case ContextModelingPackage.USER_PROFILE__SUB_PROFILE:
				return ((InternalEList<?>)getSubProfile()).basicRemove(otherEnd, msgs);
			case ContextModelingPackage.USER_PROFILE__PARTICIPANT:
				return ((InternalEList<?>)getParticipant()).basicRemove(otherEnd, msgs);
			case ContextModelingPackage.USER_PROFILE__USER_HIERARCHY:
				return basicSetUserHierarchy(null, msgs);
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
			case ContextModelingPackage.USER_PROFILE__NAME:
				return getName();
			case ContextModelingPackage.USER_PROFILE__BACKGROUND_QS:
				return getBackgroundQs();
			case ContextModelingPackage.USER_PROFILE__PRIORITY:
				return getPriority();
			case ContextModelingPackage.USER_PROFILE__PARENT:
				return getParent();
			case ContextModelingPackage.USER_PROFILE__SUB_PROFILE:
				return getSubProfile();
			case ContextModelingPackage.USER_PROFILE__PARTICIPANT:
				return getParticipant();
			case ContextModelingPackage.USER_PROFILE__USER_HIERARCHY:
				if (resolve) return getUserHierarchy();
				return basicGetUserHierarchy();
			case ContextModelingPackage.USER_PROFILE__PROFILE_TEMPLATE:
				return getProfileTemplate();
			case ContextModelingPackage.USER_PROFILE__CLASSIFIER:
				return getClassifier();
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
			case ContextModelingPackage.USER_PROFILE__NAME:
				setName((String)newValue);
				return;
			case ContextModelingPackage.USER_PROFILE__BACKGROUND_QS:
				getBackgroundQs().clear();
				getBackgroundQs().addAll((Collection<? extends BackgroundQs>)newValue);
				return;
			case ContextModelingPackage.USER_PROFILE__PRIORITY:
				setPriority((PriorityValue)newValue);
				return;
			case ContextModelingPackage.USER_PROFILE__PARENT:
				getParent().clear();
				getParent().addAll((Collection<? extends UserProfile>)newValue);
				return;
			case ContextModelingPackage.USER_PROFILE__SUB_PROFILE:
				getSubProfile().clear();
				getSubProfile().addAll((Collection<? extends UserProfile>)newValue);
				return;
			case ContextModelingPackage.USER_PROFILE__PARTICIPANT:
				getParticipant().clear();
				getParticipant().addAll((Collection<? extends Participant>)newValue);
				return;
			case ContextModelingPackage.USER_PROFILE__USER_HIERARCHY:
				setUserHierarchy((UserHierarchy)newValue);
				return;
			case ContextModelingPackage.USER_PROFILE__PROFILE_TEMPLATE:
				getProfileTemplate().clear();
				getProfileTemplate().addAll((Collection<? extends ProfileTemplate>)newValue);
				return;
			case ContextModelingPackage.USER_PROFILE__CLASSIFIER:
				getClassifier().clear();
				getClassifier().addAll((Collection<? extends LogicalExpression>)newValue);
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
			case ContextModelingPackage.USER_PROFILE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ContextModelingPackage.USER_PROFILE__BACKGROUND_QS:
				getBackgroundQs().clear();
				return;
			case ContextModelingPackage.USER_PROFILE__PRIORITY:
				setPriority(PRIORITY_EDEFAULT);
				return;
			case ContextModelingPackage.USER_PROFILE__PARENT:
				getParent().clear();
				return;
			case ContextModelingPackage.USER_PROFILE__SUB_PROFILE:
				getSubProfile().clear();
				return;
			case ContextModelingPackage.USER_PROFILE__PARTICIPANT:
				getParticipant().clear();
				return;
			case ContextModelingPackage.USER_PROFILE__USER_HIERARCHY:
				setUserHierarchy((UserHierarchy)null);
				return;
			case ContextModelingPackage.USER_PROFILE__PROFILE_TEMPLATE:
				getProfileTemplate().clear();
				return;
			case ContextModelingPackage.USER_PROFILE__CLASSIFIER:
				getClassifier().clear();
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
			case ContextModelingPackage.USER_PROFILE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ContextModelingPackage.USER_PROFILE__BACKGROUND_QS:
				return backgroundQs != null && !backgroundQs.isEmpty();
			case ContextModelingPackage.USER_PROFILE__PRIORITY:
				return priority != PRIORITY_EDEFAULT;
			case ContextModelingPackage.USER_PROFILE__PARENT:
				return parent != null && !parent.isEmpty();
			case ContextModelingPackage.USER_PROFILE__SUB_PROFILE:
				return subProfile != null && !subProfile.isEmpty();
			case ContextModelingPackage.USER_PROFILE__PARTICIPANT:
				return participant != null && !participant.isEmpty();
			case ContextModelingPackage.USER_PROFILE__USER_HIERARCHY:
				return userHierarchy != null;
			case ContextModelingPackage.USER_PROFILE__PROFILE_TEMPLATE:
				return profileTemplate != null && !profileTemplate.isEmpty();
			case ContextModelingPackage.USER_PROFILE__CLASSIFIER:
				return classifier != null && !classifier.isEmpty();
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

} //UserProfileImpl
