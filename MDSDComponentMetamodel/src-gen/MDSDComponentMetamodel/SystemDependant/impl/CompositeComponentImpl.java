/**
 */
package MDSDComponentMetamodel.SystemDependant.impl;

import MDSDComponentMetamodel.SystemDependant.AllocationContext;
import MDSDComponentMetamodel.SystemDependant.AssemblyConnector;
import MDSDComponentMetamodel.SystemDependant.AssemblyContext;
import MDSDComponentMetamodel.SystemDependant.CompositeComponent;
import MDSDComponentMetamodel.SystemDependant.DelegationConnector;
import MDSDComponentMetamodel.SystemDependant.Role;
import MDSDComponentMetamodel.SystemDependant.SystemDependantPackage;
import MDSDComponentMetamodel.SystemDependant.SystemDependantTables;

import MDSDComponentMetamodel.SystemIndependant.Component;
import MDSDComponentMetamodel.SystemIndependant.Interface;

import MDSDComponentMetamodel.SystemIndependant.impl.ComponentImpl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.ocl.pivot.evaluation.Executor;

import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;

import org.eclipse.ocl.pivot.library.collection.CollectionIncludesOperation;

import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;

import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;

import org.eclipse.ocl.pivot.messages.PivotMessages;

import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;

import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.InvalidValueException;
import org.eclipse.ocl.pivot.values.OrderedSetValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Composite Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MDSDComponentMetamodel.SystemDependant.impl.CompositeComponentImpl#getAssemblyContexts <em>Assembly Contexts</em>}</li>
 *   <li>{@link MDSDComponentMetamodel.SystemDependant.impl.CompositeComponentImpl#getAssemblyConnectors <em>Assembly Connectors</em>}</li>
 *   <li>{@link MDSDComponentMetamodel.SystemDependant.impl.CompositeComponentImpl#getDelegationConnectors <em>Delegation Connectors</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompositeComponentImpl extends ComponentImpl implements CompositeComponent {
	/**
	 * The cached value of the '{@link #getAssemblyContexts() <em>Assembly Contexts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssemblyContexts()
	 * @generated
	 * @ordered
	 */
	protected EList<AssemblyContext> assemblyContexts;

	/**
	 * The cached value of the '{@link #getAssemblyConnectors() <em>Assembly Connectors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssemblyConnectors()
	 * @generated
	 * @ordered
	 */
	protected EList<AssemblyConnector> assemblyConnectors;

	/**
	 * The cached value of the '{@link #getDelegationConnectors() <em>Delegation Connectors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelegationConnectors()
	 * @generated
	 * @ordered
	 */
	protected EList<DelegationConnector> delegationConnectors;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompositeComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SystemDependantPackage.Literals.COMPOSITE_COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AssemblyContext> getAssemblyContexts() {
		if (assemblyContexts == null) {
			assemblyContexts = new EObjectContainmentEList<AssemblyContext>(AssemblyContext.class, this,
					SystemDependantPackage.COMPOSITE_COMPONENT__ASSEMBLY_CONTEXTS);
		}
		return assemblyContexts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AssemblyConnector> getAssemblyConnectors() {
		if (assemblyConnectors == null) {
			assemblyConnectors = new EObjectContainmentEList<AssemblyConnector>(AssemblyConnector.class, this,
					SystemDependantPackage.COMPOSITE_COMPONENT__ASSEMBLY_CONNECTORS);
		}
		return assemblyConnectors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DelegationConnector> getDelegationConnectors() {
		if (delegationConnectors == null) {
			delegationConnectors = new EObjectContainmentEList<DelegationConnector>(DelegationConnector.class, this,
					SystemDependantPackage.COMPOSITE_COMPONENT__DELEGATION_CONNECTORS);
		}
		return delegationConnectors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean delegationConnectorsForProvidedInterfacesOfCompositeComponentsExist(
			final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "CompositeComponent::delegationConnectorsForProvidedInterfacesOfCompositeComponentsExist";
		try {
			/**
			 *
			 * inv delegationConnectorsForProvidedInterfacesOfCompositeComponentsExist:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = self.providedInterfaces->forAll(i |
			 *           self.delegationConnectors->exists(dc | dc.delegatedInterface = i))
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					SystemDependantPackage.Literals.COMPOSITE_COMPONENT___DELEGATION_CONNECTORS_FOR_PROVIDED_INTERFACES_OF_COMPOSITE_COMPONENTS_EXIST__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, SystemDependantTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			} else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					final /*@NonInvalid*/ List<Interface> providedInterfaces = this.getProvidedInterfaces();
					final /*@NonInvalid*/ OrderedSetValue BOXED_providedInterfaces = idResolver
							.createOrderedSetOfAll(SystemDependantTables.ORD_CLSSid_Interface, providedInterfaces);
					/*@Thrown*/ Object accumulator = ValueUtil.TRUE_VALUE;
					Iterator<Object> ITERATOR_i = BOXED_providedInterfaces.iterator();
					/*@Thrown*/ Boolean result;
					while (true) {
						if (!ITERATOR_i.hasNext()) {
							if (accumulator == null) {
								result = null;
							} else if (accumulator == ValueUtil.TRUE_VALUE) {
								result = ValueUtil.TRUE_VALUE;
							} else {
								throw (InvalidValueException) accumulator;
							}
							break;
						}
						/*@NonInvalid*/ Interface i = (Interface) ITERATOR_i.next();
						/**
						 *
						 * self.delegationConnectors->exists(dc | dc.delegatedInterface = i)
						 */
						final /*@NonInvalid*/ List<DelegationConnector> delegationConnectors = this
								.getDelegationConnectors();
						final /*@NonInvalid*/ OrderedSetValue BOXED_delegationConnectors = idResolver
								.createOrderedSetOfAll(SystemDependantTables.ORD_CLSSid_DelegationConnector,
										delegationConnectors);
						/*@Thrown*/ Object accumulator_0 = ValueUtil.FALSE_VALUE;
						Iterator<Object> ITERATOR_dc = BOXED_delegationConnectors.iterator();
						/*@NonInvalid*/ Boolean exists;
						while (true) {
							if (!ITERATOR_dc.hasNext()) {
								if (accumulator_0 == ValueUtil.FALSE_VALUE) {
									exists = ValueUtil.FALSE_VALUE;
								} else {
									throw (InvalidValueException) accumulator_0;
								}
								break;
							}
							/*@NonInvalid*/ DelegationConnector dc = (DelegationConnector) ITERATOR_dc.next();
							/**
							 * dc.delegatedInterface = i
							 */
							final /*@NonInvalid*/ Interface delegatedInterface = dc.getDelegatedInterface();
							final /*@NonInvalid*/ boolean eq = delegatedInterface.equals(i);
							//
							if (eq) { // Normal successful body evaluation result
								exists = ValueUtil.TRUE_VALUE;
								break; // Stop immediately
							} else if (!eq) { // Normal unsuccessful body evaluation result
								; // Carry on
							} else { // Impossible badly typed result
								accumulator_0 = new InvalidValueException(PivotMessages.NonBooleanBody, "exists");
							}
						}
						//
						if (exists == ValueUtil.FALSE_VALUE) { // Normal unsuccessful body evaluation result
							result = ValueUtil.FALSE_VALUE;
							break; // Stop immediately
						} else if (exists == ValueUtil.TRUE_VALUE) { // Normal successful body evaluation result
							; // Carry on
						} else if (exists == null) { // Abnormal null body evaluation result
							if (accumulator == ValueUtil.TRUE_VALUE) {
								accumulator = null; // Cache a null failure
							}
						} else { // Impossible badly typed result
							accumulator = new InvalidValueException(PivotMessages.NonBooleanBody, "forAll");
						}
					}
					CAUGHT_result = result;
				} catch (Exception e) {
					CAUGHT_result = ValueUtil.createInvalidValue(e);
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE
						.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object) null, diagnostics, context,
								(Object) null, severity_0, CAUGHT_result, SystemDependantTables.INT_0)
						.booleanValue();
				IF_le = logDiagnostic;
			}
			return IF_le;
		} catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean noCircularDependencyInAssemblyContextHierarchy(final DiagnosticChain diagnostics,
			final Map<Object, Object> context) {
		final String constraintName = "CompositeComponent::noCircularDependencyInAssemblyContextHierarchy";
		try {
			/**
			 *
			 * inv noCircularDependencyInAssemblyContextHierarchy:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = self.assemblyContexts->forAll(a | a.component <> self)
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					SystemDependantPackage.Literals.COMPOSITE_COMPONENT___NO_CIRCULAR_DEPENDENCY_IN_ASSEMBLY_CONTEXT_HIERARCHY__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, SystemDependantTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			} else {
				final /*@NonInvalid*/ List<AssemblyContext> assemblyContexts = this.getAssemblyContexts();
				final /*@NonInvalid*/ OrderedSetValue BOXED_assemblyContexts = idResolver
						.createOrderedSetOfAll(SystemDependantTables.ORD_CLSSid_AssemblyContext, assemblyContexts);
				/*@Thrown*/ Object accumulator = ValueUtil.TRUE_VALUE;
				Iterator<Object> ITERATOR_a = BOXED_assemblyContexts.iterator();
				/*@NonInvalid*/ Boolean result;
				while (true) {
					if (!ITERATOR_a.hasNext()) {
						if (accumulator == ValueUtil.TRUE_VALUE) {
							result = ValueUtil.TRUE_VALUE;
						} else {
							throw (InvalidValueException) accumulator;
						}
						break;
					}
					/*@NonInvalid*/ AssemblyContext a = (AssemblyContext) ITERATOR_a.next();
					/**
					 * a.component <> self
					 */
					final /*@NonInvalid*/ Component component = a.getComponent();
					final /*@NonInvalid*/ boolean ne = !component.equals(this);
					//
					if (!ne) { // Normal unsuccessful body evaluation result
						result = ValueUtil.FALSE_VALUE;
						break; // Stop immediately
					} else if (ne) { // Normal successful body evaluation result
						; // Carry on
					} else { // Impossible badly typed result
						accumulator = new InvalidValueException(PivotMessages.NonBooleanBody, "forAll");
					}
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE
						.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object) null, diagnostics, context,
								(Object) null, severity_0, result, SystemDependantTables.INT_0)
						.booleanValue();
				IF_le = logDiagnostic;
			}
			return IF_le;
		} catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean delegationConnectorsAreWellFormed(final DiagnosticChain diagnostics,
			final Map<Object, Object> context) {
		final String constraintName = "CompositeComponent::delegationConnectorsAreWellFormed";
		try {
			/**
			 *
			 * inv delegationConnectorsAreWellFormed:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = self.delegationConnectors->forAll(dc |
			 *           self.providedInterfaces->includes(dc.delegatedInterface) and
			 *           self.assemblyContexts->exists(ac |
			 *             ac.providedRoles->includes(dc.role)) or
			 *           self.requiredInterfaces->includes(dc.delegatedInterface) and
			 *           self.assemblyContexts->exists(ac |
			 *             ac.requiredRoles->includes(dc.role)))
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					SystemDependantPackage.Literals.COMPOSITE_COMPONENT___DELEGATION_CONNECTORS_ARE_WELL_FORMED__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, SystemDependantTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			} else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					final /*@NonInvalid*/ List<DelegationConnector> delegationConnectors = this
							.getDelegationConnectors();
					final /*@NonInvalid*/ OrderedSetValue BOXED_delegationConnectors = idResolver.createOrderedSetOfAll(
							SystemDependantTables.ORD_CLSSid_DelegationConnector, delegationConnectors);
					/*@Thrown*/ Object accumulator = ValueUtil.TRUE_VALUE;
					Iterator<Object> ITERATOR_dc = BOXED_delegationConnectors.iterator();
					/*@Thrown*/ Boolean result;
					while (true) {
						if (!ITERATOR_dc.hasNext()) {
							if (accumulator == null) {
								result = null;
							} else if (accumulator == ValueUtil.TRUE_VALUE) {
								result = ValueUtil.TRUE_VALUE;
							} else {
								throw (InvalidValueException) accumulator;
							}
							break;
						}
						/*@NonInvalid*/ DelegationConnector dc = (DelegationConnector) ITERATOR_dc.next();
						/**
						 *
						 * self.providedInterfaces->includes(dc.delegatedInterface) and
						 * self.assemblyContexts->exists(ac |
						 *   ac.providedRoles->includes(dc.role)) or
						 * self.requiredInterfaces->includes(dc.delegatedInterface) and
						 * self.assemblyContexts->exists(ac |
						 *   ac.requiredRoles->includes(dc.role))
						 */
						/*@Caught*/ Object CAUGHT_or;
						try {
							/*@Caught*/ Object CAUGHT_and;
							try {
								final /*@NonInvalid*/ List<Interface> providedInterfaces = this.getProvidedInterfaces();
								final /*@NonInvalid*/ OrderedSetValue BOXED_providedInterfaces = idResolver
										.createOrderedSetOfAll(SystemDependantTables.ORD_CLSSid_Interface,
												providedInterfaces);
								final /*@NonInvalid*/ Interface delegatedInterface = dc.getDelegatedInterface();
								final /*@NonInvalid*/ boolean includes = CollectionIncludesOperation.INSTANCE
										.evaluate(BOXED_providedInterfaces, delegatedInterface).booleanValue();
								final /*@Thrown*/ Boolean and;
								if (!includes) {
									and = ValueUtil.FALSE_VALUE;
								} else {
									final /*@NonInvalid*/ List<AssemblyContext> assemblyContexts = this
											.getAssemblyContexts();
									final /*@NonInvalid*/ OrderedSetValue BOXED_assemblyContexts = idResolver
											.createOrderedSetOfAll(SystemDependantTables.ORD_CLSSid_AssemblyContext,
													assemblyContexts);
									/*@Thrown*/ Object accumulator_0 = ValueUtil.FALSE_VALUE;
									Iterator<Object> ITERATOR_ac = BOXED_assemblyContexts.iterator();
									/*@NonInvalid*/ Boolean exists;
									while (true) {
										if (!ITERATOR_ac.hasNext()) {
											if (accumulator_0 == ValueUtil.FALSE_VALUE) {
												exists = ValueUtil.FALSE_VALUE;
											} else {
												throw (InvalidValueException) accumulator_0;
											}
											break;
										}
										/*@NonInvalid*/ AssemblyContext ac = (AssemblyContext) ITERATOR_ac.next();
										/**
										 * ac.providedRoles->includes(dc.role)
										 */
										final /*@NonInvalid*/ List<Role> providedRoles = ac.getProvidedRoles();
										final /*@NonInvalid*/ OrderedSetValue BOXED_providedRoles = idResolver
												.createOrderedSetOfAll(SystemDependantTables.ORD_CLSSid_Role,
														providedRoles);
										final /*@NonInvalid*/ Role role = dc.getRole();
										final /*@NonInvalid*/ boolean includes_0 = CollectionIncludesOperation.INSTANCE
												.evaluate(BOXED_providedRoles, role).booleanValue();
										//
										if (includes_0) { // Normal successful body evaluation result
											exists = ValueUtil.TRUE_VALUE;
											break; // Stop immediately
										} else if (!includes_0) { // Normal unsuccessful body evaluation result
											; // Carry on
										} else { // Impossible badly typed result
											accumulator_0 = new InvalidValueException(PivotMessages.NonBooleanBody,
													"exists");
										}
									}
									if (exists == ValueUtil.FALSE_VALUE) {
										and = ValueUtil.FALSE_VALUE;
									} else {
										if (exists == null) {
											and = null;
										} else {
											and = ValueUtil.TRUE_VALUE;
										}
									}
								}
								CAUGHT_and = and;
							} catch (Exception e) {
								CAUGHT_and = ValueUtil.createInvalidValue(e);
							}
							final /*@Thrown*/ Boolean or;
							if (CAUGHT_and == ValueUtil.TRUE_VALUE) {
								or = ValueUtil.TRUE_VALUE;
							} else {
								/*@Caught*/ Object CAUGHT_and_0;
								try {
									final /*@NonInvalid*/ List<Interface> requiredInterfaces = this
											.getRequiredInterfaces();
									final /*@NonInvalid*/ OrderedSetValue BOXED_requiredInterfaces = idResolver
											.createOrderedSetOfAll(SystemDependantTables.ORD_CLSSid_Interface,
													requiredInterfaces);
									final /*@NonInvalid*/ Interface delegatedInterface_0 = dc.getDelegatedInterface();
									final /*@NonInvalid*/ boolean includes_1 = CollectionIncludesOperation.INSTANCE
											.evaluate(BOXED_requiredInterfaces, delegatedInterface_0).booleanValue();
									final /*@Thrown*/ Boolean and_0;
									if (!includes_1) {
										and_0 = ValueUtil.FALSE_VALUE;
									} else {
										final /*@NonInvalid*/ List<AssemblyContext> assemblyContexts_0 = this
												.getAssemblyContexts();
										final /*@NonInvalid*/ OrderedSetValue BOXED_assemblyContexts_0 = idResolver
												.createOrderedSetOfAll(SystemDependantTables.ORD_CLSSid_AssemblyContext,
														assemblyContexts_0);
										/*@Thrown*/ Object accumulator_1 = ValueUtil.FALSE_VALUE;
										Iterator<Object> ITERATOR_ac_0 = BOXED_assemblyContexts_0.iterator();
										/*@NonInvalid*/ Boolean exists_0;
										while (true) {
											if (!ITERATOR_ac_0.hasNext()) {
												if (accumulator_1 == ValueUtil.FALSE_VALUE) {
													exists_0 = ValueUtil.FALSE_VALUE;
												} else {
													throw (InvalidValueException) accumulator_1;
												}
												break;
											}
											/*@NonInvalid*/ AssemblyContext ac_0 = (AssemblyContext) ITERATOR_ac_0
													.next();
											/**
											 * ac.requiredRoles->includes(dc.role)
											 */
											final /*@NonInvalid*/ List<Role> requiredRoles = ac_0.getRequiredRoles();
											final /*@NonInvalid*/ OrderedSetValue BOXED_requiredRoles = idResolver
													.createOrderedSetOfAll(SystemDependantTables.ORD_CLSSid_Role,
															requiredRoles);
											final /*@NonInvalid*/ Role role_0 = dc.getRole();
											final /*@NonInvalid*/ boolean includes_2 = CollectionIncludesOperation.INSTANCE
													.evaluate(BOXED_requiredRoles, role_0).booleanValue();
											//
											if (includes_2) { // Normal successful body evaluation result
												exists_0 = ValueUtil.TRUE_VALUE;
												break; // Stop immediately
											} else if (!includes_2) { // Normal unsuccessful body evaluation result
												; // Carry on
											} else { // Impossible badly typed result
												accumulator_1 = new InvalidValueException(PivotMessages.NonBooleanBody,
														"exists");
											}
										}
										if (exists_0 == ValueUtil.FALSE_VALUE) {
											and_0 = ValueUtil.FALSE_VALUE;
										} else {
											if (exists_0 == null) {
												and_0 = null;
											} else {
												and_0 = ValueUtil.TRUE_VALUE;
											}
										}
									}
									CAUGHT_and_0 = and_0;
								} catch (Exception e) {
									CAUGHT_and_0 = ValueUtil.createInvalidValue(e);
								}
								if (CAUGHT_and_0 == ValueUtil.TRUE_VALUE) {
									or = ValueUtil.TRUE_VALUE;
								} else {
									if (CAUGHT_and instanceof InvalidValueException) {
										throw (InvalidValueException) CAUGHT_and;
									}
									if (CAUGHT_and_0 instanceof InvalidValueException) {
										throw (InvalidValueException) CAUGHT_and_0;
									}
									if ((CAUGHT_and == null) || (CAUGHT_and_0 == null)) {
										or = null;
									} else {
										or = ValueUtil.FALSE_VALUE;
									}
								}
							}
							CAUGHT_or = or;
						} catch (Exception e) {
							CAUGHT_or = ValueUtil.createInvalidValue(e);
						}
						//
						if (CAUGHT_or == ValueUtil.FALSE_VALUE) { // Normal unsuccessful body evaluation result
							result = ValueUtil.FALSE_VALUE;
							break; // Stop immediately
						} else if (CAUGHT_or == ValueUtil.TRUE_VALUE) { // Normal successful body evaluation result
							; // Carry on
						} else if (CAUGHT_or == null) { // Abnormal null body evaluation result
							if (accumulator == ValueUtil.TRUE_VALUE) {
								accumulator = null; // Cache a null failure
							}
						} else if (CAUGHT_or instanceof InvalidValueException) { // Abnormal exception evaluation result
							accumulator = CAUGHT_or; // Cache an exception failure
						} else { // Impossible badly typed result
							accumulator = new InvalidValueException(PivotMessages.NonBooleanBody, "forAll");
						}
					}
					CAUGHT_result = result;
				} catch (Exception e) {
					CAUGHT_result = ValueUtil.createInvalidValue(e);
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE
						.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object) null, diagnostics, context,
								(Object) null, severity_0, CAUGHT_result, SystemDependantTables.INT_0)
						.booleanValue();
				IF_le = logDiagnostic;
			}
			return IF_le;
		} catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean composedAssemblyContextsAreNotAllocated(final DiagnosticChain diagnostics,
			final Map<Object, Object> context) {
		final String constraintName = "CompositeComponent::composedAssemblyContextsAreNotAllocated";
		try {
			/**
			 *
			 * inv composedAssemblyContextsAreNotAllocated:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = self.assemblyContexts->forAll(a |
			 *           a.allocationContext.oclIsUndefined())
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					SystemDependantPackage.Literals.COMPOSITE_COMPONENT___COMPOSED_ASSEMBLY_CONTEXTS_ARE_NOT_ALLOCATED__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, SystemDependantTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			} else {
				final /*@NonInvalid*/ List<AssemblyContext> assemblyContexts = this.getAssemblyContexts();
				final /*@NonInvalid*/ OrderedSetValue BOXED_assemblyContexts = idResolver
						.createOrderedSetOfAll(SystemDependantTables.ORD_CLSSid_AssemblyContext, assemblyContexts);
				/*@Thrown*/ Object accumulator = ValueUtil.TRUE_VALUE;
				Iterator<Object> ITERATOR_a = BOXED_assemblyContexts.iterator();
				/*@NonInvalid*/ Boolean result;
				while (true) {
					if (!ITERATOR_a.hasNext()) {
						if (accumulator == ValueUtil.TRUE_VALUE) {
							result = ValueUtil.TRUE_VALUE;
						} else {
							throw (InvalidValueException) accumulator;
						}
						break;
					}
					/*@NonInvalid*/ AssemblyContext a = (AssemblyContext) ITERATOR_a.next();
					/**
					 * a.allocationContext.oclIsUndefined()
					 */
					final /*@NonInvalid*/ AllocationContext allocationContext = a.getAllocationContext();
					final /*@NonInvalid*/ boolean oclIsUndefined = allocationContext == null;
					//
					if (!oclIsUndefined) { // Normal unsuccessful body evaluation result
						result = ValueUtil.FALSE_VALUE;
						break; // Stop immediately
					} else if (oclIsUndefined) { // Normal successful body evaluation result
						; // Carry on
					} else { // Impossible badly typed result
						accumulator = new InvalidValueException(PivotMessages.NonBooleanBody, "forAll");
					}
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE
						.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object) null, diagnostics, context,
								(Object) null, severity_0, result, SystemDependantTables.INT_0)
						.booleanValue();
				IF_le = logDiagnostic;
			}
			return IF_le;
		} catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SystemDependantPackage.COMPOSITE_COMPONENT__ASSEMBLY_CONTEXTS:
			return ((InternalEList<?>) getAssemblyContexts()).basicRemove(otherEnd, msgs);
		case SystemDependantPackage.COMPOSITE_COMPONENT__ASSEMBLY_CONNECTORS:
			return ((InternalEList<?>) getAssemblyConnectors()).basicRemove(otherEnd, msgs);
		case SystemDependantPackage.COMPOSITE_COMPONENT__DELEGATION_CONNECTORS:
			return ((InternalEList<?>) getDelegationConnectors()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SystemDependantPackage.COMPOSITE_COMPONENT__ASSEMBLY_CONTEXTS:
			return getAssemblyContexts();
		case SystemDependantPackage.COMPOSITE_COMPONENT__ASSEMBLY_CONNECTORS:
			return getAssemblyConnectors();
		case SystemDependantPackage.COMPOSITE_COMPONENT__DELEGATION_CONNECTORS:
			return getDelegationConnectors();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case SystemDependantPackage.COMPOSITE_COMPONENT__ASSEMBLY_CONTEXTS:
			getAssemblyContexts().clear();
			getAssemblyContexts().addAll((Collection<? extends AssemblyContext>) newValue);
			return;
		case SystemDependantPackage.COMPOSITE_COMPONENT__ASSEMBLY_CONNECTORS:
			getAssemblyConnectors().clear();
			getAssemblyConnectors().addAll((Collection<? extends AssemblyConnector>) newValue);
			return;
		case SystemDependantPackage.COMPOSITE_COMPONENT__DELEGATION_CONNECTORS:
			getDelegationConnectors().clear();
			getDelegationConnectors().addAll((Collection<? extends DelegationConnector>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case SystemDependantPackage.COMPOSITE_COMPONENT__ASSEMBLY_CONTEXTS:
			getAssemblyContexts().clear();
			return;
		case SystemDependantPackage.COMPOSITE_COMPONENT__ASSEMBLY_CONNECTORS:
			getAssemblyConnectors().clear();
			return;
		case SystemDependantPackage.COMPOSITE_COMPONENT__DELEGATION_CONNECTORS:
			getDelegationConnectors().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case SystemDependantPackage.COMPOSITE_COMPONENT__ASSEMBLY_CONTEXTS:
			return assemblyContexts != null && !assemblyContexts.isEmpty();
		case SystemDependantPackage.COMPOSITE_COMPONENT__ASSEMBLY_CONNECTORS:
			return assemblyConnectors != null && !assemblyConnectors.isEmpty();
		case SystemDependantPackage.COMPOSITE_COMPONENT__DELEGATION_CONNECTORS:
			return delegationConnectors != null && !delegationConnectors.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case SystemDependantPackage.COMPOSITE_COMPONENT___DELEGATION_CONNECTORS_FOR_PROVIDED_INTERFACES_OF_COMPOSITE_COMPONENTS_EXIST__DIAGNOSTICCHAIN_MAP:
			return delegationConnectorsForProvidedInterfacesOfCompositeComponentsExist(
					(DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case SystemDependantPackage.COMPOSITE_COMPONENT___NO_CIRCULAR_DEPENDENCY_IN_ASSEMBLY_CONTEXT_HIERARCHY__DIAGNOSTICCHAIN_MAP:
			return noCircularDependencyInAssemblyContextHierarchy((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case SystemDependantPackage.COMPOSITE_COMPONENT___DELEGATION_CONNECTORS_ARE_WELL_FORMED__DIAGNOSTICCHAIN_MAP:
			return delegationConnectorsAreWellFormed((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case SystemDependantPackage.COMPOSITE_COMPONENT___COMPOSED_ASSEMBLY_CONTEXTS_ARE_NOT_ALLOCATED__DIAGNOSTICCHAIN_MAP:
			return composedAssemblyContextsAreNotAllocated((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //CompositeComponentImpl
