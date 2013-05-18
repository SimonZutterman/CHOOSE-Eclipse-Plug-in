/**
 */
package chooseeditor.provider;


import chooseeditor.ChooseeditorFactory;
import chooseeditor.ChooseeditorPackage;
import chooseeditor.Diagram;

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

/**
 * This is the item provider adapter for a {@link chooseeditor.Diagram} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DiagramItemProvider
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
	public DiagramItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(ChooseeditorPackage.Literals.DIAGRAM__GOALS);
			childrenFeatures.add(ChooseeditorPackage.Literals.DIAGRAM__REFINEMENTS);
			childrenFeatures.add(ChooseeditorPackage.Literals.DIAGRAM__ACTORS);
			childrenFeatures.add(ChooseeditorPackage.Literals.DIAGRAM__OBJECTS);
			childrenFeatures.add(ChooseeditorPackage.Literals.DIAGRAM__OPERATIONS);
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
	 * This returns Diagram.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Diagram"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_Diagram_type");
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

		switch (notification.getFeatureID(Diagram.class)) {
			case ChooseeditorPackage.DIAGRAM__GOALS:
			case ChooseeditorPackage.DIAGRAM__REFINEMENTS:
			case ChooseeditorPackage.DIAGRAM__ACTORS:
			case ChooseeditorPackage.DIAGRAM__OBJECTS:
			case ChooseeditorPackage.DIAGRAM__OPERATIONS:
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
				(ChooseeditorPackage.Literals.DIAGRAM__GOALS,
				 ChooseeditorFactory.eINSTANCE.createGoal()));

		newChildDescriptors.add
			(createChildParameter
				(ChooseeditorPackage.Literals.DIAGRAM__REFINEMENTS,
				 ChooseeditorFactory.eINSTANCE.createRefinement()));

		newChildDescriptors.add
			(createChildParameter
				(ChooseeditorPackage.Literals.DIAGRAM__ACTORS,
				 ChooseeditorFactory.eINSTANCE.createActorContainer()));

		newChildDescriptors.add
			(createChildParameter
				(ChooseeditorPackage.Literals.DIAGRAM__ACTORS,
				 ChooseeditorFactory.eINSTANCE.createActor()));

		newChildDescriptors.add
			(createChildParameter
				(ChooseeditorPackage.Literals.DIAGRAM__ACTORS,
				 ChooseeditorFactory.eINSTANCE.createHumanActor()));

		newChildDescriptors.add
			(createChildParameter
				(ChooseeditorPackage.Literals.DIAGRAM__ACTORS,
				 ChooseeditorFactory.eINSTANCE.createRole()));

		newChildDescriptors.add
			(createChildParameter
				(ChooseeditorPackage.Literals.DIAGRAM__ACTORS,
				 ChooseeditorFactory.eINSTANCE.createDevice()));

		newChildDescriptors.add
			(createChildParameter
				(ChooseeditorPackage.Literals.DIAGRAM__ACTORS,
				 ChooseeditorFactory.eINSTANCE.createSoftwareActor()));

		newChildDescriptors.add
			(createChildParameter
				(ChooseeditorPackage.Literals.DIAGRAM__OBJECTS,
				 ChooseeditorFactory.eINSTANCE.createObject()));

		newChildDescriptors.add
			(createChildParameter
				(ChooseeditorPackage.Literals.DIAGRAM__OPERATIONS,
				 ChooseeditorFactory.eINSTANCE.createOperationContainer()));

		newChildDescriptors.add
			(createChildParameter
				(ChooseeditorPackage.Literals.DIAGRAM__OPERATIONS,
				 ChooseeditorFactory.eINSTANCE.createOperation()));

		newChildDescriptors.add
			(createChildParameter
				(ChooseeditorPackage.Literals.DIAGRAM__OPERATIONS,
				 ChooseeditorFactory.eINSTANCE.createProcess()));

		newChildDescriptors.add
			(createChildParameter
				(ChooseeditorPackage.Literals.DIAGRAM__OPERATIONS,
				 ChooseeditorFactory.eINSTANCE.createProject()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return ChooseEditorEditPlugin.INSTANCE;
	}

}
