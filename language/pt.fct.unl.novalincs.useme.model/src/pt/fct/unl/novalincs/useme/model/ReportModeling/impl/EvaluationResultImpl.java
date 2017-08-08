/**
 */
package pt.fct.unl.novalincs.useme.model.ReportModeling.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationContext;

import pt.fct.unl.novalincs.useme.model.InteractionModeling.InteractionResult;

import pt.fct.unl.novalincs.useme.model.ReportModeling.EvaluationResult;
import pt.fct.unl.novalincs.useme.model.ReportModeling.ReportModel;
import pt.fct.unl.novalincs.useme.model.ReportModeling.ReportModelingPackage;

import pt.fct.unl.novalincs.useme.model.SurveyModeling.SurveyResult;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Evaluation Result</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.ReportModeling.impl.EvaluationResultImpl#getSurveyResult <em>Survey Result</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.ReportModeling.impl.EvaluationResultImpl#getInteractionResult <em>Interaction Result</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.ReportModeling.impl.EvaluationResultImpl#getReportModel <em>Report Model</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.ReportModeling.impl.EvaluationResultImpl#getEvaluationContext <em>Evaluation Context</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EvaluationResultImpl extends EvaluationResultAbstractImpl implements EvaluationResult {
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
	 * The cached value of the '{@link #getInteractionResult() <em>Interaction Result</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInteractionResult()
	 * @generated
	 * @ordered
	 */
	protected EList<InteractionResult> interactionResult;

	/**
	 * The cached value of the '{@link #getReportModel() <em>Report Model</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReportModel()
	 * @generated
	 * @ordered
	 */
	protected EList<ReportModel> reportModel;

	/**
	 * The cached value of the '{@link #getEvaluationContext() <em>Evaluation Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvaluationContext()
	 * @generated
	 * @ordered
	 */
	protected EvaluationContext evaluationContext;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EvaluationResultImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReportModelingPackage.Literals.EVALUATION_RESULT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SurveyResult> getSurveyResult() {
		if (surveyResult == null) {
			surveyResult = new EObjectResolvingEList<SurveyResult>(SurveyResult.class, this, ReportModelingPackage.EVALUATION_RESULT__SURVEY_RESULT);
		}
		return surveyResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InteractionResult> getInteractionResult() {
		if (interactionResult == null) {
			interactionResult = new EObjectResolvingEList<InteractionResult>(InteractionResult.class, this, ReportModelingPackage.EVALUATION_RESULT__INTERACTION_RESULT);
		}
		return interactionResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ReportModel> getReportModel() {
		if (reportModel == null) {
			reportModel = new EObjectWithInverseResolvingEList.ManyInverse<ReportModel>(ReportModel.class, this, ReportModelingPackage.EVALUATION_RESULT__REPORT_MODEL, ReportModelingPackage.REPORT_MODEL__EVALUATION_RESULT);
		}
		return reportModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvaluationContext getEvaluationContext() {
		if (evaluationContext != null && evaluationContext.eIsProxy()) {
			InternalEObject oldEvaluationContext = (InternalEObject)evaluationContext;
			evaluationContext = (EvaluationContext)eResolveProxy(oldEvaluationContext);
			if (evaluationContext != oldEvaluationContext) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ReportModelingPackage.EVALUATION_RESULT__EVALUATION_CONTEXT, oldEvaluationContext, evaluationContext));
			}
		}
		return evaluationContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvaluationContext basicGetEvaluationContext() {
		return evaluationContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEvaluationContext(EvaluationContext newEvaluationContext) {
		EvaluationContext oldEvaluationContext = evaluationContext;
		evaluationContext = newEvaluationContext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReportModelingPackage.EVALUATION_RESULT__EVALUATION_CONTEXT, oldEvaluationContext, evaluationContext));
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
			case ReportModelingPackage.EVALUATION_RESULT__REPORT_MODEL:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getReportModel()).basicAdd(otherEnd, msgs);
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
			case ReportModelingPackage.EVALUATION_RESULT__REPORT_MODEL:
				return ((InternalEList<?>)getReportModel()).basicRemove(otherEnd, msgs);
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
			case ReportModelingPackage.EVALUATION_RESULT__SURVEY_RESULT:
				return getSurveyResult();
			case ReportModelingPackage.EVALUATION_RESULT__INTERACTION_RESULT:
				return getInteractionResult();
			case ReportModelingPackage.EVALUATION_RESULT__REPORT_MODEL:
				return getReportModel();
			case ReportModelingPackage.EVALUATION_RESULT__EVALUATION_CONTEXT:
				if (resolve) return getEvaluationContext();
				return basicGetEvaluationContext();
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
			case ReportModelingPackage.EVALUATION_RESULT__SURVEY_RESULT:
				getSurveyResult().clear();
				getSurveyResult().addAll((Collection<? extends SurveyResult>)newValue);
				return;
			case ReportModelingPackage.EVALUATION_RESULT__INTERACTION_RESULT:
				getInteractionResult().clear();
				getInteractionResult().addAll((Collection<? extends InteractionResult>)newValue);
				return;
			case ReportModelingPackage.EVALUATION_RESULT__REPORT_MODEL:
				getReportModel().clear();
				getReportModel().addAll((Collection<? extends ReportModel>)newValue);
				return;
			case ReportModelingPackage.EVALUATION_RESULT__EVALUATION_CONTEXT:
				setEvaluationContext((EvaluationContext)newValue);
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
			case ReportModelingPackage.EVALUATION_RESULT__SURVEY_RESULT:
				getSurveyResult().clear();
				return;
			case ReportModelingPackage.EVALUATION_RESULT__INTERACTION_RESULT:
				getInteractionResult().clear();
				return;
			case ReportModelingPackage.EVALUATION_RESULT__REPORT_MODEL:
				getReportModel().clear();
				return;
			case ReportModelingPackage.EVALUATION_RESULT__EVALUATION_CONTEXT:
				setEvaluationContext((EvaluationContext)null);
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
			case ReportModelingPackage.EVALUATION_RESULT__SURVEY_RESULT:
				return surveyResult != null && !surveyResult.isEmpty();
			case ReportModelingPackage.EVALUATION_RESULT__INTERACTION_RESULT:
				return interactionResult != null && !interactionResult.isEmpty();
			case ReportModelingPackage.EVALUATION_RESULT__REPORT_MODEL:
				return reportModel != null && !reportModel.isEmpty();
			case ReportModelingPackage.EVALUATION_RESULT__EVALUATION_CONTEXT:
				return evaluationContext != null;
		}
		return super.eIsSet(featureID);
	}

} //EvaluationResultImpl
