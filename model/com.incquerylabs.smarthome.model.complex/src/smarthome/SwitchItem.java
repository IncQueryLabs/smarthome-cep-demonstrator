/**
 */
package smarthome;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Switch Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link smarthome.SwitchItem#getState <em>State</em>}</li>
 * </ul>
 *
 * @see smarthome.SmarthomePackage#getSwitchItem()
 * @model
 * @generated
 */
public interface SwitchItem extends Item {
    /**
     * Returns the value of the '<em><b>State</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>State</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>State</em>' containment reference.
     * @see #setState(OnOffType)
     * @see smarthome.SmarthomePackage#getSwitchItem_State()
     * @model containment="true" required="true"
     * @generated
     */
    OnOffType getState();

    /**
     * Sets the value of the '{@link smarthome.SwitchItem#getState <em>State</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>State</em>' containment reference.
     * @see #getState()
     * @generated
     */
    void setState(OnOffType value);

} // SwitchItem
