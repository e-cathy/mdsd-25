/**
 */
package MDSDComponentMetamodel.SystemIndependant.impl;

import MDSDComponentMetamodel.SystemIndependant.BasicComponent;
import MDSDComponentMetamodel.SystemIndependant.Interface;
import MDSDComponentMetamodel.SystemIndependant.Repository;
import MDSDComponentMetamodel.SystemIndependant.SystemIndependantPackage;
import MDSDComponentMetamodel.SystemIndependant.Type;

import MDSDComponentMetamodel.impl.NamedElementImpl;
import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Repository</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MDSDComponentMetamodel.SystemIndependant.impl.RepositoryImpl#getComponents <em>Components</em>}</li>
 *   <li>{@link MDSDComponentMetamodel.SystemIndependant.impl.RepositoryImpl#getInterfaces <em>Interfaces</em>}</li>
 *   <li>{@link MDSDComponentMetamodel.SystemIndependant.impl.RepositoryImpl#getTypes <em>Types</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RepositoryImpl extends NamedElementImpl implements Repository {
	/**
	 * The cached value of the '{@link #getComponents() <em>Components</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponents()
	 * @generated
	 * @ordered
	 */
	protected EList<BasicComponent> components;

	/**
	 * The cached value of the '{@link #getInterfaces() <em>Interfaces</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfaces()
	 * @generated
	 * @ordered
	 */
	protected EList<Interface> interfaces;

	/**
	 * The cached value of the '{@link #getTypes() <em>Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<Type> types;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RepositoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SystemIndependantPackage.Literals.REPOSITORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BasicComponent> getComponents() {
		if (components == null) {
			components = new EObjectContainmentEList<BasicComponent>(BasicComponent.class, this,
					SystemIndependantPackage.REPOSITORY__COMPONENTS);
		}
		return components;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Interface> getInterfaces() {
		if (interfaces == null) {
			interfaces = new EObjectContainmentEList<Interface>(Interface.class, this,
					SystemIndependantPackage.REPOSITORY__INTERFACES);
		}
		return interfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Type> getTypes() {
		if (types == null) {
			types = new EObjectContainmentEList<Type>(Type.class, this, SystemIndependantPackage.REPOSITORY__TYPES);
		}
		return types;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SystemIndependantPackage.REPOSITORY__COMPONENTS:
			return ((InternalEList<?>) getComponents()).basicRemove(otherEnd, msgs);
		case SystemIndependantPackage.REPOSITORY__INTERFACES:
			return ((InternalEList<?>) getInterfaces()).basicRemove(otherEnd, msgs);
		case SystemIndependantPackage.REPOSITORY__TYPES:
			return ((InternalEList<?>) getTypes()).basicRemove(otherEnd, msgs);
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
		case SystemIndependantPackage.REPOSITORY__COMPONENTS:
			return getComponents();
		case SystemIndependantPackage.REPOSITORY__INTERFACES:
			return getInterfaces();
		case SystemIndependantPackage.REPOSITORY__TYPES:
			return getTypes();
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
		case SystemIndependantPackage.REPOSITORY__COMPONENTS:
			getComponents().clear();
			getComponents().addAll((Collection<? extends BasicComponent>) newValue);
			return;
		case SystemIndependantPackage.REPOSITORY__INTERFACES:
			getInterfaces().clear();
			getInterfaces().addAll((Collection<? extends Interface>) newValue);
			return;
		case SystemIndependantPackage.REPOSITORY__TYPES:
			getTypes().clear();
			getTypes().addAll((Collection<? extends Type>) newValue);
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
		case SystemIndependantPackage.REPOSITORY__COMPONENTS:
			getComponents().clear();
			return;
		case SystemIndependantPackage.REPOSITORY__INTERFACES:
			getInterfaces().clear();
			return;
		case SystemIndependantPackage.REPOSITORY__TYPES:
			getTypes().clear();
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
		case SystemIndependantPackage.REPOSITORY__COMPONENTS:
			return components != null && !components.isEmpty();
		case SystemIndependantPackage.REPOSITORY__INTERFACES:
			return interfaces != null && !interfaces.isEmpty();
		case SystemIndependantPackage.REPOSITORY__TYPES:
			return types != null && !types.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RepositoryImpl
