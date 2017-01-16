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
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import pt.fct.unl.novalincs.useme.model.ContextModeling.ContextModel;
import pt.fct.unl.novalincs.useme.model.ContextModeling.ContextModelingPackage;

import pt.fct.unl.novalincs.useme.model.EvaluationModeling.Documentation;
import pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationModel;

import pt.fct.unl.novalincs.useme.model.GoalModeling.GoalModel;

import pt.fct.unl.novalincs.useme.model.Utility.AbstractSyntax;
import pt.fct.unl.novalincs.useme.model.Utility.ConcreteSyntax;
import pt.fct.unl.novalincs.useme.model.Utility.DSL;
import pt.fct.unl.novalincs.useme.model.Utility.ExistingGM;
import pt.fct.unl.novalincs.useme.model.Utility.UtilityPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DSL</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.Utility.impl.DSLImpl#getConcreteSyntax <em>Concrete Syntax</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.Utility.impl.DSLImpl#getAbstractSyntax <em>Abstract Syntax</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.Utility.impl.DSLImpl#getDslName <em>Dsl Name</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.Utility.impl.DSLImpl#getContextModel <em>Context Model</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.Utility.impl.DSLImpl#getGoalModel <em>Goal Model</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.Utility.impl.DSLImpl#getEvaluationModel <em>Evaluation Model</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.Utility.impl.DSLImpl#getExistingGoalModel <em>Existing Goal Model</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.Utility.impl.DSLImpl#getDocumentation <em>Documentation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DSLImpl extends MinimalEObjectImpl.Container implements DSL {
	/**
	 * The cached value of the '{@link #getConcreteSyntax() <em>Concrete Syntax</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcreteSyntax()
	 * @generated
	 * @ordered
	 */
	protected EList<ConcreteSyntax> concreteSyntax;

	/**
	 * The cached value of the '{@link #getAbstractSyntax() <em>Abstract Syntax</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstractSyntax()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractSyntax> abstractSyntax;

	/**
	 * The default value of the '{@link #getDslName() <em>Dsl Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDslName()
	 * @generated
	 * @ordered
	 */
	protected static final String DSL_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDslName() <em>Dsl Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDslName()
	 * @generated
	 * @ordered
	 */
	protected String dslName = DSL_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getContextModel() <em>Context Model</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContextModel()
	 * @generated
	 * @ordered
	 */
	protected EList<ContextModel> contextModel;

	/**
	 * The cached value of the '{@link #getGoalModel() <em>Goal Model</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGoalModel()
	 * @generated
	 * @ordered
	 */
	protected EList<GoalModel> goalModel;

	/**
	 * The cached value of the '{@link #getEvaluationModel() <em>Evaluation Model</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvaluationModel()
	 * @generated
	 * @ordered
	 */
	protected EList<EvaluationModel> evaluationModel;

	/**
	 * The cached value of the '{@link #getExistingGoalModel() <em>Existing Goal Model</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExistingGoalModel()
	 * @generated
	 * @ordered
	 */
	protected EList<ExistingGM> existingGoalModel;

	/**
	 * The cached value of the '{@link #getDocumentation() <em>Documentation</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentation()
	 * @generated
	 * @ordered
	 */
	protected EList<Documentation> documentation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DSLImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UtilityPackage.Literals.DSL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConcreteSyntax> getConcreteSyntax() {
		if (concreteSyntax == null) {
			concreteSyntax = new EObjectContainmentWithInverseEList<ConcreteSyntax>(ConcreteSyntax.class, this, UtilityPackage.DSL__CONCRETE_SYNTAX, UtilityPackage.CONCRETE_SYNTAX__DSL);
		}
		return concreteSyntax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractSyntax> getAbstractSyntax() {
		if (abstractSyntax == null) {
			abstractSyntax = new EObjectContainmentWithInverseEList<AbstractSyntax>(AbstractSyntax.class, this, UtilityPackage.DSL__ABSTRACT_SYNTAX, UtilityPackage.ABSTRACT_SYNTAX__DSL);
		}
		return abstractSyntax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDslName() {
		return dslName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDslName(String newDslName) {
		String oldDslName = dslName;
		dslName = newDslName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UtilityPackage.DSL__DSL_NAME, oldDslName, dslName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContextModel> getContextModel() {
		if (contextModel == null) {
			contextModel = new EObjectWithInverseResolvingEList<ContextModel>(ContextModel.class, this, UtilityPackage.DSL__CONTEXT_MODEL, ContextModelingPackage.CONTEXT_MODEL__LANGUAGE);
		}
		return contextModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GoalModel> getGoalModel() {
		if (goalModel == null) {
			goalModel = new EObjectResolvingEList<GoalModel>(GoalModel.class, this, UtilityPackage.DSL__GOAL_MODEL);
		}
		return goalModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EvaluationModel> getEvaluationModel() {
		if (evaluationModel == null) {
			evaluationModel = new EObjectResolvingEList<EvaluationModel>(EvaluationModel.class, this, UtilityPackage.DSL__EVALUATION_MODEL);
		}
		return evaluationModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExistingGM> getExistingGoalModel() {
		if (existingGoalModel == null) {
			existingGoalModel = new EObjectContainmentEList<ExistingGM>(ExistingGM.class, this, UtilityPackage.DSL__EXISTING_GOAL_MODEL);
		}
		return existingGoalModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Documentation> getDocumentation() {
		if (documentation == null) {
			documentation = new EObjectResolvingEList<Documentation>(Documentation.class, this, UtilityPackage.DSL__DOCUMENTATION);
		}
		return documentation;
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
			case UtilityPackage.DSL__CONCRETE_SYNTAX:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getConcreteSyntax()).basicAdd(otherEnd, msgs);
			case UtilityPackage.DSL__ABSTRACT_SYNTAX:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAbstractSyntax()).basicAdd(otherEnd, msgs);
			case UtilityPackage.DSL__CONTEXT_MODEL:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getContextModel()).basicAdd(otherEnd, msgs);
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
			case UtilityPackage.DSL__CONCRETE_SYNTAX:
				return ((InternalEList<?>)getConcreteSyntax()).basicRemove(otherEnd, msgs);
			case UtilityPackage.DSL__ABSTRACT_SYNTAX:
				return ((InternalEList<?>)getAbstractSyntax()).basicRemove(otherEnd, msgs);
			case UtilityPackage.DSL__CONTEXT_MODEL:
				return ((InternalEList<?>)getContextModel()).basicRemove(otherEnd, msgs);
			case UtilityPackage.DSL__EXISTING_GOAL_MODEL:
				return ((InternalEList<?>)getExistingGoalModel()).basicRemove(otherEnd, msgs);
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
			case UtilityPackage.DSL__CONCRETE_SYNTAX:
				return getConcreteSyntax();
			case UtilityPackage.DSL__ABSTRACT_SYNTAX:
				return getAbstractSyntax();
			case UtilityPackage.DSL__DSL_NAME:
				return getDslName();
			case UtilityPackage.DSL__CONTEXT_MODEL:
				return getContextModel();
			case UtilityPackage.DSL__GOAL_MODEL:
				return getGoalModel();
			case UtilityPackage.DSL__EVALUATION_MODEL:
				return getEvaluationModel();
			case UtilityPackage.DSL__EXISTING_GOAL_MODEL:
				return getExistingGoalModel();
			case UtilityPackage.DSL__DOCUMENTATION:
				return getDocumentation();
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
			case UtilityPackage.DSL__CONCRETE_SYNTAX:
				getConcreteSyntax().clear();
				getConcreteSyntax().addAll((Collection<? extends ConcreteSyntax>)newValue);
				return;
			case UtilityPackage.DSL__ABSTRACT_SYNTAX:
				getAbstractSyntax().clear();
				getAbstractSyntax().addAll((Collection<? extends AbstractSyntax>)newValue);
				return;
			case UtilityPackage.DSL__DSL_NAME:
				setDslName((String)newValue);
				return;
			case UtilityPackage.DSL__CONTEXT_MODEL:
				getContextModel().clear();
				getContextModel().addAll((Collection<? extends ContextModel>)newValue);
				return;
			case UtilityPackage.DSL__GOAL_MODEL:
				getGoalModel().clear();
				getGoalModel().addAll((Collection<? extends GoalModel>)newValue);
				return;
			case UtilityPackage.DSL__EVALUATION_MODEL:
				getEvaluationModel().clear();
				getEvaluationModel().addAll((Collection<? extends EvaluationModel>)newValue);
				return;
			case UtilityPackage.DSL__EXISTING_GOAL_MODEL:
				getExistingGoalModel().clear();
				getExistingGoalModel().addAll((Collection<? extends ExistingGM>)newValue);
				return;
			case UtilityPackage.DSL__DOCUMENTATION:
				getDocumentation().clear();
				getDocumentation().addAll((Collection<? extends Documentation>)newValue);
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
			case UtilityPackage.DSL__CONCRETE_SYNTAX:
				getConcreteSyntax().clear();
				return;
			case UtilityPackage.DSL__ABSTRACT_SYNTAX:
				getAbstractSyntax().clear();
				return;
			case UtilityPackage.DSL__DSL_NAME:
				setDslName(DSL_NAME_EDEFAULT);
				return;
			case UtilityPackage.DSL__CONTEXT_MODEL:
				getContextModel().clear();
				return;
			case UtilityPackage.DSL__GOAL_MODEL:
				getGoalModel().clear();
				return;
			case UtilityPackage.DSL__EVALUATION_MODEL:
				getEvaluationModel().clear();
				return;
			case UtilityPackage.DSL__EXISTING_GOAL_MODEL:
				getExistingGoalModel().clear();
				return;
			case UtilityPackage.DSL__DOCUMENTATION:
				getDocumentation().clear();
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
			case UtilityPackage.DSL__CONCRETE_SYNTAX:
				return concreteSyntax != null && !concreteSyntax.isEmpty();
			case UtilityPackage.DSL__ABSTRACT_SYNTAX:
				return abstractSyntax != null && !abstractSyntax.isEmpty();
			case UtilityPackage.DSL__DSL_NAME:
				return DSL_NAME_EDEFAULT == null ? dslName != null : !DSL_NAME_EDEFAULT.equals(dslName);
			case UtilityPackage.DSL__CONTEXT_MODEL:
				return contextModel != null && !contextModel.isEmpty();
			case UtilityPackage.DSL__GOAL_MODEL:
				return goalModel != null && !goalModel.isEmpty();
			case UtilityPackage.DSL__EVALUATION_MODEL:
				return evaluationModel != null && !evaluationModel.isEmpty();
			case UtilityPackage.DSL__EXISTING_GOAL_MODEL:
				return existingGoalModel != null && !existingGoalModel.isEmpty();
			case UtilityPackage.DSL__DOCUMENTATION:
				return documentation != null && !documentation.isEmpty();
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
		result.append(" (dslName: ");
		result.append(dslName);
		result.append(')');
		return result.toString();
	}

} //DSLImpl
