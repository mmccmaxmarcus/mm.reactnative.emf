/**
 */
package reactNative;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Text</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link reactNative.Text#getContentText <em>Content Text</em>}</li>
 *   <li>{@link reactNative.Text#getColor <em>Color</em>}</li>
 *   <li>{@link reactNative.Text#getFontSize <em>Font Size</em>}</li>
 *   <li>{@link reactNative.Text#getTextAlign <em>Text Align</em>}</li>
 *   <li>{@link reactNative.Text#getName <em>Name</em>}</li>
 *   <li>{@link reactNative.Text#getTextToStylesheet <em>Text To Stylesheet</em>}</li>
 * </ul>
 *
 * @see reactNative.ReactNativePackage#getText()
 * @model
 * @generated
 */
public interface Text extends EObject {
	/**
	 * Returns the value of the '<em><b>Content Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content Text</em>' attribute.
	 * @see #setContentText(String)
	 * @see reactNative.ReactNativePackage#getText_ContentText()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getContentText();

	/**
	 * Sets the value of the '{@link reactNative.Text#getContentText <em>Content Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content Text</em>' attribute.
	 * @see #getContentText()
	 * @generated
	 */
	void setContentText(String value);

	/**
	 * Returns the value of the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Color</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Color</em>' attribute.
	 * @see #setColor(String)
	 * @see reactNative.ReactNativePackage#getText_Color()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getColor();

	/**
	 * Sets the value of the '{@link reactNative.Text#getColor <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color</em>' attribute.
	 * @see #getColor()
	 * @generated
	 */
	void setColor(String value);

	/**
	 * Returns the value of the '<em><b>Font Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Font Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Font Size</em>' attribute.
	 * @see #setFontSize(int)
	 * @see reactNative.ReactNativePackage#getText_FontSize()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Int"
	 * @generated
	 */
	int getFontSize();

	/**
	 * Sets the value of the '{@link reactNative.Text#getFontSize <em>Font Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Font Size</em>' attribute.
	 * @see #getFontSize()
	 * @generated
	 */
	void setFontSize(int value);

	/**
	 * Returns the value of the '<em><b>Text Align</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text Align</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text Align</em>' attribute.
	 * @see #setTextAlign(String)
	 * @see reactNative.ReactNativePackage#getText_TextAlign()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getTextAlign();

	/**
	 * Sets the value of the '{@link reactNative.Text#getTextAlign <em>Text Align</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text Align</em>' attribute.
	 * @see #getTextAlign()
	 * @generated
	 */
	void setTextAlign(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see reactNative.ReactNativePackage#getText_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link reactNative.Text#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Text To Stylesheet</b></em>' containment reference list.
	 * The list contents are of type {@link reactNative.StyleSheet}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text To Stylesheet</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text To Stylesheet</em>' containment reference list.
	 * @see reactNative.ReactNativePackage#getText_TextToStylesheet()
	 * @model containment="true"
	 * @generated
	 */
	EList<StyleSheet> getTextToStylesheet();

} // Text
