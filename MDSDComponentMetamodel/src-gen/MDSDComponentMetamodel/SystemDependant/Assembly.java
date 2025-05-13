/**
 */
package MDSDComponentMetamodel.SystemDependant;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assembly</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MDSDComponentMetamodel.SystemDependant.Assembly#getAssemblyContexts <em>Assembly Contexts</em>}</li>
 *   <li>{@link MDSDComponentMetamodel.SystemDependant.Assembly#getCompositeComponents <em>Composite Components</em>}</li>
 *   <li>{@link MDSDComponentMetamodel.SystemDependant.Assembly#getAssemblyConnectors <em>Assembly Connectors</em>}</li>
 *   <li>{@link MDSDComponentMetamodel.SystemDependant.Assembly#getDelegationConnectors <em>Delegation Connectors</em>}</li>
 * </ul>
 *
 * @see MDSDComponentMetamodel.SystemDependant.SystemDependantPackage#getAssembly()
 * @model
 * @generated
 */
public interface Assembly extends EObject {
	/**
	 * Returns the value of the '<em><b>Assembly Contexts</b></em>' containment reference list.
	 * The list contents are of type {@link MDSDComponentMetamodel.SystemDependant.AssemblyContext}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assembly Contexts</em>' containment reference list.
	 * @see MDSDComponentMetamodel.SystemDependant.SystemDependantPackage#getAssembly_AssemblyContexts()
	 * @model containment="true"
	 * @generated
	 */
	EList<AssemblyContext> getAssemblyContexts();

	/**
	 * Returns the value of the '<em><b>Composite Components</b></em>' containment reference list.
	 * The list contents are of type {@link MDSDComponentMetamodel.SystemDependant.CompositeComponent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Composite Components</em>' containment reference list.
	 * @see MDSDComponentMetamodel.SystemDependant.SystemDependantPackage#getAssembly_CompositeComponents()
	 * @model containment="true"
	 * @generated
	 */
	EList<CompositeComponent> getCompositeComponents();

	/**
	 * Returns the value of the '<em><b>Assembly Connectors</b></em>' containment reference list.
	 * The list contents are of type {@link MDSDComponentMetamodel.SystemDependant.AssemblyConnector}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assembly Connectors</em>' containment reference list.
	 * @see MDSDComponentMetamodel.SystemDependant.SystemDependantPackage#getAssembly_AssemblyConnectors()
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
	 * @see MDSDComponentMetamodel.SystemDependant.SystemDependantPackage#getAssembly_DelegationConnectors()
	 * @model containment="true"
	 * @generated
	 */
	EList<DelegationConnector> getDelegationConnectors();

} // Assembly
