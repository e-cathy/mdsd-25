/**
 */
package MDSDComponentMetamodel.SystemDependant;

import MDSDComponentMetamodel.NamedElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MDSDComponentMetamodel.SystemDependant.Container#getLinks <em>Links</em>}</li>
 * </ul>
 *
 * @see MDSDComponentMetamodel.SystemDependant.SystemDependantPackage#getContainer()
 * @model
 * @generated
 */
public interface Container extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Links</b></em>' reference list.
	 * The list contents are of type {@link MDSDComponentMetamodel.SystemDependant.Link}.
	 * It is bidirectional and its opposite is '{@link MDSDComponentMetamodel.SystemDependant.Link#getContainers <em>Containers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Links</em>' reference list.
	 * @see MDSDComponentMetamodel.SystemDependant.SystemDependantPackage#getContainer_Links()
	 * @see MDSDComponentMetamodel.SystemDependant.Link#getContainers
	 * @model opposite="containers"
	 * @generated
	 */
	EList<Link> getLinks();

} // Container
