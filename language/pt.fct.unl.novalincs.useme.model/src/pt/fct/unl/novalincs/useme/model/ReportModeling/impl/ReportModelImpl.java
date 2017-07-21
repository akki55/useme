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
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import pt.fct.unl.novalincs.useme.model.ReportModeling.EvaluationResult;
import pt.fct.unl.novalincs.useme.model.ReportModeling.RecommendGM;
import pt.fct.unl.novalincs.useme.model.ReportModeling.ReportModel;
import pt.fct.unl.novalincs.useme.model.ReportModeling.ReportModelingPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Report Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.ReportModeling.impl.ReportModelImpl#getName <em>Name</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.ReportModeling.impl.ReportModelImpl#getEvaluationResult <em>Evaluation Result</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.ReportModeling.impl.ReportModelImpl#getRecommendGM <em>Recommend GM</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReportModelImpl extends MinimalEObjectImpl.Container implements ReportModel {
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
	 * The cached value of the '{@link #getEvaluationResult() <em>Evaluation Result</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvaluationResult()
	 * @generated
	 * @ordered
	 */
	protected EList<EvaluationResult> evaluationResult;

	/**
	 * The cached value of the '{@link #getRecommendGM() <em>Recommend GM</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecommendGM()
	 * @generated
	 * @ordered
	 */
	protected EList<RecommendGM> recommendGM;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReportModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReportModelingPackage.Literals.REPORT_MODEL;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ReportModelingPackage.REPORT_MODEL__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EvaluationResult> getEvaluationResult() {
		if (evaluationResult == null) {
			evaluationResult = new EObjectWithInverseResolvingEList.ManyInverse<EvaluationResult>(EvaluationResult.class, this, ReportModelingPackage.REPORT_MODEL__EVALUATION_RESULT, ReportModelingPackage.EVALUATION_RESULT__REPORT_MODEL);
		}
		return evaluationResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RecommendGM> getRecommendGM() {
		if (recommendGM == null) {
			recommendGM = new EObjectWithInverseResolvingEList<RecommendGM>(RecommendGM.class, this, ReportModelingPackage.REPORT_MODEL__RECOMMEND_GM, ReportModelingPackage.RECOMMEND_GM__REPORT_MODEL);
		}
		return recommendGM;
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
			case ReportModelingPackage.REPORT_MODEL__EVALUATION_RESULT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEvaluationResult()).basicAdd(otherEnd, msgs);
			case ReportModelingPackage.REPORT_MODEL__RECOMMEND_GM:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRecommendGM()).basicAdd(otherEnd, msgs);
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
			case ReportModelingPackage.REPORT_MODEL__EVALUATION_RESULT:
				return ((InternalEList<?>)getEvaluationResult()).basicRemove(otherEnd, msgs);
			case ReportModelingPackage.REPORT_MODEL__RECOMMEND_GM:
				return ((InternalEList<?>)getRecommendGM()).basicRemove(otherEnd, msgs);
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
			case ReportModelingPackage.REPORT_MODEL__NAME:
				return getName();
			case ReportModelingPackage.REPORT_MODEL__EVALUATION_RESULT:
				return getEvaluationResult();
			case ReportModelingPackage.REPORT_MODEL__RECOMMEND_GM:
				return getRecommendGM();
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
			case ReportModelingPackage.REPORT_MODEL__NAME:
				setName((String)newValue);
				return;
			case ReportModelingPackage.REPORT_MODEL__EVALUATION_RESULT:
				getEvaluationResult().clear();
				getEvaluationResult().addAll((Collection<? extends EvaluationResult>)newValue);
				return;
			case ReportModelingPackage.REPORT_MODEL__RECOMMEND_GM:
				getRecommendGM().clear();
				getRecommendGM().addAll((Collection<? extends RecommendGM>)newValue);
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
			case ReportModelingPackage.REPORT_MODEL__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ReportModelingPackage.REPORT_MODEL__EVALUATION_RESULT:
				getEvaluationResult().clear();
				return;
			case ReportModelingPackage.REPORT_MODEL__RECOMMEND_GM:
				getRecommendGM().clear();
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
			case ReportModelingPackage.REPORT_MODEL__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ReportModelingPackage.REPORT_MODEL__EVALUATION_RESULT:
				return evaluationResult != null && !evaluationResult.isEmpty();
			case ReportModelingPackage.REPORT_MODEL__RECOMMEND_GM:
				return recommendGM != null && !recommendGM.isEmpty();
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

} //ReportModelImpl
