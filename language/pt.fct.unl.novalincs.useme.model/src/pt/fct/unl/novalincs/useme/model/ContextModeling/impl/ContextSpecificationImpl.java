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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import pt.fct.unl.novalincs.useme.model.ContextModeling.ContextModel;
import pt.fct.unl.novalincs.useme.model.ContextModeling.ContextModelingPackage;
import pt.fct.unl.novalincs.useme.model.ContextModeling.ContextSpecification;
import pt.fct.unl.novalincs.useme.model.ContextModeling.EnviromentSpecification;
import pt.fct.unl.novalincs.useme.model.ContextModeling.UserProfileSpecification;
import pt.fct.unl.novalincs.useme.model.ContextModeling.WorkflowSpecification;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Context Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.ContextModeling.impl.ContextSpecificationImpl#getName <em>Name</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.ContextModeling.impl.ContextSpecificationImpl#getContextModel <em>Context Model</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.ContextModeling.impl.ContextSpecificationImpl#getUserProfileSpecification <em>User Profile Specification</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.ContextModeling.impl.ContextSpecificationImpl#getEnviromentSpecification <em>Enviroment Specification</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.ContextModeling.impl.ContextSpecificationImpl#getWorkflowSpecification <em>Workflow Specification</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContextSpecificationImpl extends MinimalEObjectImpl.Container implements ContextSpecification {
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
	 * The cached value of the '{@link #getContextModel() <em>Context Model</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContextModel()
	 * @generated
	 * @ordered
	 */
	protected EList<ContextModel> contextModel;

	/**
	 * The cached value of the '{@link #getUserProfileSpecification() <em>User Profile Specification</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserProfileSpecification()
	 * @generated
	 * @ordered
	 */
	protected EList<UserProfileSpecification> userProfileSpecification;

	/**
	 * The cached value of the '{@link #getEnviromentSpecification() <em>Enviroment Specification</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnviromentSpecification()
	 * @generated
	 * @ordered
	 */
	protected EList<EnviromentSpecification> enviromentSpecification;

	/**
	 * The cached value of the '{@link #getWorkflowSpecification() <em>Workflow Specification</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkflowSpecification()
	 * @generated
	 * @ordered
	 */
	protected EList<WorkflowSpecification> workflowSpecification;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContextSpecificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContextModelingPackage.Literals.CONTEXT_SPECIFICATION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ContextModelingPackage.CONTEXT_SPECIFICATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContextModel> getContextModel() {
		if (contextModel == null) {
			contextModel = new EObjectContainmentEList<ContextModel>(ContextModel.class, this, ContextModelingPackage.CONTEXT_SPECIFICATION__CONTEXT_MODEL);
		}
		return contextModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UserProfileSpecification> getUserProfileSpecification() {
		if (userProfileSpecification == null) {
			userProfileSpecification = new EObjectContainmentEList<UserProfileSpecification>(UserProfileSpecification.class, this, ContextModelingPackage.CONTEXT_SPECIFICATION__USER_PROFILE_SPECIFICATION);
		}
		return userProfileSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EnviromentSpecification> getEnviromentSpecification() {
		if (enviromentSpecification == null) {
			enviromentSpecification = new EObjectContainmentEList<EnviromentSpecification>(EnviromentSpecification.class, this, ContextModelingPackage.CONTEXT_SPECIFICATION__ENVIROMENT_SPECIFICATION);
		}
		return enviromentSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WorkflowSpecification> getWorkflowSpecification() {
		if (workflowSpecification == null) {
			workflowSpecification = new EObjectContainmentEList<WorkflowSpecification>(WorkflowSpecification.class, this, ContextModelingPackage.CONTEXT_SPECIFICATION__WORKFLOW_SPECIFICATION);
		}
		return workflowSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ContextModelingPackage.CONTEXT_SPECIFICATION__CONTEXT_MODEL:
				return ((InternalEList<?>)getContextModel()).basicRemove(otherEnd, msgs);
			case ContextModelingPackage.CONTEXT_SPECIFICATION__USER_PROFILE_SPECIFICATION:
				return ((InternalEList<?>)getUserProfileSpecification()).basicRemove(otherEnd, msgs);
			case ContextModelingPackage.CONTEXT_SPECIFICATION__ENVIROMENT_SPECIFICATION:
				return ((InternalEList<?>)getEnviromentSpecification()).basicRemove(otherEnd, msgs);
			case ContextModelingPackage.CONTEXT_SPECIFICATION__WORKFLOW_SPECIFICATION:
				return ((InternalEList<?>)getWorkflowSpecification()).basicRemove(otherEnd, msgs);
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
			case ContextModelingPackage.CONTEXT_SPECIFICATION__NAME:
				return getName();
			case ContextModelingPackage.CONTEXT_SPECIFICATION__CONTEXT_MODEL:
				return getContextModel();
			case ContextModelingPackage.CONTEXT_SPECIFICATION__USER_PROFILE_SPECIFICATION:
				return getUserProfileSpecification();
			case ContextModelingPackage.CONTEXT_SPECIFICATION__ENVIROMENT_SPECIFICATION:
				return getEnviromentSpecification();
			case ContextModelingPackage.CONTEXT_SPECIFICATION__WORKFLOW_SPECIFICATION:
				return getWorkflowSpecification();
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
			case ContextModelingPackage.CONTEXT_SPECIFICATION__NAME:
				setName((String)newValue);
				return;
			case ContextModelingPackage.CONTEXT_SPECIFICATION__CONTEXT_MODEL:
				getContextModel().clear();
				getContextModel().addAll((Collection<? extends ContextModel>)newValue);
				return;
			case ContextModelingPackage.CONTEXT_SPECIFICATION__USER_PROFILE_SPECIFICATION:
				getUserProfileSpecification().clear();
				getUserProfileSpecification().addAll((Collection<? extends UserProfileSpecification>)newValue);
				return;
			case ContextModelingPackage.CONTEXT_SPECIFICATION__ENVIROMENT_SPECIFICATION:
				getEnviromentSpecification().clear();
				getEnviromentSpecification().addAll((Collection<? extends EnviromentSpecification>)newValue);
				return;
			case ContextModelingPackage.CONTEXT_SPECIFICATION__WORKFLOW_SPECIFICATION:
				getWorkflowSpecification().clear();
				getWorkflowSpecification().addAll((Collection<? extends WorkflowSpecification>)newValue);
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
			case ContextModelingPackage.CONTEXT_SPECIFICATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ContextModelingPackage.CONTEXT_SPECIFICATION__CONTEXT_MODEL:
				getContextModel().clear();
				return;
			case ContextModelingPackage.CONTEXT_SPECIFICATION__USER_PROFILE_SPECIFICATION:
				getUserProfileSpecification().clear();
				return;
			case ContextModelingPackage.CONTEXT_SPECIFICATION__ENVIROMENT_SPECIFICATION:
				getEnviromentSpecification().clear();
				return;
			case ContextModelingPackage.CONTEXT_SPECIFICATION__WORKFLOW_SPECIFICATION:
				getWorkflowSpecification().clear();
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
			case ContextModelingPackage.CONTEXT_SPECIFICATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ContextModelingPackage.CONTEXT_SPECIFICATION__CONTEXT_MODEL:
				return contextModel != null && !contextModel.isEmpty();
			case ContextModelingPackage.CONTEXT_SPECIFICATION__USER_PROFILE_SPECIFICATION:
				return userProfileSpecification != null && !userProfileSpecification.isEmpty();
			case ContextModelingPackage.CONTEXT_SPECIFICATION__ENVIROMENT_SPECIFICATION:
				return enviromentSpecification != null && !enviromentSpecification.isEmpty();
			case ContextModelingPackage.CONTEXT_SPECIFICATION__WORKFLOW_SPECIFICATION:
				return workflowSpecification != null && !workflowSpecification.isEmpty();
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

} //ContextSpecificationImpl
