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
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public View createView() {
		ViewImpl view = new ViewImpl();
		return view;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Text createText() {
		TextImpl text = new TextImpl();
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlatList createFlatList() {
		FlatListImpl flatList = new FlatListImpl();
		return flatList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component createComponent() {
		ComponentImpl component = new ComponentImpl();
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProjetoRN createProjetoRN() {
		ProjetoRNImpl projetoRN = new ProjetoRNImpl();
		return projetoRN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Image createImage() {
		ImageImpl image = new ImageImpl();
		return image;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TouchableOpacity createTouchableOpacity() {
		TouchableOpacityImpl touchableOpacity = new TouchableOpacityImpl();
		return touchableOpacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Icon createIcon() {
		IconImpl icon = new IconImpl();
		return icon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Button createButton() {
		ButtonImpl button = new ButtonImpl();
		return button;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StyleSheet createStyleSheet() {
		StyleSheetImpl styleSheet = new StyleSheetImpl();
		return styleSheet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlexBox createFlexBox() {
		FlexBoxImpl flexBox = new FlexBoxImpl();
		return flexBox;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Font createFont() {
		FontImpl font = new FontImpl();
		return font;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
