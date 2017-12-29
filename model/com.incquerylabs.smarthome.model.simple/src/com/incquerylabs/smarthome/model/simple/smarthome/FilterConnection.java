/**
 */
package com.incquerylabs.smarthome.model.simple.smarthome;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Filter Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.incquerylabs.smarthome.model.simple.smarthome.FilterConnection#getRequiredState <em>Required State</em>}</li>
 *   <li>{@link com.incquerylabs.smarthome.model.simple.smarthome.FilterConnection#getItem <em>Item</em>}</li>
 * </ul>
 *
 * @see com.incquerylabs.smarthome.model.simple.smarthome.SmarthomePackage#getFilterConnection()
 * @model
 * @generated
 */
public interface FilterConnection extends EObject {
    /**
	 * Returns the value of the '<em><b>Required State</b></em>' reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Required State</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Required State</em>' reference.
	 * @see #setRequiredState(State)
	 * @see com.incquerylabs.smarthome.model.simple.smarthome.SmarthomePackage#getFilterConnection_RequiredState()
	 * @model required="true"
	 * @generated
	 */
    State getRequiredState();

    /**
	 * Sets the value of the '{@link com.incquerylabs.smarthome.model.simple.smarthome.FilterConnection#getRequiredState <em>Required State</em>}' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required State</em>' reference.
	 * @see #getRequiredState()
	 * @generated
	 */
    void setRequiredState(State value);

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
	 * @see com.incquerylabs.smarthome.model.simple.smarthome.SmarthomePackage#getFilterConnection_Item()
	 * @model required="true"
	 * @generated
	 */
    Item getItem();

    /**
	 * Sets the value of the '{@link com.incquerylabs.smarthome.model.simple.smarthome.FilterConnection#getItem <em>Item</em>}' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Item</em>' reference.
	 * @see #getItem()
	 * @generated
	 */
    void setItem(Item value);

} // FilterConnection
