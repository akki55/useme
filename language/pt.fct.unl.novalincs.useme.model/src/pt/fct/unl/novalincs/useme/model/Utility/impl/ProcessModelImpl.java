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
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import pt.fct.unl.novalincs.useme.model.ContextModeling.ContextModelingPackage;
import pt.fct.unl.novalincs.useme.model.ContextModeling.Workflow;
import pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationModelingPackage;
import pt.fct.unl.novalincs.useme.model.Utility.OutsideRef;
import pt.fct.unl.novalincs.useme.model.Utility.ProcessModel;
import pt.fct.unl.novalincs.useme.model.Utility.UtilityPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Process Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.Utility.impl.ProcessModelImpl#getName <em>Name</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.Utility.impl.ProcessModelImpl#getWorkflow <em>Workflow</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.Utility.impl.ProcessModelImpl#getEvaluationProcess <em>Evaluation Process</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.Utility.impl.ProcessModelImpl#getOutsideRef <em>Outside Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProcessModelImpl extends MinimalEObjectImpl.Container implements ProcessModel {
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
	 * The cached value of the '{@link #getWorkflow() <em>Workflow</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkflow()
	 * @generated
	 * @ordered
	 */
	protected EList<Workflow> workflow;

	/**
	 * The cached value of the '{@link #getEvaluationProcess() <em>Evaluation Process</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvaluationProcess()
	 * @generated
	 * @ordered
	 */
	protected EList<pt.fct.unl.novalincs.useme.model.EvaluationModeling.Process> evaluationProcess;

	/**
	 * The cached value of the '{@link #getOutsideRef() <em>Outside Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutsideRef()
	 * @generated
	 * @ordered
	 */
	protected OutsideRef outsideRef;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcessModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UtilityPackage.Literals.PROCESS_MODEL;
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
			eNotify(new ENotificationImpl(this, Notification.SET, UtilityPackage.PROCESS_MODEL__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Workflow> getWorkflow() {
		if (workflow == null) {
			workflow = new EObjectWithInverseResolvingEList.ManyInverse<Workflow>(Workflow.class, this, UtilityPackage.PROCESS_MODEL__WORKFLOW, ContextModelingPackage.WORKFLOW__PROCESS_MODEL);
		}
		return workflow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<pt.fct.unl.novalincs.useme.model.EvaluationModeling.Process> getEvaluationProcess() {
		if (evaluationProcess == null) {
			evaluationProcess = new EObjectWithInverseResolvingEList<pt.fct.unl.novalincs.useme.model.EvaluationModeling.Process>(pt.fct.unl.novalincs.useme.model.EvaluationModeling.Process.class, this, UtilityPackage.PROCESS_MODEL__EVALUATION_PROCESS, EvaluationModelingPackage.PROCESS__PROCESS_MODEL);
		}
		return evaluationProcess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutsideRef getOutsideRef() {
		if (outsideRef != null && outsideRef.eIsProxy()) {
			InternalEObject oldOutsideRef = (InternalEObject)outsideRef;
			outsideRef = (OutsideRef)eResolveProxy(oldOutsideRef);
			if (outsideRef != oldOutsideRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UtilityPackage.PROCESS_MODEL__OUTSIDE_REF, oldOutsideRef, outsideRef));
			}
		}
		return outsideRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutsideRef basicGetOutsideRef() {
		return outsideRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutsideRef(OutsideRef newOutsideRef) {
		OutsideRef oldOutsideRef = outsideRef;
		outsideRef = newOutsideRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UtilityPackage.PROCESS_MODEL__OUTSIDE_REF, oldOutsideRef, outsideRef));
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
			case UtilityPackage.PROCESS_MODEL__WORKFLOW:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getWorkflow()).basicAdd(otherEnd, msgs);
			case UtilityPackage.PROCESS_MODEL__EVALUATION_PROCESS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEvaluationProcess()).basicAdd(otherEnd, msgs);
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
			case UtilityPackage.PROCESS_MODEL__WORKFLOW:
				return ((InternalEList<?>)getWorkflow()).basicRemove(otherEnd, msgs);
			case UtilityPackage.PROCESS_MODEL__EVALUATION_PROCESS:
				return ((InternalEList<?>)getEvaluationProcess()).basicRemove(otherEnd, msgs);
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
			case UtilityPackage.PROCESS_MODEL__NAME:
				return getName();
			case UtilityPackage.PROCESS_MODEL__WORKFLOW:
				return getWorkflow();
			case UtilityPackage.PROCESS_MODEL__EVALUATION_PROCESS:
				return getEvaluationProcess();
			case UtilityPackage.PROCESS_MODEL__OUTSIDE_REF:
				if (resolve) return getOutsideRef();
				return basicGetOutsideRef();
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
			case UtilityPackage.PROCESS_MODEL__NAME:
				setName((String)newValue);
				return;
			case UtilityPackage.PROCESS_MODEL__WORKFLOW:
				getWorkflow().clear();
				getWorkflow().addAll((Collection<? extends Workflow>)newValue);
				return;
			case UtilityPackage.PROCESS_MODEL__EVALUATION_PROCESS:
				getEvaluationProcess().clear();
				getEvaluationProcess().addAll((Collection<? extends pt.fct.unl.novalincs.useme.model.EvaluationModeling.Process>)newValue);
				return;
			case UtilityPackage.PROCESS_MODEL__OUTSIDE_REF:
				setOutsideRef((OutsideRef)newValue);
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
			case UtilityPackage.PROCESS_MODEL__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UtilityPackage.PROCESS_MODEL__WORKFLOW:
				getWorkflow().clear();
				return;
			case UtilityPackage.PROCESS_MODEL__EVALUATION_PROCESS:
				getEvaluationProcess().clear();
				return;
			case UtilityPackage.PROCESS_MODEL__OUTSIDE_REF:
				setOutsideRef((OutsideRef)null);
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
			case UtilityPackage.PROCESS_MODEL__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UtilityPackage.PROCESS_MODEL__WORKFLOW:
				return workflow != null && !workflow.isEmpty();
			case UtilityPackage.PROCESS_MODEL__EVALUATION_PROCESS:
				return evaluationProcess != null && !evaluationProcess.isEmpty();
			case UtilityPackage.PROCESS_MODEL__OUTSIDE_REF:
				return outsideRef != null;
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

} //ProcessModelImpl
