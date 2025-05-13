/**
 */
package MDSDComponentMetamodel.SystemDependant.impl;

import MDSDComponentMetamodel.SystemDependant.AllocationContext;
import MDSDComponentMetamodel.SystemDependant.AssemblyContext;
import MDSDComponentMetamodel.SystemDependant.Role;
import MDSDComponentMetamodel.SystemDependant.SystemDependantPackage;
import MDSDComponentMetamodel.SystemDependant.SystemDependantTables;

import MDSDComponentMetamodel.SystemIndependant.Component;
import MDSDComponentMetamodel.SystemIndependant.Interface;

import MDSDComponentMetamodel.impl.NamedElementImpl;

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

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
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
 * An implementation of the model object '<em><b>Assembly Context</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MDSDComponentMetamodel.SystemDependant.impl.AssemblyContextImpl#getComponent <em>Component</em>}</li>
 *   <li>{@link MDSDComponentMetamodel.SystemDependant.impl.AssemblyContextImpl#getProvidedRoles <em>Provided Roles</em>}</li>
 *   <li>{@link MDSDComponentMetamodel.SystemDependant.impl.AssemblyContextImpl#getRequiredRoles <em>Required Roles</em>}</li>
 *   <li>{@link MDSDComponentMetamodel.SystemDependant.impl.AssemblyContextImpl#getAllocationContext <em>Allocation Context</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssemblyContextImpl extends NamedElementImpl implements AssemblyContext {
	/**
	 * The cached value of the '{@link #getComponent() <em>Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponent()
	 * @generated
	 * @ordered
	 */
	protected Component component;

	/**
	 * The cached value of the '{@link #getProvidedRoles() <em>Provided Roles</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvidedRoles()
	 * @generated
	 * @ordered
	 */
	protected EList<Role> providedRoles;

	/**
	 * The cached value of the '{@link #getRequiredRoles() <em>Required Roles</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredRoles()
	 * @generated
	 * @ordered
	 */
	protected EList<Role> requiredRoles;

	/**
	 * The cached value of the '{@link #getAllocationContext() <em>Allocation Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllocationContext()
	 * @generated
	 * @ordered
	 */
	protected AllocationContext allocationContext;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssemblyContextImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SystemDependantPackage.Literals.ASSEMBLY_CONTEXT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Component getComponent() {
		if (component != null && component.eIsProxy()) {
			InternalEObject oldComponent = (InternalEObject) component;
			component = (Component) eResolveProxy(oldComponent);
			if (component != oldComponent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							SystemDependantPackage.ASSEMBLY_CONTEXT__COMPONENT, oldComponent, component));
			}
		}
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component basicGetComponent() {
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setComponent(Component newComponent) {
		Component oldComponent = component;
		component = newComponent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SystemDependantPackage.ASSEMBLY_CONTEXT__COMPONENT,
					oldComponent, component));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Role> getProvidedRoles() {
		if (providedRoles == null) {
			providedRoles = new EObjectContainmentWithInverseEList<Role>(Role.class, this,
					SystemDependantPackage.ASSEMBLY_CONTEXT__PROVIDED_ROLES,
					SystemDependantPackage.ROLE__PROVIDED_ASSEMBLY_CONTEXT);
		}
		return providedRoles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Role> getRequiredRoles() {
		if (requiredRoles == null) {
			requiredRoles = new EObjectContainmentWithInverseEList<Role>(Role.class, this,
					SystemDependantPackage.ASSEMBLY_CONTEXT__REQUIRED_ROLES,
					SystemDependantPackage.ROLE__REQUIRED_ASSEMBLY_CONTEXT);
		}
		return requiredRoles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AllocationContext getAllocationContext() {
		if (allocationContext != null && allocationContext.eIsProxy()) {
			InternalEObject oldAllocationContext = (InternalEObject) allocationContext;
			allocationContext = (AllocationContext) eResolveProxy(oldAllocationContext);
			if (allocationContext != oldAllocationContext) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							SystemDependantPackage.ASSEMBLY_CONTEXT__ALLOCATION_CONTEXT, oldAllocationContext,
							allocationContext));
			}
		}
		return allocationContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllocationContext basicGetAllocationContext() {
		return allocationContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAllocationContext(AllocationContext newAllocationContext, NotificationChain msgs) {
		AllocationContext oldAllocationContext = allocationContext;
		allocationContext = newAllocationContext;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					SystemDependantPackage.ASSEMBLY_CONTEXT__ALLOCATION_CONTEXT, oldAllocationContext,
					newAllocationContext);
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
	public void setAllocationContext(AllocationContext newAllocationContext) {
		if (newAllocationContext != allocationContext) {
			NotificationChain msgs = null;
			if (allocationContext != null)
				msgs = ((InternalEObject) allocationContext).eInverseRemove(this,
						SystemDependantPackage.ALLOCATION_CONTEXT__ASSEMBLY_CONTEXT, AllocationContext.class, msgs);
			if (newAllocationContext != null)
				msgs = ((InternalEObject) newAllocationContext).eInverseAdd(this,
						SystemDependantPackage.ALLOCATION_CONTEXT__ASSEMBLY_CONTEXT, AllocationContext.class, msgs);
			msgs = basicSetAllocationContext(newAllocationContext, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SystemDependantPackage.ASSEMBLY_CONTEXT__ALLOCATION_CONTEXT, newAllocationContext,
					newAllocationContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean providedInterfacesMatch(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "AssemblyContext::providedInterfacesMatch";
		try {
			/**
			 *
			 * inv providedInterfacesMatch:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = self.providedRoles->forAll(r |
			 *           self.component.providedInterfaces->includes(r.interface))
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					SystemDependantPackage.Literals.ASSEMBLY_CONTEXT___PROVIDED_INTERFACES_MATCH__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, SystemDependantTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			} else {
				final /*@NonInvalid*/ List<Role> providedRoles = this.getProvidedRoles();
				final /*@NonInvalid*/ OrderedSetValue BOXED_providedRoles = idResolver
						.createOrderedSetOfAll(SystemDependantTables.ORD_CLSSid_Role, providedRoles);
				/*@Thrown*/ Object accumulator = ValueUtil.TRUE_VALUE;
				Iterator<Object> ITERATOR_r = BOXED_providedRoles.iterator();
				/*@NonInvalid*/ Boolean result;
				while (true) {
					if (!ITERATOR_r.hasNext()) {
						if (accumulator == ValueUtil.TRUE_VALUE) {
							result = ValueUtil.TRUE_VALUE;
						} else {
							throw (InvalidValueException) accumulator;
						}
						break;
					}
					/*@NonInvalid*/ Role r = (Role) ITERATOR_r.next();
					/**
					 * self.component.providedInterfaces->includes(r.interface)
					 */
					final /*@NonInvalid*/ Component component = this.getComponent();
					final /*@NonInvalid*/ List<Interface> providedInterfaces = component.getProvidedInterfaces();
					final /*@NonInvalid*/ OrderedSetValue BOXED_providedInterfaces = idResolver
							.createOrderedSetOfAll(SystemDependantTables.ORD_CLSSid_Interface, providedInterfaces);
					final /*@NonInvalid*/ Interface interface1 = r.getInterface();
					final /*@NonInvalid*/ boolean includes = CollectionIncludesOperation.INSTANCE
							.evaluate(BOXED_providedInterfaces, interface1).booleanValue();
					//
					if (!includes) { // Normal unsuccessful body evaluation result
						result = ValueUtil.FALSE_VALUE;
						break; // Stop immediately
					} else if (includes) { // Normal successful body evaluation result
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
	public boolean requiredInterfacesMatch(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "AssemblyContext::requiredInterfacesMatch";
		try {
			/**
			 *
			 * inv requiredInterfacesMatch:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = self.requiredRoles->forAll(r |
			 *           self.component.requiredInterfaces->includes(r.interface))
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					SystemDependantPackage.Literals.ASSEMBLY_CONTEXT___REQUIRED_INTERFACES_MATCH__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, SystemDependantTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			} else {
				final /*@NonInvalid*/ List<Role> requiredRoles = this.getRequiredRoles();
				final /*@NonInvalid*/ OrderedSetValue BOXED_requiredRoles = idResolver
						.createOrderedSetOfAll(SystemDependantTables.ORD_CLSSid_Role, requiredRoles);
				/*@Thrown*/ Object accumulator = ValueUtil.TRUE_VALUE;
				Iterator<Object> ITERATOR_r = BOXED_requiredRoles.iterator();
				/*@NonInvalid*/ Boolean result;
				while (true) {
					if (!ITERATOR_r.hasNext()) {
						if (accumulator == ValueUtil.TRUE_VALUE) {
							result = ValueUtil.TRUE_VALUE;
						} else {
							throw (InvalidValueException) accumulator;
						}
						break;
					}
					/*@NonInvalid*/ Role r = (Role) ITERATOR_r.next();
					/**
					 * self.component.requiredInterfaces->includes(r.interface)
					 */
					final /*@NonInvalid*/ Component component = this.getComponent();
					final /*@NonInvalid*/ List<Interface> requiredInterfaces = component.getRequiredInterfaces();
					final /*@NonInvalid*/ OrderedSetValue BOXED_requiredInterfaces = idResolver
							.createOrderedSetOfAll(SystemDependantTables.ORD_CLSSid_Interface, requiredInterfaces);
					final /*@NonInvalid*/ Interface interface1 = r.getInterface();
					final /*@NonInvalid*/ boolean includes = CollectionIncludesOperation.INSTANCE
							.evaluate(BOXED_requiredInterfaces, interface1).booleanValue();
					//
					if (!includes) { // Normal unsuccessful body evaluation result
						result = ValueUtil.FALSE_VALUE;
						break; // Stop immediately
					} else if (includes) { // Normal successful body evaluation result
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
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SystemDependantPackage.ASSEMBLY_CONTEXT__PROVIDED_ROLES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getProvidedRoles()).basicAdd(otherEnd, msgs);
		case SystemDependantPackage.ASSEMBLY_CONTEXT__REQUIRED_ROLES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getRequiredRoles()).basicAdd(otherEnd, msgs);
		case SystemDependantPackage.ASSEMBLY_CONTEXT__ALLOCATION_CONTEXT:
			if (allocationContext != null)
				msgs = ((InternalEObject) allocationContext).eInverseRemove(this,
						SystemDependantPackage.ALLOCATION_CONTEXT__ASSEMBLY_CONTEXT, AllocationContext.class, msgs);
			return basicSetAllocationContext((AllocationContext) otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SystemDependantPackage.ASSEMBLY_CONTEXT__PROVIDED_ROLES:
			return ((InternalEList<?>) getProvidedRoles()).basicRemove(otherEnd, msgs);
		case SystemDependantPackage.ASSEMBLY_CONTEXT__REQUIRED_ROLES:
			return ((InternalEList<?>) getRequiredRoles()).basicRemove(otherEnd, msgs);
		case SystemDependantPackage.ASSEMBLY_CONTEXT__ALLOCATION_CONTEXT:
			return basicSetAllocationContext(null, msgs);
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
		case SystemDependantPackage.ASSEMBLY_CONTEXT__COMPONENT:
			if (resolve)
				return getComponent();
			return basicGetComponent();
		case SystemDependantPackage.ASSEMBLY_CONTEXT__PROVIDED_ROLES:
			return getProvidedRoles();
		case SystemDependantPackage.ASSEMBLY_CONTEXT__REQUIRED_ROLES:
			return getRequiredRoles();
		case SystemDependantPackage.ASSEMBLY_CONTEXT__ALLOCATION_CONTEXT:
			if (resolve)
				return getAllocationContext();
			return basicGetAllocationContext();
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
		case SystemDependantPackage.ASSEMBLY_CONTEXT__COMPONENT:
			setComponent((Component) newValue);
			return;
		case SystemDependantPackage.ASSEMBLY_CONTEXT__PROVIDED_ROLES:
			getProvidedRoles().clear();
			getProvidedRoles().addAll((Collection<? extends Role>) newValue);
			return;
		case SystemDependantPackage.ASSEMBLY_CONTEXT__REQUIRED_ROLES:
			getRequiredRoles().clear();
			getRequiredRoles().addAll((Collection<? extends Role>) newValue);
			return;
		case SystemDependantPackage.ASSEMBLY_CONTEXT__ALLOCATION_CONTEXT:
			setAllocationContext((AllocationContext) newValue);
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
		case SystemDependantPackage.ASSEMBLY_CONTEXT__COMPONENT:
			setComponent((Component) null);
			return;
		case SystemDependantPackage.ASSEMBLY_CONTEXT__PROVIDED_ROLES:
			getProvidedRoles().clear();
			return;
		case SystemDependantPackage.ASSEMBLY_CONTEXT__REQUIRED_ROLES:
			getRequiredRoles().clear();
			return;
		case SystemDependantPackage.ASSEMBLY_CONTEXT__ALLOCATION_CONTEXT:
			setAllocationContext((AllocationContext) null);
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
		case SystemDependantPackage.ASSEMBLY_CONTEXT__COMPONENT:
			return component != null;
		case SystemDependantPackage.ASSEMBLY_CONTEXT__PROVIDED_ROLES:
			return providedRoles != null && !providedRoles.isEmpty();
		case SystemDependantPackage.ASSEMBLY_CONTEXT__REQUIRED_ROLES:
			return requiredRoles != null && !requiredRoles.isEmpty();
		case SystemDependantPackage.ASSEMBLY_CONTEXT__ALLOCATION_CONTEXT:
			return allocationContext != null;
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
		case SystemDependantPackage.ASSEMBLY_CONTEXT___PROVIDED_INTERFACES_MATCH__DIAGNOSTICCHAIN_MAP:
			return providedInterfacesMatch((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case SystemDependantPackage.ASSEMBLY_CONTEXT___REQUIRED_INTERFACES_MATCH__DIAGNOSTICCHAIN_MAP:
			return requiredInterfacesMatch((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //AssemblyContextImpl
