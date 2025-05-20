/**
 */
package MDSDComponentMetamodel.SystemIndependant.impl;

import MDSDComponentMetamodel.MDSDComponentMetamodelPackage;

import MDSDComponentMetamodel.SystemDependant.SystemDependantPackage;

import MDSDComponentMetamodel.SystemDependant.impl.SystemDependantPackageImpl;

import MDSDComponentMetamodel.SystemIndependant.Action;
import MDSDComponentMetamodel.SystemIndependant.BasicComponent;
import MDSDComponentMetamodel.SystemIndependant.Branch;
import MDSDComponentMetamodel.SystemIndependant.ComplexType;
import MDSDComponentMetamodel.SystemIndependant.Component;
import MDSDComponentMetamodel.SystemIndependant.ExternalCall;
import MDSDComponentMetamodel.SystemIndependant.Interface;
import MDSDComponentMetamodel.SystemIndependant.InternalAction;
import MDSDComponentMetamodel.SystemIndependant.Loop;
import MDSDComponentMetamodel.SystemIndependant.Parameter;
import MDSDComponentMetamodel.SystemIndependant.Repository;
import MDSDComponentMetamodel.SystemIndependant.Service;
import MDSDComponentMetamodel.SystemIndependant.Signature;
import MDSDComponentMetamodel.SystemIndependant.SimpleType;
import MDSDComponentMetamodel.SystemIndependant.SimpleTypeEnum;
import MDSDComponentMetamodel.SystemIndependant.SystemIndependantFactory;
import MDSDComponentMetamodel.SystemIndependant.SystemIndependantPackage;
import MDSDComponentMetamodel.SystemIndependant.Type;

