/**
 */
package reactNative.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import reactNative.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ReactNativeFactoryImpl extends EFactoryImpl implements ReactNativeFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ReactNativeFactory init() {
		try {
			ReactNativeFactory theReactNativeFactory = (ReactNativeFactory)EPackage.Registry.INSTANCE.getEFactory(ReactNativePackage.eNS_URI);
			if (theReactNativeFactory != null) {
				return theReactNativeFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ReactNativeFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReactNativeFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ReactNativePackage.VIEW: return createView();
			case ReactNativePackage.TEXT: return createText();
			case ReactNativePackage.FLAT_LIST: return createFlatList();
			case ReactNativePackage.COMPONENT: return createComponent();
			case ReactNativePackage.PROJETO_RN: return createProjetoRN();
			case ReactNativePackage.IMAGE: return createImage();
			case ReactNativePackage.TOUCHABLE_OPACITY: return createTouchableOpacity();
			case ReactNativePackage.ICON: return createIcon();
			case ReactNativePackage.BUTTON: return createButton();
			case ReactNativePackage.STYLE_SHEET: return createStyleSheet();
			case ReactNativePackage.FLEX_BOX: return createFlexBox();
			case ReactNativePackage.FONT: return createFont();
			case ReactNativePackage.SECTION_LIST: return createSectionList();
			case ReactNativePackage.MARGIN: return createMargin();
			case ReactNativePackage.ARRAY: return createArray();
			case ReactNativePackage.ELEMENT_TEXT: return createElementText();
			case ReactNativePackage.ELEMENT_IMAGE: return createElementImage();
			case ReactNativePackage.OBJECT_ELEMENT: return createObjectElement();
			case ReactNativePackage.BORDER: return createBorder();
			case ReactNativePackage.PADDING: return createPadding();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public View createView() {
		ViewImpl view = new ViewImpl();
		return view;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Text createText() {
		TextImpl text = new TextImpl();
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FlatList createFlatList() {
		FlatListImpl flatList = new FlatListImpl();
		return flatList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Component createComponent() {
		ComponentImpl component = new ComponentImpl();
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProjetoRN createProjetoRN() {
		ProjetoRNImpl projetoRN = new ProjetoRNImpl();
		return projetoRN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Image createImage() {
		ImageImpl image = new ImageImpl();
		return image;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TouchableOpacity createTouchableOpacity() {
		TouchableOpacityImpl touchableOpacity = new TouchableOpacityImpl();
		return touchableOpacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Icon createIcon() {
		IconImpl icon = new IconImpl();
		return icon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Button createButton() {
		ButtonImpl button = new ButtonImpl();
		return button;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StyleSheet createStyleSheet() {
		StyleSheetImpl styleSheet = new StyleSheetImpl();
		return styleSheet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FlexBox createFlexBox() {
		FlexBoxImpl flexBox = new FlexBoxImpl();
		return flexBox;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Font createFont() {
		FontImpl font = new FontImpl();
		return font;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SectionList createSectionList() {
		SectionListImpl sectionList = new SectionListImpl();
		return sectionList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Margin createMargin() {
		MarginImpl margin = new MarginImpl();
		return margin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Array createArray() {
		ArrayImpl array = new ArrayImpl();
		return array;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ElementText createElementText() {
		ElementTextImpl elementText = new ElementTextImpl();
		return elementText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ElementImage createElementImage() {
		ElementImageImpl elementImage = new ElementImageImpl();
		return elementImage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ObjectElement createObjectElement() {
		ObjectElementImpl objectElement = new ObjectElementImpl();
		return objectElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Border createBorder() {
		BorderImpl border = new BorderImpl();
		return border;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Padding createPadding() {
		PaddingImpl padding = new PaddingImpl();
		return padding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReactNativePackage getReactNativePackage() {
		return (ReactNativePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ReactNativePackage getPackage() {
		return ReactNativePackage.eINSTANCE;
	}

} //ReactNativeFactoryImpl
