/**
 */
package reactNative;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link reactNative.Component#getComponentTotext <em>Component Totext</em>}</li>
 *   <li>{@link reactNative.Component#getComponentName <em>Component Name</em>}</li>
 *   <li>{@link reactNative.Component#getComponentToView <em>Component To View</em>}</li>
 *   <li>{@link reactNative.Component#isState <em>State</em>}</li>
 *   <li>{@link reactNative.Component#getComponentToTouchableOpacity <em>Component To Touchable Opacity</em>}</li>
 * </ul>
 *
 * @see reactNative.ReactNativePackage#getComponent()
 * @model
 * @generated
 */
public interface Component extends EObject {
	/**
	 * Returns the value of the '<em><b>Component Totext</b></em>' containment reference list.
	 * The list contents are of type {@link reactNative.Text}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component Totext</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Totext</em>' containment reference list.
	 * @see reactNative.ReactNativePackage#getComponent_ComponentTotext()
	 * @model containment="true"
	 * @generated
	 */
	EList<Text> getComponentTotext();

	/**
	 * Returns the value of the '<em><b>Component Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Name</em>' attribute.
	 * @see #setComponentName(String)
	 * @see reactNative.ReactNativePackage#getComponent_ComponentName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getComponentName();

	/**
	 * Sets the value of the '{@link reactNative.Component#getComponentName <em>Component Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component Name</em>' attribute.
	 * @see #getComponentName()
	 * @generated
	 */
	void setComponentName(String value);

	/**
	 * Returns the value of the '<em><b>Component To View</b></em>' containment reference list.
	 * The list contents are of type {@link reactNative.View}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component To View</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component To View</em>' containment reference list.
	 * @see reactNative.ReactNativePackage#getComponent_ComponentToView()
	 * @model containment="true"
	 * @generated
	 */
	EList<View> getComponentToView();

	/**
	 * Returns the value of the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' attribute.
	 * @see #setState(boolean)
	 * @see reactNative.ReactNativePackage#getComponent_State()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 * @generated
	 */
	boolean isState();

	/**
	 * Sets the value of the '{@link reactNative.Component#isState <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' attribute.
	 * @see #isState()
	 * @generated
	 */
	void setState(boolean value);

	/**
	 * Returns the value of the '<em><b>Component To Touchable Opacity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component To Touchable Opacity</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component To Touchable Opacity</em>' containment reference.
	 * @see #setComponentToTouchableOpacity(TouchableOpacity)
	 * @see reactNative.ReactNativePackage#getComponent_ComponentToTouchableOpacity()
	 * @model containment="true"
	 * @generated
	 */
	TouchableOpacity getComponentToTouchableOpacity();

	/**
	 * Sets the value of the '{@link reactNative.Component#getComponentToTouchableOpacity <em>Component To Touchable Opacity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component To Touchable Opacity</em>' containment reference.
	 * @see #getComponentToTouchableOpacity()
	 * @generated
	 */
	void setComponentToTouchableOpacity(TouchableOpacity value);

} // Component
