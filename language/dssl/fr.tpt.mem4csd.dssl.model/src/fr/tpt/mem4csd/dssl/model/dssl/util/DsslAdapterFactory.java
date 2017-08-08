/**
 */
package fr.tpt.mem4csd.dssl.model.dssl.util;

import fr.tpt.mem4csd.dssl.model.dssl.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see fr.tpt.mem4csd.dssl.model.dssl.DsslPackage
 * @generated
 */
public class DsslAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DsslPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DsslAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = DsslPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DsslSwitch<Adapter> modelSwitch =
		new DsslSwitch<Adapter>() {
			@Override
			public Adapter caseIdentifiedElement(IdentifiedElement object) {
				return createIdentifiedElementAdapter();
			}
			@Override
			public Adapter caseDsslSpecification(DsslSpecification object) {
				return createDsslSpecificationAdapter();
			}
			@Override
			public Adapter caseEntityType(EntityType object) {
				return createEntityTypeAdapter();
			}
			@Override
			public Adapter caseContextSpecification(ContextSpecification object) {
				return createContextSpecificationAdapter();
			}
			@Override
			public Adapter caseDsl(Dsl object) {
				return createDslAdapter();
			}
			@Override
			public Adapter caseSyntax(Syntax object) {
				return createSyntaxAdapter();
			}
			@Override
			public Adapter caseAbstractSyntax(AbstractSyntax object) {
				return createAbstractSyntaxAdapter();
			}
			@Override
			public Adapter caseConcreteSyntax(ConcreteSyntax object) {
				return createConcreteSyntaxAdapter();
			}
			@Override
			public Adapter caseECoreAbstractSyntax(ECoreAbstractSyntax object) {
				return createECoreAbstractSyntaxAdapter();
			}
			@Override
			public Adapter caseSiriusConcreteSyntax(SiriusConcreteSyntax object) {
				return createSiriusConcreteSyntaxAdapter();
			}
			@Override
			public Adapter caseTool(Tool object) {
				return createToolAdapter();
			}
			@Override
			public Adapter caseUser(User object) {
				return createUserAdapter();
			}
			@Override
			public Adapter caseWorkPlace(WorkPlace object) {
				return createWorkPlaceAdapter();
			}
			@Override
			public Adapter caseComputer(Computer object) {
				return createComputerAdapter();
			}
			@Override
			public Adapter caseSoftwareTool(SoftwareTool object) {
				return createSoftwareToolAdapter();
			}
			@Override
			public Adapter caseOperatingSystem(OperatingSystem object) {
				return createOperatingSystemAdapter();
			}
			@Override
			public Adapter caseSemantics(Semantics object) {
				return createSemanticsAdapter();
			}
			@Override
			public Adapter caseFeatureDiagram(FeatureDiagram object) {
				return createFeatureDiagramAdapter();
			}
			@Override
			public Adapter caseModelChecker(ModelChecker object) {
				return createModelCheckerAdapter();
			}
			@Override
			public Adapter caseModelSimulator(ModelSimulator object) {
				return createModelSimulatorAdapter();
			}
			@Override
			public Adapter caseDocumentation(Documentation object) {
				return createDocumentationAdapter();
			}
			@Override
			public Adapter caseMaintenanceService(MaintenanceService object) {
				return createMaintenanceServiceAdapter();
			}
			@Override
			public Adapter caseEntityInstance(EntityInstance object) {
				return createEntityInstanceAdapter();
			}
			@Override
			public Adapter caseEntityInstancesConnection(EntityInstancesConnection object) {
				return createEntityInstancesConnectionAdapter();
			}
			@Override
			public Adapter casePhysicalSystem(PhysicalSystem object) {
				return createPhysicalSystemAdapter();
			}
			@Override
			public Adapter caseInteractionFeature(InteractionFeature object) {
				return createInteractionFeatureAdapter();
			}
			@Override
			public Adapter caseDisplay(Display object) {
				return createDisplayAdapter();
			}
			@Override
			public Adapter caseMouse(Mouse object) {
				return createMouseAdapter();
			}
			@Override
			public Adapter caseHardwareTool(HardwareTool object) {
				return createHardwareToolAdapter();
			}
			@Override
			public Adapter caseDescription_IdentifiedElement(org.eclipse.sirius.viewpoint.description.IdentifiedElement object) {
				return createDescription_IdentifiedElementAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link fr.tpt.mem4csd.dssl.model.dssl.IdentifiedElement <em>Identified Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.tpt.mem4csd.dssl.model.dssl.IdentifiedElement
	 * @generated
	 */
	public Adapter createIdentifiedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.tpt.mem4csd.dssl.model.dssl.DsslSpecification <em>Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.tpt.mem4csd.dssl.model.dssl.DsslSpecification
	 * @generated
	 */
	public Adapter createDsslSpecificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.tpt.mem4csd.dssl.model.dssl.EntityType <em>Entity Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.tpt.mem4csd.dssl.model.dssl.EntityType
	 * @generated
	 */
	public Adapter createEntityTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.tpt.mem4csd.dssl.model.dssl.ContextSpecification <em>Context Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.tpt.mem4csd.dssl.model.dssl.ContextSpecification
	 * @generated
	 */
	public Adapter createContextSpecificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.tpt.mem4csd.dssl.model.dssl.Dsl <em>Dsl</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.tpt.mem4csd.dssl.model.dssl.Dsl
	 * @generated
	 */
	public Adapter createDslAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.tpt.mem4csd.dssl.model.dssl.Syntax <em>Syntax</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.tpt.mem4csd.dssl.model.dssl.Syntax
	 * @generated
	 */
	public Adapter createSyntaxAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.tpt.mem4csd.dssl.model.dssl.AbstractSyntax <em>Abstract Syntax</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.tpt.mem4csd.dssl.model.dssl.AbstractSyntax
	 * @generated
	 */
	public Adapter createAbstractSyntaxAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.tpt.mem4csd.dssl.model.dssl.ConcreteSyntax <em>Concrete Syntax</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.tpt.mem4csd.dssl.model.dssl.ConcreteSyntax
	 * @generated
	 */
	public Adapter createConcreteSyntaxAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.tpt.mem4csd.dssl.model.dssl.ECoreAbstractSyntax <em>ECore Abstract Syntax</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.tpt.mem4csd.dssl.model.dssl.ECoreAbstractSyntax
	 * @generated
	 */
	public Adapter createECoreAbstractSyntaxAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.tpt.mem4csd.dssl.model.dssl.SiriusConcreteSyntax <em>Sirius Concrete Syntax</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.tpt.mem4csd.dssl.model.dssl.SiriusConcreteSyntax
	 * @generated
	 */
	public Adapter createSiriusConcreteSyntaxAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.tpt.mem4csd.dssl.model.dssl.Tool <em>Tool</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.tpt.mem4csd.dssl.model.dssl.Tool
	 * @generated
	 */
	public Adapter createToolAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.tpt.mem4csd.dssl.model.dssl.User <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.tpt.mem4csd.dssl.model.dssl.User
	 * @generated
	 */
	public Adapter createUserAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.tpt.mem4csd.dssl.model.dssl.WorkPlace <em>Work Place</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.tpt.mem4csd.dssl.model.dssl.WorkPlace
	 * @generated
	 */
	public Adapter createWorkPlaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.tpt.mem4csd.dssl.model.dssl.Computer <em>Computer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.tpt.mem4csd.dssl.model.dssl.Computer
	 * @generated
	 */
	public Adapter createComputerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.tpt.mem4csd.dssl.model.dssl.SoftwareTool <em>Software Tool</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.tpt.mem4csd.dssl.model.dssl.SoftwareTool
	 * @generated
	 */
	public Adapter createSoftwareToolAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.tpt.mem4csd.dssl.model.dssl.OperatingSystem <em>Operating System</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.tpt.mem4csd.dssl.model.dssl.OperatingSystem
	 * @generated
	 */
	public Adapter createOperatingSystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.tpt.mem4csd.dssl.model.dssl.Semantics <em>Semantics</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.tpt.mem4csd.dssl.model.dssl.Semantics
	 * @generated
	 */
	public Adapter createSemanticsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.tpt.mem4csd.dssl.model.dssl.FeatureDiagram <em>Feature Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.tpt.mem4csd.dssl.model.dssl.FeatureDiagram
	 * @generated
	 */
	public Adapter createFeatureDiagramAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.tpt.mem4csd.dssl.model.dssl.ModelChecker <em>Model Checker</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.tpt.mem4csd.dssl.model.dssl.ModelChecker
	 * @generated
	 */
	public Adapter createModelCheckerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.tpt.mem4csd.dssl.model.dssl.ModelSimulator <em>Model Simulator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.tpt.mem4csd.dssl.model.dssl.ModelSimulator
	 * @generated
	 */
	public Adapter createModelSimulatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.tpt.mem4csd.dssl.model.dssl.Documentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.tpt.mem4csd.dssl.model.dssl.Documentation
	 * @generated
	 */
	public Adapter createDocumentationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.tpt.mem4csd.dssl.model.dssl.MaintenanceService <em>Maintenance Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.tpt.mem4csd.dssl.model.dssl.MaintenanceService
	 * @generated
	 */
	public Adapter createMaintenanceServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.tpt.mem4csd.dssl.model.dssl.EntityInstance <em>Entity Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.tpt.mem4csd.dssl.model.dssl.EntityInstance
	 * @generated
	 */
	public Adapter createEntityInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.tpt.mem4csd.dssl.model.dssl.EntityInstancesConnection <em>Entity Instances Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.tpt.mem4csd.dssl.model.dssl.EntityInstancesConnection
	 * @generated
	 */
	public Adapter createEntityInstancesConnectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.tpt.mem4csd.dssl.model.dssl.PhysicalSystem <em>Physical System</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.tpt.mem4csd.dssl.model.dssl.PhysicalSystem
	 * @generated
	 */
	public Adapter createPhysicalSystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.tpt.mem4csd.dssl.model.dssl.InteractionFeature <em>Interaction Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.tpt.mem4csd.dssl.model.dssl.InteractionFeature
	 * @generated
	 */
	public Adapter createInteractionFeatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.tpt.mem4csd.dssl.model.dssl.Display <em>Display</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.tpt.mem4csd.dssl.model.dssl.Display
	 * @generated
	 */
	public Adapter createDisplayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.tpt.mem4csd.dssl.model.dssl.Mouse <em>Mouse</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.tpt.mem4csd.dssl.model.dssl.Mouse
	 * @generated
	 */
	public Adapter createMouseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.tpt.mem4csd.dssl.model.dssl.HardwareTool <em>Hardware Tool</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.tpt.mem4csd.dssl.model.dssl.HardwareTool
	 * @generated
	 */
	public Adapter createHardwareToolAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.sirius.viewpoint.description.IdentifiedElement <em>Identified Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.sirius.viewpoint.description.IdentifiedElement
	 * @generated
	 */
	public Adapter createDescription_IdentifiedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //DsslAdapterFactory
