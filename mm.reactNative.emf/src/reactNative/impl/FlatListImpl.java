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
import reactNative.FlatList;
import reactNative.ReactNativePackage;
import reactNative.View;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Flat List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link reactNative.impl.FlatListImpl#getHasViews <em>Has Views</em>}</li>
 *   <li>{@link reactNative.impl.FlatListImpl#getFlatlistName <em>Flatlist Name</em>}</li>
 *   <li>{@link reactNative.impl.FlatListImpl#getData <em>Data</em>}</li>
 *   <li>{@link reactNative.impl.FlatListImpl#getRenderItem <em>Render Item</em>}</li>
 *   <li>{@link reactNative.impl.FlatListImpl#getKeyExtractor <em>Key Extractor</em>}</li>
 *   <li>{@link reactNative.impl.FlatListImpl#getFlatListToArray <em>Flat List To Array</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FlatListImpl extends MinimalEObjectImpl.Container implements FlatList {
	/**
	 * The cached value of the '{@link #getHasViews() <em>Has Views</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasViews()
	 * @generated
	 * @ordered
	 */
	protected EList<View> hasViews;

	/**
	 * The default value of the '{@link #getFlatlistName() <em>Flatlist Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlatlistName()
	 * @generated
	 * @ordered
	 */
	protected static final String FLATLIST_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFlatlistName() <em>Flatlist Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlatlistName()
	 * @generated
	 * @ordered
	 */
	protected String flatlistName = FLATLIST_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getData() <em>Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getData()
	 * @generated
	 * @ordered
	 */
	protected static final String DATA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getData() <em>Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getData()
	 * @generated
	 * @ordered
	 */
	protected String data = DATA_EDEFAULT;

	/**
	 * The default value of the '{@link #getRenderItem() <em>Render Item</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRenderItem()
	 * @generated
	 * @ordered
	 */
	protected static final String RENDER_ITEM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRenderItem() <em>Render Item</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRenderItem()
	 * @generated
	 * @ordered
	 */
	protected String renderItem = RENDER_ITEM_EDEFAULT;

	/**
	 * The default value of the '{@link #getKeyExtractor() <em>Key Extractor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyExtractor()
	 * @generated
	 * @ordered
	 */
	protected static final String KEY_EXTRACTOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKeyExtractor() <em>Key Extractor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyExtractor()
	 * @generated
	 * @ordered
	 */
	protected String keyExtractor = KEY_EXTRACTOR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFlatListToArray() <em>Flat List To Array</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlatListToArray()
	 * @generated
	 * @ordered
	 */
	protected EList<Array> flatListToArray;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FlatListImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReactNativePackage.Literals.FLAT_LIST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<View> getHasViews() {
		if (hasViews == null) {
			hasViews = new EObjectContainmentEList<View>(View.class, this, ReactNativePackage.FLAT_LIST__HAS_VIEWS);
		}
		return hasViews;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFlatlistName() {
		return flatlistName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFlatlistName(String newFlatlistName) {
		String oldFlatlistName = flatlistName;
		flatlistName = newFlatlistName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReactNativePackage.FLAT_LIST__FLATLIST_NAME, oldFlatlistName, flatlistName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getData() {
		return data;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setData(String newData) {
		String oldData = data;
		data = newData;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReactNativePackage.FLAT_LIST__DATA, oldData, data));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRenderItem() {
		return renderItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRenderItem(String newRenderItem) {
		String oldRenderItem = renderItem;
		renderItem = newRenderItem;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReactNativePackage.FLAT_LIST__RENDER_ITEM, oldRenderItem, renderItem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getKeyExtractor() {
		return keyExtractor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKeyExtractor(String newKeyExtractor) {
		String oldKeyExtractor = keyExtractor;
		keyExtractor = newKeyExtractor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReactNativePackage.FLAT_LIST__KEY_EXTRACTOR, oldKeyExtractor, keyExtractor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Array> getFlatListToArray() {
		if (flatListToArray == null) {
			flatListToArray = new EObjectContainmentEList<Array>(Array.class, this, ReactNativePackage.FLAT_LIST__FLAT_LIST_TO_ARRAY);
		}
		return flatListToArray;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ReactNativePackage.FLAT_LIST__HAS_VIEWS:
				return ((InternalEList<?>)getHasViews()).basicRemove(otherEnd, msgs);
			case ReactNativePackage.FLAT_LIST__FLAT_LIST_TO_ARRAY:
				return ((InternalEList<?>)getFlatListToArray()).basicRemove(otherEnd, msgs);
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
			case ReactNativePackage.FLAT_LIST__HAS_VIEWS:
				return getHasViews();
			case ReactNativePackage.FLAT_LIST__FLATLIST_NAME:
				return getFlatlistName();
			case ReactNativePackage.FLAT_LIST__DATA:
				return getData();
			case ReactNativePackage.FLAT_LIST__RENDER_ITEM:
				return getRenderItem();
			case ReactNativePackage.FLAT_LIST__KEY_EXTRACTOR:
				return getKeyExtractor();
			case ReactNativePackage.FLAT_LIST__FLAT_LIST_TO_ARRAY:
				return getFlatListToArray();
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
			case ReactNativePackage.FLAT_LIST__HAS_VIEWS:
				getHasViews().clear();
				getHasViews().addAll((Collection<? extends View>)newValue);
				return;
			case ReactNativePackage.FLAT_LIST__FLATLIST_NAME:
				setFlatlistName((String)newValue);
				return;
			case ReactNativePackage.FLAT_LIST__DATA:
				setData((String)newValue);
				return;
			case ReactNativePackage.FLAT_LIST__RENDER_ITEM:
				setRenderItem((String)newValue);
				return;
			case ReactNativePackage.FLAT_LIST__KEY_EXTRACTOR:
				setKeyExtractor((String)newValue);
				return;
			case ReactNativePackage.FLAT_LIST__FLAT_LIST_TO_ARRAY:
				getFlatListToArray().clear();
				getFlatListToArray().addAll((Collection<? extends Array>)newValue);
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
			case ReactNativePackage.FLAT_LIST__HAS_VIEWS:
				getHasViews().clear();
				return;
			case ReactNativePackage.FLAT_LIST__FLATLIST_NAME:
				setFlatlistName(FLATLIST_NAME_EDEFAULT);
				return;
			case ReactNativePackage.FLAT_LIST__DATA:
				setData(DATA_EDEFAULT);
				return;
			case ReactNativePackage.FLAT_LIST__RENDER_ITEM:
				setRenderItem(RENDER_ITEM_EDEFAULT);
				return;
			case ReactNativePackage.FLAT_LIST__KEY_EXTRACTOR:
				setKeyExtractor(KEY_EXTRACTOR_EDEFAULT);
				return;
			case ReactNativePackage.FLAT_LIST__FLAT_LIST_TO_ARRAY:
				getFlatListToArray().clear();
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
			case ReactNativePackage.FLAT_LIST__HAS_VIEWS:
				return hasViews != null && !hasViews.isEmpty();
			case ReactNativePackage.FLAT_LIST__FLATLIST_NAME:
				return FLATLIST_NAME_EDEFAULT == null ? flatlistName != null : !FLATLIST_NAME_EDEFAULT.equals(flatlistName);
			case ReactNativePackage.FLAT_LIST__DATA:
				return DATA_EDEFAULT == null ? data != null : !DATA_EDEFAULT.equals(data);
			case ReactNativePackage.FLAT_LIST__RENDER_ITEM:
				return RENDER_ITEM_EDEFAULT == null ? renderItem != null : !RENDER_ITEM_EDEFAULT.equals(renderItem);
			case ReactNativePackage.FLAT_LIST__KEY_EXTRACTOR:
				return KEY_EXTRACTOR_EDEFAULT == null ? keyExtractor != null : !KEY_EXTRACTOR_EDEFAULT.equals(keyExtractor);
			case ReactNativePackage.FLAT_LIST__FLAT_LIST_TO_ARRAY:
				return flatListToArray != null && !flatListToArray.isEmpty();
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
		result.append(" (flatlistName: ");
		result.append(flatlistName);
		result.append(", data: ");
		result.append(data);
		result.append(", renderItem: ");
		result.append(renderItem);
		result.append(", keyExtractor: ");
		result.append(keyExtractor);
		result.append(')');
		return result.toString();
	}

} //FlatListImpl
