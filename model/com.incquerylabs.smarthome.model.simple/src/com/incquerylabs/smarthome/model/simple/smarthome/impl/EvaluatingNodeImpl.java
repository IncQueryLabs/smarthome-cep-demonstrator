/**
 */
package com.incquerylabs.smarthome.model.simple.smarthome.impl;

import com.incquerylabs.smarthome.model.simple.smarthome.Command;
import com.incquerylabs.smarthome.model.simple.smarthome.EvaluatingNode;
import com.incquerylabs.smarthome.model.simple.smarthome.FilterConnection;
import com.incquerylabs.smarthome.model.simple.smarthome.SmarthomePackage;
import com.incquerylabs.smarthome.model.simple.smarthome.StateChangeConnection;

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
 * An implementation of the model object '<em><b>Evaluating Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.incquerylabs.smarthome.model.simple.smarthome.impl.EvaluatingNodeImpl#getEvents <em>Events</em>}</li>
 *   <li>{@link com.incquerylabs.smarthome.model.simple.smarthome.impl.EvaluatingNodeImpl#getCommands <em>Commands</em>}</li>
 *   <li>{@link com.incquerylabs.smarthome.model.simple.smarthome.impl.EvaluatingNodeImpl#getFilters <em>Filters</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EvaluatingNodeImpl extends MinimalEObjectImpl.Container implements EvaluatingNode {
    /**
     * The cached value of the '{@link #getEvents() <em>Events</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEvents()
     * @generated
     * @ordered
     */
    protected EList<StateChangeConnection> events;

    /**
     * The cached value of the '{@link #getCommands() <em>Commands</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCommands()
     * @generated
     * @ordered
     */
    protected EList<Command> commands;

    /**
     * The cached value of the '{@link #getFilters() <em>Filters</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFilters()
     * @generated
     * @ordered
     */
    protected EList<FilterConnection> filters;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected EvaluatingNodeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SmarthomePackage.Literals.EVALUATING_NODE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<StateChangeConnection> getEvents() {
        if (events == null) {
            events = new EObjectContainmentEList<StateChangeConnection>(StateChangeConnection.class, this, SmarthomePackage.EVALUATING_NODE__EVENTS);
        }
        return events;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Command> getCommands() {
        if (commands == null) {
            commands = new EObjectContainmentEList<Command>(Command.class, this, SmarthomePackage.EVALUATING_NODE__COMMANDS);
        }
        return commands;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<FilterConnection> getFilters() {
        if (filters == null) {
            filters = new EObjectContainmentEList<FilterConnection>(FilterConnection.class, this, SmarthomePackage.EVALUATING_NODE__FILTERS);
        }
        return filters;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case SmarthomePackage.EVALUATING_NODE__EVENTS:
                return ((InternalEList<?>)getEvents()).basicRemove(otherEnd, msgs);
            case SmarthomePackage.EVALUATING_NODE__COMMANDS:
                return ((InternalEList<?>)getCommands()).basicRemove(otherEnd, msgs);
            case SmarthomePackage.EVALUATING_NODE__FILTERS:
                return ((InternalEList<?>)getFilters()).basicRemove(otherEnd, msgs);
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
            case SmarthomePackage.EVALUATING_NODE__EVENTS:
                return getEvents();
            case SmarthomePackage.EVALUATING_NODE__COMMANDS:
                return getCommands();
            case SmarthomePackage.EVALUATING_NODE__FILTERS:
                return getFilters();
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
            case SmarthomePackage.EVALUATING_NODE__EVENTS:
                getEvents().clear();
                getEvents().addAll((Collection<? extends StateChangeConnection>)newValue);
                return;
            case SmarthomePackage.EVALUATING_NODE__COMMANDS:
                getCommands().clear();
                getCommands().addAll((Collection<? extends Command>)newValue);
                return;
            case SmarthomePackage.EVALUATING_NODE__FILTERS:
                getFilters().clear();
                getFilters().addAll((Collection<? extends FilterConnection>)newValue);
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
            case SmarthomePackage.EVALUATING_NODE__EVENTS:
                getEvents().clear();
                return;
            case SmarthomePackage.EVALUATING_NODE__COMMANDS:
                getCommands().clear();
                return;
            case SmarthomePackage.EVALUATING_NODE__FILTERS:
                getFilters().clear();
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
            case SmarthomePackage.EVALUATING_NODE__EVENTS:
                return events != null && !events.isEmpty();
            case SmarthomePackage.EVALUATING_NODE__COMMANDS:
                return commands != null && !commands.isEmpty();
            case SmarthomePackage.EVALUATING_NODE__FILTERS:
                return filters != null && !filters.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //EvaluatingNodeImpl
