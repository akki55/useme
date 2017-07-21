/**
 */
package pt.fct.unl.novalincs.useme.model.EvaluationModeling.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationModel;
import pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationModelingPackage;

import pt.fct.unl.novalincs.useme.model.Utility.ProcessModel;
import pt.fct.unl.novalincs.useme.model.Utility.UtilityPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Process</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.EvaluationModeling.impl.ProcessImpl#getName <em>Name</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.EvaluationModeling.impl.ProcessImpl#getEvaluationModel <em>Evaluation Model</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.EvaluationModeling.impl.ProcessImpl#getProcessModel <em>Process Model</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProcessImpl extends MinimalEObjectImpl.Container implements pt.fct.unl.novalincs.useme.model.EvaluationModeling.Process {
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
	 * The cached value of the '{@link #getProcessModel() <em>Process Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessModel()
	 * @generated
	 * @ordered
	 */
	protected ProcessModel processModel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcessImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EvaluationModelingPackage.Literals.PROCESS;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EvaluationModelingPackage.PROCESS__NAME, oldName, name));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EvaluationModelingPackage.PROCESS__EVALUATION_MODEL, oldEvaluationModel, evaluationModel));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EvaluationModelingPackage.PROCESS__EVALUATION_MODEL, oldEvaluationModel, newEvaluationModel);
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
				msgs = ((InternalEObject)evaluationModel).eInverseRemove(this, EvaluationModelingPackage.EVALUATION_MODEL__PROCESS, EvaluationModel.class, msgs);
			if (newEvaluationModel != null)
				msgs = ((InternalEObject)newEvaluationModel).eInverseAdd(this, EvaluationModelingPackage.EVALUATION_MODEL__PROCESS, EvaluationModel.class, msgs);
			msgs = basicSetEvaluationModel(newEvaluationModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EvaluationModelingPackage.PROCESS__EVALUATION_MODEL, newEvaluationModel, newEvaluationModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessModel getProcessModel() {
		if (processModel != null && processModel.eIsProxy()) {
			InternalEObject oldProcessModel = (InternalEObject)processModel;
			processModel = (ProcessModel)eResolveProxy(oldProcessModel);
			if (processModel != oldProcessModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EvaluationModelingPackage.PROCESS__PROCESS_MODEL, oldProcessModel, processModel));
			}
		}
		return processModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessModel basicGetProcessModel() {
		return processModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProcessModel(ProcessModel newProcessModel, NotificationChain msgs) {
		ProcessModel oldProcessModel = processModel;
		processModel = newProcessModel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EvaluationModelingPackage.PROCESS__PROCESS_MODEL, oldProcessModel, newProcessModel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcessModel(ProcessModel newProcessModel) {
		if (newProcessModel != processModel) {
			NotificationChain msgs = null;
			if (processModel != null)
				msgs = ((InternalEObject)processModel).eInverseRemove(this, UtilityPackage.PROCESS_MODEL__EVALUATION_PROCESS, ProcessModel.class, msgs);
			if (newProcessModel != null)
				msgs = ((InternalEObject)newProcessModel).eInverseAdd(this, UtilityPackage.PROCESS_MODEL__EVALUATION_PROCESS, ProcessModel.class, msgs);
			msgs = basicSetProcessModel(newProcessModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EvaluationModelingPackage.PROCESS__PROCESS_MODEL, newProcessModel, newProcessModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EvaluationModelingPackage.PROCESS__EVALUATION_MODEL:
				if (evaluationModel != null)
					msgs = ((InternalEObject)evaluationModel).eInverseRemove(this, EvaluationModelingPackage.EVALUATION_MODEL__PROCESS, EvaluationModel.class, msgs);
				return basicSetEvaluationModel((EvaluationModel)otherEnd, msgs);
			case EvaluationModelingPackage.PROCESS__PROCESS_MODEL:
				if (processModel != null)
					msgs = ((InternalEObject)processModel).eInverseRemove(this, UtilityPackage.PROCESS_MODEL__EVALUATION_PROCESS, ProcessModel.class, msgs);
				return basicSetProcessModel((ProcessModel)otherEnd, msgs);
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
			case EvaluationModelingPackage.PROCESS__EVALUATION_MODEL:
				return basicSetEvaluationModel(null, msgs);
			case EvaluationModelingPackage.PROCESS__PROCESS_MODEL:
				return basicSetProcessModel(null, msgs);
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
			case EvaluationModelingPackage.PROCESS__NAME:
				return getName();
			case EvaluationModelingPackage.PROCESS__EVALUATION_MODEL:
				if (resolve) return getEvaluationModel();
				return basicGetEvaluationModel();
			case EvaluationModelingPackage.PROCESS__PROCESS_MODEL:
				if (resolve) return getProcessModel();
				return basicGetProcessModel();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EvaluationModelingPackage.PROCESS__NAME:
				setName((String)newValue);
				return;
			case EvaluationModelingPackage.PROCESS__EVALUATION_MODEL:
				setEvaluationModel((EvaluationModel)newValue);
				return;
			case EvaluationModelingPackage.PROCESS__PROCESS_MODEL:
				setProcessModel((ProcessModel)newValue);
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
			case EvaluationModelingPackage.PROCESS__NAME:
				setName(NAME_EDEFAULT);
				return;
			case EvaluationModelingPackage.PROCESS__EVALUATION_MODEL:
				setEvaluationModel((EvaluationModel)null);
				return;
			case EvaluationModelingPackage.PROCESS__PROCESS_MODEL:
				setProcessModel((ProcessModel)null);
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
			case EvaluationModelingPackage.PROCESS__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case EvaluationModelingPackage.PROCESS__EVALUATION_MODEL:
				return evaluationModel != null;
			case EvaluationModelingPackage.PROCESS__PROCESS_MODEL:
				return processModel != null;
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

} //ProcessImpl
