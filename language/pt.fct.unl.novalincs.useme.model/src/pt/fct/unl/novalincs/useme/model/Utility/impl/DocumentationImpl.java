/**
 */
package pt.fct.unl.novalincs.useme.model.Utility.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import pt.fct.unl.novalincs.useme.model.Utility.Documentation;
import pt.fct.unl.novalincs.useme.model.Utility.OutsideRef;
import pt.fct.unl.novalincs.useme.model.Utility.UtilityPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Documentation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.Utility.impl.DocumentationImpl#getName <em>Name</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.Utility.impl.DocumentationImpl#getOutsideRef <em>Outside Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DocumentationImpl extends MinimalEObjectImpl.Container implements Documentation {
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
	 * The cached value of the '{@link #getOutsideRef() <em>Outside Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutsideRef()
	 * @generated
	 * @ordered
	 */
	protected OutsideRef outsideRef;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UtilityPackage.Literals.DOCUMENTATION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, UtilityPackage.DOCUMENTATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutsideRef getOutsideRef() {
		if (outsideRef != null && outsideRef.eIsProxy()) {
			InternalEObject oldOutsideRef = (InternalEObject)outsideRef;
			outsideRef = (OutsideRef)eResolveProxy(oldOutsideRef);
			if (outsideRef != oldOutsideRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UtilityPackage.DOCUMENTATION__OUTSIDE_REF, oldOutsideRef, outsideRef));
			}
		}
		return outsideRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutsideRef basicGetOutsideRef() {
		return outsideRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutsideRef(OutsideRef newOutsideRef) {
		OutsideRef oldOutsideRef = outsideRef;
		outsideRef = newOutsideRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UtilityPackage.DOCUMENTATION__OUTSIDE_REF, oldOutsideRef, outsideRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UtilityPackage.DOCUMENTATION__NAME:
				return getName();
			case UtilityPackage.DOCUMENTATION__OUTSIDE_REF:
				if (resolve) return getOutsideRef();
				return basicGetOutsideRef();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case UtilityPackage.DOCUMENTATION__NAME:
				setName((String)newValue);
				return;
			case UtilityPackage.DOCUMENTATION__OUTSIDE_REF:
				setOutsideRef((OutsideRef)newValue);
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
			case UtilityPackage.DOCUMENTATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UtilityPackage.DOCUMENTATION__OUTSIDE_REF:
				setOutsideRef((OutsideRef)null);
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
			case UtilityPackage.DOCUMENTATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UtilityPackage.DOCUMENTATION__OUTSIDE_REF:
				return outsideRef != null;
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

} //DocumentationImpl
