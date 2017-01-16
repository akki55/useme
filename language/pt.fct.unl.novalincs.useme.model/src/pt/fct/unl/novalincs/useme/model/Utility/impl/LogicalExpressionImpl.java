/**
 */
package pt.fct.unl.novalincs.useme.model.Utility.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import pt.fct.unl.novalincs.useme.model.SurveyModeling.BackgroundQs;
import pt.fct.unl.novalincs.useme.model.SurveyModeling.SurveyModelingPackage;

import pt.fct.unl.novalincs.useme.model.Utility.LogicalExpression;
import pt.fct.unl.novalincs.useme.model.Utility.ProfileTemplate;
import pt.fct.unl.novalincs.useme.model.Utility.UtilityPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Logical Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.Utility.impl.LogicalExpressionImpl#getName <em>Name</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.Utility.impl.LogicalExpressionImpl#getClassifierName <em>Classifier Name</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.Utility.impl.LogicalExpressionImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.Utility.impl.LogicalExpressionImpl#getProfileTemplate <em>Profile Template</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.Utility.impl.LogicalExpressionImpl#getQuestion <em>Question</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LogicalExpressionImpl extends MinimalEObjectImpl.Container implements LogicalExpression {
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
	 * The default value of the '{@link #getClassifierName() <em>Classifier Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassifierName()
	 * @generated
	 * @ordered
	 */
	protected static final String CLASSIFIER_NAME_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getClassifierName() <em>Classifier Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassifierName()
	 * @generated
	 * @ordered
	 */
	protected String classifierName = CLASSIFIER_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getExpression() <em>Expression</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpression()
	 * @generated
	 * @ordered
	 */
	protected EList<String> expression;

	/**
	 * The cached value of the '{@link #getProfileTemplate() <em>Profile Template</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProfileTemplate()
	 * @generated
	 * @ordered
	 */
	protected EList<ProfileTemplate> profileTemplate;

	/**
	 * The cached value of the '{@link #getQuestion() <em>Question</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuestion()
	 * @generated
	 * @ordered
	 */
	protected EList<BackgroundQs> question;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LogicalExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UtilityPackage.Literals.LOGICAL_EXPRESSION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, UtilityPackage.LOGICAL_EXPRESSION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getClassifierName() {
		return classifierName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassifierName(String newClassifierName) {
		String oldClassifierName = classifierName;
		classifierName = newClassifierName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UtilityPackage.LOGICAL_EXPRESSION__CLASSIFIER_NAME, oldClassifierName, classifierName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getExpression() {
		if (expression == null) {
			expression = new EDataTypeUniqueEList<String>(String.class, this, UtilityPackage.LOGICAL_EXPRESSION__EXPRESSION);
		}
		return expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProfileTemplate> getProfileTemplate() {
		if (profileTemplate == null) {
			profileTemplate = new EObjectWithInverseResolvingEList.ManyInverse<ProfileTemplate>(ProfileTemplate.class, this, UtilityPackage.LOGICAL_EXPRESSION__PROFILE_TEMPLATE, UtilityPackage.PROFILE_TEMPLATE__CLASSIFIERS);
		}
		return profileTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BackgroundQs> getQuestion() {
		if (question == null) {
			question = new EObjectWithInverseResolvingEList.ManyInverse<BackgroundQs>(BackgroundQs.class, this, UtilityPackage.LOGICAL_EXPRESSION__QUESTION, SurveyModelingPackage.BACKGROUND_QS__LOGICAL_EXPRESSION);
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
			case UtilityPackage.LOGICAL_EXPRESSION__PROFILE_TEMPLATE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getProfileTemplate()).basicAdd(otherEnd, msgs);
			case UtilityPackage.LOGICAL_EXPRESSION__QUESTION:
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
			case UtilityPackage.LOGICAL_EXPRESSION__PROFILE_TEMPLATE:
				return ((InternalEList<?>)getProfileTemplate()).basicRemove(otherEnd, msgs);
			case UtilityPackage.LOGICAL_EXPRESSION__QUESTION:
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
			case UtilityPackage.LOGICAL_EXPRESSION__NAME:
				return getName();
			case UtilityPackage.LOGICAL_EXPRESSION__CLASSIFIER_NAME:
				return getClassifierName();
			case UtilityPackage.LOGICAL_EXPRESSION__EXPRESSION:
				return getExpression();
			case UtilityPackage.LOGICAL_EXPRESSION__PROFILE_TEMPLATE:
				return getProfileTemplate();
			case UtilityPackage.LOGICAL_EXPRESSION__QUESTION:
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
			case UtilityPackage.LOGICAL_EXPRESSION__NAME:
				setName((String)newValue);
				return;
			case UtilityPackage.LOGICAL_EXPRESSION__CLASSIFIER_NAME:
				setClassifierName((String)newValue);
				return;
			case UtilityPackage.LOGICAL_EXPRESSION__EXPRESSION:
				getExpression().clear();
				getExpression().addAll((Collection<? extends String>)newValue);
				return;
			case UtilityPackage.LOGICAL_EXPRESSION__PROFILE_TEMPLATE:
				getProfileTemplate().clear();
				getProfileTemplate().addAll((Collection<? extends ProfileTemplate>)newValue);
				return;
			case UtilityPackage.LOGICAL_EXPRESSION__QUESTION:
				getQuestion().clear();
				getQuestion().addAll((Collection<? extends BackgroundQs>)newValue);
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
			case UtilityPackage.LOGICAL_EXPRESSION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UtilityPackage.LOGICAL_EXPRESSION__CLASSIFIER_NAME:
				setClassifierName(CLASSIFIER_NAME_EDEFAULT);
				return;
			case UtilityPackage.LOGICAL_EXPRESSION__EXPRESSION:
				getExpression().clear();
				return;
			case UtilityPackage.LOGICAL_EXPRESSION__PROFILE_TEMPLATE:
				getProfileTemplate().clear();
				return;
			case UtilityPackage.LOGICAL_EXPRESSION__QUESTION:
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
			case UtilityPackage.LOGICAL_EXPRESSION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UtilityPackage.LOGICAL_EXPRESSION__CLASSIFIER_NAME:
				return CLASSIFIER_NAME_EDEFAULT == null ? classifierName != null : !CLASSIFIER_NAME_EDEFAULT.equals(classifierName);
			case UtilityPackage.LOGICAL_EXPRESSION__EXPRESSION:
				return expression != null && !expression.isEmpty();
			case UtilityPackage.LOGICAL_EXPRESSION__PROFILE_TEMPLATE:
				return profileTemplate != null && !profileTemplate.isEmpty();
			case UtilityPackage.LOGICAL_EXPRESSION__QUESTION:
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
		result.append(", classifierName: ");
		result.append(classifierName);
		result.append(", expression: ");
		result.append(expression);
		result.append(')');
		return result.toString();
	}

} //LogicalExpressionImpl
