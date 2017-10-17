/**
 */
package com.incquerylabs.smarthome.model.simple.smarthome.impl;

import com.incquerylabs.smarthome.model.simple.smarthome.Item;
import com.incquerylabs.smarthome.model.simple.smarthome.SmarthomePackage;
import com.incquerylabs.smarthome.model.simple.smarthome.State;
import com.incquerylabs.smarthome.model.simple.smarthome.StateChangeConnection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State Change Connection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.incquerylabs.smarthome.model.simple.smarthome.impl.StateChangeConnectionImpl#getNewState <em>New State</em>}</li>
 *   <li>{@link com.incquerylabs.smarthome.model.simple.smarthome.impl.StateChangeConnectionImpl#getItem <em>Item</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StateChangeConnectionImpl extends MinimalEObjectImpl.Container implements StateChangeConnection {
    /**
     * The cached value of the '{@link #getNewState() <em>New State</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNewState()
     * @generated
     * @ordered
     */
    protected State newState;

    /**
     * The cached value of the '{@link #getItem() <em>Item</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getItem()
     * @generated
     * @ordered
     */
    protected Item item;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected StateChangeConnectionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SmarthomePackage.Literals.STATE_CHANGE_CONNECTION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public State getNewState() {
        return newState;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetNewState(State newNewState, NotificationChain msgs) {
        State oldNewState = newState;
        newState = newNewState;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SmarthomePackage.STATE_CHANGE_CONNECTION__NEW_STATE, oldNewState, newNewState);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setNewState(State newNewState) {
        if (newNewState != newState) {
            NotificationChain msgs = null;
            if (newState != null)
                msgs = ((InternalEObject)newState).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SmarthomePackage.STATE_CHANGE_CONNECTION__NEW_STATE, null, msgs);
            if (newNewState != null)
                msgs = ((InternalEObject)newNewState).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SmarthomePackage.STATE_CHANGE_CONNECTION__NEW_STATE, null, msgs);
            msgs = basicSetNewState(newNewState, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SmarthomePackage.STATE_CHANGE_CONNECTION__NEW_STATE, newNewState, newNewState));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Item getItem() {
        if (item != null && item.eIsProxy()) {
            InternalEObject oldItem = (InternalEObject)item;
            item = (Item)eResolveProxy(oldItem);
            if (item != oldItem) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, SmarthomePackage.STATE_CHANGE_CONNECTION__ITEM, oldItem, item));
            }
        }
        return item;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Item basicGetItem() {
        return item;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setItem(Item newItem) {
        Item oldItem = item;
        item = newItem;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SmarthomePackage.STATE_CHANGE_CONNECTION__ITEM, oldItem, item));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case SmarthomePackage.STATE_CHANGE_CONNECTION__NEW_STATE:
                return basicSetNewState(null, msgs);
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
            case SmarthomePackage.STATE_CHANGE_CONNECTION__NEW_STATE:
                return getNewState();
            case SmarthomePackage.STATE_CHANGE_CONNECTION__ITEM:
                if (resolve) return getItem();
                return basicGetItem();
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
            case SmarthomePackage.STATE_CHANGE_CONNECTION__NEW_STATE:
                setNewState((State)newValue);
                return;
            case SmarthomePackage.STATE_CHANGE_CONNECTION__ITEM:
                setItem((Item)newValue);
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
            case SmarthomePackage.STATE_CHANGE_CONNECTION__NEW_STATE:
                setNewState((State)null);
                return;
            case SmarthomePackage.STATE_CHANGE_CONNECTION__ITEM:
                setItem((Item)null);
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
            case SmarthomePackage.STATE_CHANGE_CONNECTION__NEW_STATE:
                return newState != null;
            case SmarthomePackage.STATE_CHANGE_CONNECTION__ITEM:
                return item != null;
        }
        return super.eIsSet(featureID);
    }

} //StateChangeConnectionImpl
