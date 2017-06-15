/**
 */
package fr.tpt.useme.architecture.model.usemearch.impl;

import fr.tpt.useme.architecture.model.usemearch.AbstractSyntax;
import fr.tpt.useme.architecture.model.usemearch.ConcreteSyntax;
import fr.tpt.useme.architecture.model.usemearch.Documentation;
import fr.tpt.useme.architecture.model.usemearch.Dsl;
import fr.tpt.useme.architecture.model.usemearch.FeatureDiagram;
import fr.tpt.useme.architecture.model.usemearch.MaintenanceService;
import fr.tpt.useme.architecture.model.usemearch.Semantics;
import fr.tpt.useme.architecture.model.usemearch.SoftwareTool;
import fr.tpt.useme.architecture.model.usemearch.Syntax;
import fr.tpt.useme.architecture.model.usemearch.UsemearchPackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreEList;
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
 *   <li>{@link fr.tpt.useme.architecture.model.usemearch.impl.DslImpl#getOwnedSemantics <em>Owned Semantics</em>}</li>
 *   <li>{@link fr.tpt.useme.architecture.model.usemearch.impl.DslImpl#getOwnedFeatureDiagrams <em>Owned Feature Diagrams</em>}</li>
 *   <li>{@link fr.tpt.useme.architecture.model.usemearch.impl.DslImpl#getOwnedDocumentations <em>Owned Documentations</em>}</li>
 *   <li>{@link fr.tpt.useme.architecture.model.usemearch.impl.DslImpl#getMaintenanceService <em>Maintenance Service</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DslImpl extends EntityTypeImpl implements Dsl {
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
	 * The cached value of the '{@link #getOwnedSemantics() <em>Owned Semantics</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedSemantics()
	 * @generated
	 * @ordered
	 */
	protected EList<Semantics> ownedSemantics;

	/**
	 * The cached value of the '{@link #getOwnedFeatureDiagrams() <em>Owned Feature Diagrams</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedFeatureDiagrams()
	 * @generated
	 * @ordered
	 */
	protected EList<FeatureDiagram> ownedFeatureDiagrams;

	/**
	 * The cached value of the '{@link #getOwnedDocumentations() <em>Owned Documentations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedDocumentations()
	 * @generated
	 * @ordered
	 */
	protected EList<Documentation> ownedDocumentations;

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
	 * @generated NOT
	 */
	public EList<ConcreteSyntax> getConcreteSyntaxes() {
		final List<ConcreteSyntax> concreteSyntaxes = new ArrayList<>();
		
		for ( final Syntax syntax : getOwnedSyntaxes() ) {
			if ( syntax instanceof ConcreteSyntax ) {
				concreteSyntaxes.add( (ConcreteSyntax) syntax );
			}
		}
		
		return new EcoreEList.UnmodifiableEList<ConcreteSyntax>( 	this,
																	UsemearchPackage.Literals.DSL__CONCRETE_SYNTAXES,
																	concreteSyntaxes.size(),
																	concreteSyntaxes.toArray() );
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
	 * @generated NOT
	 */
	public AbstractSyntax basicGetAbstractsyntax() {
		for ( final Syntax syntax : getOwnedSyntaxes() ) {
			if ( syntax instanceof AbstractSyntax ) {
				return (AbstractSyntax) syntax;
			}
		}
		
		return null;
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
	public EList<Semantics> getOwnedSemantics() {
		if (ownedSemantics == null) {
			ownedSemantics = new EObjectContainmentEList<Semantics>(Semantics.class, this, UsemearchPackage.DSL__OWNED_SEMANTICS);
		}
		return ownedSemantics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FeatureDiagram> getOwnedFeatureDiagrams() {
		if (ownedFeatureDiagrams == null) {
			ownedFeatureDiagrams = new EObjectContainmentEList<FeatureDiagram>(FeatureDiagram.class, this, UsemearchPackage.DSL__OWNED_FEATURE_DIAGRAMS);
		}
		return ownedFeatureDiagrams;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Documentation> getOwnedDocumentations() {
		if (ownedDocumentations == null) {
			ownedDocumentations = new EObjectContainmentEList<Documentation>(Documentation.class, this, UsemearchPackage.DSL__OWNED_DOCUMENTATIONS);
		}
		return ownedDocumentations;
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
			case UsemearchPackage.DSL__OWNED_SEMANTICS:
				return ((InternalEList<?>)getOwnedSemantics()).basicRemove(otherEnd, msgs);
			case UsemearchPackage.DSL__OWNED_FEATURE_DIAGRAMS:
				return ((InternalEList<?>)getOwnedFeatureDiagrams()).basicRemove(otherEnd, msgs);
			case UsemearchPackage.DSL__OWNED_DOCUMENTATIONS:
				return ((InternalEList<?>)getOwnedDocumentations()).basicRemove(otherEnd, msgs);
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
			case UsemearchPackage.DSL__OWNED_SEMANTICS:
				return getOwnedSemantics();
			case UsemearchPackage.DSL__OWNED_FEATURE_DIAGRAMS:
				return getOwnedFeatureDiagrams();
			case UsemearchPackage.DSL__OWNED_DOCUMENTATIONS:
				return getOwnedDocumentations();
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
			case UsemearchPackage.DSL__OWNED_SEMANTICS:
				getOwnedSemantics().clear();
				getOwnedSemantics().addAll((Collection<? extends Semantics>)newValue);
				return;
			case UsemearchPackage.DSL__OWNED_FEATURE_DIAGRAMS:
				getOwnedFeatureDiagrams().clear();
				getOwnedFeatureDiagrams().addAll((Collection<? extends FeatureDiagram>)newValue);
				return;
			case UsemearchPackage.DSL__OWNED_DOCUMENTATIONS:
				getOwnedDocumentations().clear();
				getOwnedDocumentations().addAll((Collection<? extends Documentation>)newValue);
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
			case UsemearchPackage.DSL__OWNED_SEMANTICS:
				getOwnedSemantics().clear();
				return;
			case UsemearchPackage.DSL__OWNED_FEATURE_DIAGRAMS:
				getOwnedFeatureDiagrams().clear();
				return;
			case UsemearchPackage.DSL__OWNED_DOCUMENTATIONS:
				getOwnedDocumentations().clear();
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
			case UsemearchPackage.DSL__OWNED_SEMANTICS:
				return ownedSemantics != null && !ownedSemantics.isEmpty();
			case UsemearchPackage.DSL__OWNED_FEATURE_DIAGRAMS:
				return ownedFeatureDiagrams != null && !ownedFeatureDiagrams.isEmpty();
			case UsemearchPackage.DSL__OWNED_DOCUMENTATIONS:
				return ownedDocumentations != null && !ownedDocumentations.isEmpty();
			case UsemearchPackage.DSL__MAINTENANCE_SERVICE:
				return maintenanceService != null;
		}
		return super.eIsSet(featureID);
	}

} //DslImpl
