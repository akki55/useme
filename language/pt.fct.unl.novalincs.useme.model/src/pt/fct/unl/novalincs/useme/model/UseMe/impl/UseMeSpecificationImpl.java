/**
 */
package pt.fct.unl.novalincs.useme.model.UseMe.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import pt.fct.unl.novalincs.useme.model.ContextModeling.ContextSpecification;

import pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationSpecification;

import pt.fct.unl.novalincs.useme.model.GoalModeling.GoalSpecification;

import pt.fct.unl.novalincs.useme.model.InteractionModeling.InteractionSpecification;

import pt.fct.unl.novalincs.useme.model.ReportModeling.ReportSpecification;

import pt.fct.unl.novalincs.useme.model.SurveyModeling.SurveySpecification;

import pt.fct.unl.novalincs.useme.model.UseMe.UseMePackage;
import pt.fct.unl.novalincs.useme.model.UseMe.UseMeSpecification;

import pt.fct.unl.novalincs.useme.model.Utility.UtilitySpecification;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.UseMe.impl.UseMeSpecificationImpl#getContextSpecification <em>Context Specification</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.UseMe.impl.UseMeSpecificationImpl#getGoalSpecification <em>Goal Specification</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.UseMe.impl.UseMeSpecificationImpl#getEvaluationSpecification <em>Evaluation Specification</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.UseMe.impl.UseMeSpecificationImpl#getInteractionSpecification <em>Interaction Specification</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.UseMe.impl.UseMeSpecificationImpl#getSurveySpecification <em>Survey Specification</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.UseMe.impl.UseMeSpecificationImpl#getReportSpecification <em>Report Specification</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.UseMe.impl.UseMeSpecificationImpl#getUtilitySpecification <em>Utility Specification</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UseMeSpecificationImpl extends MinimalEObjectImpl.Container implements UseMeSpecification {
	/**
	 * The cached value of the '{@link #getContextSpecification() <em>Context Specification</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContextSpecification()
	 * @generated
	 * @ordered
	 */
	protected EList<ContextSpecification> contextSpecification;

	/**
	 * The cached value of the '{@link #getGoalSpecification() <em>Goal Specification</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGoalSpecification()
	 * @generated
	 * @ordered
	 */
	protected EList<GoalSpecification> goalSpecification;

	/**
	 * The cached value of the '{@link #getEvaluationSpecification() <em>Evaluation Specification</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvaluationSpecification()
	 * @generated
	 * @ordered
	 */
	protected EList<EvaluationSpecification> evaluationSpecification;

	/**
	 * The cached value of the '{@link #getInteractionSpecification() <em>Interaction Specification</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInteractionSpecification()
	 * @generated
	 * @ordered
	 */
	protected EList<InteractionSpecification> interactionSpecification;

	/**
	 * The cached value of the '{@link #getSurveySpecification() <em>Survey Specification</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSurveySpecification()
	 * @generated
	 * @ordered
	 */
	protected EList<SurveySpecification> surveySpecification;

	/**
	 * The cached value of the '{@link #getReportSpecification() <em>Report Specification</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReportSpecification()
	 * @generated
	 * @ordered
	 */
	protected EList<ReportSpecification> reportSpecification;

	/**
	 * The cached value of the '{@link #getUtilitySpecification() <em>Utility Specification</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUtilitySpecification()
	 * @generated
	 * @ordered
	 */
	protected EList<UtilitySpecification> utilitySpecification;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UseMeSpecificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UseMePackage.Literals.USE_ME_SPECIFICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContextSpecification> getContextSpecification() {
		if (contextSpecification == null) {
			contextSpecification = new EObjectContainmentEList<ContextSpecification>(ContextSpecification.class, this, UseMePackage.USE_ME_SPECIFICATION__CONTEXT_SPECIFICATION);
		}
		return contextSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GoalSpecification> getGoalSpecification() {
		if (goalSpecification == null) {
			goalSpecification = new EObjectContainmentEList<GoalSpecification>(GoalSpecification.class, this, UseMePackage.USE_ME_SPECIFICATION__GOAL_SPECIFICATION);
		}
		return goalSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EvaluationSpecification> getEvaluationSpecification() {
		if (evaluationSpecification == null) {
			evaluationSpecification = new EObjectContainmentEList<EvaluationSpecification>(EvaluationSpecification.class, this, UseMePackage.USE_ME_SPECIFICATION__EVALUATION_SPECIFICATION);
		}
		return evaluationSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InteractionSpecification> getInteractionSpecification() {
		if (interactionSpecification == null) {
			interactionSpecification = new EObjectContainmentEList<InteractionSpecification>(InteractionSpecification.class, this, UseMePackage.USE_ME_SPECIFICATION__INTERACTION_SPECIFICATION);
		}
		return interactionSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SurveySpecification> getSurveySpecification() {
		if (surveySpecification == null) {
			surveySpecification = new EObjectContainmentEList<SurveySpecification>(SurveySpecification.class, this, UseMePackage.USE_ME_SPECIFICATION__SURVEY_SPECIFICATION);
		}
		return surveySpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ReportSpecification> getReportSpecification() {
		if (reportSpecification == null) {
			reportSpecification = new EObjectContainmentEList<ReportSpecification>(ReportSpecification.class, this, UseMePackage.USE_ME_SPECIFICATION__REPORT_SPECIFICATION);
		}
		return reportSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UtilitySpecification> getUtilitySpecification() {
		if (utilitySpecification == null) {
			utilitySpecification = new EObjectContainmentEList<UtilitySpecification>(UtilitySpecification.class, this, UseMePackage.USE_ME_SPECIFICATION__UTILITY_SPECIFICATION);
		}
		return utilitySpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UseMePackage.USE_ME_SPECIFICATION__CONTEXT_SPECIFICATION:
				return ((InternalEList<?>)getContextSpecification()).basicRemove(otherEnd, msgs);
			case UseMePackage.USE_ME_SPECIFICATION__GOAL_SPECIFICATION:
				return ((InternalEList<?>)getGoalSpecification()).basicRemove(otherEnd, msgs);
			case UseMePackage.USE_ME_SPECIFICATION__EVALUATION_SPECIFICATION:
				return ((InternalEList<?>)getEvaluationSpecification()).basicRemove(otherEnd, msgs);
			case UseMePackage.USE_ME_SPECIFICATION__INTERACTION_SPECIFICATION:
				return ((InternalEList<?>)getInteractionSpecification()).basicRemove(otherEnd, msgs);
			case UseMePackage.USE_ME_SPECIFICATION__SURVEY_SPECIFICATION:
				return ((InternalEList<?>)getSurveySpecification()).basicRemove(otherEnd, msgs);
			case UseMePackage.USE_ME_SPECIFICATION__REPORT_SPECIFICATION:
				return ((InternalEList<?>)getReportSpecification()).basicRemove(otherEnd, msgs);
			case UseMePackage.USE_ME_SPECIFICATION__UTILITY_SPECIFICATION:
				return ((InternalEList<?>)getUtilitySpecification()).basicRemove(otherEnd, msgs);
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
			case UseMePackage.USE_ME_SPECIFICATION__CONTEXT_SPECIFICATION:
				return getContextSpecification();
			case UseMePackage.USE_ME_SPECIFICATION__GOAL_SPECIFICATION:
				return getGoalSpecification();
			case UseMePackage.USE_ME_SPECIFICATION__EVALUATION_SPECIFICATION:
				return getEvaluationSpecification();
			case UseMePackage.USE_ME_SPECIFICATION__INTERACTION_SPECIFICATION:
				return getInteractionSpecification();
			case UseMePackage.USE_ME_SPECIFICATION__SURVEY_SPECIFICATION:
				return getSurveySpecification();
			case UseMePackage.USE_ME_SPECIFICATION__REPORT_SPECIFICATION:
				return getReportSpecification();
			case UseMePackage.USE_ME_SPECIFICATION__UTILITY_SPECIFICATION:
				return getUtilitySpecification();
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
			case UseMePackage.USE_ME_SPECIFICATION__CONTEXT_SPECIFICATION:
				getContextSpecification().clear();
				getContextSpecification().addAll((Collection<? extends ContextSpecification>)newValue);
				return;
			case UseMePackage.USE_ME_SPECIFICATION__GOAL_SPECIFICATION:
				getGoalSpecification().clear();
				getGoalSpecification().addAll((Collection<? extends GoalSpecification>)newValue);
				return;
			case UseMePackage.USE_ME_SPECIFICATION__EVALUATION_SPECIFICATION:
				getEvaluationSpecification().clear();
				getEvaluationSpecification().addAll((Collection<? extends EvaluationSpecification>)newValue);
				return;
			case UseMePackage.USE_ME_SPECIFICATION__INTERACTION_SPECIFICATION:
				getInteractionSpecification().clear();
				getInteractionSpecification().addAll((Collection<? extends InteractionSpecification>)newValue);
				return;
			case UseMePackage.USE_ME_SPECIFICATION__SURVEY_SPECIFICATION:
				getSurveySpecification().clear();
				getSurveySpecification().addAll((Collection<? extends SurveySpecification>)newValue);
				return;
			case UseMePackage.USE_ME_SPECIFICATION__REPORT_SPECIFICATION:
				getReportSpecification().clear();
				getReportSpecification().addAll((Collection<? extends ReportSpecification>)newValue);
				return;
			case UseMePackage.USE_ME_SPECIFICATION__UTILITY_SPECIFICATION:
				getUtilitySpecification().clear();
				getUtilitySpecification().addAll((Collection<? extends UtilitySpecification>)newValue);
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
			case UseMePackage.USE_ME_SPECIFICATION__CONTEXT_SPECIFICATION:
				getContextSpecification().clear();
				return;
			case UseMePackage.USE_ME_SPECIFICATION__GOAL_SPECIFICATION:
				getGoalSpecification().clear();
				return;
			case UseMePackage.USE_ME_SPECIFICATION__EVALUATION_SPECIFICATION:
				getEvaluationSpecification().clear();
				return;
			case UseMePackage.USE_ME_SPECIFICATION__INTERACTION_SPECIFICATION:
				getInteractionSpecification().clear();
				return;
			case UseMePackage.USE_ME_SPECIFICATION__SURVEY_SPECIFICATION:
				getSurveySpecification().clear();
				return;
			case UseMePackage.USE_ME_SPECIFICATION__REPORT_SPECIFICATION:
				getReportSpecification().clear();
				return;
			case UseMePackage.USE_ME_SPECIFICATION__UTILITY_SPECIFICATION:
				getUtilitySpecification().clear();
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
			case UseMePackage.USE_ME_SPECIFICATION__CONTEXT_SPECIFICATION:
				return contextSpecification != null && !contextSpecification.isEmpty();
			case UseMePackage.USE_ME_SPECIFICATION__GOAL_SPECIFICATION:
				return goalSpecification != null && !goalSpecification.isEmpty();
			case UseMePackage.USE_ME_SPECIFICATION__EVALUATION_SPECIFICATION:
				return evaluationSpecification != null && !evaluationSpecification.isEmpty();
			case UseMePackage.USE_ME_SPECIFICATION__INTERACTION_SPECIFICATION:
				return interactionSpecification != null && !interactionSpecification.isEmpty();
			case UseMePackage.USE_ME_SPECIFICATION__SURVEY_SPECIFICATION:
				return surveySpecification != null && !surveySpecification.isEmpty();
			case UseMePackage.USE_ME_SPECIFICATION__REPORT_SPECIFICATION:
				return reportSpecification != null && !reportSpecification.isEmpty();
			case UseMePackage.USE_ME_SPECIFICATION__UTILITY_SPECIFICATION:
				return utilitySpecification != null && !utilitySpecification.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //UseMeSpecificationImpl
