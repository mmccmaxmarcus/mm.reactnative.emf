/**
 */
package reactNative;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Style Sheet</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link reactNative.StyleSheet#getNameStyle <em>Name Style</em>}</li>
 *   <li>{@link reactNative.StyleSheet#getHasFlexbox <em>Has Flexbox</em>}</li>
 *   <li>{@link reactNative.StyleSheet#getHasFont <em>Has Font</em>}</li>
 *   <li>{@link reactNative.StyleSheet#getHasMargin <em>Has Margin</em>}</li>
 *   <li>{@link reactNative.StyleSheet#getHasBorder <em>Has Border</em>}</li>
 *   <li>{@link reactNative.StyleSheet#getHasPadding <em>Has Padding</em>}</li>
 * </ul>
 *
 * @see reactNative.ReactNativePackage#getStyleSheet()
 * @model
 * @generated
 */
public interface StyleSheet extends EObject {
	/**
	 * Returns the value of the '<em><b>Name Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name Style</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name Style</em>' attribute.
	 * @see #setNameStyle(String)
	 * @see reactNative.ReactNativePackage#getStyleSheet_NameStyle()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getNameStyle();

	/**
	 * Sets the value of the '{@link reactNative.StyleSheet#getNameStyle <em>Name Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Style</em>' attribute.
	 * @see #getNameStyle()
	 * @generated
	 */
	void setNameStyle(String value);

	/**
	 * Returns the value of the '<em><b>Has Flexbox</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Flexbox</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Flexbox</em>' containment reference.
	 * @see #setHasFlexbox(FlexBox)
	 * @see reactNative.ReactNativePackage#getStyleSheet_HasFlexbox()
	 * @model containment="true"
	 * @generated
	 */
	FlexBox getHasFlexbox();

	/**
	 * Sets the value of the '{@link reactNative.StyleSheet#getHasFlexbox <em>Has Flexbox</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Flexbox</em>' containment reference.
	 * @see #getHasFlexbox()
	 * @generated
	 */
	void setHasFlexbox(FlexBox value);

	/**
	 * Returns the value of the '<em><b>Has Font</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Font</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Font</em>' containment reference.
	 * @see #setHasFont(Font)
	 * @see reactNative.ReactNativePackage#getStyleSheet_HasFont()
	 * @model containment="true"
	 * @generated
	 */
	Font getHasFont();

	/**
	 * Sets the value of the '{@link reactNative.StyleSheet#getHasFont <em>Has Font</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Font</em>' containment reference.
	 * @see #getHasFont()
	 * @generated
	 */
	void setHasFont(Font value);

	/**
	 * Returns the value of the '<em><b>Has Margin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Margin</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Margin</em>' containment reference.
	 * @see #setHasMargin(Margin)
	 * @see reactNative.ReactNativePackage#getStyleSheet_HasMargin()
	 * @model containment="true"
	 * @generated
	 */
	Margin getHasMargin();

	/**
	 * Sets the value of the '{@link reactNative.StyleSheet#getHasMargin <em>Has Margin</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Margin</em>' containment reference.
	 * @see #getHasMargin()
	 * @generated
	 */
	void setHasMargin(Margin value);

	/**
	 * Returns the value of the '<em><b>Has Border</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Border</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Border</em>' containment reference.
	 * @see #setHasBorder(Border)
	 * @see reactNative.ReactNativePackage#getStyleSheet_HasBorder()
	 * @model containment="true"
	 * @generated
	 */
	Border getHasBorder();

	/**
	 * Sets the value of the '{@link reactNative.StyleSheet#getHasBorder <em>Has Border</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Border</em>' containment reference.
	 * @see #getHasBorder()
	 * @generated
	 */
	void setHasBorder(Border value);

	/**
	 * Returns the value of the '<em><b>Has Padding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Padding</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Padding</em>' containment reference.
	 * @see #setHasPadding(Padding)
	 * @see reactNative.ReactNativePackage#getStyleSheet_HasPadding()
	 * @model containment="true"
	 * @generated
	 */
	Padding getHasPadding();

	/**
	 * Sets the value of the '{@link reactNative.StyleSheet#getHasPadding <em>Has Padding</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Padding</em>' containment reference.
	 * @see #getHasPadding()
	 * @generated
	 */
	void setHasPadding(Padding value);

} // StyleSheet
