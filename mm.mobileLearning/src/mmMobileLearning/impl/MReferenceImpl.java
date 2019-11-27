/**
 */
package mmMobileLearning.impl;

import mmMobileLearning.MConcept;
import mmMobileLearning.MReference;
import mmMobileLearning.MmMobileLearningPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MReference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mmMobileLearning.impl.MReferenceImpl#getMReferenceToConcept <em>MReference To Concept</em>}</li>
 *   <li>{@link mmMobileLearning.impl.MReferenceImpl#getMNameReference <em>MName Reference</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MReferenceImpl extends MinimalEObjectImpl.Container implements MReference {
	/**
	 * The cached value of the '{@link #getMReferenceToConcept() <em>MReference To Concept</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMReferenceToConcept()
	 * @generated
	 * @ordered
	 */
	protected MConcept mReferenceToConcept;

	/**
	 * The default value of the '{@link #getMNameReference() <em>MName Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMNameReference()
	 * @generated
	 * @ordered
	 */
	protected static final String MNAME_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMNameReference() <em>MName Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMNameReference()
	 * @generated
	 * @ordered
	 */
	protected String mNameReference = MNAME_REFERENCE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MmMobileLearningPackage.Literals.MREFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MConcept getMReferenceToConcept() {
		if (mReferenceToConcept != null && mReferenceToConcept.eIsProxy()) {
			InternalEObject oldMReferenceToConcept = (InternalEObject)mReferenceToConcept;
			mReferenceToConcept = (MConcept)eResolveProxy(oldMReferenceToConcept);
			if (mReferenceToConcept != oldMReferenceToConcept) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MmMobileLearningPackage.MREFERENCE__MREFERENCE_TO_CONCEPT, oldMReferenceToConcept, mReferenceToConcept));
			}
		}
		return mReferenceToConcept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MConcept basicGetMReferenceToConcept() {
		return mReferenceToConcept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMReferenceToConcept(MConcept newMReferenceToConcept) {
		MConcept oldMReferenceToConcept = mReferenceToConcept;
		mReferenceToConcept = newMReferenceToConcept;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MmMobileLearningPackage.MREFERENCE__MREFERENCE_TO_CONCEPT, oldMReferenceToConcept, mReferenceToConcept));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMNameReference() {
		return mNameReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMNameReference(String newMNameReference) {
		String oldMNameReference = mNameReference;
		mNameReference = newMNameReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MmMobileLearningPackage.MREFERENCE__MNAME_REFERENCE, oldMNameReference, mNameReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MmMobileLearningPackage.MREFERENCE__MREFERENCE_TO_CONCEPT:
				if (resolve) return getMReferenceToConcept();
				return basicGetMReferenceToConcept();
			case MmMobileLearningPackage.MREFERENCE__MNAME_REFERENCE:
				return getMNameReference();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MmMobileLearningPackage.MREFERENCE__MREFERENCE_TO_CONCEPT:
				setMReferenceToConcept((MConcept)newValue);
				return;
			case MmMobileLearningPackage.MREFERENCE__MNAME_REFERENCE:
				setMNameReference((String)newValue);
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
			case MmMobileLearningPackage.MREFERENCE__MREFERENCE_TO_CONCEPT:
				setMReferenceToConcept((MConcept)null);
				return;
			case MmMobileLearningPackage.MREFERENCE__MNAME_REFERENCE:
				setMNameReference(MNAME_REFERENCE_EDEFAULT);
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
			case MmMobileLearningPackage.MREFERENCE__MREFERENCE_TO_CONCEPT:
				return mReferenceToConcept != null;
			case MmMobileLearningPackage.MREFERENCE__MNAME_REFERENCE:
				return MNAME_REFERENCE_EDEFAULT == null ? mNameReference != null : !MNAME_REFERENCE_EDEFAULT.equals(mNameReference);
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
		result.append(" (mNameReference: ");
		result.append(mNameReference);
		result.append(')');
		return result.toString();
	}

} //MReferenceImpl
