/**
 */
package MDSDComponentMetamodel.SystemDependant.provider;

import MDSDComponentMetamodel.SystemDependant.util.SystemDependantAdapterFactory;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SystemDependantItemProviderAdapterFactory extends SystemDependantAdapterFactory
		implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemDependantItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link MDSDComponentMetamodel.SystemDependant.CompositeComponent} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompositeComponentItemProvider compositeComponentItemProvider;

	/**
	 * This creates an adapter for a {@link MDSDComponentMetamodel.SystemDependant.CompositeComponent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCompositeComponentAdapter() {
		if (compositeComponentItemProvider == null) {
			compositeComponentItemProvider = new CompositeComponentItemProvider(this);
		}

		return compositeComponentItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link MDSDComponentMetamodel.SystemDependant.System} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemItemProvider systemItemProvider;

	/**
	 * This creates an adapter for a {@link MDSDComponentMetamodel.SystemDependant.System}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSystemAdapter() {
		if (systemItemProvider == null) {
			systemItemProvider = new SystemItemProvider(this);
		}

		return systemItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link MDSDComponentMetamodel.SystemDependant.Role} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoleItemProvider roleItemProvider;

	/**
	 * This creates an adapter for a {@link MDSDComponentMetamodel.SystemDependant.Role}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRoleAdapter() {
		if (roleItemProvider == null) {
			roleItemProvider = new RoleItemProvider(this);
		}

		return roleItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link MDSDComponentMetamodel.SystemDependant.Assembly} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssemblyItemProvider assemblyItemProvider;

	/**
	 * This creates an adapter for a {@link MDSDComponentMetamodel.SystemDependant.Assembly}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAssemblyAdapter() {
		if (assemblyItemProvider == null) {
			assemblyItemProvider = new AssemblyItemProvider(this);
		}

		return assemblyItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link MDSDComponentMetamodel.SystemDependant.AssemblyConnector} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssemblyConnectorItemProvider assemblyConnectorItemProvider;

	/**
	 * This creates an adapter for a {@link MDSDComponentMetamodel.SystemDependant.AssemblyConnector}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAssemblyConnectorAdapter() {
		if (assemblyConnectorItemProvider == null) {
			assemblyConnectorItemProvider = new AssemblyConnectorItemProvider(this);
		}

		return assemblyConnectorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link MDSDComponentMetamodel.SystemDependant.AssemblyContext} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssemblyContextItemProvider assemblyContextItemProvider;

	/**
	 * This creates an adapter for a {@link MDSDComponentMetamodel.SystemDependant.AssemblyContext}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAssemblyContextAdapter() {
		if (assemblyContextItemProvider == null) {
			assemblyContextItemProvider = new AssemblyContextItemProvider(this);
		}

		return assemblyContextItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link MDSDComponentMetamodel.SystemDependant.Allocation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AllocationItemProvider allocationItemProvider;

	/**
	 * This creates an adapter for a {@link MDSDComponentMetamodel.SystemDependant.Allocation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAllocationAdapter() {
		if (allocationItemProvider == null) {
			allocationItemProvider = new AllocationItemProvider(this);
		}

		return allocationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link MDSDComponentMetamodel.SystemDependant.Container} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContainerItemProvider containerItemProvider;

	/**
	 * This creates an adapter for a {@link MDSDComponentMetamodel.SystemDependant.Container}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createContainerAdapter() {
		if (containerItemProvider == null) {
			containerItemProvider = new ContainerItemProvider(this);
		}

		return containerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link MDSDComponentMetamodel.SystemDependant.Environment} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnvironmentItemProvider environmentItemProvider;

	/**
	 * This creates an adapter for a {@link MDSDComponentMetamodel.SystemDependant.Environment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEnvironmentAdapter() {
		if (environmentItemProvider == null) {
			environmentItemProvider = new EnvironmentItemProvider(this);
		}

		return environmentItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link MDSDComponentMetamodel.SystemDependant.Link} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LinkItemProvider linkItemProvider;

	/**
	 * This creates an adapter for a {@link MDSDComponentMetamodel.SystemDependant.Link}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLinkAdapter() {
		if (linkItemProvider == null) {
			linkItemProvider = new LinkItemProvider(this);
		}

		return linkItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link MDSDComponentMetamodel.SystemDependant.AllocationContext} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AllocationContextItemProvider allocationContextItemProvider;

	/**
	 * This creates an adapter for a {@link MDSDComponentMetamodel.SystemDependant.AllocationContext}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAllocationContextAdapter() {
		if (allocationContextItemProvider == null) {
			allocationContextItemProvider = new AllocationContextItemProvider(this);
		}

		return allocationContextItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link MDSDComponentMetamodel.SystemDependant.DelegationConnector} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DelegationConnectorItemProvider delegationConnectorItemProvider;

	/**
	 * This creates an adapter for a {@link MDSDComponentMetamodel.SystemDependant.DelegationConnector}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDelegationConnectorAdapter() {
		if (delegationConnectorItemProvider == null) {
			delegationConnectorItemProvider = new DelegationConnectorItemProvider(this);
		}

		return delegationConnectorItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>) type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void dispose() {
		if (compositeComponentItemProvider != null)
			compositeComponentItemProvider.dispose();
		if (systemItemProvider != null)
			systemItemProvider.dispose();
		if (roleItemProvider != null)
			roleItemProvider.dispose();
		if (assemblyItemProvider != null)
			assemblyItemProvider.dispose();
		if (assemblyConnectorItemProvider != null)
			assemblyConnectorItemProvider.dispose();
		if (assemblyContextItemProvider != null)
			assemblyContextItemProvider.dispose();
		if (allocationItemProvider != null)
			allocationItemProvider.dispose();
		if (containerItemProvider != null)
			containerItemProvider.dispose();
		if (environmentItemProvider != null)
			environmentItemProvider.dispose();
		if (linkItemProvider != null)
			linkItemProvider.dispose();
		if (allocationContextItemProvider != null)
			allocationContextItemProvider.dispose();
		if (delegationConnectorItemProvider != null)
			delegationConnectorItemProvider.dispose();
	}

}
