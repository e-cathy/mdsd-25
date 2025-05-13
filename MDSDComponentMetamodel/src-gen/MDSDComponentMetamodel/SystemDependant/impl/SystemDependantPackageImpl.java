/**
 */
package MDSDComponentMetamodel.SystemDependant.impl;

import MDSDComponentMetamodel.MDSDComponentMetamodelPackage;

import MDSDComponentMetamodel.SystemDependant.Allocation;
import MDSDComponentMetamodel.SystemDependant.AllocationContext;
import MDSDComponentMetamodel.SystemDependant.Assembly;
import MDSDComponentMetamodel.SystemDependant.AssemblyConnector;
import MDSDComponentMetamodel.SystemDependant.AssemblyContext;
import MDSDComponentMetamodel.SystemDependant.CompositeComponent;
import MDSDComponentMetamodel.SystemDependant.DelegationConnector;
import MDSDComponentMetamodel.SystemDependant.Environment;
import MDSDComponentMetamodel.SystemDependant.Link;
import MDSDComponentMetamodel.SystemDependant.Role;
import MDSDComponentMetamodel.SystemDependant.SystemDependantFactory;
import MDSDComponentMetamodel.SystemDependant.SystemDependantPackage;

import MDSDComponentMetamodel.SystemDependant.util.SystemDependantValidator;

import MDSDComponentMetamodel.SystemIndependant.SystemIndependantPackage;

import MDSDComponentMetamodel.SystemIndependant.impl.SystemIndependantPackageImpl;

