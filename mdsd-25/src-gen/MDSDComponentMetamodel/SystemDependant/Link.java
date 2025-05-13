/**
 */
package MDSDComponentMetamodel.SystemDependant;

import MDSDComponentMetamodel.NamedElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MDSDComponentMetamodel.SystemDependant.Link#getContainers <em>Containers</em>}</li>
 * </ul>
 *
 * @see MDSDComponentMetamodel.SystemDependant.SystemDependantPackage#getLink()
 * @model
 * @generated
 */
public interface Link extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Containers</b></em>' reference list.
	 * The list contents are of type {@link MDSDComponentMetamodel.SystemDependant.Container}.
	 * It is bidirectional and its opposite is '{@link MDSDComponentMetamodel.SystemDependant.Container#getLinks <em>Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containers</em>' reference list.
	 * @see MDSDComponentMetamodel.SystemDependant.SystemDependantPackage#getLink_Containers()
	 * @see MDSDComponentMetamodel.SystemDependant.Container#getLinks
	 * @model opposite="links" lower="2"
	 * @generated
	 */
	EList<Container> getContainers();

} // Link
