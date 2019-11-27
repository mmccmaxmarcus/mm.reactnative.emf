/**
 */
package mmMobileLearning.impl;

import java.util.Collection;

import mmMobileLearning.MConcept;
import mmMobileLearning.MReference;
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
 * An implementation of the model object '<em><b>MConcept</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mmMobileLearning.impl.MConceptImpl#getNameMConcept <em>Name MConcept</em>}</li>
 *   <li>{@link mmMobileLearning.impl.MConceptImpl#getMSubConcept <em>MSub Concept</em>}</li>
 *   <li>{@link mmMobileLearning.impl.MConceptImpl#getMHasReference <em>MHas Reference</em>}</li>
 *   <li>{@link mmMobileLearning.impl.MConceptImpl#getMConceptToScreen <em>MConcept To Screen</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MConceptImpl extends MinimalEObjectImpl.Container implements MConcept {
	/**
	 * The default value of the '{@link #getNameMConcept() <em>Name MConcept</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameMConcept()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_MCONCEPT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNameMConcept() <em>Name MConcept</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameMConcept()
	 * @generated
	 * @ordered
	 */
	protected String nameMConcept = NAME_MCONCEPT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMSubConcept() <em>MSub Concept</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMSubConcept()
	 * @generated
	 * @ordered
	 */
	protected EList<MConcept> mSubConcept;

	/**
	 * The cached value of the '{@link #getMHasReference() <em>MHas Reference</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMHasReference()
	 * @generated
	 * @ordered
	 */
	protected EList<MReference> mHasReference;

	/**
	 * The cached value of the '{@link #getMConceptToScreen() <em>MConcept To Screen</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMConceptToScreen()
	 * @generated
	 * @ordered
	 */
	protected EList<Screen> mConceptToScreen;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MConceptImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MmMobileLearningPackage.Literals.MCONCEPT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNameMConcept() {
		return nameMConcept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNameMConcept(String newNameMConcept) {
		String oldNameMConcept = nameMConcept;
		nameMConcept = newNameMConcept;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MmMobileLearningPackage.MCONCEPT__NAME_MCONCEPT, oldNameMConcept, nameMConcept));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MConcept> getMSubConcept() {
		if (mSubConcept == null) {
			mSubConcept = new EObjectContainmentEList<MConcept>(MConcept.class, this, MmMobileLearningPackage.MCONCEPT__MSUB_CONCEPT);
		}
		return mSubConcept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MReference> getMHasReference() {
		if (mHasReference == null) {
			mHasReference = new EObjectContainmentEList<MReference>(MReference.class, this, MmMobileLearningPackage.MCONCEPT__MHAS_REFERENCE);
		}
		return mHasReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Screen> getMConceptToScreen() {
		if (mConceptToScreen == null) {
			mConceptToScreen = new EObjectContainmentEList<Screen>(Screen.class, this, MmMobileLearningPackage.MCONCEPT__MCONCEPT_TO_SCREEN);
		}
		return mConceptToScreen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MmMobileLearningPackage.MCONCEPT__MSUB_CONCEPT:
				return ((InternalEList<?>)getMSubConcept()).basicRemove(otherEnd, msgs);
			case MmMobileLearningPackage.MCONCEPT__MHAS_REFERENCE:
				return ((InternalEList<?>)getMHasReference()).basicRemove(otherEnd, msgs);
			case MmMobileLearningPackage.MCONCEPT__MCONCEPT_TO_SCREEN:
				return ((InternalEList<?>)getMConceptToScreen()).basicRemove(otherEnd, msgs);
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
			case MmMobileLearningPackage.MCONCEPT__NAME_MCONCEPT:
				return getNameMConcept();
			case MmMobileLearningPackage.MCONCEPT__MSUB_CONCEPT:
				return getMSubConcept();
			case MmMobileLearningPackage.MCONCEPT__MHAS_REFERENCE:
				return getMHasReference();
			case MmMobileLearningPackage.MCONCEPT__MCONCEPT_TO_SCREEN:
				return getMConceptToScreen();
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
			case MmMobileLearningPackage.MCONCEPT__NAME_MCONCEPT:
				setNameMConcept((String)newValue);
				return;
			case MmMobileLearningPackage.MCONCEPT__MSUB_CONCEPT:
				getMSubConcept().clear();
				getMSubConcept().addAll((Collection<? extends MConcept>)newValue);
				return;
			case MmMobileLearningPackage.MCONCEPT__MHAS_REFERENCE:
				getMHasReference().clear();
				getMHasReference().addAll((Collection<? extends MReference>)newValue);
				return;
			case MmMobileLearningPackage.MCONCEPT__MCONCEPT_TO_SCREEN:
				getMConceptToScreen().clear();
				getMConceptToScreen().addAll((Collection<? extends Screen>)newValue);
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
			case MmMobileLearningPackage.MCONCEPT__NAME_MCONCEPT:
				setNameMConcept(NAME_MCONCEPT_EDEFAULT);
				return;
			case MmMobileLearningPackage.MCONCEPT__MSUB_CONCEPT:
				getMSubConcept().clear();
				return;
			case MmMobileLearningPackage.MCONCEPT__MHAS_REFERENCE:
				getMHasReference().clear();
				return;
			case MmMobileLearningPackage.MCONCEPT__MCONCEPT_TO_SCREEN:
				getMConceptToScreen().clear();
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
			case MmMobileLearningPackage.MCONCEPT__NAME_MCONCEPT:
				return NAME_MCONCEPT_EDEFAULT == null ? nameMConcept != null : !NAME_MCONCEPT_EDEFAULT.equals(nameMConcept);
			case MmMobileLearningPackage.MCONCEPT__MSUB_CONCEPT:
				return mSubConcept != null && !mSubConcept.isEmpty();
			case MmMobileLearningPackage.MCONCEPT__MHAS_REFERENCE:
				return mHasReference != null && !mHasReference.isEmpty();
			case MmMobileLearningPackage.MCONCEPT__MCONCEPT_TO_SCREEN:
				return mConceptToScreen != null && !mConceptToScreen.isEmpty();
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
		result.append(" (nameMConcept: ");
		result.append(nameMConcept);
		result.append(')');
		return result.toString();
	}

} //MConceptImpl
