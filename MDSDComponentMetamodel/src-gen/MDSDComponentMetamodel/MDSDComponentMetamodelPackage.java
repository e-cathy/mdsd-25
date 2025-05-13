/**
 */
package MDSDComponentMetamodel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see MDSDComponentMetamodel.MDSDComponentMetamodelFactory
 * @model kind="package"
 * @generated
 */
public interface MDSDComponentMetamodelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "MDSDComponentMetamodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/MDSDComponentMetamodel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "MDSDComponentMetamodel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MDSDComponentMetamodelPackage eINSTANCE = MDSDComponentMetamodel.impl.MDSDComponentMetamodelPackageImpl.init();

	/**
	 * The meta object id for the '{@link MDSDComponentMetamodel.impl.ComponentSystemImpl <em>Component System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MDSDComponentMetamodel.impl.ComponentSystemImpl
	 * @see MDSDComponentMetamodel.impl.MDSDComponentMetamodelPackageImpl#getComponentSystem()
	 * @generated
	 */
	int COMPONENT_SYSTEM = 0;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_SYSTEM__REPOSITORY = 0;

	/**
	 * The feature id for the '<em><b>System</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_SYSTEM__SYSTEM = 1;

	/**
	 * The number of structural features of the '<em>Component System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_SYSTEM_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Component System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_SYSTEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link MDSDComponentMetamodel.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MDSDComponentMetamodel.impl.NamedElementImpl
	 * @see MDSDComponentMetamodel.impl.MDSDComponentMetamodelPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link MDSDComponentMetamodel.ComponentSystem <em>Component System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component System</em>'.
	 * @see MDSDComponentMetamodel.ComponentSystem
	 * @generated
	 */
	EClass getComponentSystem();

	/**
	 * Returns the meta object for the containment reference list '{@link MDSDComponentMetamodel.ComponentSystem#getRepository <em>Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Repository</em>'.
	 * @see MDSDComponentMetamodel.ComponentSystem#getRepository()
	 * @see #getComponentSystem()
	 * @generated
	 */
	EReference getComponentSystem_Repository();

	/**
	 * Returns the meta object for the containment reference list '{@link MDSDComponentMetamodel.ComponentSystem#getSystem <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>System</em>'.
	 * @see MDSDComponentMetamodel.ComponentSystem#getSystem()
	 * @see #getComponentSystem()
	 * @generated
	 */
	EReference getComponentSystem_System();

	/**
	 * Returns the meta object for class '{@link MDSDComponentMetamodel.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see MDSDComponentMetamodel.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link MDSDComponentMetamodel.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see MDSDComponentMetamodel.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MDSDComponentMetamodelFactory getMDSDComponentMetamodelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link MDSDComponentMetamodel.impl.ComponentSystemImpl <em>Component System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MDSDComponentMetamodel.impl.ComponentSystemImpl
		 * @see MDSDComponentMetamodel.impl.MDSDComponentMetamodelPackageImpl#getComponentSystem()
		 * @generated
		 */
		EClass COMPONENT_SYSTEM = eINSTANCE.getComponentSystem();

		/**
		 * The meta object literal for the '<em><b>Repository</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_SYSTEM__REPOSITORY = eINSTANCE.getComponentSystem_Repository();

		/**
		 * The meta object literal for the '<em><b>System</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_SYSTEM__SYSTEM = eINSTANCE.getComponentSystem_System();

		/**
		 * The meta object literal for the '{@link MDSDComponentMetamodel.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MDSDComponentMetamodel.impl.NamedElementImpl
		 * @see MDSDComponentMetamodel.impl.MDSDComponentMetamodelPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

	}

} //MDSDComponentMetamodelPackage
