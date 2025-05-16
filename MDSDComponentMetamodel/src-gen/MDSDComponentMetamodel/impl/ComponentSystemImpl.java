/**
 */
package MDSDComponentMetamodel.impl;

import MDSDComponentMetamodel.ComponentSystem;
import MDSDComponentMetamodel.MDSDComponentMetamodelPackage;

import MDSDComponentMetamodel.SystemIndependant.Repository;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MDSDComponentMetamodel.impl.ComponentSystemImpl#getRepositories <em>Repositories</em>}</li>
 *   <li>{@link MDSDComponentMetamodel.impl.ComponentSystemImpl#getSystems <em>Systems</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentSystemImpl extends MinimalEObjectImpl.Container implements ComponentSystem {
	/**
	 * The cached value of the '{@link #getRepositories() <em>Repositories</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepositories()
	 * @generated
	 * @ordered
	 */
	protected EList<Repository> repositories;

	/**
	 * The cached value of the '{@link #getSystems() <em>Systems</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystems()
	 * @generated
	 * @ordered
	 */
	protected EList<MDSDComponentMetamodel.SystemDependant.System> systems;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentSystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MDSDComponentMetamodelPackage.Literals.COMPONENT_SYSTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Repository> getRepositories() {
		if (repositories == null) {
			repositories = new EObjectContainmentEList<Repository>(Repository.class, this,
					MDSDComponentMetamodelPackage.COMPONENT_SYSTEM__REPOSITORIES);
		}
		return repositories;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MDSDComponentMetamodel.SystemDependant.System> getSystems() {
		if (systems == null) {
			systems = new EObjectContainmentEList<MDSDComponentMetamodel.SystemDependant.System>(
					MDSDComponentMetamodel.SystemDependant.System.class, this,
					MDSDComponentMetamodelPackage.COMPONENT_SYSTEM__SYSTEMS);
		}
		return systems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MDSDComponentMetamodelPackage.COMPONENT_SYSTEM__REPOSITORIES:
			return ((InternalEList<?>) getRepositories()).basicRemove(otherEnd, msgs);
		case MDSDComponentMetamodelPackage.COMPONENT_SYSTEM__SYSTEMS:
			return ((InternalEList<?>) getSystems()).basicRemove(otherEnd, msgs);
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
		case MDSDComponentMetamodelPackage.COMPONENT_SYSTEM__REPOSITORIES:
			return getRepositories();
		case MDSDComponentMetamodelPackage.COMPONENT_SYSTEM__SYSTEMS:
			return getSystems();
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
		case MDSDComponentMetamodelPackage.COMPONENT_SYSTEM__REPOSITORIES:
			getRepositories().clear();
			getRepositories().addAll((Collection<? extends Repository>) newValue);
			return;
		case MDSDComponentMetamodelPackage.COMPONENT_SYSTEM__SYSTEMS:
			getSystems().clear();
			getSystems().addAll((Collection<? extends MDSDComponentMetamodel.SystemDependant.System>) newValue);
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
		case MDSDComponentMetamodelPackage.COMPONENT_SYSTEM__REPOSITORIES:
			getRepositories().clear();
			return;
		case MDSDComponentMetamodelPackage.COMPONENT_SYSTEM__SYSTEMS:
			getSystems().clear();
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
		case MDSDComponentMetamodelPackage.COMPONENT_SYSTEM__REPOSITORIES:
			return repositories != null && !repositories.isEmpty();
		case MDSDComponentMetamodelPackage.COMPONENT_SYSTEM__SYSTEMS:
			return systems != null && !systems.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ComponentSystemImpl
