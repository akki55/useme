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
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import pt.fct.unl.novalincs.useme.model.ContextModeling.ContextModelingPackage;
import pt.fct.unl.novalincs.useme.model.ContextModeling.Scenario;

import pt.fct.unl.novalincs.useme.model.EvaluationModeling.Documentation;
import pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationModel;
import pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationModelingPackage;

import pt.fct.unl.novalincs.useme.model.Utility.OutsideRef;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Documentation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.EvaluationModeling.impl.DocumentationImpl#getEvaluationModel <em>Evaluation Model</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.EvaluationModeling.impl.DocumentationImpl#getScenario <em>Scenario</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.EvaluationModeling.impl.DocumentationImpl#getName <em>Name</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.EvaluationModeling.impl.DocumentationImpl#getOutsideRef <em>Outside Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DocumentationImpl extends MinimalEObjectImpl.Container implements Documentation {
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
	protected DocumentationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EvaluationModelingPackage.Literals.DOCUMENTATION;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EvaluationModelingPackage.DOCUMENTATION__EVALUATION_MODEL, oldEvaluationModel, evaluationModel));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EvaluationModelingPackage.DOCUMENTATION__EVALUATION_MODEL, oldEvaluationModel, newEvaluationModel);
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
				msgs = ((InternalEObject)evaluationModel).eInverseRemove(this, EvaluationModelingPackage.EVALUATION_MODEL__DOC, EvaluationModel.class, msgs);
			if (newEvaluationModel != null)
				msgs = ((InternalEObject)newEvaluationModel).eInverseAdd(this, EvaluationModelingPackage.EVALUATION_MODEL__DOC, EvaluationModel.class, msgs);
			msgs = basicSetEvaluationModel(newEvaluationModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EvaluationModelingPackage.DOCUMENTATION__EVALUATION_MODEL, newEvaluationModel, newEvaluationModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Scenario> getScenario() {
		if (scenario == null) {
			scenario = new EObjectWithInverseResolvingEList.ManyInverse<Scenario>(Scenario.class, this, EvaluationModelingPackage.DOCUMENTATION__SCENARIO, ContextModelingPackage.SCENARIO__DOC);
		}
		return scenario;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EvaluationModelingPackage.DOCUMENTATION__NAME, oldName, name));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EvaluationModelingPackage.DOCUMENTATION__OUTSIDE_REF, oldOutsideRef, outsideRef));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EvaluationModelingPackage.DOCUMENTATION__OUTSIDE_REF, oldOutsideRef, outsideRef));
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
			case EvaluationModelingPackage.DOCUMENTATION__EVALUATION_MODEL:
				if (evaluationModel != null)
					msgs = ((InternalEObject)evaluationModel).eInverseRemove(this, EvaluationModelingPackage.EVALUATION_MODEL__DOC, EvaluationModel.class, msgs);
				return basicSetEvaluationModel((EvaluationModel)otherEnd, msgs);
			case EvaluationModelingPackage.DOCUMENTATION__SCENARIO:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getScenario()).basicAdd(otherEnd, msgs);
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
			case EvaluationModelingPackage.DOCUMENTATION__EVALUATION_MODEL:
				return basicSetEvaluationModel(null, msgs);
			case EvaluationModelingPackage.DOCUMENTATION__SCENARIO:
				return ((InternalEList<?>)getScenario()).basicRemove(otherEnd, msgs);
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
			case EvaluationModelingPackage.DOCUMENTATION__EVALUATION_MODEL:
				if (resolve) return getEvaluationModel();
				return basicGetEvaluationModel();
			case EvaluationModelingPackage.DOCUMENTATION__SCENARIO:
				return getScenario();
			case EvaluationModelingPackage.DOCUMENTATION__NAME:
				return getName();
			case EvaluationModelingPackage.DOCUMENTATION__OUTSIDE_REF:
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
			case EvaluationModelingPackage.DOCUMENTATION__EVALUATION_MODEL:
				setEvaluationModel((EvaluationModel)newValue);
				return;
			case EvaluationModelingPackage.DOCUMENTATION__SCENARIO:
				getScenario().clear();
				getScenario().addAll((Collection<? extends Scenario>)newValue);
				return;
			case EvaluationModelingPackage.DOCUMENTATION__NAME:
				setName((String)newValue);
				return;
			case EvaluationModelingPackage.DOCUMENTATION__OUTSIDE_REF:
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
			case EvaluationModelingPackage.DOCUMENTATION__EVALUATION_MODEL:
				setEvaluationModel((EvaluationModel)null);
				return;
			case EvaluationModelingPackage.DOCUMENTATION__SCENARIO:
				getScenario().clear();
				return;
			case EvaluationModelingPackage.DOCUMENTATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case EvaluationModelingPackage.DOCUMENTATION__OUTSIDE_REF:
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
			case EvaluationModelingPackage.DOCUMENTATION__EVALUATION_MODEL:
				return evaluationModel != null;
			case EvaluationModelingPackage.DOCUMENTATION__SCENARIO:
				return scenario != null && !scenario.isEmpty();
			case EvaluationModelingPackage.DOCUMENTATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case EvaluationModelingPackage.DOCUMENTATION__OUTSIDE_REF:
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

} //DocumentationImpl
