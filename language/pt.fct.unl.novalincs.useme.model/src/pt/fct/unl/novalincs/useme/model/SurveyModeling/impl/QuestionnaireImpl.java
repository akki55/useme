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
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import pt.fct.unl.novalincs.useme.model.GoalModeling.GoalModelingPackage;
import pt.fct.unl.novalincs.useme.model.GoalModeling.UsabilityRequirement;

import pt.fct.unl.novalincs.useme.model.SurveyModeling.Question;
import pt.fct.unl.novalincs.useme.model.SurveyModeling.Questionnaire;
import pt.fct.unl.novalincs.useme.model.SurveyModeling.SurveyModel;
import pt.fct.unl.novalincs.useme.model.SurveyModeling.SurveyModelingPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Questionnaire</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.SurveyModeling.impl.QuestionnaireImpl#getName <em>Name</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.SurveyModeling.impl.QuestionnaireImpl#getQuestion <em>Question</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.SurveyModeling.impl.QuestionnaireImpl#getSurveyModel <em>Survey Model</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.SurveyModeling.impl.QuestionnaireImpl#getUsabilityRequirement <em>Usability Requirement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QuestionnaireImpl extends MinimalEObjectImpl.Container implements Questionnaire {
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
	 * The cached value of the '{@link #getQuestion() <em>Question</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuestion()
	 * @generated
	 * @ordered
	 */
	protected EList<Question> question;

	/**
	 * The cached value of the '{@link #getSurveyModel() <em>Survey Model</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSurveyModel()
	 * @generated
	 * @ordered
	 */
	protected EList<SurveyModel> surveyModel;

	/**
	 * The cached value of the '{@link #getUsabilityRequirement() <em>Usability Requirement</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsabilityRequirement()
	 * @generated
	 * @ordered
	 */
	protected EList<UsabilityRequirement> usabilityRequirement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QuestionnaireImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SurveyModelingPackage.Literals.QUESTIONNAIRE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SurveyModelingPackage.QUESTIONNAIRE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Question> getQuestion() {
		if (question == null) {
			question = new EObjectWithInverseResolvingEList<Question>(Question.class, this, SurveyModelingPackage.QUESTIONNAIRE__QUESTION, SurveyModelingPackage.QUESTION__QUESTIONNAIRE);
		}
		return question;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SurveyModel> getSurveyModel() {
		if (surveyModel == null) {
			surveyModel = new EObjectWithInverseResolvingEList.ManyInverse<SurveyModel>(SurveyModel.class, this, SurveyModelingPackage.QUESTIONNAIRE__SURVEY_MODEL, SurveyModelingPackage.SURVEY_MODEL__QUESTIONNAIRE);
		}
		return surveyModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UsabilityRequirement> getUsabilityRequirement() {
		if (usabilityRequirement == null) {
			usabilityRequirement = new EObjectWithInverseResolvingEList.ManyInverse<UsabilityRequirement>(UsabilityRequirement.class, this, SurveyModelingPackage.QUESTIONNAIRE__USABILITY_REQUIREMENT, GoalModelingPackage.USABILITY_REQUIREMENT__QUESTIONNAIRE);
		}
		return usabilityRequirement;
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
			case SurveyModelingPackage.QUESTIONNAIRE__QUESTION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getQuestion()).basicAdd(otherEnd, msgs);
			case SurveyModelingPackage.QUESTIONNAIRE__SURVEY_MODEL:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSurveyModel()).basicAdd(otherEnd, msgs);
			case SurveyModelingPackage.QUESTIONNAIRE__USABILITY_REQUIREMENT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getUsabilityRequirement()).basicAdd(otherEnd, msgs);
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
			case SurveyModelingPackage.QUESTIONNAIRE__QUESTION:
				return ((InternalEList<?>)getQuestion()).basicRemove(otherEnd, msgs);
			case SurveyModelingPackage.QUESTIONNAIRE__SURVEY_MODEL:
				return ((InternalEList<?>)getSurveyModel()).basicRemove(otherEnd, msgs);
			case SurveyModelingPackage.QUESTIONNAIRE__USABILITY_REQUIREMENT:
				return ((InternalEList<?>)getUsabilityRequirement()).basicRemove(otherEnd, msgs);
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
			case SurveyModelingPackage.QUESTIONNAIRE__NAME:
				return getName();
			case SurveyModelingPackage.QUESTIONNAIRE__QUESTION:
				return getQuestion();
			case SurveyModelingPackage.QUESTIONNAIRE__SURVEY_MODEL:
				return getSurveyModel();
			case SurveyModelingPackage.QUESTIONNAIRE__USABILITY_REQUIREMENT:
				return getUsabilityRequirement();
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
			case SurveyModelingPackage.QUESTIONNAIRE__NAME:
				setName((String)newValue);
				return;
			case SurveyModelingPackage.QUESTIONNAIRE__QUESTION:
				getQuestion().clear();
				getQuestion().addAll((Collection<? extends Question>)newValue);
				return;
			case SurveyModelingPackage.QUESTIONNAIRE__SURVEY_MODEL:
				getSurveyModel().clear();
				getSurveyModel().addAll((Collection<? extends SurveyModel>)newValue);
				return;
			case SurveyModelingPackage.QUESTIONNAIRE__USABILITY_REQUIREMENT:
				getUsabilityRequirement().clear();
				getUsabilityRequirement().addAll((Collection<? extends UsabilityRequirement>)newValue);
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
			case SurveyModelingPackage.QUESTIONNAIRE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SurveyModelingPackage.QUESTIONNAIRE__QUESTION:
				getQuestion().clear();
				return;
			case SurveyModelingPackage.QUESTIONNAIRE__SURVEY_MODEL:
				getSurveyModel().clear();
				return;
			case SurveyModelingPackage.QUESTIONNAIRE__USABILITY_REQUIREMENT:
				getUsabilityRequirement().clear();
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
			case SurveyModelingPackage.QUESTIONNAIRE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SurveyModelingPackage.QUESTIONNAIRE__QUESTION:
				return question != null && !question.isEmpty();
			case SurveyModelingPackage.QUESTIONNAIRE__SURVEY_MODEL:
				return surveyModel != null && !surveyModel.isEmpty();
			case SurveyModelingPackage.QUESTIONNAIRE__USABILITY_REQUIREMENT:
				return usabilityRequirement != null && !usabilityRequirement.isEmpty();
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

} //QuestionnaireImpl
