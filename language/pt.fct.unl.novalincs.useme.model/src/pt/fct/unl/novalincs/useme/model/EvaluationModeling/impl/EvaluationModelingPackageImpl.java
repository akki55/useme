/**
 */
package pt.fct.unl.novalincs.useme.model.EvaluationModeling.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import pt.fct.unl.novalincs.useme.model.ContextModeling.ContextModelingPackage;

import pt.fct.unl.novalincs.useme.model.ContextModeling.impl.ContextModelingPackageImpl;

import pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationContext;
import pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationDocumentation;
import pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationGoal;
import pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationModel;
import pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationModelingFactory;
import pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationModelingPackage;
import pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationSpecification;
import pt.fct.unl.novalincs.useme.model.EvaluationModeling.Language;
import pt.fct.unl.novalincs.useme.model.EvaluationModeling.Participant;
import pt.fct.unl.novalincs.useme.model.EvaluationModeling.TestModel;

import pt.fct.unl.novalincs.useme.model.GoalModeling.GoalModelingPackage;

import pt.fct.unl.novalincs.useme.model.GoalModeling.impl.GoalModelingPackageImpl;

import pt.fct.unl.novalincs.useme.model.InteractionModeling.InteractionModelingPackage;

import pt.fct.unl.novalincs.useme.model.InteractionModeling.impl.InteractionModelingPackageImpl;

import pt.fct.unl.novalincs.useme.model.ReportModeling.ReportModelingPackage;

import pt.fct.unl.novalincs.useme.model.ReportModeling.impl.ReportModelingPackageImpl;

import pt.fct.unl.novalincs.useme.model.SurveyModeling.SurveyModelingPackage;

import pt.fct.unl.novalincs.useme.model.SurveyModeling.impl.SurveyModelingPackageImpl;

import pt.fct.unl.novalincs.useme.model.UseMe.UseMePackage;

import pt.fct.unl.novalincs.useme.model.UseMe.impl.UseMePackageImpl;

import pt.fct.unl.novalincs.useme.model.Utility.UtilityPackage;

