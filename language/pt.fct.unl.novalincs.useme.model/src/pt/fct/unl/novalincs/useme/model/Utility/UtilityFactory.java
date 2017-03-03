/**
 */
package pt.fct.unl.novalincs.useme.model.Utility;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see pt.fct.unl.novalincs.useme.model.Utility.UtilityPackage
 * @generated
 */
public interface UtilityFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UtilityFactory eINSTANCE = pt.fct.unl.novalincs.useme.model.Utility.impl.UtilityFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Specification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Specification</em>'.
	 * @generated
	 */
	UtilitySpecification createUtilitySpecification();

	/**
	 * Returns a new object of class '<em>Survey Engine</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Survey Engine</em>'.
	 * @generated
	 */
	SurveyEngine createSurveyEngine();

	/**
	 * Returns a new object of class '<em>DSL</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DSL</em>'.
	 * @generated
	 */
	DSL createDSL();

	/**
	 * Returns a new object of class '<em>Process Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Process Model</em>'.
	 * @generated
	 */
	ProcessModel createProcessModel();

	/**
	 * Returns a new object of class '<em>Functional Goal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Functional Goal</em>'.
	 * @generated
	 */
	FunctionalGoal createFunctionalGoal();

	/**
	 * Returns a new object of class '<em>Existing GM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Existing GM</em>'.
	 * @generated
	 */
	ExistingGM createExistingGM();

	/**
	 * Returns a new object of class '<em>CE Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CE Variable</em>'.
	 * @generated
	 */
	CEVariable createCEVariable();

	/**
	 * Returns a new object of class '<em>Profile Template</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Profile Template</em>'.
	 * @generated
	 */
	ProfileTemplate createProfileTemplate();

	/**
	 * Returns a new object of class '<em>Logical Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Logical Expression</em>'.
	 * @generated
	 */
	LogicalExpression createLogicalExpression();

	/**
	 * Returns a new object of class '<em>Concrete Syntax</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Concrete Syntax</em>'.
	 * @generated
	 */
	ConcreteSyntax createConcreteSyntax();

	/**
	 * Returns a new object of class '<em>Abstract Syntax</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Abstract Syntax</em>'.
	 * @generated
	 */
	AbstractSyntax createAbstractSyntax();

	/**
	 * Returns a new object of class '<em>Outside Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Outside Ref</em>'.
	 * @generated
	 */
	OutsideRef createOutsideRef();

	/**
	 * Returns a new object of class '<em>Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Requirement</em>'.
	 * @generated
	 */
	Requirement createRequirement();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	UtilityPackage getUtilityPackage();

} //UtilityFactory
