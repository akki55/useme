/**
 */
package fr.tpt.mem4csd.dssl.model.dssl.impl;

import fr.labsticc.framework.constraints.model.constraints.ConstraintsPackage;

import fr.labsticc.framework.settings.model.settings.SettingsPackage;

import fr.tpt.mem4csd.dssl.model.dssl.AbstractSyntax;
import fr.tpt.mem4csd.dssl.model.dssl.ColorScheme;
import fr.tpt.mem4csd.dssl.model.dssl.Computer;
import fr.tpt.mem4csd.dssl.model.dssl.ConcreteSyntax;
import fr.tpt.mem4csd.dssl.model.dssl.ContextSpecification;
import fr.tpt.mem4csd.dssl.model.dssl.Display;
import fr.tpt.mem4csd.dssl.model.dssl.Documentation;
import fr.tpt.mem4csd.dssl.model.dssl.Dsl;
import fr.tpt.mem4csd.dssl.model.dssl.DsslFactory;
import fr.tpt.mem4csd.dssl.model.dssl.DsslPackage;
import fr.tpt.mem4csd.dssl.model.dssl.DsslSpecification;
import fr.tpt.mem4csd.dssl.model.dssl.ECoreAbstractSyntax;
import fr.tpt.mem4csd.dssl.model.dssl.EntityInstance;
import fr.tpt.mem4csd.dssl.model.dssl.EntityInstancesConnection;
import fr.tpt.mem4csd.dssl.model.dssl.EntityType;
import fr.tpt.mem4csd.dssl.model.dssl.FeatureDiagram;
import fr.tpt.mem4csd.dssl.model.dssl.HardwareTool;
import fr.tpt.mem4csd.dssl.model.dssl.IdentifiedElement;
import fr.tpt.mem4csd.dssl.model.dssl.InteractionFeature;
import fr.tpt.mem4csd.dssl.model.dssl.MaintenanceService;
import fr.tpt.mem4csd.dssl.model.dssl.ModelChecker;
import fr.tpt.mem4csd.dssl.model.dssl.ModelSimulator;
import fr.tpt.mem4csd.dssl.model.dssl.Mouse;
import fr.tpt.mem4csd.dssl.model.dssl.OperatingSystem;
import fr.tpt.mem4csd.dssl.model.dssl.PhysicalSystem;
import fr.tpt.mem4csd.dssl.model.dssl.Semantics;
import fr.tpt.mem4csd.dssl.model.dssl.SiriusConcreteSyntax;
import fr.tpt.mem4csd.dssl.model.dssl.SoftwareTool;
import fr.tpt.mem4csd.dssl.model.dssl.Syntax;
import fr.tpt.mem4csd.dssl.model.dssl.Tool;
import fr.tpt.mem4csd.dssl.model.dssl.User;
import fr.tpt.mem4csd.dssl.model.dssl.WorkPlace;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
public class DsslPackageImpl extends EPackageImpl implements DsslPackage {
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
	private EClass dsslSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entityTypeEClass = null;

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
	private EClass entityInstanceEClass = null;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass displayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mouseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hardwareToolEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum colorSchemeEEnum = null;

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
	 * @see fr.tpt.mem4csd.dssl.model.dssl.DsslPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DsslPackageImpl() {
		super(eNS_URI, DsslFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link DsslPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DsslPackage init() {
		if (isInited) return (DsslPackage)EPackage.Registry.INSTANCE.getEPackage(DsslPackage.eNS_URI);

		// Obtain or create and register package
		DsslPackageImpl theDsslPackage = (DsslPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DsslPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DsslPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		SettingsPackage.eINSTANCE.eClass();
		ViewpointPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theDsslPackage.createPackageContents();

		// Initialize created meta-data
		theDsslPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDsslPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DsslPackage.eNS_URI, theDsslPackage);
		return theDsslPackage;
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
	public EClass getDsslSpecification() {
		return dsslSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDsslSpecification_DevelopedDsl() {
		return (EReference)dsslSpecificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDsslSpecification_OwnedContexts() {
		return (EReference)dsslSpecificationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDsslSpecification_OwnedEntityTypes() {
		return (EReference)dsslSpecificationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntityType() {
		return entityTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntityType_Category() {
		return (EReference)entityTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntityType_OwnedInteractionFeatures() {
		return (EReference)entityTypeEClass.getEStructuralFeatures().get(1);
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
	public EReference getTool_ControlledBy() {
		return (EReference)toolEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTool_Controls() {
		return (EReference)toolEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTool_Version() {
		return (EAttribute)toolEClass.getEStructuralFeatures().get(3);
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
	public EReference getUser_Perception() {
		return (EReference)userEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUser_SpokenLanguages() {
		return (EAttribute)userEClass.getEStructuralFeatures().get(4);
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
	public EReference getComputer_Displays() {
		return (EReference)computerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComputer_Mouses() {
		return (EReference)computerEClass.getEStructuralFeatures().get(2);
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
	public EClass getEntityInstance() {
		return entityInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntityInstance_EntityType() {
		return (EReference)entityInstanceEClass.getEStructuralFeatures().get(0);
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
	public EReference getPhysicalSystem_ControlledBy() {
		return (EReference)physicalSystemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalSystem_Inputs() {
		return (EReference)physicalSystemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalSystem_Visual() {
		return (EReference)physicalSystemEClass.getEStructuralFeatures().get(2);
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
	public EClass getDisplay() {
		return displayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDisplay_ResolutionX() {
		return (EAttribute)displayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDisplay_ResolutionY() {
		return (EAttribute)displayEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDisplay_SupportedColors() {
		return (EAttribute)displayEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMouse() {
		return mouseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHardwareTool() {
		return hardwareToolEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getColorScheme() {
		return colorSchemeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DsslFactory getDsslFactory() {
		return (DsslFactory)getEFactoryInstance();
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

		dsslSpecificationEClass = createEClass(DSSL_SPECIFICATION);
		createEReference(dsslSpecificationEClass, DSSL_SPECIFICATION__DEVELOPED_DSL);
		createEReference(dsslSpecificationEClass, DSSL_SPECIFICATION__OWNED_CONTEXTS);
		createEReference(dsslSpecificationEClass, DSSL_SPECIFICATION__OWNED_ENTITY_TYPES);

		entityTypeEClass = createEClass(ENTITY_TYPE);
		createEReference(entityTypeEClass, ENTITY_TYPE__CATEGORY);
		createEReference(entityTypeEClass, ENTITY_TYPE__OWNED_INTERACTION_FEATURES);

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

		concreteSyntaxEClass = createEClass(CONCRETE_SYNTAX);
		createEReference(concreteSyntaxEClass, CONCRETE_SYNTAX__LANGUAGE);

		eCoreAbstractSyntaxEClass = createEClass(ECORE_ABSTRACT_SYNTAX);
		createEReference(eCoreAbstractSyntaxEClass, ECORE_ABSTRACT_SYNTAX__PACKAGES);

		siriusConcreteSyntaxEClass = createEClass(SIRIUS_CONCRETE_SYNTAX);
		createEReference(siriusConcreteSyntaxEClass, SIRIUS_CONCRETE_SYNTAX__SIRIUS_SPECIFICATION);

		toolEClass = createEClass(TOOL);
		createEReference(toolEClass, TOOL__USED_BY);
		createEReference(toolEClass, TOOL__CONTROLLED_BY);
		createEReference(toolEClass, TOOL__CONTROLS);
		createEAttribute(toolEClass, TOOL__VERSION);

		userEClass = createEClass(USER);
		createEReference(userEClass, USER__USES);
		createEAttribute(userEClass, USER__AGE_MIN);
		createEAttribute(userEClass, USER__AGE_MAX);
		createEReference(userEClass, USER__PERCEPTION);
		createEAttribute(userEClass, USER__SPOKEN_LANGUAGES);

		workPlaceEClass = createEClass(WORK_PLACE);

		computerEClass = createEClass(COMPUTER);
		createEReference(computerEClass, COMPUTER__EXECUTES);
		createEReference(computerEClass, COMPUTER__DISPLAYS);
		createEReference(computerEClass, COMPUTER__MOUSES);

		softwareToolEClass = createEClass(SOFTWARE_TOOL);
		createEReference(softwareToolEClass, SOFTWARE_TOOL__SUPPORTED_LANGUAGES);
		createEReference(softwareToolEClass, SOFTWARE_TOOL__EXECUTED_BY);

		operatingSystemEClass = createEClass(OPERATING_SYSTEM);

		semanticsEClass = createEClass(SEMANTICS);

		featureDiagramEClass = createEClass(FEATURE_DIAGRAM);

		modelCheckerEClass = createEClass(MODEL_CHECKER);

		modelSimulatorEClass = createEClass(MODEL_SIMULATOR);

		documentationEClass = createEClass(DOCUMENTATION);

		maintenanceServiceEClass = createEClass(MAINTENANCE_SERVICE);

		entityInstanceEClass = createEClass(ENTITY_INSTANCE);
		createEReference(entityInstanceEClass, ENTITY_INSTANCE__ENTITY_TYPE);

		entityInstancesConnectionEClass = createEClass(ENTITY_INSTANCES_CONNECTION);
		createEReference(entityInstancesConnectionEClass, ENTITY_INSTANCES_CONNECTION__SOURCE_FEATURE);
		createEReference(entityInstancesConnectionEClass, ENTITY_INSTANCES_CONNECTION__DESTINATION_FEATURE);
		createEReference(entityInstancesConnectionEClass, ENTITY_INSTANCES_CONNECTION__SOURCE_ENTITY_INSTANCE);
		createEReference(entityInstancesConnectionEClass, ENTITY_INSTANCES_CONNECTION__DESTINATION_ENTITY_INSTANCE);

		physicalSystemEClass = createEClass(PHYSICAL_SYSTEM);
		createEReference(physicalSystemEClass, PHYSICAL_SYSTEM__CONTROLLED_BY);
		createEReference(physicalSystemEClass, PHYSICAL_SYSTEM__INPUTS);
		createEReference(physicalSystemEClass, PHYSICAL_SYSTEM__VISUAL);

		interactionFeatureEClass = createEClass(INTERACTION_FEATURE);
		createEReference(interactionFeatureEClass, INTERACTION_FEATURE__FEATURE);

		displayEClass = createEClass(DISPLAY);
		createEAttribute(displayEClass, DISPLAY__RESOLUTION_X);
		createEAttribute(displayEClass, DISPLAY__RESOLUTION_Y);
		createEAttribute(displayEClass, DISPLAY__SUPPORTED_COLORS);

		mouseEClass = createEClass(MOUSE);

		hardwareToolEClass = createEClass(HARDWARE_TOOL);

		// Create enums
		colorSchemeEEnum = createEEnum(COLOR_SCHEME);
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
		dsslSpecificationEClass.getESuperTypes().add(this.getIdentifiedElement());
		entityTypeEClass.getESuperTypes().add(this.getIdentifiedElement());
		contextSpecificationEClass.getESuperTypes().add(this.getIdentifiedElement());
		dslEClass.getESuperTypes().add(this.getEntityType());
		syntaxEClass.getESuperTypes().add(this.getIdentifiedElement());
		abstractSyntaxEClass.getESuperTypes().add(this.getSyntax());
		concreteSyntaxEClass.getESuperTypes().add(this.getSyntax());
		eCoreAbstractSyntaxEClass.getESuperTypes().add(this.getAbstractSyntax());
		siriusConcreteSyntaxEClass.getESuperTypes().add(this.getConcreteSyntax());
		toolEClass.getESuperTypes().add(this.getEntityType());
		userEClass.getESuperTypes().add(this.getEntityType());
		workPlaceEClass.getESuperTypes().add(this.getEntityType());
		computerEClass.getESuperTypes().add(this.getHardwareTool());
		softwareToolEClass.getESuperTypes().add(this.getTool());
		operatingSystemEClass.getESuperTypes().add(this.getSoftwareTool());
		semanticsEClass.getESuperTypes().add(theDescriptionPackage.getIdentifiedElement());
		featureDiagramEClass.getESuperTypes().add(this.getIdentifiedElement());
		modelCheckerEClass.getESuperTypes().add(this.getSoftwareTool());
		modelSimulatorEClass.getESuperTypes().add(this.getSoftwareTool());
		documentationEClass.getESuperTypes().add(this.getEntityType());
		maintenanceServiceEClass.getESuperTypes().add(theDescriptionPackage.getIdentifiedElement());
		entityInstanceEClass.getESuperTypes().add(this.getIdentifiedElement());
		entityInstancesConnectionEClass.getESuperTypes().add(this.getIdentifiedElement());
		physicalSystemEClass.getESuperTypes().add(this.getEntityType());
		interactionFeatureEClass.getESuperTypes().add(this.getIdentifiedElement());
		displayEClass.getESuperTypes().add(this.getHardwareTool());
		mouseEClass.getESuperTypes().add(this.getPhysicalSystem());
		hardwareToolEClass.getESuperTypes().add(this.getTool());

		// Initialize classes and features; add operations and parameters
		initEClass(identifiedElementEClass, IdentifiedElement.class, "IdentifiedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIdentifiedElement_Name(), ecorePackage.getEString(), "name", null, 1, 1, IdentifiedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIdentifiedElement_Id(), ecorePackage.getEString(), "id", null, 1, 1, IdentifiedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIdentifiedElement_Description(), ecorePackage.getEString(), "description", null, 0, 1, IdentifiedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dsslSpecificationEClass, DsslSpecification.class, "DsslSpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDsslSpecification_DevelopedDsl(), this.getDsl(), null, "developedDsl", null, 1, 1, DsslSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDsslSpecification_OwnedContexts(), this.getContextSpecification(), null, "ownedContexts", null, 1, -1, DsslSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDsslSpecification_OwnedEntityTypes(), this.getEntityType(), null, "ownedEntityTypes", null, 1, -1, DsslSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(entityTypeEClass, EntityType.class, "EntityType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEntityType_Category(), theSettingsPackage.getCategory(), null, "category", null, 0, -1, EntityType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntityType_OwnedInteractionFeatures(), this.getInteractionFeature(), null, "ownedInteractionFeatures", null, 0, -1, EntityType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(contextSpecificationEClass, ContextSpecification.class, "ContextSpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContextSpecification_OwnedEntityInstances(), this.getEntityInstance(), null, "ownedEntityInstances", null, 1, -1, ContextSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
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

		initEClass(concreteSyntaxEClass, ConcreteSyntax.class, "ConcreteSyntax", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConcreteSyntax_Language(), theConstraintsPackage.getNaturalConstraintLanguage(), null, "language", null, 0, 1, ConcreteSyntax.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eCoreAbstractSyntaxEClass, ECoreAbstractSyntax.class, "ECoreAbstractSyntax", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getECoreAbstractSyntax_Packages(), ecorePackage.getEPackage(), null, "packages", null, 1, -1, ECoreAbstractSyntax.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(siriusConcreteSyntaxEClass, SiriusConcreteSyntax.class, "SiriusConcreteSyntax", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSiriusConcreteSyntax_SiriusSpecification(), theDescriptionPackage.getGroup(), null, "siriusSpecification", null, 1, -1, SiriusConcreteSyntax.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(toolEClass, Tool.class, "Tool", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTool_UsedBy(), this.getUser(), this.getUser_Uses(), "usedBy", null, 0, -1, Tool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTool_ControlledBy(), this.getTool(), this.getTool_Controls(), "controlledBy", null, 0, -1, Tool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTool_Controls(), this.getTool(), this.getTool_ControlledBy(), "controls", null, 0, -1, Tool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTool_Version(), theEcorePackage.getEString(), "version", null, 0, 1, Tool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(userEClass, User.class, "User", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUser_Uses(), this.getTool(), this.getTool_UsedBy(), "uses", null, 1, -1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUser_AgeMin(), theEcorePackage.getEInt(), "ageMin", null, 1, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUser_AgeMax(), theEcorePackage.getEInt(), "ageMax", null, 1, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUser_Perception(), this.getPhysicalSystem(), null, "perception", null, 0, -1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUser_SpokenLanguages(), ecorePackage.getEString(), "spokenLanguages", null, 0, -1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(workPlaceEClass, WorkPlace.class, "WorkPlace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(computerEClass, Computer.class, "Computer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComputer_Executes(), this.getSoftwareTool(), this.getSoftwareTool_ExecutedBy(), "executes", null, 0, -1, Computer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComputer_Displays(), this.getDisplay(), null, "displays", null, 0, -1, Computer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComputer_Mouses(), this.getMouse(), null, "mouses", null, 0, -1, Computer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(softwareToolEClass, SoftwareTool.class, "SoftwareTool", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSoftwareTool_SupportedLanguages(), this.getDsl(), this.getDsl_SupportingTools(), "supportedLanguages", null, 0, -1, SoftwareTool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSoftwareTool_ExecutedBy(), this.getComputer(), this.getComputer_Executes(), "executedBy", null, 1, -1, SoftwareTool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(operatingSystemEClass, OperatingSystem.class, "OperatingSystem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(semanticsEClass, Semantics.class, "Semantics", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(featureDiagramEClass, FeatureDiagram.class, "FeatureDiagram", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(modelCheckerEClass, ModelChecker.class, "ModelChecker", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(modelSimulatorEClass, ModelSimulator.class, "ModelSimulator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(documentationEClass, Documentation.class, "Documentation", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(maintenanceServiceEClass, MaintenanceService.class, "MaintenanceService", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(entityInstanceEClass, EntityInstance.class, "EntityInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEntityInstance_EntityType(), this.getEntityType(), null, "entityType", null, 1, 1, EntityInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(entityInstancesConnectionEClass, EntityInstancesConnection.class, "EntityInstancesConnection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEntityInstancesConnection_SourceFeature(), this.getInteractionFeature(), null, "sourceFeature", null, 1, 1, EntityInstancesConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntityInstancesConnection_DestinationFeature(), this.getInteractionFeature(), null, "destinationFeature", null, 1, 1, EntityInstancesConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntityInstancesConnection_SourceEntityInstance(), this.getEntityInstance(), null, "sourceEntityInstance", null, 1, 1, EntityInstancesConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntityInstancesConnection_DestinationEntityInstance(), this.getEntityInstance(), null, "destinationEntityInstance", null, 1, 1, EntityInstancesConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(physicalSystemEClass, PhysicalSystem.class, "PhysicalSystem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPhysicalSystem_ControlledBy(), this.getSoftwareTool(), null, "controlledBy", null, 0, -1, PhysicalSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPhysicalSystem_Inputs(), this.getDsl(), null, "inputs", null, 0, -1, PhysicalSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPhysicalSystem_Visual(), this.getUser(), null, "visual", null, 0, -1, PhysicalSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(interactionFeatureEClass, InteractionFeature.class, "InteractionFeature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInteractionFeature_Feature(), theEcorePackage.getEReference(), null, "feature", null, 1, 1, InteractionFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(displayEClass, Display.class, "Display", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDisplay_ResolutionX(), ecorePackage.getEInt(), "resolutionX", null, 1, 1, Display.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDisplay_ResolutionY(), ecorePackage.getEInt(), "resolutionY", null, 1, 1, Display.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDisplay_SupportedColors(), this.getColorScheme(), "supportedColors", null, 1, -1, Display.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mouseEClass, Mouse.class, "Mouse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(hardwareToolEClass, HardwareTool.class, "HardwareTool", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(colorSchemeEEnum, ColorScheme.class, "ColorScheme");
		addEEnumLiteral(colorSchemeEEnum, ColorScheme.COLORS_TRUE);
		addEEnumLiteral(colorSchemeEEnum, ColorScheme.COLORS65536);
		addEEnumLiteral(colorSchemeEEnum, ColorScheme.MONO_CHROME);

		// Create resource
		createResource(eNS_URI);
	}

} //DsslPackageImpl