import MDSDComponentMetamodel.impl.MDSDComponentMetamodelPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SystemIndependantPackageImpl extends EPackageImpl implements SystemIndependantPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass repositoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass complexTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass externalCallEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass signatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass internalActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass branchEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass basicComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass loopEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum simpleTypeEnumEEnum = null;

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
	 * @see MDSDComponentMetamodel.SystemIndependant.SystemIndependantPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SystemIndependantPackageImpl() {
		super(eNS_URI, SystemIndependantFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link SystemIndependantPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SystemIndependantPackage init() {
		if (isInited)
			return (SystemIndependantPackage) EPackage.Registry.INSTANCE.getEPackage(SystemIndependantPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredSystemIndependantPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		SystemIndependantPackageImpl theSystemIndependantPackage = registeredSystemIndependantPackage instanceof SystemIndependantPackageImpl
				? (SystemIndependantPackageImpl) registeredSystemIndependantPackage
				: new SystemIndependantPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(MDSDComponentMetamodelPackage.eNS_URI);
		MDSDComponentMetamodelPackageImpl theMDSDComponentMetamodelPackage = (MDSDComponentMetamodelPackageImpl) (registeredPackage instanceof MDSDComponentMetamodelPackageImpl
				? registeredPackage
				: MDSDComponentMetamodelPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(SystemDependantPackage.eNS_URI);
		SystemDependantPackageImpl theSystemDependantPackage = (SystemDependantPackageImpl) (registeredPackage instanceof SystemDependantPackageImpl
				? registeredPackage
				: SystemDependantPackage.eINSTANCE);

		// Create package meta-data objects
		theSystemIndependantPackage.createPackageContents();
		theMDSDComponentMetamodelPackage.createPackageContents();
		theSystemDependantPackage.createPackageContents();

		// Initialize created meta-data
		theSystemIndependantPackage.initializePackageContents();
		theMDSDComponentMetamodelPackage.initializePackageContents();
		theSystemDependantPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSystemIndependantPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SystemIndependantPackage.eNS_URI, theSystemIndependantPackage);
		return theSystemIndependantPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getService() {
		return serviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getService_CorrespondingSignature() {
		return (EReference) serviceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getType() {
		return typeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getParameter() {
		return parameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getParameter_Type() {
		return (EReference) parameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRepository() {
		return repositoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRepository_Components() {
		return (EReference) repositoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRepository_Interfaces() {
		return (EReference) repositoryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRepository_Types() {
		return (EReference) repositoryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getComplexType() {
		return complexTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComplexType_Type() {
		return (EAttribute) complexTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComplexType_Attributes() {
		return (EReference) complexTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExternalCall() {
		return externalCallEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSignature() {
		return signatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSignature_Parameters() {
		return (EReference) signatureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSignature_ReturnType() {
		return (EReference) signatureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInternalAction() {
		return internalActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAction() {
		return actionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBranch() {
		return branchEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBranch_Actions() {
		return (EReference) branchEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBranch_Condition() {
		return (EAttribute) branchEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInterface() {
		return interfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInterface_Signatures() {
		return (EReference) interfaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getComponent() {
		return componentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponent_ProvidedInterfaces() {
		return (EReference) componentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponent_ProvidedServices() {
		return (EReference) componentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponent_RequiredInterfaces() {
		return (EReference) componentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponent_BehaviorDescription() {
		return (EReference) componentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSimpleType() {
		return simpleTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSimpleType_Type() {
		return (EAttribute) simpleTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBasicComponent() {
		return basicComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLoop() {
		return loopEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLoop_Actions() {
		return (EReference) loopEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLoop_Condition() {
		return (EAttribute) loopEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getSimpleTypeEnum() {
		return simpleTypeEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SystemIndependantFactory getSystemIndependantFactory() {
		return (SystemIndependantFactory) getEFactoryInstance();
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
		serviceEClass = createEClass(SERVICE);
		createEReference(serviceEClass, SERVICE__CORRESPONDING_SIGNATURE);

		typeEClass = createEClass(TYPE);

		parameterEClass = createEClass(PARAMETER);
		createEReference(parameterEClass, PARAMETER__TYPE);

		repositoryEClass = createEClass(REPOSITORY);
		createEReference(repositoryEClass, REPOSITORY__COMPONENTS);
		createEReference(repositoryEClass, REPOSITORY__INTERFACES);
		createEReference(repositoryEClass, REPOSITORY__TYPES);

		complexTypeEClass = createEClass(COMPLEX_TYPE);
		createEAttribute(complexTypeEClass, COMPLEX_TYPE__TYPE);
		createEReference(complexTypeEClass, COMPLEX_TYPE__ATTRIBUTES);

		externalCallEClass = createEClass(EXTERNAL_CALL);

		signatureEClass = createEClass(SIGNATURE);
		createEReference(signatureEClass, SIGNATURE__PARAMETERS);
		createEReference(signatureEClass, SIGNATURE__RETURN_TYPE);

		internalActionEClass = createEClass(INTERNAL_ACTION);

		actionEClass = createEClass(ACTION);

		branchEClass = createEClass(BRANCH);
		createEReference(branchEClass, BRANCH__ACTIONS);
		createEAttribute(branchEClass, BRANCH__CONDITION);

		interfaceEClass = createEClass(INTERFACE);
		createEReference(interfaceEClass, INTERFACE__SIGNATURES);

		componentEClass = createEClass(COMPONENT);
		createEReference(componentEClass, COMPONENT__PROVIDED_INTERFACES);
		createEReference(componentEClass, COMPONENT__PROVIDED_SERVICES);
		createEReference(componentEClass, COMPONENT__REQUIRED_INTERFACES);
		createEReference(componentEClass, COMPONENT__BEHAVIOR_DESCRIPTION);

		simpleTypeEClass = createEClass(SIMPLE_TYPE);
		createEAttribute(simpleTypeEClass, SIMPLE_TYPE__TYPE);

		basicComponentEClass = createEClass(BASIC_COMPONENT);

		loopEClass = createEClass(LOOP);
		createEReference(loopEClass, LOOP__ACTIONS);
		createEAttribute(loopEClass, LOOP__CONDITION);

		// Create enums
		simpleTypeEnumEEnum = createEEnum(SIMPLE_TYPE_ENUM);
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
		MDSDComponentMetamodelPackage theMDSDComponentMetamodelPackage = (MDSDComponentMetamodelPackage) EPackage.Registry.INSTANCE
				.getEPackage(MDSDComponentMetamodelPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		serviceEClass.getESuperTypes().add(theMDSDComponentMetamodelPackage.getNamedElement());
		typeEClass.getESuperTypes().add(theMDSDComponentMetamodelPackage.getNamedElement());
		parameterEClass.getESuperTypes().add(theMDSDComponentMetamodelPackage.getNamedElement());
		complexTypeEClass.getESuperTypes().add(this.getType());
		externalCallEClass.getESuperTypes().add(this.getAction());
		signatureEClass.getESuperTypes().add(theMDSDComponentMetamodelPackage.getNamedElement());
		internalActionEClass.getESuperTypes().add(this.getAction());
		actionEClass.getESuperTypes().add(theMDSDComponentMetamodelPackage.getNamedElement());
		branchEClass.getESuperTypes().add(this.getAction());
		interfaceEClass.getESuperTypes().add(theMDSDComponentMetamodelPackage.getNamedElement());
		componentEClass.getESuperTypes().add(theMDSDComponentMetamodelPackage.getNamedElement());
		simpleTypeEClass.getESuperTypes().add(this.getType());
		basicComponentEClass.getESuperTypes().add(this.getComponent());
		loopEClass.getESuperTypes().add(this.getAction());

		// Initialize classes, features, and operations; add parameters
		initEClass(serviceEClass, Service.class, "Service", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getService_CorrespondingSignature(), this.getSignature(), null, "correspondingSignature", null,
				1, 1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeEClass, Type.class, "Type", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(parameterEClass, Parameter.class, "Parameter", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParameter_Type(), this.getType(), null, "type", null, 1, 1, Parameter.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(repositoryEClass, Repository.class, "Repository", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRepository_Components(), this.getBasicComponent(), null, "components", null, 0, -1,
				Repository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRepository_Interfaces(), this.getInterface(), null, "interfaces", null, 0, -1,
				Repository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRepository_Types(), this.getType(), null, "types", null, 0, -1, Repository.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(complexTypeEClass, ComplexType.class, "ComplexType", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		EGenericType g1 = createEGenericType(ecorePackage.getEJavaClass());
		EGenericType g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEAttribute(getComplexType_Type(), g1, "type", null, 1, 1, ComplexType.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComplexType_Attributes(), this.getParameter(), null, "attributes", null, 0, -1,
				ComplexType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(externalCallEClass, ExternalCall.class, "ExternalCall", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(signatureEClass, Signature.class, "Signature", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSignature_Parameters(), this.getParameter(), null, "parameters", null, 0, -1, Signature.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSignature_ReturnType(), this.getType(), null, "returnType", null, 0, 1, Signature.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(internalActionEClass, InternalAction.class, "InternalAction", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(actionEClass, Action.class, "Action", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(branchEClass, Branch.class, "Branch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBranch_Actions(), this.getAction(), null, "actions", null, 0, -1, Branch.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getBranch_Condition(), ecorePackage.getEString(), "condition", null, 1, 1, Branch.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(interfaceEClass, Interface.class, "Interface", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInterface_Signatures(), this.getSignature(), null, "signatures", null, 0, -1, Interface.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(componentEClass, Component.class, "Component", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComponent_ProvidedInterfaces(), this.getInterface(), null, "providedInterfaces", null, 0, -1,
				Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponent_ProvidedServices(), this.getService(), null, "providedServices", null, 0, -1,
				Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponent_RequiredInterfaces(), this.getInterface(), null, "requiredInterfaces", null, 0, -1,
				Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponent_BehaviorDescription(), this.getAction(), null, "behaviorDescription", null, 0, -1,
				Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(simpleTypeEClass, SimpleType.class, "SimpleType", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSimpleType_Type(), this.getSimpleTypeEnum(), "type", null, 1, 1, SimpleType.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(basicComponentEClass, BasicComponent.class, "BasicComponent", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(loopEClass, Loop.class, "Loop", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLoop_Actions(), this.getAction(), null, "actions", null, 0, -1, Loop.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getLoop_Condition(), ecorePackage.getEString(), "condition", null, 1, 1, Loop.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(simpleTypeEnumEEnum, SimpleTypeEnum.class, "SimpleTypeEnum");
		addEEnumLiteral(simpleTypeEnumEEnum, SimpleTypeEnum.BOOLEAN);
		addEEnumLiteral(simpleTypeEnumEEnum, SimpleTypeEnum.CHAR);
		addEEnumLiteral(simpleTypeEnumEEnum, SimpleTypeEnum.DATE);
		addEEnumLiteral(simpleTypeEnumEEnum, SimpleTypeEnum.DOUBLE);
		addEEnumLiteral(simpleTypeEnumEEnum, SimpleTypeEnum.FLOAT);
		addEEnumLiteral(simpleTypeEnumEEnum, SimpleTypeEnum.LIST);
		addEEnumLiteral(simpleTypeEnumEEnum, SimpleTypeEnum.INT);
		addEEnumLiteral(simpleTypeEnumEEnum, SimpleTypeEnum.LONG);
		addEEnumLiteral(simpleTypeEnumEEnum, SimpleTypeEnum.MAP);
		addEEnumLiteral(simpleTypeEnumEEnum, SimpleTypeEnum.STRING);
	}

} //SystemIndependantPackageImpl
