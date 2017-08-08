/**
 */
package fr.tpt.mem4csd.dssl.model.dssl.impl;

import fr.tpt.mem4csd.dssl.model.dssl.ContextSpecification;
import fr.tpt.mem4csd.dssl.model.dssl.Dsl;
import fr.tpt.mem4csd.dssl.model.dssl.DsslPackage;
import fr.tpt.mem4csd.dssl.model.dssl.DsslSpecification;
import fr.tpt.mem4csd.dssl.model.dssl.EntityInstance;
import fr.tpt.mem4csd.dssl.model.dssl.EntityInstancesConnection;

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
 *   <li>{@link fr.tpt.mem4csd.dssl.model.dssl.impl.ContextSpecificationImpl#getOwnedEntityInstances <em>Owned Entity Instances</em>}</li>
 *   <li>{@link fr.tpt.mem4csd.dssl.model.dssl.impl.ContextSpecificationImpl#getDevelopedDsl <em>Developed Dsl</em>}</li>
 *   <li>{@link fr.tpt.mem4csd.dssl.model.dssl.impl.ContextSpecificationImpl#getOwnedConnections <em>Owned Connections</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContextSpecificationImpl extends IdentifiedElementImpl implements ContextSpecification {
	/**
	 * The cached value of the '{@link #getOwnedEntityInstances() <em>Owned Entity Instances</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedEntityInstances()
	 * @generated
	 * @ordered
	 */
	protected EList<EntityInstance> ownedEntityInstances;

	/**
	 * The cached value of the '{@link #getOwnedConnections() <em>Owned Connections</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedConnections()
	 * @generated
	 * @ordered
	 */
	protected EList<EntityInstancesConnection> ownedConnections;

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
		return DsslPackage.Literals.CONTEXT_SPECIFICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EntityInstance> getOwnedEntityInstances() {
		if (ownedEntityInstances == null) {
			ownedEntityInstances = new EObjectContainmentEList<EntityInstance>(EntityInstance.class, this, DsslPackage.CONTEXT_SPECIFICATION__OWNED_ENTITY_INSTANCES);
		}
		return ownedEntityInstances;
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
		return ( (DsslSpecification) eContainer() ).getDevelopedDsl();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EntityInstancesConnection> getOwnedConnections() {
		if (ownedConnections == null) {
			ownedConnections = new EObjectContainmentEList<EntityInstancesConnection>(EntityInstancesConnection.class, this, DsslPackage.CONTEXT_SPECIFICATION__OWNED_CONNECTIONS);
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
			case DsslPackage.CONTEXT_SPECIFICATION__OWNED_ENTITY_INSTANCES:
				return ((InternalEList<?>)getOwnedEntityInstances()).basicRemove(otherEnd, msgs);
			case DsslPackage.CONTEXT_SPECIFICATION__OWNED_CONNECTIONS:
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
			case DsslPackage.CONTEXT_SPECIFICATION__OWNED_ENTITY_INSTANCES:
				return getOwnedEntityInstances();
			case DsslPackage.CONTEXT_SPECIFICATION__DEVELOPED_DSL:
				if (resolve) return getDevelopedDsl();
				return basicGetDevelopedDsl();
			case DsslPackage.CONTEXT_SPECIFICATION__OWNED_CONNECTIONS:
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
			case DsslPackage.CONTEXT_SPECIFICATION__OWNED_ENTITY_INSTANCES:
				getOwnedEntityInstances().clear();
				getOwnedEntityInstances().addAll((Collection<? extends EntityInstance>)newValue);
				return;
			case DsslPackage.CONTEXT_SPECIFICATION__OWNED_CONNECTIONS:
				getOwnedConnections().clear();
				getOwnedConnections().addAll((Collection<? extends EntityInstancesConnection>)newValue);
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
			case DsslPackage.CONTEXT_SPECIFICATION__OWNED_ENTITY_INSTANCES:
				getOwnedEntityInstances().clear();
				return;
			case DsslPackage.CONTEXT_SPECIFICATION__OWNED_CONNECTIONS:
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
			case DsslPackage.CONTEXT_SPECIFICATION__OWNED_ENTITY_INSTANCES:
				return ownedEntityInstances != null && !ownedEntityInstances.isEmpty();
			case DsslPackage.CONTEXT_SPECIFICATION__DEVELOPED_DSL:
				return basicGetDevelopedDsl() != null;
			case DsslPackage.CONTEXT_SPECIFICATION__OWNED_CONNECTIONS:
				return ownedConnections != null && !ownedConnections.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ContextSpecificationImpl
