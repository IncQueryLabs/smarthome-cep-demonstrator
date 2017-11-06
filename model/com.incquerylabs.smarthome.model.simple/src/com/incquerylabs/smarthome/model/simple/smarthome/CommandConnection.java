/**
 */
package com.incquerylabs.smarthome.model.simple.smarthome;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Command Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.incquerylabs.smarthome.model.simple.smarthome.CommandConnection#getItem <em>Item</em>}</li>
 *   <li>{@link com.incquerylabs.smarthome.model.simple.smarthome.CommandConnection#getCommand <em>Command</em>}</li>
 * </ul>
 *
 * @see com.incquerylabs.smarthome.model.simple.smarthome.SmarthomePackage#getCommandConnection()
 * @model
 * @generated
 */
public interface CommandConnection extends EObject {
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
	 * @see com.incquerylabs.smarthome.model.simple.smarthome.SmarthomePackage#getCommandConnection_Item()
	 * @model required="true"
	 * @generated
	 */
    Item getItem();

    /**
	 * Sets the value of the '{@link com.incquerylabs.smarthome.model.simple.smarthome.CommandConnection#getItem <em>Item</em>}' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Item</em>' reference.
	 * @see #getItem()
	 * @generated
	 */
    void setItem(Item value);

    /**
	 * Returns the value of the '<em><b>Command</b></em>' reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Command</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Command</em>' reference.
	 * @see #setCommand(Command)
	 * @see com.incquerylabs.smarthome.model.simple.smarthome.SmarthomePackage#getCommandConnection_Command()
	 * @model required="true"
	 * @generated
	 */
    Command getCommand();

    /**
	 * Sets the value of the '{@link com.incquerylabs.smarthome.model.simple.smarthome.CommandConnection#getCommand <em>Command</em>}' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Command</em>' reference.
	 * @see #getCommand()
	 * @generated
	 */
    void setCommand(Command value);

} // CommandConnection
