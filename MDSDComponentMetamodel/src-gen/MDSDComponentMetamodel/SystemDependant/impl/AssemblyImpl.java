/**
 */
package MDSDComponentMetamodel.SystemDependant.impl;

import MDSDComponentMetamodel.SystemDependant.Assembly;
import MDSDComponentMetamodel.SystemDependant.AssemblyConnector;
import MDSDComponentMetamodel.SystemDependant.AssemblyContext;
import MDSDComponentMetamodel.SystemDependant.CompositeComponent;
import MDSDComponentMetamodel.SystemDependant.DelegationConnector;
import MDSDComponentMetamodel.SystemDependant.SystemDependantPackage;

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
 * An implementation of the model object '<em><b>Assembly</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MDSDComponentMetamodel.SystemDependant.impl.AssemblyImpl#getAssemblyContexts <em>Assembly Contexts</em>}</li>
 *   <li>{@link MDSDComponentMetamodel.SystemDependant.impl.AssemblyImpl#getCompositeComponents <em>Composite Components</em>}</li>
 *   <li>{@link MDSDComponentMetamodel.SystemDependant.impl.AssemblyImpl#getAssemblyConnectors <em>Assembly Connectors</em>}</li>
 *   <li>{@link MDSDComponentMetamodel.SystemDependant.impl.AssemblyImpl#getDelegationConnectors <em>Delegation Connectors</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssemblyImpl extends MinimalEObjectImpl.Container implements Assembly {
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
	 * The cached value of the '{@link #getCompositeComponents() <em>Composite Components</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompositeComponents()
	 * @generated
	 * @ordered
	 */
	protected EList<CompositeComponent> compositeComponents;

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
	protected AssemblyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SystemDependantPackage.Literals.ASSEMBLY;
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
					SystemDependantPackage.ASSEMBLY__ASSEMBLY_CONTEXTS);
		}
		return assemblyContexts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CompositeComponent> getCompositeComponents() {
		if (compositeComponents == null) {
			compositeComponents = new EObjectContainmentEList<CompositeComponent>(CompositeComponent.class, this,
					SystemDependantPackage.ASSEMBLY__COMPOSITE_COMPONENTS);
		}
		return compositeComponents;
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
					SystemDependantPackage.ASSEMBLY__ASSEMBLY_CONNECTORS);
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
					SystemDependantPackage.ASSEMBLY__DELEGATION_CONNECTORS);
		}
		return delegationConnectors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SystemDependantPackage.ASSEMBLY__ASSEMBLY_CONTEXTS:
			return ((InternalEList<?>) getAssemblyContexts()).basicRemove(otherEnd, msgs);
		case SystemDependantPackage.ASSEMBLY__COMPOSITE_COMPONENTS:
			return ((InternalEList<?>) getCompositeComponents()).basicRemove(otherEnd, msgs);
		case SystemDependantPackage.ASSEMBLY__ASSEMBLY_CONNECTORS:
			return ((InternalEList<?>) getAssemblyConnectors()).basicRemove(otherEnd, msgs);
		case SystemDependantPackage.ASSEMBLY__DELEGATION_CONNECTORS:
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
		case SystemDependantPackage.ASSEMBLY__ASSEMBLY_CONTEXTS:
			return getAssemblyContexts();
		case SystemDependantPackage.ASSEMBLY__COMPOSITE_COMPONENTS:
			return getCompositeComponents();
		case SystemDependantPackage.ASSEMBLY__ASSEMBLY_CONNECTORS:
			return getAssemblyConnectors();
		case SystemDependantPackage.ASSEMBLY__DELEGATION_CONNECTORS:
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
		case SystemDependantPackage.ASSEMBLY__ASSEMBLY_CONTEXTS:
			getAssemblyContexts().clear();
			getAssemblyContexts().addAll((Collection<? extends AssemblyContext>) newValue);
			return;
		case SystemDependantPackage.ASSEMBLY__COMPOSITE_COMPONENTS:
			getCompositeComponents().clear();
			getCompositeComponents().addAll((Collection<? extends CompositeComponent>) newValue);
			return;
		case SystemDependantPackage.ASSEMBLY__ASSEMBLY_CONNECTORS:
			getAssemblyConnectors().clear();
			getAssemblyConnectors().addAll((Collection<? extends AssemblyConnector>) newValue);
			return;
		case SystemDependantPackage.ASSEMBLY__DELEGATION_CONNECTORS:
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
		case SystemDependantPackage.ASSEMBLY__ASSEMBLY_CONTEXTS:
			getAssemblyContexts().clear();
			return;
		case SystemDependantPackage.ASSEMBLY__COMPOSITE_COMPONENTS:
			getCompositeComponents().clear();
			return;
		case SystemDependantPackage.ASSEMBLY__ASSEMBLY_CONNECTORS:
			getAssemblyConnectors().clear();
			return;
		case SystemDependantPackage.ASSEMBLY__DELEGATION_CONNECTORS:
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
		case SystemDependantPackage.ASSEMBLY__ASSEMBLY_CONTEXTS:
			return assemblyContexts != null && !assemblyContexts.isEmpty();
		case SystemDependantPackage.ASSEMBLY__COMPOSITE_COMPONENTS:
			return compositeComponents != null && !compositeComponents.isEmpty();
		case SystemDependantPackage.ASSEMBLY__ASSEMBLY_CONNECTORS:
			return assemblyConnectors != null && !assemblyConnectors.isEmpty();
		case SystemDependantPackage.ASSEMBLY__DELEGATION_CONNECTORS:
			return delegationConnectors != null && !delegationConnectors.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AssemblyImpl
