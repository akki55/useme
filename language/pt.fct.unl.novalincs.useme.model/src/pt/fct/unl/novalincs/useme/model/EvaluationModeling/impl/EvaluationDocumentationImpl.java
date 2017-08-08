/**
 */
package pt.fct.unl.novalincs.useme.model.EvaluationModeling.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import pt.fct.unl.novalincs.useme.model.ContextModeling.Scenario;

import pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationDocumentation;
import pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationModel;
import pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationModelingPackage;

import pt.fct.unl.novalincs.useme.model.Utility.Documentation;

import pt.fct.unl.novalincs.useme.model.Utility.impl.DocumentationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Evaluation Documentation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.EvaluationModeling.impl.EvaluationDocumentationImpl#getEvaluationModel <em>Evaluation Model</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.EvaluationModeling.impl.EvaluationDocumentationImpl#getScenario <em>Scenario</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.EvaluationModeling.impl.EvaluationDocumentationImpl#getRelatedDocumentation <em>Related Documentation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EvaluationDocumentationImpl extends DocumentationImpl implements EvaluationDocumentation {
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
	 * The cached value of the '{@link #getRelatedDocumentation() <em>Related Documentation</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedDocumentation()
	 * @generated
	 * @ordered
	 */
	protected EList<Documentation> relatedDocumentation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EvaluationDocumentationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EvaluationModelingPackage.Literals.EVALUATION_DOCUMENTATION;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EvaluationModelingPackage.EVALUATION_DOCUMENTATION__EVALUATION_MODEL, oldEvaluationModel, evaluationModel));
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
	public void setEvaluationModel(EvaluationModel newEvaluationModel) {
		EvaluationModel oldEvaluationModel = evaluationModel;
		evaluationModel = newEvaluationModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EvaluationModelingPackage.EVALUATION_DOCUMENTATION__EVALUATION_MODEL, oldEvaluationModel, evaluationModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Scenario> getScenario() {
		if (scenario == null) {
			scenario = new EObjectResolvingEList<Scenario>(Scenario.class, this, EvaluationModelingPackage.EVALUATION_DOCUMENTATION__SCENARIO);
		}
		return scenario;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Documentation> getRelatedDocumentation() {
		if (relatedDocumentation == null) {
			relatedDocumentation = new EObjectResolvingEList<Documentation>(Documentation.class, this, EvaluationModelingPackage.EVALUATION_DOCUMENTATION__RELATED_DOCUMENTATION);
		}
		return relatedDocumentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EvaluationModelingPackage.EVALUATION_DOCUMENTATION__EVALUATION_MODEL:
				if (resolve) return getEvaluationModel();
				return basicGetEvaluationModel();
			case EvaluationModelingPackage.EVALUATION_DOCUMENTATION__SCENARIO:
				return getScenario();
			case EvaluationModelingPackage.EVALUATION_DOCUMENTATION__RELATED_DOCUMENTATION:
				return getRelatedDocumentation();
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
			case EvaluationModelingPackage.EVALUATION_DOCUMENTATION__EVALUATION_MODEL:
				setEvaluationModel((EvaluationModel)newValue);
				return;
			case EvaluationModelingPackage.EVALUATION_DOCUMENTATION__SCENARIO:
				getScenario().clear();
				getScenario().addAll((Collection<? extends Scenario>)newValue);
				return;
			case EvaluationModelingPackage.EVALUATION_DOCUMENTATION__RELATED_DOCUMENTATION:
				getRelatedDocumentation().clear();
				getRelatedDocumentation().addAll((Collection<? extends Documentation>)newValue);
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
			case EvaluationModelingPackage.EVALUATION_DOCUMENTATION__EVALUATION_MODEL:
				setEvaluationModel((EvaluationModel)null);
				return;
			case EvaluationModelingPackage.EVALUATION_DOCUMENTATION__SCENARIO:
				getScenario().clear();
				return;
			case EvaluationModelingPackage.EVALUATION_DOCUMENTATION__RELATED_DOCUMENTATION:
				getRelatedDocumentation().clear();
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
			case EvaluationModelingPackage.EVALUATION_DOCUMENTATION__EVALUATION_MODEL:
				return evaluationModel != null;
			case EvaluationModelingPackage.EVALUATION_DOCUMENTATION__SCENARIO:
				return scenario != null && !scenario.isEmpty();
			case EvaluationModelingPackage.EVALUATION_DOCUMENTATION__RELATED_DOCUMENTATION:
				return relatedDocumentation != null && !relatedDocumentation.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EvaluationDocumentationImpl
