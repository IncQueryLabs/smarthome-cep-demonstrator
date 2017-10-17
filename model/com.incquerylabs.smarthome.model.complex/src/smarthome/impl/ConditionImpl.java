/**
 */
package smarthome.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import smarthome.Condition;
import smarthome.ConnectionType;
import smarthome.Item;
import smarthome.SmarthomePackage;
import smarthome.State;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link smarthome.impl.ConditionImpl#getConnectionType <em>Connection Type</em>}</li>
 *   <li>{@link smarthome.impl.ConditionImpl#getState <em>State</em>}</li>
 *   <li>{@link smarthome.impl.ConditionImpl#getItem <em>Item</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConditionImpl extends MinimalEObjectImpl.Container implements Condition {
    /**
     * The default value of the '{@link #getConnectionType() <em>Connection Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConnectionType()
     * @generated
     * @ordered
     */
    protected static final ConnectionType CONNECTION_TYPE_EDEFAULT = ConnectionType.STATE_CHANGE;

    /**
     * The cached value of the '{@link #getConnectionType() <em>Connection Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConnectionType()
     * @generated
     * @ordered
     */
    protected ConnectionType connectionType = CONNECTION_TYPE_EDEFAULT;

    /**
     * The cached value of the '{@link #getState() <em>State</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getState()
     * @generated
     * @ordered
     */
    protected State state;

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
    protected ConditionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SmarthomePackage.Literals.CONDITION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ConnectionType getConnectionType() {
        return connectionType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public State getState() {
        return state;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetState(State newState, NotificationChain msgs) {
        State oldState = state;
        state = newState;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SmarthomePackage.CONDITION__STATE, oldState, newState);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setState(State newState) {
        if (newState != state) {
            NotificationChain msgs = null;
            if (state != null)
                msgs = ((InternalEObject)state).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SmarthomePackage.CONDITION__STATE, null, msgs);
            if (newState != null)
                msgs = ((InternalEObject)newState).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SmarthomePackage.CONDITION__STATE, null, msgs);
            msgs = basicSetState(newState, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SmarthomePackage.CONDITION__STATE, newState, newState));
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
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, SmarthomePackage.CONDITION__ITEM, oldItem, item));
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
            eNotify(new ENotificationImpl(this, Notification.SET, SmarthomePackage.CONDITION__ITEM, oldItem, item));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case SmarthomePackage.CONDITION__STATE:
                return basicSetState(null, msgs);
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
            case SmarthomePackage.CONDITION__CONNECTION_TYPE:
                return getConnectionType();
            case SmarthomePackage.CONDITION__STATE:
                return getState();
            case SmarthomePackage.CONDITION__ITEM:
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
            case SmarthomePackage.CONDITION__STATE:
                setState((State)newValue);
                return;
            case SmarthomePackage.CONDITION__ITEM:
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
            case SmarthomePackage.CONDITION__STATE:
                setState((State)null);
                return;
            case SmarthomePackage.CONDITION__ITEM:
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
            case SmarthomePackage.CONDITION__CONNECTION_TYPE:
                return connectionType != CONNECTION_TYPE_EDEFAULT;
            case SmarthomePackage.CONDITION__STATE:
                return state != null;
            case SmarthomePackage.CONDITION__ITEM:
                return item != null;
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if (eIsProxy()) return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (connectionType: ");
        result.append(connectionType);
        result.append(')');
        return result.toString();
    }

} //ConditionImpl
