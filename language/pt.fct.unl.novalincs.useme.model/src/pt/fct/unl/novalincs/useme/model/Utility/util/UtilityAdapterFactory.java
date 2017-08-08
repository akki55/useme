/**
 */
package pt.fct.unl.novalincs.useme.model.Utility.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import pt.fct.unl.novalincs.useme.model.Utility.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see pt.fct.unl.novalincs.useme.model.Utility.UtilityPackage
 * @generated
 */
public class UtilityAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static UtilityPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UtilityAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = UtilityPackage.eINSTANCE;
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
	protected UtilitySwitch<Adapter> modelSwitch =
		new UtilitySwitch<Adapter>() {
			@Override
			public Adapter caseUtilitySpecification(UtilitySpecification object) {
				return createUtilitySpecificationAdapter();
			}
			@Override
			public Adapter caseSurveyEngine(SurveyEngine object) {
				return createSurveyEngineAdapter();
			}
			@Override
			public Adapter caseDSL(DSL object) {
				return createDSLAdapter();
			}
			@Override
			public Adapter caseProcessModel(ProcessModel object) {
				return createProcessModelAdapter();
			}
			@Override
			public Adapter caseFunctionalGoal(FunctionalGoal object) {
				return createFunctionalGoalAdapter();
			}
			@Override
			public Adapter caseExistingGM(ExistingGM object) {
				return createExistingGMAdapter();
			}
			@Override
			public Adapter caseCEVariable(CEVariable object) {
				return createCEVariableAdapter();
			}
			@Override
			public Adapter caseProfileTemplate(ProfileTemplate object) {
				return createProfileTemplateAdapter();
			}
			@Override
			public Adapter caseLogicalExpression(LogicalExpression object) {
				return createLogicalExpressionAdapter();
			}
			@Override
			public Adapter caseConcreteSyntax(ConcreteSyntax object) {
				return createConcreteSyntaxAdapter();
			}
			@Override
			public Adapter caseAbstractSyntax(AbstractSyntax object) {
				return createAbstractSyntaxAdapter();
			}
			@Override
			public Adapter caseOutsideRef(OutsideRef object) {
				return createOutsideRefAdapter();
			}
			@Override
			public Adapter caseRequirement(Requirement object) {
				return createRequirementAdapter();
			}
			@Override
			public Adapter caseDocumentation(Documentation object) {
				return createDocumentationAdapter();
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
	 * Creates a new adapter for an object of class '{@link pt.fct.unl.novalincs.useme.model.Utility.UtilitySpecification <em>Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pt.fct.unl.novalincs.useme.model.Utility.UtilitySpecification
	 * @generated
	 */
	public Adapter createUtilitySpecificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pt.fct.unl.novalincs.useme.model.Utility.SurveyEngine <em>Survey Engine</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pt.fct.unl.novalincs.useme.model.Utility.SurveyEngine
	 * @generated
	 */
	public Adapter createSurveyEngineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pt.fct.unl.novalincs.useme.model.Utility.DSL <em>DSL</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pt.fct.unl.novalincs.useme.model.Utility.DSL
	 * @generated
	 */
	public Adapter createDSLAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pt.fct.unl.novalincs.useme.model.Utility.ProcessModel <em>Process Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pt.fct.unl.novalincs.useme.model.Utility.ProcessModel
	 * @generated
	 */
	public Adapter createProcessModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pt.fct.unl.novalincs.useme.model.Utility.FunctionalGoal <em>Functional Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pt.fct.unl.novalincs.useme.model.Utility.FunctionalGoal
	 * @generated
	 */
	public Adapter createFunctionalGoalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pt.fct.unl.novalincs.useme.model.Utility.ExistingGM <em>Existing GM</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pt.fct.unl.novalincs.useme.model.Utility.ExistingGM
	 * @generated
	 */
	public Adapter createExistingGMAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pt.fct.unl.novalincs.useme.model.Utility.CEVariable <em>CE Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pt.fct.unl.novalincs.useme.model.Utility.CEVariable
	 * @generated
	 */
	public Adapter createCEVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pt.fct.unl.novalincs.useme.model.Utility.ProfileTemplate <em>Profile Template</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pt.fct.unl.novalincs.useme.model.Utility.ProfileTemplate
	 * @generated
	 */
	public Adapter createProfileTemplateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pt.fct.unl.novalincs.useme.model.Utility.LogicalExpression <em>Logical Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pt.fct.unl.novalincs.useme.model.Utility.LogicalExpression
	 * @generated
	 */
	public Adapter createLogicalExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pt.fct.unl.novalincs.useme.model.Utility.ConcreteSyntax <em>Concrete Syntax</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pt.fct.unl.novalincs.useme.model.Utility.ConcreteSyntax
	 * @generated
	 */
	public Adapter createConcreteSyntaxAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pt.fct.unl.novalincs.useme.model.Utility.AbstractSyntax <em>Abstract Syntax</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pt.fct.unl.novalincs.useme.model.Utility.AbstractSyntax
	 * @generated
	 */
	public Adapter createAbstractSyntaxAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pt.fct.unl.novalincs.useme.model.Utility.OutsideRef <em>Outside Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pt.fct.unl.novalincs.useme.model.Utility.OutsideRef
	 * @generated
	 */
	public Adapter createOutsideRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pt.fct.unl.novalincs.useme.model.Utility.Requirement <em>Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pt.fct.unl.novalincs.useme.model.Utility.Requirement
	 * @generated
	 */
	public Adapter createRequirementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pt.fct.unl.novalincs.useme.model.Utility.Documentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pt.fct.unl.novalincs.useme.model.Utility.Documentation
	 * @generated
	 */
	public Adapter createDocumentationAdapter() {
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

} //UtilityAdapterFactory
