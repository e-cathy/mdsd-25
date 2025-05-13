/**
 */
package MDSDComponentMetamodel.SystemDependant;

import MDSDComponentMetamodel.NamedElement;

import MDSDComponentMetamodel.SystemIndependant.Interface;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MDSDComponentMetamodel.SystemDependant.Role#getInterface <em>Interface</em>}</li>
 *   <li>{@link MDSDComponentMetamodel.SystemDependant.Role#getProvidedAssemblyContext <em>Provided Assembly Context</em>}</li>
 *   <li>{@link MDSDComponentMetamodel.SystemDependant.Role#getRequiredAssemblyContext <em>Required Assembly Context</em>}</li>
 * </ul>
 *
 * @see MDSDComponentMetamodel.SystemDependant.SystemDependantPackage#getRole()
 * @model
 * @generated
 */
public interface Role extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface</em>' reference.
	 * @see #setInterface(Interface)
	 * @see MDSDComponentMetamodel.SystemDependant.SystemDependantPackage#getRole_Interface()
	 * @model required="true"
	 * @generated
	 */
	Interface getInterface();

	/**
	 * Sets the value of the '{@link MDSDComponentMetamodel.SystemDependant.Role#getInterface <em>Interface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interface</em>' reference.
	 * @see #getInterface()
	 * @generated
	 */
	void setInterface(Interface value);

	/**
	 * Returns the value of the '<em><b>Provided Assembly Context</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link MDSDComponentMetamodel.SystemDependant.AssemblyContext#getProvidedRoles <em>Provided Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provided Assembly Context</em>' container reference.
	 * @see #setProvidedAssemblyContext(AssemblyContext)
	 * @see MDSDComponentMetamodel.SystemDependant.SystemDependantPackage#getRole_ProvidedAssemblyContext()
	 * @see MDSDComponentMetamodel.SystemDependant.AssemblyContext#getProvidedRoles
	 * @model opposite="providedRoles" transient="false"
	 * @generated
	 */
	AssemblyContext getProvidedAssemblyContext();

	/**
	 * Sets the value of the '{@link MDSDComponentMetamodel.SystemDependant.Role#getProvidedAssemblyContext <em>Provided Assembly Context</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provided Assembly Context</em>' container reference.
	 * @see #getProvidedAssemblyContext()
	 * @generated
	 */
	void setProvidedAssemblyContext(AssemblyContext value);

	/**
	 * Returns the value of the '<em><b>Required Assembly Context</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link MDSDComponentMetamodel.SystemDependant.AssemblyContext#getRequiredRoles <em>Required Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Assembly Context</em>' container reference.
	 * @see #setRequiredAssemblyContext(AssemblyContext)
	 * @see MDSDComponentMetamodel.SystemDependant.SystemDependantPackage#getRole_RequiredAssemblyContext()
	 * @see MDSDComponentMetamodel.SystemDependant.AssemblyContext#getRequiredRoles
	 * @model opposite="requiredRoles" transient="false"
	 * @generated
	 */
	AssemblyContext getRequiredAssemblyContext();

	/**
	 * Sets the value of the '{@link MDSDComponentMetamodel.SystemDependant.Role#getRequiredAssemblyContext <em>Required Assembly Context</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required Assembly Context</em>' container reference.
	 * @see #getRequiredAssemblyContext()
	 * @generated
	 */
	void setRequiredAssemblyContext(AssemblyContext value);

} // Role
