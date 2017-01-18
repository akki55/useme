/**
 */
package fr.tpt.rdalte.useme.architecture.model.usemearch.impl;

import fr.tpt.rdalte.useme.architecture.model.usemearch.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UsemearchFactoryImpl extends EFactoryImpl implements UsemearchFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static UsemearchFactory init() {
		try {
			UsemearchFactory theUsemearchFactory = (UsemearchFactory)EPackage.Registry.INSTANCE.getEFactory(UsemearchPackage.eNS_URI);
			if (theUsemearchFactory != null) {
				return theUsemearchFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new UsemearchFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UsemearchFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case UsemearchPackage.DSL_SPECIFICATION: return createDslSpecification();
			case UsemearchPackage.DSL: return createDsl();
			case UsemearchPackage.ECORE_ABSTRACT_SYNTAX: return createECoreAbstractSyntax();
			case UsemearchPackage.SIRIUS_CONCRETE_SYNTAX: return createSiriusConcreteSyntax();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DslSpecification createDslSpecification() {
		DslSpecificationImpl dslSpecification = new DslSpecificationImpl();
		return dslSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dsl createDsl() {
		DslImpl dsl = new DslImpl();
		return dsl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ECoreAbstractSyntax createECoreAbstractSyntax() {
		ECoreAbstractSyntaxImpl eCoreAbstractSyntax = new ECoreAbstractSyntaxImpl();
		return eCoreAbstractSyntax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SiriusConcreteSyntax createSiriusConcreteSyntax() {
		SiriusConcreteSyntaxImpl siriusConcreteSyntax = new SiriusConcreteSyntaxImpl();
		return siriusConcreteSyntax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UsemearchPackage getUsemearchPackage() {
		return (UsemearchPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static UsemearchPackage getPackage() {
		return UsemearchPackage.eINSTANCE;
	}

} //UsemearchFactoryImpl
