/**
 */
package reactNative;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Flex Box</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link reactNative.FlexBox#getFlex <em>Flex</em>}</li>
 *   <li>{@link reactNative.FlexBox#getFlexDirection <em>Flex Direction</em>}</li>
 *   <li>{@link reactNative.FlexBox#getJustifyContent <em>Justify Content</em>}</li>
 *   <li>{@link reactNative.FlexBox#getAlignItems <em>Align Items</em>}</li>
 * </ul>
 *
 * @see reactNative.ReactNativePackage#getFlexBox()
 * @model
 * @generated
 */
public interface FlexBox extends EObject {
	/**
	 * Returns the value of the '<em><b>Flex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Flex</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flex</em>' attribute.
	 * @see #setFlex(Integer)
	 * @see reactNative.ReactNativePackage#getFlexBox_Flex()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.IntObject"
	 * @generated
	 */
	Integer getFlex();

	/**
	 * Sets the value of the '{@link reactNative.FlexBox#getFlex <em>Flex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flex</em>' attribute.
	 * @see #getFlex()
	 * @generated
	 */
	void setFlex(Integer value);

	/**
	 * Returns the value of the '<em><b>Flex Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Flex Direction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flex Direction</em>' attribute.
	 * @see #setFlexDirection(String)
	 * @see reactNative.ReactNativePackage#getFlexBox_FlexDirection()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getFlexDirection();

	/**
	 * Sets the value of the '{@link reactNative.FlexBox#getFlexDirection <em>Flex Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flex Direction</em>' attribute.
	 * @see #getFlexDirection()
	 * @generated
	 */
	void setFlexDirection(String value);

	/**
	 * Returns the value of the '<em><b>Justify Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Justify Content</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Justify Content</em>' attribute.
	 * @see #setJustifyContent(String)
	 * @see reactNative.ReactNativePackage#getFlexBox_JustifyContent()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getJustifyContent();

	/**
	 * Sets the value of the '{@link reactNative.FlexBox#getJustifyContent <em>Justify Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Justify Content</em>' attribute.
	 * @see #getJustifyContent()
	 * @generated
	 */
	void setJustifyContent(String value);

	/**
	 * Returns the value of the '<em><b>Align Items</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Align Items</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Align Items</em>' attribute.
	 * @see #setAlignItems(String)
	 * @see reactNative.ReactNativePackage#getFlexBox_AlignItems()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getAlignItems();

	/**
	 * Sets the value of the '{@link reactNative.FlexBox#getAlignItems <em>Align Items</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Align Items</em>' attribute.
	 * @see #getAlignItems()
	 * @generated
	 */
	void setAlignItems(String value);

} // FlexBox
