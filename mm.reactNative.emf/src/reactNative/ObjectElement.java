/**
 */
package reactNative;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link reactNative.ObjectElement#getElementText <em>Element Text</em>}</li>
 *   <li>{@link reactNative.ObjectElement#getElementImage <em>Element Image</em>}</li>
 *   <li>{@link reactNative.ObjectElement#getSubObjects <em>Sub Objects</em>}</li>
 *   <li>{@link reactNative.ObjectElement#getObjectToArray <em>Object To Array</em>}</li>
 *   <li>{@link reactNative.ObjectElement#isId <em>Id</em>}</li>
 * </ul>
 *
 * @see reactNative.ReactNativePackage#getObjectElement()
 * @model
 * @generated
 */
public interface ObjectElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Element Text</b></em>' containment reference list.
	 * The list contents are of type {@link reactNative.ElementText}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element Text</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element Text</em>' containment reference list.
	 * @see reactNative.ReactNativePackage#getObjectElement_ElementText()
	 * @model containment="true"
	 * @generated
	 */
	EList<ElementText> getElementText();

	/**
	 * Returns the value of the '<em><b>Element Image</b></em>' containment reference list.
	 * The list contents are of type {@link reactNative.ElementImage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element Image</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element Image</em>' containment reference list.
	 * @see reactNative.ReactNativePackage#getObjectElement_ElementImage()
	 * @model containment="true"
	 * @generated
	 */
	EList<ElementImage> getElementImage();

	/**
	 * Returns the value of the '<em><b>Sub Objects</b></em>' containment reference list.
	 * The list contents are of type {@link reactNative.ObjectElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Objects</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Objects</em>' containment reference list.
	 * @see reactNative.ReactNativePackage#getObjectElement_SubObjects()
	 * @model containment="true"
	 * @generated
	 */
	EList<ObjectElement> getSubObjects();

	/**
	 * Returns the value of the '<em><b>Object To Array</b></em>' containment reference list.
	 * The list contents are of type {@link reactNative.Array}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object To Array</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object To Array</em>' containment reference list.
	 * @see reactNative.ReactNativePackage#getObjectElement_ObjectToArray()
	 * @model containment="true"
	 * @generated
	 */
	EList<Array> getObjectToArray();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(boolean)
	 * @see reactNative.ReactNativePackage#getObjectElement_Id()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 * @generated
	 */
	boolean isId();

	/**
	 * Sets the value of the '{@link reactNative.ObjectElement#isId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #isId()
	 * @generated
	 */
	void setId(boolean value);

} // ObjectElement
