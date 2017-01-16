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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationGoal;
import pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationModel;
import pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationModelingPackage;
import pt.fct.unl.novalincs.useme.model.EvaluationModeling.Language;

import pt.fct.unl.novalincs.useme.model.GoalModeling.Actor;
import pt.fct.unl.novalincs.useme.model.GoalModeling.GoalModelingPackage;
import pt.fct.unl.novalincs.useme.model.GoalModeling.Method;
import pt.fct.unl.novalincs.useme.model.GoalModeling.UsabilityGoal;
import pt.fct.unl.novalincs.useme.model.GoalModeling.UsabilityRequirement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Evaluation Goal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.EvaluationModeling.impl.EvaluationGoalImpl#getName <em>Name</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.EvaluationModeling.impl.EvaluationGoalImpl#getEvaluationModel <em>Evaluation Model</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.EvaluationModeling.impl.EvaluationGoalImpl#isComperative <em>Comperative</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.EvaluationModeling.impl.EvaluationGoalImpl#getLanguage <em>Language</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.EvaluationModeling.impl.EvaluationGoalImpl#getResearchQuestion <em>Research Question</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.EvaluationModeling.impl.EvaluationGoalImpl#getUsabilityGoal <em>Usability Goal</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.EvaluationModeling.impl.EvaluationGoalImpl#getMesurment <em>Mesurment</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.EvaluationModeling.impl.EvaluationGoalImpl#getUsabilityRequirement <em>Usability Requirement</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.EvaluationModeling.impl.EvaluationGoalImpl#getHypothesis <em>Hypothesis</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.EvaluationModeling.impl.EvaluationGoalImpl#getResponsible <em>Responsible</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.EvaluationModeling.impl.EvaluationGoalImpl#getProblemDescription <em>Problem Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EvaluationGoalImpl extends MinimalEObjectImpl.Container implements EvaluationGoal {
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
	 * The cached value of the '{@link #getEvaluationModel() <em>Evaluation Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvaluationModel()
	 * @generated
	 * @ordered
	 */
	protected EvaluationModel evaluationModel;

	/**
	 * The default value of the '{@link #isComperative() <em>Comperative</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isComperative()
	 * @generated
	 * @ordered
	 */
	protected static final boolean COMPERATIVE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isComperative() <em>Comperative</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isComperative()
	 * @generated
	 * @ordered
	 */
	protected boolean comperative = COMPERATIVE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLanguage() <em>Language</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected EList<Language> language;

	/**
	 * The cached value of the '{@link #getResearchQuestion() <em>Research Question</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResearchQuestion()
	 * @generated
	 * @ordered
	 */
	protected EList<String> researchQuestion;

	/**
	 * The cached value of the '{@link #getUsabilityGoal() <em>Usability Goal</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsabilityGoal()
	 * @generated
	 * @ordered
	 */
	protected EList<UsabilityGoal> usabilityGoal;

	/**
	 * The cached value of the '{@link #getMesurment() <em>Mesurment</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMesurment()
	 * @generated
	 * @ordered
	 */
	protected EList<Method> mesurment;

	/**
	 * The cached value of the '{@link #getUsabilityRequirement() <em>Usability Requirement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsabilityRequirement()
	 * @generated
	 * @ordered
	 */
	protected UsabilityRequirement usabilityRequirement;

	/**
	 * The cached value of the '{@link #getHypothesis() <em>Hypothesis</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHypothesis()
	 * @generated
	 * @ordered
	 */
	protected EList<String> hypothesis;

	/**
	 * The cached value of the '{@link #getResponsible() <em>Responsible</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponsible()
	 * @generated
	 * @ordered
	 */
	protected Actor responsible;

	/**
	 * The default value of the '{@link #getProblemDescription() <em>Problem Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProblemDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String PROBLEM_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProblemDescription() <em>Problem Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProblemDescription()
	 * @generated
	 * @ordered
	 */
	protected String problemDescription = PROBLEM_DESCRIPTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EvaluationGoalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EvaluationModelingPackage.Literals.EVALUATION_GOAL;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EvaluationModelingPackage.EVALUATION_GOAL__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvaluationModel getEvaluationModel() {
		if (evaluationModel != null && evaluationModel.eIsProxy()) {
			InternalEObject oldEvaluationModel = (InternalEObject)evaluationModel;
			evaluationModel = (EvaluationModel)eResolveProxy(oldEvaluationModel);
			if (evaluationModel != oldEvaluationModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EvaluationModelingPackage.EVALUATION_GOAL__EVALUATION_MODEL, oldEvaluationModel, evaluationModel));
			}
		}
		return evaluationModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvaluationModel basicGetEvaluationModel() {
		return evaluationModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEvaluationModel(EvaluationModel newEvaluationModel, NotificationChain msgs) {
		EvaluationModel oldEvaluationModel = evaluationModel;
		evaluationModel = newEvaluationModel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EvaluationModelingPackage.EVALUATION_GOAL__EVALUATION_MODEL, oldEvaluationModel, newEvaluationModel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEvaluationModel(EvaluationModel newEvaluationModel) {
		if (newEvaluationModel != evaluationModel) {
			NotificationChain msgs = null;
			if (evaluationModel != null)
				msgs = ((InternalEObject)evaluationModel).eInverseRemove(this, EvaluationModelingPackage.EVALUATION_MODEL__EVALUATION_GOAL, EvaluationModel.class, msgs);
			if (newEvaluationModel != null)
				msgs = ((InternalEObject)newEvaluationModel).eInverseAdd(this, EvaluationModelingPackage.EVALUATION_MODEL__EVALUATION_GOAL, EvaluationModel.class, msgs);
			msgs = basicSetEvaluationModel(newEvaluationModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EvaluationModelingPackage.EVALUATION_GOAL__EVALUATION_MODEL, newEvaluationModel, newEvaluationModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isComperative() {
		return comperative;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComperative(boolean newComperative) {
		boolean oldComperative = comperative;
		comperative = newComperative;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EvaluationModelingPackage.EVALUATION_GOAL__COMPERATIVE, oldComperative, comperative));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Language> getLanguage() {
		if (language == null) {
			language = new EObjectResolvingEList<Language>(Language.class, this, EvaluationModelingPackage.EVALUATION_GOAL__LANGUAGE);
		}
		return language;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getResearchQuestion() {
		if (researchQuestion == null) {
			researchQuestion = new EDataTypeUniqueEList<String>(String.class, this, EvaluationModelingPackage.EVALUATION_GOAL__RESEARCH_QUESTION);
		}
		return researchQuestion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UsabilityGoal> getUsabilityGoal() {
		if (usabilityGoal == null) {
			usabilityGoal = new EObjectWithInverseResolvingEList.ManyInverse<UsabilityGoal>(UsabilityGoal.class, this, EvaluationModelingPackage.EVALUATION_GOAL__USABILITY_GOAL, GoalModelingPackage.USABILITY_GOAL__EVALUATION_GOAL);
		}
		return usabilityGoal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Method> getMesurment() {
		if (mesurment == null) {
			mesurment = new EObjectResolvingEList<Method>(Method.class, this, EvaluationModelingPackage.EVALUATION_GOAL__MESURMENT);
		}
		return mesurment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UsabilityRequirement getUsabilityRequirement() {
		if (usabilityRequirement != null && usabilityRequirement.eIsProxy()) {
			InternalEObject oldUsabilityRequirement = (InternalEObject)usabilityRequirement;
			usabilityRequirement = (UsabilityRequirement)eResolveProxy(oldUsabilityRequirement);
			if (usabilityRequirement != oldUsabilityRequirement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EvaluationModelingPackage.EVALUATION_GOAL__USABILITY_REQUIREMENT, oldUsabilityRequirement, usabilityRequirement));
			}
		}
		return usabilityRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UsabilityRequirement basicGetUsabilityRequirement() {
		return usabilityRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsabilityRequirement(UsabilityRequirement newUsabilityRequirement) {
		UsabilityRequirement oldUsabilityRequirement = usabilityRequirement;
		usabilityRequirement = newUsabilityRequirement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EvaluationModelingPackage.EVALUATION_GOAL__USABILITY_REQUIREMENT, oldUsabilityRequirement, usabilityRequirement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getHypothesis() {
		if (hypothesis == null) {
			hypothesis = new EDataTypeUniqueEList<String>(String.class, this, EvaluationModelingPackage.EVALUATION_GOAL__HYPOTHESIS);
		}
		return hypothesis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Actor getResponsible() {
		if (responsible != null && responsible.eIsProxy()) {
			InternalEObject oldResponsible = (InternalEObject)responsible;
			responsible = (Actor)eResolveProxy(oldResponsible);
			if (responsible != oldResponsible) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EvaluationModelingPackage.EVALUATION_GOAL__RESPONSIBLE, oldResponsible, responsible));
			}
		}
		return responsible;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Actor basicGetResponsible() {
		return responsible;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResponsible(Actor newResponsible) {
		Actor oldResponsible = responsible;
		responsible = newResponsible;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EvaluationModelingPackage.EVALUATION_GOAL__RESPONSIBLE, oldResponsible, responsible));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProblemDescription() {
		return problemDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProblemDescription(String newProblemDescription) {
		String oldProblemDescription = problemDescription;
		problemDescription = newProblemDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EvaluationModelingPackage.EVALUATION_GOAL__PROBLEM_DESCRIPTION, oldProblemDescription, problemDescription));
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
			case EvaluationModelingPackage.EVALUATION_GOAL__EVALUATION_MODEL:
				if (evaluationModel != null)
					msgs = ((InternalEObject)evaluationModel).eInverseRemove(this, EvaluationModelingPackage.EVALUATION_MODEL__EVALUATION_GOAL, EvaluationModel.class, msgs);
				return basicSetEvaluationModel((EvaluationModel)otherEnd, msgs);
			case EvaluationModelingPackage.EVALUATION_GOAL__USABILITY_GOAL:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getUsabilityGoal()).basicAdd(otherEnd, msgs);
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
			case EvaluationModelingPackage.EVALUATION_GOAL__EVALUATION_MODEL:
				return basicSetEvaluationModel(null, msgs);
			case EvaluationModelingPackage.EVALUATION_GOAL__USABILITY_GOAL:
				return ((InternalEList<?>)getUsabilityGoal()).basicRemove(otherEnd, msgs);
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
			case EvaluationModelingPackage.EVALUATION_GOAL__NAME:
				return getName();
			case EvaluationModelingPackage.EVALUATION_GOAL__EVALUATION_MODEL:
				if (resolve) return getEvaluationModel();
				return basicGetEvaluationModel();
			case EvaluationModelingPackage.EVALUATION_GOAL__COMPERATIVE:
				return isComperative();
			case EvaluationModelingPackage.EVALUATION_GOAL__LANGUAGE:
				return getLanguage();
			case EvaluationModelingPackage.EVALUATION_GOAL__RESEARCH_QUESTION:
				return getResearchQuestion();
			case EvaluationModelingPackage.EVALUATION_GOAL__USABILITY_GOAL:
				return getUsabilityGoal();
			case EvaluationModelingPackage.EVALUATION_GOAL__MESURMENT:
				return getMesurment();
			case EvaluationModelingPackage.EVALUATION_GOAL__USABILITY_REQUIREMENT:
				if (resolve) return getUsabilityRequirement();
				return basicGetUsabilityRequirement();
			case EvaluationModelingPackage.EVALUATION_GOAL__HYPOTHESIS:
				return getHypothesis();
			case EvaluationModelingPackage.EVALUATION_GOAL__RESPONSIBLE:
				if (resolve) return getResponsible();
				return basicGetResponsible();
			case EvaluationModelingPackage.EVALUATION_GOAL__PROBLEM_DESCRIPTION:
				return getProblemDescription();
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
			case EvaluationModelingPackage.EVALUATION_GOAL__NAME:
				setName((String)newValue);
				return;
			case EvaluationModelingPackage.EVALUATION_GOAL__EVALUATION_MODEL:
				setEvaluationModel((EvaluationModel)newValue);
				return;
			case EvaluationModelingPackage.EVALUATION_GOAL__COMPERATIVE:
				setComperative((Boolean)newValue);
				return;
			case EvaluationModelingPackage.EVALUATION_GOAL__LANGUAGE:
				getLanguage().clear();
				getLanguage().addAll((Collection<? extends Language>)newValue);
				return;
			case EvaluationModelingPackage.EVALUATION_GOAL__RESEARCH_QUESTION:
				getResearchQuestion().clear();
				getResearchQuestion().addAll((Collection<? extends String>)newValue);
				return;
			case EvaluationModelingPackage.EVALUATION_GOAL__USABILITY_GOAL:
				getUsabilityGoal().clear();
				getUsabilityGoal().addAll((Collection<? extends UsabilityGoal>)newValue);
				return;
			case EvaluationModelingPackage.EVALUATION_GOAL__MESURMENT:
				getMesurment().clear();
				getMesurment().addAll((Collection<? extends Method>)newValue);
				return;
			case EvaluationModelingPackage.EVALUATION_GOAL__USABILITY_REQUIREMENT:
				setUsabilityRequirement((UsabilityRequirement)newValue);
				return;
			case EvaluationModelingPackage.EVALUATION_GOAL__HYPOTHESIS:
				getHypothesis().clear();
				getHypothesis().addAll((Collection<? extends String>)newValue);
				return;
			case EvaluationModelingPackage.EVALUATION_GOAL__RESPONSIBLE:
				setResponsible((Actor)newValue);
				return;
			case EvaluationModelingPackage.EVALUATION_GOAL__PROBLEM_DESCRIPTION:
				setProblemDescription((String)newValue);
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
			case EvaluationModelingPackage.EVALUATION_GOAL__NAME:
				setName(NAME_EDEFAULT);
				return;
			case EvaluationModelingPackage.EVALUATION_GOAL__EVALUATION_MODEL:
				setEvaluationModel((EvaluationModel)null);
				return;
			case EvaluationModelingPackage.EVALUATION_GOAL__COMPERATIVE:
				setComperative(COMPERATIVE_EDEFAULT);
				return;
			case EvaluationModelingPackage.EVALUATION_GOAL__LANGUAGE:
				getLanguage().clear();
				return;
			case EvaluationModelingPackage.EVALUATION_GOAL__RESEARCH_QUESTION:
				getResearchQuestion().clear();
				return;
			case EvaluationModelingPackage.EVALUATION_GOAL__USABILITY_GOAL:
				getUsabilityGoal().clear();
				return;
			case EvaluationModelingPackage.EVALUATION_GOAL__MESURMENT:
				getMesurment().clear();
				return;
			case EvaluationModelingPackage.EVALUATION_GOAL__USABILITY_REQUIREMENT:
				setUsabilityRequirement((UsabilityRequirement)null);
				return;
			case EvaluationModelingPackage.EVALUATION_GOAL__HYPOTHESIS:
				getHypothesis().clear();
				return;
			case EvaluationModelingPackage.EVALUATION_GOAL__RESPONSIBLE:
				setResponsible((Actor)null);
				return;
			case EvaluationModelingPackage.EVALUATION_GOAL__PROBLEM_DESCRIPTION:
				setProblemDescription(PROBLEM_DESCRIPTION_EDEFAULT);
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
			case EvaluationModelingPackage.EVALUATION_GOAL__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case EvaluationModelingPackage.EVALUATION_GOAL__EVALUATION_MODEL:
				return evaluationModel != null;
			case EvaluationModelingPackage.EVALUATION_GOAL__COMPERATIVE:
				return comperative != COMPERATIVE_EDEFAULT;
			case EvaluationModelingPackage.EVALUATION_GOAL__LANGUAGE:
				return language != null && !language.isEmpty();
			case EvaluationModelingPackage.EVALUATION_GOAL__RESEARCH_QUESTION:
				return researchQuestion != null && !researchQuestion.isEmpty();
			case EvaluationModelingPackage.EVALUATION_GOAL__USABILITY_GOAL:
				return usabilityGoal != null && !usabilityGoal.isEmpty();
			case EvaluationModelingPackage.EVALUATION_GOAL__MESURMENT:
				return mesurment != null && !mesurment.isEmpty();
			case EvaluationModelingPackage.EVALUATION_GOAL__USABILITY_REQUIREMENT:
				return usabilityRequirement != null;
			case EvaluationModelingPackage.EVALUATION_GOAL__HYPOTHESIS:
				return hypothesis != null && !hypothesis.isEmpty();
			case EvaluationModelingPackage.EVALUATION_GOAL__RESPONSIBLE:
				return responsible != null;
			case EvaluationModelingPackage.EVALUATION_GOAL__PROBLEM_DESCRIPTION:
				return PROBLEM_DESCRIPTION_EDEFAULT == null ? problemDescription != null : !PROBLEM_DESCRIPTION_EDEFAULT.equals(problemDescription);
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
		result.append(", comperative: ");
		result.append(comperative);
		result.append(", researchQuestion: ");
		result.append(researchQuestion);
		result.append(", hypothesis: ");
		result.append(hypothesis);
		result.append(", problemDescription: ");
		result.append(problemDescription);
		result.append(')');
		return result.toString();
	}

} //EvaluationGoalImpl
