/**
 */
package reactNative;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element Image</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link reactNative.ElementImage#getContentImage <em>Content Image</em>}</li>
 *   <li>{@link reactNative.ElementImage#getValueImage <em>Value Image</em>}</li>
 *   <li>{@link reactNative.ElementImage#getElementImageToArray <em>Element Image To Array</em>}</li>
 * </ul>
 *
 * @see reactNative.ReactNativePackage#getElementImage()
 * @model
 * @generated
 */
public interface ElementImage extends EObject {
	/**
	 * Returns the value of the '<em><b>Content Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content Image</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content Image</em>' attribute.
	 * @see #setContentImage(String)
	 * @see reactNative.ReactNativePackage#getElementImage_ContentImage()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getContentImage();

	/**
	 * Sets the value of the '{@link reactNative.ElementImage#getContentImage <em>Content Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content Image</em>' attribute.
	 * @see #getContentImage()
	 * @generated
	 */
	void setContentImage(String value);

	/**
	 * Returns the value of the '<em><b>Value Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Image</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Image</em>' attribute.
	 * @see #setValueImage(String)
	 * @see reactNative.ReactNativePackage#getElementImage_ValueImage()
	 * @model
	 * @generated
	 */
	String getValueImage();

	/**
	 * Sets the value of the '{@link reactNative.ElementImage#getValueImage <em>Value Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Image</em>' attribute.
	 * @see #getValueImage()
	 * @generated
	 */
	void setValueImage(String value);

	/**
	 * Returns the value of the '<em><b>Element Image To Array</b></em>' containment reference list.
	 * The list contents are of type {@link reactNative.Array}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element Image To Array</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element Image To Array</em>' containment reference list.
	 * @see reactNative.ReactNativePackage#getElementImage_ElementImageToArray()
	 * @model containment="true"
	 * @generated
	 */
	EList<Array> getElementImageToArray();

} // ElementImage
