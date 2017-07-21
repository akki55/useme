/**
 */
package pt.fct.unl.novalincs.useme.model.InteractionModeling.impl;

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

import pt.fct.unl.novalincs.useme.model.EvaluationModeling.Documentation;

import pt.fct.unl.novalincs.useme.model.InteractionModeling.InteractionModel;
import pt.fct.unl.novalincs.useme.model.InteractionModeling.InteractionModelingPackage;
import pt.fct.unl.novalincs.useme.model.InteractionModeling.InteractionSyntax;

import pt.fct.unl.novalincs.useme.model.Utility.AbstractSyntax;
import pt.fct.unl.novalincs.useme.model.Utility.ConcreteSyntax;
import pt.fct.unl.novalincs.useme.model.Utility.OutsideRef;
import pt.fct.unl.novalincs.useme.model.Utility.UtilityPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interaction Syntax</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.InteractionModeling.impl.InteractionSyntaxImpl#getName <em>Name</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.InteractionModeling.impl.InteractionSyntaxImpl#getInteractionModel <em>Interaction Model</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.InteractionModeling.impl.InteractionSyntaxImpl#getConcreteSyntax <em>Concrete Syntax</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.InteractionModeling.impl.InteractionSyntaxImpl#getAbstractSyntax <em>Abstract Syntax</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.InteractionModeling.impl.InteractionSyntaxImpl#getOutsideRef <em>Outside Ref</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.InteractionModeling.impl.InteractionSyntaxImpl#getDocumentation <em>Documentation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InteractionSyntaxImpl extends MinimalEObjectImpl.Container implements InteractionSyntax {
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
	 * The cached value of the '{@link #getInteractionModel() <em>Interaction Model</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInteractionModel()
	 * @generated
	 * @ordered
	 */
	protected EList<InteractionModel> interactionModel;

	/**
	 * The cached value of the '{@link #getConcreteSyntax() <em>Concrete Syntax</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcreteSyntax()
	 * @generated
	 * @ordered
	 */
	protected EList<ConcreteSyntax> concreteSyntax;

	/**
	 * The cached value of the '{@link #getAbstractSyntax() <em>Abstract Syntax</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstractSyntax()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractSyntax> abstractSyntax;

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
	 * The cached value of the '{@link #getDocumentation() <em>Documentation</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentation()
	 * @generated
	 * @ordered
	 */
	protected EList<Documentation> documentation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InteractionSyntaxImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InteractionModelingPackage.Literals.INTERACTION_SYNTAX;
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
			eNotify(new ENotificationImpl(this, Notification.SET, InteractionModelingPackage.INTERACTION_SYNTAX__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InteractionModel> getInteractionModel() {
		if (interactionModel == null) {
			interactionModel = new EObjectWithInverseResolvingEList.ManyInverse<InteractionModel>(InteractionModel.class, this, InteractionModelingPackage.INTERACTION_SYNTAX__INTERACTION_MODEL, InteractionModelingPackage.INTERACTION_MODEL__INTERACTION_SYNTAX);
		}
		return interactionModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConcreteSyntax> getConcreteSyntax() {
		if (concreteSyntax == null) {
			concreteSyntax = new EObjectWithInverseResolvingEList.ManyInverse<ConcreteSyntax>(ConcreteSyntax.class, this, InteractionModelingPackage.INTERACTION_SYNTAX__CONCRETE_SYNTAX, UtilityPackage.CONCRETE_SYNTAX__INTERACTION_SYNTAX);
		}
		return concreteSyntax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractSyntax> getAbstractSyntax() {
		if (abstractSyntax == null) {
			abstractSyntax = new EObjectWithInverseResolvingEList.ManyInverse<AbstractSyntax>(AbstractSyntax.class, this, InteractionModelingPackage.INTERACTION_SYNTAX__ABSTRACT_SYNTAX, UtilityPackage.ABSTRACT_SYNTAX__INTERACTION_SYNTAX);
		}
		return abstractSyntax;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InteractionModelingPackage.INTERACTION_SYNTAX__OUTSIDE_REF, oldOutsideRef, outsideRef));
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
			eNotify(new ENotificationImpl(this, Notification.SET, InteractionModelingPackage.INTERACTION_SYNTAX__OUTSIDE_REF, oldOutsideRef, outsideRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Documentation> getDocumentation() {
		if (documentation == null) {
			documentation = new EObjectResolvingEList<Documentation>(Documentation.class, this, InteractionModelingPackage.INTERACTION_SYNTAX__DOCUMENTATION);
		}
		return documentation;
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
			case InteractionModelingPackage.INTERACTION_SYNTAX__INTERACTION_MODEL:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInteractionModel()).basicAdd(otherEnd, msgs);
			case InteractionModelingPackage.INTERACTION_SYNTAX__CONCRETE_SYNTAX:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getConcreteSyntax()).basicAdd(otherEnd, msgs);
			case InteractionModelingPackage.INTERACTION_SYNTAX__ABSTRACT_SYNTAX:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAbstractSyntax()).basicAdd(otherEnd, msgs);
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
			case InteractionModelingPackage.INTERACTION_SYNTAX__INTERACTION_MODEL:
				return ((InternalEList<?>)getInteractionModel()).basicRemove(otherEnd, msgs);
			case InteractionModelingPackage.INTERACTION_SYNTAX__CONCRETE_SYNTAX:
				return ((InternalEList<?>)getConcreteSyntax()).basicRemove(otherEnd, msgs);
			case InteractionModelingPackage.INTERACTION_SYNTAX__ABSTRACT_SYNTAX:
				return ((InternalEList<?>)getAbstractSyntax()).basicRemove(otherEnd, msgs);
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
			case InteractionModelingPackage.INTERACTION_SYNTAX__NAME:
				return getName();
			case InteractionModelingPackage.INTERACTION_SYNTAX__INTERACTION_MODEL:
				return getInteractionModel();
			case InteractionModelingPackage.INTERACTION_SYNTAX__CONCRETE_SYNTAX:
				return getConcreteSyntax();
			case InteractionModelingPackage.INTERACTION_SYNTAX__ABSTRACT_SYNTAX:
				return getAbstractSyntax();
			case InteractionModelingPackage.INTERACTION_SYNTAX__OUTSIDE_REF:
				if (resolve) return getOutsideRef();
				return basicGetOutsideRef();
			case InteractionModelingPackage.INTERACTION_SYNTAX__DOCUMENTATION:
				return getDocumentation();
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
			case InteractionModelingPackage.INTERACTION_SYNTAX__NAME:
				setName((String)newValue);
				return;
			case InteractionModelingPackage.INTERACTION_SYNTAX__INTERACTION_MODEL:
				getInteractionModel().clear();
				getInteractionModel().addAll((Collection<? extends InteractionModel>)newValue);
				return;
			case InteractionModelingPackage.INTERACTION_SYNTAX__CONCRETE_SYNTAX:
				getConcreteSyntax().clear();
				getConcreteSyntax().addAll((Collection<? extends ConcreteSyntax>)newValue);
				return;
			case InteractionModelingPackage.INTERACTION_SYNTAX__ABSTRACT_SYNTAX:
				getAbstractSyntax().clear();
				getAbstractSyntax().addAll((Collection<? extends AbstractSyntax>)newValue);
				return;
			case InteractionModelingPackage.INTERACTION_SYNTAX__OUTSIDE_REF:
				setOutsideRef((OutsideRef)newValue);
				return;
			case InteractionModelingPackage.INTERACTION_SYNTAX__DOCUMENTATION:
				getDocumentation().clear();
				getDocumentation().addAll((Collection<? extends Documentation>)newValue);
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
			case InteractionModelingPackage.INTERACTION_SYNTAX__NAME:
				setName(NAME_EDEFAULT);
				return;
			case InteractionModelingPackage.INTERACTION_SYNTAX__INTERACTION_MODEL:
				getInteractionModel().clear();
				return;
			case InteractionModelingPackage.INTERACTION_SYNTAX__CONCRETE_SYNTAX:
				getConcreteSyntax().clear();
				return;
			case InteractionModelingPackage.INTERACTION_SYNTAX__ABSTRACT_SYNTAX:
				getAbstractSyntax().clear();
				return;
			case InteractionModelingPackage.INTERACTION_SYNTAX__OUTSIDE_REF:
				setOutsideRef((OutsideRef)null);
				return;
			case InteractionModelingPackage.INTERACTION_SYNTAX__DOCUMENTATION:
				getDocumentation().clear();
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
			case InteractionModelingPackage.INTERACTION_SYNTAX__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case InteractionModelingPackage.INTERACTION_SYNTAX__INTERACTION_MODEL:
				return interactionModel != null && !interactionModel.isEmpty();
			case InteractionModelingPackage.INTERACTION_SYNTAX__CONCRETE_SYNTAX:
				return concreteSyntax != null && !concreteSyntax.isEmpty();
			case InteractionModelingPackage.INTERACTION_SYNTAX__ABSTRACT_SYNTAX:
				return abstractSyntax != null && !abstractSyntax.isEmpty();
			case InteractionModelingPackage.INTERACTION_SYNTAX__OUTSIDE_REF:
				return outsideRef != null;
			case InteractionModelingPackage.INTERACTION_SYNTAX__DOCUMENTATION:
				return documentation != null && !documentation.isEmpty();
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

} //InteractionSyntaxImpl
