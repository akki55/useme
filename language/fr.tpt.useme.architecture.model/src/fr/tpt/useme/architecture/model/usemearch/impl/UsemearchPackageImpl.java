/**
 */
package fr.tpt.useme.architecture.model.usemearch.impl;

import fr.labsticc.framework.constraints.model.constraints.ConstraintsPackage;

import fr.labsticc.framework.settings.model.settings.SettingsPackage;
import fr.tpt.useme.architecture.model.usemearch.AbstractSyntax;
import fr.tpt.useme.architecture.model.usemearch.Computer;
import fr.tpt.useme.architecture.model.usemearch.ConcreteSyntax;
import fr.tpt.useme.architecture.model.usemearch.ContextElementInstance;
import fr.tpt.useme.architecture.model.usemearch.ContextElementType;
import fr.tpt.useme.architecture.model.usemearch.ContextSpecification;
import fr.tpt.useme.architecture.model.usemearch.Documentation;
import fr.tpt.useme.architecture.model.usemearch.DomainConcept;
import fr.tpt.useme.architecture.model.usemearch.Dsl;
import fr.tpt.useme.architecture.model.usemearch.DslDevelopmentSpecification;
import fr.tpt.useme.architecture.model.usemearch.ECoreAbstractSyntax;
import fr.tpt.useme.architecture.model.usemearch.ECoreDomainConcept;
import fr.tpt.useme.architecture.model.usemearch.ElementInstanceConnection;
import fr.tpt.useme.architecture.model.usemearch.FeatureDiagram;
import fr.tpt.useme.architecture.model.usemearch.IdentifiedElement;
import fr.tpt.useme.architecture.model.usemearch.MaintenanceService;
import fr.tpt.useme.architecture.model.usemearch.ModelChecker;
import fr.tpt.useme.architecture.model.usemearch.ModelSimulator;
import fr.tpt.useme.architecture.model.usemearch.OperatingSystem;
import fr.tpt.useme.architecture.model.usemearch.Semantic;
import fr.tpt.useme.architecture.model.usemearch.SiriusConcreteSyntax;
import fr.tpt.useme.architecture.model.usemearch.SoftwareTool;
import fr.tpt.useme.architecture.model.usemearch.Syntax;
import fr.tpt.useme.architecture.model.usemearch.Tool;
import fr.tpt.useme.architecture.model.usemearch.UsemearchFactory;
import fr.tpt.useme.architecture.model.usemearch.UsemearchPackage;
import fr.tpt.useme.architecture.model.usemearch.User;
import fr.tpt.useme.architecture.model.usemearch.WorkPlace;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.sirius.viewpoint.ViewpointPackage;

