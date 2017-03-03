/**
 */
package pt.fct.unl.novalincs.useme.model.GoalModeling.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import pt.fct.unl.novalincs.useme.model.GoalModeling.*;
import pt.fct.unl.novalincs.useme.model.Utility.Requirement;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see pt.fct.unl.novalincs.useme.model.GoalModeling.GoalModelingPackage
 * @generated
 */
public class GoalModelingAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static GoalModelingPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GoalModelingAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = GoalModelingPackage.eINSTANCE;
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
	protected GoalModelingSwitch<Adapter> modelSwitch =
		new GoalModelingSwitch<Adapter>() {
			@Override
			public Adapter caseGoalSpecification(GoalSpecification object) {
				return createGoalSpecificationAdapter();
			}
			@Override
			public Adapter caseGoalModel(GoalModel object) {
				return createGoalModelAdapter();
			}
			@Override
			public Adapter caseUsabilityGoal(UsabilityGoal object) {
				return createUsabilityGoalAdapter();
			}
			@Override
			public Adapter caseActor(Actor object) {
				return createActorAdapter();
			}
			@Override
			public Adapter caseScope(Scope object) {
				return createScopeAdapter();
			}
			@Override
			public Adapter caseMethod(Method object) {
				return createMethodAdapter();
			}
			@Override
			public Adapter caseSuccessCoverage(SuccessCoverage object) {
				return createSuccessCoverageAdapter();
			}
			@Override
			public Adapter caseUsabilityRequirement(UsabilityRequirement object) {
				return createUsabilityRequirementAdapter();
			}
			@Override
			public Adapter caseRequirement(Requirement object) {
				return createRequirementAdapter();
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
	 * Creates a new adapter for an object of class '{@link pt.fct.unl.novalincs.useme.model.GoalModeling.GoalSpecification <em>Goal Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pt.fct.unl.novalincs.useme.model.GoalModeling.GoalSpecification
	 * @generated
	 */
	public Adapter createGoalSpecificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pt.fct.unl.novalincs.useme.model.GoalModeling.GoalModel <em>Goal Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pt.fct.unl.novalincs.useme.model.GoalModeling.GoalModel
	 * @generated
	 */
	public Adapter createGoalModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pt.fct.unl.novalincs.useme.model.GoalModeling.UsabilityGoal <em>Usability Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pt.fct.unl.novalincs.useme.model.GoalModeling.UsabilityGoal
	 * @generated
	 */
	public Adapter createUsabilityGoalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pt.fct.unl.novalincs.useme.model.GoalModeling.Actor <em>Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pt.fct.unl.novalincs.useme.model.GoalModeling.Actor
	 * @generated
	 */
	public Adapter createActorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pt.fct.unl.novalincs.useme.model.GoalModeling.Scope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pt.fct.unl.novalincs.useme.model.GoalModeling.Scope
	 * @generated
	 */
	public Adapter createScopeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pt.fct.unl.novalincs.useme.model.GoalModeling.Method <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pt.fct.unl.novalincs.useme.model.GoalModeling.Method
	 * @generated
	 */
	public Adapter createMethodAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pt.fct.unl.novalincs.useme.model.GoalModeling.SuccessCoverage <em>Success Coverage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pt.fct.unl.novalincs.useme.model.GoalModeling.SuccessCoverage
	 * @generated
	 */
	public Adapter createSuccessCoverageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pt.fct.unl.novalincs.useme.model.GoalModeling.UsabilityRequirement <em>Usability Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pt.fct.unl.novalincs.useme.model.GoalModeling.UsabilityRequirement
	 * @generated
	 */
	public Adapter createUsabilityRequirementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pt.fct.unl.novalincs.useme.model.Utility.Requirement <em>Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pt.fct.unl.novalincs.useme.model.Utility.Requirement
	 * @generated
	 */
	public Adapter createRequirementAdapter() {
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

} //GoalModelingAdapterFactory
