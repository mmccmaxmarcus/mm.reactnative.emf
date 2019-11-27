/**
 */
package mmMobileLearning.impl;

import java.util.Collection;

import mmMobileLearning.ElementInterface;
import mmMobileLearning.MmMobileLearningPackage;

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
 * An implementation of the model object '<em><b>Element Interface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mmMobileLearning.impl.ElementInterfaceImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link mmMobileLearning.impl.ElementInterfaceImpl#getSubElementInterface <em>Sub Element Interface</em>}</li>
 *   <li>{@link mmMobileLearning.impl.ElementInterfaceImpl#getOrigemElement <em>Origem Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ElementInterfaceImpl extends MinimalEObjectImpl.Container implements ElementInterface {
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
	 * The cached value of the '{@link #getSubElementInterface() <em>Sub Element Interface</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubElementInterface()
	 * @generated
	 * @ordered
	 */
	protected EList<ElementInterface> subElementInterface;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElementInterfaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MmMobileLearningPackage.Literals.ELEMENT_INTERFACE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MmMobileLearningPackage.ELEMENT_INTERFACE__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ElementInterface> getSubElementInterface() {
		if (subElementInterface == null) {
			subElementInterface = new EObjectContainmentEList<ElementInterface>(ElementInterface.class, this, MmMobileLearningPackage.ELEMENT_INTERFACE__SUB_ELEMENT_INTERFACE);
		}
		return subElementInterface;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MmMobileLearningPackage.ELEMENT_INTERFACE__ORIGEM_ELEMENT, oldOrigemElement, origemElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MmMobileLearningPackage.ELEMENT_INTERFACE__SUB_ELEMENT_INTERFACE:
				return ((InternalEList<?>)getSubElementInterface()).basicRemove(otherEnd, msgs);
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
			case MmMobileLearningPackage.ELEMENT_INTERFACE__LABEL:
				return getLabel();
			case MmMobileLearningPackage.ELEMENT_INTERFACE__SUB_ELEMENT_INTERFACE:
				return getSubElementInterface();
			case MmMobileLearningPackage.ELEMENT_INTERFACE__ORIGEM_ELEMENT:
				return getOrigemElement();
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
			case MmMobileLearningPackage.ELEMENT_INTERFACE__LABEL:
				setLabel((String)newValue);
				return;
			case MmMobileLearningPackage.ELEMENT_INTERFACE__SUB_ELEMENT_INTERFACE:
				getSubElementInterface().clear();
				getSubElementInterface().addAll((Collection<? extends ElementInterface>)newValue);
				return;
			case MmMobileLearningPackage.ELEMENT_INTERFACE__ORIGEM_ELEMENT:
				setOrigemElement((String)newValue);
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
			case MmMobileLearningPackage.ELEMENT_INTERFACE__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case MmMobileLearningPackage.ELEMENT_INTERFACE__SUB_ELEMENT_INTERFACE:
				getSubElementInterface().clear();
				return;
			case MmMobileLearningPackage.ELEMENT_INTERFACE__ORIGEM_ELEMENT:
				setOrigemElement(ORIGEM_ELEMENT_EDEFAULT);
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
			case MmMobileLearningPackage.ELEMENT_INTERFACE__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case MmMobileLearningPackage.ELEMENT_INTERFACE__SUB_ELEMENT_INTERFACE:
				return subElementInterface != null && !subElementInterface.isEmpty();
			case MmMobileLearningPackage.ELEMENT_INTERFACE__ORIGEM_ELEMENT:
				return ORIGEM_ELEMENT_EDEFAULT == null ? origemElement != null : !ORIGEM_ELEMENT_EDEFAULT.equals(origemElement);
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

} //ElementInterfaceImpl
