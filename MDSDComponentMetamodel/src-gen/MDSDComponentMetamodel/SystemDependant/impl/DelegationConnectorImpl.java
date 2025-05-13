/**
 */
package MDSDComponentMetamodel.SystemDependant.impl;

import MDSDComponentMetamodel.SystemDependant.DelegationConnector;
import MDSDComponentMetamodel.SystemDependant.Role;
import MDSDComponentMetamodel.SystemDependant.SystemDependantPackage;

import MDSDComponentMetamodel.SystemIndependant.Interface;

import MDSDComponentMetamodel.impl.NamedElementImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Delegation Connector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MDSDComponentMetamodel.SystemDependant.impl.DelegationConnectorImpl#getRole <em>Role</em>}</li>
 *   <li>{@link MDSDComponentMetamodel.SystemDependant.impl.DelegationConnectorImpl#getDelegatedInterface <em>Delegated Interface</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DelegationConnectorImpl extends NamedElementImpl implements DelegationConnector {
	/**
	 * The cached value of the '{@link #getRole() <em>Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected Role role;

	/**
	 * The cached value of the '{@link #getDelegatedInterface() <em>Delegated Interface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelegatedInterface()
	 * @generated
	 * @ordered
	 */
	protected Interface delegatedInterface;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DelegationConnectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SystemDependantPackage.Literals.DELEGATION_CONNECTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Role getRole() {
		if (role != null && role.eIsProxy()) {
			InternalEObject oldRole = (InternalEObject) role;
			role = (Role) eResolveProxy(oldRole);
			if (role != oldRole) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							SystemDependantPackage.DELEGATION_CONNECTOR__ROLE, oldRole, role));
			}
		}
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role basicGetRole() {
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRole(Role newRole) {
		Role oldRole = role;
		role = newRole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SystemDependantPackage.DELEGATION_CONNECTOR__ROLE,
					oldRole, role));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Interface getDelegatedInterface() {
		if (delegatedInterface != null && delegatedInterface.eIsProxy()) {
			InternalEObject oldDelegatedInterface = (InternalEObject) delegatedInterface;
			delegatedInterface = (Interface) eResolveProxy(oldDelegatedInterface);
			if (delegatedInterface != oldDelegatedInterface) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							SystemDependantPackage.DELEGATION_CONNECTOR__DELEGATED_INTERFACE, oldDelegatedInterface,
							delegatedInterface));
			}
		}
		return delegatedInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interface basicGetDelegatedInterface() {
		return delegatedInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDelegatedInterface(Interface newDelegatedInterface) {
		Interface oldDelegatedInterface = delegatedInterface;
		delegatedInterface = newDelegatedInterface;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SystemDependantPackage.DELEGATION_CONNECTOR__DELEGATED_INTERFACE, oldDelegatedInterface,
					delegatedInterface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SystemDependantPackage.DELEGATION_CONNECTOR__ROLE:
			if (resolve)
				return getRole();
			return basicGetRole();
		case SystemDependantPackage.DELEGATION_CONNECTOR__DELEGATED_INTERFACE:
			if (resolve)
				return getDelegatedInterface();
			return basicGetDelegatedInterface();
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
		case SystemDependantPackage.DELEGATION_CONNECTOR__ROLE:
			setRole((Role) newValue);
			return;
		case SystemDependantPackage.DELEGATION_CONNECTOR__DELEGATED_INTERFACE:
			setDelegatedInterface((Interface) newValue);
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
		case SystemDependantPackage.DELEGATION_CONNECTOR__ROLE:
			setRole((Role) null);
			return;
		case SystemDependantPackage.DELEGATION_CONNECTOR__DELEGATED_INTERFACE:
			setDelegatedInterface((Interface) null);
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
		case SystemDependantPackage.DELEGATION_CONNECTOR__ROLE:
			return role != null;
		case SystemDependantPackage.DELEGATION_CONNECTOR__DELEGATED_INTERFACE:
			return delegatedInterface != null;
		}
		return super.eIsSet(featureID);
	}

} //DelegationConnectorImpl
