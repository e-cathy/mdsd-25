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
 *   <li>{@link MDSDComponentMetamodel.impl.ComponentSystemImpl#getRepository <em>Repository</em>}</li>
 *   <li>{@link MDSDComponentMetamodel.impl.ComponentSystemImpl#getSystem <em>System</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentSystemImpl extends MinimalEObjectImpl.Container implements ComponentSystem {
	/**
	 * The cached value of the '{@link #getRepository() <em>Repository</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepository()
	 * @generated
	 * @ordered
	 */
	protected EList<Repository> repository;

	/**
	 * The cached value of the '{@link #getSystem() <em>System</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystem()
	 * @generated
	 * @ordered
	 */
	protected EList<MDSDComponentMetamodel.SystemDependant.System> system;

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
	public EList<Repository> getRepository() {
		if (repository == null) {
			repository = new EObjectContainmentEList<Repository>(Repository.class, this,
					MDSDComponentMetamodelPackage.COMPONENT_SYSTEM__REPOSITORY);
		}
		return repository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MDSDComponentMetamodel.SystemDependant.System> getSystem() {
		if (system == null) {
			system = new EObjectContainmentEList<MDSDComponentMetamodel.SystemDependant.System>(
					MDSDComponentMetamodel.SystemDependant.System.class, this,
					MDSDComponentMetamodelPackage.COMPONENT_SYSTEM__SYSTEM);
		}
		return system;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MDSDComponentMetamodelPackage.COMPONENT_SYSTEM__REPOSITORY:
			return ((InternalEList<?>) getRepository()).basicRemove(otherEnd, msgs);
		case MDSDComponentMetamodelPackage.COMPONENT_SYSTEM__SYSTEM:
			return ((InternalEList<?>) getSystem()).basicRemove(otherEnd, msgs);
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
		case MDSDComponentMetamodelPackage.COMPONENT_SYSTEM__REPOSITORY:
			return getRepository();
		case MDSDComponentMetamodelPackage.COMPONENT_SYSTEM__SYSTEM:
			return getSystem();
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
		case MDSDComponentMetamodelPackage.COMPONENT_SYSTEM__REPOSITORY:
			getRepository().clear();
			getRepository().addAll((Collection<? extends Repository>) newValue);
			return;
		case MDSDComponentMetamodelPackage.COMPONENT_SYSTEM__SYSTEM:
			getSystem().clear();
			getSystem().addAll((Collection<? extends MDSDComponentMetamodel.SystemDependant.System>) newValue);
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
		case MDSDComponentMetamodelPackage.COMPONENT_SYSTEM__REPOSITORY:
			getRepository().clear();
			return;
		case MDSDComponentMetamodelPackage.COMPONENT_SYSTEM__SYSTEM:
			getSystem().clear();
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
		case MDSDComponentMetamodelPackage.COMPONENT_SYSTEM__REPOSITORY:
			return repository != null && !repository.isEmpty();
		case MDSDComponentMetamodelPackage.COMPONENT_SYSTEM__SYSTEM:
			return system != null && !system.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ComponentSystemImpl
