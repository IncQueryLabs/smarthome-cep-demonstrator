/**
 */
package com.incquerylabs.smarthome.model.simple.smarthome;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.incquerylabs.smarthome.model.simple.smarthome.Item#getName <em>Name</em>}</li>
 *   <li>{@link com.incquerylabs.smarthome.model.simple.smarthome.Item#getStates <em>States</em>}</li>
 *   <li>{@link com.incquerylabs.smarthome.model.simple.smarthome.Item#getAccaptedCommands <em>Accapted Commands</em>}</li>
 * </ul>
 *
 * @see com.incquerylabs.smarthome.model.simple.smarthome.SmarthomePackage#getItem()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Item extends EObject {
    /**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.incquerylabs.smarthome.model.simple.smarthome.SmarthomePackage#getItem_Name()
	 * @model
	 * @generated
	 */
    String getName();

    /**
	 * Sets the value of the '{@link com.incquerylabs.smarthome.model.simple.smarthome.Item#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
    void setName(String value);

    /**
	 * Returns the value of the '<em><b>States</b></em>' containment reference list.
	 * The list contents are of type {@link com.incquerylabs.smarthome.model.simple.smarthome.State}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>States</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' containment reference list.
	 * @see com.incquerylabs.smarthome.model.simple.smarthome.SmarthomePackage#getItem_States()
	 * @model containment="true"
	 * @generated
	 */
    EList<State> getStates();

    /**
	 * Returns the value of the '<em><b>Accapted Commands</b></em>' containment reference list.
	 * The list contents are of type {@link com.incquerylabs.smarthome.model.simple.smarthome.Command}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Accapted Commands</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Accapted Commands</em>' containment reference list.
	 * @see com.incquerylabs.smarthome.model.simple.smarthome.SmarthomePackage#getItem_AccaptedCommands()
	 * @model containment="true"
	 * @generated
	 */
    EList<Command> getAccaptedCommands();

} // Item
