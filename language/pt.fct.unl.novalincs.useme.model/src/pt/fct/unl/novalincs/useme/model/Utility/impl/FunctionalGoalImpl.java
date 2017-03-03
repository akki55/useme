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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import pt.fct.unl.novalincs.useme.model.Utility.ExistingGM;
import pt.fct.unl.novalincs.useme.model.Utility.FunctionalGoal;
import pt.fct.unl.novalincs.useme.model.Utility.Requirement;
import pt.fct.unl.novalincs.useme.model.Utility.UtilityPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Functional Goal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.Utility.impl.FunctionalGoalImpl#getName <em>Name</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.Utility.impl.FunctionalGoalImpl#getExistingGM <em>Existing GM</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.Utility.impl.FunctionalGoalImpl#getRequirements <em>Requirements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FunctionalGoalImpl extends MinimalEObjectImpl.Container implements FunctionalGoal {
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
	 * The cached value of the '{@link #getExistingGM() <em>Existing GM</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExistingGM()
	 * @generated
	 * @ordered
	 */
	protected EList<ExistingGM> existingGM;

	/**
	 * The cached value of the '{@link #getRequirements() <em>Requirements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequirements()
	 * @generated
	 * @ordered
	 */
	protected EList<Requirement> requirements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionalGoalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UtilityPackage.Literals.FUNCTIONAL_GOAL;
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
			eNotify(new ENotificationImpl(this, Notification.SET, UtilityPackage.FUNCTIONAL_GOAL__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Requirement> getRequirements() {
		if (requirements == null) {
			requirements = new EObjectResolvingEList<Requirement>(Requirement.class, this, UtilityPackage.FUNCTIONAL_GOAL__REQUIREMENTS);
		}
		return requirements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExistingGM> getExistingGM() {
		if (existingGM == null) {
			existingGM = new EObjectWithInverseResolvingEList.ManyInverse<ExistingGM>(ExistingGM.class, this, UtilityPackage.FUNCTIONAL_GOAL__EXISTING_GM, UtilityPackage.EXISTING_GM__FUNCTIONAL_GOAL);
		}
		return existingGM;
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
			case UtilityPackage.FUNCTIONAL_GOAL__EXISTING_GM:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getExistingGM()).basicAdd(otherEnd, msgs);
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
			case UtilityPackage.FUNCTIONAL_GOAL__EXISTING_GM:
				return ((InternalEList<?>)getExistingGM()).basicRemove(otherEnd, msgs);
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
			case UtilityPackage.FUNCTIONAL_GOAL__NAME:
				return getName();
			case UtilityPackage.FUNCTIONAL_GOAL__EXISTING_GM:
				return getExistingGM();
			case UtilityPackage.FUNCTIONAL_GOAL__REQUIREMENTS:
				return getRequirements();
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
			case UtilityPackage.FUNCTIONAL_GOAL__NAME:
				setName((String)newValue);
				return;
			case UtilityPackage.FUNCTIONAL_GOAL__EXISTING_GM:
				getExistingGM().clear();
				getExistingGM().addAll((Collection<? extends ExistingGM>)newValue);
				return;
			case UtilityPackage.FUNCTIONAL_GOAL__REQUIREMENTS:
				getRequirements().clear();
				getRequirements().addAll((Collection<? extends Requirement>)newValue);
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
			case UtilityPackage.FUNCTIONAL_GOAL__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UtilityPackage.FUNCTIONAL_GOAL__EXISTING_GM:
				getExistingGM().clear();
				return;
			case UtilityPackage.FUNCTIONAL_GOAL__REQUIREMENTS:
				getRequirements().clear();
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
			case UtilityPackage.FUNCTIONAL_GOAL__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UtilityPackage.FUNCTIONAL_GOAL__EXISTING_GM:
				return existingGM != null && !existingGM.isEmpty();
			case UtilityPackage.FUNCTIONAL_GOAL__REQUIREMENTS:
				return requirements != null && !requirements.isEmpty();
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

} //FunctionalGoalImpl
