/**
 */
package MDSDComponentMetamodel.SystemIndependant;

import MDSDComponentMetamodel.NamedElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MDSDComponentMetamodel.SystemIndependant.Interface#getSignatures <em>Signatures</em>}</li>
 * </ul>
 *
 * @see MDSDComponentMetamodel.SystemIndependant.SystemIndependantPackage#getInterface()
 * @model
 * @generated
 */
public interface Interface extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Signatures</b></em>' containment reference list.
	 * The list contents are of type {@link MDSDComponentMetamodel.SystemIndependant.Signature}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signatures</em>' containment reference list.
	 * @see MDSDComponentMetamodel.SystemIndependant.SystemIndependantPackage#getInterface_Signatures()
	 * @model containment="true"
	 * @generated
	 */
	EList<Signature> getSignatures();

} // Interface
