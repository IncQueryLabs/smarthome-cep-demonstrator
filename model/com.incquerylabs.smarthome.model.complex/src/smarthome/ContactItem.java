/**
 */
package smarthome;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contact Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link smarthome.ContactItem#getState <em>State</em>}</li>
 * </ul>
 *
 * @see smarthome.SmarthomePackage#getContactItem()
 * @model
 * @generated
 */
public interface ContactItem extends Item {
    /**
     * Returns the value of the '<em><b>State</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>State</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>State</em>' containment reference.
     * @see #setState(OpenClosedType)
     * @see smarthome.SmarthomePackage#getContactItem_State()
     * @model containment="true" required="true"
     * @generated
     */
    OpenClosedType getState();

    /**
     * Sets the value of the '{@link smarthome.ContactItem#getState <em>State</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>State</em>' containment reference.
     * @see #getState()
     * @generated
     */
    void setState(OpenClosedType value);

} // ContactItem