import org.eclipse.sirius.viewpoint.description.DescriptionPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UsemearchPackageImpl extends EPackageImpl implements UsemearchPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass identifiedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dslDevelopmentSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contextElementTypeEClass = null;

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
	private EClass dslEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass syntaxEClass = null;

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
	private EClass concreteSyntaxEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eCoreAbstractSyntaxEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass siriusConcreteSyntaxEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass toolEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workPlaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass computerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass softwareToolEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operatingSystemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass semanticEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domainConceptEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eCoreDomainConceptEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureDiagramEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelCheckerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelSimulatorEClass = null;

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
	private EClass maintenanceServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contextElementInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementInstanceConnectionEClass = null;

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
	 * @see fr.tpt.useme.architecture.model.usemearch.UsemearchPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private UsemearchPackageImpl() {
		super(eNS_URI, UsemearchFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link UsemearchPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static UsemearchPackage init() {
		if (isInited) return (UsemearchPackage)EPackage.Registry.INSTANCE.getEPackage(UsemearchPackage.eNS_URI);

		// Obtain or create and register package
		UsemearchPackageImpl theUsemearchPackage = (UsemearchPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof UsemearchPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new UsemearchPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		SettingsPackage.eINSTANCE.eClass();
		ViewpointPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theUsemearchPackage.createPackageContents();

		// Initialize created meta-data
		theUsemearchPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theUsemearchPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(UsemearchPackage.eNS_URI, theUsemearchPackage);
		return theUsemearchPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIdentifiedElement() {
		return identifiedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIdentifiedElement_Name() {
		return (EAttribute)identifiedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIdentifiedElement_Id() {
		return (EAttribute)identifiedElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDslDevelopmentSpecification() {
		return dslDevelopmentSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDslDevelopmentSpecification_OwnedDsls() {
		return (EReference)dslDevelopmentSpecificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDslDevelopmentSpecification_OwnedTools() {
		return (EReference)dslDevelopmentSpecificationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDslDevelopmentSpecification_DevelopedDsl() {
		return (EReference)dslDevelopmentSpecificationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDslDevelopmentSpecification_OwnedContexts() {
		return (EReference)dslDevelopmentSpecificationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDslDevelopmentSpecification_OwnedUsers() {
		return (EReference)dslDevelopmentSpecificationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContextElementType() {
		return contextElementTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContextElementType_Category() {
		return (EReference)contextElementTypeEClass.getEStructuralFeatures().get(0);
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
	public EReference getContextSpecification_OwnedInstanceElements() {
		return (EReference)contextSpecificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContextSpecification_DevelopedDsl() {
		return (EReference)contextSpecificationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContextSpecification_OwnedConnections() {
		return (EReference)contextSpecificationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDsl() {
		return dslEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDsl_OwnedSyntaxes() {
		return (EReference)dslEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDsl_ConcreteSyntaxes() {
		return (EReference)dslEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDsl_Abstractsyntax() {
		return (EReference)dslEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDsl_SupportingTools() {
		return (EReference)dslEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDsl_Semantics() {
		return (EReference)dslEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDsl_DomainConcepts() {
		return (EReference)dslEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDsl_FeatureDiagrams() {
		return (EReference)dslEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDsl_ModelCheckers() {
		return (EReference)dslEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDsl_ModelSimulators() {
		return (EReference)dslEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDsl_Documentations() {
		return (EReference)dslEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDsl_MaintenanceService() {
		return (EReference)dslEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSyntax() {
		return syntaxEClass;
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
	public EClass getConcreteSyntax() {
		return concreteSyntaxEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConcreteSyntax_Language() {
		return (EReference)concreteSyntaxEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getECoreAbstractSyntax() {
		return eCoreAbstractSyntaxEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getECoreAbstractSyntax_Packages() {
		return (EReference)eCoreAbstractSyntaxEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSiriusConcreteSyntax() {
		return siriusConcreteSyntaxEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSiriusConcreteSyntax_SiriusSpecification() {
		return (EReference)siriusConcreteSyntaxEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTool() {
		return toolEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTool_UsedBy() {
		return (EReference)toolEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUser() {
		return userEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUser_Uses() {
		return (EReference)userEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWorkPlace() {
		return workPlaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComputer() {
		return computerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComputer_Executes() {
		return (EReference)computerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSoftwareTool() {
		return softwareToolEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSoftwareTool_SupportedLanguages() {
		return (EReference)softwareToolEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSoftwareTool_ExecutedBy() {
		return (EReference)softwareToolEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperatingSystem() {
		return operatingSystemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSemantic() {
		return semanticEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDomainConcept() {
		return domainConceptEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getECoreDomainConcept() {
		return eCoreDomainConceptEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getECoreDomainConcept_DomainClass() {
		return (EReference)eCoreDomainConceptEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFeatureDiagram() {
		return featureDiagramEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelChecker() {
		return modelCheckerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelSimulator() {
		return modelSimulatorEClass;
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
	public EClass getMaintenanceService() {
		return maintenanceServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContextElementInstance() {
		return contextElementInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContextElementInstance_ElementType() {
		return (EReference)contextElementInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElementInstanceConnection() {
		return elementInstanceConnectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementInstanceConnection_SourceFeature() {
		return (EReference)elementInstanceConnectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementInstanceConnection_DestinationFeature() {
		return (EReference)elementInstanceConnectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementInstanceConnection_SourceElementInstance() {
		return (EReference)elementInstanceConnectionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementInstanceConnection_DestinationElementInstance() {
		return (EReference)elementInstanceConnectionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UsemearchFactory getUsemearchFactory() {
		return (UsemearchFactory)getEFactoryInstance();
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
		identifiedElementEClass = createEClass(IDENTIFIED_ELEMENT);
		createEAttribute(identifiedElementEClass, IDENTIFIED_ELEMENT__NAME);
		createEAttribute(identifiedElementEClass, IDENTIFIED_ELEMENT__ID);

		dslDevelopmentSpecificationEClass = createEClass(DSL_DEVELOPMENT_SPECIFICATION);
		createEReference(dslDevelopmentSpecificationEClass, DSL_DEVELOPMENT_SPECIFICATION__OWNED_DSLS);
		createEReference(dslDevelopmentSpecificationEClass, DSL_DEVELOPMENT_SPECIFICATION__OWNED_TOOLS);
		createEReference(dslDevelopmentSpecificationEClass, DSL_DEVELOPMENT_SPECIFICATION__DEVELOPED_DSL);
		createEReference(dslDevelopmentSpecificationEClass, DSL_DEVELOPMENT_SPECIFICATION__OWNED_CONTEXTS);
		createEReference(dslDevelopmentSpecificationEClass, DSL_DEVELOPMENT_SPECIFICATION__OWNED_USERS);

		contextElementTypeEClass = createEClass(CONTEXT_ELEMENT_TYPE);
		createEReference(contextElementTypeEClass, CONTEXT_ELEMENT_TYPE__CATEGORY);

		contextSpecificationEClass = createEClass(CONTEXT_SPECIFICATION);
		createEReference(contextSpecificationEClass, CONTEXT_SPECIFICATION__OWNED_INSTANCE_ELEMENTS);
		createEReference(contextSpecificationEClass, CONTEXT_SPECIFICATION__DEVELOPED_DSL);
		createEReference(contextSpecificationEClass, CONTEXT_SPECIFICATION__OWNED_CONNECTIONS);

		dslEClass = createEClass(DSL);
		createEReference(dslEClass, DSL__OWNED_SYNTAXES);
		createEReference(dslEClass, DSL__CONCRETE_SYNTAXES);
		createEReference(dslEClass, DSL__ABSTRACTSYNTAX);
		createEReference(dslEClass, DSL__SUPPORTING_TOOLS);
		createEReference(dslEClass, DSL__SEMANTICS);
		createEReference(dslEClass, DSL__DOMAIN_CONCEPTS);
		createEReference(dslEClass, DSL__FEATURE_DIAGRAMS);
		createEReference(dslEClass, DSL__MODEL_CHECKERS);
		createEReference(dslEClass, DSL__MODEL_SIMULATORS);
		createEReference(dslEClass, DSL__DOCUMENTATIONS);
		createEReference(dslEClass, DSL__MAINTENANCE_SERVICE);

		syntaxEClass = createEClass(SYNTAX);

		abstractSyntaxEClass = createEClass(ABSTRACT_SYNTAX);

		concreteSyntaxEClass = createEClass(CONCRETE_SYNTAX);
		createEReference(concreteSyntaxEClass, CONCRETE_SYNTAX__LANGUAGE);

		eCoreAbstractSyntaxEClass = createEClass(ECORE_ABSTRACT_SYNTAX);
		createEReference(eCoreAbstractSyntaxEClass, ECORE_ABSTRACT_SYNTAX__PACKAGES);

		siriusConcreteSyntaxEClass = createEClass(SIRIUS_CONCRETE_SYNTAX);
		createEReference(siriusConcreteSyntaxEClass, SIRIUS_CONCRETE_SYNTAX__SIRIUS_SPECIFICATION);

		toolEClass = createEClass(TOOL);
		createEReference(toolEClass, TOOL__USED_BY);

		userEClass = createEClass(USER);
		createEReference(userEClass, USER__USES);

		workPlaceEClass = createEClass(WORK_PLACE);

		computerEClass = createEClass(COMPUTER);
		createEReference(computerEClass, COMPUTER__EXECUTES);

		softwareToolEClass = createEClass(SOFTWARE_TOOL);
		createEReference(softwareToolEClass, SOFTWARE_TOOL__SUPPORTED_LANGUAGES);
		createEReference(softwareToolEClass, SOFTWARE_TOOL__EXECUTED_BY);

		operatingSystemEClass = createEClass(OPERATING_SYSTEM);

		semanticEClass = createEClass(SEMANTIC);

		domainConceptEClass = createEClass(DOMAIN_CONCEPT);

		eCoreDomainConceptEClass = createEClass(ECORE_DOMAIN_CONCEPT);
		createEReference(eCoreDomainConceptEClass, ECORE_DOMAIN_CONCEPT__DOMAIN_CLASS);

		featureDiagramEClass = createEClass(FEATURE_DIAGRAM);

		modelCheckerEClass = createEClass(MODEL_CHECKER);

		modelSimulatorEClass = createEClass(MODEL_SIMULATOR);

		documentationEClass = createEClass(DOCUMENTATION);

		maintenanceServiceEClass = createEClass(MAINTENANCE_SERVICE);

		contextElementInstanceEClass = createEClass(CONTEXT_ELEMENT_INSTANCE);
		createEReference(contextElementInstanceEClass, CONTEXT_ELEMENT_INSTANCE__ELEMENT_TYPE);

		elementInstanceConnectionEClass = createEClass(ELEMENT_INSTANCE_CONNECTION);
		createEReference(elementInstanceConnectionEClass, ELEMENT_INSTANCE_CONNECTION__SOURCE_FEATURE);
		createEReference(elementInstanceConnectionEClass, ELEMENT_INSTANCE_CONNECTION__DESTINATION_FEATURE);
		createEReference(elementInstanceConnectionEClass, ELEMENT_INSTANCE_CONNECTION__SOURCE_ELEMENT_INSTANCE);
		createEReference(elementInstanceConnectionEClass, ELEMENT_INSTANCE_CONNECTION__DESTINATION_ELEMENT_INSTANCE);
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
		SettingsPackage theSettingsPackage = (SettingsPackage)EPackage.Registry.INSTANCE.getEPackage(SettingsPackage.eNS_URI);
		ConstraintsPackage theConstraintsPackage = (ConstraintsPackage)EPackage.Registry.INSTANCE.getEPackage(ConstraintsPackage.eNS_URI);
		DescriptionPackage theDescriptionPackage = (DescriptionPackage)EPackage.Registry.INSTANCE.getEPackage(DescriptionPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		dslDevelopmentSpecificationEClass.getESuperTypes().add(this.getIdentifiedElement());
		contextElementTypeEClass.getESuperTypes().add(this.getIdentifiedElement());
		contextSpecificationEClass.getESuperTypes().add(this.getIdentifiedElement());
		dslEClass.getESuperTypes().add(this.getContextElementType());
		syntaxEClass.getESuperTypes().add(this.getIdentifiedElement());
		abstractSyntaxEClass.getESuperTypes().add(this.getSyntax());
		concreteSyntaxEClass.getESuperTypes().add(this.getSyntax());
		eCoreAbstractSyntaxEClass.getESuperTypes().add(this.getAbstractSyntax());
		siriusConcreteSyntaxEClass.getESuperTypes().add(this.getConcreteSyntax());
		toolEClass.getESuperTypes().add(this.getContextElementType());
		userEClass.getESuperTypes().add(this.getContextElementType());
		workPlaceEClass.getESuperTypes().add(this.getContextElementType());
		computerEClass.getESuperTypes().add(this.getTool());
		softwareToolEClass.getESuperTypes().add(this.getTool());
		operatingSystemEClass.getESuperTypes().add(this.getSoftwareTool());
		semanticEClass.getESuperTypes().add(theDescriptionPackage.getIdentifiedElement());
		domainConceptEClass.getESuperTypes().add(theDescriptionPackage.getIdentifiedElement());
		eCoreDomainConceptEClass.getESuperTypes().add(this.getDomainConcept());
		featureDiagramEClass.getESuperTypes().add(theDescriptionPackage.getIdentifiedElement());
		modelCheckerEClass.getESuperTypes().add(this.getSoftwareTool());
		modelSimulatorEClass.getESuperTypes().add(this.getSoftwareTool());
		documentationEClass.getESuperTypes().add(this.getIdentifiedElement());
		maintenanceServiceEClass.getESuperTypes().add(theDescriptionPackage.getIdentifiedElement());
		contextElementInstanceEClass.getESuperTypes().add(this.getIdentifiedElement());
		elementInstanceConnectionEClass.getESuperTypes().add(this.getIdentifiedElement());

		// Initialize classes and features; add operations and parameters
		initEClass(identifiedElementEClass, IdentifiedElement.class, "IdentifiedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIdentifiedElement_Name(), ecorePackage.getEString(), "name", null, 1, 1, IdentifiedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIdentifiedElement_Id(), ecorePackage.getEString(), "id", null, 1, 1, IdentifiedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dslDevelopmentSpecificationEClass, DslDevelopmentSpecification.class, "DslDevelopmentSpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDslDevelopmentSpecification_OwnedDsls(), this.getDsl(), null, "ownedDsls", null, 1, -1, DslDevelopmentSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDslDevelopmentSpecification_OwnedTools(), this.getTool(), null, "ownedTools", null, 1, -1, DslDevelopmentSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDslDevelopmentSpecification_DevelopedDsl(), this.getDsl(), null, "developedDsl", null, 1, 1, DslDevelopmentSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDslDevelopmentSpecification_OwnedContexts(), this.getContextSpecification(), null, "ownedContexts", null, 1, -1, DslDevelopmentSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDslDevelopmentSpecification_OwnedUsers(), this.getUser(), null, "ownedUsers", null, 1, -1, DslDevelopmentSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(contextElementTypeEClass, ContextElementType.class, "ContextElementType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContextElementType_Category(), theSettingsPackage.getCategory(), null, "category", null, 0, -1, ContextElementType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(contextSpecificationEClass, ContextSpecification.class, "ContextSpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContextSpecification_OwnedInstanceElements(), this.getContextElementInstance(), null, "ownedInstanceElements", null, 1, -1, ContextSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContextSpecification_DevelopedDsl(), this.getDsl(), null, "developedDsl", null, 1, 1, ContextSpecification.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getContextSpecification_OwnedConnections(), this.getElementInstanceConnection(), null, "ownedConnections", null, 0, -1, ContextSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dslEClass, Dsl.class, "Dsl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDsl_OwnedSyntaxes(), this.getSyntax(), null, "ownedSyntaxes", null, 2, -1, Dsl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDsl_ConcreteSyntaxes(), this.getConcreteSyntax(), null, "concreteSyntaxes", null, 1, -1, Dsl.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDsl_Abstractsyntax(), this.getAbstractSyntax(), null, "abstractsyntax", null, 1, 1, Dsl.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDsl_SupportingTools(), this.getSoftwareTool(), this.getSoftwareTool_SupportedLanguages(), "supportingTools", null, 0, -1, Dsl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDsl_Semantics(), this.getSemantic(), null, "semantics", null, 0, -1, Dsl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDsl_DomainConcepts(), this.getDomainConcept(), null, "domainConcepts", null, 0, -1, Dsl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDsl_FeatureDiagrams(), this.getFeatureDiagram(), null, "featureDiagrams", null, 0, -1, Dsl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDsl_ModelCheckers(), this.getModelChecker(), null, "modelCheckers", null, 0, -1, Dsl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDsl_ModelSimulators(), this.getModelSimulator(), null, "modelSimulators", null, 0, -1, Dsl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDsl_Documentations(), this.getDocumentation(), null, "documentations", null, 0, -1, Dsl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDsl_MaintenanceService(), this.getMaintenanceService(), null, "maintenanceService", null, 0, 1, Dsl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(syntaxEClass, Syntax.class, "Syntax", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(abstractSyntaxEClass, AbstractSyntax.class, "AbstractSyntax", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(concreteSyntaxEClass, ConcreteSyntax.class, "ConcreteSyntax", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConcreteSyntax_Language(), theConstraintsPackage.getNaturalConstraintLanguage(), null, "language", null, 0, 1, ConcreteSyntax.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eCoreAbstractSyntaxEClass, ECoreAbstractSyntax.class, "ECoreAbstractSyntax", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getECoreAbstractSyntax_Packages(), ecorePackage.getEPackage(), null, "packages", null, 1, -1, ECoreAbstractSyntax.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(siriusConcreteSyntaxEClass, SiriusConcreteSyntax.class, "SiriusConcreteSyntax", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSiriusConcreteSyntax_SiriusSpecification(), theDescriptionPackage.getGroup(), null, "siriusSpecification", null, 1, -1, SiriusConcreteSyntax.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(toolEClass, Tool.class, "Tool", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTool_UsedBy(), this.getUser(), null, "usedBy", null, 1, -1, Tool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(userEClass, User.class, "User", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUser_Uses(), this.getTool(), null, "uses", null, 1, -1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(workPlaceEClass, WorkPlace.class, "WorkPlace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(computerEClass, Computer.class, "Computer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComputer_Executes(), this.getSoftwareTool(), this.getSoftwareTool_ExecutedBy(), "executes", null, 1, -1, Computer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(softwareToolEClass, SoftwareTool.class, "SoftwareTool", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSoftwareTool_SupportedLanguages(), this.getDsl(), this.getDsl_SupportingTools(), "supportedLanguages", null, 1, -1, SoftwareTool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSoftwareTool_ExecutedBy(), this.getComputer(), this.getComputer_Executes(), "executedBy", null, 1, -1, SoftwareTool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(operatingSystemEClass, OperatingSystem.class, "OperatingSystem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(semanticEClass, Semantic.class, "Semantic", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(domainConceptEClass, DomainConcept.class, "DomainConcept", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(eCoreDomainConceptEClass, ECoreDomainConcept.class, "ECoreDomainConcept", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getECoreDomainConcept_DomainClass(), theEcorePackage.getEClass(), null, "domainClass", null, 1, 1, ECoreDomainConcept.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(featureDiagramEClass, FeatureDiagram.class, "FeatureDiagram", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(modelCheckerEClass, ModelChecker.class, "ModelChecker", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(modelSimulatorEClass, ModelSimulator.class, "ModelSimulator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(documentationEClass, Documentation.class, "Documentation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(maintenanceServiceEClass, MaintenanceService.class, "MaintenanceService", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(contextElementInstanceEClass, ContextElementInstance.class, "ContextElementInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContextElementInstance_ElementType(), this.getContextElementType(), null, "elementType", null, 1, 1, ContextElementInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(elementInstanceConnectionEClass, ElementInstanceConnection.class, "ElementInstanceConnection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getElementInstanceConnection_SourceFeature(), theEcorePackage.getEReference(), null, "sourceFeature", null, 1, 1, ElementInstanceConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElementInstanceConnection_DestinationFeature(), theEcorePackage.getEReference(), null, "destinationFeature", null, 1, 1, ElementInstanceConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElementInstanceConnection_SourceElementInstance(), this.getContextElementInstance(), null, "sourceElementInstance", null, 1, 1, ElementInstanceConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElementInstanceConnection_DestinationElementInstance(), this.getContextElementInstance(), null, "destinationElementInstance", null, 1, 1, ElementInstanceConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //UsemearchPackageImpl
