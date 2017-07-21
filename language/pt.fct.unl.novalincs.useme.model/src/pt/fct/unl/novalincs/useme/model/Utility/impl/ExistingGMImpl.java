/**
 */
package pt.fct.unl.novalincs.useme.model.Utility.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import pt.fct.unl.novalincs.useme.model.Utility.ExistingGM;
import pt.fct.unl.novalincs.useme.model.Utility.FunctionalGoal;
import pt.fct.unl.novalincs.useme.model.Utility.UtilityPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Existing GM</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.Utility.impl.ExistingGMImpl#getName <em>Name</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.Utility.impl.ExistingGMImpl#getFunctionalGoal <em>Functional Goal</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExistingGMImpl extends MinimalEObjectImpl.Container implements ExistingGM {
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
	 * The cached value of the '{@link #getFunctionalGoal() <em>Functional Goal</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctionalGoal()
	 * @generated
	 * @ordered
	 */
	protected EList<FunctionalGoal> functionalGoal;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExistingGMImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UtilityPackage.Literals.EXISTING_GM;
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
			eNotify(new ENotificationImpl(this, Notification.SET, UtilityPackage.EXISTING_GM__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FunctionalGoal> getFunctionalGoal() {
		if (functionalGoal == null) {
			functionalGoal = new EObjectWithInverseResolvingEList.ManyInverse<FunctionalGoal>(FunctionalGoal.class, this, UtilityPackage.EXISTING_GM__FUNCTIONAL_GOAL, UtilityPackage.FUNCTIONAL_GOAL__EXISTING_GM);
		}
		return functionalGoal;
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
			case UtilityPackage.EXISTING_GM__FUNCTIONAL_GOAL:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFunctionalGoal()).basicAdd(otherEnd, msgs);
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
			case UtilityPackage.EXISTING_GM__FUNCTIONAL_GOAL:
				return ((InternalEList<?>)getFunctionalGoal()).basicRemove(otherEnd, msgs);
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
			case UtilityPackage.EXISTING_GM__NAME:
				return getName();
			case UtilityPackage.EXISTING_GM__FUNCTIONAL_GOAL:
				return getFunctionalGoal();
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
			case UtilityPackage.EXISTING_GM__NAME:
				setName((String)newValue);
				return;
			case UtilityPackage.EXISTING_GM__FUNCTIONAL_GOAL:
				getFunctionalGoal().clear();
				getFunctionalGoal().addAll((Collection<? extends FunctionalGoal>)newValue);
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
			case UtilityPackage.EXISTING_GM__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UtilityPackage.EXISTING_GM__FUNCTIONAL_GOAL:
				getFunctionalGoal().clear();
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
			case UtilityPackage.EXISTING_GM__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UtilityPackage.EXISTING_GM__FUNCTIONAL_GOAL:
				return functionalGoal != null && !functionalGoal.isEmpty();
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

} //ExistingGMImpl
