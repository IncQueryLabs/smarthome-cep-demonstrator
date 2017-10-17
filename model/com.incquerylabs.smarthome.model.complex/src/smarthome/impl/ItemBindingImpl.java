/**
 */
package smarthome.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import smarthome.Command;
import smarthome.Condition;
import smarthome.ItemBinding;
import smarthome.SmarthomePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Item Binding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link smarthome.impl.ItemBindingImpl#getCommand <em>Command</em>}</li>
 *   <li>{@link smarthome.impl.ItemBindingImpl#getConditions <em>Conditions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ItemBindingImpl extends MinimalEObjectImpl.Container implements ItemBinding {
    /**
     * The cached value of the '{@link #getCommand() <em>Command</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCommand()
     * @generated
     * @ordered
     */
    protected Command command;

    /**
     * The cached value of the '{@link #getConditions() <em>Conditions</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConditions()
     * @generated
     * @ordered
     */
    protected EList<Condition> conditions;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ItemBindingImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SmarthomePackage.Literals.ITEM_BINDING;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Command getCommand() {
        return command;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetCommand(Command newCommand, NotificationChain msgs) {
        Command oldCommand = command;
        command = newCommand;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SmarthomePackage.ITEM_BINDING__COMMAND, oldCommand, newCommand);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCommand(Command newCommand) {
        if (newCommand != command) {
            NotificationChain msgs = null;
            if (command != null)
                msgs = ((InternalEObject)command).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SmarthomePackage.ITEM_BINDING__COMMAND, null, msgs);
            if (newCommand != null)
                msgs = ((InternalEObject)newCommand).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SmarthomePackage.ITEM_BINDING__COMMAND, null, msgs);
            msgs = basicSetCommand(newCommand, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SmarthomePackage.ITEM_BINDING__COMMAND, newCommand, newCommand));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Condition> getConditions() {
        if (conditions == null) {
            conditions = new EObjectContainmentEList<Condition>(Condition.class, this, SmarthomePackage.ITEM_BINDING__CONDITIONS);
        }
        return conditions;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case SmarthomePackage.ITEM_BINDING__COMMAND:
                return basicSetCommand(null, msgs);
            case SmarthomePackage.ITEM_BINDING__CONDITIONS:
                return ((InternalEList<?>)getConditions()).basicRemove(otherEnd, msgs);
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
            case SmarthomePackage.ITEM_BINDING__COMMAND:
                return getCommand();
            case SmarthomePackage.ITEM_BINDING__CONDITIONS:
                return getConditions();
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
            case SmarthomePackage.ITEM_BINDING__COMMAND:
                setCommand((Command)newValue);
                return;
            case SmarthomePackage.ITEM_BINDING__CONDITIONS:
                getConditions().clear();
                getConditions().addAll((Collection<? extends Condition>)newValue);
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
            case SmarthomePackage.ITEM_BINDING__COMMAND:
                setCommand((Command)null);
                return;
            case SmarthomePackage.ITEM_BINDING__CONDITIONS:
                getConditions().clear();
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
            case SmarthomePackage.ITEM_BINDING__COMMAND:
                return command != null;
            case SmarthomePackage.ITEM_BINDING__CONDITIONS:
                return conditions != null && !conditions.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //ItemBindingImpl
