/**
 */
package MDSDComponentMetamodel.SystemIndependant.impl;

import MDSDComponentMetamodel.SystemIndependant.Service;
import MDSDComponentMetamodel.SystemIndependant.Signature;
import MDSDComponentMetamodel.SystemIndependant.SystemIndependantPackage;

import MDSDComponentMetamodel.impl.NamedElementImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MDSDComponentMetamodel.SystemIndependant.impl.ServiceImpl#getCorrespondingSignature <em>Corresponding Signature</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServiceImpl extends NamedElementImpl implements Service {
	/**
	 * The cached value of the '{@link #getCorrespondingSignature() <em>Corresponding Signature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCorrespondingSignature()
	 * @generated
	 * @ordered
	 */
	protected Signature correspondingSignature;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SystemIndependantPackage.Literals.SERVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Signature getCorrespondingSignature() {
		if (correspondingSignature != null && correspondingSignature.eIsProxy()) {
			InternalEObject oldCorrespondingSignature = (InternalEObject) correspondingSignature;
			correspondingSignature = (Signature) eResolveProxy(oldCorrespondingSignature);
			if (correspondingSignature != oldCorrespondingSignature) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							SystemIndependantPackage.SERVICE__CORRESPONDING_SIGNATURE, oldCorrespondingSignature,
							correspondingSignature));
			}
		}
		return correspondingSignature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Signature basicGetCorrespondingSignature() {
		return correspondingSignature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCorrespondingSignature(Signature newCorrespondingSignature) {
		Signature oldCorrespondingSignature = correspondingSignature;
		correspondingSignature = newCorrespondingSignature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SystemIndependantPackage.SERVICE__CORRESPONDING_SIGNATURE, oldCorrespondingSignature,
					correspondingSignature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SystemIndependantPackage.SERVICE__CORRESPONDING_SIGNATURE:
			if (resolve)
				return getCorrespondingSignature();
			return basicGetCorrespondingSignature();
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
		case SystemIndependantPackage.SERVICE__CORRESPONDING_SIGNATURE:
			setCorrespondingSignature((Signature) newValue);
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
		case SystemIndependantPackage.SERVICE__CORRESPONDING_SIGNATURE:
			setCorrespondingSignature((Signature) null);
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
		case SystemIndependantPackage.SERVICE__CORRESPONDING_SIGNATURE:
			return correspondingSignature != null;
		}
		return super.eIsSet(featureID);
	}

} //ServiceImpl
