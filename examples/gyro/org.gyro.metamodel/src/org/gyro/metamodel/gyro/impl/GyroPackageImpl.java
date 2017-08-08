/**
 */
package org.gyro.metamodel.gyro.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.gyro.metamodel.gyro.Action;
import org.gyro.metamodel.gyro.Actuate;
import org.gyro.metamodel.gyro.Behavior;
import org.gyro.metamodel.gyro.BumperKind;
import org.gyro.metamodel.gyro.Bumpers;
import org.gyro.metamodel.gyro.Child;
import org.gyro.metamodel.gyro.Condition;
import org.gyro.metamodel.gyro.Distance;
import org.gyro.metamodel.gyro.DistanceKind;
import org.gyro.metamodel.gyro.FailureState;
import org.gyro.metamodel.gyro.GyroFactory;
import org.gyro.metamodel.gyro.GyroPackage;
import org.gyro.metamodel.gyro.GyroSpecification;
import org.gyro.metamodel.gyro.LightStatus;
import org.gyro.metamodel.gyro.Motor;
import org.gyro.metamodel.gyro.Node;
import org.gyro.metamodel.gyro.Parallel;
import org.gyro.metamodel.gyro.Priority;
import org.gyro.metamodel.gyro.RunningState;
import org.gyro.metamodel.gyro.Sequential;
import org.gyro.metamodel.gyro.Servo;
import org.gyro.metamodel.gyro.Sibling;
import org.gyro.metamodel.gyro.StatusChange;
import org.gyro.metamodel.gyro.SuccessState;
import org.gyro.metamodel.gyro.Waiting;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GyroPackageImpl extends EPackageImpl implements GyroPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gyroSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass childEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass siblingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass behaviorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass priorityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parallelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sequentialEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass statusChangeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass distanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bumpersEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass waitingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actuateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass motorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass servoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ledEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum lightStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum successStateEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum failureStateEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum runningStateEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum bumperKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum distanceKindEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.gyro.metamodel.gyro.GyroPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private GyroPackageImpl() {
		super(eNS_URI, GyroFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link GyroPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static GyroPackage init() {
		if (isInited) return (GyroPackage)EPackage.Registry.INSTANCE.getEPackage(GyroPackage.eNS_URI);

		// Obtain or create and register package
		GyroPackageImpl theGyroPackage = (GyroPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof GyroPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new GyroPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theGyroPackage.createPackageContents();

		// Initialize created meta-data
		theGyroPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theGyroPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(GyroPackage.eNS_URI, theGyroPackage);
		return theGyroPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGyroSpecification() {
		return gyroSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGyroSpecification_Name() {
		return (EAttribute)gyroSpecificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGyroSpecification_Nodes() {
		return (EReference)gyroSpecificationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGyroSpecification_Child() {
		return (EReference)gyroSpecificationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGyroSpecification_Next() {
		return (EReference)gyroSpecificationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNode() {
		return nodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNode_Name() {
		return (EAttribute)nodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChild() {
		return childEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChild_Source() {
		return (EReference)childEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChild_Target() {
		return (EReference)childEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSibling() {
		return siblingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSibling_Source() {
		return (EReference)siblingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSibling_Target() {
		return (EReference)siblingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBehavior() {
		return behaviorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPriority() {
		return priorityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParallel() {
		return parallelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSequential() {
		return sequentialEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStatusChange() {
		return statusChangeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStatusChange_ChangeSuccess() {
		return (EAttribute)statusChangeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStatusChange_ChangeFailure() {
		return (EAttribute)statusChangeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStatusChange_ChangeRunning() {
		return (EAttribute)statusChangeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAction() {
		return actionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCondition() {
		return conditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDistance() {
		return distanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDistance_Value() {
		return (EAttribute)distanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDistance_Kind() {
		return (EAttribute)distanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBumpers() {
		return bumpersEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBumpers_BumperKind() {
		return (EAttribute)bumpersEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWaiting() {
		return waitingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWaiting_Time() {
		return (EAttribute)waitingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActuate() {
		return actuateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMotor() {
		return motorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMotor_LeftMotor() {
		return (EAttribute)motorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMotor_RightMotor() {
		return (EAttribute)motorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServo() {
		return servoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServo_MinimalPosition() {
		return (EAttribute)servoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServo_MaximalPosition() {
		return (EAttribute)servoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServo_Step() {
		return (EAttribute)servoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLED() {
		return ledEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLED_Status() {
		return (EAttribute)ledEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLightStatus() {
		return lightStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSuccessState() {
		return successStateEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFailureState() {
		return failureStateEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRunningState() {
		return runningStateEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getBumperKind() {
		return bumperKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDistanceKind() {
		return distanceKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GyroFactory getGyroFactory() {
		return (GyroFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		gyroSpecificationEClass = createEClass(GYRO_SPECIFICATION);
		createEAttribute(gyroSpecificationEClass, GYRO_SPECIFICATION__NAME);
		createEReference(gyroSpecificationEClass, GYRO_SPECIFICATION__NODES);
		createEReference(gyroSpecificationEClass, GYRO_SPECIFICATION__CHILD);
		createEReference(gyroSpecificationEClass, GYRO_SPECIFICATION__NEXT);

		nodeEClass = createEClass(NODE);
		createEAttribute(nodeEClass, NODE__NAME);

		childEClass = createEClass(CHILD);
		createEReference(childEClass, CHILD__SOURCE);
		createEReference(childEClass, CHILD__TARGET);

		siblingEClass = createEClass(SIBLING);
		createEReference(siblingEClass, SIBLING__SOURCE);
		createEReference(siblingEClass, SIBLING__TARGET);

		behaviorEClass = createEClass(BEHAVIOR);

		priorityEClass = createEClass(PRIORITY);

		parallelEClass = createEClass(PARALLEL);

		sequentialEClass = createEClass(SEQUENTIAL);

		statusChangeEClass = createEClass(STATUS_CHANGE);
		createEAttribute(statusChangeEClass, STATUS_CHANGE__CHANGE_SUCCESS);
		createEAttribute(statusChangeEClass, STATUS_CHANGE__CHANGE_FAILURE);
		createEAttribute(statusChangeEClass, STATUS_CHANGE__CHANGE_RUNNING);

		actionEClass = createEClass(ACTION);

		conditionEClass = createEClass(CONDITION);

		distanceEClass = createEClass(DISTANCE);
		createEAttribute(distanceEClass, DISTANCE__VALUE);
		createEAttribute(distanceEClass, DISTANCE__KIND);

		bumpersEClass = createEClass(BUMPERS);
		createEAttribute(bumpersEClass, BUMPERS__BUMPER_KIND);

		waitingEClass = createEClass(WAITING);
		createEAttribute(waitingEClass, WAITING__TIME);

		actuateEClass = createEClass(ACTUATE);

		motorEClass = createEClass(MOTOR);
		createEAttribute(motorEClass, MOTOR__LEFT_MOTOR);
		createEAttribute(motorEClass, MOTOR__RIGHT_MOTOR);

		servoEClass = createEClass(SERVO);
		createEAttribute(servoEClass, SERVO__MINIMAL_POSITION);
		createEAttribute(servoEClass, SERVO__MAXIMAL_POSITION);
		createEAttribute(servoEClass, SERVO__STEP);

		ledEClass = createEClass(LED);
		createEAttribute(ledEClass, LED__STATUS);

		// Create enums
		lightStatusEEnum = createEEnum(LIGHT_STATUS);
		successStateEEnum = createEEnum(SUCCESS_STATE);
		failureStateEEnum = createEEnum(FAILURE_STATE);
		runningStateEEnum = createEEnum(RUNNING_STATE);
		bumperKindEEnum = createEEnum(BUMPER_KIND);
		distanceKindEEnum = createEEnum(DISTANCE_KIND);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		behaviorEClass.getESuperTypes().add(this.getNode());
		priorityEClass.getESuperTypes().add(this.getBehavior());
		parallelEClass.getESuperTypes().add(this.getBehavior());
		sequentialEClass.getESuperTypes().add(this.getBehavior());
		statusChangeEClass.getESuperTypes().add(this.getBehavior());
		actionEClass.getESuperTypes().add(this.getNode());
		conditionEClass.getESuperTypes().add(this.getAction());
		distanceEClass.getESuperTypes().add(this.getCondition());
		bumpersEClass.getESuperTypes().add(this.getCondition());
		waitingEClass.getESuperTypes().add(this.getCondition());
		actuateEClass.getESuperTypes().add(this.getAction());
		motorEClass.getESuperTypes().add(this.getActuate());
		servoEClass.getESuperTypes().add(this.getActuate());
		ledEClass.getESuperTypes().add(this.getActuate());

		// Initialize classes and features; add operations and parameters
		initEClass(gyroSpecificationEClass, GyroSpecification.class, "GyroSpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGyroSpecification_Name(), ecorePackage.getEString(), "name", null, 1, 1, GyroSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGyroSpecification_Nodes(), this.getNode(), null, "nodes", null, 0, -1, GyroSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGyroSpecification_Child(), this.getChild(), null, "child", null, 0, -1, GyroSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGyroSpecification_Next(), this.getSibling(), null, "next", null, 0, -1, GyroSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nodeEClass, Node.class, "Node", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNode_Name(), ecorePackage.getEString(), "name", null, 1, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(childEClass, Child.class, "Child", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getChild_Source(), this.getBehavior(), null, "source", null, 0, -1, Child.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChild_Target(), this.getNode(), null, "target", null, 0, -1, Child.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(siblingEClass, Sibling.class, "Sibling", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSibling_Source(), this.getNode(), null, "source", null, 0, -1, Sibling.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSibling_Target(), this.getNode(), null, "target", null, 0, -1, Sibling.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(behaviorEClass, Behavior.class, "Behavior", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(priorityEClass, Priority.class, "Priority", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(parallelEClass, Parallel.class, "Parallel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sequentialEClass, Sequential.class, "Sequential", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(statusChangeEClass, StatusChange.class, "StatusChange", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStatusChange_ChangeSuccess(), this.getSuccessState(), "changeSuccess", "Success", 0, 1, StatusChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStatusChange_ChangeFailure(), this.getFailureState(), "changeFailure", "Failure", 0, 1, StatusChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStatusChange_ChangeRunning(), this.getRunningState(), "changeRunning", "Running", 0, 1, StatusChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actionEClass, Action.class, "Action", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(conditionEClass, Condition.class, "Condition", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(distanceEClass, Distance.class, "Distance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDistance_Value(), ecorePackage.getEInt(), "value", "300", 0, 1, Distance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDistance_Kind(), this.getDistanceKind(), "kind", "Major", 0, 1, Distance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bumpersEClass, Bumpers.class, "Bumpers", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBumpers_BumperKind(), this.getBumperKind(), "bumperKind", "Left", 0, 1, Bumpers.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(waitingEClass, Waiting.class, "Waiting", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWaiting_Time(), ecorePackage.getEInt(), "time", "1", 0, 1, Waiting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actuateEClass, Actuate.class, "Actuate", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(motorEClass, Motor.class, "Motor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMotor_LeftMotor(), ecorePackage.getEInt(), "leftMotor", "255", 0, 1, Motor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMotor_RightMotor(), ecorePackage.getEInt(), "rightMotor", "255", 0, 1, Motor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(servoEClass, Servo.class, "Servo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getServo_MinimalPosition(), ecorePackage.getEInt(), "minimalPosition", "0", 0, 1, Servo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServo_MaximalPosition(), ecorePackage.getEInt(), "maximalPosition", "160", 0, 1, Servo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServo_Step(), ecorePackage.getEInt(), "step", "10", 0, 1, Servo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ledEClass, org.gyro.metamodel.gyro.LED.class, "LED", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLED_Status(), this.getLightStatus(), "status", "On", 0, 1, org.gyro.metamodel.gyro.LED.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(lightStatusEEnum, LightStatus.class, "LightStatus");
		addEEnumLiteral(lightStatusEEnum, LightStatus.ON);
		addEEnumLiteral(lightStatusEEnum, LightStatus.OFF);

		initEEnum(successStateEEnum, SuccessState.class, "SuccessState");
		addEEnumLiteral(successStateEEnum, SuccessState.SUCCESS);
		addEEnumLiteral(successStateEEnum, SuccessState.FAILURE);
		addEEnumLiteral(successStateEEnum, SuccessState.RUNNING);

		initEEnum(failureStateEEnum, FailureState.class, "FailureState");
		addEEnumLiteral(failureStateEEnum, FailureState.FAILURE);
		addEEnumLiteral(failureStateEEnum, FailureState.SUCCESS);
		addEEnumLiteral(failureStateEEnum, FailureState.RUNNING);

		initEEnum(runningStateEEnum, RunningState.class, "RunningState");
		addEEnumLiteral(runningStateEEnum, RunningState.SUCCESS);
		addEEnumLiteral(runningStateEEnum, RunningState.FAILURE);
		addEEnumLiteral(runningStateEEnum, RunningState.RUNNING);

		initEEnum(bumperKindEEnum, BumperKind.class, "BumperKind");
		addEEnumLiteral(bumperKindEEnum, BumperKind.LEFT);
		addEEnumLiteral(bumperKindEEnum, BumperKind.RIGHT);

		initEEnum(distanceKindEEnum, DistanceKind.class, "DistanceKind");
		addEEnumLiteral(distanceKindEEnum, DistanceKind.MINOR);
		addEEnumLiteral(distanceKindEEnum, DistanceKind.MAJOR);

		// Create resource
		createResource(eNS_URI);
	}

} //GyroPackageImpl
