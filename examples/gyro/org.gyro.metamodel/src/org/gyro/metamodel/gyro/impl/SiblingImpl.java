/**
 */
package org.gyro.metamodel.gyro.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.gyro.metamodel.gyro.GyroPackage;
import org.gyro.metamodel.gyro.Node;
import org.gyro.metamodel.gyro.Sibling;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sibling</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.gyro.metamodel.gyro.impl.SiblingImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.gyro.metamodel.gyro.impl.SiblingImpl#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SiblingImpl extends EObjectImpl implements Sibling {
	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected EList<Node> source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected EList<Node> target;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SiblingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GyroPackage.Literals.SIBLING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Node> getSource() {
		if (source == null) {
			source = new EObjectResolvingEList<Node>(Node.class, this, GyroPackage.SIBLING__SOURCE);
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Node> getTarget() {
		if (target == null) {
			target = new EObjectResolvingEList<Node>(Node.class, this, GyroPackage.SIBLING__TARGET);
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GyroPackage.SIBLING__SOURCE:
				return getSource();
			case GyroPackage.SIBLING__TARGET:
				return getTarget();
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
			case GyroPackage.SIBLING__SOURCE:
				getSource().clear();
				getSource().addAll((Collection<? extends Node>)newValue);
				return;
			case GyroPackage.SIBLING__TARGET:
				getTarget().clear();
				getTarget().addAll((Collection<? extends Node>)newValue);
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
			case GyroPackage.SIBLING__SOURCE:
				getSource().clear();
				return;
			case GyroPackage.SIBLING__TARGET:
				getTarget().clear();
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
			case GyroPackage.SIBLING__SOURCE:
				return source != null && !source.isEmpty();
			case GyroPackage.SIBLING__TARGET:
				return target != null && !target.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SiblingImpl