import pt.fct.unl.novalincs.useme.model.Utility.impl.UtilityPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EvaluationModelingPackageImpl extends EPackageImpl implements EvaluationModelingPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass evaluationSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass evaluationModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass evaluationGoalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass languageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass evaluationContextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass participantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass evaluationDocumentationEClass = null;

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
	 * @see pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationModelingPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private EvaluationModelingPackageImpl() {
		super(eNS_URI, EvaluationModelingFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link EvaluationModelingPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static EvaluationModelingPackage init() {
		if (isInited) return (EvaluationModelingPackage)EPackage.Registry.INSTANCE.getEPackage(EvaluationModelingPackage.eNS_URI);

		// Obtain or create and register package
		EvaluationModelingPackageImpl theEvaluationModelingPackage = (EvaluationModelingPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof EvaluationModelingPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new EvaluationModelingPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		UseMePackageImpl theUseMePackage = (UseMePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(UseMePackage.eNS_URI) instanceof UseMePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(UseMePackage.eNS_URI) : UseMePackage.eINSTANCE);
		ReportModelingPackageImpl theReportModelingPackage = (ReportModelingPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ReportModelingPackage.eNS_URI) instanceof ReportModelingPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ReportModelingPackage.eNS_URI) : ReportModelingPackage.eINSTANCE);
		InteractionModelingPackageImpl theInteractionModelingPackage = (InteractionModelingPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InteractionModelingPackage.eNS_URI) instanceof InteractionModelingPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InteractionModelingPackage.eNS_URI) : InteractionModelingPackage.eINSTANCE);
		SurveyModelingPackageImpl theSurveyModelingPackage = (SurveyModelingPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SurveyModelingPackage.eNS_URI) instanceof SurveyModelingPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SurveyModelingPackage.eNS_URI) : SurveyModelingPackage.eINSTANCE);
		GoalModelingPackageImpl theGoalModelingPackage = (GoalModelingPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(GoalModelingPackage.eNS_URI) instanceof GoalModelingPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(GoalModelingPackage.eNS_URI) : GoalModelingPackage.eINSTANCE);
		ContextModelingPackageImpl theContextModelingPackage = (ContextModelingPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ContextModelingPackage.eNS_URI) instanceof ContextModelingPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ContextModelingPackage.eNS_URI) : ContextModelingPackage.eINSTANCE);
		UtilityPackageImpl theUtilityPackage = (UtilityPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(UtilityPackage.eNS_URI) instanceof UtilityPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(UtilityPackage.eNS_URI) : UtilityPackage.eINSTANCE);

		// Create package meta-data objects
		theEvaluationModelingPackage.createPackageContents();
		theUseMePackage.createPackageContents();
		theReportModelingPackage.createPackageContents();
		theInteractionModelingPackage.createPackageContents();
		theSurveyModelingPackage.createPackageContents();
		theGoalModelingPackage.createPackageContents();
		theContextModelingPackage.createPackageContents();
		theUtilityPackage.createPackageContents();

		// Initialize created meta-data
		theEvaluationModelingPackage.initializePackageContents();
		theUseMePackage.initializePackageContents();
		theReportModelingPackage.initializePackageContents();
		theInteractionModelingPackage.initializePackageContents();
		theSurveyModelingPackage.initializePackageContents();
		theGoalModelingPackage.initializePackageContents();
		theContextModelingPackage.initializePackageContents();
		theUtilityPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theEvaluationModelingPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EvaluationModelingPackage.eNS_URI, theEvaluationModelingPackage);
		return theEvaluationModelingPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEvaluationSpecification() {
		return evaluationSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEvaluationSpecification_Name() {
		return (EAttribute)evaluationSpecificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEvaluationSpecification_EvaluationModel() {
		return (EReference)evaluationSpecificationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEvaluationSpecification_EvaluationGoal() {
		return (EReference)evaluationSpecificationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEvaluationSpecification_Participant() {
		return (EReference)evaluationSpecificationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEvaluationSpecification_Documentaton() {
		return (EReference)evaluationSpecificationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEvaluationSpecification_Language() {
		return (EReference)evaluationSpecificationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEvaluationSpecification_EvaluationContext() {
		return (EReference)evaluationSpecificationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEvaluationSpecification_Process() {
		return (EReference)evaluationSpecificationEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEvaluationSpecification_TestModel() {
		return (EReference)evaluationSpecificationEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEvaluationModel() {
		return evaluationModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEvaluationModel_Name() {
		return (EAttribute)evaluationModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEvaluationModel_EvaluationGoal() {
		return (EReference)evaluationModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEvaluationModel_EvaluationContext() {
		return (EReference)evaluationModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEvaluationModel_Language() {
		return (EReference)evaluationModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEvaluationModel_Process() {
		return (EReference)evaluationModelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEvaluationModel_TestModel() {
		return (EReference)evaluationModelEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEvaluationModel_Doc() {
		return (EReference)evaluationModelEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEvaluationModel_Participant() {
		return (EReference)evaluationModelEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEvaluationGoal() {
		return evaluationGoalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEvaluationGoal_Name() {
		return (EAttribute)evaluationGoalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEvaluationGoal_EvaluationModel() {
		return (EReference)evaluationGoalEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEvaluationGoal_Comperative() {
		return (EAttribute)evaluationGoalEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEvaluationGoal_Language() {
		return (EReference)evaluationGoalEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEvaluationGoal_ResearchQuestion() {
		return (EAttribute)evaluationGoalEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEvaluationGoal_UsabilityGoal() {
		return (EReference)evaluationGoalEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEvaluationGoal_Mesurment() {
		return (EReference)evaluationGoalEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEvaluationGoal_UsabilityRequirement() {
		return (EReference)evaluationGoalEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEvaluationGoal_Hypothesis() {
		return (EAttribute)evaluationGoalEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEvaluationGoal_Responsible() {
		return (EReference)evaluationGoalEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEvaluationGoal_ProblemDescription() {
		return (EAttribute)evaluationGoalEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLanguage() {
		return languageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLanguage_Name() {
		return (EAttribute)languageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLanguage_Version() {
		return (EAttribute)languageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLanguage_EvaluationModel() {
		return (EReference)languageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLanguage_DSL() {
		return (EReference)languageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEvaluationContext() {
		return evaluationContextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEvaluationContext_EvaluationModel() {
		return (EReference)evaluationContextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEvaluationContext_Scenario() {
		return (EReference)evaluationContextEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEvaluationContext_EnviromentInstance() {
		return (EAttribute)evaluationContextEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcess() {
		return processEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcess_Name() {
		return (EAttribute)processEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcess_EvaluationModel() {
		return (EReference)processEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcess_ProcessModel() {
		return (EReference)processEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTestModel() {
		return testModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestModel_Name() {
		return (EAttribute)testModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestModel_EvaluationModel() {
		return (EReference)testModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestModel_Participant() {
		return (EReference)testModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParticipant() {
		return participantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParticipant_Name() {
		return (EAttribute)participantEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParticipant_Contact() {
		return (EAttribute)participantEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParticipant_EvaluationModel() {
		return (EReference)participantEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParticipant_UserProfile() {
		return (EReference)participantEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEvaluationDocumentation() {
		return evaluationDocumentationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEvaluationDocumentation_EvaluationModel() {
		return (EReference)evaluationDocumentationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEvaluationDocumentation_Scenario() {
		return (EReference)evaluationDocumentationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEvaluationDocumentation_RelatedDocumentation() {
		return (EReference)evaluationDocumentationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvaluationModelingFactory getEvaluationModelingFactory() {
		return (EvaluationModelingFactory)getEFactoryInstance();
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
		evaluationSpecificationEClass = createEClass(EVALUATION_SPECIFICATION);
		createEAttribute(evaluationSpecificationEClass, EVALUATION_SPECIFICATION__NAME);
		createEReference(evaluationSpecificationEClass, EVALUATION_SPECIFICATION__EVALUATION_MODEL);
		createEReference(evaluationSpecificationEClass, EVALUATION_SPECIFICATION__EVALUATION_GOAL);
		createEReference(evaluationSpecificationEClass, EVALUATION_SPECIFICATION__PARTICIPANT);
		createEReference(evaluationSpecificationEClass, EVALUATION_SPECIFICATION__DOCUMENTATON);
		createEReference(evaluationSpecificationEClass, EVALUATION_SPECIFICATION__LANGUAGE);
		createEReference(evaluationSpecificationEClass, EVALUATION_SPECIFICATION__EVALUATION_CONTEXT);
		createEReference(evaluationSpecificationEClass, EVALUATION_SPECIFICATION__PROCESS);
		createEReference(evaluationSpecificationEClass, EVALUATION_SPECIFICATION__TEST_MODEL);

		evaluationModelEClass = createEClass(EVALUATION_MODEL);
		createEAttribute(evaluationModelEClass, EVALUATION_MODEL__NAME);
		createEReference(evaluationModelEClass, EVALUATION_MODEL__EVALUATION_GOAL);
		createEReference(evaluationModelEClass, EVALUATION_MODEL__EVALUATION_CONTEXT);
		createEReference(evaluationModelEClass, EVALUATION_MODEL__LANGUAGE);
		createEReference(evaluationModelEClass, EVALUATION_MODEL__PROCESS);
		createEReference(evaluationModelEClass, EVALUATION_MODEL__TEST_MODEL);
		createEReference(evaluationModelEClass, EVALUATION_MODEL__DOC);
		createEReference(evaluationModelEClass, EVALUATION_MODEL__PARTICIPANT);

		evaluationGoalEClass = createEClass(EVALUATION_GOAL);
		createEAttribute(evaluationGoalEClass, EVALUATION_GOAL__NAME);
		createEReference(evaluationGoalEClass, EVALUATION_GOAL__EVALUATION_MODEL);
		createEAttribute(evaluationGoalEClass, EVALUATION_GOAL__COMPERATIVE);
		createEReference(evaluationGoalEClass, EVALUATION_GOAL__LANGUAGE);
		createEAttribute(evaluationGoalEClass, EVALUATION_GOAL__RESEARCH_QUESTION);
		createEReference(evaluationGoalEClass, EVALUATION_GOAL__USABILITY_GOAL);
		createEReference(evaluationGoalEClass, EVALUATION_GOAL__MESURMENT);
		createEReference(evaluationGoalEClass, EVALUATION_GOAL__USABILITY_REQUIREMENT);
		createEAttribute(evaluationGoalEClass, EVALUATION_GOAL__HYPOTHESIS);
		createEReference(evaluationGoalEClass, EVALUATION_GOAL__RESPONSIBLE);
		createEAttribute(evaluationGoalEClass, EVALUATION_GOAL__PROBLEM_DESCRIPTION);

		languageEClass = createEClass(LANGUAGE);
		createEAttribute(languageEClass, LANGUAGE__NAME);
		createEAttribute(languageEClass, LANGUAGE__VERSION);
		createEReference(languageEClass, LANGUAGE__EVALUATION_MODEL);
		createEReference(languageEClass, LANGUAGE__DSL);

		evaluationContextEClass = createEClass(EVALUATION_CONTEXT);
		createEReference(evaluationContextEClass, EVALUATION_CONTEXT__EVALUATION_MODEL);
		createEReference(evaluationContextEClass, EVALUATION_CONTEXT__SCENARIO);
		createEAttribute(evaluationContextEClass, EVALUATION_CONTEXT__ENVIROMENT_INSTANCE);

		processEClass = createEClass(PROCESS);
		createEAttribute(processEClass, PROCESS__NAME);
		createEReference(processEClass, PROCESS__EVALUATION_MODEL);
		createEReference(processEClass, PROCESS__PROCESS_MODEL);

		testModelEClass = createEClass(TEST_MODEL);
		createEAttribute(testModelEClass, TEST_MODEL__NAME);
		createEReference(testModelEClass, TEST_MODEL__EVALUATION_MODEL);
		createEReference(testModelEClass, TEST_MODEL__PARTICIPANT);

		participantEClass = createEClass(PARTICIPANT);
		createEAttribute(participantEClass, PARTICIPANT__NAME);
		createEAttribute(participantEClass, PARTICIPANT__CONTACT);
		createEReference(participantEClass, PARTICIPANT__EVALUATION_MODEL);
		createEReference(participantEClass, PARTICIPANT__USER_PROFILE);

		evaluationDocumentationEClass = createEClass(EVALUATION_DOCUMENTATION);
		createEReference(evaluationDocumentationEClass, EVALUATION_DOCUMENTATION__EVALUATION_MODEL);
		createEReference(evaluationDocumentationEClass, EVALUATION_DOCUMENTATION__SCENARIO);
		createEReference(evaluationDocumentationEClass, EVALUATION_DOCUMENTATION__RELATED_DOCUMENTATION);
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

		// Obtain other dependent packages
		GoalModelingPackage theGoalModelingPackage = (GoalModelingPackage)EPackage.Registry.INSTANCE.getEPackage(GoalModelingPackage.eNS_URI);
		UtilityPackage theUtilityPackage = (UtilityPackage)EPackage.Registry.INSTANCE.getEPackage(UtilityPackage.eNS_URI);
		ContextModelingPackage theContextModelingPackage = (ContextModelingPackage)EPackage.Registry.INSTANCE.getEPackage(ContextModelingPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		evaluationContextEClass.getESuperTypes().add(theGoalModelingPackage.getScope());
		evaluationDocumentationEClass.getESuperTypes().add(theUtilityPackage.getDocumentation());

		// Initialize classes, features, and operations; add parameters
		initEClass(evaluationSpecificationEClass, EvaluationSpecification.class, "EvaluationSpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEvaluationSpecification_Name(), ecorePackage.getEString(), "name", null, 0, 1, EvaluationSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEvaluationSpecification_EvaluationModel(), this.getEvaluationModel(), null, "evaluationModel", null, 0, -1, EvaluationSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEvaluationSpecification_EvaluationGoal(), this.getEvaluationGoal(), null, "evaluationGoal", null, 0, -1, EvaluationSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEvaluationSpecification_Participant(), this.getParticipant(), null, "participant", null, 0, -1, EvaluationSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEvaluationSpecification_Documentaton(), this.getEvaluationDocumentation(), null, "documentaton", null, 0, -1, EvaluationSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEvaluationSpecification_Language(), this.getLanguage(), null, "language", null, 0, -1, EvaluationSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEvaluationSpecification_EvaluationContext(), this.getEvaluationContext(), null, "evaluationContext", null, 0, -1, EvaluationSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEvaluationSpecification_Process(), this.getProcess(), null, "process", null, 0, -1, EvaluationSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEvaluationSpecification_TestModel(), this.getTestModel(), null, "testModel", null, 0, -1, EvaluationSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(evaluationModelEClass, EvaluationModel.class, "EvaluationModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEvaluationModel_Name(), ecorePackage.getEString(), "name", null, 0, 1, EvaluationModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEvaluationModel_EvaluationGoal(), this.getEvaluationGoal(), this.getEvaluationGoal_EvaluationModel(), "evaluationGoal", null, 1, -1, EvaluationModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getEvaluationModel_EvaluationContext(), this.getEvaluationContext(), this.getEvaluationContext_EvaluationModel(), "evaluationContext", null, 1, 1, EvaluationModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getEvaluationModel_Language(), this.getLanguage(), this.getLanguage_EvaluationModel(), "language", null, 1, -1, EvaluationModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getEvaluationModel_Process(), this.getProcess(), this.getProcess_EvaluationModel(), "process", null, 1, -1, EvaluationModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getEvaluationModel_TestModel(), this.getTestModel(), this.getTestModel_EvaluationModel(), "testModel", null, 1, -1, EvaluationModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getEvaluationModel_Doc(), this.getEvaluationDocumentation(), null, "doc", null, 0, -1, EvaluationModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getEvaluationModel_Participant(), this.getParticipant(), this.getParticipant_EvaluationModel(), "participant", null, 1, -1, EvaluationModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(evaluationGoalEClass, EvaluationGoal.class, "EvaluationGoal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEvaluationGoal_Name(), ecorePackage.getEString(), "name", null, 0, 1, EvaluationGoal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEvaluationGoal_EvaluationModel(), this.getEvaluationModel(), this.getEvaluationModel_EvaluationGoal(), "evaluationModel", null, 1, 1, EvaluationGoal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getEvaluationGoal_Comperative(), ecorePackage.getEBoolean(), "comperative", "false", 1, 1, EvaluationGoal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEvaluationGoal_Language(), this.getLanguage(), null, "language", null, 0, -1, EvaluationGoal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEvaluationGoal_ResearchQuestion(), ecorePackage.getEString(), "researchQuestion", null, 0, -1, EvaluationGoal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getEvaluationGoal_UsabilityGoal(), theGoalModelingPackage.getUsabilityGoal(), theGoalModelingPackage.getUsabilityGoal_EvaluationGoal(), "usabilityGoal", null, 1, -1, EvaluationGoal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getEvaluationGoal_Mesurment(), theGoalModelingPackage.getMethod(), null, "mesurment", null, 0, -1, EvaluationGoal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getEvaluationGoal_UsabilityRequirement(), theGoalModelingPackage.getUsabilityRequirement(), null, "usabilityRequirement", null, 0, 1, EvaluationGoal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEvaluationGoal_Hypothesis(), ecorePackage.getEString(), "hypothesis", null, 0, -1, EvaluationGoal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getEvaluationGoal_Responsible(), theGoalModelingPackage.getActor(), null, "responsible", null, 0, 1, EvaluationGoal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEvaluationGoal_ProblemDescription(), ecorePackage.getEString(), "problemDescription", null, 0, 1, EvaluationGoal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(languageEClass, Language.class, "Language", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLanguage_Name(), ecorePackage.getEString(), "name", null, 0, 1, Language.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLanguage_Version(), ecorePackage.getEString(), "version", null, 1, 1, Language.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getLanguage_EvaluationModel(), this.getEvaluationModel(), this.getEvaluationModel_Language(), "evaluationModel", null, 0, -1, Language.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getLanguage_DSL(), theUtilityPackage.getDSL(), null, "DSL", null, 0, 1, Language.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(evaluationContextEClass, EvaluationContext.class, "EvaluationContext", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEvaluationContext_EvaluationModel(), this.getEvaluationModel(), this.getEvaluationModel_EvaluationContext(), "evaluationModel", null, 1, 1, EvaluationContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getEvaluationContext_Scenario(), theContextModelingPackage.getScenario(), null, "scenario", null, 0, -1, EvaluationContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEvaluationContext_EnviromentInstance(), ecorePackage.getEString(), "enviromentInstance", null, 0, -1, EvaluationContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(processEClass, pt.fct.unl.novalincs.useme.model.EvaluationModeling.Process.class, "Process", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProcess_Name(), ecorePackage.getEString(), "name", null, 0, 1, pt.fct.unl.novalincs.useme.model.EvaluationModeling.Process.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcess_EvaluationModel(), this.getEvaluationModel(), this.getEvaluationModel_Process(), "evaluationModel", null, 1, 1, pt.fct.unl.novalincs.useme.model.EvaluationModeling.Process.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getProcess_ProcessModel(), theUtilityPackage.getProcessModel(), theUtilityPackage.getProcessModel_EvaluationProcess(), "processModel", null, 0, 1, pt.fct.unl.novalincs.useme.model.EvaluationModeling.Process.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(testModelEClass, TestModel.class, "TestModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTestModel_Name(), ecorePackage.getEString(), "name", null, 0, 1, TestModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTestModel_EvaluationModel(), this.getEvaluationModel(), this.getEvaluationModel_TestModel(), "evaluationModel", null, 1, -1, TestModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTestModel_Participant(), this.getParticipant(), null, "participant", null, 0, -1, TestModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(participantEClass, Participant.class, "Participant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParticipant_Name(), ecorePackage.getEString(), "name", null, 0, 1, Participant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParticipant_Contact(), ecorePackage.getEString(), "contact", null, 1, -1, Participant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getParticipant_EvaluationModel(), this.getEvaluationModel(), this.getEvaluationModel_Participant(), "evaluationModel", null, 1, -1, Participant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getParticipant_UserProfile(), theContextModelingPackage.getUserProfile(), theContextModelingPackage.getUserProfile_Participant(), "userProfile", null, 1, -1, Participant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(evaluationDocumentationEClass, EvaluationDocumentation.class, "EvaluationDocumentation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEvaluationDocumentation_EvaluationModel(), this.getEvaluationModel(), null, "evaluationModel", null, 0, 1, EvaluationDocumentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getEvaluationDocumentation_Scenario(), theContextModelingPackage.getScenario(), null, "scenario", null, 0, -1, EvaluationDocumentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getEvaluationDocumentation_RelatedDocumentation(), theUtilityPackage.getDocumentation(), null, "relatedDocumentation", null, 0, -1, EvaluationDocumentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //EvaluationModelingPackageImpl
