/**
 */
package fr.tpt.useme.architecture.model.usemearch;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.sirius.viewpoint.description.DescriptionPackage;

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
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIED_ELEMENT__DESCRIPTION = 2;

	/**
	 * The number of structural features of the '<em>Identified Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIED_ELEMENT_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link fr.tpt.useme.architecture.model.usemearch.impl.DsslSpecificationImpl <em>Dssl Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.tpt.useme.architecture.model.usemearch.impl.DsslSpecificationImpl
	 * @see fr.tpt.useme.architecture.model.usemearch.impl.UsemearchPackageImpl#getDsslSpecification()
	 * @generated
	 */
	int DSSL_SPECIFICATION = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSSL_SPECIFICATION__NAME = IDENTIFIED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSSL_SPECIFICATION__ID = IDENTIFIED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSSL_SPECIFICATION__DESCRIPTION = IDENTIFIED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Developed Dsl</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSSL_SPECIFICATION__DEVELOPED_DSL = IDENTIFIED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owned Contexts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSSL_SPECIFICATION__OWNED_CONTEXTS = IDENTIFIED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Owned Entity Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSSL_SPECIFICATION__OWNED_ENTITY_TYPES = IDENTIFIED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Dssl Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSSL_SPECIFICATION_FEATURE_COUNT = IDENTIFIED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link fr.tpt.useme.architecture.model.usemearch.impl.EntityTypeImpl <em>Entity Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.tpt.useme.architecture.model.usemearch.impl.EntityTypeImpl
	 * @see fr.tpt.useme.architecture.model.usemearch.impl.UsemearchPackageImpl#getEntityType()
	 * @generated
	 */
	int ENTITY_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TYPE__NAME = IDENTIFIED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TYPE__ID = IDENTIFIED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TYPE__DESCRIPTION = IDENTIFIED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TYPE__CATEGORY = IDENTIFIED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owned Interaction Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TYPE__OWNED_INTERACTION_FEATURES = IDENTIFIED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Entity Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TYPE_FEATURE_COUNT = IDENTIFIED_ELEMENT_FEATURE_COUNT + 2;

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
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_SPECIFICATION__DESCRIPTION = IDENTIFIED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Owned Entity Instances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_SPECIFICATION__OWNED_ENTITY_INSTANCES = IDENTIFIED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Developed Dsl</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_SPECIFICATION__DEVELOPED_DSL = IDENTIFIED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Owned Connections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_SPECIFICATION__OWNED_CONNECTIONS = IDENTIFIED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Context Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_SPECIFICATION_FEATURE_COUNT = IDENTIFIED_ELEMENT_FEATURE_COUNT + 3;

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
	int DSL__NAME = ENTITY_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL__ID = ENTITY_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL__DESCRIPTION = ENTITY_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL__CATEGORY = ENTITY_TYPE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Owned Interaction Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL__OWNED_INTERACTION_FEATURES = ENTITY_TYPE__OWNED_INTERACTION_FEATURES;

	/**
	 * The feature id for the '<em><b>Owned Syntaxes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL__OWNED_SYNTAXES = ENTITY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Concrete Syntaxes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL__CONCRETE_SYNTAXES = ENTITY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Abstractsyntax</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL__ABSTRACTSYNTAX = ENTITY_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Supporting Tools</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL__SUPPORTING_TOOLS = ENTITY_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Owned Semantics</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL__OWNED_SEMANTICS = ENTITY_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Owned Feature Diagrams</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL__OWNED_FEATURE_DIAGRAMS = ENTITY_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Owned Documentations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL__OWNED_DOCUMENTATIONS = ENTITY_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Maintenance Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL__MAINTENANCE_SERVICE = ENTITY_TYPE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Dsl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_FEATURE_COUNT = ENTITY_TYPE_FEATURE_COUNT + 8;

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
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNTAX__DESCRIPTION = IDENTIFIED_ELEMENT__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Syntax</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNTAX_FEATURE_COUNT = IDENTIFIED_ELEMENT_FEATURE_COUNT + 0;

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
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SYNTAX__DESCRIPTION = SYNTAX__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Abstract Syntax</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SYNTAX_FEATURE_COUNT = SYNTAX_FEATURE_COUNT + 0;

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
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_SYNTAX__DESCRIPTION = SYNTAX__DESCRIPTION;

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
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECORE_ABSTRACT_SYNTAX__DESCRIPTION = ABSTRACT_SYNTAX__DESCRIPTION;

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
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIRIUS_CONCRETE_SYNTAX__DESCRIPTION = CONCRETE_SYNTAX__DESCRIPTION;

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
	int TOOL__NAME = ENTITY_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL__ID = ENTITY_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL__DESCRIPTION = ENTITY_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL__CATEGORY = ENTITY_TYPE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Owned Interaction Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL__OWNED_INTERACTION_FEATURES = ENTITY_TYPE__OWNED_INTERACTION_FEATURES;

	/**
	 * The feature id for the '<em><b>Used By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL__USED_BY = ENTITY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Controlled By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL__CONTROLLED_BY = ENTITY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Controls</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL__CONTROLS = ENTITY_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL__VERSION = ENTITY_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Tool</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_FEATURE_COUNT = ENTITY_TYPE_FEATURE_COUNT + 4;

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
	int USER__NAME = ENTITY_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__ID = ENTITY_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__DESCRIPTION = ENTITY_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__CATEGORY = ENTITY_TYPE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Owned Interaction Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__OWNED_INTERACTION_FEATURES = ENTITY_TYPE__OWNED_INTERACTION_FEATURES;

	/**
	 * The feature id for the '<em><b>Uses</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__USES = ENTITY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Age Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__AGE_MIN = ENTITY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Age Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__AGE_MAX = ENTITY_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Perception</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__PERCEPTION = ENTITY_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Spoken Languages</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__SPOKEN_LANGUAGES = ENTITY_TYPE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_FEATURE_COUNT = ENTITY_TYPE_FEATURE_COUNT + 5;

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
	int WORK_PLACE__NAME = ENTITY_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PLACE__ID = ENTITY_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PLACE__DESCRIPTION = ENTITY_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PLACE__CATEGORY = ENTITY_TYPE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Owned Interaction Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PLACE__OWNED_INTERACTION_FEATURES = ENTITY_TYPE__OWNED_INTERACTION_FEATURES;

	/**
	 * The number of structural features of the '<em>Work Place</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PLACE_FEATURE_COUNT = ENTITY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.tpt.useme.architecture.model.usemearch.impl.HardwareToolImpl <em>Hardware Tool</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.tpt.useme.architecture.model.usemearch.impl.HardwareToolImpl
	 * @see fr.tpt.useme.architecture.model.usemearch.impl.UsemearchPackageImpl#getHardwareTool()
	 * @generated
	 */
	int HARDWARE_TOOL = 28;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_TOOL__NAME = TOOL__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_TOOL__ID = TOOL__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_TOOL__DESCRIPTION = TOOL__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_TOOL__CATEGORY = TOOL__CATEGORY;

	/**
	 * The feature id for the '<em><b>Owned Interaction Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_TOOL__OWNED_INTERACTION_FEATURES = TOOL__OWNED_INTERACTION_FEATURES;

	/**
	 * The feature id for the '<em><b>Used By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_TOOL__USED_BY = TOOL__USED_BY;

	/**
	 * The feature id for the '<em><b>Controlled By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_TOOL__CONTROLLED_BY = TOOL__CONTROLLED_BY;

	/**
	 * The feature id for the '<em><b>Controls</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_TOOL__CONTROLS = TOOL__CONTROLS;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_TOOL__VERSION = TOOL__VERSION;

	/**
	 * The number of structural features of the '<em>Hardware Tool</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_TOOL_FEATURE_COUNT = TOOL_FEATURE_COUNT + 0;

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
	int COMPUTER__NAME = HARDWARE_TOOL__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTER__ID = HARDWARE_TOOL__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTER__DESCRIPTION = HARDWARE_TOOL__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTER__CATEGORY = HARDWARE_TOOL__CATEGORY;

	/**
	 * The feature id for the '<em><b>Owned Interaction Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTER__OWNED_INTERACTION_FEATURES = HARDWARE_TOOL__OWNED_INTERACTION_FEATURES;

	/**
	 * The feature id for the '<em><b>Used By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTER__USED_BY = HARDWARE_TOOL__USED_BY;

	/**
	 * The feature id for the '<em><b>Controlled By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTER__CONTROLLED_BY = HARDWARE_TOOL__CONTROLLED_BY;

	/**
	 * The feature id for the '<em><b>Controls</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTER__CONTROLS = HARDWARE_TOOL__CONTROLS;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTER__VERSION = HARDWARE_TOOL__VERSION;

	/**
	 * The feature id for the '<em><b>Executes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTER__EXECUTES = HARDWARE_TOOL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Displays</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTER__DISPLAYS = HARDWARE_TOOL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Mouses</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTER__MOUSES = HARDWARE_TOOL_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Computer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTER_FEATURE_COUNT = HARDWARE_TOOL_FEATURE_COUNT + 3;

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
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_TOOL__DESCRIPTION = TOOL__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_TOOL__CATEGORY = TOOL__CATEGORY;

	/**
	 * The feature id for the '<em><b>Owned Interaction Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_TOOL__OWNED_INTERACTION_FEATURES = TOOL__OWNED_INTERACTION_FEATURES;

	/**
	 * The feature id for the '<em><b>Used By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_TOOL__USED_BY = TOOL__USED_BY;

	/**
	 * The feature id for the '<em><b>Controlled By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_TOOL__CONTROLLED_BY = TOOL__CONTROLLED_BY;

	/**
	 * The feature id for the '<em><b>Controls</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_TOOL__CONTROLS = TOOL__CONTROLS;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_TOOL__VERSION = TOOL__VERSION;

	/**
	 * The feature id for the '<em><b>Supported Languages</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_TOOL__SUPPORTED_LANGUAGES = TOOL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Executed By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_TOOL__EXECUTED_BY = TOOL_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Software Tool</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_TOOL_FEATURE_COUNT = TOOL_FEATURE_COUNT + 2;

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
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATING_SYSTEM__DESCRIPTION = SOFTWARE_TOOL__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATING_SYSTEM__CATEGORY = SOFTWARE_TOOL__CATEGORY;

	/**
	 * The feature id for the '<em><b>Owned Interaction Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATING_SYSTEM__OWNED_INTERACTION_FEATURES = SOFTWARE_TOOL__OWNED_INTERACTION_FEATURES;

	/**
	 * The feature id for the '<em><b>Used By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATING_SYSTEM__USED_BY = SOFTWARE_TOOL__USED_BY;

	/**
	 * The feature id for the '<em><b>Controlled By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATING_SYSTEM__CONTROLLED_BY = SOFTWARE_TOOL__CONTROLLED_BY;

	/**
	 * The feature id for the '<em><b>Controls</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATING_SYSTEM__CONTROLS = SOFTWARE_TOOL__CONTROLS;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATING_SYSTEM__VERSION = SOFTWARE_TOOL__VERSION;

	/**
	 * The feature id for the '<em><b>Supported Languages</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATING_SYSTEM__SUPPORTED_LANGUAGES = SOFTWARE_TOOL__SUPPORTED_LANGUAGES;

	/**
	 * The feature id for the '<em><b>Executed By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATING_SYSTEM__EXECUTED_BY = SOFTWARE_TOOL__EXECUTED_BY;

	/**
	 * The number of structural features of the '<em>Operating System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATING_SYSTEM_FEATURE_COUNT = SOFTWARE_TOOL_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.tpt.useme.architecture.model.usemearch.impl.SemanticsImpl <em>Semantics</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.tpt.useme.architecture.model.usemearch.impl.SemanticsImpl
	 * @see fr.tpt.useme.architecture.model.usemearch.impl.UsemearchPackageImpl#getSemantics()
	 * @generated
	 */
	int SEMANTICS = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTICS__NAME = DescriptionPackage.IDENTIFIED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTICS__LABEL = DescriptionPackage.IDENTIFIED_ELEMENT__LABEL;

	/**
	 * The number of structural features of the '<em>Semantics</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTICS_FEATURE_COUNT = DescriptionPackage.IDENTIFIED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.tpt.useme.architecture.model.usemearch.impl.FeatureDiagramImpl <em>Feature Diagram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.tpt.useme.architecture.model.usemearch.impl.FeatureDiagramImpl
	 * @see fr.tpt.useme.architecture.model.usemearch.impl.UsemearchPackageImpl#getFeatureDiagram()
	 * @generated
	 */
	int FEATURE_DIAGRAM = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_DIAGRAM__NAME = IDENTIFIED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_DIAGRAM__ID = IDENTIFIED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_DIAGRAM__DESCRIPTION = IDENTIFIED_ELEMENT__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Feature Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_DIAGRAM_FEATURE_COUNT = IDENTIFIED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.tpt.useme.architecture.model.usemearch.impl.ModelCheckerImpl <em>Model Checker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.tpt.useme.architecture.model.usemearch.impl.ModelCheckerImpl
	 * @see fr.tpt.useme.architecture.model.usemearch.impl.UsemearchPackageImpl#getModelChecker()
	 * @generated
	 */
	int MODEL_CHECKER = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_CHECKER__NAME = SOFTWARE_TOOL__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_CHECKER__ID = SOFTWARE_TOOL__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_CHECKER__DESCRIPTION = SOFTWARE_TOOL__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_CHECKER__CATEGORY = SOFTWARE_TOOL__CATEGORY;

	/**
	 * The feature id for the '<em><b>Owned Interaction Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_CHECKER__OWNED_INTERACTION_FEATURES = SOFTWARE_TOOL__OWNED_INTERACTION_FEATURES;

	/**
	 * The feature id for the '<em><b>Used By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_CHECKER__USED_BY = SOFTWARE_TOOL__USED_BY;

	/**
	 * The feature id for the '<em><b>Controlled By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_CHECKER__CONTROLLED_BY = SOFTWARE_TOOL__CONTROLLED_BY;

	/**
	 * The feature id for the '<em><b>Controls</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_CHECKER__CONTROLS = SOFTWARE_TOOL__CONTROLS;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_CHECKER__VERSION = SOFTWARE_TOOL__VERSION;

	/**
	 * The feature id for the '<em><b>Supported Languages</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_CHECKER__SUPPORTED_LANGUAGES = SOFTWARE_TOOL__SUPPORTED_LANGUAGES;

	/**
	 * The feature id for the '<em><b>Executed By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_CHECKER__EXECUTED_BY = SOFTWARE_TOOL__EXECUTED_BY;

	/**
	 * The number of structural features of the '<em>Model Checker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_CHECKER_FEATURE_COUNT = SOFTWARE_TOOL_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.tpt.useme.architecture.model.usemearch.impl.ModelSimulatorImpl <em>Model Simulator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.tpt.useme.architecture.model.usemearch.impl.ModelSimulatorImpl
	 * @see fr.tpt.useme.architecture.model.usemearch.impl.UsemearchPackageImpl#getModelSimulator()
	 * @generated
	 */
	int MODEL_SIMULATOR = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_SIMULATOR__NAME = SOFTWARE_TOOL__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_SIMULATOR__ID = SOFTWARE_TOOL__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_SIMULATOR__DESCRIPTION = SOFTWARE_TOOL__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_SIMULATOR__CATEGORY = SOFTWARE_TOOL__CATEGORY;

	/**
	 * The feature id for the '<em><b>Owned Interaction Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_SIMULATOR__OWNED_INTERACTION_FEATURES = SOFTWARE_TOOL__OWNED_INTERACTION_FEATURES;

	/**
	 * The feature id for the '<em><b>Used By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_SIMULATOR__USED_BY = SOFTWARE_TOOL__USED_BY;

	/**
	 * The feature id for the '<em><b>Controlled By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_SIMULATOR__CONTROLLED_BY = SOFTWARE_TOOL__CONTROLLED_BY;

	/**
	 * The feature id for the '<em><b>Controls</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_SIMULATOR__CONTROLS = SOFTWARE_TOOL__CONTROLS;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_SIMULATOR__VERSION = SOFTWARE_TOOL__VERSION;

	/**
	 * The feature id for the '<em><b>Supported Languages</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_SIMULATOR__SUPPORTED_LANGUAGES = SOFTWARE_TOOL__SUPPORTED_LANGUAGES;

	/**
	 * The feature id for the '<em><b>Executed By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_SIMULATOR__EXECUTED_BY = SOFTWARE_TOOL__EXECUTED_BY;

	/**
	 * The number of structural features of the '<em>Model Simulator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_SIMULATOR_FEATURE_COUNT = SOFTWARE_TOOL_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.tpt.useme.architecture.model.usemearch.Documentation <em>Documentation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.tpt.useme.architecture.model.usemearch.Documentation
	 * @see fr.tpt.useme.architecture.model.usemearch.impl.UsemearchPackageImpl#getDocumentation()
	 * @generated
	 */
	int DOCUMENTATION = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION__NAME = ENTITY_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION__ID = ENTITY_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION__DESCRIPTION = ENTITY_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION__CATEGORY = ENTITY_TYPE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Owned Interaction Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION__OWNED_INTERACTION_FEATURES = ENTITY_TYPE__OWNED_INTERACTION_FEATURES;

	/**
	 * The number of structural features of the '<em>Documentation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION_FEATURE_COUNT = ENTITY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.tpt.useme.architecture.model.usemearch.impl.MaintenanceServiceImpl <em>Maintenance Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.tpt.useme.architecture.model.usemearch.impl.MaintenanceServiceImpl
	 * @see fr.tpt.useme.architecture.model.usemearch.impl.UsemearchPackageImpl#getMaintenanceService()
	 * @generated
	 */
	int MAINTENANCE_SERVICE = 21;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINTENANCE_SERVICE__NAME = DescriptionPackage.IDENTIFIED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINTENANCE_SERVICE__LABEL = DescriptionPackage.IDENTIFIED_ELEMENT__LABEL;

	/**
	 * The number of structural features of the '<em>Maintenance Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINTENANCE_SERVICE_FEATURE_COUNT = DescriptionPackage.IDENTIFIED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.tpt.useme.architecture.model.usemearch.impl.EntityInstanceImpl <em>Entity Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.tpt.useme.architecture.model.usemearch.impl.EntityInstanceImpl
	 * @see fr.tpt.useme.architecture.model.usemearch.impl.UsemearchPackageImpl#getEntityInstance()
	 * @generated
	 */
	int ENTITY_INSTANCE = 22;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_INSTANCE__NAME = IDENTIFIED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_INSTANCE__ID = IDENTIFIED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_INSTANCE__DESCRIPTION = IDENTIFIED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Entity Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_INSTANCE__ENTITY_TYPE = IDENTIFIED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Entity Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_INSTANCE_FEATURE_COUNT = IDENTIFIED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link fr.tpt.useme.architecture.model.usemearch.impl.EntityInstancesConnectionImpl <em>Entity Instances Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.tpt.useme.architecture.model.usemearch.impl.EntityInstancesConnectionImpl
	 * @see fr.tpt.useme.architecture.model.usemearch.impl.UsemearchPackageImpl#getEntityInstancesConnection()
	 * @generated
	 */
	int ENTITY_INSTANCES_CONNECTION = 23;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_INSTANCES_CONNECTION__NAME = IDENTIFIED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_INSTANCES_CONNECTION__ID = IDENTIFIED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_INSTANCES_CONNECTION__DESCRIPTION = IDENTIFIED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Source Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_INSTANCES_CONNECTION__SOURCE_FEATURE = IDENTIFIED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Destination Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_INSTANCES_CONNECTION__DESTINATION_FEATURE = IDENTIFIED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Source Entity Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_INSTANCES_CONNECTION__SOURCE_ENTITY_INSTANCE = IDENTIFIED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Destination Entity Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_INSTANCES_CONNECTION__DESTINATION_ENTITY_INSTANCE = IDENTIFIED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Entity Instances Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_INSTANCES_CONNECTION_FEATURE_COUNT = IDENTIFIED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link fr.tpt.useme.architecture.model.usemearch.impl.PhysicalSystemImpl <em>Physical System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.tpt.useme.architecture.model.usemearch.impl.PhysicalSystemImpl
	 * @see fr.tpt.useme.architecture.model.usemearch.impl.UsemearchPackageImpl#getPhysicalSystem()
	 * @generated
	 */
	int PHYSICAL_SYSTEM = 24;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_SYSTEM__NAME = ENTITY_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_SYSTEM__ID = ENTITY_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_SYSTEM__DESCRIPTION = ENTITY_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_SYSTEM__CATEGORY = ENTITY_TYPE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Owned Interaction Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_SYSTEM__OWNED_INTERACTION_FEATURES = ENTITY_TYPE__OWNED_INTERACTION_FEATURES;

	/**
	 * The feature id for the '<em><b>Controlled By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_SYSTEM__CONTROLLED_BY = ENTITY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_SYSTEM__INPUTS = ENTITY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Visual</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_SYSTEM__VISUAL = ENTITY_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Physical System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_SYSTEM_FEATURE_COUNT = ENTITY_TYPE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link fr.tpt.useme.architecture.model.usemearch.impl.InteractionFeatureImpl <em>Interaction Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.tpt.useme.architecture.model.usemearch.impl.InteractionFeatureImpl
	 * @see fr.tpt.useme.architecture.model.usemearch.impl.UsemearchPackageImpl#getInteractionFeature()
	 * @generated
	 */
	int INTERACTION_FEATURE = 25;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FEATURE__NAME = IDENTIFIED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FEATURE__ID = IDENTIFIED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FEATURE__DESCRIPTION = IDENTIFIED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FEATURE__FEATURE = IDENTIFIED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Interaction Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FEATURE_FEATURE_COUNT = IDENTIFIED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link fr.tpt.useme.architecture.model.usemearch.impl.DisplayImpl <em>Display</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.tpt.useme.architecture.model.usemearch.impl.DisplayImpl
	 * @see fr.tpt.useme.architecture.model.usemearch.impl.UsemearchPackageImpl#getDisplay()
	 * @generated
	 */
	int DISPLAY = 26;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY__NAME = HARDWARE_TOOL__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY__ID = HARDWARE_TOOL__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY__DESCRIPTION = HARDWARE_TOOL__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY__CATEGORY = HARDWARE_TOOL__CATEGORY;

	/**
	 * The feature id for the '<em><b>Owned Interaction Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY__OWNED_INTERACTION_FEATURES = HARDWARE_TOOL__OWNED_INTERACTION_FEATURES;

	/**
	 * The feature id for the '<em><b>Used By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY__USED_BY = HARDWARE_TOOL__USED_BY;

	/**
	 * The feature id for the '<em><b>Controlled By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY__CONTROLLED_BY = HARDWARE_TOOL__CONTROLLED_BY;

	/**
	 * The feature id for the '<em><b>Controls</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY__CONTROLS = HARDWARE_TOOL__CONTROLS;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY__VERSION = HARDWARE_TOOL__VERSION;

	/**
	 * The feature id for the '<em><b>Resolution X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY__RESOLUTION_X = HARDWARE_TOOL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Resolution Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY__RESOLUTION_Y = HARDWARE_TOOL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Supported Colors</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY__SUPPORTED_COLORS = HARDWARE_TOOL_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Display</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_FEATURE_COUNT = HARDWARE_TOOL_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link fr.tpt.useme.architecture.model.usemearch.impl.MouseImpl <em>Mouse</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.tpt.useme.architecture.model.usemearch.impl.MouseImpl
	 * @see fr.tpt.useme.architecture.model.usemearch.impl.UsemearchPackageImpl#getMouse()
	 * @generated
	 */
	int MOUSE = 27;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOUSE__NAME = PHYSICAL_SYSTEM__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOUSE__ID = PHYSICAL_SYSTEM__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOUSE__DESCRIPTION = PHYSICAL_SYSTEM__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOUSE__CATEGORY = PHYSICAL_SYSTEM__CATEGORY;

	/**
	 * The feature id for the '<em><b>Owned Interaction Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOUSE__OWNED_INTERACTION_FEATURES = PHYSICAL_SYSTEM__OWNED_INTERACTION_FEATURES;

	/**
	 * The feature id for the '<em><b>Controlled By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOUSE__CONTROLLED_BY = PHYSICAL_SYSTEM__CONTROLLED_BY;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOUSE__INPUTS = PHYSICAL_SYSTEM__INPUTS;

	/**
	 * The feature id for the '<em><b>Visual</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOUSE__VISUAL = PHYSICAL_SYSTEM__VISUAL;

	/**
	 * The number of structural features of the '<em>Mouse</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOUSE_FEATURE_COUNT = PHYSICAL_SYSTEM_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.tpt.useme.architecture.model.usemearch.ColorScheme <em>Color Scheme</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.tpt.useme.architecture.model.usemearch.ColorScheme
	 * @see fr.tpt.useme.architecture.model.usemearch.impl.UsemearchPackageImpl#getColorScheme()
	 * @generated
	 */
	int COLOR_SCHEME = 29;

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
	 * Returns the meta object for the attribute '{@link fr.tpt.useme.architecture.model.usemearch.IdentifiedElement#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see fr.tpt.useme.architecture.model.usemearch.IdentifiedElement#getDescription()
	 * @see #getIdentifiedElement()
	 * @generated
	 */
	EAttribute getIdentifiedElement_Description();

	/**
	 * Returns the meta object for class '{@link fr.tpt.useme.architecture.model.usemearch.DsslSpecification <em>Dssl Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dssl Specification</em>'.
	 * @see fr.tpt.useme.architecture.model.usemearch.DsslSpecification
	 * @generated
	 */
	EClass getDsslSpecification();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.useme.architecture.model.usemearch.DsslSpecification#getDevelopedDsl <em>Developed Dsl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Developed Dsl</em>'.
	 * @see fr.tpt.useme.architecture.model.usemearch.DsslSpecification#getDevelopedDsl()
	 * @see #getDsslSpecification()
	 * @generated
	 */
	EReference getDsslSpecification_DevelopedDsl();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.tpt.useme.architecture.model.usemearch.DsslSpecification#getOwnedContexts <em>Owned Contexts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Contexts</em>'.
	 * @see fr.tpt.useme.architecture.model.usemearch.DsslSpecification#getOwnedContexts()
	 * @see #getDsslSpecification()
	 * @generated
	 */
	EReference getDsslSpecification_OwnedContexts();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.tpt.useme.architecture.model.usemearch.DsslSpecification#getOwnedEntityTypes <em>Owned Entity Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Entity Types</em>'.
	 * @see fr.tpt.useme.architecture.model.usemearch.DsslSpecification#getOwnedEntityTypes()
	 * @see #getDsslSpecification()
	 * @generated
	 */
	EReference getDsslSpecification_OwnedEntityTypes();

	/**
	 * Returns the meta object for class '{@link fr.tpt.useme.architecture.model.usemearch.EntityType <em>Entity Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity Type</em>'.
	 * @see fr.tpt.useme.architecture.model.usemearch.EntityType
	 * @generated
	 */
	EClass getEntityType();

	/**
	 * Returns the meta object for the reference list '{@link fr.tpt.useme.architecture.model.usemearch.EntityType#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Category</em>'.
	 * @see fr.tpt.useme.architecture.model.usemearch.EntityType#getCategory()
	 * @see #getEntityType()
	 * @generated
	 */
	EReference getEntityType_Category();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.tpt.useme.architecture.model.usemearch.EntityType#getOwnedInteractionFeatures <em>Owned Interaction Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Interaction Features</em>'.
	 * @see fr.tpt.useme.architecture.model.usemearch.EntityType#getOwnedInteractionFeatures()
	 * @see #getEntityType()
	 * @generated
	 */
	EReference getEntityType_OwnedInteractionFeatures();

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
	 * Returns the meta object for the containment reference list '{@link fr.tpt.useme.architecture.model.usemearch.ContextSpecification#getOwnedEntityInstances <em>Owned Entity Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Entity Instances</em>'.
	 * @see fr.tpt.useme.architecture.model.usemearch.ContextSpecification#getOwnedEntityInstances()
	 * @see #getContextSpecification()
	 * @generated
	 */
	EReference getContextSpecification_OwnedEntityInstances();

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
	 * Returns the meta object for the containment reference list '{@link fr.tpt.useme.architecture.model.usemearch.ContextSpecification#getOwnedConnections <em>Owned Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Connections</em>'.
	 * @see fr.tpt.useme.architecture.model.usemearch.ContextSpecification#getOwnedConnections()
	 * @see #getContextSpecification()
	 * @generated
	 */
	EReference getContextSpecification_OwnedConnections();

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
	 * Returns the meta object for the containment reference list '{@link fr.tpt.useme.architecture.model.usemearch.Dsl#getOwnedSemantics <em>Owned Semantics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Semantics</em>'.
	 * @see fr.tpt.useme.architecture.model.usemearch.Dsl#getOwnedSemantics()
	 * @see #getDsl()
	 * @generated
	 */
	EReference getDsl_OwnedSemantics();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.tpt.useme.architecture.model.usemearch.Dsl#getOwnedFeatureDiagrams <em>Owned Feature Diagrams</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Feature Diagrams</em>'.
	 * @see fr.tpt.useme.architecture.model.usemearch.Dsl#getOwnedFeatureDiagrams()
	 * @see #getDsl()
	 * @generated
	 */
	EReference getDsl_OwnedFeatureDiagrams();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.tpt.useme.architecture.model.usemearch.Dsl#getOwnedDocumentations <em>Owned Documentations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Documentations</em>'.
	 * @see fr.tpt.useme.architecture.model.usemearch.Dsl#getOwnedDocumentations()
	 * @see #getDsl()
	 * @generated
	 */
	EReference getDsl_OwnedDocumentations();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.useme.architecture.model.usemearch.Dsl#getMaintenanceService <em>Maintenance Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Maintenance Service</em>'.
	 * @see fr.tpt.useme.architecture.model.usemearch.Dsl#getMaintenanceService()
	 * @see #getDsl()
	 * @generated
	 */
	EReference getDsl_MaintenanceService();

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
	 * Returns the meta object for the reference list '{@link fr.tpt.useme.architecture.model.usemearch.Tool#getControlledBy <em>Controlled By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Controlled By</em>'.
	 * @see fr.tpt.useme.architecture.model.usemearch.Tool#getControlledBy()
	 * @see #getTool()
	 * @generated
	 */
	EReference getTool_ControlledBy();

	/**
	 * Returns the meta object for the reference list '{@link fr.tpt.useme.architecture.model.usemearch.Tool#getControls <em>Controls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Controls</em>'.
	 * @see fr.tpt.useme.architecture.model.usemearch.Tool#getControls()
	 * @see #getTool()
	 * @generated
	 */
	EReference getTool_Controls();

	/**
	 * Returns the meta object for the attribute '{@link fr.tpt.useme.architecture.model.usemearch.Tool#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see fr.tpt.useme.architecture.model.usemearch.Tool#getVersion()
	 * @see #getTool()
	 * @generated
	 */
	EAttribute getTool_Version();

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
	 * Returns the meta object for the attribute '{@link fr.tpt.useme.architecture.model.usemearch.User#getAgeMin <em>Age Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Age Min</em>'.
	 * @see fr.tpt.useme.architecture.model.usemearch.User#getAgeMin()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_AgeMin();

	/**
	 * Returns the meta object for the attribute '{@link fr.tpt.useme.architecture.model.usemearch.User#getAgeMax <em>Age Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Age Max</em>'.
	 * @see fr.tpt.useme.architecture.model.usemearch.User#getAgeMax()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_AgeMax();

	/**
	 * Returns the meta object for the reference list '{@link fr.tpt.useme.architecture.model.usemearch.User#getPerception <em>Perception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Perception</em>'.
	 * @see fr.tpt.useme.architecture.model.usemearch.User#getPerception()
	 * @see #getUser()
	 * @generated
	 */
	EReference getUser_Perception();

	/**
	 * Returns the meta object for the attribute list '{@link fr.tpt.useme.architecture.model.usemearch.User#getSpokenLanguages <em>Spoken Languages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Spoken Languages</em>'.
	 * @see fr.tpt.useme.architecture.model.usemearch.User#getSpokenLanguages()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_SpokenLanguages();

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
	 * Returns the meta object for the reference list '{@link fr.tpt.useme.architecture.model.usemearch.Computer#getExecutes <em>Executes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Executes</em>'.
	 * @see fr.tpt.useme.architecture.model.usemearch.Computer#getExecutes()
	 * @see #getComputer()
	 * @generated
	 */
	EReference getComputer_Executes();

	/**
	 * Returns the meta object for the reference list '{@link fr.tpt.useme.architecture.model.usemearch.Computer#getDisplays <em>Displays</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Displays</em>'.
	 * @see fr.tpt.useme.architecture.model.usemearch.Computer#getDisplays()
	 * @see #getComputer()
	 * @generated
	 */
	EReference getComputer_Displays();

	/**
	 * Returns the meta object for the reference list '{@link fr.tpt.useme.architecture.model.usemearch.Computer#getMouses <em>Mouses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Mouses</em>'.
	 * @see fr.tpt.useme.architecture.model.usemearch.Computer#getMouses()
	 * @see #getComputer()
	 * @generated
	 */
	EReference getComputer_Mouses();

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
	 * Returns the meta object for the reference list '{@link fr.tpt.useme.architecture.model.usemearch.SoftwareTool#getExecutedBy <em>Executed By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Executed By</em>'.
	 * @see fr.tpt.useme.architecture.model.usemearch.SoftwareTool#getExecutedBy()
	 * @see #getSoftwareTool()
	 * @generated
	 */
	EReference getSoftwareTool_ExecutedBy();

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
	 * Returns the meta object for class '{@link fr.tpt.useme.architecture.model.usemearch.Semantics <em>Semantics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Semantics</em>'.
	 * @see fr.tpt.useme.architecture.model.usemearch.Semantics
	 * @generated
	 */
	EClass getSemantics();

	/**
	 * Returns the meta object for class '{@link fr.tpt.useme.architecture.model.usemearch.FeatureDiagram <em>Feature Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Diagram</em>'.
	 * @see fr.tpt.useme.architecture.model.usemearch.FeatureDiagram
	 * @generated
	 */
	EClass getFeatureDiagram();

	/**
	 * Returns the meta object for class '{@link fr.tpt.useme.architecture.model.usemearch.ModelChecker <em>Model Checker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Checker</em>'.
	 * @see fr.tpt.useme.architecture.model.usemearch.ModelChecker
	 * @generated
	 */
	EClass getModelChecker();

	/**
	 * Returns the meta object for class '{@link fr.tpt.useme.architecture.model.usemearch.ModelSimulator <em>Model Simulator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Simulator</em>'.
	 * @see fr.tpt.useme.architecture.model.usemearch.ModelSimulator
	 * @generated
	 */
	EClass getModelSimulator();

	/**
	 * Returns the meta object for class '{@link fr.tpt.useme.architecture.model.usemearch.Documentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Documentation</em>'.
	 * @see fr.tpt.useme.architecture.model.usemearch.Documentation
	 * @generated
	 */
	EClass getDocumentation();

	/**
	 * Returns the meta object for class '{@link fr.tpt.useme.architecture.model.usemearch.MaintenanceService <em>Maintenance Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Maintenance Service</em>'.
	 * @see fr.tpt.useme.architecture.model.usemearch.MaintenanceService
	 * @generated
	 */
	EClass getMaintenanceService();

	/**
	 * Returns the meta object for class '{@link fr.tpt.useme.architecture.model.usemearch.EntityInstance <em>Entity Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity Instance</em>'.
	 * @see fr.tpt.useme.architecture.model.usemearch.EntityInstance
	 * @generated
	 */
	EClass getEntityInstance();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.useme.architecture.model.usemearch.EntityInstance#getEntityType <em>Entity Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Entity Type</em>'.
	 * @see fr.tpt.useme.architecture.model.usemearch.EntityInstance#getEntityType()
	 * @see #getEntityInstance()
	 * @generated
	 */
	EReference getEntityInstance_EntityType();

	/**
	 * Returns the meta object for class '{@link fr.tpt.useme.architecture.model.usemearch.EntityInstancesConnection <em>Entity Instances Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity Instances Connection</em>'.
	 * @see fr.tpt.useme.architecture.model.usemearch.EntityInstancesConnection
	 * @generated
	 */
	EClass getEntityInstancesConnection();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.useme.architecture.model.usemearch.EntityInstancesConnection#getSourceFeature <em>Source Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source Feature</em>'.
	 * @see fr.tpt.useme.architecture.model.usemearch.EntityInstancesConnection#getSourceFeature()
	 * @see #getEntityInstancesConnection()
	 * @generated
	 */
	EReference getEntityInstancesConnection_SourceFeature();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.useme.architecture.model.usemearch.EntityInstancesConnection#getDestinationFeature <em>Destination Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Destination Feature</em>'.
	 * @see fr.tpt.useme.architecture.model.usemearch.EntityInstancesConnection#getDestinationFeature()
	 * @see #getEntityInstancesConnection()
	 * @generated
	 */
	EReference getEntityInstancesConnection_DestinationFeature();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.useme.architecture.model.usemearch.EntityInstancesConnection#getSourceEntityInstance <em>Source Entity Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source Entity Instance</em>'.
	 * @see fr.tpt.useme.architecture.model.usemearch.EntityInstancesConnection#getSourceEntityInstance()
	 * @see #getEntityInstancesConnection()
	 * @generated
	 */
	EReference getEntityInstancesConnection_SourceEntityInstance();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.useme.architecture.model.usemearch.EntityInstancesConnection#getDestinationEntityInstance <em>Destination Entity Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Destination Entity Instance</em>'.
	 * @see fr.tpt.useme.architecture.model.usemearch.EntityInstancesConnection#getDestinationEntityInstance()
	 * @see #getEntityInstancesConnection()
	 * @generated
	 */
	EReference getEntityInstancesConnection_DestinationEntityInstance();

	/**
	 * Returns the meta object for class '{@link fr.tpt.useme.architecture.model.usemearch.PhysicalSystem <em>Physical System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Physical System</em>'.
	 * @see fr.tpt.useme.architecture.model.usemearch.PhysicalSystem
	 * @generated
	 */
	EClass getPhysicalSystem();

	/**
	 * Returns the meta object for the reference list '{@link fr.tpt.useme.architecture.model.usemearch.PhysicalSystem#getControlledBy <em>Controlled By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Controlled By</em>'.
	 * @see fr.tpt.useme.architecture.model.usemearch.PhysicalSystem#getControlledBy()
	 * @see #getPhysicalSystem()
	 * @generated
	 */
	EReference getPhysicalSystem_ControlledBy();

	/**
	 * Returns the meta object for the reference list '{@link fr.tpt.useme.architecture.model.usemearch.PhysicalSystem#getInputs <em>Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Inputs</em>'.
	 * @see fr.tpt.useme.architecture.model.usemearch.PhysicalSystem#getInputs()
	 * @see #getPhysicalSystem()
	 * @generated
	 */
	EReference getPhysicalSystem_Inputs();

	/**
	 * Returns the meta object for the reference list '{@link fr.tpt.useme.architecture.model.usemearch.PhysicalSystem#getVisual <em>Visual</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Visual</em>'.
	 * @see fr.tpt.useme.architecture.model.usemearch.PhysicalSystem#getVisual()
	 * @see #getPhysicalSystem()
	 * @generated
	 */
	EReference getPhysicalSystem_Visual();

	/**
	 * Returns the meta object for class '{@link fr.tpt.useme.architecture.model.usemearch.InteractionFeature <em>Interaction Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interaction Feature</em>'.
	 * @see fr.tpt.useme.architecture.model.usemearch.InteractionFeature
	 * @generated
	 */
	EClass getInteractionFeature();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.useme.architecture.model.usemearch.InteractionFeature#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Feature</em>'.
	 * @see fr.tpt.useme.architecture.model.usemearch.InteractionFeature#getFeature()
	 * @see #getInteractionFeature()
	 * @generated
	 */
	EReference getInteractionFeature_Feature();

	/**
	 * Returns the meta object for class '{@link fr.tpt.useme.architecture.model.usemearch.Display <em>Display</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Display</em>'.
	 * @see fr.tpt.useme.architecture.model.usemearch.Display
	 * @generated
	 */
	EClass getDisplay();

	/**
	 * Returns the meta object for the attribute '{@link fr.tpt.useme.architecture.model.usemearch.Display#getResolutionX <em>Resolution X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resolution X</em>'.
	 * @see fr.tpt.useme.architecture.model.usemearch.Display#getResolutionX()
	 * @see #getDisplay()
	 * @generated
	 */
	EAttribute getDisplay_ResolutionX();

	/**
	 * Returns the meta object for the attribute '{@link fr.tpt.useme.architecture.model.usemearch.Display#getResolutionY <em>Resolution Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resolution Y</em>'.
	 * @see fr.tpt.useme.architecture.model.usemearch.Display#getResolutionY()
	 * @see #getDisplay()
	 * @generated
	 */
	EAttribute getDisplay_ResolutionY();

	/**
	 * Returns the meta object for the attribute list '{@link fr.tpt.useme.architecture.model.usemearch.Display#getSupportedColors <em>Supported Colors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Supported Colors</em>'.
	 * @see fr.tpt.useme.architecture.model.usemearch.Display#getSupportedColors()
	 * @see #getDisplay()
	 * @generated
	 */
	EAttribute getDisplay_SupportedColors();

	/**
	 * Returns the meta object for class '{@link fr.tpt.useme.architecture.model.usemearch.Mouse <em>Mouse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mouse</em>'.
	 * @see fr.tpt.useme.architecture.model.usemearch.Mouse
	 * @generated
	 */
	EClass getMouse();

	/**
	 * Returns the meta object for class '{@link fr.tpt.useme.architecture.model.usemearch.HardwareTool <em>Hardware Tool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hardware Tool</em>'.
	 * @see fr.tpt.useme.architecture.model.usemearch.HardwareTool
	 * @generated
	 */
	EClass getHardwareTool();

	/**
	 * Returns the meta object for enum '{@link fr.tpt.useme.architecture.model.usemearch.ColorScheme <em>Color Scheme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Color Scheme</em>'.
	 * @see fr.tpt.useme.architecture.model.usemearch.ColorScheme
	 * @generated
	 */
	EEnum getColorScheme();

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
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDENTIFIED_ELEMENT__DESCRIPTION = eINSTANCE.getIdentifiedElement_Description();

		/**
		 * The meta object literal for the '{@link fr.tpt.useme.architecture.model.usemearch.impl.DsslSpecificationImpl <em>Dssl Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.tpt.useme.architecture.model.usemearch.impl.DsslSpecificationImpl
		 * @see fr.tpt.useme.architecture.model.usemearch.impl.UsemearchPackageImpl#getDsslSpecification()
		 * @generated
		 */
		EClass DSSL_SPECIFICATION = eINSTANCE.getDsslSpecification();

		/**
		 * The meta object literal for the '<em><b>Developed Dsl</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DSSL_SPECIFICATION__DEVELOPED_DSL = eINSTANCE.getDsslSpecification_DevelopedDsl();

		/**
		 * The meta object literal for the '<em><b>Owned Contexts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DSSL_SPECIFICATION__OWNED_CONTEXTS = eINSTANCE.getDsslSpecification_OwnedContexts();

		/**
		 * The meta object literal for the '<em><b>Owned Entity Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DSSL_SPECIFICATION__OWNED_ENTITY_TYPES = eINSTANCE.getDsslSpecification_OwnedEntityTypes();

		/**
		 * The meta object literal for the '{@link fr.tpt.useme.architecture.model.usemearch.impl.EntityTypeImpl <em>Entity Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.tpt.useme.architecture.model.usemearch.impl.EntityTypeImpl
		 * @see fr.tpt.useme.architecture.model.usemearch.impl.UsemearchPackageImpl#getEntityType()
		 * @generated
		 */
		EClass ENTITY_TYPE = eINSTANCE.getEntityType();

		/**
		 * The meta object literal for the '<em><b>Category</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_TYPE__CATEGORY = eINSTANCE.getEntityType_Category();

		/**
		 * The meta object literal for the '<em><b>Owned Interaction Features</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_TYPE__OWNED_INTERACTION_FEATURES = eINSTANCE.getEntityType_OwnedInteractionFeatures();

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
		 * The meta object literal for the '<em><b>Owned Entity Instances</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT_SPECIFICATION__OWNED_ENTITY_INSTANCES = eINSTANCE.getContextSpecification_OwnedEntityInstances();

		/**
		 * The meta object literal for the '<em><b>Developed Dsl</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT_SPECIFICATION__DEVELOPED_DSL = eINSTANCE.getContextSpecification_DevelopedDsl();

		/**
		 * The meta object literal for the '<em><b>Owned Connections</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT_SPECIFICATION__OWNED_CONNECTIONS = eINSTANCE.getContextSpecification_OwnedConnections();

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
		 * The meta object literal for the '<em><b>Owned Semantics</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DSL__OWNED_SEMANTICS = eINSTANCE.getDsl_OwnedSemantics();

		/**
		 * The meta object literal for the '<em><b>Owned Feature Diagrams</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DSL__OWNED_FEATURE_DIAGRAMS = eINSTANCE.getDsl_OwnedFeatureDiagrams();

		/**
		 * The meta object literal for the '<em><b>Owned Documentations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DSL__OWNED_DOCUMENTATIONS = eINSTANCE.getDsl_OwnedDocumentations();

		/**
		 * The meta object literal for the '<em><b>Maintenance Service</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DSL__MAINTENANCE_SERVICE = eINSTANCE.getDsl_MaintenanceService();

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
		 * The meta object literal for the '<em><b>Controlled By</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOOL__CONTROLLED_BY = eINSTANCE.getTool_ControlledBy();

		/**
		 * The meta object literal for the '<em><b>Controls</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOOL__CONTROLS = eINSTANCE.getTool_Controls();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOOL__VERSION = eINSTANCE.getTool_Version();

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
		 * The meta object literal for the '<em><b>Age Min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__AGE_MIN = eINSTANCE.getUser_AgeMin();

		/**
		 * The meta object literal for the '<em><b>Age Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__AGE_MAX = eINSTANCE.getUser_AgeMax();

		/**
		 * The meta object literal for the '<em><b>Perception</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER__PERCEPTION = eINSTANCE.getUser_Perception();

		/**
		 * The meta object literal for the '<em><b>Spoken Languages</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__SPOKEN_LANGUAGES = eINSTANCE.getUser_SpokenLanguages();

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
		 * The meta object literal for the '<em><b>Executes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPUTER__EXECUTES = eINSTANCE.getComputer_Executes();

		/**
		 * The meta object literal for the '<em><b>Displays</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPUTER__DISPLAYS = eINSTANCE.getComputer_Displays();

		/**
		 * The meta object literal for the '<em><b>Mouses</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPUTER__MOUSES = eINSTANCE.getComputer_Mouses();

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
		 * The meta object literal for the '<em><b>Executed By</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOFTWARE_TOOL__EXECUTED_BY = eINSTANCE.getSoftwareTool_ExecutedBy();

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
		 * The meta object literal for the '{@link fr.tpt.useme.architecture.model.usemearch.impl.SemanticsImpl <em>Semantics</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.tpt.useme.architecture.model.usemearch.impl.SemanticsImpl
		 * @see fr.tpt.useme.architecture.model.usemearch.impl.UsemearchPackageImpl#getSemantics()
		 * @generated
		 */
		EClass SEMANTICS = eINSTANCE.getSemantics();

		/**
		 * The meta object literal for the '{@link fr.tpt.useme.architecture.model.usemearch.impl.FeatureDiagramImpl <em>Feature Diagram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.tpt.useme.architecture.model.usemearch.impl.FeatureDiagramImpl
		 * @see fr.tpt.useme.architecture.model.usemearch.impl.UsemearchPackageImpl#getFeatureDiagram()
		 * @generated
		 */
		EClass FEATURE_DIAGRAM = eINSTANCE.getFeatureDiagram();

		/**
		 * The meta object literal for the '{@link fr.tpt.useme.architecture.model.usemearch.impl.ModelCheckerImpl <em>Model Checker</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.tpt.useme.architecture.model.usemearch.impl.ModelCheckerImpl
		 * @see fr.tpt.useme.architecture.model.usemearch.impl.UsemearchPackageImpl#getModelChecker()
		 * @generated
		 */
		EClass MODEL_CHECKER = eINSTANCE.getModelChecker();

		/**
		 * The meta object literal for the '{@link fr.tpt.useme.architecture.model.usemearch.impl.ModelSimulatorImpl <em>Model Simulator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.tpt.useme.architecture.model.usemearch.impl.ModelSimulatorImpl
		 * @see fr.tpt.useme.architecture.model.usemearch.impl.UsemearchPackageImpl#getModelSimulator()
		 * @generated
		 */
		EClass MODEL_SIMULATOR = eINSTANCE.getModelSimulator();

		/**
		 * The meta object literal for the '{@link fr.tpt.useme.architecture.model.usemearch.Documentation <em>Documentation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.tpt.useme.architecture.model.usemearch.Documentation
		 * @see fr.tpt.useme.architecture.model.usemearch.impl.UsemearchPackageImpl#getDocumentation()
		 * @generated
		 */
		EClass DOCUMENTATION = eINSTANCE.getDocumentation();

		/**
		 * The meta object literal for the '{@link fr.tpt.useme.architecture.model.usemearch.impl.MaintenanceServiceImpl <em>Maintenance Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.tpt.useme.architecture.model.usemearch.impl.MaintenanceServiceImpl
		 * @see fr.tpt.useme.architecture.model.usemearch.impl.UsemearchPackageImpl#getMaintenanceService()
		 * @generated
		 */
		EClass MAINTENANCE_SERVICE = eINSTANCE.getMaintenanceService();

		/**
		 * The meta object literal for the '{@link fr.tpt.useme.architecture.model.usemearch.impl.EntityInstanceImpl <em>Entity Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.tpt.useme.architecture.model.usemearch.impl.EntityInstanceImpl
		 * @see fr.tpt.useme.architecture.model.usemearch.impl.UsemearchPackageImpl#getEntityInstance()
		 * @generated
		 */
		EClass ENTITY_INSTANCE = eINSTANCE.getEntityInstance();

		/**
		 * The meta object literal for the '<em><b>Entity Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_INSTANCE__ENTITY_TYPE = eINSTANCE.getEntityInstance_EntityType();

		/**
		 * The meta object literal for the '{@link fr.tpt.useme.architecture.model.usemearch.impl.EntityInstancesConnectionImpl <em>Entity Instances Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.tpt.useme.architecture.model.usemearch.impl.EntityInstancesConnectionImpl
		 * @see fr.tpt.useme.architecture.model.usemearch.impl.UsemearchPackageImpl#getEntityInstancesConnection()
		 * @generated
		 */
		EClass ENTITY_INSTANCES_CONNECTION = eINSTANCE.getEntityInstancesConnection();

		/**
		 * The meta object literal for the '<em><b>Source Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_INSTANCES_CONNECTION__SOURCE_FEATURE = eINSTANCE.getEntityInstancesConnection_SourceFeature();

		/**
		 * The meta object literal for the '<em><b>Destination Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_INSTANCES_CONNECTION__DESTINATION_FEATURE = eINSTANCE.getEntityInstancesConnection_DestinationFeature();

		/**
		 * The meta object literal for the '<em><b>Source Entity Instance</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_INSTANCES_CONNECTION__SOURCE_ENTITY_INSTANCE = eINSTANCE.getEntityInstancesConnection_SourceEntityInstance();

		/**
		 * The meta object literal for the '<em><b>Destination Entity Instance</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_INSTANCES_CONNECTION__DESTINATION_ENTITY_INSTANCE = eINSTANCE.getEntityInstancesConnection_DestinationEntityInstance();

		/**
		 * The meta object literal for the '{@link fr.tpt.useme.architecture.model.usemearch.impl.PhysicalSystemImpl <em>Physical System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.tpt.useme.architecture.model.usemearch.impl.PhysicalSystemImpl
		 * @see fr.tpt.useme.architecture.model.usemearch.impl.UsemearchPackageImpl#getPhysicalSystem()
		 * @generated
		 */
		EClass PHYSICAL_SYSTEM = eINSTANCE.getPhysicalSystem();

		/**
		 * The meta object literal for the '<em><b>Controlled By</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHYSICAL_SYSTEM__CONTROLLED_BY = eINSTANCE.getPhysicalSystem_ControlledBy();

		/**
		 * The meta object literal for the '<em><b>Inputs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHYSICAL_SYSTEM__INPUTS = eINSTANCE.getPhysicalSystem_Inputs();

		/**
		 * The meta object literal for the '<em><b>Visual</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHYSICAL_SYSTEM__VISUAL = eINSTANCE.getPhysicalSystem_Visual();

		/**
		 * The meta object literal for the '{@link fr.tpt.useme.architecture.model.usemearch.impl.InteractionFeatureImpl <em>Interaction Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.tpt.useme.architecture.model.usemearch.impl.InteractionFeatureImpl
		 * @see fr.tpt.useme.architecture.model.usemearch.impl.UsemearchPackageImpl#getInteractionFeature()
		 * @generated
		 */
		EClass INTERACTION_FEATURE = eINSTANCE.getInteractionFeature();

		/**
		 * The meta object literal for the '<em><b>Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERACTION_FEATURE__FEATURE = eINSTANCE.getInteractionFeature_Feature();

		/**
		 * The meta object literal for the '{@link fr.tpt.useme.architecture.model.usemearch.impl.DisplayImpl <em>Display</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.tpt.useme.architecture.model.usemearch.impl.DisplayImpl
		 * @see fr.tpt.useme.architecture.model.usemearch.impl.UsemearchPackageImpl#getDisplay()
		 * @generated
		 */
		EClass DISPLAY = eINSTANCE.getDisplay();

		/**
		 * The meta object literal for the '<em><b>Resolution X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISPLAY__RESOLUTION_X = eINSTANCE.getDisplay_ResolutionX();

		/**
		 * The meta object literal for the '<em><b>Resolution Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISPLAY__RESOLUTION_Y = eINSTANCE.getDisplay_ResolutionY();

		/**
		 * The meta object literal for the '<em><b>Supported Colors</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISPLAY__SUPPORTED_COLORS = eINSTANCE.getDisplay_SupportedColors();

		/**
		 * The meta object literal for the '{@link fr.tpt.useme.architecture.model.usemearch.impl.MouseImpl <em>Mouse</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.tpt.useme.architecture.model.usemearch.impl.MouseImpl
		 * @see fr.tpt.useme.architecture.model.usemearch.impl.UsemearchPackageImpl#getMouse()
		 * @generated
		 */
		EClass MOUSE = eINSTANCE.getMouse();

		/**
		 * The meta object literal for the '{@link fr.tpt.useme.architecture.model.usemearch.impl.HardwareToolImpl <em>Hardware Tool</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.tpt.useme.architecture.model.usemearch.impl.HardwareToolImpl
		 * @see fr.tpt.useme.architecture.model.usemearch.impl.UsemearchPackageImpl#getHardwareTool()
		 * @generated
		 */
		EClass HARDWARE_TOOL = eINSTANCE.getHardwareTool();

		/**
		 * The meta object literal for the '{@link fr.tpt.useme.architecture.model.usemearch.ColorScheme <em>Color Scheme</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.tpt.useme.architecture.model.usemearch.ColorScheme
		 * @see fr.tpt.useme.architecture.model.usemearch.impl.UsemearchPackageImpl#getColorScheme()
		 * @generated
		 */
		EEnum COLOR_SCHEME = eINSTANCE.getColorScheme();

	}

} //UsemearchPackage
