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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationContext;
import pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationDocumentation;
import pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationGoal;
import pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationModel;
import pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationModelingPackage;
import pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationSpecification;
import pt.fct.unl.novalincs.useme.model.EvaluationModeling.Language;
import pt.fct.unl.novalincs.useme.model.EvaluationModeling.Participant;
import pt.fct.unl.novalincs.useme.model.EvaluationModeling.TestModel;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Evaluation Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.EvaluationModeling.impl.EvaluationSpecificationImpl#getName <em>Name</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.EvaluationModeling.impl.EvaluationSpecificationImpl#getEvaluationModel <em>Evaluation Model</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.EvaluationModeling.impl.EvaluationSpecificationImpl#getEvaluationGoal <em>Evaluation Goal</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.EvaluationModeling.impl.EvaluationSpecificationImpl#getParticipant <em>Participant</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.EvaluationModeling.impl.EvaluationSpecificationImpl#getDocumentaton <em>Documentaton</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.EvaluationModeling.impl.EvaluationSpecificationImpl#getLanguage <em>Language</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.EvaluationModeling.impl.EvaluationSpecificationImpl#getEvaluationContext <em>Evaluation Context</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.EvaluationModeling.impl.EvaluationSpecificationImpl#getProcess <em>Process</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.EvaluationModeling.impl.EvaluationSpecificationImpl#getTestModel <em>Test Model</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EvaluationSpecificationImpl extends MinimalEObjectImpl.Container implements EvaluationSpecification {
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
	 * The cached value of the '{@link #getEvaluationModel() <em>Evaluation Model</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvaluationModel()
	 * @generated
	 * @ordered
	 */
	protected EList<EvaluationModel> evaluationModel;

	/**
	 * The cached value of the '{@link #getEvaluationGoal() <em>Evaluation Goal</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvaluationGoal()
	 * @generated
	 * @ordered
	 */
	protected EList<EvaluationGoal> evaluationGoal;

	/**
	 * The cached value of the '{@link #getParticipant() <em>Participant</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParticipant()
	 * @generated
	 * @ordered
	 */
	protected EList<Participant> participant;

	/**
	 * The cached value of the '{@link #getDocumentaton() <em>Documentaton</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentaton()
	 * @generated
	 * @ordered
	 */
	protected EList<EvaluationDocumentation> documentaton;

	/**
	 * The cached value of the '{@link #getLanguage() <em>Language</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected EList<Language> language;

	/**
	 * The cached value of the '{@link #getEvaluationContext() <em>Evaluation Context</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvaluationContext()
	 * @generated
	 * @ordered
	 */
	protected EList<EvaluationContext> evaluationContext;

	/**
	 * The cached value of the '{@link #getProcess() <em>Process</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcess()
	 * @generated
	 * @ordered
	 */
	protected EList<pt.fct.unl.novalincs.useme.model.EvaluationModeling.Process> process;

	/**
	 * The cached value of the '{@link #getTestModel() <em>Test Model</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestModel()
	 * @generated
	 * @ordered
	 */
	protected EList<TestModel> testModel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EvaluationSpecificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EvaluationModelingPackage.Literals.EVALUATION_SPECIFICATION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EvaluationModelingPackage.EVALUATION_SPECIFICATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EvaluationModel> getEvaluationModel() {
		if (evaluationModel == null) {
			evaluationModel = new EObjectContainmentEList<EvaluationModel>(EvaluationModel.class, this, EvaluationModelingPackage.EVALUATION_SPECIFICATION__EVALUATION_MODEL);
		}
		return evaluationModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EvaluationGoal> getEvaluationGoal() {
		if (evaluationGoal == null) {
			evaluationGoal = new EObjectContainmentEList<EvaluationGoal>(EvaluationGoal.class, this, EvaluationModelingPackage.EVALUATION_SPECIFICATION__EVALUATION_GOAL);
		}
		return evaluationGoal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Participant> getParticipant() {
		if (participant == null) {
			participant = new EObjectContainmentEList<Participant>(Participant.class, this, EvaluationModelingPackage.EVALUATION_SPECIFICATION__PARTICIPANT);
		}
		return participant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EvaluationDocumentation> getDocumentaton() {
		if (documentaton == null) {
			documentaton = new EObjectContainmentEList<EvaluationDocumentation>(EvaluationDocumentation.class, this, EvaluationModelingPackage.EVALUATION_SPECIFICATION__DOCUMENTATON);
		}
		return documentaton;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Language> getLanguage() {
		if (language == null) {
			language = new EObjectContainmentEList<Language>(Language.class, this, EvaluationModelingPackage.EVALUATION_SPECIFICATION__LANGUAGE);
		}
		return language;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EvaluationContext> getEvaluationContext() {
		if (evaluationContext == null) {
			evaluationContext = new EObjectContainmentEList<EvaluationContext>(EvaluationContext.class, this, EvaluationModelingPackage.EVALUATION_SPECIFICATION__EVALUATION_CONTEXT);
		}
		return evaluationContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<pt.fct.unl.novalincs.useme.model.EvaluationModeling.Process> getProcess() {
		if (process == null) {
			process = new EObjectContainmentEList<pt.fct.unl.novalincs.useme.model.EvaluationModeling.Process>(pt.fct.unl.novalincs.useme.model.EvaluationModeling.Process.class, this, EvaluationModelingPackage.EVALUATION_SPECIFICATION__PROCESS);
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
			testModel = new EObjectContainmentEList<TestModel>(TestModel.class, this, EvaluationModelingPackage.EVALUATION_SPECIFICATION__TEST_MODEL);
		}
		return testModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EvaluationModelingPackage.EVALUATION_SPECIFICATION__EVALUATION_MODEL:
				return ((InternalEList<?>)getEvaluationModel()).basicRemove(otherEnd, msgs);
			case EvaluationModelingPackage.EVALUATION_SPECIFICATION__EVALUATION_GOAL:
				return ((InternalEList<?>)getEvaluationGoal()).basicRemove(otherEnd, msgs);
			case EvaluationModelingPackage.EVALUATION_SPECIFICATION__PARTICIPANT:
				return ((InternalEList<?>)getParticipant()).basicRemove(otherEnd, msgs);
			case EvaluationModelingPackage.EVALUATION_SPECIFICATION__DOCUMENTATON:
				return ((InternalEList<?>)getDocumentaton()).basicRemove(otherEnd, msgs);
			case EvaluationModelingPackage.EVALUATION_SPECIFICATION__LANGUAGE:
				return ((InternalEList<?>)getLanguage()).basicRemove(otherEnd, msgs);
			case EvaluationModelingPackage.EVALUATION_SPECIFICATION__EVALUATION_CONTEXT:
				return ((InternalEList<?>)getEvaluationContext()).basicRemove(otherEnd, msgs);
			case EvaluationModelingPackage.EVALUATION_SPECIFICATION__PROCESS:
				return ((InternalEList<?>)getProcess()).basicRemove(otherEnd, msgs);
			case EvaluationModelingPackage.EVALUATION_SPECIFICATION__TEST_MODEL:
				return ((InternalEList<?>)getTestModel()).basicRemove(otherEnd, msgs);
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
			case EvaluationModelingPackage.EVALUATION_SPECIFICATION__NAME:
				return getName();
			case EvaluationModelingPackage.EVALUATION_SPECIFICATION__EVALUATION_MODEL:
				return getEvaluationModel();
			case EvaluationModelingPackage.EVALUATION_SPECIFICATION__EVALUATION_GOAL:
				return getEvaluationGoal();
			case EvaluationModelingPackage.EVALUATION_SPECIFICATION__PARTICIPANT:
				return getParticipant();
			case EvaluationModelingPackage.EVALUATION_SPECIFICATION__DOCUMENTATON:
				return getDocumentaton();
			case EvaluationModelingPackage.EVALUATION_SPECIFICATION__LANGUAGE:
				return getLanguage();
			case EvaluationModelingPackage.EVALUATION_SPECIFICATION__EVALUATION_CONTEXT:
				return getEvaluationContext();
			case EvaluationModelingPackage.EVALUATION_SPECIFICATION__PROCESS:
				return getProcess();
			case EvaluationModelingPackage.EVALUATION_SPECIFICATION__TEST_MODEL:
				return getTestModel();
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
			case EvaluationModelingPackage.EVALUATION_SPECIFICATION__NAME:
				setName((String)newValue);
				return;
			case EvaluationModelingPackage.EVALUATION_SPECIFICATION__EVALUATION_MODEL:
				getEvaluationModel().clear();
				getEvaluationModel().addAll((Collection<? extends EvaluationModel>)newValue);
				return;
			case EvaluationModelingPackage.EVALUATION_SPECIFICATION__EVALUATION_GOAL:
				getEvaluationGoal().clear();
				getEvaluationGoal().addAll((Collection<? extends EvaluationGoal>)newValue);
				return;
			case EvaluationModelingPackage.EVALUATION_SPECIFICATION__PARTICIPANT:
				getParticipant().clear();
				getParticipant().addAll((Collection<? extends Participant>)newValue);
				return;
			case EvaluationModelingPackage.EVALUATION_SPECIFICATION__DOCUMENTATON:
				getDocumentaton().clear();
				getDocumentaton().addAll((Collection<? extends EvaluationDocumentation>)newValue);
				return;
			case EvaluationModelingPackage.EVALUATION_SPECIFICATION__LANGUAGE:
				getLanguage().clear();
				getLanguage().addAll((Collection<? extends Language>)newValue);
				return;
			case EvaluationModelingPackage.EVALUATION_SPECIFICATION__EVALUATION_CONTEXT:
				getEvaluationContext().clear();
				getEvaluationContext().addAll((Collection<? extends EvaluationContext>)newValue);
				return;
			case EvaluationModelingPackage.EVALUATION_SPECIFICATION__PROCESS:
				getProcess().clear();
				getProcess().addAll((Collection<? extends pt.fct.unl.novalincs.useme.model.EvaluationModeling.Process>)newValue);
				return;
			case EvaluationModelingPackage.EVALUATION_SPECIFICATION__TEST_MODEL:
				getTestModel().clear();
				getTestModel().addAll((Collection<? extends TestModel>)newValue);
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
			case EvaluationModelingPackage.EVALUATION_SPECIFICATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case EvaluationModelingPackage.EVALUATION_SPECIFICATION__EVALUATION_MODEL:
				getEvaluationModel().clear();
				return;
			case EvaluationModelingPackage.EVALUATION_SPECIFICATION__EVALUATION_GOAL:
				getEvaluationGoal().clear();
				return;
			case EvaluationModelingPackage.EVALUATION_SPECIFICATION__PARTICIPANT:
				getParticipant().clear();
				return;
			case EvaluationModelingPackage.EVALUATION_SPECIFICATION__DOCUMENTATON:
				getDocumentaton().clear();
				return;
			case EvaluationModelingPackage.EVALUATION_SPECIFICATION__LANGUAGE:
				getLanguage().clear();
				return;
			case EvaluationModelingPackage.EVALUATION_SPECIFICATION__EVALUATION_CONTEXT:
				getEvaluationContext().clear();
				return;
			case EvaluationModelingPackage.EVALUATION_SPECIFICATION__PROCESS:
				getProcess().clear();
				return;
			case EvaluationModelingPackage.EVALUATION_SPECIFICATION__TEST_MODEL:
				getTestModel().clear();
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
			case EvaluationModelingPackage.EVALUATION_SPECIFICATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case EvaluationModelingPackage.EVALUATION_SPECIFICATION__EVALUATION_MODEL:
				return evaluationModel != null && !evaluationModel.isEmpty();
			case EvaluationModelingPackage.EVALUATION_SPECIFICATION__EVALUATION_GOAL:
				return evaluationGoal != null && !evaluationGoal.isEmpty();
			case EvaluationModelingPackage.EVALUATION_SPECIFICATION__PARTICIPANT:
				return participant != null && !participant.isEmpty();
			case EvaluationModelingPackage.EVALUATION_SPECIFICATION__DOCUMENTATON:
				return documentaton != null && !documentaton.isEmpty();
			case EvaluationModelingPackage.EVALUATION_SPECIFICATION__LANGUAGE:
				return language != null && !language.isEmpty();
			case EvaluationModelingPackage.EVALUATION_SPECIFICATION__EVALUATION_CONTEXT:
				return evaluationContext != null && !evaluationContext.isEmpty();
			case EvaluationModelingPackage.EVALUATION_SPECIFICATION__PROCESS:
				return process != null && !process.isEmpty();
			case EvaluationModelingPackage.EVALUATION_SPECIFICATION__TEST_MODEL:
				return testModel != null && !testModel.isEmpty();
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

} //EvaluationSpecificationImpl
