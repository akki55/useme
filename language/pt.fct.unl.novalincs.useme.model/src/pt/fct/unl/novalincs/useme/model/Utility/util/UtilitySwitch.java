/**
 */
package pt.fct.unl.novalincs.useme.model.Utility.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import pt.fct.unl.novalincs.useme.model.Utility.*;

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
 * @see pt.fct.unl.novalincs.useme.model.Utility.UtilityPackage
 * @generated
 */
public class UtilitySwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static UtilityPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UtilitySwitch() {
		if (modelPackage == null) {
			modelPackage = UtilityPackage.eINSTANCE;
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
			case UtilityPackage.UTILITY_SPECIFICATION: {
				UtilitySpecification utilitySpecification = (UtilitySpecification)theEObject;
				T result = caseUtilitySpecification(utilitySpecification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UtilityPackage.SURVEY_ENGINE: {
				SurveyEngine surveyEngine = (SurveyEngine)theEObject;
				T result = caseSurveyEngine(surveyEngine);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UtilityPackage.DSL: {
				DSL dsl = (DSL)theEObject;
				T result = caseDSL(dsl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UtilityPackage.PROCESS_MODEL: {
				ProcessModel processModel = (ProcessModel)theEObject;
				T result = caseProcessModel(processModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UtilityPackage.FUNCTIONAL_GOAL: {
				FunctionalGoal functionalGoal = (FunctionalGoal)theEObject;
				T result = caseFunctionalGoal(functionalGoal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UtilityPackage.EXISTING_GM: {
				ExistingGM existingGM = (ExistingGM)theEObject;
				T result = caseExistingGM(existingGM);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UtilityPackage.CE_VARIABLE: {
				CEVariable ceVariable = (CEVariable)theEObject;
				T result = caseCEVariable(ceVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UtilityPackage.PROFILE_TEMPLATE: {
				ProfileTemplate profileTemplate = (ProfileTemplate)theEObject;
				T result = caseProfileTemplate(profileTemplate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UtilityPackage.LOGICAL_EXPRESSION: {
				LogicalExpression logicalExpression = (LogicalExpression)theEObject;
				T result = caseLogicalExpression(logicalExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UtilityPackage.CONCRETE_SYNTAX: {
				ConcreteSyntax concreteSyntax = (ConcreteSyntax)theEObject;
				T result = caseConcreteSyntax(concreteSyntax);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UtilityPackage.ABSTRACT_SYNTAX: {
				AbstractSyntax abstractSyntax = (AbstractSyntax)theEObject;
				T result = caseAbstractSyntax(abstractSyntax);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UtilityPackage.OUTSIDE_REF: {
				OutsideRef outsideRef = (OutsideRef)theEObject;
				T result = caseOutsideRef(outsideRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UtilityPackage.REQUIREMENT: {
				Requirement requirement = (Requirement)theEObject;
				T result = caseRequirement(requirement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UtilityPackage.DOCUMENTATION: {
				Documentation documentation = (Documentation)theEObject;
				T result = caseDocumentation(documentation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
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
	public T caseUtilitySpecification(UtilitySpecification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Survey Engine</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Survey Engine</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSurveyEngine(SurveyEngine object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DSL</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DSL</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDSL(DSL object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Process Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Process Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcessModel(ProcessModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Functional Goal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Functional Goal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionalGoal(FunctionalGoal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Existing GM</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Existing GM</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExistingGM(ExistingGM object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CE Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CE Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCEVariable(CEVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Profile Template</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Profile Template</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProfileTemplate(ProfileTemplate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Logical Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Logical Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLogicalExpression(LogicalExpression object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Outside Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Outside Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOutsideRef(OutsideRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Requirement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequirement(Requirement object) {
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

} //UtilitySwitch
