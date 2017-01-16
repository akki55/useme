/**
 */
package pt.fct.unl.novalincs.useme.model.SurveyModeling.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import pt.fct.unl.novalincs.useme.model.ContextModeling.ContextModelingPackage;
import pt.fct.unl.novalincs.useme.model.ContextModeling.UserProfile;

import pt.fct.unl.novalincs.useme.model.SurveyModeling.BackgroundQs;
import pt.fct.unl.novalincs.useme.model.SurveyModeling.SurveyModelingPackage;

import pt.fct.unl.novalincs.useme.model.Utility.LogicalExpression;
import pt.fct.unl.novalincs.useme.model.Utility.UtilityPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Background Qs</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.SurveyModeling.impl.BackgroundQsImpl#getUserProfile <em>User Profile</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.SurveyModeling.impl.BackgroundQsImpl#getLogicalExpression <em>Logical Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BackgroundQsImpl extends QuestionImpl implements BackgroundQs {
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
	 * The cached value of the '{@link #getLogicalExpression() <em>Logical Expression</em>}' reference list.
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
	protected BackgroundQsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SurveyModelingPackage.Literals.BACKGROUND_QS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UserProfile> getUserProfile() {
		if (userProfile == null) {
			userProfile = new EObjectWithInverseResolvingEList.ManyInverse<UserProfile>(UserProfile.class, this, SurveyModelingPackage.BACKGROUND_QS__USER_PROFILE, ContextModelingPackage.USER_PROFILE__BACKGROUND_QS);
		}
		return userProfile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LogicalExpression> getLogicalExpression() {
		if (logicalExpression == null) {
			logicalExpression = new EObjectWithInverseResolvingEList.ManyInverse<LogicalExpression>(LogicalExpression.class, this, SurveyModelingPackage.BACKGROUND_QS__LOGICAL_EXPRESSION, UtilityPackage.LOGICAL_EXPRESSION__QUESTION);
		}
		return logicalExpression;
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
			case SurveyModelingPackage.BACKGROUND_QS__USER_PROFILE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getUserProfile()).basicAdd(otherEnd, msgs);
			case SurveyModelingPackage.BACKGROUND_QS__LOGICAL_EXPRESSION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLogicalExpression()).basicAdd(otherEnd, msgs);
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
			case SurveyModelingPackage.BACKGROUND_QS__USER_PROFILE:
				return ((InternalEList<?>)getUserProfile()).basicRemove(otherEnd, msgs);
			case SurveyModelingPackage.BACKGROUND_QS__LOGICAL_EXPRESSION:
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
			case SurveyModelingPackage.BACKGROUND_QS__USER_PROFILE:
				return getUserProfile();
			case SurveyModelingPackage.BACKGROUND_QS__LOGICAL_EXPRESSION:
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
			case SurveyModelingPackage.BACKGROUND_QS__USER_PROFILE:
				getUserProfile().clear();
				getUserProfile().addAll((Collection<? extends UserProfile>)newValue);
				return;
			case SurveyModelingPackage.BACKGROUND_QS__LOGICAL_EXPRESSION:
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
			case SurveyModelingPackage.BACKGROUND_QS__USER_PROFILE:
				getUserProfile().clear();
				return;
			case SurveyModelingPackage.BACKGROUND_QS__LOGICAL_EXPRESSION:
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
			case SurveyModelingPackage.BACKGROUND_QS__USER_PROFILE:
				return userProfile != null && !userProfile.isEmpty();
			case SurveyModelingPackage.BACKGROUND_QS__LOGICAL_EXPRESSION:
				return logicalExpression != null && !logicalExpression.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BackgroundQsImpl
