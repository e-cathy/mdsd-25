/**
 */
package MDSDComponentMetamodel;

import MDSDComponentMetamodel.SystemIndependant.Repository;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MDSDComponentMetamodel.ComponentSystem#getRepositories <em>Repositories</em>}</li>
 *   <li>{@link MDSDComponentMetamodel.ComponentSystem#getSystems <em>Systems</em>}</li>
 * </ul>
 *
 * @see MDSDComponentMetamodel.MDSDComponentMetamodelPackage#getComponentSystem()
 * @model
 * @generated
 */
public interface ComponentSystem extends EObject {
	/**
	 * Returns the value of the '<em><b>Repositories</b></em>' containment reference list.
	 * The list contents are of type {@link MDSDComponentMetamodel.SystemIndependant.Repository}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repositories</em>' containment reference list.
	 * @see MDSDComponentMetamodel.MDSDComponentMetamodelPackage#getComponentSystem_Repositories()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Repository> getRepositories();

	/**
	 * Returns the value of the '<em><b>Systems</b></em>' containment reference list.
	 * The list contents are of type {@link MDSDComponentMetamodel.SystemDependant.System}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Systems</em>' containment reference list.
	 * @see MDSDComponentMetamodel.MDSDComponentMetamodelPackage#getComponentSystem_Systems()
	 * @model containment="true"
	 * @generated
	 */
	EList<MDSDComponentMetamodel.SystemDependant.System> getSystems();

} // ComponentSystem
