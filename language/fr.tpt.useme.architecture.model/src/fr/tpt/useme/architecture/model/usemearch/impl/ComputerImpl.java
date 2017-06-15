/**
 */
package fr.tpt.useme.architecture.model.usemearch.impl;

import fr.tpt.useme.architecture.model.usemearch.Computer;
import fr.tpt.useme.architecture.model.usemearch.Display;
import fr.tpt.useme.architecture.model.usemearch.Mouse;
import fr.tpt.useme.architecture.model.usemearch.SoftwareTool;
import fr.tpt.useme.architecture.model.usemearch.UsemearchPackage;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Computer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.tpt.useme.architecture.model.usemearch.impl.ComputerImpl#getExecutes <em>Executes</em>}</li>
 *   <li>{@link fr.tpt.useme.architecture.model.usemearch.impl.ComputerImpl#getDisplays <em>Displays</em>}</li>
 *   <li>{@link fr.tpt.useme.architecture.model.usemearch.impl.ComputerImpl#getMouses <em>Mouses</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComputerImpl extends HardwareToolImpl implements Computer {
	/**
	 * The cached value of the '{@link #getExecutes() <em>Executes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutes()
	 * @generated
	 * @ordered
	 */
	protected EList<SoftwareTool> executes;

	/**
	 * The cached value of the '{@link #getDisplays() <em>Displays</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplays()
	 * @generated
	 * @ordered
	 */
	protected EList<Display> displays;
	/**
	 * The cached value of the '{@link #getMouses() <em>Mouses</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMouses()
	 * @generated
	 * @ordered
	 */
	protected EList<Mouse> mouses;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComputerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UsemearchPackage.Literals.COMPUTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SoftwareTool> getExecutes() {
		if (executes == null) {
			executes = new EObjectWithInverseResolvingEList.ManyInverse<SoftwareTool>(SoftwareTool.class, this, UsemearchPackage.COMPUTER__EXECUTES, UsemearchPackage.SOFTWARE_TOOL__EXECUTED_BY);
		}
		return executes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Display> getDisplays() {
		if (displays == null) {
			displays = new EObjectResolvingEList<Display>(Display.class, this, UsemearchPackage.COMPUTER__DISPLAYS);
		}
		return displays;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Mouse> getMouses() {
		if (mouses == null) {
			mouses = new EObjectResolvingEList<Mouse>(Mouse.class, this, UsemearchPackage.COMPUTER__MOUSES);
		}
		return mouses;
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
			case UsemearchPackage.COMPUTER__EXECUTES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getExecutes()).basicAdd(otherEnd, msgs);
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
			case UsemearchPackage.COMPUTER__EXECUTES:
				return ((InternalEList<?>)getExecutes()).basicRemove(otherEnd, msgs);
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
			case UsemearchPackage.COMPUTER__EXECUTES:
				return getExecutes();
			case UsemearchPackage.COMPUTER__DISPLAYS:
				return getDisplays();
			case UsemearchPackage.COMPUTER__MOUSES:
				return getMouses();
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
			case UsemearchPackage.COMPUTER__EXECUTES:
				getExecutes().clear();
				getExecutes().addAll((Collection<? extends SoftwareTool>)newValue);
				return;
			case UsemearchPackage.COMPUTER__DISPLAYS:
				getDisplays().clear();
				getDisplays().addAll((Collection<? extends Display>)newValue);
				return;
			case UsemearchPackage.COMPUTER__MOUSES:
				getMouses().clear();
				getMouses().addAll((Collection<? extends Mouse>)newValue);
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
			case UsemearchPackage.COMPUTER__EXECUTES:
				getExecutes().clear();
				return;
			case UsemearchPackage.COMPUTER__DISPLAYS:
				getDisplays().clear();
				return;
			case UsemearchPackage.COMPUTER__MOUSES:
				getMouses().clear();
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
			case UsemearchPackage.COMPUTER__EXECUTES:
				return executes != null && !executes.isEmpty();
			case UsemearchPackage.COMPUTER__DISPLAYS:
				return displays != null && !displays.isEmpty();
			case UsemearchPackage.COMPUTER__MOUSES:
				return mouses != null && !mouses.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ComputerImpl
