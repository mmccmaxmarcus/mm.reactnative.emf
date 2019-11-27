/**
 */
package reactNative.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import reactNative.Array;
import reactNative.ObjectElement;
import reactNative.ReactNativePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Array</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link reactNative.impl.ArrayImpl#getValue <em>Value</em>}</li>
 *   <li>{@link reactNative.impl.ArrayImpl#getSubArray <em>Sub Array</em>}</li>
 *   <li>{@link reactNative.impl.ArrayImpl#getArrayToObjects <em>Array To Objects</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArrayImpl extends MinimalEObjectImpl.Container implements Array {
	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected String value = VALUE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSubArray() <em>Sub Array</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubArray()
	 * @generated
	 * @ordered
	 */
	protected EList<Array> subArray;

	/**
	 * The cached value of the '{@link #getArrayToObjects() <em>Array To Objects</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArrayToObjects()
	 * @generated
	 * @ordered
	 */
	protected EList<ObjectElement> arrayToObjects;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArrayImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReactNativePackage.Literals.ARRAY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValue(String newValue) {
		String oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReactNativePackage.ARRAY__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Array> getSubArray() {
		if (subArray == null) {
			subArray = new EObjectContainmentEList<Array>(Array.class, this, ReactNativePackage.ARRAY__SUB_ARRAY);
		}
		return subArray;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ObjectElement> getArrayToObjects() {
		if (arrayToObjects == null) {
			arrayToObjects = new EObjectContainmentEList<ObjectElement>(ObjectElement.class, this, ReactNativePackage.ARRAY__ARRAY_TO_OBJECTS);
		}
		return arrayToObjects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ReactNativePackage.ARRAY__SUB_ARRAY:
				return ((InternalEList<?>)getSubArray()).basicRemove(otherEnd, msgs);
			case ReactNativePackage.ARRAY__ARRAY_TO_OBJECTS:
				return ((InternalEList<?>)getArrayToObjects()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ReactNativePackage.ARRAY__VALUE:
				return getValue();
			case ReactNativePackage.ARRAY__SUB_ARRAY:
				return getSubArray();
			case ReactNativePackage.ARRAY__ARRAY_TO_OBJECTS:
				return getArrayToObjects();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ReactNativePackage.ARRAY__VALUE:
				setValue((String)newValue);
				return;
			case ReactNativePackage.ARRAY__SUB_ARRAY:
				getSubArray().clear();
				getSubArray().addAll((Collection<? extends Array>)newValue);
				return;
			case ReactNativePackage.ARRAY__ARRAY_TO_OBJECTS:
				getArrayToObjects().clear();
				getArrayToObjects().addAll((Collection<? extends ObjectElement>)newValue);
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
			case ReactNativePackage.ARRAY__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case ReactNativePackage.ARRAY__SUB_ARRAY:
				getSubArray().clear();
				return;
			case ReactNativePackage.ARRAY__ARRAY_TO_OBJECTS:
				getArrayToObjects().clear();
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
			case ReactNativePackage.ARRAY__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case ReactNativePackage.ARRAY__SUB_ARRAY:
				return subArray != null && !subArray.isEmpty();
			case ReactNativePackage.ARRAY__ARRAY_TO_OBJECTS:
				return arrayToObjects != null && !arrayToObjects.isEmpty();
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
		result.append(" (value: ");
		result.append(value);
		result.append(')');
		return result.toString();
	}

} //ArrayImpl
