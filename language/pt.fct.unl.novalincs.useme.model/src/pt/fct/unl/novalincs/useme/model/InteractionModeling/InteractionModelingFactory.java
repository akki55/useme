/**
 */
package pt.fct.unl.novalincs.useme.model.InteractionModeling;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see pt.fct.unl.novalincs.useme.model.InteractionModeling.InteractionModelingPackage
 * @generated
 */
public interface InteractionModelingFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	InteractionModelingFactory eINSTANCE = pt.fct.unl.novalincs.useme.model.InteractionModeling.impl.InteractionModelingFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Interaction Specification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interaction Specification</em>'.
	 * @generated
	 */
	InteractionSpecification createInteractionSpecification();

	/**
	 * Returns a new object of class '<em>Interaction Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interaction Model</em>'.
	 * @generated
	 */
	InteractionModel createInteractionModel();

	/**
	 * Returns a new object of class '<em>Interaction Syntax</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interaction Syntax</em>'.
	 * @generated
	 */
	InteractionSyntax createInteractionSyntax();

	/**
	 * Returns a new object of class '<em>Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Task</em>'.
	 * @generated
	 */
	Task createTask();

	/**
	 * Returns a new object of class '<em>Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event</em>'.
	 * @generated
	 */
	Event createEvent();

	/**
	 * Returns a new object of class '<em>Interaction Result</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interaction Result</em>'.
	 * @generated
	 */
	InteractionResult createInteractionResult();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	InteractionModelingPackage getInteractionModelingPackage();

} //InteractionModelingFactory
