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

import pt.fct.unl.novalincs.useme.model.EvaluationModeling.impl.TestModelImpl;

import pt.fct.unl.novalincs.useme.model.SurveyModeling.Questionnaire;
import pt.fct.unl.novalincs.useme.model.SurveyModeling.SurveyModel;
import pt.fct.unl.novalincs.useme.model.SurveyModeling.SurveyModelingPackage;
import pt.fct.unl.novalincs.useme.model.SurveyModeling.SurveyResult;

import pt.fct.unl.novalincs.useme.model.Utility.SurveyEngine;
import pt.fct.unl.novalincs.useme.model.Utility.UtilityPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Survey Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.SurveyModeling.impl.SurveyModelImpl#getQuestionnaire <em>Questionnaire</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.SurveyModeling.impl.SurveyModelImpl#getSurveyEngine <em>Survey Engine</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.SurveyModeling.impl.SurveyModelImpl#getSurveyResult <em>Survey Result</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SurveyModelImpl extends TestModelImpl implements SurveyModel {
	/**
	 * The cached value of the '{@link #getQuestionnaire() <em>Questionnaire</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuestionnaire()
	 * @generated
	 * @ordered
	 */
	protected EList<Questionnaire> questionnaire;

	/**
	 * The cached value of the '{@link #getSurveyEngine() <em>Survey Engine</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSurveyEngine()
	 * @generated
	 * @ordered
	 */
	protected EList<SurveyEngine> surveyEngine;

	/**
	 * The cached value of the '{@link #getSurveyResult() <em>Survey Result</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSurveyResult()
	 * @generated
	 * @ordered
	 */
	protected EList<SurveyResult> surveyResult;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SurveyModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SurveyModelingPackage.Literals.SURVEY_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Questionnaire> getQuestionnaire() {
		if (questionnaire == null) {
			questionnaire = new EObjectWithInverseResolvingEList.ManyInverse<Questionnaire>(Questionnaire.class, this, SurveyModelingPackage.SURVEY_MODEL__QUESTIONNAIRE, SurveyModelingPackage.QUESTIONNAIRE__SURVEY_MODEL);
		}
		return questionnaire;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SurveyEngine> getSurveyEngine() {
		if (surveyEngine == null) {
			surveyEngine = new EObjectWithInverseResolvingEList<SurveyEngine>(SurveyEngine.class, this, SurveyModelingPackage.SURVEY_MODEL__SURVEY_ENGINE, UtilityPackage.SURVEY_ENGINE__SURVEY_MODEL);
		}
		return surveyEngine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SurveyResult> getSurveyResult() {
		if (surveyResult == null) {
			surveyResult = new EObjectWithInverseResolvingEList<SurveyResult>(SurveyResult.class, this, SurveyModelingPackage.SURVEY_MODEL__SURVEY_RESULT, SurveyModelingPackage.SURVEY_RESULT__SURVEY_MODEL);
		}
		return surveyResult;
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
			case SurveyModelingPackage.SURVEY_MODEL__QUESTIONNAIRE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getQuestionnaire()).basicAdd(otherEnd, msgs);
			case SurveyModelingPackage.SURVEY_MODEL__SURVEY_ENGINE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSurveyEngine()).basicAdd(otherEnd, msgs);
			case SurveyModelingPackage.SURVEY_MODEL__SURVEY_RESULT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSurveyResult()).basicAdd(otherEnd, msgs);
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
			case SurveyModelingPackage.SURVEY_MODEL__QUESTIONNAIRE:
				return ((InternalEList<?>)getQuestionnaire()).basicRemove(otherEnd, msgs);
			case SurveyModelingPackage.SURVEY_MODEL__SURVEY_ENGINE:
				return ((InternalEList<?>)getSurveyEngine()).basicRemove(otherEnd, msgs);
			case SurveyModelingPackage.SURVEY_MODEL__SURVEY_RESULT:
				return ((InternalEList<?>)getSurveyResult()).basicRemove(otherEnd, msgs);
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
			case SurveyModelingPackage.SURVEY_MODEL__QUESTIONNAIRE:
				return getQuestionnaire();
			case SurveyModelingPackage.SURVEY_MODEL__SURVEY_ENGINE:
				return getSurveyEngine();
			case SurveyModelingPackage.SURVEY_MODEL__SURVEY_RESULT:
				return getSurveyResult();
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
			case SurveyModelingPackage.SURVEY_MODEL__QUESTIONNAIRE:
				getQuestionnaire().clear();
				getQuestionnaire().addAll((Collection<? extends Questionnaire>)newValue);
				return;
			case SurveyModelingPackage.SURVEY_MODEL__SURVEY_ENGINE:
				getSurveyEngine().clear();
				getSurveyEngine().addAll((Collection<? extends SurveyEngine>)newValue);
				return;
			case SurveyModelingPackage.SURVEY_MODEL__SURVEY_RESULT:
				getSurveyResult().clear();
				getSurveyResult().addAll((Collection<? extends SurveyResult>)newValue);
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
			case SurveyModelingPackage.SURVEY_MODEL__QUESTIONNAIRE:
				getQuestionnaire().clear();
				return;
			case SurveyModelingPackage.SURVEY_MODEL__SURVEY_ENGINE:
				getSurveyEngine().clear();
				return;
			case SurveyModelingPackage.SURVEY_MODEL__SURVEY_RESULT:
				getSurveyResult().clear();
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
			case SurveyModelingPackage.SURVEY_MODEL__QUESTIONNAIRE:
				return questionnaire != null && !questionnaire.isEmpty();
			case SurveyModelingPackage.SURVEY_MODEL__SURVEY_ENGINE:
				return surveyEngine != null && !surveyEngine.isEmpty();
			case SurveyModelingPackage.SURVEY_MODEL__SURVEY_RESULT:
				return surveyResult != null && !surveyResult.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SurveyModelImpl
