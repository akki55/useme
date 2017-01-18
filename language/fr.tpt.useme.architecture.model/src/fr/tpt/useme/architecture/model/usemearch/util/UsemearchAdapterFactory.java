/**
 */
package fr.tpt.useme.architecture.model.usemearch.util;

import fr.tpt.useme.architecture.model.usemearch.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see fr.tpt.useme.architecture.model.usemearch.UsemearchPackage
 * @generated
 */
public class UsemearchAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static UsemearchPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UsemearchAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = UsemearchPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UsemearchSwitch<Adapter> modelSwitch =
		new UsemearchSwitch<Adapter>() {
			@Override
			public Adapter caseIdentifiedElement(IdentifiedElement object) {
				return createIdentifiedElementAdapter();
			}
			@Override
			public Adapter caseEnvironmentSpecification(EnvironmentSpecification object) {
				return createEnvironmentSpecificationAdapter();
			}
			@Override
			public Adapter caseEnvironmentalElement(EnvironmentalElement object) {
				return createEnvironmentalElementAdapter();
			}
			@Override
			public Adapter caseContextSpecification(ContextSpecification object) {
				return createContextSpecificationAdapter();
			}
			@Override
			public Adapter caseDsl(Dsl object) {
				return createDslAdapter();
			}
			@Override
			public Adapter caseSyntax(Syntax object) {
				return createSyntaxAdapter();
			}
			@Override
			public Adapter caseAbstractSyntax(AbstractSyntax object) {
				return createAbstractSyntaxAdapter();
			}
			@Override
			public Adapter caseConcreteSyntax(ConcreteSyntax object) {
				return createConcreteSyntaxAdapter();
			}
			@Override
			public Adapter caseECoreAbstractSyntax(ECoreAbstractSyntax object) {
				return createECoreAbstractSyntaxAdapter();
			}
			@Override
			public Adapter caseSiriusConcreteSyntax(SiriusConcreteSyntax object) {
				return createSiriusConcreteSyntaxAdapter();
			}
			@Override
			public Adapter caseTool(Tool object) {
				return createToolAdapter();
			}
			@Override
			public Adapter caseUser(User object) {
				return createUserAdapter();
			}
			@Override
			public Adapter caseWorkPlace(WorkPlace object) {
				return createWorkPlaceAdapter();
			}
			@Override
			public Adapter caseComputer(Computer object) {
				return createComputerAdapter();
			}
			@Override
			public Adapter caseSoftwareTool(SoftwareTool object) {
				return createSoftwareToolAdapter();
			}
			@Override
			public Adapter caseOperatingSystem(OperatingSystem object) {
				return createOperatingSystemAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link fr.tpt.useme.architecture.model.usemearch.IdentifiedElement <em>Identified Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.tpt.useme.architecture.model.usemearch.IdentifiedElement
	 * @generated
	 */
	public Adapter createIdentifiedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.tpt.useme.architecture.model.usemearch.EnvironmentSpecification <em>Environment Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.tpt.useme.architecture.model.usemearch.EnvironmentSpecification
	 * @generated
	 */
	public Adapter createEnvironmentSpecificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.tpt.useme.architecture.model.usemearch.EnvironmentalElement <em>Environmental Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.tpt.useme.architecture.model.usemearch.EnvironmentalElement
	 * @generated
	 */
	public Adapter createEnvironmentalElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.tpt.useme.architecture.model.usemearch.ContextSpecification <em>Context Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.tpt.useme.architecture.model.usemearch.ContextSpecification
	 * @generated
	 */
	public Adapter createContextSpecificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.tpt.useme.architecture.model.usemearch.Dsl <em>Dsl</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.tpt.useme.architecture.model.usemearch.Dsl
	 * @generated
	 */
	public Adapter createDslAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.tpt.useme.architecture.model.usemearch.Syntax <em>Syntax</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.tpt.useme.architecture.model.usemearch.Syntax
	 * @generated
	 */
	public Adapter createSyntaxAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.tpt.useme.architecture.model.usemearch.AbstractSyntax <em>Abstract Syntax</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.tpt.useme.architecture.model.usemearch.AbstractSyntax
	 * @generated
	 */
	public Adapter createAbstractSyntaxAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.tpt.useme.architecture.model.usemearch.ConcreteSyntax <em>Concrete Syntax</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.tpt.useme.architecture.model.usemearch.ConcreteSyntax
	 * @generated
	 */
	public Adapter createConcreteSyntaxAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.tpt.useme.architecture.model.usemearch.ECoreAbstractSyntax <em>ECore Abstract Syntax</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.tpt.useme.architecture.model.usemearch.ECoreAbstractSyntax
	 * @generated
	 */
	public Adapter createECoreAbstractSyntaxAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.tpt.useme.architecture.model.usemearch.SiriusConcreteSyntax <em>Sirius Concrete Syntax</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.tpt.useme.architecture.model.usemearch.SiriusConcreteSyntax
	 * @generated
	 */
	public Adapter createSiriusConcreteSyntaxAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.tpt.useme.architecture.model.usemearch.Tool <em>Tool</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.tpt.useme.architecture.model.usemearch.Tool
	 * @generated
	 */
	public Adapter createToolAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.tpt.useme.architecture.model.usemearch.User <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.tpt.useme.architecture.model.usemearch.User
	 * @generated
	 */
	public Adapter createUserAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.tpt.useme.architecture.model.usemearch.WorkPlace <em>Work Place</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.tpt.useme.architecture.model.usemearch.WorkPlace
	 * @generated
	 */
	public Adapter createWorkPlaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.tpt.useme.architecture.model.usemearch.Computer <em>Computer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.tpt.useme.architecture.model.usemearch.Computer
	 * @generated
	 */
	public Adapter createComputerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.tpt.useme.architecture.model.usemearch.SoftwareTool <em>Software Tool</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.tpt.useme.architecture.model.usemearch.SoftwareTool
	 * @generated
	 */
	public Adapter createSoftwareToolAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.tpt.useme.architecture.model.usemearch.OperatingSystem <em>Operating System</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.tpt.useme.architecture.model.usemearch.OperatingSystem
	 * @generated
	 */
	public Adapter createOperatingSystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //UsemearchAdapterFactory
