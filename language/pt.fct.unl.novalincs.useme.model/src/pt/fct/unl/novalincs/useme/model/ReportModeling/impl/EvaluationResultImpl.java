/**
 */
package pt.fct.unl.novalincs.useme.model.ReportModeling.impl;

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

import pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationContext;

import pt.fct.unl.novalincs.useme.model.ReportModeling.EvaluationResult;
import pt.fct.unl.novalincs.useme.model.ReportModeling.ReportModel;
import pt.fct.unl.novalincs.useme.model.ReportModeling.ReportModelingPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Evaluation Result</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.ReportModeling.impl.EvaluationResultImpl#getName <em>Name</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.ReportModeling.impl.EvaluationResultImpl#getOutsideReference <em>Outside Reference</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.ReportModeling.impl.EvaluationResultImpl#getReportModel <em>Report Model</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.ReportModeling.impl.EvaluationResultImpl#getEvaluationContext <em>Evaluation Context</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EvaluationResultImpl extends MinimalEObjectImpl.Container implements EvaluationResult {
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
	 * The cached value of the '{@link #getOutsideReference() <em>Outside Reference</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutsideReference()
	 * @generated
	 * @ordered
	 */
	protected EList<String> outsideReference;

	/**
	 * The cached value of the '{@link #getReportModel() <em>Report Model</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReportModel()
	 * @generated
	 * @ordered
	 */
	protected EList<ReportModel> reportModel;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EvaluationResultImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReportModelingPackage.Literals.EVALUATION_RESULT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ReportModelingPackage.EVALUATION_RESULT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getOutsideReference() {
		if (outsideReference == null) {
			outsideReference = new EDataTypeUniqueEList<String>(String.class, this, ReportModelingPackage.EVALUATION_RESULT__OUTSIDE_REFERENCE);
		}
		return outsideReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ReportModel> getReportModel() {
		if (reportModel == null) {
			reportModel = new EObjectWithInverseResolvingEList.ManyInverse<ReportModel>(ReportModel.class, this, ReportModelingPackage.EVALUATION_RESULT__REPORT_MODEL, ReportModelingPackage.REPORT_MODEL__EVALUATION_RESULT);
		}
		return reportModel;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ReportModelingPackage.EVALUATION_RESULT__EVALUATION_CONTEXT, oldEvaluationContext, evaluationContext));
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
	public void setEvaluationContext(EvaluationContext newEvaluationContext) {
		EvaluationContext oldEvaluationContext = evaluationContext;
		evaluationContext = newEvaluationContext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReportModelingPackage.EVALUATION_RESULT__EVALUATION_CONTEXT, oldEvaluationContext, evaluationContext));
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
			case ReportModelingPackage.EVALUATION_RESULT__REPORT_MODEL:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getReportModel()).basicAdd(otherEnd, msgs);
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
			case ReportModelingPackage.EVALUATION_RESULT__REPORT_MODEL:
				return ((InternalEList<?>)getReportModel()).basicRemove(otherEnd, msgs);
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
			case ReportModelingPackage.EVALUATION_RESULT__NAME:
				return getName();
			case ReportModelingPackage.EVALUATION_RESULT__OUTSIDE_REFERENCE:
				return getOutsideReference();
			case ReportModelingPackage.EVALUATION_RESULT__REPORT_MODEL:
				return getReportModel();
			case ReportModelingPackage.EVALUATION_RESULT__EVALUATION_CONTEXT:
				if (resolve) return getEvaluationContext();
				return basicGetEvaluationContext();
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
			case ReportModelingPackage.EVALUATION_RESULT__NAME:
				setName((String)newValue);
				return;
			case ReportModelingPackage.EVALUATION_RESULT__OUTSIDE_REFERENCE:
				getOutsideReference().clear();
				getOutsideReference().addAll((Collection<? extends String>)newValue);
				return;
			case ReportModelingPackage.EVALUATION_RESULT__REPORT_MODEL:
				getReportModel().clear();
				getReportModel().addAll((Collection<? extends ReportModel>)newValue);
				return;
			case ReportModelingPackage.EVALUATION_RESULT__EVALUATION_CONTEXT:
				setEvaluationContext((EvaluationContext)newValue);
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
			case ReportModelingPackage.EVALUATION_RESULT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ReportModelingPackage.EVALUATION_RESULT__OUTSIDE_REFERENCE:
				getOutsideReference().clear();
				return;
			case ReportModelingPackage.EVALUATION_RESULT__REPORT_MODEL:
				getReportModel().clear();
				return;
			case ReportModelingPackage.EVALUATION_RESULT__EVALUATION_CONTEXT:
				setEvaluationContext((EvaluationContext)null);
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
			case ReportModelingPackage.EVALUATION_RESULT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ReportModelingPackage.EVALUATION_RESULT__OUTSIDE_REFERENCE:
				return outsideReference != null && !outsideReference.isEmpty();
			case ReportModelingPackage.EVALUATION_RESULT__REPORT_MODEL:
				return reportModel != null && !reportModel.isEmpty();
			case ReportModelingPackage.EVALUATION_RESULT__EVALUATION_CONTEXT:
				return evaluationContext != null;
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
		result.append(", outsideReference: ");
		result.append(outsideReference);
		result.append(')');
		return result.toString();
	}

} //EvaluationResultImpl
