/**
 */
package fr.tpt.useme.architecture.model.usemearch.provider;


import fr.tpt.useme.architecture.model.usemearch.Dsl;
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
 * This is the item provider adapter for a {@link fr.tpt.useme.architecture.model.usemearch.Dsl} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DslItemProvider extends EntityTypeItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DslItemProvider(AdapterFactory adapterFactory) {
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

			addConcreteSyntaxesPropertyDescriptor(object);
			addAbstractsyntaxPropertyDescriptor(object);
			addSupportingToolsPropertyDescriptor(object);
			addOwnedSemanticsPropertyDescriptor(object);
			addOwnedFeatureDiagramsPropertyDescriptor(object);
			addOwnedDocumentationsPropertyDescriptor(object);
			addMaintenanceServicePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Concrete Syntaxes feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConcreteSyntaxesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Dsl_concreteSyntaxes_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Dsl_concreteSyntaxes_feature", "_UI_Dsl_type"),
				 UsemearchPackage.Literals.DSL__CONCRETE_SYNTAXES,
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Abstractsyntax feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAbstractsyntaxPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Dsl_abstractsyntax_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Dsl_abstractsyntax_feature", "_UI_Dsl_type"),
				 UsemearchPackage.Literals.DSL__ABSTRACTSYNTAX,
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Supporting Tools feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSupportingToolsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Dsl_supportingTools_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Dsl_supportingTools_feature", "_UI_Dsl_type"),
				 UsemearchPackage.Literals.DSL__SUPPORTING_TOOLS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Owned Semantics feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOwnedSemanticsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Dsl_ownedSemantics_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Dsl_ownedSemantics_feature", "_UI_Dsl_type"),
				 UsemearchPackage.Literals.DSL__OWNED_SEMANTICS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Owned Feature Diagrams feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOwnedFeatureDiagramsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Dsl_ownedFeatureDiagrams_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Dsl_ownedFeatureDiagrams_feature", "_UI_Dsl_type"),
				 UsemearchPackage.Literals.DSL__OWNED_FEATURE_DIAGRAMS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Owned Documentations feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOwnedDocumentationsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Dsl_ownedDocumentations_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Dsl_ownedDocumentations_feature", "_UI_Dsl_type"),
				 UsemearchPackage.Literals.DSL__OWNED_DOCUMENTATIONS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Maintenance Service feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMaintenanceServicePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Dsl_maintenanceService_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Dsl_maintenanceService_feature", "_UI_Dsl_type"),
				 UsemearchPackage.Literals.DSL__MAINTENANCE_SERVICE,
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
			childrenFeatures.add(UsemearchPackage.Literals.DSL__OWNED_SYNTAXES);
			childrenFeatures.add(UsemearchPackage.Literals.DSL__OWNED_SEMANTICS);
			childrenFeatures.add(UsemearchPackage.Literals.DSL__OWNED_FEATURE_DIAGRAMS);
			childrenFeatures.add(UsemearchPackage.Literals.DSL__OWNED_DOCUMENTATIONS);
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
	 * This returns Dsl.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Dsl"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Dsl)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Dsl_type") :
			getString("_UI_Dsl_type") + " " + label;
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

		switch (notification.getFeatureID(Dsl.class)) {
			case UsemearchPackage.DSL__OWNED_SYNTAXES:
			case UsemearchPackage.DSL__OWNED_SEMANTICS:
			case UsemearchPackage.DSL__OWNED_FEATURE_DIAGRAMS:
			case UsemearchPackage.DSL__OWNED_DOCUMENTATIONS:
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
				(UsemearchPackage.Literals.DSL__OWNED_SYNTAXES,
				 UsemearchFactory.eINSTANCE.createECoreAbstractSyntax()));

		newChildDescriptors.add
			(createChildParameter
				(UsemearchPackage.Literals.DSL__OWNED_SYNTAXES,
				 UsemearchFactory.eINSTANCE.createSiriusConcreteSyntax()));

		newChildDescriptors.add
			(createChildParameter
				(UsemearchPackage.Literals.DSL__OWNED_FEATURE_DIAGRAMS,
				 UsemearchFactory.eINSTANCE.createFeatureDiagram()));
	}

}
