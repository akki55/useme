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

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import pt.fct.unl.novalincs.useme.model.SurveyModeling.Question;
import pt.fct.unl.novalincs.useme.model.SurveyModeling.Questionnaire;
import pt.fct.unl.novalincs.useme.model.SurveyModeling.SurveyModelingPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Question</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.SurveyModeling.impl.QuestionImpl#getName <em>Name</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.SurveyModeling.impl.QuestionImpl#getQuestion <em>Question</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.SurveyModeling.impl.QuestionImpl#getScale <em>Scale</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.SurveyModeling.impl.QuestionImpl#getType <em>Type</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.SurveyModeling.impl.QuestionImpl#getQuestionnaire <em>Questionnaire</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QuestionImpl extends MinimalEObjectImpl.Container implements Question {
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
	 * The default value of the '{@link #getQuestion() <em>Question</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuestion()
	 * @generated
	 * @ordered
	 */
	protected static final String QUESTION_EDEFAULT = "";

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
	 * The cached value of the '{@link #getScale() <em>Scale</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScale()
	 * @generated
	 * @ordered
	 */
	protected EList<String> scale;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getQuestionnaire() <em>Questionnaire</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuestionnaire()
	 * @generated
	 * @ordered
	 */
	protected Questionnaire questionnaire;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QuestionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SurveyModelingPackage.Literals.QUESTION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SurveyModelingPackage.QUESTION__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SurveyModelingPackage.QUESTION__QUESTION, oldQuestion, question));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getScale() {
		if (scale == null) {
			scale = new EDataTypeUniqueEList<String>(String.class, this, SurveyModelingPackage.QUESTION__SCALE);
		}
		return scale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SurveyModelingPackage.QUESTION__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Questionnaire getQuestionnaire() {
		if (questionnaire != null && questionnaire.eIsProxy()) {
			InternalEObject oldQuestionnaire = (InternalEObject)questionnaire;
			questionnaire = (Questionnaire)eResolveProxy(oldQuestionnaire);
			if (questionnaire != oldQuestionnaire) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SurveyModelingPackage.QUESTION__QUESTIONNAIRE, oldQuestionnaire, questionnaire));
			}
		}
		return questionnaire;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Questionnaire basicGetQuestionnaire() {
		return questionnaire;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQuestionnaire(Questionnaire newQuestionnaire, NotificationChain msgs) {
		Questionnaire oldQuestionnaire = questionnaire;
		questionnaire = newQuestionnaire;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SurveyModelingPackage.QUESTION__QUESTIONNAIRE, oldQuestionnaire, newQuestionnaire);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuestionnaire(Questionnaire newQuestionnaire) {
		if (newQuestionnaire != questionnaire) {
			NotificationChain msgs = null;
			if (questionnaire != null)
				msgs = ((InternalEObject)questionnaire).eInverseRemove(this, SurveyModelingPackage.QUESTIONNAIRE__QUESTION, Questionnaire.class, msgs);
			if (newQuestionnaire != null)
				msgs = ((InternalEObject)newQuestionnaire).eInverseAdd(this, SurveyModelingPackage.QUESTIONNAIRE__QUESTION, Questionnaire.class, msgs);
			msgs = basicSetQuestionnaire(newQuestionnaire, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SurveyModelingPackage.QUESTION__QUESTIONNAIRE, newQuestionnaire, newQuestionnaire));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SurveyModelingPackage.QUESTION__QUESTIONNAIRE:
				if (questionnaire != null)
					msgs = ((InternalEObject)questionnaire).eInverseRemove(this, SurveyModelingPackage.QUESTIONNAIRE__QUESTION, Questionnaire.class, msgs);
				return basicSetQuestionnaire((Questionnaire)otherEnd, msgs);
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
			case SurveyModelingPackage.QUESTION__QUESTIONNAIRE:
				return basicSetQuestionnaire(null, msgs);
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
			case SurveyModelingPackage.QUESTION__NAME:
				return getName();
			case SurveyModelingPackage.QUESTION__QUESTION:
				return getQuestion();
			case SurveyModelingPackage.QUESTION__SCALE:
				return getScale();
			case SurveyModelingPackage.QUESTION__TYPE:
				return getType();
			case SurveyModelingPackage.QUESTION__QUESTIONNAIRE:
				if (resolve) return getQuestionnaire();
				return basicGetQuestionnaire();
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
			case SurveyModelingPackage.QUESTION__NAME:
				setName((String)newValue);
				return;
			case SurveyModelingPackage.QUESTION__QUESTION:
				setQuestion((String)newValue);
				return;
			case SurveyModelingPackage.QUESTION__SCALE:
				getScale().clear();
				getScale().addAll((Collection<? extends String>)newValue);
				return;
			case SurveyModelingPackage.QUESTION__TYPE:
				setType((String)newValue);
				return;
			case SurveyModelingPackage.QUESTION__QUESTIONNAIRE:
				setQuestionnaire((Questionnaire)newValue);
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
			case SurveyModelingPackage.QUESTION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SurveyModelingPackage.QUESTION__QUESTION:
				setQuestion(QUESTION_EDEFAULT);
				return;
			case SurveyModelingPackage.QUESTION__SCALE:
				getScale().clear();
				return;
			case SurveyModelingPackage.QUESTION__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case SurveyModelingPackage.QUESTION__QUESTIONNAIRE:
				setQuestionnaire((Questionnaire)null);
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
			case SurveyModelingPackage.QUESTION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SurveyModelingPackage.QUESTION__QUESTION:
				return QUESTION_EDEFAULT == null ? question != null : !QUESTION_EDEFAULT.equals(question);
			case SurveyModelingPackage.QUESTION__SCALE:
				return scale != null && !scale.isEmpty();
			case SurveyModelingPackage.QUESTION__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case SurveyModelingPackage.QUESTION__QUESTIONNAIRE:
				return questionnaire != null;
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
		result.append(", question: ");
		result.append(question);
		result.append(", scale: ");
		result.append(scale);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //QuestionImpl
