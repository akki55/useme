/**
 */
package fr.tpt.useme.architecture.model.usemearch.impl;

import fr.tpt.useme.architecture.model.usemearch.Tool;
import fr.tpt.useme.architecture.model.usemearch.UsemearchPackage;
import fr.tpt.useme.architecture.model.usemearch.User;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tool</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.tpt.useme.architecture.model.usemearch.impl.ToolImpl#getUsedBy <em>Used By</em>}</li>
 *   <li>{@link fr.tpt.useme.architecture.model.usemearch.impl.ToolImpl#getControlledBy <em>Controlled By</em>}</li>
 *   <li>{@link fr.tpt.useme.architecture.model.usemearch.impl.ToolImpl#getControls <em>Controls</em>}</li>
 *   <li>{@link fr.tpt.useme.architecture.model.usemearch.impl.ToolImpl#getVersion <em>Version</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ToolImpl extends EntityTypeImpl implements Tool {
	/**
	 * The cached value of the '{@link #getUsedBy() <em>Used By</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsedBy()
	 * @generated
	 * @ordered
	 */
	protected EList<User> usedBy;

	/**
	 * The cached value of the '{@link #getControlledBy() <em>Controlled By</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlledBy()
	 * @generated
	 * @ordered
	 */
	protected EList<Tool> controlledBy;
	/**
	 * The cached value of the '{@link #getControls() <em>Controls</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControls()
	 * @generated
	 * @ordered
	 */
	protected EList<Tool> controls;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ToolImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UsemearchPackage.Literals.TOOL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<User> getUsedBy() {
		if (usedBy == null) {
			usedBy = new EObjectWithInverseResolvingEList.ManyInverse<User>(User.class, this, UsemearchPackage.TOOL__USED_BY, UsemearchPackage.USER__USES);
		}
		return usedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Tool> getControlledBy() {
		if (controlledBy == null) {
			controlledBy = new EObjectWithInverseResolvingEList.ManyInverse<Tool>(Tool.class, this, UsemearchPackage.TOOL__CONTROLLED_BY, UsemearchPackage.TOOL__CONTROLS);
		}
		return controlledBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Tool> getControls() {
		if (controls == null) {
			controls = new EObjectWithInverseResolvingEList.ManyInverse<Tool>(Tool.class, this, UsemearchPackage.TOOL__CONTROLS, UsemearchPackage.TOOL__CONTROLLED_BY);
		}
		return controls;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UsemearchPackage.TOOL__VERSION, oldVersion, version));
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
			case UsemearchPackage.TOOL__USED_BY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getUsedBy()).basicAdd(otherEnd, msgs);
			case UsemearchPackage.TOOL__CONTROLLED_BY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getControlledBy()).basicAdd(otherEnd, msgs);
			case UsemearchPackage.TOOL__CONTROLS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getControls()).basicAdd(otherEnd, msgs);
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
			case UsemearchPackage.TOOL__USED_BY:
				return ((InternalEList<?>)getUsedBy()).basicRemove(otherEnd, msgs);
			case UsemearchPackage.TOOL__CONTROLLED_BY:
				return ((InternalEList<?>)getControlledBy()).basicRemove(otherEnd, msgs);
			case UsemearchPackage.TOOL__CONTROLS:
				return ((InternalEList<?>)getControls()).basicRemove(otherEnd, msgs);
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
			case UsemearchPackage.TOOL__USED_BY:
				return getUsedBy();
			case UsemearchPackage.TOOL__CONTROLLED_BY:
				return getControlledBy();
			case UsemearchPackage.TOOL__CONTROLS:
				return getControls();
			case UsemearchPackage.TOOL__VERSION:
				return getVersion();
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
			case UsemearchPackage.TOOL__USED_BY:
				getUsedBy().clear();
				getUsedBy().addAll((Collection<? extends User>)newValue);
				return;
			case UsemearchPackage.TOOL__CONTROLLED_BY:
				getControlledBy().clear();
				getControlledBy().addAll((Collection<? extends Tool>)newValue);
				return;
			case UsemearchPackage.TOOL__CONTROLS:
				getControls().clear();
				getControls().addAll((Collection<? extends Tool>)newValue);
				return;
			case UsemearchPackage.TOOL__VERSION:
				setVersion((String)newValue);
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
			case UsemearchPackage.TOOL__USED_BY:
				getUsedBy().clear();
				return;
			case UsemearchPackage.TOOL__CONTROLLED_BY:
				getControlledBy().clear();
				return;
			case UsemearchPackage.TOOL__CONTROLS:
				getControls().clear();
				return;
			case UsemearchPackage.TOOL__VERSION:
				setVersion(VERSION_EDEFAULT);
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
			case UsemearchPackage.TOOL__USED_BY:
				return usedBy != null && !usedBy.isEmpty();
			case UsemearchPackage.TOOL__CONTROLLED_BY:
				return controlledBy != null && !controlledBy.isEmpty();
			case UsemearchPackage.TOOL__CONTROLS:
				return controls != null && !controls.isEmpty();
			case UsemearchPackage.TOOL__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
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
		result.append(" (version: ");
		result.append(version);
		result.append(')');
		return result.toString();
	}

} //ToolImpl
