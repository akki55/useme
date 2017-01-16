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
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import pt.fct.unl.novalincs.useme.model.InteractionModeling.InteractionModelingPackage;
import pt.fct.unl.novalincs.useme.model.InteractionModeling.InteractionSyntax;

import pt.fct.unl.novalincs.useme.model.Utility.AbstractSyntax;
import pt.fct.unl.novalincs.useme.model.Utility.DSL;
import pt.fct.unl.novalincs.useme.model.Utility.UtilityPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Syntax</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.Utility.impl.AbstractSyntaxImpl#getName <em>Name</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.Utility.impl.AbstractSyntaxImpl#getDsl <em>Dsl</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.Utility.impl.AbstractSyntaxImpl#getInteractionSyntax <em>Interaction Syntax</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AbstractSyntaxImpl extends MinimalEObjectImpl.Container implements AbstractSyntax {
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
	 * The cached value of the '{@link #getInteractionSyntax() <em>Interaction Syntax</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInteractionSyntax()
	 * @generated
	 * @ordered
	 */
	protected EList<InteractionSyntax> interactionSyntax;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractSyntaxImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UtilityPackage.Literals.ABSTRACT_SYNTAX;
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
			eNotify(new ENotificationImpl(this, Notification.SET, UtilityPackage.ABSTRACT_SYNTAX__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DSL getDsl() {
		if (eContainerFeatureID() != UtilityPackage.ABSTRACT_SYNTAX__DSL) return null;
		return (DSL)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDsl(DSL newDsl, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newDsl, UtilityPackage.ABSTRACT_SYNTAX__DSL, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDsl(DSL newDsl) {
		if (newDsl != eInternalContainer() || (eContainerFeatureID() != UtilityPackage.ABSTRACT_SYNTAX__DSL && newDsl != null)) {
			if (EcoreUtil.isAncestor(this, newDsl))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newDsl != null)
				msgs = ((InternalEObject)newDsl).eInverseAdd(this, UtilityPackage.DSL__ABSTRACT_SYNTAX, DSL.class, msgs);
			msgs = basicSetDsl(newDsl, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UtilityPackage.ABSTRACT_SYNTAX__DSL, newDsl, newDsl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InteractionSyntax> getInteractionSyntax() {
		if (interactionSyntax == null) {
			interactionSyntax = new EObjectWithInverseResolvingEList.ManyInverse<InteractionSyntax>(InteractionSyntax.class, this, UtilityPackage.ABSTRACT_SYNTAX__INTERACTION_SYNTAX, InteractionModelingPackage.INTERACTION_SYNTAX__ABSTRACT_SYNTAX);
		}
		return interactionSyntax;
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
			case UtilityPackage.ABSTRACT_SYNTAX__DSL:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetDsl((DSL)otherEnd, msgs);
			case UtilityPackage.ABSTRACT_SYNTAX__INTERACTION_SYNTAX:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInteractionSyntax()).basicAdd(otherEnd, msgs);
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
			case UtilityPackage.ABSTRACT_SYNTAX__DSL:
				return basicSetDsl(null, msgs);
			case UtilityPackage.ABSTRACT_SYNTAX__INTERACTION_SYNTAX:
				return ((InternalEList<?>)getInteractionSyntax()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case UtilityPackage.ABSTRACT_SYNTAX__DSL:
				return eInternalContainer().eInverseRemove(this, UtilityPackage.DSL__ABSTRACT_SYNTAX, DSL.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UtilityPackage.ABSTRACT_SYNTAX__NAME:
				return getName();
			case UtilityPackage.ABSTRACT_SYNTAX__DSL:
				return getDsl();
			case UtilityPackage.ABSTRACT_SYNTAX__INTERACTION_SYNTAX:
				return getInteractionSyntax();
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
			case UtilityPackage.ABSTRACT_SYNTAX__NAME:
				setName((String)newValue);
				return;
			case UtilityPackage.ABSTRACT_SYNTAX__DSL:
				setDsl((DSL)newValue);
				return;
			case UtilityPackage.ABSTRACT_SYNTAX__INTERACTION_SYNTAX:
				getInteractionSyntax().clear();
				getInteractionSyntax().addAll((Collection<? extends InteractionSyntax>)newValue);
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
			case UtilityPackage.ABSTRACT_SYNTAX__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UtilityPackage.ABSTRACT_SYNTAX__DSL:
				setDsl((DSL)null);
				return;
			case UtilityPackage.ABSTRACT_SYNTAX__INTERACTION_SYNTAX:
				getInteractionSyntax().clear();
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
			case UtilityPackage.ABSTRACT_SYNTAX__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UtilityPackage.ABSTRACT_SYNTAX__DSL:
				return getDsl() != null;
			case UtilityPackage.ABSTRACT_SYNTAX__INTERACTION_SYNTAX:
				return interactionSyntax != null && !interactionSyntax.isEmpty();
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

} //AbstractSyntaxImpl
