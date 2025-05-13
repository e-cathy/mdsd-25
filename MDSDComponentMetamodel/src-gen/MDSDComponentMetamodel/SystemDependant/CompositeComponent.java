/**
 */
package MDSDComponentMetamodel.SystemDependant;

import MDSDComponentMetamodel.SystemIndependant.Component;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composite Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MDSDComponentMetamodel.SystemDependant.CompositeComponent#getAssemblyContexts <em>Assembly Contexts</em>}</li>
 *   <li>{@link MDSDComponentMetamodel.SystemDependant.CompositeComponent#getAssemblyConnectors <em>Assembly Connectors</em>}</li>
 *   <li>{@link MDSDComponentMetamodel.SystemDependant.CompositeComponent#getDelegationConnectors <em>Delegation Connectors</em>}</li>
 * </ul>
 *
 * @see MDSDComponentMetamodel.SystemDependant.SystemDependantPackage#getCompositeComponent()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='composedAssemblyContextsAreNotAllocated'"
 * @generated
 */
public interface CompositeComponent extends Component {
	/**
	 * Returns the value of the '<em><b>Assembly Contexts</b></em>' containment reference list.
	 * The list contents are of type {@link MDSDComponentMetamodel.SystemDependant.AssemblyContext}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assembly Contexts</em>' containment reference list.
	 * @see MDSDComponentMetamodel.SystemDependant.SystemDependantPackage#getCompositeComponent_AssemblyContexts()
	 * @model containment="true" lower="2"
	 * @generated
	 */
	EList<AssemblyContext> getAssemblyContexts();

	/**
	 * Returns the value of the '<em><b>Assembly Connectors</b></em>' containment reference list.
	 * The list contents are of type {@link MDSDComponentMetamodel.SystemDependant.AssemblyConnector}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assembly Connectors</em>' containment reference list.
	 * @see MDSDComponentMetamodel.SystemDependant.SystemDependantPackage#getCompositeComponent_AssemblyConnectors()
	 * @model containment="true"
	 * @generated
	 */
	EList<AssemblyConnector> getAssemblyConnectors();

	/**
	 * Returns the value of the '<em><b>Delegation Connectors</b></em>' containment reference list.
	 * The list contents are of type {@link MDSDComponentMetamodel.SystemDependant.DelegationConnector}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delegation Connectors</em>' containment reference list.
	 * @see MDSDComponentMetamodel.SystemDependant.SystemDependantPackage#getCompositeComponent_DelegationConnectors()
	 * @model containment="true"
	 * @generated
	 */
	EList<DelegationConnector> getDelegationConnectors();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.providedInterfaces -&gt; forAll(i |\n        \t\tself.delegationConnectors -&gt; exists(dc | dc.delegatedInterface = i)\n        \t)'"
	 * @generated
	 */
	boolean delegationConnectorsForProvidedInterfacesOfCompositeComponentsExist(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.assemblyContexts -&gt; forAll(a | a.component &lt;&gt; self)'"
	 * @generated
	 */
	boolean noCircularDependencyInAssemblyContextHierarchy(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.delegationConnectors -&gt; forAll(dc | \n            \t(self.providedInterfaces -&gt; includes(dc.delegatedInterface) and self.assemblyContexts-&gt;exists(ac | \n                \tac.providedRoles -&gt; includes(dc.role)))\n                \tor \n                \t(self.requiredInterfaces -&gt; includes(dc.delegatedInterface) and self.assemblyContexts -&gt; exists(ac | \n                    \tac.requiredRoles -&gt; includes(dc.role)))\n            )'"
	 * @generated
	 */
	boolean delegationConnectorsAreWellFormed(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.assemblyContexts -&gt; forAll(a | a.allocationContext.oclIsUndefined())'"
	 * @generated
	 */
	boolean composedAssemblyContextsAreNotAllocated(DiagnosticChain diagnostics, Map<Object, Object> context);

} // CompositeComponent
