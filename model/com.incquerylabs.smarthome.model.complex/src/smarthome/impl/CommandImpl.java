/**
 */
package smarthome.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import smarthome.Command;
import smarthome.Item;
import smarthome.SmarthomePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Command</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link smarthome.impl.CommandImpl#getCommand <em>Command</em>}</li>
 *   <li>{@link smarthome.impl.CommandImpl#getItem <em>Item</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CommandImpl extends MinimalEObjectImpl.Container implements Command {
    /**
     * The default value of the '{@link #getCommand() <em>Command</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCommand()
     * @generated
     * @ordered
     */
    protected static final String COMMAND_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getCommand() <em>Command</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCommand()
     * @generated
     * @ordered
     */
    protected String command = COMMAND_EDEFAULT;

    /**
     * The cached value of the '{@link #getItem() <em>Item</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getItem()
     * @generated
     * @ordered
     */
    protected EList<Item> item;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected CommandImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SmarthomePackage.Literals.COMMAND;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getCommand() {
        return command;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCommand(String newCommand) {
        String oldCommand = command;
        command = newCommand;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SmarthomePackage.COMMAND__COMMAND, oldCommand, command));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Item> getItem() {
        if (item == null) {
            item = new EObjectResolvingEList<Item>(Item.class, this, SmarthomePackage.COMMAND__ITEM);
        }
        return item;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case SmarthomePackage.COMMAND__COMMAND:
                return getCommand();
            case SmarthomePackage.COMMAND__ITEM:
                return getItem();
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
            case SmarthomePackage.COMMAND__COMMAND:
                setCommand((String)newValue);
                return;
            case SmarthomePackage.COMMAND__ITEM:
                getItem().clear();
                getItem().addAll((Collection<? extends Item>)newValue);
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
            case SmarthomePackage.COMMAND__COMMAND:
                setCommand(COMMAND_EDEFAULT);
                return;
            case SmarthomePackage.COMMAND__ITEM:
                getItem().clear();
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
            case SmarthomePackage.COMMAND__COMMAND:
                return COMMAND_EDEFAULT == null ? command != null : !COMMAND_EDEFAULT.equals(command);
            case SmarthomePackage.COMMAND__ITEM:
                return item != null && !item.isEmpty();
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
        result.append(" (command: ");
        result.append(command);
        result.append(')');
        return result.toString();
    }

} //CommandImpl
