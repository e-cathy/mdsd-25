/**
 */
package MDSDComponentMetamodel.SystemDependant;

import MDSDComponentMetamodel.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Allocation Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MDSDComponentMetamodel.SystemDependant.AllocationContext#getContainer <em>Container</em>}</li>
 *   <li>{@link MDSDComponentMetamodel.SystemDependant.AllocationContext#getAssemblyContext <em>Assembly Context</em>}</li>
 * </ul>
 *
 * @see MDSDComponentMetamodel.SystemDependant.SystemDependantPackage#getAllocationContext()
 * @model
 * @generated
 */
public interface AllocationContext extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container</em>' reference.
	 * @see #setContainer(Container)
	 * @see MDSDComponentMetamodel.SystemDependant.SystemDependantPackage#getAllocationContext_Container()
	 * @model required="true"
	 * @generated
	 */
	Container getContainer();

	/**
	 * Sets the value of the '{@link MDSDComponentMetamodel.SystemDependant.AllocationContext#getContainer <em>Container</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container</em>' reference.
	 * @see #getContainer()
	 * @generated
	 */
	void setContainer(Container value);

	/**
	 * Returns the value of the '<em><b>Assembly Context</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link MDSDComponentMetamodel.SystemDependant.AssemblyContext#getAllocationContext <em>Allocation Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assembly Context</em>' reference.
	 * @see #setAssemblyContext(AssemblyContext)
	 * @see MDSDComponentMetamodel.SystemDependant.SystemDependantPackage#getAllocationContext_AssemblyContext()
	 * @see MDSDComponentMetamodel.SystemDependant.AssemblyContext#getAllocationContext
	 * @model opposite="allocationContext" required="true"
	 * @generated
	 */
	AssemblyContext getAssemblyContext();

	/**
	 * Sets the value of the '{@link MDSDComponentMetamodel.SystemDependant.AllocationContext#getAssemblyContext <em>Assembly Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assembly Context</em>' reference.
	 * @see #getAssemblyContext()
	 * @generated
	 */
	void setAssemblyContext(AssemblyContext value);

} // AllocationContext
