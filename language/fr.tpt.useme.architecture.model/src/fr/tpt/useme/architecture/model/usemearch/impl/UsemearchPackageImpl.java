/**
 */
package fr.tpt.useme.architecture.model.usemearch.impl;

import fr.labsticc.framework.constraints.model.constraints.ConstraintsPackage;

import fr.labsticc.framework.settings.model.settings.SettingsPackage;
import fr.tpt.useme.architecture.model.usemearch.AbstractSyntax;
import fr.tpt.useme.architecture.model.usemearch.Computer;
import fr.tpt.useme.architecture.model.usemearch.ConcreteSyntax;
import fr.tpt.useme.architecture.model.usemearch.ContextEntityInstance;
import fr.tpt.useme.architecture.model.usemearch.ContextEntityType;
import fr.tpt.useme.architecture.model.usemearch.ContextSpecification;
import fr.tpt.useme.architecture.model.usemearch.Documentation;
import fr.tpt.useme.architecture.model.usemearch.DomainConcept;
import fr.tpt.useme.architecture.model.usemearch.Dsl;
import fr.tpt.useme.architecture.model.usemearch.DslBasedSystemSpecification;
import fr.tpt.useme.architecture.model.usemearch.ECoreAbstractSyntax;
import fr.tpt.useme.architecture.model.usemearch.ECoreDomainConcept;
import fr.tpt.useme.architecture.model.usemearch.EntityInstancesConnection;
import fr.tpt.useme.architecture.model.usemearch.FeatureDiagram;
import fr.tpt.useme.architecture.model.usemearch.IdentifiedElement;
import fr.tpt.useme.architecture.model.usemearch.InteractionFeature;
import fr.tpt.useme.architecture.model.usemearch.MaintenanceService;
import fr.tpt.useme.architecture.model.usemearch.ModelChecker;
import fr.tpt.useme.architecture.model.usemearch.ModelSimulator;
import fr.tpt.useme.architecture.model.usemearch.OperatingSystem;
import fr.tpt.useme.architecture.model.usemearch.PhysicalSystem;
import fr.tpt.useme.architecture.model.usemearch.Semantics;
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
	private EClass dslBasedSystemSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contextEntityTypeEClass = null;

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
	private EClass semanticsEClass = null;

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
	private EClass contextEntityInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entityInstancesConnectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass physicalSystemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interactionFeatureEClass = null;

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
	public EAttribute getIdentifiedElement_Description() {
		return (EAttribute)identifiedElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDslBasedSystemSpecification() {
		return dslBasedSystemSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDslBasedSystemSpecification_DevelopedDsl() {
		return (EReference)dslBasedSystemSpecificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDslBasedSystemSpecification_OwnedContexts() {
		return (EReference)dslBasedSystemSpecificationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDslBasedSystemSpecification_OwnedContextEntityTypes() {
		return (EReference)dslBasedSystemSpecificationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContextEntityType() {
		return contextEntityTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContextEntityType_Category() {
		return (EReference)contextEntityTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContextEntityType_OwnedInteractionFeatures() {
		return (EReference)contextEntityTypeEClass.getEStructuralFeatures().get(1);
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
	public EReference getContextSpecification_OwnedEntityInstances() {
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
	public EReference getDsl_OwnedSemantics() {
		return (EReference)dslEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDsl_OwnedFeatureDiagrams() {
		return (EReference)dslEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDsl_OwnedDocumentations() {
		return (EReference)dslEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDsl_MaintenanceService() {
		return (EReference)dslEClass.getEStructuralFeatures().get(7);
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
	public EReference getAbstractSyntax_OwnedDomainConcepts() {
		return (EReference)abstractSyntaxEClass.getEStructuralFeatures().get(0);
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
	public EAttribute getUser_AgeMin() {
		return (EAttribute)userEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUser_AgeMax() {
		return (EAttribute)userEClass.getEStructuralFeatures().get(2);
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
	public EClass getSemantics() {
		return semanticsEClass;
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
	public EClass getContextEntityInstance() {
		return contextEntityInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContextEntityInstance_EntityType() {
		return (EReference)contextEntityInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntityInstancesConnection() {
		return entityInstancesConnectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntityInstancesConnection_SourceFeature() {
		return (EReference)entityInstancesConnectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntityInstancesConnection_DestinationFeature() {
		return (EReference)entityInstancesConnectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntityInstancesConnection_SourceEntityInstance() {
		return (EReference)entityInstancesConnectionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntityInstancesConnection_DestinationEntityInstance() {
		return (EReference)entityInstancesConnectionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPhysicalSystem() {
		return physicalSystemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalSystem_Inputs() {
		return (EReference)physicalSystemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalSystem_Outputs() {
		return (EReference)physicalSystemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInteractionFeature() {
		return interactionFeatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteractionFeature_Feature() {
		return (EReference)interactionFeatureEClass.getEStructuralFeatures().get(0);
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
		createEAttribute(identifiedElementEClass, IDENTIFIED_ELEMENT__DESCRIPTION);

		dslBasedSystemSpecificationEClass = createEClass(DSL_BASED_SYSTEM_SPECIFICATION);
		createEReference(dslBasedSystemSpecificationEClass, DSL_BASED_SYSTEM_SPECIFICATION__DEVELOPED_DSL);
		createEReference(dslBasedSystemSpecificationEClass, DSL_BASED_SYSTEM_SPECIFICATION__OWNED_CONTEXTS);
		createEReference(dslBasedSystemSpecificationEClass, DSL_BASED_SYSTEM_SPECIFICATION__OWNED_CONTEXT_ENTITY_TYPES);

		contextEntityTypeEClass = createEClass(CONTEXT_ENTITY_TYPE);
		createEReference(contextEntityTypeEClass, CONTEXT_ENTITY_TYPE__CATEGORY);
		createEReference(contextEntityTypeEClass, CONTEXT_ENTITY_TYPE__OWNED_INTERACTION_FEATURES);

		contextSpecificationEClass = createEClass(CONTEXT_SPECIFICATION);
		createEReference(contextSpecificationEClass, CONTEXT_SPECIFICATION__OWNED_ENTITY_INSTANCES);
		createEReference(contextSpecificationEClass, CONTEXT_SPECIFICATION__DEVELOPED_DSL);
		createEReference(contextSpecificationEClass, CONTEXT_SPECIFICATION__OWNED_CONNECTIONS);

		dslEClass = createEClass(DSL);
		createEReference(dslEClass, DSL__OWNED_SYNTAXES);
		createEReference(dslEClass, DSL__CONCRETE_SYNTAXES);
		createEReference(dslEClass, DSL__ABSTRACTSYNTAX);
		createEReference(dslEClass, DSL__SUPPORTING_TOOLS);
		createEReference(dslEClass, DSL__OWNED_SEMANTICS);
		createEReference(dslEClass, DSL__OWNED_FEATURE_DIAGRAMS);
		createEReference(dslEClass, DSL__OWNED_DOCUMENTATIONS);
		createEReference(dslEClass, DSL__MAINTENANCE_SERVICE);

		syntaxEClass = createEClass(SYNTAX);

		abstractSyntaxEClass = createEClass(ABSTRACT_SYNTAX);
		createEReference(abstractSyntaxEClass, ABSTRACT_SYNTAX__OWNED_DOMAIN_CONCEPTS);

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
		createEAttribute(userEClass, USER__AGE_MIN);
		createEAttribute(userEClass, USER__AGE_MAX);

		workPlaceEClass = createEClass(WORK_PLACE);

		computerEClass = createEClass(COMPUTER);
		createEReference(computerEClass, COMPUTER__EXECUTES);

		softwareToolEClass = createEClass(SOFTWARE_TOOL);
		createEReference(softwareToolEClass, SOFTWARE_TOOL__SUPPORTED_LANGUAGES);
		createEReference(softwareToolEClass, SOFTWARE_TOOL__EXECUTED_BY);

		operatingSystemEClass = createEClass(OPERATING_SYSTEM);

		semanticsEClass = createEClass(SEMANTICS);

		domainConceptEClass = createEClass(DOMAIN_CONCEPT);

		eCoreDomainConceptEClass = createEClass(ECORE_DOMAIN_CONCEPT);
		createEReference(eCoreDomainConceptEClass, ECORE_DOMAIN_CONCEPT__DOMAIN_CLASS);

		featureDiagramEClass = createEClass(FEATURE_DIAGRAM);

		modelCheckerEClass = createEClass(MODEL_CHECKER);

		modelSimulatorEClass = createEClass(MODEL_SIMULATOR);

		documentationEClass = createEClass(DOCUMENTATION);

		maintenanceServiceEClass = createEClass(MAINTENANCE_SERVICE);

		contextEntityInstanceEClass = createEClass(CONTEXT_ENTITY_INSTANCE);
		createEReference(contextEntityInstanceEClass, CONTEXT_ENTITY_INSTANCE__ENTITY_TYPE);

		entityInstancesConnectionEClass = createEClass(ENTITY_INSTANCES_CONNECTION);
		createEReference(entityInstancesConnectionEClass, ENTITY_INSTANCES_CONNECTION__SOURCE_FEATURE);
		createEReference(entityInstancesConnectionEClass, ENTITY_INSTANCES_CONNECTION__DESTINATION_FEATURE);
		createEReference(entityInstancesConnectionEClass, ENTITY_INSTANCES_CONNECTION__SOURCE_ENTITY_INSTANCE);
		createEReference(entityInstancesConnectionEClass, ENTITY_INSTANCES_CONNECTION__DESTINATION_ENTITY_INSTANCE);

		physicalSystemEClass = createEClass(PHYSICAL_SYSTEM);
		createEReference(physicalSystemEClass, PHYSICAL_SYSTEM__INPUTS);
		createEReference(physicalSystemEClass, PHYSICAL_SYSTEM__OUTPUTS);

		interactionFeatureEClass = createEClass(INTERACTION_FEATURE);
		createEReference(interactionFeatureEClass, INTERACTION_FEATURE__FEATURE);
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
		dslBasedSystemSpecificationEClass.getESuperTypes().add(this.getIdentifiedElement());
		contextEntityTypeEClass.getESuperTypes().add(this.getIdentifiedElement());
		contextSpecificationEClass.getESuperTypes().add(this.getIdentifiedElement());
		dslEClass.getESuperTypes().add(this.getContextEntityType());
		syntaxEClass.getESuperTypes().add(this.getIdentifiedElement());
		abstractSyntaxEClass.getESuperTypes().add(this.getSyntax());
		concreteSyntaxEClass.getESuperTypes().add(this.getSyntax());
		eCoreAbstractSyntaxEClass.getESuperTypes().add(this.getAbstractSyntax());
		siriusConcreteSyntaxEClass.getESuperTypes().add(this.getConcreteSyntax());
		toolEClass.getESuperTypes().add(this.getContextEntityType());
		userEClass.getESuperTypes().add(this.getContextEntityType());
		workPlaceEClass.getESuperTypes().add(this.getContextEntityType());
		computerEClass.getESuperTypes().add(this.getTool());
		softwareToolEClass.getESuperTypes().add(this.getTool());
		operatingSystemEClass.getESuperTypes().add(this.getSoftwareTool());
		semanticsEClass.getESuperTypes().add(theDescriptionPackage.getIdentifiedElement());
		domainConceptEClass.getESuperTypes().add(theDescriptionPackage.getIdentifiedElement());
		eCoreDomainConceptEClass.getESuperTypes().add(this.getDomainConcept());
		featureDiagramEClass.getESuperTypes().add(this.getIdentifiedElement());
		modelCheckerEClass.getESuperTypes().add(this.getSoftwareTool());
		modelSimulatorEClass.getESuperTypes().add(this.getSoftwareTool());
		documentationEClass.getESuperTypes().add(this.getContextEntityType());
		maintenanceServiceEClass.getESuperTypes().add(theDescriptionPackage.getIdentifiedElement());
		contextEntityInstanceEClass.getESuperTypes().add(this.getIdentifiedElement());
		entityInstancesConnectionEClass.getESuperTypes().add(this.getIdentifiedElement());
		physicalSystemEClass.getESuperTypes().add(this.getContextEntityType());
		interactionFeatureEClass.getESuperTypes().add(this.getIdentifiedElement());

		// Initialize classes and features; add operations and parameters
		initEClass(identifiedElementEClass, IdentifiedElement.class, "IdentifiedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIdentifiedElement_Name(), ecorePackage.getEString(), "name", null, 1, 1, IdentifiedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIdentifiedElement_Id(), ecorePackage.getEString(), "id", null, 1, 1, IdentifiedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIdentifiedElement_Description(), ecorePackage.getEString(), "description", null, 0, 1, IdentifiedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dslBasedSystemSpecificationEClass, DslBasedSystemSpecification.class, "DslBasedSystemSpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDslBasedSystemSpecification_DevelopedDsl(), this.getDsl(), null, "developedDsl", null, 1, 1, DslBasedSystemSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDslBasedSystemSpecification_OwnedContexts(), this.getContextSpecification(), null, "ownedContexts", null, 1, -1, DslBasedSystemSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDslBasedSystemSpecification_OwnedContextEntityTypes(), this.getContextEntityType(), null, "ownedContextEntityTypes", null, 1, -1, DslBasedSystemSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(contextEntityTypeEClass, ContextEntityType.class, "ContextEntityType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContextEntityType_Category(), theSettingsPackage.getCategory(), null, "category", null, 0, -1, ContextEntityType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContextEntityType_OwnedInteractionFeatures(), this.getInteractionFeature(), null, "ownedInteractionFeatures", null, 0, -1, ContextEntityType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(contextSpecificationEClass, ContextSpecification.class, "ContextSpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContextSpecification_OwnedEntityInstances(), this.getContextEntityInstance(), null, "ownedEntityInstances", null, 1, -1, ContextSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContextSpecification_DevelopedDsl(), this.getDsl(), null, "developedDsl", null, 1, 1, ContextSpecification.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getContextSpecification_OwnedConnections(), this.getEntityInstancesConnection(), null, "ownedConnections", null, 0, -1, ContextSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dslEClass, Dsl.class, "Dsl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDsl_OwnedSyntaxes(), this.getSyntax(), null, "ownedSyntaxes", null, 2, -1, Dsl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDsl_ConcreteSyntaxes(), this.getConcreteSyntax(), null, "concreteSyntaxes", null, 1, -1, Dsl.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDsl_Abstractsyntax(), this.getAbstractSyntax(), null, "abstractsyntax", null, 1, 1, Dsl.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDsl_SupportingTools(), this.getSoftwareTool(), this.getSoftwareTool_SupportedLanguages(), "supportingTools", null, 0, -1, Dsl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDsl_OwnedSemantics(), this.getSemantics(), null, "ownedSemantics", null, 0, -1, Dsl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDsl_OwnedFeatureDiagrams(), this.getFeatureDiagram(), null, "ownedFeatureDiagrams", null, 0, -1, Dsl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDsl_OwnedDocumentations(), this.getDocumentation(), null, "ownedDocumentations", null, 0, -1, Dsl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDsl_MaintenanceService(), this.getMaintenanceService(), null, "maintenanceService", null, 0, 1, Dsl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(syntaxEClass, Syntax.class, "Syntax", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(abstractSyntaxEClass, AbstractSyntax.class, "AbstractSyntax", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractSyntax_OwnedDomainConcepts(), this.getDomainConcept(), null, "ownedDomainConcepts", null, 0, -1, AbstractSyntax.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(concreteSyntaxEClass, ConcreteSyntax.class, "ConcreteSyntax", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConcreteSyntax_Language(), theConstraintsPackage.getNaturalConstraintLanguage(), null, "language", null, 0, 1, ConcreteSyntax.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eCoreAbstractSyntaxEClass, ECoreAbstractSyntax.class, "ECoreAbstractSyntax", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getECoreAbstractSyntax_Packages(), ecorePackage.getEPackage(), null, "packages", null, 1, -1, ECoreAbstractSyntax.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(siriusConcreteSyntaxEClass, SiriusConcreteSyntax.class, "SiriusConcreteSyntax", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSiriusConcreteSyntax_SiriusSpecification(), theDescriptionPackage.getGroup(), null, "siriusSpecification", null, 1, -1, SiriusConcreteSyntax.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(toolEClass, Tool.class, "Tool", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTool_UsedBy(), this.getUser(), this.getUser_Uses(), "usedBy", null, 0, -1, Tool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(userEClass, User.class, "User", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUser_Uses(), this.getTool(), this.getTool_UsedBy(), "uses", null, 1, -1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUser_AgeMin(), theEcorePackage.getEInt(), "ageMin", null, 1, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUser_AgeMax(), theEcorePackage.getEInt(), "ageMax", null, 1, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(workPlaceEClass, WorkPlace.class, "WorkPlace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(computerEClass, Computer.class, "Computer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComputer_Executes(), this.getSoftwareTool(), this.getSoftwareTool_ExecutedBy(), "executes", null, 1, -1, Computer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(softwareToolEClass, SoftwareTool.class, "SoftwareTool", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSoftwareTool_SupportedLanguages(), this.getDsl(), this.getDsl_SupportingTools(), "supportedLanguages", null, 1, -1, SoftwareTool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSoftwareTool_ExecutedBy(), this.getComputer(), this.getComputer_Executes(), "executedBy", null, 1, -1, SoftwareTool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(operatingSystemEClass, OperatingSystem.class, "OperatingSystem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(semanticsEClass, Semantics.class, "Semantics", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(domainConceptEClass, DomainConcept.class, "DomainConcept", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(eCoreDomainConceptEClass, ECoreDomainConcept.class, "ECoreDomainConcept", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getECoreDomainConcept_DomainClass(), theEcorePackage.getEClass(), null, "domainClass", null, 1, 1, ECoreDomainConcept.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(featureDiagramEClass, FeatureDiagram.class, "FeatureDiagram", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(modelCheckerEClass, ModelChecker.class, "ModelChecker", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(modelSimulatorEClass, ModelSimulator.class, "ModelSimulator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(documentationEClass, Documentation.class, "Documentation", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(maintenanceServiceEClass, MaintenanceService.class, "MaintenanceService", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(contextEntityInstanceEClass, ContextEntityInstance.class, "ContextEntityInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContextEntityInstance_EntityType(), this.getContextEntityType(), null, "entityType", null, 1, 1, ContextEntityInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(entityInstancesConnectionEClass, EntityInstancesConnection.class, "EntityInstancesConnection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEntityInstancesConnection_SourceFeature(), this.getInteractionFeature(), null, "sourceFeature", null, 1, 1, EntityInstancesConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntityInstancesConnection_DestinationFeature(), this.getInteractionFeature(), null, "destinationFeature", null, 1, 1, EntityInstancesConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntityInstancesConnection_SourceEntityInstance(), this.getContextEntityInstance(), null, "sourceEntityInstance", null, 1, 1, EntityInstancesConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntityInstancesConnection_DestinationEntityInstance(), this.getContextEntityInstance(), null, "destinationEntityInstance", null, 1, 1, EntityInstancesConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(physicalSystemEClass, PhysicalSystem.class, "PhysicalSystem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPhysicalSystem_Inputs(), theEcorePackage.getEReference(), null, "inputs", null, 1, -1, PhysicalSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPhysicalSystem_Outputs(), theEcorePackage.getEReference(), null, "outputs", null, 1, -1, PhysicalSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(interactionFeatureEClass, InteractionFeature.class, "InteractionFeature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInteractionFeature_Feature(), theEcorePackage.getEReference(), null, "feature", null, 1, 1, InteractionFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //UsemearchPackageImpl
