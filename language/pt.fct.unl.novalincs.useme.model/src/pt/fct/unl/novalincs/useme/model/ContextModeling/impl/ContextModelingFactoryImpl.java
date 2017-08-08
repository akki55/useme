/**
 */
package pt.fct.unl.novalincs.useme.model.ContextModeling.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import pt.fct.unl.novalincs.useme.model.ContextModeling.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ContextModelingFactoryImpl extends EFactoryImpl implements ContextModelingFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ContextModelingFactory init() {
		try {
			ContextModelingFactory theContextModelingFactory = (ContextModelingFactory)EPackage.Registry.INSTANCE.getEFactory(ContextModelingPackage.eNS_URI);
			if (theContextModelingFactory != null) {
				return theContextModelingFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ContextModelingFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContextModelingFactoryImpl() {
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
			case ContextModelingPackage.CONTEXT_SPECIFICATION: return createContextSpecification();
			case ContextModelingPackage.USER_PROFILE_SPECIFICATION: return createUserProfileSpecification();
			case ContextModelingPackage.WORKFLOW_SPECIFICATION: return createWorkflowSpecification();
			case ContextModelingPackage.ENVIROMENT_SPECIFICATION: return createEnviromentSpecification();
			case ContextModelingPackage.CONTEXT_MODEL: return createContextModel();
			case ContextModelingPackage.TECHNICAL_ENVIRONMENT: return createTechnicalEnvironment();
			case ContextModelingPackage.PHYSICAL_ENVIRONMENT: return createPhysicalEnvironment();
			case ContextModelingPackage.SOCIAL_ENVIRONMENT: return createSocialEnvironment();
			case ContextModelingPackage.WORKFLOW: return createWorkflow();
			case ContextModelingPackage.CONTEXT_ENVIRONMENT: return createContextEnvironment();
			case ContextModelingPackage.USER_PROFILE: return createUserProfile();
			case ContextModelingPackage.SCENARIO: return createScenario();
			case ContextModelingPackage.USER_HIERARCHY: return createUserHierarchy();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContextSpecification createContextSpecification() {
		ContextSpecificationImpl contextSpecification = new ContextSpecificationImpl();
		return contextSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserProfileSpecification createUserProfileSpecification() {
		UserProfileSpecificationImpl userProfileSpecification = new UserProfileSpecificationImpl();
		return userProfileSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkflowSpecification createWorkflowSpecification() {
		WorkflowSpecificationImpl workflowSpecification = new WorkflowSpecificationImpl();
		return workflowSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnviromentSpecification createEnviromentSpecification() {
		EnviromentSpecificationImpl enviromentSpecification = new EnviromentSpecificationImpl();
		return enviromentSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContextModel createContextModel() {
		ContextModelImpl contextModel = new ContextModelImpl();
		return contextModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TechnicalEnvironment createTechnicalEnvironment() {
		TechnicalEnvironmentImpl technicalEnvironment = new TechnicalEnvironmentImpl();
		return technicalEnvironment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalEnvironment createPhysicalEnvironment() {
		PhysicalEnvironmentImpl physicalEnvironment = new PhysicalEnvironmentImpl();
		return physicalEnvironment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SocialEnvironment createSocialEnvironment() {
		SocialEnvironmentImpl socialEnvironment = new SocialEnvironmentImpl();
		return socialEnvironment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Workflow createWorkflow() {
		WorkflowImpl workflow = new WorkflowImpl();
		return workflow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContextEnvironment createContextEnvironment() {
		ContextEnvironmentImpl contextEnvironment = new ContextEnvironmentImpl();
		return contextEnvironment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserProfile createUserProfile() {
		UserProfileImpl userProfile = new UserProfileImpl();
		return userProfile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Scenario createScenario() {
		ScenarioImpl scenario = new ScenarioImpl();
		return scenario;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserHierarchy createUserHierarchy() {
		UserHierarchyImpl userHierarchy = new UserHierarchyImpl();
		return userHierarchy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContextModelingPackage getContextModelingPackage() {
		return (ContextModelingPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ContextModelingPackage getPackage() {
		return ContextModelingPackage.eINSTANCE;
	}

} //ContextModelingFactoryImpl
