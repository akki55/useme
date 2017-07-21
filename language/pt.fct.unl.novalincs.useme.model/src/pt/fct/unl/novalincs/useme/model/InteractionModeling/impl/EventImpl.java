/**
 */
package pt.fct.unl.novalincs.useme.model.InteractionModeling.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import pt.fct.unl.novalincs.useme.model.GoalModeling.UsabilityRequirement;

import pt.fct.unl.novalincs.useme.model.InteractionModeling.CaptureAction;
import pt.fct.unl.novalincs.useme.model.InteractionModeling.Event;
import pt.fct.unl.novalincs.useme.model.InteractionModeling.InteractionModel;
import pt.fct.unl.novalincs.useme.model.InteractionModeling.InteractionModelingPackage;

import pt.fct.unl.novalincs.useme.model.Utility.RecordInput;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.InteractionModeling.impl.EventImpl#getName <em>Name</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.InteractionModeling.impl.EventImpl#getUsabilityRequirement <em>Usability Requirement</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.InteractionModeling.impl.EventImpl#getCapture <em>Capture</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.InteractionModeling.impl.EventImpl#getRecordEvent <em>Record Event</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.InteractionModeling.impl.EventImpl#isManual <em>Manual</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.InteractionModeling.impl.EventImpl#getAnalysisType <em>Analysis Type</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.InteractionModeling.impl.EventImpl#getInteractionModel <em>Interaction Model</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.InteractionModeling.impl.EventImpl#getCaptureAction <em>Capture Action</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EventImpl extends MinimalEObjectImpl.Container implements Event {
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
	 * The cached value of the '{@link #getUsabilityRequirement() <em>Usability Requirement</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsabilityRequirement()
	 * @generated
	 * @ordered
	 */
	protected EList<UsabilityRequirement> usabilityRequirement;

	/**
	 * The cached value of the '{@link #getCapture() <em>Capture</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapture()
	 * @generated
	 * @ordered
	 */
	protected EList<String> capture;

	/**
	 * The cached value of the '{@link #getRecordEvent() <em>Record Event</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecordEvent()
	 * @generated
	 * @ordered
	 */
	protected EList<RecordInput> recordEvent;

	/**
	 * The default value of the '{@link #isManual() <em>Manual</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isManual()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MANUAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isManual() <em>Manual</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isManual()
	 * @generated
	 * @ordered
	 */
	protected boolean manual = MANUAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getAnalysisType() <em>Analysis Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnalysisType()
	 * @generated
	 * @ordered
	 */
	protected static final String ANALYSIS_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAnalysisType() <em>Analysis Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnalysisType()
	 * @generated
	 * @ordered
	 */
	protected String analysisType = ANALYSIS_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInteractionModel() <em>Interaction Model</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInteractionModel()
	 * @generated
	 * @ordered
	 */
	protected EList<InteractionModel> interactionModel;

	/**
	 * The cached value of the '{@link #getCaptureAction() <em>Capture Action</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaptureAction()
	 * @generated
	 * @ordered
	 */
	protected EList<CaptureAction> captureAction;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InteractionModelingPackage.Literals.EVENT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, InteractionModelingPackage.EVENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UsabilityRequirement> getUsabilityRequirement() {
		if (usabilityRequirement == null) {
			usabilityRequirement = new EObjectResolvingEList<UsabilityRequirement>(UsabilityRequirement.class, this, InteractionModelingPackage.EVENT__USABILITY_REQUIREMENT);
		}
		return usabilityRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getCapture() {
		if (capture == null) {
			capture = new EDataTypeUniqueEList<String>(String.class, this, InteractionModelingPackage.EVENT__CAPTURE);
		}
		return capture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RecordInput> getRecordEvent() {
		if (recordEvent == null) {
			recordEvent = new EDataTypeUniqueEList<RecordInput>(RecordInput.class, this, InteractionModelingPackage.EVENT__RECORD_EVENT);
		}
		return recordEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isManual() {
		return manual;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setManual(boolean newManual) {
		boolean oldManual = manual;
		manual = newManual;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InteractionModelingPackage.EVENT__MANUAL, oldManual, manual));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAnalysisType() {
		return analysisType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnalysisType(String newAnalysisType) {
		String oldAnalysisType = analysisType;
		analysisType = newAnalysisType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InteractionModelingPackage.EVENT__ANALYSIS_TYPE, oldAnalysisType, analysisType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InteractionModel> getInteractionModel() {
		if (interactionModel == null) {
			interactionModel = new EObjectWithInverseResolvingEList.ManyInverse<InteractionModel>(InteractionModel.class, this, InteractionModelingPackage.EVENT__INTERACTION_MODEL, InteractionModelingPackage.INTERACTION_MODEL__EVENT);
		}
		return interactionModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CaptureAction> getCaptureAction() {
		if (captureAction == null) {
			captureAction = new EObjectContainmentEList<CaptureAction>(CaptureAction.class, this, InteractionModelingPackage.EVENT__CAPTURE_ACTION);
		}
		return captureAction;
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
			case InteractionModelingPackage.EVENT__INTERACTION_MODEL:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInteractionModel()).basicAdd(otherEnd, msgs);
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
			case InteractionModelingPackage.EVENT__INTERACTION_MODEL:
				return ((InternalEList<?>)getInteractionModel()).basicRemove(otherEnd, msgs);
			case InteractionModelingPackage.EVENT__CAPTURE_ACTION:
				return ((InternalEList<?>)getCaptureAction()).basicRemove(otherEnd, msgs);
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
			case InteractionModelingPackage.EVENT__NAME:
				return getName();
			case InteractionModelingPackage.EVENT__USABILITY_REQUIREMENT:
				return getUsabilityRequirement();
			case InteractionModelingPackage.EVENT__CAPTURE:
				return getCapture();
			case InteractionModelingPackage.EVENT__RECORD_EVENT:
				return getRecordEvent();
			case InteractionModelingPackage.EVENT__MANUAL:
				return isManual();
			case InteractionModelingPackage.EVENT__ANALYSIS_TYPE:
				return getAnalysisType();
			case InteractionModelingPackage.EVENT__INTERACTION_MODEL:
				return getInteractionModel();
			case InteractionModelingPackage.EVENT__CAPTURE_ACTION:
				return getCaptureAction();
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
			case InteractionModelingPackage.EVENT__NAME:
				setName((String)newValue);
				return;
			case InteractionModelingPackage.EVENT__USABILITY_REQUIREMENT:
				getUsabilityRequirement().clear();
				getUsabilityRequirement().addAll((Collection<? extends UsabilityRequirement>)newValue);
				return;
			case InteractionModelingPackage.EVENT__CAPTURE:
				getCapture().clear();
				getCapture().addAll((Collection<? extends String>)newValue);
				return;
			case InteractionModelingPackage.EVENT__RECORD_EVENT:
				getRecordEvent().clear();
				getRecordEvent().addAll((Collection<? extends RecordInput>)newValue);
				return;
			case InteractionModelingPackage.EVENT__MANUAL:
				setManual((Boolean)newValue);
				return;
			case InteractionModelingPackage.EVENT__ANALYSIS_TYPE:
				setAnalysisType((String)newValue);
				return;
			case InteractionModelingPackage.EVENT__INTERACTION_MODEL:
				getInteractionModel().clear();
				getInteractionModel().addAll((Collection<? extends InteractionModel>)newValue);
				return;
			case InteractionModelingPackage.EVENT__CAPTURE_ACTION:
				getCaptureAction().clear();
				getCaptureAction().addAll((Collection<? extends CaptureAction>)newValue);
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
			case InteractionModelingPackage.EVENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case InteractionModelingPackage.EVENT__USABILITY_REQUIREMENT:
				getUsabilityRequirement().clear();
				return;
			case InteractionModelingPackage.EVENT__CAPTURE:
				getCapture().clear();
				return;
			case InteractionModelingPackage.EVENT__RECORD_EVENT:
				getRecordEvent().clear();
				return;
			case InteractionModelingPackage.EVENT__MANUAL:
				setManual(MANUAL_EDEFAULT);
				return;
			case InteractionModelingPackage.EVENT__ANALYSIS_TYPE:
				setAnalysisType(ANALYSIS_TYPE_EDEFAULT);
				return;
			case InteractionModelingPackage.EVENT__INTERACTION_MODEL:
				getInteractionModel().clear();
				return;
			case InteractionModelingPackage.EVENT__CAPTURE_ACTION:
				getCaptureAction().clear();
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
			case InteractionModelingPackage.EVENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case InteractionModelingPackage.EVENT__USABILITY_REQUIREMENT:
				return usabilityRequirement != null && !usabilityRequirement.isEmpty();
			case InteractionModelingPackage.EVENT__CAPTURE:
				return capture != null && !capture.isEmpty();
			case InteractionModelingPackage.EVENT__RECORD_EVENT:
				return recordEvent != null && !recordEvent.isEmpty();
			case InteractionModelingPackage.EVENT__MANUAL:
				return manual != MANUAL_EDEFAULT;
			case InteractionModelingPackage.EVENT__ANALYSIS_TYPE:
				return ANALYSIS_TYPE_EDEFAULT == null ? analysisType != null : !ANALYSIS_TYPE_EDEFAULT.equals(analysisType);
			case InteractionModelingPackage.EVENT__INTERACTION_MODEL:
				return interactionModel != null && !interactionModel.isEmpty();
			case InteractionModelingPackage.EVENT__CAPTURE_ACTION:
				return captureAction != null && !captureAction.isEmpty();
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
		result.append(", capture: ");
		result.append(capture);
		result.append(", recordEvent: ");
		result.append(recordEvent);
		result.append(", manual: ");
		result.append(manual);
		result.append(", analysisType: ");
		result.append(analysisType);
		result.append(')');
		return result.toString();
	}

} //EventImpl
