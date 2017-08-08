/**
 */
package pt.fct.unl.novalincs.useme.model.GoalModeling;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see pt.fct.unl.novalincs.useme.model.GoalModeling.GoalModelingPackage
 * @generated
 */
public interface GoalModelingFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GoalModelingFactory eINSTANCE = pt.fct.unl.novalincs.useme.model.GoalModeling.impl.GoalModelingFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Goal Specification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Goal Specification</em>'.
	 * @generated
	 */
	GoalSpecification createGoalSpecification();

	/**
	 * Returns a new object of class '<em>Goal Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Goal Model</em>'.
	 * @generated
	 */
	GoalModel createGoalModel();

	/**
	 * Returns a new object of class '<em>Usability Goal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Usability Goal</em>'.
	 * @generated
	 */
	UsabilityGoal createUsabilityGoal();

	/**
	 * Returns a new object of class '<em>Actor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Actor</em>'.
	 * @generated
	 */
	Actor createActor();

	/**
	 * Returns a new object of class '<em>Scope</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Scope</em>'.
	 * @generated
	 */
	Scope createScope();

	/**
	 * Returns a new object of class '<em>Method</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Method</em>'.
	 * @generated
	 */
	Method createMethod();

	/**
	 * Returns a new object of class '<em>Success Coverage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Success Coverage</em>'.
	 * @generated
	 */
	SuccessCoverage createSuccessCoverage();

	/**
	 * Returns a new object of class '<em>Usability Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Usability Requirement</em>'.
	 * @generated
	 */
	UsabilityRequirement createUsabilityRequirement();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	GoalModelingPackage getGoalModelingPackage();

} //GoalModelingFactory
