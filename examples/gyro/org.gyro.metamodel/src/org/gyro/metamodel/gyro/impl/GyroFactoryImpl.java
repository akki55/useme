/**
 */
package org.gyro.metamodel.gyro.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.gyro.metamodel.gyro.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GyroFactoryImpl extends EFactoryImpl implements GyroFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GyroFactory init() {
		try {
			GyroFactory theGyroFactory = (GyroFactory)EPackage.Registry.INSTANCE.getEFactory(GyroPackage.eNS_URI);
			if (theGyroFactory != null) {
				return theGyroFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new GyroFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GyroFactoryImpl() {
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
			case GyroPackage.GYRO_SPECIFICATION: return createGyroSpecification();
			case GyroPackage.CHILD: return createChild();
			case GyroPackage.SIBLING: return createSibling();
			case GyroPackage.PRIORITY: return createPriority();
			case GyroPackage.PARALLEL: return createParallel();
			case GyroPackage.SEQUENTIAL: return createSequential();
			case GyroPackage.STATUS_CHANGE: return createStatusChange();
			case GyroPackage.DISTANCE: return createDistance();
			case GyroPackage.BUMPERS: return createBumpers();
			case GyroPackage.WAITING: return createWaiting();
			case GyroPackage.MOTOR: return createMotor();
			case GyroPackage.SERVO: return createServo();
			case GyroPackage.LED: return createLED();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case GyroPackage.LIGHT_STATUS:
				return createLightStatusFromString(eDataType, initialValue);
			case GyroPackage.SUCCESS_STATE:
				return createSuccessStateFromString(eDataType, initialValue);
			case GyroPackage.FAILURE_STATE:
				return createFailureStateFromString(eDataType, initialValue);
			case GyroPackage.RUNNING_STATE:
				return createRunningStateFromString(eDataType, initialValue);
			case GyroPackage.BUMPER_KIND:
				return createBumperKindFromString(eDataType, initialValue);
			case GyroPackage.DISTANCE_KIND:
				return createDistanceKindFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case GyroPackage.LIGHT_STATUS:
				return convertLightStatusToString(eDataType, instanceValue);
			case GyroPackage.SUCCESS_STATE:
				return convertSuccessStateToString(eDataType, instanceValue);
			case GyroPackage.FAILURE_STATE:
				return convertFailureStateToString(eDataType, instanceValue);
			case GyroPackage.RUNNING_STATE:
				return convertRunningStateToString(eDataType, instanceValue);
			case GyroPackage.BUMPER_KIND:
				return convertBumperKindToString(eDataType, instanceValue);
			case GyroPackage.DISTANCE_KIND:
				return convertDistanceKindToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GyroSpecification createGyroSpecification() {
		GyroSpecificationImpl gyroSpecification = new GyroSpecificationImpl();
		return gyroSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Child createChild() {
		ChildImpl child = new ChildImpl();
		return child;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sibling createSibling() {
		SiblingImpl sibling = new SiblingImpl();
		return sibling;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Priority createPriority() {
		PriorityImpl priority = new PriorityImpl();
		return priority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parallel createParallel() {
		ParallelImpl parallel = new ParallelImpl();
		return parallel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sequential createSequential() {
		SequentialImpl sequential = new SequentialImpl();
		return sequential;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatusChange createStatusChange() {
		StatusChangeImpl statusChange = new StatusChangeImpl();
		return statusChange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Distance createDistance() {
		DistanceImpl distance = new DistanceImpl();
		return distance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bumpers createBumpers() {
		BumpersImpl bumpers = new BumpersImpl();
		return bumpers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Waiting createWaiting() {
		WaitingImpl waiting = new WaitingImpl();
		return waiting;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Motor createMotor() {
		MotorImpl motor = new MotorImpl();
		return motor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Servo createServo() {
		ServoImpl servo = new ServoImpl();
		return servo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LED createLED() {
		LEDImpl led = new LEDImpl();
		return led;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LightStatus createLightStatusFromString(EDataType eDataType, String initialValue) {
		LightStatus result = LightStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLightStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SuccessState createSuccessStateFromString(EDataType eDataType, String initialValue) {
		SuccessState result = SuccessState.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSuccessStateToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FailureState createFailureStateFromString(EDataType eDataType, String initialValue) {
		FailureState result = FailureState.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFailureStateToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RunningState createRunningStateFromString(EDataType eDataType, String initialValue) {
		RunningState result = RunningState.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRunningStateToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BumperKind createBumperKindFromString(EDataType eDataType, String initialValue) {
		BumperKind result = BumperKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBumperKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DistanceKind createDistanceKindFromString(EDataType eDataType, String initialValue) {
		DistanceKind result = DistanceKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDistanceKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GyroPackage getGyroPackage() {
		return (GyroPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static GyroPackage getPackage() {
		return GyroPackage.eINSTANCE;
	}

} //GyroFactoryImpl
