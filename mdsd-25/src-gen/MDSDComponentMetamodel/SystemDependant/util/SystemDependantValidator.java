/**
 */
package MDSDComponentMetamodel.SystemDependant.util;

import MDSDComponentMetamodel.SystemDependant.Allocation;
import MDSDComponentMetamodel.SystemDependant.AllocationContext;
import MDSDComponentMetamodel.SystemDependant.Assembly;
import MDSDComponentMetamodel.SystemDependant.AssemblyConnector;
import MDSDComponentMetamodel.SystemDependant.AssemblyContext;
import MDSDComponentMetamodel.SystemDependant.CompositeComponent;
import MDSDComponentMetamodel.SystemDependant.Container;
import MDSDComponentMetamodel.SystemDependant.DelegationConnector;
import MDSDComponentMetamodel.SystemDependant.Environment;
import MDSDComponentMetamodel.SystemDependant.Link;
import MDSDComponentMetamodel.SystemDependant.Role;
import MDSDComponentMetamodel.SystemDependant.SystemDependantPackage;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see MDSDComponentMetamodel.SystemDependant.SystemDependantPackage
 * @generated
 */
public class SystemDependantValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final SystemDependantValidator INSTANCE = new SystemDependantValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "MDSDComponentMetamodel.SystemDependant";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Delegation Connectors For Provided Interfaces Of Composite Components Exist' of 'Composite Component'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COMPOSITE_COMPONENT__DELEGATION_CONNECTORS_FOR_PROVIDED_INTERFACES_OF_COMPOSITE_COMPONENTS_EXIST = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'No Circular Dependency In Assembly Context Hierarchy' of 'Composite Component'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COMPOSITE_COMPONENT__NO_CIRCULAR_DEPENDENCY_IN_ASSEMBLY_CONTEXT_HIERARCHY = 2;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Delegation Connectors Are Well Formed' of 'Composite Component'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COMPOSITE_COMPONENT__DELEGATION_CONNECTORS_ARE_WELL_FORMED = 3;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Composed Assembly Contexts Are Not Allocated' of 'Composite Component'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COMPOSITE_COMPONENT__COMPOSED_ASSEMBLY_CONTEXTS_ARE_NOT_ALLOCATED = 4;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Delegation Connectors For Provided Interfaces Of System Exist' of 'System'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SYSTEM__DELEGATION_CONNECTORS_FOR_PROVIDED_INTERFACES_OF_SYSTEM_EXIST = 5;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Delegation Connectors Are Well Formed' of 'System'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SYSTEM__DELEGATION_CONNECTORS_ARE_WELL_FORMED = 6;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Provided Or Required Matches' of 'Assembly Connector'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ASSEMBLY_CONNECTOR__PROVIDED_OR_REQUIRED_MATCHES = 7;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Connected Roles Are In Same Container Or Linked Containers' of 'Assembly Connector'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ASSEMBLY_CONNECTOR__CONNECTED_ROLES_ARE_IN_SAME_CONTAINER_OR_LINKED_CONTAINERS = 8;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Provided Interfaces Match' of 'Assembly Context'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ASSEMBLY_CONTEXT__PROVIDED_INTERFACES_MATCH = 9;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Required Interfaces Match' of 'Assembly Context'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ASSEMBLY_CONTEXT__REQUIRED_INTERFACES_MATCH = 10;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 10;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemDependantValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
		return SystemDependantPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		switch (classifierID) {
		case SystemDependantPackage.COMPOSITE_COMPONENT:
			return validateCompositeComponent((CompositeComponent) value, diagnostics, context);
		case SystemDependantPackage.SYSTEM:
			return validateSystem((MDSDComponentMetamodel.SystemDependant.System) value, diagnostics, context);
		case SystemDependantPackage.ROLE:
			return validateRole((Role) value, diagnostics, context);
		case SystemDependantPackage.ASSEMBLY:
			return validateAssembly((Assembly) value, diagnostics, context);
		case SystemDependantPackage.ASSEMBLY_CONNECTOR:
			return validateAssemblyConnector((AssemblyConnector) value, diagnostics, context);
		case SystemDependantPackage.ASSEMBLY_CONTEXT:
			return validateAssemblyContext((AssemblyContext) value, diagnostics, context);
		case SystemDependantPackage.ALLOCATION:
			return validateAllocation((Allocation) value, diagnostics, context);
		case SystemDependantPackage.CONTAINER:
			return validateContainer((Container) value, diagnostics, context);
		case SystemDependantPackage.ENVIRONMENT:
			return validateEnvironment((Environment) value, diagnostics, context);
		case SystemDependantPackage.LINK:
			return validateLink((Link) value, diagnostics, context);
		case SystemDependantPackage.ALLOCATION_CONTEXT:
			return validateAllocationContext((AllocationContext) value, diagnostics, context);
		case SystemDependantPackage.DELEGATION_CONNECTOR:
			return validateDelegationConnector((DelegationConnector) value, diagnostics, context);
		default:
			return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCompositeComponent(CompositeComponent compositeComponent, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(compositeComponent, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(compositeComponent, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(compositeComponent, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(compositeComponent, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(compositeComponent, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(compositeComponent, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(compositeComponent, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(compositeComponent, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(compositeComponent, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateCompositeComponent_composedAssemblyContextsAreNotAllocated(compositeComponent,
					diagnostics, context);
		if (result || diagnostics != null)
			result &= validateCompositeComponent_delegationConnectorsForProvidedInterfacesOfCompositeComponentsExist(
					compositeComponent, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateCompositeComponent_noCircularDependencyInAssemblyContextHierarchy(compositeComponent,
					diagnostics, context);
		if (result || diagnostics != null)
			result &= validateCompositeComponent_delegationConnectorsAreWellFormed(compositeComponent, diagnostics,
					context);
		return result;
	}

	/**
	 * Validates the composedAssemblyContextsAreNotAllocated constraint of '<em>Composite Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCompositeComponent_composedAssemblyContextsAreNotAllocated(
			CompositeComponent compositeComponent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return compositeComponent.composedAssemblyContextsAreNotAllocated(diagnostics, context);
	}

	/**
	 * Validates the delegationConnectorsForProvidedInterfacesOfCompositeComponentsExist constraint of '<em>Composite Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCompositeComponent_delegationConnectorsForProvidedInterfacesOfCompositeComponentsExist(
			CompositeComponent compositeComponent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return compositeComponent.delegationConnectorsForProvidedInterfacesOfCompositeComponentsExist(diagnostics,
				context);
	}

	/**
	 * Validates the noCircularDependencyInAssemblyContextHierarchy constraint of '<em>Composite Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCompositeComponent_noCircularDependencyInAssemblyContextHierarchy(
			CompositeComponent compositeComponent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return compositeComponent.noCircularDependencyInAssemblyContextHierarchy(diagnostics, context);
	}

	/**
	 * Validates the delegationConnectorsAreWellFormed constraint of '<em>Composite Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCompositeComponent_delegationConnectorsAreWellFormed(CompositeComponent compositeComponent,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return compositeComponent.delegationConnectorsAreWellFormed(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSystem(MDSDComponentMetamodel.SystemDependant.System system, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(system, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(system, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(system, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(system, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(system, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(system, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(system, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(system, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(system, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateSystem_delegationConnectorsAreWellFormed(system, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateSystem_delegationConnectorsForProvidedInterfacesOfSystemExist(system, diagnostics,
					context);
		return result;
	}

	/**
	 * Validates the delegationConnectorsAreWellFormed constraint of '<em>System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSystem_delegationConnectorsAreWellFormed(
			MDSDComponentMetamodel.SystemDependant.System system, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return system.delegationConnectorsAreWellFormed(diagnostics, context);
	}

	/**
	 * Validates the delegationConnectorsForProvidedInterfacesOfSystemExist constraint of '<em>System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSystem_delegationConnectorsForProvidedInterfacesOfSystemExist(
			MDSDComponentMetamodel.SystemDependant.System system, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return system.delegationConnectorsForProvidedInterfacesOfSystemExist(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRole(Role role, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(role, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssembly(Assembly assembly, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(assembly, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssemblyConnector(AssemblyConnector assemblyConnector, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(assemblyConnector, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(assemblyConnector, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(assemblyConnector, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(assemblyConnector, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(assemblyConnector, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(assemblyConnector, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(assemblyConnector, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(assemblyConnector, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(assemblyConnector, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateAssemblyConnector_connectedRolesAreInSameContainerOrLinkedContainers(assemblyConnector,
					diagnostics, context);
		if (result || diagnostics != null)
			result &= validateAssemblyConnector_providedOrRequiredMatches(assemblyConnector, diagnostics, context);
		return result;
	}

	/**
	 * Validates the connectedRolesAreInSameContainerOrLinkedContainers constraint of '<em>Assembly Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssemblyConnector_connectedRolesAreInSameContainerOrLinkedContainers(
			AssemblyConnector assemblyConnector, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return assemblyConnector.connectedRolesAreInSameContainerOrLinkedContainers(diagnostics, context);
	}

	/**
	 * Validates the providedOrRequiredMatches constraint of '<em>Assembly Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssemblyConnector_providedOrRequiredMatches(AssemblyConnector assemblyConnector,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return assemblyConnector.providedOrRequiredMatches(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssemblyContext(AssemblyContext assemblyContext, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(assemblyContext, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(assemblyContext, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(assemblyContext, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(assemblyContext, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(assemblyContext, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(assemblyContext, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(assemblyContext, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(assemblyContext, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(assemblyContext, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateAssemblyContext_requiredInterfacesMatch(assemblyContext, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateAssemblyContext_providedInterfacesMatch(assemblyContext, diagnostics, context);
		return result;
	}

	/**
	 * Validates the requiredInterfacesMatch constraint of '<em>Assembly Context</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssemblyContext_requiredInterfacesMatch(AssemblyContext assemblyContext,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return assemblyContext.requiredInterfacesMatch(diagnostics, context);
	}

	/**
	 * Validates the providedInterfacesMatch constraint of '<em>Assembly Context</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssemblyContext_providedInterfacesMatch(AssemblyContext assemblyContext,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return assemblyContext.providedInterfacesMatch(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllocation(Allocation allocation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(allocation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContainer(Container container, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(container, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnvironment(Environment environment, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(environment, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLink(Link link, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(link, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllocationContext(AllocationContext allocationContext, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(allocationContext, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDelegationConnector(DelegationConnector delegationConnector, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(delegationConnector, diagnostics, context);
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //SystemDependantValidator
