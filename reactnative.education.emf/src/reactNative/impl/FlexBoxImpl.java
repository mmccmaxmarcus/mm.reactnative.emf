/**
 */
package reactNative.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import reactNative.FlexBox;
import reactNative.ReactNativePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Flex Box</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link reactNative.impl.FlexBoxImpl#getFlex <em>Flex</em>}</li>
 *   <li>{@link reactNative.impl.FlexBoxImpl#getFlexDirection <em>Flex Direction</em>}</li>
 *   <li>{@link reactNative.impl.FlexBoxImpl#getJustifyContent <em>Justify Content</em>}</li>
 *   <li>{@link reactNative.impl.FlexBoxImpl#getAlignItems <em>Align Items</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FlexBoxImpl extends MinimalEObjectImpl.Container implements FlexBox {
	/**
	 * The default value of the '{@link #getFlex() <em>Flex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlex()
	 * @generated
	 * @ordered
	 */
	protected static final Integer FLEX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFlex() <em>Flex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlex()
	 * @generated
	 * @ordered
	 */
	protected Integer flex = FLEX_EDEFAULT;

	/**
	 * The default value of the '{@link #getFlexDirection() <em>Flex Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlexDirection()
	 * @generated
	 * @ordered
	 */
	protected static final String FLEX_DIRECTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFlexDirection() <em>Flex Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlexDirection()
	 * @generated
	 * @ordered
	 */
	protected String flexDirection = FLEX_DIRECTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getJustifyContent() <em>Justify Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJustifyContent()
	 * @generated
	 * @ordered
	 */
	protected static final String JUSTIFY_CONTENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getJustifyContent() <em>Justify Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJustifyContent()
	 * @generated
	 * @ordered
	 */
	protected String justifyContent = JUSTIFY_CONTENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getAlignItems() <em>Align Items</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlignItems()
	 * @generated
	 * @ordered
	 */
	protected static final String ALIGN_ITEMS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAlignItems() <em>Align Items</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlignItems()
	 * @generated
	 * @ordered
	 */
	protected String alignItems = ALIGN_ITEMS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FlexBoxImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReactNativePackage.Literals.FLEX_BOX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getFlex() {
		return flex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFlex(Integer newFlex) {
		Integer oldFlex = flex;
		flex = newFlex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReactNativePackage.FLEX_BOX__FLEX, oldFlex, flex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFlexDirection() {
		return flexDirection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFlexDirection(String newFlexDirection) {
		String oldFlexDirection = flexDirection;
		flexDirection = newFlexDirection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReactNativePackage.FLEX_BOX__FLEX_DIRECTION, oldFlexDirection, flexDirection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getJustifyContent() {
		return justifyContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJustifyContent(String newJustifyContent) {
		String oldJustifyContent = justifyContent;
		justifyContent = newJustifyContent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReactNativePackage.FLEX_BOX__JUSTIFY_CONTENT, oldJustifyContent, justifyContent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAlignItems() {
		return alignItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlignItems(String newAlignItems) {
		String oldAlignItems = alignItems;
		alignItems = newAlignItems;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReactNativePackage.FLEX_BOX__ALIGN_ITEMS, oldAlignItems, alignItems));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ReactNativePackage.FLEX_BOX__FLEX:
				return getFlex();
			case ReactNativePackage.FLEX_BOX__FLEX_DIRECTION:
				return getFlexDirection();
			case ReactNativePackage.FLEX_BOX__JUSTIFY_CONTENT:
				return getJustifyContent();
			case ReactNativePackage.FLEX_BOX__ALIGN_ITEMS:
				return getAlignItems();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ReactNativePackage.FLEX_BOX__FLEX:
				setFlex((Integer)newValue);
				return;
			case ReactNativePackage.FLEX_BOX__FLEX_DIRECTION:
				setFlexDirection((String)newValue);
				return;
			case ReactNativePackage.FLEX_BOX__JUSTIFY_CONTENT:
				setJustifyContent((String)newValue);
				return;
			case ReactNativePackage.FLEX_BOX__ALIGN_ITEMS:
				setAlignItems((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ReactNativePackage.FLEX_BOX__FLEX:
				setFlex(FLEX_EDEFAULT);
				return;
			case ReactNativePackage.FLEX_BOX__FLEX_DIRECTION:
				setFlexDirection(FLEX_DIRECTION_EDEFAULT);
				return;
			case ReactNativePackage.FLEX_BOX__JUSTIFY_CONTENT:
				setJustifyContent(JUSTIFY_CONTENT_EDEFAULT);
				return;
			case ReactNativePackage.FLEX_BOX__ALIGN_ITEMS:
				setAlignItems(ALIGN_ITEMS_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ReactNativePackage.FLEX_BOX__FLEX:
				return FLEX_EDEFAULT == null ? flex != null : !FLEX_EDEFAULT.equals(flex);
			case ReactNativePackage.FLEX_BOX__FLEX_DIRECTION:
				return FLEX_DIRECTION_EDEFAULT == null ? flexDirection != null : !FLEX_DIRECTION_EDEFAULT.equals(flexDirection);
			case ReactNativePackage.FLEX_BOX__JUSTIFY_CONTENT:
				return JUSTIFY_CONTENT_EDEFAULT == null ? justifyContent != null : !JUSTIFY_CONTENT_EDEFAULT.equals(justifyContent);
			case ReactNativePackage.FLEX_BOX__ALIGN_ITEMS:
				return ALIGN_ITEMS_EDEFAULT == null ? alignItems != null : !ALIGN_ITEMS_EDEFAULT.equals(alignItems);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (flex: ");
		result.append(flex);
		result.append(", flexDirection: ");
		result.append(flexDirection);
		result.append(", justifyContent: ");
		result.append(justifyContent);
		result.append(", alignItems: ");
		result.append(alignItems);
		result.append(')');
		return result.toString();
	}

} //FlexBoxImpl
