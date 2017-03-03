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

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import pt.fct.unl.novalincs.useme.model.GoalModeling.GoalModel;
import pt.fct.unl.novalincs.useme.model.GoalModeling.UsabilityGoal;

import pt.fct.unl.novalincs.useme.model.ReportModeling.RecommendGM;
import pt.fct.unl.novalincs.useme.model.ReportModeling.ReportModel;
import pt.fct.unl.novalincs.useme.model.ReportModeling.ReportModelingPackage;

import pt.fct.unl.novalincs.useme.model.Utility.FunctionalGoal;
import pt.fct.unl.novalincs.useme.model.Utility.Requirement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Recommend GM</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.ReportModeling.impl.RecommendGMImpl#getReportModel <em>Report Model</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.ReportModeling.impl.RecommendGMImpl#getRefersTo <em>Refers To</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.ReportModeling.impl.RecommendGMImpl#getFunctionalGoal <em>Functional Goal</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.ReportModeling.impl.RecommendGMImpl#getUsabilityGoal <em>Usability Goal</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.ReportModeling.impl.RecommendGMImpl#getSuggestedRequirements <em>Suggested Requirements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RecommendGMImpl extends MinimalEObjectImpl.Container implements RecommendGM {
	/**
	 * The cached value of the '{@link #getReportModel() <em>Report Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReportModel()
	 * @generated
	 * @ordered
	 */
	protected ReportModel reportModel;

	/**
	 * The cached value of the '{@link #getRefersTo() <em>Refers To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefersTo()
	 * @generated
	 * @ordered
	 */
	protected GoalModel refersTo;

	/**
	 * The cached value of the '{@link #getFunctionalGoal() <em>Functional Goal</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctionalGoal()
	 * @generated
	 * @ordered
	 */
	protected EList<FunctionalGoal> functionalGoal;

	/**
	 * The cached value of the '{@link #getUsabilityGoal() <em>Usability Goal</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsabilityGoal()
	 * @generated
	 * @ordered
	 */
	protected EList<UsabilityGoal> usabilityGoal;

	/**
	 * The cached value of the '{@link #getSuggestedRequirements() <em>Suggested Requirements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuggestedRequirements()
	 * @generated
	 * @ordered
	 */
	protected EList<Requirement> suggestedRequirements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RecommendGMImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReportModelingPackage.Literals.RECOMMEND_GM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReportModel getReportModel() {
		if (reportModel != null && reportModel.eIsProxy()) {
			InternalEObject oldReportModel = (InternalEObject)reportModel;
			reportModel = (ReportModel)eResolveProxy(oldReportModel);
			if (reportModel != oldReportModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ReportModelingPackage.RECOMMEND_GM__REPORT_MODEL, oldReportModel, reportModel));
			}
		}
		return reportModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReportModel basicGetReportModel() {
		return reportModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReportModel(ReportModel newReportModel, NotificationChain msgs) {
		ReportModel oldReportModel = reportModel;
		reportModel = newReportModel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ReportModelingPackage.RECOMMEND_GM__REPORT_MODEL, oldReportModel, newReportModel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReportModel(ReportModel newReportModel) {
		if (newReportModel != reportModel) {
			NotificationChain msgs = null;
			if (reportModel != null)
				msgs = ((InternalEObject)reportModel).eInverseRemove(this, ReportModelingPackage.REPORT_MODEL__RECOMMEND_GM, ReportModel.class, msgs);
			if (newReportModel != null)
				msgs = ((InternalEObject)newReportModel).eInverseAdd(this, ReportModelingPackage.REPORT_MODEL__RECOMMEND_GM, ReportModel.class, msgs);
			msgs = basicSetReportModel(newReportModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReportModelingPackage.RECOMMEND_GM__REPORT_MODEL, newReportModel, newReportModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GoalModel getRefersTo() {
		if (refersTo != null && refersTo.eIsProxy()) {
			InternalEObject oldRefersTo = (InternalEObject)refersTo;
			refersTo = (GoalModel)eResolveProxy(oldRefersTo);
			if (refersTo != oldRefersTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ReportModelingPackage.RECOMMEND_GM__REFERS_TO, oldRefersTo, refersTo));
			}
		}
		return refersTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GoalModel basicGetRefersTo() {
		return refersTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRefersTo(GoalModel newRefersTo) {
		GoalModel oldRefersTo = refersTo;
		refersTo = newRefersTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReportModelingPackage.RECOMMEND_GM__REFERS_TO, oldRefersTo, refersTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FunctionalGoal> getFunctionalGoal() {
		if (functionalGoal == null) {
			functionalGoal = new EObjectResolvingEList<FunctionalGoal>(FunctionalGoal.class, this, ReportModelingPackage.RECOMMEND_GM__FUNCTIONAL_GOAL);
		}
		return functionalGoal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UsabilityGoal> getUsabilityGoal() {
		if (usabilityGoal == null) {
			usabilityGoal = new EObjectResolvingEList<UsabilityGoal>(UsabilityGoal.class, this, ReportModelingPackage.RECOMMEND_GM__USABILITY_GOAL);
		}
		return usabilityGoal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Requirement> getSuggestedRequirements() {
		if (suggestedRequirements == null) {
			suggestedRequirements = new EObjectResolvingEList<Requirement>(Requirement.class, this, ReportModelingPackage.RECOMMEND_GM__SUGGESTED_REQUIREMENTS);
		}
		return suggestedRequirements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ReportModelingPackage.RECOMMEND_GM__REPORT_MODEL:
				if (reportModel != null)
					msgs = ((InternalEObject)reportModel).eInverseRemove(this, ReportModelingPackage.REPORT_MODEL__RECOMMEND_GM, ReportModel.class, msgs);
				return basicSetReportModel((ReportModel)otherEnd, msgs);
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
			case ReportModelingPackage.RECOMMEND_GM__REPORT_MODEL:
				return basicSetReportModel(null, msgs);
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
			case ReportModelingPackage.RECOMMEND_GM__REPORT_MODEL:
				if (resolve) return getReportModel();
				return basicGetReportModel();
			case ReportModelingPackage.RECOMMEND_GM__REFERS_TO:
				if (resolve) return getRefersTo();
				return basicGetRefersTo();
			case ReportModelingPackage.RECOMMEND_GM__FUNCTIONAL_GOAL:
				return getFunctionalGoal();
			case ReportModelingPackage.RECOMMEND_GM__USABILITY_GOAL:
				return getUsabilityGoal();
			case ReportModelingPackage.RECOMMEND_GM__SUGGESTED_REQUIREMENTS:
				return getSuggestedRequirements();
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
			case ReportModelingPackage.RECOMMEND_GM__REPORT_MODEL:
				setReportModel((ReportModel)newValue);
				return;
			case ReportModelingPackage.RECOMMEND_GM__REFERS_TO:
				setRefersTo((GoalModel)newValue);
				return;
			case ReportModelingPackage.RECOMMEND_GM__FUNCTIONAL_GOAL:
				getFunctionalGoal().clear();
				getFunctionalGoal().addAll((Collection<? extends FunctionalGoal>)newValue);
				return;
			case ReportModelingPackage.RECOMMEND_GM__USABILITY_GOAL:
				getUsabilityGoal().clear();
				getUsabilityGoal().addAll((Collection<? extends UsabilityGoal>)newValue);
				return;
			case ReportModelingPackage.RECOMMEND_GM__SUGGESTED_REQUIREMENTS:
				getSuggestedRequirements().clear();
				getSuggestedRequirements().addAll((Collection<? extends Requirement>)newValue);
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
			case ReportModelingPackage.RECOMMEND_GM__REPORT_MODEL:
				setReportModel((ReportModel)null);
				return;
			case ReportModelingPackage.RECOMMEND_GM__REFERS_TO:
				setRefersTo((GoalModel)null);
				return;
			case ReportModelingPackage.RECOMMEND_GM__FUNCTIONAL_GOAL:
				getFunctionalGoal().clear();
				return;
			case ReportModelingPackage.RECOMMEND_GM__USABILITY_GOAL:
				getUsabilityGoal().clear();
				return;
			case ReportModelingPackage.RECOMMEND_GM__SUGGESTED_REQUIREMENTS:
				getSuggestedRequirements().clear();
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
			case ReportModelingPackage.RECOMMEND_GM__REPORT_MODEL:
				return reportModel != null;
			case ReportModelingPackage.RECOMMEND_GM__REFERS_TO:
				return refersTo != null;
			case ReportModelingPackage.RECOMMEND_GM__FUNCTIONAL_GOAL:
				return functionalGoal != null && !functionalGoal.isEmpty();
			case ReportModelingPackage.RECOMMEND_GM__USABILITY_GOAL:
				return usabilityGoal != null && !usabilityGoal.isEmpty();
			case ReportModelingPackage.RECOMMEND_GM__SUGGESTED_REQUIREMENTS:
				return suggestedRequirements != null && !suggestedRequirements.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RecommendGMImpl
