/**
 */
package pt.fct.unl.novalincs.useme.model.EvaluationModeling.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import pt.fct.unl.novalincs.useme.model.ContextModeling.ContextModelingPackage;
import pt.fct.unl.novalincs.useme.model.ContextModeling.UserProfile;

import pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationModel;
import pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationModelingPackage;
import pt.fct.unl.novalincs.useme.model.EvaluationModeling.Participant;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Participant</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.EvaluationModeling.impl.ParticipantImpl#getName <em>Name</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.EvaluationModeling.impl.ParticipantImpl#getContact <em>Contact</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.EvaluationModeling.impl.ParticipantImpl#getEvaluationModel <em>Evaluation Model</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.EvaluationModeling.impl.ParticipantImpl#getUserProfile <em>User Profile</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParticipantImpl extends MinimalEObjectImpl.Container implements Participant {
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
	 * The cached value of the '{@link #getContact() <em>Contact</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContact()
	 * @generated
	 * @ordered
	 */
	protected EList<String> contact;

	/**
	 * The cached value of the '{@link #getEvaluationModel() <em>Evaluation Model</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvaluationModel()
	 * @generated
	 * @ordered
	 */
	protected EList<EvaluationModel> evaluationModel;

	/**
	 * The cached value of the '{@link #getUserProfile() <em>User Profile</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserProfile()
	 * @generated
	 * @ordered
	 */
	protected EList<UserProfile> userProfile;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParticipantImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EvaluationModelingPackage.Literals.PARTICIPANT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EvaluationModelingPackage.PARTICIPANT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getContact() {
		if (contact == null) {
			contact = new EDataTypeUniqueEList<String>(String.class, this, EvaluationModelingPackage.PARTICIPANT__CONTACT);
		}
		return contact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EvaluationModel> getEvaluationModel() {
		if (evaluationModel == null) {
			evaluationModel = new EObjectWithInverseResolvingEList.ManyInverse<EvaluationModel>(EvaluationModel.class, this, EvaluationModelingPackage.PARTICIPANT__EVALUATION_MODEL, EvaluationModelingPackage.EVALUATION_MODEL__PARTICIPANT);
		}
		return evaluationModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UserProfile> getUserProfile() {
		if (userProfile == null) {
			userProfile = new EObjectWithInverseResolvingEList.ManyInverse<UserProfile>(UserProfile.class, this, EvaluationModelingPackage.PARTICIPANT__USER_PROFILE, ContextModelingPackage.USER_PROFILE__PARTICIPANT);
		}
		return userProfile;
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
			case EvaluationModelingPackage.PARTICIPANT__EVALUATION_MODEL:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEvaluationModel()).basicAdd(otherEnd, msgs);
			case EvaluationModelingPackage.PARTICIPANT__USER_PROFILE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getUserProfile()).basicAdd(otherEnd, msgs);
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
			case EvaluationModelingPackage.PARTICIPANT__EVALUATION_MODEL:
				return ((InternalEList<?>)getEvaluationModel()).basicRemove(otherEnd, msgs);
			case EvaluationModelingPackage.PARTICIPANT__USER_PROFILE:
				return ((InternalEList<?>)getUserProfile()).basicRemove(otherEnd, msgs);
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
			case EvaluationModelingPackage.PARTICIPANT__NAME:
				return getName();
			case EvaluationModelingPackage.PARTICIPANT__CONTACT:
				return getContact();
			case EvaluationModelingPackage.PARTICIPANT__EVALUATION_MODEL:
				return getEvaluationModel();
			case EvaluationModelingPackage.PARTICIPANT__USER_PROFILE:
				return getUserProfile();
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
			case EvaluationModelingPackage.PARTICIPANT__NAME:
				setName((String)newValue);
				return;
			case EvaluationModelingPackage.PARTICIPANT__CONTACT:
				getContact().clear();
				getContact().addAll((Collection<? extends String>)newValue);
				return;
			case EvaluationModelingPackage.PARTICIPANT__EVALUATION_MODEL:
				getEvaluationModel().clear();
				getEvaluationModel().addAll((Collection<? extends EvaluationModel>)newValue);
				return;
			case EvaluationModelingPackage.PARTICIPANT__USER_PROFILE:
				getUserProfile().clear();
				getUserProfile().addAll((Collection<? extends UserProfile>)newValue);
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
			case EvaluationModelingPackage.PARTICIPANT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case EvaluationModelingPackage.PARTICIPANT__CONTACT:
				getContact().clear();
				return;
			case EvaluationModelingPackage.PARTICIPANT__EVALUATION_MODEL:
				getEvaluationModel().clear();
				return;
			case EvaluationModelingPackage.PARTICIPANT__USER_PROFILE:
				getUserProfile().clear();
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
			case EvaluationModelingPackage.PARTICIPANT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case EvaluationModelingPackage.PARTICIPANT__CONTACT:
				return contact != null && !contact.isEmpty();
			case EvaluationModelingPackage.PARTICIPANT__EVALUATION_MODEL:
				return evaluationModel != null && !evaluationModel.isEmpty();
			case EvaluationModelingPackage.PARTICIPANT__USER_PROFILE:
				return userProfile != null && !userProfile.isEmpty();
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
		result.append(", contact: ");
		result.append(contact);
		result.append(')');
		return result.toString();
	}

} //ParticipantImpl
