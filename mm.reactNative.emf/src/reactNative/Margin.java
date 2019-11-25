/**
 */
package reactNative;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Margin</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link reactNative.Margin#getMarginTop <em>Margin Top</em>}</li>
 *   <li>{@link reactNative.Margin#getMarginBottom <em>Margin Bottom</em>}</li>
 *   <li>{@link reactNative.Margin#getMargin <em>Margin</em>}</li>
 * </ul>
 *
 * @see reactNative.ReactNativePackage#getMargin()
 * @model
 * @generated
 */
public interface Margin extends EObject {
	/**
	 * Returns the value of the '<em><b>Margin Top</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Margin Top</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Margin Top</em>' attribute.
	 * @see #setMarginTop(String)
	 * @see reactNative.ReactNativePackage#getMargin_MarginTop()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getMarginTop();

	/**
	 * Sets the value of the '{@link reactNative.Margin#getMarginTop <em>Margin Top</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Margin Top</em>' attribute.
	 * @see #getMarginTop()
	 * @generated
	 */
	void setMarginTop(String value);

	/**
	 * Returns the value of the '<em><b>Margin Bottom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Margin Bottom</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Margin Bottom</em>' attribute.
	 * @see #setMarginBottom(String)
	 * @see reactNative.ReactNativePackage#getMargin_MarginBottom()
	 * @model
	 * @generated
	 */
	String getMarginBottom();

	/**
	 * Sets the value of the '{@link reactNative.Margin#getMarginBottom <em>Margin Bottom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Margin Bottom</em>' attribute.
	 * @see #getMarginBottom()
	 * @generated
	 */
	void setMarginBottom(String value);

	/**
	 * Returns the value of the '<em><b>Margin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Margin</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Margin</em>' attribute.
	 * @see #setMargin(String)
	 * @see reactNative.ReactNativePackage#getMargin_Margin()
	 * @model
	 * @generated
	 */
	String getMargin();

	/**
	 * Sets the value of the '{@link reactNative.Margin#getMargin <em>Margin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Margin</em>' attribute.
	 * @see #getMargin()
	 * @generated
	 */
	void setMargin(String value);

} // Margin
