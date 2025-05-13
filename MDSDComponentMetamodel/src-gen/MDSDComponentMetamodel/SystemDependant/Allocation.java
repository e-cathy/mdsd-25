/**
 */
package MDSDComponentMetamodel.SystemDependant;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Allocation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MDSDComponentMetamodel.SystemDependant.Allocation#getAllocationContexts <em>Allocation Contexts</em>}</li>
 * </ul>
 *
 * @see MDSDComponentMetamodel.SystemDependant.SystemDependantPackage#getAllocation()
 * @model
 * @generated
 */
public interface Allocation extends EObject {
	/**
	 * Returns the value of the '<em><b>Allocation Contexts</b></em>' containment reference list.
	 * The list contents are of type {@link MDSDComponentMetamodel.SystemDependant.AllocationContext}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allocation Contexts</em>' containment reference list.
	 * @see MDSDComponentMetamodel.SystemDependant.SystemDependantPackage#getAllocation_AllocationContexts()
	 * @model containment="true"
	 * @generated
	 */
	EList<AllocationContext> getAllocationContexts();

} // Allocation
