/**
 */
package mmMobileLearning.impl;

import java.util.Collection;

import mmMobileLearning.MConcept;
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
 * An implementation of the model object '<em><b>MModule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mmMobileLearning.impl.MModuleImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link mmMobileLearning.impl.MModuleImpl#getNameModule <em>Name Module</em>}</li>
 *   <li>{@link mmMobileLearning.impl.MModuleImpl#isVisible <em>Visible</em>}</li>
 *   <li>{@link mmMobileLearning.impl.MModuleImpl#getMModuleToMConcept <em>MModule To MConcept</em>}</li>
 *   <li>{@link mmMobileLearning.impl.MModuleImpl#getSubModule <em>Sub Module</em>}</li>
 *   <li>{@link mmMobileLearning.impl.MModuleImpl#getMModuleToScreen <em>MModule To Screen</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MModuleImpl extends MinimalEObjectImpl.Container implements MModule {
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
	 * The default value of the '{@link #getNameModule() <em>Name Module</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameModule()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_MODULE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNameModule() <em>Name Module</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameModule()
	 * @generated
	 * @ordered
	 */
	protected String nameModule = NAME_MODULE_EDEFAULT;

	/**
	 * The default value of the '{@link #isVisible() <em>Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVisible()
	 * @generated
	 * @ordered
	 */
	protected static final boolean VISIBLE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isVisible() <em>Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVisible()
	 * @generated
	 * @ordered
	 */
	protected boolean visible = VISIBLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMModuleToMConcept() <em>MModule To MConcept</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMModuleToMConcept()
	 * @generated
	 * @ordered
	 */
	protected EList<MConcept> mModuleToMConcept;

	/**
	 * The cached value of the '{@link #getSubModule() <em>Sub Module</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubModule()
	 * @generated
	 * @ordered
	 */
	protected EList<MModule> subModule;

	/**
	 * The cached value of the '{@link #getMModuleToScreen() <em>MModule To Screen</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMModuleToScreen()
	 * @generated
	 * @ordered
	 */
	protected EList<Screen> mModuleToScreen;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MModuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MmMobileLearningPackage.Literals.MMODULE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MmMobileLearningPackage.MMODULE__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNameModule() {
		return nameModule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNameModule(String newNameModule) {
		String oldNameModule = nameModule;
		nameModule = newNameModule;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MmMobileLearningPackage.MMODULE__NAME_MODULE, oldNameModule, nameModule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isVisible() {
		return visible;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVisible(boolean newVisible) {
		boolean oldVisible = visible;
		visible = newVisible;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MmMobileLearningPackage.MMODULE__VISIBLE, oldVisible, visible));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MConcept> getMModuleToMConcept() {
		if (mModuleToMConcept == null) {
			mModuleToMConcept = new EObjectContainmentEList<MConcept>(MConcept.class, this, MmMobileLearningPackage.MMODULE__MMODULE_TO_MCONCEPT);
		}
		return mModuleToMConcept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MModule> getSubModule() {
		if (subModule == null) {
			subModule = new EObjectContainmentEList<MModule>(MModule.class, this, MmMobileLearningPackage.MMODULE__SUB_MODULE);
		}
		return subModule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Screen> getMModuleToScreen() {
		if (mModuleToScreen == null) {
			mModuleToScreen = new EObjectContainmentEList<Screen>(Screen.class, this, MmMobileLearningPackage.MMODULE__MMODULE_TO_SCREEN);
		}
		return mModuleToScreen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MmMobileLearningPackage.MMODULE__MMODULE_TO_MCONCEPT:
				return ((InternalEList<?>)getMModuleToMConcept()).basicRemove(otherEnd, msgs);
			case MmMobileLearningPackage.MMODULE__SUB_MODULE:
				return ((InternalEList<?>)getSubModule()).basicRemove(otherEnd, msgs);
			case MmMobileLearningPackage.MMODULE__MMODULE_TO_SCREEN:
				return ((InternalEList<?>)getMModuleToScreen()).basicRemove(otherEnd, msgs);
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
			case MmMobileLearningPackage.MMODULE__LABEL:
				return getLabel();
			case MmMobileLearningPackage.MMODULE__NAME_MODULE:
				return getNameModule();
			case MmMobileLearningPackage.MMODULE__VISIBLE:
				return isVisible();
			case MmMobileLearningPackage.MMODULE__MMODULE_TO_MCONCEPT:
				return getMModuleToMConcept();
			case MmMobileLearningPackage.MMODULE__SUB_MODULE:
				return getSubModule();
			case MmMobileLearningPackage.MMODULE__MMODULE_TO_SCREEN:
				return getMModuleToScreen();
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
			case MmMobileLearningPackage.MMODULE__LABEL:
				setLabel((String)newValue);
				return;
			case MmMobileLearningPackage.MMODULE__NAME_MODULE:
				setNameModule((String)newValue);
				return;
			case MmMobileLearningPackage.MMODULE__VISIBLE:
				setVisible((Boolean)newValue);
				return;
			case MmMobileLearningPackage.MMODULE__MMODULE_TO_MCONCEPT:
				getMModuleToMConcept().clear();
				getMModuleToMConcept().addAll((Collection<? extends MConcept>)newValue);
				return;
			case MmMobileLearningPackage.MMODULE__SUB_MODULE:
				getSubModule().clear();
				getSubModule().addAll((Collection<? extends MModule>)newValue);
				return;
			case MmMobileLearningPackage.MMODULE__MMODULE_TO_SCREEN:
				getMModuleToScreen().clear();
				getMModuleToScreen().addAll((Collection<? extends Screen>)newValue);
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
			case MmMobileLearningPackage.MMODULE__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case MmMobileLearningPackage.MMODULE__NAME_MODULE:
				setNameModule(NAME_MODULE_EDEFAULT);
				return;
			case MmMobileLearningPackage.MMODULE__VISIBLE:
				setVisible(VISIBLE_EDEFAULT);
				return;
			case MmMobileLearningPackage.MMODULE__MMODULE_TO_MCONCEPT:
				getMModuleToMConcept().clear();
				return;
			case MmMobileLearningPackage.MMODULE__SUB_MODULE:
				getSubModule().clear();
				return;
			case MmMobileLearningPackage.MMODULE__MMODULE_TO_SCREEN:
				getMModuleToScreen().clear();
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
			case MmMobileLearningPackage.MMODULE__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case MmMobileLearningPackage.MMODULE__NAME_MODULE:
				return NAME_MODULE_EDEFAULT == null ? nameModule != null : !NAME_MODULE_EDEFAULT.equals(nameModule);
			case MmMobileLearningPackage.MMODULE__VISIBLE:
				return visible != VISIBLE_EDEFAULT;
			case MmMobileLearningPackage.MMODULE__MMODULE_TO_MCONCEPT:
				return mModuleToMConcept != null && !mModuleToMConcept.isEmpty();
			case MmMobileLearningPackage.MMODULE__SUB_MODULE:
				return subModule != null && !subModule.isEmpty();
			case MmMobileLearningPackage.MMODULE__MMODULE_TO_SCREEN:
				return mModuleToScreen != null && !mModuleToScreen.isEmpty();
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
		result.append(", nameModule: ");
		result.append(nameModule);
		result.append(", visible: ");
		result.append(visible);
		result.append(')');
		return result.toString();
	}

} //MModuleImpl
