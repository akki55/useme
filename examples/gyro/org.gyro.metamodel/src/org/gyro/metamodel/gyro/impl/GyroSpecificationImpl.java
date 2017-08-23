/**
 */
package org.gyro.metamodel.gyro.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.gyro.metamodel.gyro.Child;
import org.gyro.metamodel.gyro.GyroPackage;
import org.gyro.metamodel.gyro.GyroSpecification;
import org.gyro.metamodel.gyro.Node;
import org.gyro.metamodel.gyro.Sibling;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.gyro.metamodel.gyro.impl.GyroSpecificationImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.gyro.metamodel.gyro.impl.GyroSpecificationImpl#getNodes <em>Nodes</em>}</li>
 *   <li>{@link org.gyro.metamodel.gyro.impl.GyroSpecificationImpl#getChild <em>Child</em>}</li>
 *   <li>{@link org.gyro.metamodel.gyro.impl.GyroSpecificationImpl#getNext <em>Next</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GyroSpecificationImpl extends EObjectImpl implements GyroSpecification {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getNodes() <em>Nodes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodes()
	 * @generated
	 * @ordered
	 */
	protected EList<Node> nodes;

	/**
	 * The cached value of the '{@link #getChild() <em>Child</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChild()
	 * @generated
	 * @ordered
	 */
	protected EList<Child> child;

	/**
	 * The cached value of the '{@link #getNext() <em>Next</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNext()
	 * @generated
	 * @ordered
	 */
	protected EList<Sibling> next;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GyroSpecificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GyroPackage.Literals.GYRO_SPECIFICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GyroPackage.GYRO_SPECIFICATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Node> getNodes() {
		if (nodes == null) {
			nodes = new EObjectContainmentEList<Node>(Node.class, this, GyroPackage.GYRO_SPECIFICATION__NODES);
		}
		return nodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Child> getChild() {
		if (child == null) {
			child = new EObjectContainmentEList<Child>(Child.class, this, GyroPackage.GYRO_SPECIFICATION__CHILD);
		}
		return child;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Sibling> getNext() {
		if (next == null) {
			next = new EObjectContainmentEList<Sibling>(Sibling.class, this, GyroPackage.GYRO_SPECIFICATION__NEXT);
		}
		return next;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GyroPackage.GYRO_SPECIFICATION__NODES:
				return ((InternalEList<?>)getNodes()).basicRemove(otherEnd, msgs);
			case GyroPackage.GYRO_SPECIFICATION__CHILD:
				return ((InternalEList<?>)getChild()).basicRemove(otherEnd, msgs);
			case GyroPackage.GYRO_SPECIFICATION__NEXT:
				return ((InternalEList<?>)getNext()).basicRemove(otherEnd, msgs);
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
			case GyroPackage.GYRO_SPECIFICATION__NAME:
				return getName();
			case GyroPackage.GYRO_SPECIFICATION__NODES:
				return getNodes();
			case GyroPackage.GYRO_SPECIFICATION__CHILD:
				return getChild();
			case GyroPackage.GYRO_SPECIFICATION__NEXT:
				return getNext();
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
			case GyroPackage.GYRO_SPECIFICATION__NAME:
				setName((String)newValue);
				return;
			case GyroPackage.GYRO_SPECIFICATION__NODES:
				getNodes().clear();
				getNodes().addAll((Collection<? extends Node>)newValue);
				return;
			case GyroPackage.GYRO_SPECIFICATION__CHILD:
				getChild().clear();
				getChild().addAll((Collection<? extends Child>)newValue);
				return;
			case GyroPackage.GYRO_SPECIFICATION__NEXT:
				getNext().clear();
				getNext().addAll((Collection<? extends Sibling>)newValue);
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
			case GyroPackage.GYRO_SPECIFICATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case GyroPackage.GYRO_SPECIFICATION__NODES:
				getNodes().clear();
				return;
			case GyroPackage.GYRO_SPECIFICATION__CHILD:
				getChild().clear();
				return;
			case GyroPackage.GYRO_SPECIFICATION__NEXT:
				getNext().clear();
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
			case GyroPackage.GYRO_SPECIFICATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case GyroPackage.GYRO_SPECIFICATION__NODES:
				return nodes != null && !nodes.isEmpty();
			case GyroPackage.GYRO_SPECIFICATION__CHILD:
				return child != null && !child.isEmpty();
			case GyroPackage.GYRO_SPECIFICATION__NEXT:
				return next != null && !next.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //GyroSpecificationImpl
