/**
 */
package fr.tpt.useme.architecture.model.usemearch.impl;

import fr.labsticc.framework.constraints.model.constraints.ConstraintsPackage;

import fr.tpt.useme.architecture.model.usemearch.AbstractSyntax;
import fr.tpt.useme.architecture.model.usemearch.Computer;
import fr.tpt.useme.architecture.model.usemearch.ConcreteSyntax;
import fr.tpt.useme.architecture.model.usemearch.ContextSpecification;
import fr.tpt.useme.architecture.model.usemearch.Dsl;
import fr.tpt.useme.architecture.model.usemearch.ECoreAbstractSyntax;
import fr.tpt.useme.architecture.model.usemearch.EnvironmentSpecification;
import fr.tpt.useme.architecture.model.usemearch.EnvironmentType;
import fr.tpt.useme.architecture.model.usemearch.EnvironmentalElement;
import fr.tpt.useme.architecture.model.usemearch.IdentifiedElement;
import fr.tpt.useme.architecture.model.usemearch.OperatingSystem;
import fr.tpt.useme.architecture.model.usemearch.SiriusConcreteSyntax;
import fr.tpt.useme.architecture.model.usemearch.SoftwareTool;
import fr.tpt.useme.architecture.model.usemearch.Syntax;
import fr.tpt.useme.architecture.model.usemearch.Tool;
import fr.tpt.useme.architecture.model.usemearch.UsemearchFactory;
import fr.tpt.useme.architecture.model.usemearch.UsemearchPackage;
import fr.tpt.useme.architecture.model.usemearch.User;
import fr.tpt.useme.architecture.model.usemearch.WorkPlace;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.sirius.viewpoint.ViewpointPackage;

