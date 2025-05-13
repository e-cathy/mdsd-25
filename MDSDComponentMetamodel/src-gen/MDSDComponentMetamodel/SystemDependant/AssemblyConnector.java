/**
 */
package MDSDComponentMetamodel.SystemDependant;

import MDSDComponentMetamodel.NamedElement;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assembly Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MDSDComponentMetamodel.SystemDependant.AssemblyConnector#getProvidedRole <em>Provided Role</em>}</li>
 *   <li>{@link MDSDComponentMetamodel.SystemDependant.AssemblyConnector#getRequiredRole <em>Required Role</em>}</li>
 * </ul>
 *
 * @see MDSDComponentMetamodel.SystemDependant.SystemDependantPackage#getAssemblyConnector()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='connectedRolesAreInSameContainerOrLinkedContainers'"
 * @generated
 */
public interface AssemblyConnector extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Provided Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provided Role</em>' reference.
	 * @see #setProvidedRole(Role)
	 * @see MDSDComponentMetamodel.SystemDependant.SystemDependantPackage#getAssemblyConnector_ProvidedRole()
	 * @model required="true"
	 * @generated
	 */
	Role getProvidedRole();

	/**
	 * Sets the value of the '{@link MDSDComponentMetamodel.SystemDependant.AssemblyConnector#getProvidedRole <em>Provided Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provided Role</em>' reference.
	 * @see #getProvidedRole()
	 * @generated
	 */
	void setProvidedRole(Role value);

	/**
	 * Returns the value of the '<em><b>Required Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Role</em>' reference.
	 * @see #setRequiredRole(Role)
	 * @see MDSDComponentMetamodel.SystemDependant.SystemDependantPackage#getAssemblyConnector_RequiredRole()
	 * @model required="true"
	 * @generated
	 */
	Role getRequiredRole();

	/**
	 * Sets the value of the '{@link MDSDComponentMetamodel.SystemDependant.AssemblyConnector#getRequiredRole <em>Required Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required Role</em>' reference.
	 * @see #getRequiredRole()
	 * @generated
	 */
	void setRequiredRole(Role value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='not self.providedRole.providedAssemblyContext.oclIsUndefined() and not self.requiredRole.requiredAssemblyContext.oclIsUndefined()'"
	 * @generated
	 */
	boolean providedOrRequiredMatches(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t\t\t(not self.providedRole.providedAssemblyContext.allocationContext.oclIsUndefined() and not self.requiredRole.requiredAssemblyContext.allocationContext.oclIsUndefined()) implies\n\t\t\t\t(let providedContainer = self.providedRole.providedAssemblyContext.allocationContext.container in (\n\t\t\t\t\tlet requiredContainer = self.requiredRole.requiredAssemblyContext.allocationContext.container in (\n\t\t\t\t\t\tprovidedContainer = requiredContainer or providedContainer.links -&gt; exists(l | l.containers -&gt; includes(requiredContainer))\n\t\t\t\t\t)\n\t\t\t\t))'"
	 * @generated
	 */
	boolean connectedRolesAreInSameContainerOrLinkedContainers(DiagnosticChain diagnostics,
			Map<Object, Object> context);

} // AssemblyConnector
