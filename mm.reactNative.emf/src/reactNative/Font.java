/**
 */
package reactNative;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Font</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link reactNative.Font#getFontSize <em>Font Size</em>}</li>
 *   <li>{@link reactNative.Font#getFontFamily <em>Font Family</em>}</li>
 *   <li>{@link reactNative.Font#getFontWeight <em>Font Weight</em>}</li>
 * </ul>
 *
 * @see reactNative.ReactNativePackage#getFont()
 * @model
 * @generated
 */
public interface Font extends EObject {
	/**
	 * Returns the value of the '<em><b>Font Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Font Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Font Size</em>' attribute.
	 * @see #setFontSize(String)
	 * @see reactNative.ReactNativePackage#getFont_FontSize()
	 * @model
	 * @generated
	 */
	String getFontSize();

	/**
	 * Sets the value of the '{@link reactNative.Font#getFontSize <em>Font Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Font Size</em>' attribute.
	 * @see #getFontSize()
	 * @generated
	 */
	void setFontSize(String value);

	/**
	 * Returns the value of the '<em><b>Font Family</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Font Family</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Font Family</em>' attribute.
	 * @see #setFontFamily(String)
	 * @see reactNative.ReactNativePackage#getFont_FontFamily()
	 * @model
	 * @generated
	 */
	String getFontFamily();

	/**
	 * Sets the value of the '{@link reactNative.Font#getFontFamily <em>Font Family</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Font Family</em>' attribute.
	 * @see #getFontFamily()
	 * @generated
	 */
	void setFontFamily(String value);

	/**
	 * Returns the value of the '<em><b>Font Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Font Weight</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Font Weight</em>' attribute.
	 * @see #setFontWeight(String)
	 * @see reactNative.ReactNativePackage#getFont_FontWeight()
	 * @model
	 * @generated
	 */
	String getFontWeight();

	/**
	 * Sets the value of the '{@link reactNative.Font#getFontWeight <em>Font Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Font Weight</em>' attribute.
	 * @see #getFontWeight()
	 * @generated
	 */
	void setFontWeight(String value);

} // Font
