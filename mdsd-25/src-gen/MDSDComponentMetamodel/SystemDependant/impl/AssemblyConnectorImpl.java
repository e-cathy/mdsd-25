/**
 */
package MDSDComponentMetamodel.SystemDependant.impl;

import MDSDComponentMetamodel.SystemDependant.AllocationContext;
import MDSDComponentMetamodel.SystemDependant.AssemblyConnector;
import MDSDComponentMetamodel.SystemDependant.AssemblyContext;
import MDSDComponentMetamodel.SystemDependant.Link;
import MDSDComponentMetamodel.SystemDependant.Role;
import MDSDComponentMetamodel.SystemDependant.SystemDependantPackage;
import MDSDComponentMetamodel.SystemDependant.SystemDependantTables;

import MDSDComponentMetamodel.impl.NamedElementImpl;

import java.lang.reflect.InvocationTargetException;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

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
 * An implementation of the model object '<em><b>Assembly Connector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MDSDComponentMetamodel.SystemDependant.impl.AssemblyConnectorImpl#getProvidedRole <em>Provided Role</em>}</li>
 *   <li>{@link MDSDComponentMetamodel.SystemDependant.impl.AssemblyConnectorImpl#getRequiredRole <em>Required Role</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssemblyConnectorImpl extends NamedElementImpl implements AssemblyConnector {
	/**
	 * The cached value of the '{@link #getProvidedRole() <em>Provided Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvidedRole()
	 * @generated
	 * @ordered
	 */
	protected Role providedRole;

	/**
	 * The cached value of the '{@link #getRequiredRole() <em>Required Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredRole()
	 * @generated
	 * @ordered
	 */
	protected Role requiredRole;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssemblyConnectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SystemDependantPackage.Literals.ASSEMBLY_CONNECTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Role getProvidedRole() {
		if (providedRole != null && providedRole.eIsProxy()) {
			InternalEObject oldProvidedRole = (InternalEObject) providedRole;
			providedRole = (Role) eResolveProxy(oldProvidedRole);
			if (providedRole != oldProvidedRole) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							SystemDependantPackage.ASSEMBLY_CONNECTOR__PROVIDED_ROLE, oldProvidedRole, providedRole));
			}
		}
		return providedRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role basicGetProvidedRole() {
		return providedRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProvidedRole(Role newProvidedRole) {
		Role oldProvidedRole = providedRole;
		providedRole = newProvidedRole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SystemDependantPackage.ASSEMBLY_CONNECTOR__PROVIDED_ROLE, oldProvidedRole, providedRole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Role getRequiredRole() {
		if (requiredRole != null && requiredRole.eIsProxy()) {
			InternalEObject oldRequiredRole = (InternalEObject) requiredRole;
			requiredRole = (Role) eResolveProxy(oldRequiredRole);
			if (requiredRole != oldRequiredRole) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							SystemDependantPackage.ASSEMBLY_CONNECTOR__REQUIRED_ROLE, oldRequiredRole, requiredRole));
			}
		}
		return requiredRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role basicGetRequiredRole() {
		return requiredRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRequiredRole(Role newRequiredRole) {
		Role oldRequiredRole = requiredRole;
		requiredRole = newRequiredRole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SystemDependantPackage.ASSEMBLY_CONNECTOR__REQUIRED_ROLE, oldRequiredRole, requiredRole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean providedOrRequiredMatches(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "AssemblyConnector::providedOrRequiredMatches";
		try {
			/**
			 *
			 * inv providedOrRequiredMatches:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = not self.providedRole.providedAssemblyContext.oclIsUndefined() and
			 *         not self.requiredRole.requiredAssemblyContext.oclIsUndefined()
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					SystemDependantPackage.Literals.ASSEMBLY_CONNECTOR___PROVIDED_OR_REQUIRED_MATCHES__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, SystemDependantTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			} else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					final /*@NonInvalid*/ Role providedRole = this.getProvidedRole();
					final /*@NonInvalid*/ AssemblyContext providedAssemblyContext = providedRole
							.getProvidedAssemblyContext();
					final /*@NonInvalid*/ boolean oclIsUndefined = providedAssemblyContext == null;
					final /*@NonInvalid*/ Boolean not;
					if (!oclIsUndefined) {
						not = ValueUtil.TRUE_VALUE;
					} else {
						if (oclIsUndefined) {
							not = ValueUtil.FALSE_VALUE;
						} else {
							not = null;
						}
					}
					final /*@Thrown*/ Boolean result;
					if (not == ValueUtil.FALSE_VALUE) {
						result = ValueUtil.FALSE_VALUE;
					} else {
						final /*@NonInvalid*/ Role requiredRole = this.getRequiredRole();
						final /*@NonInvalid*/ AssemblyContext requiredAssemblyContext = requiredRole
								.getRequiredAssemblyContext();
						final /*@NonInvalid*/ boolean oclIsUndefined_0 = requiredAssemblyContext == null;
						final /*@NonInvalid*/ Boolean not_0;
						if (!oclIsUndefined_0) {
							not_0 = ValueUtil.TRUE_VALUE;
						} else {
							if (oclIsUndefined_0) {
								not_0 = ValueUtil.FALSE_VALUE;
							} else {
								not_0 = null;
							}
						}
						if (not_0 == ValueUtil.FALSE_VALUE) {
							result = ValueUtil.FALSE_VALUE;
						} else {
							if ((not == null) || (not_0 == null)) {
								result = null;
							} else {
								result = ValueUtil.TRUE_VALUE;
							}
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
	public boolean connectedRolesAreInSameContainerOrLinkedContainers(final DiagnosticChain diagnostics,
			final Map<Object, Object> context) {
		final String constraintName = "AssemblyConnector::connectedRolesAreInSameContainerOrLinkedContainers";
		try {
			/**
			 *
			 * inv connectedRolesAreInSameContainerOrLinkedContainers:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = not self.providedRole.providedAssemblyContext.allocationContext.oclIsUndefined() and
			 *         not self.requiredRole.requiredAssemblyContext.allocationContext.oclIsUndefined() implies
			 *         let providedContainer : Container[1] = self.providedRole.providedAssemblyContext.allocationContext.container
			 *         in
			 *           let requiredContainer : Container[1] = self.requiredRole.requiredAssemblyContext.allocationContext.container
			 *           in providedContainer = requiredContainer or
			 *             providedContainer.links->exists(l |
			 *               l.containers->includes(requiredContainer))
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					SystemDependantPackage.Literals.ASSEMBLY_CONNECTOR___CONNECTED_ROLES_ARE_IN_SAME_CONTAINER_OR_LINKED_CONTAINERS__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, SystemDependantTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			} else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					/*@Caught*/ Object CAUGHT_and;
					try {
						/*@Caught*/ Object CAUGHT_allocationContext;
						try {
							final /*@NonInvalid*/ Role providedRole = this.getProvidedRole();
							final /*@NonInvalid*/ AssemblyContext providedAssemblyContext = providedRole
									.getProvidedAssemblyContext();
							if (providedAssemblyContext == null) {
								throw new InvalidValueException(
										"Null source for \'\'SystemDependant\'::AssemblyContext::allocationContext\'");
							}
							final /*@Thrown*/ AllocationContext allocationContext = providedAssemblyContext
									.getAllocationContext();
							CAUGHT_allocationContext = allocationContext;
						} catch (Exception e) {
							CAUGHT_allocationContext = ValueUtil.createInvalidValue(e);
						}
						final /*@NonInvalid*/ boolean oclIsUndefined = (CAUGHT_allocationContext == null)
								|| (CAUGHT_allocationContext instanceof InvalidValueException);
						final /*@NonInvalid*/ Boolean not;
						if (!oclIsUndefined) {
							not = ValueUtil.TRUE_VALUE;
						} else {
							if (oclIsUndefined) {
								not = ValueUtil.FALSE_VALUE;
							} else {
								not = null;
							}
						}
						final /*@Thrown*/ Boolean and;
						if (not == ValueUtil.FALSE_VALUE) {
							and = ValueUtil.FALSE_VALUE;
						} else {
							/*@Caught*/ Object CAUGHT_allocationContext_0;
							try {
								final /*@NonInvalid*/ Role requiredRole = this.getRequiredRole();
								final /*@NonInvalid*/ AssemblyContext requiredAssemblyContext = requiredRole
										.getRequiredAssemblyContext();
								if (requiredAssemblyContext == null) {
									throw new InvalidValueException(
											"Null source for \'\'SystemDependant\'::AssemblyContext::allocationContext\'");
								}
								final /*@Thrown*/ AllocationContext allocationContext_0 = requiredAssemblyContext
										.getAllocationContext();
								CAUGHT_allocationContext_0 = allocationContext_0;
							} catch (Exception e) {
								CAUGHT_allocationContext_0 = ValueUtil.createInvalidValue(e);
							}
							final /*@NonInvalid*/ boolean oclIsUndefined_0 = (CAUGHT_allocationContext_0 == null)
									|| (CAUGHT_allocationContext_0 instanceof InvalidValueException);
							final /*@NonInvalid*/ Boolean not_0;
							if (!oclIsUndefined_0) {
								not_0 = ValueUtil.TRUE_VALUE;
							} else {
								if (oclIsUndefined_0) {
									not_0 = ValueUtil.FALSE_VALUE;
								} else {
									not_0 = null;
								}
							}
							if (not_0 == ValueUtil.FALSE_VALUE) {
								and = ValueUtil.FALSE_VALUE;
							} else {
								if ((not == null) || (not_0 == null)) {
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
					final /*@Thrown*/ Boolean result;
					if (CAUGHT_and == ValueUtil.FALSE_VALUE) {
						result = ValueUtil.TRUE_VALUE;
					} else {
						/*@Caught*/ Object CAUGHT_or;
						try {
							/*@Caught*/ Object CAUGHT_providedContainer;
							try {
								final /*@NonInvalid*/ Role providedRole_0 = this.getProvidedRole();
								final /*@NonInvalid*/ AssemblyContext providedAssemblyContext_0 = providedRole_0
										.getProvidedAssemblyContext();
								if (providedAssemblyContext_0 == null) {
									throw new InvalidValueException(
											"Null source for \'\'SystemDependant\'::AssemblyContext::allocationContext\'");
								}
								final /*@Thrown*/ AllocationContext allocationContext_1 = providedAssemblyContext_0
										.getAllocationContext();
								if (allocationContext_1 == null) {
									throw new InvalidValueException(
											"Null source for \'\'SystemDependant\'::AllocationContext::container\'");
								}
								final /*@Thrown*/ MDSDComponentMetamodel.SystemDependant.Container providedContainer = allocationContext_1
										.getContainer();
								CAUGHT_providedContainer = providedContainer;
							} catch (Exception e) {
								CAUGHT_providedContainer = ValueUtil.createInvalidValue(e);
							}
							/*@Caught*/ Object CAUGHT_requiredContainer;
							try {
								final /*@NonInvalid*/ Role requiredRole_0 = this.getRequiredRole();
								final /*@NonInvalid*/ AssemblyContext requiredAssemblyContext_0 = requiredRole_0
										.getRequiredAssemblyContext();
								if (requiredAssemblyContext_0 == null) {
									throw new InvalidValueException(
											"Null source for \'\'SystemDependant\'::AssemblyContext::allocationContext\'");
								}
								final /*@Thrown*/ AllocationContext allocationContext_2 = requiredAssemblyContext_0
										.getAllocationContext();
								if (allocationContext_2 == null) {
									throw new InvalidValueException(
											"Null source for \'\'SystemDependant\'::AllocationContext::container\'");
								}
								final /*@Thrown*/ MDSDComponentMetamodel.SystemDependant.Container requiredContainer = allocationContext_2
										.getContainer();
								CAUGHT_requiredContainer = requiredContainer;
							} catch (Exception e) {
								CAUGHT_requiredContainer = ValueUtil.createInvalidValue(e);
							}
							/*@Caught*/ Object CAUGHT_eq;
							try {
								if (CAUGHT_providedContainer instanceof InvalidValueException) {
									throw (InvalidValueException) CAUGHT_providedContainer;
								}
								if (CAUGHT_requiredContainer instanceof InvalidValueException) {
									throw (InvalidValueException) CAUGHT_requiredContainer;
								}
								final /*@Thrown*/ boolean eq = CAUGHT_providedContainer
										.equals(CAUGHT_requiredContainer);
								CAUGHT_eq = eq;
							} catch (Exception e) {
								CAUGHT_eq = ValueUtil.createInvalidValue(e);
							}
							final /*@Thrown*/ Boolean or;
							if (CAUGHT_eq == ValueUtil.TRUE_VALUE) {
								or = ValueUtil.TRUE_VALUE;
							} else {
								/*@Caught*/ Object CAUGHT_exists;
								try {
									if (CAUGHT_providedContainer instanceof InvalidValueException) {
										throw (InvalidValueException) CAUGHT_providedContainer;
									}
									final /*@Thrown*/ List<Link> links = ((MDSDComponentMetamodel.SystemDependant.Container) CAUGHT_providedContainer)
											.getLinks();
									final /*@Thrown*/ OrderedSetValue BOXED_links = idResolver
											.createOrderedSetOfAll(SystemDependantTables.ORD_CLSSid_Link, links);
									/*@Thrown*/ Object accumulator = ValueUtil.FALSE_VALUE;
									Iterator<Object> ITERATOR_l = BOXED_links.iterator();
									/*@Thrown*/ Boolean exists;
									while (true) {
										if (!ITERATOR_l.hasNext()) {
											if (accumulator == ValueUtil.FALSE_VALUE) {
												exists = ValueUtil.FALSE_VALUE;
											} else {
												throw (InvalidValueException) accumulator;
											}
											break;
										}
										/*@NonInvalid*/ Link l = (Link) ITERATOR_l.next();
										/**
										 * l.containers->includes(requiredContainer)
										 */
										/*@Caught*/ Object CAUGHT_includes;
										try {
											final /*@NonInvalid*/ List<MDSDComponentMetamodel.SystemDependant.Container> containers = l
													.getContainers();
											final /*@NonInvalid*/ OrderedSetValue BOXED_containers = idResolver
													.createOrderedSetOfAll(SystemDependantTables.ORD_CLSSid_Container,
															containers);
											if (CAUGHT_requiredContainer instanceof InvalidValueException) {
												throw (InvalidValueException) CAUGHT_requiredContainer;
											}
											final /*@Thrown*/ boolean includes = CollectionIncludesOperation.INSTANCE
													.evaluate(BOXED_containers, CAUGHT_requiredContainer)
													.booleanValue();
											CAUGHT_includes = includes;
										} catch (Exception e) {
											CAUGHT_includes = ValueUtil.createInvalidValue(e);
										}
										//
										if (CAUGHT_includes == ValueUtil.TRUE_VALUE) { // Normal successful body evaluation result
											exists = ValueUtil.TRUE_VALUE;
											break; // Stop immediately
										} else if (CAUGHT_includes == ValueUtil.FALSE_VALUE) { // Normal unsuccessful body evaluation result
											; // Carry on
										} else if (CAUGHT_includes instanceof InvalidValueException) { // Abnormal exception evaluation result
											accumulator = CAUGHT_includes; // Cache an exception failure
										} else { // Impossible badly typed result
											accumulator = new InvalidValueException(PivotMessages.NonBooleanBody,
													"exists");
										}
									}
									CAUGHT_exists = exists;
								} catch (Exception e) {
									CAUGHT_exists = ValueUtil.createInvalidValue(e);
								}
								if (CAUGHT_exists == ValueUtil.TRUE_VALUE) {
									or = ValueUtil.TRUE_VALUE;
								} else {
									if (CAUGHT_eq instanceof InvalidValueException) {
										throw (InvalidValueException) CAUGHT_eq;
									}
									if (CAUGHT_exists instanceof InvalidValueException) {
										throw (InvalidValueException) CAUGHT_exists;
									}
									if (CAUGHT_exists == null) {
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
						if (CAUGHT_or == ValueUtil.TRUE_VALUE) {
							result = ValueUtil.TRUE_VALUE;
						} else {
							if (CAUGHT_and instanceof InvalidValueException) {
								throw (InvalidValueException) CAUGHT_and;
							}
							if (CAUGHT_or instanceof InvalidValueException) {
								throw (InvalidValueException) CAUGHT_or;
							}
							if ((CAUGHT_and == null) || (CAUGHT_or == null)) {
								result = null;
							} else {
								result = ValueUtil.FALSE_VALUE;
							}
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SystemDependantPackage.ASSEMBLY_CONNECTOR__PROVIDED_ROLE:
			if (resolve)
				return getProvidedRole();
			return basicGetProvidedRole();
		case SystemDependantPackage.ASSEMBLY_CONNECTOR__REQUIRED_ROLE:
			if (resolve)
				return getRequiredRole();
			return basicGetRequiredRole();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case SystemDependantPackage.ASSEMBLY_CONNECTOR__PROVIDED_ROLE:
			setProvidedRole((Role) newValue);
			return;
		case SystemDependantPackage.ASSEMBLY_CONNECTOR__REQUIRED_ROLE:
			setRequiredRole((Role) newValue);
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
		case SystemDependantPackage.ASSEMBLY_CONNECTOR__PROVIDED_ROLE:
			setProvidedRole((Role) null);
			return;
		case SystemDependantPackage.ASSEMBLY_CONNECTOR__REQUIRED_ROLE:
			setRequiredRole((Role) null);
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
		case SystemDependantPackage.ASSEMBLY_CONNECTOR__PROVIDED_ROLE:
			return providedRole != null;
		case SystemDependantPackage.ASSEMBLY_CONNECTOR__REQUIRED_ROLE:
			return requiredRole != null;
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
		case SystemDependantPackage.ASSEMBLY_CONNECTOR___PROVIDED_OR_REQUIRED_MATCHES__DIAGNOSTICCHAIN_MAP:
			return providedOrRequiredMatches((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case SystemDependantPackage.ASSEMBLY_CONNECTOR___CONNECTED_ROLES_ARE_IN_SAME_CONTAINER_OR_LINKED_CONTAINERS__DIAGNOSTICCHAIN_MAP:
			return connectedRolesAreInSameContainerOrLinkedContainers((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //AssemblyConnectorImpl
