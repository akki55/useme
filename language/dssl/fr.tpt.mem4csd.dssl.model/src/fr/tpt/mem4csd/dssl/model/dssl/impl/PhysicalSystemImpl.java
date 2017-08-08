/**
 */
package fr.tpt.mem4csd.dssl.model.dssl.impl;

import fr.tpt.mem4csd.dssl.model.dssl.Dsl;
import fr.tpt.mem4csd.dssl.model.dssl.DsslPackage;
import fr.tpt.mem4csd.dssl.model.dssl.PhysicalSystem;
import fr.tpt.mem4csd.dssl.model.dssl.SoftwareTool;
import fr.tpt.mem4csd.dssl.model.dssl.User;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Physical System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.tpt.mem4csd.dssl.model.dssl.impl.PhysicalSystemImpl#getControlledBy <em>Controlled By</em>}</li>
 *   <li>{@link fr.tpt.mem4csd.dssl.model.dssl.impl.PhysicalSystemImpl#getInputs <em>Inputs</em>}</li>
 *   <li>{@link fr.tpt.mem4csd.dssl.model.dssl.impl.PhysicalSystemImpl#getVisual <em>Visual</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PhysicalSystemImpl extends EntityTypeImpl implements PhysicalSystem {
	/**
	 * The cached value of the '{@link #getControlledBy() <em>Controlled By</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlledBy()
	 * @generated
	 * @ordered
	 */
	protected EList<SoftwareTool> controlledBy;

	/**
	 * The cached value of the '{@link #getInputs() <em>Inputs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputs()
	 * @generated
	 * @ordered
	 */
	protected EList<Dsl> inputs;

	/**
	 * The cached value of the '{@link #getVisual() <em>Visual</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisual()
	 * @generated
	 * @ordered
	 */
	protected EList<User> visual;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PhysicalSystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DsslPackage.Literals.PHYSICAL_SYSTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SoftwareTool> getControlledBy() {
		if (controlledBy == null) {
			controlledBy = new EObjectResolvingEList<SoftwareTool>(SoftwareTool.class, this, DsslPackage.PHYSICAL_SYSTEM__CONTROLLED_BY);
		}
		return controlledBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Dsl> getInputs() {
		if (inputs == null) {
			inputs = new EObjectResolvingEList<Dsl>(Dsl.class, this, DsslPackage.PHYSICAL_SYSTEM__INPUTS);
		}
		return inputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<User> getVisual() {
		if (visual == null) {
			visual = new EObjectResolvingEList<User>(User.class, this, DsslPackage.PHYSICAL_SYSTEM__VISUAL);
		}
		return visual;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DsslPackage.PHYSICAL_SYSTEM__CONTROLLED_BY:
				return getControlledBy();
			case DsslPackage.PHYSICAL_SYSTEM__INPUTS:
				return getInputs();
			case DsslPackage.PHYSICAL_SYSTEM__VISUAL:
				return getVisual();
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
			case DsslPackage.PHYSICAL_SYSTEM__CONTROLLED_BY:
				getControlledBy().clear();
				getControlledBy().addAll((Collection<? extends SoftwareTool>)newValue);
				return;
			case DsslPackage.PHYSICAL_SYSTEM__INPUTS:
				getInputs().clear();
				getInputs().addAll((Collection<? extends Dsl>)newValue);
				return;
			case DsslPackage.PHYSICAL_SYSTEM__VISUAL:
				getVisual().clear();
				getVisual().addAll((Collection<? extends User>)newValue);
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
			case DsslPackage.PHYSICAL_SYSTEM__CONTROLLED_BY:
				getControlledBy().clear();
				return;
			case DsslPackage.PHYSICAL_SYSTEM__INPUTS:
				getInputs().clear();
				return;
			case DsslPackage.PHYSICAL_SYSTEM__VISUAL:
				getVisual().clear();
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
			case DsslPackage.PHYSICAL_SYSTEM__CONTROLLED_BY:
				return controlledBy != null && !controlledBy.isEmpty();
			case DsslPackage.PHYSICAL_SYSTEM__INPUTS:
				return inputs != null && !inputs.isEmpty();
			case DsslPackage.PHYSICAL_SYSTEM__VISUAL:
				return visual != null && !visual.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PhysicalSystemImpl
