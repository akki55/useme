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

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationContext;
import pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationDocumentation;
import pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationGoal;
import pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationModel;
import pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationModelingPackage;
import pt.fct.unl.novalincs.useme.model.EvaluationModeling.Language;
import pt.fct.unl.novalincs.useme.model.EvaluationModeling.Participant;
import pt.fct.unl.novalincs.useme.model.EvaluationModeling.TestModel;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Evaluation Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.EvaluationModeling.impl.EvaluationModelImpl#getName <em>Name</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.EvaluationModeling.impl.EvaluationModelImpl#getEvaluationGoal <em>Evaluation Goal</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.EvaluationModeling.impl.EvaluationModelImpl#getEvaluationContext <em>Evaluation Context</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.EvaluationModeling.impl.EvaluationModelImpl#getLanguage <em>Language</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.EvaluationModeling.impl.EvaluationModelImpl#getProcess <em>Process</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.EvaluationModeling.impl.EvaluationModelImpl#getTestModel <em>Test Model</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.EvaluationModeling.impl.EvaluationModelImpl#getDoc <em>Doc</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.EvaluationModeling.impl.EvaluationModelImpl#getParticipant <em>Participant</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EvaluationModelImpl extends MinimalEObjectImpl.Container implements EvaluationModel {
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
	 * The cached value of the '{@link #getEvaluationGoal() <em>Evaluation Goal</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvaluationGoal()
	 * @generated
	 * @ordered
	 */
	protected EList<EvaluationGoal> evaluationGoal;

	/**
	 * The cached value of the '{@link #getEvaluationContext() <em>Evaluation Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvaluationContext()
	 * @generated
	 * @ordered
	 */
	protected EvaluationContext evaluationContext;

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
	 * The cached value of the '{@link #getProcess() <em>Process</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcess()
	 * @generated
	 * @ordered
	 */
	protected EList<pt.fct.unl.novalincs.useme.model.EvaluationModeling.Process> process;

	/**
	 * The cached value of the '{@link #getTestModel() <em>Test Model</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestModel()
	 * @generated
	 * @ordered
	 */
	protected EList<TestModel> testModel;

	/**
	 * The cached value of the '{@link #getDoc() <em>Doc</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoc()
	 * @generated
	 * @ordered
	 */
	protected EList<EvaluationDocumentation> doc;

	/**
	 * The cached value of the '{@link #getParticipant() <em>Participant</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParticipant()
	 * @generated
	 * @ordered
	 */
	protected EList<Participant> participant;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EvaluationModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EvaluationModelingPackage.Literals.EVALUATION_MODEL;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EvaluationModelingPackage.EVALUATION_MODEL__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EvaluationGoal> getEvaluationGoal() {
		if (evaluationGoal == null) {
			evaluationGoal = new EObjectWithInverseResolvingEList<EvaluationGoal>(EvaluationGoal.class, this, EvaluationModelingPackage.EVALUATION_MODEL__EVALUATION_GOAL, EvaluationModelingPackage.EVALUATION_GOAL__EVALUATION_MODEL);
		}
		return evaluationGoal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvaluationContext getEvaluationContext() {
		if (evaluationContext != null && evaluationContext.eIsProxy()) {
			InternalEObject oldEvaluationContext = (InternalEObject)evaluationContext;
			evaluationContext = (EvaluationContext)eResolveProxy(oldEvaluationContext);
			if (evaluationContext != oldEvaluationContext) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EvaluationModelingPackage.EVALUATION_MODEL__EVALUATION_CONTEXT, oldEvaluationContext, evaluationContext));
			}
		}
		return evaluationContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvaluationContext basicGetEvaluationContext() {
		return evaluationContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEvaluationContext(EvaluationContext newEvaluationContext, NotificationChain msgs) {
		EvaluationContext oldEvaluationContext = evaluationContext;
		evaluationContext = newEvaluationContext;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EvaluationModelingPackage.EVALUATION_MODEL__EVALUATION_CONTEXT, oldEvaluationContext, newEvaluationContext);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEvaluationContext(EvaluationContext newEvaluationContext) {
		if (newEvaluationContext != evaluationContext) {
			NotificationChain msgs = null;
			if (evaluationContext != null)
				msgs = ((InternalEObject)evaluationContext).eInverseRemove(this, EvaluationModelingPackage.EVALUATION_CONTEXT__EVALUATION_MODEL, EvaluationContext.class, msgs);
			if (newEvaluationContext != null)
				msgs = ((InternalEObject)newEvaluationContext).eInverseAdd(this, EvaluationModelingPackage.EVALUATION_CONTEXT__EVALUATION_MODEL, EvaluationContext.class, msgs);
			msgs = basicSetEvaluationContext(newEvaluationContext, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EvaluationModelingPackage.EVALUATION_MODEL__EVALUATION_CONTEXT, newEvaluationContext, newEvaluationContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Language> getLanguage() {
		if (language == null) {
			language = new EObjectWithInverseResolvingEList.ManyInverse<Language>(Language.class, this, EvaluationModelingPackage.EVALUATION_MODEL__LANGUAGE, EvaluationModelingPackage.LANGUAGE__EVALUATION_MODEL);
		}
		return language;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<pt.fct.unl.novalincs.useme.model.EvaluationModeling.Process> getProcess() {
		if (process == null) {
			process = new EObjectWithInverseResolvingEList<pt.fct.unl.novalincs.useme.model.EvaluationModeling.Process>(pt.fct.unl.novalincs.useme.model.EvaluationModeling.Process.class, this, EvaluationModelingPackage.EVALUATION_MODEL__PROCESS, EvaluationModelingPackage.PROCESS__EVALUATION_MODEL);
		}
		return process;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TestModel> getTestModel() {
		if (testModel == null) {
			testModel = new EObjectWithInverseResolvingEList.ManyInverse<TestModel>(TestModel.class, this, EvaluationModelingPackage.EVALUATION_MODEL__TEST_MODEL, EvaluationModelingPackage.TEST_MODEL__EVALUATION_MODEL);
		}
		return testModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EvaluationDocumentation> getDoc() {
		if (doc == null) {
			doc = new EObjectResolvingEList<EvaluationDocumentation>(EvaluationDocumentation.class, this, EvaluationModelingPackage.EVALUATION_MODEL__DOC);
		}
		return doc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Participant> getParticipant() {
		if (participant == null) {
			participant = new EObjectWithInverseResolvingEList.ManyInverse<Participant>(Participant.class, this, EvaluationModelingPackage.EVALUATION_MODEL__PARTICIPANT, EvaluationModelingPackage.PARTICIPANT__EVALUATION_MODEL);
		}
		return participant;
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
			case EvaluationModelingPackage.EVALUATION_MODEL__EVALUATION_GOAL:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEvaluationGoal()).basicAdd(otherEnd, msgs);
			case EvaluationModelingPackage.EVALUATION_MODEL__EVALUATION_CONTEXT:
				if (evaluationContext != null)
					msgs = ((InternalEObject)evaluationContext).eInverseRemove(this, EvaluationModelingPackage.EVALUATION_CONTEXT__EVALUATION_MODEL, EvaluationContext.class, msgs);
				return basicSetEvaluationContext((EvaluationContext)otherEnd, msgs);
			case EvaluationModelingPackage.EVALUATION_MODEL__LANGUAGE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLanguage()).basicAdd(otherEnd, msgs);
			case EvaluationModelingPackage.EVALUATION_MODEL__PROCESS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getProcess()).basicAdd(otherEnd, msgs);
			case EvaluationModelingPackage.EVALUATION_MODEL__TEST_MODEL:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTestModel()).basicAdd(otherEnd, msgs);
			case EvaluationModelingPackage.EVALUATION_MODEL__PARTICIPANT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getParticipant()).basicAdd(otherEnd, msgs);
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
			case EvaluationModelingPackage.EVALUATION_MODEL__EVALUATION_GOAL:
				return ((InternalEList<?>)getEvaluationGoal()).basicRemove(otherEnd, msgs);
			case EvaluationModelingPackage.EVALUATION_MODEL__EVALUATION_CONTEXT:
				return basicSetEvaluationContext(null, msgs);
			case EvaluationModelingPackage.EVALUATION_MODEL__LANGUAGE:
				return ((InternalEList<?>)getLanguage()).basicRemove(otherEnd, msgs);
			case EvaluationModelingPackage.EVALUATION_MODEL__PROCESS:
				return ((InternalEList<?>)getProcess()).basicRemove(otherEnd, msgs);
			case EvaluationModelingPackage.EVALUATION_MODEL__TEST_MODEL:
				return ((InternalEList<?>)getTestModel()).basicRemove(otherEnd, msgs);
			case EvaluationModelingPackage.EVALUATION_MODEL__PARTICIPANT:
				return ((InternalEList<?>)getParticipant()).basicRemove(otherEnd, msgs);
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
			case EvaluationModelingPackage.EVALUATION_MODEL__NAME:
				return getName();
			case EvaluationModelingPackage.EVALUATION_MODEL__EVALUATION_GOAL:
				return getEvaluationGoal();
			case EvaluationModelingPackage.EVALUATION_MODEL__EVALUATION_CONTEXT:
				if (resolve) return getEvaluationContext();
				return basicGetEvaluationContext();
			case EvaluationModelingPackage.EVALUATION_MODEL__LANGUAGE:
				return getLanguage();
			case EvaluationModelingPackage.EVALUATION_MODEL__PROCESS:
				return getProcess();
			case EvaluationModelingPackage.EVALUATION_MODEL__TEST_MODEL:
				return getTestModel();
			case EvaluationModelingPackage.EVALUATION_MODEL__DOC:
				return getDoc();
			case EvaluationModelingPackage.EVALUATION_MODEL__PARTICIPANT:
				return getParticipant();
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
			case EvaluationModelingPackage.EVALUATION_MODEL__NAME:
				setName((String)newValue);
				return;
			case EvaluationModelingPackage.EVALUATION_MODEL__EVALUATION_GOAL:
				getEvaluationGoal().clear();
				getEvaluationGoal().addAll((Collection<? extends EvaluationGoal>)newValue);
				return;
			case EvaluationModelingPackage.EVALUATION_MODEL__EVALUATION_CONTEXT:
				setEvaluationContext((EvaluationContext)newValue);
				return;
			case EvaluationModelingPackage.EVALUATION_MODEL__LANGUAGE:
				getLanguage().clear();
				getLanguage().addAll((Collection<? extends Language>)newValue);
				return;
			case EvaluationModelingPackage.EVALUATION_MODEL__PROCESS:
				getProcess().clear();
				getProcess().addAll((Collection<? extends pt.fct.unl.novalincs.useme.model.EvaluationModeling.Process>)newValue);
				return;
			case EvaluationModelingPackage.EVALUATION_MODEL__TEST_MODEL:
				getTestModel().clear();
				getTestModel().addAll((Collection<? extends TestModel>)newValue);
				return;
			case EvaluationModelingPackage.EVALUATION_MODEL__DOC:
				getDoc().clear();
				getDoc().addAll((Collection<? extends EvaluationDocumentation>)newValue);
				return;
			case EvaluationModelingPackage.EVALUATION_MODEL__PARTICIPANT:
				getParticipant().clear();
				getParticipant().addAll((Collection<? extends Participant>)newValue);
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
			case EvaluationModelingPackage.EVALUATION_MODEL__NAME:
				setName(NAME_EDEFAULT);
				return;
			case EvaluationModelingPackage.EVALUATION_MODEL__EVALUATION_GOAL:
				getEvaluationGoal().clear();
				return;
			case EvaluationModelingPackage.EVALUATION_MODEL__EVALUATION_CONTEXT:
				setEvaluationContext((EvaluationContext)null);
				return;
			case EvaluationModelingPackage.EVALUATION_MODEL__LANGUAGE:
				getLanguage().clear();
				return;
			case EvaluationModelingPackage.EVALUATION_MODEL__PROCESS:
				getProcess().clear();
				return;
			case EvaluationModelingPackage.EVALUATION_MODEL__TEST_MODEL:
				getTestModel().clear();
				return;
			case EvaluationModelingPackage.EVALUATION_MODEL__DOC:
				getDoc().clear();
				return;
			case EvaluationModelingPackage.EVALUATION_MODEL__PARTICIPANT:
				getParticipant().clear();
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
			case EvaluationModelingPackage.EVALUATION_MODEL__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case EvaluationModelingPackage.EVALUATION_MODEL__EVALUATION_GOAL:
				return evaluationGoal != null && !evaluationGoal.isEmpty();
			case EvaluationModelingPackage.EVALUATION_MODEL__EVALUATION_CONTEXT:
				return evaluationContext != null;
			case EvaluationModelingPackage.EVALUATION_MODEL__LANGUAGE:
				return language != null && !language.isEmpty();
			case EvaluationModelingPackage.EVALUATION_MODEL__PROCESS:
				return process != null && !process.isEmpty();
			case EvaluationModelingPackage.EVALUATION_MODEL__TEST_MODEL:
				return testModel != null && !testModel.isEmpty();
			case EvaluationModelingPackage.EVALUATION_MODEL__DOC:
				return doc != null && !doc.isEmpty();
			case EvaluationModelingPackage.EVALUATION_MODEL__PARTICIPANT:
				return participant != null && !participant.isEmpty();
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

} //EvaluationModelImpl
