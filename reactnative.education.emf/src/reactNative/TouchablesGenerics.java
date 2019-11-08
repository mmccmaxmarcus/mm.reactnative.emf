/**
 */
package reactNative;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Touchables Generics</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link reactNative.TouchablesGenerics#getOnPress <em>On Press</em>}</li>
 * </ul>
 *
 * @see reactNative.ReactNativePackage#getTouchablesGenerics()
 * @model abstract="true"
 * @generated
 */
public interface TouchablesGenerics extends EObject {
	/**
	 * Returns the value of the '<em><b>On Press</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>On Press</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On Press</em>' attribute.
	 * @see #setOnPress(String)
	 * @see reactNative.ReactNativePackage#getTouchablesGenerics_OnPress()
	 * @model
	 * @generated
	 */
	String getOnPress();

	/**
	 * Sets the value of the '{@link reactNative.TouchablesGenerics#getOnPress <em>On Press</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On Press</em>' attribute.
	 * @see #getOnPress()
	 * @generated
	 */
	void setOnPress(String value);

} // TouchablesGenerics
