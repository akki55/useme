/**
 */
package pt.fct.unl.novalincs.useme.model.ContextModeling.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import pt.fct.unl.novalincs.useme.model.ContextModeling.ContextEnvironment;
import pt.fct.unl.novalincs.useme.model.ContextModeling.ContextModel;
import pt.fct.unl.novalincs.useme.model.ContextModeling.ContextModelingFactory;
import pt.fct.unl.novalincs.useme.model.ContextModeling.ContextModelingPackage;
import pt.fct.unl.novalincs.useme.model.ContextModeling.ContextSpecification;
import pt.fct.unl.novalincs.useme.model.ContextModeling.EnviromentSpecification;
import pt.fct.unl.novalincs.useme.model.ContextModeling.PhysicalEnvironment;
import pt.fct.unl.novalincs.useme.model.ContextModeling.Scenario;
import pt.fct.unl.novalincs.useme.model.ContextModeling.SocialEnvironment;
import pt.fct.unl.novalincs.useme.model.ContextModeling.TechnicalEnvironment;
import pt.fct.unl.novalincs.useme.model.ContextModeling.UserHierarchy;
import pt.fct.unl.novalincs.useme.model.ContextModeling.UserProfile;
import pt.fct.unl.novalincs.useme.model.ContextModeling.UserProfileSpecification;
import pt.fct.unl.novalincs.useme.model.ContextModeling.Workflow;
import pt.fct.unl.novalincs.useme.model.ContextModeling.WorkflowSpecification;

import pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationModelingPackage;

