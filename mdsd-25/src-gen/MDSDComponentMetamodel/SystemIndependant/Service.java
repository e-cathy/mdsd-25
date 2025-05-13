/**
 */
package MDSDComponentMetamodel.SystemIndependant;

import MDSDComponentMetamodel.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MDSDComponentMetamodel.SystemIndependant.Service#getCorrespondingSignature <em>Corresponding Signature</em>}</li>
 * </ul>
 *
 * @see MDSDComponentMetamodel.SystemIndependant.SystemIndependantPackage#getService()
 * @model
 * @generated
 */
public interface Service extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Corresponding Signature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Corresponding Signature</em>' reference.
	 * @see #setCorrespondingSignature(Signature)
	 * @see MDSDComponentMetamodel.SystemIndependant.SystemIndependantPackage#getService_CorrespondingSignature()
	 * @model required="true"
	 * @generated
	 */
	Signature getCorrespondingSignature();

	/**
	 * Sets the value of the '{@link MDSDComponentMetamodel.SystemIndependant.Service#getCorrespondingSignature <em>Corresponding Signature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Corresponding Signature</em>' reference.
	 * @see #getCorrespondingSignature()
	 * @generated
	 */
	void setCorrespondingSignature(Signature value);

} // Service
