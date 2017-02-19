/**
 */
package fr.tpt.useme.architecture.model.usemearch.provider;


import fr.tpt.useme.architecture.model.usemearch.DslBasedSystemSpecification;
import fr.tpt.useme.architecture.model.usemearch.UsemearchFactory;
import fr.tpt.useme.architecture.model.usemearch.UsemearchPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.tpt.useme.architecture.model.usemearch.DslBasedSystemSpecification} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DslBasedSystemSpecificationItemProvider extends IdentifiedElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DslBasedSystemSpecificationItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addDevelopedDslPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Developed Dsl feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDevelopedDslPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DslBasedSystemSpecification_developedDsl_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DslBasedSystemSpecification_developedDsl_feature", "_UI_DslBasedSystemSpecification_type"),
				 UsemearchPackage.Literals.DSL_BASED_SYSTEM_SPECIFICATION__DEVELOPED_DSL,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(UsemearchPackage.Literals.DSL_BASED_SYSTEM_SPECIFICATION__OWNED_CONTEXTS);
			childrenFeatures.add(UsemearchPackage.Literals.DSL_BASED_SYSTEM_SPECIFICATION__OWNED_CONTEXT_ELEMENT_TYPES);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns DslBasedSystemSpecification.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/DslBasedSystemSpecification"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((DslBasedSystemSpecification)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_DslBasedSystemSpecification_type") :
			getString("_UI_DslBasedSystemSpecification_type") + " " + label;
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(DslBasedSystemSpecification.class)) {
			case UsemearchPackage.DSL_BASED_SYSTEM_SPECIFICATION__OWNED_CONTEXTS:
			case UsemearchPackage.DSL_BASED_SYSTEM_SPECIFICATION__OWNED_CONTEXT_ELEMENT_TYPES:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(UsemearchPackage.Literals.DSL_BASED_SYSTEM_SPECIFICATION__OWNED_CONTEXTS,
				 UsemearchFactory.eINSTANCE.createContextSpecification()));

		newChildDescriptors.add
			(createChildParameter
				(UsemearchPackage.Literals.DSL_BASED_SYSTEM_SPECIFICATION__OWNED_CONTEXT_ELEMENT_TYPES,
				 UsemearchFactory.eINSTANCE.createDsl()));

		newChildDescriptors.add
			(createChildParameter
				(UsemearchPackage.Literals.DSL_BASED_SYSTEM_SPECIFICATION__OWNED_CONTEXT_ELEMENT_TYPES,
				 UsemearchFactory.eINSTANCE.createUser()));

		newChildDescriptors.add
			(createChildParameter
				(UsemearchPackage.Literals.DSL_BASED_SYSTEM_SPECIFICATION__OWNED_CONTEXT_ELEMENT_TYPES,
				 UsemearchFactory.eINSTANCE.createWorkPlace()));

		newChildDescriptors.add
			(createChildParameter
				(UsemearchPackage.Literals.DSL_BASED_SYSTEM_SPECIFICATION__OWNED_CONTEXT_ELEMENT_TYPES,
				 UsemearchFactory.eINSTANCE.createComputer()));

		newChildDescriptors.add
			(createChildParameter
				(UsemearchPackage.Literals.DSL_BASED_SYSTEM_SPECIFICATION__OWNED_CONTEXT_ELEMENT_TYPES,
				 UsemearchFactory.eINSTANCE.createSoftwareTool()));

		newChildDescriptors.add
			(createChildParameter
				(UsemearchPackage.Literals.DSL_BASED_SYSTEM_SPECIFICATION__OWNED_CONTEXT_ELEMENT_TYPES,
				 UsemearchFactory.eINSTANCE.createOperatingSystem()));

		newChildDescriptors.add
			(createChildParameter
				(UsemearchPackage.Literals.DSL_BASED_SYSTEM_SPECIFICATION__OWNED_CONTEXT_ELEMENT_TYPES,
				 UsemearchFactory.eINSTANCE.createModelChecker()));

		newChildDescriptors.add
			(createChildParameter
				(UsemearchPackage.Literals.DSL_BASED_SYSTEM_SPECIFICATION__OWNED_CONTEXT_ELEMENT_TYPES,
				 UsemearchFactory.eINSTANCE.createModelSimulator()));

		newChildDescriptors.add
			(createChildParameter
				(UsemearchPackage.Literals.DSL_BASED_SYSTEM_SPECIFICATION__OWNED_CONTEXT_ELEMENT_TYPES,
				 UsemearchFactory.eINSTANCE.createPhysicalSystem()));
	}

}
