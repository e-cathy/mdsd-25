/**
 */
package MDSDComponentMetamodel.SystemDependant.impl;

import MDSDComponentMetamodel.SystemDependant.Allocation;
import MDSDComponentMetamodel.SystemDependant.Assembly;
import MDSDComponentMetamodel.SystemDependant.AssemblyContext;
import MDSDComponentMetamodel.SystemDependant.DelegationConnector;
import MDSDComponentMetamodel.SystemDependant.Environment;
import MDSDComponentMetamodel.SystemDependant.Role;
import MDSDComponentMetamodel.SystemDependant.SystemDependantPackage;
import MDSDComponentMetamodel.SystemDependant.SystemDependantTables;

import MDSDComponentMetamodel.SystemIndependant.Interface;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

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
 * An implementation of the model object '<em><b>System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MDSDComponentMetamodel.SystemDependant.impl.SystemImpl#getInterfaces <em>Interfaces</em>}</li>
 *   <li>{@link MDSDComponentMetamodel.SystemDependant.impl.SystemImpl#getAssembly <em>Assembly</em>}</li>
 *   <li>{@link MDSDComponentMetamodel.SystemDependant.impl.SystemImpl#getAllocation <em>Allocation</em>}</li>
 *   <li>{@link MDSDComponentMetamodel.SystemDependant.impl.SystemImpl#getEnvironment <em>Environment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SystemImpl extends MinimalEObjectImpl.Container implements MDSDComponentMetamodel.SystemDependant.System {
	/**
	 * The cached value of the '{@link #getInterfaces() <em>Interfaces</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfaces()
	 * @generated
	 * @ordered
	 */
	protected EList<Interface> interfaces;

	/**
	 * The cached value of the '{@link #getAssembly() <em>Assembly</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssembly()
	 * @generated
	 * @ordered
	 */
	protected Assembly assembly;

	/**
	 * The cached value of the '{@link #getAllocation() <em>Allocation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllocation()
	 * @generated
	 * @ordered
	 */
	protected Allocation allocation;

	/**
	 * The cached value of the '{@link #getEnvironment() <em>Environment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnvironment()
	 * @generated
	 * @ordered
	 */
	protected Environment environment;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SystemDependantPackage.Literals.SYSTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Interface> getInterfaces() {
		if (interfaces == null) {
			interfaces = new EObjectResolvingEList<Interface>(Interface.class, this,
					SystemDependantPackage.SYSTEM__INTERFACES);
		}
		return interfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Assembly getAssembly() {
		return assembly;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssembly(Assembly newAssembly, NotificationChain msgs) {
		Assembly oldAssembly = assembly;
		assembly = newAssembly;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					SystemDependantPackage.SYSTEM__ASSEMBLY, oldAssembly, newAssembly);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAssembly(Assembly newAssembly) {
		if (newAssembly != assembly) {
			NotificationChain msgs = null;
			if (assembly != null)
				msgs = ((InternalEObject) assembly).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - SystemDependantPackage.SYSTEM__ASSEMBLY, null, msgs);
			if (newAssembly != null)
				msgs = ((InternalEObject) newAssembly).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - SystemDependantPackage.SYSTEM__ASSEMBLY, null, msgs);
			msgs = basicSetAssembly(newAssembly, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SystemDependantPackage.SYSTEM__ASSEMBLY, newAssembly,
					newAssembly));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Allocation getAllocation() {
		return allocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAllocation(Allocation newAllocation, NotificationChain msgs) {
		Allocation oldAllocation = allocation;
		allocation = newAllocation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					SystemDependantPackage.SYSTEM__ALLOCATION, oldAllocation, newAllocation);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAllocation(Allocation newAllocation) {
		if (newAllocation != allocation) {
			NotificationChain msgs = null;
			if (allocation != null)
				msgs = ((InternalEObject) allocation).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - SystemDependantPackage.SYSTEM__ALLOCATION, null, msgs);
			if (newAllocation != null)
				msgs = ((InternalEObject) newAllocation).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - SystemDependantPackage.SYSTEM__ALLOCATION, null, msgs);
			msgs = basicSetAllocation(newAllocation, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SystemDependantPackage.SYSTEM__ALLOCATION,
					newAllocation, newAllocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Environment getEnvironment() {
		return environment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnvironment(Environment newEnvironment, NotificationChain msgs) {
		Environment oldEnvironment = environment;
		environment = newEnvironment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					SystemDependantPackage.SYSTEM__ENVIRONMENT, oldEnvironment, newEnvironment);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEnvironment(Environment newEnvironment) {
		if (newEnvironment != environment) {
			NotificationChain msgs = null;
			if (environment != null)
				msgs = ((InternalEObject) environment).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - SystemDependantPackage.SYSTEM__ENVIRONMENT, null, msgs);
			if (newEnvironment != null)
				msgs = ((InternalEObject) newEnvironment).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - SystemDependantPackage.SYSTEM__ENVIRONMENT, null, msgs);
			msgs = basicSetEnvironment(newEnvironment, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SystemDependantPackage.SYSTEM__ENVIRONMENT,
					newEnvironment, newEnvironment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean delegationConnectorsForProvidedInterfacesOfSystemExist(final DiagnosticChain diagnostics,
			final Map<Object, Object> context) {
		final String constraintName = "System::delegationConnectorsForProvidedInterfacesOfSystemExist";
		try {
			/**
			 *
			 * inv delegationConnectorsForProvidedInterfacesOfSystemExist:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = self.interfaces->forAll(i |
			 *           self.assembly.delegationConnectors->exists(dc | dc.delegatedInterface = i))
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					SystemDependantPackage.Literals.SYSTEM___DELEGATION_CONNECTORS_FOR_PROVIDED_INTERFACES_OF_SYSTEM_EXIST__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, SystemDependantTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			} else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					final /*@NonInvalid*/ List<Interface> interfaces = this.getInterfaces();
					final /*@NonInvalid*/ OrderedSetValue BOXED_interfaces = idResolver
							.createOrderedSetOfAll(SystemDependantTables.ORD_CLSSid_Interface_0, interfaces);
					/*@Thrown*/ Object accumulator = ValueUtil.TRUE_VALUE;
					Iterator<Object> ITERATOR_i = BOXED_interfaces.iterator();
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
						 * self.assembly.delegationConnectors->exists(dc | dc.delegatedInterface = i)
						 */
						final /*@NonInvalid*/ Assembly assembly = this.getAssembly();
						final /*@NonInvalid*/ List<DelegationConnector> delegationConnectors = assembly
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
	public boolean delegationConnectorsAreWellFormed(final DiagnosticChain diagnostics,
			final Map<Object, Object> context) {
		final String constraintName = "System::delegationConnectorsAreWellFormed";
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
			 *         result : Boolean[?] = self.assembly.delegationConnectors->forAll(dc |
			 *           self.interfaces->includes(dc.delegatedInterface) and
			 *           self.assembly.assemblyContexts->exists(ac |
			 *             ac.providedRoles->includes(dc.role)))
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					SystemDependantPackage.Literals.SYSTEM___DELEGATION_CONNECTORS_ARE_WELL_FORMED__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, SystemDependantTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			} else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					final /*@NonInvalid*/ Assembly assembly = this.getAssembly();
					final /*@NonInvalid*/ List<DelegationConnector> delegationConnectors = assembly
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
						 * self.interfaces->includes(dc.delegatedInterface) and
						 * self.assembly.assemblyContexts->exists(ac |
						 *   ac.providedRoles->includes(dc.role))
						 */
						/*@Caught*/ Object CAUGHT_and;
						try {
							final /*@NonInvalid*/ List<Interface> interfaces = this.getInterfaces();
							final /*@NonInvalid*/ OrderedSetValue BOXED_interfaces = idResolver
									.createOrderedSetOfAll(SystemDependantTables.ORD_CLSSid_Interface_0, interfaces);
							final /*@NonInvalid*/ Interface delegatedInterface = dc.getDelegatedInterface();
							final /*@NonInvalid*/ boolean includes = CollectionIncludesOperation.INSTANCE
									.evaluate(BOXED_interfaces, delegatedInterface).booleanValue();
							final /*@Thrown*/ Boolean and;
							if (!includes) {
								and = ValueUtil.FALSE_VALUE;
							} else {
								final /*@NonInvalid*/ List<AssemblyContext> assemblyContexts = assembly
										.getAssemblyContexts();
								final /*@NonInvalid*/ OrderedSetValue BOXED_assemblyContexts = idResolver
										.createOrderedSetOfAll(SystemDependantTables.ORD_CLSSid_AssemblyContext_0,
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
						//
						if (CAUGHT_and == ValueUtil.FALSE_VALUE) { // Normal unsuccessful body evaluation result
							result = ValueUtil.FALSE_VALUE;
							break; // Stop immediately
						} else if (CAUGHT_and == ValueUtil.TRUE_VALUE) { // Normal successful body evaluation result
							; // Carry on
						} else if (CAUGHT_and == null) { // Abnormal null body evaluation result
							if (accumulator == ValueUtil.TRUE_VALUE) {
								accumulator = null; // Cache a null failure
							}
						} else if (CAUGHT_and instanceof InvalidValueException) { // Abnormal exception evaluation result
							accumulator = CAUGHT_and; // Cache an exception failure
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SystemDependantPackage.SYSTEM__ASSEMBLY:
			return basicSetAssembly(null, msgs);
		case SystemDependantPackage.SYSTEM__ALLOCATION:
			return basicSetAllocation(null, msgs);
		case SystemDependantPackage.SYSTEM__ENVIRONMENT:
			return basicSetEnvironment(null, msgs);
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
		case SystemDependantPackage.SYSTEM__INTERFACES:
			return getInterfaces();
		case SystemDependantPackage.SYSTEM__ASSEMBLY:
			return getAssembly();
		case SystemDependantPackage.SYSTEM__ALLOCATION:
			return getAllocation();
		case SystemDependantPackage.SYSTEM__ENVIRONMENT:
			return getEnvironment();
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
		case SystemDependantPackage.SYSTEM__INTERFACES:
			getInterfaces().clear();
			getInterfaces().addAll((Collection<? extends Interface>) newValue);
			return;
		case SystemDependantPackage.SYSTEM__ASSEMBLY:
			setAssembly((Assembly) newValue);
			return;
		case SystemDependantPackage.SYSTEM__ALLOCATION:
			setAllocation((Allocation) newValue);
			return;
		case SystemDependantPackage.SYSTEM__ENVIRONMENT:
			setEnvironment((Environment) newValue);
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
		case SystemDependantPackage.SYSTEM__INTERFACES:
			getInterfaces().clear();
			return;
		case SystemDependantPackage.SYSTEM__ASSEMBLY:
			setAssembly((Assembly) null);
			return;
		case SystemDependantPackage.SYSTEM__ALLOCATION:
			setAllocation((Allocation) null);
			return;
		case SystemDependantPackage.SYSTEM__ENVIRONMENT:
			setEnvironment((Environment) null);
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
		case SystemDependantPackage.SYSTEM__INTERFACES:
			return interfaces != null && !interfaces.isEmpty();
		case SystemDependantPackage.SYSTEM__ASSEMBLY:
			return assembly != null;
		case SystemDependantPackage.SYSTEM__ALLOCATION:
			return allocation != null;
		case SystemDependantPackage.SYSTEM__ENVIRONMENT:
			return environment != null;
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
		case SystemDependantPackage.SYSTEM___DELEGATION_CONNECTORS_FOR_PROVIDED_INTERFACES_OF_SYSTEM_EXIST__DIAGNOSTICCHAIN_MAP:
			return delegationConnectorsForProvidedInterfacesOfSystemExist((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case SystemDependantPackage.SYSTEM___DELEGATION_CONNECTORS_ARE_WELL_FORMED__DIAGNOSTICCHAIN_MAP:
			return delegationConnectorsAreWellFormed((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //SystemImpl