import org.eclipse.sirius.viewpoint.description.DescriptionPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UsemearchPackageImpl extends EPackageImpl implements UsemearchPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass identifiedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass environmentSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass environmentalElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contextSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dslEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass syntaxEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractSyntaxEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass concreteSyntaxEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eCoreAbstractSyntaxEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass siriusConcreteSyntaxEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass toolEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workPlaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass computerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass softwareToolEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operatingSystemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum environmentTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see fr.tpt.useme.architecture.model.usemearch.UsemearchPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private UsemearchPackageImpl() {
		super(eNS_URI, UsemearchFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link UsemearchPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static UsemearchPackage init() {
		if (isInited) return (UsemearchPackage)EPackage.Registry.INSTANCE.getEPackage(UsemearchPackage.eNS_URI);

		// Obtain or create and register package
		UsemearchPackageImpl theUsemearchPackage = (UsemearchPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof UsemearchPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new UsemearchPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ConstraintsPackage.eINSTANCE.eClass();
		ViewpointPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theUsemearchPackage.createPackageContents();

		// Initialize created meta-data
		theUsemearchPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theUsemearchPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(UsemearchPackage.eNS_URI, theUsemearchPackage);
		return theUsemearchPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIdentifiedElement() {
		return identifiedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIdentifiedElement_Name() {
		return (EAttribute)identifiedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIdentifiedElement_Id() {
		return (EAttribute)identifiedElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnvironmentSpecification() {
		return environmentSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnvironmentSpecification_OwnedDsls() {
		return (EReference)environmentSpecificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnvironmentSpecification_OwnedTools() {
		return (EReference)environmentSpecificationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnvironmentalElement() {
		return environmentalElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnvironmentalElement_EnvitonmentType() {
		return (EAttribute)environmentalElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContextSpecification() {
		return contextSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContextSpecification_DevelopedDsl() {
		return (EReference)contextSpecificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContextSpecification_EnvironmentalElements() {
		return (EReference)contextSpecificationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDsl() {
		return dslEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDsl_OwnedSyntaxes() {
		return (EReference)dslEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDsl_ConcreteSyntaxes() {
		return (EReference)dslEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDsl_Abstractsyntax() {
		return (EReference)dslEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDsl_SupportingTools() {
		return (EReference)dslEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSyntax() {
		return syntaxEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractSyntax() {
		return abstractSyntaxEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConcreteSyntax() {
		return concreteSyntaxEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConcreteSyntax_Language() {
		return (EReference)concreteSyntaxEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getECoreAbstractSyntax() {
		return eCoreAbstractSyntaxEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getECoreAbstractSyntax_Packages() {
		return (EReference)eCoreAbstractSyntaxEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSiriusConcreteSyntax() {
		return siriusConcreteSyntaxEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSiriusConcreteSyntax_SiriusSpecification() {
		return (EReference)siriusConcreteSyntaxEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTool() {
		return toolEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTool_UsedBy() {
		return (EReference)toolEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUser() {
		return userEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUser_Uses() {
		return (EReference)userEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWorkPlace() {
		return workPlaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComputer() {
		return computerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSoftwareTool() {
		return softwareToolEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSoftwareTool_SupportedLanguages() {
		return (EReference)softwareToolEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperatingSystem() {
		return operatingSystemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEnvironmentType() {
		return environmentTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UsemearchFactory getUsemearchFactory() {
		return (UsemearchFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		identifiedElementEClass = createEClass(IDENTIFIED_ELEMENT);
		createEAttribute(identifiedElementEClass, IDENTIFIED_ELEMENT__NAME);
		createEAttribute(identifiedElementEClass, IDENTIFIED_ELEMENT__ID);

		environmentSpecificationEClass = createEClass(ENVIRONMENT_SPECIFICATION);
		createEReference(environmentSpecificationEClass, ENVIRONMENT_SPECIFICATION__OWNED_DSLS);
		createEReference(environmentSpecificationEClass, ENVIRONMENT_SPECIFICATION__OWNED_TOOLS);

		environmentalElementEClass = createEClass(ENVIRONMENTAL_ELEMENT);
		createEAttribute(environmentalElementEClass, ENVIRONMENTAL_ELEMENT__ENVITONMENT_TYPE);

		contextSpecificationEClass = createEClass(CONTEXT_SPECIFICATION);
		createEReference(contextSpecificationEClass, CONTEXT_SPECIFICATION__DEVELOPED_DSL);
		createEReference(contextSpecificationEClass, CONTEXT_SPECIFICATION__ENVIRONMENTAL_ELEMENTS);

		dslEClass = createEClass(DSL);
		createEReference(dslEClass, DSL__OWNED_SYNTAXES);
		createEReference(dslEClass, DSL__CONCRETE_SYNTAXES);
		createEReference(dslEClass, DSL__ABSTRACTSYNTAX);
		createEReference(dslEClass, DSL__SUPPORTING_TOOLS);

		syntaxEClass = createEClass(SYNTAX);

		abstractSyntaxEClass = createEClass(ABSTRACT_SYNTAX);

		concreteSyntaxEClass = createEClass(CONCRETE_SYNTAX);
		createEReference(concreteSyntaxEClass, CONCRETE_SYNTAX__LANGUAGE);

		eCoreAbstractSyntaxEClass = createEClass(ECORE_ABSTRACT_SYNTAX);
		createEReference(eCoreAbstractSyntaxEClass, ECORE_ABSTRACT_SYNTAX__PACKAGES);

		siriusConcreteSyntaxEClass = createEClass(SIRIUS_CONCRETE_SYNTAX);
		createEReference(siriusConcreteSyntaxEClass, SIRIUS_CONCRETE_SYNTAX__SIRIUS_SPECIFICATION);

		toolEClass = createEClass(TOOL);
		createEReference(toolEClass, TOOL__USED_BY);

		userEClass = createEClass(USER);
		createEReference(userEClass, USER__USES);

		workPlaceEClass = createEClass(WORK_PLACE);

		computerEClass = createEClass(COMPUTER);

		softwareToolEClass = createEClass(SOFTWARE_TOOL);
		createEReference(softwareToolEClass, SOFTWARE_TOOL__SUPPORTED_LANGUAGES);

		operatingSystemEClass = createEClass(OPERATING_SYSTEM);

		// Create enums
		environmentTypeEEnum = createEEnum(ENVIRONMENT_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		ConstraintsPackage theConstraintsPackage = (ConstraintsPackage)EPackage.Registry.INSTANCE.getEPackage(ConstraintsPackage.eNS_URI);
		DescriptionPackage theDescriptionPackage = (DescriptionPackage)EPackage.Registry.INSTANCE.getEPackage(DescriptionPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		environmentSpecificationEClass.getESuperTypes().add(this.getIdentifiedElement());
		environmentalElementEClass.getESuperTypes().add(this.getIdentifiedElement());
		contextSpecificationEClass.getESuperTypes().add(this.getIdentifiedElement());
		dslEClass.getESuperTypes().add(this.getEnvironmentalElement());
		syntaxEClass.getESuperTypes().add(this.getIdentifiedElement());
		abstractSyntaxEClass.getESuperTypes().add(this.getSyntax());
		concreteSyntaxEClass.getESuperTypes().add(this.getSyntax());
		eCoreAbstractSyntaxEClass.getESuperTypes().add(this.getAbstractSyntax());
		siriusConcreteSyntaxEClass.getESuperTypes().add(this.getConcreteSyntax());
		toolEClass.getESuperTypes().add(this.getEnvironmentalElement());
		userEClass.getESuperTypes().add(this.getEnvironmentalElement());
		workPlaceEClass.getESuperTypes().add(this.getEnvironmentalElement());
		computerEClass.getESuperTypes().add(this.getTool());
		softwareToolEClass.getESuperTypes().add(this.getTool());
		operatingSystemEClass.getESuperTypes().add(this.getSoftwareTool());

		// Initialize classes, features, and operations; add parameters
		initEClass(identifiedElementEClass, IdentifiedElement.class, "IdentifiedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIdentifiedElement_Name(), ecorePackage.getEString(), "name", null, 1, 1, IdentifiedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIdentifiedElement_Id(), ecorePackage.getEString(), "id", null, 1, 1, IdentifiedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(environmentSpecificationEClass, EnvironmentSpecification.class, "EnvironmentSpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEnvironmentSpecification_OwnedDsls(), this.getDsl(), null, "ownedDsls", null, 1, -1, EnvironmentSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEnvironmentSpecification_OwnedTools(), this.getDsl(), null, "ownedTools", null, 1, -1, EnvironmentSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(environmentalElementEClass, EnvironmentalElement.class, "EnvironmentalElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEnvironmentalElement_EnvitonmentType(), this.getEnvironmentType(), "envitonmentType", null, 0, 1, EnvironmentalElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(contextSpecificationEClass, ContextSpecification.class, "ContextSpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContextSpecification_DevelopedDsl(), this.getDsl(), null, "developedDsl", null, 1, 1, ContextSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContextSpecification_EnvironmentalElements(), this.getEnvironmentalElement(), null, "environmentalElements", null, 1, -1, ContextSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dslEClass, Dsl.class, "Dsl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDsl_OwnedSyntaxes(), this.getSyntax(), null, "ownedSyntaxes", null, 2, -1, Dsl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDsl_ConcreteSyntaxes(), this.getConcreteSyntax(), null, "concreteSyntaxes", null, 1, -1, Dsl.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDsl_Abstractsyntax(), this.getAbstractSyntax(), null, "abstractsyntax", null, 1, 1, Dsl.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDsl_SupportingTools(), this.getSoftwareTool(), this.getSoftwareTool_SupportedLanguages(), "supportingTools", null, 0, -1, Dsl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(syntaxEClass, Syntax.class, "Syntax", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(abstractSyntaxEClass, AbstractSyntax.class, "AbstractSyntax", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(concreteSyntaxEClass, ConcreteSyntax.class, "ConcreteSyntax", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConcreteSyntax_Language(), theConstraintsPackage.getNaturalConstraintLanguage(), null, "language", null, 0, 1, ConcreteSyntax.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eCoreAbstractSyntaxEClass, ECoreAbstractSyntax.class, "ECoreAbstractSyntax", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getECoreAbstractSyntax_Packages(), ecorePackage.getEPackage(), null, "packages", null, 1, -1, ECoreAbstractSyntax.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(siriusConcreteSyntaxEClass, SiriusConcreteSyntax.class, "SiriusConcreteSyntax", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSiriusConcreteSyntax_SiriusSpecification(), theDescriptionPackage.getGroup(), null, "siriusSpecification", null, 1, -1, SiriusConcreteSyntax.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(toolEClass, Tool.class, "Tool", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTool_UsedBy(), this.getUser(), null, "usedBy", null, 1, -1, Tool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(userEClass, User.class, "User", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUser_Uses(), this.getTool(), null, "uses", null, 1, -1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(workPlaceEClass, WorkPlace.class, "WorkPlace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(computerEClass, Computer.class, "Computer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(softwareToolEClass, SoftwareTool.class, "SoftwareTool", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSoftwareTool_SupportedLanguages(), this.getDsl(), this.getDsl_SupportingTools(), "supportedLanguages", null, 1, -1, SoftwareTool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(operatingSystemEClass, OperatingSystem.class, "OperatingSystem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(environmentTypeEEnum, EnvironmentType.class, "EnvironmentType");
		addEEnumLiteral(environmentTypeEEnum, EnvironmentType.TECHNICAL);
		addEEnumLiteral(environmentTypeEEnum, EnvironmentType.PHYSICAL);
		addEEnumLiteral(environmentTypeEEnum, EnvironmentType.SOCIAL);

		// Create resource
		createResource(eNS_URI);
	}

} //UsemearchPackageImpl
