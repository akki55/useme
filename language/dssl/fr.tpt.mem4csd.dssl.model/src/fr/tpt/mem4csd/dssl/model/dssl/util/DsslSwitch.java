/**
 */
package fr.tpt.mem4csd.dssl.model.dssl.util;

import fr.tpt.mem4csd.dssl.model.dssl.*;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see fr.tpt.mem4csd.dssl.model.dssl.DsslPackage
 * @generated
 */
public class DsslSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DsslPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DsslSwitch() {
		if (modelPackage == null) {
			modelPackage = DsslPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public T doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List<EClass> eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch(eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case DsslPackage.IDENTIFIED_ELEMENT: {
				IdentifiedElement identifiedElement = (IdentifiedElement)theEObject;
				T result = caseIdentifiedElement(identifiedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DsslPackage.DSSL_SPECIFICATION: {
				DsslSpecification dsslSpecification = (DsslSpecification)theEObject;
				T result = caseDsslSpecification(dsslSpecification);
				if (result == null) result = caseIdentifiedElement(dsslSpecification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DsslPackage.ENTITY_TYPE: {
				EntityType entityType = (EntityType)theEObject;
				T result = caseEntityType(entityType);
				if (result == null) result = caseIdentifiedElement(entityType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DsslPackage.CONTEXT_SPECIFICATION: {
				ContextSpecification contextSpecification = (ContextSpecification)theEObject;
				T result = caseContextSpecification(contextSpecification);
				if (result == null) result = caseIdentifiedElement(contextSpecification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DsslPackage.DSL: {
				Dsl dsl = (Dsl)theEObject;
				T result = caseDsl(dsl);
				if (result == null) result = caseEntityType(dsl);
				if (result == null) result = caseIdentifiedElement(dsl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DsslPackage.SYNTAX: {
				Syntax syntax = (Syntax)theEObject;
				T result = caseSyntax(syntax);
				if (result == null) result = caseIdentifiedElement(syntax);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DsslPackage.ABSTRACT_SYNTAX: {
				AbstractSyntax abstractSyntax = (AbstractSyntax)theEObject;
				T result = caseAbstractSyntax(abstractSyntax);
				if (result == null) result = caseSyntax(abstractSyntax);
				if (result == null) result = caseIdentifiedElement(abstractSyntax);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DsslPackage.CONCRETE_SYNTAX: {
				ConcreteSyntax concreteSyntax = (ConcreteSyntax)theEObject;
				T result = caseConcreteSyntax(concreteSyntax);
				if (result == null) result = caseSyntax(concreteSyntax);
				if (result == null) result = caseIdentifiedElement(concreteSyntax);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DsslPackage.ECORE_ABSTRACT_SYNTAX: {
				ECoreAbstractSyntax eCoreAbstractSyntax = (ECoreAbstractSyntax)theEObject;
				T result = caseECoreAbstractSyntax(eCoreAbstractSyntax);
				if (result == null) result = caseAbstractSyntax(eCoreAbstractSyntax);
				if (result == null) result = caseSyntax(eCoreAbstractSyntax);
				if (result == null) result = caseIdentifiedElement(eCoreAbstractSyntax);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DsslPackage.SIRIUS_CONCRETE_SYNTAX: {
				SiriusConcreteSyntax siriusConcreteSyntax = (SiriusConcreteSyntax)theEObject;
				T result = caseSiriusConcreteSyntax(siriusConcreteSyntax);
				if (result == null) result = caseConcreteSyntax(siriusConcreteSyntax);
				if (result == null) result = caseSyntax(siriusConcreteSyntax);
				if (result == null) result = caseIdentifiedElement(siriusConcreteSyntax);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DsslPackage.TOOL: {
				Tool tool = (Tool)theEObject;
				T result = caseTool(tool);
				if (result == null) result = caseEntityType(tool);
				if (result == null) result = caseIdentifiedElement(tool);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DsslPackage.USER: {
				User user = (User)theEObject;
				T result = caseUser(user);
				if (result == null) result = caseEntityType(user);
				if (result == null) result = caseIdentifiedElement(user);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DsslPackage.WORK_PLACE: {
				WorkPlace workPlace = (WorkPlace)theEObject;
				T result = caseWorkPlace(workPlace);
				if (result == null) result = caseEntityType(workPlace);
				if (result == null) result = caseIdentifiedElement(workPlace);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DsslPackage.COMPUTER: {
				Computer computer = (Computer)theEObject;
				T result = caseComputer(computer);
				if (result == null) result = caseHardwareTool(computer);
				if (result == null) result = caseTool(computer);
				if (result == null) result = caseEntityType(computer);
				if (result == null) result = caseIdentifiedElement(computer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DsslPackage.SOFTWARE_TOOL: {
				SoftwareTool softwareTool = (SoftwareTool)theEObject;
				T result = caseSoftwareTool(softwareTool);
				if (result == null) result = caseTool(softwareTool);
				if (result == null) result = caseEntityType(softwareTool);
				if (result == null) result = caseIdentifiedElement(softwareTool);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DsslPackage.OPERATING_SYSTEM: {
				OperatingSystem operatingSystem = (OperatingSystem)theEObject;
				T result = caseOperatingSystem(operatingSystem);
				if (result == null) result = caseSoftwareTool(operatingSystem);
				if (result == null) result = caseTool(operatingSystem);
				if (result == null) result = caseEntityType(operatingSystem);
				if (result == null) result = caseIdentifiedElement(operatingSystem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DsslPackage.SEMANTICS: {
				Semantics semantics = (Semantics)theEObject;
				T result = caseSemantics(semantics);
				if (result == null) result = caseDescription_IdentifiedElement(semantics);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DsslPackage.FEATURE_DIAGRAM: {
				FeatureDiagram featureDiagram = (FeatureDiagram)theEObject;
				T result = caseFeatureDiagram(featureDiagram);
				if (result == null) result = caseIdentifiedElement(featureDiagram);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DsslPackage.MODEL_CHECKER: {
				ModelChecker modelChecker = (ModelChecker)theEObject;
				T result = caseModelChecker(modelChecker);
				if (result == null) result = caseSoftwareTool(modelChecker);
				if (result == null) result = caseTool(modelChecker);
				if (result == null) result = caseEntityType(modelChecker);
				if (result == null) result = caseIdentifiedElement(modelChecker);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DsslPackage.MODEL_SIMULATOR: {
				ModelSimulator modelSimulator = (ModelSimulator)theEObject;
				T result = caseModelSimulator(modelSimulator);
				if (result == null) result = caseSoftwareTool(modelSimulator);
				if (result == null) result = caseTool(modelSimulator);
				if (result == null) result = caseEntityType(modelSimulator);
				if (result == null) result = caseIdentifiedElement(modelSimulator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DsslPackage.DOCUMENTATION: {
				Documentation documentation = (Documentation)theEObject;
				T result = caseDocumentation(documentation);
				if (result == null) result = caseEntityType(documentation);
				if (result == null) result = caseIdentifiedElement(documentation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DsslPackage.MAINTENANCE_SERVICE: {
				MaintenanceService maintenanceService = (MaintenanceService)theEObject;
				T result = caseMaintenanceService(maintenanceService);
				if (result == null) result = caseDescription_IdentifiedElement(maintenanceService);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DsslPackage.ENTITY_INSTANCE: {
				EntityInstance entityInstance = (EntityInstance)theEObject;
				T result = caseEntityInstance(entityInstance);
				if (result == null) result = caseIdentifiedElement(entityInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DsslPackage.ENTITY_INSTANCES_CONNECTION: {
				EntityInstancesConnection entityInstancesConnection = (EntityInstancesConnection)theEObject;
				T result = caseEntityInstancesConnection(entityInstancesConnection);
				if (result == null) result = caseIdentifiedElement(entityInstancesConnection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DsslPackage.PHYSICAL_SYSTEM: {
				PhysicalSystem physicalSystem = (PhysicalSystem)theEObject;
				T result = casePhysicalSystem(physicalSystem);
				if (result == null) result = caseEntityType(physicalSystem);
				if (result == null) result = caseIdentifiedElement(physicalSystem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DsslPackage.INTERACTION_FEATURE: {
				InteractionFeature interactionFeature = (InteractionFeature)theEObject;
				T result = caseInteractionFeature(interactionFeature);
				if (result == null) result = caseIdentifiedElement(interactionFeature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DsslPackage.DISPLAY: {
				Display display = (Display)theEObject;
				T result = caseDisplay(display);
				if (result == null) result = caseHardwareTool(display);
				if (result == null) result = caseTool(display);
				if (result == null) result = caseEntityType(display);
				if (result == null) result = caseIdentifiedElement(display);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DsslPackage.MOUSE: {
				Mouse mouse = (Mouse)theEObject;
				T result = caseMouse(mouse);
				if (result == null) result = casePhysicalSystem(mouse);
				if (result == null) result = caseEntityType(mouse);
				if (result == null) result = caseIdentifiedElement(mouse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DsslPackage.HARDWARE_TOOL: {
				HardwareTool hardwareTool = (HardwareTool)theEObject;
				T result = caseHardwareTool(hardwareTool);
				if (result == null) result = caseTool(hardwareTool);
				if (result == null) result = caseEntityType(hardwareTool);
				if (result == null) result = caseIdentifiedElement(hardwareTool);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Identified Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Identified Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIdentifiedElement(IdentifiedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Specification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Specification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDsslSpecification(DsslSpecification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntityType(EntityType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Context Specification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Context Specification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContextSpecification(ContextSpecification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dsl</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dsl</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDsl(Dsl object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Syntax</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Syntax</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSyntax(Syntax object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Syntax</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Syntax</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractSyntax(AbstractSyntax object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Concrete Syntax</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Concrete Syntax</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConcreteSyntax(ConcreteSyntax object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ECore Abstract Syntax</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ECore Abstract Syntax</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseECoreAbstractSyntax(ECoreAbstractSyntax object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sirius Concrete Syntax</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sirius Concrete Syntax</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSiriusConcreteSyntax(SiriusConcreteSyntax object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tool</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tool</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTool(Tool object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>User</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>User</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUser(User object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Work Place</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Work Place</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWorkPlace(WorkPlace object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Computer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Computer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComputer(Computer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Software Tool</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Software Tool</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSoftwareTool(SoftwareTool object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operating System</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operating System</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperatingSystem(OperatingSystem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Semantics</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Semantics</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSemantics(Semantics object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature Diagram</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature Diagram</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeatureDiagram(FeatureDiagram object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Checker</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Checker</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelChecker(ModelChecker object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Simulator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Simulator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelSimulator(ModelSimulator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Documentation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Documentation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentation(Documentation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Maintenance Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Maintenance Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMaintenanceService(MaintenanceService object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntityInstance(EntityInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity Instances Connection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity Instances Connection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntityInstancesConnection(EntityInstancesConnection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Physical System</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Physical System</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePhysicalSystem(PhysicalSystem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interaction Feature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interaction Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInteractionFeature(InteractionFeature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Display</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Display</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDisplay(Display object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mouse</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mouse</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMouse(Mouse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hardware Tool</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hardware Tool</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHardwareTool(HardwareTool object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Identified Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Identified Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDescription_IdentifiedElement(org.eclipse.sirius.viewpoint.description.IdentifiedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public T defaultCase(EObject object) {
		return null;
	}

} //DsslSwitch
