/**
 */
package com.incquerylabs.smarthome.model.simple.smarthome.impl;

import com.incquerylabs.smarthome.model.simple.smarthome.FilterConnection;
import com.incquerylabs.smarthome.model.simple.smarthome.Item;
import com.incquerylabs.smarthome.model.simple.smarthome.SmarthomePackage;
import com.incquerylabs.smarthome.model.simple.smarthome.State;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Filter Connection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.incquerylabs.smarthome.model.simple.smarthome.impl.FilterConnectionImpl#getRequiredState <em>Required State</em>}</li>
 *   <li>{@link com.incquerylabs.smarthome.model.simple.smarthome.impl.FilterConnectionImpl#getItem <em>Item</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FilterConnectionImpl extends MinimalEObjectImpl.Container implements FilterConnection {
    /**
	 * The cached value of the '{@link #getRequiredState() <em>Required State</em>}' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getRequiredState()
	 * @generated
	 * @ordered
	 */
    protected State requiredState;

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
    protected FilterConnectionImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return SmarthomePackage.Literals.FILTER_CONNECTION;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public State getRequiredState() {
		if (requiredState != null && requiredState.eIsProxy()) {
			InternalEObject oldRequiredState = (InternalEObject)requiredState;
			requiredState = (State)eResolveProxy(oldRequiredState);
			if (requiredState != oldRequiredState) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SmarthomePackage.FILTER_CONNECTION__REQUIRED_STATE, oldRequiredState, requiredState));
			}
		}
		return requiredState;
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetRequiredState() {
		return requiredState;
	}

				/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setRequiredState(State newRequiredState) {
		State oldRequiredState = requiredState;
		requiredState = newRequiredState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmarthomePackage.FILTER_CONNECTION__REQUIRED_STATE, oldRequiredState, requiredState));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SmarthomePackage.FILTER_CONNECTION__ITEM, oldItem, item));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SmarthomePackage.FILTER_CONNECTION__ITEM, oldItem, item));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SmarthomePackage.FILTER_CONNECTION__REQUIRED_STATE:
				if (resolve) return getRequiredState();
				return basicGetRequiredState();
			case SmarthomePackage.FILTER_CONNECTION__ITEM:
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
			case SmarthomePackage.FILTER_CONNECTION__REQUIRED_STATE:
				setRequiredState((State)newValue);
				return;
			case SmarthomePackage.FILTER_CONNECTION__ITEM:
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
			case SmarthomePackage.FILTER_CONNECTION__REQUIRED_STATE:
				setRequiredState((State)null);
				return;
			case SmarthomePackage.FILTER_CONNECTION__ITEM:
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
			case SmarthomePackage.FILTER_CONNECTION__REQUIRED_STATE:
				return requiredState != null;
			case SmarthomePackage.FILTER_CONNECTION__ITEM:
				return item != null;
		}
		return super.eIsSet(featureID);
	}

} //FilterConnectionImpl
