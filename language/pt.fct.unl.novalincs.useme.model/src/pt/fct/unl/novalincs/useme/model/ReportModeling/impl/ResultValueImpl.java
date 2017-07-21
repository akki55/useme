/**
 */
package pt.fct.unl.novalincs.useme.model.ReportModeling.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import pt.fct.unl.novalincs.useme.model.EvaluationModeling.Language;

import pt.fct.unl.novalincs.useme.model.InteractionModeling.CaptureAction;

import pt.fct.unl.novalincs.useme.model.ReportModeling.ReportModelingPackage;
import pt.fct.unl.novalincs.useme.model.ReportModeling.ResultValue;

import pt.fct.unl.novalincs.useme.model.SurveyModeling.Question;

import pt.fct.unl.novalincs.useme.model.Utility.Requirement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Result Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.ReportModeling.impl.ResultValueImpl#getName <em>Name</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.ReportModeling.impl.ResultValueImpl#getResultValue <em>Result Value</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.ReportModeling.impl.ResultValueImpl#getLanguage <em>Language</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.ReportModeling.impl.ResultValueImpl#getRelatedQuestion <em>Related Question</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.ReportModeling.impl.ResultValueImpl#getRelatedAction <em>Related Action</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.ReportModeling.impl.ResultValueImpl#getAssociatedRequirement <em>Associated Requirement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResultValueImpl extends MinimalEObjectImpl.Container implements ResultValue {
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
	 * The default value of the '{@link #getResultValue() <em>Result Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultValue()
	 * @generated
	 * @ordered
	 */
	protected static final String RESULT_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResultValue() <em>Result Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultValue()
	 * @generated
	 * @ordered
	 */
	protected String resultValue = RESULT_VALUE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLanguage() <em>Language</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected Language language;

	/**
	 * The cached value of the '{@link #getRelatedQuestion() <em>Related Question</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedQuestion()
	 * @generated
	 * @ordered
	 */
	protected EList<Question> relatedQuestion;

	/**
	 * The cached value of the '{@link #getRelatedAction() <em>Related Action</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedAction()
	 * @generated
	 * @ordered
	 */
	protected EList<CaptureAction> relatedAction;

	/**
	 * The cached value of the '{@link #getAssociatedRequirement() <em>Associated Requirement</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociatedRequirement()
	 * @generated
	 * @ordered
	 */
	protected EList<Requirement> associatedRequirement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResultValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReportModelingPackage.Literals.RESULT_VALUE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ReportModelingPackage.RESULT_VALUE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getResultValue() {
		return resultValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResultValue(String newResultValue) {
		String oldResultValue = resultValue;
		resultValue = newResultValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReportModelingPackage.RESULT_VALUE__RESULT_VALUE, oldResultValue, resultValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Language getLanguage() {
		if (language != null && language.eIsProxy()) {
			InternalEObject oldLanguage = (InternalEObject)language;
			language = (Language)eResolveProxy(oldLanguage);
			if (language != oldLanguage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ReportModelingPackage.RESULT_VALUE__LANGUAGE, oldLanguage, language));
			}
		}
		return language;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Language basicGetLanguage() {
		return language;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLanguage(Language newLanguage) {
		Language oldLanguage = language;
		language = newLanguage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReportModelingPackage.RESULT_VALUE__LANGUAGE, oldLanguage, language));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Question> getRelatedQuestion() {
		if (relatedQuestion == null) {
			relatedQuestion = new EObjectResolvingEList<Question>(Question.class, this, ReportModelingPackage.RESULT_VALUE__RELATED_QUESTION);
		}
		return relatedQuestion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CaptureAction> getRelatedAction() {
		if (relatedAction == null) {
			relatedAction = new EObjectResolvingEList<CaptureAction>(CaptureAction.class, this, ReportModelingPackage.RESULT_VALUE__RELATED_ACTION);
		}
		return relatedAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Requirement> getAssociatedRequirement() {
		if (associatedRequirement == null) {
			associatedRequirement = new EObjectResolvingEList<Requirement>(Requirement.class, this, ReportModelingPackage.RESULT_VALUE__ASSOCIATED_REQUIREMENT);
		}
		return associatedRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ReportModelingPackage.RESULT_VALUE__NAME:
				return getName();
			case ReportModelingPackage.RESULT_VALUE__RESULT_VALUE:
				return getResultValue();
			case ReportModelingPackage.RESULT_VALUE__LANGUAGE:
				if (resolve) return getLanguage();
				return basicGetLanguage();
			case ReportModelingPackage.RESULT_VALUE__RELATED_QUESTION:
				return getRelatedQuestion();
			case ReportModelingPackage.RESULT_VALUE__RELATED_ACTION:
				return getRelatedAction();
			case ReportModelingPackage.RESULT_VALUE__ASSOCIATED_REQUIREMENT:
				return getAssociatedRequirement();
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
			case ReportModelingPackage.RESULT_VALUE__NAME:
				setName((String)newValue);
				return;
			case ReportModelingPackage.RESULT_VALUE__RESULT_VALUE:
				setResultValue((String)newValue);
				return;
			case ReportModelingPackage.RESULT_VALUE__LANGUAGE:
				setLanguage((Language)newValue);
				return;
			case ReportModelingPackage.RESULT_VALUE__RELATED_QUESTION:
				getRelatedQuestion().clear();
				getRelatedQuestion().addAll((Collection<? extends Question>)newValue);
				return;
			case ReportModelingPackage.RESULT_VALUE__RELATED_ACTION:
				getRelatedAction().clear();
				getRelatedAction().addAll((Collection<? extends CaptureAction>)newValue);
				return;
			case ReportModelingPackage.RESULT_VALUE__ASSOCIATED_REQUIREMENT:
				getAssociatedRequirement().clear();
				getAssociatedRequirement().addAll((Collection<? extends Requirement>)newValue);
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
			case ReportModelingPackage.RESULT_VALUE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ReportModelingPackage.RESULT_VALUE__RESULT_VALUE:
				setResultValue(RESULT_VALUE_EDEFAULT);
				return;
			case ReportModelingPackage.RESULT_VALUE__LANGUAGE:
				setLanguage((Language)null);
				return;
			case ReportModelingPackage.RESULT_VALUE__RELATED_QUESTION:
				getRelatedQuestion().clear();
				return;
			case ReportModelingPackage.RESULT_VALUE__RELATED_ACTION:
				getRelatedAction().clear();
				return;
			case ReportModelingPackage.RESULT_VALUE__ASSOCIATED_REQUIREMENT:
				getAssociatedRequirement().clear();
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
			case ReportModelingPackage.RESULT_VALUE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ReportModelingPackage.RESULT_VALUE__RESULT_VALUE:
				return RESULT_VALUE_EDEFAULT == null ? resultValue != null : !RESULT_VALUE_EDEFAULT.equals(resultValue);
			case ReportModelingPackage.RESULT_VALUE__LANGUAGE:
				return language != null;
			case ReportModelingPackage.RESULT_VALUE__RELATED_QUESTION:
				return relatedQuestion != null && !relatedQuestion.isEmpty();
			case ReportModelingPackage.RESULT_VALUE__RELATED_ACTION:
				return relatedAction != null && !relatedAction.isEmpty();
			case ReportModelingPackage.RESULT_VALUE__ASSOCIATED_REQUIREMENT:
				return associatedRequirement != null && !associatedRequirement.isEmpty();
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
		result.append(", resultValue: ");
		result.append(resultValue);
		result.append(')');
		return result.toString();
	}

} //ResultValueImpl
