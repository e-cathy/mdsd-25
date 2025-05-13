/**
 */
package MDSDComponentMetamodel.SystemIndependant;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MDSDComponentMetamodel.SystemIndependant.SimpleType#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see MDSDComponentMetamodel.SystemIndependant.SystemIndependantPackage#getSimpleType()
 * @model
 * @generated
 */
public interface SimpleType extends Type {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link MDSDComponentMetamodel.SystemIndependant.SimpleTypeEnum}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see MDSDComponentMetamodel.SystemIndependant.SimpleTypeEnum
	 * @see #setType(SimpleTypeEnum)
	 * @see MDSDComponentMetamodel.SystemIndependant.SystemIndependantPackage#getSimpleType_Type()
	 * @model required="true"
	 * @generated
	 */
	SimpleTypeEnum getType();

	/**
	 * Sets the value of the '{@link MDSDComponentMetamodel.SystemIndependant.SimpleType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see MDSDComponentMetamodel.SystemIndependant.SimpleTypeEnum
	 * @see #getType()
	 * @generated
	 */
	void setType(SimpleTypeEnum value);

} // SimpleType
