/**
 */
package pt.fct.unl.novalincs.useme.model.SurveyModeling.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import pt.fct.unl.novalincs.useme.model.EvaluationModeling.TestModel;

import pt.fct.unl.novalincs.useme.model.ReportModeling.EvaluationResultAbstract;

import pt.fct.unl.novalincs.useme.model.SurveyModeling.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see pt.fct.unl.novalincs.useme.model.SurveyModeling.SurveyModelingPackage
 * @generated
 */
public class SurveyModelingAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SurveyModelingPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SurveyModelingAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = SurveyModelingPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SurveyModelingSwitch<Adapter> modelSwitch =
		new SurveyModelingSwitch<Adapter>() {
			@Override
			public Adapter caseSurveySpecification(SurveySpecification object) {
				return createSurveySpecificationAdapter();
			}
			@Override
			public Adapter caseSurveyModel(SurveyModel object) {
				return createSurveyModelAdapter();
			}
			@Override
			public Adapter caseQuestion(Question object) {
				return createQuestionAdapter();
			}
			@Override
			public Adapter caseSurveyResult(SurveyResult object) {
				return createSurveyResultAdapter();
			}
			@Override
			public Adapter caseBackgroundQs(BackgroundQs object) {
				return createBackgroundQsAdapter();
			}
			@Override
			public Adapter caseFeedbackQs(FeedbackQs object) {
				return createFeedbackQsAdapter();
			}
			@Override
			public Adapter caseQuestionnaire(Questionnaire object) {
				return createQuestionnaireAdapter();
			}
			@Override
			public Adapter caseTestModel(TestModel object) {
				return createTestModelAdapter();
			}
			@Override
			public Adapter caseEvaluationResultAbstract(EvaluationResultAbstract object) {
				return createEvaluationResultAbstractAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link pt.fct.unl.novalincs.useme.model.SurveyModeling.SurveySpecification <em>Survey Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pt.fct.unl.novalincs.useme.model.SurveyModeling.SurveySpecification
	 * @generated
	 */
	public Adapter createSurveySpecificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pt.fct.unl.novalincs.useme.model.SurveyModeling.SurveyModel <em>Survey Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pt.fct.unl.novalincs.useme.model.SurveyModeling.SurveyModel
	 * @generated
	 */
	public Adapter createSurveyModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pt.fct.unl.novalincs.useme.model.SurveyModeling.Question <em>Question</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pt.fct.unl.novalincs.useme.model.SurveyModeling.Question
	 * @generated
	 */
	public Adapter createQuestionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pt.fct.unl.novalincs.useme.model.SurveyModeling.SurveyResult <em>Survey Result</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pt.fct.unl.novalincs.useme.model.SurveyModeling.SurveyResult
	 * @generated
	 */
	public Adapter createSurveyResultAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pt.fct.unl.novalincs.useme.model.SurveyModeling.BackgroundQs <em>Background Qs</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pt.fct.unl.novalincs.useme.model.SurveyModeling.BackgroundQs
	 * @generated
	 */
	public Adapter createBackgroundQsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pt.fct.unl.novalincs.useme.model.SurveyModeling.FeedbackQs <em>Feedback Qs</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pt.fct.unl.novalincs.useme.model.SurveyModeling.FeedbackQs
	 * @generated
	 */
	public Adapter createFeedbackQsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pt.fct.unl.novalincs.useme.model.SurveyModeling.Questionnaire <em>Questionnaire</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pt.fct.unl.novalincs.useme.model.SurveyModeling.Questionnaire
	 * @generated
	 */
	public Adapter createQuestionnaireAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pt.fct.unl.novalincs.useme.model.EvaluationModeling.TestModel <em>Test Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pt.fct.unl.novalincs.useme.model.EvaluationModeling.TestModel
	 * @generated
	 */
	public Adapter createTestModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pt.fct.unl.novalincs.useme.model.ReportModeling.EvaluationResultAbstract <em>Evaluation Result Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pt.fct.unl.novalincs.useme.model.ReportModeling.EvaluationResultAbstract
	 * @generated
	 */
	public Adapter createEvaluationResultAbstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //SurveyModelingAdapterFactory
