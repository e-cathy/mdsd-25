/**
 */
package MDSDComponentMetamodel.SystemIndependant;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Complex Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MDSDComponentMetamodel.SystemIndependant.ComplexType#getType <em>Type</em>}</li>
 *   <li>{@link MDSDComponentMetamodel.SystemIndependant.ComplexType#getAttributes <em>Attributes</em>}</li>
 * </ul>
 *
 * @see MDSDComponentMetamodel.SystemIndependant.SystemIndependantPackage#getComplexType()
 * @model
 * @generated
 */
public interface ComplexType extends Type {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(Class)
	 * @see MDSDComponentMetamodel.SystemIndependant.SystemIndependantPackage#getComplexType_Type()
	 * @model required="true"
	 * @generated
	 */
	Class<?> getType();

	/**
	 * Sets the value of the '{@link MDSDComponentMetamodel.SystemIndependant.ComplexType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(Class<?> value);

	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link MDSDComponentMetamodel.SystemIndependant.Parameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference list.
	 * @see MDSDComponentMetamodel.SystemIndependant.SystemIndependantPackage#getComplexType_Attributes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parameter> getAttributes();

} // ComplexType
