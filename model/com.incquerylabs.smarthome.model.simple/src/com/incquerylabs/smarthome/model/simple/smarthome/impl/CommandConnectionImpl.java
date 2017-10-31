/**
 */
package com.incquerylabs.smarthome.model.simple.smarthome.impl;

import com.incquerylabs.smarthome.model.simple.smarthome.Command;
import com.incquerylabs.smarthome.model.simple.smarthome.CommandConnection;
import com.incquerylabs.smarthome.model.simple.smarthome.Item;
import com.incquerylabs.smarthome.model.simple.smarthome.SmarthomePackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Command Connection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.incquerylabs.smarthome.model.simple.smarthome.impl.CommandConnectionImpl#getItem <em>Item</em>}</li>
 *   <li>{@link com.incquerylabs.smarthome.model.simple.smarthome.impl.CommandConnectionImpl#getCommand <em>Command</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CommandConnectionImpl extends MinimalEObjectImpl.Container implements CommandConnection {
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
	 * The cached value of the '{@link #getCommand() <em>Command</em>}' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getCommand()
	 * @generated
	 * @ordered
	 */
    protected Command command;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected CommandConnectionImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return SmarthomePackage.Literals.COMMAND_CONNECTION;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SmarthomePackage.COMMAND_CONNECTION__ITEM, oldItem, item));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SmarthomePackage.COMMAND_CONNECTION__ITEM, oldItem, item));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Command getCommand() {
		if (command != null && command.eIsProxy()) {
			InternalEObject oldCommand = (InternalEObject)command;
			command = (Command)eResolveProxy(oldCommand);
			if (command != oldCommand) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SmarthomePackage.COMMAND_CONNECTION__COMMAND, oldCommand, command));
			}
		}
		return command;
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Command basicGetCommand() {
		return command;
	}

				/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setCommand(Command newCommand) {
		Command oldCommand = command;
		command = newCommand;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmarthomePackage.COMMAND_CONNECTION__COMMAND, oldCommand, command));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SmarthomePackage.COMMAND_CONNECTION__ITEM:
				if (resolve) return getItem();
				return basicGetItem();
			case SmarthomePackage.COMMAND_CONNECTION__COMMAND:
				if (resolve) return getCommand();
				return basicGetCommand();
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
			case SmarthomePackage.COMMAND_CONNECTION__ITEM:
				setItem((Item)newValue);
				return;
			case SmarthomePackage.COMMAND_CONNECTION__COMMAND:
				setCommand((Command)newValue);
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
			case SmarthomePackage.COMMAND_CONNECTION__ITEM:
				setItem((Item)null);
				return;
			case SmarthomePackage.COMMAND_CONNECTION__COMMAND:
				setCommand((Command)null);
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
			case SmarthomePackage.COMMAND_CONNECTION__ITEM:
				return item != null;
			case SmarthomePackage.COMMAND_CONNECTION__COMMAND:
				return command != null;
		}
		return super.eIsSet(featureID);
	}

} //CommandConnectionImpl
