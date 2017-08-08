/**
 */
package org.gyro.metamodel.gyro;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.gyro.metamodel.gyro.GyroFactory
 * @model kind="package"
 * @generated
 */
public interface GyroPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "gyro";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://gyro/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "gyro";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GyroPackage eINSTANCE = org.gyro.metamodel.gyro.impl.GyroPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.gyro.metamodel.gyro.impl.GyroSpecificationImpl <em>Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gyro.metamodel.gyro.impl.GyroSpecificationImpl
	 * @see org.gyro.metamodel.gyro.impl.GyroPackageImpl#getGyroSpecification()
	 * @generated
	 */
	int GYRO_SPECIFICATION = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GYRO_SPECIFICATION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GYRO_SPECIFICATION__NODES = 1;

	/**
	 * The feature id for the '<em><b>Child</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GYRO_SPECIFICATION__CHILD = 2;

	/**
	 * The feature id for the '<em><b>Next</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GYRO_SPECIFICATION__NEXT = 3;

	/**
	 * The number of structural features of the '<em>Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GYRO_SPECIFICATION_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.gyro.metamodel.gyro.impl.NodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gyro.metamodel.gyro.impl.NodeImpl
	 * @see org.gyro.metamodel.gyro.impl.GyroPackageImpl#getNode()
	 * @generated
	 */
	int NODE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.gyro.metamodel.gyro.impl.ChildImpl <em>Child</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gyro.metamodel.gyro.impl.ChildImpl
	 * @see org.gyro.metamodel.gyro.impl.GyroPackageImpl#getChild()
	 * @generated
	 */
	int CHILD = 2;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD__TARGET = 1;

	/**
	 * The number of structural features of the '<em>Child</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.gyro.metamodel.gyro.impl.SiblingImpl <em>Sibling</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gyro.metamodel.gyro.impl.SiblingImpl
	 * @see org.gyro.metamodel.gyro.impl.GyroPackageImpl#getSibling()
	 * @generated
	 */
	int SIBLING = 3;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIBLING__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIBLING__TARGET = 1;

	/**
	 * The number of structural features of the '<em>Sibling</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIBLING_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.gyro.metamodel.gyro.impl.BehaviorImpl <em>Behavior</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gyro.metamodel.gyro.impl.BehaviorImpl
	 * @see org.gyro.metamodel.gyro.impl.GyroPackageImpl#getBehavior()
	 * @generated
	 */
	int BEHAVIOR = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR__NAME = NODE__NAME;

	/**
	 * The number of structural features of the '<em>Behavior</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_FEATURE_COUNT = NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gyro.metamodel.gyro.impl.PriorityImpl <em>Priority</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gyro.metamodel.gyro.impl.PriorityImpl
	 * @see org.gyro.metamodel.gyro.impl.GyroPackageImpl#getPriority()
	 * @generated
	 */
	int PRIORITY = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIORITY__NAME = BEHAVIOR__NAME;

	/**
	 * The number of structural features of the '<em>Priority</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIORITY_FEATURE_COUNT = BEHAVIOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gyro.metamodel.gyro.impl.ParallelImpl <em>Parallel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gyro.metamodel.gyro.impl.ParallelImpl
	 * @see org.gyro.metamodel.gyro.impl.GyroPackageImpl#getParallel()
	 * @generated
	 */
	int PARALLEL = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL__NAME = BEHAVIOR__NAME;

	/**
	 * The number of structural features of the '<em>Parallel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_FEATURE_COUNT = BEHAVIOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gyro.metamodel.gyro.impl.SequentialImpl <em>Sequential</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gyro.metamodel.gyro.impl.SequentialImpl
	 * @see org.gyro.metamodel.gyro.impl.GyroPackageImpl#getSequential()
	 * @generated
	 */
	int SEQUENTIAL = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENTIAL__NAME = BEHAVIOR__NAME;

	/**
	 * The number of structural features of the '<em>Sequential</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENTIAL_FEATURE_COUNT = BEHAVIOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gyro.metamodel.gyro.impl.StatusChangeImpl <em>Status Change</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gyro.metamodel.gyro.impl.StatusChangeImpl
	 * @see org.gyro.metamodel.gyro.impl.GyroPackageImpl#getStatusChange()
	 * @generated
	 */
	int STATUS_CHANGE = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_CHANGE__NAME = BEHAVIOR__NAME;

	/**
	 * The feature id for the '<em><b>Change Success</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_CHANGE__CHANGE_SUCCESS = BEHAVIOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Change Failure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_CHANGE__CHANGE_FAILURE = BEHAVIOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Change Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_CHANGE__CHANGE_RUNNING = BEHAVIOR_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Status Change</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_CHANGE_FEATURE_COUNT = BEHAVIOR_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.gyro.metamodel.gyro.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gyro.metamodel.gyro.impl.ActionImpl
	 * @see org.gyro.metamodel.gyro.impl.GyroPackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__NAME = NODE__NAME;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_FEATURE_COUNT = NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gyro.metamodel.gyro.impl.ConditionImpl <em>Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gyro.metamodel.gyro.impl.ConditionImpl
	 * @see org.gyro.metamodel.gyro.impl.GyroPackageImpl#getCondition()
	 * @generated
	 */
	int CONDITION = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__NAME = ACTION__NAME;

	/**
	 * The number of structural features of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gyro.metamodel.gyro.impl.DistanceImpl <em>Distance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gyro.metamodel.gyro.impl.DistanceImpl
	 * @see org.gyro.metamodel.gyro.impl.GyroPackageImpl#getDistance()
	 * @generated
	 */
	int DISTANCE = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTANCE__NAME = CONDITION__NAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTANCE__VALUE = CONDITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTANCE__KIND = CONDITION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Distance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTANCE_FEATURE_COUNT = CONDITION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.gyro.metamodel.gyro.impl.BumpersImpl <em>Bumpers</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gyro.metamodel.gyro.impl.BumpersImpl
	 * @see org.gyro.metamodel.gyro.impl.GyroPackageImpl#getBumpers()
	 * @generated
	 */
	int BUMPERS = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUMPERS__NAME = CONDITION__NAME;

	/**
	 * The feature id for the '<em><b>Bumper Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUMPERS__BUMPER_KIND = CONDITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Bumpers</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUMPERS_FEATURE_COUNT = CONDITION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.gyro.metamodel.gyro.impl.WaitingImpl <em>Waiting</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gyro.metamodel.gyro.impl.WaitingImpl
	 * @see org.gyro.metamodel.gyro.impl.GyroPackageImpl#getWaiting()
	 * @generated
	 */
	int WAITING = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAITING__NAME = CONDITION__NAME;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAITING__TIME = CONDITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Waiting</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAITING_FEATURE_COUNT = CONDITION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.gyro.metamodel.gyro.impl.ActuateImpl <em>Actuate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gyro.metamodel.gyro.impl.ActuateImpl
	 * @see org.gyro.metamodel.gyro.impl.GyroPackageImpl#getActuate()
	 * @generated
	 */
	int ACTUATE = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATE__NAME = ACTION__NAME;

	/**
	 * The number of structural features of the '<em>Actuate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATE_FEATURE_COUNT = ACTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gyro.metamodel.gyro.impl.MotorImpl <em>Motor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gyro.metamodel.gyro.impl.MotorImpl
	 * @see org.gyro.metamodel.gyro.impl.GyroPackageImpl#getMotor()
	 * @generated
	 */
	int MOTOR = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTOR__NAME = ACTUATE__NAME;

	/**
	 * The feature id for the '<em><b>Left Motor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTOR__LEFT_MOTOR = ACTUATE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right Motor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTOR__RIGHT_MOTOR = ACTUATE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Motor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTOR_FEATURE_COUNT = ACTUATE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.gyro.metamodel.gyro.impl.ServoImpl <em>Servo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gyro.metamodel.gyro.impl.ServoImpl
	 * @see org.gyro.metamodel.gyro.impl.GyroPackageImpl#getServo()
	 * @generated
	 */
	int SERVO = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVO__NAME = ACTUATE__NAME;

	/**
	 * The feature id for the '<em><b>Minimal Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVO__MINIMAL_POSITION = ACTUATE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Maximal Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVO__MAXIMAL_POSITION = ACTUATE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVO__STEP = ACTUATE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Servo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVO_FEATURE_COUNT = ACTUATE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.gyro.metamodel.gyro.impl.LEDImpl <em>LED</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gyro.metamodel.gyro.impl.LEDImpl
	 * @see org.gyro.metamodel.gyro.impl.GyroPackageImpl#getLED()
	 * @generated
	 */
	int LED = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LED__NAME = ACTUATE__NAME;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LED__STATUS = ACTUATE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>LED</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LED_FEATURE_COUNT = ACTUATE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.gyro.metamodel.gyro.LightStatus <em>Light Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gyro.metamodel.gyro.LightStatus
	 * @see org.gyro.metamodel.gyro.impl.GyroPackageImpl#getLightStatus()
	 * @generated
	 */
	int LIGHT_STATUS = 18;

	/**
	 * The meta object id for the '{@link org.gyro.metamodel.gyro.SuccessState <em>Success State</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gyro.metamodel.gyro.SuccessState
	 * @see org.gyro.metamodel.gyro.impl.GyroPackageImpl#getSuccessState()
	 * @generated
	 */
	int SUCCESS_STATE = 19;

	/**
	 * The meta object id for the '{@link org.gyro.metamodel.gyro.FailureState <em>Failure State</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gyro.metamodel.gyro.FailureState
	 * @see org.gyro.metamodel.gyro.impl.GyroPackageImpl#getFailureState()
	 * @generated
	 */
	int FAILURE_STATE = 20;

	/**
	 * The meta object id for the '{@link org.gyro.metamodel.gyro.RunningState <em>Running State</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gyro.metamodel.gyro.RunningState
	 * @see org.gyro.metamodel.gyro.impl.GyroPackageImpl#getRunningState()
	 * @generated
	 */
	int RUNNING_STATE = 21;

	/**
	 * The meta object id for the '{@link org.gyro.metamodel.gyro.BumperKind <em>Bumper Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gyro.metamodel.gyro.BumperKind
	 * @see org.gyro.metamodel.gyro.impl.GyroPackageImpl#getBumperKind()
	 * @generated
	 */
	int BUMPER_KIND = 22;

	/**
	 * The meta object id for the '{@link org.gyro.metamodel.gyro.DistanceKind <em>Distance Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gyro.metamodel.gyro.DistanceKind
	 * @see org.gyro.metamodel.gyro.impl.GyroPackageImpl#getDistanceKind()
	 * @generated
	 */
	int DISTANCE_KIND = 23;


	/**
	 * Returns the meta object for class '{@link org.gyro.metamodel.gyro.GyroSpecification <em>Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specification</em>'.
	 * @see org.gyro.metamodel.gyro.GyroSpecification
	 * @generated
	 */
	EClass getGyroSpecification();

	/**
	 * Returns the meta object for the attribute '{@link org.gyro.metamodel.gyro.GyroSpecification#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.gyro.metamodel.gyro.GyroSpecification#getName()
	 * @see #getGyroSpecification()
	 * @generated
	 */
	EAttribute getGyroSpecification_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gyro.metamodel.gyro.GyroSpecification#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nodes</em>'.
	 * @see org.gyro.metamodel.gyro.GyroSpecification#getNodes()
	 * @see #getGyroSpecification()
	 * @generated
	 */
	EReference getGyroSpecification_Nodes();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gyro.metamodel.gyro.GyroSpecification#getChild <em>Child</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Child</em>'.
	 * @see org.gyro.metamodel.gyro.GyroSpecification#getChild()
	 * @see #getGyroSpecification()
	 * @generated
	 */
	EReference getGyroSpecification_Child();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gyro.metamodel.gyro.GyroSpecification#getNext <em>Next</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Next</em>'.
	 * @see org.gyro.metamodel.gyro.GyroSpecification#getNext()
	 * @see #getGyroSpecification()
	 * @generated
	 */
	EReference getGyroSpecification_Next();

	/**
	 * Returns the meta object for class '{@link org.gyro.metamodel.gyro.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see org.gyro.metamodel.gyro.Node
	 * @generated
	 */
	EClass getNode();

	/**
	 * Returns the meta object for the attribute '{@link org.gyro.metamodel.gyro.Node#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.gyro.metamodel.gyro.Node#getName()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_Name();

	/**
	 * Returns the meta object for class '{@link org.gyro.metamodel.gyro.Child <em>Child</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Child</em>'.
	 * @see org.gyro.metamodel.gyro.Child
	 * @generated
	 */
	EClass getChild();

	/**
	 * Returns the meta object for the reference list '{@link org.gyro.metamodel.gyro.Child#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Source</em>'.
	 * @see org.gyro.metamodel.gyro.Child#getSource()
	 * @see #getChild()
	 * @generated
	 */
	EReference getChild_Source();

	/**
	 * Returns the meta object for the reference list '{@link org.gyro.metamodel.gyro.Child#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Target</em>'.
	 * @see org.gyro.metamodel.gyro.Child#getTarget()
	 * @see #getChild()
	 * @generated
	 */
	EReference getChild_Target();

	/**
	 * Returns the meta object for class '{@link org.gyro.metamodel.gyro.Sibling <em>Sibling</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sibling</em>'.
	 * @see org.gyro.metamodel.gyro.Sibling
	 * @generated
	 */
	EClass getSibling();

	/**
	 * Returns the meta object for the reference list '{@link org.gyro.metamodel.gyro.Sibling#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Source</em>'.
	 * @see org.gyro.metamodel.gyro.Sibling#getSource()
	 * @see #getSibling()
	 * @generated
	 */
	EReference getSibling_Source();

	/**
	 * Returns the meta object for the reference list '{@link org.gyro.metamodel.gyro.Sibling#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Target</em>'.
	 * @see org.gyro.metamodel.gyro.Sibling#getTarget()
	 * @see #getSibling()
	 * @generated
	 */
	EReference getSibling_Target();

	/**
	 * Returns the meta object for class '{@link org.gyro.metamodel.gyro.Behavior <em>Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Behavior</em>'.
	 * @see org.gyro.metamodel.gyro.Behavior
	 * @generated
	 */
	EClass getBehavior();

	/**
	 * Returns the meta object for class '{@link org.gyro.metamodel.gyro.Priority <em>Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Priority</em>'.
	 * @see org.gyro.metamodel.gyro.Priority
	 * @generated
	 */
	EClass getPriority();

	/**
	 * Returns the meta object for class '{@link org.gyro.metamodel.gyro.Parallel <em>Parallel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parallel</em>'.
	 * @see org.gyro.metamodel.gyro.Parallel
	 * @generated
	 */
	EClass getParallel();

	/**
	 * Returns the meta object for class '{@link org.gyro.metamodel.gyro.Sequential <em>Sequential</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sequential</em>'.
	 * @see org.gyro.metamodel.gyro.Sequential
	 * @generated
	 */
	EClass getSequential();

	/**
	 * Returns the meta object for class '{@link org.gyro.metamodel.gyro.StatusChange <em>Status Change</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Status Change</em>'.
	 * @see org.gyro.metamodel.gyro.StatusChange
	 * @generated
	 */
	EClass getStatusChange();

	/**
	 * Returns the meta object for the attribute '{@link org.gyro.metamodel.gyro.StatusChange#getChangeSuccess <em>Change Success</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Change Success</em>'.
	 * @see org.gyro.metamodel.gyro.StatusChange#getChangeSuccess()
	 * @see #getStatusChange()
	 * @generated
	 */
	EAttribute getStatusChange_ChangeSuccess();

	/**
	 * Returns the meta object for the attribute '{@link org.gyro.metamodel.gyro.StatusChange#getChangeFailure <em>Change Failure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Change Failure</em>'.
	 * @see org.gyro.metamodel.gyro.StatusChange#getChangeFailure()
	 * @see #getStatusChange()
	 * @generated
	 */
	EAttribute getStatusChange_ChangeFailure();

	/**
	 * Returns the meta object for the attribute '{@link org.gyro.metamodel.gyro.StatusChange#getChangeRunning <em>Change Running</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Change Running</em>'.
	 * @see org.gyro.metamodel.gyro.StatusChange#getChangeRunning()
	 * @see #getStatusChange()
	 * @generated
	 */
	EAttribute getStatusChange_ChangeRunning();

	/**
	 * Returns the meta object for class '{@link org.gyro.metamodel.gyro.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see org.gyro.metamodel.gyro.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for class '{@link org.gyro.metamodel.gyro.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition</em>'.
	 * @see org.gyro.metamodel.gyro.Condition
	 * @generated
	 */
	EClass getCondition();

	/**
	 * Returns the meta object for class '{@link org.gyro.metamodel.gyro.Distance <em>Distance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Distance</em>'.
	 * @see org.gyro.metamodel.gyro.Distance
	 * @generated
	 */
	EClass getDistance();

	/**
	 * Returns the meta object for the attribute '{@link org.gyro.metamodel.gyro.Distance#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.gyro.metamodel.gyro.Distance#getValue()
	 * @see #getDistance()
	 * @generated
	 */
	EAttribute getDistance_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.gyro.metamodel.gyro.Distance#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see org.gyro.metamodel.gyro.Distance#getKind()
	 * @see #getDistance()
	 * @generated
	 */
	EAttribute getDistance_Kind();

	/**
	 * Returns the meta object for class '{@link org.gyro.metamodel.gyro.Bumpers <em>Bumpers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bumpers</em>'.
	 * @see org.gyro.metamodel.gyro.Bumpers
	 * @generated
	 */
	EClass getBumpers();

	/**
	 * Returns the meta object for the attribute '{@link org.gyro.metamodel.gyro.Bumpers#getBumperKind <em>Bumper Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bumper Kind</em>'.
	 * @see org.gyro.metamodel.gyro.Bumpers#getBumperKind()
	 * @see #getBumpers()
	 * @generated
	 */
	EAttribute getBumpers_BumperKind();

	/**
	 * Returns the meta object for class '{@link org.gyro.metamodel.gyro.Waiting <em>Waiting</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Waiting</em>'.
	 * @see org.gyro.metamodel.gyro.Waiting
	 * @generated
	 */
	EClass getWaiting();

	/**
	 * Returns the meta object for the attribute '{@link org.gyro.metamodel.gyro.Waiting#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time</em>'.
	 * @see org.gyro.metamodel.gyro.Waiting#getTime()
	 * @see #getWaiting()
	 * @generated
	 */
	EAttribute getWaiting_Time();

	/**
	 * Returns the meta object for class '{@link org.gyro.metamodel.gyro.Actuate <em>Actuate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actuate</em>'.
	 * @see org.gyro.metamodel.gyro.Actuate
	 * @generated
	 */
	EClass getActuate();

	/**
	 * Returns the meta object for class '{@link org.gyro.metamodel.gyro.Motor <em>Motor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Motor</em>'.
	 * @see org.gyro.metamodel.gyro.Motor
	 * @generated
	 */
	EClass getMotor();

	/**
	 * Returns the meta object for the attribute '{@link org.gyro.metamodel.gyro.Motor#getLeftMotor <em>Left Motor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Left Motor</em>'.
	 * @see org.gyro.metamodel.gyro.Motor#getLeftMotor()
	 * @see #getMotor()
	 * @generated
	 */
	EAttribute getMotor_LeftMotor();

	/**
	 * Returns the meta object for the attribute '{@link org.gyro.metamodel.gyro.Motor#getRightMotor <em>Right Motor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Right Motor</em>'.
	 * @see org.gyro.metamodel.gyro.Motor#getRightMotor()
	 * @see #getMotor()
	 * @generated
	 */
	EAttribute getMotor_RightMotor();

	/**
	 * Returns the meta object for class '{@link org.gyro.metamodel.gyro.Servo <em>Servo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Servo</em>'.
	 * @see org.gyro.metamodel.gyro.Servo
	 * @generated
	 */
	EClass getServo();

	/**
	 * Returns the meta object for the attribute '{@link org.gyro.metamodel.gyro.Servo#getMinimalPosition <em>Minimal Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minimal Position</em>'.
	 * @see org.gyro.metamodel.gyro.Servo#getMinimalPosition()
	 * @see #getServo()
	 * @generated
	 */
	EAttribute getServo_MinimalPosition();

	/**
	 * Returns the meta object for the attribute '{@link org.gyro.metamodel.gyro.Servo#getMaximalPosition <em>Maximal Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maximal Position</em>'.
	 * @see org.gyro.metamodel.gyro.Servo#getMaximalPosition()
	 * @see #getServo()
	 * @generated
	 */
	EAttribute getServo_MaximalPosition();

	/**
	 * Returns the meta object for the attribute '{@link org.gyro.metamodel.gyro.Servo#getStep <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Step</em>'.
	 * @see org.gyro.metamodel.gyro.Servo#getStep()
	 * @see #getServo()
	 * @generated
	 */
	EAttribute getServo_Step();

	/**
	 * Returns the meta object for class '{@link org.gyro.metamodel.gyro.LED <em>LED</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>LED</em>'.
	 * @see org.gyro.metamodel.gyro.LED
	 * @generated
	 */
	EClass getLED();

	/**
	 * Returns the meta object for the attribute '{@link org.gyro.metamodel.gyro.LED#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see org.gyro.metamodel.gyro.LED#getStatus()
	 * @see #getLED()
	 * @generated
	 */
	EAttribute getLED_Status();

	/**
	 * Returns the meta object for enum '{@link org.gyro.metamodel.gyro.LightStatus <em>Light Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Light Status</em>'.
	 * @see org.gyro.metamodel.gyro.LightStatus
	 * @generated
	 */
	EEnum getLightStatus();

	/**
	 * Returns the meta object for enum '{@link org.gyro.metamodel.gyro.SuccessState <em>Success State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Success State</em>'.
	 * @see org.gyro.metamodel.gyro.SuccessState
	 * @generated
	 */
	EEnum getSuccessState();

	/**
	 * Returns the meta object for enum '{@link org.gyro.metamodel.gyro.FailureState <em>Failure State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Failure State</em>'.
	 * @see org.gyro.metamodel.gyro.FailureState
	 * @generated
	 */
	EEnum getFailureState();

	/**
	 * Returns the meta object for enum '{@link org.gyro.metamodel.gyro.RunningState <em>Running State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Running State</em>'.
	 * @see org.gyro.metamodel.gyro.RunningState
	 * @generated
	 */
	EEnum getRunningState();

	/**
	 * Returns the meta object for enum '{@link org.gyro.metamodel.gyro.BumperKind <em>Bumper Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Bumper Kind</em>'.
	 * @see org.gyro.metamodel.gyro.BumperKind
	 * @generated
	 */
	EEnum getBumperKind();

	/**
	 * Returns the meta object for enum '{@link org.gyro.metamodel.gyro.DistanceKind <em>Distance Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Distance Kind</em>'.
	 * @see org.gyro.metamodel.gyro.DistanceKind
	 * @generated
	 */
	EEnum getDistanceKind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GyroFactory getGyroFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.gyro.metamodel.gyro.impl.GyroSpecificationImpl <em>Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gyro.metamodel.gyro.impl.GyroSpecificationImpl
		 * @see org.gyro.metamodel.gyro.impl.GyroPackageImpl#getGyroSpecification()
		 * @generated
		 */
		EClass GYRO_SPECIFICATION = eINSTANCE.getGyroSpecification();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GYRO_SPECIFICATION__NAME = eINSTANCE.getGyroSpecification_Name();

		/**
		 * The meta object literal for the '<em><b>Nodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GYRO_SPECIFICATION__NODES = eINSTANCE.getGyroSpecification_Nodes();

		/**
		 * The meta object literal for the '<em><b>Child</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GYRO_SPECIFICATION__CHILD = eINSTANCE.getGyroSpecification_Child();

		/**
		 * The meta object literal for the '<em><b>Next</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GYRO_SPECIFICATION__NEXT = eINSTANCE.getGyroSpecification_Next();

		/**
		 * The meta object literal for the '{@link org.gyro.metamodel.gyro.impl.NodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gyro.metamodel.gyro.impl.NodeImpl
		 * @see org.gyro.metamodel.gyro.impl.GyroPackageImpl#getNode()
		 * @generated
		 */
		EClass NODE = eINSTANCE.getNode();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__NAME = eINSTANCE.getNode_Name();

		/**
		 * The meta object literal for the '{@link org.gyro.metamodel.gyro.impl.ChildImpl <em>Child</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gyro.metamodel.gyro.impl.ChildImpl
		 * @see org.gyro.metamodel.gyro.impl.GyroPackageImpl#getChild()
		 * @generated
		 */
		EClass CHILD = eINSTANCE.getChild();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHILD__SOURCE = eINSTANCE.getChild_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHILD__TARGET = eINSTANCE.getChild_Target();

		/**
		 * The meta object literal for the '{@link org.gyro.metamodel.gyro.impl.SiblingImpl <em>Sibling</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gyro.metamodel.gyro.impl.SiblingImpl
		 * @see org.gyro.metamodel.gyro.impl.GyroPackageImpl#getSibling()
		 * @generated
		 */
		EClass SIBLING = eINSTANCE.getSibling();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIBLING__SOURCE = eINSTANCE.getSibling_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIBLING__TARGET = eINSTANCE.getSibling_Target();

		/**
		 * The meta object literal for the '{@link org.gyro.metamodel.gyro.impl.BehaviorImpl <em>Behavior</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gyro.metamodel.gyro.impl.BehaviorImpl
		 * @see org.gyro.metamodel.gyro.impl.GyroPackageImpl#getBehavior()
		 * @generated
		 */
		EClass BEHAVIOR = eINSTANCE.getBehavior();

		/**
		 * The meta object literal for the '{@link org.gyro.metamodel.gyro.impl.PriorityImpl <em>Priority</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gyro.metamodel.gyro.impl.PriorityImpl
		 * @see org.gyro.metamodel.gyro.impl.GyroPackageImpl#getPriority()
		 * @generated
		 */
		EClass PRIORITY = eINSTANCE.getPriority();

		/**
		 * The meta object literal for the '{@link org.gyro.metamodel.gyro.impl.ParallelImpl <em>Parallel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gyro.metamodel.gyro.impl.ParallelImpl
		 * @see org.gyro.metamodel.gyro.impl.GyroPackageImpl#getParallel()
		 * @generated
		 */
		EClass PARALLEL = eINSTANCE.getParallel();

		/**
		 * The meta object literal for the '{@link org.gyro.metamodel.gyro.impl.SequentialImpl <em>Sequential</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gyro.metamodel.gyro.impl.SequentialImpl
		 * @see org.gyro.metamodel.gyro.impl.GyroPackageImpl#getSequential()
		 * @generated
		 */
		EClass SEQUENTIAL = eINSTANCE.getSequential();

		/**
		 * The meta object literal for the '{@link org.gyro.metamodel.gyro.impl.StatusChangeImpl <em>Status Change</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gyro.metamodel.gyro.impl.StatusChangeImpl
		 * @see org.gyro.metamodel.gyro.impl.GyroPackageImpl#getStatusChange()
		 * @generated
		 */
		EClass STATUS_CHANGE = eINSTANCE.getStatusChange();

		/**
		 * The meta object literal for the '<em><b>Change Success</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATUS_CHANGE__CHANGE_SUCCESS = eINSTANCE.getStatusChange_ChangeSuccess();

		/**
		 * The meta object literal for the '<em><b>Change Failure</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATUS_CHANGE__CHANGE_FAILURE = eINSTANCE.getStatusChange_ChangeFailure();

		/**
		 * The meta object literal for the '<em><b>Change Running</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATUS_CHANGE__CHANGE_RUNNING = eINSTANCE.getStatusChange_ChangeRunning();

		/**
		 * The meta object literal for the '{@link org.gyro.metamodel.gyro.impl.ActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gyro.metamodel.gyro.impl.ActionImpl
		 * @see org.gyro.metamodel.gyro.impl.GyroPackageImpl#getAction()
		 * @generated
		 */
		EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '{@link org.gyro.metamodel.gyro.impl.ConditionImpl <em>Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gyro.metamodel.gyro.impl.ConditionImpl
		 * @see org.gyro.metamodel.gyro.impl.GyroPackageImpl#getCondition()
		 * @generated
		 */
		EClass CONDITION = eINSTANCE.getCondition();

		/**
		 * The meta object literal for the '{@link org.gyro.metamodel.gyro.impl.DistanceImpl <em>Distance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gyro.metamodel.gyro.impl.DistanceImpl
		 * @see org.gyro.metamodel.gyro.impl.GyroPackageImpl#getDistance()
		 * @generated
		 */
		EClass DISTANCE = eINSTANCE.getDistance();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISTANCE__VALUE = eINSTANCE.getDistance_Value();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISTANCE__KIND = eINSTANCE.getDistance_Kind();

		/**
		 * The meta object literal for the '{@link org.gyro.metamodel.gyro.impl.BumpersImpl <em>Bumpers</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gyro.metamodel.gyro.impl.BumpersImpl
		 * @see org.gyro.metamodel.gyro.impl.GyroPackageImpl#getBumpers()
		 * @generated
		 */
		EClass BUMPERS = eINSTANCE.getBumpers();

		/**
		 * The meta object literal for the '<em><b>Bumper Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUMPERS__BUMPER_KIND = eINSTANCE.getBumpers_BumperKind();

		/**
		 * The meta object literal for the '{@link org.gyro.metamodel.gyro.impl.WaitingImpl <em>Waiting</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gyro.metamodel.gyro.impl.WaitingImpl
		 * @see org.gyro.metamodel.gyro.impl.GyroPackageImpl#getWaiting()
		 * @generated
		 */
		EClass WAITING = eINSTANCE.getWaiting();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WAITING__TIME = eINSTANCE.getWaiting_Time();

		/**
		 * The meta object literal for the '{@link org.gyro.metamodel.gyro.impl.ActuateImpl <em>Actuate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gyro.metamodel.gyro.impl.ActuateImpl
		 * @see org.gyro.metamodel.gyro.impl.GyroPackageImpl#getActuate()
		 * @generated
		 */
		EClass ACTUATE = eINSTANCE.getActuate();

		/**
		 * The meta object literal for the '{@link org.gyro.metamodel.gyro.impl.MotorImpl <em>Motor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gyro.metamodel.gyro.impl.MotorImpl
		 * @see org.gyro.metamodel.gyro.impl.GyroPackageImpl#getMotor()
		 * @generated
		 */
		EClass MOTOR = eINSTANCE.getMotor();

		/**
		 * The meta object literal for the '<em><b>Left Motor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOTOR__LEFT_MOTOR = eINSTANCE.getMotor_LeftMotor();

		/**
		 * The meta object literal for the '<em><b>Right Motor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOTOR__RIGHT_MOTOR = eINSTANCE.getMotor_RightMotor();

		/**
		 * The meta object literal for the '{@link org.gyro.metamodel.gyro.impl.ServoImpl <em>Servo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gyro.metamodel.gyro.impl.ServoImpl
		 * @see org.gyro.metamodel.gyro.impl.GyroPackageImpl#getServo()
		 * @generated
		 */
		EClass SERVO = eINSTANCE.getServo();

		/**
		 * The meta object literal for the '<em><b>Minimal Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVO__MINIMAL_POSITION = eINSTANCE.getServo_MinimalPosition();

		/**
		 * The meta object literal for the '<em><b>Maximal Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVO__MAXIMAL_POSITION = eINSTANCE.getServo_MaximalPosition();

		/**
		 * The meta object literal for the '<em><b>Step</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVO__STEP = eINSTANCE.getServo_Step();

		/**
		 * The meta object literal for the '{@link org.gyro.metamodel.gyro.impl.LEDImpl <em>LED</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gyro.metamodel.gyro.impl.LEDImpl
		 * @see org.gyro.metamodel.gyro.impl.GyroPackageImpl#getLED()
		 * @generated
		 */
		EClass LED = eINSTANCE.getLED();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LED__STATUS = eINSTANCE.getLED_Status();

		/**
		 * The meta object literal for the '{@link org.gyro.metamodel.gyro.LightStatus <em>Light Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gyro.metamodel.gyro.LightStatus
		 * @see org.gyro.metamodel.gyro.impl.GyroPackageImpl#getLightStatus()
		 * @generated
		 */
		EEnum LIGHT_STATUS = eINSTANCE.getLightStatus();

		/**
		 * The meta object literal for the '{@link org.gyro.metamodel.gyro.SuccessState <em>Success State</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gyro.metamodel.gyro.SuccessState
		 * @see org.gyro.metamodel.gyro.impl.GyroPackageImpl#getSuccessState()
		 * @generated
		 */
		EEnum SUCCESS_STATE = eINSTANCE.getSuccessState();

		/**
		 * The meta object literal for the '{@link org.gyro.metamodel.gyro.FailureState <em>Failure State</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gyro.metamodel.gyro.FailureState
		 * @see org.gyro.metamodel.gyro.impl.GyroPackageImpl#getFailureState()
		 * @generated
		 */
		EEnum FAILURE_STATE = eINSTANCE.getFailureState();

		/**
		 * The meta object literal for the '{@link org.gyro.metamodel.gyro.RunningState <em>Running State</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gyro.metamodel.gyro.RunningState
		 * @see org.gyro.metamodel.gyro.impl.GyroPackageImpl#getRunningState()
		 * @generated
		 */
		EEnum RUNNING_STATE = eINSTANCE.getRunningState();

		/**
		 * The meta object literal for the '{@link org.gyro.metamodel.gyro.BumperKind <em>Bumper Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gyro.metamodel.gyro.BumperKind
		 * @see org.gyro.metamodel.gyro.impl.GyroPackageImpl#getBumperKind()
		 * @generated
		 */
		EEnum BUMPER_KIND = eINSTANCE.getBumperKind();

		/**
		 * The meta object literal for the '{@link org.gyro.metamodel.gyro.DistanceKind <em>Distance Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gyro.metamodel.gyro.DistanceKind
		 * @see org.gyro.metamodel.gyro.impl.GyroPackageImpl#getDistanceKind()
		 * @generated
		 */
		EEnum DISTANCE_KIND = eINSTANCE.getDistanceKind();

	}

} //GyroPackage
