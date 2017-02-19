/**
 */
package fr.tpt.useme.architecture.model.usemearch.impl;

import fr.tpt.useme.architecture.model.usemearch.ContextInstanceElement;
import fr.tpt.useme.architecture.model.usemearch.ContextSpecification;
import fr.tpt.useme.architecture.model.usemearch.Dsl;
import fr.tpt.useme.architecture.model.usemearch.DslBasedSystemSpecification;
import fr.tpt.useme.architecture.model.usemearch.InstanceElementsConnection;
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
 * An implementation of the model object '<em><b>Context Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.tpt.useme.architecture.model.usemearch.impl.ContextSpecificationImpl#getOwnedInstanceElements <em>Owned Instance Elements</em>}</li>
 *   <li>{@link fr.tpt.useme.architecture.model.usemearch.impl.ContextSpecificationImpl#getDevelopedDsl <em>Developed Dsl</em>}</li>
 *   <li>{@link fr.tpt.useme.architecture.model.usemearch.impl.ContextSpecificationImpl#getOwnedConnections <em>Owned Connections</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContextSpecificationImpl extends IdentifiedElementImpl implements ContextSpecification {
	/**
	 * The cached value of the '{@link #getOwnedInstanceElements() <em>Owned Instance Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedInstanceElements()
	 * @generated
	 * @ordered
	 */
	protected EList<ContextInstanceElement> ownedInstanceElements;
	/**
	 * The cached value of the '{@link #getOwnedConnections() <em>Owned Connections</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedConnections()
	 * @generated
	 * @ordered
	 */
	protected EList<InstanceElementsConnection> ownedConnections;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContextSpecificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UsemearchPackage.Literals.CONTEXT_SPECIFICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContextInstanceElement> getOwnedInstanceElements() {
		if (ownedInstanceElements == null) {
			ownedInstanceElements = new EObjectContainmentEList<ContextInstanceElement>(ContextInstanceElement.class, this, UsemearchPackage.CONTEXT_SPECIFICATION__OWNED_INSTANCE_ELEMENTS);
		}
		return ownedInstanceElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dsl getDevelopedDsl() {
		Dsl developedDsl = basicGetDevelopedDsl();
		return developedDsl != null && developedDsl.eIsProxy() ? (Dsl)eResolveProxy((InternalEObject)developedDsl) : developedDsl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Dsl basicGetDevelopedDsl() {
		return ( (DslBasedSystemSpecification) eContainer() ).getDevelopedDsl();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InstanceElementsConnection> getOwnedConnections() {
		if (ownedConnections == null) {
			ownedConnections = new EObjectContainmentEList<InstanceElementsConnection>(InstanceElementsConnection.class, this, UsemearchPackage.CONTEXT_SPECIFICATION__OWNED_CONNECTIONS);
		}
		return ownedConnections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UsemearchPackage.CONTEXT_SPECIFICATION__OWNED_INSTANCE_ELEMENTS:
				return ((InternalEList<?>)getOwnedInstanceElements()).basicRemove(otherEnd, msgs);
			case UsemearchPackage.CONTEXT_SPECIFICATION__OWNED_CONNECTIONS:
				return ((InternalEList<?>)getOwnedConnections()).basicRemove(otherEnd, msgs);
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
			case UsemearchPackage.CONTEXT_SPECIFICATION__OWNED_INSTANCE_ELEMENTS:
				return getOwnedInstanceElements();
			case UsemearchPackage.CONTEXT_SPECIFICATION__DEVELOPED_DSL:
				if (resolve) return getDevelopedDsl();
				return basicGetDevelopedDsl();
			case UsemearchPackage.CONTEXT_SPECIFICATION__OWNED_CONNECTIONS:
				return getOwnedConnections();
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
			case UsemearchPackage.CONTEXT_SPECIFICATION__OWNED_INSTANCE_ELEMENTS:
				getOwnedInstanceElements().clear();
				getOwnedInstanceElements().addAll((Collection<? extends ContextInstanceElement>)newValue);
				return;
			case UsemearchPackage.CONTEXT_SPECIFICATION__OWNED_CONNECTIONS:
				getOwnedConnections().clear();
				getOwnedConnections().addAll((Collection<? extends InstanceElementsConnection>)newValue);
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
			case UsemearchPackage.CONTEXT_SPECIFICATION__OWNED_INSTANCE_ELEMENTS:
				getOwnedInstanceElements().clear();
				return;
			case UsemearchPackage.CONTEXT_SPECIFICATION__OWNED_CONNECTIONS:
				getOwnedConnections().clear();
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
			case UsemearchPackage.CONTEXT_SPECIFICATION__OWNED_INSTANCE_ELEMENTS:
				return ownedInstanceElements != null && !ownedInstanceElements.isEmpty();
			case UsemearchPackage.CONTEXT_SPECIFICATION__DEVELOPED_DSL:
				return basicGetDevelopedDsl() != null;
			case UsemearchPackage.CONTEXT_SPECIFICATION__OWNED_CONNECTIONS:
				return ownedConnections != null && !ownedConnections.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ContextSpecificationImpl
