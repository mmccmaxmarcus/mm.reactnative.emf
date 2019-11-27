/**
 */
package reactNative;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element Text</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link reactNative.ElementText#getContentText <em>Content Text</em>}</li>
 *   <li>{@link reactNative.ElementText#getValueText <em>Value Text</em>}</li>
 *   <li>{@link reactNative.ElementText#getElementTextToArray <em>Element Text To Array</em>}</li>
 * </ul>
 *
 * @see reactNative.ReactNativePackage#getElementText()
 * @model
 * @generated
 */
public interface ElementText extends EObject {
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
	 * @see reactNative.ReactNativePackage#getElementText_ContentText()
	 * @model
	 * @generated
	 */
	String getContentText();

	/**
	 * Sets the value of the '{@link reactNative.ElementText#getContentText <em>Content Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content Text</em>' attribute.
	 * @see #getContentText()
	 * @generated
	 */
	void setContentText(String value);

	/**
	 * Returns the value of the '<em><b>Value Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Text</em>' attribute.
	 * @see #setValueText(String)
	 * @see reactNative.ReactNativePackage#getElementText_ValueText()
	 * @model
	 * @generated
	 */
	String getValueText();

	/**
	 * Sets the value of the '{@link reactNative.ElementText#getValueText <em>Value Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Text</em>' attribute.
	 * @see #getValueText()
	 * @generated
	 */
	void setValueText(String value);

	/**
	 * Returns the value of the '<em><b>Element Text To Array</b></em>' containment reference list.
	 * The list contents are of type {@link reactNative.Array}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element Text To Array</em>' containment reference list.
	 * @see reactNative.ReactNativePackage#getElementText_ElementTextToArray()
	 * @model containment="true"
	 * @generated
	 */
	EList<Array> getElementTextToArray();

} // ElementText
