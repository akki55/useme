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
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import pt.fct.unl.novalincs.useme.model.GoalModeling.GoalModelingPackage;
import pt.fct.unl.novalincs.useme.model.GoalModeling.UsabilityRequirement;

import pt.fct.unl.novalincs.useme.model.InteractionModeling.Event;

import pt.fct.unl.novalincs.useme.model.SurveyModeling.Questionnaire;
import pt.fct.unl.novalincs.useme.model.SurveyModeling.SurveyModelingPackage;
import pt.fct.unl.novalincs.useme.model.Utility.impl.RequirementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Usability Requirement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.GoalModeling.impl.UsabilityRequirementImpl#getOld_name <em>Old name</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.GoalModeling.impl.UsabilityRequirementImpl#getDescription_old <em>Description old</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.GoalModeling.impl.UsabilityRequirementImpl#getMetric <em>Metric</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.GoalModeling.impl.UsabilityRequirementImpl#getQuestionnaire <em>Questionnaire</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.GoalModeling.impl.UsabilityRequirementImpl#getEvent <em>Event</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UsabilityRequirementImpl extends RequirementImpl implements UsabilityRequirement {
	/**
	 * The default value of the '{@link #getOld_name() <em>Old name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOld_name()
	 * @generated
	 * @ordered
	 */
	protected static final String OLD_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOld_name() <em>Old name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOld_name()
	 * @generated
	 * @ordered
	 */
	protected String old_name = OLD_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription_old() <em>Description old</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription_old()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_OLD_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getDescription_old() <em>Description old</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription_old()
	 * @generated
	 * @ordered
	 */
	protected String description_old = DESCRIPTION_OLD_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMetric() <em>Metric</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetric()
	 * @generated
	 * @ordered
	 */
	protected EList<String> metric;

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
	 * The cached value of the '{@link #getEvent() <em>Event</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvent()
	 * @generated
	 * @ordered
	 */
	protected EList<Event> event;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UsabilityRequirementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GoalModelingPackage.Literals.USABILITY_REQUIREMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOld_name() {
		return old_name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOld_name(String newOld_name) {
		String oldOld_name = old_name;
		old_name = newOld_name;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GoalModelingPackage.USABILITY_REQUIREMENT__OLD_NAME, oldOld_name, old_name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription_old() {
		return description_old;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription_old(String newDescription_old) {
		String oldDescription_old = description_old;
		description_old = newDescription_old;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GoalModelingPackage.USABILITY_REQUIREMENT__DESCRIPTION_OLD, oldDescription_old, description_old));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getMetric() {
		if (metric == null) {
			metric = new EDataTypeUniqueEList<String>(String.class, this, GoalModelingPackage.USABILITY_REQUIREMENT__METRIC);
		}
		return metric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Questionnaire> getQuestionnaire() {
		if (questionnaire == null) {
			questionnaire = new EObjectWithInverseResolvingEList.ManyInverse<Questionnaire>(Questionnaire.class, this, GoalModelingPackage.USABILITY_REQUIREMENT__QUESTIONNAIRE, SurveyModelingPackage.QUESTIONNAIRE__USABILITY_REQUIREMENT);
		}
		return questionnaire;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Event> getEvent() {
		if (event == null) {
			event = new EObjectResolvingEList<Event>(Event.class, this, GoalModelingPackage.USABILITY_REQUIREMENT__EVENT);
		}
		return event;
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
			case GoalModelingPackage.USABILITY_REQUIREMENT__QUESTIONNAIRE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getQuestionnaire()).basicAdd(otherEnd, msgs);
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
			case GoalModelingPackage.USABILITY_REQUIREMENT__QUESTIONNAIRE:
				return ((InternalEList<?>)getQuestionnaire()).basicRemove(otherEnd, msgs);
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
			case GoalModelingPackage.USABILITY_REQUIREMENT__OLD_NAME:
				return getOld_name();
			case GoalModelingPackage.USABILITY_REQUIREMENT__DESCRIPTION_OLD:
				return getDescription_old();
			case GoalModelingPackage.USABILITY_REQUIREMENT__METRIC:
				return getMetric();
			case GoalModelingPackage.USABILITY_REQUIREMENT__QUESTIONNAIRE:
				return getQuestionnaire();
			case GoalModelingPackage.USABILITY_REQUIREMENT__EVENT:
				return getEvent();
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
			case GoalModelingPackage.USABILITY_REQUIREMENT__OLD_NAME:
				setOld_name((String)newValue);
				return;
			case GoalModelingPackage.USABILITY_REQUIREMENT__DESCRIPTION_OLD:
				setDescription_old((String)newValue);
				return;
			case GoalModelingPackage.USABILITY_REQUIREMENT__METRIC:
				getMetric().clear();
				getMetric().addAll((Collection<? extends String>)newValue);
				return;
			case GoalModelingPackage.USABILITY_REQUIREMENT__QUESTIONNAIRE:
				getQuestionnaire().clear();
				getQuestionnaire().addAll((Collection<? extends Questionnaire>)newValue);
				return;
			case GoalModelingPackage.USABILITY_REQUIREMENT__EVENT:
				getEvent().clear();
				getEvent().addAll((Collection<? extends Event>)newValue);
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
			case GoalModelingPackage.USABILITY_REQUIREMENT__OLD_NAME:
				setOld_name(OLD_NAME_EDEFAULT);
				return;
			case GoalModelingPackage.USABILITY_REQUIREMENT__DESCRIPTION_OLD:
				setDescription_old(DESCRIPTION_OLD_EDEFAULT);
				return;
			case GoalModelingPackage.USABILITY_REQUIREMENT__METRIC:
				getMetric().clear();
				return;
			case GoalModelingPackage.USABILITY_REQUIREMENT__QUESTIONNAIRE:
				getQuestionnaire().clear();
				return;
			case GoalModelingPackage.USABILITY_REQUIREMENT__EVENT:
				getEvent().clear();
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
			case GoalModelingPackage.USABILITY_REQUIREMENT__OLD_NAME:
				return OLD_NAME_EDEFAULT == null ? old_name != null : !OLD_NAME_EDEFAULT.equals(old_name);
			case GoalModelingPackage.USABILITY_REQUIREMENT__DESCRIPTION_OLD:
				return DESCRIPTION_OLD_EDEFAULT == null ? description_old != null : !DESCRIPTION_OLD_EDEFAULT.equals(description_old);
			case GoalModelingPackage.USABILITY_REQUIREMENT__METRIC:
				return metric != null && !metric.isEmpty();
			case GoalModelingPackage.USABILITY_REQUIREMENT__QUESTIONNAIRE:
				return questionnaire != null && !questionnaire.isEmpty();
			case GoalModelingPackage.USABILITY_REQUIREMENT__EVENT:
				return event != null && !event.isEmpty();
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
		result.append(" (old_name: ");
		result.append(old_name);
		result.append(", description_old: ");
		result.append(description_old);
		result.append(", metric: ");
		result.append(metric);
		result.append(')');
		return result.toString();
	}

} //UsabilityRequirementImpl
