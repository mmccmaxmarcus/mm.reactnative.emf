/**
 */
package reactNative;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link reactNative.View#getHasText <em>Has Text</em>}</li>
 *   <li>{@link reactNative.View#getViewToflatlists <em>View Toflatlists</em>}</li>
 *   <li>{@link reactNative.View#getViewType <em>View Type</em>}</li>
 *   <li>{@link reactNative.View#getViewName <em>View Name</em>}</li>
 *   <li>{@link reactNative.View#getHasImage <em>Has Image</em>}</li>
 *   <li>{@link reactNative.View#getViewToTouchableOpacity <em>View To Touchable Opacity</em>}</li>
 *   <li>{@link reactNative.View#getViewToIcon <em>View To Icon</em>}</li>
 *   <li>{@link reactNative.View#getViewToButton <em>View To Button</em>}</li>
 *   <li>{@link reactNative.View#getSubView <em>Sub View</em>}</li>
 *   <li>{@link reactNative.View#getViewToStyleSheet <em>View To Style Sheet</em>}</li>
 * </ul>
 *
 * @see reactNative.ReactNativePackage#getView()
 * @model
 * @generated
 */
public interface View extends EObject {
	/**
	 * Returns the value of the '<em><b>Has Text</b></em>' containment reference list.
	 * The list contents are of type {@link reactNative.Text}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Text</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Text</em>' containment reference list.
	 * @see reactNative.ReactNativePackage#getView_HasText()
	 * @model containment="true"
	 * @generated
	 */
	EList<Text> getHasText();

	/**
	 * Returns the value of the '<em><b>View Toflatlists</b></em>' containment reference list.
	 * The list contents are of type {@link reactNative.FlatList}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>View Toflatlists</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>View Toflatlists</em>' containment reference list.
	 * @see reactNative.ReactNativePackage#getView_ViewToflatlists()
	 * @model containment="true"
	 * @generated
	 */
	EList<FlatList> getViewToflatlists();

	/**
	 * Returns the value of the '<em><b>View Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>View Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>View Type</em>' attribute.
	 * @see #setViewType(int)
	 * @see reactNative.ReactNativePackage#getView_ViewType()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Int"
	 * @generated
	 */
	int getViewType();

	/**
	 * Sets the value of the '{@link reactNative.View#getViewType <em>View Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>View Type</em>' attribute.
	 * @see #getViewType()
	 * @generated
	 */
	void setViewType(int value);

	/**
	 * Returns the value of the '<em><b>View Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>View Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>View Name</em>' attribute.
	 * @see #setViewName(String)
	 * @see reactNative.ReactNativePackage#getView_ViewName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getViewName();

	/**
	 * Sets the value of the '{@link reactNative.View#getViewName <em>View Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>View Name</em>' attribute.
	 * @see #getViewName()
	 * @generated
	 */
	void setViewName(String value);

	/**
	 * Returns the value of the '<em><b>Has Image</b></em>' containment reference list.
	 * The list contents are of type {@link reactNative.Image}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Image</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Image</em>' containment reference list.
	 * @see reactNative.ReactNativePackage#getView_HasImage()
	 * @model containment="true"
	 * @generated
	 */
	EList<Image> getHasImage();

	/**
	 * Returns the value of the '<em><b>View To Touchable Opacity</b></em>' containment reference list.
	 * The list contents are of type {@link reactNative.TouchableOpacity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>View To Touchable Opacity</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>View To Touchable Opacity</em>' containment reference list.
	 * @see reactNative.ReactNativePackage#getView_ViewToTouchableOpacity()
	 * @model containment="true"
	 * @generated
	 */
	EList<TouchableOpacity> getViewToTouchableOpacity();

	/**
	 * Returns the value of the '<em><b>View To Icon</b></em>' containment reference list.
	 * The list contents are of type {@link reactNative.Icon}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>View To Icon</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>View To Icon</em>' containment reference list.
	 * @see reactNative.ReactNativePackage#getView_ViewToIcon()
	 * @model containment="true"
	 * @generated
	 */
	EList<Icon> getViewToIcon();

	/**
	 * Returns the value of the '<em><b>View To Button</b></em>' containment reference list.
	 * The list contents are of type {@link reactNative.Button}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>View To Button</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>View To Button</em>' containment reference list.
	 * @see reactNative.ReactNativePackage#getView_ViewToButton()
	 * @model containment="true"
	 * @generated
	 */
	EList<Button> getViewToButton();

	/**
	 * Returns the value of the '<em><b>Sub View</b></em>' containment reference list.
	 * The list contents are of type {@link reactNative.View}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub View</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub View</em>' containment reference list.
	 * @see reactNative.ReactNativePackage#getView_SubView()
	 * @model containment="true"
	 * @generated
	 */
	EList<View> getSubView();

	/**
	 * Returns the value of the '<em><b>View To Style Sheet</b></em>' containment reference list.
	 * The list contents are of type {@link reactNative.StyleSheet}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>View To Style Sheet</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>View To Style Sheet</em>' containment reference list.
	 * @see reactNative.ReactNativePackage#getView_ViewToStyleSheet()
	 * @model containment="true"
	 * @generated
	 */
	EList<StyleSheet> getViewToStyleSheet();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void style(StyleSheet style);

} // View
