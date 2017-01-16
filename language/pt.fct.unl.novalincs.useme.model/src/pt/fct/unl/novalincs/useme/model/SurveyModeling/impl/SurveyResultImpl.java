/**
 */
package pt.fct.unl.novalincs.useme.model.SurveyModeling.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import pt.fct.unl.novalincs.useme.model.ReportModeling.impl.EvaluationResultImpl;

import pt.fct.unl.novalincs.useme.model.SurveyModeling.SurveyModel;
import pt.fct.unl.novalincs.useme.model.SurveyModeling.SurveyModelingPackage;
import pt.fct.unl.novalincs.useme.model.SurveyModeling.SurveyResult;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Survey Result</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.SurveyModeling.impl.SurveyResultImpl#getSurveyModel <em>Survey Model</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SurveyResultImpl extends EvaluationResultImpl implements SurveyResult {
	/**
	 * The cached value of the '{@link #getSurveyModel() <em>Survey Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSurveyModel()
	 * @generated
	 * @ordered
	 */
	protected SurveyModel surveyModel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SurveyResultImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SurveyModelingPackage.Literals.SURVEY_RESULT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SurveyModel getSurveyModel() {
		if (surveyModel != null && surveyModel.eIsProxy()) {
			InternalEObject oldSurveyModel = (InternalEObject)surveyModel;
			surveyModel = (SurveyModel)eResolveProxy(oldSurveyModel);
			if (surveyModel != oldSurveyModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SurveyModelingPackage.SURVEY_RESULT__SURVEY_MODEL, oldSurveyModel, surveyModel));
			}
		}
		return surveyModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SurveyModel basicGetSurveyModel() {
		return surveyModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSurveyModel(SurveyModel newSurveyModel, NotificationChain msgs) {
		SurveyModel oldSurveyModel = surveyModel;
		surveyModel = newSurveyModel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SurveyModelingPackage.SURVEY_RESULT__SURVEY_MODEL, oldSurveyModel, newSurveyModel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSurveyModel(SurveyModel newSurveyModel) {
		if (newSurveyModel != surveyModel) {
			NotificationChain msgs = null;
			if (surveyModel != null)
				msgs = ((InternalEObject)surveyModel).eInverseRemove(this, SurveyModelingPackage.SURVEY_MODEL__SURVEY_RESULT, SurveyModel.class, msgs);
			if (newSurveyModel != null)
				msgs = ((InternalEObject)newSurveyModel).eInverseAdd(this, SurveyModelingPackage.SURVEY_MODEL__SURVEY_RESULT, SurveyModel.class, msgs);
			msgs = basicSetSurveyModel(newSurveyModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SurveyModelingPackage.SURVEY_RESULT__SURVEY_MODEL, newSurveyModel, newSurveyModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SurveyModelingPackage.SURVEY_RESULT__SURVEY_MODEL:
				if (surveyModel != null)
					msgs = ((InternalEObject)surveyModel).eInverseRemove(this, SurveyModelingPackage.SURVEY_MODEL__SURVEY_RESULT, SurveyModel.class, msgs);
				return basicSetSurveyModel((SurveyModel)otherEnd, msgs);
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
			case SurveyModelingPackage.SURVEY_RESULT__SURVEY_MODEL:
				return basicSetSurveyModel(null, msgs);
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
			case SurveyModelingPackage.SURVEY_RESULT__SURVEY_MODEL:
				if (resolve) return getSurveyModel();
				return basicGetSurveyModel();
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
			case SurveyModelingPackage.SURVEY_RESULT__SURVEY_MODEL:
				setSurveyModel((SurveyModel)newValue);
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
			case SurveyModelingPackage.SURVEY_RESULT__SURVEY_MODEL:
				setSurveyModel((SurveyModel)null);
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
			case SurveyModelingPackage.SURVEY_RESULT__SURVEY_MODEL:
				return surveyModel != null;
		}
		return super.eIsSet(featureID);
	}

} //SurveyResultImpl
