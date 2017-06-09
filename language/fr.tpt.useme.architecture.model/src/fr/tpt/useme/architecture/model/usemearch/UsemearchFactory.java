/**
 */
package fr.tpt.useme.architecture.model.usemearch;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see fr.tpt.useme.architecture.model.usemearch.UsemearchPackage
 * @generated
 */
public interface UsemearchFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UsemearchFactory eINSTANCE = fr.tpt.useme.architecture.model.usemearch.impl.UsemearchFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Dsl Based System Specification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dsl Based System Specification</em>'.
	 * @generated
	 */
	DslBasedSystemSpecification createDslBasedSystemSpecification();

	/**
	 * Returns a new object of class '<em>Context Specification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Context Specification</em>'.
	 * @generated
	 */
	ContextSpecification createContextSpecification();

	/**
	 * Returns a new object of class '<em>Dsl</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dsl</em>'.
	 * @generated
	 */
	Dsl createDsl();

	/**
	 * Returns a new object of class '<em>ECore Abstract Syntax</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ECore Abstract Syntax</em>'.
	 * @generated
	 */
	ECoreAbstractSyntax createECoreAbstractSyntax();

	/**
	 * Returns a new object of class '<em>Sirius Concrete Syntax</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sirius Concrete Syntax</em>'.
	 * @generated
	 */
	SiriusConcreteSyntax createSiriusConcreteSyntax();

	/**
	 * Returns a new object of class '<em>User</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>User</em>'.
	 * @generated
	 */
	User createUser();

	/**
	 * Returns a new object of class '<em>Work Place</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Work Place</em>'.
	 * @generated
	 */
	WorkPlace createWorkPlace();

	/**
	 * Returns a new object of class '<em>Computer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Computer</em>'.
	 * @generated
	 */
	Computer createComputer();

	/**
	 * Returns a new object of class '<em>Software Tool</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Software Tool</em>'.
	 * @generated
	 */
	SoftwareTool createSoftwareTool();

	/**
	 * Returns a new object of class '<em>Operating System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Operating System</em>'.
	 * @generated
	 */
	OperatingSystem createOperatingSystem();

	/**
	 * Returns a new object of class '<em>ECore Domain Concept</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ECore Domain Concept</em>'.
	 * @generated
	 */
	ECoreDomainConcept createECoreDomainConcept();

	/**
	 * Returns a new object of class '<em>Feature Diagram</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Feature Diagram</em>'.
	 * @generated
	 */
	FeatureDiagram createFeatureDiagram();

	/**
	 * Returns a new object of class '<em>Model Checker</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model Checker</em>'.
	 * @generated
	 */
	ModelChecker createModelChecker();

	/**
	 * Returns a new object of class '<em>Model Simulator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model Simulator</em>'.
	 * @generated
	 */
	ModelSimulator createModelSimulator();

	/**
	 * Returns a new object of class '<em>Maintenance Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Maintenance Service</em>'.
	 * @generated
	 */
	MaintenanceService createMaintenanceService();

	/**
	 * Returns a new object of class '<em>Context Entity Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Context Entity Instance</em>'.
	 * @generated
	 */
	ContextEntityInstance createContextEntityInstance();

	/**
	 * Returns a new object of class '<em>Entity Instances Connection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Entity Instances Connection</em>'.
	 * @generated
	 */
	EntityInstancesConnection createEntityInstancesConnection();

	/**
	 * Returns a new object of class '<em>Physical System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Physical System</em>'.
	 * @generated
	 */
	PhysicalSystem createPhysicalSystem();

	/**
	 * Returns a new object of class '<em>Interaction Feature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interaction Feature</em>'.
	 * @generated
	 */
	InteractionFeature createInteractionFeature();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	UsemearchPackage getUsemearchPackage();

} //UsemearchFactory
