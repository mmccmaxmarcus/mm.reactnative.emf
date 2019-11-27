/**
 */
package mmMobileLearning.impl;

import java.util.Collection;

import mmMobileLearning.ElementInterface;
import mmMobileLearning.MModule;
import mmMobileLearning.MmMobileLearningPackage;
import mmMobileLearning.Screen;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Screen</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mmMobileLearning.impl.ScreenImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link mmMobileLearning.impl.ScreenImpl#getScreenToElementInterface <em>Screen To Element Interface</em>}</li>
 *   <li>{@link mmMobileLearning.impl.ScreenImpl#getOrigemElement <em>Origem Element</em>}</li>
 *   <li>{@link mmMobileLearning.impl.ScreenImpl#getScreenToMModule <em>Screen To MModule</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ScreenImpl extends MinimalEObjectImpl.Container implements Screen {
	/**
	 * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected String label = LABEL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getScreenToElementInterface() <em>Screen To Element Interface</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScreenToElementInterface()
	 * @generated
	 * @ordered
	 */
	protected EList<ElementInterface> screenToElementInterface;

	/**
	 * The default value of the '{@link #getOrigemElement() <em>Origem Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrigemElement()
	 * @generated
	 * @ordered
	 */
	protected static final String ORIGEM_ELEMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOrigemElement() <em>Origem Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrigemElement()
	 * @generated
	 * @ordered
	 */
	protected String origemElement = ORIGEM_ELEMENT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getScreenToMModule() <em>Screen To MModule</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScreenToMModule()
	 * @generated
	 * @ordered
	 */
	protected EList<MModule> screenToMModule;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScreenImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MmMobileLearningPackage.Literals.SCREEN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLabel() {
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLabel(String newLabel) {
		String oldLabel = label;
		label = newLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MmMobileLearningPackage.SCREEN__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ElementInterface> getScreenToElementInterface() {
		if (screenToElementInterface == null) {
			screenToElementInterface = new EObjectContainmentEList<ElementInterface>(ElementInterface.class, this, MmMobileLearningPackage.SCREEN__SCREEN_TO_ELEMENT_INTERFACE);
		}
		return screenToElementInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOrigemElement() {
		return origemElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrigemElement(String newOrigemElement) {
		String oldOrigemElement = origemElement;
		origemElement = newOrigemElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MmMobileLearningPackage.SCREEN__ORIGEM_ELEMENT, oldOrigemElement, origemElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MModule> getScreenToMModule() {
		if (screenToMModule == null) {
			screenToMModule = new EObjectContainmentEList<MModule>(MModule.class, this, MmMobileLearningPackage.SCREEN__SCREEN_TO_MMODULE);
		}
		return screenToMModule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MmMobileLearningPackage.SCREEN__SCREEN_TO_ELEMENT_INTERFACE:
				return ((InternalEList<?>)getScreenToElementInterface()).basicRemove(otherEnd, msgs);
			case MmMobileLearningPackage.SCREEN__SCREEN_TO_MMODULE:
				return ((InternalEList<?>)getScreenToMModule()).basicRemove(otherEnd, msgs);
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
			case MmMobileLearningPackage.SCREEN__LABEL:
				return getLabel();
			case MmMobileLearningPackage.SCREEN__SCREEN_TO_ELEMENT_INTERFACE:
				return getScreenToElementInterface();
			case MmMobileLearningPackage.SCREEN__ORIGEM_ELEMENT:
				return getOrigemElement();
			case MmMobileLearningPackage.SCREEN__SCREEN_TO_MMODULE:
				return getScreenToMModule();
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
			case MmMobileLearningPackage.SCREEN__LABEL:
				setLabel((String)newValue);
				return;
			case MmMobileLearningPackage.SCREEN__SCREEN_TO_ELEMENT_INTERFACE:
				getScreenToElementInterface().clear();
				getScreenToElementInterface().addAll((Collection<? extends ElementInterface>)newValue);
				return;
			case MmMobileLearningPackage.SCREEN__ORIGEM_ELEMENT:
				setOrigemElement((String)newValue);
				return;
			case MmMobileLearningPackage.SCREEN__SCREEN_TO_MMODULE:
				getScreenToMModule().clear();
				getScreenToMModule().addAll((Collection<? extends MModule>)newValue);
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
			case MmMobileLearningPackage.SCREEN__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case MmMobileLearningPackage.SCREEN__SCREEN_TO_ELEMENT_INTERFACE:
				getScreenToElementInterface().clear();
				return;
			case MmMobileLearningPackage.SCREEN__ORIGEM_ELEMENT:
				setOrigemElement(ORIGEM_ELEMENT_EDEFAULT);
				return;
			case MmMobileLearningPackage.SCREEN__SCREEN_TO_MMODULE:
				getScreenToMModule().clear();
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
			case MmMobileLearningPackage.SCREEN__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case MmMobileLearningPackage.SCREEN__SCREEN_TO_ELEMENT_INTERFACE:
				return screenToElementInterface != null && !screenToElementInterface.isEmpty();
			case MmMobileLearningPackage.SCREEN__ORIGEM_ELEMENT:
				return ORIGEM_ELEMENT_EDEFAULT == null ? origemElement != null : !ORIGEM_ELEMENT_EDEFAULT.equals(origemElement);
			case MmMobileLearningPackage.SCREEN__SCREEN_TO_MMODULE:
				return screenToMModule != null && !screenToMModule.isEmpty();
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
		result.append(" (label: ");
		result.append(label);
		result.append(", origemElement: ");
		result.append(origemElement);
		result.append(')');
		return result.toString();
	}

} //ScreenImpl
