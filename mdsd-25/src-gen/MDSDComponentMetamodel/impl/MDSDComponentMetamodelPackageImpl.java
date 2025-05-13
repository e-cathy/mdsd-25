/**
 */
package MDSDComponentMetamodel.impl;

import MDSDComponentMetamodel.ComponentSystem;
import MDSDComponentMetamodel.MDSDComponentMetamodelFactory;
import MDSDComponentMetamodel.MDSDComponentMetamodelPackage;
import MDSDComponentMetamodel.NamedElement;

import MDSDComponentMetamodel.SystemDependant.SystemDependantPackage;

import MDSDComponentMetamodel.SystemDependant.impl.SystemDependantPackageImpl;

import MDSDComponentMetamodel.SystemIndependant.SystemIndependantPackage;

import MDSDComponentMetamodel.SystemIndependant.impl.SystemIndependantPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MDSDComponentMetamodelPackageImpl extends EPackageImpl implements MDSDComponentMetamodelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentSystemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedElementEClass = null;

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
	 * @see MDSDComponentMetamodel.MDSDComponentMetamodelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MDSDComponentMetamodelPackageImpl() {
		super(eNS_URI, MDSDComponentMetamodelFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link MDSDComponentMetamodelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MDSDComponentMetamodelPackage init() {
		if (isInited)
			return (MDSDComponentMetamodelPackage) EPackage.Registry.INSTANCE
					.getEPackage(MDSDComponentMetamodelPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredMDSDComponentMetamodelPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		MDSDComponentMetamodelPackageImpl theMDSDComponentMetamodelPackage = registeredMDSDComponentMetamodelPackage instanceof MDSDComponentMetamodelPackageImpl
				? (MDSDComponentMetamodelPackageImpl) registeredMDSDComponentMetamodelPackage
				: new MDSDComponentMetamodelPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(SystemIndependantPackage.eNS_URI);
		SystemIndependantPackageImpl theSystemIndependantPackage = (SystemIndependantPackageImpl) (registeredPackage instanceof SystemIndependantPackageImpl
				? registeredPackage
				: SystemIndependantPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(SystemDependantPackage.eNS_URI);
		SystemDependantPackageImpl theSystemDependantPackage = (SystemDependantPackageImpl) (registeredPackage instanceof SystemDependantPackageImpl
				? registeredPackage
				: SystemDependantPackage.eINSTANCE);

		// Create package meta-data objects
		theMDSDComponentMetamodelPackage.createPackageContents();
		theSystemIndependantPackage.createPackageContents();
		theSystemDependantPackage.createPackageContents();

		// Initialize created meta-data
		theMDSDComponentMetamodelPackage.initializePackageContents();
		theSystemIndependantPackage.initializePackageContents();
		theSystemDependantPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMDSDComponentMetamodelPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MDSDComponentMetamodelPackage.eNS_URI, theMDSDComponentMetamodelPackage);
		return theMDSDComponentMetamodelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getComponentSystem() {
		return componentSystemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponentSystem_Repository() {
		return (EReference) componentSystemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponentSystem_System() {
		return (EReference) componentSystemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNamedElement() {
		return namedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNamedElement_Name() {
		return (EAttribute) namedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MDSDComponentMetamodelFactory getMDSDComponentMetamodelFactory() {
		return (MDSDComponentMetamodelFactory) getEFactoryInstance();
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
		componentSystemEClass = createEClass(COMPONENT_SYSTEM);
		createEReference(componentSystemEClass, COMPONENT_SYSTEM__REPOSITORY);
		createEReference(componentSystemEClass, COMPONENT_SYSTEM__SYSTEM);

		namedElementEClass = createEClass(NAMED_ELEMENT);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);
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
		SystemDependantPackage theSystemDependantPackage = (SystemDependantPackage) EPackage.Registry.INSTANCE
				.getEPackage(SystemDependantPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theSystemIndependantPackage);
		getESubpackages().add(theSystemDependantPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(componentSystemEClass, ComponentSystem.class, "ComponentSystem", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComponentSystem_Repository(), theSystemIndependantPackage.getRepository(), null, "repository",
				null, 1, -1, ComponentSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentSystem_System(), theSystemDependantPackage.getSystem(), null, "system", null, 0, -1,
				ComponentSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(namedElementEClass, NamedElement.class, "NamedElement", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedElement_Name(), ecorePackage.getEString(), "name", null, 1, 1, NamedElement.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //MDSDComponentMetamodelPackageImpl
