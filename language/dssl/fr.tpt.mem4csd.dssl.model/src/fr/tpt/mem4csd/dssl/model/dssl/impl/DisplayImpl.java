/**
 */
package fr.tpt.mem4csd.dssl.model.dssl.impl;

import fr.tpt.mem4csd.dssl.model.dssl.ColorScheme;
import fr.tpt.mem4csd.dssl.model.dssl.Display;
import fr.tpt.mem4csd.dssl.model.dssl.DsslPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Display</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.tpt.mem4csd.dssl.model.dssl.impl.DisplayImpl#getResolutionX <em>Resolution X</em>}</li>
 *   <li>{@link fr.tpt.mem4csd.dssl.model.dssl.impl.DisplayImpl#getResolutionY <em>Resolution Y</em>}</li>
 *   <li>{@link fr.tpt.mem4csd.dssl.model.dssl.impl.DisplayImpl#getSupportedColors <em>Supported Colors</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DisplayImpl extends HardwareToolImpl implements Display {
	/**
	 * The default value of the '{@link #getResolutionX() <em>Resolution X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResolutionX()
	 * @generated
	 * @ordered
	 */
	protected static final int RESOLUTION_X_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getResolutionX() <em>Resolution X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResolutionX()
	 * @generated
	 * @ordered
	 */
	protected int resolutionX = RESOLUTION_X_EDEFAULT;

	/**
	 * The default value of the '{@link #getResolutionY() <em>Resolution Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResolutionY()
	 * @generated
	 * @ordered
	 */
	protected static final int RESOLUTION_Y_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getResolutionY() <em>Resolution Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResolutionY()
	 * @generated
	 * @ordered
	 */
	protected int resolutionY = RESOLUTION_Y_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSupportedColors() <em>Supported Colors</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedColors()
	 * @generated
	 * @ordered
	 */
	protected EList<ColorScheme> supportedColors;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DisplayImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DsslPackage.Literals.DISPLAY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getResolutionX() {
		return resolutionX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResolutionX(int newResolutionX) {
		int oldResolutionX = resolutionX;
		resolutionX = newResolutionX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DsslPackage.DISPLAY__RESOLUTION_X, oldResolutionX, resolutionX));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getResolutionY() {
		return resolutionY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResolutionY(int newResolutionY) {
		int oldResolutionY = resolutionY;
		resolutionY = newResolutionY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DsslPackage.DISPLAY__RESOLUTION_Y, oldResolutionY, resolutionY));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ColorScheme> getSupportedColors() {
		if (supportedColors == null) {
			supportedColors = new EDataTypeUniqueEList<ColorScheme>(ColorScheme.class, this, DsslPackage.DISPLAY__SUPPORTED_COLORS);
		}
		return supportedColors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DsslPackage.DISPLAY__RESOLUTION_X:
				return getResolutionX();
			case DsslPackage.DISPLAY__RESOLUTION_Y:
				return getResolutionY();
			case DsslPackage.DISPLAY__SUPPORTED_COLORS:
				return getSupportedColors();
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
			case DsslPackage.DISPLAY__RESOLUTION_X:
				setResolutionX((Integer)newValue);
				return;
			case DsslPackage.DISPLAY__RESOLUTION_Y:
				setResolutionY((Integer)newValue);
				return;
			case DsslPackage.DISPLAY__SUPPORTED_COLORS:
				getSupportedColors().clear();
				getSupportedColors().addAll((Collection<? extends ColorScheme>)newValue);
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
			case DsslPackage.DISPLAY__RESOLUTION_X:
				setResolutionX(RESOLUTION_X_EDEFAULT);
				return;
			case DsslPackage.DISPLAY__RESOLUTION_Y:
				setResolutionY(RESOLUTION_Y_EDEFAULT);
				return;
			case DsslPackage.DISPLAY__SUPPORTED_COLORS:
				getSupportedColors().clear();
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
			case DsslPackage.DISPLAY__RESOLUTION_X:
				return resolutionX != RESOLUTION_X_EDEFAULT;
			case DsslPackage.DISPLAY__RESOLUTION_Y:
				return resolutionY != RESOLUTION_Y_EDEFAULT;
			case DsslPackage.DISPLAY__SUPPORTED_COLORS:
				return supportedColors != null && !supportedColors.isEmpty();
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
		result.append(" (resolutionX: ");
		result.append(resolutionX);
		result.append(", resolutionY: ");
		result.append(resolutionY);
		result.append(", supportedColors: ");
		result.append(supportedColors);
		result.append(')');
		return result.toString();
	}

} //DisplayImpl
