/**
 */
package com.incquerylabs.smarthome.model.simple.smarthome.provider;

import com.incquerylabs.smarthome.model.simple.smarthome.util.SmarthomeAdapterFactory;

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
public class SmarthomeItemProviderAdapterFactory extends SmarthomeAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
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
    public SmarthomeItemProviderAdapterFactory() {
        supportedTypes.add(IEditingDomainItemProvider.class);
        supportedTypes.add(IStructuredItemContentProvider.class);
        supportedTypes.add(ITreeItemContentProvider.class);
        supportedTypes.add(IItemLabelProvider.class);
        supportedTypes.add(IItemPropertySource.class);
    }

    /**
     * This keeps track of the one adapter used for all {@link com.incquerylabs.smarthome.model.simple.smarthome.SmartHome} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SmartHomeItemProvider smartHomeItemProvider;

    /**
     * This creates an adapter for a {@link com.incquerylabs.smarthome.model.simple.smarthome.SmartHome}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createSmartHomeAdapter() {
        if (smartHomeItemProvider == null) {
            smartHomeItemProvider = new SmartHomeItemProvider(this);
        }

        return smartHomeItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link com.incquerylabs.smarthome.model.simple.smarthome.ContactItem} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ContactItemItemProvider contactItemItemProvider;

    /**
     * This creates an adapter for a {@link com.incquerylabs.smarthome.model.simple.smarthome.ContactItem}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createContactItemAdapter() {
        if (contactItemItemProvider == null) {
            contactItemItemProvider = new ContactItemItemProvider(this);
        }

        return contactItemItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link com.incquerylabs.smarthome.model.simple.smarthome.State} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected StateItemProvider stateItemProvider;

    /**
     * This creates an adapter for a {@link com.incquerylabs.smarthome.model.simple.smarthome.State}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createStateAdapter() {
        if (stateItemProvider == null) {
            stateItemProvider = new StateItemProvider(this);
        }

        return stateItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link com.incquerylabs.smarthome.model.simple.smarthome.EvaluatingNode} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected EvaluatingNodeItemProvider evaluatingNodeItemProvider;

    /**
     * This creates an adapter for a {@link com.incquerylabs.smarthome.model.simple.smarthome.EvaluatingNode}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createEvaluatingNodeAdapter() {
        if (evaluatingNodeItemProvider == null) {
            evaluatingNodeItemProvider = new EvaluatingNodeItemProvider(this);
        }

        return evaluatingNodeItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link com.incquerylabs.smarthome.model.simple.smarthome.Command} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected CommandItemProvider commandItemProvider;

    /**
     * This creates an adapter for a {@link com.incquerylabs.smarthome.model.simple.smarthome.Command}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createCommandAdapter() {
        if (commandItemProvider == null) {
            commandItemProvider = new CommandItemProvider(this);
        }

        return commandItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link com.incquerylabs.smarthome.model.simple.smarthome.SwitchItem} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SwitchItemItemProvider switchItemItemProvider;

    /**
     * This creates an adapter for a {@link com.incquerylabs.smarthome.model.simple.smarthome.SwitchItem}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createSwitchItemAdapter() {
        if (switchItemItemProvider == null) {
            switchItemItemProvider = new SwitchItemItemProvider(this);
        }

        return switchItemItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link com.incquerylabs.smarthome.model.simple.smarthome.StateChangeConnection} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected StateChangeConnectionItemProvider stateChangeConnectionItemProvider;

    /**
     * This creates an adapter for a {@link com.incquerylabs.smarthome.model.simple.smarthome.StateChangeConnection}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createStateChangeConnectionAdapter() {
        if (stateChangeConnectionItemProvider == null) {
            stateChangeConnectionItemProvider = new StateChangeConnectionItemProvider(this);
        }

        return stateChangeConnectionItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link com.incquerylabs.smarthome.model.simple.smarthome.FilterConnection} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected FilterConnectionItemProvider filterConnectionItemProvider;

    /**
     * This creates an adapter for a {@link com.incquerylabs.smarthome.model.simple.smarthome.FilterConnection}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createFilterConnectionAdapter() {
        if (filterConnectionItemProvider == null) {
            filterConnectionItemProvider = new FilterConnectionItemProvider(this);
        }

        return filterConnectionItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link com.incquerylabs.smarthome.model.simple.smarthome.DimmerItem} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DimmerItemItemProvider dimmerItemItemProvider;

    /**
     * This creates an adapter for a {@link com.incquerylabs.smarthome.model.simple.smarthome.DimmerItem}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createDimmerItemAdapter() {
        if (dimmerItemItemProvider == null) {
            dimmerItemItemProvider = new DimmerItemItemProvider(this);
        }

        return dimmerItemItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link com.incquerylabs.smarthome.model.simple.smarthome.NumberItem} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected NumberItemItemProvider numberItemItemProvider;

    /**
     * This creates an adapter for a {@link com.incquerylabs.smarthome.model.simple.smarthome.NumberItem}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createNumberItemAdapter() {
        if (numberItemItemProvider == null) {
            numberItemItemProvider = new NumberItemItemProvider(this);
        }

        return numberItemItemProvider;
    }

    /**
     * This returns the root adapter factory that contains this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ComposeableAdapterFactory getRootAdapterFactory() {
        return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
    }

    /**
     * This sets the composed adapter factory that contains this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
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
            if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
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
    public void addListener(INotifyChangedListener notifyChangedListener) {
        changeNotifier.addListener(notifyChangedListener);
    }

    /**
     * This removes a listener.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void removeListener(INotifyChangedListener notifyChangedListener) {
        changeNotifier.removeListener(notifyChangedListener);
    }

    /**
     * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
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
    public void dispose() {
        if (smartHomeItemProvider != null) smartHomeItemProvider.dispose();
        if (contactItemItemProvider != null) contactItemItemProvider.dispose();
        if (stateItemProvider != null) stateItemProvider.dispose();
        if (evaluatingNodeItemProvider != null) evaluatingNodeItemProvider.dispose();
        if (commandItemProvider != null) commandItemProvider.dispose();
        if (switchItemItemProvider != null) switchItemItemProvider.dispose();
        if (stateChangeConnectionItemProvider != null) stateChangeConnectionItemProvider.dispose();
        if (filterConnectionItemProvider != null) filterConnectionItemProvider.dispose();
        if (dimmerItemItemProvider != null) dimmerItemItemProvider.dispose();
        if (numberItemItemProvider != null) numberItemItemProvider.dispose();
    }

}
