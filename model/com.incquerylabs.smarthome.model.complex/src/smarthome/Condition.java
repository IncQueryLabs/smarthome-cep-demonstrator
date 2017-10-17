/**
 */
package smarthome;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link smarthome.Condition#getConnectionType <em>Connection Type</em>}</li>
 *   <li>{@link smarthome.Condition#getState <em>State</em>}</li>
 *   <li>{@link smarthome.Condition#getItem <em>Item</em>}</li>
 * </ul>
 *
 * @see smarthome.SmarthomePackage#getCondition()
 * @model
 * @generated
 */
public interface Condition extends EObject {
    /**
     * Returns the value of the '<em><b>Connection Type</b></em>' attribute.
     * The literals are from the enumeration {@link smarthome.ConnectionType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Connection Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Connection Type</em>' attribute.
     * @see smarthome.ConnectionType
     * @see smarthome.SmarthomePackage#getCondition_ConnectionType()
     * @model changeable="false"
     * @generated
     */
    ConnectionType getConnectionType();

    /**
     * Returns the value of the '<em><b>State</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>State</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>State</em>' containment reference.
     * @see #setState(State)
     * @see smarthome.SmarthomePackage#getCondition_State()
     * @model containment="true" required="true"
     * @generated
     */
    State getState();

    /**
     * Sets the value of the '{@link smarthome.Condition#getState <em>State</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>State</em>' containment reference.
     * @see #getState()
     * @generated
     */
    void setState(State value);

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
     * @see smarthome.SmarthomePackage#getCondition_Item()
     * @model required="true"
     * @generated
     */
    Item getItem();

    /**
     * Sets the value of the '{@link smarthome.Condition#getItem <em>Item</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Item</em>' reference.
     * @see #getItem()
     * @generated
     */
    void setItem(Item value);

} // Condition
