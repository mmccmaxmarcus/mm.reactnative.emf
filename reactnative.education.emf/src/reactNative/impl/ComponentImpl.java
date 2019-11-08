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

import reactNative.Component;
import reactNative.ReactNativePackage;
import reactNative.Text;
import reactNative.TouchableOpacity;
import reactNative.View;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link reactNative.impl.ComponentImpl#getComponentTotext <em>Component Totext</em>}</li>
 *   <li>{@link reactNative.impl.ComponentImpl#getComponentName <em>Component Name</em>}</li>
 *   <li>{@link reactNative.impl.ComponentImpl#getComponentToView <em>Component To View</em>}</li>
 *   <li>{@link reactNative.impl.ComponentImpl#isState <em>State</em>}</li>
 *   <li>{@link reactNative.impl.ComponentImpl#getComponentToTouchableOpacity <em>Component To Touchable Opacity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentImpl extends MinimalEObjectImpl.Container implements Component {
	/**
	 * The cached value of the '{@link #getComponentTotext() <em>Component Totext</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentTotext()
	 * @generated
	 * @ordered
	 */
	protected EList<Text> componentTotext;

	/**
	 * The default value of the '{@link #getComponentName() <em>Component Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentName()
	 * @generated
	 * @ordered
	 */
	protected static final String COMPONENT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComponentName() <em>Component Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentName()
	 * @generated
	 * @ordered
	 */
	protected String componentName = COMPONENT_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getComponentToView() <em>Component To View</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentToView()
	 * @generated
	 * @ordered
	 */
	protected EList<View> componentToView;

	/**
	 * The default value of the '{@link #isState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isState()
	 * @generated
	 * @ordered
	 */
	protected static final boolean STATE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isState()
	 * @generated
	 * @ordered
	 */
	protected boolean state = STATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getComponentToTouchableOpacity() <em>Component To Touchable Opacity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentToTouchableOpacity()
	 * @generated
	 * @ordered
	 */
	protected TouchableOpacity componentToTouchableOpacity;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReactNativePackage.Literals.COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Text> getComponentTotext() {
		if (componentTotext == null) {
			componentTotext = new EObjectContainmentEList<Text>(Text.class, this, ReactNativePackage.COMPONENT__COMPONENT_TOTEXT);
		}
		return componentTotext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getComponentName() {
		return componentName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComponentName(String newComponentName) {
		String oldComponentName = componentName;
		componentName = newComponentName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReactNativePackage.COMPONENT__COMPONENT_NAME, oldComponentName, componentName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<View> getComponentToView() {
		if (componentToView == null) {
			componentToView = new EObjectContainmentEList<View>(View.class, this, ReactNativePackage.COMPONENT__COMPONENT_TO_VIEW);
		}
		return componentToView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isState() {
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setState(boolean newState) {
		boolean oldState = state;
		state = newState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReactNativePackage.COMPONENT__STATE, oldState, state));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TouchableOpacity getComponentToTouchableOpacity() {
		return componentToTouchableOpacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComponentToTouchableOpacity(TouchableOpacity newComponentToTouchableOpacity, NotificationChain msgs) {
		TouchableOpacity oldComponentToTouchableOpacity = componentToTouchableOpacity;
		componentToTouchableOpacity = newComponentToTouchableOpacity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ReactNativePackage.COMPONENT__COMPONENT_TO_TOUCHABLE_OPACITY, oldComponentToTouchableOpacity, newComponentToTouchableOpacity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComponentToTouchableOpacity(TouchableOpacity newComponentToTouchableOpacity) {
		if (newComponentToTouchableOpacity != componentToTouchableOpacity) {
			NotificationChain msgs = null;
			if (componentToTouchableOpacity != null)
				msgs = ((InternalEObject)componentToTouchableOpacity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ReactNativePackage.COMPONENT__COMPONENT_TO_TOUCHABLE_OPACITY, null, msgs);
			if (newComponentToTouchableOpacity != null)
				msgs = ((InternalEObject)newComponentToTouchableOpacity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ReactNativePackage.COMPONENT__COMPONENT_TO_TOUCHABLE_OPACITY, null, msgs);
			msgs = basicSetComponentToTouchableOpacity(newComponentToTouchableOpacity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReactNativePackage.COMPONENT__COMPONENT_TO_TOUCHABLE_OPACITY, newComponentToTouchableOpacity, newComponentToTouchableOpacity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ReactNativePackage.COMPONENT__COMPONENT_TOTEXT:
				return ((InternalEList<?>)getComponentTotext()).basicRemove(otherEnd, msgs);
			case ReactNativePackage.COMPONENT__COMPONENT_TO_VIEW:
				return ((InternalEList<?>)getComponentToView()).basicRemove(otherEnd, msgs);
			case ReactNativePackage.COMPONENT__COMPONENT_TO_TOUCHABLE_OPACITY:
				return basicSetComponentToTouchableOpacity(null, msgs);
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
			case ReactNativePackage.COMPONENT__COMPONENT_TOTEXT:
				return getComponentTotext();
			case ReactNativePackage.COMPONENT__COMPONENT_NAME:
				return getComponentName();
			case ReactNativePackage.COMPONENT__COMPONENT_TO_VIEW:
				return getComponentToView();
			case ReactNativePackage.COMPONENT__STATE:
				return isState();
			case ReactNativePackage.COMPONENT__COMPONENT_TO_TOUCHABLE_OPACITY:
				return getComponentToTouchableOpacity();
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
			case ReactNativePackage.COMPONENT__COMPONENT_TOTEXT:
				getComponentTotext().clear();
				getComponentTotext().addAll((Collection<? extends Text>)newValue);
				return;
			case ReactNativePackage.COMPONENT__COMPONENT_NAME:
				setComponentName((String)newValue);
				return;
			case ReactNativePackage.COMPONENT__COMPONENT_TO_VIEW:
				getComponentToView().clear();
				getComponentToView().addAll((Collection<? extends View>)newValue);
				return;
			case ReactNativePackage.COMPONENT__STATE:
				setState((Boolean)newValue);
				return;
			case ReactNativePackage.COMPONENT__COMPONENT_TO_TOUCHABLE_OPACITY:
				setComponentToTouchableOpacity((TouchableOpacity)newValue);
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
			case ReactNativePackage.COMPONENT__COMPONENT_TOTEXT:
				getComponentTotext().clear();
				return;
			case ReactNativePackage.COMPONENT__COMPONENT_NAME:
				setComponentName(COMPONENT_NAME_EDEFAULT);
				return;
			case ReactNativePackage.COMPONENT__COMPONENT_TO_VIEW:
				getComponentToView().clear();
				return;
			case ReactNativePackage.COMPONENT__STATE:
				setState(STATE_EDEFAULT);
				return;
			case ReactNativePackage.COMPONENT__COMPONENT_TO_TOUCHABLE_OPACITY:
				setComponentToTouchableOpacity((TouchableOpacity)null);
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
			case ReactNativePackage.COMPONENT__COMPONENT_TOTEXT:
				return componentTotext != null && !componentTotext.isEmpty();
			case ReactNativePackage.COMPONENT__COMPONENT_NAME:
				return COMPONENT_NAME_EDEFAULT == null ? componentName != null : !COMPONENT_NAME_EDEFAULT.equals(componentName);
			case ReactNativePackage.COMPONENT__COMPONENT_TO_VIEW:
				return componentToView != null && !componentToView.isEmpty();
			case ReactNativePackage.COMPONENT__STATE:
				return state != STATE_EDEFAULT;
			case ReactNativePackage.COMPONENT__COMPONENT_TO_TOUCHABLE_OPACITY:
				return componentToTouchableOpacity != null;
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
		result.append(" (componentName: ");
		result.append(componentName);
		result.append(", state: ");
		result.append(state);
		result.append(')');
		return result.toString();
	}

} //ComponentImpl
