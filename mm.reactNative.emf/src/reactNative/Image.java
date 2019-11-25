/**
 */
package reactNative;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Image</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link reactNative.Image#getName <em>Name</em>}</li>
 *   <li>{@link reactNative.Image#getSource <em>Source</em>}</li>
 *   <li>{@link reactNative.Image#getImageTostylesheet <em>Image Tostylesheet</em>}</li>
 * </ul>
 *
 * @see reactNative.ReactNativePackage#getImage()
 * @model
 * @generated
 */
public interface Image extends EObject {
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
	 * @see reactNative.ReactNativePackage#getImage_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link reactNative.Image#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' attribute.
	 * @see #setSource(String)
	 * @see reactNative.ReactNativePackage#getImage_Source()
	 * @model
	 * @generated
	 */
	String getSource();

	/**
	 * Sets the value of the '{@link reactNative.Image#getSource <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' attribute.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(String value);

	/**
	 * Returns the value of the '<em><b>Image Tostylesheet</b></em>' containment reference list.
	 * The list contents are of type {@link reactNative.StyleSheet}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Image Tostylesheet</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image Tostylesheet</em>' containment reference list.
	 * @see reactNative.ReactNativePackage#getImage_ImageTostylesheet()
	 * @model containment="true"
	 * @generated
	 */
	EList<StyleSheet> getImageTostylesheet();

} // Image
