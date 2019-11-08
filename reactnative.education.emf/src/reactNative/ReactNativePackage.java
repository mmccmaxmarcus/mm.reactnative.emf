/**
 */
package reactNative;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see reactNative.ReactNativeFactory
 * @model kind="package"
 * @generated
 */
public interface ReactNativePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "reactNative";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/reactNative";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "reactNative";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ReactNativePackage eINSTANCE = reactNative.impl.ReactNativePackageImpl.init();

	/**
	 * The meta object id for the '{@link reactNative.impl.ViewImpl <em>View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see reactNative.impl.ViewImpl
	 * @see reactNative.impl.ReactNativePackageImpl#getView()
	 * @generated
	 */
	int VIEW = 0;

	/**
	 * The feature id for the '<em><b>Has Text</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__HAS_TEXT = 0;

	/**
	 * The feature id for the '<em><b>View Toflatlists</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__VIEW_TOFLATLISTS = 1;

	/**
	 * The feature id for the '<em><b>View Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__VIEW_TYPE = 2;

	/**
	 * The feature id for the '<em><b>View Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__VIEW_NAME = 3;

	/**
	 * The feature id for the '<em><b>Has Image</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__HAS_IMAGE = 4;

	/**
	 * The feature id for the '<em><b>View To Touchable Opacity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__VIEW_TO_TOUCHABLE_OPACITY = 5;

	/**
	 * The feature id for the '<em><b>View To Icon</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__VIEW_TO_ICON = 6;

	/**
	 * The feature id for the '<em><b>View To Button</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__VIEW_TO_BUTTON = 7;

	/**
	 * The feature id for the '<em><b>Sub View</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__SUB_VIEW = 8;

	/**
	 * The feature id for the '<em><b>View To Style Sheet</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__VIEW_TO_STYLE_SHEET = 9;

	/**
	 * The number of structural features of the '<em>View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_FEATURE_COUNT = 10;

	/**
	 * The operation id for the '<em>Style</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW___STYLE__STYLESHEET = 0;

	/**
	 * The number of operations of the '<em>View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link reactNative.impl.TextImpl <em>Text</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see reactNative.impl.TextImpl
	 * @see reactNative.impl.ReactNativePackageImpl#getText()
	 * @generated
	 */
	int TEXT = 1;

	/**
	 * The feature id for the '<em><b>Content Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__CONTENT_TEXT = 0;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__COLOR = 1;

	/**
	 * The feature id for the '<em><b>Font Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__FONT_SIZE = 2;

	/**
	 * The feature id for the '<em><b>Text Align</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__TEXT_ALIGN = 3;

	/**
	 * The feature id for the '<em><b>Sub Text</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__SUB_TEXT = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__NAME = 5;

	/**
	 * The feature id for the '<em><b>Text To Stylesheet</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__TEXT_TO_STYLESHEET = 6;

	/**
	 * The number of structural features of the '<em>Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link reactNative.impl.FlatListImpl <em>Flat List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see reactNative.impl.FlatListImpl
	 * @see reactNative.impl.ReactNativePackageImpl#getFlatList()
	 * @generated
	 */
	int FLAT_LIST = 2;

	/**
	 * The feature id for the '<em><b>Has Views</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLAT_LIST__HAS_VIEWS = 0;

	/**
	 * The feature id for the '<em><b>Flat List Text</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLAT_LIST__FLAT_LIST_TEXT = 1;

	/**
	 * The feature id for the '<em><b>Flatlist Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLAT_LIST__FLATLIST_NAME = 2;

	/**
	 * The feature id for the '<em><b>Image</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLAT_LIST__IMAGE = 3;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLAT_LIST__DATA = 4;

	/**
	 * The feature id for the '<em><b>Render Item</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLAT_LIST__RENDER_ITEM = 5;

	/**
	 * The feature id for the '<em><b>Key Extractor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLAT_LIST__KEY_EXTRACTOR = 6;

	/**
	 * The number of structural features of the '<em>Flat List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLAT_LIST_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Flat List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLAT_LIST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link reactNative.impl.ComponentImpl <em>Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see reactNative.impl.ComponentImpl
	 * @see reactNative.impl.ReactNativePackageImpl#getComponent()
	 * @generated
	 */
	int COMPONENT = 3;

	/**
	 * The feature id for the '<em><b>Component Totext</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__COMPONENT_TOTEXT = 0;

	/**
	 * The feature id for the '<em><b>Component Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__COMPONENT_NAME = 1;

	/**
	 * The feature id for the '<em><b>Component To View</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__COMPONENT_TO_VIEW = 2;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__STATE = 3;

	/**
	 * The feature id for the '<em><b>Component To Touchable Opacity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__COMPONENT_TO_TOUCHABLE_OPACITY = 4;

	/**
	 * The number of structural features of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link reactNative.impl.ProjetoRNImpl <em>Projeto RN</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see reactNative.impl.ProjetoRNImpl
	 * @see reactNative.impl.ReactNativePackageImpl#getProjetoRN()
	 * @generated
	 */
	int PROJETO_RN = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJETO_RN__NAME = 0;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJETO_RN__COMPONENTS = 1;

	/**
	 * The number of structural features of the '<em>Projeto RN</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJETO_RN_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Projeto RN</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJETO_RN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link reactNative.impl.ImageImpl <em>Image</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see reactNative.impl.ImageImpl
	 * @see reactNative.impl.ReactNativePackageImpl#getImage()
	 * @generated
	 */
	int IMAGE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__SOURCE = 1;

	/**
	 * The feature id for the '<em><b>Sub Image</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__SUB_IMAGE = 2;

	/**
	 * The feature id for the '<em><b>Image Tostylesheet</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__IMAGE_TOSTYLESHEET = 3;

	/**
	 * The number of structural features of the '<em>Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link reactNative.impl.TouchablesGenericsImpl <em>Touchables Generics</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see reactNative.impl.TouchablesGenericsImpl
	 * @see reactNative.impl.ReactNativePackageImpl#getTouchablesGenerics()
	 * @generated
	 */
	int TOUCHABLES_GENERICS = 8;

	/**
	 * The feature id for the '<em><b>On Press</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCHABLES_GENERICS__ON_PRESS = 0;

	/**
	 * The number of structural features of the '<em>Touchables Generics</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCHABLES_GENERICS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Touchables Generics</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCHABLES_GENERICS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link reactNative.impl.TouchableOpacityImpl <em>Touchable Opacity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see reactNative.impl.TouchableOpacityImpl
	 * @see reactNative.impl.ReactNativePackageImpl#getTouchableOpacity()
	 * @generated
	 */
	int TOUCHABLE_OPACITY = 6;

	/**
	 * The feature id for the '<em><b>On Press</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCHABLE_OPACITY__ON_PRESS = TOUCHABLES_GENERICS__ON_PRESS;

	/**
	 * The feature id for the '<em><b>Touchable Opacity To Icon</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCHABLE_OPACITY__TOUCHABLE_OPACITY_TO_ICON = TOUCHABLES_GENERICS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Touchable Opacity To Image</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCHABLE_OPACITY__TOUCHABLE_OPACITY_TO_IMAGE = TOUCHABLES_GENERICS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Touchable Opacity To Text</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCHABLE_OPACITY__TOUCHABLE_OPACITY_TO_TEXT = TOUCHABLES_GENERICS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Touchable Opacity View</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCHABLE_OPACITY__TOUCHABLE_OPACITY_VIEW = TOUCHABLES_GENERICS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Touchable Opacity To Button</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCHABLE_OPACITY__TOUCHABLE_OPACITY_TO_BUTTON = TOUCHABLES_GENERICS_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Touchable Opacity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCHABLE_OPACITY_FEATURE_COUNT = TOUCHABLES_GENERICS_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Touchable Opacity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCHABLE_OPACITY_OPERATION_COUNT = TOUCHABLES_GENERICS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link reactNative.impl.IconImpl <em>Icon</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see reactNative.impl.IconImpl
	 * @see reactNative.impl.ReactNativePackageImpl#getIcon()
	 * @generated
	 */
	int ICON = 7;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICON__STYLE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICON__NAME = 1;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICON__SIZE = 2;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICON__COLOR = 3;

	/**
	 * The feature id for the '<em><b>Icon To Stylesheet</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICON__ICON_TO_STYLESHEET = 4;

	/**
	 * The number of structural features of the '<em>Icon</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICON_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Icon</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICON_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link reactNative.impl.ButtonImpl <em>Button</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see reactNative.impl.ButtonImpl
	 * @see reactNative.impl.ReactNativePackageImpl#getButton()
	 * @generated
	 */
	int BUTTON = 9;

	/**
	 * The feature id for the '<em><b>On Press</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__ON_PRESS = TOUCHABLES_GENERICS__ON_PRESS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__TITLE = TOUCHABLES_GENERICS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__COLOR = TOUCHABLES_GENERICS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__DISABLED = TOUCHABLES_GENERICS_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_FEATURE_COUNT = TOUCHABLES_GENERICS_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_OPERATION_COUNT = TOUCHABLES_GENERICS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link reactNative.impl.StyleSheetImpl <em>Style Sheet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see reactNative.impl.StyleSheetImpl
	 * @see reactNative.impl.ReactNativePackageImpl#getStyleSheet()
	 * @generated
	 */
	int STYLE_SHEET = 10;

	/**
	 * The feature id for the '<em><b>Name Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_SHEET__NAME_STYLE = 0;

	/**
	 * The feature id for the '<em><b>Has Flexbox</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_SHEET__HAS_FLEXBOX = 1;

	/**
	 * The feature id for the '<em><b>Has Font</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_SHEET__HAS_FONT = 2;

	/**
	 * The number of structural features of the '<em>Style Sheet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_SHEET_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Style Sheet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_SHEET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link reactNative.impl.FlexBoxImpl <em>Flex Box</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see reactNative.impl.FlexBoxImpl
	 * @see reactNative.impl.ReactNativePackageImpl#getFlexBox()
	 * @generated
	 */
	int FLEX_BOX = 11;

	/**
	 * The feature id for the '<em><b>Flex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLEX_BOX__FLEX = 0;

	/**
	 * The feature id for the '<em><b>Flex Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLEX_BOX__FLEX_DIRECTION = 1;

	/**
	 * The feature id for the '<em><b>Justify Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLEX_BOX__JUSTIFY_CONTENT = 2;

	/**
	 * The feature id for the '<em><b>Align Items</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLEX_BOX__ALIGN_ITEMS = 3;

	/**
	 * The number of structural features of the '<em>Flex Box</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLEX_BOX_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Flex Box</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLEX_BOX_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link reactNative.impl.FontImpl <em>Font</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see reactNative.impl.FontImpl
	 * @see reactNative.impl.ReactNativePackageImpl#getFont()
	 * @generated
	 */
	int FONT = 12;

	/**
	 * The feature id for the '<em><b>Font Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FONT__FONT_SIZE = 0;

	/**
	 * The feature id for the '<em><b>Font Family</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FONT__FONT_FAMILY = 1;

	/**
	 * The feature id for the '<em><b>Font Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FONT__FONT_WEIGHT = 2;

	/**
	 * The number of structural features of the '<em>Font</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FONT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Font</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FONT_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link reactNative.View <em>View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>View</em>'.
	 * @see reactNative.View
	 * @generated
	 */
	EClass getView();

	/**
	 * Returns the meta object for the containment reference list '{@link reactNative.View#getHasText <em>Has Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Text</em>'.
	 * @see reactNative.View#getHasText()
	 * @see #getView()
	 * @generated
	 */
	EReference getView_HasText();

	/**
	 * Returns the meta object for the containment reference list '{@link reactNative.View#getViewToflatlists <em>View Toflatlists</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>View Toflatlists</em>'.
	 * @see reactNative.View#getViewToflatlists()
	 * @see #getView()
	 * @generated
	 */
	EReference getView_ViewToflatlists();

	/**
	 * Returns the meta object for the attribute '{@link reactNative.View#getViewType <em>View Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>View Type</em>'.
	 * @see reactNative.View#getViewType()
	 * @see #getView()
	 * @generated
	 */
	EAttribute getView_ViewType();

	/**
	 * Returns the meta object for the attribute '{@link reactNative.View#getViewName <em>View Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>View Name</em>'.
	 * @see reactNative.View#getViewName()
	 * @see #getView()
	 * @generated
	 */
	EAttribute getView_ViewName();

	/**
	 * Returns the meta object for the containment reference list '{@link reactNative.View#getHasImage <em>Has Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Image</em>'.
	 * @see reactNative.View#getHasImage()
	 * @see #getView()
	 * @generated
	 */
	EReference getView_HasImage();

	/**
	 * Returns the meta object for the containment reference list '{@link reactNative.View#getViewToTouchableOpacity <em>View To Touchable Opacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>View To Touchable Opacity</em>'.
	 * @see reactNative.View#getViewToTouchableOpacity()
	 * @see #getView()
	 * @generated
	 */
	EReference getView_ViewToTouchableOpacity();

	/**
	 * Returns the meta object for the containment reference list '{@link reactNative.View#getViewToIcon <em>View To Icon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>View To Icon</em>'.
	 * @see reactNative.View#getViewToIcon()
	 * @see #getView()
	 * @generated
	 */
	EReference getView_ViewToIcon();

	/**
	 * Returns the meta object for the containment reference list '{@link reactNative.View#getViewToButton <em>View To Button</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>View To Button</em>'.
	 * @see reactNative.View#getViewToButton()
	 * @see #getView()
	 * @generated
	 */
	EReference getView_ViewToButton();

	/**
	 * Returns the meta object for the containment reference list '{@link reactNative.View#getSubView <em>Sub View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub View</em>'.
	 * @see reactNative.View#getSubView()
	 * @see #getView()
	 * @generated
	 */
	EReference getView_SubView();

	/**
	 * Returns the meta object for the containment reference list '{@link reactNative.View#getViewToStyleSheet <em>View To Style Sheet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>View To Style Sheet</em>'.
	 * @see reactNative.View#getViewToStyleSheet()
	 * @see #getView()
	 * @generated
	 */
	EReference getView_ViewToStyleSheet();

	/**
	 * Returns the meta object for the '{@link reactNative.View#style(reactNative.StyleSheet) <em>Style</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Style</em>' operation.
	 * @see reactNative.View#style(reactNative.StyleSheet)
	 * @generated
	 */
	EOperation getView__Style__StyleSheet();

	/**
	 * Returns the meta object for class '{@link reactNative.Text <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text</em>'.
	 * @see reactNative.Text
	 * @generated
	 */
	EClass getText();

	/**
	 * Returns the meta object for the attribute '{@link reactNative.Text#getContentText <em>Content Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content Text</em>'.
	 * @see reactNative.Text#getContentText()
	 * @see #getText()
	 * @generated
	 */
	EAttribute getText_ContentText();

	/**
	 * Returns the meta object for the attribute '{@link reactNative.Text#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see reactNative.Text#getColor()
	 * @see #getText()
	 * @generated
	 */
	EAttribute getText_Color();

	/**
	 * Returns the meta object for the attribute '{@link reactNative.Text#getFontSize <em>Font Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Font Size</em>'.
	 * @see reactNative.Text#getFontSize()
	 * @see #getText()
	 * @generated
	 */
	EAttribute getText_FontSize();

	/**
	 * Returns the meta object for the attribute '{@link reactNative.Text#getTextAlign <em>Text Align</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text Align</em>'.
	 * @see reactNative.Text#getTextAlign()
	 * @see #getText()
	 * @generated
	 */
	EAttribute getText_TextAlign();

	/**
	 * Returns the meta object for the containment reference list '{@link reactNative.Text#getSubText <em>Sub Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Text</em>'.
	 * @see reactNative.Text#getSubText()
	 * @see #getText()
	 * @generated
	 */
	EReference getText_SubText();

	/**
	 * Returns the meta object for the attribute '{@link reactNative.Text#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see reactNative.Text#getName()
	 * @see #getText()
	 * @generated
	 */
	EAttribute getText_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link reactNative.Text#getTextToStylesheet <em>Text To Stylesheet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Text To Stylesheet</em>'.
	 * @see reactNative.Text#getTextToStylesheet()
	 * @see #getText()
	 * @generated
	 */
	EReference getText_TextToStylesheet();

	/**
	 * Returns the meta object for class '{@link reactNative.FlatList <em>Flat List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Flat List</em>'.
	 * @see reactNative.FlatList
	 * @generated
	 */
	EClass getFlatList();

	/**
	 * Returns the meta object for the containment reference list '{@link reactNative.FlatList#getHasViews <em>Has Views</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Views</em>'.
	 * @see reactNative.FlatList#getHasViews()
	 * @see #getFlatList()
	 * @generated
	 */
	EReference getFlatList_HasViews();

	/**
	 * Returns the meta object for the containment reference list '{@link reactNative.FlatList#getFlatListText <em>Flat List Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Flat List Text</em>'.
	 * @see reactNative.FlatList#getFlatListText()
	 * @see #getFlatList()
	 * @generated
	 */
	EReference getFlatList_FlatListText();

	/**
	 * Returns the meta object for the attribute '{@link reactNative.FlatList#getFlatlistName <em>Flatlist Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Flatlist Name</em>'.
	 * @see reactNative.FlatList#getFlatlistName()
	 * @see #getFlatList()
	 * @generated
	 */
	EAttribute getFlatList_FlatlistName();

	/**
	 * Returns the meta object for the containment reference list '{@link reactNative.FlatList#getImage <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Image</em>'.
	 * @see reactNative.FlatList#getImage()
	 * @see #getFlatList()
	 * @generated
	 */
	EReference getFlatList_Image();

	/**
	 * Returns the meta object for the attribute '{@link reactNative.FlatList#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data</em>'.
	 * @see reactNative.FlatList#getData()
	 * @see #getFlatList()
	 * @generated
	 */
	EAttribute getFlatList_Data();

	/**
	 * Returns the meta object for the attribute '{@link reactNative.FlatList#getRenderItem <em>Render Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Render Item</em>'.
	 * @see reactNative.FlatList#getRenderItem()
	 * @see #getFlatList()
	 * @generated
	 */
	EAttribute getFlatList_RenderItem();

	/**
	 * Returns the meta object for the attribute '{@link reactNative.FlatList#getKeyExtractor <em>Key Extractor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key Extractor</em>'.
	 * @see reactNative.FlatList#getKeyExtractor()
	 * @see #getFlatList()
	 * @generated
	 */
	EAttribute getFlatList_KeyExtractor();

	/**
	 * Returns the meta object for class '{@link reactNative.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component</em>'.
	 * @see reactNative.Component
	 * @generated
	 */
	EClass getComponent();

	/**
	 * Returns the meta object for the containment reference list '{@link reactNative.Component#getComponentTotext <em>Component Totext</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Component Totext</em>'.
	 * @see reactNative.Component#getComponentTotext()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_ComponentTotext();

	/**
	 * Returns the meta object for the attribute '{@link reactNative.Component#getComponentName <em>Component Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Component Name</em>'.
	 * @see reactNative.Component#getComponentName()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_ComponentName();

	/**
	 * Returns the meta object for the containment reference list '{@link reactNative.Component#getComponentToView <em>Component To View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Component To View</em>'.
	 * @see reactNative.Component#getComponentToView()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_ComponentToView();

	/**
	 * Returns the meta object for the attribute '{@link reactNative.Component#isState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State</em>'.
	 * @see reactNative.Component#isState()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_State();

	/**
	 * Returns the meta object for the containment reference '{@link reactNative.Component#getComponentToTouchableOpacity <em>Component To Touchable Opacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Component To Touchable Opacity</em>'.
	 * @see reactNative.Component#getComponentToTouchableOpacity()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_ComponentToTouchableOpacity();

	/**
	 * Returns the meta object for class '{@link reactNative.ProjetoRN <em>Projeto RN</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Projeto RN</em>'.
	 * @see reactNative.ProjetoRN
	 * @generated
	 */
	EClass getProjetoRN();

	/**
	 * Returns the meta object for the attribute '{@link reactNative.ProjetoRN#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see reactNative.ProjetoRN#getName()
	 * @see #getProjetoRN()
	 * @generated
	 */
	EAttribute getProjetoRN_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link reactNative.ProjetoRN#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Components</em>'.
	 * @see reactNative.ProjetoRN#getComponents()
	 * @see #getProjetoRN()
	 * @generated
	 */
	EReference getProjetoRN_Components();

	/**
	 * Returns the meta object for class '{@link reactNative.Image <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Image</em>'.
	 * @see reactNative.Image
	 * @generated
	 */
	EClass getImage();

	/**
	 * Returns the meta object for the attribute '{@link reactNative.Image#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see reactNative.Image#getName()
	 * @see #getImage()
	 * @generated
	 */
	EAttribute getImage_Name();

	/**
	 * Returns the meta object for the attribute '{@link reactNative.Image#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source</em>'.
	 * @see reactNative.Image#getSource()
	 * @see #getImage()
	 * @generated
	 */
	EAttribute getImage_Source();

	/**
	 * Returns the meta object for the containment reference list '{@link reactNative.Image#getSubImage <em>Sub Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Image</em>'.
	 * @see reactNative.Image#getSubImage()
	 * @see #getImage()
	 * @generated
	 */
	EReference getImage_SubImage();

	/**
	 * Returns the meta object for the containment reference list '{@link reactNative.Image#getImageTostylesheet <em>Image Tostylesheet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Image Tostylesheet</em>'.
	 * @see reactNative.Image#getImageTostylesheet()
	 * @see #getImage()
	 * @generated
	 */
	EReference getImage_ImageTostylesheet();

	/**
	 * Returns the meta object for class '{@link reactNative.TouchableOpacity <em>Touchable Opacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Touchable Opacity</em>'.
	 * @see reactNative.TouchableOpacity
	 * @generated
	 */
	EClass getTouchableOpacity();

	/**
	 * Returns the meta object for the containment reference list '{@link reactNative.TouchableOpacity#getTouchableOpacityToIcon <em>Touchable Opacity To Icon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Touchable Opacity To Icon</em>'.
	 * @see reactNative.TouchableOpacity#getTouchableOpacityToIcon()
	 * @see #getTouchableOpacity()
	 * @generated
	 */
	EReference getTouchableOpacity_TouchableOpacityToIcon();

	/**
	 * Returns the meta object for the containment reference list '{@link reactNative.TouchableOpacity#getTouchableOpacityToImage <em>Touchable Opacity To Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Touchable Opacity To Image</em>'.
	 * @see reactNative.TouchableOpacity#getTouchableOpacityToImage()
	 * @see #getTouchableOpacity()
	 * @generated
	 */
	EReference getTouchableOpacity_TouchableOpacityToImage();

	/**
	 * Returns the meta object for the containment reference list '{@link reactNative.TouchableOpacity#getTouchableOpacityToText <em>Touchable Opacity To Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Touchable Opacity To Text</em>'.
	 * @see reactNative.TouchableOpacity#getTouchableOpacityToText()
	 * @see #getTouchableOpacity()
	 * @generated
	 */
	EReference getTouchableOpacity_TouchableOpacityToText();

	/**
	 * Returns the meta object for the containment reference list '{@link reactNative.TouchableOpacity#getTouchableOpacityView <em>Touchable Opacity View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Touchable Opacity View</em>'.
	 * @see reactNative.TouchableOpacity#getTouchableOpacityView()
	 * @see #getTouchableOpacity()
	 * @generated
	 */
	EReference getTouchableOpacity_TouchableOpacityView();

	/**
	 * Returns the meta object for the containment reference list '{@link reactNative.TouchableOpacity#getTouchableOpacityToButton <em>Touchable Opacity To Button</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Touchable Opacity To Button</em>'.
	 * @see reactNative.TouchableOpacity#getTouchableOpacityToButton()
	 * @see #getTouchableOpacity()
	 * @generated
	 */
	EReference getTouchableOpacity_TouchableOpacityToButton();

	/**
	 * Returns the meta object for class '{@link reactNative.Icon <em>Icon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Icon</em>'.
	 * @see reactNative.Icon
	 * @generated
	 */
	EClass getIcon();

	/**
	 * Returns the meta object for the attribute '{@link reactNative.Icon#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see reactNative.Icon#getStyle()
	 * @see #getIcon()
	 * @generated
	 */
	EAttribute getIcon_Style();

	/**
	 * Returns the meta object for the attribute '{@link reactNative.Icon#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see reactNative.Icon#getName()
	 * @see #getIcon()
	 * @generated
	 */
	EAttribute getIcon_Name();

	/**
	 * Returns the meta object for the attribute '{@link reactNative.Icon#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see reactNative.Icon#getSize()
	 * @see #getIcon()
	 * @generated
	 */
	EAttribute getIcon_Size();

	/**
	 * Returns the meta object for the attribute '{@link reactNative.Icon#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see reactNative.Icon#getColor()
	 * @see #getIcon()
	 * @generated
	 */
	EAttribute getIcon_Color();

	/**
	 * Returns the meta object for the containment reference list '{@link reactNative.Icon#getIconToStylesheet <em>Icon To Stylesheet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Icon To Stylesheet</em>'.
	 * @see reactNative.Icon#getIconToStylesheet()
	 * @see #getIcon()
	 * @generated
	 */
	EReference getIcon_IconToStylesheet();

	/**
	 * Returns the meta object for class '{@link reactNative.TouchablesGenerics <em>Touchables Generics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Touchables Generics</em>'.
	 * @see reactNative.TouchablesGenerics
	 * @generated
	 */
	EClass getTouchablesGenerics();

	/**
	 * Returns the meta object for the attribute '{@link reactNative.TouchablesGenerics#getOnPress <em>On Press</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>On Press</em>'.
	 * @see reactNative.TouchablesGenerics#getOnPress()
	 * @see #getTouchablesGenerics()
	 * @generated
	 */
	EAttribute getTouchablesGenerics_OnPress();

	/**
	 * Returns the meta object for class '{@link reactNative.Button <em>Button</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Button</em>'.
	 * @see reactNative.Button
	 * @generated
	 */
	EClass getButton();

	/**
	 * Returns the meta object for the attribute '{@link reactNative.Button#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see reactNative.Button#getTitle()
	 * @see #getButton()
	 * @generated
	 */
	EAttribute getButton_Title();

	/**
	 * Returns the meta object for the attribute '{@link reactNative.Button#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see reactNative.Button#getColor()
	 * @see #getButton()
	 * @generated
	 */
	EAttribute getButton_Color();

	/**
	 * Returns the meta object for the attribute '{@link reactNative.Button#isDisabled <em>Disabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Disabled</em>'.
	 * @see reactNative.Button#isDisabled()
	 * @see #getButton()
	 * @generated
	 */
	EAttribute getButton_Disabled();

	/**
	 * Returns the meta object for class '{@link reactNative.StyleSheet <em>Style Sheet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Style Sheet</em>'.
	 * @see reactNative.StyleSheet
	 * @generated
	 */
	EClass getStyleSheet();

	/**
	 * Returns the meta object for the attribute '{@link reactNative.StyleSheet#getNameStyle <em>Name Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name Style</em>'.
	 * @see reactNative.StyleSheet#getNameStyle()
	 * @see #getStyleSheet()
	 * @generated
	 */
	EAttribute getStyleSheet_NameStyle();

	/**
	 * Returns the meta object for the containment reference '{@link reactNative.StyleSheet#getHasFlexbox <em>Has Flexbox</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Has Flexbox</em>'.
	 * @see reactNative.StyleSheet#getHasFlexbox()
	 * @see #getStyleSheet()
	 * @generated
	 */
	EReference getStyleSheet_HasFlexbox();

	/**
	 * Returns the meta object for the containment reference '{@link reactNative.StyleSheet#getHasFont <em>Has Font</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Has Font</em>'.
	 * @see reactNative.StyleSheet#getHasFont()
	 * @see #getStyleSheet()
	 * @generated
	 */
	EReference getStyleSheet_HasFont();

	/**
	 * Returns the meta object for class '{@link reactNative.FlexBox <em>Flex Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Flex Box</em>'.
	 * @see reactNative.FlexBox
	 * @generated
	 */
	EClass getFlexBox();

	/**
	 * Returns the meta object for the attribute '{@link reactNative.FlexBox#getFlex <em>Flex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Flex</em>'.
	 * @see reactNative.FlexBox#getFlex()
	 * @see #getFlexBox()
	 * @generated
	 */
	EAttribute getFlexBox_Flex();

	/**
	 * Returns the meta object for the attribute '{@link reactNative.FlexBox#getFlexDirection <em>Flex Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Flex Direction</em>'.
	 * @see reactNative.FlexBox#getFlexDirection()
	 * @see #getFlexBox()
	 * @generated
	 */
	EAttribute getFlexBox_FlexDirection();

	/**
	 * Returns the meta object for the attribute '{@link reactNative.FlexBox#getJustifyContent <em>Justify Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Justify Content</em>'.
	 * @see reactNative.FlexBox#getJustifyContent()
	 * @see #getFlexBox()
	 * @generated
	 */
	EAttribute getFlexBox_JustifyContent();

	/**
	 * Returns the meta object for the attribute '{@link reactNative.FlexBox#getAlignItems <em>Align Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Align Items</em>'.
	 * @see reactNative.FlexBox#getAlignItems()
	 * @see #getFlexBox()
	 * @generated
	 */
	EAttribute getFlexBox_AlignItems();

	/**
	 * Returns the meta object for class '{@link reactNative.Font <em>Font</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Font</em>'.
	 * @see reactNative.Font
	 * @generated
	 */
	EClass getFont();

	/**
	 * Returns the meta object for the attribute '{@link reactNative.Font#getFontSize <em>Font Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Font Size</em>'.
	 * @see reactNative.Font#getFontSize()
	 * @see #getFont()
	 * @generated
	 */
	EAttribute getFont_FontSize();

	/**
	 * Returns the meta object for the attribute '{@link reactNative.Font#getFontFamily <em>Font Family</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Font Family</em>'.
	 * @see reactNative.Font#getFontFamily()
	 * @see #getFont()
	 * @generated
	 */
	EAttribute getFont_FontFamily();

	/**
	 * Returns the meta object for the attribute '{@link reactNative.Font#getFontWeight <em>Font Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Font Weight</em>'.
	 * @see reactNative.Font#getFontWeight()
	 * @see #getFont()
	 * @generated
	 */
	EAttribute getFont_FontWeight();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ReactNativeFactory getReactNativeFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link reactNative.impl.ViewImpl <em>View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see reactNative.impl.ViewImpl
		 * @see reactNative.impl.ReactNativePackageImpl#getView()
		 * @generated
		 */
		EClass VIEW = eINSTANCE.getView();

		/**
		 * The meta object literal for the '<em><b>Has Text</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEW__HAS_TEXT = eINSTANCE.getView_HasText();

		/**
		 * The meta object literal for the '<em><b>View Toflatlists</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEW__VIEW_TOFLATLISTS = eINSTANCE.getView_ViewToflatlists();

		/**
		 * The meta object literal for the '<em><b>View Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIEW__VIEW_TYPE = eINSTANCE.getView_ViewType();

		/**
		 * The meta object literal for the '<em><b>View Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIEW__VIEW_NAME = eINSTANCE.getView_ViewName();

		/**
		 * The meta object literal for the '<em><b>Has Image</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEW__HAS_IMAGE = eINSTANCE.getView_HasImage();

		/**
		 * The meta object literal for the '<em><b>View To Touchable Opacity</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEW__VIEW_TO_TOUCHABLE_OPACITY = eINSTANCE.getView_ViewToTouchableOpacity();

		/**
		 * The meta object literal for the '<em><b>View To Icon</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEW__VIEW_TO_ICON = eINSTANCE.getView_ViewToIcon();

		/**
		 * The meta object literal for the '<em><b>View To Button</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEW__VIEW_TO_BUTTON = eINSTANCE.getView_ViewToButton();

		/**
		 * The meta object literal for the '<em><b>Sub View</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEW__SUB_VIEW = eINSTANCE.getView_SubView();

		/**
		 * The meta object literal for the '<em><b>View To Style Sheet</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEW__VIEW_TO_STYLE_SHEET = eINSTANCE.getView_ViewToStyleSheet();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VIEW___STYLE__STYLESHEET = eINSTANCE.getView__Style__StyleSheet();

		/**
		 * The meta object literal for the '{@link reactNative.impl.TextImpl <em>Text</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see reactNative.impl.TextImpl
		 * @see reactNative.impl.ReactNativePackageImpl#getText()
		 * @generated
		 */
		EClass TEXT = eINSTANCE.getText();

		/**
		 * The meta object literal for the '<em><b>Content Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT__CONTENT_TEXT = eINSTANCE.getText_ContentText();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT__COLOR = eINSTANCE.getText_Color();

		/**
		 * The meta object literal for the '<em><b>Font Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT__FONT_SIZE = eINSTANCE.getText_FontSize();

		/**
		 * The meta object literal for the '<em><b>Text Align</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT__TEXT_ALIGN = eINSTANCE.getText_TextAlign();

		/**
		 * The meta object literal for the '<em><b>Sub Text</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXT__SUB_TEXT = eINSTANCE.getText_SubText();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT__NAME = eINSTANCE.getText_Name();

		/**
		 * The meta object literal for the '<em><b>Text To Stylesheet</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXT__TEXT_TO_STYLESHEET = eINSTANCE.getText_TextToStylesheet();

		/**
		 * The meta object literal for the '{@link reactNative.impl.FlatListImpl <em>Flat List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see reactNative.impl.FlatListImpl
		 * @see reactNative.impl.ReactNativePackageImpl#getFlatList()
		 * @generated
		 */
		EClass FLAT_LIST = eINSTANCE.getFlatList();

		/**
		 * The meta object literal for the '<em><b>Has Views</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLAT_LIST__HAS_VIEWS = eINSTANCE.getFlatList_HasViews();

		/**
		 * The meta object literal for the '<em><b>Flat List Text</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLAT_LIST__FLAT_LIST_TEXT = eINSTANCE.getFlatList_FlatListText();

		/**
		 * The meta object literal for the '<em><b>Flatlist Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLAT_LIST__FLATLIST_NAME = eINSTANCE.getFlatList_FlatlistName();

		/**
		 * The meta object literal for the '<em><b>Image</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLAT_LIST__IMAGE = eINSTANCE.getFlatList_Image();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLAT_LIST__DATA = eINSTANCE.getFlatList_Data();

		/**
		 * The meta object literal for the '<em><b>Render Item</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLAT_LIST__RENDER_ITEM = eINSTANCE.getFlatList_RenderItem();

		/**
		 * The meta object literal for the '<em><b>Key Extractor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLAT_LIST__KEY_EXTRACTOR = eINSTANCE.getFlatList_KeyExtractor();

		/**
		 * The meta object literal for the '{@link reactNative.impl.ComponentImpl <em>Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see reactNative.impl.ComponentImpl
		 * @see reactNative.impl.ReactNativePackageImpl#getComponent()
		 * @generated
		 */
		EClass COMPONENT = eINSTANCE.getComponent();

		/**
		 * The meta object literal for the '<em><b>Component Totext</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__COMPONENT_TOTEXT = eINSTANCE.getComponent_ComponentTotext();

		/**
		 * The meta object literal for the '<em><b>Component Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__COMPONENT_NAME = eINSTANCE.getComponent_ComponentName();

		/**
		 * The meta object literal for the '<em><b>Component To View</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__COMPONENT_TO_VIEW = eINSTANCE.getComponent_ComponentToView();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__STATE = eINSTANCE.getComponent_State();

		/**
		 * The meta object literal for the '<em><b>Component To Touchable Opacity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__COMPONENT_TO_TOUCHABLE_OPACITY = eINSTANCE.getComponent_ComponentToTouchableOpacity();

		/**
		 * The meta object literal for the '{@link reactNative.impl.ProjetoRNImpl <em>Projeto RN</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see reactNative.impl.ProjetoRNImpl
		 * @see reactNative.impl.ReactNativePackageImpl#getProjetoRN()
		 * @generated
		 */
		EClass PROJETO_RN = eINSTANCE.getProjetoRN();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJETO_RN__NAME = eINSTANCE.getProjetoRN_Name();

		/**
		 * The meta object literal for the '<em><b>Components</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJETO_RN__COMPONENTS = eINSTANCE.getProjetoRN_Components();

		/**
		 * The meta object literal for the '{@link reactNative.impl.ImageImpl <em>Image</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see reactNative.impl.ImageImpl
		 * @see reactNative.impl.ReactNativePackageImpl#getImage()
		 * @generated
		 */
		EClass IMAGE = eINSTANCE.getImage();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE__NAME = eINSTANCE.getImage_Name();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE__SOURCE = eINSTANCE.getImage_Source();

		/**
		 * The meta object literal for the '<em><b>Sub Image</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMAGE__SUB_IMAGE = eINSTANCE.getImage_SubImage();

		/**
		 * The meta object literal for the '<em><b>Image Tostylesheet</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMAGE__IMAGE_TOSTYLESHEET = eINSTANCE.getImage_ImageTostylesheet();

		/**
		 * The meta object literal for the '{@link reactNative.impl.TouchableOpacityImpl <em>Touchable Opacity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see reactNative.impl.TouchableOpacityImpl
		 * @see reactNative.impl.ReactNativePackageImpl#getTouchableOpacity()
		 * @generated
		 */
		EClass TOUCHABLE_OPACITY = eINSTANCE.getTouchableOpacity();

		/**
		 * The meta object literal for the '<em><b>Touchable Opacity To Icon</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOUCHABLE_OPACITY__TOUCHABLE_OPACITY_TO_ICON = eINSTANCE.getTouchableOpacity_TouchableOpacityToIcon();

		/**
		 * The meta object literal for the '<em><b>Touchable Opacity To Image</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOUCHABLE_OPACITY__TOUCHABLE_OPACITY_TO_IMAGE = eINSTANCE.getTouchableOpacity_TouchableOpacityToImage();

		/**
		 * The meta object literal for the '<em><b>Touchable Opacity To Text</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOUCHABLE_OPACITY__TOUCHABLE_OPACITY_TO_TEXT = eINSTANCE.getTouchableOpacity_TouchableOpacityToText();

		/**
		 * The meta object literal for the '<em><b>Touchable Opacity View</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOUCHABLE_OPACITY__TOUCHABLE_OPACITY_VIEW = eINSTANCE.getTouchableOpacity_TouchableOpacityView();

		/**
		 * The meta object literal for the '<em><b>Touchable Opacity To Button</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOUCHABLE_OPACITY__TOUCHABLE_OPACITY_TO_BUTTON = eINSTANCE.getTouchableOpacity_TouchableOpacityToButton();

		/**
		 * The meta object literal for the '{@link reactNative.impl.IconImpl <em>Icon</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see reactNative.impl.IconImpl
		 * @see reactNative.impl.ReactNativePackageImpl#getIcon()
		 * @generated
		 */
		EClass ICON = eINSTANCE.getIcon();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ICON__STYLE = eINSTANCE.getIcon_Style();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ICON__NAME = eINSTANCE.getIcon_Name();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ICON__SIZE = eINSTANCE.getIcon_Size();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ICON__COLOR = eINSTANCE.getIcon_Color();

		/**
		 * The meta object literal for the '<em><b>Icon To Stylesheet</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ICON__ICON_TO_STYLESHEET = eINSTANCE.getIcon_IconToStylesheet();

		/**
		 * The meta object literal for the '{@link reactNative.impl.TouchablesGenericsImpl <em>Touchables Generics</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see reactNative.impl.TouchablesGenericsImpl
		 * @see reactNative.impl.ReactNativePackageImpl#getTouchablesGenerics()
		 * @generated
		 */
		EClass TOUCHABLES_GENERICS = eINSTANCE.getTouchablesGenerics();

		/**
		 * The meta object literal for the '<em><b>On Press</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOUCHABLES_GENERICS__ON_PRESS = eINSTANCE.getTouchablesGenerics_OnPress();

		/**
		 * The meta object literal for the '{@link reactNative.impl.ButtonImpl <em>Button</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see reactNative.impl.ButtonImpl
		 * @see reactNative.impl.ReactNativePackageImpl#getButton()
		 * @generated
		 */
		EClass BUTTON = eINSTANCE.getButton();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUTTON__TITLE = eINSTANCE.getButton_Title();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUTTON__COLOR = eINSTANCE.getButton_Color();

		/**
		 * The meta object literal for the '<em><b>Disabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUTTON__DISABLED = eINSTANCE.getButton_Disabled();

		/**
		 * The meta object literal for the '{@link reactNative.impl.StyleSheetImpl <em>Style Sheet</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see reactNative.impl.StyleSheetImpl
		 * @see reactNative.impl.ReactNativePackageImpl#getStyleSheet()
		 * @generated
		 */
		EClass STYLE_SHEET = eINSTANCE.getStyleSheet();

		/**
		 * The meta object literal for the '<em><b>Name Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STYLE_SHEET__NAME_STYLE = eINSTANCE.getStyleSheet_NameStyle();

		/**
		 * The meta object literal for the '<em><b>Has Flexbox</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STYLE_SHEET__HAS_FLEXBOX = eINSTANCE.getStyleSheet_HasFlexbox();

		/**
		 * The meta object literal for the '<em><b>Has Font</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STYLE_SHEET__HAS_FONT = eINSTANCE.getStyleSheet_HasFont();

		/**
		 * The meta object literal for the '{@link reactNative.impl.FlexBoxImpl <em>Flex Box</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see reactNative.impl.FlexBoxImpl
		 * @see reactNative.impl.ReactNativePackageImpl#getFlexBox()
		 * @generated
		 */
		EClass FLEX_BOX = eINSTANCE.getFlexBox();

		/**
		 * The meta object literal for the '<em><b>Flex</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLEX_BOX__FLEX = eINSTANCE.getFlexBox_Flex();

		/**
		 * The meta object literal for the '<em><b>Flex Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLEX_BOX__FLEX_DIRECTION = eINSTANCE.getFlexBox_FlexDirection();

		/**
		 * The meta object literal for the '<em><b>Justify Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLEX_BOX__JUSTIFY_CONTENT = eINSTANCE.getFlexBox_JustifyContent();

		/**
		 * The meta object literal for the '<em><b>Align Items</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLEX_BOX__ALIGN_ITEMS = eINSTANCE.getFlexBox_AlignItems();

		/**
		 * The meta object literal for the '{@link reactNative.impl.FontImpl <em>Font</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see reactNative.impl.FontImpl
		 * @see reactNative.impl.ReactNativePackageImpl#getFont()
		 * @generated
		 */
		EClass FONT = eINSTANCE.getFont();

		/**
		 * The meta object literal for the '<em><b>Font Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FONT__FONT_SIZE = eINSTANCE.getFont_FontSize();

		/**
		 * The meta object literal for the '<em><b>Font Family</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FONT__FONT_FAMILY = eINSTANCE.getFont_FontFamily();

		/**
		 * The meta object literal for the '<em><b>Font Weight</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FONT__FONT_WEIGHT = eINSTANCE.getFont_FontWeight();

	}

} //ReactNativePackage
