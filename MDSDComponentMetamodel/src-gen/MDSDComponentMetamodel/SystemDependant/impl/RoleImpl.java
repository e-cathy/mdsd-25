/**
 */
package MDSDComponentMetamodel.SystemDependant.impl;

import MDSDComponentMetamodel.SystemDependant.AssemblyContext;
import MDSDComponentMetamodel.SystemDependant.Role;
import MDSDComponentMetamodel.SystemDependant.SystemDependantPackage;

import MDSDComponentMetamodel.SystemIndependant.Interface;

import MDSDComponentMetamodel.impl.NamedElementImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Role</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MDSDComponentMetamodel.SystemDependant.impl.RoleImpl#getInterface <em>Interface</em>}</li>
 *   <li>{@link MDSDComponentMetamodel.SystemDependant.impl.RoleImpl#getProvidedAssemblyContext <em>Provided Assembly Context</em>}</li>
 *   <li>{@link MDSDComponentMetamodel.SystemDependant.impl.RoleImpl#getRequiredAssemblyContext <em>Required Assembly Context</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RoleImpl extends NamedElementImpl implements Role {
	/**
	 * The cached value of the '{@link #getInterface() <em>Interface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterface()
	 * @generated
	 * @ordered
	 */
	protected Interface interface_;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SystemDependantPackage.Literals.ROLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Interface getInterface() {
		if (interface_ != null && interface_.eIsProxy()) {
			InternalEObject oldInterface = (InternalEObject) interface_;
			interface_ = (Interface) eResolveProxy(oldInterface);
			if (interface_ != oldInterface) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SystemDependantPackage.ROLE__INTERFACE,
							oldInterface, interface_));
			}
		}
		return interface_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interface basicGetInterface() {
		return interface_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInterface(Interface newInterface) {
		Interface oldInterface = interface_;
		interface_ = newInterface;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SystemDependantPackage.ROLE__INTERFACE, oldInterface,
					interface_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AssemblyContext getProvidedAssemblyContext() {
		if (eContainerFeatureID() != SystemDependantPackage.ROLE__PROVIDED_ASSEMBLY_CONTEXT)
			return null;
		return (AssemblyContext) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProvidedAssemblyContext(AssemblyContext newProvidedAssemblyContext,
			NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newProvidedAssemblyContext,
				SystemDependantPackage.ROLE__PROVIDED_ASSEMBLY_CONTEXT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProvidedAssemblyContext(AssemblyContext newProvidedAssemblyContext) {
		if (newProvidedAssemblyContext != eInternalContainer()
				|| (eContainerFeatureID() != SystemDependantPackage.ROLE__PROVIDED_ASSEMBLY_CONTEXT
						&& newProvidedAssemblyContext != null)) {
			if (EcoreUtil.isAncestor(this, newProvidedAssemblyContext))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newProvidedAssemblyContext != null)
				msgs = ((InternalEObject) newProvidedAssemblyContext).eInverseAdd(this,
						SystemDependantPackage.ASSEMBLY_CONTEXT__PROVIDED_ROLES, AssemblyContext.class, msgs);
			msgs = basicSetProvidedAssemblyContext(newProvidedAssemblyContext, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SystemDependantPackage.ROLE__PROVIDED_ASSEMBLY_CONTEXT, newProvidedAssemblyContext,
					newProvidedAssemblyContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AssemblyContext getRequiredAssemblyContext() {
		if (eContainerFeatureID() != SystemDependantPackage.ROLE__REQUIRED_ASSEMBLY_CONTEXT)
			return null;
		return (AssemblyContext) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequiredAssemblyContext(AssemblyContext newRequiredAssemblyContext,
			NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newRequiredAssemblyContext,
				SystemDependantPackage.ROLE__REQUIRED_ASSEMBLY_CONTEXT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRequiredAssemblyContext(AssemblyContext newRequiredAssemblyContext) {
		if (newRequiredAssemblyContext != eInternalContainer()
				|| (eContainerFeatureID() != SystemDependantPackage.ROLE__REQUIRED_ASSEMBLY_CONTEXT
						&& newRequiredAssemblyContext != null)) {
			if (EcoreUtil.isAncestor(this, newRequiredAssemblyContext))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newRequiredAssemblyContext != null)
				msgs = ((InternalEObject) newRequiredAssemblyContext).eInverseAdd(this,
						SystemDependantPackage.ASSEMBLY_CONTEXT__REQUIRED_ROLES, AssemblyContext.class, msgs);
			msgs = basicSetRequiredAssemblyContext(newRequiredAssemblyContext, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SystemDependantPackage.ROLE__REQUIRED_ASSEMBLY_CONTEXT, newRequiredAssemblyContext,
					newRequiredAssemblyContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SystemDependantPackage.ROLE__PROVIDED_ASSEMBLY_CONTEXT:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetProvidedAssemblyContext((AssemblyContext) otherEnd, msgs);
		case SystemDependantPackage.ROLE__REQUIRED_ASSEMBLY_CONTEXT:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetRequiredAssemblyContext((AssemblyContext) otherEnd, msgs);
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
		case SystemDependantPackage.ROLE__PROVIDED_ASSEMBLY_CONTEXT:
			return basicSetProvidedAssemblyContext(null, msgs);
		case SystemDependantPackage.ROLE__REQUIRED_ASSEMBLY_CONTEXT:
			return basicSetRequiredAssemblyContext(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
		case SystemDependantPackage.ROLE__PROVIDED_ASSEMBLY_CONTEXT:
			return eInternalContainer().eInverseRemove(this, SystemDependantPackage.ASSEMBLY_CONTEXT__PROVIDED_ROLES,
					AssemblyContext.class, msgs);
		case SystemDependantPackage.ROLE__REQUIRED_ASSEMBLY_CONTEXT:
			return eInternalContainer().eInverseRemove(this, SystemDependantPackage.ASSEMBLY_CONTEXT__REQUIRED_ROLES,
					AssemblyContext.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SystemDependantPackage.ROLE__INTERFACE:
			if (resolve)
				return getInterface();
			return basicGetInterface();
		case SystemDependantPackage.ROLE__PROVIDED_ASSEMBLY_CONTEXT:
			return getProvidedAssemblyContext();
		case SystemDependantPackage.ROLE__REQUIRED_ASSEMBLY_CONTEXT:
			return getRequiredAssemblyContext();
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
		case SystemDependantPackage.ROLE__INTERFACE:
			setInterface((Interface) newValue);
			return;
		case SystemDependantPackage.ROLE__PROVIDED_ASSEMBLY_CONTEXT:
			setProvidedAssemblyContext((AssemblyContext) newValue);
			return;
		case SystemDependantPackage.ROLE__REQUIRED_ASSEMBLY_CONTEXT:
			setRequiredAssemblyContext((AssemblyContext) newValue);
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
		case SystemDependantPackage.ROLE__INTERFACE:
			setInterface((Interface) null);
			return;
		case SystemDependantPackage.ROLE__PROVIDED_ASSEMBLY_CONTEXT:
			setProvidedAssemblyContext((AssemblyContext) null);
			return;
		case SystemDependantPackage.ROLE__REQUIRED_ASSEMBLY_CONTEXT:
			setRequiredAssemblyContext((AssemblyContext) null);
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
		case SystemDependantPackage.ROLE__INTERFACE:
			return interface_ != null;
		case SystemDependantPackage.ROLE__PROVIDED_ASSEMBLY_CONTEXT:
			return getProvidedAssemblyContext() != null;
		case SystemDependantPackage.ROLE__REQUIRED_ASSEMBLY_CONTEXT:
			return getRequiredAssemblyContext() != null;
		}
		return super.eIsSet(featureID);
	}

} //RoleImpl