import MDSDComponentMetamodel.impl.MDSDComponentMetamodelPackageImpl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SystemDependantPackageImpl extends EPackageImpl implements SystemDependantPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compositeComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assemblyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assemblyConnectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assemblyContextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass allocationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass environmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass allocationContextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass delegationConnectorEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see MDSDComponentMetamodel.SystemDependant.SystemDependantPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SystemDependantPackageImpl() {
		super(eNS_URI, SystemDependantFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link SystemDependantPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SystemDependantPackage init() {
		if (isInited)
			return (SystemDependantPackage) EPackage.Registry.INSTANCE.getEPackage(SystemDependantPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredSystemDependantPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		SystemDependantPackageImpl theSystemDependantPackage = registeredSystemDependantPackage instanceof SystemDependantPackageImpl
				? (SystemDependantPackageImpl) registeredSystemDependantPackage
				: new SystemDependantPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(MDSDComponentMetamodelPackage.eNS_URI);
		MDSDComponentMetamodelPackageImpl theMDSDComponentMetamodelPackage = (MDSDComponentMetamodelPackageImpl) (registeredPackage instanceof MDSDComponentMetamodelPackageImpl
				? registeredPackage
				: MDSDComponentMetamodelPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(SystemIndependantPackage.eNS_URI);
		SystemIndependantPackageImpl theSystemIndependantPackage = (SystemIndependantPackageImpl) (registeredPackage instanceof SystemIndependantPackageImpl
				? registeredPackage
				: SystemIndependantPackage.eINSTANCE);

		// Create package meta-data objects
		theSystemDependantPackage.createPackageContents();
		theMDSDComponentMetamodelPackage.createPackageContents();
		theSystemIndependantPackage.createPackageContents();

		// Initialize created meta-data
		theSystemDependantPackage.initializePackageContents();
		theMDSDComponentMetamodelPackage.initializePackageContents();
		theSystemIndependantPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put(theSystemDependantPackage, new EValidator.Descriptor() {
			@Override
			public EValidator getEValidator() {
				return SystemDependantValidator.INSTANCE;
			}
		});

		// Mark meta-data to indicate it can't be changed
		theSystemDependantPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SystemDependantPackage.eNS_URI, theSystemDependantPackage);
		return theSystemDependantPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCompositeComponent() {
		return compositeComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCompositeComponent_AssemblyContexts() {
		return (EReference) compositeComponentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCompositeComponent_AssemblyConnectors() {
		return (EReference) compositeComponentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCompositeComponent_DelegationConnectors() {
		return (EReference) compositeComponentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCompositeComponent__DelegationConnectorsForProvidedInterfacesOfCompositeComponentsExist__DiagnosticChain_Map() {
		return compositeComponentEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCompositeComponent__NoCircularDependencyInAssemblyContextHierarchy__DiagnosticChain_Map() {
		return compositeComponentEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCompositeComponent__DelegationConnectorsAreWellFormed__DiagnosticChain_Map() {
		return compositeComponentEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCompositeComponent__ComposedAssemblyContextsAreNotAllocated__DiagnosticChain_Map() {
		return compositeComponentEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSystem() {
		return systemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSystem_Interfaces() {
		return (EReference) systemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSystem_Assembly() {
		return (EReference) systemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSystem_Allocation() {
		return (EReference) systemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSystem_Environment() {
		return (EReference) systemEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSystem__DelegationConnectorsForProvidedInterfacesOfSystemExist__DiagnosticChain_Map() {
		return systemEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSystem__DelegationConnectorsAreWellFormed__DiagnosticChain_Map() {
		return systemEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRole() {
		return roleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRole_Interface() {
		return (EReference) roleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRole_ProvidedAssemblyContext() {
		return (EReference) roleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRole_RequiredAssemblyContext() {
		return (EReference) roleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAssembly() {
		return assemblyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAssembly_AssemblyContexts() {
		return (EReference) assemblyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAssembly_CompositeComponents() {
		return (EReference) assemblyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAssembly_AssemblyConnectors() {
		return (EReference) assemblyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAssembly_DelegationConnectors() {
		return (EReference) assemblyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAssemblyConnector() {
		return assemblyConnectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAssemblyConnector_ProvidedRole() {
		return (EReference) assemblyConnectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAssemblyConnector_RequiredRole() {
		return (EReference) assemblyConnectorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAssemblyConnector__ProvidedOrRequiredMatches__DiagnosticChain_Map() {
		return assemblyConnectorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAssemblyConnector__ConnectedRolesAreInSameContainerOrLinkedContainers__DiagnosticChain_Map() {
		return assemblyConnectorEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAssemblyContext() {
		return assemblyContextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAssemblyContext_Component() {
		return (EReference) assemblyContextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAssemblyContext_ProvidedRoles() {
		return (EReference) assemblyContextEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAssemblyContext_RequiredRoles() {
		return (EReference) assemblyContextEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAssemblyContext_AllocationContext() {
		return (EReference) assemblyContextEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAssemblyContext__ProvidedInterfacesMatch__DiagnosticChain_Map() {
		return assemblyContextEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAssemblyContext__RequiredInterfacesMatch__DiagnosticChain_Map() {
		return assemblyContextEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAllocation() {
		return allocationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAllocation_AllocationContexts() {
		return (EReference) allocationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContainer() {
		return containerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainer_Links() {
		return (EReference) containerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEnvironment() {
		return environmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEnvironment_Links() {
		return (EReference) environmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEnvironment_Containers() {
		return (EReference) environmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLink() {
		return linkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLink_Containers() {
		return (EReference) linkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAllocationContext() {
		return allocationContextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAllocationContext_Container() {
		return (EReference) allocationContextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAllocationContext_AssemblyContext() {
		return (EReference) allocationContextEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDelegationConnector() {
		return delegationConnectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDelegationConnector_Role() {
		return (EReference) delegationConnectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDelegationConnector_DelegatedInterface() {
		return (EReference) delegationConnectorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SystemDependantFactory getSystemDependantFactory() {
		return (SystemDependantFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		compositeComponentEClass = createEClass(COMPOSITE_COMPONENT);
		createEReference(compositeComponentEClass, COMPOSITE_COMPONENT__ASSEMBLY_CONTEXTS);
		createEReference(compositeComponentEClass, COMPOSITE_COMPONENT__ASSEMBLY_CONNECTORS);
		createEReference(compositeComponentEClass, COMPOSITE_COMPONENT__DELEGATION_CONNECTORS);
		createEOperation(compositeComponentEClass,
				COMPOSITE_COMPONENT___DELEGATION_CONNECTORS_FOR_PROVIDED_INTERFACES_OF_COMPOSITE_COMPONENTS_EXIST__DIAGNOSTICCHAIN_MAP);
		createEOperation(compositeComponentEClass,
				COMPOSITE_COMPONENT___NO_CIRCULAR_DEPENDENCY_IN_ASSEMBLY_CONTEXT_HIERARCHY__DIAGNOSTICCHAIN_MAP);
		createEOperation(compositeComponentEClass,
				COMPOSITE_COMPONENT___DELEGATION_CONNECTORS_ARE_WELL_FORMED__DIAGNOSTICCHAIN_MAP);
		createEOperation(compositeComponentEClass,
				COMPOSITE_COMPONENT___COMPOSED_ASSEMBLY_CONTEXTS_ARE_NOT_ALLOCATED__DIAGNOSTICCHAIN_MAP);

		systemEClass = createEClass(SYSTEM);
		createEReference(systemEClass, SYSTEM__INTERFACES);
		createEReference(systemEClass, SYSTEM__ASSEMBLY);
		createEReference(systemEClass, SYSTEM__ALLOCATION);
		createEReference(systemEClass, SYSTEM__ENVIRONMENT);
		createEOperation(systemEClass,
				SYSTEM___DELEGATION_CONNECTORS_FOR_PROVIDED_INTERFACES_OF_SYSTEM_EXIST__DIAGNOSTICCHAIN_MAP);
		createEOperation(systemEClass, SYSTEM___DELEGATION_CONNECTORS_ARE_WELL_FORMED__DIAGNOSTICCHAIN_MAP);

		roleEClass = createEClass(ROLE);
		createEReference(roleEClass, ROLE__INTERFACE);
		createEReference(roleEClass, ROLE__PROVIDED_ASSEMBLY_CONTEXT);
		createEReference(roleEClass, ROLE__REQUIRED_ASSEMBLY_CONTEXT);

		assemblyEClass = createEClass(ASSEMBLY);
		createEReference(assemblyEClass, ASSEMBLY__ASSEMBLY_CONTEXTS);
		createEReference(assemblyEClass, ASSEMBLY__COMPOSITE_COMPONENTS);
		createEReference(assemblyEClass, ASSEMBLY__ASSEMBLY_CONNECTORS);
		createEReference(assemblyEClass, ASSEMBLY__DELEGATION_CONNECTORS);

		assemblyConnectorEClass = createEClass(ASSEMBLY_CONNECTOR);
		createEReference(assemblyConnectorEClass, ASSEMBLY_CONNECTOR__PROVIDED_ROLE);
		createEReference(assemblyConnectorEClass, ASSEMBLY_CONNECTOR__REQUIRED_ROLE);
		createEOperation(assemblyConnectorEClass,
				ASSEMBLY_CONNECTOR___PROVIDED_OR_REQUIRED_MATCHES__DIAGNOSTICCHAIN_MAP);
		createEOperation(assemblyConnectorEClass,
				ASSEMBLY_CONNECTOR___CONNECTED_ROLES_ARE_IN_SAME_CONTAINER_OR_LINKED_CONTAINERS__DIAGNOSTICCHAIN_MAP);

		assemblyContextEClass = createEClass(ASSEMBLY_CONTEXT);
		createEReference(assemblyContextEClass, ASSEMBLY_CONTEXT__COMPONENT);
		createEReference(assemblyContextEClass, ASSEMBLY_CONTEXT__PROVIDED_ROLES);
		createEReference(assemblyContextEClass, ASSEMBLY_CONTEXT__REQUIRED_ROLES);
		createEReference(assemblyContextEClass, ASSEMBLY_CONTEXT__ALLOCATION_CONTEXT);
		createEOperation(assemblyContextEClass, ASSEMBLY_CONTEXT___PROVIDED_INTERFACES_MATCH__DIAGNOSTICCHAIN_MAP);
		createEOperation(assemblyContextEClass, ASSEMBLY_CONTEXT___REQUIRED_INTERFACES_MATCH__DIAGNOSTICCHAIN_MAP);

		allocationEClass = createEClass(ALLOCATION);
		createEReference(allocationEClass, ALLOCATION__ALLOCATION_CONTEXTS);

		containerEClass = createEClass(CONTAINER);
		createEReference(containerEClass, CONTAINER__LINKS);

		environmentEClass = createEClass(ENVIRONMENT);
		createEReference(environmentEClass, ENVIRONMENT__LINKS);
		createEReference(environmentEClass, ENVIRONMENT__CONTAINERS);

		linkEClass = createEClass(LINK);
		createEReference(linkEClass, LINK__CONTAINERS);

		allocationContextEClass = createEClass(ALLOCATION_CONTEXT);
		createEReference(allocationContextEClass, ALLOCATION_CONTEXT__CONTAINER);
		createEReference(allocationContextEClass, ALLOCATION_CONTEXT__ASSEMBLY_CONTEXT);

		delegationConnectorEClass = createEClass(DELEGATION_CONNECTOR);
		createEReference(delegationConnectorEClass, DELEGATION_CONNECTOR__ROLE);
		createEReference(delegationConnectorEClass, DELEGATION_CONNECTOR__DELEGATED_INTERFACE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		SystemIndependantPackage theSystemIndependantPackage = (SystemIndependantPackage) EPackage.Registry.INSTANCE
				.getEPackage(SystemIndependantPackage.eNS_URI);
		MDSDComponentMetamodelPackage theMDSDComponentMetamodelPackage = (MDSDComponentMetamodelPackage) EPackage.Registry.INSTANCE
				.getEPackage(MDSDComponentMetamodelPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		compositeComponentEClass.getESuperTypes().add(theSystemIndependantPackage.getComponent());
		roleEClass.getESuperTypes().add(theMDSDComponentMetamodelPackage.getNamedElement());
		assemblyConnectorEClass.getESuperTypes().add(theMDSDComponentMetamodelPackage.getNamedElement());
		assemblyContextEClass.getESuperTypes().add(theMDSDComponentMetamodelPackage.getNamedElement());
		containerEClass.getESuperTypes().add(theMDSDComponentMetamodelPackage.getNamedElement());
		linkEClass.getESuperTypes().add(theMDSDComponentMetamodelPackage.getNamedElement());
		allocationContextEClass.getESuperTypes().add(theMDSDComponentMetamodelPackage.getNamedElement());
		delegationConnectorEClass.getESuperTypes().add(theMDSDComponentMetamodelPackage.getNamedElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(compositeComponentEClass, CompositeComponent.class, "CompositeComponent", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCompositeComponent_AssemblyContexts(), this.getAssemblyContext(), null, "assemblyContexts",
				null, 2, -1, CompositeComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCompositeComponent_AssemblyConnectors(), this.getAssemblyConnector(), null,
				"assemblyConnectors", null, 0, -1, CompositeComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCompositeComponent_DelegationConnectors(), this.getDelegationConnector(), null,
				"delegationConnectors", null, 0, -1, CompositeComponent.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(
				getCompositeComponent__DelegationConnectorsForProvidedInterfacesOfCompositeComponentsExist__DiagnosticChain_Map(),
				ecorePackage.getEBoolean(), "delegationConnectorsForProvidedInterfacesOfCompositeComponentsExist", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEMap());
		EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getCompositeComponent__NoCircularDependencyInAssemblyContextHierarchy__DiagnosticChain_Map(),
				ecorePackage.getEBoolean(), "noCircularDependencyInAssemblyContextHierarchy", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getCompositeComponent__DelegationConnectorsAreWellFormed__DiagnosticChain_Map(),
				ecorePackage.getEBoolean(), "delegationConnectorsAreWellFormed", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getCompositeComponent__ComposedAssemblyContextsAreNotAllocated__DiagnosticChain_Map(),
				ecorePackage.getEBoolean(), "composedAssemblyContextsAreNotAllocated", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(systemEClass, MDSDComponentMetamodel.SystemDependant.System.class, "System", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSystem_Interfaces(), theSystemIndependantPackage.getInterface(), null, "interfaces", null, 1,
				-1, MDSDComponentMetamodel.SystemDependant.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystem_Assembly(), this.getAssembly(), null, "assembly", null, 1, 1,
				MDSDComponentMetamodel.SystemDependant.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystem_Allocation(), this.getAllocation(), null, "allocation", null, 1, 1,
				MDSDComponentMetamodel.SystemDependant.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystem_Environment(), this.getEnvironment(), null, "environment", null, 1, 1,
				MDSDComponentMetamodel.SystemDependant.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getSystem__DelegationConnectorsForProvidedInterfacesOfSystemExist__DiagnosticChain_Map(),
				ecorePackage.getEBoolean(), "delegationConnectorsForProvidedInterfacesOfSystemExist", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getSystem__DelegationConnectorsAreWellFormed__DiagnosticChain_Map(),
				ecorePackage.getEBoolean(), "delegationConnectorsAreWellFormed", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(roleEClass, Role.class, "Role", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRole_Interface(), theSystemIndependantPackage.getInterface(), null, "interface", null, 1, 1,
				Role.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRole_ProvidedAssemblyContext(), this.getAssemblyContext(),
				this.getAssemblyContext_ProvidedRoles(), "providedAssemblyContext", null, 0, 1, Role.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRole_RequiredAssemblyContext(), this.getAssemblyContext(),
				this.getAssemblyContext_RequiredRoles(), "requiredAssemblyContext", null, 0, 1, Role.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(assemblyEClass, Assembly.class, "Assembly", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAssembly_AssemblyContexts(), this.getAssemblyContext(), null, "assemblyContexts", null, 0, -1,
				Assembly.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssembly_CompositeComponents(), this.getCompositeComponent(), null, "compositeComponents",
				null, 0, -1, Assembly.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssembly_AssemblyConnectors(), this.getAssemblyConnector(), null, "assemblyConnectors", null,
				0, -1, Assembly.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssembly_DelegationConnectors(), this.getDelegationConnector(), null, "delegationConnectors",
				null, 0, -1, Assembly.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(assemblyConnectorEClass, AssemblyConnector.class, "AssemblyConnector", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAssemblyConnector_ProvidedRole(), this.getRole(), null, "providedRole", null, 1, 1,
				AssemblyConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssemblyConnector_RequiredRole(), this.getRole(), null, "requiredRole", null, 1, 1,
				AssemblyConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getAssemblyConnector__ProvidedOrRequiredMatches__DiagnosticChain_Map(),
				ecorePackage.getEBoolean(), "providedOrRequiredMatches", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getAssemblyConnector__ConnectedRolesAreInSameContainerOrLinkedContainers__DiagnosticChain_Map(),
				ecorePackage.getEBoolean(), "connectedRolesAreInSameContainerOrLinkedContainers", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(assemblyContextEClass, AssemblyContext.class, "AssemblyContext", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAssemblyContext_Component(), theSystemIndependantPackage.getComponent(), null, "component",
				null, 1, 1, AssemblyContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssemblyContext_ProvidedRoles(), this.getRole(), this.getRole_ProvidedAssemblyContext(),
				"providedRoles", null, 0, -1, AssemblyContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssemblyContext_RequiredRoles(), this.getRole(), this.getRole_RequiredAssemblyContext(),
				"requiredRoles", null, 0, -1, AssemblyContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssemblyContext_AllocationContext(), this.getAllocationContext(),
				this.getAllocationContext_AssemblyContext(), "allocationContext", null, 0, 1, AssemblyContext.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getAssemblyContext__ProvidedInterfacesMatch__DiagnosticChain_Map(),
				ecorePackage.getEBoolean(), "providedInterfacesMatch", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAssemblyContext__RequiredInterfacesMatch__DiagnosticChain_Map(),
				ecorePackage.getEBoolean(), "requiredInterfacesMatch", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(allocationEClass, Allocation.class, "Allocation", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAllocation_AllocationContexts(), this.getAllocationContext(), null, "allocationContexts",
				null, 0, -1, Allocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(containerEClass, MDSDComponentMetamodel.SystemDependant.Container.class, "Container", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContainer_Links(), this.getLink(), this.getLink_Containers(), "links", null, 0, -1,
				MDSDComponentMetamodel.SystemDependant.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(environmentEClass, Environment.class, "Environment", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEnvironment_Links(), this.getLink(), null, "links", null, 0, -1, Environment.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEnvironment_Containers(), this.getContainer(), null, "containers", null, 0, -1,
				Environment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(linkEClass, Link.class, "Link", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLink_Containers(), this.getContainer(), this.getContainer_Links(), "containers", null, 2, -1,
				Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(allocationContextEClass, AllocationContext.class, "AllocationContext", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAllocationContext_Container(), this.getContainer(), null, "container", null, 1, 1,
				AllocationContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAllocationContext_AssemblyContext(), this.getAssemblyContext(),
				this.getAssemblyContext_AllocationContext(), "assemblyContext", null, 1, 1, AllocationContext.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(delegationConnectorEClass, DelegationConnector.class, "DelegationConnector", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDelegationConnector_Role(), this.getRole(), null, "role", null, 1, 1,
				DelegationConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDelegationConnector_DelegatedInterface(), theSystemIndependantPackage.getInterface(), null,
				"delegatedInterface", null, 1, 1, DelegationConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
		createPivotAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";
		addAnnotation(this, source, new String[] {});
		addAnnotation(compositeComponentEClass, source,
				new String[] { "constraints", "composedAssemblyContextsAreNotAllocated" });
		addAnnotation(systemEClass, source, new String[] { "constraints", "delegationConnectorsAreWellFormed" });
		addAnnotation(assemblyConnectorEClass, source,
				new String[] { "constraints", "connectedRolesAreInSameContainerOrLinkedContainers" });
		addAnnotation(assemblyContextEClass, source, new String[] { "constraints", "requiredInterfacesMatch" });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPivotAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot";
		addAnnotation(
				getCompositeComponent__DelegationConnectorsForProvidedInterfacesOfCompositeComponentsExist__DiagnosticChain_Map(),
				source, new String[] { "body",
						"self.providedInterfaces -> forAll(i |\n        \t\tself.delegationConnectors -> exists(dc | dc.delegatedInterface = i)\n        \t)" });
		addAnnotation(getCompositeComponent__NoCircularDependencyInAssemblyContextHierarchy__DiagnosticChain_Map(),
				source, new String[] { "body", "self.assemblyContexts -> forAll(a | a.component <> self)" });
		addAnnotation(getCompositeComponent__DelegationConnectorsAreWellFormed__DiagnosticChain_Map(), source,
				new String[] { "body",
						"self.delegationConnectors -> forAll(dc | \n            \t(self.providedInterfaces -> includes(dc.delegatedInterface) and self.assemblyContexts->exists(ac | \n                \tac.providedRoles -> includes(dc.role)))\n                \tor \n                \t(self.requiredInterfaces -> includes(dc.delegatedInterface) and self.assemblyContexts -> exists(ac | \n                    \tac.requiredRoles -> includes(dc.role)))\n            )" });
		addAnnotation(getCompositeComponent__ComposedAssemblyContextsAreNotAllocated__DiagnosticChain_Map(), source,
				new String[] { "body", "self.assemblyContexts -> forAll(a | a.allocationContext.oclIsUndefined())" });
		addAnnotation(getSystem__DelegationConnectorsForProvidedInterfacesOfSystemExist__DiagnosticChain_Map(), source,
				new String[] { "body",
						"self.interfaces -> forAll(i |\n        \t\tself.assembly.delegationConnectors -> exists(dc | dc.delegatedInterface = i)\n        \t)" });
		addAnnotation(getSystem__DelegationConnectorsAreWellFormed__DiagnosticChain_Map(), source, new String[] {
				"body",
				"self.assembly.delegationConnectors -> forAll(dc | \n            \t(self.interfaces -> includes(dc.delegatedInterface) and self.assembly.assemblyContexts->exists(ac | \n                \tac.providedRoles -> includes(dc.role)))\n            )" });
		addAnnotation(getAssemblyConnector__ProvidedOrRequiredMatches__DiagnosticChain_Map(), source, new String[] {
				"body",
				"not self.providedRole.providedAssemblyContext.oclIsUndefined() and not self.requiredRole.requiredAssemblyContext.oclIsUndefined()" });
		addAnnotation(getAssemblyConnector__ConnectedRolesAreInSameContainerOrLinkedContainers__DiagnosticChain_Map(),
				source, new String[] { "body",
						"\n\t\t\t\t(not self.providedRole.providedAssemblyContext.allocationContext.oclIsUndefined() and not self.requiredRole.requiredAssemblyContext.allocationContext.oclIsUndefined()) implies\n\t\t\t\t(let providedContainer = self.providedRole.providedAssemblyContext.allocationContext.container in (\n\t\t\t\t\tlet requiredContainer = self.requiredRole.requiredAssemblyContext.allocationContext.container in (\n\t\t\t\t\t\tprovidedContainer = requiredContainer or providedContainer.links -> exists(l | l.containers -> includes(requiredContainer))\n\t\t\t\t\t)\n\t\t\t\t))" });
		addAnnotation(getAssemblyContext__ProvidedInterfacesMatch__DiagnosticChain_Map(), source, new String[] { "body",
				"self.providedRoles->forAll(r | self.component.providedInterfaces->includes(r.interface))" });
		addAnnotation(getAssemblyContext__RequiredInterfacesMatch__DiagnosticChain_Map(), source, new String[] { "body",
				"self.requiredRoles->forAll(r | self.component.requiredInterfaces->includes(r.interface))" });
	}

} //SystemDependantPackageImpl
