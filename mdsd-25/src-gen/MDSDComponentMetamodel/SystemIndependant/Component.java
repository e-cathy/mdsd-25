/**
 */
package MDSDComponentMetamodel.SystemIndependant;

import MDSDComponentMetamodel.NamedElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MDSDComponentMetamodel.SystemIndependant.Component#getProvidedInterfaces <em>Provided Interfaces</em>}</li>
 *   <li>{@link MDSDComponentMetamodel.SystemIndependant.Component#getProvidedServices <em>Provided Services</em>}</li>
 *   <li>{@link MDSDComponentMetamodel.SystemIndependant.Component#getRequiredInterfaces <em>Required Interfaces</em>}</li>
 *   <li>{@link MDSDComponentMetamodel.SystemIndependant.Component#getBehaviorDescription <em>Behavior Description</em>}</li>
 * </ul>
 *
 * @see MDSDComponentMetamodel.SystemIndependant.SystemIndependantPackage#getComponent()
 * @model abstract="true"
 * @generated
 */
public interface Component extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Provided Interfaces</b></em>' reference list.
	 * The list contents are of type {@link MDSDComponentMetamodel.SystemIndependant.Interface}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provided Interfaces</em>' reference list.
	 * @see MDSDComponentMetamodel.SystemIndependant.SystemIndependantPackage#getComponent_ProvidedInterfaces()
	 * @model
	 * @generated
	 */
	EList<Interface> getProvidedInterfaces();

	/**
	 * Returns the value of the '<em><b>Provided Services</b></em>' containment reference list.
	 * The list contents are of type {@link MDSDComponentMetamodel.SystemIndependant.Service}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provided Services</em>' containment reference list.
	 * @see MDSDComponentMetamodel.SystemIndependant.SystemIndependantPackage#getComponent_ProvidedServices()
	 * @model containment="true"
	 * @generated
	 */
	EList<Service> getProvidedServices();

	/**
	 * Returns the value of the '<em><b>Required Interfaces</b></em>' reference list.
	 * The list contents are of type {@link MDSDComponentMetamodel.SystemIndependant.Interface}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Interfaces</em>' reference list.
	 * @see MDSDComponentMetamodel.SystemIndependant.SystemIndependantPackage#getComponent_RequiredInterfaces()
	 * @model
	 * @generated
	 */
	EList<Interface> getRequiredInterfaces();

	/**
	 * Returns the value of the '<em><b>Behavior Description</b></em>' containment reference list.
	 * The list contents are of type {@link MDSDComponentMetamodel.SystemIndependant.Action}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Behavior Description</em>' containment reference list.
	 * @see MDSDComponentMetamodel.SystemIndependant.SystemIndependantPackage#getComponent_BehaviorDescription()
	 * @model containment="true"
	 * @generated
	 */
	EList<Action> getBehaviorDescription();

} // Component
