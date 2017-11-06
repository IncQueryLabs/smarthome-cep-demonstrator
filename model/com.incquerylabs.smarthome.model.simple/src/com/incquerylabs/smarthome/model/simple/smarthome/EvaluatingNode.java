/**
 */
package com.incquerylabs.smarthome.model.simple.smarthome;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Evaluating Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.incquerylabs.smarthome.model.simple.smarthome.EvaluatingNode#getEvents <em>Events</em>}</li>
 *   <li>{@link com.incquerylabs.smarthome.model.simple.smarthome.EvaluatingNode#getCommands <em>Commands</em>}</li>
 *   <li>{@link com.incquerylabs.smarthome.model.simple.smarthome.EvaluatingNode#getFilters <em>Filters</em>}</li>
 * </ul>
 *
 * @see com.incquerylabs.smarthome.model.simple.smarthome.SmarthomePackage#getEvaluatingNode()
 * @model
 * @generated
 */
public interface EvaluatingNode extends EObject {
    /**
	 * Returns the value of the '<em><b>Events</b></em>' containment reference list.
	 * The list contents are of type {@link com.incquerylabs.smarthome.model.simple.smarthome.StateChangeConnection}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Events</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Events</em>' containment reference list.
	 * @see com.incquerylabs.smarthome.model.simple.smarthome.SmarthomePackage#getEvaluatingNode_Events()
	 * @model containment="true" required="true"
	 * @generated
	 */
    EList<StateChangeConnection> getEvents();

    /**
	 * Returns the value of the '<em><b>Commands</b></em>' containment reference list.
	 * The list contents are of type {@link com.incquerylabs.smarthome.model.simple.smarthome.CommandConnection}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Commands</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Commands</em>' containment reference list.
	 * @see com.incquerylabs.smarthome.model.simple.smarthome.SmarthomePackage#getEvaluatingNode_Commands()
	 * @model containment="true" required="true"
	 * @generated
	 */
    EList<CommandConnection> getCommands();

    /**
	 * Returns the value of the '<em><b>Filters</b></em>' containment reference list.
	 * The list contents are of type {@link com.incquerylabs.smarthome.model.simple.smarthome.FilterConnection}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Filters</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Filters</em>' containment reference list.
	 * @see com.incquerylabs.smarthome.model.simple.smarthome.SmarthomePackage#getEvaluatingNode_Filters()
	 * @model containment="true"
	 * @generated
	 */
    EList<FilterConnection> getFilters();

} // EvaluatingNode
