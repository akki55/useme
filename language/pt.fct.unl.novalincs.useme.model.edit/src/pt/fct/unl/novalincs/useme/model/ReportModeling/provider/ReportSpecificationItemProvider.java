/**
 */
package pt.fct.unl.novalincs.useme.model.ReportModeling.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import pt.fct.unl.novalincs.useme.model.InteractionModeling.InteractionModelingFactory;

import pt.fct.unl.novalincs.useme.model.ReportModeling.ReportModelingFactory;
import pt.fct.unl.novalincs.useme.model.ReportModeling.ReportModelingPackage;
import pt.fct.unl.novalincs.useme.model.ReportModeling.ReportSpecification;

import pt.fct.unl.novalincs.useme.model.SurveyModeling.SurveyModelingFactory;

import pt.fct.unl.novalincs.useme.model.UseMe.provider.UseMeEditPlugin;

/**
 * This is the item provider adapter for a {@link pt.fct.unl.novalincs.useme.model.ReportModeling.ReportSpecification} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ReportSpecificationItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReportSpecificationItemProvider(AdapterFactory adapterFactory) {
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

		}
		return itemPropertyDescriptors;
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
			childrenFeatures.add(ReportModelingPackage.Literals.REPORT_SPECIFICATION__REPORT_MODEL);
			childrenFeatures.add(ReportModelingPackage.Literals.REPORT_SPECIFICATION__RECOMMENDED_GM);
			childrenFeatures.add(ReportModelingPackage.Literals.REPORT_SPECIFICATION__EVALUATION_RESULT);
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
	 * This returns ReportSpecification.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ReportSpecification"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_ReportSpecification_type");
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

		switch (notification.getFeatureID(ReportSpecification.class)) {
			case ReportModelingPackage.REPORT_SPECIFICATION__REPORT_MODEL:
			case ReportModelingPackage.REPORT_SPECIFICATION__RECOMMENDED_GM:
			case ReportModelingPackage.REPORT_SPECIFICATION__EVALUATION_RESULT:
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
				(ReportModelingPackage.Literals.REPORT_SPECIFICATION__REPORT_MODEL,
				 ReportModelingFactory.eINSTANCE.createReportModel()));

		newChildDescriptors.add
			(createChildParameter
				(ReportModelingPackage.Literals.REPORT_SPECIFICATION__RECOMMENDED_GM,
				 ReportModelingFactory.eINSTANCE.createRecommendGM()));

		newChildDescriptors.add
			(createChildParameter
				(ReportModelingPackage.Literals.REPORT_SPECIFICATION__EVALUATION_RESULT,
				 ReportModelingFactory.eINSTANCE.createEvaluationResultAbstract()));

		newChildDescriptors.add
			(createChildParameter
				(ReportModelingPackage.Literals.REPORT_SPECIFICATION__EVALUATION_RESULT,
				 ReportModelingFactory.eINSTANCE.createEvaluationResult()));

		newChildDescriptors.add
			(createChildParameter
				(ReportModelingPackage.Literals.REPORT_SPECIFICATION__EVALUATION_RESULT,
				 InteractionModelingFactory.eINSTANCE.createInteractionResult()));

		newChildDescriptors.add
			(createChildParameter
				(ReportModelingPackage.Literals.REPORT_SPECIFICATION__EVALUATION_RESULT,
				 SurveyModelingFactory.eINSTANCE.createSurveyResult()));
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
