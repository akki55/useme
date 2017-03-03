/**
 */
package pt.fct.unl.novalincs.useme.model.InteractionModeling.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import pt.fct.unl.novalincs.useme.model.InteractionModeling.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class InteractionModelingFactoryImpl extends EFactoryImpl implements InteractionModelingFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static InteractionModelingFactory init() {
		try {
			InteractionModelingFactory theInteractionModelingFactory = (InteractionModelingFactory)EPackage.Registry.INSTANCE.getEFactory(InteractionModelingPackage.eNS_URI);
			if (theInteractionModelingFactory != null) {
				return theInteractionModelingFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new InteractionModelingFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionModelingFactoryImpl() {
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
			case InteractionModelingPackage.INTERACTION_SPECIFICATION: return createInteractionSpecification();
			case InteractionModelingPackage.INTERACTION_MODEL: return createInteractionModel();
			case InteractionModelingPackage.INTERACTION_SYNTAX: return createInteractionSyntax();
			case InteractionModelingPackage.TASK: return createTask();
			case InteractionModelingPackage.EVENT: return createEvent();
			case InteractionModelingPackage.INTERACTION_RESULT: return createInteractionResult();
			case InteractionModelingPackage.CAPTURE_ACTION: return createCaptureAction();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionSpecification createInteractionSpecification() {
		InteractionSpecificationImpl interactionSpecification = new InteractionSpecificationImpl();
		return interactionSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionModel createInteractionModel() {
		InteractionModelImpl interactionModel = new InteractionModelImpl();
		return interactionModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionSyntax createInteractionSyntax() {
		InteractionSyntaxImpl interactionSyntax = new InteractionSyntaxImpl();
		return interactionSyntax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task createTask() {
		TaskImpl task = new TaskImpl();
		return task;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Event createEvent() {
		EventImpl event = new EventImpl();
		return event;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionResult createInteractionResult() {
		InteractionResultImpl interactionResult = new InteractionResultImpl();
		return interactionResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CaptureAction createCaptureAction() {
		CaptureActionImpl captureAction = new CaptureActionImpl();
		return captureAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionModelingPackage getInteractionModelingPackage() {
		return (InteractionModelingPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static InteractionModelingPackage getPackage() {
		return InteractionModelingPackage.eINSTANCE;
	}

} //InteractionModelingFactoryImpl
