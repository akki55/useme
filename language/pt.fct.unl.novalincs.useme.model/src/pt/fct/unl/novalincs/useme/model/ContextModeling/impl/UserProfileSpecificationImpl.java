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
import org.eclipse.emf.ecore.util.InternalEList;

import pt.fct.unl.novalincs.useme.model.ContextModeling.ContextModelingPackage;
import pt.fct.unl.novalincs.useme.model.ContextModeling.UserProfile;
import pt.fct.unl.novalincs.useme.model.ContextModeling.UserProfileSpecification;

import pt.fct.unl.novalincs.useme.model.Utility.LogicalExpression;
import pt.fct.unl.novalincs.useme.model.Utility.ProfileTemplate;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>User Profile Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.ContextModeling.impl.UserProfileSpecificationImpl#getName <em>Name</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.ContextModeling.impl.UserProfileSpecificationImpl#getUserProfile <em>User Profile</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.ContextModeling.impl.UserProfileSpecificationImpl#getProfileTemplate <em>Profile Template</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.ContextModeling.impl.UserProfileSpecificationImpl#getLogicalExpression <em>Logical Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UserProfileSpecificationImpl extends MinimalEObjectImpl.Container implements UserProfileSpecification {
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
	 * The cached value of the '{@link #getUserProfile() <em>User Profile</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserProfile()
	 * @generated
	 * @ordered
	 */
	protected EList<UserProfile> userProfile;

	/**
	 * The cached value of the '{@link #getProfileTemplate() <em>Profile Template</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProfileTemplate()
	 * @generated
	 * @ordered
	 */
	protected EList<ProfileTemplate> profileTemplate;

	/**
	 * The cached value of the '{@link #getLogicalExpression() <em>Logical Expression</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogicalExpression()
	 * @generated
	 * @ordered
	 */
	protected EList<LogicalExpression> logicalExpression;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UserProfileSpecificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContextModelingPackage.Literals.USER_PROFILE_SPECIFICATION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ContextModelingPackage.USER_PROFILE_SPECIFICATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UserProfile> getUserProfile() {
		if (userProfile == null) {
			userProfile = new EObjectContainmentEList<UserProfile>(UserProfile.class, this, ContextModelingPackage.USER_PROFILE_SPECIFICATION__USER_PROFILE);
		}
		return userProfile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProfileTemplate> getProfileTemplate() {
		if (profileTemplate == null) {
			profileTemplate = new EObjectContainmentEList<ProfileTemplate>(ProfileTemplate.class, this, ContextModelingPackage.USER_PROFILE_SPECIFICATION__PROFILE_TEMPLATE);
		}
		return profileTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LogicalExpression> getLogicalExpression() {
		if (logicalExpression == null) {
			logicalExpression = new EObjectContainmentEList<LogicalExpression>(LogicalExpression.class, this, ContextModelingPackage.USER_PROFILE_SPECIFICATION__LOGICAL_EXPRESSION);
		}
		return logicalExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ContextModelingPackage.USER_PROFILE_SPECIFICATION__USER_PROFILE:
				return ((InternalEList<?>)getUserProfile()).basicRemove(otherEnd, msgs);
			case ContextModelingPackage.USER_PROFILE_SPECIFICATION__PROFILE_TEMPLATE:
				return ((InternalEList<?>)getProfileTemplate()).basicRemove(otherEnd, msgs);
			case ContextModelingPackage.USER_PROFILE_SPECIFICATION__LOGICAL_EXPRESSION:
				return ((InternalEList<?>)getLogicalExpression()).basicRemove(otherEnd, msgs);
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
			case ContextModelingPackage.USER_PROFILE_SPECIFICATION__NAME:
				return getName();
			case ContextModelingPackage.USER_PROFILE_SPECIFICATION__USER_PROFILE:
				return getUserProfile();
			case ContextModelingPackage.USER_PROFILE_SPECIFICATION__PROFILE_TEMPLATE:
				return getProfileTemplate();
			case ContextModelingPackage.USER_PROFILE_SPECIFICATION__LOGICAL_EXPRESSION:
				return getLogicalExpression();
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
			case ContextModelingPackage.USER_PROFILE_SPECIFICATION__NAME:
				setName((String)newValue);
				return;
			case ContextModelingPackage.USER_PROFILE_SPECIFICATION__USER_PROFILE:
				getUserProfile().clear();
				getUserProfile().addAll((Collection<? extends UserProfile>)newValue);
				return;
			case ContextModelingPackage.USER_PROFILE_SPECIFICATION__PROFILE_TEMPLATE:
				getProfileTemplate().clear();
				getProfileTemplate().addAll((Collection<? extends ProfileTemplate>)newValue);
				return;
			case ContextModelingPackage.USER_PROFILE_SPECIFICATION__LOGICAL_EXPRESSION:
				getLogicalExpression().clear();
				getLogicalExpression().addAll((Collection<? extends LogicalExpression>)newValue);
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
			case ContextModelingPackage.USER_PROFILE_SPECIFICATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ContextModelingPackage.USER_PROFILE_SPECIFICATION__USER_PROFILE:
				getUserProfile().clear();
				return;
			case ContextModelingPackage.USER_PROFILE_SPECIFICATION__PROFILE_TEMPLATE:
				getProfileTemplate().clear();
				return;
			case ContextModelingPackage.USER_PROFILE_SPECIFICATION__LOGICAL_EXPRESSION:
				getLogicalExpression().clear();
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
			case ContextModelingPackage.USER_PROFILE_SPECIFICATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ContextModelingPackage.USER_PROFILE_SPECIFICATION__USER_PROFILE:
				return userProfile != null && !userProfile.isEmpty();
			case ContextModelingPackage.USER_PROFILE_SPECIFICATION__PROFILE_TEMPLATE:
				return profileTemplate != null && !profileTemplate.isEmpty();
			case ContextModelingPackage.USER_PROFILE_SPECIFICATION__LOGICAL_EXPRESSION:
				return logicalExpression != null && !logicalExpression.isEmpty();
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

} //UserProfileSpecificationImpl
