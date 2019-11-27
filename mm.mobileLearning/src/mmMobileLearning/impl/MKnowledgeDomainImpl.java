/**
 */
package mmMobileLearning.impl;

import java.util.Collection;

import mmMobileLearning.MConcept;
import mmMobileLearning.MKnowledgeDomain;
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
 * An implementation of the model object '<em><b>MKnowledge Domain</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mmMobileLearning.impl.MKnowledgeDomainImpl#getMHasConcept <em>MHas Concept</em>}</li>
 *   <li>{@link mmMobileLearning.impl.MKnowledgeDomainImpl#getMNameKD <em>MName KD</em>}</li>
 *   <li>{@link mmMobileLearning.impl.MKnowledgeDomainImpl#getKDomainToMmodule <em>KDomain To Mmodule</em>}</li>
 *   <li>{@link mmMobileLearning.impl.MKnowledgeDomainImpl#getMKdomainToScreen <em>MKdomain To Screen</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MKnowledgeDomainImpl extends MinimalEObjectImpl.Container implements MKnowledgeDomain {
	/**
	 * The cached value of the '{@link #getMHasConcept() <em>MHas Concept</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMHasConcept()
	 * @generated
	 * @ordered
	 */
	protected EList<MConcept> mHasConcept;

	/**
	 * The default value of the '{@link #getMNameKD() <em>MName KD</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMNameKD()
	 * @generated
	 * @ordered
	 */
	protected static final String MNAME_KD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMNameKD() <em>MName KD</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMNameKD()
	 * @generated
	 * @ordered
	 */
	protected String mNameKD = MNAME_KD_EDEFAULT;

	/**
	 * The cached value of the '{@link #getKDomainToMmodule() <em>KDomain To Mmodule</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKDomainToMmodule()
	 * @generated
	 * @ordered
	 */
	protected EList<MModule> kDomainToMmodule;

	/**
	 * The cached value of the '{@link #getMKdomainToScreen() <em>MKdomain To Screen</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMKdomainToScreen()
	 * @generated
	 * @ordered
	 */
	protected EList<Screen> mKdomainToScreen;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MKnowledgeDomainImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MmMobileLearningPackage.Literals.MKNOWLEDGE_DOMAIN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MConcept> getMHasConcept() {
		if (mHasConcept == null) {
			mHasConcept = new EObjectContainmentEList<MConcept>(MConcept.class, this, MmMobileLearningPackage.MKNOWLEDGE_DOMAIN__MHAS_CONCEPT);
		}
		return mHasConcept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMNameKD() {
		return mNameKD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMNameKD(String newMNameKD) {
		String oldMNameKD = mNameKD;
		mNameKD = newMNameKD;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MmMobileLearningPackage.MKNOWLEDGE_DOMAIN__MNAME_KD, oldMNameKD, mNameKD));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MModule> getKDomainToMmodule() {
		if (kDomainToMmodule == null) {
			kDomainToMmodule = new EObjectContainmentEList<MModule>(MModule.class, this, MmMobileLearningPackage.MKNOWLEDGE_DOMAIN__KDOMAIN_TO_MMODULE);
		}
		return kDomainToMmodule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Screen> getMKdomainToScreen() {
		if (mKdomainToScreen == null) {
			mKdomainToScreen = new EObjectContainmentEList<Screen>(Screen.class, this, MmMobileLearningPackage.MKNOWLEDGE_DOMAIN__MKDOMAIN_TO_SCREEN);
		}
		return mKdomainToScreen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MmMobileLearningPackage.MKNOWLEDGE_DOMAIN__MHAS_CONCEPT:
				return ((InternalEList<?>)getMHasConcept()).basicRemove(otherEnd, msgs);
			case MmMobileLearningPackage.MKNOWLEDGE_DOMAIN__KDOMAIN_TO_MMODULE:
				return ((InternalEList<?>)getKDomainToMmodule()).basicRemove(otherEnd, msgs);
			case MmMobileLearningPackage.MKNOWLEDGE_DOMAIN__MKDOMAIN_TO_SCREEN:
				return ((InternalEList<?>)getMKdomainToScreen()).basicRemove(otherEnd, msgs);
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
			case MmMobileLearningPackage.MKNOWLEDGE_DOMAIN__MHAS_CONCEPT:
				return getMHasConcept();
			case MmMobileLearningPackage.MKNOWLEDGE_DOMAIN__MNAME_KD:
				return getMNameKD();
			case MmMobileLearningPackage.MKNOWLEDGE_DOMAIN__KDOMAIN_TO_MMODULE:
				return getKDomainToMmodule();
			case MmMobileLearningPackage.MKNOWLEDGE_DOMAIN__MKDOMAIN_TO_SCREEN:
				return getMKdomainToScreen();
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
			case MmMobileLearningPackage.MKNOWLEDGE_DOMAIN__MHAS_CONCEPT:
				getMHasConcept().clear();
				getMHasConcept().addAll((Collection<? extends MConcept>)newValue);
				return;
			case MmMobileLearningPackage.MKNOWLEDGE_DOMAIN__MNAME_KD:
				setMNameKD((String)newValue);
				return;
			case MmMobileLearningPackage.MKNOWLEDGE_DOMAIN__KDOMAIN_TO_MMODULE:
				getKDomainToMmodule().clear();
				getKDomainToMmodule().addAll((Collection<? extends MModule>)newValue);
				return;
			case MmMobileLearningPackage.MKNOWLEDGE_DOMAIN__MKDOMAIN_TO_SCREEN:
				getMKdomainToScreen().clear();
				getMKdomainToScreen().addAll((Collection<? extends Screen>)newValue);
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
			case MmMobileLearningPackage.MKNOWLEDGE_DOMAIN__MHAS_CONCEPT:
				getMHasConcept().clear();
				return;
			case MmMobileLearningPackage.MKNOWLEDGE_DOMAIN__MNAME_KD:
				setMNameKD(MNAME_KD_EDEFAULT);
				return;
			case MmMobileLearningPackage.MKNOWLEDGE_DOMAIN__KDOMAIN_TO_MMODULE:
				getKDomainToMmodule().clear();
				return;
			case MmMobileLearningPackage.MKNOWLEDGE_DOMAIN__MKDOMAIN_TO_SCREEN:
				getMKdomainToScreen().clear();
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
			case MmMobileLearningPackage.MKNOWLEDGE_DOMAIN__MHAS_CONCEPT:
				return mHasConcept != null && !mHasConcept.isEmpty();
			case MmMobileLearningPackage.MKNOWLEDGE_DOMAIN__MNAME_KD:
				return MNAME_KD_EDEFAULT == null ? mNameKD != null : !MNAME_KD_EDEFAULT.equals(mNameKD);
			case MmMobileLearningPackage.MKNOWLEDGE_DOMAIN__KDOMAIN_TO_MMODULE:
				return kDomainToMmodule != null && !kDomainToMmodule.isEmpty();
			case MmMobileLearningPackage.MKNOWLEDGE_DOMAIN__MKDOMAIN_TO_SCREEN:
				return mKdomainToScreen != null && !mKdomainToScreen.isEmpty();
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
		result.append(" (mNameKD: ");
		result.append(mNameKD);
		result.append(')');
		return result.toString();
	}

} //MKnowledgeDomainImpl
