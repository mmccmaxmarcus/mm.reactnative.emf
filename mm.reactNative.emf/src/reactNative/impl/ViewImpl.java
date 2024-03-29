/**
 */
package reactNative.impl;

import java.lang.reflect.InvocationTargetException;

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

import reactNative.Button;
import reactNative.FlatList;
import reactNative.Icon;
import reactNative.Image;
import reactNative.ReactNativePackage;
import reactNative.SectionList;
import reactNative.StyleSheet;
import reactNative.Text;
import reactNative.TouchableOpacity;
import reactNative.View;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link reactNative.impl.ViewImpl#getHasText <em>Has Text</em>}</li>
 *   <li>{@link reactNative.impl.ViewImpl#getViewToflatlists <em>View Toflatlists</em>}</li>
 *   <li>{@link reactNative.impl.ViewImpl#getViewType <em>View Type</em>}</li>
 *   <li>{@link reactNative.impl.ViewImpl#getViewName <em>View Name</em>}</li>
 *   <li>{@link reactNative.impl.ViewImpl#getHasImage <em>Has Image</em>}</li>
 *   <li>{@link reactNative.impl.ViewImpl#getViewToTouchableOpacity <em>View To Touchable Opacity</em>}</li>
 *   <li>{@link reactNative.impl.ViewImpl#getViewToIcon <em>View To Icon</em>}</li>
 *   <li>{@link reactNative.impl.ViewImpl#getViewToButton <em>View To Button</em>}</li>
 *   <li>{@link reactNative.impl.ViewImpl#getSubView <em>Sub View</em>}</li>
 *   <li>{@link reactNative.impl.ViewImpl#getViewToStyleSheet <em>View To Style Sheet</em>}</li>
 *   <li>{@link reactNative.impl.ViewImpl#getViewToSectionList <em>View To Section List</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ViewImpl extends MinimalEObjectImpl.Container implements View {
	/**
	 * The cached value of the '{@link #getHasText() <em>Has Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasText()
	 * @generated
	 * @ordered
	 */
	protected EList<Text> hasText;

	/**
	 * The cached value of the '{@link #getViewToflatlists() <em>View Toflatlists</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViewToflatlists()
	 * @generated
	 * @ordered
	 */
	protected EList<FlatList> viewToflatlists;

	/**
	 * The default value of the '{@link #getViewType() <em>View Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViewType()
	 * @generated
	 * @ordered
	 */
	protected static final int VIEW_TYPE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getViewType() <em>View Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViewType()
	 * @generated
	 * @ordered
	 */
	protected int viewType = VIEW_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getViewName() <em>View Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViewName()
	 * @generated
	 * @ordered
	 */
	protected static final String VIEW_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getViewName() <em>View Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViewName()
	 * @generated
	 * @ordered
	 */
	protected String viewName = VIEW_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getHasImage() <em>Has Image</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasImage()
	 * @generated
	 * @ordered
	 */
	protected EList<Image> hasImage;

	/**
	 * The cached value of the '{@link #getViewToTouchableOpacity() <em>View To Touchable Opacity</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViewToTouchableOpacity()
	 * @generated
	 * @ordered
	 */
	protected EList<TouchableOpacity> viewToTouchableOpacity;

	/**
	 * The cached value of the '{@link #getViewToIcon() <em>View To Icon</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViewToIcon()
	 * @generated
	 * @ordered
	 */
	protected EList<Icon> viewToIcon;

	/**
	 * The cached value of the '{@link #getViewToButton() <em>View To Button</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViewToButton()
	 * @generated
	 * @ordered
	 */
	protected EList<Button> viewToButton;

	/**
	 * The cached value of the '{@link #getSubView() <em>Sub View</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubView()
	 * @generated
	 * @ordered
	 */
	protected EList<View> subView;

	/**
	 * The cached value of the '{@link #getViewToStyleSheet() <em>View To Style Sheet</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViewToStyleSheet()
	 * @generated
	 * @ordered
	 */
	protected EList<StyleSheet> viewToStyleSheet;

	/**
	 * The cached value of the '{@link #getViewToSectionList() <em>View To Section List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViewToSectionList()
	 * @generated
	 * @ordered
	 */
	protected SectionList viewToSectionList;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReactNativePackage.Literals.VIEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Text> getHasText() {
		if (hasText == null) {
			hasText = new EObjectContainmentEList<Text>(Text.class, this, ReactNativePackage.VIEW__HAS_TEXT);
		}
		return hasText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FlatList> getViewToflatlists() {
		if (viewToflatlists == null) {
			viewToflatlists = new EObjectContainmentEList<FlatList>(FlatList.class, this, ReactNativePackage.VIEW__VIEW_TOFLATLISTS);
		}
		return viewToflatlists;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getViewType() {
		return viewType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setViewType(int newViewType) {
		int oldViewType = viewType;
		viewType = newViewType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReactNativePackage.VIEW__VIEW_TYPE, oldViewType, viewType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getViewName() {
		return viewName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setViewName(String newViewName) {
		String oldViewName = viewName;
		viewName = newViewName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReactNativePackage.VIEW__VIEW_NAME, oldViewName, viewName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Image> getHasImage() {
		if (hasImage == null) {
			hasImage = new EObjectContainmentEList<Image>(Image.class, this, ReactNativePackage.VIEW__HAS_IMAGE);
		}
		return hasImage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TouchableOpacity> getViewToTouchableOpacity() {
		if (viewToTouchableOpacity == null) {
			viewToTouchableOpacity = new EObjectContainmentEList<TouchableOpacity>(TouchableOpacity.class, this, ReactNativePackage.VIEW__VIEW_TO_TOUCHABLE_OPACITY);
		}
		return viewToTouchableOpacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Icon> getViewToIcon() {
		if (viewToIcon == null) {
			viewToIcon = new EObjectContainmentEList<Icon>(Icon.class, this, ReactNativePackage.VIEW__VIEW_TO_ICON);
		}
		return viewToIcon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Button> getViewToButton() {
		if (viewToButton == null) {
			viewToButton = new EObjectContainmentEList<Button>(Button.class, this, ReactNativePackage.VIEW__VIEW_TO_BUTTON);
		}
		return viewToButton;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<View> getSubView() {
		if (subView == null) {
			subView = new EObjectContainmentEList<View>(View.class, this, ReactNativePackage.VIEW__SUB_VIEW);
		}
		return subView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<StyleSheet> getViewToStyleSheet() {
		if (viewToStyleSheet == null) {
			viewToStyleSheet = new EObjectContainmentEList<StyleSheet>(StyleSheet.class, this, ReactNativePackage.VIEW__VIEW_TO_STYLE_SHEET);
		}
		return viewToStyleSheet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SectionList getViewToSectionList() {
		return viewToSectionList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetViewToSectionList(SectionList newViewToSectionList, NotificationChain msgs) {
		SectionList oldViewToSectionList = viewToSectionList;
		viewToSectionList = newViewToSectionList;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ReactNativePackage.VIEW__VIEW_TO_SECTION_LIST, oldViewToSectionList, newViewToSectionList);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setViewToSectionList(SectionList newViewToSectionList) {
		if (newViewToSectionList != viewToSectionList) {
			NotificationChain msgs = null;
			if (viewToSectionList != null)
				msgs = ((InternalEObject)viewToSectionList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ReactNativePackage.VIEW__VIEW_TO_SECTION_LIST, null, msgs);
			if (newViewToSectionList != null)
				msgs = ((InternalEObject)newViewToSectionList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ReactNativePackage.VIEW__VIEW_TO_SECTION_LIST, null, msgs);
			msgs = basicSetViewToSectionList(newViewToSectionList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReactNativePackage.VIEW__VIEW_TO_SECTION_LIST, newViewToSectionList, newViewToSectionList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void style(StyleSheet style) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ReactNativePackage.VIEW__HAS_TEXT:
				return ((InternalEList<?>)getHasText()).basicRemove(otherEnd, msgs);
			case ReactNativePackage.VIEW__VIEW_TOFLATLISTS:
				return ((InternalEList<?>)getViewToflatlists()).basicRemove(otherEnd, msgs);
			case ReactNativePackage.VIEW__HAS_IMAGE:
				return ((InternalEList<?>)getHasImage()).basicRemove(otherEnd, msgs);
			case ReactNativePackage.VIEW__VIEW_TO_TOUCHABLE_OPACITY:
				return ((InternalEList<?>)getViewToTouchableOpacity()).basicRemove(otherEnd, msgs);
			case ReactNativePackage.VIEW__VIEW_TO_ICON:
				return ((InternalEList<?>)getViewToIcon()).basicRemove(otherEnd, msgs);
			case ReactNativePackage.VIEW__VIEW_TO_BUTTON:
				return ((InternalEList<?>)getViewToButton()).basicRemove(otherEnd, msgs);
			case ReactNativePackage.VIEW__SUB_VIEW:
				return ((InternalEList<?>)getSubView()).basicRemove(otherEnd, msgs);
			case ReactNativePackage.VIEW__VIEW_TO_STYLE_SHEET:
				return ((InternalEList<?>)getViewToStyleSheet()).basicRemove(otherEnd, msgs);
			case ReactNativePackage.VIEW__VIEW_TO_SECTION_LIST:
				return basicSetViewToSectionList(null, msgs);
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
			case ReactNativePackage.VIEW__HAS_TEXT:
				return getHasText();
			case ReactNativePackage.VIEW__VIEW_TOFLATLISTS:
				return getViewToflatlists();
			case ReactNativePackage.VIEW__VIEW_TYPE:
				return getViewType();
			case ReactNativePackage.VIEW__VIEW_NAME:
				return getViewName();
			case ReactNativePackage.VIEW__HAS_IMAGE:
				return getHasImage();
			case ReactNativePackage.VIEW__VIEW_TO_TOUCHABLE_OPACITY:
				return getViewToTouchableOpacity();
			case ReactNativePackage.VIEW__VIEW_TO_ICON:
				return getViewToIcon();
			case ReactNativePackage.VIEW__VIEW_TO_BUTTON:
				return getViewToButton();
			case ReactNativePackage.VIEW__SUB_VIEW:
				return getSubView();
			case ReactNativePackage.VIEW__VIEW_TO_STYLE_SHEET:
				return getViewToStyleSheet();
			case ReactNativePackage.VIEW__VIEW_TO_SECTION_LIST:
				return getViewToSectionList();
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
			case ReactNativePackage.VIEW__HAS_TEXT:
				getHasText().clear();
				getHasText().addAll((Collection<? extends Text>)newValue);
				return;
			case ReactNativePackage.VIEW__VIEW_TOFLATLISTS:
				getViewToflatlists().clear();
				getViewToflatlists().addAll((Collection<? extends FlatList>)newValue);
				return;
			case ReactNativePackage.VIEW__VIEW_TYPE:
				setViewType((Integer)newValue);
				return;
			case ReactNativePackage.VIEW__VIEW_NAME:
				setViewName((String)newValue);
				return;
			case ReactNativePackage.VIEW__HAS_IMAGE:
				getHasImage().clear();
				getHasImage().addAll((Collection<? extends Image>)newValue);
				return;
			case ReactNativePackage.VIEW__VIEW_TO_TOUCHABLE_OPACITY:
				getViewToTouchableOpacity().clear();
				getViewToTouchableOpacity().addAll((Collection<? extends TouchableOpacity>)newValue);
				return;
			case ReactNativePackage.VIEW__VIEW_TO_ICON:
				getViewToIcon().clear();
				getViewToIcon().addAll((Collection<? extends Icon>)newValue);
				return;
			case ReactNativePackage.VIEW__VIEW_TO_BUTTON:
				getViewToButton().clear();
				getViewToButton().addAll((Collection<? extends Button>)newValue);
				return;
			case ReactNativePackage.VIEW__SUB_VIEW:
				getSubView().clear();
				getSubView().addAll((Collection<? extends View>)newValue);
				return;
			case ReactNativePackage.VIEW__VIEW_TO_STYLE_SHEET:
				getViewToStyleSheet().clear();
				getViewToStyleSheet().addAll((Collection<? extends StyleSheet>)newValue);
				return;
			case ReactNativePackage.VIEW__VIEW_TO_SECTION_LIST:
				setViewToSectionList((SectionList)newValue);
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
			case ReactNativePackage.VIEW__HAS_TEXT:
				getHasText().clear();
				return;
			case ReactNativePackage.VIEW__VIEW_TOFLATLISTS:
				getViewToflatlists().clear();
				return;
			case ReactNativePackage.VIEW__VIEW_TYPE:
				setViewType(VIEW_TYPE_EDEFAULT);
				return;
			case ReactNativePackage.VIEW__VIEW_NAME:
				setViewName(VIEW_NAME_EDEFAULT);
				return;
			case ReactNativePackage.VIEW__HAS_IMAGE:
				getHasImage().clear();
				return;
			case ReactNativePackage.VIEW__VIEW_TO_TOUCHABLE_OPACITY:
				getViewToTouchableOpacity().clear();
				return;
			case ReactNativePackage.VIEW__VIEW_TO_ICON:
				getViewToIcon().clear();
				return;
			case ReactNativePackage.VIEW__VIEW_TO_BUTTON:
				getViewToButton().clear();
				return;
			case ReactNativePackage.VIEW__SUB_VIEW:
				getSubView().clear();
				return;
			case ReactNativePackage.VIEW__VIEW_TO_STYLE_SHEET:
				getViewToStyleSheet().clear();
				return;
			case ReactNativePackage.VIEW__VIEW_TO_SECTION_LIST:
				setViewToSectionList((SectionList)null);
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
			case ReactNativePackage.VIEW__HAS_TEXT:
				return hasText != null && !hasText.isEmpty();
			case ReactNativePackage.VIEW__VIEW_TOFLATLISTS:
				return viewToflatlists != null && !viewToflatlists.isEmpty();
			case ReactNativePackage.VIEW__VIEW_TYPE:
				return viewType != VIEW_TYPE_EDEFAULT;
			case ReactNativePackage.VIEW__VIEW_NAME:
				return VIEW_NAME_EDEFAULT == null ? viewName != null : !VIEW_NAME_EDEFAULT.equals(viewName);
			case ReactNativePackage.VIEW__HAS_IMAGE:
				return hasImage != null && !hasImage.isEmpty();
			case ReactNativePackage.VIEW__VIEW_TO_TOUCHABLE_OPACITY:
				return viewToTouchableOpacity != null && !viewToTouchableOpacity.isEmpty();
			case ReactNativePackage.VIEW__VIEW_TO_ICON:
				return viewToIcon != null && !viewToIcon.isEmpty();
			case ReactNativePackage.VIEW__VIEW_TO_BUTTON:
				return viewToButton != null && !viewToButton.isEmpty();
			case ReactNativePackage.VIEW__SUB_VIEW:
				return subView != null && !subView.isEmpty();
			case ReactNativePackage.VIEW__VIEW_TO_STYLE_SHEET:
				return viewToStyleSheet != null && !viewToStyleSheet.isEmpty();
			case ReactNativePackage.VIEW__VIEW_TO_SECTION_LIST:
				return viewToSectionList != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ReactNativePackage.VIEW___STYLE__STYLESHEET:
				style((StyleSheet)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (viewType: ");
		result.append(viewType);
		result.append(", viewName: ");
		result.append(viewName);
		result.append(')');
		return result.toString();
	}

} //ViewImpl
