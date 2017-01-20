/**
 */
package fr.tpt.useme.architecture.model.usemearch.impl;

import fr.tpt.useme.architecture.model.usemearch.AbstractSyntax;
import fr.tpt.useme.architecture.model.usemearch.ConcreteSyntax;
import fr.tpt.useme.architecture.model.usemearch.Documentation;
import fr.tpt.useme.architecture.model.usemearch.DomainConcept;
import fr.tpt.useme.architecture.model.usemearch.Dsl;
import fr.tpt.useme.architecture.model.usemearch.FeatureDiagram;
import fr.tpt.useme.architecture.model.usemearch.MaintenanceService;
import fr.tpt.useme.architecture.model.usemearch.ModelChecker;
import fr.tpt.useme.architecture.model.usemearch.ModelSimulator;
import fr.tpt.useme.architecture.model.usemearch.Semantic;
import fr.tpt.useme.architecture.model.usemearch.SoftwareTool;
import fr.tpt.useme.architecture.model.usemearch.Syntax;
import fr.tpt.useme.architecture.model.usemearch.UsemearchPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dsl</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.tpt.useme.architecture.model.usemearch.impl.DslImpl#getOwnedSyntaxes <em>Owned Syntaxes</em>}</li>
 *   <li>{@link fr.tpt.useme.architecture.model.usemearch.impl.DslImpl#getConcreteSyntaxes <em>Concrete Syntaxes</em>}</li>
 *   <li>{@link fr.tpt.useme.architecture.model.usemearch.impl.DslImpl#getAbstractsyntax <em>Abstractsyntax</em>}</li>
 *   <li>{@link fr.tpt.useme.architecture.model.usemearch.impl.DslImpl#getSupportingTools <em>Supporting Tools</em>}</li>
 *   <li>{@link fr.tpt.useme.architecture.model.usemearch.impl.DslImpl#getSemantics <em>Semantics</em>}</li>
 *   <li>{@link fr.tpt.useme.architecture.model.usemearch.impl.DslImpl#getDomainConcepts <em>Domain Concepts</em>}</li>
 *   <li>{@link fr.tpt.useme.architecture.model.usemearch.impl.DslImpl#getFeatureDiagrams <em>Feature Diagrams</em>}</li>
 *   <li>{@link fr.tpt.useme.architecture.model.usemearch.impl.DslImpl#getModelCheckers <em>Model Checkers</em>}</li>
 *   <li>{@link fr.tpt.useme.architecture.model.usemearch.impl.DslImpl#getModelSimulators <em>Model Simulators</em>}</li>
 *   <li>{@link fr.tpt.useme.architecture.model.usemearch.impl.DslImpl#getDocumentations <em>Documentations</em>}</li>
 *   <li>{@link fr.tpt.useme.architecture.model.usemearch.impl.DslImpl#getMaintenanceService <em>Maintenance Service</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DslImpl extends ContextElementTypeImpl implements Dsl {
	/**
	 * The cached value of the '{@link #getOwnedSyntaxes() <em>Owned Syntaxes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedSyntaxes()
	 * @generated
	 * @ordered
	 */
	protected EList<Syntax> ownedSyntaxes;

	/**
	 * The cached value of the '{@link #getSupportingTools() <em>Supporting Tools</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportingTools()
	 * @generated
	 * @ordered
	 */
	protected EList<SoftwareTool> supportingTools;

	/**
	 * The cached value of the '{@link #getSemantics() <em>Semantics</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemantics()
	 * @generated
	 * @ordered
	 */
	protected EList<Semantic> semantics;

	/**
	 * The cached value of the '{@link #getDomainConcepts() <em>Domain Concepts</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainConcepts()
	 * @generated
	 * @ordered
	 */
	protected EList<DomainConcept> domainConcepts;

	/**
	 * The cached value of the '{@link #getFeatureDiagrams() <em>Feature Diagrams</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureDiagrams()
	 * @generated
	 * @ordered
	 */
	protected EList<FeatureDiagram> featureDiagrams;

	/**
	 * The cached value of the '{@link #getModelCheckers() <em>Model Checkers</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelCheckers()
	 * @generated
	 * @ordered
	 */
	protected EList<ModelChecker> modelCheckers;

	/**
	 * The cached value of the '{@link #getModelSimulators() <em>Model Simulators</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelSimulators()
	 * @generated
	 * @ordered
	 */
	protected EList<ModelSimulator> modelSimulators;

	/**
	 * The cached value of the '{@link #getDocumentations() <em>Documentations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentations()
	 * @generated
	 * @ordered
	 */
	protected EList<Documentation> documentations;

	/**
	 * The cached value of the '{@link #getMaintenanceService() <em>Maintenance Service</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaintenanceService()
	 * @generated
	 * @ordered
	 */
	protected MaintenanceService maintenanceService;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DslImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UsemearchPackage.Literals.DSL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Syntax> getOwnedSyntaxes() {
		if (ownedSyntaxes == null) {
			ownedSyntaxes = new EObjectContainmentEList<Syntax>(Syntax.class, this, UsemearchPackage.DSL__OWNED_SYNTAXES);
		}
		return ownedSyntaxes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConcreteSyntax> getConcreteSyntaxes() {
		// TODO: implement this method to return the 'Concrete Syntaxes' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		// The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting
		// so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.EcoreEList should be used.
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractSyntax getAbstractsyntax() {
		AbstractSyntax abstractsyntax = basicGetAbstractsyntax();
		return abstractsyntax != null && abstractsyntax.eIsProxy() ? (AbstractSyntax)eResolveProxy((InternalEObject)abstractsyntax) : abstractsyntax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractSyntax basicGetAbstractsyntax() {
		// TODO: implement this method to return the 'Abstractsyntax' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SoftwareTool> getSupportingTools() {
		if (supportingTools == null) {
			supportingTools = new EObjectWithInverseResolvingEList.ManyInverse<SoftwareTool>(SoftwareTool.class, this, UsemearchPackage.DSL__SUPPORTING_TOOLS, UsemearchPackage.SOFTWARE_TOOL__SUPPORTED_LANGUAGES);
		}
		return supportingTools;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Semantic> getSemantics() {
		if (semantics == null) {
			semantics = new EObjectResolvingEList<Semantic>(Semantic.class, this, UsemearchPackage.DSL__SEMANTICS);
		}
		return semantics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DomainConcept> getDomainConcepts() {
		if (domainConcepts == null) {
			domainConcepts = new EObjectResolvingEList<DomainConcept>(DomainConcept.class, this, UsemearchPackage.DSL__DOMAIN_CONCEPTS);
		}
		return domainConcepts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FeatureDiagram> getFeatureDiagrams() {
		if (featureDiagrams == null) {
			featureDiagrams = new EObjectResolvingEList<FeatureDiagram>(FeatureDiagram.class, this, UsemearchPackage.DSL__FEATURE_DIAGRAMS);
		}
		return featureDiagrams;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModelChecker> getModelCheckers() {
		if (modelCheckers == null) {
			modelCheckers = new EObjectResolvingEList<ModelChecker>(ModelChecker.class, this, UsemearchPackage.DSL__MODEL_CHECKERS);
		}
		return modelCheckers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModelSimulator> getModelSimulators() {
		if (modelSimulators == null) {
			modelSimulators = new EObjectResolvingEList<ModelSimulator>(ModelSimulator.class, this, UsemearchPackage.DSL__MODEL_SIMULATORS);
		}
		return modelSimulators;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Documentation> getDocumentations() {
		if (documentations == null) {
			documentations = new EObjectResolvingEList<Documentation>(Documentation.class, this, UsemearchPackage.DSL__DOCUMENTATIONS);
		}
		return documentations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MaintenanceService getMaintenanceService() {
		if (maintenanceService != null && maintenanceService.eIsProxy()) {
			InternalEObject oldMaintenanceService = (InternalEObject)maintenanceService;
			maintenanceService = (MaintenanceService)eResolveProxy(oldMaintenanceService);
			if (maintenanceService != oldMaintenanceService) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UsemearchPackage.DSL__MAINTENANCE_SERVICE, oldMaintenanceService, maintenanceService));
			}
		}
		return maintenanceService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MaintenanceService basicGetMaintenanceService() {
		return maintenanceService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaintenanceService(MaintenanceService newMaintenanceService) {
		MaintenanceService oldMaintenanceService = maintenanceService;
		maintenanceService = newMaintenanceService;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UsemearchPackage.DSL__MAINTENANCE_SERVICE, oldMaintenanceService, maintenanceService));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UsemearchPackage.DSL__SUPPORTING_TOOLS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSupportingTools()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UsemearchPackage.DSL__OWNED_SYNTAXES:
				return ((InternalEList<?>)getOwnedSyntaxes()).basicRemove(otherEnd, msgs);
			case UsemearchPackage.DSL__SUPPORTING_TOOLS:
				return ((InternalEList<?>)getSupportingTools()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UsemearchPackage.DSL__OWNED_SYNTAXES:
				return getOwnedSyntaxes();
			case UsemearchPackage.DSL__CONCRETE_SYNTAXES:
				return getConcreteSyntaxes();
			case UsemearchPackage.DSL__ABSTRACTSYNTAX:
				if (resolve) return getAbstractsyntax();
				return basicGetAbstractsyntax();
			case UsemearchPackage.DSL__SUPPORTING_TOOLS:
				return getSupportingTools();
			case UsemearchPackage.DSL__SEMANTICS:
				return getSemantics();
			case UsemearchPackage.DSL__DOMAIN_CONCEPTS:
				return getDomainConcepts();
			case UsemearchPackage.DSL__FEATURE_DIAGRAMS:
				return getFeatureDiagrams();
			case UsemearchPackage.DSL__MODEL_CHECKERS:
				return getModelCheckers();
			case UsemearchPackage.DSL__MODEL_SIMULATORS:
				return getModelSimulators();
			case UsemearchPackage.DSL__DOCUMENTATIONS:
				return getDocumentations();
			case UsemearchPackage.DSL__MAINTENANCE_SERVICE:
				if (resolve) return getMaintenanceService();
				return basicGetMaintenanceService();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case UsemearchPackage.DSL__OWNED_SYNTAXES:
				getOwnedSyntaxes().clear();
				getOwnedSyntaxes().addAll((Collection<? extends Syntax>)newValue);
				return;
			case UsemearchPackage.DSL__SUPPORTING_TOOLS:
				getSupportingTools().clear();
				getSupportingTools().addAll((Collection<? extends SoftwareTool>)newValue);
				return;
			case UsemearchPackage.DSL__SEMANTICS:
				getSemantics().clear();
				getSemantics().addAll((Collection<? extends Semantic>)newValue);
				return;
			case UsemearchPackage.DSL__DOMAIN_CONCEPTS:
				getDomainConcepts().clear();
				getDomainConcepts().addAll((Collection<? extends DomainConcept>)newValue);
				return;
			case UsemearchPackage.DSL__FEATURE_DIAGRAMS:
				getFeatureDiagrams().clear();
				getFeatureDiagrams().addAll((Collection<? extends FeatureDiagram>)newValue);
				return;
			case UsemearchPackage.DSL__MODEL_CHECKERS:
				getModelCheckers().clear();
				getModelCheckers().addAll((Collection<? extends ModelChecker>)newValue);
				return;
			case UsemearchPackage.DSL__MODEL_SIMULATORS:
				getModelSimulators().clear();
				getModelSimulators().addAll((Collection<? extends ModelSimulator>)newValue);
				return;
			case UsemearchPackage.DSL__DOCUMENTATIONS:
				getDocumentations().clear();
				getDocumentations().addAll((Collection<? extends Documentation>)newValue);
				return;
			case UsemearchPackage.DSL__MAINTENANCE_SERVICE:
				setMaintenanceService((MaintenanceService)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case UsemearchPackage.DSL__OWNED_SYNTAXES:
				getOwnedSyntaxes().clear();
				return;
			case UsemearchPackage.DSL__SUPPORTING_TOOLS:
				getSupportingTools().clear();
				return;
			case UsemearchPackage.DSL__SEMANTICS:
				getSemantics().clear();
				return;
			case UsemearchPackage.DSL__DOMAIN_CONCEPTS:
				getDomainConcepts().clear();
				return;
			case UsemearchPackage.DSL__FEATURE_DIAGRAMS:
				getFeatureDiagrams().clear();
				return;
			case UsemearchPackage.DSL__MODEL_CHECKERS:
				getModelCheckers().clear();
				return;
			case UsemearchPackage.DSL__MODEL_SIMULATORS:
				getModelSimulators().clear();
				return;
			case UsemearchPackage.DSL__DOCUMENTATIONS:
				getDocumentations().clear();
				return;
			case UsemearchPackage.DSL__MAINTENANCE_SERVICE:
				setMaintenanceService((MaintenanceService)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case UsemearchPackage.DSL__OWNED_SYNTAXES:
				return ownedSyntaxes != null && !ownedSyntaxes.isEmpty();
			case UsemearchPackage.DSL__CONCRETE_SYNTAXES:
				return !getConcreteSyntaxes().isEmpty();
			case UsemearchPackage.DSL__ABSTRACTSYNTAX:
				return basicGetAbstractsyntax() != null;
			case UsemearchPackage.DSL__SUPPORTING_TOOLS:
				return supportingTools != null && !supportingTools.isEmpty();
			case UsemearchPackage.DSL__SEMANTICS:
				return semantics != null && !semantics.isEmpty();
			case UsemearchPackage.DSL__DOMAIN_CONCEPTS:
				return domainConcepts != null && !domainConcepts.isEmpty();
			case UsemearchPackage.DSL__FEATURE_DIAGRAMS:
				return featureDiagrams != null && !featureDiagrams.isEmpty();
			case UsemearchPackage.DSL__MODEL_CHECKERS:
				return modelCheckers != null && !modelCheckers.isEmpty();
			case UsemearchPackage.DSL__MODEL_SIMULATORS:
				return modelSimulators != null && !modelSimulators.isEmpty();
			case UsemearchPackage.DSL__DOCUMENTATIONS:
				return documentations != null && !documentations.isEmpty();
			case UsemearchPackage.DSL__MAINTENANCE_SERVICE:
				return maintenanceService != null;
		}
		return super.eIsSet(featureID);
	}

} //DslImpl
