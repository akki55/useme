/**
 */
package fr.tpt.rdalte.useme.architecture.model.usemearch;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see fr.tpt.rdalte.useme.architecture.model.usemearch.UsemearchFactory
 * @model kind="package"
 * @generated
 */
public interface UsemearchPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "usemearch";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://mem4cds.telecom-paristech.fr/languages/usemearch/";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "usemearch";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UsemearchPackage eINSTANCE = fr.tpt.rdalte.useme.architecture.model.usemearch.impl.UsemearchPackageImpl.init();

	/**
	 * The meta object id for the '{@link fr.tpt.rdalte.useme.architecture.model.usemearch.impl.IdentifiedElementImpl <em>Identified Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.tpt.rdalte.useme.architecture.model.usemearch.impl.IdentifiedElementImpl
	 * @see fr.tpt.rdalte.useme.architecture.model.usemearch.impl.UsemearchPackageImpl#getIdentifiedElement()
	 * @generated
	 */
	int IDENTIFIED_ELEMENT = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIED_ELEMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIED_ELEMENT__ID = 1;

	/**
	 * The number of structural features of the '<em>Identified Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIED_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Identified Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.tpt.rdalte.useme.architecture.model.usemearch.impl.DslSpecificationImpl <em>Dsl Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.tpt.rdalte.useme.architecture.model.usemearch.impl.DslSpecificationImpl
	 * @see fr.tpt.rdalte.useme.architecture.model.usemearch.impl.UsemearchPackageImpl#getDslSpecification()
	 * @generated
	 */
	int DSL_SPECIFICATION = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_SPECIFICATION__NAME = IDENTIFIED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_SPECIFICATION__ID = IDENTIFIED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Owned Dsls</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_SPECIFICATION__OWNED_DSLS = IDENTIFIED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Dsl Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_SPECIFICATION_FEATURE_COUNT = IDENTIFIED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Dsl Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_SPECIFICATION_OPERATION_COUNT = IDENTIFIED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.tpt.rdalte.useme.architecture.model.usemearch.impl.DslImpl <em>Dsl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.tpt.rdalte.useme.architecture.model.usemearch.impl.DslImpl
	 * @see fr.tpt.rdalte.useme.architecture.model.usemearch.impl.UsemearchPackageImpl#getDsl()
	 * @generated
	 */
	int DSL = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL__NAME = IDENTIFIED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL__ID = IDENTIFIED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Owned Syntaxes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL__OWNED_SYNTAXES = IDENTIFIED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Concrete Syntaxes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL__CONCRETE_SYNTAXES = IDENTIFIED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Abstractsyntax</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL__ABSTRACTSYNTAX = IDENTIFIED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Dsl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_FEATURE_COUNT = IDENTIFIED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Dsl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_OPERATION_COUNT = IDENTIFIED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.tpt.rdalte.useme.architecture.model.usemearch.impl.SyntaxImpl <em>Syntax</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.tpt.rdalte.useme.architecture.model.usemearch.impl.SyntaxImpl
	 * @see fr.tpt.rdalte.useme.architecture.model.usemearch.impl.UsemearchPackageImpl#getSyntax()
	 * @generated
	 */
	int SYNTAX = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNTAX__NAME = IDENTIFIED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNTAX__ID = IDENTIFIED_ELEMENT__ID;

	/**
	 * The number of structural features of the '<em>Syntax</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNTAX_FEATURE_COUNT = IDENTIFIED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Syntax</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNTAX_OPERATION_COUNT = IDENTIFIED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.tpt.rdalte.useme.architecture.model.usemearch.impl.AbstractSyntaxImpl <em>Abstract Syntax</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.tpt.rdalte.useme.architecture.model.usemearch.impl.AbstractSyntaxImpl
	 * @see fr.tpt.rdalte.useme.architecture.model.usemearch.impl.UsemearchPackageImpl#getAbstractSyntax()
	 * @generated
	 */
	int ABSTRACT_SYNTAX = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SYNTAX__NAME = SYNTAX__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SYNTAX__ID = SYNTAX__ID;

	/**
	 * The number of structural features of the '<em>Abstract Syntax</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SYNTAX_FEATURE_COUNT = SYNTAX_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Abstract Syntax</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SYNTAX_OPERATION_COUNT = SYNTAX_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.tpt.rdalte.useme.architecture.model.usemearch.impl.ConcreteSyntaxImpl <em>Concrete Syntax</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.tpt.rdalte.useme.architecture.model.usemearch.impl.ConcreteSyntaxImpl
	 * @see fr.tpt.rdalte.useme.architecture.model.usemearch.impl.UsemearchPackageImpl#getConcreteSyntax()
	 * @generated
	 */
	int CONCRETE_SYNTAX = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_SYNTAX__NAME = SYNTAX__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_SYNTAX__ID = SYNTAX__ID;

	/**
	 * The number of structural features of the '<em>Concrete Syntax</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_SYNTAX_FEATURE_COUNT = SYNTAX_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Concrete Syntax</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_SYNTAX_OPERATION_COUNT = SYNTAX_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.tpt.rdalte.useme.architecture.model.usemearch.impl.ECoreAbstractSyntaxImpl <em>ECore Abstract Syntax</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.tpt.rdalte.useme.architecture.model.usemearch.impl.ECoreAbstractSyntaxImpl
	 * @see fr.tpt.rdalte.useme.architecture.model.usemearch.impl.UsemearchPackageImpl#getECoreAbstractSyntax()
	 * @generated
	 */
	int ECORE_ABSTRACT_SYNTAX = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECORE_ABSTRACT_SYNTAX__NAME = ABSTRACT_SYNTAX__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECORE_ABSTRACT_SYNTAX__ID = ABSTRACT_SYNTAX__ID;

	/**
	 * The feature id for the '<em><b>Packages</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECORE_ABSTRACT_SYNTAX__PACKAGES = ABSTRACT_SYNTAX_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>ECore Abstract Syntax</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECORE_ABSTRACT_SYNTAX_FEATURE_COUNT = ABSTRACT_SYNTAX_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>ECore Abstract Syntax</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECORE_ABSTRACT_SYNTAX_OPERATION_COUNT = ABSTRACT_SYNTAX_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.tpt.rdalte.useme.architecture.model.usemearch.impl.SiriusConcreteSyntaxImpl <em>Sirius Concrete Syntax</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.tpt.rdalte.useme.architecture.model.usemearch.impl.SiriusConcreteSyntaxImpl
	 * @see fr.tpt.rdalte.useme.architecture.model.usemearch.impl.UsemearchPackageImpl#getSiriusConcreteSyntax()
	 * @generated
	 */
	int SIRIUS_CONCRETE_SYNTAX = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIRIUS_CONCRETE_SYNTAX__NAME = CONCRETE_SYNTAX__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIRIUS_CONCRETE_SYNTAX__ID = CONCRETE_SYNTAX__ID;

	/**
	 * The feature id for the '<em><b>Sirius Specification</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIRIUS_CONCRETE_SYNTAX__SIRIUS_SPECIFICATION = CONCRETE_SYNTAX_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sirius Concrete Syntax</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIRIUS_CONCRETE_SYNTAX_FEATURE_COUNT = CONCRETE_SYNTAX_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Sirius Concrete Syntax</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIRIUS_CONCRETE_SYNTAX_OPERATION_COUNT = CONCRETE_SYNTAX_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link fr.tpt.rdalte.useme.architecture.model.usemearch.DslSpecification <em>Dsl Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dsl Specification</em>'.
	 * @see fr.tpt.rdalte.useme.architecture.model.usemearch.DslSpecification
	 * @generated
	 */
	EClass getDslSpecification();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.tpt.rdalte.useme.architecture.model.usemearch.DslSpecification#getOwnedDsls <em>Owned Dsls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Dsls</em>'.
	 * @see fr.tpt.rdalte.useme.architecture.model.usemearch.DslSpecification#getOwnedDsls()
	 * @see #getDslSpecification()
	 * @generated
	 */
	EReference getDslSpecification_OwnedDsls();

	/**
	 * Returns the meta object for class '{@link fr.tpt.rdalte.useme.architecture.model.usemearch.Dsl <em>Dsl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dsl</em>'.
	 * @see fr.tpt.rdalte.useme.architecture.model.usemearch.Dsl
	 * @generated
	 */
	EClass getDsl();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.tpt.rdalte.useme.architecture.model.usemearch.Dsl#getOwnedSyntaxes <em>Owned Syntaxes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Syntaxes</em>'.
	 * @see fr.tpt.rdalte.useme.architecture.model.usemearch.Dsl#getOwnedSyntaxes()
	 * @see #getDsl()
	 * @generated
	 */
	EReference getDsl_OwnedSyntaxes();

	/**
	 * Returns the meta object for the reference list '{@link fr.tpt.rdalte.useme.architecture.model.usemearch.Dsl#getConcreteSyntaxes <em>Concrete Syntaxes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Concrete Syntaxes</em>'.
	 * @see fr.tpt.rdalte.useme.architecture.model.usemearch.Dsl#getConcreteSyntaxes()
	 * @see #getDsl()
	 * @generated
	 */
	EReference getDsl_ConcreteSyntaxes();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.rdalte.useme.architecture.model.usemearch.Dsl#getAbstractsyntax <em>Abstractsyntax</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Abstractsyntax</em>'.
	 * @see fr.tpt.rdalte.useme.architecture.model.usemearch.Dsl#getAbstractsyntax()
	 * @see #getDsl()
	 * @generated
	 */
	EReference getDsl_Abstractsyntax();

	/**
	 * Returns the meta object for class '{@link fr.tpt.rdalte.useme.architecture.model.usemearch.Syntax <em>Syntax</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Syntax</em>'.
	 * @see fr.tpt.rdalte.useme.architecture.model.usemearch.Syntax
	 * @generated
	 */
	EClass getSyntax();

	/**
	 * Returns the meta object for class '{@link fr.tpt.rdalte.useme.architecture.model.usemearch.AbstractSyntax <em>Abstract Syntax</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Syntax</em>'.
	 * @see fr.tpt.rdalte.useme.architecture.model.usemearch.AbstractSyntax
	 * @generated
	 */
	EClass getAbstractSyntax();

	/**
	 * Returns the meta object for class '{@link fr.tpt.rdalte.useme.architecture.model.usemearch.ConcreteSyntax <em>Concrete Syntax</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Concrete Syntax</em>'.
	 * @see fr.tpt.rdalte.useme.architecture.model.usemearch.ConcreteSyntax
	 * @generated
	 */
	EClass getConcreteSyntax();

	/**
	 * Returns the meta object for class '{@link fr.tpt.rdalte.useme.architecture.model.usemearch.ECoreAbstractSyntax <em>ECore Abstract Syntax</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ECore Abstract Syntax</em>'.
	 * @see fr.tpt.rdalte.useme.architecture.model.usemearch.ECoreAbstractSyntax
	 * @generated
	 */
	EClass getECoreAbstractSyntax();

	/**
	 * Returns the meta object for the reference list '{@link fr.tpt.rdalte.useme.architecture.model.usemearch.ECoreAbstractSyntax#getPackages <em>Packages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Packages</em>'.
	 * @see fr.tpt.rdalte.useme.architecture.model.usemearch.ECoreAbstractSyntax#getPackages()
	 * @see #getECoreAbstractSyntax()
	 * @generated
	 */
	EReference getECoreAbstractSyntax_Packages();

	/**
	 * Returns the meta object for class '{@link fr.tpt.rdalte.useme.architecture.model.usemearch.SiriusConcreteSyntax <em>Sirius Concrete Syntax</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sirius Concrete Syntax</em>'.
	 * @see fr.tpt.rdalte.useme.architecture.model.usemearch.SiriusConcreteSyntax
	 * @generated
	 */
	EClass getSiriusConcreteSyntax();

	/**
	 * Returns the meta object for the reference list '{@link fr.tpt.rdalte.useme.architecture.model.usemearch.SiriusConcreteSyntax#getSiriusSpecification <em>Sirius Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sirius Specification</em>'.
	 * @see fr.tpt.rdalte.useme.architecture.model.usemearch.SiriusConcreteSyntax#getSiriusSpecification()
	 * @see #getSiriusConcreteSyntax()
	 * @generated
	 */
	EReference getSiriusConcreteSyntax_SiriusSpecification();

	/**
	 * Returns the meta object for class '{@link fr.tpt.rdalte.useme.architecture.model.usemearch.IdentifiedElement <em>Identified Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Identified Element</em>'.
	 * @see fr.tpt.rdalte.useme.architecture.model.usemearch.IdentifiedElement
	 * @generated
	 */
	EClass getIdentifiedElement();

	/**
	 * Returns the meta object for the attribute '{@link fr.tpt.rdalte.useme.architecture.model.usemearch.IdentifiedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fr.tpt.rdalte.useme.architecture.model.usemearch.IdentifiedElement#getName()
	 * @see #getIdentifiedElement()
	 * @generated
	 */
	EAttribute getIdentifiedElement_Name();

	/**
	 * Returns the meta object for the attribute '{@link fr.tpt.rdalte.useme.architecture.model.usemearch.IdentifiedElement#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see fr.tpt.rdalte.useme.architecture.model.usemearch.IdentifiedElement#getId()
	 * @see #getIdentifiedElement()
	 * @generated
	 */
	EAttribute getIdentifiedElement_Id();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	UsemearchFactory getUsemearchFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link fr.tpt.rdalte.useme.architecture.model.usemearch.impl.DslSpecificationImpl <em>Dsl Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.tpt.rdalte.useme.architecture.model.usemearch.impl.DslSpecificationImpl
		 * @see fr.tpt.rdalte.useme.architecture.model.usemearch.impl.UsemearchPackageImpl#getDslSpecification()
		 * @generated
		 */
		EClass DSL_SPECIFICATION = eINSTANCE.getDslSpecification();

		/**
		 * The meta object literal for the '<em><b>Owned Dsls</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DSL_SPECIFICATION__OWNED_DSLS = eINSTANCE.getDslSpecification_OwnedDsls();

		/**
		 * The meta object literal for the '{@link fr.tpt.rdalte.useme.architecture.model.usemearch.impl.DslImpl <em>Dsl</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.tpt.rdalte.useme.architecture.model.usemearch.impl.DslImpl
		 * @see fr.tpt.rdalte.useme.architecture.model.usemearch.impl.UsemearchPackageImpl#getDsl()
		 * @generated
		 */
		EClass DSL = eINSTANCE.getDsl();

		/**
		 * The meta object literal for the '<em><b>Owned Syntaxes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DSL__OWNED_SYNTAXES = eINSTANCE.getDsl_OwnedSyntaxes();

		/**
		 * The meta object literal for the '<em><b>Concrete Syntaxes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DSL__CONCRETE_SYNTAXES = eINSTANCE.getDsl_ConcreteSyntaxes();

		/**
		 * The meta object literal for the '<em><b>Abstractsyntax</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DSL__ABSTRACTSYNTAX = eINSTANCE.getDsl_Abstractsyntax();

		/**
		 * The meta object literal for the '{@link fr.tpt.rdalte.useme.architecture.model.usemearch.impl.SyntaxImpl <em>Syntax</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.tpt.rdalte.useme.architecture.model.usemearch.impl.SyntaxImpl
		 * @see fr.tpt.rdalte.useme.architecture.model.usemearch.impl.UsemearchPackageImpl#getSyntax()
		 * @generated
		 */
		EClass SYNTAX = eINSTANCE.getSyntax();

		/**
		 * The meta object literal for the '{@link fr.tpt.rdalte.useme.architecture.model.usemearch.impl.AbstractSyntaxImpl <em>Abstract Syntax</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.tpt.rdalte.useme.architecture.model.usemearch.impl.AbstractSyntaxImpl
		 * @see fr.tpt.rdalte.useme.architecture.model.usemearch.impl.UsemearchPackageImpl#getAbstractSyntax()
		 * @generated
		 */
		EClass ABSTRACT_SYNTAX = eINSTANCE.getAbstractSyntax();

		/**
		 * The meta object literal for the '{@link fr.tpt.rdalte.useme.architecture.model.usemearch.impl.ConcreteSyntaxImpl <em>Concrete Syntax</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.tpt.rdalte.useme.architecture.model.usemearch.impl.ConcreteSyntaxImpl
		 * @see fr.tpt.rdalte.useme.architecture.model.usemearch.impl.UsemearchPackageImpl#getConcreteSyntax()
		 * @generated
		 */
		EClass CONCRETE_SYNTAX = eINSTANCE.getConcreteSyntax();

		/**
		 * The meta object literal for the '{@link fr.tpt.rdalte.useme.architecture.model.usemearch.impl.ECoreAbstractSyntaxImpl <em>ECore Abstract Syntax</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.tpt.rdalte.useme.architecture.model.usemearch.impl.ECoreAbstractSyntaxImpl
		 * @see fr.tpt.rdalte.useme.architecture.model.usemearch.impl.UsemearchPackageImpl#getECoreAbstractSyntax()
		 * @generated
		 */
		EClass ECORE_ABSTRACT_SYNTAX = eINSTANCE.getECoreAbstractSyntax();

		/**
		 * The meta object literal for the '<em><b>Packages</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECORE_ABSTRACT_SYNTAX__PACKAGES = eINSTANCE.getECoreAbstractSyntax_Packages();

		/**
		 * The meta object literal for the '{@link fr.tpt.rdalte.useme.architecture.model.usemearch.impl.SiriusConcreteSyntaxImpl <em>Sirius Concrete Syntax</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.tpt.rdalte.useme.architecture.model.usemearch.impl.SiriusConcreteSyntaxImpl
		 * @see fr.tpt.rdalte.useme.architecture.model.usemearch.impl.UsemearchPackageImpl#getSiriusConcreteSyntax()
		 * @generated
		 */
		EClass SIRIUS_CONCRETE_SYNTAX = eINSTANCE.getSiriusConcreteSyntax();

		/**
		 * The meta object literal for the '<em><b>Sirius Specification</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIRIUS_CONCRETE_SYNTAX__SIRIUS_SPECIFICATION = eINSTANCE.getSiriusConcreteSyntax_SiriusSpecification();

		/**
		 * The meta object literal for the '{@link fr.tpt.rdalte.useme.architecture.model.usemearch.impl.IdentifiedElementImpl <em>Identified Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.tpt.rdalte.useme.architecture.model.usemearch.impl.IdentifiedElementImpl
		 * @see fr.tpt.rdalte.useme.architecture.model.usemearch.impl.UsemearchPackageImpl#getIdentifiedElement()
		 * @generated
		 */
		EClass IDENTIFIED_ELEMENT = eINSTANCE.getIdentifiedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDENTIFIED_ELEMENT__NAME = eINSTANCE.getIdentifiedElement_Name();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDENTIFIED_ELEMENT__ID = eINSTANCE.getIdentifiedElement_Id();

	}

} //UsemearchPackage
