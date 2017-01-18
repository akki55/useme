/**
 */
package fr.tpt.rdalte.useme.architecture.model.usemearch;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see fr.tpt.rdalte.useme.architecture.model.usemearch.UsemearchPackage
 * @generated
 */
public interface UsemearchFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UsemearchFactory eINSTANCE = fr.tpt.rdalte.useme.architecture.model.usemearch.impl.UsemearchFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Dsl Specification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dsl Specification</em>'.
	 * @generated
	 */
	DslSpecification createDslSpecification();

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
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	UsemearchPackage getUsemearchPackage();

} //UsemearchFactory
