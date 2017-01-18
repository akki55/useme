/**
 */
package fr.tpt.useme.architecture.model.usemearch;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see fr.tpt.useme.architecture.model.usemearch.UsemearchFactory
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
	UsemearchPackage eINSTANCE = fr.tpt.useme.architecture.model.usemearch.impl.UsemearchPackageImpl.init();

	/**
	 * The meta object id for the '{@link fr.tpt.useme.architecture.model.usemearch.impl.IdentifiedElementImpl <em>Identified Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.tpt.useme.architecture.model.usemearch.impl.IdentifiedElementImpl
	 * @see fr.tpt.useme.architecture.model.usemearch.impl.UsemearchPackageImpl#getIdentifiedElement()
	 * @generated
	 */
	int IDENTIFIED_ELEMENT = 0;

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
	 * The meta object id for the '{@link fr.tpt.useme.architecture.model.usemearch.impl.EnvironmentSpecificationImpl <em>Environment Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.tpt.useme.architecture.model.usemearch.impl.EnvironmentSpecificationImpl
	 * @see fr.tpt.useme.architecture.model.usemearch.impl.UsemearchPackageImpl#getEnvironmentSpecification()
	 * @generated
	 */
	int ENVIRONMENT_SPECIFICATION = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_SPECIFICATION__NAME = IDENTIFIED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_SPECIFICATION__ID = IDENTIFIED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Owned Dsls</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_SPECIFICATION__OWNED_DSLS = IDENTIFIED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owned Tools</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_SPECIFICATION__OWNED_TOOLS = IDENTIFIED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Environment Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_SPECIFICATION_FEATURE_COUNT = IDENTIFIED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Environment Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_SPECIFICATION_OPERATION_COUNT = IDENTIFIED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.tpt.useme.architecture.model.usemearch.impl.EnvironmentalElementImpl <em>Environmental Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.tpt.useme.architecture.model.usemearch.impl.EnvironmentalElementImpl
	 * @see fr.tpt.useme.architecture.model.usemearch.impl.UsemearchPackageImpl#getEnvironmentalElement()
	 * @generated
	 */
	int ENVIRONMENTAL_ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENTAL_ELEMENT__NAME = IDENTIFIED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENTAL_ELEMENT__ID = IDENTIFIED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Envitonment Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENTAL_ELEMENT__ENVITONMENT_TYPE = IDENTIFIED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Environmental Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENTAL_ELEMENT_FEATURE_COUNT = IDENTIFIED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Environmental Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENTAL_ELEMENT_OPERATION_COUNT = IDENTIFIED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.tpt.useme.architecture.model.usemearch.impl.ContextSpecificationImpl <em>Context Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.tpt.useme.architecture.model.usemearch.impl.ContextSpecificationImpl
	 * @see fr.tpt.useme.architecture.model.usemearch.impl.UsemearchPackageImpl#getContextSpecification()
	 * @generated
	 */
	int CONTEXT_SPECIFICATION = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_SPECIFICATION__NAME = IDENTIFIED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_SPECIFICATION__ID = IDENTIFIED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Developed Dsl</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_SPECIFICATION__DEVELOPED_DSL = IDENTIFIED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Environmental Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_SPECIFICATION__ENVIRONMENTAL_ELEMENTS = IDENTIFIED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Context Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_SPECIFICATION_FEATURE_COUNT = IDENTIFIED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Context Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_SPECIFICATION_OPERATION_COUNT = IDENTIFIED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.tpt.useme.architecture.model.usemearch.impl.DslImpl <em>Dsl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.tpt.useme.architecture.model.usemearch.impl.DslImpl
	 * @see fr.tpt.useme.architecture.model.usemearch.impl.UsemearchPackageImpl#getDsl()
	 * @generated
	 */
	int DSL = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL__NAME = ENVIRONMENTAL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL__ID = ENVIRONMENTAL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Envitonment Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL__ENVITONMENT_TYPE = ENVIRONMENTAL_ELEMENT__ENVITONMENT_TYPE;

	/**
	 * The feature id for the '<em><b>Owned Syntaxes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL__OWNED_SYNTAXES = ENVIRONMENTAL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Concrete Syntaxes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL__CONCRETE_SYNTAXES = ENVIRONMENTAL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Abstractsyntax</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL__ABSTRACTSYNTAX = ENVIRONMENTAL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Supporting Tools</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL__SUPPORTING_TOOLS = ENVIRONMENTAL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Dsl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_FEATURE_COUNT = ENVIRONMENTAL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Dsl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_OPERATION_COUNT = ENVIRONMENTAL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.tpt.useme.architecture.model.usemearch.impl.SyntaxImpl <em>Syntax</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.tpt.useme.architecture.model.usemearch.impl.SyntaxImpl
	 * @see fr.tpt.useme.architecture.model.usemearch.impl.UsemearchPackageImpl#getSyntax()
	 * @generated
	 */
	int SYNTAX = 5;

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
	 * The meta object id for the '{@link fr.tpt.useme.architecture.model.usemearch.impl.AbstractSyntaxImpl <em>Abstract Syntax</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.tpt.useme.architecture.model.usemearch.impl.AbstractSyntaxImpl
	 * @see fr.tpt.useme.architecture.model.usemearch.impl.UsemearchPackageImpl#getAbstractSyntax()
	 * @generated
	 */
	int ABSTRACT_SYNTAX = 6;

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
	 * The meta object id for the '{@link fr.tpt.useme.architecture.model.usemearch.impl.ConcreteSyntaxImpl <em>Concrete Syntax</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.tpt.useme.architecture.model.usemearch.impl.ConcreteSyntaxImpl
	 * @see fr.tpt.useme.architecture.model.usemearch.impl.UsemearchPackageImpl#getConcreteSyntax()
	 * @generated
	 */
	int CONCRETE_SYNTAX = 7;

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
	 * The feature id for the '<em><b>Language</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_SYNTAX__LANGUAGE = SYNTAX_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Concrete Syntax</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_SYNTAX_FEATURE_COUNT = SYNTAX_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Concrete Syntax</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_SYNTAX_OPERATION_COUNT = SYNTAX_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.tpt.useme.architecture.model.usemearch.impl.ECoreAbstractSyntaxImpl <em>ECore Abstract Syntax</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.tpt.useme.architecture.model.usemearch.impl.ECoreAbstractSyntaxImpl
	 * @see fr.tpt.useme.architecture.model.usemearch.impl.UsemearchPackageImpl#getECoreAbstractSyntax()
	 * @generated
	 */
	int ECORE_ABSTRACT_SYNTAX = 8;

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
	 * The meta object id for the '{@link fr.tpt.useme.architecture.model.usemearch.impl.SiriusConcreteSyntaxImpl <em>Sirius Concrete Syntax</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.tpt.useme.architecture.model.usemearch.impl.SiriusConcreteSyntaxImpl
	 * @see fr.tpt.useme.architecture.model.usemearch.impl.UsemearchPackageImpl#getSiriusConcreteSyntax()
	 * @generated
	 */
	int SIRIUS_CONCRETE_SYNTAX = 9;

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
	 * The feature id for the '<em><b>Language</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIRIUS_CONCRETE_SYNTAX__LANGUAGE = CONCRETE_SYNTAX__LANGUAGE;

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
	 * The meta object id for the '{@link fr.tpt.useme.architecture.model.usemearch.impl.ToolImpl <em>Tool</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.tpt.useme.architecture.model.usemearch.impl.ToolImpl
	 * @see fr.tpt.useme.architecture.model.usemearch.impl.UsemearchPackageImpl#getTool()
	 * @generated
	 */
	int TOOL = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL__NAME = ENVIRONMENTAL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL__ID = ENVIRONMENTAL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Envitonment Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL__ENVITONMENT_TYPE = ENVIRONMENTAL_ELEMENT__ENVITONMENT_TYPE;

	/**
	 * The feature id for the '<em><b>Used By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL__USED_BY = ENVIRONMENTAL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Tool</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_FEATURE_COUNT = ENVIRONMENTAL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Tool</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_OPERATION_COUNT = ENVIRONMENTAL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.tpt.useme.architecture.model.usemearch.impl.UserImpl <em>User</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.tpt.useme.architecture.model.usemearch.impl.UserImpl
	 * @see fr.tpt.useme.architecture.model.usemearch.impl.UsemearchPackageImpl#getUser()
	 * @generated
	 */
	int USER = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__NAME = ENVIRONMENTAL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__ID = ENVIRONMENTAL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Envitonment Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__ENVITONMENT_TYPE = ENVIRONMENTAL_ELEMENT__ENVITONMENT_TYPE;

	/**
	 * The feature id for the '<em><b>Uses</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__USES = ENVIRONMENTAL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_FEATURE_COUNT = ENVIRONMENTAL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_OPERATION_COUNT = ENVIRONMENTAL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.tpt.useme.architecture.model.usemearch.impl.WorkPlaceImpl <em>Work Place</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.tpt.useme.architecture.model.usemearch.impl.WorkPlaceImpl
	 * @see fr.tpt.useme.architecture.model.usemearch.impl.UsemearchPackageImpl#getWorkPlace()
	 * @generated
	 */
	int WORK_PLACE = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PLACE__NAME = ENVIRONMENTAL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PLACE__ID = ENVIRONMENTAL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Envitonment Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PLACE__ENVITONMENT_TYPE = ENVIRONMENTAL_ELEMENT__ENVITONMENT_TYPE;

	/**
	 * The number of structural features of the '<em>Work Place</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PLACE_FEATURE_COUNT = ENVIRONMENTAL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Work Place</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PLACE_OPERATION_COUNT = ENVIRONMENTAL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.tpt.useme.architecture.model.usemearch.impl.ComputerImpl <em>Computer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.tpt.useme.architecture.model.usemearch.impl.ComputerImpl
	 * @see fr.tpt.useme.architecture.model.usemearch.impl.UsemearchPackageImpl#getComputer()
	 * @generated
	 */
	int COMPUTER = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTER__NAME = TOOL__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTER__ID = TOOL__ID;

	/**
	 * The feature id for the '<em><b>Envitonment Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTER__ENVITONMENT_TYPE = TOOL__ENVITONMENT_TYPE;

	/**
	 * The feature id for the '<em><b>Used By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTER__USED_BY = TOOL__USED_BY;

	/**
	 * The number of structural features of the '<em>Computer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTER_FEATURE_COUNT = TOOL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Computer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTER_OPERATION_COUNT = TOOL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.tpt.useme.architecture.model.usemearch.impl.SoftwareToolImpl <em>Software Tool</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.tpt.useme.architecture.model.usemearch.impl.SoftwareToolImpl
	 * @see fr.tpt.useme.architecture.model.usemearch.impl.UsemearchPackageImpl#getSoftwareTool()
	 * @generated
	 */
	int SOFTWARE_TOOL = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_TOOL__NAME = TOOL__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_TOOL__ID = TOOL__ID;

	/**
	 * The feature id for the '<em><b>Envitonment Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_TOOL__ENVITONMENT_TYPE = TOOL__ENVITONMENT_TYPE;

	/**
	 * The feature id for the '<em><b>Used By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_TOOL__USED_BY = TOOL__USED_BY;

	/**
	 * The feature id for the '<em><b>Supported Languages</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_TOOL__SUPPORTED_LANGUAGES = TOOL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Software Tool</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_TOOL_FEATURE_COUNT = TOOL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Software Tool</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_TOOL_OPERATION_COUNT = TOOL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.tpt.useme.architecture.model.usemearch.impl.OperatingSystemImpl <em>Operating System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.tpt.useme.architecture.model.usemearch.impl.OperatingSystemImpl
	 * @see fr.tpt.useme.architecture.model.usemearch.impl.UsemearchPackageImpl#getOperatingSystem()
	 * @generated
	 */
	int OPERATING_SYSTEM = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATING_SYSTEM__NAME = SOFTWARE_TOOL__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATING_SYSTEM__ID = SOFTWARE_TOOL__ID;

	/**
	 * The feature id for the '<em><b>Envitonment Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATING_SYSTEM__ENVITONMENT_TYPE = SOFTWARE_TOOL__ENVITONMENT_TYPE;

	/**
	 * The feature id for the '<em><b>Used By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATING_SYSTEM__USED_BY = SOFTWARE_TOOL__USED_BY;

	/**
	 * The feature id for the '<em><b>Supported Languages</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATING_SYSTEM__SUPPORTED_LANGUAGES = SOFTWARE_TOOL__SUPPORTED_LANGUAGES;

	/**
	 * The number of structural features of the '<em>Operating System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATING_SYSTEM_FEATURE_COUNT = SOFTWARE_TOOL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Operating System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATING_SYSTEM_OPERATION_COUNT = SOFTWARE_TOOL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.tpt.useme.architecture.model.usemearch.EnvironmentType <em>Environment Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.tpt.useme.architecture.model.usemearch.EnvironmentType
	 * @see fr.tpt.useme.architecture.model.usemearch.impl.UsemearchPackageImpl#getEnvironmentType()
	 * @generated
	 */
	int ENVIRONMENT_TYPE = 16;


	/**
	 * Returns the meta object for class '{@link fr.tpt.useme.architecture.model.usemearch.IdentifiedElement <em>Identified Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Identified Element</em>'.
	 * @see fr.tpt.useme.architecture.model.usemearch.IdentifiedElement
	 * @generated
	 */
	EClass getIdentifiedElement();

	/**
	 * Returns the meta object for the attribute '{@link fr.tpt.useme.architecture.model.usemearch.IdentifiedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fr.tpt.useme.architecture.model.usemearch.IdentifiedElement#getName()
	 * @see #getIdentifiedElement()
	 * @generated
	 */
	EAttribute getIdentifiedElement_Name();

	/**
	 * Returns the meta object for the attribute '{@link fr.tpt.useme.architecture.model.usemearch.IdentifiedElement#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see fr.tpt.useme.architecture.model.usemearch.IdentifiedElement#getId()
	 * @see #getIdentifiedElement()
	 * @generated
	 */
	EAttribute getIdentifiedElement_Id();

	/**
	 * Returns the meta object for class '{@link fr.tpt.useme.architecture.model.usemearch.EnvironmentSpecification <em>Environment Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Environment Specification</em>'.
	 * @see fr.tpt.useme.architecture.model.usemearch.EnvironmentSpecification
	 * @generated
	 */
	EClass getEnvironmentSpecification();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.tpt.useme.architecture.model.usemearch.EnvironmentSpecification#getOwnedDsls <em>Owned Dsls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Dsls</em>'.
	 * @see fr.tpt.useme.architecture.model.usemearch.EnvironmentSpecification#getOwnedDsls()
	 * @see #getEnvironmentSpecification()
	 * @generated
	 */
	EReference getEnvironmentSpecification_OwnedDsls();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.tpt.useme.architecture.model.usemearch.EnvironmentSpecification#getOwnedTools <em>Owned Tools</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Tools</em>'.
	 * @see fr.tpt.useme.architecture.model.usemearch.EnvironmentSpecification#getOwnedTools()
	 * @see #getEnvironmentSpecification()
	 * @generated
	 */
	EReference getEnvironmentSpecification_OwnedTools();

	/**
	 * Returns the meta object for class '{@link fr.tpt.useme.architecture.model.usemearch.EnvironmentalElement <em>Environmental Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Environmental Element</em>'.
	 * @see fr.tpt.useme.architecture.model.usemearch.EnvironmentalElement
	 * @generated
	 */
	EClass getEnvironmentalElement();

	/**
	 * Returns the meta object for the attribute '{@link fr.tpt.useme.architecture.model.usemearch.EnvironmentalElement#getEnvitonmentType <em>Envitonment Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Envitonment Type</em>'.
	 * @see fr.tpt.useme.architecture.model.usemearch.EnvironmentalElement#getEnvitonmentType()
	 * @see #getEnvironmentalElement()
	 * @generated
	 */
	EAttribute getEnvironmentalElement_EnvitonmentType();

	/**
	 * Returns the meta object for class '{@link fr.tpt.useme.architecture.model.usemearch.ContextSpecification <em>Context Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Context Specification</em>'.
	 * @see fr.tpt.useme.architecture.model.usemearch.ContextSpecification
	 * @generated
	 */
	EClass getContextSpecification();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.useme.architecture.model.usemearch.ContextSpecification#getDevelopedDsl <em>Developed Dsl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Developed Dsl</em>'.
	 * @see fr.tpt.useme.architecture.model.usemearch.ContextSpecification#getDevelopedDsl()
	 * @see #getContextSpecification()
	 * @generated
	 */
	EReference getContextSpecification_DevelopedDsl();

	/**
	 * Returns the meta object for the reference list '{@link fr.tpt.useme.architecture.model.usemearch.ContextSpecification#getEnvironmentalElements <em>Environmental Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Environmental Elements</em>'.
	 * @see fr.tpt.useme.architecture.model.usemearch.ContextSpecification#getEnvironmentalElements()
	 * @see #getContextSpecification()
	 * @generated
	 */
	EReference getContextSpecification_EnvironmentalElements();

	/**
	 * Returns the meta object for class '{@link fr.tpt.useme.architecture.model.usemearch.Dsl <em>Dsl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dsl</em>'.
	 * @see fr.tpt.useme.architecture.model.usemearch.Dsl
	 * @generated
	 */
	EClass getDsl();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.tpt.useme.architecture.model.usemearch.Dsl#getOwnedSyntaxes <em>Owned Syntaxes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Syntaxes</em>'.
	 * @see fr.tpt.useme.architecture.model.usemearch.Dsl#getOwnedSyntaxes()
	 * @see #getDsl()
	 * @generated
	 */
	EReference getDsl_OwnedSyntaxes();

	/**
	 * Returns the meta object for the reference list '{@link fr.tpt.useme.architecture.model.usemearch.Dsl#getConcreteSyntaxes <em>Concrete Syntaxes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Concrete Syntaxes</em>'.
	 * @see fr.tpt.useme.architecture.model.usemearch.Dsl#getConcreteSyntaxes()
	 * @see #getDsl()
	 * @generated
	 */
	EReference getDsl_ConcreteSyntaxes();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.useme.architecture.model.usemearch.Dsl#getAbstractsyntax <em>Abstractsyntax</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Abstractsyntax</em>'.
	 * @see fr.tpt.useme.architecture.model.usemearch.Dsl#getAbstractsyntax()
	 * @see #getDsl()
	 * @generated
	 */
	EReference getDsl_Abstractsyntax();

	/**
	 * Returns the meta object for the reference list '{@link fr.tpt.useme.architecture.model.usemearch.Dsl#getSupportingTools <em>Supporting Tools</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Supporting Tools</em>'.
	 * @see fr.tpt.useme.architecture.model.usemearch.Dsl#getSupportingTools()
	 * @see #getDsl()
	 * @generated
	 */
	EReference getDsl_SupportingTools();

	/**
	 * Returns the meta object for class '{@link fr.tpt.useme.architecture.model.usemearch.Syntax <em>Syntax</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Syntax</em>'.
	 * @see fr.tpt.useme.architecture.model.usemearch.Syntax
	 * @generated
	 */
	EClass getSyntax();

	/**
	 * Returns the meta object for class '{@link fr.tpt.useme.architecture.model.usemearch.AbstractSyntax <em>Abstract Syntax</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Syntax</em>'.
	 * @see fr.tpt.useme.architecture.model.usemearch.AbstractSyntax
	 * @generated
	 */
	EClass getAbstractSyntax();

	/**
	 * Returns the meta object for class '{@link fr.tpt.useme.architecture.model.usemearch.ConcreteSyntax <em>Concrete Syntax</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Concrete Syntax</em>'.
	 * @see fr.tpt.useme.architecture.model.usemearch.ConcreteSyntax
	 * @generated
	 */
	EClass getConcreteSyntax();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.useme.architecture.model.usemearch.ConcreteSyntax#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Language</em>'.
	 * @see fr.tpt.useme.architecture.model.usemearch.ConcreteSyntax#getLanguage()
	 * @see #getConcreteSyntax()
	 * @generated
	 */
	EReference getConcreteSyntax_Language();

	/**
	 * Returns the meta object for class '{@link fr.tpt.useme.architecture.model.usemearch.ECoreAbstractSyntax <em>ECore Abstract Syntax</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ECore Abstract Syntax</em>'.
	 * @see fr.tpt.useme.architecture.model.usemearch.ECoreAbstractSyntax
	 * @generated
	 */
	EClass getECoreAbstractSyntax();

	/**
	 * Returns the meta object for the reference list '{@link fr.tpt.useme.architecture.model.usemearch.ECoreAbstractSyntax#getPackages <em>Packages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Packages</em>'.
	 * @see fr.tpt.useme.architecture.model.usemearch.ECoreAbstractSyntax#getPackages()
	 * @see #getECoreAbstractSyntax()
	 * @generated
	 */
	EReference getECoreAbstractSyntax_Packages();

	/**
	 * Returns the meta object for class '{@link fr.tpt.useme.architecture.model.usemearch.SiriusConcreteSyntax <em>Sirius Concrete Syntax</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sirius Concrete Syntax</em>'.
	 * @see fr.tpt.useme.architecture.model.usemearch.SiriusConcreteSyntax
	 * @generated
	 */
	EClass getSiriusConcreteSyntax();

	/**
	 * Returns the meta object for the reference list '{@link fr.tpt.useme.architecture.model.usemearch.SiriusConcreteSyntax#getSiriusSpecification <em>Sirius Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sirius Specification</em>'.
	 * @see fr.tpt.useme.architecture.model.usemearch.SiriusConcreteSyntax#getSiriusSpecification()
	 * @see #getSiriusConcreteSyntax()
	 * @generated
	 */
	EReference getSiriusConcreteSyntax_SiriusSpecification();

	/**
	 * Returns the meta object for class '{@link fr.tpt.useme.architecture.model.usemearch.Tool <em>Tool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tool</em>'.
	 * @see fr.tpt.useme.architecture.model.usemearch.Tool
	 * @generated
	 */
	EClass getTool();

	/**
	 * Returns the meta object for the reference list '{@link fr.tpt.useme.architecture.model.usemearch.Tool#getUsedBy <em>Used By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Used By</em>'.
	 * @see fr.tpt.useme.architecture.model.usemearch.Tool#getUsedBy()
	 * @see #getTool()
	 * @generated
	 */
	EReference getTool_UsedBy();

	/**
	 * Returns the meta object for class '{@link fr.tpt.useme.architecture.model.usemearch.User <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User</em>'.
	 * @see fr.tpt.useme.architecture.model.usemearch.User
	 * @generated
	 */
	EClass getUser();

	/**
	 * Returns the meta object for the reference list '{@link fr.tpt.useme.architecture.model.usemearch.User#getUses <em>Uses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Uses</em>'.
	 * @see fr.tpt.useme.architecture.model.usemearch.User#getUses()
	 * @see #getUser()
	 * @generated
	 */
	EReference getUser_Uses();

	/**
	 * Returns the meta object for class '{@link fr.tpt.useme.architecture.model.usemearch.WorkPlace <em>Work Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Work Place</em>'.
	 * @see fr.tpt.useme.architecture.model.usemearch.WorkPlace
	 * @generated
	 */
	EClass getWorkPlace();

	/**
	 * Returns the meta object for class '{@link fr.tpt.useme.architecture.model.usemearch.Computer <em>Computer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Computer</em>'.
	 * @see fr.tpt.useme.architecture.model.usemearch.Computer
	 * @generated
	 */
	EClass getComputer();

	/**
	 * Returns the meta object for class '{@link fr.tpt.useme.architecture.model.usemearch.SoftwareTool <em>Software Tool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Software Tool</em>'.
	 * @see fr.tpt.useme.architecture.model.usemearch.SoftwareTool
	 * @generated
	 */
	EClass getSoftwareTool();

	/**
	 * Returns the meta object for the reference list '{@link fr.tpt.useme.architecture.model.usemearch.SoftwareTool#getSupportedLanguages <em>Supported Languages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Supported Languages</em>'.
	 * @see fr.tpt.useme.architecture.model.usemearch.SoftwareTool#getSupportedLanguages()
	 * @see #getSoftwareTool()
	 * @generated
	 */
	EReference getSoftwareTool_SupportedLanguages();

	/**
	 * Returns the meta object for class '{@link fr.tpt.useme.architecture.model.usemearch.OperatingSystem <em>Operating System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operating System</em>'.
	 * @see fr.tpt.useme.architecture.model.usemearch.OperatingSystem
	 * @generated
	 */
	EClass getOperatingSystem();

	/**
	 * Returns the meta object for enum '{@link fr.tpt.useme.architecture.model.usemearch.EnvironmentType <em>Environment Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Environment Type</em>'.
	 * @see fr.tpt.useme.architecture.model.usemearch.EnvironmentType
	 * @generated
	 */
	EEnum getEnvironmentType();

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
		 * The meta object literal for the '{@link fr.tpt.useme.architecture.model.usemearch.impl.IdentifiedElementImpl <em>Identified Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.tpt.useme.architecture.model.usemearch.impl.IdentifiedElementImpl
		 * @see fr.tpt.useme.architecture.model.usemearch.impl.UsemearchPackageImpl#getIdentifiedElement()
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

		/**
		 * The meta object literal for the '{@link fr.tpt.useme.architecture.model.usemearch.impl.EnvironmentSpecificationImpl <em>Environment Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.tpt.useme.architecture.model.usemearch.impl.EnvironmentSpecificationImpl
		 * @see fr.tpt.useme.architecture.model.usemearch.impl.UsemearchPackageImpl#getEnvironmentSpecification()
		 * @generated
		 */
		EClass ENVIRONMENT_SPECIFICATION = eINSTANCE.getEnvironmentSpecification();

		/**
		 * The meta object literal for the '<em><b>Owned Dsls</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENVIRONMENT_SPECIFICATION__OWNED_DSLS = eINSTANCE.getEnvironmentSpecification_OwnedDsls();

		/**
		 * The meta object literal for the '<em><b>Owned Tools</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENVIRONMENT_SPECIFICATION__OWNED_TOOLS = eINSTANCE.getEnvironmentSpecification_OwnedTools();

		/**
		 * The meta object literal for the '{@link fr.tpt.useme.architecture.model.usemearch.impl.EnvironmentalElementImpl <em>Environmental Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.tpt.useme.architecture.model.usemearch.impl.EnvironmentalElementImpl
		 * @see fr.tpt.useme.architecture.model.usemearch.impl.UsemearchPackageImpl#getEnvironmentalElement()
		 * @generated
		 */
		EClass ENVIRONMENTAL_ELEMENT = eINSTANCE.getEnvironmentalElement();

		/**
		 * The meta object literal for the '<em><b>Envitonment Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENVIRONMENTAL_ELEMENT__ENVITONMENT_TYPE = eINSTANCE.getEnvironmentalElement_EnvitonmentType();

		/**
		 * The meta object literal for the '{@link fr.tpt.useme.architecture.model.usemearch.impl.ContextSpecificationImpl <em>Context Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.tpt.useme.architecture.model.usemearch.impl.ContextSpecificationImpl
		 * @see fr.tpt.useme.architecture.model.usemearch.impl.UsemearchPackageImpl#getContextSpecification()
		 * @generated
		 */
		EClass CONTEXT_SPECIFICATION = eINSTANCE.getContextSpecification();

		/**
		 * The meta object literal for the '<em><b>Developed Dsl</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT_SPECIFICATION__DEVELOPED_DSL = eINSTANCE.getContextSpecification_DevelopedDsl();

		/**
		 * The meta object literal for the '<em><b>Environmental Elements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT_SPECIFICATION__ENVIRONMENTAL_ELEMENTS = eINSTANCE.getContextSpecification_EnvironmentalElements();

		/**
		 * The meta object literal for the '{@link fr.tpt.useme.architecture.model.usemearch.impl.DslImpl <em>Dsl</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.tpt.useme.architecture.model.usemearch.impl.DslImpl
		 * @see fr.tpt.useme.architecture.model.usemearch.impl.UsemearchPackageImpl#getDsl()
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
		 * The meta object literal for the '<em><b>Supporting Tools</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DSL__SUPPORTING_TOOLS = eINSTANCE.getDsl_SupportingTools();

		/**
		 * The meta object literal for the '{@link fr.tpt.useme.architecture.model.usemearch.impl.SyntaxImpl <em>Syntax</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.tpt.useme.architecture.model.usemearch.impl.SyntaxImpl
		 * @see fr.tpt.useme.architecture.model.usemearch.impl.UsemearchPackageImpl#getSyntax()
		 * @generated
		 */
		EClass SYNTAX = eINSTANCE.getSyntax();

		/**
		 * The meta object literal for the '{@link fr.tpt.useme.architecture.model.usemearch.impl.AbstractSyntaxImpl <em>Abstract Syntax</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.tpt.useme.architecture.model.usemearch.impl.AbstractSyntaxImpl
		 * @see fr.tpt.useme.architecture.model.usemearch.impl.UsemearchPackageImpl#getAbstractSyntax()
		 * @generated
		 */
		EClass ABSTRACT_SYNTAX = eINSTANCE.getAbstractSyntax();

		/**
		 * The meta object literal for the '{@link fr.tpt.useme.architecture.model.usemearch.impl.ConcreteSyntaxImpl <em>Concrete Syntax</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.tpt.useme.architecture.model.usemearch.impl.ConcreteSyntaxImpl
		 * @see fr.tpt.useme.architecture.model.usemearch.impl.UsemearchPackageImpl#getConcreteSyntax()
		 * @generated
		 */
		EClass CONCRETE_SYNTAX = eINSTANCE.getConcreteSyntax();

		/**
		 * The meta object literal for the '<em><b>Language</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONCRETE_SYNTAX__LANGUAGE = eINSTANCE.getConcreteSyntax_Language();

		/**
		 * The meta object literal for the '{@link fr.tpt.useme.architecture.model.usemearch.impl.ECoreAbstractSyntaxImpl <em>ECore Abstract Syntax</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.tpt.useme.architecture.model.usemearch.impl.ECoreAbstractSyntaxImpl
		 * @see fr.tpt.useme.architecture.model.usemearch.impl.UsemearchPackageImpl#getECoreAbstractSyntax()
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
		 * The meta object literal for the '{@link fr.tpt.useme.architecture.model.usemearch.impl.SiriusConcreteSyntaxImpl <em>Sirius Concrete Syntax</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.tpt.useme.architecture.model.usemearch.impl.SiriusConcreteSyntaxImpl
		 * @see fr.tpt.useme.architecture.model.usemearch.impl.UsemearchPackageImpl#getSiriusConcreteSyntax()
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
		 * The meta object literal for the '{@link fr.tpt.useme.architecture.model.usemearch.impl.ToolImpl <em>Tool</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.tpt.useme.architecture.model.usemearch.impl.ToolImpl
		 * @see fr.tpt.useme.architecture.model.usemearch.impl.UsemearchPackageImpl#getTool()
		 * @generated
		 */
		EClass TOOL = eINSTANCE.getTool();

		/**
		 * The meta object literal for the '<em><b>Used By</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOOL__USED_BY = eINSTANCE.getTool_UsedBy();

		/**
		 * The meta object literal for the '{@link fr.tpt.useme.architecture.model.usemearch.impl.UserImpl <em>User</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.tpt.useme.architecture.model.usemearch.impl.UserImpl
		 * @see fr.tpt.useme.architecture.model.usemearch.impl.UsemearchPackageImpl#getUser()
		 * @generated
		 */
		EClass USER = eINSTANCE.getUser();

		/**
		 * The meta object literal for the '<em><b>Uses</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER__USES = eINSTANCE.getUser_Uses();

		/**
		 * The meta object literal for the '{@link fr.tpt.useme.architecture.model.usemearch.impl.WorkPlaceImpl <em>Work Place</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.tpt.useme.architecture.model.usemearch.impl.WorkPlaceImpl
		 * @see fr.tpt.useme.architecture.model.usemearch.impl.UsemearchPackageImpl#getWorkPlace()
		 * @generated
		 */
		EClass WORK_PLACE = eINSTANCE.getWorkPlace();

		/**
		 * The meta object literal for the '{@link fr.tpt.useme.architecture.model.usemearch.impl.ComputerImpl <em>Computer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.tpt.useme.architecture.model.usemearch.impl.ComputerImpl
		 * @see fr.tpt.useme.architecture.model.usemearch.impl.UsemearchPackageImpl#getComputer()
		 * @generated
		 */
		EClass COMPUTER = eINSTANCE.getComputer();

		/**
		 * The meta object literal for the '{@link fr.tpt.useme.architecture.model.usemearch.impl.SoftwareToolImpl <em>Software Tool</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.tpt.useme.architecture.model.usemearch.impl.SoftwareToolImpl
		 * @see fr.tpt.useme.architecture.model.usemearch.impl.UsemearchPackageImpl#getSoftwareTool()
		 * @generated
		 */
		EClass SOFTWARE_TOOL = eINSTANCE.getSoftwareTool();

		/**
		 * The meta object literal for the '<em><b>Supported Languages</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOFTWARE_TOOL__SUPPORTED_LANGUAGES = eINSTANCE.getSoftwareTool_SupportedLanguages();

		/**
		 * The meta object literal for the '{@link fr.tpt.useme.architecture.model.usemearch.impl.OperatingSystemImpl <em>Operating System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.tpt.useme.architecture.model.usemearch.impl.OperatingSystemImpl
		 * @see fr.tpt.useme.architecture.model.usemearch.impl.UsemearchPackageImpl#getOperatingSystem()
		 * @generated
		 */
		EClass OPERATING_SYSTEM = eINSTANCE.getOperatingSystem();

		/**
		 * The meta object literal for the '{@link fr.tpt.useme.architecture.model.usemearch.EnvironmentType <em>Environment Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.tpt.useme.architecture.model.usemearch.EnvironmentType
		 * @see fr.tpt.useme.architecture.model.usemearch.impl.UsemearchPackageImpl#getEnvironmentType()
		 * @generated
		 */
		EEnum ENVIRONMENT_TYPE = eINSTANCE.getEnvironmentType();

	}

} //UsemearchPackage
