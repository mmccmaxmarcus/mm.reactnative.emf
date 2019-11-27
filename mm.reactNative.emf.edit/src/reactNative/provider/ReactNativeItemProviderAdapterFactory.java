/**
 */
package reactNative.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

import reactNative.util.ReactNativeAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ReactNativeItemProviderAdapterFactory extends ReactNativeAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReactNativeItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link reactNative.View} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ViewItemProvider viewItemProvider;

	/**
	 * This creates an adapter for a {@link reactNative.View}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createViewAdapter() {
		if (viewItemProvider == null) {
			viewItemProvider = new ViewItemProvider(this);
		}

		return viewItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link reactNative.Text} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TextItemProvider textItemProvider;

	/**
	 * This creates an adapter for a {@link reactNative.Text}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTextAdapter() {
		if (textItemProvider == null) {
			textItemProvider = new TextItemProvider(this);
		}

		return textItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link reactNative.FlatList} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FlatListItemProvider flatListItemProvider;

	/**
	 * This creates an adapter for a {@link reactNative.FlatList}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFlatListAdapter() {
		if (flatListItemProvider == null) {
			flatListItemProvider = new FlatListItemProvider(this);
		}

		return flatListItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link reactNative.Component} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentItemProvider componentItemProvider;

	/**
	 * This creates an adapter for a {@link reactNative.Component}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createComponentAdapter() {
		if (componentItemProvider == null) {
			componentItemProvider = new ComponentItemProvider(this);
		}

		return componentItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link reactNative.ProjetoRN} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProjetoRNItemProvider projetoRNItemProvider;

	/**
	 * This creates an adapter for a {@link reactNative.ProjetoRN}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createProjetoRNAdapter() {
		if (projetoRNItemProvider == null) {
			projetoRNItemProvider = new ProjetoRNItemProvider(this);
		}

		return projetoRNItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link reactNative.Image} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImageItemProvider imageItemProvider;

	/**
	 * This creates an adapter for a {@link reactNative.Image}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createImageAdapter() {
		if (imageItemProvider == null) {
			imageItemProvider = new ImageItemProvider(this);
		}

		return imageItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link reactNative.TouchableOpacity} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TouchableOpacityItemProvider touchableOpacityItemProvider;

	/**
	 * This creates an adapter for a {@link reactNative.TouchableOpacity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTouchableOpacityAdapter() {
		if (touchableOpacityItemProvider == null) {
			touchableOpacityItemProvider = new TouchableOpacityItemProvider(this);
		}

		return touchableOpacityItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link reactNative.Icon} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IconItemProvider iconItemProvider;

	/**
	 * This creates an adapter for a {@link reactNative.Icon}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createIconAdapter() {
		if (iconItemProvider == null) {
			iconItemProvider = new IconItemProvider(this);
		}

		return iconItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link reactNative.Button} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ButtonItemProvider buttonItemProvider;

	/**
	 * This creates an adapter for a {@link reactNative.Button}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createButtonAdapter() {
		if (buttonItemProvider == null) {
			buttonItemProvider = new ButtonItemProvider(this);
		}

		return buttonItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link reactNative.StyleSheet} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StyleSheetItemProvider styleSheetItemProvider;

	/**
	 * This creates an adapter for a {@link reactNative.StyleSheet}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createStyleSheetAdapter() {
		if (styleSheetItemProvider == null) {
			styleSheetItemProvider = new StyleSheetItemProvider(this);
		}

		return styleSheetItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link reactNative.FlexBox} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FlexBoxItemProvider flexBoxItemProvider;

	/**
	 * This creates an adapter for a {@link reactNative.FlexBox}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFlexBoxAdapter() {
		if (flexBoxItemProvider == null) {
			flexBoxItemProvider = new FlexBoxItemProvider(this);
		}

		return flexBoxItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link reactNative.Font} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FontItemProvider fontItemProvider;

	/**
	 * This creates an adapter for a {@link reactNative.Font}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFontAdapter() {
		if (fontItemProvider == null) {
			fontItemProvider = new FontItemProvider(this);
		}

		return fontItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link reactNative.SectionList} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SectionListItemProvider sectionListItemProvider;

	/**
	 * This creates an adapter for a {@link reactNative.SectionList}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSectionListAdapter() {
		if (sectionListItemProvider == null) {
			sectionListItemProvider = new SectionListItemProvider(this);
		}

		return sectionListItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link reactNative.Margin} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MarginItemProvider marginItemProvider;

	/**
	 * This creates an adapter for a {@link reactNative.Margin}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMarginAdapter() {
		if (marginItemProvider == null) {
			marginItemProvider = new MarginItemProvider(this);
		}

		return marginItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link reactNative.Array} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArrayItemProvider arrayItemProvider;

	/**
	 * This creates an adapter for a {@link reactNative.Array}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createArrayAdapter() {
		if (arrayItemProvider == null) {
			arrayItemProvider = new ArrayItemProvider(this);
		}

		return arrayItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link reactNative.ElementText} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElementTextItemProvider elementTextItemProvider;

	/**
	 * This creates an adapter for a {@link reactNative.ElementText}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createElementTextAdapter() {
		if (elementTextItemProvider == null) {
			elementTextItemProvider = new ElementTextItemProvider(this);
		}

		return elementTextItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link reactNative.ElementImage} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElementImageItemProvider elementImageItemProvider;

	/**
	 * This creates an adapter for a {@link reactNative.ElementImage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createElementImageAdapter() {
		if (elementImageItemProvider == null) {
			elementImageItemProvider = new ElementImageItemProvider(this);
		}

		return elementImageItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link reactNative.ObjectElement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjectElementItemProvider objectElementItemProvider;

	/**
	 * This creates an adapter for a {@link reactNative.ObjectElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createObjectElementAdapter() {
		if (objectElementItemProvider == null) {
			objectElementItemProvider = new ObjectElementItemProvider(this);
		}

		return objectElementItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link reactNative.Border} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BorderItemProvider borderItemProvider;

	/**
	 * This creates an adapter for a {@link reactNative.Border}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBorderAdapter() {
		if (borderItemProvider == null) {
			borderItemProvider = new BorderItemProvider(this);
		}

		return borderItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link reactNative.Padding} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PaddingItemProvider paddingItemProvider;

	/**
	 * This creates an adapter for a {@link reactNative.Padding}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPaddingAdapter() {
		if (paddingItemProvider == null) {
			paddingItemProvider = new PaddingItemProvider(this);
		}

		return paddingItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void dispose() {
		if (viewItemProvider != null) viewItemProvider.dispose();
		if (textItemProvider != null) textItemProvider.dispose();
		if (flatListItemProvider != null) flatListItemProvider.dispose();
		if (componentItemProvider != null) componentItemProvider.dispose();
		if (projetoRNItemProvider != null) projetoRNItemProvider.dispose();
		if (imageItemProvider != null) imageItemProvider.dispose();
		if (touchableOpacityItemProvider != null) touchableOpacityItemProvider.dispose();
		if (iconItemProvider != null) iconItemProvider.dispose();
		if (buttonItemProvider != null) buttonItemProvider.dispose();
		if (styleSheetItemProvider != null) styleSheetItemProvider.dispose();
		if (flexBoxItemProvider != null) flexBoxItemProvider.dispose();
		if (fontItemProvider != null) fontItemProvider.dispose();
		if (sectionListItemProvider != null) sectionListItemProvider.dispose();
		if (marginItemProvider != null) marginItemProvider.dispose();
		if (arrayItemProvider != null) arrayItemProvider.dispose();
		if (elementTextItemProvider != null) elementTextItemProvider.dispose();
		if (elementImageItemProvider != null) elementImageItemProvider.dispose();
		if (objectElementItemProvider != null) objectElementItemProvider.dispose();
		if (borderItemProvider != null) borderItemProvider.dispose();
		if (paddingItemProvider != null) paddingItemProvider.dispose();
	}

}
