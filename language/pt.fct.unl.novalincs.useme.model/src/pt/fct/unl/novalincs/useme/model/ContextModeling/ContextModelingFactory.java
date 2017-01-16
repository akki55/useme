/**
 */
package pt.fct.unl.novalincs.useme.model.ContextModeling;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see pt.fct.unl.novalincs.useme.model.ContextModeling.ContextModelingPackage
 * @generated
 */
public interface ContextModelingFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ContextModelingFactory eINSTANCE = pt.fct.unl.novalincs.useme.model.ContextModeling.impl.ContextModelingFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Context Specification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Context Specification</em>'.
	 * @generated
	 */
	ContextSpecification createContextSpecification();

	/**
	 * Returns a new object of class '<em>User Profile Specification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>User Profile Specification</em>'.
	 * @generated
	 */
	UserProfileSpecification createUserProfileSpecification();

	/**
	 * Returns a new object of class '<em>Workflow Specification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Workflow Specification</em>'.
	 * @generated
	 */
	WorkflowSpecification createWorkflowSpecification();

	/**
	 * Returns a new object of class '<em>Enviroment Specification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Enviroment Specification</em>'.
	 * @generated
	 */
	EnviromentSpecification createEnviromentSpecification();

	/**
	 * Returns a new object of class '<em>Context Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Context Model</em>'.
	 * @generated
	 */
	ContextModel createContextModel();

	/**
	 * Returns a new object of class '<em>Technical Environment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Technical Environment</em>'.
	 * @generated
	 */
	TechnicalEnvironment createTechnicalEnvironment();

	/**
	 * Returns a new object of class '<em>Physical Environment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Physical Environment</em>'.
	 * @generated
	 */
	PhysicalEnvironment createPhysicalEnvironment();

	/**
	 * Returns a new object of class '<em>Social Environment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Social Environment</em>'.
	 * @generated
	 */
	SocialEnvironment createSocialEnvironment();

	/**
	 * Returns a new object of class '<em>Workflow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Workflow</em>'.
	 * @generated
	 */
	Workflow createWorkflow();

	/**
	 * Returns a new object of class '<em>Context Environment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Context Environment</em>'.
	 * @generated
	 */
	ContextEnvironment createContextEnvironment();

	/**
	 * Returns a new object of class '<em>User Profile</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>User Profile</em>'.
	 * @generated
	 */
	UserProfile createUserProfile();

	/**
	 * Returns a new object of class '<em>Scenario</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Scenario</em>'.
	 * @generated
	 */
	Scenario createScenario();

	/**
	 * Returns a new object of class '<em>User Hierarchy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>User Hierarchy</em>'.
	 * @generated
	 */
	UserHierarchy createUserHierarchy();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ContextModelingPackage getContextModelingPackage();

} //ContextModelingFactory
