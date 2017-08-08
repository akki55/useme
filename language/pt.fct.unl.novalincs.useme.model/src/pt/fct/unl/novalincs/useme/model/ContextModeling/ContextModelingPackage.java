/**
 */
package pt.fct.unl.novalincs.useme.model.ContextModeling;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see pt.fct.unl.novalincs.useme.model.ContextModeling.ContextModelingFactory
 * @model kind="package"
 * @generated
 */
public interface ContextModelingPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ContextModeling";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://nova-lincs.di.fct.unl.pt/useme.contextmodeling";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "useme.contextmodeling";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ContextModelingPackage eINSTANCE = pt.fct.unl.novalincs.useme.model.ContextModeling.impl.ContextModelingPackageImpl.init();

	/**
	 * The meta object id for the '{@link pt.fct.unl.novalincs.useme.model.ContextModeling.impl.ContextSpecificationImpl <em>Context Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pt.fct.unl.novalincs.useme.model.ContextModeling.impl.ContextSpecificationImpl
	 * @see pt.fct.unl.novalincs.useme.model.ContextModeling.impl.ContextModelingPackageImpl#getContextSpecification()
	 * @generated
	 */
	int CONTEXT_SPECIFICATION = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_SPECIFICATION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Context Model</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_SPECIFICATION__CONTEXT_MODEL = 1;

	/**
	 * The feature id for the '<em><b>User Profile Specification</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_SPECIFICATION__USER_PROFILE_SPECIFICATION = 2;

	/**
	 * The feature id for the '<em><b>Enviroment Specification</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_SPECIFICATION__ENVIROMENT_SPECIFICATION = 3;

	/**
	 * The feature id for the '<em><b>Workflow Specification</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_SPECIFICATION__WORKFLOW_SPECIFICATION = 4;

	/**
	 * The number of structural features of the '<em>Context Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_SPECIFICATION_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Context Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_SPECIFICATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pt.fct.unl.novalincs.useme.model.ContextModeling.impl.UserProfileSpecificationImpl <em>User Profile Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pt.fct.unl.novalincs.useme.model.ContextModeling.impl.UserProfileSpecificationImpl
	 * @see pt.fct.unl.novalincs.useme.model.ContextModeling.impl.ContextModelingPackageImpl#getUserProfileSpecification()
	 * @generated
	 */
	int USER_PROFILE_SPECIFICATION = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_PROFILE_SPECIFICATION__NAME = 0;

	/**
	 * The feature id for the '<em><b>User Profile</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_PROFILE_SPECIFICATION__USER_PROFILE = 1;

	/**
	 * The feature id for the '<em><b>Profile Template</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_PROFILE_SPECIFICATION__PROFILE_TEMPLATE = 2;

	/**
	 * The feature id for the '<em><b>Logical Expression</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_PROFILE_SPECIFICATION__LOGICAL_EXPRESSION = 3;

	/**
	 * The number of structural features of the '<em>User Profile Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_PROFILE_SPECIFICATION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>User Profile Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_PROFILE_SPECIFICATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pt.fct.unl.novalincs.useme.model.ContextModeling.impl.WorkflowSpecificationImpl <em>Workflow Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pt.fct.unl.novalincs.useme.model.ContextModeling.impl.WorkflowSpecificationImpl
	 * @see pt.fct.unl.novalincs.useme.model.ContextModeling.impl.ContextModelingPackageImpl#getWorkflowSpecification()
	 * @generated
	 */
	int WORKFLOW_SPECIFICATION = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_SPECIFICATION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Workflow</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_SPECIFICATION__WORKFLOW = 1;

	/**
	 * The feature id for the '<em><b>Scenario</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_SPECIFICATION__SCENARIO = 2;

	/**
	 * The feature id for the '<em><b>Task</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_SPECIFICATION__TASK = 3;

	/**
	 * The number of structural features of the '<em>Workflow Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_SPECIFICATION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Workflow Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_SPECIFICATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pt.fct.unl.novalincs.useme.model.ContextModeling.impl.EnviromentSpecificationImpl <em>Enviroment Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pt.fct.unl.novalincs.useme.model.ContextModeling.impl.EnviromentSpecificationImpl
	 * @see pt.fct.unl.novalincs.useme.model.ContextModeling.impl.ContextModelingPackageImpl#getEnviromentSpecification()
	 * @generated
	 */
	int ENVIROMENT_SPECIFICATION = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIROMENT_SPECIFICATION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Technical Environment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIROMENT_SPECIFICATION__TECHNICAL_ENVIRONMENT = 1;

	/**
	 * The feature id for the '<em><b>Physical Environment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIROMENT_SPECIFICATION__PHYSICAL_ENVIRONMENT = 2;

	/**
	 * The feature id for the '<em><b>Social Environment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIROMENT_SPECIFICATION__SOCIAL_ENVIRONMENT = 3;

	/**
	 * The feature id for the '<em><b>Enviromental Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIROMENT_SPECIFICATION__ENVIROMENTAL_VARIABLE = 4;

	/**
	 * The number of structural features of the '<em>Enviroment Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIROMENT_SPECIFICATION_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Enviroment Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIROMENT_SPECIFICATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pt.fct.unl.novalincs.useme.model.ContextModeling.impl.ContextModelImpl <em>Context Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pt.fct.unl.novalincs.useme.model.ContextModeling.impl.ContextModelImpl
	 * @see pt.fct.unl.novalincs.useme.model.ContextModeling.impl.ContextModelingPackageImpl#getContextModel()
	 * @generated
	 */
	int CONTEXT_MODEL = 4;

	/**
	 * The feature id for the '<em><b>Cm Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_MODEL__CM_NAME = 0;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_MODEL__DOMAIN = 1;

	/**
	 * The feature id for the '<em><b>Context Environment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_MODEL__CONTEXT_ENVIRONMENT = 2;

	/**
	 * The feature id for the '<em><b>Language</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_MODEL__LANGUAGE = 3;

	/**
	 * The feature id for the '<em><b>Workflow</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_MODEL__WORKFLOW = 4;

	/**
	 * The feature id for the '<em><b>User Hierarchy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_MODEL__USER_HIERARCHY = 5;

	/**
	 * The feature id for the '<em><b>Context Provider</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_MODEL__CONTEXT_PROVIDER = 6;

	/**
	 * The number of structural features of the '<em>Context Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_MODEL_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Context Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pt.fct.unl.novalincs.useme.model.ContextModeling.impl.ContextEnvironmentImpl <em>Context Environment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pt.fct.unl.novalincs.useme.model.ContextModeling.impl.ContextEnvironmentImpl
	 * @see pt.fct.unl.novalincs.useme.model.ContextModeling.impl.ContextModelingPackageImpl#getContextEnvironment()
	 * @generated
	 */
	int CONTEXT_ENVIRONMENT = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_ENVIRONMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Context Model</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_ENVIRONMENT__CONTEXT_MODEL = 1;

	/**
	 * The feature id for the '<em><b>Ce Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_ENVIRONMENT__CE_ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>Outside Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_ENVIRONMENT__OUTSIDE_REF = 3;

	/**
	 * The number of structural features of the '<em>Context Environment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_ENVIRONMENT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Context Environment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_ENVIRONMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pt.fct.unl.novalincs.useme.model.ContextModeling.impl.TechnicalEnvironmentImpl <em>Technical Environment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pt.fct.unl.novalincs.useme.model.ContextModeling.impl.TechnicalEnvironmentImpl
	 * @see pt.fct.unl.novalincs.useme.model.ContextModeling.impl.ContextModelingPackageImpl#getTechnicalEnvironment()
	 * @generated
	 */
	int TECHNICAL_ENVIRONMENT = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNICAL_ENVIRONMENT__NAME = CONTEXT_ENVIRONMENT__NAME;

	/**
	 * The feature id for the '<em><b>Context Model</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNICAL_ENVIRONMENT__CONTEXT_MODEL = CONTEXT_ENVIRONMENT__CONTEXT_MODEL;

	/**
	 * The feature id for the '<em><b>Ce Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNICAL_ENVIRONMENT__CE_ELEMENT = CONTEXT_ENVIRONMENT__CE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Outside Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNICAL_ENVIRONMENT__OUTSIDE_REF = CONTEXT_ENVIRONMENT__OUTSIDE_REF;

	/**
	 * The number of structural features of the '<em>Technical Environment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNICAL_ENVIRONMENT_FEATURE_COUNT = CONTEXT_ENVIRONMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Technical Environment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNICAL_ENVIRONMENT_OPERATION_COUNT = CONTEXT_ENVIRONMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pt.fct.unl.novalincs.useme.model.ContextModeling.impl.PhysicalEnvironmentImpl <em>Physical Environment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pt.fct.unl.novalincs.useme.model.ContextModeling.impl.PhysicalEnvironmentImpl
	 * @see pt.fct.unl.novalincs.useme.model.ContextModeling.impl.ContextModelingPackageImpl#getPhysicalEnvironment()
	 * @generated
	 */
	int PHYSICAL_ENVIRONMENT = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_ENVIRONMENT__NAME = CONTEXT_ENVIRONMENT__NAME;

	/**
	 * The feature id for the '<em><b>Context Model</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_ENVIRONMENT__CONTEXT_MODEL = CONTEXT_ENVIRONMENT__CONTEXT_MODEL;

	/**
	 * The feature id for the '<em><b>Ce Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_ENVIRONMENT__CE_ELEMENT = CONTEXT_ENVIRONMENT__CE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Outside Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_ENVIRONMENT__OUTSIDE_REF = CONTEXT_ENVIRONMENT__OUTSIDE_REF;

	/**
	 * The number of structural features of the '<em>Physical Environment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_ENVIRONMENT_FEATURE_COUNT = CONTEXT_ENVIRONMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Physical Environment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_ENVIRONMENT_OPERATION_COUNT = CONTEXT_ENVIRONMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pt.fct.unl.novalincs.useme.model.ContextModeling.impl.SocialEnvironmentImpl <em>Social Environment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pt.fct.unl.novalincs.useme.model.ContextModeling.impl.SocialEnvironmentImpl
	 * @see pt.fct.unl.novalincs.useme.model.ContextModeling.impl.ContextModelingPackageImpl#getSocialEnvironment()
	 * @generated
	 */
	int SOCIAL_ENVIRONMENT = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_ENVIRONMENT__NAME = CONTEXT_ENVIRONMENT__NAME;

	/**
	 * The feature id for the '<em><b>Context Model</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_ENVIRONMENT__CONTEXT_MODEL = CONTEXT_ENVIRONMENT__CONTEXT_MODEL;

	/**
	 * The feature id for the '<em><b>Ce Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_ENVIRONMENT__CE_ELEMENT = CONTEXT_ENVIRONMENT__CE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Outside Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_ENVIRONMENT__OUTSIDE_REF = CONTEXT_ENVIRONMENT__OUTSIDE_REF;

	/**
	 * The number of structural features of the '<em>Social Environment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_ENVIRONMENT_FEATURE_COUNT = CONTEXT_ENVIRONMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Social Environment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_ENVIRONMENT_OPERATION_COUNT = CONTEXT_ENVIRONMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pt.fct.unl.novalincs.useme.model.ContextModeling.impl.WorkflowImpl <em>Workflow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pt.fct.unl.novalincs.useme.model.ContextModeling.impl.WorkflowImpl
	 * @see pt.fct.unl.novalincs.useme.model.ContextModeling.impl.ContextModelingPackageImpl#getWorkflow()
	 * @generated
	 */
	int WORKFLOW = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW__NAME = 0;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW__PRIORITY = 1;

	/**
	 * The feature id for the '<em><b>Actor</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW__ACTOR = 2;

	/**
	 * The feature id for the '<em><b>Context Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW__CONTEXT_ELEMENT = 3;

	/**
	 * The feature id for the '<em><b>Scenario</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW__SCENARIO = 4;

	/**
	 * The feature id for the '<em><b>Process Model</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW__PROCESS_MODEL = 5;

	/**
	 * The feature id for the '<em><b>Context Model</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW__CONTEXT_MODEL = 6;

	/**
	 * The number of structural features of the '<em>Workflow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Workflow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pt.fct.unl.novalincs.useme.model.ContextModeling.impl.UserProfileImpl <em>User Profile</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pt.fct.unl.novalincs.useme.model.ContextModeling.impl.UserProfileImpl
	 * @see pt.fct.unl.novalincs.useme.model.ContextModeling.impl.ContextModelingPackageImpl#getUserProfile()
	 * @generated
	 */
	int USER_PROFILE = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_PROFILE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Background Qs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_PROFILE__BACKGROUND_QS = 1;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_PROFILE__PRIORITY = 2;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_PROFILE__PARENT = 3;

	/**
	 * The feature id for the '<em><b>Sub Profile</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_PROFILE__SUB_PROFILE = 4;

	/**
	 * The feature id for the '<em><b>Participant</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_PROFILE__PARTICIPANT = 5;

	/**
	 * The feature id for the '<em><b>User Hierarchy</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_PROFILE__USER_HIERARCHY = 6;

	/**
	 * The feature id for the '<em><b>Profile Template</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_PROFILE__PROFILE_TEMPLATE = 7;

	/**
	 * The feature id for the '<em><b>Classifier</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_PROFILE__CLASSIFIER = 8;

	/**
	 * The number of structural features of the '<em>User Profile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_PROFILE_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>User Profile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_PROFILE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pt.fct.unl.novalincs.useme.model.ContextModeling.impl.ScenarioImpl <em>Scenario</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pt.fct.unl.novalincs.useme.model.ContextModeling.impl.ScenarioImpl
	 * @see pt.fct.unl.novalincs.useme.model.ContextModeling.impl.ContextModelingPackageImpl#getScenario()
	 * @generated
	 */
	int SCENARIO = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__NAME = 0;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__PRIORITY = 1;

	/**
	 * The feature id for the '<em><b>Evaluated Task</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__EVALUATED_TASK = 2;

	/**
	 * The feature id for the '<em><b>Doc</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__DOC = 3;

	/**
	 * The feature id for the '<em><b>Aggregates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__AGGREGATES = 4;

	/**
	 * The feature id for the '<em><b>Question</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__QUESTION = 5;

	/**
	 * The number of structural features of the '<em>Scenario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Scenario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pt.fct.unl.novalincs.useme.model.ContextModeling.impl.UserHierarchyImpl <em>User Hierarchy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pt.fct.unl.novalincs.useme.model.ContextModeling.impl.UserHierarchyImpl
	 * @see pt.fct.unl.novalincs.useme.model.ContextModeling.impl.ContextModelingPackageImpl#getUserHierarchy()
	 * @generated
	 */
	int USER_HIERARCHY = 12;

	/**
	 * The feature id for the '<em><b>User Profile</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_HIERARCHY__USER_PROFILE = 0;

	/**
	 * The feature id for the '<em><b>Context Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_HIERARCHY__CONTEXT_MODEL = 1;

	/**
	 * The feature id for the '<em><b>Uh Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_HIERARCHY__UH_DESCRIPTION = 2;

	/**
	 * The number of structural features of the '<em>User Hierarchy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_HIERARCHY_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>User Hierarchy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_HIERARCHY_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link pt.fct.unl.novalincs.useme.model.ContextModeling.ContextSpecification <em>Context Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Context Specification</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.ContextModeling.ContextSpecification
	 * @generated
	 */
	EClass getContextSpecification();

	/**
	 * Returns the meta object for the attribute '{@link pt.fct.unl.novalincs.useme.model.ContextModeling.ContextSpecification#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.ContextModeling.ContextSpecification#getName()
	 * @see #getContextSpecification()
	 * @generated
	 */
	EAttribute getContextSpecification_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link pt.fct.unl.novalincs.useme.model.ContextModeling.ContextSpecification#getContextModel <em>Context Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Context Model</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.ContextModeling.ContextSpecification#getContextModel()
	 * @see #getContextSpecification()
	 * @generated
	 */
	EReference getContextSpecification_ContextModel();

	/**
	 * Returns the meta object for the containment reference list '{@link pt.fct.unl.novalincs.useme.model.ContextModeling.ContextSpecification#getUserProfileSpecification <em>User Profile Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>User Profile Specification</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.ContextModeling.ContextSpecification#getUserProfileSpecification()
	 * @see #getContextSpecification()
	 * @generated
	 */
	EReference getContextSpecification_UserProfileSpecification();

	/**
	 * Returns the meta object for the containment reference list '{@link pt.fct.unl.novalincs.useme.model.ContextModeling.ContextSpecification#getEnviromentSpecification <em>Enviroment Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Enviroment Specification</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.ContextModeling.ContextSpecification#getEnviromentSpecification()
	 * @see #getContextSpecification()
	 * @generated
	 */
	EReference getContextSpecification_EnviromentSpecification();

	/**
	 * Returns the meta object for the containment reference list '{@link pt.fct.unl.novalincs.useme.model.ContextModeling.ContextSpecification#getWorkflowSpecification <em>Workflow Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Workflow Specification</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.ContextModeling.ContextSpecification#getWorkflowSpecification()
	 * @see #getContextSpecification()
	 * @generated
	 */
	EReference getContextSpecification_WorkflowSpecification();

	/**
	 * Returns the meta object for class '{@link pt.fct.unl.novalincs.useme.model.ContextModeling.UserProfileSpecification <em>User Profile Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User Profile Specification</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.ContextModeling.UserProfileSpecification
	 * @generated
	 */
	EClass getUserProfileSpecification();

	/**
	 * Returns the meta object for the attribute '{@link pt.fct.unl.novalincs.useme.model.ContextModeling.UserProfileSpecification#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.ContextModeling.UserProfileSpecification#getName()
	 * @see #getUserProfileSpecification()
	 * @generated
	 */
	EAttribute getUserProfileSpecification_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link pt.fct.unl.novalincs.useme.model.ContextModeling.UserProfileSpecification#getUserProfile <em>User Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>User Profile</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.ContextModeling.UserProfileSpecification#getUserProfile()
	 * @see #getUserProfileSpecification()
	 * @generated
	 */
	EReference getUserProfileSpecification_UserProfile();

	/**
	 * Returns the meta object for the containment reference list '{@link pt.fct.unl.novalincs.useme.model.ContextModeling.UserProfileSpecification#getProfileTemplate <em>Profile Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Profile Template</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.ContextModeling.UserProfileSpecification#getProfileTemplate()
	 * @see #getUserProfileSpecification()
	 * @generated
	 */
	EReference getUserProfileSpecification_ProfileTemplate();

	/**
	 * Returns the meta object for the containment reference list '{@link pt.fct.unl.novalincs.useme.model.ContextModeling.UserProfileSpecification#getLogicalExpression <em>Logical Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Logical Expression</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.ContextModeling.UserProfileSpecification#getLogicalExpression()
	 * @see #getUserProfileSpecification()
	 * @generated
	 */
	EReference getUserProfileSpecification_LogicalExpression();

	/**
	 * Returns the meta object for class '{@link pt.fct.unl.novalincs.useme.model.ContextModeling.WorkflowSpecification <em>Workflow Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Workflow Specification</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.ContextModeling.WorkflowSpecification
	 * @generated
	 */
	EClass getWorkflowSpecification();

	/**
	 * Returns the meta object for the attribute '{@link pt.fct.unl.novalincs.useme.model.ContextModeling.WorkflowSpecification#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.ContextModeling.WorkflowSpecification#getName()
	 * @see #getWorkflowSpecification()
	 * @generated
	 */
	EAttribute getWorkflowSpecification_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link pt.fct.unl.novalincs.useme.model.ContextModeling.WorkflowSpecification#getWorkflow <em>Workflow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Workflow</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.ContextModeling.WorkflowSpecification#getWorkflow()
	 * @see #getWorkflowSpecification()
	 * @generated
	 */
	EReference getWorkflowSpecification_Workflow();

	/**
	 * Returns the meta object for the containment reference list '{@link pt.fct.unl.novalincs.useme.model.ContextModeling.WorkflowSpecification#getScenario <em>Scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Scenario</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.ContextModeling.WorkflowSpecification#getScenario()
	 * @see #getWorkflowSpecification()
	 * @generated
	 */
	EReference getWorkflowSpecification_Scenario();

	/**
	 * Returns the meta object for the containment reference list '{@link pt.fct.unl.novalincs.useme.model.ContextModeling.WorkflowSpecification#getTask <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Task</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.ContextModeling.WorkflowSpecification#getTask()
	 * @see #getWorkflowSpecification()
	 * @generated
	 */
	EReference getWorkflowSpecification_Task();

	/**
	 * Returns the meta object for class '{@link pt.fct.unl.novalincs.useme.model.ContextModeling.EnviromentSpecification <em>Enviroment Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enviroment Specification</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.ContextModeling.EnviromentSpecification
	 * @generated
	 */
	EClass getEnviromentSpecification();

	/**
	 * Returns the meta object for the attribute '{@link pt.fct.unl.novalincs.useme.model.ContextModeling.EnviromentSpecification#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.ContextModeling.EnviromentSpecification#getName()
	 * @see #getEnviromentSpecification()
	 * @generated
	 */
	EAttribute getEnviromentSpecification_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link pt.fct.unl.novalincs.useme.model.ContextModeling.EnviromentSpecification#getTechnicalEnvironment <em>Technical Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Technical Environment</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.ContextModeling.EnviromentSpecification#getTechnicalEnvironment()
	 * @see #getEnviromentSpecification()
	 * @generated
	 */
	EReference getEnviromentSpecification_TechnicalEnvironment();

	/**
	 * Returns the meta object for the containment reference list '{@link pt.fct.unl.novalincs.useme.model.ContextModeling.EnviromentSpecification#getPhysicalEnvironment <em>Physical Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Physical Environment</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.ContextModeling.EnviromentSpecification#getPhysicalEnvironment()
	 * @see #getEnviromentSpecification()
	 * @generated
	 */
	EReference getEnviromentSpecification_PhysicalEnvironment();

	/**
	 * Returns the meta object for the containment reference list '{@link pt.fct.unl.novalincs.useme.model.ContextModeling.EnviromentSpecification#getSocialEnvironment <em>Social Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Social Environment</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.ContextModeling.EnviromentSpecification#getSocialEnvironment()
	 * @see #getEnviromentSpecification()
	 * @generated
	 */
	EReference getEnviromentSpecification_SocialEnvironment();

	/**
	 * Returns the meta object for the containment reference list '{@link pt.fct.unl.novalincs.useme.model.ContextModeling.EnviromentSpecification#getEnviromentalVariable <em>Enviromental Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Enviromental Variable</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.ContextModeling.EnviromentSpecification#getEnviromentalVariable()
	 * @see #getEnviromentSpecification()
	 * @generated
	 */
	EReference getEnviromentSpecification_EnviromentalVariable();

	/**
	 * Returns the meta object for class '{@link pt.fct.unl.novalincs.useme.model.ContextModeling.ContextModel <em>Context Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Context Model</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.ContextModeling.ContextModel
	 * @generated
	 */
	EClass getContextModel();

	/**
	 * Returns the meta object for the attribute '{@link pt.fct.unl.novalincs.useme.model.ContextModeling.ContextModel#getCmName <em>Cm Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cm Name</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.ContextModeling.ContextModel#getCmName()
	 * @see #getContextModel()
	 * @generated
	 */
	EAttribute getContextModel_CmName();

	/**
	 * Returns the meta object for the attribute '{@link pt.fct.unl.novalincs.useme.model.ContextModeling.ContextModel#getDomain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Domain</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.ContextModeling.ContextModel#getDomain()
	 * @see #getContextModel()
	 * @generated
	 */
	EAttribute getContextModel_Domain();

	/**
	 * Returns the meta object for the reference list '{@link pt.fct.unl.novalincs.useme.model.ContextModeling.ContextModel#getContextEnvironment <em>Context Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Context Environment</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.ContextModeling.ContextModel#getContextEnvironment()
	 * @see #getContextModel()
	 * @generated
	 */
	EReference getContextModel_ContextEnvironment();

	/**
	 * Returns the meta object for the reference '{@link pt.fct.unl.novalincs.useme.model.ContextModeling.ContextModel#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Language</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.ContextModeling.ContextModel#getLanguage()
	 * @see #getContextModel()
	 * @generated
	 */
	EReference getContextModel_Language();

	/**
	 * Returns the meta object for the reference list '{@link pt.fct.unl.novalincs.useme.model.ContextModeling.ContextModel#getWorkflow <em>Workflow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Workflow</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.ContextModeling.ContextModel#getWorkflow()
	 * @see #getContextModel()
	 * @generated
	 */
	EReference getContextModel_Workflow();

	/**
	 * Returns the meta object for the containment reference '{@link pt.fct.unl.novalincs.useme.model.ContextModeling.ContextModel#getUserHierarchy <em>User Hierarchy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>User Hierarchy</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.ContextModeling.ContextModel#getUserHierarchy()
	 * @see #getContextModel()
	 * @generated
	 */
	EReference getContextModel_UserHierarchy();

	/**
	 * Returns the meta object for the attribute list '{@link pt.fct.unl.novalincs.useme.model.ContextModeling.ContextModel#getContextProvider <em>Context Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Context Provider</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.ContextModeling.ContextModel#getContextProvider()
	 * @see #getContextModel()
	 * @generated
	 */
	EAttribute getContextModel_ContextProvider();

	/**
	 * Returns the meta object for class '{@link pt.fct.unl.novalincs.useme.model.ContextModeling.TechnicalEnvironment <em>Technical Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Technical Environment</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.ContextModeling.TechnicalEnvironment
	 * @generated
	 */
	EClass getTechnicalEnvironment();

	/**
	 * Returns the meta object for class '{@link pt.fct.unl.novalincs.useme.model.ContextModeling.PhysicalEnvironment <em>Physical Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Physical Environment</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.ContextModeling.PhysicalEnvironment
	 * @generated
	 */
	EClass getPhysicalEnvironment();

	/**
	 * Returns the meta object for class '{@link pt.fct.unl.novalincs.useme.model.ContextModeling.SocialEnvironment <em>Social Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Social Environment</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.ContextModeling.SocialEnvironment
	 * @generated
	 */
	EClass getSocialEnvironment();

	/**
	 * Returns the meta object for class '{@link pt.fct.unl.novalincs.useme.model.ContextModeling.Workflow <em>Workflow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Workflow</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.ContextModeling.Workflow
	 * @generated
	 */
	EClass getWorkflow();

	/**
	 * Returns the meta object for the attribute '{@link pt.fct.unl.novalincs.useme.model.ContextModeling.Workflow#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.ContextModeling.Workflow#getName()
	 * @see #getWorkflow()
	 * @generated
	 */
	EAttribute getWorkflow_Name();

	/**
	 * Returns the meta object for the attribute '{@link pt.fct.unl.novalincs.useme.model.ContextModeling.Workflow#getPriority <em>Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Priority</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.ContextModeling.Workflow#getPriority()
	 * @see #getWorkflow()
	 * @generated
	 */
	EAttribute getWorkflow_Priority();

	/**
	 * Returns the meta object for the reference list '{@link pt.fct.unl.novalincs.useme.model.ContextModeling.Workflow#getActor <em>Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Actor</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.ContextModeling.Workflow#getActor()
	 * @see #getWorkflow()
	 * @generated
	 */
	EReference getWorkflow_Actor();

	/**
	 * Returns the meta object for the reference list '{@link pt.fct.unl.novalincs.useme.model.ContextModeling.Workflow#getContextElement <em>Context Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Context Element</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.ContextModeling.Workflow#getContextElement()
	 * @see #getWorkflow()
	 * @generated
	 */
	EReference getWorkflow_ContextElement();

	/**
	 * Returns the meta object for the containment reference list '{@link pt.fct.unl.novalincs.useme.model.ContextModeling.Workflow#getScenario <em>Scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Scenario</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.ContextModeling.Workflow#getScenario()
	 * @see #getWorkflow()
	 * @generated
	 */
	EReference getWorkflow_Scenario();

	/**
	 * Returns the meta object for the reference list '{@link pt.fct.unl.novalincs.useme.model.ContextModeling.Workflow#getProcessModel <em>Process Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Process Model</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.ContextModeling.Workflow#getProcessModel()
	 * @see #getWorkflow()
	 * @generated
	 */
	EReference getWorkflow_ProcessModel();

	/**
	 * Returns the meta object for the reference list '{@link pt.fct.unl.novalincs.useme.model.ContextModeling.Workflow#getContextModel <em>Context Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Context Model</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.ContextModeling.Workflow#getContextModel()
	 * @see #getWorkflow()
	 * @generated
	 */
	EReference getWorkflow_ContextModel();

	/**
	 * Returns the meta object for class '{@link pt.fct.unl.novalincs.useme.model.ContextModeling.ContextEnvironment <em>Context Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Context Environment</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.ContextModeling.ContextEnvironment
	 * @generated
	 */
	EClass getContextEnvironment();

	/**
	 * Returns the meta object for the attribute '{@link pt.fct.unl.novalincs.useme.model.ContextModeling.ContextEnvironment#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.ContextModeling.ContextEnvironment#getName()
	 * @see #getContextEnvironment()
	 * @generated
	 */
	EAttribute getContextEnvironment_Name();

	/**
	 * Returns the meta object for the reference list '{@link pt.fct.unl.novalincs.useme.model.ContextModeling.ContextEnvironment#getContextModel <em>Context Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Context Model</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.ContextModeling.ContextEnvironment#getContextModel()
	 * @see #getContextEnvironment()
	 * @generated
	 */
	EReference getContextEnvironment_ContextModel();

	/**
	 * Returns the meta object for the reference list '{@link pt.fct.unl.novalincs.useme.model.ContextModeling.ContextEnvironment#getCeElement <em>Ce Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ce Element</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.ContextModeling.ContextEnvironment#getCeElement()
	 * @see #getContextEnvironment()
	 * @generated
	 */
	EReference getContextEnvironment_CeElement();

	/**
	 * Returns the meta object for the reference '{@link pt.fct.unl.novalincs.useme.model.ContextModeling.ContextEnvironment#getOutsideRef <em>Outside Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Outside Ref</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.ContextModeling.ContextEnvironment#getOutsideRef()
	 * @see #getContextEnvironment()
	 * @generated
	 */
	EReference getContextEnvironment_OutsideRef();

	/**
	 * Returns the meta object for class '{@link pt.fct.unl.novalincs.useme.model.ContextModeling.UserProfile <em>User Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User Profile</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.ContextModeling.UserProfile
	 * @generated
	 */
	EClass getUserProfile();

	/**
	 * Returns the meta object for the attribute '{@link pt.fct.unl.novalincs.useme.model.ContextModeling.UserProfile#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.ContextModeling.UserProfile#getName()
	 * @see #getUserProfile()
	 * @generated
	 */
	EAttribute getUserProfile_Name();

	/**
	 * Returns the meta object for the reference list '{@link pt.fct.unl.novalincs.useme.model.ContextModeling.UserProfile#getBackgroundQs <em>Background Qs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Background Qs</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.ContextModeling.UserProfile#getBackgroundQs()
	 * @see #getUserProfile()
	 * @generated
	 */
	EReference getUserProfile_BackgroundQs();

	/**
	 * Returns the meta object for the attribute '{@link pt.fct.unl.novalincs.useme.model.ContextModeling.UserProfile#getPriority <em>Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Priority</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.ContextModeling.UserProfile#getPriority()
	 * @see #getUserProfile()
	 * @generated
	 */
	EAttribute getUserProfile_Priority();

	/**
	 * Returns the meta object for the reference list '{@link pt.fct.unl.novalincs.useme.model.ContextModeling.UserProfile#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Parent</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.ContextModeling.UserProfile#getParent()
	 * @see #getUserProfile()
	 * @generated
	 */
	EReference getUserProfile_Parent();

	/**
	 * Returns the meta object for the reference list '{@link pt.fct.unl.novalincs.useme.model.ContextModeling.UserProfile#getSubProfile <em>Sub Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sub Profile</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.ContextModeling.UserProfile#getSubProfile()
	 * @see #getUserProfile()
	 * @generated
	 */
	EReference getUserProfile_SubProfile();

	/**
	 * Returns the meta object for the reference list '{@link pt.fct.unl.novalincs.useme.model.ContextModeling.UserProfile#getParticipant <em>Participant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Participant</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.ContextModeling.UserProfile#getParticipant()
	 * @see #getUserProfile()
	 * @generated
	 */
	EReference getUserProfile_Participant();

	/**
	 * Returns the meta object for the reference '{@link pt.fct.unl.novalincs.useme.model.ContextModeling.UserProfile#getUserHierarchy <em>User Hierarchy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>User Hierarchy</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.ContextModeling.UserProfile#getUserHierarchy()
	 * @see #getUserProfile()
	 * @generated
	 */
	EReference getUserProfile_UserHierarchy();

	/**
	 * Returns the meta object for the reference list '{@link pt.fct.unl.novalincs.useme.model.ContextModeling.UserProfile#getProfileTemplate <em>Profile Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Profile Template</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.ContextModeling.UserProfile#getProfileTemplate()
	 * @see #getUserProfile()
	 * @generated
	 */
	EReference getUserProfile_ProfileTemplate();

	/**
	 * Returns the meta object for the reference list '{@link pt.fct.unl.novalincs.useme.model.ContextModeling.UserProfile#getClassifier <em>Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Classifier</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.ContextModeling.UserProfile#getClassifier()
	 * @see #getUserProfile()
	 * @generated
	 */
	EReference getUserProfile_Classifier();

	/**
	 * Returns the meta object for class '{@link pt.fct.unl.novalincs.useme.model.ContextModeling.Scenario <em>Scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scenario</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.ContextModeling.Scenario
	 * @generated
	 */
	EClass getScenario();

	/**
	 * Returns the meta object for the attribute '{@link pt.fct.unl.novalincs.useme.model.ContextModeling.Scenario#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.ContextModeling.Scenario#getName()
	 * @see #getScenario()
	 * @generated
	 */
	EAttribute getScenario_Name();

	/**
	 * Returns the meta object for the attribute '{@link pt.fct.unl.novalincs.useme.model.ContextModeling.Scenario#getPriority <em>Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Priority</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.ContextModeling.Scenario#getPriority()
	 * @see #getScenario()
	 * @generated
	 */
	EAttribute getScenario_Priority();

	/**
	 * Returns the meta object for the reference list '{@link pt.fct.unl.novalincs.useme.model.ContextModeling.Scenario#getEvaluatedTask <em>Evaluated Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Evaluated Task</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.ContextModeling.Scenario#getEvaluatedTask()
	 * @see #getScenario()
	 * @generated
	 */
	EReference getScenario_EvaluatedTask();

	/**
	 * Returns the meta object for the reference list '{@link pt.fct.unl.novalincs.useme.model.ContextModeling.Scenario#getDoc <em>Doc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Doc</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.ContextModeling.Scenario#getDoc()
	 * @see #getScenario()
	 * @generated
	 */
	EReference getScenario_Doc();

	/**
	 * Returns the meta object for the reference list '{@link pt.fct.unl.novalincs.useme.model.ContextModeling.Scenario#getAggregates <em>Aggregates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Aggregates</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.ContextModeling.Scenario#getAggregates()
	 * @see #getScenario()
	 * @generated
	 */
	EReference getScenario_Aggregates();

	/**
	 * Returns the meta object for the reference list '{@link pt.fct.unl.novalincs.useme.model.ContextModeling.Scenario#getQuestion <em>Question</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Question</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.ContextModeling.Scenario#getQuestion()
	 * @see #getScenario()
	 * @generated
	 */
	EReference getScenario_Question();

	/**
	 * Returns the meta object for class '{@link pt.fct.unl.novalincs.useme.model.ContextModeling.UserHierarchy <em>User Hierarchy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User Hierarchy</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.ContextModeling.UserHierarchy
	 * @generated
	 */
	EClass getUserHierarchy();

	/**
	 * Returns the meta object for the reference '{@link pt.fct.unl.novalincs.useme.model.ContextModeling.UserHierarchy#getUserProfile <em>User Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>User Profile</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.ContextModeling.UserHierarchy#getUserProfile()
	 * @see #getUserHierarchy()
	 * @generated
	 */
	EReference getUserHierarchy_UserProfile();

	/**
	 * Returns the meta object for the container reference '{@link pt.fct.unl.novalincs.useme.model.ContextModeling.UserHierarchy#getContextModel <em>Context Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Context Model</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.ContextModeling.UserHierarchy#getContextModel()
	 * @see #getUserHierarchy()
	 * @generated
	 */
	EReference getUserHierarchy_ContextModel();

	/**
	 * Returns the meta object for the attribute '{@link pt.fct.unl.novalincs.useme.model.ContextModeling.UserHierarchy#getUhDescription <em>Uh Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uh Description</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.ContextModeling.UserHierarchy#getUhDescription()
	 * @see #getUserHierarchy()
	 * @generated
	 */
	EAttribute getUserHierarchy_UhDescription();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ContextModelingFactory getContextModelingFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link pt.fct.unl.novalincs.useme.model.ContextModeling.impl.ContextSpecificationImpl <em>Context Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pt.fct.unl.novalincs.useme.model.ContextModeling.impl.ContextSpecificationImpl
		 * @see pt.fct.unl.novalincs.useme.model.ContextModeling.impl.ContextModelingPackageImpl#getContextSpecification()
		 * @generated
		 */
		EClass CONTEXT_SPECIFICATION = eINSTANCE.getContextSpecification();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTEXT_SPECIFICATION__NAME = eINSTANCE.getContextSpecification_Name();

		/**
		 * The meta object literal for the '<em><b>Context Model</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT_SPECIFICATION__CONTEXT_MODEL = eINSTANCE.getContextSpecification_ContextModel();

		/**
		 * The meta object literal for the '<em><b>User Profile Specification</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT_SPECIFICATION__USER_PROFILE_SPECIFICATION = eINSTANCE.getContextSpecification_UserProfileSpecification();

		/**
		 * The meta object literal for the '<em><b>Enviroment Specification</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT_SPECIFICATION__ENVIROMENT_SPECIFICATION = eINSTANCE.getContextSpecification_EnviromentSpecification();

		/**
		 * The meta object literal for the '<em><b>Workflow Specification</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT_SPECIFICATION__WORKFLOW_SPECIFICATION = eINSTANCE.getContextSpecification_WorkflowSpecification();

		/**
		 * The meta object literal for the '{@link pt.fct.unl.novalincs.useme.model.ContextModeling.impl.UserProfileSpecificationImpl <em>User Profile Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pt.fct.unl.novalincs.useme.model.ContextModeling.impl.UserProfileSpecificationImpl
		 * @see pt.fct.unl.novalincs.useme.model.ContextModeling.impl.ContextModelingPackageImpl#getUserProfileSpecification()
		 * @generated
		 */
		EClass USER_PROFILE_SPECIFICATION = eINSTANCE.getUserProfileSpecification();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_PROFILE_SPECIFICATION__NAME = eINSTANCE.getUserProfileSpecification_Name();

		/**
		 * The meta object literal for the '<em><b>User Profile</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER_PROFILE_SPECIFICATION__USER_PROFILE = eINSTANCE.getUserProfileSpecification_UserProfile();

		/**
		 * The meta object literal for the '<em><b>Profile Template</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER_PROFILE_SPECIFICATION__PROFILE_TEMPLATE = eINSTANCE.getUserProfileSpecification_ProfileTemplate();

		/**
		 * The meta object literal for the '<em><b>Logical Expression</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER_PROFILE_SPECIFICATION__LOGICAL_EXPRESSION = eINSTANCE.getUserProfileSpecification_LogicalExpression();

		/**
		 * The meta object literal for the '{@link pt.fct.unl.novalincs.useme.model.ContextModeling.impl.WorkflowSpecificationImpl <em>Workflow Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pt.fct.unl.novalincs.useme.model.ContextModeling.impl.WorkflowSpecificationImpl
		 * @see pt.fct.unl.novalincs.useme.model.ContextModeling.impl.ContextModelingPackageImpl#getWorkflowSpecification()
		 * @generated
		 */
		EClass WORKFLOW_SPECIFICATION = eINSTANCE.getWorkflowSpecification();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORKFLOW_SPECIFICATION__NAME = eINSTANCE.getWorkflowSpecification_Name();

		/**
		 * The meta object literal for the '<em><b>Workflow</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKFLOW_SPECIFICATION__WORKFLOW = eINSTANCE.getWorkflowSpecification_Workflow();

		/**
		 * The meta object literal for the '<em><b>Scenario</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKFLOW_SPECIFICATION__SCENARIO = eINSTANCE.getWorkflowSpecification_Scenario();

		/**
		 * The meta object literal for the '<em><b>Task</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKFLOW_SPECIFICATION__TASK = eINSTANCE.getWorkflowSpecification_Task();

		/**
		 * The meta object literal for the '{@link pt.fct.unl.novalincs.useme.model.ContextModeling.impl.EnviromentSpecificationImpl <em>Enviroment Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pt.fct.unl.novalincs.useme.model.ContextModeling.impl.EnviromentSpecificationImpl
		 * @see pt.fct.unl.novalincs.useme.model.ContextModeling.impl.ContextModelingPackageImpl#getEnviromentSpecification()
		 * @generated
		 */
		EClass ENVIROMENT_SPECIFICATION = eINSTANCE.getEnviromentSpecification();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENVIROMENT_SPECIFICATION__NAME = eINSTANCE.getEnviromentSpecification_Name();

		/**
		 * The meta object literal for the '<em><b>Technical Environment</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENVIROMENT_SPECIFICATION__TECHNICAL_ENVIRONMENT = eINSTANCE.getEnviromentSpecification_TechnicalEnvironment();

		/**
		 * The meta object literal for the '<em><b>Physical Environment</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENVIROMENT_SPECIFICATION__PHYSICAL_ENVIRONMENT = eINSTANCE.getEnviromentSpecification_PhysicalEnvironment();

		/**
		 * The meta object literal for the '<em><b>Social Environment</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENVIROMENT_SPECIFICATION__SOCIAL_ENVIRONMENT = eINSTANCE.getEnviromentSpecification_SocialEnvironment();

		/**
		 * The meta object literal for the '<em><b>Enviromental Variable</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENVIROMENT_SPECIFICATION__ENVIROMENTAL_VARIABLE = eINSTANCE.getEnviromentSpecification_EnviromentalVariable();

		/**
		 * The meta object literal for the '{@link pt.fct.unl.novalincs.useme.model.ContextModeling.impl.ContextModelImpl <em>Context Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pt.fct.unl.novalincs.useme.model.ContextModeling.impl.ContextModelImpl
		 * @see pt.fct.unl.novalincs.useme.model.ContextModeling.impl.ContextModelingPackageImpl#getContextModel()
		 * @generated
		 */
		EClass CONTEXT_MODEL = eINSTANCE.getContextModel();

		/**
		 * The meta object literal for the '<em><b>Cm Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTEXT_MODEL__CM_NAME = eINSTANCE.getContextModel_CmName();

		/**
		 * The meta object literal for the '<em><b>Domain</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTEXT_MODEL__DOMAIN = eINSTANCE.getContextModel_Domain();

		/**
		 * The meta object literal for the '<em><b>Context Environment</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT_MODEL__CONTEXT_ENVIRONMENT = eINSTANCE.getContextModel_ContextEnvironment();

		/**
		 * The meta object literal for the '<em><b>Language</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT_MODEL__LANGUAGE = eINSTANCE.getContextModel_Language();

		/**
		 * The meta object literal for the '<em><b>Workflow</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT_MODEL__WORKFLOW = eINSTANCE.getContextModel_Workflow();

		/**
		 * The meta object literal for the '<em><b>User Hierarchy</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT_MODEL__USER_HIERARCHY = eINSTANCE.getContextModel_UserHierarchy();

		/**
		 * The meta object literal for the '<em><b>Context Provider</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTEXT_MODEL__CONTEXT_PROVIDER = eINSTANCE.getContextModel_ContextProvider();

		/**
		 * The meta object literal for the '{@link pt.fct.unl.novalincs.useme.model.ContextModeling.impl.TechnicalEnvironmentImpl <em>Technical Environment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pt.fct.unl.novalincs.useme.model.ContextModeling.impl.TechnicalEnvironmentImpl
		 * @see pt.fct.unl.novalincs.useme.model.ContextModeling.impl.ContextModelingPackageImpl#getTechnicalEnvironment()
		 * @generated
		 */
		EClass TECHNICAL_ENVIRONMENT = eINSTANCE.getTechnicalEnvironment();

		/**
		 * The meta object literal for the '{@link pt.fct.unl.novalincs.useme.model.ContextModeling.impl.PhysicalEnvironmentImpl <em>Physical Environment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pt.fct.unl.novalincs.useme.model.ContextModeling.impl.PhysicalEnvironmentImpl
		 * @see pt.fct.unl.novalincs.useme.model.ContextModeling.impl.ContextModelingPackageImpl#getPhysicalEnvironment()
		 * @generated
		 */
		EClass PHYSICAL_ENVIRONMENT = eINSTANCE.getPhysicalEnvironment();

		/**
		 * The meta object literal for the '{@link pt.fct.unl.novalincs.useme.model.ContextModeling.impl.SocialEnvironmentImpl <em>Social Environment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pt.fct.unl.novalincs.useme.model.ContextModeling.impl.SocialEnvironmentImpl
		 * @see pt.fct.unl.novalincs.useme.model.ContextModeling.impl.ContextModelingPackageImpl#getSocialEnvironment()
		 * @generated
		 */
		EClass SOCIAL_ENVIRONMENT = eINSTANCE.getSocialEnvironment();

		/**
		 * The meta object literal for the '{@link pt.fct.unl.novalincs.useme.model.ContextModeling.impl.WorkflowImpl <em>Workflow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pt.fct.unl.novalincs.useme.model.ContextModeling.impl.WorkflowImpl
		 * @see pt.fct.unl.novalincs.useme.model.ContextModeling.impl.ContextModelingPackageImpl#getWorkflow()
		 * @generated
		 */
		EClass WORKFLOW = eINSTANCE.getWorkflow();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORKFLOW__NAME = eINSTANCE.getWorkflow_Name();

		/**
		 * The meta object literal for the '<em><b>Priority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORKFLOW__PRIORITY = eINSTANCE.getWorkflow_Priority();

		/**
		 * The meta object literal for the '<em><b>Actor</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKFLOW__ACTOR = eINSTANCE.getWorkflow_Actor();

		/**
		 * The meta object literal for the '<em><b>Context Element</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKFLOW__CONTEXT_ELEMENT = eINSTANCE.getWorkflow_ContextElement();

		/**
		 * The meta object literal for the '<em><b>Scenario</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKFLOW__SCENARIO = eINSTANCE.getWorkflow_Scenario();

		/**
		 * The meta object literal for the '<em><b>Process Model</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKFLOW__PROCESS_MODEL = eINSTANCE.getWorkflow_ProcessModel();

		/**
		 * The meta object literal for the '<em><b>Context Model</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKFLOW__CONTEXT_MODEL = eINSTANCE.getWorkflow_ContextModel();

		/**
		 * The meta object literal for the '{@link pt.fct.unl.novalincs.useme.model.ContextModeling.impl.ContextEnvironmentImpl <em>Context Environment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pt.fct.unl.novalincs.useme.model.ContextModeling.impl.ContextEnvironmentImpl
		 * @see pt.fct.unl.novalincs.useme.model.ContextModeling.impl.ContextModelingPackageImpl#getContextEnvironment()
		 * @generated
		 */
		EClass CONTEXT_ENVIRONMENT = eINSTANCE.getContextEnvironment();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTEXT_ENVIRONMENT__NAME = eINSTANCE.getContextEnvironment_Name();

		/**
		 * The meta object literal for the '<em><b>Context Model</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT_ENVIRONMENT__CONTEXT_MODEL = eINSTANCE.getContextEnvironment_ContextModel();

		/**
		 * The meta object literal for the '<em><b>Ce Element</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT_ENVIRONMENT__CE_ELEMENT = eINSTANCE.getContextEnvironment_CeElement();

		/**
		 * The meta object literal for the '<em><b>Outside Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT_ENVIRONMENT__OUTSIDE_REF = eINSTANCE.getContextEnvironment_OutsideRef();

		/**
		 * The meta object literal for the '{@link pt.fct.unl.novalincs.useme.model.ContextModeling.impl.UserProfileImpl <em>User Profile</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pt.fct.unl.novalincs.useme.model.ContextModeling.impl.UserProfileImpl
		 * @see pt.fct.unl.novalincs.useme.model.ContextModeling.impl.ContextModelingPackageImpl#getUserProfile()
		 * @generated
		 */
		EClass USER_PROFILE = eINSTANCE.getUserProfile();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_PROFILE__NAME = eINSTANCE.getUserProfile_Name();

		/**
		 * The meta object literal for the '<em><b>Background Qs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER_PROFILE__BACKGROUND_QS = eINSTANCE.getUserProfile_BackgroundQs();

		/**
		 * The meta object literal for the '<em><b>Priority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_PROFILE__PRIORITY = eINSTANCE.getUserProfile_Priority();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER_PROFILE__PARENT = eINSTANCE.getUserProfile_Parent();

		/**
		 * The meta object literal for the '<em><b>Sub Profile</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER_PROFILE__SUB_PROFILE = eINSTANCE.getUserProfile_SubProfile();

		/**
		 * The meta object literal for the '<em><b>Participant</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER_PROFILE__PARTICIPANT = eINSTANCE.getUserProfile_Participant();

		/**
		 * The meta object literal for the '<em><b>User Hierarchy</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER_PROFILE__USER_HIERARCHY = eINSTANCE.getUserProfile_UserHierarchy();

		/**
		 * The meta object literal for the '<em><b>Profile Template</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER_PROFILE__PROFILE_TEMPLATE = eINSTANCE.getUserProfile_ProfileTemplate();

		/**
		 * The meta object literal for the '<em><b>Classifier</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER_PROFILE__CLASSIFIER = eINSTANCE.getUserProfile_Classifier();

		/**
		 * The meta object literal for the '{@link pt.fct.unl.novalincs.useme.model.ContextModeling.impl.ScenarioImpl <em>Scenario</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pt.fct.unl.novalincs.useme.model.ContextModeling.impl.ScenarioImpl
		 * @see pt.fct.unl.novalincs.useme.model.ContextModeling.impl.ContextModelingPackageImpl#getScenario()
		 * @generated
		 */
		EClass SCENARIO = eINSTANCE.getScenario();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCENARIO__NAME = eINSTANCE.getScenario_Name();

		/**
		 * The meta object literal for the '<em><b>Priority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCENARIO__PRIORITY = eINSTANCE.getScenario_Priority();

		/**
		 * The meta object literal for the '<em><b>Evaluated Task</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCENARIO__EVALUATED_TASK = eINSTANCE.getScenario_EvaluatedTask();

		/**
		 * The meta object literal for the '<em><b>Doc</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCENARIO__DOC = eINSTANCE.getScenario_Doc();

		/**
		 * The meta object literal for the '<em><b>Aggregates</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCENARIO__AGGREGATES = eINSTANCE.getScenario_Aggregates();

		/**
		 * The meta object literal for the '<em><b>Question</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCENARIO__QUESTION = eINSTANCE.getScenario_Question();

		/**
		 * The meta object literal for the '{@link pt.fct.unl.novalincs.useme.model.ContextModeling.impl.UserHierarchyImpl <em>User Hierarchy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pt.fct.unl.novalincs.useme.model.ContextModeling.impl.UserHierarchyImpl
		 * @see pt.fct.unl.novalincs.useme.model.ContextModeling.impl.ContextModelingPackageImpl#getUserHierarchy()
		 * @generated
		 */
		EClass USER_HIERARCHY = eINSTANCE.getUserHierarchy();

		/**
		 * The meta object literal for the '<em><b>User Profile</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER_HIERARCHY__USER_PROFILE = eINSTANCE.getUserHierarchy_UserProfile();

		/**
		 * The meta object literal for the '<em><b>Context Model</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER_HIERARCHY__CONTEXT_MODEL = eINSTANCE.getUserHierarchy_ContextModel();

		/**
		 * The meta object literal for the '<em><b>Uh Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_HIERARCHY__UH_DESCRIPTION = eINSTANCE.getUserHierarchy_UhDescription();

	}

} //ContextModelingPackage
