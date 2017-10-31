/**
 */
package com.incquerylabs.smarthome.model.simple.smarthome;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Command</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.incquerylabs.smarthome.model.simple.smarthome.Command#getCommand <em>Command</em>}</li>
 * </ul>
 *
 * @see com.incquerylabs.smarthome.model.simple.smarthome.SmarthomePackage#getCommand()
 * @model
 * @generated
 */
public interface Command extends EObject {
    /**
	 * Returns the value of the '<em><b>Command</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Command</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Command</em>' attribute.
	 * @see #setCommand(String)
	 * @see com.incquerylabs.smarthome.model.simple.smarthome.SmarthomePackage#getCommand_Command()
	 * @model
	 * @generated
	 */
    String getCommand();

    /**
	 * Sets the value of the '{@link com.incquerylabs.smarthome.model.simple.smarthome.Command#getCommand <em>Command</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Command</em>' attribute.
	 * @see #getCommand()
	 * @generated
	 */
    void setCommand(String value);

} // Command
