/**
 */
package com.incquerylabs.smarthome.model.simple.smarthome;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Smart Home</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.incquerylabs.smarthome.model.simple.smarthome.SmartHome#getName <em>Name</em>}</li>
 *   <li>{@link com.incquerylabs.smarthome.model.simple.smarthome.SmartHome#getItems <em>Items</em>}</li>
 *   <li>{@link com.incquerylabs.smarthome.model.simple.smarthome.SmartHome#getRules <em>Rules</em>}</li>
 * </ul>
 *
 * @see com.incquerylabs.smarthome.model.simple.smarthome.SmarthomePackage#getSmartHome()
 * @model
 * @generated
 */
public interface SmartHome extends EObject {
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
	 * @see com.incquerylabs.smarthome.model.simple.smarthome.SmarthomePackage#getSmartHome_Name()
	 * @model
	 * @generated
	 */
    String getName();

    /**
	 * Sets the value of the '{@link com.incquerylabs.smarthome.model.simple.smarthome.SmartHome#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
    void setName(String value);

    /**
	 * Returns the value of the '<em><b>Items</b></em>' containment reference list.
	 * The list contents are of type {@link com.incquerylabs.smarthome.model.simple.smarthome.Item}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Items</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Items</em>' containment reference list.
	 * @see com.incquerylabs.smarthome.model.simple.smarthome.SmarthomePackage#getSmartHome_Items()
	 * @model containment="true"
	 * @generated
	 */
    EList<Item> getItems();

    /**
	 * Returns the value of the '<em><b>Rules</b></em>' containment reference list.
	 * The list contents are of type {@link com.incquerylabs.smarthome.model.simple.smarthome.EvaluatingNode}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Rules</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Rules</em>' containment reference list.
	 * @see com.incquerylabs.smarthome.model.simple.smarthome.SmarthomePackage#getSmartHome_Rules()
	 * @model containment="true"
	 * @generated
	 */
    EList<EvaluatingNode> getRules();

} // SmartHome
