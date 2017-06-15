/**
 */
package fr.tpt.useme.architecture.model.usemearch.impl;

import fr.tpt.useme.architecture.model.usemearch.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
			case UsemearchPackage.DSSL_SPECIFICATION: return createDsslSpecification();
			case UsemearchPackage.CONTEXT_SPECIFICATION: return createContextSpecification();
			case UsemearchPackage.DSL: return createDsl();
			case UsemearchPackage.ECORE_ABSTRACT_SYNTAX: return createECoreAbstractSyntax();
			case UsemearchPackage.SIRIUS_CONCRETE_SYNTAX: return createSiriusConcreteSyntax();
			case UsemearchPackage.USER: return createUser();
			case UsemearchPackage.WORK_PLACE: return createWorkPlace();
			case UsemearchPackage.COMPUTER: return createComputer();
			case UsemearchPackage.SOFTWARE_TOOL: return createSoftwareTool();
			case UsemearchPackage.OPERATING_SYSTEM: return createOperatingSystem();
			case UsemearchPackage.FEATURE_DIAGRAM: return createFeatureDiagram();
			case UsemearchPackage.MODEL_CHECKER: return createModelChecker();
			case UsemearchPackage.MODEL_SIMULATOR: return createModelSimulator();
			case UsemearchPackage.MAINTENANCE_SERVICE: return createMaintenanceService();
			case UsemearchPackage.ENTITY_INSTANCE: return createEntityInstance();
			case UsemearchPackage.ENTITY_INSTANCES_CONNECTION: return createEntityInstancesConnection();
			case UsemearchPackage.PHYSICAL_SYSTEM: return createPhysicalSystem();
			case UsemearchPackage.INTERACTION_FEATURE: return createInteractionFeature();
			case UsemearchPackage.DISPLAY: return createDisplay();
			case UsemearchPackage.MOUSE: return createMouse();
			case UsemearchPackage.HARDWARE_TOOL: return createHardwareTool();
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
			case UsemearchPackage.COLOR_SCHEME:
				return createColorSchemeFromString(eDataType, initialValue);
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
			case UsemearchPackage.COLOR_SCHEME:
				return convertColorSchemeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DsslSpecification createDsslSpecification() {
		DsslSpecificationImpl dsslSpecification = new DsslSpecificationImpl();
		return dsslSpecification;
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
	public EntityInstance createEntityInstance() {
		EntityInstanceImpl entityInstance = new EntityInstanceImpl();
		return entityInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityInstancesConnection createEntityInstancesConnection() {
		EntityInstancesConnectionImpl entityInstancesConnection = new EntityInstancesConnectionImpl();
		return entityInstancesConnection;
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
	public InteractionFeature createInteractionFeature() {
		InteractionFeatureImpl interactionFeature = new InteractionFeatureImpl();
		return interactionFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Display createDisplay() {
		DisplayImpl display = new DisplayImpl();
		return display;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mouse createMouse() {
		MouseImpl mouse = new MouseImpl();
		return mouse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HardwareTool createHardwareTool() {
		HardwareToolImpl hardwareTool = new HardwareToolImpl();
		return hardwareTool;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColorScheme createColorSchemeFromString(EDataType eDataType, String initialValue) {
		ColorScheme result = ColorScheme.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertColorSchemeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
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
