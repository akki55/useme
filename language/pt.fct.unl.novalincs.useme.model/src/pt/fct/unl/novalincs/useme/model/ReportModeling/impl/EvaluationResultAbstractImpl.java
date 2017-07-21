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
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import pt.fct.unl.novalincs.useme.model.ReportModeling.EvaluationResultAbstract;
import pt.fct.unl.novalincs.useme.model.ReportModeling.ReportModelingPackage;
import pt.fct.unl.novalincs.useme.model.ReportModeling.ResultValue;

import pt.fct.unl.novalincs.useme.model.Utility.OutsideRef;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Evaluation Result Abstract</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.ReportModeling.impl.EvaluationResultAbstractImpl#getName <em>Name</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.ReportModeling.impl.EvaluationResultAbstractImpl#getResultValue <em>Result Value</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.ReportModeling.impl.EvaluationResultAbstractImpl#getOutsifeReference <em>Outsife Reference</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EvaluationResultAbstractImpl extends MinimalEObjectImpl.Container implements EvaluationResultAbstract {
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
	 * The cached value of the '{@link #getResultValue() <em>Result Value</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultValue()
	 * @generated
	 * @ordered
	 */
	protected EList<ResultValue> resultValue;

	/**
	 * The cached value of the '{@link #getOutsifeReference() <em>Outsife Reference</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutsifeReference()
	 * @generated
	 * @ordered
	 */
	protected EList<OutsideRef> outsifeReference;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EvaluationResultAbstractImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReportModelingPackage.Literals.EVALUATION_RESULT_ABSTRACT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ReportModelingPackage.EVALUATION_RESULT_ABSTRACT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResultValue> getResultValue() {
		if (resultValue == null) {
			resultValue = new EObjectContainmentEList<ResultValue>(ResultValue.class, this, ReportModelingPackage.EVALUATION_RESULT_ABSTRACT__RESULT_VALUE);
		}
		return resultValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OutsideRef> getOutsifeReference() {
		if (outsifeReference == null) {
			outsifeReference = new EObjectResolvingEList<OutsideRef>(OutsideRef.class, this, ReportModelingPackage.EVALUATION_RESULT_ABSTRACT__OUTSIFE_REFERENCE);
		}
		return outsifeReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ReportModelingPackage.EVALUATION_RESULT_ABSTRACT__RESULT_VALUE:
				return ((InternalEList<?>)getResultValue()).basicRemove(otherEnd, msgs);
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
			case ReportModelingPackage.EVALUATION_RESULT_ABSTRACT__NAME:
				return getName();
			case ReportModelingPackage.EVALUATION_RESULT_ABSTRACT__RESULT_VALUE:
				return getResultValue();
			case ReportModelingPackage.EVALUATION_RESULT_ABSTRACT__OUTSIFE_REFERENCE:
				return getOutsifeReference();
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
			case ReportModelingPackage.EVALUATION_RESULT_ABSTRACT__NAME:
				setName((String)newValue);
				return;
			case ReportModelingPackage.EVALUATION_RESULT_ABSTRACT__RESULT_VALUE:
				getResultValue().clear();
				getResultValue().addAll((Collection<? extends ResultValue>)newValue);
				return;
			case ReportModelingPackage.EVALUATION_RESULT_ABSTRACT__OUTSIFE_REFERENCE:
				getOutsifeReference().clear();
				getOutsifeReference().addAll((Collection<? extends OutsideRef>)newValue);
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
			case ReportModelingPackage.EVALUATION_RESULT_ABSTRACT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ReportModelingPackage.EVALUATION_RESULT_ABSTRACT__RESULT_VALUE:
				getResultValue().clear();
				return;
			case ReportModelingPackage.EVALUATION_RESULT_ABSTRACT__OUTSIFE_REFERENCE:
				getOutsifeReference().clear();
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
			case ReportModelingPackage.EVALUATION_RESULT_ABSTRACT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ReportModelingPackage.EVALUATION_RESULT_ABSTRACT__RESULT_VALUE:
				return resultValue != null && !resultValue.isEmpty();
			case ReportModelingPackage.EVALUATION_RESULT_ABSTRACT__OUTSIFE_REFERENCE:
				return outsifeReference != null && !outsifeReference.isEmpty();
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

} //EvaluationResultAbstractImpl
