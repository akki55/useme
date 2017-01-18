/**
 */
package fr.tpt.useme.architecture.model.usemearch.util;

import fr.tpt.useme.architecture.model.usemearch.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

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
 * @see fr.tpt.useme.architecture.model.usemearch.UsemearchPackage
 * @generated
 */
public class UsemearchSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static UsemearchPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UsemearchSwitch() {
		if (modelPackage == null) {
			modelPackage = UsemearchPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case UsemearchPackage.IDENTIFIED_ELEMENT: {
				IdentifiedElement identifiedElement = (IdentifiedElement)theEObject;
				T result = caseIdentifiedElement(identifiedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UsemearchPackage.ENVIRONMENT_SPECIFICATION: {
				EnvironmentSpecification environmentSpecification = (EnvironmentSpecification)theEObject;
				T result = caseEnvironmentSpecification(environmentSpecification);
				if (result == null) result = caseIdentifiedElement(environmentSpecification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UsemearchPackage.ENVIRONMENTAL_ELEMENT: {
				EnvironmentalElement environmentalElement = (EnvironmentalElement)theEObject;
				T result = caseEnvironmentalElement(environmentalElement);
				if (result == null) result = caseIdentifiedElement(environmentalElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UsemearchPackage.CONTEXT_SPECIFICATION: {
				ContextSpecification contextSpecification = (ContextSpecification)theEObject;
				T result = caseContextSpecification(contextSpecification);
				if (result == null) result = caseIdentifiedElement(contextSpecification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UsemearchPackage.DSL: {
				Dsl dsl = (Dsl)theEObject;
				T result = caseDsl(dsl);
				if (result == null) result = caseEnvironmentalElement(dsl);
				if (result == null) result = caseIdentifiedElement(dsl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UsemearchPackage.SYNTAX: {
				Syntax syntax = (Syntax)theEObject;
				T result = caseSyntax(syntax);
				if (result == null) result = caseIdentifiedElement(syntax);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UsemearchPackage.ABSTRACT_SYNTAX: {
				AbstractSyntax abstractSyntax = (AbstractSyntax)theEObject;
				T result = caseAbstractSyntax(abstractSyntax);
				if (result == null) result = caseSyntax(abstractSyntax);
				if (result == null) result = caseIdentifiedElement(abstractSyntax);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UsemearchPackage.CONCRETE_SYNTAX: {
				ConcreteSyntax concreteSyntax = (ConcreteSyntax)theEObject;
				T result = caseConcreteSyntax(concreteSyntax);
				if (result == null) result = caseSyntax(concreteSyntax);
				if (result == null) result = caseIdentifiedElement(concreteSyntax);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UsemearchPackage.ECORE_ABSTRACT_SYNTAX: {
				ECoreAbstractSyntax eCoreAbstractSyntax = (ECoreAbstractSyntax)theEObject;
				T result = caseECoreAbstractSyntax(eCoreAbstractSyntax);
				if (result == null) result = caseAbstractSyntax(eCoreAbstractSyntax);
				if (result == null) result = caseSyntax(eCoreAbstractSyntax);
				if (result == null) result = caseIdentifiedElement(eCoreAbstractSyntax);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UsemearchPackage.SIRIUS_CONCRETE_SYNTAX: {
				SiriusConcreteSyntax siriusConcreteSyntax = (SiriusConcreteSyntax)theEObject;
				T result = caseSiriusConcreteSyntax(siriusConcreteSyntax);
				if (result == null) result = caseConcreteSyntax(siriusConcreteSyntax);
				if (result == null) result = caseSyntax(siriusConcreteSyntax);
				if (result == null) result = caseIdentifiedElement(siriusConcreteSyntax);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UsemearchPackage.TOOL: {
				Tool tool = (Tool)theEObject;
				T result = caseTool(tool);
				if (result == null) result = caseEnvironmentalElement(tool);
				if (result == null) result = caseIdentifiedElement(tool);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UsemearchPackage.USER: {
				User user = (User)theEObject;
				T result = caseUser(user);
				if (result == null) result = caseEnvironmentalElement(user);
				if (result == null) result = caseIdentifiedElement(user);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UsemearchPackage.WORK_PLACE: {
				WorkPlace workPlace = (WorkPlace)theEObject;
				T result = caseWorkPlace(workPlace);
				if (result == null) result = caseEnvironmentalElement(workPlace);
				if (result == null) result = caseIdentifiedElement(workPlace);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UsemearchPackage.COMPUTER: {
				Computer computer = (Computer)theEObject;
				T result = caseComputer(computer);
				if (result == null) result = caseTool(computer);
				if (result == null) result = caseEnvironmentalElement(computer);
				if (result == null) result = caseIdentifiedElement(computer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UsemearchPackage.SOFTWARE_TOOL: {
				SoftwareTool softwareTool = (SoftwareTool)theEObject;
				T result = caseSoftwareTool(softwareTool);
				if (result == null) result = caseTool(softwareTool);
				if (result == null) result = caseEnvironmentalElement(softwareTool);
				if (result == null) result = caseIdentifiedElement(softwareTool);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UsemearchPackage.OPERATING_SYSTEM: {
				OperatingSystem operatingSystem = (OperatingSystem)theEObject;
				T result = caseOperatingSystem(operatingSystem);
				if (result == null) result = caseSoftwareTool(operatingSystem);
				if (result == null) result = caseTool(operatingSystem);
				if (result == null) result = caseEnvironmentalElement(operatingSystem);
				if (result == null) result = caseIdentifiedElement(operatingSystem);
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
	 * Returns the result of interpreting the object as an instance of '<em>Environment Specification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Environment Specification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnvironmentSpecification(EnvironmentSpecification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Environmental Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Environmental Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnvironmentalElement(EnvironmentalElement object) {
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
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //UsemearchSwitch
