/**
 */
package pt.fct.unl.novalincs.useme.model.SurveyModeling.impl;

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

import pt.fct.unl.novalincs.useme.model.SurveyModeling.Question;
import pt.fct.unl.novalincs.useme.model.SurveyModeling.Questionnaire;
import pt.fct.unl.novalincs.useme.model.SurveyModeling.SurveyModel;
import pt.fct.unl.novalincs.useme.model.SurveyModeling.SurveyModelingPackage;
import pt.fct.unl.novalincs.useme.model.SurveyModeling.SurveyResult;
import pt.fct.unl.novalincs.useme.model.SurveyModeling.SurveySpecification;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Survey Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.SurveyModeling.impl.SurveySpecificationImpl#getName <em>Name</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.SurveyModeling.impl.SurveySpecificationImpl#getSurveyModel <em>Survey Model</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.SurveyModeling.impl.SurveySpecificationImpl#getQuestionnaire <em>Questionnaire</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.SurveyModeling.impl.SurveySpecificationImpl#getSurveyResult <em>Survey Result</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.SurveyModeling.impl.SurveySpecificationImpl#getQuestion <em>Question</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SurveySpecificationImpl extends MinimalEObjectImpl.Container implements SurveySpecification {
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
	 * The cached value of the '{@link #getSurveyModel() <em>Survey Model</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSurveyModel()
	 * @generated
	 * @ordered
	 */
	protected EList<SurveyModel> surveyModel;

	/**
	 * The cached value of the '{@link #getQuestionnaire() <em>Questionnaire</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuestionnaire()
	 * @generated
	 * @ordered
	 */
	protected EList<Questionnaire> questionnaire;

	/**
	 * The cached value of the '{@link #getSurveyResult() <em>Survey Result</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSurveyResult()
	 * @generated
	 * @ordered
	 */
	protected EList<SurveyResult> surveyResult;

	/**
	 * The cached value of the '{@link #getQuestion() <em>Question</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuestion()
	 * @generated
	 * @ordered
	 */
	protected EList<Question> question;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SurveySpecificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SurveyModelingPackage.Literals.SURVEY_SPECIFICATION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SurveyModelingPackage.SURVEY_SPECIFICATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SurveyModel> getSurveyModel() {
		if (surveyModel == null) {
			surveyModel = new EObjectContainmentEList<SurveyModel>(SurveyModel.class, this, SurveyModelingPackage.SURVEY_SPECIFICATION__SURVEY_MODEL);
		}
		return surveyModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Questionnaire> getQuestionnaire() {
		if (questionnaire == null) {
			questionnaire = new EObjectContainmentEList<Questionnaire>(Questionnaire.class, this, SurveyModelingPackage.SURVEY_SPECIFICATION__QUESTIONNAIRE);
		}
		return questionnaire;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SurveyResult> getSurveyResult() {
		if (surveyResult == null) {
			surveyResult = new EObjectContainmentEList<SurveyResult>(SurveyResult.class, this, SurveyModelingPackage.SURVEY_SPECIFICATION__SURVEY_RESULT);
		}
		return surveyResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Question> getQuestion() {
		if (question == null) {
			question = new EObjectContainmentEList<Question>(Question.class, this, SurveyModelingPackage.SURVEY_SPECIFICATION__QUESTION);
		}
		return question;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SurveyModelingPackage.SURVEY_SPECIFICATION__SURVEY_MODEL:
				return ((InternalEList<?>)getSurveyModel()).basicRemove(otherEnd, msgs);
			case SurveyModelingPackage.SURVEY_SPECIFICATION__QUESTIONNAIRE:
				return ((InternalEList<?>)getQuestionnaire()).basicRemove(otherEnd, msgs);
			case SurveyModelingPackage.SURVEY_SPECIFICATION__SURVEY_RESULT:
				return ((InternalEList<?>)getSurveyResult()).basicRemove(otherEnd, msgs);
			case SurveyModelingPackage.SURVEY_SPECIFICATION__QUESTION:
				return ((InternalEList<?>)getQuestion()).basicRemove(otherEnd, msgs);
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
			case SurveyModelingPackage.SURVEY_SPECIFICATION__NAME:
				return getName();
			case SurveyModelingPackage.SURVEY_SPECIFICATION__SURVEY_MODEL:
				return getSurveyModel();
			case SurveyModelingPackage.SURVEY_SPECIFICATION__QUESTIONNAIRE:
				return getQuestionnaire();
			case SurveyModelingPackage.SURVEY_SPECIFICATION__SURVEY_RESULT:
				return getSurveyResult();
			case SurveyModelingPackage.SURVEY_SPECIFICATION__QUESTION:
				return getQuestion();
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
			case SurveyModelingPackage.SURVEY_SPECIFICATION__NAME:
				setName((String)newValue);
				return;
			case SurveyModelingPackage.SURVEY_SPECIFICATION__SURVEY_MODEL:
				getSurveyModel().clear();
				getSurveyModel().addAll((Collection<? extends SurveyModel>)newValue);
				return;
			case SurveyModelingPackage.SURVEY_SPECIFICATION__QUESTIONNAIRE:
				getQuestionnaire().clear();
				getQuestionnaire().addAll((Collection<? extends Questionnaire>)newValue);
				return;
			case SurveyModelingPackage.SURVEY_SPECIFICATION__SURVEY_RESULT:
				getSurveyResult().clear();
				getSurveyResult().addAll((Collection<? extends SurveyResult>)newValue);
				return;
			case SurveyModelingPackage.SURVEY_SPECIFICATION__QUESTION:
				getQuestion().clear();
				getQuestion().addAll((Collection<? extends Question>)newValue);
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
			case SurveyModelingPackage.SURVEY_SPECIFICATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SurveyModelingPackage.SURVEY_SPECIFICATION__SURVEY_MODEL:
				getSurveyModel().clear();
				return;
			case SurveyModelingPackage.SURVEY_SPECIFICATION__QUESTIONNAIRE:
				getQuestionnaire().clear();
				return;
			case SurveyModelingPackage.SURVEY_SPECIFICATION__SURVEY_RESULT:
				getSurveyResult().clear();
				return;
			case SurveyModelingPackage.SURVEY_SPECIFICATION__QUESTION:
				getQuestion().clear();
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
			case SurveyModelingPackage.SURVEY_SPECIFICATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SurveyModelingPackage.SURVEY_SPECIFICATION__SURVEY_MODEL:
				return surveyModel != null && !surveyModel.isEmpty();
			case SurveyModelingPackage.SURVEY_SPECIFICATION__QUESTIONNAIRE:
				return questionnaire != null && !questionnaire.isEmpty();
			case SurveyModelingPackage.SURVEY_SPECIFICATION__SURVEY_RESULT:
				return surveyResult != null && !surveyResult.isEmpty();
			case SurveyModelingPackage.SURVEY_SPECIFICATION__QUESTION:
				return question != null && !question.isEmpty();
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

} //SurveySpecificationImpl
