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

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import pt.fct.unl.novalincs.useme.model.ContextModeling.Scenario;

import pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationContext;
import pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationModel;
import pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationModelingPackage;

import pt.fct.unl.novalincs.useme.model.GoalModeling.impl.ScopeImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Evaluation Context</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.EvaluationModeling.impl.EvaluationContextImpl#getEvaluationModel <em>Evaluation Model</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.EvaluationModeling.impl.EvaluationContextImpl#getScenario <em>Scenario</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.EvaluationModeling.impl.EvaluationContextImpl#getEnviromentInstance <em>Enviroment Instance</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EvaluationContextImpl extends ScopeImpl implements EvaluationContext {
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
	 * The cached value of the '{@link #getScenario() <em>Scenario</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScenario()
	 * @generated
	 * @ordered
	 */
	protected EList<Scenario> scenario;

	/**
	 * The cached value of the '{@link #getEnviromentInstance() <em>Enviroment Instance</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnviromentInstance()
	 * @generated
	 * @ordered
	 */
	protected EList<String> enviromentInstance;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EvaluationContextImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EvaluationModelingPackage.Literals.EVALUATION_CONTEXT;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EvaluationModelingPackage.EVALUATION_CONTEXT__EVALUATION_MODEL, oldEvaluationModel, evaluationModel));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EvaluationModelingPackage.EVALUATION_CONTEXT__EVALUATION_MODEL, oldEvaluationModel, newEvaluationModel);
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
				msgs = ((InternalEObject)evaluationModel).eInverseRemove(this, EvaluationModelingPackage.EVALUATION_MODEL__EVALUATION_CONTEXT, EvaluationModel.class, msgs);
			if (newEvaluationModel != null)
				msgs = ((InternalEObject)newEvaluationModel).eInverseAdd(this, EvaluationModelingPackage.EVALUATION_MODEL__EVALUATION_CONTEXT, EvaluationModel.class, msgs);
			msgs = basicSetEvaluationModel(newEvaluationModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EvaluationModelingPackage.EVALUATION_CONTEXT__EVALUATION_MODEL, newEvaluationModel, newEvaluationModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Scenario> getScenario() {
		if (scenario == null) {
			scenario = new EObjectResolvingEList<Scenario>(Scenario.class, this, EvaluationModelingPackage.EVALUATION_CONTEXT__SCENARIO);
		}
		return scenario;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getEnviromentInstance() {
		if (enviromentInstance == null) {
			enviromentInstance = new EDataTypeUniqueEList<String>(String.class, this, EvaluationModelingPackage.EVALUATION_CONTEXT__ENVIROMENT_INSTANCE);
		}
		return enviromentInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EvaluationModelingPackage.EVALUATION_CONTEXT__EVALUATION_MODEL:
				if (evaluationModel != null)
					msgs = ((InternalEObject)evaluationModel).eInverseRemove(this, EvaluationModelingPackage.EVALUATION_MODEL__EVALUATION_CONTEXT, EvaluationModel.class, msgs);
				return basicSetEvaluationModel((EvaluationModel)otherEnd, msgs);
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
			case EvaluationModelingPackage.EVALUATION_CONTEXT__EVALUATION_MODEL:
				return basicSetEvaluationModel(null, msgs);
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
			case EvaluationModelingPackage.EVALUATION_CONTEXT__EVALUATION_MODEL:
				if (resolve) return getEvaluationModel();
				return basicGetEvaluationModel();
			case EvaluationModelingPackage.EVALUATION_CONTEXT__SCENARIO:
				return getScenario();
			case EvaluationModelingPackage.EVALUATION_CONTEXT__ENVIROMENT_INSTANCE:
				return getEnviromentInstance();
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
			case EvaluationModelingPackage.EVALUATION_CONTEXT__EVALUATION_MODEL:
				setEvaluationModel((EvaluationModel)newValue);
				return;
			case EvaluationModelingPackage.EVALUATION_CONTEXT__SCENARIO:
				getScenario().clear();
				getScenario().addAll((Collection<? extends Scenario>)newValue);
				return;
			case EvaluationModelingPackage.EVALUATION_CONTEXT__ENVIROMENT_INSTANCE:
				getEnviromentInstance().clear();
				getEnviromentInstance().addAll((Collection<? extends String>)newValue);
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
			case EvaluationModelingPackage.EVALUATION_CONTEXT__EVALUATION_MODEL:
				setEvaluationModel((EvaluationModel)null);
				return;
			case EvaluationModelingPackage.EVALUATION_CONTEXT__SCENARIO:
				getScenario().clear();
				return;
			case EvaluationModelingPackage.EVALUATION_CONTEXT__ENVIROMENT_INSTANCE:
				getEnviromentInstance().clear();
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
			case EvaluationModelingPackage.EVALUATION_CONTEXT__EVALUATION_MODEL:
				return evaluationModel != null;
			case EvaluationModelingPackage.EVALUATION_CONTEXT__SCENARIO:
				return scenario != null && !scenario.isEmpty();
			case EvaluationModelingPackage.EVALUATION_CONTEXT__ENVIROMENT_INSTANCE:
				return enviromentInstance != null && !enviromentInstance.isEmpty();
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
		result.append(" (enviromentInstance: ");
		result.append(enviromentInstance);
		result.append(')');
		return result.toString();
	}

} //EvaluationContextImpl
