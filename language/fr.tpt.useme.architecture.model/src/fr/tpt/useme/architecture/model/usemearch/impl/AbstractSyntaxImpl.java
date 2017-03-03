/**
 */
package fr.tpt.useme.architecture.model.usemearch.impl;

import fr.tpt.useme.architecture.model.usemearch.AbstractSyntax;
import fr.tpt.useme.architecture.model.usemearch.DomainConcept;
import fr.tpt.useme.architecture.model.usemearch.UsemearchPackage;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Syntax</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.tpt.useme.architecture.model.usemearch.impl.AbstractSyntaxImpl#getOwnedDomainConcepts <em>Owned Domain Concepts</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AbstractSyntaxImpl extends SyntaxImpl implements AbstractSyntax {
	/**
	 * The cached value of the '{@link #getOwnedDomainConcepts() <em>Owned Domain Concepts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedDomainConcepts()
	 * @generated
	 * @ordered
	 */
	protected EList<DomainConcept> ownedDomainConcepts;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractSyntaxImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UsemearchPackage.Literals.ABSTRACT_SYNTAX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DomainConcept> getOwnedDomainConcepts() {
		if (ownedDomainConcepts == null) {
			ownedDomainConcepts = new EObjectContainmentEList<DomainConcept>(DomainConcept.class, this, UsemearchPackage.ABSTRACT_SYNTAX__OWNED_DOMAIN_CONCEPTS);
		}
		return ownedDomainConcepts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UsemearchPackage.ABSTRACT_SYNTAX__OWNED_DOMAIN_CONCEPTS:
				return ((InternalEList<?>)getOwnedDomainConcepts()).basicRemove(otherEnd, msgs);
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
			case UsemearchPackage.ABSTRACT_SYNTAX__OWNED_DOMAIN_CONCEPTS:
				return getOwnedDomainConcepts();
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
			case UsemearchPackage.ABSTRACT_SYNTAX__OWNED_DOMAIN_CONCEPTS:
				getOwnedDomainConcepts().clear();
				getOwnedDomainConcepts().addAll((Collection<? extends DomainConcept>)newValue);
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
			case UsemearchPackage.ABSTRACT_SYNTAX__OWNED_DOMAIN_CONCEPTS:
				getOwnedDomainConcepts().clear();
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
			case UsemearchPackage.ABSTRACT_SYNTAX__OWNED_DOMAIN_CONCEPTS:
				return ownedDomainConcepts != null && !ownedDomainConcepts.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AbstractSyntaxImpl
