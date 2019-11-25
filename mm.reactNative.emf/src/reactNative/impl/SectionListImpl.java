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
import reactNative.ReactNativePackage;
import reactNative.SectionList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Section List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link reactNative.impl.SectionListImpl#getSectionListName <em>Section List Name</em>}</li>
 *   <li>{@link reactNative.impl.SectionListImpl#getSections <em>Sections</em>}</li>
 *   <li>{@link reactNative.impl.SectionListImpl#getKeyExtractor <em>Key Extractor</em>}</li>
 *   <li>{@link reactNative.impl.SectionListImpl#getRenderSectionHeader <em>Render Section Header</em>}</li>
 *   <li>{@link reactNative.impl.SectionListImpl#getRenderItem <em>Render Item</em>}</li>
 *   <li>{@link reactNative.impl.SectionListImpl#getSectionListToArray <em>Section List To Array</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SectionListImpl extends MinimalEObjectImpl.Container implements SectionList {
	/**
	 * The default value of the '{@link #getSectionListName() <em>Section List Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSectionListName()
	 * @generated
	 * @ordered
	 */
	protected static final String SECTION_LIST_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSectionListName() <em>Section List Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSectionListName()
	 * @generated
	 * @ordered
	 */
	protected String sectionListName = SECTION_LIST_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSections() <em>Sections</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSections()
	 * @generated
	 * @ordered
	 */
	protected static final String SECTIONS_EDEFAULT = "modulo";

	/**
	 * The cached value of the '{@link #getSections() <em>Sections</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSections()
	 * @generated
	 * @ordered
	 */
	protected String sections = SECTIONS_EDEFAULT;

	/**
	 * The default value of the '{@link #getKeyExtractor() <em>Key Extractor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyExtractor()
	 * @generated
	 * @ordered
	 */
	protected static final String KEY_EXTRACTOR_EDEFAULT = "(item, index) => `${item.id}`";

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
	 * The default value of the '{@link #getRenderSectionHeader() <em>Render Section Header</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRenderSectionHeader()
	 * @generated
	 * @ordered
	 */
	protected static final String RENDER_SECTION_HEADER_EDEFAULT = "({ section }) => ( )";

	/**
	 * The cached value of the '{@link #getRenderSectionHeader() <em>Render Section Header</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRenderSectionHeader()
	 * @generated
	 * @ordered
	 */
	protected String renderSectionHeader = RENDER_SECTION_HEADER_EDEFAULT;

	/**
	 * The default value of the '{@link #getRenderItem() <em>Render Item</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRenderItem()
	 * @generated
	 * @ordered
	 */
	protected static final String RENDER_ITEM_EDEFAULT = "({ item }) => ( )";

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
	 * The cached value of the '{@link #getSectionListToArray() <em>Section List To Array</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSectionListToArray()
	 * @generated
	 * @ordered
	 */
	protected EList<Array> sectionListToArray;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SectionListImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReactNativePackage.Literals.SECTION_LIST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSectionListName() {
		return sectionListName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSectionListName(String newSectionListName) {
		String oldSectionListName = sectionListName;
		sectionListName = newSectionListName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReactNativePackage.SECTION_LIST__SECTION_LIST_NAME, oldSectionListName, sectionListName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSections() {
		return sections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSections(String newSections) {
		String oldSections = sections;
		sections = newSections;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReactNativePackage.SECTION_LIST__SECTIONS, oldSections, sections));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ReactNativePackage.SECTION_LIST__KEY_EXTRACTOR, oldKeyExtractor, keyExtractor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRenderSectionHeader() {
		return renderSectionHeader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRenderSectionHeader(String newRenderSectionHeader) {
		String oldRenderSectionHeader = renderSectionHeader;
		renderSectionHeader = newRenderSectionHeader;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReactNativePackage.SECTION_LIST__RENDER_SECTION_HEADER, oldRenderSectionHeader, renderSectionHeader));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ReactNativePackage.SECTION_LIST__RENDER_ITEM, oldRenderItem, renderItem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Array> getSectionListToArray() {
		if (sectionListToArray == null) {
			sectionListToArray = new EObjectContainmentEList<Array>(Array.class, this, ReactNativePackage.SECTION_LIST__SECTION_LIST_TO_ARRAY);
		}
		return sectionListToArray;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ReactNativePackage.SECTION_LIST__SECTION_LIST_TO_ARRAY:
				return ((InternalEList<?>)getSectionListToArray()).basicRemove(otherEnd, msgs);
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
			case ReactNativePackage.SECTION_LIST__SECTION_LIST_NAME:
				return getSectionListName();
			case ReactNativePackage.SECTION_LIST__SECTIONS:
				return getSections();
			case ReactNativePackage.SECTION_LIST__KEY_EXTRACTOR:
				return getKeyExtractor();
			case ReactNativePackage.SECTION_LIST__RENDER_SECTION_HEADER:
				return getRenderSectionHeader();
			case ReactNativePackage.SECTION_LIST__RENDER_ITEM:
				return getRenderItem();
			case ReactNativePackage.SECTION_LIST__SECTION_LIST_TO_ARRAY:
				return getSectionListToArray();
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
			case ReactNativePackage.SECTION_LIST__SECTION_LIST_NAME:
				setSectionListName((String)newValue);
				return;
			case ReactNativePackage.SECTION_LIST__SECTIONS:
				setSections((String)newValue);
				return;
			case ReactNativePackage.SECTION_LIST__KEY_EXTRACTOR:
				setKeyExtractor((String)newValue);
				return;
			case ReactNativePackage.SECTION_LIST__RENDER_SECTION_HEADER:
				setRenderSectionHeader((String)newValue);
				return;
			case ReactNativePackage.SECTION_LIST__RENDER_ITEM:
				setRenderItem((String)newValue);
				return;
			case ReactNativePackage.SECTION_LIST__SECTION_LIST_TO_ARRAY:
				getSectionListToArray().clear();
				getSectionListToArray().addAll((Collection<? extends Array>)newValue);
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
			case ReactNativePackage.SECTION_LIST__SECTION_LIST_NAME:
				setSectionListName(SECTION_LIST_NAME_EDEFAULT);
				return;
			case ReactNativePackage.SECTION_LIST__SECTIONS:
				setSections(SECTIONS_EDEFAULT);
				return;
			case ReactNativePackage.SECTION_LIST__KEY_EXTRACTOR:
				setKeyExtractor(KEY_EXTRACTOR_EDEFAULT);
				return;
			case ReactNativePackage.SECTION_LIST__RENDER_SECTION_HEADER:
				setRenderSectionHeader(RENDER_SECTION_HEADER_EDEFAULT);
				return;
			case ReactNativePackage.SECTION_LIST__RENDER_ITEM:
				setRenderItem(RENDER_ITEM_EDEFAULT);
				return;
			case ReactNativePackage.SECTION_LIST__SECTION_LIST_TO_ARRAY:
				getSectionListToArray().clear();
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
			case ReactNativePackage.SECTION_LIST__SECTION_LIST_NAME:
				return SECTION_LIST_NAME_EDEFAULT == null ? sectionListName != null : !SECTION_LIST_NAME_EDEFAULT.equals(sectionListName);
			case ReactNativePackage.SECTION_LIST__SECTIONS:
				return SECTIONS_EDEFAULT == null ? sections != null : !SECTIONS_EDEFAULT.equals(sections);
			case ReactNativePackage.SECTION_LIST__KEY_EXTRACTOR:
				return KEY_EXTRACTOR_EDEFAULT == null ? keyExtractor != null : !KEY_EXTRACTOR_EDEFAULT.equals(keyExtractor);
			case ReactNativePackage.SECTION_LIST__RENDER_SECTION_HEADER:
				return RENDER_SECTION_HEADER_EDEFAULT == null ? renderSectionHeader != null : !RENDER_SECTION_HEADER_EDEFAULT.equals(renderSectionHeader);
			case ReactNativePackage.SECTION_LIST__RENDER_ITEM:
				return RENDER_ITEM_EDEFAULT == null ? renderItem != null : !RENDER_ITEM_EDEFAULT.equals(renderItem);
			case ReactNativePackage.SECTION_LIST__SECTION_LIST_TO_ARRAY:
				return sectionListToArray != null && !sectionListToArray.isEmpty();
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
		result.append(" (sectionListName: ");
		result.append(sectionListName);
		result.append(", sections: ");
		result.append(sections);
		result.append(", keyExtractor: ");
		result.append(keyExtractor);
		result.append(", renderSectionHeader: ");
		result.append(renderSectionHeader);
		result.append(", renderItem: ");
		result.append(renderItem);
		result.append(')');
		return result.toString();
	}

} //SectionListImpl
