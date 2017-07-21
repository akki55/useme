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
import org.eclipse.emf.ecore.util.InternalEList;
import pt.fct.unl.novalincs.useme.model.ReportModeling.EvaluationResultAbstract;
import pt.fct.unl.novalincs.useme.model.ReportModeling.RecommendGM;
import pt.fct.unl.novalincs.useme.model.ReportModeling.ReportModel;
import pt.fct.unl.novalincs.useme.model.ReportModeling.ReportModelingPackage;
import pt.fct.unl.novalincs.useme.model.ReportModeling.ReportSpecification;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Report Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.ReportModeling.impl.ReportSpecificationImpl#getReportModel <em>Report Model</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.ReportModeling.impl.ReportSpecificationImpl#getRecommendedGM <em>Recommended GM</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.ReportModeling.impl.ReportSpecificationImpl#getEvaluationResult <em>Evaluation Result</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.ReportModeling.impl.ReportSpecificationImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReportSpecificationImpl extends MinimalEObjectImpl.Container implements ReportSpecification {
	/**
	 * The cached value of the '{@link #getReportModel() <em>Report Model</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReportModel()
	 * @generated
	 * @ordered
	 */
	protected EList<ReportModel> reportModel;

	/**
	 * The cached value of the '{@link #getRecommendedGM() <em>Recommended GM</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecommendedGM()
	 * @generated
	 * @ordered
	 */
	protected EList<RecommendGM> recommendedGM;

	/**
	 * The cached value of the '{@link #getEvaluationResult() <em>Evaluation Result</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvaluationResult()
	 * @generated
	 * @ordered
	 */
	protected EList<EvaluationResultAbstract> evaluationResult;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReportSpecificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReportModelingPackage.Literals.REPORT_SPECIFICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ReportModel> getReportModel() {
		if (reportModel == null) {
			reportModel = new EObjectContainmentEList<ReportModel>(ReportModel.class, this, ReportModelingPackage.REPORT_SPECIFICATION__REPORT_MODEL);
		}
		return reportModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RecommendGM> getRecommendedGM() {
		if (recommendedGM == null) {
			recommendedGM = new EObjectContainmentEList<RecommendGM>(RecommendGM.class, this, ReportModelingPackage.REPORT_SPECIFICATION__RECOMMENDED_GM);
		}
		return recommendedGM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EvaluationResultAbstract> getEvaluationResult() {
		if (evaluationResult == null) {
			evaluationResult = new EObjectContainmentEList<EvaluationResultAbstract>(EvaluationResultAbstract.class, this, ReportModelingPackage.REPORT_SPECIFICATION__EVALUATION_RESULT);
		}
		return evaluationResult;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ReportModelingPackage.REPORT_SPECIFICATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ReportModelingPackage.REPORT_SPECIFICATION__REPORT_MODEL:
				return ((InternalEList<?>)getReportModel()).basicRemove(otherEnd, msgs);
			case ReportModelingPackage.REPORT_SPECIFICATION__RECOMMENDED_GM:
				return ((InternalEList<?>)getRecommendedGM()).basicRemove(otherEnd, msgs);
			case ReportModelingPackage.REPORT_SPECIFICATION__EVALUATION_RESULT:
				return ((InternalEList<?>)getEvaluationResult()).basicRemove(otherEnd, msgs);
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
			case ReportModelingPackage.REPORT_SPECIFICATION__REPORT_MODEL:
				return getReportModel();
			case ReportModelingPackage.REPORT_SPECIFICATION__RECOMMENDED_GM:
				return getRecommendedGM();
			case ReportModelingPackage.REPORT_SPECIFICATION__EVALUATION_RESULT:
				return getEvaluationResult();
			case ReportModelingPackage.REPORT_SPECIFICATION__NAME:
				return getName();
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
			case ReportModelingPackage.REPORT_SPECIFICATION__REPORT_MODEL:
				getReportModel().clear();
				getReportModel().addAll((Collection<? extends ReportModel>)newValue);
				return;
			case ReportModelingPackage.REPORT_SPECIFICATION__RECOMMENDED_GM:
				getRecommendedGM().clear();
				getRecommendedGM().addAll((Collection<? extends RecommendGM>)newValue);
				return;
			case ReportModelingPackage.REPORT_SPECIFICATION__EVALUATION_RESULT:
				getEvaluationResult().clear();
				getEvaluationResult().addAll((Collection<? extends EvaluationResultAbstract>)newValue);
				return;
			case ReportModelingPackage.REPORT_SPECIFICATION__NAME:
				setName((String)newValue);
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
			case ReportModelingPackage.REPORT_SPECIFICATION__REPORT_MODEL:
				getReportModel().clear();
				return;
			case ReportModelingPackage.REPORT_SPECIFICATION__RECOMMENDED_GM:
				getRecommendedGM().clear();
				return;
			case ReportModelingPackage.REPORT_SPECIFICATION__EVALUATION_RESULT:
				getEvaluationResult().clear();
				return;
			case ReportModelingPackage.REPORT_SPECIFICATION__NAME:
				setName(NAME_EDEFAULT);
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
			case ReportModelingPackage.REPORT_SPECIFICATION__REPORT_MODEL:
				return reportModel != null && !reportModel.isEmpty();
			case ReportModelingPackage.REPORT_SPECIFICATION__RECOMMENDED_GM:
				return recommendedGM != null && !recommendedGM.isEmpty();
			case ReportModelingPackage.REPORT_SPECIFICATION__EVALUATION_RESULT:
				return evaluationResult != null && !evaluationResult.isEmpty();
			case ReportModelingPackage.REPORT_SPECIFICATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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

} //ReportSpecificationImpl
