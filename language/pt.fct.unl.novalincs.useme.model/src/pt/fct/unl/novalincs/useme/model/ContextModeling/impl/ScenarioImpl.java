/**
 */
package pt.fct.unl.novalincs.useme.model.ContextModeling.impl;

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
import org.eclipse.emf.ecore.util.InternalEList;

import pt.fct.unl.novalincs.useme.model.ContextModeling.ContextModelingPackage;
import pt.fct.unl.novalincs.useme.model.ContextModeling.Scenario;

import pt.fct.unl.novalincs.useme.model.EvaluationModeling.Documentation;
import pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationModelingPackage;

import pt.fct.unl.novalincs.useme.model.InteractionModeling.InteractionModelingPackage;
import pt.fct.unl.novalincs.useme.model.InteractionModeling.Task;

import pt.fct.unl.novalincs.useme.model.SurveyModeling.FeedbackQs;
import pt.fct.unl.novalincs.useme.model.SurveyModeling.SurveyModelingPackage;

import pt.fct.unl.novalincs.useme.model.Utility.PriorityValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scenario</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.ContextModeling.impl.ScenarioImpl#getName <em>Name</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.ContextModeling.impl.ScenarioImpl#getPriority <em>Priority</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.ContextModeling.impl.ScenarioImpl#getEvaluatedTask <em>Evaluated Task</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.ContextModeling.impl.ScenarioImpl#getDoc <em>Doc</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.ContextModeling.impl.ScenarioImpl#getAggregates <em>Aggregates</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.ContextModeling.impl.ScenarioImpl#getQuestion <em>Question</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ScenarioImpl extends MinimalEObjectImpl.Container implements Scenario {
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
	 * The cached value of the '{@link #getEvaluatedTask() <em>Evaluated Task</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvaluatedTask()
	 * @generated
	 * @ordered
	 */
	protected EList<Task> evaluatedTask;

	/**
	 * The cached value of the '{@link #getDoc() <em>Doc</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoc()
	 * @generated
	 * @ordered
	 */
	protected EList<Documentation> doc;

	/**
	 * The cached value of the '{@link #getAggregates() <em>Aggregates</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAggregates()
	 * @generated
	 * @ordered
	 */
	protected EList<Scenario> aggregates;

	/**
	 * The cached value of the '{@link #getQuestion() <em>Question</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuestion()
	 * @generated
	 * @ordered
	 */
	protected EList<FeedbackQs> question;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScenarioImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContextModelingPackage.Literals.SCENARIO;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ContextModelingPackage.SCENARIO__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ContextModelingPackage.SCENARIO__PRIORITY, oldPriority, priority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Task> getEvaluatedTask() {
		if (evaluatedTask == null) {
			evaluatedTask = new EObjectWithInverseResolvingEList.ManyInverse<Task>(Task.class, this, ContextModelingPackage.SCENARIO__EVALUATED_TASK, InteractionModelingPackage.TASK__SCENARIO);
		}
		return evaluatedTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Documentation> getDoc() {
		if (doc == null) {
			doc = new EObjectWithInverseResolvingEList.ManyInverse<Documentation>(Documentation.class, this, ContextModelingPackage.SCENARIO__DOC, EvaluationModelingPackage.DOCUMENTATION__SCENARIO);
		}
		return doc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Scenario> getAggregates() {
		if (aggregates == null) {
			aggregates = new EObjectResolvingEList<Scenario>(Scenario.class, this, ContextModelingPackage.SCENARIO__AGGREGATES);
		}
		return aggregates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FeedbackQs> getQuestion() {
		if (question == null) {
			question = new EObjectWithInverseResolvingEList.ManyInverse<FeedbackQs>(FeedbackQs.class, this, ContextModelingPackage.SCENARIO__QUESTION, SurveyModelingPackage.FEEDBACK_QS__SCENARIO);
		}
		return question;
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
			case ContextModelingPackage.SCENARIO__EVALUATED_TASK:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEvaluatedTask()).basicAdd(otherEnd, msgs);
			case ContextModelingPackage.SCENARIO__DOC:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDoc()).basicAdd(otherEnd, msgs);
			case ContextModelingPackage.SCENARIO__QUESTION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getQuestion()).basicAdd(otherEnd, msgs);
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
			case ContextModelingPackage.SCENARIO__EVALUATED_TASK:
				return ((InternalEList<?>)getEvaluatedTask()).basicRemove(otherEnd, msgs);
			case ContextModelingPackage.SCENARIO__DOC:
				return ((InternalEList<?>)getDoc()).basicRemove(otherEnd, msgs);
			case ContextModelingPackage.SCENARIO__QUESTION:
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
			case ContextModelingPackage.SCENARIO__NAME:
				return getName();
			case ContextModelingPackage.SCENARIO__PRIORITY:
				return getPriority();
			case ContextModelingPackage.SCENARIO__EVALUATED_TASK:
				return getEvaluatedTask();
			case ContextModelingPackage.SCENARIO__DOC:
				return getDoc();
			case ContextModelingPackage.SCENARIO__AGGREGATES:
				return getAggregates();
			case ContextModelingPackage.SCENARIO__QUESTION:
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
			case ContextModelingPackage.SCENARIO__NAME:
				setName((String)newValue);
				return;
			case ContextModelingPackage.SCENARIO__PRIORITY:
				setPriority((PriorityValue)newValue);
				return;
			case ContextModelingPackage.SCENARIO__EVALUATED_TASK:
				getEvaluatedTask().clear();
				getEvaluatedTask().addAll((Collection<? extends Task>)newValue);
				return;
			case ContextModelingPackage.SCENARIO__DOC:
				getDoc().clear();
				getDoc().addAll((Collection<? extends Documentation>)newValue);
				return;
			case ContextModelingPackage.SCENARIO__AGGREGATES:
				getAggregates().clear();
				getAggregates().addAll((Collection<? extends Scenario>)newValue);
				return;
			case ContextModelingPackage.SCENARIO__QUESTION:
				getQuestion().clear();
				getQuestion().addAll((Collection<? extends FeedbackQs>)newValue);
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
			case ContextModelingPackage.SCENARIO__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ContextModelingPackage.SCENARIO__PRIORITY:
				setPriority(PRIORITY_EDEFAULT);
				return;
			case ContextModelingPackage.SCENARIO__EVALUATED_TASK:
				getEvaluatedTask().clear();
				return;
			case ContextModelingPackage.SCENARIO__DOC:
				getDoc().clear();
				return;
			case ContextModelingPackage.SCENARIO__AGGREGATES:
				getAggregates().clear();
				return;
			case ContextModelingPackage.SCENARIO__QUESTION:
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
			case ContextModelingPackage.SCENARIO__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ContextModelingPackage.SCENARIO__PRIORITY:
				return priority != PRIORITY_EDEFAULT;
			case ContextModelingPackage.SCENARIO__EVALUATED_TASK:
				return evaluatedTask != null && !evaluatedTask.isEmpty();
			case ContextModelingPackage.SCENARIO__DOC:
				return doc != null && !doc.isEmpty();
			case ContextModelingPackage.SCENARIO__AGGREGATES:
				return aggregates != null && !aggregates.isEmpty();
			case ContextModelingPackage.SCENARIO__QUESTION:
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
		result.append(", priority: ");
		result.append(priority);
		result.append(')');
		return result.toString();
	}

} //ScenarioImpl
