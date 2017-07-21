/**
 */
package pt.fct.unl.novalincs.useme.model.ContextModeling.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import pt.fct.unl.novalincs.useme.model.ContextModeling.ContextModel;
import pt.fct.unl.novalincs.useme.model.ContextModeling.ContextModelingPackage;
import pt.fct.unl.novalincs.useme.model.ContextModeling.UserHierarchy;
import pt.fct.unl.novalincs.useme.model.ContextModeling.UserProfile;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>User Hierarchy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.ContextModeling.impl.UserHierarchyImpl#getUserProfile <em>User Profile</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.ContextModeling.impl.UserHierarchyImpl#getContextModel <em>Context Model</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.ContextModeling.impl.UserHierarchyImpl#getUhDescription <em>Uh Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UserHierarchyImpl extends MinimalEObjectImpl.Container implements UserHierarchy {
	/**
	 * The cached value of the '{@link #getUserProfile() <em>User Profile</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserProfile()
	 * @generated
	 * @ordered
	 */
	protected UserProfile userProfile;

	/**
	 * The default value of the '{@link #getUhDescription() <em>Uh Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUhDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String UH_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUhDescription() <em>Uh Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUhDescription()
	 * @generated
	 * @ordered
	 */
	protected String uhDescription = UH_DESCRIPTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UserHierarchyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContextModelingPackage.Literals.USER_HIERARCHY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserProfile getUserProfile() {
		if (userProfile != null && userProfile.eIsProxy()) {
			InternalEObject oldUserProfile = (InternalEObject)userProfile;
			userProfile = (UserProfile)eResolveProxy(oldUserProfile);
			if (userProfile != oldUserProfile) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ContextModelingPackage.USER_HIERARCHY__USER_PROFILE, oldUserProfile, userProfile));
			}
		}
		return userProfile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserProfile basicGetUserProfile() {
		return userProfile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUserProfile(UserProfile newUserProfile, NotificationChain msgs) {
		UserProfile oldUserProfile = userProfile;
		userProfile = newUserProfile;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ContextModelingPackage.USER_HIERARCHY__USER_PROFILE, oldUserProfile, newUserProfile);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserProfile(UserProfile newUserProfile) {
		if (newUserProfile != userProfile) {
			NotificationChain msgs = null;
			if (userProfile != null)
				msgs = ((InternalEObject)userProfile).eInverseRemove(this, ContextModelingPackage.USER_PROFILE__USER_HIERARCHY, UserProfile.class, msgs);
			if (newUserProfile != null)
				msgs = ((InternalEObject)newUserProfile).eInverseAdd(this, ContextModelingPackage.USER_PROFILE__USER_HIERARCHY, UserProfile.class, msgs);
			msgs = basicSetUserProfile(newUserProfile, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContextModelingPackage.USER_HIERARCHY__USER_PROFILE, newUserProfile, newUserProfile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContextModel getContextModel() {
		if (eContainerFeatureID() != ContextModelingPackage.USER_HIERARCHY__CONTEXT_MODEL) return null;
		return (ContextModel)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContextModel(ContextModel newContextModel, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newContextModel, ContextModelingPackage.USER_HIERARCHY__CONTEXT_MODEL, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContextModel(ContextModel newContextModel) {
		if (newContextModel != eInternalContainer() || (eContainerFeatureID() != ContextModelingPackage.USER_HIERARCHY__CONTEXT_MODEL && newContextModel != null)) {
			if (EcoreUtil.isAncestor(this, newContextModel))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newContextModel != null)
				msgs = ((InternalEObject)newContextModel).eInverseAdd(this, ContextModelingPackage.CONTEXT_MODEL__USER_HIERARCHY, ContextModel.class, msgs);
			msgs = basicSetContextModel(newContextModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContextModelingPackage.USER_HIERARCHY__CONTEXT_MODEL, newContextModel, newContextModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUhDescription() {
		return uhDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUhDescription(String newUhDescription) {
		String oldUhDescription = uhDescription;
		uhDescription = newUhDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContextModelingPackage.USER_HIERARCHY__UH_DESCRIPTION, oldUhDescription, uhDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ContextModelingPackage.USER_HIERARCHY__USER_PROFILE:
				if (userProfile != null)
					msgs = ((InternalEObject)userProfile).eInverseRemove(this, ContextModelingPackage.USER_PROFILE__USER_HIERARCHY, UserProfile.class, msgs);
				return basicSetUserProfile((UserProfile)otherEnd, msgs);
			case ContextModelingPackage.USER_HIERARCHY__CONTEXT_MODEL:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetContextModel((ContextModel)otherEnd, msgs);
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
			case ContextModelingPackage.USER_HIERARCHY__USER_PROFILE:
				return basicSetUserProfile(null, msgs);
			case ContextModelingPackage.USER_HIERARCHY__CONTEXT_MODEL:
				return basicSetContextModel(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case ContextModelingPackage.USER_HIERARCHY__CONTEXT_MODEL:
				return eInternalContainer().eInverseRemove(this, ContextModelingPackage.CONTEXT_MODEL__USER_HIERARCHY, ContextModel.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ContextModelingPackage.USER_HIERARCHY__USER_PROFILE:
				if (resolve) return getUserProfile();
				return basicGetUserProfile();
			case ContextModelingPackage.USER_HIERARCHY__CONTEXT_MODEL:
				return getContextModel();
			case ContextModelingPackage.USER_HIERARCHY__UH_DESCRIPTION:
				return getUhDescription();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ContextModelingPackage.USER_HIERARCHY__USER_PROFILE:
				setUserProfile((UserProfile)newValue);
				return;
			case ContextModelingPackage.USER_HIERARCHY__CONTEXT_MODEL:
				setContextModel((ContextModel)newValue);
				return;
			case ContextModelingPackage.USER_HIERARCHY__UH_DESCRIPTION:
				setUhDescription((String)newValue);
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
			case ContextModelingPackage.USER_HIERARCHY__USER_PROFILE:
				setUserProfile((UserProfile)null);
				return;
			case ContextModelingPackage.USER_HIERARCHY__CONTEXT_MODEL:
				setContextModel((ContextModel)null);
				return;
			case ContextModelingPackage.USER_HIERARCHY__UH_DESCRIPTION:
				setUhDescription(UH_DESCRIPTION_EDEFAULT);
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
			case ContextModelingPackage.USER_HIERARCHY__USER_PROFILE:
				return userProfile != null;
			case ContextModelingPackage.USER_HIERARCHY__CONTEXT_MODEL:
				return getContextModel() != null;
			case ContextModelingPackage.USER_HIERARCHY__UH_DESCRIPTION:
				return UH_DESCRIPTION_EDEFAULT == null ? uhDescription != null : !UH_DESCRIPTION_EDEFAULT.equals(uhDescription);
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
		result.append(" (uhDescription: ");
		result.append(uhDescription);
		result.append(')');
		return result.toString();
	}

} //UserHierarchyImpl
