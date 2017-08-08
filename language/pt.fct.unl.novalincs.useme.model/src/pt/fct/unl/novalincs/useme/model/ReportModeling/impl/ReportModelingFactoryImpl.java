/**
 */
package pt.fct.unl.novalincs.useme.model.ReportModeling.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import pt.fct.unl.novalincs.useme.model.ReportModeling.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ReportModelingFactoryImpl extends EFactoryImpl implements ReportModelingFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ReportModelingFactory init() {
		try {
			ReportModelingFactory theReportModelingFactory = (ReportModelingFactory)EPackage.Registry.INSTANCE.getEFactory(ReportModelingPackage.eNS_URI);
			if (theReportModelingFactory != null) {
				return theReportModelingFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ReportModelingFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReportModelingFactoryImpl() {
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
			case ReportModelingPackage.REPORT_SPECIFICATION: return createReportSpecification();
			case ReportModelingPackage.REPORT_MODEL: return createReportModel();
			case ReportModelingPackage.EVALUATION_RESULT_ABSTRACT: return createEvaluationResultAbstract();
			case ReportModelingPackage.RECOMMEND_GM: return createRecommendGM();
			case ReportModelingPackage.RESULT_VALUE: return createResultValue();
			case ReportModelingPackage.EVALUATION_RESULT: return createEvaluationResult();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReportSpecification createReportSpecification() {
		ReportSpecificationImpl reportSpecification = new ReportSpecificationImpl();
		return reportSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReportModel createReportModel() {
		ReportModelImpl reportModel = new ReportModelImpl();
		return reportModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvaluationResultAbstract createEvaluationResultAbstract() {
		EvaluationResultAbstractImpl evaluationResultAbstract = new EvaluationResultAbstractImpl();
		return evaluationResultAbstract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RecommendGM createRecommendGM() {
		RecommendGMImpl recommendGM = new RecommendGMImpl();
		return recommendGM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResultValue createResultValue() {
		ResultValueImpl resultValue = new ResultValueImpl();
		return resultValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvaluationResult createEvaluationResult() {
		EvaluationResultImpl evaluationResult = new EvaluationResultImpl();
		return evaluationResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReportModelingPackage getReportModelingPackage() {
		return (ReportModelingPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ReportModelingPackage getPackage() {
		return ReportModelingPackage.eINSTANCE;
	}

} //ReportModelingFactoryImpl
