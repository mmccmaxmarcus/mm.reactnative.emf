/**
 */
package reactNative;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Array</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link reactNative.Array#getValue <em>Value</em>}</li>
 *   <li>{@link reactNative.Array#getSubArray <em>Sub Array</em>}</li>
 *   <li>{@link reactNative.Array#getArrayToObjects <em>Array To Objects</em>}</li>
 * </ul>
 *
 * @see reactNative.ReactNativePackage#getArray()
 * @model
 * @generated
 */
public interface Array extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see reactNative.ReactNativePackage#getArray_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link reactNative.Array#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Sub Array</b></em>' containment reference list.
	 * The list contents are of type {@link reactNative.Array}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Array</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Array</em>' containment reference list.
	 * @see reactNative.ReactNativePackage#getArray_SubArray()
	 * @model containment="true"
	 * @generated
	 */
	EList<Array> getSubArray();

	/**
	 * Returns the value of the '<em><b>Array To Objects</b></em>' containment reference list.
	 * The list contents are of type {@link reactNative.ObjectElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Array To Objects</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Array To Objects</em>' containment reference list.
	 * @see reactNative.ReactNativePackage#getArray_ArrayToObjects()
	 * @model containment="true"
	 * @generated
	 */
	EList<ObjectElement> getArrayToObjects();

} // Array
