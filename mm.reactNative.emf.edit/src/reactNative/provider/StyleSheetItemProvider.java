/**
 */
package reactNative.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import reactNative.ReactNativeFactory;
import reactNative.ReactNativePackage;
import reactNative.StyleSheet;

/**
 * This is the item provider adapter for a {@link reactNative.StyleSheet} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class StyleSheetItemProvider 
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
	public StyleSheetItemProvider(AdapterFactory adapterFactory) {
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

			addNameStylePropertyDescriptor(object);
			addHasMarginPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name Style feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNameStylePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_StyleSheet_nameStyle_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_StyleSheet_nameStyle_feature", "_UI_StyleSheet_type"),
				 ReactNativePackage.Literals.STYLE_SHEET__NAME_STYLE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Has Margin feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHasMarginPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_StyleSheet_hasMargin_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_StyleSheet_hasMargin_feature", "_UI_StyleSheet_type"),
				 ReactNativePackage.Literals.STYLE_SHEET__HAS_MARGIN,
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
			childrenFeatures.add(ReactNativePackage.Literals.STYLE_SHEET__HAS_FLEXBOX);
			childrenFeatures.add(ReactNativePackage.Literals.STYLE_SHEET__HAS_FONT);
			childrenFeatures.add(ReactNativePackage.Literals.STYLE_SHEET__HAS_MARGIN);
			childrenFeatures.add(ReactNativePackage.Literals.STYLE_SHEET__HAS_BORDER);
			childrenFeatures.add(ReactNativePackage.Literals.STYLE_SHEET__HAS_PADDING);
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
	 * This returns StyleSheet.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/StyleSheet"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((StyleSheet)object).getNameStyle();
		return label == null || label.length() == 0 ?
			getString("_UI_StyleSheet_type") :
			getString("_UI_StyleSheet_type") + " " + label;
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

		switch (notification.getFeatureID(StyleSheet.class)) {
			case ReactNativePackage.STYLE_SHEET__NAME_STYLE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case ReactNativePackage.STYLE_SHEET__HAS_FLEXBOX:
			case ReactNativePackage.STYLE_SHEET__HAS_FONT:
			case ReactNativePackage.STYLE_SHEET__HAS_MARGIN:
			case ReactNativePackage.STYLE_SHEET__HAS_BORDER:
			case ReactNativePackage.STYLE_SHEET__HAS_PADDING:
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
				(ReactNativePackage.Literals.STYLE_SHEET__HAS_FLEXBOX,
				 ReactNativeFactory.eINSTANCE.createFlexBox()));

		newChildDescriptors.add
			(createChildParameter
				(ReactNativePackage.Literals.STYLE_SHEET__HAS_FONT,
				 ReactNativeFactory.eINSTANCE.createFont()));

		newChildDescriptors.add
			(createChildParameter
				(ReactNativePackage.Literals.STYLE_SHEET__HAS_MARGIN,
				 ReactNativeFactory.eINSTANCE.createMargin()));

		newChildDescriptors.add
			(createChildParameter
				(ReactNativePackage.Literals.STYLE_SHEET__HAS_BORDER,
				 ReactNativeFactory.eINSTANCE.createBorder()));

		newChildDescriptors.add
			(createChildParameter
				(ReactNativePackage.Literals.STYLE_SHEET__HAS_PADDING,
				 ReactNativeFactory.eINSTANCE.createPadding()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return ReactNativeEditPlugin.INSTANCE;
	}

}
