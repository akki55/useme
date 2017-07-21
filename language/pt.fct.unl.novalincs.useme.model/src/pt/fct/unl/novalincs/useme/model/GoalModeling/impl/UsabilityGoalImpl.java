/**
 */
package pt.fct.unl.novalincs.useme.model.GoalModeling.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationGoal;
import pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationModelingPackage;
import pt.fct.unl.novalincs.useme.model.GoalModeling.Actor;
import pt.fct.unl.novalincs.useme.model.GoalModeling.GoalModel;
import pt.fct.unl.novalincs.useme.model.GoalModeling.GoalModelingPackage;
import pt.fct.unl.novalincs.useme.model.GoalModeling.Method;
import pt.fct.unl.novalincs.useme.model.GoalModeling.Scope;
import pt.fct.unl.novalincs.useme.model.GoalModeling.SuccessCoverage;
import pt.fct.unl.novalincs.useme.model.GoalModeling.UsabilityGoal;

import pt.fct.unl.novalincs.useme.model.Utility.FunctionalGoal;
import pt.fct.unl.novalincs.useme.model.Utility.PriorityValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Usability Goal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.GoalModeling.impl.UsabilityGoalImpl#getName <em>Name</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.GoalModeling.impl.UsabilityGoalImpl#getResponsibleActor <em>Responsible Actor</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.GoalModeling.impl.UsabilityGoalImpl#getPriority <em>Priority</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.GoalModeling.impl.UsabilityGoalImpl#getQuestion <em>Question</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.GoalModeling.impl.UsabilityGoalImpl#getMethod <em>Method</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.GoalModeling.impl.UsabilityGoalImpl#getSuccessCoverage <em>Success Coverage</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.GoalModeling.impl.UsabilityGoalImpl#getProvidedFunctionality <em>Provided Functionality</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.GoalModeling.impl.UsabilityGoalImpl#getScope <em>Scope</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.GoalModeling.impl.UsabilityGoalImpl#getSubGoal <em>Sub Goal</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.GoalModeling.impl.UsabilityGoalImpl#getEvaluationGoal <em>Evaluation Goal</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.GoalModeling.impl.UsabilityGoalImpl#getGoalModel <em>Goal Model</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.GoalModeling.impl.UsabilityGoalImpl#getParentGoal <em>Parent Goal</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UsabilityGoalImpl extends MinimalEObjectImpl.Container implements UsabilityGoal {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = "Quality in Use";

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
	 * The cached value of the '{@link #getResponsibleActor() <em>Responsible Actor</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponsibleActor()
	 * @generated
	 * @ordered
	 */
	protected EList<Actor> responsibleActor;

	/**
	 * The default value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected static final PriorityValue PRIORITY_EDEFAULT = PriorityValue.HIGH;

	/**
	 * The cached value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected PriorityValue priority = PRIORITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getQuestion() <em>Question</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuestion()
	 * @generated
	 * @ordered
	 */
	protected static final String QUESTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQuestion() <em>Question</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuestion()
	 * @generated
	 * @ordered
	 */
	protected String question = QUESTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMethod() <em>Method</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethod()
	 * @generated
	 * @ordered
	 */
	protected EList<Method> method;

	/**
	 * The cached value of the '{@link #getSuccessCoverage() <em>Success Coverage</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuccessCoverage()
	 * @generated
	 * @ordered
	 */
	protected SuccessCoverage successCoverage;

	/**
	 * The cached value of the '{@link #getProvidedFunctionality() <em>Provided Functionality</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvidedFunctionality()
	 * @generated
	 * @ordered
	 */
	protected EList<FunctionalGoal> providedFunctionality;

	/**
	 * The cached value of the '{@link #getScope() <em>Scope</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScope()
	 * @generated
	 * @ordered
	 */
	protected EList<Scope> scope;

	/**
	 * The cached value of the '{@link #getSubGoal() <em>Sub Goal</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubGoal()
	 * @generated
	 * @ordered
	 */
	protected EList<UsabilityGoal> subGoal;

	/**
	 * The cached value of the '{@link #getEvaluationGoal() <em>Evaluation Goal</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvaluationGoal()
	 * @generated
	 * @ordered
	 */
	protected EList<EvaluationGoal> evaluationGoal;

	/**
	 * The cached value of the '{@link #getParentGoal() <em>Parent Goal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentGoal()
	 * @generated
	 * @ordered
	 */
	protected UsabilityGoal parentGoal;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UsabilityGoalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GoalModelingPackage.Literals.USABILITY_GOAL;
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
			eNotify(new ENotificationImpl(this, Notification.SET, GoalModelingPackage.USABILITY_GOAL__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Actor> getResponsibleActor() {
		if (responsibleActor == null) {
			responsibleActor = new EObjectWithInverseResolvingEList.ManyInverse<Actor>(Actor.class, this, GoalModelingPackage.USABILITY_GOAL__RESPONSIBLE_ACTOR, GoalModelingPackage.ACTOR__RESPONSIBLE_FOR);
		}
		return responsibleActor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PriorityValue getPriority() {
		return priority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPriority(PriorityValue newPriority) {
		PriorityValue oldPriority = priority;
		priority = newPriority == null ? PRIORITY_EDEFAULT : newPriority;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GoalModelingPackage.USABILITY_GOAL__PRIORITY, oldPriority, priority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getQuestion() {
		return question;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuestion(String newQuestion) {
		String oldQuestion = question;
		question = newQuestion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GoalModelingPackage.USABILITY_GOAL__QUESTION, oldQuestion, question));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Method> getMethod() {
		if (method == null) {
			method = new EObjectWithInverseResolvingEList.ManyInverse<Method>(Method.class, this, GoalModelingPackage.USABILITY_GOAL__METHOD, GoalModelingPackage.METHOD__USABILITY_GOAL);
		}
		return method;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SuccessCoverage getSuccessCoverage() {
		if (successCoverage != null && successCoverage.eIsProxy()) {
			InternalEObject oldSuccessCoverage = (InternalEObject)successCoverage;
			successCoverage = (SuccessCoverage)eResolveProxy(oldSuccessCoverage);
			if (successCoverage != oldSuccessCoverage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GoalModelingPackage.USABILITY_GOAL__SUCCESS_COVERAGE, oldSuccessCoverage, successCoverage));
			}
		}
		return successCoverage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SuccessCoverage basicGetSuccessCoverage() {
		return successCoverage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSuccessCoverage(SuccessCoverage newSuccessCoverage, NotificationChain msgs) {
		SuccessCoverage oldSuccessCoverage = successCoverage;
		successCoverage = newSuccessCoverage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GoalModelingPackage.USABILITY_GOAL__SUCCESS_COVERAGE, oldSuccessCoverage, newSuccessCoverage);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuccessCoverage(SuccessCoverage newSuccessCoverage) {
		if (newSuccessCoverage != successCoverage) {
			NotificationChain msgs = null;
			if (successCoverage != null)
				msgs = ((InternalEObject)successCoverage).eInverseRemove(this, GoalModelingPackage.SUCCESS_COVERAGE__USABILITY_GOAL, SuccessCoverage.class, msgs);
			if (newSuccessCoverage != null)
				msgs = ((InternalEObject)newSuccessCoverage).eInverseAdd(this, GoalModelingPackage.SUCCESS_COVERAGE__USABILITY_GOAL, SuccessCoverage.class, msgs);
			msgs = basicSetSuccessCoverage(newSuccessCoverage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GoalModelingPackage.USABILITY_GOAL__SUCCESS_COVERAGE, newSuccessCoverage, newSuccessCoverage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FunctionalGoal> getProvidedFunctionality() {
		if (providedFunctionality == null) {
			providedFunctionality = new EObjectResolvingEList<FunctionalGoal>(FunctionalGoal.class, this, GoalModelingPackage.USABILITY_GOAL__PROVIDED_FUNCTIONALITY);
		}
		return providedFunctionality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Scope> getScope() {
		if (scope == null) {
			scope = new EObjectWithInverseResolvingEList.ManyInverse<Scope>(Scope.class, this, GoalModelingPackage.USABILITY_GOAL__SCOPE, GoalModelingPackage.SCOPE__USABILITY_GOAL);
		}
		return scope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UsabilityGoal> getSubGoal() {
		if (subGoal == null) {
			subGoal = new EObjectWithInverseResolvingEList<UsabilityGoal>(UsabilityGoal.class, this, GoalModelingPackage.USABILITY_GOAL__SUB_GOAL, GoalModelingPackage.USABILITY_GOAL__PARENT_GOAL);
		}
		return subGoal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EvaluationGoal> getEvaluationGoal() {
		if (evaluationGoal == null) {
			evaluationGoal = new EObjectWithInverseResolvingEList.ManyInverse<EvaluationGoal>(EvaluationGoal.class, this, GoalModelingPackage.USABILITY_GOAL__EVALUATION_GOAL, EvaluationModelingPackage.EVALUATION_GOAL__USABILITY_GOAL);
		}
		return evaluationGoal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GoalModel getGoalModel() {
		if (eContainerFeatureID() != GoalModelingPackage.USABILITY_GOAL__GOAL_MODEL) return null;
		return (GoalModel)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGoalModel(GoalModel newGoalModel, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newGoalModel, GoalModelingPackage.USABILITY_GOAL__GOAL_MODEL, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGoalModel(GoalModel newGoalModel) {
		if (newGoalModel != eInternalContainer() || (eContainerFeatureID() != GoalModelingPackage.USABILITY_GOAL__GOAL_MODEL && newGoalModel != null)) {
			if (EcoreUtil.isAncestor(this, newGoalModel))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newGoalModel != null)
				msgs = ((InternalEObject)newGoalModel).eInverseAdd(this, GoalModelingPackage.GOAL_MODEL__USABILITY_GOAL, GoalModel.class, msgs);
			msgs = basicSetGoalModel(newGoalModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GoalModelingPackage.USABILITY_GOAL__GOAL_MODEL, newGoalModel, newGoalModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UsabilityGoal getParentGoal() {
		if (parentGoal != null && parentGoal.eIsProxy()) {
			InternalEObject oldParentGoal = (InternalEObject)parentGoal;
			parentGoal = (UsabilityGoal)eResolveProxy(oldParentGoal);
			if (parentGoal != oldParentGoal) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GoalModelingPackage.USABILITY_GOAL__PARENT_GOAL, oldParentGoal, parentGoal));
			}
		}
		return parentGoal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UsabilityGoal basicGetParentGoal() {
		return parentGoal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentGoal(UsabilityGoal newParentGoal, NotificationChain msgs) {
		UsabilityGoal oldParentGoal = parentGoal;
		parentGoal = newParentGoal;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GoalModelingPackage.USABILITY_GOAL__PARENT_GOAL, oldParentGoal, newParentGoal);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentGoal(UsabilityGoal newParentGoal) {
		if (newParentGoal != parentGoal) {
			NotificationChain msgs = null;
			if (parentGoal != null)
				msgs = ((InternalEObject)parentGoal).eInverseRemove(this, GoalModelingPackage.USABILITY_GOAL__SUB_GOAL, UsabilityGoal.class, msgs);
			if (newParentGoal != null)
				msgs = ((InternalEObject)newParentGoal).eInverseAdd(this, GoalModelingPackage.USABILITY_GOAL__SUB_GOAL, UsabilityGoal.class, msgs);
			msgs = basicSetParentGoal(newParentGoal, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GoalModelingPackage.USABILITY_GOAL__PARENT_GOAL, newParentGoal, newParentGoal));
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
			case GoalModelingPackage.USABILITY_GOAL__RESPONSIBLE_ACTOR:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getResponsibleActor()).basicAdd(otherEnd, msgs);
			case GoalModelingPackage.USABILITY_GOAL__METHOD:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMethod()).basicAdd(otherEnd, msgs);
			case GoalModelingPackage.USABILITY_GOAL__SUCCESS_COVERAGE:
				if (successCoverage != null)
					msgs = ((InternalEObject)successCoverage).eInverseRemove(this, GoalModelingPackage.SUCCESS_COVERAGE__USABILITY_GOAL, SuccessCoverage.class, msgs);
				return basicSetSuccessCoverage((SuccessCoverage)otherEnd, msgs);
			case GoalModelingPackage.USABILITY_GOAL__SCOPE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getScope()).basicAdd(otherEnd, msgs);
			case GoalModelingPackage.USABILITY_GOAL__SUB_GOAL:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSubGoal()).basicAdd(otherEnd, msgs);
			case GoalModelingPackage.USABILITY_GOAL__EVALUATION_GOAL:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEvaluationGoal()).basicAdd(otherEnd, msgs);
			case GoalModelingPackage.USABILITY_GOAL__GOAL_MODEL:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetGoalModel((GoalModel)otherEnd, msgs);
			case GoalModelingPackage.USABILITY_GOAL__PARENT_GOAL:
				if (parentGoal != null)
					msgs = ((InternalEObject)parentGoal).eInverseRemove(this, GoalModelingPackage.USABILITY_GOAL__SUB_GOAL, UsabilityGoal.class, msgs);
				return basicSetParentGoal((UsabilityGoal)otherEnd, msgs);
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
			case GoalModelingPackage.USABILITY_GOAL__RESPONSIBLE_ACTOR:
				return ((InternalEList<?>)getResponsibleActor()).basicRemove(otherEnd, msgs);
			case GoalModelingPackage.USABILITY_GOAL__METHOD:
				return ((InternalEList<?>)getMethod()).basicRemove(otherEnd, msgs);
			case GoalModelingPackage.USABILITY_GOAL__SUCCESS_COVERAGE:
				return basicSetSuccessCoverage(null, msgs);
			case GoalModelingPackage.USABILITY_GOAL__SCOPE:
				return ((InternalEList<?>)getScope()).basicRemove(otherEnd, msgs);
			case GoalModelingPackage.USABILITY_GOAL__SUB_GOAL:
				return ((InternalEList<?>)getSubGoal()).basicRemove(otherEnd, msgs);
			case GoalModelingPackage.USABILITY_GOAL__EVALUATION_GOAL:
				return ((InternalEList<?>)getEvaluationGoal()).basicRemove(otherEnd, msgs);
			case GoalModelingPackage.USABILITY_GOAL__GOAL_MODEL:
				return basicSetGoalModel(null, msgs);
			case GoalModelingPackage.USABILITY_GOAL__PARENT_GOAL:
				return basicSetParentGoal(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case GoalModelingPackage.USABILITY_GOAL__GOAL_MODEL:
				return eInternalContainer().eInverseRemove(this, GoalModelingPackage.GOAL_MODEL__USABILITY_GOAL, GoalModel.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GoalModelingPackage.USABILITY_GOAL__NAME:
				return getName();
			case GoalModelingPackage.USABILITY_GOAL__RESPONSIBLE_ACTOR:
				return getResponsibleActor();
			case GoalModelingPackage.USABILITY_GOAL__PRIORITY:
				return getPriority();
			case GoalModelingPackage.USABILITY_GOAL__QUESTION:
				return getQuestion();
			case GoalModelingPackage.USABILITY_GOAL__METHOD:
				return getMethod();
			case GoalModelingPackage.USABILITY_GOAL__SUCCESS_COVERAGE:
				if (resolve) return getSuccessCoverage();
				return basicGetSuccessCoverage();
			case GoalModelingPackage.USABILITY_GOAL__PROVIDED_FUNCTIONALITY:
				return getProvidedFunctionality();
			case GoalModelingPackage.USABILITY_GOAL__SCOPE:
				return getScope();
			case GoalModelingPackage.USABILITY_GOAL__SUB_GOAL:
				return getSubGoal();
			case GoalModelingPackage.USABILITY_GOAL__EVALUATION_GOAL:
				return getEvaluationGoal();
			case GoalModelingPackage.USABILITY_GOAL__GOAL_MODEL:
				return getGoalModel();
			case GoalModelingPackage.USABILITY_GOAL__PARENT_GOAL:
				if (resolve) return getParentGoal();
				return basicGetParentGoal();
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
			case GoalModelingPackage.USABILITY_GOAL__NAME:
				setName((String)newValue);
				return;
			case GoalModelingPackage.USABILITY_GOAL__RESPONSIBLE_ACTOR:
				getResponsibleActor().clear();
				getResponsibleActor().addAll((Collection<? extends Actor>)newValue);
				return;
			case GoalModelingPackage.USABILITY_GOAL__PRIORITY:
				setPriority((PriorityValue)newValue);
				return;
			case GoalModelingPackage.USABILITY_GOAL__QUESTION:
				setQuestion((String)newValue);
				return;
			case GoalModelingPackage.USABILITY_GOAL__METHOD:
				getMethod().clear();
				getMethod().addAll((Collection<? extends Method>)newValue);
				return;
			case GoalModelingPackage.USABILITY_GOAL__SUCCESS_COVERAGE:
				setSuccessCoverage((SuccessCoverage)newValue);
				return;
			case GoalModelingPackage.USABILITY_GOAL__PROVIDED_FUNCTIONALITY:
				getProvidedFunctionality().clear();
				getProvidedFunctionality().addAll((Collection<? extends FunctionalGoal>)newValue);
				return;
			case GoalModelingPackage.USABILITY_GOAL__SCOPE:
				getScope().clear();
				getScope().addAll((Collection<? extends Scope>)newValue);
				return;
			case GoalModelingPackage.USABILITY_GOAL__SUB_GOAL:
				getSubGoal().clear();
				getSubGoal().addAll((Collection<? extends UsabilityGoal>)newValue);
				return;
			case GoalModelingPackage.USABILITY_GOAL__EVALUATION_GOAL:
				getEvaluationGoal().clear();
				getEvaluationGoal().addAll((Collection<? extends EvaluationGoal>)newValue);
				return;
			case GoalModelingPackage.USABILITY_GOAL__GOAL_MODEL:
				setGoalModel((GoalModel)newValue);
				return;
			case GoalModelingPackage.USABILITY_GOAL__PARENT_GOAL:
				setParentGoal((UsabilityGoal)newValue);
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
			case GoalModelingPackage.USABILITY_GOAL__NAME:
				setName(NAME_EDEFAULT);
				return;
			case GoalModelingPackage.USABILITY_GOAL__RESPONSIBLE_ACTOR:
				getResponsibleActor().clear();
				return;
			case GoalModelingPackage.USABILITY_GOAL__PRIORITY:
				setPriority(PRIORITY_EDEFAULT);
				return;
			case GoalModelingPackage.USABILITY_GOAL__QUESTION:
				setQuestion(QUESTION_EDEFAULT);
				return;
			case GoalModelingPackage.USABILITY_GOAL__METHOD:
				getMethod().clear();
				return;
			case GoalModelingPackage.USABILITY_GOAL__SUCCESS_COVERAGE:
				setSuccessCoverage((SuccessCoverage)null);
				return;
			case GoalModelingPackage.USABILITY_GOAL__PROVIDED_FUNCTIONALITY:
				getProvidedFunctionality().clear();
				return;
			case GoalModelingPackage.USABILITY_GOAL__SCOPE:
				getScope().clear();
				return;
			case GoalModelingPackage.USABILITY_GOAL__SUB_GOAL:
				getSubGoal().clear();
				return;
			case GoalModelingPackage.USABILITY_GOAL__EVALUATION_GOAL:
				getEvaluationGoal().clear();
				return;
			case GoalModelingPackage.USABILITY_GOAL__GOAL_MODEL:
				setGoalModel((GoalModel)null);
				return;
			case GoalModelingPackage.USABILITY_GOAL__PARENT_GOAL:
				setParentGoal((UsabilityGoal)null);
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
			case GoalModelingPackage.USABILITY_GOAL__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case GoalModelingPackage.USABILITY_GOAL__RESPONSIBLE_ACTOR:
				return responsibleActor != null && !responsibleActor.isEmpty();
			case GoalModelingPackage.USABILITY_GOAL__PRIORITY:
				return priority != PRIORITY_EDEFAULT;
			case GoalModelingPackage.USABILITY_GOAL__QUESTION:
				return QUESTION_EDEFAULT == null ? question != null : !QUESTION_EDEFAULT.equals(question);
			case GoalModelingPackage.USABILITY_GOAL__METHOD:
				return method != null && !method.isEmpty();
			case GoalModelingPackage.USABILITY_GOAL__SUCCESS_COVERAGE:
				return successCoverage != null;
			case GoalModelingPackage.USABILITY_GOAL__PROVIDED_FUNCTIONALITY:
				return providedFunctionality != null && !providedFunctionality.isEmpty();
			case GoalModelingPackage.USABILITY_GOAL__SCOPE:
				return scope != null && !scope.isEmpty();
			case GoalModelingPackage.USABILITY_GOAL__SUB_GOAL:
				return subGoal != null && !subGoal.isEmpty();
			case GoalModelingPackage.USABILITY_GOAL__EVALUATION_GOAL:
				return evaluationGoal != null && !evaluationGoal.isEmpty();
			case GoalModelingPackage.USABILITY_GOAL__GOAL_MODEL:
				return getGoalModel() != null;
			case GoalModelingPackage.USABILITY_GOAL__PARENT_GOAL:
				return parentGoal != null;
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
		result.append(", priority: ");
		result.append(priority);
		result.append(", question: ");
		result.append(question);
		result.append(')');
		return result.toString();
	}

} //UsabilityGoalImpl
