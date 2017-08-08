/**
 */
package pt.fct.unl.novalincs.useme.model.ContextModeling.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import pt.fct.unl.novalincs.useme.model.ContextModeling.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see pt.fct.unl.novalincs.useme.model.ContextModeling.ContextModelingPackage
 * @generated
 */
public class ContextModelingAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ContextModelingPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContextModelingAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ContextModelingPackage.eINSTANCE;
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
	protected ContextModelingSwitch<Adapter> modelSwitch =
		new ContextModelingSwitch<Adapter>() {
			@Override
			public Adapter caseContextSpecification(ContextSpecification object) {
				return createContextSpecificationAdapter();
			}
			@Override
			public Adapter caseUserProfileSpecification(UserProfileSpecification object) {
				return createUserProfileSpecificationAdapter();
			}
			@Override
			public Adapter caseWorkflowSpecification(WorkflowSpecification object) {
				return createWorkflowSpecificationAdapter();
			}
			@Override
			public Adapter caseEnviromentSpecification(EnviromentSpecification object) {
				return createEnviromentSpecificationAdapter();
			}
			@Override
			public Adapter caseContextModel(ContextModel object) {
				return createContextModelAdapter();
			}
			@Override
			public Adapter caseTechnicalEnvironment(TechnicalEnvironment object) {
				return createTechnicalEnvironmentAdapter();
			}
			@Override
			public Adapter casePhysicalEnvironment(PhysicalEnvironment object) {
				return createPhysicalEnvironmentAdapter();
			}
			@Override
			public Adapter caseSocialEnvironment(SocialEnvironment object) {
				return createSocialEnvironmentAdapter();
			}
			@Override
			public Adapter caseWorkflow(Workflow object) {
				return createWorkflowAdapter();
			}
			@Override
			public Adapter caseContextEnvironment(ContextEnvironment object) {
				return createContextEnvironmentAdapter();
			}
			@Override
			public Adapter caseUserProfile(UserProfile object) {
				return createUserProfileAdapter();
			}
			@Override
			public Adapter caseScenario(Scenario object) {
				return createScenarioAdapter();
			}
			@Override
			public Adapter caseUserHierarchy(UserHierarchy object) {
				return createUserHierarchyAdapter();
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
	 * Creates a new adapter for an object of class '{@link pt.fct.unl.novalincs.useme.model.ContextModeling.ContextSpecification <em>Context Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pt.fct.unl.novalincs.useme.model.ContextModeling.ContextSpecification
	 * @generated
	 */
	public Adapter createContextSpecificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pt.fct.unl.novalincs.useme.model.ContextModeling.UserProfileSpecification <em>User Profile Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pt.fct.unl.novalincs.useme.model.ContextModeling.UserProfileSpecification
	 * @generated
	 */
	public Adapter createUserProfileSpecificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pt.fct.unl.novalincs.useme.model.ContextModeling.WorkflowSpecification <em>Workflow Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pt.fct.unl.novalincs.useme.model.ContextModeling.WorkflowSpecification
	 * @generated
	 */
	public Adapter createWorkflowSpecificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pt.fct.unl.novalincs.useme.model.ContextModeling.EnviromentSpecification <em>Enviroment Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pt.fct.unl.novalincs.useme.model.ContextModeling.EnviromentSpecification
	 * @generated
	 */
	public Adapter createEnviromentSpecificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pt.fct.unl.novalincs.useme.model.ContextModeling.ContextModel <em>Context Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pt.fct.unl.novalincs.useme.model.ContextModeling.ContextModel
	 * @generated
	 */
	public Adapter createContextModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pt.fct.unl.novalincs.useme.model.ContextModeling.TechnicalEnvironment <em>Technical Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pt.fct.unl.novalincs.useme.model.ContextModeling.TechnicalEnvironment
	 * @generated
	 */
	public Adapter createTechnicalEnvironmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pt.fct.unl.novalincs.useme.model.ContextModeling.PhysicalEnvironment <em>Physical Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pt.fct.unl.novalincs.useme.model.ContextModeling.PhysicalEnvironment
	 * @generated
	 */
	public Adapter createPhysicalEnvironmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pt.fct.unl.novalincs.useme.model.ContextModeling.SocialEnvironment <em>Social Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pt.fct.unl.novalincs.useme.model.ContextModeling.SocialEnvironment
	 * @generated
	 */
	public Adapter createSocialEnvironmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pt.fct.unl.novalincs.useme.model.ContextModeling.Workflow <em>Workflow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pt.fct.unl.novalincs.useme.model.ContextModeling.Workflow
	 * @generated
	 */
	public Adapter createWorkflowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pt.fct.unl.novalincs.useme.model.ContextModeling.ContextEnvironment <em>Context Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pt.fct.unl.novalincs.useme.model.ContextModeling.ContextEnvironment
	 * @generated
	 */
	public Adapter createContextEnvironmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pt.fct.unl.novalincs.useme.model.ContextModeling.UserProfile <em>User Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pt.fct.unl.novalincs.useme.model.ContextModeling.UserProfile
	 * @generated
	 */
	public Adapter createUserProfileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pt.fct.unl.novalincs.useme.model.ContextModeling.Scenario <em>Scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pt.fct.unl.novalincs.useme.model.ContextModeling.Scenario
	 * @generated
	 */
	public Adapter createScenarioAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pt.fct.unl.novalincs.useme.model.ContextModeling.UserHierarchy <em>User Hierarchy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pt.fct.unl.novalincs.useme.model.ContextModeling.UserHierarchy
	 * @generated
	 */
	public Adapter createUserHierarchyAdapter() {
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

} //ContextModelingAdapterFactory
