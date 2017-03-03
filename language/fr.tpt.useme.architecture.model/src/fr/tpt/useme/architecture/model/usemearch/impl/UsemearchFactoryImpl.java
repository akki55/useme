/**
 */
package fr.tpt.useme.architecture.model.usemearch.impl;

import fr.tpt.useme.architecture.model.usemearch.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UsemearchFactoryImpl extends EFactoryImpl implements UsemearchFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static UsemearchFactory init() {
		try {
			UsemearchFactory theUsemearchFactory = (UsemearchFactory)EPackage.Registry.INSTANCE.getEFactory(UsemearchPackage.eNS_URI);
			if (theUsemearchFactory != null) {
				return theUsemearchFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new UsemearchFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UsemearchFactoryImpl() {
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
			case UsemearchPackage.DSL_BASED_SYSTEM_SPECIFICATION: return createDslBasedSystemSpecification();
			case UsemearchPackage.CONTEXT_SPECIFICATION: return createContextSpecification();
			case UsemearchPackage.DSL: return createDsl();
			case UsemearchPackage.ECORE_ABSTRACT_SYNTAX: return createECoreAbstractSyntax();
			case UsemearchPackage.SIRIUS_CONCRETE_SYNTAX: return createSiriusConcreteSyntax();
			case UsemearchPackage.USER: return createUser();
			case UsemearchPackage.WORK_PLACE: return createWorkPlace();
			case UsemearchPackage.COMPUTER: return createComputer();
			case UsemearchPackage.SOFTWARE_TOOL: return createSoftwareTool();
			case UsemearchPackage.OPERATING_SYSTEM: return createOperatingSystem();
			case UsemearchPackage.ECORE_DOMAIN_CONCEPT: return createECoreDomainConcept();
			case UsemearchPackage.FEATURE_DIAGRAM: return createFeatureDiagram();
			case UsemearchPackage.MODEL_CHECKER: return createModelChecker();
			case UsemearchPackage.MODEL_SIMULATOR: return createModelSimulator();
			case UsemearchPackage.MAINTENANCE_SERVICE: return createMaintenanceService();
			case UsemearchPackage.CONTEXT_INSTANCE_ELEMENT: return createContextInstanceElement();
			case UsemearchPackage.INSTANCE_ELEMENTS_CONNECTION: return createInstanceElementsConnection();
			case UsemearchPackage.PHYSICAL_SYSTEM: return createPhysicalSystem();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DslBasedSystemSpecification createDslBasedSystemSpecification() {
		DslBasedSystemSpecificationImpl dslBasedSystemSpecification = new DslBasedSystemSpecificationImpl();
		return dslBasedSystemSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContextSpecification createContextSpecification() {
		ContextSpecificationImpl contextSpecification = new ContextSpecificationImpl();
		return contextSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dsl createDsl() {
		DslImpl dsl = new DslImpl();
		return dsl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ECoreAbstractSyntax createECoreAbstractSyntax() {
		ECoreAbstractSyntaxImpl eCoreAbstractSyntax = new ECoreAbstractSyntaxImpl();
		return eCoreAbstractSyntax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SiriusConcreteSyntax createSiriusConcreteSyntax() {
		SiriusConcreteSyntaxImpl siriusConcreteSyntax = new SiriusConcreteSyntaxImpl();
		return siriusConcreteSyntax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public User createUser() {
		UserImpl user = new UserImpl();
		return user;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkPlace createWorkPlace() {
		WorkPlaceImpl workPlace = new WorkPlaceImpl();
		return workPlace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Computer createComputer() {
		ComputerImpl computer = new ComputerImpl();
		return computer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SoftwareTool createSoftwareTool() {
		SoftwareToolImpl softwareTool = new SoftwareToolImpl();
		return softwareTool;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperatingSystem createOperatingSystem() {
		OperatingSystemImpl operatingSystem = new OperatingSystemImpl();
		return operatingSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ECoreDomainConcept createECoreDomainConcept() {
		ECoreDomainConceptImpl eCoreDomainConcept = new ECoreDomainConceptImpl();
		return eCoreDomainConcept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureDiagram createFeatureDiagram() {
		FeatureDiagramImpl featureDiagram = new FeatureDiagramImpl();
		return featureDiagram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelChecker createModelChecker() {
		ModelCheckerImpl modelChecker = new ModelCheckerImpl();
		return modelChecker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelSimulator createModelSimulator() {
		ModelSimulatorImpl modelSimulator = new ModelSimulatorImpl();
		return modelSimulator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MaintenanceService createMaintenanceService() {
		MaintenanceServiceImpl maintenanceService = new MaintenanceServiceImpl();
		return maintenanceService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContextInstanceElement createContextInstanceElement() {
		ContextInstanceElementImpl contextInstanceElement = new ContextInstanceElementImpl();
		return contextInstanceElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstanceElementsConnection createInstanceElementsConnection() {
		InstanceElementsConnectionImpl instanceElementsConnection = new InstanceElementsConnectionImpl();
		return instanceElementsConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalSystem createPhysicalSystem() {
		PhysicalSystemImpl physicalSystem = new PhysicalSystemImpl();
		return physicalSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UsemearchPackage getUsemearchPackage() {
		return (UsemearchPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static UsemearchPackage getPackage() {
		return UsemearchPackage.eINSTANCE;
	}

} //UsemearchFactoryImpl
