/**
 */
package MDSDComponentMetamodel.SystemIndependant.impl;

import MDSDComponentMetamodel.SystemIndependant.Action;
import MDSDComponentMetamodel.SystemIndependant.Component;
import MDSDComponentMetamodel.SystemIndependant.Interface;
import MDSDComponentMetamodel.SystemIndependant.Service;
import MDSDComponentMetamodel.SystemIndependant.SystemIndependantPackage;

import MDSDComponentMetamodel.impl.NamedElementImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MDSDComponentMetamodel.SystemIndependant.impl.ComponentImpl#getProvidedInterfaces <em>Provided Interfaces</em>}</li>
 *   <li>{@link MDSDComponentMetamodel.SystemIndependant.impl.ComponentImpl#getProvidedServices <em>Provided Services</em>}</li>
 *   <li>{@link MDSDComponentMetamodel.SystemIndependant.impl.ComponentImpl#getRequiredInterfaces <em>Required Interfaces</em>}</li>
 *   <li>{@link MDSDComponentMetamodel.SystemIndependant.impl.ComponentImpl#getBehaviorDescription <em>Behavior Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ComponentImpl extends NamedElementImpl implements Component {
	/**
	 * The cached value of the '{@link #getProvidedInterfaces() <em>Provided Interfaces</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvidedInterfaces()
	 * @generated
	 * @ordered
	 */
	protected EList<Interface> providedInterfaces;

	/**
	 * The cached value of the '{@link #getProvidedServices() <em>Provided Services</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvidedServices()
	 * @generated
	 * @ordered
	 */
	protected EList<Service> providedServices;

	/**
	 * The cached value of the '{@link #getRequiredInterfaces() <em>Required Interfaces</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredInterfaces()
	 * @generated
	 * @ordered
	 */
	protected EList<Interface> requiredInterfaces;

	/**
	 * The cached value of the '{@link #getBehaviorDescription() <em>Behavior Description</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBehaviorDescription()
	 * @generated
	 * @ordered
	 */
	protected EList<Action> behaviorDescription;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SystemIndependantPackage.Literals.COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Interface> getProvidedInterfaces() {
		if (providedInterfaces == null) {
			providedInterfaces = new EObjectResolvingEList<Interface>(Interface.class, this,
					SystemIndependantPackage.COMPONENT__PROVIDED_INTERFACES);
		}
		return providedInterfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Service> getProvidedServices() {
		if (providedServices == null) {
			providedServices = new EObjectContainmentEList<Service>(Service.class, this,
					SystemIndependantPackage.COMPONENT__PROVIDED_SERVICES);
		}
		return providedServices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Interface> getRequiredInterfaces() {
		if (requiredInterfaces == null) {
			requiredInterfaces = new EObjectResolvingEList<Interface>(Interface.class, this,
					SystemIndependantPackage.COMPONENT__REQUIRED_INTERFACES);
		}
		return requiredInterfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Action> getBehaviorDescription() {
		if (behaviorDescription == null) {
			behaviorDescription = new EObjectContainmentEList<Action>(Action.class, this,
					SystemIndependantPackage.COMPONENT__BEHAVIOR_DESCRIPTION);
		}
		return behaviorDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SystemIndependantPackage.COMPONENT__PROVIDED_SERVICES:
			return ((InternalEList<?>) getProvidedServices()).basicRemove(otherEnd, msgs);
		case SystemIndependantPackage.COMPONENT__BEHAVIOR_DESCRIPTION:
			return ((InternalEList<?>) getBehaviorDescription()).basicRemove(otherEnd, msgs);
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
		case SystemIndependantPackage.COMPONENT__PROVIDED_INTERFACES:
			return getProvidedInterfaces();
		case SystemIndependantPackage.COMPONENT__PROVIDED_SERVICES:
			return getProvidedServices();
		case SystemIndependantPackage.COMPONENT__REQUIRED_INTERFACES:
			return getRequiredInterfaces();
		case SystemIndependantPackage.COMPONENT__BEHAVIOR_DESCRIPTION:
			return getBehaviorDescription();
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
		case SystemIndependantPackage.COMPONENT__PROVIDED_INTERFACES:
			getProvidedInterfaces().clear();
			getProvidedInterfaces().addAll((Collection<? extends Interface>) newValue);
			return;
		case SystemIndependantPackage.COMPONENT__PROVIDED_SERVICES:
			getProvidedServices().clear();
			getProvidedServices().addAll((Collection<? extends Service>) newValue);
			return;
		case SystemIndependantPackage.COMPONENT__REQUIRED_INTERFACES:
			getRequiredInterfaces().clear();
			getRequiredInterfaces().addAll((Collection<? extends Interface>) newValue);
			return;
		case SystemIndependantPackage.COMPONENT__BEHAVIOR_DESCRIPTION:
			getBehaviorDescription().clear();
			getBehaviorDescription().addAll((Collection<? extends Action>) newValue);
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
		case SystemIndependantPackage.COMPONENT__PROVIDED_INTERFACES:
			getProvidedInterfaces().clear();
			return;
		case SystemIndependantPackage.COMPONENT__PROVIDED_SERVICES:
			getProvidedServices().clear();
			return;
		case SystemIndependantPackage.COMPONENT__REQUIRED_INTERFACES:
			getRequiredInterfaces().clear();
			return;
		case SystemIndependantPackage.COMPONENT__BEHAVIOR_DESCRIPTION:
			getBehaviorDescription().clear();
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
		case SystemIndependantPackage.COMPONENT__PROVIDED_INTERFACES:
			return providedInterfaces != null && !providedInterfaces.isEmpty();
		case SystemIndependantPackage.COMPONENT__PROVIDED_SERVICES:
			return providedServices != null && !providedServices.isEmpty();
		case SystemIndependantPackage.COMPONENT__REQUIRED_INTERFACES:
			return requiredInterfaces != null && !requiredInterfaces.isEmpty();
		case SystemIndependantPackage.COMPONENT__BEHAVIOR_DESCRIPTION:
			return behaviorDescription != null && !behaviorDescription.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ComponentImpl
