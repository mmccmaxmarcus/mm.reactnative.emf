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
	 * The feature id for the '<em><b>View To Section List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__VIEW_TO_SECTION_LIST = 10;

	/**
	 * The number of structural features of the '<em>View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_FEATURE_COUNT = 11;

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
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__NAME = 4;

	/**
	 * The feature id for the '<em><b>Text To Stylesheet</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__TEXT_TO_STYLESHEET = 5;

	/**
	 * The number of structural features of the '<em>Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FEATURE_COUNT = 6;

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
	 * The feature id for the '<em><b>Flatlist Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLAT_LIST__FLATLIST_NAME = 1;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLAT_LIST__DATA = 2;

	/**
	 * The feature id for the '<em><b>Render Item</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLAT_LIST__RENDER_ITEM = 3;

	/**
	 * The feature id for the '<em><b>Key Extractor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLAT_LIST__KEY_EXTRACTOR = 4;

	/**
	 * The feature id for the '<em><b>Flat List To Array</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLAT_LIST__FLAT_LIST_TO_ARRAY = 5;

	/**
	 * The number of structural features of the '<em>Flat List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLAT_LIST_FEATURE_COUNT = 6;

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
	 * The feature id for the '<em><b>Image Tostylesheet</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__IMAGE_TOSTYLESHEET = 2;

	/**
	 * The number of structural features of the '<em>Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_FEATURE_COUNT = 3;

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
	 * The feature id for the '<em><b>Has Margin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_SHEET__HAS_MARGIN = 3;

	/**
	 * The feature id for the '<em><b>Has Border</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_SHEET__HAS_BORDER = 4;

	/**
	 * The feature id for the '<em><b>Has Padding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_SHEET__HAS_PADDING = 5;

	/**
	 * The number of structural features of the '<em>Style Sheet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_SHEET_FEATURE_COUNT = 6;

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
	 * The meta object id for the '{@link reactNative.impl.SectionListImpl <em>Section List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see reactNative.impl.SectionListImpl
	 * @see reactNative.impl.ReactNativePackageImpl#getSectionList()
	 * @generated
	 */
	int SECTION_LIST = 13;

	/**
	 * The feature id for the '<em><b>Section List Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_LIST__SECTION_LIST_NAME = 0;

	/**
	 * The feature id for the '<em><b>Sections</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_LIST__SECTIONS = 1;

	/**
	 * The feature id for the '<em><b>Key Extractor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_LIST__KEY_EXTRACTOR = 2;

	/**
	 * The feature id for the '<em><b>Render Section Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_LIST__RENDER_SECTION_HEADER = 3;

	/**
	 * The feature id for the '<em><b>Render Item</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_LIST__RENDER_ITEM = 4;

	/**
	 * The feature id for the '<em><b>Section List To Array</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_LIST__SECTION_LIST_TO_ARRAY = 5;

	/**
	 * The number of structural features of the '<em>Section List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_LIST_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Section List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_LIST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link reactNative.impl.MarginImpl <em>Margin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see reactNative.impl.MarginImpl
	 * @see reactNative.impl.ReactNativePackageImpl#getMargin()
	 * @generated
	 */
	int MARGIN = 14;

	/**
	 * The feature id for the '<em><b>Margin Top</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARGIN__MARGIN_TOP = 0;

	/**
	 * The feature id for the '<em><b>Margin Bottom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARGIN__MARGIN_BOTTOM = 1;

	/**
	 * The feature id for the '<em><b>Margin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARGIN__MARGIN = 2;

	/**
	 * The number of structural features of the '<em>Margin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARGIN_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Margin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARGIN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link reactNative.impl.ArrayImpl <em>Array</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see reactNative.impl.ArrayImpl
	 * @see reactNative.impl.ReactNativePackageImpl#getArray()
	 * @generated
	 */
	int ARRAY = 15;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Sub Array</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY__SUB_ARRAY = 1;

	/**
	 * The feature id for the '<em><b>Array To Objects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY__ARRAY_TO_OBJECTS = 2;

	/**
	 * The number of structural features of the '<em>Array</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Array</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link reactNative.impl.ElementTextImpl <em>Element Text</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see reactNative.impl.ElementTextImpl
	 * @see reactNative.impl.ReactNativePackageImpl#getElementText()
	 * @generated
	 */
	int ELEMENT_TEXT = 16;

	/**
	 * The feature id for the '<em><b>Content Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_TEXT__CONTENT_TEXT = 0;

	/**
	 * The feature id for the '<em><b>Value Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_TEXT__VALUE_TEXT = 1;

	/**
	 * The feature id for the '<em><b>Element Text To Array</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_TEXT__ELEMENT_TEXT_TO_ARRAY = 2;

	/**
	 * The number of structural features of the '<em>Element Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_TEXT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Element Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_TEXT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link reactNative.impl.ElementImageImpl <em>Element Image</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see reactNative.impl.ElementImageImpl
	 * @see reactNative.impl.ReactNativePackageImpl#getElementImage()
	 * @generated
	 */
	int ELEMENT_IMAGE = 17;

	/**
	 * The feature id for the '<em><b>Content Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_IMAGE__CONTENT_IMAGE = 0;

	/**
	 * The feature id for the '<em><b>Value Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_IMAGE__VALUE_IMAGE = 1;

	/**
	 * The feature id for the '<em><b>Element Image To Array</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_IMAGE__ELEMENT_IMAGE_TO_ARRAY = 2;

	/**
	 * The number of structural features of the '<em>Element Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_IMAGE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Element Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_IMAGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link reactNative.impl.ObjectElementImpl <em>Object Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see reactNative.impl.ObjectElementImpl
	 * @see reactNative.impl.ReactNativePackageImpl#getObjectElement()
	 * @generated
	 */
	int OBJECT_ELEMENT = 18;

	/**
	 * The feature id for the '<em><b>Element Text</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_ELEMENT__ELEMENT_TEXT = 0;

	/**
	 * The feature id for the '<em><b>Element Image</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_ELEMENT__ELEMENT_IMAGE = 1;

	/**
	 * The feature id for the '<em><b>Sub Objects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_ELEMENT__SUB_OBJECTS = 2;

	/**
	 * The feature id for the '<em><b>Object To Array</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_ELEMENT__OBJECT_TO_ARRAY = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_ELEMENT__ID = 4;

	/**
	 * The number of structural features of the '<em>Object Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_ELEMENT_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Object Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_ELEMENT_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link reactNative.impl.BorderImpl <em>Border</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see reactNative.impl.BorderImpl
	 * @see reactNative.impl.ReactNativePackageImpl#getBorder()
	 * @generated
	 */
	int BORDER = 19;

	/**
	 * The feature id for the '<em><b>Border Bottom Right Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BORDER__BORDER_BOTTOM_RIGHT_RADIUS = 0;

	/**
	 * The feature id for the '<em><b>Border Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BORDER__BORDER_COLOR = 1;

	/**
	 * The feature id for the '<em><b>Border Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BORDER__BORDER_RADIUS = 2;

	/**
	 * The feature id for the '<em><b>Border Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BORDER__BORDER_WIDTH = 3;

	/**
	 * The number of structural features of the '<em>Border</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BORDER_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Border</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BORDER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link reactNative.impl.PaddingImpl <em>Padding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see reactNative.impl.PaddingImpl
	 * @see reactNative.impl.ReactNativePackageImpl#getPadding()
	 * @generated
	 */
	int PADDING = 20;

	/**
	 * The feature id for the '<em><b>Padding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PADDING__PADDING = 0;

	/**
	 * The feature id for the '<em><b>Padding Horizontal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PADDING__PADDING_HORIZONTAL = 1;

	/**
	 * The feature id for the '<em><b>Padding Vertical</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PADDING__PADDING_VERTICAL = 2;

	/**
	 * The number of structural features of the '<em>Padding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PADDING_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Padding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PADDING_OPERATION_COUNT = 0;


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
	 * Returns the meta object for the containment reference '{@link reactNative.View#getViewToSectionList <em>View To Section List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>View To Section List</em>'.
	 * @see reactNative.View#getViewToSectionList()
	 * @see #getView()
	 * @generated
	 */
	EReference getView_ViewToSectionList();

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
	 * Returns the meta object for the containment reference list '{@link reactNative.FlatList#getFlatListToArray <em>Flat List To Array</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Flat List To Array</em>'.
	 * @see reactNative.FlatList#getFlatListToArray()
	 * @see #getFlatList()
	 * @generated
	 */
	EReference getFlatList_FlatListToArray();

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
	 * Returns the meta object for the containment reference '{@link reactNative.StyleSheet#getHasMargin <em>Has Margin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Has Margin</em>'.
	 * @see reactNative.StyleSheet#getHasMargin()
	 * @see #getStyleSheet()
	 * @generated
	 */
	EReference getStyleSheet_HasMargin();

	/**
	 * Returns the meta object for the containment reference '{@link reactNative.StyleSheet#getHasBorder <em>Has Border</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Has Border</em>'.
	 * @see reactNative.StyleSheet#getHasBorder()
	 * @see #getStyleSheet()
	 * @generated
	 */
	EReference getStyleSheet_HasBorder();

	/**
	 * Returns the meta object for the containment reference '{@link reactNative.StyleSheet#getHasPadding <em>Has Padding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Has Padding</em>'.
	 * @see reactNative.StyleSheet#getHasPadding()
	 * @see #getStyleSheet()
	 * @generated
	 */
	EReference getStyleSheet_HasPadding();

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
	 * Returns the meta object for class '{@link reactNative.SectionList <em>Section List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Section List</em>'.
	 * @see reactNative.SectionList
	 * @generated
	 */
	EClass getSectionList();

	/**
	 * Returns the meta object for the attribute '{@link reactNative.SectionList#getSectionListName <em>Section List Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Section List Name</em>'.
	 * @see reactNative.SectionList#getSectionListName()
	 * @see #getSectionList()
	 * @generated
	 */
	EAttribute getSectionList_SectionListName();

	/**
	 * Returns the meta object for the attribute '{@link reactNative.SectionList#getSections <em>Sections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sections</em>'.
	 * @see reactNative.SectionList#getSections()
	 * @see #getSectionList()
	 * @generated
	 */
	EAttribute getSectionList_Sections();

	/**
	 * Returns the meta object for the attribute '{@link reactNative.SectionList#getKeyExtractor <em>Key Extractor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key Extractor</em>'.
	 * @see reactNative.SectionList#getKeyExtractor()
	 * @see #getSectionList()
	 * @generated
	 */
	EAttribute getSectionList_KeyExtractor();

	/**
	 * Returns the meta object for the attribute '{@link reactNative.SectionList#getRenderSectionHeader <em>Render Section Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Render Section Header</em>'.
	 * @see reactNative.SectionList#getRenderSectionHeader()
	 * @see #getSectionList()
	 * @generated
	 */
	EAttribute getSectionList_RenderSectionHeader();

	/**
	 * Returns the meta object for the attribute '{@link reactNative.SectionList#getRenderItem <em>Render Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Render Item</em>'.
	 * @see reactNative.SectionList#getRenderItem()
	 * @see #getSectionList()
	 * @generated
	 */
	EAttribute getSectionList_RenderItem();

	/**
	 * Returns the meta object for the containment reference list '{@link reactNative.SectionList#getSectionListToArray <em>Section List To Array</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Section List To Array</em>'.
	 * @see reactNative.SectionList#getSectionListToArray()
	 * @see #getSectionList()
	 * @generated
	 */
	EReference getSectionList_SectionListToArray();

	/**
	 * Returns the meta object for class '{@link reactNative.Margin <em>Margin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Margin</em>'.
	 * @see reactNative.Margin
	 * @generated
	 */
	EClass getMargin();

	/**
	 * Returns the meta object for the attribute '{@link reactNative.Margin#getMarginTop <em>Margin Top</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Margin Top</em>'.
	 * @see reactNative.Margin#getMarginTop()
	 * @see #getMargin()
	 * @generated
	 */
	EAttribute getMargin_MarginTop();

	/**
	 * Returns the meta object for the attribute '{@link reactNative.Margin#getMarginBottom <em>Margin Bottom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Margin Bottom</em>'.
	 * @see reactNative.Margin#getMarginBottom()
	 * @see #getMargin()
	 * @generated
	 */
	EAttribute getMargin_MarginBottom();

	/**
	 * Returns the meta object for the attribute '{@link reactNative.Margin#getMargin <em>Margin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Margin</em>'.
	 * @see reactNative.Margin#getMargin()
	 * @see #getMargin()
	 * @generated
	 */
	EAttribute getMargin_Margin();

	/**
	 * Returns the meta object for class '{@link reactNative.Array <em>Array</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Array</em>'.
	 * @see reactNative.Array
	 * @generated
	 */
	EClass getArray();

	/**
	 * Returns the meta object for the attribute '{@link reactNative.Array#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see reactNative.Array#getValue()
	 * @see #getArray()
	 * @generated
	 */
	EAttribute getArray_Value();

	/**
	 * Returns the meta object for the containment reference list '{@link reactNative.Array#getSubArray <em>Sub Array</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Array</em>'.
	 * @see reactNative.Array#getSubArray()
	 * @see #getArray()
	 * @generated
	 */
	EReference getArray_SubArray();

	/**
	 * Returns the meta object for the containment reference list '{@link reactNative.Array#getArrayToObjects <em>Array To Objects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Array To Objects</em>'.
	 * @see reactNative.Array#getArrayToObjects()
	 * @see #getArray()
	 * @generated
	 */
	EReference getArray_ArrayToObjects();

	/**
	 * Returns the meta object for class '{@link reactNative.ElementText <em>Element Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element Text</em>'.
	 * @see reactNative.ElementText
	 * @generated
	 */
	EClass getElementText();

	/**
	 * Returns the meta object for the attribute '{@link reactNative.ElementText#getContentText <em>Content Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content Text</em>'.
	 * @see reactNative.ElementText#getContentText()
	 * @see #getElementText()
	 * @generated
	 */
	EAttribute getElementText_ContentText();

	/**
	 * Returns the meta object for the attribute '{@link reactNative.ElementText#getValueText <em>Value Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Text</em>'.
	 * @see reactNative.ElementText#getValueText()
	 * @see #getElementText()
	 * @generated
	 */
	EAttribute getElementText_ValueText();

	/**
	 * Returns the meta object for the containment reference list '{@link reactNative.ElementText#getElementTextToArray <em>Element Text To Array</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Element Text To Array</em>'.
	 * @see reactNative.ElementText#getElementTextToArray()
	 * @see #getElementText()
	 * @generated
	 */
	EReference getElementText_ElementTextToArray();

	/**
	 * Returns the meta object for class '{@link reactNative.ElementImage <em>Element Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element Image</em>'.
	 * @see reactNative.ElementImage
	 * @generated
	 */
	EClass getElementImage();

	/**
	 * Returns the meta object for the attribute '{@link reactNative.ElementImage#getContentImage <em>Content Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content Image</em>'.
	 * @see reactNative.ElementImage#getContentImage()
	 * @see #getElementImage()
	 * @generated
	 */
	EAttribute getElementImage_ContentImage();

	/**
	 * Returns the meta object for the attribute '{@link reactNative.ElementImage#getValueImage <em>Value Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Image</em>'.
	 * @see reactNative.ElementImage#getValueImage()
	 * @see #getElementImage()
	 * @generated
	 */
	EAttribute getElementImage_ValueImage();

	/**
	 * Returns the meta object for the containment reference list '{@link reactNative.ElementImage#getElementImageToArray <em>Element Image To Array</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Element Image To Array</em>'.
	 * @see reactNative.ElementImage#getElementImageToArray()
	 * @see #getElementImage()
	 * @generated
	 */
	EReference getElementImage_ElementImageToArray();

	/**
	 * Returns the meta object for class '{@link reactNative.ObjectElement <em>Object Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Element</em>'.
	 * @see reactNative.ObjectElement
	 * @generated
	 */
	EClass getObjectElement();

	/**
	 * Returns the meta object for the containment reference list '{@link reactNative.ObjectElement#getElementText <em>Element Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Element Text</em>'.
	 * @see reactNative.ObjectElement#getElementText()
	 * @see #getObjectElement()
	 * @generated
	 */
	EReference getObjectElement_ElementText();

	/**
	 * Returns the meta object for the containment reference list '{@link reactNative.ObjectElement#getElementImage <em>Element Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Element Image</em>'.
	 * @see reactNative.ObjectElement#getElementImage()
	 * @see #getObjectElement()
	 * @generated
	 */
	EReference getObjectElement_ElementImage();

	/**
	 * Returns the meta object for the containment reference list '{@link reactNative.ObjectElement#getSubObjects <em>Sub Objects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Objects</em>'.
	 * @see reactNative.ObjectElement#getSubObjects()
	 * @see #getObjectElement()
	 * @generated
	 */
	EReference getObjectElement_SubObjects();

	/**
	 * Returns the meta object for the containment reference list '{@link reactNative.ObjectElement#getObjectToArray <em>Object To Array</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Object To Array</em>'.
	 * @see reactNative.ObjectElement#getObjectToArray()
	 * @see #getObjectElement()
	 * @generated
	 */
	EReference getObjectElement_ObjectToArray();

	/**
	 * Returns the meta object for the attribute '{@link reactNative.ObjectElement#isId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see reactNative.ObjectElement#isId()
	 * @see #getObjectElement()
	 * @generated
	 */
	EAttribute getObjectElement_Id();

	/**
	 * Returns the meta object for class '{@link reactNative.Border <em>Border</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Border</em>'.
	 * @see reactNative.Border
	 * @generated
	 */
	EClass getBorder();

	/**
	 * Returns the meta object for the attribute '{@link reactNative.Border#getBorderBottomRightRadius <em>Border Bottom Right Radius</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Border Bottom Right Radius</em>'.
	 * @see reactNative.Border#getBorderBottomRightRadius()
	 * @see #getBorder()
	 * @generated
	 */
	EAttribute getBorder_BorderBottomRightRadius();

	/**
	 * Returns the meta object for the attribute '{@link reactNative.Border#getBorderColor <em>Border Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Border Color</em>'.
	 * @see reactNative.Border#getBorderColor()
	 * @see #getBorder()
	 * @generated
	 */
	EAttribute getBorder_BorderColor();

	/**
	 * Returns the meta object for the attribute '{@link reactNative.Border#getBorderRadius <em>Border Radius</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Border Radius</em>'.
	 * @see reactNative.Border#getBorderRadius()
	 * @see #getBorder()
	 * @generated
	 */
	EAttribute getBorder_BorderRadius();

	/**
	 * Returns the meta object for the attribute '{@link reactNative.Border#getBorderWidth <em>Border Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Border Width</em>'.
	 * @see reactNative.Border#getBorderWidth()
	 * @see #getBorder()
	 * @generated
	 */
	EAttribute getBorder_BorderWidth();

	/**
	 * Returns the meta object for class '{@link reactNative.Padding <em>Padding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Padding</em>'.
	 * @see reactNative.Padding
	 * @generated
	 */
	EClass getPadding();

	/**
	 * Returns the meta object for the attribute '{@link reactNative.Padding#getPadding <em>Padding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Padding</em>'.
	 * @see reactNative.Padding#getPadding()
	 * @see #getPadding()
	 * @generated
	 */
	EAttribute getPadding_Padding();

	/**
	 * Returns the meta object for the attribute '{@link reactNative.Padding#getPaddingHorizontal <em>Padding Horizontal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Padding Horizontal</em>'.
	 * @see reactNative.Padding#getPaddingHorizontal()
	 * @see #getPadding()
	 * @generated
	 */
	EAttribute getPadding_PaddingHorizontal();

	/**
	 * Returns the meta object for the attribute '{@link reactNative.Padding#getPaddingVertical <em>Padding Vertical</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Padding Vertical</em>'.
	 * @see reactNative.Padding#getPaddingVertical()
	 * @see #getPadding()
	 * @generated
	 */
	EAttribute getPadding_PaddingVertical();

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
		 * The meta object literal for the '<em><b>View To Section List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEW__VIEW_TO_SECTION_LIST = eINSTANCE.getView_ViewToSectionList();

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
		 * The meta object literal for the '<em><b>Flatlist Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLAT_LIST__FLATLIST_NAME = eINSTANCE.getFlatList_FlatlistName();

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
		 * The meta object literal for the '<em><b>Flat List To Array</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLAT_LIST__FLAT_LIST_TO_ARRAY = eINSTANCE.getFlatList_FlatListToArray();

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
		 * The meta object literal for the '<em><b>Has Margin</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STYLE_SHEET__HAS_MARGIN = eINSTANCE.getStyleSheet_HasMargin();

		/**
		 * The meta object literal for the '<em><b>Has Border</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STYLE_SHEET__HAS_BORDER = eINSTANCE.getStyleSheet_HasBorder();

		/**
		 * The meta object literal for the '<em><b>Has Padding</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STYLE_SHEET__HAS_PADDING = eINSTANCE.getStyleSheet_HasPadding();

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

		/**
		 * The meta object literal for the '{@link reactNative.impl.SectionListImpl <em>Section List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see reactNative.impl.SectionListImpl
		 * @see reactNative.impl.ReactNativePackageImpl#getSectionList()
		 * @generated
		 */
		EClass SECTION_LIST = eINSTANCE.getSectionList();

		/**
		 * The meta object literal for the '<em><b>Section List Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECTION_LIST__SECTION_LIST_NAME = eINSTANCE.getSectionList_SectionListName();

		/**
		 * The meta object literal for the '<em><b>Sections</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECTION_LIST__SECTIONS = eINSTANCE.getSectionList_Sections();

		/**
		 * The meta object literal for the '<em><b>Key Extractor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECTION_LIST__KEY_EXTRACTOR = eINSTANCE.getSectionList_KeyExtractor();

		/**
		 * The meta object literal for the '<em><b>Render Section Header</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECTION_LIST__RENDER_SECTION_HEADER = eINSTANCE.getSectionList_RenderSectionHeader();

		/**
		 * The meta object literal for the '<em><b>Render Item</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECTION_LIST__RENDER_ITEM = eINSTANCE.getSectionList_RenderItem();

		/**
		 * The meta object literal for the '<em><b>Section List To Array</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECTION_LIST__SECTION_LIST_TO_ARRAY = eINSTANCE.getSectionList_SectionListToArray();

		/**
		 * The meta object literal for the '{@link reactNative.impl.MarginImpl <em>Margin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see reactNative.impl.MarginImpl
		 * @see reactNative.impl.ReactNativePackageImpl#getMargin()
		 * @generated
		 */
		EClass MARGIN = eINSTANCE.getMargin();

		/**
		 * The meta object literal for the '<em><b>Margin Top</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MARGIN__MARGIN_TOP = eINSTANCE.getMargin_MarginTop();

		/**
		 * The meta object literal for the '<em><b>Margin Bottom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MARGIN__MARGIN_BOTTOM = eINSTANCE.getMargin_MarginBottom();

		/**
		 * The meta object literal for the '<em><b>Margin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MARGIN__MARGIN = eINSTANCE.getMargin_Margin();

		/**
		 * The meta object literal for the '{@link reactNative.impl.ArrayImpl <em>Array</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see reactNative.impl.ArrayImpl
		 * @see reactNative.impl.ReactNativePackageImpl#getArray()
		 * @generated
		 */
		EClass ARRAY = eINSTANCE.getArray();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARRAY__VALUE = eINSTANCE.getArray_Value();

		/**
		 * The meta object literal for the '<em><b>Sub Array</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARRAY__SUB_ARRAY = eINSTANCE.getArray_SubArray();

		/**
		 * The meta object literal for the '<em><b>Array To Objects</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARRAY__ARRAY_TO_OBJECTS = eINSTANCE.getArray_ArrayToObjects();

		/**
		 * The meta object literal for the '{@link reactNative.impl.ElementTextImpl <em>Element Text</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see reactNative.impl.ElementTextImpl
		 * @see reactNative.impl.ReactNativePackageImpl#getElementText()
		 * @generated
		 */
		EClass ELEMENT_TEXT = eINSTANCE.getElementText();

		/**
		 * The meta object literal for the '<em><b>Content Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT_TEXT__CONTENT_TEXT = eINSTANCE.getElementText_ContentText();

		/**
		 * The meta object literal for the '<em><b>Value Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT_TEXT__VALUE_TEXT = eINSTANCE.getElementText_ValueText();

		/**
		 * The meta object literal for the '<em><b>Element Text To Array</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_TEXT__ELEMENT_TEXT_TO_ARRAY = eINSTANCE.getElementText_ElementTextToArray();

		/**
		 * The meta object literal for the '{@link reactNative.impl.ElementImageImpl <em>Element Image</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see reactNative.impl.ElementImageImpl
		 * @see reactNative.impl.ReactNativePackageImpl#getElementImage()
		 * @generated
		 */
		EClass ELEMENT_IMAGE = eINSTANCE.getElementImage();

		/**
		 * The meta object literal for the '<em><b>Content Image</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT_IMAGE__CONTENT_IMAGE = eINSTANCE.getElementImage_ContentImage();

		/**
		 * The meta object literal for the '<em><b>Value Image</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT_IMAGE__VALUE_IMAGE = eINSTANCE.getElementImage_ValueImage();

		/**
		 * The meta object literal for the '<em><b>Element Image To Array</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_IMAGE__ELEMENT_IMAGE_TO_ARRAY = eINSTANCE.getElementImage_ElementImageToArray();

		/**
		 * The meta object literal for the '{@link reactNative.impl.ObjectElementImpl <em>Object Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see reactNative.impl.ObjectElementImpl
		 * @see reactNative.impl.ReactNativePackageImpl#getObjectElement()
		 * @generated
		 */
		EClass OBJECT_ELEMENT = eINSTANCE.getObjectElement();

		/**
		 * The meta object literal for the '<em><b>Element Text</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_ELEMENT__ELEMENT_TEXT = eINSTANCE.getObjectElement_ElementText();

		/**
		 * The meta object literal for the '<em><b>Element Image</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_ELEMENT__ELEMENT_IMAGE = eINSTANCE.getObjectElement_ElementImage();

		/**
		 * The meta object literal for the '<em><b>Sub Objects</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_ELEMENT__SUB_OBJECTS = eINSTANCE.getObjectElement_SubObjects();

		/**
		 * The meta object literal for the '<em><b>Object To Array</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_ELEMENT__OBJECT_TO_ARRAY = eINSTANCE.getObjectElement_ObjectToArray();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJECT_ELEMENT__ID = eINSTANCE.getObjectElement_Id();

		/**
		 * The meta object literal for the '{@link reactNative.impl.BorderImpl <em>Border</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see reactNative.impl.BorderImpl
		 * @see reactNative.impl.ReactNativePackageImpl#getBorder()
		 * @generated
		 */
		EClass BORDER = eINSTANCE.getBorder();

		/**
		 * The meta object literal for the '<em><b>Border Bottom Right Radius</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BORDER__BORDER_BOTTOM_RIGHT_RADIUS = eINSTANCE.getBorder_BorderBottomRightRadius();

		/**
		 * The meta object literal for the '<em><b>Border Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BORDER__BORDER_COLOR = eINSTANCE.getBorder_BorderColor();

		/**
		 * The meta object literal for the '<em><b>Border Radius</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BORDER__BORDER_RADIUS = eINSTANCE.getBorder_BorderRadius();

		/**
		 * The meta object literal for the '<em><b>Border Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BORDER__BORDER_WIDTH = eINSTANCE.getBorder_BorderWidth();

		/**
		 * The meta object literal for the '{@link reactNative.impl.PaddingImpl <em>Padding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see reactNative.impl.PaddingImpl
		 * @see reactNative.impl.ReactNativePackageImpl#getPadding()
		 * @generated
		 */
		EClass PADDING = eINSTANCE.getPadding();

		/**
		 * The meta object literal for the '<em><b>Padding</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PADDING__PADDING = eINSTANCE.getPadding_Padding();

		/**
		 * The meta object literal for the '<em><b>Padding Horizontal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PADDING__PADDING_HORIZONTAL = eINSTANCE.getPadding_PaddingHorizontal();

		/**
		 * The meta object literal for the '<em><b>Padding Vertical</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PADDING__PADDING_VERTICAL = eINSTANCE.getPadding_PaddingVertical();

	}

} //ReactNativePackage