import pt.fct.unl.novalincs.useme.model.EvaluationModeling.impl.EvaluationModelingPackageImpl;

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
public class ContextModelingPackageImpl extends EPackageImpl implements ContextModelingPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contextSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userProfileSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workflowSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enviromentSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contextModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass technicalEnvironmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass physicalEnvironmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass socialEnvironmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workflowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contextEnvironmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userProfileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scenarioEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userHierarchyEClass = null;

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
	 * @see pt.fct.unl.novalincs.useme.model.ContextModeling.ContextModelingPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ContextModelingPackageImpl() {
		super(eNS_URI, ContextModelingFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ContextModelingPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ContextModelingPackage init() {
		if (isInited) return (ContextModelingPackage)EPackage.Registry.INSTANCE.getEPackage(ContextModelingPackage.eNS_URI);

		// Obtain or create and register package
		ContextModelingPackageImpl theContextModelingPackage = (ContextModelingPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ContextModelingPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ContextModelingPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		UseMePackageImpl theUseMePackage = (UseMePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(UseMePackage.eNS_URI) instanceof UseMePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(UseMePackage.eNS_URI) : UseMePackage.eINSTANCE);
		ReportModelingPackageImpl theReportModelingPackage = (ReportModelingPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ReportModelingPackage.eNS_URI) instanceof ReportModelingPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ReportModelingPackage.eNS_URI) : ReportModelingPackage.eINSTANCE);
		InteractionModelingPackageImpl theInteractionModelingPackage = (InteractionModelingPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InteractionModelingPackage.eNS_URI) instanceof InteractionModelingPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InteractionModelingPackage.eNS_URI) : InteractionModelingPackage.eINSTANCE);
		SurveyModelingPackageImpl theSurveyModelingPackage = (SurveyModelingPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SurveyModelingPackage.eNS_URI) instanceof SurveyModelingPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SurveyModelingPackage.eNS_URI) : SurveyModelingPackage.eINSTANCE);
		EvaluationModelingPackageImpl theEvaluationModelingPackage = (EvaluationModelingPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EvaluationModelingPackage.eNS_URI) instanceof EvaluationModelingPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EvaluationModelingPackage.eNS_URI) : EvaluationModelingPackage.eINSTANCE);
		GoalModelingPackageImpl theGoalModelingPackage = (GoalModelingPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(GoalModelingPackage.eNS_URI) instanceof GoalModelingPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(GoalModelingPackage.eNS_URI) : GoalModelingPackage.eINSTANCE);
		UtilityPackageImpl theUtilityPackage = (UtilityPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(UtilityPackage.eNS_URI) instanceof UtilityPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(UtilityPackage.eNS_URI) : UtilityPackage.eINSTANCE);

		// Create package meta-data objects
		theContextModelingPackage.createPackageContents();
		theUseMePackage.createPackageContents();
		theReportModelingPackage.createPackageContents();
		theInteractionModelingPackage.createPackageContents();
		theSurveyModelingPackage.createPackageContents();
		theEvaluationModelingPackage.createPackageContents();
		theGoalModelingPackage.createPackageContents();
		theUtilityPackage.createPackageContents();

		// Initialize created meta-data
		theContextModelingPackage.initializePackageContents();
		theUseMePackage.initializePackageContents();
		theReportModelingPackage.initializePackageContents();
		theInteractionModelingPackage.initializePackageContents();
		theSurveyModelingPackage.initializePackageContents();
		theEvaluationModelingPackage.initializePackageContents();
		theGoalModelingPackage.initializePackageContents();
		theUtilityPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theContextModelingPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ContextModelingPackage.eNS_URI, theContextModelingPackage);
		return theContextModelingPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContextSpecification() {
		return contextSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContextSpecification_Name() {
		return (EAttribute)contextSpecificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContextSpecification_ContextModel() {
		return (EReference)contextSpecificationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContextSpecification_UserProfileSpecification() {
		return (EReference)contextSpecificationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContextSpecification_EnviromentSpecification() {
		return (EReference)contextSpecificationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContextSpecification_WorkflowSpecification() {
		return (EReference)contextSpecificationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUserProfileSpecification() {
		return userProfileSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserProfileSpecification_Name() {
		return (EAttribute)userProfileSpecificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUserProfileSpecification_UserProfile() {
		return (EReference)userProfileSpecificationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUserProfileSpecification_ProfileTemplate() {
		return (EReference)userProfileSpecificationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUserProfileSpecification_LogicalExpression() {
		return (EReference)userProfileSpecificationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWorkflowSpecification() {
		return workflowSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWorkflowSpecification_Name() {
		return (EAttribute)workflowSpecificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkflowSpecification_Workflow() {
		return (EReference)workflowSpecificationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkflowSpecification_Scenario() {
		return (EReference)workflowSpecificationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkflowSpecification_Task() {
		return (EReference)workflowSpecificationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnviromentSpecification() {
		return enviromentSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnviromentSpecification_Name() {
		return (EAttribute)enviromentSpecificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnviromentSpecification_TechnicalEnvironment() {
		return (EReference)enviromentSpecificationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnviromentSpecification_PhysicalEnvironment() {
		return (EReference)enviromentSpecificationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnviromentSpecification_SocialEnvironment() {
		return (EReference)enviromentSpecificationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnviromentSpecification_EnviromentalVariable() {
		return (EReference)enviromentSpecificationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContextModel() {
		return contextModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContextModel_CmName() {
		return (EAttribute)contextModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContextModel_Domain() {
		return (EAttribute)contextModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContextModel_ContextEnvironment() {
		return (EReference)contextModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContextModel_Language() {
		return (EReference)contextModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContextModel_Workflow() {
		return (EReference)contextModelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContextModel_UserHierarchy() {
		return (EReference)contextModelEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContextModel_ContextProvider() {
		return (EAttribute)contextModelEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTechnicalEnvironment() {
		return technicalEnvironmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPhysicalEnvironment() {
		return physicalEnvironmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSocialEnvironment() {
		return socialEnvironmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWorkflow() {
		return workflowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWorkflow_Name() {
		return (EAttribute)workflowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWorkflow_Priority() {
		return (EAttribute)workflowEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkflow_Actor() {
		return (EReference)workflowEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkflow_ContextElement() {
		return (EReference)workflowEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkflow_Scenario() {
		return (EReference)workflowEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkflow_ProcessModel() {
		return (EReference)workflowEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkflow_ContextModel() {
		return (EReference)workflowEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContextEnvironment() {
		return contextEnvironmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContextEnvironment_Name() {
		return (EAttribute)contextEnvironmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContextEnvironment_ContextModel() {
		return (EReference)contextEnvironmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContextEnvironment_CeElement() {
		return (EReference)contextEnvironmentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContextEnvironment_OutsideRef() {
		return (EReference)contextEnvironmentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUserProfile() {
		return userProfileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserProfile_Name() {
		return (EAttribute)userProfileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUserProfile_BackgroundQs() {
		return (EReference)userProfileEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserProfile_Priority() {
		return (EAttribute)userProfileEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUserProfile_Parent() {
		return (EReference)userProfileEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUserProfile_SubProfile() {
		return (EReference)userProfileEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUserProfile_Participant() {
		return (EReference)userProfileEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUserProfile_UserHierarchy() {
		return (EReference)userProfileEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUserProfile_ProfileTemplate() {
		return (EReference)userProfileEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUserProfile_Classifier() {
		return (EReference)userProfileEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScenario() {
		return scenarioEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScenario_Name() {
		return (EAttribute)scenarioEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScenario_Priority() {
		return (EAttribute)scenarioEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScenario_EvaluatedTask() {
		return (EReference)scenarioEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScenario_Doc() {
		return (EReference)scenarioEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScenario_Aggregates() {
		return (EReference)scenarioEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScenario_Question() {
		return (EReference)scenarioEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUserHierarchy() {
		return userHierarchyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUserHierarchy_UserProfile() {
		return (EReference)userHierarchyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUserHierarchy_ContextModel() {
		return (EReference)userHierarchyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserHierarchy_UhDescription() {
		return (EAttribute)userHierarchyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContextModelingFactory getContextModelingFactory() {
		return (ContextModelingFactory)getEFactoryInstance();
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
		contextSpecificationEClass = createEClass(CONTEXT_SPECIFICATION);
		createEAttribute(contextSpecificationEClass, CONTEXT_SPECIFICATION__NAME);
		createEReference(contextSpecificationEClass, CONTEXT_SPECIFICATION__CONTEXT_MODEL);
		createEReference(contextSpecificationEClass, CONTEXT_SPECIFICATION__USER_PROFILE_SPECIFICATION);
		createEReference(contextSpecificationEClass, CONTEXT_SPECIFICATION__ENVIROMENT_SPECIFICATION);
		createEReference(contextSpecificationEClass, CONTEXT_SPECIFICATION__WORKFLOW_SPECIFICATION);

		userProfileSpecificationEClass = createEClass(USER_PROFILE_SPECIFICATION);
		createEAttribute(userProfileSpecificationEClass, USER_PROFILE_SPECIFICATION__NAME);
		createEReference(userProfileSpecificationEClass, USER_PROFILE_SPECIFICATION__USER_PROFILE);
		createEReference(userProfileSpecificationEClass, USER_PROFILE_SPECIFICATION__PROFILE_TEMPLATE);
		createEReference(userProfileSpecificationEClass, USER_PROFILE_SPECIFICATION__LOGICAL_EXPRESSION);

		workflowSpecificationEClass = createEClass(WORKFLOW_SPECIFICATION);
		createEAttribute(workflowSpecificationEClass, WORKFLOW_SPECIFICATION__NAME);
		createEReference(workflowSpecificationEClass, WORKFLOW_SPECIFICATION__WORKFLOW);
		createEReference(workflowSpecificationEClass, WORKFLOW_SPECIFICATION__SCENARIO);
		createEReference(workflowSpecificationEClass, WORKFLOW_SPECIFICATION__TASK);

		enviromentSpecificationEClass = createEClass(ENVIROMENT_SPECIFICATION);
		createEAttribute(enviromentSpecificationEClass, ENVIROMENT_SPECIFICATION__NAME);
		createEReference(enviromentSpecificationEClass, ENVIROMENT_SPECIFICATION__TECHNICAL_ENVIRONMENT);
		createEReference(enviromentSpecificationEClass, ENVIROMENT_SPECIFICATION__PHYSICAL_ENVIRONMENT);
		createEReference(enviromentSpecificationEClass, ENVIROMENT_SPECIFICATION__SOCIAL_ENVIRONMENT);
		createEReference(enviromentSpecificationEClass, ENVIROMENT_SPECIFICATION__ENVIROMENTAL_VARIABLE);

		contextModelEClass = createEClass(CONTEXT_MODEL);
		createEAttribute(contextModelEClass, CONTEXT_MODEL__CM_NAME);
		createEAttribute(contextModelEClass, CONTEXT_MODEL__DOMAIN);
		createEReference(contextModelEClass, CONTEXT_MODEL__CONTEXT_ENVIRONMENT);
		createEReference(contextModelEClass, CONTEXT_MODEL__LANGUAGE);
		createEReference(contextModelEClass, CONTEXT_MODEL__WORKFLOW);
		createEReference(contextModelEClass, CONTEXT_MODEL__USER_HIERARCHY);
		createEAttribute(contextModelEClass, CONTEXT_MODEL__CONTEXT_PROVIDER);

		technicalEnvironmentEClass = createEClass(TECHNICAL_ENVIRONMENT);

		physicalEnvironmentEClass = createEClass(PHYSICAL_ENVIRONMENT);

		socialEnvironmentEClass = createEClass(SOCIAL_ENVIRONMENT);

		workflowEClass = createEClass(WORKFLOW);
		createEAttribute(workflowEClass, WORKFLOW__NAME);
		createEAttribute(workflowEClass, WORKFLOW__PRIORITY);
		createEReference(workflowEClass, WORKFLOW__ACTOR);
		createEReference(workflowEClass, WORKFLOW__CONTEXT_ELEMENT);
		createEReference(workflowEClass, WORKFLOW__SCENARIO);
		createEReference(workflowEClass, WORKFLOW__PROCESS_MODEL);
		createEReference(workflowEClass, WORKFLOW__CONTEXT_MODEL);

		contextEnvironmentEClass = createEClass(CONTEXT_ENVIRONMENT);
		createEAttribute(contextEnvironmentEClass, CONTEXT_ENVIRONMENT__NAME);
		createEReference(contextEnvironmentEClass, CONTEXT_ENVIRONMENT__CONTEXT_MODEL);
		createEReference(contextEnvironmentEClass, CONTEXT_ENVIRONMENT__CE_ELEMENT);
		createEReference(contextEnvironmentEClass, CONTEXT_ENVIRONMENT__OUTSIDE_REF);

		userProfileEClass = createEClass(USER_PROFILE);
		createEAttribute(userProfileEClass, USER_PROFILE__NAME);
		createEReference(userProfileEClass, USER_PROFILE__BACKGROUND_QS);
		createEAttribute(userProfileEClass, USER_PROFILE__PRIORITY);
		createEReference(userProfileEClass, USER_PROFILE__PARENT);
		createEReference(userProfileEClass, USER_PROFILE__SUB_PROFILE);
		createEReference(userProfileEClass, USER_PROFILE__PARTICIPANT);
		createEReference(userProfileEClass, USER_PROFILE__USER_HIERARCHY);
		createEReference(userProfileEClass, USER_PROFILE__PROFILE_TEMPLATE);
		createEReference(userProfileEClass, USER_PROFILE__CLASSIFIER);

		scenarioEClass = createEClass(SCENARIO);
		createEAttribute(scenarioEClass, SCENARIO__NAME);
		createEAttribute(scenarioEClass, SCENARIO__PRIORITY);
		createEReference(scenarioEClass, SCENARIO__EVALUATED_TASK);
		createEReference(scenarioEClass, SCENARIO__DOC);
		createEReference(scenarioEClass, SCENARIO__AGGREGATES);
		createEReference(scenarioEClass, SCENARIO__QUESTION);

		userHierarchyEClass = createEClass(USER_HIERARCHY);
		createEReference(userHierarchyEClass, USER_HIERARCHY__USER_PROFILE);
		createEReference(userHierarchyEClass, USER_HIERARCHY__CONTEXT_MODEL);
		createEAttribute(userHierarchyEClass, USER_HIERARCHY__UH_DESCRIPTION);
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
		UtilityPackage theUtilityPackage = (UtilityPackage)EPackage.Registry.INSTANCE.getEPackage(UtilityPackage.eNS_URI);
		InteractionModelingPackage theInteractionModelingPackage = (InteractionModelingPackage)EPackage.Registry.INSTANCE.getEPackage(InteractionModelingPackage.eNS_URI);
		SurveyModelingPackage theSurveyModelingPackage = (SurveyModelingPackage)EPackage.Registry.INSTANCE.getEPackage(SurveyModelingPackage.eNS_URI);
		EvaluationModelingPackage theEvaluationModelingPackage = (EvaluationModelingPackage)EPackage.Registry.INSTANCE.getEPackage(EvaluationModelingPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		technicalEnvironmentEClass.getESuperTypes().add(this.getContextEnvironment());
		physicalEnvironmentEClass.getESuperTypes().add(this.getContextEnvironment());
		socialEnvironmentEClass.getESuperTypes().add(this.getContextEnvironment());

		// Initialize classes, features, and operations; add parameters
		initEClass(contextSpecificationEClass, ContextSpecification.class, "ContextSpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getContextSpecification_Name(), ecorePackage.getEString(), "name", null, 0, 1, ContextSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContextSpecification_ContextModel(), this.getContextModel(), null, "contextModel", null, 0, -1, ContextSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContextSpecification_UserProfileSpecification(), this.getUserProfileSpecification(), null, "userProfileSpecification", null, 0, -1, ContextSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContextSpecification_EnviromentSpecification(), this.getEnviromentSpecification(), null, "enviromentSpecification", null, 0, -1, ContextSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContextSpecification_WorkflowSpecification(), this.getWorkflowSpecification(), null, "workflowSpecification", null, 0, -1, ContextSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(userProfileSpecificationEClass, UserProfileSpecification.class, "UserProfileSpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUserProfileSpecification_Name(), ecorePackage.getEString(), "name", null, 0, 1, UserProfileSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUserProfileSpecification_UserProfile(), this.getUserProfile(), null, "userProfile", null, 0, -1, UserProfileSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUserProfileSpecification_ProfileTemplate(), theUtilityPackage.getProfileTemplate(), null, "profileTemplate", null, 0, -1, UserProfileSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUserProfileSpecification_LogicalExpression(), theUtilityPackage.getLogicalExpression(), null, "logicalExpression", null, 0, -1, UserProfileSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(workflowSpecificationEClass, WorkflowSpecification.class, "WorkflowSpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWorkflowSpecification_Name(), ecorePackage.getEString(), "name", null, 0, 1, WorkflowSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorkflowSpecification_Workflow(), this.getWorkflow(), null, "workflow", null, 1, -1, WorkflowSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorkflowSpecification_Scenario(), this.getScenario(), null, "scenario", null, 0, -1, WorkflowSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorkflowSpecification_Task(), theInteractionModelingPackage.getTask(), null, "task", null, 0, -1, WorkflowSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(enviromentSpecificationEClass, EnviromentSpecification.class, "EnviromentSpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEnviromentSpecification_Name(), ecorePackage.getEString(), "name", null, 0, 1, EnviromentSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEnviromentSpecification_TechnicalEnvironment(), this.getTechnicalEnvironment(), null, "technicalEnvironment", null, 0, -1, EnviromentSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEnviromentSpecification_PhysicalEnvironment(), this.getPhysicalEnvironment(), null, "physicalEnvironment", null, 0, -1, EnviromentSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEnviromentSpecification_SocialEnvironment(), this.getSocialEnvironment(), null, "socialEnvironment", null, 0, -1, EnviromentSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEnviromentSpecification_EnviromentalVariable(), theUtilityPackage.getCEVariable(), null, "enviromentalVariable", null, 0, -1, EnviromentSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(contextModelEClass, ContextModel.class, "ContextModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getContextModel_CmName(), ecorePackage.getEString(), "cmName", null, 1, 1, ContextModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getContextModel_Domain(), ecorePackage.getEString(), "domain", null, 1, 1, ContextModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getContextModel_ContextEnvironment(), this.getContextEnvironment(), this.getContextEnvironment_ContextModel(), "contextEnvironment", null, 1, -1, ContextModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getContextModel_Language(), theUtilityPackage.getDSL(), theUtilityPackage.getDSL_ContextModel(), "language", null, 0, 1, ContextModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getContextModel_Workflow(), this.getWorkflow(), this.getWorkflow_ContextModel(), "workflow", null, 0, -1, ContextModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getContextModel_UserHierarchy(), this.getUserHierarchy(), this.getUserHierarchy_ContextModel(), "userHierarchy", null, 1, 1, ContextModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getContextModel_ContextProvider(), ecorePackage.getEString(), "contextProvider", null, 1, -1, ContextModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(technicalEnvironmentEClass, TechnicalEnvironment.class, "TechnicalEnvironment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(physicalEnvironmentEClass, PhysicalEnvironment.class, "PhysicalEnvironment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(socialEnvironmentEClass, SocialEnvironment.class, "SocialEnvironment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(workflowEClass, Workflow.class, "Workflow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWorkflow_Name(), ecorePackage.getEString(), "name", null, 0, 1, Workflow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getWorkflow_Priority(), theUtilityPackage.getPriorityValue(), "priority", null, 1, 1, Workflow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorkflow_Actor(), this.getUserProfile(), null, "actor", null, 0, -1, Workflow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorkflow_ContextElement(), theUtilityPackage.getCEVariable(), null, "contextElement", null, 0, -1, Workflow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorkflow_Scenario(), this.getScenario(), null, "scenario", null, 0, -1, Workflow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getWorkflow_ProcessModel(), theUtilityPackage.getProcessModel(), theUtilityPackage.getProcessModel_Workflow(), "processModel", null, 0, -1, Workflow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getWorkflow_ContextModel(), this.getContextModel(), this.getContextModel_Workflow(), "contextModel", null, 0, -1, Workflow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(contextEnvironmentEClass, ContextEnvironment.class, "ContextEnvironment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getContextEnvironment_Name(), ecorePackage.getEString(), "name", null, 0, 1, ContextEnvironment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContextEnvironment_ContextModel(), this.getContextModel(), this.getContextModel_ContextEnvironment(), "contextModel", null, 0, -1, ContextEnvironment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getContextEnvironment_CeElement(), theUtilityPackage.getCEVariable(), null, "ceElement", null, 1, -1, ContextEnvironment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getContextEnvironment_OutsideRef(), theUtilityPackage.getOutsideRef(), null, "outsideRef", null, 0, 1, ContextEnvironment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(userProfileEClass, UserProfile.class, "UserProfile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUserProfile_Name(), ecorePackage.getEString(), "name", null, 0, 1, UserProfile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getUserProfile_BackgroundQs(), theSurveyModelingPackage.getBackgroundQs(), theSurveyModelingPackage.getBackgroundQs_UserProfile(), "backgroundQs", null, 0, -1, UserProfile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getUserProfile_Priority(), theUtilityPackage.getPriorityValue(), "priority", null, 1, 1, UserProfile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getUserProfile_Parent(), this.getUserProfile(), this.getUserProfile_SubProfile(), "parent", null, 0, -1, UserProfile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getUserProfile_SubProfile(), this.getUserProfile(), this.getUserProfile_Parent(), "subProfile", null, 0, -1, UserProfile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getUserProfile_Participant(), theEvaluationModelingPackage.getParticipant(), theEvaluationModelingPackage.getParticipant_UserProfile(), "participant", null, 0, -1, UserProfile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getUserProfile_UserHierarchy(), this.getUserHierarchy(), this.getUserHierarchy_UserProfile(), "userHierarchy", null, 0, 1, UserProfile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getUserProfile_ProfileTemplate(), theUtilityPackage.getProfileTemplate(), null, "profileTemplate", null, 0, -1, UserProfile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getUserProfile_Classifier(), theUtilityPackage.getLogicalExpression(), null, "classifier", null, 0, -1, UserProfile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(scenarioEClass, Scenario.class, "Scenario", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getScenario_Name(), ecorePackage.getEString(), "name", null, 0, 1, Scenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getScenario_Priority(), theUtilityPackage.getPriorityValue(), "priority", "High", 1, 1, Scenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getScenario_EvaluatedTask(), theInteractionModelingPackage.getTask(), theInteractionModelingPackage.getTask_Scenario(), "evaluatedTask", null, 0, -1, Scenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getScenario_Doc(), theUtilityPackage.getDocumentation(), null, "doc", null, 0, -1, Scenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getScenario_Aggregates(), this.getScenario(), null, "aggregates", null, 0, -1, Scenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScenario_Question(), theSurveyModelingPackage.getFeedbackQs(), theSurveyModelingPackage.getFeedbackQs_Scenario(), "question", null, 0, -1, Scenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(userHierarchyEClass, UserHierarchy.class, "UserHierarchy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUserHierarchy_UserProfile(), this.getUserProfile(), this.getUserProfile_UserHierarchy(), "userProfile", null, 0, 1, UserHierarchy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getUserHierarchy_ContextModel(), this.getContextModel(), this.getContextModel_UserHierarchy(), "contextModel", null, 1, 1, UserHierarchy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getUserHierarchy_UhDescription(), ecorePackage.getEString(), "uhDescription", null, 0, 1, UserHierarchy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
	}

} //ContextModelingPackageImpl
