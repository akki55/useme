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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import pt.fct.unl.novalincs.useme.model.Utility.DSL;
import pt.fct.unl.novalincs.useme.model.Utility.Documentation;
import pt.fct.unl.novalincs.useme.model.Utility.FunctionalGoal;
import pt.fct.unl.novalincs.useme.model.Utility.OutsideRef;
import pt.fct.unl.novalincs.useme.model.Utility.ProcessModel;
import pt.fct.unl.novalincs.useme.model.Utility.Requirement;
import pt.fct.unl.novalincs.useme.model.Utility.SurveyEngine;
import pt.fct.unl.novalincs.useme.model.Utility.UtilityPackage;
import pt.fct.unl.novalincs.useme.model.Utility.UtilitySpecification;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.Utility.impl.UtilitySpecificationImpl#getName <em>Name</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.Utility.impl.UtilitySpecificationImpl#getDSL <em>DSL</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.Utility.impl.UtilitySpecificationImpl#getFunctionalGoal <em>Functional Goal</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.Utility.impl.UtilitySpecificationImpl#getProcessModel <em>Process Model</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.Utility.impl.UtilitySpecificationImpl#getSurveyEngine <em>Survey Engine</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.Utility.impl.UtilitySpecificationImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.Utility.impl.UtilitySpecificationImpl#getOutsideRef <em>Outside Ref</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.Utility.impl.UtilitySpecificationImpl#getRequirement <em>Requirement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UtilitySpecificationImpl extends MinimalEObjectImpl.Container implements UtilitySpecification {
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
	 * The cached value of the '{@link #getDSL() <em>DSL</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDSL()
	 * @generated
	 * @ordered
	 */
	protected EList<DSL> dsl;

	/**
	 * The cached value of the '{@link #getFunctionalGoal() <em>Functional Goal</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctionalGoal()
	 * @generated
	 * @ordered
	 */
	protected EList<FunctionalGoal> functionalGoal;

	/**
	 * The cached value of the '{@link #getProcessModel() <em>Process Model</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessModel()
	 * @generated
	 * @ordered
	 */
	protected EList<ProcessModel> processModel;

	/**
	 * The cached value of the '{@link #getSurveyEngine() <em>Survey Engine</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSurveyEngine()
	 * @generated
	 * @ordered
	 */
	protected EList<SurveyEngine> surveyEngine;

	/**
	 * The cached value of the '{@link #getDocumentation() <em>Documentation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentation()
	 * @generated
	 * @ordered
	 */
	protected EList<Documentation> documentation;

	/**
	 * The cached value of the '{@link #getOutsideRef() <em>Outside Ref</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutsideRef()
	 * @generated
	 * @ordered
	 */
	protected EList<OutsideRef> outsideRef;

	/**
	 * The cached value of the '{@link #getRequirement() <em>Requirement</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequirement()
	 * @generated
	 * @ordered
	 */
	protected EList<Requirement> requirement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UtilitySpecificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UtilityPackage.Literals.UTILITY_SPECIFICATION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, UtilityPackage.UTILITY_SPECIFICATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DSL> getDSL() {
		if (dsl == null) {
			dsl = new EObjectContainmentEList<DSL>(DSL.class, this, UtilityPackage.UTILITY_SPECIFICATION__DSL);
		}
		return dsl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FunctionalGoal> getFunctionalGoal() {
		if (functionalGoal == null) {
			functionalGoal = new EObjectContainmentEList<FunctionalGoal>(FunctionalGoal.class, this, UtilityPackage.UTILITY_SPECIFICATION__FUNCTIONAL_GOAL);
		}
		return functionalGoal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProcessModel> getProcessModel() {
		if (processModel == null) {
			processModel = new EObjectContainmentEList<ProcessModel>(ProcessModel.class, this, UtilityPackage.UTILITY_SPECIFICATION__PROCESS_MODEL);
		}
		return processModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SurveyEngine> getSurveyEngine() {
		if (surveyEngine == null) {
			surveyEngine = new EObjectContainmentEList<SurveyEngine>(SurveyEngine.class, this, UtilityPackage.UTILITY_SPECIFICATION__SURVEY_ENGINE);
		}
		return surveyEngine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Documentation> getDocumentation() {
		if (documentation == null) {
			documentation = new EObjectContainmentEList<Documentation>(Documentation.class, this, UtilityPackage.UTILITY_SPECIFICATION__DOCUMENTATION);
		}
		return documentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OutsideRef> getOutsideRef() {
		if (outsideRef == null) {
			outsideRef = new EObjectContainmentEList<OutsideRef>(OutsideRef.class, this, UtilityPackage.UTILITY_SPECIFICATION__OUTSIDE_REF);
		}
		return outsideRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Requirement> getRequirement() {
		if (requirement == null) {
			requirement = new EObjectContainmentEList<Requirement>(Requirement.class, this, UtilityPackage.UTILITY_SPECIFICATION__REQUIREMENT);
		}
		return requirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UtilityPackage.UTILITY_SPECIFICATION__DSL:
				return ((InternalEList<?>)getDSL()).basicRemove(otherEnd, msgs);
			case UtilityPackage.UTILITY_SPECIFICATION__FUNCTIONAL_GOAL:
				return ((InternalEList<?>)getFunctionalGoal()).basicRemove(otherEnd, msgs);
			case UtilityPackage.UTILITY_SPECIFICATION__PROCESS_MODEL:
				return ((InternalEList<?>)getProcessModel()).basicRemove(otherEnd, msgs);
			case UtilityPackage.UTILITY_SPECIFICATION__SURVEY_ENGINE:
				return ((InternalEList<?>)getSurveyEngine()).basicRemove(otherEnd, msgs);
			case UtilityPackage.UTILITY_SPECIFICATION__DOCUMENTATION:
				return ((InternalEList<?>)getDocumentation()).basicRemove(otherEnd, msgs);
			case UtilityPackage.UTILITY_SPECIFICATION__OUTSIDE_REF:
				return ((InternalEList<?>)getOutsideRef()).basicRemove(otherEnd, msgs);
			case UtilityPackage.UTILITY_SPECIFICATION__REQUIREMENT:
				return ((InternalEList<?>)getRequirement()).basicRemove(otherEnd, msgs);
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
			case UtilityPackage.UTILITY_SPECIFICATION__NAME:
				return getName();
			case UtilityPackage.UTILITY_SPECIFICATION__DSL:
				return getDSL();
			case UtilityPackage.UTILITY_SPECIFICATION__FUNCTIONAL_GOAL:
				return getFunctionalGoal();
			case UtilityPackage.UTILITY_SPECIFICATION__PROCESS_MODEL:
				return getProcessModel();
			case UtilityPackage.UTILITY_SPECIFICATION__SURVEY_ENGINE:
				return getSurveyEngine();
			case UtilityPackage.UTILITY_SPECIFICATION__DOCUMENTATION:
				return getDocumentation();
			case UtilityPackage.UTILITY_SPECIFICATION__OUTSIDE_REF:
				return getOutsideRef();
			case UtilityPackage.UTILITY_SPECIFICATION__REQUIREMENT:
				return getRequirement();
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
			case UtilityPackage.UTILITY_SPECIFICATION__NAME:
				setName((String)newValue);
				return;
			case UtilityPackage.UTILITY_SPECIFICATION__DSL:
				getDSL().clear();
				getDSL().addAll((Collection<? extends DSL>)newValue);
				return;
			case UtilityPackage.UTILITY_SPECIFICATION__FUNCTIONAL_GOAL:
				getFunctionalGoal().clear();
				getFunctionalGoal().addAll((Collection<? extends FunctionalGoal>)newValue);
				return;
			case UtilityPackage.UTILITY_SPECIFICATION__PROCESS_MODEL:
				getProcessModel().clear();
				getProcessModel().addAll((Collection<? extends ProcessModel>)newValue);
				return;
			case UtilityPackage.UTILITY_SPECIFICATION__SURVEY_ENGINE:
				getSurveyEngine().clear();
				getSurveyEngine().addAll((Collection<? extends SurveyEngine>)newValue);
				return;
			case UtilityPackage.UTILITY_SPECIFICATION__DOCUMENTATION:
				getDocumentation().clear();
				getDocumentation().addAll((Collection<? extends Documentation>)newValue);
				return;
			case UtilityPackage.UTILITY_SPECIFICATION__OUTSIDE_REF:
				getOutsideRef().clear();
				getOutsideRef().addAll((Collection<? extends OutsideRef>)newValue);
				return;
			case UtilityPackage.UTILITY_SPECIFICATION__REQUIREMENT:
				getRequirement().clear();
				getRequirement().addAll((Collection<? extends Requirement>)newValue);
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
			case UtilityPackage.UTILITY_SPECIFICATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UtilityPackage.UTILITY_SPECIFICATION__DSL:
				getDSL().clear();
				return;
			case UtilityPackage.UTILITY_SPECIFICATION__FUNCTIONAL_GOAL:
				getFunctionalGoal().clear();
				return;
			case UtilityPackage.UTILITY_SPECIFICATION__PROCESS_MODEL:
				getProcessModel().clear();
				return;
			case UtilityPackage.UTILITY_SPECIFICATION__SURVEY_ENGINE:
				getSurveyEngine().clear();
				return;
			case UtilityPackage.UTILITY_SPECIFICATION__DOCUMENTATION:
				getDocumentation().clear();
				return;
			case UtilityPackage.UTILITY_SPECIFICATION__OUTSIDE_REF:
				getOutsideRef().clear();
				return;
			case UtilityPackage.UTILITY_SPECIFICATION__REQUIREMENT:
				getRequirement().clear();
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
			case UtilityPackage.UTILITY_SPECIFICATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UtilityPackage.UTILITY_SPECIFICATION__DSL:
				return dsl != null && !dsl.isEmpty();
			case UtilityPackage.UTILITY_SPECIFICATION__FUNCTIONAL_GOAL:
				return functionalGoal != null && !functionalGoal.isEmpty();
			case UtilityPackage.UTILITY_SPECIFICATION__PROCESS_MODEL:
				return processModel != null && !processModel.isEmpty();
			case UtilityPackage.UTILITY_SPECIFICATION__SURVEY_ENGINE:
				return surveyEngine != null && !surveyEngine.isEmpty();
			case UtilityPackage.UTILITY_SPECIFICATION__DOCUMENTATION:
				return documentation != null && !documentation.isEmpty();
			case UtilityPackage.UTILITY_SPECIFICATION__OUTSIDE_REF:
				return outsideRef != null && !outsideRef.isEmpty();
			case UtilityPackage.UTILITY_SPECIFICATION__REQUIREMENT:
				return requirement != null && !requirement.isEmpty();
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

} //UtilitySpecificationImpl
