/**
 */
package com.incquerylabs.smarthome.model.simple.smarthome.impl;

import com.incquerylabs.smarthome.model.simple.smarthome.Command;
import com.incquerylabs.smarthome.model.simple.smarthome.SmarthomePackage;
import com.incquerylabs.smarthome.model.simple.smarthome.State;
import com.incquerylabs.smarthome.model.simple.smarthome.SwitchItem;

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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Switch Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.incquerylabs.smarthome.model.simple.smarthome.impl.SwitchItemImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.incquerylabs.smarthome.model.simple.smarthome.impl.SwitchItemImpl#getStates <em>States</em>}</li>
 *   <li>{@link com.incquerylabs.smarthome.model.simple.smarthome.impl.SwitchItemImpl#getAccaptedCommands <em>Accapted Commands</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SwitchItemImpl extends MinimalEObjectImpl.Container implements SwitchItem {
    /**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
    protected static final String NAME_EDEFAULT = null;

    /**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
    protected String name = NAME_EDEFAULT;

    /**
	 * The cached value of the '{@link #getStates() <em>States</em>}' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getStates()
	 * @generated
	 * @ordered
	 */
    protected EList<State> states;

    /**
	 * The cached value of the '{@link #getAccaptedCommands() <em>Accapted Commands</em>}' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getAccaptedCommands()
	 * @generated
	 * @ordered
	 */
    protected EList<Command> accaptedCommands;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected SwitchItemImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return SmarthomePackage.Literals.SWITCH_ITEM;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public String getName() {
		return name;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmarthomePackage.SWITCH_ITEM__NAME, oldName, name));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<State> getStates() {
		if (states == null) {
			states = new EObjectContainmentEList<State>(State.class, this, SmarthomePackage.SWITCH_ITEM__STATES);
		}
		return states;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<Command> getAccaptedCommands() {
		if (accaptedCommands == null) {
			accaptedCommands = new EObjectContainmentEList<Command>(Command.class, this, SmarthomePackage.SWITCH_ITEM__ACCAPTED_COMMANDS);
		}
		return accaptedCommands;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SmarthomePackage.SWITCH_ITEM__STATES:
				return ((InternalEList<?>)getStates()).basicRemove(otherEnd, msgs);
			case SmarthomePackage.SWITCH_ITEM__ACCAPTED_COMMANDS:
				return ((InternalEList<?>)getAccaptedCommands()).basicRemove(otherEnd, msgs);
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
			case SmarthomePackage.SWITCH_ITEM__NAME:
				return getName();
			case SmarthomePackage.SWITCH_ITEM__STATES:
				return getStates();
			case SmarthomePackage.SWITCH_ITEM__ACCAPTED_COMMANDS:
				return getAccaptedCommands();
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
			case SmarthomePackage.SWITCH_ITEM__NAME:
				setName((String)newValue);
				return;
			case SmarthomePackage.SWITCH_ITEM__STATES:
				getStates().clear();
				getStates().addAll((Collection<? extends State>)newValue);
				return;
			case SmarthomePackage.SWITCH_ITEM__ACCAPTED_COMMANDS:
				getAccaptedCommands().clear();
				getAccaptedCommands().addAll((Collection<? extends Command>)newValue);
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
			case SmarthomePackage.SWITCH_ITEM__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SmarthomePackage.SWITCH_ITEM__STATES:
				getStates().clear();
				return;
			case SmarthomePackage.SWITCH_ITEM__ACCAPTED_COMMANDS:
				getAccaptedCommands().clear();
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
			case SmarthomePackage.SWITCH_ITEM__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SmarthomePackage.SWITCH_ITEM__STATES:
				return states != null && !states.isEmpty();
			case SmarthomePackage.SWITCH_ITEM__ACCAPTED_COMMANDS:
				return accaptedCommands != null && !accaptedCommands.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //SwitchItemImpl
