/*
 * generated by Xtext 2.39.0
 */
package org.xtext.componentsystem.dsl.serializer;

import MDSDComponentMetamodel.ComponentSystem;
import MDSDComponentMetamodel.MDSDComponentMetamodelPackage;
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
import MDSDComponentMetamodel.SystemIndependant.BasicComponent;
import MDSDComponentMetamodel.SystemIndependant.Branch;
import MDSDComponentMetamodel.SystemIndependant.ComplexType;
import MDSDComponentMetamodel.SystemIndependant.ExternalCall;
import MDSDComponentMetamodel.SystemIndependant.Interface;
import MDSDComponentMetamodel.SystemIndependant.InternalAction;
import MDSDComponentMetamodel.SystemIndependant.Loop;
import MDSDComponentMetamodel.SystemIndependant.Repository;
import MDSDComponentMetamodel.SystemIndependant.Service;
import MDSDComponentMetamodel.SystemIndependant.Signature;
import MDSDComponentMetamodel.SystemIndependant.SimpleType;
import MDSDComponentMetamodel.SystemIndependant.SystemIndependantPackage;
import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.xtext.componentsystem.dsl.services.DslGrammarAccess;

@SuppressWarnings("all")
public class DslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private DslGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == MDSDComponentMetamodelPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case MDSDComponentMetamodelPackage.COMPONENT_SYSTEM:
				sequence_ComponentSystem(context, (ComponentSystem) semanticObject); 
				return; 
			}
		else if (epackage == SystemDependantPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case SystemDependantPackage.ALLOCATION:
				sequence_Allocation(context, (Allocation) semanticObject); 
				return; 
			case SystemDependantPackage.ALLOCATION_CONTEXT:
				sequence_AllocationContext(context, (AllocationContext) semanticObject); 
				return; 
			case SystemDependantPackage.ASSEMBLY:
				sequence_Assembly(context, (Assembly) semanticObject); 
				return; 
			case SystemDependantPackage.ASSEMBLY_CONNECTOR:
				sequence_AssemblyConnector(context, (AssemblyConnector) semanticObject); 
				return; 
			case SystemDependantPackage.ASSEMBLY_CONTEXT:
				sequence_AssemblyContext(context, (AssemblyContext) semanticObject); 
				return; 
			case SystemDependantPackage.COMPOSITE_COMPONENT:
				sequence_CompositeComponent(context, (CompositeComponent) semanticObject); 
				return; 
			case SystemDependantPackage.CONTAINER:
				sequence_Container(context, (Container) semanticObject); 
				return; 
			case SystemDependantPackage.DELEGATION_CONNECTOR:
				sequence_DelegationConnector(context, (DelegationConnector) semanticObject); 
				return; 
			case SystemDependantPackage.ENVIRONMENT:
				sequence_Environment(context, (Environment) semanticObject); 
				return; 
			case SystemDependantPackage.LINK:
				sequence_Link(context, (Link) semanticObject); 
				return; 
			case SystemDependantPackage.ROLE:
				sequence_Role(context, (Role) semanticObject); 
				return; 
			case SystemDependantPackage.SYSTEM:
				sequence_System(context, (MDSDComponentMetamodel.SystemDependant.System) semanticObject); 
				return; 
			}
		else if (epackage == SystemIndependantPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case SystemIndependantPackage.BASIC_COMPONENT:
				sequence_BasicComponent(context, (BasicComponent) semanticObject); 
				return; 
			case SystemIndependantPackage.BRANCH:
				sequence_Branch(context, (Branch) semanticObject); 
				return; 
			case SystemIndependantPackage.COMPLEX_TYPE:
				sequence_ComplexType(context, (ComplexType) semanticObject); 
				return; 
			case SystemIndependantPackage.EXTERNAL_CALL:
				sequence_ExternalCall(context, (ExternalCall) semanticObject); 
				return; 
			case SystemIndependantPackage.INTERFACE:
				sequence_Interface(context, (Interface) semanticObject); 
				return; 
			case SystemIndependantPackage.INTERNAL_ACTION:
				sequence_InternalAction(context, (InternalAction) semanticObject); 
				return; 
			case SystemIndependantPackage.LOOP:
				sequence_Loop(context, (Loop) semanticObject); 
				return; 
			case SystemIndependantPackage.PARAMETER:
				sequence_Parameter(context, (MDSDComponentMetamodel.SystemIndependant.Parameter) semanticObject); 
				return; 
			case SystemIndependantPackage.REPOSITORY:
				sequence_Repository(context, (Repository) semanticObject); 
				return; 
			case SystemIndependantPackage.SERVICE:
				sequence_Service(context, (Service) semanticObject); 
				return; 
			case SystemIndependantPackage.SIGNATURE:
				sequence_Signature(context, (Signature) semanticObject); 
				return; 
			case SystemIndependantPackage.SIMPLE_TYPE:
				sequence_SimpleType(context, (SimpleType) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * <pre>
	 * Contexts:
	 *     AllocationContext returns AllocationContext
	 *
	 * Constraint:
	 *     (name=EString assemblyContext=[AssemblyContext|EString] container=[Container|EString])
	 * </pre>
	 */
	protected void sequence_AllocationContext(ISerializationContext context, AllocationContext semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MDSDComponentMetamodelPackage.Literals.NAMED_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MDSDComponentMetamodelPackage.Literals.NAMED_ELEMENT__NAME));
			if (transientValues.isValueTransient(semanticObject, SystemDependantPackage.Literals.ALLOCATION_CONTEXT__ASSEMBLY_CONTEXT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SystemDependantPackage.Literals.ALLOCATION_CONTEXT__ASSEMBLY_CONTEXT));
			if (transientValues.isValueTransient(semanticObject, SystemDependantPackage.Literals.ALLOCATION_CONTEXT__CONTAINER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SystemDependantPackage.Literals.ALLOCATION_CONTEXT__CONTAINER));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAllocationContextAccess().getNameEStringParserRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getAllocationContextAccess().getAssemblyContextAssemblyContextEStringParserRuleCall_3_0_1(), semanticObject.eGet(SystemDependantPackage.Literals.ALLOCATION_CONTEXT__ASSEMBLY_CONTEXT, false));
		feeder.accept(grammarAccess.getAllocationContextAccess().getContainerContainerEStringParserRuleCall_5_0_1(), semanticObject.eGet(SystemDependantPackage.Literals.ALLOCATION_CONTEXT__CONTAINER, false));
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Allocation returns Allocation
	 *
	 * Constraint:
	 *     (allocationContexts+=AllocationContext allocationContexts+=AllocationContext*)?
	 * </pre>
	 */
	protected void sequence_Allocation(ISerializationContext context, Allocation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     AssemblyConnector returns AssemblyConnector
	 *
	 * Constraint:
	 *     (name=EString requiredRole=[Role|EString] providedRole=[Role|EString])
	 * </pre>
	 */
	protected void sequence_AssemblyConnector(ISerializationContext context, AssemblyConnector semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MDSDComponentMetamodelPackage.Literals.NAMED_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MDSDComponentMetamodelPackage.Literals.NAMED_ELEMENT__NAME));
			if (transientValues.isValueTransient(semanticObject, SystemDependantPackage.Literals.ASSEMBLY_CONNECTOR__REQUIRED_ROLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SystemDependantPackage.Literals.ASSEMBLY_CONNECTOR__REQUIRED_ROLE));
			if (transientValues.isValueTransient(semanticObject, SystemDependantPackage.Literals.ASSEMBLY_CONNECTOR__PROVIDED_ROLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SystemDependantPackage.Literals.ASSEMBLY_CONNECTOR__PROVIDED_ROLE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAssemblyConnectorAccess().getNameEStringParserRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getAssemblyConnectorAccess().getRequiredRoleRoleEStringParserRuleCall_2_0_1(), semanticObject.eGet(SystemDependantPackage.Literals.ASSEMBLY_CONNECTOR__REQUIRED_ROLE, false));
		feeder.accept(grammarAccess.getAssemblyConnectorAccess().getProvidedRoleRoleEStringParserRuleCall_4_0_1(), semanticObject.eGet(SystemDependantPackage.Literals.ASSEMBLY_CONNECTOR__PROVIDED_ROLE, false));
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     AssemblyContext returns AssemblyContext
	 *
	 * Constraint:
	 *     (name=EString component=[Component|EString] (providedRoles+=Role providedRoles+=Role*)? (requiredRoles+=Role requiredRoles+=Role*)?)
	 * </pre>
	 */
	protected void sequence_AssemblyContext(ISerializationContext context, AssemblyContext semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Assembly returns Assembly
	 *
	 * Constraint:
	 *     (
	 *         (assemblyContexts+=AssemblyContext assemblyContexts+=AssemblyContext*)? 
	 *         (compositeComponents+=CompositeComponent compositeComponents+=CompositeComponent*)? 
	 *         (assemblyConnectors+=AssemblyConnector assemblyConnectors+=AssemblyConnector*)? 
	 *         (delegationConnectors+=DelegationConnector delegationConnectors+=DelegationConnector*)?
	 *     )
	 * </pre>
	 */
	protected void sequence_Assembly(ISerializationContext context, Assembly semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Component returns BasicComponent
	 *     BasicComponent returns BasicComponent
	 *
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         (providedInterfaces+=[Interface|EString] providedInterfaces+=[Interface|EString]*)? 
	 *         (requiredInterfaces+=[Interface|EString] requiredInterfaces+=[Interface|EString]*)? 
	 *         (providedServices+=Service providedServices+=Service*)? 
	 *         (behaviorDescription+=Action behaviorDescription+=Action*)?
	 *     )
	 * </pre>
	 */
	protected void sequence_BasicComponent(ISerializationContext context, BasicComponent semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Action returns Branch
	 *     Branch returns Branch
	 *
	 * Constraint:
	 *     (name=EString condition=EString (actions+=Action actions+=Action*)?)
	 * </pre>
	 */
	protected void sequence_Branch(ISerializationContext context, Branch semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Type returns ComplexType
	 *     ComplexType returns ComplexType
	 *
	 * Constraint:
	 *     (name=EString attributes+=Parameter*)
	 * </pre>
	 */
	protected void sequence_ComplexType(ISerializationContext context, ComplexType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     ComponentSystem returns ComponentSystem
	 *
	 * Constraint:
	 *     (repositories+=Repository repositories+=Repository* (systems+=System systems+=System*)?)
	 * </pre>
	 */
	protected void sequence_ComponentSystem(ISerializationContext context, ComponentSystem semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     CompositeComponent returns CompositeComponent
	 *
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         (providedInterfaces+=[Interface|EString] providedInterfaces+=[Interface|EString]*)? 
	 *         (requiredInterfaces+=[Interface|EString] requiredInterfaces+=[Interface|EString]*)? 
	 *         (providedServices+=Service providedServices+=Service*)? 
	 *         (behaviorDescription+=Action behaviorDescription+=Action*)? 
	 *         assemblyContexts+=AssemblyContext 
	 *         assemblyContexts+=AssemblyContext* 
	 *         (assemblyConnectors+=AssemblyConnector assemblyConnectors+=AssemblyConnector*)? 
	 *         (delegationConnectors+=DelegationConnector delegationConnectors+=DelegationConnector*)?
	 *     )
	 * </pre>
	 */
	protected void sequence_CompositeComponent(ISerializationContext context, CompositeComponent semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Container returns Container
	 *
	 * Constraint:
	 *     name=EString
	 * </pre>
	 */
	protected void sequence_Container(ISerializationContext context, Container semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MDSDComponentMetamodelPackage.Literals.NAMED_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MDSDComponentMetamodelPackage.Literals.NAMED_ELEMENT__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getContainerAccess().getNameEStringParserRuleCall_2_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     DelegationConnector returns DelegationConnector
	 *
	 * Constraint:
	 *     (name=EString role=[Role|EString] delegatedInterface=[Interface|EString])
	 * </pre>
	 */
	protected void sequence_DelegationConnector(ISerializationContext context, DelegationConnector semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MDSDComponentMetamodelPackage.Literals.NAMED_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MDSDComponentMetamodelPackage.Literals.NAMED_ELEMENT__NAME));
			if (transientValues.isValueTransient(semanticObject, SystemDependantPackage.Literals.DELEGATION_CONNECTOR__ROLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SystemDependantPackage.Literals.DELEGATION_CONNECTOR__ROLE));
			if (transientValues.isValueTransient(semanticObject, SystemDependantPackage.Literals.DELEGATION_CONNECTOR__DELEGATED_INTERFACE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SystemDependantPackage.Literals.DELEGATION_CONNECTOR__DELEGATED_INTERFACE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDelegationConnectorAccess().getNameEStringParserRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getDelegationConnectorAccess().getRoleRoleEStringParserRuleCall_2_0_1(), semanticObject.eGet(SystemDependantPackage.Literals.DELEGATION_CONNECTOR__ROLE, false));
		feeder.accept(grammarAccess.getDelegationConnectorAccess().getDelegatedInterfaceInterfaceEStringParserRuleCall_4_0_1(), semanticObject.eGet(SystemDependantPackage.Literals.DELEGATION_CONNECTOR__DELEGATED_INTERFACE, false));
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Environment returns Environment
	 *
	 * Constraint:
	 *     ((links+=Link links+=Link*)? (containers+=Container containers+=Container*)?)
	 * </pre>
	 */
	protected void sequence_Environment(ISerializationContext context, Environment semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Action returns ExternalCall
	 *     ExternalCall returns ExternalCall
	 *
	 * Constraint:
	 *     name=EString
	 * </pre>
	 */
	protected void sequence_ExternalCall(ISerializationContext context, ExternalCall semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MDSDComponentMetamodelPackage.Literals.NAMED_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MDSDComponentMetamodelPackage.Literals.NAMED_ELEMENT__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getExternalCallAccess().getNameEStringParserRuleCall_2_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Interface returns Interface
	 *
	 * Constraint:
	 *     (name=EString signatures+=Signature*)
	 * </pre>
	 */
	protected void sequence_Interface(ISerializationContext context, Interface semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Action returns InternalAction
	 *     InternalAction returns InternalAction
	 *
	 * Constraint:
	 *     name=EString
	 * </pre>
	 */
	protected void sequence_InternalAction(ISerializationContext context, InternalAction semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MDSDComponentMetamodelPackage.Literals.NAMED_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MDSDComponentMetamodelPackage.Literals.NAMED_ELEMENT__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getInternalActionAccess().getNameEStringParserRuleCall_2_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Link returns Link
	 *
	 * Constraint:
	 *     (name=EString containers+=[Container|EString] containers+=[Container|EString]+)
	 * </pre>
	 */
	protected void sequence_Link(ISerializationContext context, Link semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Action returns Loop
	 *     Loop returns Loop
	 *
	 * Constraint:
	 *     (name=EString condition=EString (actions+=Action actions+=Action*)?)
	 * </pre>
	 */
	protected void sequence_Loop(ISerializationContext context, Loop semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Parameter returns Parameter
	 *
	 * Constraint:
	 *     (type=[Type|EString] name=EString)
	 * </pre>
	 */
	protected void sequence_Parameter(ISerializationContext context, MDSDComponentMetamodel.SystemIndependant.Parameter semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SystemIndependantPackage.Literals.PARAMETER__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SystemIndependantPackage.Literals.PARAMETER__TYPE));
			if (transientValues.isValueTransient(semanticObject, MDSDComponentMetamodelPackage.Literals.NAMED_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MDSDComponentMetamodelPackage.Literals.NAMED_ELEMENT__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getParameterAccess().getTypeTypeEStringParserRuleCall_0_0_1(), semanticObject.eGet(SystemIndependantPackage.Literals.PARAMETER__TYPE, false));
		feeder.accept(grammarAccess.getParameterAccess().getNameEStringParserRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Repository returns Repository
	 *
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         (components+=BasicComponent components+=BasicComponent*)? 
	 *         (interfaces+=Interface interfaces+=Interface*)? 
	 *         (types+=Type types+=Type*)?
	 *     )
	 * </pre>
	 */
	protected void sequence_Repository(ISerializationContext context, Repository semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Role returns Role
	 *
	 * Constraint:
	 *     (name=EString interface=[Interface|EString])
	 * </pre>
	 */
	protected void sequence_Role(ISerializationContext context, Role semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MDSDComponentMetamodelPackage.Literals.NAMED_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MDSDComponentMetamodelPackage.Literals.NAMED_ELEMENT__NAME));
			if (transientValues.isValueTransient(semanticObject, SystemDependantPackage.Literals.ROLE__INTERFACE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SystemDependantPackage.Literals.ROLE__INTERFACE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getRoleAccess().getNameEStringParserRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getRoleAccess().getInterfaceInterfaceEStringParserRuleCall_3_0_1(), semanticObject.eGet(SystemDependantPackage.Literals.ROLE__INTERFACE, false));
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Service returns Service
	 *
	 * Constraint:
	 *     (name=EString correspondingSignature=[Signature|EString])
	 * </pre>
	 */
	protected void sequence_Service(ISerializationContext context, Service semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MDSDComponentMetamodelPackage.Literals.NAMED_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MDSDComponentMetamodelPackage.Literals.NAMED_ELEMENT__NAME));
			if (transientValues.isValueTransient(semanticObject, SystemIndependantPackage.Literals.SERVICE__CORRESPONDING_SIGNATURE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SystemIndependantPackage.Literals.SERVICE__CORRESPONDING_SIGNATURE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getServiceAccess().getNameEStringParserRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getServiceAccess().getCorrespondingSignatureSignatureEStringParserRuleCall_3_0_1(), semanticObject.eGet(SystemIndependantPackage.Literals.SERVICE__CORRESPONDING_SIGNATURE, false));
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Signature returns Signature
	 *
	 * Constraint:
	 *     (returnType=[Type|EString]? name=EString (parameters+=Parameter parameters+=Parameter*)?)
	 * </pre>
	 */
	protected void sequence_Signature(ISerializationContext context, Signature semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Type returns SimpleType
	 *     SimpleType returns SimpleType
	 *
	 * Constraint:
	 *     (name=EString type=SimpleTypeEnum)
	 * </pre>
	 */
	protected void sequence_SimpleType(ISerializationContext context, SimpleType semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MDSDComponentMetamodelPackage.Literals.NAMED_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MDSDComponentMetamodelPackage.Literals.NAMED_ELEMENT__NAME));
			if (transientValues.isValueTransient(semanticObject, SystemIndependantPackage.Literals.SIMPLE_TYPE__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SystemIndependantPackage.Literals.SIMPLE_TYPE__TYPE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSimpleTypeAccess().getNameEStringParserRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getSimpleTypeAccess().getTypeSimpleTypeEnumEnumRuleCall_4_0(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     System returns System
	 *
	 * Constraint:
	 *     (interfaces+=[Interface|EString] interfaces+=[Interface|EString]* assembly=Assembly allocation=Allocation environment=Environment)
	 * </pre>
	 */
	protected void sequence_System(ISerializationContext context, MDSDComponentMetamodel.SystemDependant.System semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
