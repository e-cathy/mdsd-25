/**
 */
package MDSDComponentMetamodel.SystemIndependant;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Loop</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MDSDComponentMetamodel.SystemIndependant.Loop#getActions <em>Actions</em>}</li>
 *   <li>{@link MDSDComponentMetamodel.SystemIndependant.Loop#getCondition <em>Condition</em>}</li>
 * </ul>
 *
 * @see MDSDComponentMetamodel.SystemIndependant.SystemIndependantPackage#getLoop()
 * @model
 * @generated
 */
public interface Loop extends Action {
	/**
	 * Returns the value of the '<em><b>Actions</b></em>' containment reference list.
	 * The list contents are of type {@link MDSDComponentMetamodel.SystemIndependant.Action}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actions</em>' containment reference list.
	 * @see MDSDComponentMetamodel.SystemIndependant.SystemIndependantPackage#getLoop_Actions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Action> getActions();

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' attribute.
	 * @see #setCondition(String)
	 * @see MDSDComponentMetamodel.SystemIndependant.SystemIndependantPackage#getLoop_Condition()
	 * @model required="true"
	 * @generated
	 */
	String getCondition();

	/**
	 * Sets the value of the '{@link MDSDComponentMetamodel.SystemIndependant.Loop#getCondition <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' attribute.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(String value);

} // Loop
