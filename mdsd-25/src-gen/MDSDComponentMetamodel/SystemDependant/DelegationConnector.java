/**
 */
package MDSDComponentMetamodel.SystemDependant;

import MDSDComponentMetamodel.NamedElement;

import MDSDComponentMetamodel.SystemIndependant.Interface;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Delegation Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MDSDComponentMetamodel.SystemDependant.DelegationConnector#getRole <em>Role</em>}</li>
 *   <li>{@link MDSDComponentMetamodel.SystemDependant.DelegationConnector#getDelegatedInterface <em>Delegated Interface</em>}</li>
 * </ul>
 *
 * @see MDSDComponentMetamodel.SystemDependant.SystemDependantPackage#getDelegationConnector()
 * @model
 * @generated
 */
public interface DelegationConnector extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' reference.
	 * @see #setRole(Role)
	 * @see MDSDComponentMetamodel.SystemDependant.SystemDependantPackage#getDelegationConnector_Role()
	 * @model required="true"
	 * @generated
	 */
	Role getRole();

	/**
	 * Sets the value of the '{@link MDSDComponentMetamodel.SystemDependant.DelegationConnector#getRole <em>Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' reference.
	 * @see #getRole()
	 * @generated
	 */
	void setRole(Role value);

	/**
	 * Returns the value of the '<em><b>Delegated Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delegated Interface</em>' reference.
	 * @see #setDelegatedInterface(Interface)
	 * @see MDSDComponentMetamodel.SystemDependant.SystemDependantPackage#getDelegationConnector_DelegatedInterface()
	 * @model required="true"
	 * @generated
	 */
	Interface getDelegatedInterface();

	/**
	 * Sets the value of the '{@link MDSDComponentMetamodel.SystemDependant.DelegationConnector#getDelegatedInterface <em>Delegated Interface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delegated Interface</em>' reference.
	 * @see #getDelegatedInterface()
	 * @generated
	 */
	void setDelegatedInterface(Interface value);

} // DelegationConnector
