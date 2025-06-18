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
package MDSDComponentMetamodel.SystemIndependant;

import MDSDComponentMetamodel.MDSDComponentMetamodelPackage;
import MDSDComponentMetamodel.MDSDComponentMetamodelTables;
import MDSDComponentMetamodel.SystemDependant.SystemDependantPackage;
// import MDSDComponentMetamodel.SystemIndependant.SystemIndependantPackage;
// import MDSDComponentMetamodel.SystemIndependant.SystemIndependantTables;
import org.eclipse.ocl.pivot.ids.ClassId;
import org.eclipse.ocl.pivot.ids.CollectionTypeId;
import org.eclipse.ocl.pivot.ids.EnumerationId;
import org.eclipse.ocl.pivot.ids.IdManager;
import org.eclipse.ocl.pivot.ids.NsURIPackageId;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorEnumeration;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorEnumerationLiteral;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorPackage;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorType;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreLibraryOppositeProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorFragment;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorOperation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorPropertyWithImplementation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorStandardLibrary;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorType;
import org.eclipse.ocl.pivot.oclstdlib.OCLstdlibTables;
import org.eclipse.ocl.pivot.utilities.AbstractTables;
import org.eclipse.ocl.pivot.utilities.ValueUtil;

/**
 * SystemIndependantTables provides the dispatch tables for the SystemIndependant for use by the OCL dispatcher.
 *
 * In order to ensure correct static initialization, a top level class element must be accessed
 * before any nested class element. Therefore an access to PACKAGE.getClass() is recommended.
 */
public class SystemIndependantTables extends AbstractTables
{
	static {
		Init.initStart();
	}

	/**
	 *	The package descriptor for the package.
	 */
	public static final EcoreExecutorPackage PACKAGE = new EcoreExecutorPackage(SystemIndependantPackage.eINSTANCE);

	/**
	 *	The library of all packages and types.
	 */
	public static final ExecutorStandardLibrary LIBRARY = OCLstdlibTables.LIBRARY;

