/**
 */
package pt.fct.unl.novalincs.useme.model.InteractionModeling.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import pt.fct.unl.novalincs.useme.model.EvaluationModeling.TestModel;

import pt.fct.unl.novalincs.useme.model.InteractionModeling.*;

import pt.fct.unl.novalincs.useme.model.ReportModeling.EvaluationResultAbstract;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see pt.fct.unl.novalincs.useme.model.InteractionModeling.InteractionModelingPackage
 * @generated
 */
public class InteractionModelingAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static InteractionModelingPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionModelingAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = InteractionModelingPackage.eINSTANCE;
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
	protected InteractionModelingSwitch<Adapter> modelSwitch =
		new InteractionModelingSwitch<Adapter>() {
			@Override
			public Adapter caseInteractionSpecification(InteractionSpecification object) {
				return createInteractionSpecificationAdapter();
			}
			@Override
			public Adapter caseInteractionModel(InteractionModel object) {
				return createInteractionModelAdapter();
			}
			@Override
			public Adapter caseInteractionSyntax(InteractionSyntax object) {
				return createInteractionSyntaxAdapter();
			}
			@Override
			public Adapter caseTask(Task object) {
				return createTaskAdapter();
			}
			@Override
			public Adapter caseEvent(Event object) {
				return createEventAdapter();
			}
			@Override
			public Adapter caseInteractionResult(InteractionResult object) {
				return createInteractionResultAdapter();
			}
			@Override
			public Adapter caseCaptureAction(CaptureAction object) {
				return createCaptureActionAdapter();
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
	 * Creates a new adapter for an object of class '{@link pt.fct.unl.novalincs.useme.model.InteractionModeling.InteractionSpecification <em>Interaction Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pt.fct.unl.novalincs.useme.model.InteractionModeling.InteractionSpecification
	 * @generated
	 */
	public Adapter createInteractionSpecificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pt.fct.unl.novalincs.useme.model.InteractionModeling.InteractionModel <em>Interaction Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pt.fct.unl.novalincs.useme.model.InteractionModeling.InteractionModel
	 * @generated
	 */
	public Adapter createInteractionModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pt.fct.unl.novalincs.useme.model.InteractionModeling.InteractionSyntax <em>Interaction Syntax</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pt.fct.unl.novalincs.useme.model.InteractionModeling.InteractionSyntax
	 * @generated
	 */
	public Adapter createInteractionSyntaxAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pt.fct.unl.novalincs.useme.model.InteractionModeling.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pt.fct.unl.novalincs.useme.model.InteractionModeling.Task
	 * @generated
	 */
	public Adapter createTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pt.fct.unl.novalincs.useme.model.InteractionModeling.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pt.fct.unl.novalincs.useme.model.InteractionModeling.Event
	 * @generated
	 */
	public Adapter createEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pt.fct.unl.novalincs.useme.model.InteractionModeling.InteractionResult <em>Interaction Result</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pt.fct.unl.novalincs.useme.model.InteractionModeling.InteractionResult
	 * @generated
	 */
	public Adapter createInteractionResultAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pt.fct.unl.novalincs.useme.model.InteractionModeling.CaptureAction <em>Capture Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pt.fct.unl.novalincs.useme.model.InteractionModeling.CaptureAction
	 * @generated
	 */
	public Adapter createCaptureActionAdapter() {
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

} //InteractionModelingAdapterFactory
