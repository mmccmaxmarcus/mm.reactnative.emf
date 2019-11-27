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
import reactNative.ElementImage;
import reactNative.ElementText;
import reactNative.ObjectElement;
import reactNative.ReactNativePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Object Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link reactNative.impl.ObjectElementImpl#getElementText <em>Element Text</em>}</li>
 *   <li>{@link reactNative.impl.ObjectElementImpl#getElementImage <em>Element Image</em>}</li>
 *   <li>{@link reactNative.impl.ObjectElementImpl#getSubObjects <em>Sub Objects</em>}</li>
 *   <li>{@link reactNative.impl.ObjectElementImpl#getObjectToArray <em>Object To Array</em>}</li>
 *   <li>{@link reactNative.impl.ObjectElementImpl#isId <em>Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ObjectElementImpl extends MinimalEObjectImpl.Container implements ObjectElement {
	/**
	 * The cached value of the '{@link #getElementText() <em>Element Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementText()
	 * @generated
	 * @ordered
	 */
	protected EList<ElementText> elementText;

	/**
	 * The cached value of the '{@link #getElementImage() <em>Element Image</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementImage()
	 * @generated
	 * @ordered
	 */
	protected EList<ElementImage> elementImage;

	/**
	 * The cached value of the '{@link #getSubObjects() <em>Sub Objects</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubObjects()
	 * @generated
	 * @ordered
	 */
	protected EList<ObjectElement> subObjects;

	/**
	 * The cached value of the '{@link #getObjectToArray() <em>Object To Array</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectToArray()
	 * @generated
	 * @ordered
	 */
	protected EList<Array> objectToArray;

	/**
	 * The default value of the '{@link #isId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isId()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ID_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isId()
	 * @generated
	 * @ordered
	 */
	protected boolean id = ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjectElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReactNativePackage.Literals.OBJECT_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ElementText> getElementText() {
		if (elementText == null) {
			elementText = new EObjectContainmentEList<ElementText>(ElementText.class, this, ReactNativePackage.OBJECT_ELEMENT__ELEMENT_TEXT);
		}
		return elementText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ElementImage> getElementImage() {
		if (elementImage == null) {
			elementImage = new EObjectContainmentEList<ElementImage>(ElementImage.class, this, ReactNativePackage.OBJECT_ELEMENT__ELEMENT_IMAGE);
		}
		return elementImage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ObjectElement> getSubObjects() {
		if (subObjects == null) {
			subObjects = new EObjectContainmentEList<ObjectElement>(ObjectElement.class, this, ReactNativePackage.OBJECT_ELEMENT__SUB_OBJECTS);
		}
		return subObjects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Array> getObjectToArray() {
		if (objectToArray == null) {
			objectToArray = new EObjectContainmentEList<Array>(Array.class, this, ReactNativePackage.OBJECT_ELEMENT__OBJECT_TO_ARRAY);
		}
		return objectToArray;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(boolean newId) {
		boolean oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReactNativePackage.OBJECT_ELEMENT__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ReactNativePackage.OBJECT_ELEMENT__ELEMENT_TEXT:
				return ((InternalEList<?>)getElementText()).basicRemove(otherEnd, msgs);
			case ReactNativePackage.OBJECT_ELEMENT__ELEMENT_IMAGE:
				return ((InternalEList<?>)getElementImage()).basicRemove(otherEnd, msgs);
			case ReactNativePackage.OBJECT_ELEMENT__SUB_OBJECTS:
				return ((InternalEList<?>)getSubObjects()).basicRemove(otherEnd, msgs);
			case ReactNativePackage.OBJECT_ELEMENT__OBJECT_TO_ARRAY:
				return ((InternalEList<?>)getObjectToArray()).basicRemove(otherEnd, msgs);
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
			case ReactNativePackage.OBJECT_ELEMENT__ELEMENT_TEXT:
				return getElementText();
			case ReactNativePackage.OBJECT_ELEMENT__ELEMENT_IMAGE:
				return getElementImage();
			case ReactNativePackage.OBJECT_ELEMENT__SUB_OBJECTS:
				return getSubObjects();
			case ReactNativePackage.OBJECT_ELEMENT__OBJECT_TO_ARRAY:
				return getObjectToArray();
			case ReactNativePackage.OBJECT_ELEMENT__ID:
				return isId();
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
			case ReactNativePackage.OBJECT_ELEMENT__ELEMENT_TEXT:
				getElementText().clear();
				getElementText().addAll((Collection<? extends ElementText>)newValue);
				return;
			case ReactNativePackage.OBJECT_ELEMENT__ELEMENT_IMAGE:
				getElementImage().clear();
				getElementImage().addAll((Collection<? extends ElementImage>)newValue);
				return;
			case ReactNativePackage.OBJECT_ELEMENT__SUB_OBJECTS:
				getSubObjects().clear();
				getSubObjects().addAll((Collection<? extends ObjectElement>)newValue);
				return;
			case ReactNativePackage.OBJECT_ELEMENT__OBJECT_TO_ARRAY:
				getObjectToArray().clear();
				getObjectToArray().addAll((Collection<? extends Array>)newValue);
				return;
			case ReactNativePackage.OBJECT_ELEMENT__ID:
				setId((Boolean)newValue);
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
			case ReactNativePackage.OBJECT_ELEMENT__ELEMENT_TEXT:
				getElementText().clear();
				return;
			case ReactNativePackage.OBJECT_ELEMENT__ELEMENT_IMAGE:
				getElementImage().clear();
				return;
			case ReactNativePackage.OBJECT_ELEMENT__SUB_OBJECTS:
				getSubObjects().clear();
				return;
			case ReactNativePackage.OBJECT_ELEMENT__OBJECT_TO_ARRAY:
				getObjectToArray().clear();
				return;
			case ReactNativePackage.OBJECT_ELEMENT__ID:
				setId(ID_EDEFAULT);
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
			case ReactNativePackage.OBJECT_ELEMENT__ELEMENT_TEXT:
				return elementText != null && !elementText.isEmpty();
			case ReactNativePackage.OBJECT_ELEMENT__ELEMENT_IMAGE:
				return elementImage != null && !elementImage.isEmpty();
			case ReactNativePackage.OBJECT_ELEMENT__SUB_OBJECTS:
				return subObjects != null && !subObjects.isEmpty();
			case ReactNativePackage.OBJECT_ELEMENT__OBJECT_TO_ARRAY:
				return objectToArray != null && !objectToArray.isEmpty();
			case ReactNativePackage.OBJECT_ELEMENT__ID:
				return id != ID_EDEFAULT;
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
		result.append(" (id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //ObjectElementImpl
