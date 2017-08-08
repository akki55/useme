/**
 */
package pt.fct.unl.novalincs.useme.model.EvaluationModeling.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;

import pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationDocumentation;
import pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationModelingPackage;

import pt.fct.unl.novalincs.useme.model.UseMe.provider.UseMeEditPlugin;

import pt.fct.unl.novalincs.useme.model.Utility.provider.DocumentationItemProvider;

/**
 * This is the item provider adapter for a {@link pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationDocumentation} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class EvaluationDocumentationItemProvider extends DocumentationItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvaluationDocumentationItemProvider(AdapterFactory adapterFactory) {
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

			addEvaluationModelPropertyDescriptor(object);
			addScenarioPropertyDescriptor(object);
			addRelatedDocumentationPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Evaluation Model feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEvaluationModelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EvaluationDocumentation_evaluationModel_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EvaluationDocumentation_evaluationModel_feature", "_UI_EvaluationDocumentation_type"),
				 EvaluationModelingPackage.Literals.EVALUATION_DOCUMENTATION__EVALUATION_MODEL,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Scenario feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addScenarioPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EvaluationDocumentation_scenario_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EvaluationDocumentation_scenario_feature", "_UI_EvaluationDocumentation_type"),
				 EvaluationModelingPackage.Literals.EVALUATION_DOCUMENTATION__SCENARIO,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Related Documentation feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRelatedDocumentationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EvaluationDocumentation_relatedDocumentation_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EvaluationDocumentation_relatedDocumentation_feature", "_UI_EvaluationDocumentation_type"),
				 EvaluationModelingPackage.Literals.EVALUATION_DOCUMENTATION__RELATED_DOCUMENTATION,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This returns EvaluationDocumentation.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/EvaluationDocumentation"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((EvaluationDocumentation)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_EvaluationDocumentation_type") :
			getString("_UI_EvaluationDocumentation_type") + " " + label;
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

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return UseMeEditPlugin.INSTANCE;
	}

}
