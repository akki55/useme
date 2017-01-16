/**
 */
package pt.fct.unl.novalincs.useme.model.ContextModeling.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import pt.fct.unl.novalincs.useme.model.ContextModeling.*;

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
 * @see pt.fct.unl.novalincs.useme.model.ContextModeling.ContextModelingPackage
 * @generated
 */
public class ContextModelingSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ContextModelingPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContextModelingSwitch() {
		if (modelPackage == null) {
			modelPackage = ContextModelingPackage.eINSTANCE;
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
			case ContextModelingPackage.CONTEXT_SPECIFICATION: {
				ContextSpecification contextSpecification = (ContextSpecification)theEObject;
				T result = caseContextSpecification(contextSpecification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ContextModelingPackage.USER_PROFILE_SPECIFICATION: {
				UserProfileSpecification userProfileSpecification = (UserProfileSpecification)theEObject;
				T result = caseUserProfileSpecification(userProfileSpecification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ContextModelingPackage.WORKFLOW_SPECIFICATION: {
				WorkflowSpecification workflowSpecification = (WorkflowSpecification)theEObject;
				T result = caseWorkflowSpecification(workflowSpecification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ContextModelingPackage.ENVIROMENT_SPECIFICATION: {
				EnviromentSpecification enviromentSpecification = (EnviromentSpecification)theEObject;
				T result = caseEnviromentSpecification(enviromentSpecification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ContextModelingPackage.CONTEXT_MODEL: {
				ContextModel contextModel = (ContextModel)theEObject;
				T result = caseContextModel(contextModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ContextModelingPackage.TECHNICAL_ENVIRONMENT: {
				TechnicalEnvironment technicalEnvironment = (TechnicalEnvironment)theEObject;
				T result = caseTechnicalEnvironment(technicalEnvironment);
				if (result == null) result = caseContextEnvironment(technicalEnvironment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ContextModelingPackage.PHYSICAL_ENVIRONMENT: {
				PhysicalEnvironment physicalEnvironment = (PhysicalEnvironment)theEObject;
				T result = casePhysicalEnvironment(physicalEnvironment);
				if (result == null) result = caseContextEnvironment(physicalEnvironment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ContextModelingPackage.SOCIAL_ENVIRONMENT: {
				SocialEnvironment socialEnvironment = (SocialEnvironment)theEObject;
				T result = caseSocialEnvironment(socialEnvironment);
				if (result == null) result = caseContextEnvironment(socialEnvironment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ContextModelingPackage.WORKFLOW: {
				Workflow workflow = (Workflow)theEObject;
				T result = caseWorkflow(workflow);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ContextModelingPackage.CONTEXT_ENVIRONMENT: {
				ContextEnvironment contextEnvironment = (ContextEnvironment)theEObject;
				T result = caseContextEnvironment(contextEnvironment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ContextModelingPackage.USER_PROFILE: {
				UserProfile userProfile = (UserProfile)theEObject;
				T result = caseUserProfile(userProfile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ContextModelingPackage.SCENARIO: {
				Scenario scenario = (Scenario)theEObject;
				T result = caseScenario(scenario);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ContextModelingPackage.USER_HIERARCHY: {
				UserHierarchy userHierarchy = (UserHierarchy)theEObject;
				T result = caseUserHierarchy(userHierarchy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
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
	 * Returns the result of interpreting the object as an instance of '<em>User Profile Specification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>User Profile Specification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUserProfileSpecification(UserProfileSpecification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Workflow Specification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Workflow Specification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWorkflowSpecification(WorkflowSpecification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enviroment Specification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enviroment Specification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnviromentSpecification(EnviromentSpecification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Context Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Context Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContextModel(ContextModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Technical Environment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Technical Environment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTechnicalEnvironment(TechnicalEnvironment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Physical Environment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Physical Environment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePhysicalEnvironment(PhysicalEnvironment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Social Environment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Social Environment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSocialEnvironment(SocialEnvironment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Workflow</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Workflow</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWorkflow(Workflow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Context Environment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Context Environment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContextEnvironment(ContextEnvironment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>User Profile</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>User Profile</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUserProfile(UserProfile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scenario</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scenario</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScenario(Scenario object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>User Hierarchy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>User Hierarchy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUserHierarchy(UserHierarchy object) {
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

} //ContextModelingSwitch
