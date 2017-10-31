/**
 */
package com.incquerylabs.smarthome.model.simple.smarthome;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State Change Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.incquerylabs.smarthome.model.simple.smarthome.StateChangeConnection#getNewState <em>New State</em>}</li>
 *   <li>{@link com.incquerylabs.smarthome.model.simple.smarthome.StateChangeConnection#getItem <em>Item</em>}</li>
 * </ul>
 *
 * @see com.incquerylabs.smarthome.model.simple.smarthome.SmarthomePackage#getStateChangeConnection()
 * @model
 * @generated
 */
public interface StateChangeConnection extends EObject {
    /**
	 * Returns the value of the '<em><b>New State</b></em>' reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>New State</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>New State</em>' reference.
	 * @see #setNewState(State)
	 * @see com.incquerylabs.smarthome.model.simple.smarthome.SmarthomePackage#getStateChangeConnection_NewState()
	 * @model required="true"
	 * @generated
	 */
    State getNewState();

    /**
	 * Sets the value of the '{@link com.incquerylabs.smarthome.model.simple.smarthome.StateChangeConnection#getNewState <em>New State</em>}' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New State</em>' reference.
	 * @see #getNewState()
	 * @generated
	 */
    void setNewState(State value);

    /**
	 * Returns the value of the '<em><b>Item</b></em>' reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Item</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Item</em>' reference.
	 * @see #setItem(Item)
	 * @see com.incquerylabs.smarthome.model.simple.smarthome.SmarthomePackage#getStateChangeConnection_Item()
	 * @model required="true"
	 * @generated
	 */
    Item getItem();

    /**
	 * Sets the value of the '{@link com.incquerylabs.smarthome.model.simple.smarthome.StateChangeConnection#getItem <em>Item</em>}' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Item</em>' reference.
	 * @see #getItem()
	 * @generated
	 */
    void setItem(Item value);

} // StateChangeConnection
