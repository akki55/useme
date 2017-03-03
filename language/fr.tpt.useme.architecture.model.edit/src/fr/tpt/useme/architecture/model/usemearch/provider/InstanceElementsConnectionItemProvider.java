/**
 */
package fr.tpt.useme.architecture.model.usemearch.provider;


import fr.tpt.useme.architecture.model.usemearch.InstanceElementsConnection;
import fr.tpt.useme.architecture.model.usemearch.UsemearchPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;

/**
 * This is the item provider adapter for a {@link fr.tpt.useme.architecture.model.usemearch.InstanceElementsConnection} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class InstanceElementsConnectionItemProvider extends IdentifiedElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstanceElementsConnectionItemProvider(AdapterFactory adapterFactory) {
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

			addSourceFeaturePropertyDescriptor(object);
			addDestinationFeaturePropertyDescriptor(object);
			addSourceInstanceElementPropertyDescriptor(object);
			addDestinationInstanceElementPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Source Feature feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSourceFeaturePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_InstanceElementsConnection_sourceFeature_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_InstanceElementsConnection_sourceFeature_feature", "_UI_InstanceElementsConnection_type"),
				 UsemearchPackage.Literals.INSTANCE_ELEMENTS_CONNECTION__SOURCE_FEATURE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Destination Feature feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDestinationFeaturePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_InstanceElementsConnection_destinationFeature_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_InstanceElementsConnection_destinationFeature_feature", "_UI_InstanceElementsConnection_type"),
				 UsemearchPackage.Literals.INSTANCE_ELEMENTS_CONNECTION__DESTINATION_FEATURE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Source Instance Element feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSourceInstanceElementPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_InstanceElementsConnection_sourceInstanceElement_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_InstanceElementsConnection_sourceInstanceElement_feature", "_UI_InstanceElementsConnection_type"),
				 UsemearchPackage.Literals.INSTANCE_ELEMENTS_CONNECTION__SOURCE_INSTANCE_ELEMENT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Destination Instance Element feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDestinationInstanceElementPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_InstanceElementsConnection_destinationInstanceElement_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_InstanceElementsConnection_destinationInstanceElement_feature", "_UI_InstanceElementsConnection_type"),
				 UsemearchPackage.Literals.INSTANCE_ELEMENTS_CONNECTION__DESTINATION_INSTANCE_ELEMENT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This returns InstanceElementsConnection.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/InstanceElementsConnection"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((InstanceElementsConnection)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_InstanceElementsConnection_type") :
			getString("_UI_InstanceElementsConnection_type") + " " + label;
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
	}

}
