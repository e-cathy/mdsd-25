/**
 */
package MDSDComponentMetamodel.SystemDependant;

import MDSDComponentMetamodel.NamedElement;

import MDSDComponentMetamodel.SystemIndependant.Component;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assembly Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MDSDComponentMetamodel.SystemDependant.AssemblyContext#getComponent <em>Component</em>}</li>
 *   <li>{@link MDSDComponentMetamodel.SystemDependant.AssemblyContext#getProvidedRoles <em>Provided Roles</em>}</li>
 *   <li>{@link MDSDComponentMetamodel.SystemDependant.AssemblyContext#getRequiredRoles <em>Required Roles</em>}</li>
 *   <li>{@link MDSDComponentMetamodel.SystemDependant.AssemblyContext#getAllocationContext <em>Allocation Context</em>}</li>
 * </ul>
 *
 * @see MDSDComponentMetamodel.SystemDependant.SystemDependantPackage#getAssemblyContext()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='requiredInterfacesMatch'"
 * @generated
 */
public interface AssemblyContext extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component</em>' reference.
	 * @see #setComponent(Component)
	 * @see MDSDComponentMetamodel.SystemDependant.SystemDependantPackage#getAssemblyContext_Component()
	 * @model required="true"
	 * @generated
	 */
	Component getComponent();

	/**
	 * Sets the value of the '{@link MDSDComponentMetamodel.SystemDependant.AssemblyContext#getComponent <em>Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component</em>' reference.
	 * @see #getComponent()
	 * @generated
	 */
	void setComponent(Component value);

	/**
	 * Returns the value of the '<em><b>Provided Roles</b></em>' containment reference list.
	 * The list contents are of type {@link MDSDComponentMetamodel.SystemDependant.Role}.
	 * It is bidirectional and its opposite is '{@link MDSDComponentMetamodel.SystemDependant.Role#getProvidedAssemblyContext <em>Provided Assembly Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provided Roles</em>' containment reference list.
	 * @see MDSDComponentMetamodel.SystemDependant.SystemDependantPackage#getAssemblyContext_ProvidedRoles()
	 * @see MDSDComponentMetamodel.SystemDependant.Role#getProvidedAssemblyContext
	 * @model opposite="providedAssemblyContext" containment="true"
	 * @generated
	 */
	EList<Role> getProvidedRoles();

	/**
	 * Returns the value of the '<em><b>Required Roles</b></em>' containment reference list.
	 * The list contents are of type {@link MDSDComponentMetamodel.SystemDependant.Role}.
	 * It is bidirectional and its opposite is '{@link MDSDComponentMetamodel.SystemDependant.Role#getRequiredAssemblyContext <em>Required Assembly Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Roles</em>' containment reference list.
	 * @see MDSDComponentMetamodel.SystemDependant.SystemDependantPackage#getAssemblyContext_RequiredRoles()
	 * @see MDSDComponentMetamodel.SystemDependant.Role#getRequiredAssemblyContext
	 * @model opposite="requiredAssemblyContext" containment="true"
	 * @generated
	 */
	EList<Role> getRequiredRoles();

	/**
	 * Returns the value of the '<em><b>Allocation Context</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link MDSDComponentMetamodel.SystemDependant.AllocationContext#getAssemblyContext <em>Assembly Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allocation Context</em>' reference.
	 * @see #setAllocationContext(AllocationContext)
	 * @see MDSDComponentMetamodel.SystemDependant.SystemDependantPackage#getAssemblyContext_AllocationContext()
	 * @see MDSDComponentMetamodel.SystemDependant.AllocationContext#getAssemblyContext
	 * @model opposite="assemblyContext"
	 * @generated
	 */
	AllocationContext getAllocationContext();

	/**
	 * Sets the value of the '{@link MDSDComponentMetamodel.SystemDependant.AssemblyContext#getAllocationContext <em>Allocation Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allocation Context</em>' reference.
	 * @see #getAllocationContext()
	 * @generated
	 */
	void setAllocationContext(AllocationContext value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.providedRoles-&gt;forAll(r | self.component.providedInterfaces-&gt;includes(r.interface))'"
	 * @generated
	 */
	boolean providedInterfacesMatch(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.requiredRoles-&gt;forAll(r | self.component.requiredInterfaces-&gt;includes(r.interface))'"
	 * @generated
	 */
	boolean requiredInterfacesMatch(DiagnosticChain diagnostics, Map<Object, Object> context);

} // AssemblyContext
