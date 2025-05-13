/**
 */
package MDSDComponentMetamodel.SystemDependant;

import MDSDComponentMetamodel.SystemIndependant.Interface;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MDSDComponentMetamodel.SystemDependant.System#getInterfaces <em>Interfaces</em>}</li>
 *   <li>{@link MDSDComponentMetamodel.SystemDependant.System#getAssembly <em>Assembly</em>}</li>
 *   <li>{@link MDSDComponentMetamodel.SystemDependant.System#getAllocation <em>Allocation</em>}</li>
 *   <li>{@link MDSDComponentMetamodel.SystemDependant.System#getEnvironment <em>Environment</em>}</li>
 * </ul>
 *
 * @see MDSDComponentMetamodel.SystemDependant.SystemDependantPackage#getSystem()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='delegationConnectorsAreWellFormed'"
 * @generated
 */
public interface System extends EObject {
	/**
	 * Returns the value of the '<em><b>Interfaces</b></em>' reference list.
	 * The list contents are of type {@link MDSDComponentMetamodel.SystemIndependant.Interface}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interfaces</em>' reference list.
	 * @see MDSDComponentMetamodel.SystemDependant.SystemDependantPackage#getSystem_Interfaces()
	 * @model required="true"
	 * @generated
	 */
	EList<Interface> getInterfaces();

	/**
	 * Returns the value of the '<em><b>Assembly</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assembly</em>' containment reference.
	 * @see #setAssembly(Assembly)
	 * @see MDSDComponentMetamodel.SystemDependant.SystemDependantPackage#getSystem_Assembly()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Assembly getAssembly();

	/**
	 * Sets the value of the '{@link MDSDComponentMetamodel.SystemDependant.System#getAssembly <em>Assembly</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assembly</em>' containment reference.
	 * @see #getAssembly()
	 * @generated
	 */
	void setAssembly(Assembly value);

	/**
	 * Returns the value of the '<em><b>Allocation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allocation</em>' containment reference.
	 * @see #setAllocation(Allocation)
	 * @see MDSDComponentMetamodel.SystemDependant.SystemDependantPackage#getSystem_Allocation()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Allocation getAllocation();

	/**
	 * Sets the value of the '{@link MDSDComponentMetamodel.SystemDependant.System#getAllocation <em>Allocation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allocation</em>' containment reference.
	 * @see #getAllocation()
	 * @generated
	 */
	void setAllocation(Allocation value);

	/**
	 * Returns the value of the '<em><b>Environment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Environment</em>' containment reference.
	 * @see #setEnvironment(Environment)
	 * @see MDSDComponentMetamodel.SystemDependant.SystemDependantPackage#getSystem_Environment()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Environment getEnvironment();

	/**
	 * Sets the value of the '{@link MDSDComponentMetamodel.SystemDependant.System#getEnvironment <em>Environment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Environment</em>' containment reference.
	 * @see #getEnvironment()
	 * @generated
	 */
	void setEnvironment(Environment value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.interfaces -&gt; forAll(i |\n        \t\tself.assembly.delegationConnectors -&gt; exists(dc | dc.delegatedInterface = i)\n        \t)'"
	 * @generated
	 */
	boolean delegationConnectorsForProvidedInterfacesOfSystemExist(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.assembly.delegationConnectors -&gt; forAll(dc | \n            \t(self.interfaces -&gt; includes(dc.delegatedInterface) and self.assembly.assemblyContexts-&gt;exists(ac | \n                \tac.providedRoles -&gt; includes(dc.role)))\n            )'"
	 * @generated
	 */
	boolean delegationConnectorsAreWellFormed(DiagnosticChain diagnostics, Map<Object, Object> context);

} // System
