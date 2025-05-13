/*******************************************************************************
 *************************************************************************
 * This code is 100% auto-generated
 * from:
 * using:
 *   /MDSDComponentMetamodel/model/MDSDComponentMetamodel.genmodel
 *   org.eclipse.ocl.examples.codegen.oclinecore.OCLinEcoreTables
 *
 * Do not edit it.
 *******************************************************************************/
package MDSDComponentMetamodel.SystemDependant;

import MDSDComponentMetamodel.MDSDComponentMetamodelPackage;
import MDSDComponentMetamodel.MDSDComponentMetamodelTables;
// import MDSDComponentMetamodel.SystemDependant.SystemDependantPackage;
// import MDSDComponentMetamodel.SystemDependant.SystemDependantTables;
import MDSDComponentMetamodel.SystemIndependant.SystemIndependantPackage;
import MDSDComponentMetamodel.SystemIndependant.SystemIndependantTables;
import org.eclipse.ocl.pivot.ids.ClassId;
import org.eclipse.ocl.pivot.ids.CollectionTypeId;
import org.eclipse.ocl.pivot.ids.IdManager;
import org.eclipse.ocl.pivot.ids.NsURIPackageId;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorPackage;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorType;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreLibraryOppositeProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorFragment;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorOperation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorPropertyWithImplementation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorStandardLibrary;
import org.eclipse.ocl.pivot.oclstdlib.OCLstdlibTables;
import org.eclipse.ocl.pivot.utilities.AbstractTables;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;

/**
 * SystemDependantTables provides the dispatch tables for the SystemDependant for use by the OCL dispatcher.
 *
 * In order to ensure correct static initialization, a top level class element must be accessed
 * before any nested class element. Therefore an access to PACKAGE.getClass() is recommended.
 */
public class SystemDependantTables extends AbstractTables
{
	static {
		Init.initStart();
	}

	/**
	 *	The package descriptor for the package.
	 */
	public static final EcoreExecutorPackage PACKAGE = new EcoreExecutorPackage(SystemDependantPackage.eINSTANCE);

	/**
	 *	The library of all packages and types.
	 */
	public static final ExecutorStandardLibrary LIBRARY = OCLstdlibTables.LIBRARY;

