/**
 */
package pt.fct.unl.novalincs.useme.model.Utility.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import pt.fct.unl.novalincs.useme.model.ContextModeling.ContextModelingPackage;

import pt.fct.unl.novalincs.useme.model.ContextModeling.impl.ContextModelingPackageImpl;

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

import pt.fct.unl.novalincs.useme.model.Utility.AbstractSyntax;
import pt.fct.unl.novalincs.useme.model.Utility.CEVariable;
import pt.fct.unl.novalincs.useme.model.Utility.ConcreteSyntax;
import pt.fct.unl.novalincs.useme.model.Utility.Documentation;
import pt.fct.unl.novalincs.useme.model.Utility.ExistingGM;
import pt.fct.unl.novalincs.useme.model.Utility.FunctionalGoal;
import pt.fct.unl.novalincs.useme.model.Utility.LogicalExpression;
import pt.fct.unl.novalincs.useme.model.Utility.OutsideRef;
import pt.fct.unl.novalincs.useme.model.Utility.PriorityValue;
import pt.fct.unl.novalincs.useme.model.Utility.ProcessModel;
import pt.fct.unl.novalincs.useme.model.Utility.ProfileTemplate;
import pt.fct.unl.novalincs.useme.model.Utility.RecordInput;
import pt.fct.unl.novalincs.useme.model.Utility.Requirement;
import pt.fct.unl.novalincs.useme.model.Utility.SurveyEngine;
import pt.fct.unl.novalincs.useme.model.Utility.UtilityFactory;
import pt.fct.unl.novalincs.useme.model.Utility.UtilityPackage;
import pt.fct.unl.novalincs.useme.model.Utility.UtilitySpecification;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UtilityPackageImpl extends EPackageImpl implements UtilityPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass utilitySpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass surveyEngineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dslEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionalGoalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass existingGMEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ceVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass profileTemplateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass logicalExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass concreteSyntaxEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractSyntaxEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outsideRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requirementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum priorityValueEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum recordInputEEnum = null;

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
	 * @see pt.fct.unl.novalincs.useme.model.Utility.UtilityPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private UtilityPackageImpl() {
		super(eNS_URI, UtilityFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link UtilityPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static UtilityPackage init() {
		if (isInited) return (UtilityPackage)EPackage.Registry.INSTANCE.getEPackage(UtilityPackage.eNS_URI);

		// Obtain or create and register package
		UtilityPackageImpl theUtilityPackage = (UtilityPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof UtilityPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new UtilityPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		UseMePackageImpl theUseMePackage = (UseMePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(UseMePackage.eNS_URI) instanceof UseMePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(UseMePackage.eNS_URI) : UseMePackage.eINSTANCE);
		ReportModelingPackageImpl theReportModelingPackage = (ReportModelingPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ReportModelingPackage.eNS_URI) instanceof ReportModelingPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ReportModelingPackage.eNS_URI) : ReportModelingPackage.eINSTANCE);
		InteractionModelingPackageImpl theInteractionModelingPackage = (InteractionModelingPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InteractionModelingPackage.eNS_URI) instanceof InteractionModelingPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InteractionModelingPackage.eNS_URI) : InteractionModelingPackage.eINSTANCE);
		SurveyModelingPackageImpl theSurveyModelingPackage = (SurveyModelingPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SurveyModelingPackage.eNS_URI) instanceof SurveyModelingPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SurveyModelingPackage.eNS_URI) : SurveyModelingPackage.eINSTANCE);
		EvaluationModelingPackageImpl theEvaluationModelingPackage = (EvaluationModelingPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EvaluationModelingPackage.eNS_URI) instanceof EvaluationModelingPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EvaluationModelingPackage.eNS_URI) : EvaluationModelingPackage.eINSTANCE);
		GoalModelingPackageImpl theGoalModelingPackage = (GoalModelingPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(GoalModelingPackage.eNS_URI) instanceof GoalModelingPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(GoalModelingPackage.eNS_URI) : GoalModelingPackage.eINSTANCE);
		ContextModelingPackageImpl theContextModelingPackage = (ContextModelingPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ContextModelingPackage.eNS_URI) instanceof ContextModelingPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ContextModelingPackage.eNS_URI) : ContextModelingPackage.eINSTANCE);

		// Create package meta-data objects
		theUtilityPackage.createPackageContents();
		theUseMePackage.createPackageContents();
		theReportModelingPackage.createPackageContents();
		theInteractionModelingPackage.createPackageContents();
		theSurveyModelingPackage.createPackageContents();
		theEvaluationModelingPackage.createPackageContents();
		theGoalModelingPackage.createPackageContents();
		theContextModelingPackage.createPackageContents();

		// Initialize created meta-data
		theUtilityPackage.initializePackageContents();
		theUseMePackage.initializePackageContents();
		theReportModelingPackage.initializePackageContents();
		theInteractionModelingPackage.initializePackageContents();
		theSurveyModelingPackage.initializePackageContents();
		theEvaluationModelingPackage.initializePackageContents();
		theGoalModelingPackage.initializePackageContents();
		theContextModelingPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theUtilityPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(UtilityPackage.eNS_URI, theUtilityPackage);
		return theUtilityPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUtilitySpecification() {
		return utilitySpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUtilitySpecification_Name() {
		return (EAttribute)utilitySpecificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUtilitySpecification_DSL() {
		return (EReference)utilitySpecificationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUtilitySpecification_FunctionalGoal() {
		return (EReference)utilitySpecificationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUtilitySpecification_ProcessModel() {
		return (EReference)utilitySpecificationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUtilitySpecification_SurveyEngine() {
		return (EReference)utilitySpecificationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUtilitySpecification_Documentation() {
		return (EReference)utilitySpecificationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUtilitySpecification_OutsideRef() {
		return (EReference)utilitySpecificationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUtilitySpecification_Requirement() {
		return (EReference)utilitySpecificationEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSurveyEngine() {
		return surveyEngineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSurveyEngine_SurveyModel() {
		return (EReference)surveyEngineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDSL() {
		return dslEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDSL_ConcreteSyntax() {
		return (EReference)dslEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDSL_AbstractSyntax() {
		return (EReference)dslEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDSL_DslName() {
		return (EAttribute)dslEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDSL_ContextModel() {
		return (EReference)dslEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDSL_GoalModel() {
		return (EReference)dslEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDSL_EvaluationModel() {
		return (EReference)dslEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDSL_ExistingGoalModel() {
		return (EReference)dslEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDSL_Documentation() {
		return (EReference)dslEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcessModel() {
		return processModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcessModel_Name() {
		return (EAttribute)processModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessModel_Workflow() {
		return (EReference)processModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessModel_EvaluationProcess() {
		return (EReference)processModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessModel_OutsideRef() {
		return (EReference)processModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctionalGoal() {
		return functionalGoalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFunctionalGoal_Name() {
		return (EAttribute)functionalGoalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionalGoal_ExistingGM() {
		return (EReference)functionalGoalEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionalGoal_Requirements() {
		return (EReference)functionalGoalEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExistingGM() {
		return existingGMEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExistingGM_Name() {
		return (EAttribute)existingGMEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExistingGM_FunctionalGoal() {
		return (EReference)existingGMEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCEVariable() {
		return ceVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCEVariable_Name() {
		return (EAttribute)ceVariableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCEVariable_Mandatory() {
		return (EAttribute)ceVariableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCEVariable_Type() {
		return (EAttribute)ceVariableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCEVariable_ComposedElement() {
		return (EReference)ceVariableEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCEVariable_ContextEnviroment() {
		return (EReference)ceVariableEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProfileTemplate() {
		return profileTemplateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProfileTemplate_Name() {
		return (EAttribute)profileTemplateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProfileTemplate_Category() {
		return (EAttribute)profileTemplateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProfileTemplate_Classifiers() {
		return (EReference)profileTemplateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLogicalExpression() {
		return logicalExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLogicalExpression_Name() {
		return (EAttribute)logicalExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLogicalExpression_ClassifierName() {
		return (EAttribute)logicalExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLogicalExpression_Expression() {
		return (EAttribute)logicalExpressionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLogicalExpression_ProfileTemplate() {
		return (EReference)logicalExpressionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLogicalExpression_Question() {
		return (EReference)logicalExpressionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConcreteSyntax() {
		return concreteSyntaxEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConcreteSyntax_Name() {
		return (EAttribute)concreteSyntaxEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConcreteSyntax_Dsl() {
		return (EReference)concreteSyntaxEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConcreteSyntax_InteractionSyntax() {
		return (EReference)concreteSyntaxEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConcreteSyntax_OutsideRef() {
		return (EReference)concreteSyntaxEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractSyntax() {
		return abstractSyntaxEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractSyntax_Name() {
		return (EAttribute)abstractSyntaxEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractSyntax_Dsl() {
		return (EReference)abstractSyntaxEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractSyntax_InteractionSyntax() {
		return (EReference)abstractSyntaxEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractSyntax_OutsideRef() {
		return (EReference)abstractSyntaxEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOutsideRef() {
		return outsideRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutsideRef_Name() {
		return (EAttribute)outsideRefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutsideRef_Link() {
		return (EAttribute)outsideRefEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutsideRef_Tool() {
		return (EAttribute)outsideRefEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOutsideRef_OutsideRef() {
		return (EReference)outsideRefEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRequirement() {
		return requirementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequirement_Name() {
		return (EAttribute)requirementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequirement_Description() {
		return (EAttribute)requirementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentation() {
		return documentationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentation_Name() {
		return (EAttribute)documentationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentation_OutsideRef() {
		return (EReference)documentationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPriorityValue() {
		return priorityValueEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRecordInput() {
		return recordInputEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UtilityFactory getUtilityFactory() {
		return (UtilityFactory)getEFactoryInstance();
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
		utilitySpecificationEClass = createEClass(UTILITY_SPECIFICATION);
		createEAttribute(utilitySpecificationEClass, UTILITY_SPECIFICATION__NAME);
		createEReference(utilitySpecificationEClass, UTILITY_SPECIFICATION__DSL);
		createEReference(utilitySpecificationEClass, UTILITY_SPECIFICATION__FUNCTIONAL_GOAL);
		createEReference(utilitySpecificationEClass, UTILITY_SPECIFICATION__PROCESS_MODEL);
		createEReference(utilitySpecificationEClass, UTILITY_SPECIFICATION__SURVEY_ENGINE);
		createEReference(utilitySpecificationEClass, UTILITY_SPECIFICATION__DOCUMENTATION);
		createEReference(utilitySpecificationEClass, UTILITY_SPECIFICATION__OUTSIDE_REF);
		createEReference(utilitySpecificationEClass, UTILITY_SPECIFICATION__REQUIREMENT);

		surveyEngineEClass = createEClass(SURVEY_ENGINE);
		createEReference(surveyEngineEClass, SURVEY_ENGINE__SURVEY_MODEL);

		dslEClass = createEClass(DSL);
		createEReference(dslEClass, DSL__CONCRETE_SYNTAX);
		createEReference(dslEClass, DSL__ABSTRACT_SYNTAX);
		createEAttribute(dslEClass, DSL__DSL_NAME);
		createEReference(dslEClass, DSL__CONTEXT_MODEL);
		createEReference(dslEClass, DSL__GOAL_MODEL);
		createEReference(dslEClass, DSL__EVALUATION_MODEL);
		createEReference(dslEClass, DSL__EXISTING_GOAL_MODEL);
		createEReference(dslEClass, DSL__DOCUMENTATION);

		processModelEClass = createEClass(PROCESS_MODEL);
		createEAttribute(processModelEClass, PROCESS_MODEL__NAME);
		createEReference(processModelEClass, PROCESS_MODEL__WORKFLOW);
		createEReference(processModelEClass, PROCESS_MODEL__EVALUATION_PROCESS);
		createEReference(processModelEClass, PROCESS_MODEL__OUTSIDE_REF);

		functionalGoalEClass = createEClass(FUNCTIONAL_GOAL);
		createEAttribute(functionalGoalEClass, FUNCTIONAL_GOAL__NAME);
		createEReference(functionalGoalEClass, FUNCTIONAL_GOAL__EXISTING_GM);
		createEReference(functionalGoalEClass, FUNCTIONAL_GOAL__REQUIREMENTS);

		existingGMEClass = createEClass(EXISTING_GM);
		createEAttribute(existingGMEClass, EXISTING_GM__NAME);
		createEReference(existingGMEClass, EXISTING_GM__FUNCTIONAL_GOAL);

		ceVariableEClass = createEClass(CE_VARIABLE);
		createEAttribute(ceVariableEClass, CE_VARIABLE__NAME);
		createEAttribute(ceVariableEClass, CE_VARIABLE__MANDATORY);
		createEAttribute(ceVariableEClass, CE_VARIABLE__TYPE);
		createEReference(ceVariableEClass, CE_VARIABLE__COMPOSED_ELEMENT);
		createEReference(ceVariableEClass, CE_VARIABLE__CONTEXT_ENVIROMENT);

		profileTemplateEClass = createEClass(PROFILE_TEMPLATE);
		createEAttribute(profileTemplateEClass, PROFILE_TEMPLATE__NAME);
		createEAttribute(profileTemplateEClass, PROFILE_TEMPLATE__CATEGORY);
		createEReference(profileTemplateEClass, PROFILE_TEMPLATE__CLASSIFIERS);

		logicalExpressionEClass = createEClass(LOGICAL_EXPRESSION);
		createEAttribute(logicalExpressionEClass, LOGICAL_EXPRESSION__NAME);
		createEAttribute(logicalExpressionEClass, LOGICAL_EXPRESSION__CLASSIFIER_NAME);
		createEAttribute(logicalExpressionEClass, LOGICAL_EXPRESSION__EXPRESSION);
		createEReference(logicalExpressionEClass, LOGICAL_EXPRESSION__PROFILE_TEMPLATE);
		createEReference(logicalExpressionEClass, LOGICAL_EXPRESSION__QUESTION);

		concreteSyntaxEClass = createEClass(CONCRETE_SYNTAX);
		createEAttribute(concreteSyntaxEClass, CONCRETE_SYNTAX__NAME);
		createEReference(concreteSyntaxEClass, CONCRETE_SYNTAX__DSL);
		createEReference(concreteSyntaxEClass, CONCRETE_SYNTAX__INTERACTION_SYNTAX);
		createEReference(concreteSyntaxEClass, CONCRETE_SYNTAX__OUTSIDE_REF);

		abstractSyntaxEClass = createEClass(ABSTRACT_SYNTAX);
		createEAttribute(abstractSyntaxEClass, ABSTRACT_SYNTAX__NAME);
		createEReference(abstractSyntaxEClass, ABSTRACT_SYNTAX__DSL);
		createEReference(abstractSyntaxEClass, ABSTRACT_SYNTAX__INTERACTION_SYNTAX);
		createEReference(abstractSyntaxEClass, ABSTRACT_SYNTAX__OUTSIDE_REF);

		outsideRefEClass = createEClass(OUTSIDE_REF);
		createEAttribute(outsideRefEClass, OUTSIDE_REF__NAME);
		createEAttribute(outsideRefEClass, OUTSIDE_REF__LINK);
		createEAttribute(outsideRefEClass, OUTSIDE_REF__TOOL);
		createEReference(outsideRefEClass, OUTSIDE_REF__OUTSIDE_REF);

		requirementEClass = createEClass(REQUIREMENT);
		createEAttribute(requirementEClass, REQUIREMENT__NAME);
		createEAttribute(requirementEClass, REQUIREMENT__DESCRIPTION);

		documentationEClass = createEClass(DOCUMENTATION);
		createEAttribute(documentationEClass, DOCUMENTATION__NAME);
		createEReference(documentationEClass, DOCUMENTATION__OUTSIDE_REF);

		// Create enums
		priorityValueEEnum = createEEnum(PRIORITY_VALUE);
		recordInputEEnum = createEEnum(RECORD_INPUT);
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
		SurveyModelingPackage theSurveyModelingPackage = (SurveyModelingPackage)EPackage.Registry.INSTANCE.getEPackage(SurveyModelingPackage.eNS_URI);
		ContextModelingPackage theContextModelingPackage = (ContextModelingPackage)EPackage.Registry.INSTANCE.getEPackage(ContextModelingPackage.eNS_URI);
		GoalModelingPackage theGoalModelingPackage = (GoalModelingPackage)EPackage.Registry.INSTANCE.getEPackage(GoalModelingPackage.eNS_URI);
		EvaluationModelingPackage theEvaluationModelingPackage = (EvaluationModelingPackage)EPackage.Registry.INSTANCE.getEPackage(EvaluationModelingPackage.eNS_URI);
		InteractionModelingPackage theInteractionModelingPackage = (InteractionModelingPackage)EPackage.Registry.INSTANCE.getEPackage(InteractionModelingPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(utilitySpecificationEClass, UtilitySpecification.class, "UtilitySpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUtilitySpecification_Name(), ecorePackage.getEString(), "name", null, 0, 1, UtilitySpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUtilitySpecification_DSL(), this.getDSL(), null, "DSL", null, 0, -1, UtilitySpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUtilitySpecification_FunctionalGoal(), this.getFunctionalGoal(), null, "functionalGoal", null, 0, -1, UtilitySpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUtilitySpecification_ProcessModel(), this.getProcessModel(), null, "processModel", null, 0, -1, UtilitySpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUtilitySpecification_SurveyEngine(), this.getSurveyEngine(), null, "surveyEngine", null, 0, -1, UtilitySpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUtilitySpecification_Documentation(), this.getDocumentation(), null, "documentation", null, 0, -1, UtilitySpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUtilitySpecification_OutsideRef(), this.getOutsideRef(), null, "outsideRef", null, 0, -1, UtilitySpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUtilitySpecification_Requirement(), this.getRequirement(), null, "requirement", null, 0, -1, UtilitySpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(surveyEngineEClass, SurveyEngine.class, "SurveyEngine", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSurveyEngine_SurveyModel(), theSurveyModelingPackage.getSurveyModel(), theSurveyModelingPackage.getSurveyModel_SurveyEngine(), "surveyModel", null, 1, 1, SurveyEngine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(dslEClass, pt.fct.unl.novalincs.useme.model.Utility.DSL.class, "DSL", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDSL_ConcreteSyntax(), this.getConcreteSyntax(), this.getConcreteSyntax_Dsl(), "concreteSyntax", null, 0, -1, pt.fct.unl.novalincs.useme.model.Utility.DSL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDSL_AbstractSyntax(), this.getAbstractSyntax(), this.getAbstractSyntax_Dsl(), "abstractSyntax", null, 0, -1, pt.fct.unl.novalincs.useme.model.Utility.DSL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDSL_DslName(), ecorePackage.getEString(), "dslName", null, 1, 1, pt.fct.unl.novalincs.useme.model.Utility.DSL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDSL_ContextModel(), theContextModelingPackage.getContextModel(), theContextModelingPackage.getContextModel_Language(), "contextModel", null, 0, -1, pt.fct.unl.novalincs.useme.model.Utility.DSL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDSL_GoalModel(), theGoalModelingPackage.getGoalModel(), null, "goalModel", null, 0, -1, pt.fct.unl.novalincs.useme.model.Utility.DSL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDSL_EvaluationModel(), theEvaluationModelingPackage.getEvaluationModel(), null, "evaluationModel", null, 0, -1, pt.fct.unl.novalincs.useme.model.Utility.DSL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDSL_ExistingGoalModel(), this.getExistingGM(), null, "existingGoalModel", null, 0, -1, pt.fct.unl.novalincs.useme.model.Utility.DSL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDSL_Documentation(), this.getDocumentation(), null, "documentation", null, 0, -1, pt.fct.unl.novalincs.useme.model.Utility.DSL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(processModelEClass, ProcessModel.class, "ProcessModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProcessModel_Name(), ecorePackage.getEString(), "name", null, 0, 1, ProcessModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcessModel_Workflow(), theContextModelingPackage.getWorkflow(), theContextModelingPackage.getWorkflow_ProcessModel(), "workflow", null, 0, -1, ProcessModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getProcessModel_EvaluationProcess(), theEvaluationModelingPackage.getProcess(), theEvaluationModelingPackage.getProcess_ProcessModel(), "evaluationProcess", null, 0, -1, ProcessModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcessModel_OutsideRef(), this.getOutsideRef(), null, "outsideRef", null, 0, 1, ProcessModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(functionalGoalEClass, FunctionalGoal.class, "FunctionalGoal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFunctionalGoal_Name(), ecorePackage.getEString(), "name", null, 0, 1, FunctionalGoal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionalGoal_ExistingGM(), this.getExistingGM(), this.getExistingGM_FunctionalGoal(), "existingGM", null, 0, -1, FunctionalGoal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getFunctionalGoal_Requirements(), this.getRequirement(), null, "requirements", null, 0, -1, FunctionalGoal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(existingGMEClass, ExistingGM.class, "ExistingGM", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExistingGM_Name(), ecorePackage.getEString(), "name", null, 0, 1, ExistingGM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExistingGM_FunctionalGoal(), this.getFunctionalGoal(), this.getFunctionalGoal_ExistingGM(), "functionalGoal", null, 0, -1, ExistingGM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(ceVariableEClass, CEVariable.class, "CEVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCEVariable_Name(), ecorePackage.getEString(), "name", null, 0, 1, CEVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCEVariable_Mandatory(), ecorePackage.getEBoolean(), "mandatory", null, 1, 1, CEVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCEVariable_Type(), ecorePackage.getEString(), "type", null, 0, -1, CEVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCEVariable_ComposedElement(), this.getCEVariable(), null, "composedElement", null, 0, -1, CEVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCEVariable_ContextEnviroment(), theContextModelingPackage.getContextEnvironment(), null, "contextEnviroment", null, 0, 1, CEVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(profileTemplateEClass, ProfileTemplate.class, "ProfileTemplate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProfileTemplate_Name(), ecorePackage.getEString(), "name", null, 0, 1, ProfileTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProfileTemplate_Category(), ecorePackage.getEString(), "category", null, 0, 1, ProfileTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getProfileTemplate_Classifiers(), this.getLogicalExpression(), this.getLogicalExpression_ProfileTemplate(), "classifiers", null, 1, -1, ProfileTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(logicalExpressionEClass, LogicalExpression.class, "LogicalExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLogicalExpression_Name(), ecorePackage.getEString(), "name", null, 0, 1, LogicalExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLogicalExpression_ClassifierName(), ecorePackage.getEString(), "classifierName", "", 1, 1, LogicalExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLogicalExpression_Expression(), ecorePackage.getEString(), "expression", null, 1, -1, LogicalExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLogicalExpression_ProfileTemplate(), this.getProfileTemplate(), this.getProfileTemplate_Classifiers(), "profileTemplate", null, 0, -1, LogicalExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getLogicalExpression_Question(), theSurveyModelingPackage.getBackgroundQs(), theSurveyModelingPackage.getBackgroundQs_LogicalExpression(), "question", null, 0, -1, LogicalExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(concreteSyntaxEClass, ConcreteSyntax.class, "ConcreteSyntax", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConcreteSyntax_Name(), ecorePackage.getEString(), "name", null, 0, 1, ConcreteSyntax.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConcreteSyntax_Dsl(), this.getDSL(), this.getDSL_ConcreteSyntax(), "dsl", null, 1, 1, ConcreteSyntax.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getConcreteSyntax_InteractionSyntax(), theInteractionModelingPackage.getInteractionSyntax(), theInteractionModelingPackage.getInteractionSyntax_ConcreteSyntax(), "interactionSyntax", null, 0, -1, ConcreteSyntax.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getConcreteSyntax_OutsideRef(), this.getOutsideRef(), null, "outsideRef", null, 0, 1, ConcreteSyntax.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractSyntaxEClass, AbstractSyntax.class, "AbstractSyntax", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAbstractSyntax_Name(), ecorePackage.getEString(), "name", null, 0, 1, AbstractSyntax.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractSyntax_Dsl(), this.getDSL(), this.getDSL_AbstractSyntax(), "dsl", null, 1, 1, AbstractSyntax.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAbstractSyntax_InteractionSyntax(), theInteractionModelingPackage.getInteractionSyntax(), theInteractionModelingPackage.getInteractionSyntax_AbstractSyntax(), "interactionSyntax", null, 0, -1, AbstractSyntax.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAbstractSyntax_OutsideRef(), this.getOutsideRef(), null, "outsideRef", null, 0, 1, AbstractSyntax.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(outsideRefEClass, OutsideRef.class, "OutsideRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOutsideRef_Name(), ecorePackage.getEString(), "name", null, 0, 1, OutsideRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOutsideRef_Link(), ecorePackage.getEString(), "link", null, 0, -1, OutsideRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOutsideRef_Tool(), ecorePackage.getEString(), "tool", null, 0, -1, OutsideRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOutsideRef_OutsideRef(), this.getOutsideRef(), null, "outsideRef", null, 0, 1, OutsideRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(requirementEClass, Requirement.class, "Requirement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRequirement_Name(), ecorePackage.getEString(), "name", null, 0, 1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequirement_Description(), ecorePackage.getEString(), "description", null, 0, 1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentationEClass, Documentation.class, "Documentation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentation_Name(), ecorePackage.getEString(), "name", null, 0, 1, Documentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDocumentation_OutsideRef(), this.getOutsideRef(), null, "outsideRef", null, 0, 1, Documentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(priorityValueEEnum, PriorityValue.class, "PriorityValue");
		addEEnumLiteral(priorityValueEEnum, PriorityValue.HIGH);
		addEEnumLiteral(priorityValueEEnum, PriorityValue.MEDIUM);
		addEEnumLiteral(priorityValueEEnum, PriorityValue.LOW);

		initEEnum(recordInputEEnum, RecordInput.class, "RecordInput");
		addEEnumLiteral(recordInputEEnum, RecordInput.SCREEN_RECORD);
		addEEnumLiteral(recordInputEEnum, RecordInput.LIVE_OBSERVATION);
		addEEnumLiteral(recordInputEEnum, RecordInput.THINK_ALOUD);
	}

} //UtilityPackageImpl
