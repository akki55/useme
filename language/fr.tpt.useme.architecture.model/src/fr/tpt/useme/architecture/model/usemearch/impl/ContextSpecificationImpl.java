/**
 */
package fr.tpt.useme.architecture.model.usemearch.impl;

import fr.tpt.useme.architecture.model.usemearch.ContextSpecification;
import fr.tpt.useme.architecture.model.usemearch.Dsl;
import fr.tpt.useme.architecture.model.usemearch.EnvironmentalElement;
import fr.tpt.useme.architecture.model.usemearch.UsemearchPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Context Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.tpt.useme.architecture.model.usemearch.impl.ContextSpecificationImpl#getDevelopedDsl <em>Developed Dsl</em>}</li>
 *   <li>{@link fr.tpt.useme.architecture.model.usemearch.impl.ContextSpecificationImpl#getEnvironmentalElements <em>Environmental Elements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContextSpecificationImpl extends IdentifiedElementImpl implements ContextSpecification {
	/**
	 * The cached value of the '{@link #getDevelopedDsl() <em>Developed Dsl</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDevelopedDsl()
	 * @generated
	 * @ordered
	 */
	protected Dsl developedDsl;

	/**
	 * The cached value of the '{@link #getEnvironmentalElements() <em>Environmental Elements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnvironmentalElements()
	 * @generated
	 * @ordered
	 */
	protected EList<EnvironmentalElement> environmentalElements;

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
		return UsemearchPackage.Literals.CONTEXT_SPECIFICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dsl getDevelopedDsl() {
		if (developedDsl != null && developedDsl.eIsProxy()) {
			InternalEObject oldDevelopedDsl = (InternalEObject)developedDsl;
			developedDsl = (Dsl)eResolveProxy(oldDevelopedDsl);
			if (developedDsl != oldDevelopedDsl) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UsemearchPackage.CONTEXT_SPECIFICATION__DEVELOPED_DSL, oldDevelopedDsl, developedDsl));
			}
		}
		return developedDsl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dsl basicGetDevelopedDsl() {
		return developedDsl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDevelopedDsl(Dsl newDevelopedDsl) {
		Dsl oldDevelopedDsl = developedDsl;
		developedDsl = newDevelopedDsl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UsemearchPackage.CONTEXT_SPECIFICATION__DEVELOPED_DSL, oldDevelopedDsl, developedDsl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EnvironmentalElement> getEnvironmentalElements() {
		if (environmentalElements == null) {
			environmentalElements = new EObjectResolvingEList<EnvironmentalElement>(EnvironmentalElement.class, this, UsemearchPackage.CONTEXT_SPECIFICATION__ENVIRONMENTAL_ELEMENTS);
		}
		return environmentalElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UsemearchPackage.CONTEXT_SPECIFICATION__DEVELOPED_DSL:
				if (resolve) return getDevelopedDsl();
				return basicGetDevelopedDsl();
			case UsemearchPackage.CONTEXT_SPECIFICATION__ENVIRONMENTAL_ELEMENTS:
				return getEnvironmentalElements();
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
			case UsemearchPackage.CONTEXT_SPECIFICATION__DEVELOPED_DSL:
				setDevelopedDsl((Dsl)newValue);
				return;
			case UsemearchPackage.CONTEXT_SPECIFICATION__ENVIRONMENTAL_ELEMENTS:
				getEnvironmentalElements().clear();
				getEnvironmentalElements().addAll((Collection<? extends EnvironmentalElement>)newValue);
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
			case UsemearchPackage.CONTEXT_SPECIFICATION__DEVELOPED_DSL:
				setDevelopedDsl((Dsl)null);
				return;
			case UsemearchPackage.CONTEXT_SPECIFICATION__ENVIRONMENTAL_ELEMENTS:
				getEnvironmentalElements().clear();
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
			case UsemearchPackage.CONTEXT_SPECIFICATION__DEVELOPED_DSL:
				return developedDsl != null;
			case UsemearchPackage.CONTEXT_SPECIFICATION__ENVIRONMENTAL_ELEMENTS:
				return environmentalElements != null && !environmentalElements.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ContextSpecificationImpl
