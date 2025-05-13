/**
 */
package MDSDComponentMetamodel.SystemDependant.impl;

import MDSDComponentMetamodel.SystemDependant.AllocationContext;
import MDSDComponentMetamodel.SystemDependant.AssemblyContext;
import MDSDComponentMetamodel.SystemDependant.SystemDependantPackage;

import MDSDComponentMetamodel.impl.NamedElementImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Allocation Context</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MDSDComponentMetamodel.SystemDependant.impl.AllocationContextImpl#getContainer <em>Container</em>}</li>
 *   <li>{@link MDSDComponentMetamodel.SystemDependant.impl.AllocationContextImpl#getAssemblyContext <em>Assembly Context</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AllocationContextImpl extends NamedElementImpl implements AllocationContext {
	/**
	 * The cached value of the '{@link #getContainer() <em>Container</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainer()
	 * @generated
	 * @ordered
	 */
	protected MDSDComponentMetamodel.SystemDependant.Container container;

	/**
	 * The cached value of the '{@link #getAssemblyContext() <em>Assembly Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssemblyContext()
	 * @generated
	 * @ordered
	 */
	protected AssemblyContext assemblyContext;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AllocationContextImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SystemDependantPackage.Literals.ALLOCATION_CONTEXT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MDSDComponentMetamodel.SystemDependant.Container getContainer() {
		if (container != null && container.eIsProxy()) {
			InternalEObject oldContainer = (InternalEObject) container;
			container = (MDSDComponentMetamodel.SystemDependant.Container) eResolveProxy(oldContainer);
			if (container != oldContainer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							SystemDependantPackage.ALLOCATION_CONTEXT__CONTAINER, oldContainer, container));
			}
		}
		return container;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MDSDComponentMetamodel.SystemDependant.Container basicGetContainer() {
		return container;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContainer(MDSDComponentMetamodel.SystemDependant.Container newContainer) {
		MDSDComponentMetamodel.SystemDependant.Container oldContainer = container;
		container = newContainer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SystemDependantPackage.ALLOCATION_CONTEXT__CONTAINER,
					oldContainer, container));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AssemblyContext getAssemblyContext() {
		if (assemblyContext != null && assemblyContext.eIsProxy()) {
			InternalEObject oldAssemblyContext = (InternalEObject) assemblyContext;
			assemblyContext = (AssemblyContext) eResolveProxy(oldAssemblyContext);
			if (assemblyContext != oldAssemblyContext) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							SystemDependantPackage.ALLOCATION_CONTEXT__ASSEMBLY_CONTEXT, oldAssemblyContext,
							assemblyContext));
			}
		}
		return assemblyContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssemblyContext basicGetAssemblyContext() {
		return assemblyContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssemblyContext(AssemblyContext newAssemblyContext, NotificationChain msgs) {
		AssemblyContext oldAssemblyContext = assemblyContext;
		assemblyContext = newAssemblyContext;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					SystemDependantPackage.ALLOCATION_CONTEXT__ASSEMBLY_CONTEXT, oldAssemblyContext,
					newAssemblyContext);
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
	public void setAssemblyContext(AssemblyContext newAssemblyContext) {
		if (newAssemblyContext != assemblyContext) {
			NotificationChain msgs = null;
			if (assemblyContext != null)
				msgs = ((InternalEObject) assemblyContext).eInverseRemove(this,
						SystemDependantPackage.ASSEMBLY_CONTEXT__ALLOCATION_CONTEXT, AssemblyContext.class, msgs);
			if (newAssemblyContext != null)
				msgs = ((InternalEObject) newAssemblyContext).eInverseAdd(this,
						SystemDependantPackage.ASSEMBLY_CONTEXT__ALLOCATION_CONTEXT, AssemblyContext.class, msgs);
			msgs = basicSetAssemblyContext(newAssemblyContext, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SystemDependantPackage.ALLOCATION_CONTEXT__ASSEMBLY_CONTEXT, newAssemblyContext,
					newAssemblyContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SystemDependantPackage.ALLOCATION_CONTEXT__ASSEMBLY_CONTEXT:
			if (assemblyContext != null)
				msgs = ((InternalEObject) assemblyContext).eInverseRemove(this,
						SystemDependantPackage.ASSEMBLY_CONTEXT__ALLOCATION_CONTEXT, AssemblyContext.class, msgs);
			return basicSetAssemblyContext((AssemblyContext) otherEnd, msgs);
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
		case SystemDependantPackage.ALLOCATION_CONTEXT__ASSEMBLY_CONTEXT:
			return basicSetAssemblyContext(null, msgs);
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
		case SystemDependantPackage.ALLOCATION_CONTEXT__CONTAINER:
			if (resolve)
				return getContainer();
			return basicGetContainer();
		case SystemDependantPackage.ALLOCATION_CONTEXT__ASSEMBLY_CONTEXT:
			if (resolve)
				return getAssemblyContext();
			return basicGetAssemblyContext();
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
		case SystemDependantPackage.ALLOCATION_CONTEXT__CONTAINER:
			setContainer((MDSDComponentMetamodel.SystemDependant.Container) newValue);
			return;
		case SystemDependantPackage.ALLOCATION_CONTEXT__ASSEMBLY_CONTEXT:
			setAssemblyContext((AssemblyContext) newValue);
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
		case SystemDependantPackage.ALLOCATION_CONTEXT__CONTAINER:
			setContainer((MDSDComponentMetamodel.SystemDependant.Container) null);
			return;
		case SystemDependantPackage.ALLOCATION_CONTEXT__ASSEMBLY_CONTEXT:
			setAssemblyContext((AssemblyContext) null);
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
		case SystemDependantPackage.ALLOCATION_CONTEXT__CONTAINER:
			return container != null;
		case SystemDependantPackage.ALLOCATION_CONTEXT__ASSEMBLY_CONTEXT:
			return assemblyContext != null;
		}
		return super.eIsSet(featureID);
	}

} //AllocationContextImpl