	/**
	 *	Constants used by auto-generated code.
	 */
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_SystemDependant = IdManager.getNsURIPackageId("SystemDependant", null, SystemDependantPackage.eINSTANCE);
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_SystemIndependant = IdManager.getNsURIPackageId("SystemIndependant", null, SystemIndependantPackage.eINSTANCE);
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_http_c_s_s_www_example_org_s_MDSDComponentMetamodel = IdManager.getNsURIPackageId("http://www.example.org/MDSDComponentMetamodel", null, MDSDComponentMetamodelPackage.eINSTANCE);
	public static final /*@NonInvalid*/ ClassId CLSSid_Allocation = SystemDependantTables.PACKid_SystemDependant.getClassId("Allocation", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_AllocationContext = SystemDependantTables.PACKid_SystemDependant.getClassId("AllocationContext", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Assembly = SystemDependantTables.PACKid_SystemDependant.getClassId("Assembly", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_AssemblyConnector = SystemDependantTables.PACKid_SystemDependant.getClassId("AssemblyConnector", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_AssemblyContext = SystemDependantTables.PACKid_SystemDependant.getClassId("AssemblyContext", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Component = SystemDependantTables.PACKid_SystemIndependant.getClassId("Component", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_ComponentSystem = SystemDependantTables.PACKid_http_c_s_s_www_example_org_s_MDSDComponentMetamodel.getClassId("ComponentSystem", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_CompositeComponent = SystemDependantTables.PACKid_SystemDependant.getClassId("CompositeComponent", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Container = SystemDependantTables.PACKid_SystemDependant.getClassId("Container", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_DelegationConnector = SystemDependantTables.PACKid_SystemDependant.getClassId("DelegationConnector", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Environment = SystemDependantTables.PACKid_SystemDependant.getClassId("Environment", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Interface = SystemDependantTables.PACKid_SystemIndependant.getClassId("Interface", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Link = SystemDependantTables.PACKid_SystemDependant.getClassId("Link", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Role = SystemDependantTables.PACKid_SystemDependant.getClassId("Role", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_System = SystemDependantTables.PACKid_SystemDependant.getClassId("System", 0);
	public static final /*@NonInvalid*/ IntegerValue INT_0 = ValueUtil.integerValueOf("0");
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_AllocationContext = TypeId.BAG.getSpecializedId(SystemDependantTables.CLSSid_AllocationContext, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_AssemblyConnector = TypeId.BAG.getSpecializedId(SystemDependantTables.CLSSid_AssemblyConnector, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_DelegationConnector = TypeId.BAG.getSpecializedId(SystemDependantTables.CLSSid_DelegationConnector, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_AllocationContext = TypeId.ORDERED_SET.getSpecializedId(SystemDependantTables.CLSSid_AllocationContext, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_AssemblyConnector = TypeId.ORDERED_SET.getSpecializedId(SystemDependantTables.CLSSid_AssemblyConnector, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_AssemblyContext = TypeId.ORDERED_SET.getSpecializedId(SystemDependantTables.CLSSid_AssemblyContext, true, ValueUtil.integerValueOf(2), ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_AssemblyContext_0 = TypeId.ORDERED_SET.getSpecializedId(SystemDependantTables.CLSSid_AssemblyContext, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_CompositeComponent = TypeId.ORDERED_SET.getSpecializedId(SystemDependantTables.CLSSid_CompositeComponent, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Container = TypeId.ORDERED_SET.getSpecializedId(SystemDependantTables.CLSSid_Container, true, ValueUtil.integerValueOf(2), ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Container_0 = TypeId.ORDERED_SET.getSpecializedId(SystemDependantTables.CLSSid_Container, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_DelegationConnector = TypeId.ORDERED_SET.getSpecializedId(SystemDependantTables.CLSSid_DelegationConnector, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Interface = TypeId.ORDERED_SET.getSpecializedId(SystemDependantTables.CLSSid_Interface, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Interface_0 = TypeId.ORDERED_SET.getSpecializedId(SystemDependantTables.CLSSid_Interface, true, ValueUtil.ONE_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Link = TypeId.ORDERED_SET.getSpecializedId(SystemDependantTables.CLSSid_Link, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Role = TypeId.ORDERED_SET.getSpecializedId(SystemDependantTables.CLSSid_Role, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);

	/**
	 *	The type parameters for templated types and operations.
	 */
	public static class TypeParameters {
		static {
			Init.initStart();
			SystemDependantTables.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of SystemDependantTables::TypeParameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The type descriptors for each type.
	 */
	public static class Types {
		static {
			Init.initStart();
			TypeParameters.init();
		}

		public static final EcoreExecutorType _Allocation = new EcoreExecutorType(SystemDependantPackage.Literals.ALLOCATION, PACKAGE, 0);
		public static final EcoreExecutorType _AllocationContext = new EcoreExecutorType(SystemDependantPackage.Literals.ALLOCATION_CONTEXT, PACKAGE, 0);
		public static final EcoreExecutorType _Assembly = new EcoreExecutorType(SystemDependantPackage.Literals.ASSEMBLY, PACKAGE, 0);
		public static final EcoreExecutorType _AssemblyConnector = new EcoreExecutorType(SystemDependantPackage.Literals.ASSEMBLY_CONNECTOR, PACKAGE, 0);
		public static final EcoreExecutorType _AssemblyContext = new EcoreExecutorType(SystemDependantPackage.Literals.ASSEMBLY_CONTEXT, PACKAGE, 0);
		public static final EcoreExecutorType _CompositeComponent = new EcoreExecutorType(SystemDependantPackage.Literals.COMPOSITE_COMPONENT, PACKAGE, 0);
		public static final EcoreExecutorType _Container = new EcoreExecutorType(SystemDependantPackage.Literals.CONTAINER, PACKAGE, 0);
		public static final EcoreExecutorType _DelegationConnector = new EcoreExecutorType(SystemDependantPackage.Literals.DELEGATION_CONNECTOR, PACKAGE, 0);
		public static final EcoreExecutorType _Environment = new EcoreExecutorType(SystemDependantPackage.Literals.ENVIRONMENT, PACKAGE, 0);
		public static final EcoreExecutorType _Link = new EcoreExecutorType(SystemDependantPackage.Literals.LINK, PACKAGE, 0);
		public static final EcoreExecutorType _Role = new EcoreExecutorType(SystemDependantPackage.Literals.ROLE, PACKAGE, 0);
		public static final EcoreExecutorType _System = new EcoreExecutorType(SystemDependantPackage.Literals.SYSTEM, PACKAGE, 0);

		private static final EcoreExecutorType /*@NonNull*/ [] types = {
			_Allocation,
			_AllocationContext,
			_Assembly,
			_AssemblyConnector,
			_AssemblyContext,
			_CompositeComponent,
			_Container,
			_DelegationConnector,
			_Environment,
			_Link,
			_Role,
			_System
		};

		/*
		 *	Install the type descriptors in the package descriptor.
		 */
		static {
			PACKAGE.init(LIBRARY, types);
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of SystemDependantTables::Types and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragment descriptors for the local elements of each type and its supertypes.
	 */
	public static class Fragments {
		static {
			Init.initStart();
			Types.init();
		}

		private static final ExecutorFragment _Allocation__Allocation = new ExecutorFragment(Types._Allocation, SystemDependantTables.Types._Allocation);
		private static final ExecutorFragment _Allocation__OclAny = new ExecutorFragment(Types._Allocation, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Allocation__OclElement = new ExecutorFragment(Types._Allocation, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _AllocationContext__AllocationContext = new ExecutorFragment(Types._AllocationContext, SystemDependantTables.Types._AllocationContext);
		private static final ExecutorFragment _AllocationContext__NamedElement = new ExecutorFragment(Types._AllocationContext, MDSDComponentMetamodelTables.Types._NamedElement);
		private static final ExecutorFragment _AllocationContext__OclAny = new ExecutorFragment(Types._AllocationContext, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _AllocationContext__OclElement = new ExecutorFragment(Types._AllocationContext, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Assembly__Assembly = new ExecutorFragment(Types._Assembly, SystemDependantTables.Types._Assembly);
		private static final ExecutorFragment _Assembly__OclAny = new ExecutorFragment(Types._Assembly, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Assembly__OclElement = new ExecutorFragment(Types._Assembly, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _AssemblyConnector__AssemblyConnector = new ExecutorFragment(Types._AssemblyConnector, SystemDependantTables.Types._AssemblyConnector);
		private static final ExecutorFragment _AssemblyConnector__NamedElement = new ExecutorFragment(Types._AssemblyConnector, MDSDComponentMetamodelTables.Types._NamedElement);
		private static final ExecutorFragment _AssemblyConnector__OclAny = new ExecutorFragment(Types._AssemblyConnector, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _AssemblyConnector__OclElement = new ExecutorFragment(Types._AssemblyConnector, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _AssemblyContext__AssemblyContext = new ExecutorFragment(Types._AssemblyContext, SystemDependantTables.Types._AssemblyContext);
		private static final ExecutorFragment _AssemblyContext__NamedElement = new ExecutorFragment(Types._AssemblyContext, MDSDComponentMetamodelTables.Types._NamedElement);
		private static final ExecutorFragment _AssemblyContext__OclAny = new ExecutorFragment(Types._AssemblyContext, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _AssemblyContext__OclElement = new ExecutorFragment(Types._AssemblyContext, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _CompositeComponent__Component = new ExecutorFragment(Types._CompositeComponent, SystemIndependantTables.Types._Component);
		private static final ExecutorFragment _CompositeComponent__CompositeComponent = new ExecutorFragment(Types._CompositeComponent, SystemDependantTables.Types._CompositeComponent);
		private static final ExecutorFragment _CompositeComponent__NamedElement = new ExecutorFragment(Types._CompositeComponent, MDSDComponentMetamodelTables.Types._NamedElement);
		private static final ExecutorFragment _CompositeComponent__OclAny = new ExecutorFragment(Types._CompositeComponent, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _CompositeComponent__OclElement = new ExecutorFragment(Types._CompositeComponent, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Container__Container = new ExecutorFragment(Types._Container, SystemDependantTables.Types._Container);
		private static final ExecutorFragment _Container__NamedElement = new ExecutorFragment(Types._Container, MDSDComponentMetamodelTables.Types._NamedElement);
		private static final ExecutorFragment _Container__OclAny = new ExecutorFragment(Types._Container, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Container__OclElement = new ExecutorFragment(Types._Container, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _DelegationConnector__DelegationConnector = new ExecutorFragment(Types._DelegationConnector, SystemDependantTables.Types._DelegationConnector);
		private static final ExecutorFragment _DelegationConnector__NamedElement = new ExecutorFragment(Types._DelegationConnector, MDSDComponentMetamodelTables.Types._NamedElement);
		private static final ExecutorFragment _DelegationConnector__OclAny = new ExecutorFragment(Types._DelegationConnector, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _DelegationConnector__OclElement = new ExecutorFragment(Types._DelegationConnector, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Environment__Environment = new ExecutorFragment(Types._Environment, SystemDependantTables.Types._Environment);
		private static final ExecutorFragment _Environment__OclAny = new ExecutorFragment(Types._Environment, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Environment__OclElement = new ExecutorFragment(Types._Environment, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Link__Link = new ExecutorFragment(Types._Link, SystemDependantTables.Types._Link);
		private static final ExecutorFragment _Link__NamedElement = new ExecutorFragment(Types._Link, MDSDComponentMetamodelTables.Types._NamedElement);
		private static final ExecutorFragment _Link__OclAny = new ExecutorFragment(Types._Link, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Link__OclElement = new ExecutorFragment(Types._Link, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Role__NamedElement = new ExecutorFragment(Types._Role, MDSDComponentMetamodelTables.Types._NamedElement);
		private static final ExecutorFragment _Role__OclAny = new ExecutorFragment(Types._Role, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Role__OclElement = new ExecutorFragment(Types._Role, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Role__Role = new ExecutorFragment(Types._Role, SystemDependantTables.Types._Role);

		private static final ExecutorFragment _System__OclAny = new ExecutorFragment(Types._System, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _System__OclElement = new ExecutorFragment(Types._System, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _System__System = new ExecutorFragment(Types._System, SystemDependantTables.Types._System);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of SystemDependantTables::Fragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The parameter lists shared by operations.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Parameters {
		static {
			Init.initStart();
			Fragments.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of SystemDependantTables::Parameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The operation descriptors for each operation of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Operations {
		static {
			Init.initStart();
			Parameters.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of SystemDependantTables::Operations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The property descriptors for each property of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Properties {
		static {
			Init.initStart();
			Operations.init();
		}

		public static final ExecutorProperty _Allocation__allocationContexts = new EcoreExecutorProperty(SystemDependantPackage.Literals.ALLOCATION__ALLOCATION_CONTEXTS, Types._Allocation, 0);
		public static final ExecutorProperty _Allocation__System__allocation = new ExecutorPropertyWithImplementation("System", Types._Allocation, 1, new EcoreLibraryOppositeProperty(SystemDependantPackage.Literals.SYSTEM__ALLOCATION));

		public static final ExecutorProperty _AllocationContext__assemblyContext = new EcoreExecutorProperty(SystemDependantPackage.Literals.ALLOCATION_CONTEXT__ASSEMBLY_CONTEXT, Types._AllocationContext, 0);
		public static final ExecutorProperty _AllocationContext__container = new EcoreExecutorProperty(SystemDependantPackage.Literals.ALLOCATION_CONTEXT__CONTAINER, Types._AllocationContext, 1);
		public static final ExecutorProperty _AllocationContext__Allocation__allocationContexts = new ExecutorPropertyWithImplementation("Allocation", Types._AllocationContext, 2, new EcoreLibraryOppositeProperty(SystemDependantPackage.Literals.ALLOCATION__ALLOCATION_CONTEXTS));

		public static final ExecutorProperty _Assembly__assemblyConnectors = new EcoreExecutorProperty(SystemDependantPackage.Literals.ASSEMBLY__ASSEMBLY_CONNECTORS, Types._Assembly, 0);
		public static final ExecutorProperty _Assembly__assemblyContexts = new EcoreExecutorProperty(SystemDependantPackage.Literals.ASSEMBLY__ASSEMBLY_CONTEXTS, Types._Assembly, 1);
		public static final ExecutorProperty _Assembly__compositeComponents = new EcoreExecutorProperty(SystemDependantPackage.Literals.ASSEMBLY__COMPOSITE_COMPONENTS, Types._Assembly, 2);
		public static final ExecutorProperty _Assembly__delegationConnectors = new EcoreExecutorProperty(SystemDependantPackage.Literals.ASSEMBLY__DELEGATION_CONNECTORS, Types._Assembly, 3);
		public static final ExecutorProperty _Assembly__System__assembly = new ExecutorPropertyWithImplementation("System", Types._Assembly, 4, new EcoreLibraryOppositeProperty(SystemDependantPackage.Literals.SYSTEM__ASSEMBLY));

		public static final ExecutorProperty _AssemblyConnector__providedRole = new EcoreExecutorProperty(SystemDependantPackage.Literals.ASSEMBLY_CONNECTOR__PROVIDED_ROLE, Types._AssemblyConnector, 0);
		public static final ExecutorProperty _AssemblyConnector__requiredRole = new EcoreExecutorProperty(SystemDependantPackage.Literals.ASSEMBLY_CONNECTOR__REQUIRED_ROLE, Types._AssemblyConnector, 1);
		public static final ExecutorProperty _AssemblyConnector__Assembly__assemblyConnectors = new ExecutorPropertyWithImplementation("Assembly", Types._AssemblyConnector, 2, new EcoreLibraryOppositeProperty(SystemDependantPackage.Literals.ASSEMBLY__ASSEMBLY_CONNECTORS));
		public static final ExecutorProperty _AssemblyConnector__CompositeComponent__assemblyConnectors = new ExecutorPropertyWithImplementation("CompositeComponent", Types._AssemblyConnector, 3, new EcoreLibraryOppositeProperty(SystemDependantPackage.Literals.COMPOSITE_COMPONENT__ASSEMBLY_CONNECTORS));

		public static final ExecutorProperty _AssemblyContext__allocationContext = new EcoreExecutorProperty(SystemDependantPackage.Literals.ASSEMBLY_CONTEXT__ALLOCATION_CONTEXT, Types._AssemblyContext, 0);
		public static final ExecutorProperty _AssemblyContext__component = new EcoreExecutorProperty(SystemDependantPackage.Literals.ASSEMBLY_CONTEXT__COMPONENT, Types._AssemblyContext, 1);
		public static final ExecutorProperty _AssemblyContext__providedRoles = new EcoreExecutorProperty(SystemDependantPackage.Literals.ASSEMBLY_CONTEXT__PROVIDED_ROLES, Types._AssemblyContext, 2);
		public static final ExecutorProperty _AssemblyContext__requiredRoles = new EcoreExecutorProperty(SystemDependantPackage.Literals.ASSEMBLY_CONTEXT__REQUIRED_ROLES, Types._AssemblyContext, 3);
		public static final ExecutorProperty _AssemblyContext__Assembly__assemblyContexts = new ExecutorPropertyWithImplementation("Assembly", Types._AssemblyContext, 4, new EcoreLibraryOppositeProperty(SystemDependantPackage.Literals.ASSEMBLY__ASSEMBLY_CONTEXTS));
		public static final ExecutorProperty _AssemblyContext__CompositeComponent__assemblyContexts = new ExecutorPropertyWithImplementation("CompositeComponent", Types._AssemblyContext, 5, new EcoreLibraryOppositeProperty(SystemDependantPackage.Literals.COMPOSITE_COMPONENT__ASSEMBLY_CONTEXTS));

		public static final ExecutorProperty _CompositeComponent__assemblyConnectors = new EcoreExecutorProperty(SystemDependantPackage.Literals.COMPOSITE_COMPONENT__ASSEMBLY_CONNECTORS, Types._CompositeComponent, 0);
		public static final ExecutorProperty _CompositeComponent__assemblyContexts = new EcoreExecutorProperty(SystemDependantPackage.Literals.COMPOSITE_COMPONENT__ASSEMBLY_CONTEXTS, Types._CompositeComponent, 1);
		public static final ExecutorProperty _CompositeComponent__delegationConnectors = new EcoreExecutorProperty(SystemDependantPackage.Literals.COMPOSITE_COMPONENT__DELEGATION_CONNECTORS, Types._CompositeComponent, 2);
		public static final ExecutorProperty _CompositeComponent__Assembly__compositeComponents = new ExecutorPropertyWithImplementation("Assembly", Types._CompositeComponent, 3, new EcoreLibraryOppositeProperty(SystemDependantPackage.Literals.ASSEMBLY__COMPOSITE_COMPONENTS));

		public static final ExecutorProperty _Container__links = new EcoreExecutorProperty(SystemDependantPackage.Literals.CONTAINER__LINKS, Types._Container, 0);
		public static final ExecutorProperty _Container__AllocationContext__container = new ExecutorPropertyWithImplementation("AllocationContext", Types._Container, 1, new EcoreLibraryOppositeProperty(SystemDependantPackage.Literals.ALLOCATION_CONTEXT__CONTAINER));
		public static final ExecutorProperty _Container__Environment__containers = new ExecutorPropertyWithImplementation("Environment", Types._Container, 2, new EcoreLibraryOppositeProperty(SystemDependantPackage.Literals.ENVIRONMENT__CONTAINERS));

		public static final ExecutorProperty _DelegationConnector__delegatedInterface = new EcoreExecutorProperty(SystemDependantPackage.Literals.DELEGATION_CONNECTOR__DELEGATED_INTERFACE, Types._DelegationConnector, 0);
		public static final ExecutorProperty _DelegationConnector__role = new EcoreExecutorProperty(SystemDependantPackage.Literals.DELEGATION_CONNECTOR__ROLE, Types._DelegationConnector, 1);
		public static final ExecutorProperty _DelegationConnector__Assembly__delegationConnectors = new ExecutorPropertyWithImplementation("Assembly", Types._DelegationConnector, 2, new EcoreLibraryOppositeProperty(SystemDependantPackage.Literals.ASSEMBLY__DELEGATION_CONNECTORS));
		public static final ExecutorProperty _DelegationConnector__CompositeComponent__delegationConnectors = new ExecutorPropertyWithImplementation("CompositeComponent", Types._DelegationConnector, 3, new EcoreLibraryOppositeProperty(SystemDependantPackage.Literals.COMPOSITE_COMPONENT__DELEGATION_CONNECTORS));

		public static final ExecutorProperty _Environment__containers = new EcoreExecutorProperty(SystemDependantPackage.Literals.ENVIRONMENT__CONTAINERS, Types._Environment, 0);
		public static final ExecutorProperty _Environment__links = new EcoreExecutorProperty(SystemDependantPackage.Literals.ENVIRONMENT__LINKS, Types._Environment, 1);
		public static final ExecutorProperty _Environment__System__environment = new ExecutorPropertyWithImplementation("System", Types._Environment, 2, new EcoreLibraryOppositeProperty(SystemDependantPackage.Literals.SYSTEM__ENVIRONMENT));

		public static final ExecutorProperty _Link__containers = new EcoreExecutorProperty(SystemDependantPackage.Literals.LINK__CONTAINERS, Types._Link, 0);
		public static final ExecutorProperty _Link__Environment__links = new ExecutorPropertyWithImplementation("Environment", Types._Link, 1, new EcoreLibraryOppositeProperty(SystemDependantPackage.Literals.ENVIRONMENT__LINKS));

		public static final ExecutorProperty _Role__interface = new EcoreExecutorProperty(SystemDependantPackage.Literals.ROLE__INTERFACE, Types._Role, 0);
		public static final ExecutorProperty _Role__providedAssemblyContext = new EcoreExecutorProperty(SystemDependantPackage.Literals.ROLE__PROVIDED_ASSEMBLY_CONTEXT, Types._Role, 1);
		public static final ExecutorProperty _Role__requiredAssemblyContext = new EcoreExecutorProperty(SystemDependantPackage.Literals.ROLE__REQUIRED_ASSEMBLY_CONTEXT, Types._Role, 2);
		public static final ExecutorProperty _Role__AssemblyConnector__providedRole = new ExecutorPropertyWithImplementation("AssemblyConnector", Types._Role, 3, new EcoreLibraryOppositeProperty(SystemDependantPackage.Literals.ASSEMBLY_CONNECTOR__PROVIDED_ROLE));
		public static final ExecutorProperty _Role__AssemblyConnector__requiredRole = new ExecutorPropertyWithImplementation("AssemblyConnector", Types._Role, 4, new EcoreLibraryOppositeProperty(SystemDependantPackage.Literals.ASSEMBLY_CONNECTOR__REQUIRED_ROLE));
		public static final ExecutorProperty _Role__DelegationConnector__role = new ExecutorPropertyWithImplementation("DelegationConnector", Types._Role, 5, new EcoreLibraryOppositeProperty(SystemDependantPackage.Literals.DELEGATION_CONNECTOR__ROLE));

		public static final ExecutorProperty _System__allocation = new EcoreExecutorProperty(SystemDependantPackage.Literals.SYSTEM__ALLOCATION, Types._System, 0);
		public static final ExecutorProperty _System__assembly = new EcoreExecutorProperty(SystemDependantPackage.Literals.SYSTEM__ASSEMBLY, Types._System, 1);
		public static final ExecutorProperty _System__environment = new EcoreExecutorProperty(SystemDependantPackage.Literals.SYSTEM__ENVIRONMENT, Types._System, 2);
		public static final ExecutorProperty _System__interfaces = new EcoreExecutorProperty(SystemDependantPackage.Literals.SYSTEM__INTERFACES, Types._System, 3);
		public static final ExecutorProperty _System__ComponentSystem__system = new ExecutorPropertyWithImplementation("ComponentSystem", Types._System, 4, new EcoreLibraryOppositeProperty(MDSDComponentMetamodelPackage.Literals.COMPONENT_SYSTEM__SYSTEM));
		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of SystemDependantTables::Properties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragments for all base types in depth order: OclAny first, OclSelf last.
	 */
	public static class TypeFragments {
		static {
			Init.initStart();
			Properties.init();
		}

		private static final ExecutorFragment /*@NonNull*/ [] _Allocation =
			{
				Fragments._Allocation__OclAny /* 0 */,
				Fragments._Allocation__OclElement /* 1 */,
				Fragments._Allocation__Allocation /* 2 */
			};
		private static final int /*@NonNull*/ [] __Allocation = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _AllocationContext =
			{
				Fragments._AllocationContext__OclAny /* 0 */,
				Fragments._AllocationContext__OclElement /* 1 */,
				Fragments._AllocationContext__NamedElement /* 2 */,
				Fragments._AllocationContext__AllocationContext /* 3 */
			};
		private static final int /*@NonNull*/ [] __AllocationContext = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Assembly =
			{
				Fragments._Assembly__OclAny /* 0 */,
				Fragments._Assembly__OclElement /* 1 */,
				Fragments._Assembly__Assembly /* 2 */
			};
		private static final int /*@NonNull*/ [] __Assembly = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _AssemblyConnector =
			{
				Fragments._AssemblyConnector__OclAny /* 0 */,
				Fragments._AssemblyConnector__OclElement /* 1 */,
				Fragments._AssemblyConnector__NamedElement /* 2 */,
				Fragments._AssemblyConnector__AssemblyConnector /* 3 */
			};
		private static final int /*@NonNull*/ [] __AssemblyConnector = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _AssemblyContext =
			{
				Fragments._AssemblyContext__OclAny /* 0 */,
				Fragments._AssemblyContext__OclElement /* 1 */,
				Fragments._AssemblyContext__NamedElement /* 2 */,
				Fragments._AssemblyContext__AssemblyContext /* 3 */
			};
		private static final int /*@NonNull*/ [] __AssemblyContext = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _CompositeComponent =
			{
				Fragments._CompositeComponent__OclAny /* 0 */,
				Fragments._CompositeComponent__OclElement /* 1 */,
				Fragments._CompositeComponent__NamedElement /* 2 */,
				Fragments._CompositeComponent__Component /* 3 */,
				Fragments._CompositeComponent__CompositeComponent /* 4 */
			};
		private static final int /*@NonNull*/ [] __CompositeComponent = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Container =
			{
				Fragments._Container__OclAny /* 0 */,
				Fragments._Container__OclElement /* 1 */,
				Fragments._Container__NamedElement /* 2 */,
				Fragments._Container__Container /* 3 */
			};
		private static final int /*@NonNull*/ [] __Container = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _DelegationConnector =
			{
				Fragments._DelegationConnector__OclAny /* 0 */,
				Fragments._DelegationConnector__OclElement /* 1 */,
				Fragments._DelegationConnector__NamedElement /* 2 */,
				Fragments._DelegationConnector__DelegationConnector /* 3 */
			};
		private static final int /*@NonNull*/ [] __DelegationConnector = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Environment =
			{
				Fragments._Environment__OclAny /* 0 */,
				Fragments._Environment__OclElement /* 1 */,
				Fragments._Environment__Environment /* 2 */
			};
		private static final int /*@NonNull*/ [] __Environment = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Link =
			{
				Fragments._Link__OclAny /* 0 */,
				Fragments._Link__OclElement /* 1 */,
				Fragments._Link__NamedElement /* 2 */,
				Fragments._Link__Link /* 3 */
			};
		private static final int /*@NonNull*/ [] __Link = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Role =
			{
				Fragments._Role__OclAny /* 0 */,
				Fragments._Role__OclElement /* 1 */,
				Fragments._Role__NamedElement /* 2 */,
				Fragments._Role__Role /* 3 */
			};
		private static final int /*@NonNull*/ [] __Role = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _System =
			{
				Fragments._System__OclAny /* 0 */,
				Fragments._System__OclElement /* 1 */,
				Fragments._System__System /* 2 */
			};
		private static final int /*@NonNull*/ [] __System = { 1,1,1 };

		/**
		 *	Install the fragment descriptors in the class descriptors.
		 */
		static {
			Types._Allocation.initFragments(_Allocation, __Allocation);
			Types._AllocationContext.initFragments(_AllocationContext, __AllocationContext);
			Types._Assembly.initFragments(_Assembly, __Assembly);
			Types._AssemblyConnector.initFragments(_AssemblyConnector, __AssemblyConnector);
			Types._AssemblyContext.initFragments(_AssemblyContext, __AssemblyContext);
			Types._CompositeComponent.initFragments(_CompositeComponent, __CompositeComponent);
			Types._Container.initFragments(_Container, __Container);
			Types._DelegationConnector.initFragments(_DelegationConnector, __DelegationConnector);
			Types._Environment.initFragments(_Environment, __Environment);
			Types._Link.initFragments(_Link, __Link);
			Types._Role.initFragments(_Role, __Role);
			Types._System.initFragments(_System, __System);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of SystemDependantTables::TypeFragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local operations or local operation overrides for each fragment of each type.
	 */
	public static class FragmentOperations {
		static {
			Init.initStart();
			TypeFragments.init();
		}

		private static final ExecutorOperation /*@NonNull*/ [] _Allocation__Allocation = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Allocation__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Allocation__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _AllocationContext__AllocationContext = {};
		private static final ExecutorOperation /*@NonNull*/ [] _AllocationContext__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _AllocationContext__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _AllocationContext__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Assembly__Assembly = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Assembly__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Assembly__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _AssemblyConnector__AssemblyConnector = {};
		private static final ExecutorOperation /*@NonNull*/ [] _AssemblyConnector__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _AssemblyConnector__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _AssemblyConnector__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _AssemblyContext__AssemblyContext = {};
		private static final ExecutorOperation /*@NonNull*/ [] _AssemblyContext__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _AssemblyContext__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _AssemblyContext__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _CompositeComponent__CompositeComponent = {};
		private static final ExecutorOperation /*@NonNull*/ [] _CompositeComponent__Component = {};
		private static final ExecutorOperation /*@NonNull*/ [] _CompositeComponent__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _CompositeComponent__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _CompositeComponent__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Container__Container = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Container__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Container__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Container__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _DelegationConnector__DelegationConnector = {};
		private static final ExecutorOperation /*@NonNull*/ [] _DelegationConnector__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _DelegationConnector__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _DelegationConnector__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Environment__Environment = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Environment__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Environment__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Link__Link = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Link__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Link__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Link__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Role__Role = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Role__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Role__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Role__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _System__System = {};
		private static final ExecutorOperation /*@NonNull*/ [] _System__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _System__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		/*
		 *	Install the operation descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Allocation__Allocation.initOperations(_Allocation__Allocation);
			Fragments._Allocation__OclAny.initOperations(_Allocation__OclAny);
			Fragments._Allocation__OclElement.initOperations(_Allocation__OclElement);

			Fragments._AllocationContext__AllocationContext.initOperations(_AllocationContext__AllocationContext);
			Fragments._AllocationContext__NamedElement.initOperations(_AllocationContext__NamedElement);
			Fragments._AllocationContext__OclAny.initOperations(_AllocationContext__OclAny);
			Fragments._AllocationContext__OclElement.initOperations(_AllocationContext__OclElement);

			Fragments._Assembly__Assembly.initOperations(_Assembly__Assembly);
			Fragments._Assembly__OclAny.initOperations(_Assembly__OclAny);
			Fragments._Assembly__OclElement.initOperations(_Assembly__OclElement);

			Fragments._AssemblyConnector__AssemblyConnector.initOperations(_AssemblyConnector__AssemblyConnector);
			Fragments._AssemblyConnector__NamedElement.initOperations(_AssemblyConnector__NamedElement);
			Fragments._AssemblyConnector__OclAny.initOperations(_AssemblyConnector__OclAny);
			Fragments._AssemblyConnector__OclElement.initOperations(_AssemblyConnector__OclElement);

			Fragments._AssemblyContext__AssemblyContext.initOperations(_AssemblyContext__AssemblyContext);
			Fragments._AssemblyContext__NamedElement.initOperations(_AssemblyContext__NamedElement);
			Fragments._AssemblyContext__OclAny.initOperations(_AssemblyContext__OclAny);
			Fragments._AssemblyContext__OclElement.initOperations(_AssemblyContext__OclElement);

			Fragments._CompositeComponent__Component.initOperations(_CompositeComponent__Component);
			Fragments._CompositeComponent__CompositeComponent.initOperations(_CompositeComponent__CompositeComponent);
			Fragments._CompositeComponent__NamedElement.initOperations(_CompositeComponent__NamedElement);
			Fragments._CompositeComponent__OclAny.initOperations(_CompositeComponent__OclAny);
			Fragments._CompositeComponent__OclElement.initOperations(_CompositeComponent__OclElement);

			Fragments._Container__Container.initOperations(_Container__Container);
			Fragments._Container__NamedElement.initOperations(_Container__NamedElement);
			Fragments._Container__OclAny.initOperations(_Container__OclAny);
			Fragments._Container__OclElement.initOperations(_Container__OclElement);

			Fragments._DelegationConnector__DelegationConnector.initOperations(_DelegationConnector__DelegationConnector);
			Fragments._DelegationConnector__NamedElement.initOperations(_DelegationConnector__NamedElement);
			Fragments._DelegationConnector__OclAny.initOperations(_DelegationConnector__OclAny);
			Fragments._DelegationConnector__OclElement.initOperations(_DelegationConnector__OclElement);

			Fragments._Environment__Environment.initOperations(_Environment__Environment);
			Fragments._Environment__OclAny.initOperations(_Environment__OclAny);
			Fragments._Environment__OclElement.initOperations(_Environment__OclElement);

			Fragments._Link__Link.initOperations(_Link__Link);
			Fragments._Link__NamedElement.initOperations(_Link__NamedElement);
			Fragments._Link__OclAny.initOperations(_Link__OclAny);
			Fragments._Link__OclElement.initOperations(_Link__OclElement);

			Fragments._Role__NamedElement.initOperations(_Role__NamedElement);
			Fragments._Role__OclAny.initOperations(_Role__OclAny);
			Fragments._Role__OclElement.initOperations(_Role__OclElement);
			Fragments._Role__Role.initOperations(_Role__Role);

			Fragments._System__OclAny.initOperations(_System__OclAny);
			Fragments._System__OclElement.initOperations(_System__OclElement);
			Fragments._System__System.initOperations(_System__System);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of SystemDependantTables::FragmentOperations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local properties for the local fragment of each type.
	 */
	public static class FragmentProperties {
		static {
			Init.initStart();
			FragmentOperations.init();
		}

		private static final ExecutorProperty /*@NonNull*/ [] _Allocation = {
			SystemDependantTables.Properties._Allocation__allocationContexts,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _AllocationContext = {
			SystemDependantTables.Properties._AllocationContext__assemblyContext,
			SystemDependantTables.Properties._AllocationContext__container,
			MDSDComponentMetamodelTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Assembly = {
			SystemDependantTables.Properties._Assembly__assemblyConnectors,
			SystemDependantTables.Properties._Assembly__assemblyContexts,
			SystemDependantTables.Properties._Assembly__compositeComponents,
			SystemDependantTables.Properties._Assembly__delegationConnectors,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _AssemblyConnector = {
			MDSDComponentMetamodelTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			SystemDependantTables.Properties._AssemblyConnector__providedRole,
			SystemDependantTables.Properties._AssemblyConnector__requiredRole
		};

		private static final ExecutorProperty /*@NonNull*/ [] _AssemblyContext = {
			SystemDependantTables.Properties._AssemblyContext__allocationContext,
			SystemDependantTables.Properties._AssemblyContext__component,
			MDSDComponentMetamodelTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			SystemDependantTables.Properties._AssemblyContext__providedRoles,
			SystemDependantTables.Properties._AssemblyContext__requiredRoles
		};

		private static final ExecutorProperty /*@NonNull*/ [] _CompositeComponent = {
			SystemDependantTables.Properties._CompositeComponent__assemblyConnectors,
			SystemDependantTables.Properties._CompositeComponent__assemblyContexts,
			SystemIndependantTables.Properties._Component__behaviorDescription,
			SystemDependantTables.Properties._CompositeComponent__delegationConnectors,
			MDSDComponentMetamodelTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			SystemIndependantTables.Properties._Component__providedInterfaces,
			SystemIndependantTables.Properties._Component__providedServices,
			SystemIndependantTables.Properties._Component__requiredInterfaces
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Container = {
			SystemDependantTables.Properties._Container__links,
			MDSDComponentMetamodelTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _DelegationConnector = {
			SystemDependantTables.Properties._DelegationConnector__delegatedInterface,
			MDSDComponentMetamodelTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			SystemDependantTables.Properties._DelegationConnector__role
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Environment = {
			SystemDependantTables.Properties._Environment__containers,
			SystemDependantTables.Properties._Environment__links,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Link = {
			SystemDependantTables.Properties._Link__containers,
			MDSDComponentMetamodelTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Role = {
			SystemDependantTables.Properties._Role__interface,
			MDSDComponentMetamodelTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			SystemDependantTables.Properties._Role__providedAssemblyContext,
			SystemDependantTables.Properties._Role__requiredAssemblyContext
		};

		private static final ExecutorProperty /*@NonNull*/ [] _System = {
			SystemDependantTables.Properties._System__allocation,
			SystemDependantTables.Properties._System__assembly,
			SystemDependantTables.Properties._System__environment,
			SystemDependantTables.Properties._System__interfaces,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		/**
		 *	Install the property descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Allocation__Allocation.initProperties(_Allocation);
			Fragments._AllocationContext__AllocationContext.initProperties(_AllocationContext);
			Fragments._Assembly__Assembly.initProperties(_Assembly);
			Fragments._AssemblyConnector__AssemblyConnector.initProperties(_AssemblyConnector);
			Fragments._AssemblyContext__AssemblyContext.initProperties(_AssemblyContext);
			Fragments._CompositeComponent__CompositeComponent.initProperties(_CompositeComponent);
			Fragments._Container__Container.initProperties(_Container);
			Fragments._DelegationConnector__DelegationConnector.initProperties(_DelegationConnector);
			Fragments._Environment__Environment.initProperties(_Environment);
			Fragments._Link__Link.initProperties(_Link);
			Fragments._Role__Role.initProperties(_Role);
			Fragments._System__System.initProperties(_System);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of SystemDependantTables::FragmentProperties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of enumeration literals for each enumeration.
	 */
	public static class EnumerationLiterals {
		static {
			Init.initStart();
			FragmentProperties.init();
		}

		/**
		 *	Install the enumeration literals in the enumerations.
		 */
		static {

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of SystemDependantTables::EnumerationLiterals and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 * The multiple packages above avoid problems with the Java 65536 byte limit but introduce a difficulty in ensuring that
	 * static construction occurs in the disciplined order of the packages when construction may start in any of the packages.
	 * The problem is resolved by ensuring that the static construction of each package first initializes its immediate predecessor.
	 * On completion of predecessor initialization, the residual packages are initialized by starting an initialization in the last package.
	 * This class maintains a count so that the various predecessors can distinguish whether they are the starting point and so
	 * ensure that residual construction occurs just once after all predecessors.
	 */
	private static class Init {
		/**
		 * Counter of nested static constructions. On return to zero residual construction starts. -ve once residual construction started.
		 */
		private static int initCount = 0;

		/**
		 * Invoked at the start of a static construction to defer residual construction until primary constructions complete.
		 */
		private static void initStart() {
			if (initCount >= 0) {
				initCount++;
			}
		}

		/**
		 * Invoked at the end of a static construction to activate residual construction once primary constructions complete.
		 */
		private static void initEnd() {
			if (initCount > 0) {
				if (--initCount == 0) {
					initCount = -1;
					EnumerationLiterals.init();
				}
			}
		}
	}

	static {
		Init.initEnd();
	}

	/*
	 * Force initialization of outer fields. Inner fields are lazily initialized.
	 */
	public static void init() {
		new SystemDependantTables();
	}

	private SystemDependantTables() {
		super(SystemDependantPackage.eNS_URI);
	}
}
