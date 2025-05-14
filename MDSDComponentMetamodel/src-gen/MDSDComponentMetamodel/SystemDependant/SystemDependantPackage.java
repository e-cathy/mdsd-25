/**
 */
package MDSDComponentMetamodel.SystemDependant;

import MDSDComponentMetamodel.MDSDComponentMetamodelPackage;

import MDSDComponentMetamodel.SystemIndependant.SystemIndependantPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
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
 * @see MDSDComponentMetamodel.SystemDependant.SystemDependantFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore"
 * @generated
 */
public interface SystemDependantPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "SystemDependant";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/SystemDependant";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "SystemDependant";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SystemDependantPackage eINSTANCE = MDSDComponentMetamodel.SystemDependant.impl.SystemDependantPackageImpl.init();

	/**
	 * The meta object id for the '{@link MDSDComponentMetamodel.SystemDependant.impl.CompositeComponentImpl <em>Composite Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MDSDComponentMetamodel.SystemDependant.impl.CompositeComponentImpl
	 * @see MDSDComponentMetamodel.SystemDependant.impl.SystemDependantPackageImpl#getCompositeComponent()
	 * @generated
	 */
	int COMPOSITE_COMPONENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_COMPONENT__NAME = SystemIndependantPackage.COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Provided Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_COMPONENT__PROVIDED_INTERFACES = SystemIndependantPackage.COMPONENT__PROVIDED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Provided Services</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_COMPONENT__PROVIDED_SERVICES = SystemIndependantPackage.COMPONENT__PROVIDED_SERVICES;

	/**
	 * The feature id for the '<em><b>Required Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_COMPONENT__REQUIRED_INTERFACES = SystemIndependantPackage.COMPONENT__REQUIRED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Behavior Description</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_COMPONENT__BEHAVIOR_DESCRIPTION = SystemIndependantPackage.COMPONENT__BEHAVIOR_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Assembly Contexts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_COMPONENT__ASSEMBLY_CONTEXTS = SystemIndependantPackage.COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Assembly Connectors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_COMPONENT__ASSEMBLY_CONNECTORS = SystemIndependantPackage.COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Delegation Connectors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_COMPONENT__DELEGATION_CONNECTORS = SystemIndependantPackage.COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Composite Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_COMPONENT_FEATURE_COUNT = SystemIndependantPackage.COMPONENT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Delegation Connectors For Provided Interfaces Of Composite Components Exist</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_COMPONENT___DELEGATION_CONNECTORS_FOR_PROVIDED_INTERFACES_OF_COMPOSITE_COMPONENTS_EXIST__DIAGNOSTICCHAIN_MAP = SystemIndependantPackage.COMPONENT_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>No Circular Dependency In Assembly Context Hierarchy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_COMPONENT___NO_CIRCULAR_DEPENDENCY_IN_ASSEMBLY_CONTEXT_HIERARCHY__DIAGNOSTICCHAIN_MAP = SystemIndependantPackage.COMPONENT_OPERATION_COUNT
			+ 1;

	/**
	 * The operation id for the '<em>Delegation Connectors Are Well Formed</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_COMPONENT___DELEGATION_CONNECTORS_ARE_WELL_FORMED__DIAGNOSTICCHAIN_MAP = SystemIndependantPackage.COMPONENT_OPERATION_COUNT
			+ 2;

	/**
	 * The operation id for the '<em>Composed Assembly Contexts Are Not Allocated</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_COMPONENT___COMPOSED_ASSEMBLY_CONTEXTS_ARE_NOT_ALLOCATED__DIAGNOSTICCHAIN_MAP = SystemIndependantPackage.COMPONENT_OPERATION_COUNT
			+ 3;

	/**
	 * The number of operations of the '<em>Composite Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_COMPONENT_OPERATION_COUNT = SystemIndependantPackage.COMPONENT_OPERATION_COUNT + 4;

	/**
	 * The meta object id for the '{@link MDSDComponentMetamodel.SystemDependant.impl.SystemImpl <em>System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MDSDComponentMetamodel.SystemDependant.impl.SystemImpl
	 * @see MDSDComponentMetamodel.SystemDependant.impl.SystemDependantPackageImpl#getSystem()
	 * @generated
	 */
	int SYSTEM = 1;

	/**
	 * The feature id for the '<em><b>Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__INTERFACES = 0;

	/**
	 * The feature id for the '<em><b>Assembly</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__ASSEMBLY = 1;

	/**
	 * The feature id for the '<em><b>Allocation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__ALLOCATION = 2;

	/**
	 * The feature id for the '<em><b>Environment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__ENVIRONMENT = 3;

	/**
	 * The number of structural features of the '<em>System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>Delegation Connectors For Provided Interfaces Of System Exist</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM___DELEGATION_CONNECTORS_FOR_PROVIDED_INTERFACES_OF_SYSTEM_EXIST__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The operation id for the '<em>Delegation Connectors Are Well Formed</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM___DELEGATION_CONNECTORS_ARE_WELL_FORMED__DIAGNOSTICCHAIN_MAP = 1;

	/**
	 * The number of operations of the '<em>System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link MDSDComponentMetamodel.SystemDependant.impl.RoleImpl <em>Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MDSDComponentMetamodel.SystemDependant.impl.RoleImpl
	 * @see MDSDComponentMetamodel.SystemDependant.impl.SystemDependantPackageImpl#getRole()
	 * @generated
	 */
	int ROLE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__NAME = MDSDComponentMetamodelPackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__INTERFACE = MDSDComponentMetamodelPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Provided Assembly Context</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__PROVIDED_ASSEMBLY_CONTEXT = MDSDComponentMetamodelPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Required Assembly Context</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__REQUIRED_ASSEMBLY_CONTEXT = MDSDComponentMetamodelPackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FEATURE_COUNT = MDSDComponentMetamodelPackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_OPERATION_COUNT = MDSDComponentMetamodelPackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MDSDComponentMetamodel.SystemDependant.impl.AssemblyImpl <em>Assembly</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MDSDComponentMetamodel.SystemDependant.impl.AssemblyImpl
	 * @see MDSDComponentMetamodel.SystemDependant.impl.SystemDependantPackageImpl#getAssembly()
	 * @generated
	 */
	int ASSEMBLY = 3;

	/**
	 * The feature id for the '<em><b>Assembly Contexts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY__ASSEMBLY_CONTEXTS = 0;

	/**
	 * The feature id for the '<em><b>Composite Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY__COMPOSITE_COMPONENTS = 1;

	/**
	 * The feature id for the '<em><b>Assembly Connectors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY__ASSEMBLY_CONNECTORS = 2;

	/**
	 * The feature id for the '<em><b>Delegation Connectors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY__DELEGATION_CONNECTORS = 3;

	/**
	 * The number of structural features of the '<em>Assembly</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Assembly</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link MDSDComponentMetamodel.SystemDependant.impl.AssemblyConnectorImpl <em>Assembly Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MDSDComponentMetamodel.SystemDependant.impl.AssemblyConnectorImpl
	 * @see MDSDComponentMetamodel.SystemDependant.impl.SystemDependantPackageImpl#getAssemblyConnector()
	 * @generated
	 */
	int ASSEMBLY_CONNECTOR = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_CONNECTOR__NAME = MDSDComponentMetamodelPackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Provided Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_CONNECTOR__PROVIDED_ROLE = MDSDComponentMetamodelPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Required Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_CONNECTOR__REQUIRED_ROLE = MDSDComponentMetamodelPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Assembly Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_CONNECTOR_FEATURE_COUNT = MDSDComponentMetamodelPackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Provided Or Required Matches</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_CONNECTOR___PROVIDED_OR_REQUIRED_MATCHES__DIAGNOSTICCHAIN_MAP = MDSDComponentMetamodelPackage.NAMED_ELEMENT_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Connected Roles Are In Same Container Or Linked Containers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_CONNECTOR___CONNECTED_ROLES_ARE_IN_SAME_CONTAINER_OR_LINKED_CONTAINERS__DIAGNOSTICCHAIN_MAP = MDSDComponentMetamodelPackage.NAMED_ELEMENT_OPERATION_COUNT
			+ 1;

	/**
	 * The number of operations of the '<em>Assembly Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_CONNECTOR_OPERATION_COUNT = MDSDComponentMetamodelPackage.NAMED_ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link MDSDComponentMetamodel.SystemDependant.impl.AssemblyContextImpl <em>Assembly Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MDSDComponentMetamodel.SystemDependant.impl.AssemblyContextImpl
	 * @see MDSDComponentMetamodel.SystemDependant.impl.SystemDependantPackageImpl#getAssemblyContext()
	 * @generated
	 */
	int ASSEMBLY_CONTEXT = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_CONTEXT__NAME = MDSDComponentMetamodelPackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_CONTEXT__COMPONENT = MDSDComponentMetamodelPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Provided Roles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_CONTEXT__PROVIDED_ROLES = MDSDComponentMetamodelPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Required Roles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_CONTEXT__REQUIRED_ROLES = MDSDComponentMetamodelPackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Allocation Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_CONTEXT__ALLOCATION_CONTEXT = MDSDComponentMetamodelPackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Assembly Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_CONTEXT_FEATURE_COUNT = MDSDComponentMetamodelPackage.NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Provided Interfaces Match</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_CONTEXT___PROVIDED_INTERFACES_MATCH__DIAGNOSTICCHAIN_MAP = MDSDComponentMetamodelPackage.NAMED_ELEMENT_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Required Interfaces Match</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_CONTEXT___REQUIRED_INTERFACES_MATCH__DIAGNOSTICCHAIN_MAP = MDSDComponentMetamodelPackage.NAMED_ELEMENT_OPERATION_COUNT
			+ 1;

	/**
	 * The number of operations of the '<em>Assembly Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_CONTEXT_OPERATION_COUNT = MDSDComponentMetamodelPackage.NAMED_ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link MDSDComponentMetamodel.SystemDependant.impl.AllocationImpl <em>Allocation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MDSDComponentMetamodel.SystemDependant.impl.AllocationImpl
	 * @see MDSDComponentMetamodel.SystemDependant.impl.SystemDependantPackageImpl#getAllocation()
	 * @generated
	 */
	int ALLOCATION = 6;

	/**
	 * The feature id for the '<em><b>Allocation Contexts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATION__ALLOCATION_CONTEXTS = 0;

	/**
	 * The number of structural features of the '<em>Allocation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Allocation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link MDSDComponentMetamodel.SystemDependant.impl.ContainerImpl <em>Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MDSDComponentMetamodel.SystemDependant.impl.ContainerImpl
	 * @see MDSDComponentMetamodel.SystemDependant.impl.SystemDependantPackageImpl#getContainer()
	 * @generated
	 */
	int CONTAINER = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__NAME = MDSDComponentMetamodelPackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__LINKS = MDSDComponentMetamodelPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_FEATURE_COUNT = MDSDComponentMetamodelPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_OPERATION_COUNT = MDSDComponentMetamodelPackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MDSDComponentMetamodel.SystemDependant.impl.EnvironmentImpl <em>Environment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MDSDComponentMetamodel.SystemDependant.impl.EnvironmentImpl
	 * @see MDSDComponentMetamodel.SystemDependant.impl.SystemDependantPackageImpl#getEnvironment()
	 * @generated
	 */
	int ENVIRONMENT = 8;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT__LINKS = 0;

	/**
	 * The feature id for the '<em><b>Containers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT__CONTAINERS = 1;

	/**
	 * The number of structural features of the '<em>Environment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Environment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link MDSDComponentMetamodel.SystemDependant.impl.LinkImpl <em>Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MDSDComponentMetamodel.SystemDependant.impl.LinkImpl
	 * @see MDSDComponentMetamodel.SystemDependant.impl.SystemDependantPackageImpl#getLink()
	 * @generated
	 */
	int LINK = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__NAME = MDSDComponentMetamodelPackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Containers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__CONTAINERS = MDSDComponentMetamodelPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_FEATURE_COUNT = MDSDComponentMetamodelPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_OPERATION_COUNT = MDSDComponentMetamodelPackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MDSDComponentMetamodel.SystemDependant.impl.AllocationContextImpl <em>Allocation Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MDSDComponentMetamodel.SystemDependant.impl.AllocationContextImpl
	 * @see MDSDComponentMetamodel.SystemDependant.impl.SystemDependantPackageImpl#getAllocationContext()
	 * @generated
	 */
	int ALLOCATION_CONTEXT = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATION_CONTEXT__NAME = MDSDComponentMetamodelPackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATION_CONTEXT__CONTAINER = MDSDComponentMetamodelPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Assembly Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATION_CONTEXT__ASSEMBLY_CONTEXT = MDSDComponentMetamodelPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Allocation Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATION_CONTEXT_FEATURE_COUNT = MDSDComponentMetamodelPackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Allocation Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATION_CONTEXT_OPERATION_COUNT = MDSDComponentMetamodelPackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MDSDComponentMetamodel.SystemDependant.impl.DelegationConnectorImpl <em>Delegation Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MDSDComponentMetamodel.SystemDependant.impl.DelegationConnectorImpl
	 * @see MDSDComponentMetamodel.SystemDependant.impl.SystemDependantPackageImpl#getDelegationConnector()
	 * @generated
	 */
	int DELEGATION_CONNECTOR = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_CONNECTOR__NAME = MDSDComponentMetamodelPackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_CONNECTOR__ROLE = MDSDComponentMetamodelPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Delegated Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_CONNECTOR__DELEGATED_INTERFACE = MDSDComponentMetamodelPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Delegation Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_CONNECTOR_FEATURE_COUNT = MDSDComponentMetamodelPackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Delegation Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_CONNECTOR_OPERATION_COUNT = MDSDComponentMetamodelPackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link MDSDComponentMetamodel.SystemDependant.CompositeComponent <em>Composite Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite Component</em>'.
	 * @see MDSDComponentMetamodel.SystemDependant.CompositeComponent
	 * @generated
	 */
	EClass getCompositeComponent();

	/**
	 * Returns the meta object for the containment reference list '{@link MDSDComponentMetamodel.SystemDependant.CompositeComponent#getAssemblyContexts <em>Assembly Contexts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Assembly Contexts</em>'.
	 * @see MDSDComponentMetamodel.SystemDependant.CompositeComponent#getAssemblyContexts()
	 * @see #getCompositeComponent()
	 * @generated
	 */
	EReference getCompositeComponent_AssemblyContexts();

	/**
	 * Returns the meta object for the containment reference list '{@link MDSDComponentMetamodel.SystemDependant.CompositeComponent#getAssemblyConnectors <em>Assembly Connectors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Assembly Connectors</em>'.
	 * @see MDSDComponentMetamodel.SystemDependant.CompositeComponent#getAssemblyConnectors()
	 * @see #getCompositeComponent()
	 * @generated
	 */
	EReference getCompositeComponent_AssemblyConnectors();

	/**
	 * Returns the meta object for the containment reference list '{@link MDSDComponentMetamodel.SystemDependant.CompositeComponent#getDelegationConnectors <em>Delegation Connectors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Delegation Connectors</em>'.
	 * @see MDSDComponentMetamodel.SystemDependant.CompositeComponent#getDelegationConnectors()
	 * @see #getCompositeComponent()
	 * @generated
	 */
	EReference getCompositeComponent_DelegationConnectors();

	/**
	 * Returns the meta object for the '{@link MDSDComponentMetamodel.SystemDependant.CompositeComponent#delegationConnectorsForProvidedInterfacesOfCompositeComponentsExist(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Delegation Connectors For Provided Interfaces Of Composite Components Exist</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Delegation Connectors For Provided Interfaces Of Composite Components Exist</em>' operation.
	 * @see MDSDComponentMetamodel.SystemDependant.CompositeComponent#delegationConnectorsForProvidedInterfacesOfCompositeComponentsExist(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getCompositeComponent__DelegationConnectorsForProvidedInterfacesOfCompositeComponentsExist__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link MDSDComponentMetamodel.SystemDependant.CompositeComponent#noCircularDependencyInAssemblyContextHierarchy(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>No Circular Dependency In Assembly Context Hierarchy</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>No Circular Dependency In Assembly Context Hierarchy</em>' operation.
	 * @see MDSDComponentMetamodel.SystemDependant.CompositeComponent#noCircularDependencyInAssemblyContextHierarchy(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getCompositeComponent__NoCircularDependencyInAssemblyContextHierarchy__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link MDSDComponentMetamodel.SystemDependant.CompositeComponent#delegationConnectorsAreWellFormed(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Delegation Connectors Are Well Formed</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Delegation Connectors Are Well Formed</em>' operation.
	 * @see MDSDComponentMetamodel.SystemDependant.CompositeComponent#delegationConnectorsAreWellFormed(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getCompositeComponent__DelegationConnectorsAreWellFormed__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link MDSDComponentMetamodel.SystemDependant.CompositeComponent#composedAssemblyContextsAreNotAllocated(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Composed Assembly Contexts Are Not Allocated</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Composed Assembly Contexts Are Not Allocated</em>' operation.
	 * @see MDSDComponentMetamodel.SystemDependant.CompositeComponent#composedAssemblyContextsAreNotAllocated(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getCompositeComponent__ComposedAssemblyContextsAreNotAllocated__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link MDSDComponentMetamodel.SystemDependant.System <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System</em>'.
	 * @see MDSDComponentMetamodel.SystemDependant.System
	 * @generated
	 */
	EClass getSystem();

	/**
	 * Returns the meta object for the reference list '{@link MDSDComponentMetamodel.SystemDependant.System#getInterfaces <em>Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Interfaces</em>'.
	 * @see MDSDComponentMetamodel.SystemDependant.System#getInterfaces()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_Interfaces();

	/**
	 * Returns the meta object for the containment reference '{@link MDSDComponentMetamodel.SystemDependant.System#getAssembly <em>Assembly</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Assembly</em>'.
	 * @see MDSDComponentMetamodel.SystemDependant.System#getAssembly()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_Assembly();

	/**
	 * Returns the meta object for the containment reference '{@link MDSDComponentMetamodel.SystemDependant.System#getAllocation <em>Allocation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Allocation</em>'.
	 * @see MDSDComponentMetamodel.SystemDependant.System#getAllocation()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_Allocation();

	/**
	 * Returns the meta object for the containment reference '{@link MDSDComponentMetamodel.SystemDependant.System#getEnvironment <em>Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Environment</em>'.
	 * @see MDSDComponentMetamodel.SystemDependant.System#getEnvironment()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_Environment();

	/**
	 * Returns the meta object for the '{@link MDSDComponentMetamodel.SystemDependant.System#delegationConnectorsForProvidedInterfacesOfSystemExist(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Delegation Connectors For Provided Interfaces Of System Exist</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Delegation Connectors For Provided Interfaces Of System Exist</em>' operation.
	 * @see MDSDComponentMetamodel.SystemDependant.System#delegationConnectorsForProvidedInterfacesOfSystemExist(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getSystem__DelegationConnectorsForProvidedInterfacesOfSystemExist__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link MDSDComponentMetamodel.SystemDependant.System#delegationConnectorsAreWellFormed(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Delegation Connectors Are Well Formed</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Delegation Connectors Are Well Formed</em>' operation.
	 * @see MDSDComponentMetamodel.SystemDependant.System#delegationConnectorsAreWellFormed(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getSystem__DelegationConnectorsAreWellFormed__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link MDSDComponentMetamodel.SystemDependant.Role <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role</em>'.
	 * @see MDSDComponentMetamodel.SystemDependant.Role
	 * @generated
	 */
	EClass getRole();

	/**
	 * Returns the meta object for the reference '{@link MDSDComponentMetamodel.SystemDependant.Role#getInterface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Interface</em>'.
	 * @see MDSDComponentMetamodel.SystemDependant.Role#getInterface()
	 * @see #getRole()
	 * @generated
	 */
	EReference getRole_Interface();

	/**
	 * Returns the meta object for the container reference '{@link MDSDComponentMetamodel.SystemDependant.Role#getProvidedAssemblyContext <em>Provided Assembly Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Provided Assembly Context</em>'.
	 * @see MDSDComponentMetamodel.SystemDependant.Role#getProvidedAssemblyContext()
	 * @see #getRole()
	 * @generated
	 */
	EReference getRole_ProvidedAssemblyContext();

	/**
	 * Returns the meta object for the container reference '{@link MDSDComponentMetamodel.SystemDependant.Role#getRequiredAssemblyContext <em>Required Assembly Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Required Assembly Context</em>'.
	 * @see MDSDComponentMetamodel.SystemDependant.Role#getRequiredAssemblyContext()
	 * @see #getRole()
	 * @generated
	 */
	EReference getRole_RequiredAssemblyContext();

	/**
	 * Returns the meta object for class '{@link MDSDComponentMetamodel.SystemDependant.Assembly <em>Assembly</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assembly</em>'.
	 * @see MDSDComponentMetamodel.SystemDependant.Assembly
	 * @generated
	 */
	EClass getAssembly();

	/**
	 * Returns the meta object for the containment reference list '{@link MDSDComponentMetamodel.SystemDependant.Assembly#getAssemblyContexts <em>Assembly Contexts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Assembly Contexts</em>'.
	 * @see MDSDComponentMetamodel.SystemDependant.Assembly#getAssemblyContexts()
	 * @see #getAssembly()
	 * @generated
	 */
	EReference getAssembly_AssemblyContexts();

	/**
	 * Returns the meta object for the containment reference list '{@link MDSDComponentMetamodel.SystemDependant.Assembly#getCompositeComponents <em>Composite Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Composite Components</em>'.
	 * @see MDSDComponentMetamodel.SystemDependant.Assembly#getCompositeComponents()
	 * @see #getAssembly()
	 * @generated
	 */
	EReference getAssembly_CompositeComponents();

	/**
	 * Returns the meta object for the containment reference list '{@link MDSDComponentMetamodel.SystemDependant.Assembly#getAssemblyConnectors <em>Assembly Connectors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Assembly Connectors</em>'.
	 * @see MDSDComponentMetamodel.SystemDependant.Assembly#getAssemblyConnectors()
	 * @see #getAssembly()
	 * @generated
	 */
	EReference getAssembly_AssemblyConnectors();

	/**
	 * Returns the meta object for the containment reference list '{@link MDSDComponentMetamodel.SystemDependant.Assembly#getDelegationConnectors <em>Delegation Connectors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Delegation Connectors</em>'.
	 * @see MDSDComponentMetamodel.SystemDependant.Assembly#getDelegationConnectors()
	 * @see #getAssembly()
	 * @generated
	 */
	EReference getAssembly_DelegationConnectors();

	/**
	 * Returns the meta object for class '{@link MDSDComponentMetamodel.SystemDependant.AssemblyConnector <em>Assembly Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assembly Connector</em>'.
	 * @see MDSDComponentMetamodel.SystemDependant.AssemblyConnector
	 * @generated
	 */
	EClass getAssemblyConnector();

	/**
	 * Returns the meta object for the reference '{@link MDSDComponentMetamodel.SystemDependant.AssemblyConnector#getProvidedRole <em>Provided Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Provided Role</em>'.
	 * @see MDSDComponentMetamodel.SystemDependant.AssemblyConnector#getProvidedRole()
	 * @see #getAssemblyConnector()
	 * @generated
	 */
	EReference getAssemblyConnector_ProvidedRole();

	/**
	 * Returns the meta object for the reference '{@link MDSDComponentMetamodel.SystemDependant.AssemblyConnector#getRequiredRole <em>Required Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Required Role</em>'.
	 * @see MDSDComponentMetamodel.SystemDependant.AssemblyConnector#getRequiredRole()
	 * @see #getAssemblyConnector()
	 * @generated
	 */
	EReference getAssemblyConnector_RequiredRole();

	/**
	 * Returns the meta object for the '{@link MDSDComponentMetamodel.SystemDependant.AssemblyConnector#providedOrRequiredMatches(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Provided Or Required Matches</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Provided Or Required Matches</em>' operation.
	 * @see MDSDComponentMetamodel.SystemDependant.AssemblyConnector#providedOrRequiredMatches(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getAssemblyConnector__ProvidedOrRequiredMatches__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link MDSDComponentMetamodel.SystemDependant.AssemblyConnector#connectedRolesAreInSameContainerOrLinkedContainers(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Connected Roles Are In Same Container Or Linked Containers</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Connected Roles Are In Same Container Or Linked Containers</em>' operation.
	 * @see MDSDComponentMetamodel.SystemDependant.AssemblyConnector#connectedRolesAreInSameContainerOrLinkedContainers(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getAssemblyConnector__ConnectedRolesAreInSameContainerOrLinkedContainers__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link MDSDComponentMetamodel.SystemDependant.AssemblyContext <em>Assembly Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assembly Context</em>'.
	 * @see MDSDComponentMetamodel.SystemDependant.AssemblyContext
	 * @generated
	 */
	EClass getAssemblyContext();

	/**
	 * Returns the meta object for the reference '{@link MDSDComponentMetamodel.SystemDependant.AssemblyContext#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Component</em>'.
	 * @see MDSDComponentMetamodel.SystemDependant.AssemblyContext#getComponent()
	 * @see #getAssemblyContext()
	 * @generated
	 */
	EReference getAssemblyContext_Component();

	/**
	 * Returns the meta object for the containment reference list '{@link MDSDComponentMetamodel.SystemDependant.AssemblyContext#getProvidedRoles <em>Provided Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Provided Roles</em>'.
	 * @see MDSDComponentMetamodel.SystemDependant.AssemblyContext#getProvidedRoles()
	 * @see #getAssemblyContext()
	 * @generated
	 */
	EReference getAssemblyContext_ProvidedRoles();

	/**
	 * Returns the meta object for the containment reference list '{@link MDSDComponentMetamodel.SystemDependant.AssemblyContext#getRequiredRoles <em>Required Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Required Roles</em>'.
	 * @see MDSDComponentMetamodel.SystemDependant.AssemblyContext#getRequiredRoles()
	 * @see #getAssemblyContext()
	 * @generated
	 */
	EReference getAssemblyContext_RequiredRoles();

	/**
	 * Returns the meta object for the reference '{@link MDSDComponentMetamodel.SystemDependant.AssemblyContext#getAllocationContext <em>Allocation Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Allocation Context</em>'.
	 * @see MDSDComponentMetamodel.SystemDependant.AssemblyContext#getAllocationContext()
	 * @see #getAssemblyContext()
	 * @generated
	 */
	EReference getAssemblyContext_AllocationContext();

	/**
	 * Returns the meta object for the '{@link MDSDComponentMetamodel.SystemDependant.AssemblyContext#providedInterfacesMatch(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Provided Interfaces Match</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Provided Interfaces Match</em>' operation.
	 * @see MDSDComponentMetamodel.SystemDependant.AssemblyContext#providedInterfacesMatch(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getAssemblyContext__ProvidedInterfacesMatch__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link MDSDComponentMetamodel.SystemDependant.AssemblyContext#requiredInterfacesMatch(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Required Interfaces Match</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Required Interfaces Match</em>' operation.
	 * @see MDSDComponentMetamodel.SystemDependant.AssemblyContext#requiredInterfacesMatch(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getAssemblyContext__RequiredInterfacesMatch__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link MDSDComponentMetamodel.SystemDependant.Allocation <em>Allocation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Allocation</em>'.
	 * @see MDSDComponentMetamodel.SystemDependant.Allocation
	 * @generated
	 */
	EClass getAllocation();

	/**
	 * Returns the meta object for the containment reference list '{@link MDSDComponentMetamodel.SystemDependant.Allocation#getAllocationContexts <em>Allocation Contexts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Allocation Contexts</em>'.
	 * @see MDSDComponentMetamodel.SystemDependant.Allocation#getAllocationContexts()
	 * @see #getAllocation()
	 * @generated
	 */
	EReference getAllocation_AllocationContexts();

	/**
	 * Returns the meta object for class '{@link MDSDComponentMetamodel.SystemDependant.Container <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container</em>'.
	 * @see MDSDComponentMetamodel.SystemDependant.Container
	 * @generated
	 */
	EClass getContainer();

	/**
	 * Returns the meta object for the reference list '{@link MDSDComponentMetamodel.SystemDependant.Container#getLinks <em>Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Links</em>'.
	 * @see MDSDComponentMetamodel.SystemDependant.Container#getLinks()
	 * @see #getContainer()
	 * @generated
	 */
	EReference getContainer_Links();

	/**
	 * Returns the meta object for class '{@link MDSDComponentMetamodel.SystemDependant.Environment <em>Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Environment</em>'.
	 * @see MDSDComponentMetamodel.SystemDependant.Environment
	 * @generated
	 */
	EClass getEnvironment();

	/**
	 * Returns the meta object for the containment reference list '{@link MDSDComponentMetamodel.SystemDependant.Environment#getLinks <em>Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Links</em>'.
	 * @see MDSDComponentMetamodel.SystemDependant.Environment#getLinks()
	 * @see #getEnvironment()
	 * @generated
	 */
	EReference getEnvironment_Links();

	/**
	 * Returns the meta object for the containment reference list '{@link MDSDComponentMetamodel.SystemDependant.Environment#getContainers <em>Containers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Containers</em>'.
	 * @see MDSDComponentMetamodel.SystemDependant.Environment#getContainers()
	 * @see #getEnvironment()
	 * @generated
	 */
	EReference getEnvironment_Containers();

	/**
	 * Returns the meta object for class '{@link MDSDComponentMetamodel.SystemDependant.Link <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link</em>'.
	 * @see MDSDComponentMetamodel.SystemDependant.Link
	 * @generated
	 */
	EClass getLink();

	/**
	 * Returns the meta object for the reference list '{@link MDSDComponentMetamodel.SystemDependant.Link#getContainers <em>Containers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Containers</em>'.
	 * @see MDSDComponentMetamodel.SystemDependant.Link#getContainers()
	 * @see #getLink()
	 * @generated
	 */
	EReference getLink_Containers();

	/**
	 * Returns the meta object for class '{@link MDSDComponentMetamodel.SystemDependant.AllocationContext <em>Allocation Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Allocation Context</em>'.
	 * @see MDSDComponentMetamodel.SystemDependant.AllocationContext
	 * @generated
	 */
	EClass getAllocationContext();

	/**
	 * Returns the meta object for the reference '{@link MDSDComponentMetamodel.SystemDependant.AllocationContext#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Container</em>'.
	 * @see MDSDComponentMetamodel.SystemDependant.AllocationContext#getContainer()
	 * @see #getAllocationContext()
	 * @generated
	 */
	EReference getAllocationContext_Container();

	/**
	 * Returns the meta object for the reference '{@link MDSDComponentMetamodel.SystemDependant.AllocationContext#getAssemblyContext <em>Assembly Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Assembly Context</em>'.
	 * @see MDSDComponentMetamodel.SystemDependant.AllocationContext#getAssemblyContext()
	 * @see #getAllocationContext()
	 * @generated
	 */
	EReference getAllocationContext_AssemblyContext();

	/**
	 * Returns the meta object for class '{@link MDSDComponentMetamodel.SystemDependant.DelegationConnector <em>Delegation Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Delegation Connector</em>'.
	 * @see MDSDComponentMetamodel.SystemDependant.DelegationConnector
	 * @generated
	 */
	EClass getDelegationConnector();

	/**
	 * Returns the meta object for the reference '{@link MDSDComponentMetamodel.SystemDependant.DelegationConnector#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Role</em>'.
	 * @see MDSDComponentMetamodel.SystemDependant.DelegationConnector#getRole()
	 * @see #getDelegationConnector()
	 * @generated
	 */
	EReference getDelegationConnector_Role();

	/**
	 * Returns the meta object for the reference '{@link MDSDComponentMetamodel.SystemDependant.DelegationConnector#getDelegatedInterface <em>Delegated Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Delegated Interface</em>'.
	 * @see MDSDComponentMetamodel.SystemDependant.DelegationConnector#getDelegatedInterface()
	 * @see #getDelegationConnector()
	 * @generated
	 */
	EReference getDelegationConnector_DelegatedInterface();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SystemDependantFactory getSystemDependantFactory();

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
		 * The meta object literal for the '{@link MDSDComponentMetamodel.SystemDependant.impl.CompositeComponentImpl <em>Composite Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MDSDComponentMetamodel.SystemDependant.impl.CompositeComponentImpl
		 * @see MDSDComponentMetamodel.SystemDependant.impl.SystemDependantPackageImpl#getCompositeComponent()
		 * @generated
		 */
		EClass COMPOSITE_COMPONENT = eINSTANCE.getCompositeComponent();

		/**
		 * The meta object literal for the '<em><b>Assembly Contexts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_COMPONENT__ASSEMBLY_CONTEXTS = eINSTANCE.getCompositeComponent_AssemblyContexts();

		/**
		 * The meta object literal for the '<em><b>Assembly Connectors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_COMPONENT__ASSEMBLY_CONNECTORS = eINSTANCE.getCompositeComponent_AssemblyConnectors();

		/**
		 * The meta object literal for the '<em><b>Delegation Connectors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_COMPONENT__DELEGATION_CONNECTORS = eINSTANCE.getCompositeComponent_DelegationConnectors();

		/**
		 * The meta object literal for the '<em><b>Delegation Connectors For Provided Interfaces Of Composite Components Exist</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMPOSITE_COMPONENT___DELEGATION_CONNECTORS_FOR_PROVIDED_INTERFACES_OF_COMPOSITE_COMPONENTS_EXIST__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getCompositeComponent__DelegationConnectorsForProvidedInterfacesOfCompositeComponentsExist__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>No Circular Dependency In Assembly Context Hierarchy</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMPOSITE_COMPONENT___NO_CIRCULAR_DEPENDENCY_IN_ASSEMBLY_CONTEXT_HIERARCHY__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getCompositeComponent__NoCircularDependencyInAssemblyContextHierarchy__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Delegation Connectors Are Well Formed</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMPOSITE_COMPONENT___DELEGATION_CONNECTORS_ARE_WELL_FORMED__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getCompositeComponent__DelegationConnectorsAreWellFormed__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Composed Assembly Contexts Are Not Allocated</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMPOSITE_COMPONENT___COMPOSED_ASSEMBLY_CONTEXTS_ARE_NOT_ALLOCATED__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getCompositeComponent__ComposedAssemblyContextsAreNotAllocated__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link MDSDComponentMetamodel.SystemDependant.impl.SystemImpl <em>System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MDSDComponentMetamodel.SystemDependant.impl.SystemImpl
		 * @see MDSDComponentMetamodel.SystemDependant.impl.SystemDependantPackageImpl#getSystem()
		 * @generated
		 */
		EClass SYSTEM = eINSTANCE.getSystem();

		/**
		 * The meta object literal for the '<em><b>Interfaces</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__INTERFACES = eINSTANCE.getSystem_Interfaces();

		/**
		 * The meta object literal for the '<em><b>Assembly</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__ASSEMBLY = eINSTANCE.getSystem_Assembly();

		/**
		 * The meta object literal for the '<em><b>Allocation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__ALLOCATION = eINSTANCE.getSystem_Allocation();

		/**
		 * The meta object literal for the '<em><b>Environment</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__ENVIRONMENT = eINSTANCE.getSystem_Environment();

		/**
		 * The meta object literal for the '<em><b>Delegation Connectors For Provided Interfaces Of System Exist</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SYSTEM___DELEGATION_CONNECTORS_FOR_PROVIDED_INTERFACES_OF_SYSTEM_EXIST__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getSystem__DelegationConnectorsForProvidedInterfacesOfSystemExist__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Delegation Connectors Are Well Formed</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SYSTEM___DELEGATION_CONNECTORS_ARE_WELL_FORMED__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getSystem__DelegationConnectorsAreWellFormed__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link MDSDComponentMetamodel.SystemDependant.impl.RoleImpl <em>Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MDSDComponentMetamodel.SystemDependant.impl.RoleImpl
		 * @see MDSDComponentMetamodel.SystemDependant.impl.SystemDependantPackageImpl#getRole()
		 * @generated
		 */
		EClass ROLE = eINSTANCE.getRole();

		/**
		 * The meta object literal for the '<em><b>Interface</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE__INTERFACE = eINSTANCE.getRole_Interface();

		/**
		 * The meta object literal for the '<em><b>Provided Assembly Context</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE__PROVIDED_ASSEMBLY_CONTEXT = eINSTANCE.getRole_ProvidedAssemblyContext();

		/**
		 * The meta object literal for the '<em><b>Required Assembly Context</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE__REQUIRED_ASSEMBLY_CONTEXT = eINSTANCE.getRole_RequiredAssemblyContext();

		/**
		 * The meta object literal for the '{@link MDSDComponentMetamodel.SystemDependant.impl.AssemblyImpl <em>Assembly</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MDSDComponentMetamodel.SystemDependant.impl.AssemblyImpl
		 * @see MDSDComponentMetamodel.SystemDependant.impl.SystemDependantPackageImpl#getAssembly()
		 * @generated
		 */
		EClass ASSEMBLY = eINSTANCE.getAssembly();

		/**
		 * The meta object literal for the '<em><b>Assembly Contexts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSEMBLY__ASSEMBLY_CONTEXTS = eINSTANCE.getAssembly_AssemblyContexts();

		/**
		 * The meta object literal for the '<em><b>Composite Components</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSEMBLY__COMPOSITE_COMPONENTS = eINSTANCE.getAssembly_CompositeComponents();

		/**
		 * The meta object literal for the '<em><b>Assembly Connectors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSEMBLY__ASSEMBLY_CONNECTORS = eINSTANCE.getAssembly_AssemblyConnectors();

		/**
		 * The meta object literal for the '<em><b>Delegation Connectors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSEMBLY__DELEGATION_CONNECTORS = eINSTANCE.getAssembly_DelegationConnectors();

		/**
		 * The meta object literal for the '{@link MDSDComponentMetamodel.SystemDependant.impl.AssemblyConnectorImpl <em>Assembly Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MDSDComponentMetamodel.SystemDependant.impl.AssemblyConnectorImpl
		 * @see MDSDComponentMetamodel.SystemDependant.impl.SystemDependantPackageImpl#getAssemblyConnector()
		 * @generated
		 */
		EClass ASSEMBLY_CONNECTOR = eINSTANCE.getAssemblyConnector();

		/**
		 * The meta object literal for the '<em><b>Provided Role</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSEMBLY_CONNECTOR__PROVIDED_ROLE = eINSTANCE.getAssemblyConnector_ProvidedRole();

		/**
		 * The meta object literal for the '<em><b>Required Role</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSEMBLY_CONNECTOR__REQUIRED_ROLE = eINSTANCE.getAssemblyConnector_RequiredRole();

		/**
		 * The meta object literal for the '<em><b>Provided Or Required Matches</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ASSEMBLY_CONNECTOR___PROVIDED_OR_REQUIRED_MATCHES__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getAssemblyConnector__ProvidedOrRequiredMatches__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Connected Roles Are In Same Container Or Linked Containers</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ASSEMBLY_CONNECTOR___CONNECTED_ROLES_ARE_IN_SAME_CONTAINER_OR_LINKED_CONTAINERS__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getAssemblyConnector__ConnectedRolesAreInSameContainerOrLinkedContainers__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link MDSDComponentMetamodel.SystemDependant.impl.AssemblyContextImpl <em>Assembly Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MDSDComponentMetamodel.SystemDependant.impl.AssemblyContextImpl
		 * @see MDSDComponentMetamodel.SystemDependant.impl.SystemDependantPackageImpl#getAssemblyContext()
		 * @generated
		 */
		EClass ASSEMBLY_CONTEXT = eINSTANCE.getAssemblyContext();

		/**
		 * The meta object literal for the '<em><b>Component</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSEMBLY_CONTEXT__COMPONENT = eINSTANCE.getAssemblyContext_Component();

		/**
		 * The meta object literal for the '<em><b>Provided Roles</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSEMBLY_CONTEXT__PROVIDED_ROLES = eINSTANCE.getAssemblyContext_ProvidedRoles();

		/**
		 * The meta object literal for the '<em><b>Required Roles</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSEMBLY_CONTEXT__REQUIRED_ROLES = eINSTANCE.getAssemblyContext_RequiredRoles();

		/**
		 * The meta object literal for the '<em><b>Allocation Context</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSEMBLY_CONTEXT__ALLOCATION_CONTEXT = eINSTANCE.getAssemblyContext_AllocationContext();

		/**
		 * The meta object literal for the '<em><b>Provided Interfaces Match</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ASSEMBLY_CONTEXT___PROVIDED_INTERFACES_MATCH__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getAssemblyContext__ProvidedInterfacesMatch__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Required Interfaces Match</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ASSEMBLY_CONTEXT___REQUIRED_INTERFACES_MATCH__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getAssemblyContext__RequiredInterfacesMatch__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link MDSDComponentMetamodel.SystemDependant.impl.AllocationImpl <em>Allocation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MDSDComponentMetamodel.SystemDependant.impl.AllocationImpl
		 * @see MDSDComponentMetamodel.SystemDependant.impl.SystemDependantPackageImpl#getAllocation()
		 * @generated
		 */
		EClass ALLOCATION = eINSTANCE.getAllocation();

		/**
		 * The meta object literal for the '<em><b>Allocation Contexts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALLOCATION__ALLOCATION_CONTEXTS = eINSTANCE.getAllocation_AllocationContexts();

		/**
		 * The meta object literal for the '{@link MDSDComponentMetamodel.SystemDependant.impl.ContainerImpl <em>Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MDSDComponentMetamodel.SystemDependant.impl.ContainerImpl
		 * @see MDSDComponentMetamodel.SystemDependant.impl.SystemDependantPackageImpl#getContainer()
		 * @generated
		 */
		EClass CONTAINER = eINSTANCE.getContainer();

		/**
		 * The meta object literal for the '<em><b>Links</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER__LINKS = eINSTANCE.getContainer_Links();

		/**
		 * The meta object literal for the '{@link MDSDComponentMetamodel.SystemDependant.impl.EnvironmentImpl <em>Environment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MDSDComponentMetamodel.SystemDependant.impl.EnvironmentImpl
		 * @see MDSDComponentMetamodel.SystemDependant.impl.SystemDependantPackageImpl#getEnvironment()
		 * @generated
		 */
		EClass ENVIRONMENT = eINSTANCE.getEnvironment();

		/**
		 * The meta object literal for the '<em><b>Links</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENVIRONMENT__LINKS = eINSTANCE.getEnvironment_Links();

		/**
		 * The meta object literal for the '<em><b>Containers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENVIRONMENT__CONTAINERS = eINSTANCE.getEnvironment_Containers();

		/**
		 * The meta object literal for the '{@link MDSDComponentMetamodel.SystemDependant.impl.LinkImpl <em>Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MDSDComponentMetamodel.SystemDependant.impl.LinkImpl
		 * @see MDSDComponentMetamodel.SystemDependant.impl.SystemDependantPackageImpl#getLink()
		 * @generated
		 */
		EClass LINK = eINSTANCE.getLink();

		/**
		 * The meta object literal for the '<em><b>Containers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK__CONTAINERS = eINSTANCE.getLink_Containers();

		/**
		 * The meta object literal for the '{@link MDSDComponentMetamodel.SystemDependant.impl.AllocationContextImpl <em>Allocation Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MDSDComponentMetamodel.SystemDependant.impl.AllocationContextImpl
		 * @see MDSDComponentMetamodel.SystemDependant.impl.SystemDependantPackageImpl#getAllocationContext()
		 * @generated
		 */
		EClass ALLOCATION_CONTEXT = eINSTANCE.getAllocationContext();

		/**
		 * The meta object literal for the '<em><b>Container</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALLOCATION_CONTEXT__CONTAINER = eINSTANCE.getAllocationContext_Container();

		/**
		 * The meta object literal for the '<em><b>Assembly Context</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALLOCATION_CONTEXT__ASSEMBLY_CONTEXT = eINSTANCE.getAllocationContext_AssemblyContext();

		/**
		 * The meta object literal for the '{@link MDSDComponentMetamodel.SystemDependant.impl.DelegationConnectorImpl <em>Delegation Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MDSDComponentMetamodel.SystemDependant.impl.DelegationConnectorImpl
		 * @see MDSDComponentMetamodel.SystemDependant.impl.SystemDependantPackageImpl#getDelegationConnector()
		 * @generated
		 */
		EClass DELEGATION_CONNECTOR = eINSTANCE.getDelegationConnector();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DELEGATION_CONNECTOR__ROLE = eINSTANCE.getDelegationConnector_Role();

		/**
		 * The meta object literal for the '<em><b>Delegated Interface</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DELEGATION_CONNECTOR__DELEGATED_INTERFACE = eINSTANCE.getDelegationConnector_DelegatedInterface();

	}

} //SystemDependantPackage
