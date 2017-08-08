/**
 */
package pt.fct.unl.novalincs.useme.model.Utility.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import pt.fct.unl.novalincs.useme.model.Utility.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UtilityFactoryImpl extends EFactoryImpl implements UtilityFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static UtilityFactory init() {
		try {
			UtilityFactory theUtilityFactory = (UtilityFactory)EPackage.Registry.INSTANCE.getEFactory(UtilityPackage.eNS_URI);
			if (theUtilityFactory != null) {
				return theUtilityFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new UtilityFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UtilityFactoryImpl() {
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
			case UtilityPackage.UTILITY_SPECIFICATION: return createUtilitySpecification();
			case UtilityPackage.SURVEY_ENGINE: return createSurveyEngine();
			case UtilityPackage.DSL: return createDSL();
			case UtilityPackage.PROCESS_MODEL: return createProcessModel();
			case UtilityPackage.FUNCTIONAL_GOAL: return createFunctionalGoal();
			case UtilityPackage.EXISTING_GM: return createExistingGM();
			case UtilityPackage.CE_VARIABLE: return createCEVariable();
			case UtilityPackage.PROFILE_TEMPLATE: return createProfileTemplate();
			case UtilityPackage.LOGICAL_EXPRESSION: return createLogicalExpression();
			case UtilityPackage.CONCRETE_SYNTAX: return createConcreteSyntax();
			case UtilityPackage.ABSTRACT_SYNTAX: return createAbstractSyntax();
			case UtilityPackage.OUTSIDE_REF: return createOutsideRef();
			case UtilityPackage.REQUIREMENT: return createRequirement();
			case UtilityPackage.DOCUMENTATION: return createDocumentation();
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
			case UtilityPackage.PRIORITY_VALUE:
				return createPriorityValueFromString(eDataType, initialValue);
			case UtilityPackage.RECORD_INPUT:
				return createRecordInputFromString(eDataType, initialValue);
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
			case UtilityPackage.PRIORITY_VALUE:
				return convertPriorityValueToString(eDataType, instanceValue);
			case UtilityPackage.RECORD_INPUT:
				return convertRecordInputToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UtilitySpecification createUtilitySpecification() {
		UtilitySpecificationImpl utilitySpecification = new UtilitySpecificationImpl();
		return utilitySpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SurveyEngine createSurveyEngine() {
		SurveyEngineImpl surveyEngine = new SurveyEngineImpl();
		return surveyEngine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DSL createDSL() {
		DSLImpl dsl = new DSLImpl();
		return dsl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessModel createProcessModel() {
		ProcessModelImpl processModel = new ProcessModelImpl();
		return processModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionalGoal createFunctionalGoal() {
		FunctionalGoalImpl functionalGoal = new FunctionalGoalImpl();
		return functionalGoal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExistingGM createExistingGM() {
		ExistingGMImpl existingGM = new ExistingGMImpl();
		return existingGM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CEVariable createCEVariable() {
		CEVariableImpl ceVariable = new CEVariableImpl();
		return ceVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProfileTemplate createProfileTemplate() {
		ProfileTemplateImpl profileTemplate = new ProfileTemplateImpl();
		return profileTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalExpression createLogicalExpression() {
		LogicalExpressionImpl logicalExpression = new LogicalExpressionImpl();
		return logicalExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConcreteSyntax createConcreteSyntax() {
		ConcreteSyntaxImpl concreteSyntax = new ConcreteSyntaxImpl();
		return concreteSyntax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractSyntax createAbstractSyntax() {
		AbstractSyntaxImpl abstractSyntax = new AbstractSyntaxImpl();
		return abstractSyntax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutsideRef createOutsideRef() {
		OutsideRefImpl outsideRef = new OutsideRefImpl();
		return outsideRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Requirement createRequirement() {
		RequirementImpl requirement = new RequirementImpl();
		return requirement;
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
	public PriorityValue createPriorityValueFromString(EDataType eDataType, String initialValue) {
		PriorityValue result = PriorityValue.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPriorityValueToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RecordInput createRecordInputFromString(EDataType eDataType, String initialValue) {
		RecordInput result = RecordInput.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRecordInputToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UtilityPackage getUtilityPackage() {
		return (UtilityPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static UtilityPackage getPackage() {
		return UtilityPackage.eINSTANCE;
	}

} //UtilityFactoryImpl