	/**
	 *	Constants used by auto-generated code.
	 */
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_http_c_s_s_www_example_org_s_MDSDComponentMetamodel = IdManager.getNsURIPackageId("http://www.example.org/MDSDComponentMetamodel", null, MDSDComponentMetamodelPackage.eINSTANCE);
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_http_c_s_s_www_example_org_s_SystemDependant = IdManager.getNsURIPackageId("http://www.example.org/SystemDependant", null, SystemDependantPackage.eINSTANCE);
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_http_c_s_s_www_example_org_s_SystemIndependant = IdManager.getNsURIPackageId("http://www.example.org/SystemIndependant", null, SystemIndependantPackage.eINSTANCE);
	public static final /*@NonInvalid*/ ClassId CLSSid_Action = SystemIndependantTables.PACKid_http_c_s_s_www_example_org_s_SystemIndependant.getClassId("Action", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_AssemblyContext = SystemIndependantTables.PACKid_http_c_s_s_www_example_org_s_SystemDependant.getClassId("AssemblyContext", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_BasicComponent = SystemIndependantTables.PACKid_http_c_s_s_www_example_org_s_SystemIndependant.getClassId("BasicComponent", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Branch = SystemIndependantTables.PACKid_http_c_s_s_www_example_org_s_SystemIndependant.getClassId("Branch", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_ComplexType = SystemIndependantTables.PACKid_http_c_s_s_www_example_org_s_SystemIndependant.getClassId("ComplexType", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Component = SystemIndependantTables.PACKid_http_c_s_s_www_example_org_s_SystemIndependant.getClassId("Component", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_ComponentSystem = SystemIndependantTables.PACKid_http_c_s_s_www_example_org_s_MDSDComponentMetamodel.getClassId("ComponentSystem", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_DelegationConnector = SystemIndependantTables.PACKid_http_c_s_s_www_example_org_s_SystemDependant.getClassId("DelegationConnector", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Interface = SystemIndependantTables.PACKid_http_c_s_s_www_example_org_s_SystemIndependant.getClassId("Interface", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Loop = SystemIndependantTables.PACKid_http_c_s_s_www_example_org_s_SystemIndependant.getClassId("Loop", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Parameter = SystemIndependantTables.PACKid_http_c_s_s_www_example_org_s_SystemIndependant.getClassId("Parameter", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Repository = SystemIndependantTables.PACKid_http_c_s_s_www_example_org_s_SystemIndependant.getClassId("Repository", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Role = SystemIndependantTables.PACKid_http_c_s_s_www_example_org_s_SystemDependant.getClassId("Role", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Service = SystemIndependantTables.PACKid_http_c_s_s_www_example_org_s_SystemIndependant.getClassId("Service", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Signature = SystemIndependantTables.PACKid_http_c_s_s_www_example_org_s_SystemIndependant.getClassId("Signature", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_System = SystemIndependantTables.PACKid_http_c_s_s_www_example_org_s_SystemDependant.getClassId("System", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Type = SystemIndependantTables.PACKid_http_c_s_s_www_example_org_s_SystemIndependant.getClassId("Type", 0);
	public static final /*@NonInvalid*/ EnumerationId ENUMid_SimpleTypeEnum = SystemIndependantTables.PACKid_http_c_s_s_www_example_org_s_SystemIndependant.getEnumerationId("SimpleTypeEnum");
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_AssemblyContext = TypeId.BAG.getSpecializedId(SystemIndependantTables.CLSSid_AssemblyContext, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_Component = TypeId.BAG.getSpecializedId(SystemIndependantTables.CLSSid_Component, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_DelegationConnector = TypeId.BAG.getSpecializedId(SystemIndependantTables.CLSSid_DelegationConnector, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_Parameter = TypeId.BAG.getSpecializedId(SystemIndependantTables.CLSSid_Parameter, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_Role = TypeId.BAG.getSpecializedId(SystemIndependantTables.CLSSid_Role, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_Service = TypeId.BAG.getSpecializedId(SystemIndependantTables.CLSSid_Service, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_Signature = TypeId.BAG.getSpecializedId(SystemIndependantTables.CLSSid_Signature, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_System = TypeId.BAG.getSpecializedId(SystemIndependantTables.CLSSid_System, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Action = TypeId.ORDERED_SET.getSpecializedId(SystemIndependantTables.CLSSid_Action, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_BasicComponent = TypeId.ORDERED_SET.getSpecializedId(SystemIndependantTables.CLSSid_BasicComponent, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Interface = TypeId.ORDERED_SET.getSpecializedId(SystemIndependantTables.CLSSid_Interface, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Parameter = TypeId.ORDERED_SET.getSpecializedId(SystemIndependantTables.CLSSid_Parameter, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Service = TypeId.ORDERED_SET.getSpecializedId(SystemIndependantTables.CLSSid_Service, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Signature = TypeId.ORDERED_SET.getSpecializedId(SystemIndependantTables.CLSSid_Signature, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Type = TypeId.ORDERED_SET.getSpecializedId(SystemIndependantTables.CLSSid_Type, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);

	/**
	 *	The type parameters for templated types and operations.
	 */
	public static class TypeParameters {
		static {
			Init.initStart();
			SystemIndependantTables.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of SystemIndependantTables::TypeParameters and all preceding sub-packages.
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

		public static final EcoreExecutorType _Action = new EcoreExecutorType(SystemIndependantPackage.Literals.ACTION, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final EcoreExecutorType _BasicComponent = new EcoreExecutorType(SystemIndependantPackage.Literals.BASIC_COMPONENT, PACKAGE, 0);
		public static final EcoreExecutorType _Branch = new EcoreExecutorType(SystemIndependantPackage.Literals.BRANCH, PACKAGE, 0);
		public static final EcoreExecutorType _ComplexType = new EcoreExecutorType(SystemIndependantPackage.Literals.COMPLEX_TYPE, PACKAGE, 0);
		public static final EcoreExecutorType _Component = new EcoreExecutorType(SystemIndependantPackage.Literals.COMPONENT, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final EcoreExecutorType _ExternalCall = new EcoreExecutorType(SystemIndependantPackage.Literals.EXTERNAL_CALL, PACKAGE, 0);
		public static final EcoreExecutorType _Interface = new EcoreExecutorType(SystemIndependantPackage.Literals.INTERFACE, PACKAGE, 0);
		public static final EcoreExecutorType _InternalAction = new EcoreExecutorType(SystemIndependantPackage.Literals.INTERNAL_ACTION, PACKAGE, 0);
		public static final EcoreExecutorType _Loop = new EcoreExecutorType(SystemIndependantPackage.Literals.LOOP, PACKAGE, 0);
		public static final EcoreExecutorType _Parameter = new EcoreExecutorType(SystemIndependantPackage.Literals.PARAMETER, PACKAGE, 0);
		public static final EcoreExecutorType _Repository = new EcoreExecutorType(SystemIndependantPackage.Literals.REPOSITORY, PACKAGE, 0);
		public static final EcoreExecutorType _Service = new EcoreExecutorType(SystemIndependantPackage.Literals.SERVICE, PACKAGE, 0);
		public static final EcoreExecutorType _Signature = new EcoreExecutorType(SystemIndependantPackage.Literals.SIGNATURE, PACKAGE, 0);
		public static final EcoreExecutorType _SimpleType = new EcoreExecutorType(SystemIndependantPackage.Literals.SIMPLE_TYPE, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _SimpleTypeEnum = new EcoreExecutorEnumeration(SystemIndependantPackage.Literals.SIMPLE_TYPE_ENUM, PACKAGE, 0);
		public static final EcoreExecutorType _Type = new EcoreExecutorType(SystemIndependantPackage.Literals.TYPE, PACKAGE, 0 | ExecutorType.ABSTRACT);

		private static final EcoreExecutorType /*@NonNull*/ [] types = {
			_Action,
			_BasicComponent,
			_Branch,
			_ComplexType,
			_Component,
			_ExternalCall,
			_Interface,
			_InternalAction,
			_Loop,
			_Parameter,
			_Repository,
			_Service,
			_Signature,
			_SimpleType,
			_SimpleTypeEnum,
			_Type
		};

		/*
		 *	Install the type descriptors in the package descriptor.
		 */
		static {
			PACKAGE.init(LIBRARY, types);
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of SystemIndependantTables::Types and all preceding sub-packages.
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

		private static final ExecutorFragment _Action__Action = new ExecutorFragment(Types._Action, SystemIndependantTables.Types._Action);
		private static final ExecutorFragment _Action__NamedElement = new ExecutorFragment(Types._Action, MDSDComponentMetamodelTables.Types._NamedElement);
		private static final ExecutorFragment _Action__OclAny = new ExecutorFragment(Types._Action, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Action__OclElement = new ExecutorFragment(Types._Action, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _BasicComponent__BasicComponent = new ExecutorFragment(Types._BasicComponent, SystemIndependantTables.Types._BasicComponent);
		private static final ExecutorFragment _BasicComponent__Component = new ExecutorFragment(Types._BasicComponent, SystemIndependantTables.Types._Component);
		private static final ExecutorFragment _BasicComponent__NamedElement = new ExecutorFragment(Types._BasicComponent, MDSDComponentMetamodelTables.Types._NamedElement);
		private static final ExecutorFragment _BasicComponent__OclAny = new ExecutorFragment(Types._BasicComponent, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _BasicComponent__OclElement = new ExecutorFragment(Types._BasicComponent, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Branch__Action = new ExecutorFragment(Types._Branch, SystemIndependantTables.Types._Action);
		private static final ExecutorFragment _Branch__Branch = new ExecutorFragment(Types._Branch, SystemIndependantTables.Types._Branch);
		private static final ExecutorFragment _Branch__NamedElement = new ExecutorFragment(Types._Branch, MDSDComponentMetamodelTables.Types._NamedElement);
		private static final ExecutorFragment _Branch__OclAny = new ExecutorFragment(Types._Branch, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Branch__OclElement = new ExecutorFragment(Types._Branch, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _ComplexType__ComplexType = new ExecutorFragment(Types._ComplexType, SystemIndependantTables.Types._ComplexType);
		private static final ExecutorFragment _ComplexType__NamedElement = new ExecutorFragment(Types._ComplexType, MDSDComponentMetamodelTables.Types._NamedElement);
		private static final ExecutorFragment _ComplexType__OclAny = new ExecutorFragment(Types._ComplexType, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _ComplexType__OclElement = new ExecutorFragment(Types._ComplexType, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _ComplexType__Type = new ExecutorFragment(Types._ComplexType, SystemIndependantTables.Types._Type);

		private static final ExecutorFragment _Component__Component = new ExecutorFragment(Types._Component, SystemIndependantTables.Types._Component);
		private static final ExecutorFragment _Component__NamedElement = new ExecutorFragment(Types._Component, MDSDComponentMetamodelTables.Types._NamedElement);
		private static final ExecutorFragment _Component__OclAny = new ExecutorFragment(Types._Component, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Component__OclElement = new ExecutorFragment(Types._Component, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _ExternalCall__Action = new ExecutorFragment(Types._ExternalCall, SystemIndependantTables.Types._Action);
		private static final ExecutorFragment _ExternalCall__ExternalCall = new ExecutorFragment(Types._ExternalCall, SystemIndependantTables.Types._ExternalCall);
		private static final ExecutorFragment _ExternalCall__NamedElement = new ExecutorFragment(Types._ExternalCall, MDSDComponentMetamodelTables.Types._NamedElement);
		private static final ExecutorFragment _ExternalCall__OclAny = new ExecutorFragment(Types._ExternalCall, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _ExternalCall__OclElement = new ExecutorFragment(Types._ExternalCall, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Interface__Interface = new ExecutorFragment(Types._Interface, SystemIndependantTables.Types._Interface);
		private static final ExecutorFragment _Interface__NamedElement = new ExecutorFragment(Types._Interface, MDSDComponentMetamodelTables.Types._NamedElement);
		private static final ExecutorFragment _Interface__OclAny = new ExecutorFragment(Types._Interface, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Interface__OclElement = new ExecutorFragment(Types._Interface, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _InternalAction__Action = new ExecutorFragment(Types._InternalAction, SystemIndependantTables.Types._Action);
		private static final ExecutorFragment _InternalAction__InternalAction = new ExecutorFragment(Types._InternalAction, SystemIndependantTables.Types._InternalAction);
		private static final ExecutorFragment _InternalAction__NamedElement = new ExecutorFragment(Types._InternalAction, MDSDComponentMetamodelTables.Types._NamedElement);
		private static final ExecutorFragment _InternalAction__OclAny = new ExecutorFragment(Types._InternalAction, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _InternalAction__OclElement = new ExecutorFragment(Types._InternalAction, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Loop__Action = new ExecutorFragment(Types._Loop, SystemIndependantTables.Types._Action);
		private static final ExecutorFragment _Loop__Loop = new ExecutorFragment(Types._Loop, SystemIndependantTables.Types._Loop);
		private static final ExecutorFragment _Loop__NamedElement = new ExecutorFragment(Types._Loop, MDSDComponentMetamodelTables.Types._NamedElement);
		private static final ExecutorFragment _Loop__OclAny = new ExecutorFragment(Types._Loop, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Loop__OclElement = new ExecutorFragment(Types._Loop, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Parameter__NamedElement = new ExecutorFragment(Types._Parameter, MDSDComponentMetamodelTables.Types._NamedElement);
		private static final ExecutorFragment _Parameter__OclAny = new ExecutorFragment(Types._Parameter, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Parameter__OclElement = new ExecutorFragment(Types._Parameter, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Parameter__Parameter = new ExecutorFragment(Types._Parameter, SystemIndependantTables.Types._Parameter);

		private static final ExecutorFragment _Repository__NamedElement = new ExecutorFragment(Types._Repository, MDSDComponentMetamodelTables.Types._NamedElement);
		private static final ExecutorFragment _Repository__OclAny = new ExecutorFragment(Types._Repository, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Repository__OclElement = new ExecutorFragment(Types._Repository, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Repository__Repository = new ExecutorFragment(Types._Repository, SystemIndependantTables.Types._Repository);

		private static final ExecutorFragment _Service__NamedElement = new ExecutorFragment(Types._Service, MDSDComponentMetamodelTables.Types._NamedElement);
		private static final ExecutorFragment _Service__OclAny = new ExecutorFragment(Types._Service, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Service__OclElement = new ExecutorFragment(Types._Service, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Service__Service = new ExecutorFragment(Types._Service, SystemIndependantTables.Types._Service);

		private static final ExecutorFragment _Signature__NamedElement = new ExecutorFragment(Types._Signature, MDSDComponentMetamodelTables.Types._NamedElement);
		private static final ExecutorFragment _Signature__OclAny = new ExecutorFragment(Types._Signature, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Signature__OclElement = new ExecutorFragment(Types._Signature, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Signature__Signature = new ExecutorFragment(Types._Signature, SystemIndependantTables.Types._Signature);

		private static final ExecutorFragment _SimpleType__NamedElement = new ExecutorFragment(Types._SimpleType, MDSDComponentMetamodelTables.Types._NamedElement);
		private static final ExecutorFragment _SimpleType__OclAny = new ExecutorFragment(Types._SimpleType, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _SimpleType__OclElement = new ExecutorFragment(Types._SimpleType, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _SimpleType__SimpleType = new ExecutorFragment(Types._SimpleType, SystemIndependantTables.Types._SimpleType);
		private static final ExecutorFragment _SimpleType__Type = new ExecutorFragment(Types._SimpleType, SystemIndependantTables.Types._Type);

		private static final ExecutorFragment _SimpleTypeEnum__OclAny = new ExecutorFragment(Types._SimpleTypeEnum, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _SimpleTypeEnum__OclElement = new ExecutorFragment(Types._SimpleTypeEnum, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _SimpleTypeEnum__OclEnumeration = new ExecutorFragment(Types._SimpleTypeEnum, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _SimpleTypeEnum__OclType = new ExecutorFragment(Types._SimpleTypeEnum, OCLstdlibTables.Types._OclType);
		private static final ExecutorFragment _SimpleTypeEnum__SimpleTypeEnum = new ExecutorFragment(Types._SimpleTypeEnum, SystemIndependantTables.Types._SimpleTypeEnum);

		private static final ExecutorFragment _Type__NamedElement = new ExecutorFragment(Types._Type, MDSDComponentMetamodelTables.Types._NamedElement);
		private static final ExecutorFragment _Type__OclAny = new ExecutorFragment(Types._Type, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Type__OclElement = new ExecutorFragment(Types._Type, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Type__Type = new ExecutorFragment(Types._Type, SystemIndependantTables.Types._Type);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of SystemIndependantTables::Fragments and all preceding sub-packages.
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
		 * Force initialization of the fields of SystemIndependantTables::Parameters and all preceding sub-packages.
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
		 * Force initialization of the fields of SystemIndependantTables::Operations and all preceding sub-packages.
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

		public static final ExecutorProperty _Action__Branch__actions = new ExecutorPropertyWithImplementation("Branch", Types._Action, 0, new EcoreLibraryOppositeProperty(SystemIndependantPackage.Literals.BRANCH__ACTIONS));
		public static final ExecutorProperty _Action__Component__behaviorDescription = new ExecutorPropertyWithImplementation("Component", Types._Action, 1, new EcoreLibraryOppositeProperty(SystemIndependantPackage.Literals.COMPONENT__BEHAVIOR_DESCRIPTION));
		public static final ExecutorProperty _Action__Loop__actions = new ExecutorPropertyWithImplementation("Loop", Types._Action, 2, new EcoreLibraryOppositeProperty(SystemIndependantPackage.Literals.LOOP__ACTIONS));

		public static final ExecutorProperty _BasicComponent__Repository__components = new ExecutorPropertyWithImplementation("Repository", Types._BasicComponent, 0, new EcoreLibraryOppositeProperty(SystemIndependantPackage.Literals.REPOSITORY__COMPONENTS));

		public static final ExecutorProperty _Branch__actions = new EcoreExecutorProperty(SystemIndependantPackage.Literals.BRANCH__ACTIONS, Types._Branch, 0);
		public static final ExecutorProperty _Branch__condition = new EcoreExecutorProperty(SystemIndependantPackage.Literals.BRANCH__CONDITION, Types._Branch, 1);

		public static final ExecutorProperty _ComplexType__attributes = new EcoreExecutorProperty(SystemIndependantPackage.Literals.COMPLEX_TYPE__ATTRIBUTES, Types._ComplexType, 0);

		public static final ExecutorProperty _Component__behaviorDescription = new EcoreExecutorProperty(SystemIndependantPackage.Literals.COMPONENT__BEHAVIOR_DESCRIPTION, Types._Component, 0);
		public static final ExecutorProperty _Component__providedInterfaces = new EcoreExecutorProperty(SystemIndependantPackage.Literals.COMPONENT__PROVIDED_INTERFACES, Types._Component, 1);
		public static final ExecutorProperty _Component__providedServices = new EcoreExecutorProperty(SystemIndependantPackage.Literals.COMPONENT__PROVIDED_SERVICES, Types._Component, 2);
		public static final ExecutorProperty _Component__requiredInterfaces = new EcoreExecutorProperty(SystemIndependantPackage.Literals.COMPONENT__REQUIRED_INTERFACES, Types._Component, 3);
		public static final ExecutorProperty _Component__AssemblyContext__component = new ExecutorPropertyWithImplementation("AssemblyContext", Types._Component, 4, new EcoreLibraryOppositeProperty(SystemDependantPackage.Literals.ASSEMBLY_CONTEXT__COMPONENT));

		public static final ExecutorProperty _Interface__signatures = new EcoreExecutorProperty(SystemIndependantPackage.Literals.INTERFACE__SIGNATURES, Types._Interface, 0);
		public static final ExecutorProperty _Interface__Component__providedInterfaces = new ExecutorPropertyWithImplementation("Component", Types._Interface, 1, new EcoreLibraryOppositeProperty(SystemIndependantPackage.Literals.COMPONENT__PROVIDED_INTERFACES));
		public static final ExecutorProperty _Interface__Component__requiredInterfaces = new ExecutorPropertyWithImplementation("Component", Types._Interface, 2, new EcoreLibraryOppositeProperty(SystemIndependantPackage.Literals.COMPONENT__REQUIRED_INTERFACES));
		public static final ExecutorProperty _Interface__DelegationConnector__delegatedInterface = new ExecutorPropertyWithImplementation("DelegationConnector", Types._Interface, 3, new EcoreLibraryOppositeProperty(SystemDependantPackage.Literals.DELEGATION_CONNECTOR__DELEGATED_INTERFACE));
		public static final ExecutorProperty _Interface__Repository__interfaces = new ExecutorPropertyWithImplementation("Repository", Types._Interface, 4, new EcoreLibraryOppositeProperty(SystemIndependantPackage.Literals.REPOSITORY__INTERFACES));
		public static final ExecutorProperty _Interface__Role__interface = new ExecutorPropertyWithImplementation("Role", Types._Interface, 5, new EcoreLibraryOppositeProperty(SystemDependantPackage.Literals.ROLE__INTERFACE));
		public static final ExecutorProperty _Interface__System__interfaces = new ExecutorPropertyWithImplementation("System", Types._Interface, 6, new EcoreLibraryOppositeProperty(SystemDependantPackage.Literals.SYSTEM__INTERFACES));

		public static final ExecutorProperty _Loop__actions = new EcoreExecutorProperty(SystemIndependantPackage.Literals.LOOP__ACTIONS, Types._Loop, 0);
		public static final ExecutorProperty _Loop__condition = new EcoreExecutorProperty(SystemIndependantPackage.Literals.LOOP__CONDITION, Types._Loop, 1);

		public static final ExecutorProperty _Parameter__type = new EcoreExecutorProperty(SystemIndependantPackage.Literals.PARAMETER__TYPE, Types._Parameter, 0);
		public static final ExecutorProperty _Parameter__ComplexType__attributes = new ExecutorPropertyWithImplementation("ComplexType", Types._Parameter, 1, new EcoreLibraryOppositeProperty(SystemIndependantPackage.Literals.COMPLEX_TYPE__ATTRIBUTES));
		public static final ExecutorProperty _Parameter__Signature__parameters = new ExecutorPropertyWithImplementation("Signature", Types._Parameter, 2, new EcoreLibraryOppositeProperty(SystemIndependantPackage.Literals.SIGNATURE__PARAMETERS));

		public static final ExecutorProperty _Repository__components = new EcoreExecutorProperty(SystemIndependantPackage.Literals.REPOSITORY__COMPONENTS, Types._Repository, 0);
		public static final ExecutorProperty _Repository__interfaces = new EcoreExecutorProperty(SystemIndependantPackage.Literals.REPOSITORY__INTERFACES, Types._Repository, 1);
		public static final ExecutorProperty _Repository__types = new EcoreExecutorProperty(SystemIndependantPackage.Literals.REPOSITORY__TYPES, Types._Repository, 2);
		public static final ExecutorProperty _Repository__ComponentSystem__repositories = new ExecutorPropertyWithImplementation("ComponentSystem", Types._Repository, 3, new EcoreLibraryOppositeProperty(MDSDComponentMetamodelPackage.Literals.COMPONENT_SYSTEM__REPOSITORIES));

		public static final ExecutorProperty _Service__correspondingSignature = new EcoreExecutorProperty(SystemIndependantPackage.Literals.SERVICE__CORRESPONDING_SIGNATURE, Types._Service, 0);
		public static final ExecutorProperty _Service__Component__providedServices = new ExecutorPropertyWithImplementation("Component", Types._Service, 1, new EcoreLibraryOppositeProperty(SystemIndependantPackage.Literals.COMPONENT__PROVIDED_SERVICES));

		public static final ExecutorProperty _Signature__parameters = new EcoreExecutorProperty(SystemIndependantPackage.Literals.SIGNATURE__PARAMETERS, Types._Signature, 0);
		public static final ExecutorProperty _Signature__returnType = new EcoreExecutorProperty(SystemIndependantPackage.Literals.SIGNATURE__RETURN_TYPE, Types._Signature, 1);
		public static final ExecutorProperty _Signature__Interface__signatures = new ExecutorPropertyWithImplementation("Interface", Types._Signature, 2, new EcoreLibraryOppositeProperty(SystemIndependantPackage.Literals.INTERFACE__SIGNATURES));
		public static final ExecutorProperty _Signature__Service__correspondingSignature = new ExecutorPropertyWithImplementation("Service", Types._Signature, 3, new EcoreLibraryOppositeProperty(SystemIndependantPackage.Literals.SERVICE__CORRESPONDING_SIGNATURE));

		public static final ExecutorProperty _SimpleType__type = new EcoreExecutorProperty(SystemIndependantPackage.Literals.SIMPLE_TYPE__TYPE, Types._SimpleType, 0);

		public static final ExecutorProperty _Type__Parameter__type = new ExecutorPropertyWithImplementation("Parameter", Types._Type, 0, new EcoreLibraryOppositeProperty(SystemIndependantPackage.Literals.PARAMETER__TYPE));
		public static final ExecutorProperty _Type__Repository__types = new ExecutorPropertyWithImplementation("Repository", Types._Type, 1, new EcoreLibraryOppositeProperty(SystemIndependantPackage.Literals.REPOSITORY__TYPES));
		public static final ExecutorProperty _Type__Signature__returnType = new ExecutorPropertyWithImplementation("Signature", Types._Type, 2, new EcoreLibraryOppositeProperty(SystemIndependantPackage.Literals.SIGNATURE__RETURN_TYPE));
		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of SystemIndependantTables::Properties and all preceding sub-packages.
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

		private static final ExecutorFragment /*@NonNull*/ [] _Action =
			{
				Fragments._Action__OclAny /* 0 */,
				Fragments._Action__OclElement /* 1 */,
				Fragments._Action__NamedElement /* 2 */,
				Fragments._Action__Action /* 3 */
			};
		private static final int /*@NonNull*/ [] __Action = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _BasicComponent =
			{
				Fragments._BasicComponent__OclAny /* 0 */,
				Fragments._BasicComponent__OclElement /* 1 */,
				Fragments._BasicComponent__NamedElement /* 2 */,
				Fragments._BasicComponent__Component /* 3 */,
				Fragments._BasicComponent__BasicComponent /* 4 */
			};
		private static final int /*@NonNull*/ [] __BasicComponent = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Branch =
			{
				Fragments._Branch__OclAny /* 0 */,
				Fragments._Branch__OclElement /* 1 */,
				Fragments._Branch__NamedElement /* 2 */,
				Fragments._Branch__Action /* 3 */,
				Fragments._Branch__Branch /* 4 */
			};
		private static final int /*@NonNull*/ [] __Branch = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _ComplexType =
			{
				Fragments._ComplexType__OclAny /* 0 */,
				Fragments._ComplexType__OclElement /* 1 */,
				Fragments._ComplexType__NamedElement /* 2 */,
				Fragments._ComplexType__Type /* 3 */,
				Fragments._ComplexType__ComplexType /* 4 */
			};
		private static final int /*@NonNull*/ [] __ComplexType = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Component =
			{
				Fragments._Component__OclAny /* 0 */,
				Fragments._Component__OclElement /* 1 */,
				Fragments._Component__NamedElement /* 2 */,
				Fragments._Component__Component /* 3 */
			};
		private static final int /*@NonNull*/ [] __Component = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _ExternalCall =
			{
				Fragments._ExternalCall__OclAny /* 0 */,
				Fragments._ExternalCall__OclElement /* 1 */,
				Fragments._ExternalCall__NamedElement /* 2 */,
				Fragments._ExternalCall__Action /* 3 */,
				Fragments._ExternalCall__ExternalCall /* 4 */
			};
		private static final int /*@NonNull*/ [] __ExternalCall = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Interface =
			{
				Fragments._Interface__OclAny /* 0 */,
				Fragments._Interface__OclElement /* 1 */,
				Fragments._Interface__NamedElement /* 2 */,
				Fragments._Interface__Interface /* 3 */
			};
		private static final int /*@NonNull*/ [] __Interface = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _InternalAction =
			{
				Fragments._InternalAction__OclAny /* 0 */,
				Fragments._InternalAction__OclElement /* 1 */,
				Fragments._InternalAction__NamedElement /* 2 */,
				Fragments._InternalAction__Action /* 3 */,
				Fragments._InternalAction__InternalAction /* 4 */
			};
		private static final int /*@NonNull*/ [] __InternalAction = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Loop =
			{
				Fragments._Loop__OclAny /* 0 */,
				Fragments._Loop__OclElement /* 1 */,
				Fragments._Loop__NamedElement /* 2 */,
				Fragments._Loop__Action /* 3 */,
				Fragments._Loop__Loop /* 4 */
			};
		private static final int /*@NonNull*/ [] __Loop = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Parameter =
			{
				Fragments._Parameter__OclAny /* 0 */,
				Fragments._Parameter__OclElement /* 1 */,
				Fragments._Parameter__NamedElement /* 2 */,
				Fragments._Parameter__Parameter /* 3 */
			};
		private static final int /*@NonNull*/ [] __Parameter = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Repository =
			{
				Fragments._Repository__OclAny /* 0 */,
				Fragments._Repository__OclElement /* 1 */,
				Fragments._Repository__NamedElement /* 2 */,
				Fragments._Repository__Repository /* 3 */
			};
		private static final int /*@NonNull*/ [] __Repository = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Service =
			{
				Fragments._Service__OclAny /* 0 */,
				Fragments._Service__OclElement /* 1 */,
				Fragments._Service__NamedElement /* 2 */,
				Fragments._Service__Service /* 3 */
			};
		private static final int /*@NonNull*/ [] __Service = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Signature =
			{
				Fragments._Signature__OclAny /* 0 */,
				Fragments._Signature__OclElement /* 1 */,
				Fragments._Signature__NamedElement /* 2 */,
				Fragments._Signature__Signature /* 3 */
			};
		private static final int /*@NonNull*/ [] __Signature = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _SimpleType =
			{
				Fragments._SimpleType__OclAny /* 0 */,
				Fragments._SimpleType__OclElement /* 1 */,
				Fragments._SimpleType__NamedElement /* 2 */,
				Fragments._SimpleType__Type /* 3 */,
				Fragments._SimpleType__SimpleType /* 4 */
			};
		private static final int /*@NonNull*/ [] __SimpleType = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _SimpleTypeEnum =
			{
				Fragments._SimpleTypeEnum__OclAny /* 0 */,
				Fragments._SimpleTypeEnum__OclElement /* 1 */,
				Fragments._SimpleTypeEnum__OclType /* 2 */,
				Fragments._SimpleTypeEnum__OclEnumeration /* 3 */,
				Fragments._SimpleTypeEnum__SimpleTypeEnum /* 4 */
			};
		private static final int /*@NonNull*/ [] __SimpleTypeEnum = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Type =
			{
				Fragments._Type__OclAny /* 0 */,
				Fragments._Type__OclElement /* 1 */,
				Fragments._Type__NamedElement /* 2 */,
				Fragments._Type__Type /* 3 */
			};
		private static final int /*@NonNull*/ [] __Type = { 1,1,1,1 };

		/**
		 *	Install the fragment descriptors in the class descriptors.
		 */
		static {
			Types._Action.initFragments(_Action, __Action);
			Types._BasicComponent.initFragments(_BasicComponent, __BasicComponent);
			Types._Branch.initFragments(_Branch, __Branch);
			Types._ComplexType.initFragments(_ComplexType, __ComplexType);
			Types._Component.initFragments(_Component, __Component);
			Types._ExternalCall.initFragments(_ExternalCall, __ExternalCall);
			Types._Interface.initFragments(_Interface, __Interface);
			Types._InternalAction.initFragments(_InternalAction, __InternalAction);
			Types._Loop.initFragments(_Loop, __Loop);
			Types._Parameter.initFragments(_Parameter, __Parameter);
			Types._Repository.initFragments(_Repository, __Repository);
			Types._Service.initFragments(_Service, __Service);
			Types._Signature.initFragments(_Signature, __Signature);
			Types._SimpleType.initFragments(_SimpleType, __SimpleType);
			Types._SimpleTypeEnum.initFragments(_SimpleTypeEnum, __SimpleTypeEnum);
			Types._Type.initFragments(_Type, __Type);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of SystemIndependantTables::TypeFragments and all preceding sub-packages.
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

		private static final ExecutorOperation /*@NonNull*/ [] _Action__Action = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Action__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Action__OclAny = {
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
		private static final ExecutorOperation /*@NonNull*/ [] _Action__OclElement = {
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

		private static final ExecutorOperation /*@NonNull*/ [] _BasicComponent__BasicComponent = {};
		private static final ExecutorOperation /*@NonNull*/ [] _BasicComponent__Component = {};
		private static final ExecutorOperation /*@NonNull*/ [] _BasicComponent__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _BasicComponent__OclAny = {
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
		private static final ExecutorOperation /*@NonNull*/ [] _BasicComponent__OclElement = {
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

		private static final ExecutorOperation /*@NonNull*/ [] _Branch__Branch = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Branch__Action = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Branch__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Branch__OclAny = {
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
		private static final ExecutorOperation /*@NonNull*/ [] _Branch__OclElement = {
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

		private static final ExecutorOperation /*@NonNull*/ [] _ComplexType__ComplexType = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ComplexType__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ComplexType__OclAny = {
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
		private static final ExecutorOperation /*@NonNull*/ [] _ComplexType__OclElement = {
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
		private static final ExecutorOperation /*@NonNull*/ [] _ComplexType__Type = {};

		private static final ExecutorOperation /*@NonNull*/ [] _Component__Component = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Component__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Component__OclAny = {
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
		private static final ExecutorOperation /*@NonNull*/ [] _Component__OclElement = {
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

		private static final ExecutorOperation /*@NonNull*/ [] _ExternalCall__ExternalCall = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ExternalCall__Action = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ExternalCall__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ExternalCall__OclAny = {
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
		private static final ExecutorOperation /*@NonNull*/ [] _ExternalCall__OclElement = {
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

		private static final ExecutorOperation /*@NonNull*/ [] _Interface__Interface = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Interface__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Interface__OclAny = {
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
		private static final ExecutorOperation /*@NonNull*/ [] _Interface__OclElement = {
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

		private static final ExecutorOperation /*@NonNull*/ [] _InternalAction__InternalAction = {};
		private static final ExecutorOperation /*@NonNull*/ [] _InternalAction__Action = {};
		private static final ExecutorOperation /*@NonNull*/ [] _InternalAction__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _InternalAction__OclAny = {
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
		private static final ExecutorOperation /*@NonNull*/ [] _InternalAction__OclElement = {
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

		private static final ExecutorOperation /*@NonNull*/ [] _Loop__Loop = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Loop__Action = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Loop__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Loop__OclAny = {
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
		private static final ExecutorOperation /*@NonNull*/ [] _Loop__OclElement = {
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

		private static final ExecutorOperation /*@NonNull*/ [] _Parameter__Parameter = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Parameter__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Parameter__OclAny = {
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
		private static final ExecutorOperation /*@NonNull*/ [] _Parameter__OclElement = {
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

		private static final ExecutorOperation /*@NonNull*/ [] _Repository__Repository = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Repository__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Repository__OclAny = {
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
		private static final ExecutorOperation /*@NonNull*/ [] _Repository__OclElement = {
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

		private static final ExecutorOperation /*@NonNull*/ [] _Service__Service = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Service__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Service__OclAny = {
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
		private static final ExecutorOperation /*@NonNull*/ [] _Service__OclElement = {
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

		private static final ExecutorOperation /*@NonNull*/ [] _Signature__Signature = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Signature__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Signature__OclAny = {
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
		private static final ExecutorOperation /*@NonNull*/ [] _Signature__OclElement = {
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

		private static final ExecutorOperation /*@NonNull*/ [] _SimpleType__SimpleType = {};
		private static final ExecutorOperation /*@NonNull*/ [] _SimpleType__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _SimpleType__OclAny = {
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
		private static final ExecutorOperation /*@NonNull*/ [] _SimpleType__OclElement = {
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
		private static final ExecutorOperation /*@NonNull*/ [] _SimpleType__Type = {};

		private static final ExecutorOperation /*@NonNull*/ [] _SimpleTypeEnum__SimpleTypeEnum = {};
		private static final ExecutorOperation /*@NonNull*/ [] _SimpleTypeEnum__OclAny = {
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
		private static final ExecutorOperation /*@NonNull*/ [] _SimpleTypeEnum__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */,
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
		private static final ExecutorOperation /*@NonNull*/ [] _SimpleTypeEnum__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _SimpleTypeEnum__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Type__Type = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Type__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Type__OclAny = {
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
		private static final ExecutorOperation /*@NonNull*/ [] _Type__OclElement = {
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
			Fragments._Action__Action.initOperations(_Action__Action);
			Fragments._Action__NamedElement.initOperations(_Action__NamedElement);
			Fragments._Action__OclAny.initOperations(_Action__OclAny);
			Fragments._Action__OclElement.initOperations(_Action__OclElement);

			Fragments._BasicComponent__BasicComponent.initOperations(_BasicComponent__BasicComponent);
			Fragments._BasicComponent__Component.initOperations(_BasicComponent__Component);
			Fragments._BasicComponent__NamedElement.initOperations(_BasicComponent__NamedElement);
			Fragments._BasicComponent__OclAny.initOperations(_BasicComponent__OclAny);
			Fragments._BasicComponent__OclElement.initOperations(_BasicComponent__OclElement);

			Fragments._Branch__Action.initOperations(_Branch__Action);
			Fragments._Branch__Branch.initOperations(_Branch__Branch);
			Fragments._Branch__NamedElement.initOperations(_Branch__NamedElement);
			Fragments._Branch__OclAny.initOperations(_Branch__OclAny);
			Fragments._Branch__OclElement.initOperations(_Branch__OclElement);

			Fragments._ComplexType__ComplexType.initOperations(_ComplexType__ComplexType);
			Fragments._ComplexType__NamedElement.initOperations(_ComplexType__NamedElement);
			Fragments._ComplexType__OclAny.initOperations(_ComplexType__OclAny);
			Fragments._ComplexType__OclElement.initOperations(_ComplexType__OclElement);
			Fragments._ComplexType__Type.initOperations(_ComplexType__Type);

			Fragments._Component__Component.initOperations(_Component__Component);
			Fragments._Component__NamedElement.initOperations(_Component__NamedElement);
			Fragments._Component__OclAny.initOperations(_Component__OclAny);
			Fragments._Component__OclElement.initOperations(_Component__OclElement);

			Fragments._ExternalCall__Action.initOperations(_ExternalCall__Action);
			Fragments._ExternalCall__ExternalCall.initOperations(_ExternalCall__ExternalCall);
			Fragments._ExternalCall__NamedElement.initOperations(_ExternalCall__NamedElement);
			Fragments._ExternalCall__OclAny.initOperations(_ExternalCall__OclAny);
			Fragments._ExternalCall__OclElement.initOperations(_ExternalCall__OclElement);

			Fragments._Interface__Interface.initOperations(_Interface__Interface);
			Fragments._Interface__NamedElement.initOperations(_Interface__NamedElement);
			Fragments._Interface__OclAny.initOperations(_Interface__OclAny);
			Fragments._Interface__OclElement.initOperations(_Interface__OclElement);

			Fragments._InternalAction__Action.initOperations(_InternalAction__Action);
			Fragments._InternalAction__InternalAction.initOperations(_InternalAction__InternalAction);
			Fragments._InternalAction__NamedElement.initOperations(_InternalAction__NamedElement);
			Fragments._InternalAction__OclAny.initOperations(_InternalAction__OclAny);
			Fragments._InternalAction__OclElement.initOperations(_InternalAction__OclElement);

			Fragments._Loop__Action.initOperations(_Loop__Action);
			Fragments._Loop__Loop.initOperations(_Loop__Loop);
			Fragments._Loop__NamedElement.initOperations(_Loop__NamedElement);
			Fragments._Loop__OclAny.initOperations(_Loop__OclAny);
			Fragments._Loop__OclElement.initOperations(_Loop__OclElement);

			Fragments._Parameter__NamedElement.initOperations(_Parameter__NamedElement);
			Fragments._Parameter__OclAny.initOperations(_Parameter__OclAny);
			Fragments._Parameter__OclElement.initOperations(_Parameter__OclElement);
			Fragments._Parameter__Parameter.initOperations(_Parameter__Parameter);

			Fragments._Repository__NamedElement.initOperations(_Repository__NamedElement);
			Fragments._Repository__OclAny.initOperations(_Repository__OclAny);
			Fragments._Repository__OclElement.initOperations(_Repository__OclElement);
			Fragments._Repository__Repository.initOperations(_Repository__Repository);

			Fragments._Service__NamedElement.initOperations(_Service__NamedElement);
			Fragments._Service__OclAny.initOperations(_Service__OclAny);
			Fragments._Service__OclElement.initOperations(_Service__OclElement);
			Fragments._Service__Service.initOperations(_Service__Service);

			Fragments._Signature__NamedElement.initOperations(_Signature__NamedElement);
			Fragments._Signature__OclAny.initOperations(_Signature__OclAny);
			Fragments._Signature__OclElement.initOperations(_Signature__OclElement);
			Fragments._Signature__Signature.initOperations(_Signature__Signature);

			Fragments._SimpleType__NamedElement.initOperations(_SimpleType__NamedElement);
			Fragments._SimpleType__OclAny.initOperations(_SimpleType__OclAny);
			Fragments._SimpleType__OclElement.initOperations(_SimpleType__OclElement);
			Fragments._SimpleType__SimpleType.initOperations(_SimpleType__SimpleType);
			Fragments._SimpleType__Type.initOperations(_SimpleType__Type);

			Fragments._SimpleTypeEnum__OclAny.initOperations(_SimpleTypeEnum__OclAny);
			Fragments._SimpleTypeEnum__OclElement.initOperations(_SimpleTypeEnum__OclElement);
			Fragments._SimpleTypeEnum__OclEnumeration.initOperations(_SimpleTypeEnum__OclEnumeration);
			Fragments._SimpleTypeEnum__OclType.initOperations(_SimpleTypeEnum__OclType);
			Fragments._SimpleTypeEnum__SimpleTypeEnum.initOperations(_SimpleTypeEnum__SimpleTypeEnum);

			Fragments._Type__NamedElement.initOperations(_Type__NamedElement);
			Fragments._Type__OclAny.initOperations(_Type__OclAny);
			Fragments._Type__OclElement.initOperations(_Type__OclElement);
			Fragments._Type__Type.initOperations(_Type__Type);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of SystemIndependantTables::FragmentOperations and all preceding sub-packages.
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

		private static final ExecutorProperty /*@NonNull*/ [] _Action = {
			MDSDComponentMetamodelTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _BasicComponent = {
			SystemIndependantTables.Properties._Component__behaviorDescription,
			MDSDComponentMetamodelTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			SystemIndependantTables.Properties._Component__providedInterfaces,
			SystemIndependantTables.Properties._Component__providedServices,
			SystemIndependantTables.Properties._Component__requiredInterfaces
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Branch = {
			SystemIndependantTables.Properties._Branch__actions,
			SystemIndependantTables.Properties._Branch__condition,
			MDSDComponentMetamodelTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _ComplexType = {
			SystemIndependantTables.Properties._ComplexType__attributes,
			MDSDComponentMetamodelTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Component = {
			SystemIndependantTables.Properties._Component__behaviorDescription,
			MDSDComponentMetamodelTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			SystemIndependantTables.Properties._Component__providedInterfaces,
			SystemIndependantTables.Properties._Component__providedServices,
			SystemIndependantTables.Properties._Component__requiredInterfaces
		};

		private static final ExecutorProperty /*@NonNull*/ [] _ExternalCall = {
			MDSDComponentMetamodelTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Interface = {
			MDSDComponentMetamodelTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			SystemIndependantTables.Properties._Interface__signatures
		};

		private static final ExecutorProperty /*@NonNull*/ [] _InternalAction = {
			MDSDComponentMetamodelTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Loop = {
			SystemIndependantTables.Properties._Loop__actions,
			SystemIndependantTables.Properties._Loop__condition,
			MDSDComponentMetamodelTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Parameter = {
			MDSDComponentMetamodelTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			SystemIndependantTables.Properties._Parameter__type
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Repository = {
			SystemIndependantTables.Properties._Repository__components,
			SystemIndependantTables.Properties._Repository__interfaces,
			MDSDComponentMetamodelTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			SystemIndependantTables.Properties._Repository__types
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Service = {
			SystemIndependantTables.Properties._Service__correspondingSignature,
			MDSDComponentMetamodelTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Signature = {
			MDSDComponentMetamodelTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			SystemIndependantTables.Properties._Signature__parameters,
			SystemIndependantTables.Properties._Signature__returnType
		};

		private static final ExecutorProperty /*@NonNull*/ [] _SimpleType = {
			MDSDComponentMetamodelTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			SystemIndependantTables.Properties._SimpleType__type
		};

		private static final ExecutorProperty /*@NonNull*/ [] _SimpleTypeEnum = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Type = {
			MDSDComponentMetamodelTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		/**
		 *	Install the property descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Action__Action.initProperties(_Action);
			Fragments._BasicComponent__BasicComponent.initProperties(_BasicComponent);
			Fragments._Branch__Branch.initProperties(_Branch);
			Fragments._ComplexType__ComplexType.initProperties(_ComplexType);
			Fragments._Component__Component.initProperties(_Component);
			Fragments._ExternalCall__ExternalCall.initProperties(_ExternalCall);
			Fragments._Interface__Interface.initProperties(_Interface);
			Fragments._InternalAction__InternalAction.initProperties(_InternalAction);
			Fragments._Loop__Loop.initProperties(_Loop);
			Fragments._Parameter__Parameter.initProperties(_Parameter);
			Fragments._Repository__Repository.initProperties(_Repository);
			Fragments._Service__Service.initProperties(_Service);
			Fragments._Signature__Signature.initProperties(_Signature);
			Fragments._SimpleType__SimpleType.initProperties(_SimpleType);
			Fragments._SimpleTypeEnum__SimpleTypeEnum.initProperties(_SimpleTypeEnum);
			Fragments._Type__Type.initProperties(_Type);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of SystemIndependantTables::FragmentProperties and all preceding sub-packages.
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

		public static final EcoreExecutorEnumerationLiteral _SimpleTypeEnum__Boolean = new EcoreExecutorEnumerationLiteral(SystemIndependantPackage.Literals.SIMPLE_TYPE_ENUM.getEEnumLiteral("Boolean"), Types._SimpleTypeEnum, 0);
		public static final EcoreExecutorEnumerationLiteral _SimpleTypeEnum__Char = new EcoreExecutorEnumerationLiteral(SystemIndependantPackage.Literals.SIMPLE_TYPE_ENUM.getEEnumLiteral("Char"), Types._SimpleTypeEnum, 1);
		public static final EcoreExecutorEnumerationLiteral _SimpleTypeEnum__Date = new EcoreExecutorEnumerationLiteral(SystemIndependantPackage.Literals.SIMPLE_TYPE_ENUM.getEEnumLiteral("Date"), Types._SimpleTypeEnum, 2);
		public static final EcoreExecutorEnumerationLiteral _SimpleTypeEnum__Double = new EcoreExecutorEnumerationLiteral(SystemIndependantPackage.Literals.SIMPLE_TYPE_ENUM.getEEnumLiteral("Double"), Types._SimpleTypeEnum, 3);
		public static final EcoreExecutorEnumerationLiteral _SimpleTypeEnum__Float = new EcoreExecutorEnumerationLiteral(SystemIndependantPackage.Literals.SIMPLE_TYPE_ENUM.getEEnumLiteral("Float"), Types._SimpleTypeEnum, 4);
		public static final EcoreExecutorEnumerationLiteral _SimpleTypeEnum__List = new EcoreExecutorEnumerationLiteral(SystemIndependantPackage.Literals.SIMPLE_TYPE_ENUM.getEEnumLiteral("List"), Types._SimpleTypeEnum, 5);
		public static final EcoreExecutorEnumerationLiteral _SimpleTypeEnum__Int = new EcoreExecutorEnumerationLiteral(SystemIndependantPackage.Literals.SIMPLE_TYPE_ENUM.getEEnumLiteral("Int"), Types._SimpleTypeEnum, 6);
		public static final EcoreExecutorEnumerationLiteral _SimpleTypeEnum__Long = new EcoreExecutorEnumerationLiteral(SystemIndependantPackage.Literals.SIMPLE_TYPE_ENUM.getEEnumLiteral("Long"), Types._SimpleTypeEnum, 7);
		public static final EcoreExecutorEnumerationLiteral _SimpleTypeEnum__Map = new EcoreExecutorEnumerationLiteral(SystemIndependantPackage.Literals.SIMPLE_TYPE_ENUM.getEEnumLiteral("Map"), Types._SimpleTypeEnum, 8);
		public static final EcoreExecutorEnumerationLiteral _SimpleTypeEnum__String = new EcoreExecutorEnumerationLiteral(SystemIndependantPackage.Literals.SIMPLE_TYPE_ENUM.getEEnumLiteral("String"), Types._SimpleTypeEnum, 9);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _SimpleTypeEnum = {
			_SimpleTypeEnum__Boolean,
			_SimpleTypeEnum__Char,
			_SimpleTypeEnum__Date,
			_SimpleTypeEnum__Double,
			_SimpleTypeEnum__Float,
			_SimpleTypeEnum__List,
			_SimpleTypeEnum__Int,
			_SimpleTypeEnum__Long,
			_SimpleTypeEnum__Map,
			_SimpleTypeEnum__String
		};

		/**
		 *	Install the enumeration literals in the enumerations.
		 */
		static {
			Types._SimpleTypeEnum.initLiterals(_SimpleTypeEnum);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of SystemIndependantTables::EnumerationLiterals and all preceding sub-packages.
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
		new SystemIndependantTables();
	}

	private SystemIndependantTables() {
		super(SystemIndependantPackage.eNS_URI);
	}
}
