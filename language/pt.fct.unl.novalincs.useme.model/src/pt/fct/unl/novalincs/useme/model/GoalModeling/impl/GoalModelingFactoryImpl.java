/**
 */
package pt.fct.unl.novalincs.useme.model.GoalModeling.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import pt.fct.unl.novalincs.useme.model.GoalModeling.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GoalModelingFactoryImpl extends EFactoryImpl implements GoalModelingFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GoalModelingFactory init() {
		try {
			GoalModelingFactory theGoalModelingFactory = (GoalModelingFactory)EPackage.Registry.INSTANCE.getEFactory(GoalModelingPackage.eNS_URI);
			if (theGoalModelingFactory != null) {
				return theGoalModelingFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new GoalModelingFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GoalModelingFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case GoalModelingPackage.GOAL_SPECIFICATION: return createGoalSpecification();
			case GoalModelingPackage.GOAL_MODEL: return createGoalModel();
			case GoalModelingPackage.USABILITY_GOAL: return createUsabilityGoal();
			case GoalModelingPackage.ACTOR: return createActor();
			case GoalModelingPackage.SCOPE: return createScope();
			case GoalModelingPackage.METHOD: return createMethod();
			case GoalModelingPackage.SUCCESS_COVERAGE: return createSuccessCoverage();
			case GoalModelingPackage.USABILITY_REQUIREMENT: return createUsabilityRequirement();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GoalSpecification createGoalSpecification() {
		GoalSpecificationImpl goalSpecification = new GoalSpecificationImpl();
		return goalSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GoalModel createGoalModel() {
		GoalModelImpl goalModel = new GoalModelImpl();
		return goalModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UsabilityGoal createUsabilityGoal() {
		UsabilityGoalImpl usabilityGoal = new UsabilityGoalImpl();
		return usabilityGoal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Actor createActor() {
		ActorImpl actor = new ActorImpl();
		return actor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Scope createScope() {
		ScopeImpl scope = new ScopeImpl();
		return scope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Method createMethod() {
		MethodImpl method = new MethodImpl();
		return method;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SuccessCoverage createSuccessCoverage() {
		SuccessCoverageImpl successCoverage = new SuccessCoverageImpl();
		return successCoverage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UsabilityRequirement createUsabilityRequirement() {
		UsabilityRequirementImpl usabilityRequirement = new UsabilityRequirementImpl();
		return usabilityRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GoalModelingPackage getGoalModelingPackage() {
		return (GoalModelingPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static GoalModelingPackage getPackage() {
		return GoalModelingPackage.eINSTANCE;
	}

} //GoalModelingFactoryImpl
