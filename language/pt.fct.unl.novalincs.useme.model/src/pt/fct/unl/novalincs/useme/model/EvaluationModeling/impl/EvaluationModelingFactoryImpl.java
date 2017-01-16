/**
 */
package pt.fct.unl.novalincs.useme.model.EvaluationModeling.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import pt.fct.unl.novalincs.useme.model.EvaluationModeling.Documentation;
import pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationContext;
import pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationGoal;
import pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationModel;
import pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationModelingFactory;
import pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationModelingPackage;
import pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationSpecification;
import pt.fct.unl.novalincs.useme.model.EvaluationModeling.Language;
import pt.fct.unl.novalincs.useme.model.EvaluationModeling.Participant;
import pt.fct.unl.novalincs.useme.model.EvaluationModeling.TestModel;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EvaluationModelingFactoryImpl extends EFactoryImpl implements EvaluationModelingFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EvaluationModelingFactory init() {
		try {
			EvaluationModelingFactory theEvaluationModelingFactory = (EvaluationModelingFactory)EPackage.Registry.INSTANCE.getEFactory(EvaluationModelingPackage.eNS_URI);
			if (theEvaluationModelingFactory != null) {
				return theEvaluationModelingFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EvaluationModelingFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvaluationModelingFactoryImpl() {
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
			case EvaluationModelingPackage.EVALUATION_SPECIFICATION: return createEvaluationSpecification();
			case EvaluationModelingPackage.EVALUATION_MODEL: return createEvaluationModel();
			case EvaluationModelingPackage.EVALUATION_GOAL: return createEvaluationGoal();
			case EvaluationModelingPackage.LANGUAGE: return createLanguage();
			case EvaluationModelingPackage.EVALUATION_CONTEXT: return createEvaluationContext();
			case EvaluationModelingPackage.DOCUMENTATION: return createDocumentation();
			case EvaluationModelingPackage.PROCESS: return createProcess();
			case EvaluationModelingPackage.TEST_MODEL: return createTestModel();
			case EvaluationModelingPackage.PARTICIPANT: return createParticipant();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvaluationSpecification createEvaluationSpecification() {
		EvaluationSpecificationImpl evaluationSpecification = new EvaluationSpecificationImpl();
		return evaluationSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvaluationModel createEvaluationModel() {
		EvaluationModelImpl evaluationModel = new EvaluationModelImpl();
		return evaluationModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvaluationGoal createEvaluationGoal() {
		EvaluationGoalImpl evaluationGoal = new EvaluationGoalImpl();
		return evaluationGoal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Language createLanguage() {
		LanguageImpl language = new LanguageImpl();
		return language;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvaluationContext createEvaluationContext() {
		EvaluationContextImpl evaluationContext = new EvaluationContextImpl();
		return evaluationContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Documentation createDocumentation() {
		DocumentationImpl documentation = new DocumentationImpl();
		return documentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public pt.fct.unl.novalincs.useme.model.EvaluationModeling.Process createProcess() {
		ProcessImpl process = new ProcessImpl();
		return process;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestModel createTestModel() {
		TestModelImpl testModel = new TestModelImpl();
		return testModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Participant createParticipant() {
		ParticipantImpl participant = new ParticipantImpl();
		return participant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvaluationModelingPackage getEvaluationModelingPackage() {
		return (EvaluationModelingPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EvaluationModelingPackage getPackage() {
		return EvaluationModelingPackage.eINSTANCE;
	}

} //EvaluationModelingFactoryImpl
