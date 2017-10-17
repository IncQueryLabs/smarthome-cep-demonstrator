/**
 */
package smarthome;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>On Off Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link smarthome.OnOffType#getState <em>State</em>}</li>
 * </ul>
 *
 * @see smarthome.SmarthomePackage#getOnOffType()
 * @model
 * @generated
 */
public interface OnOffType extends State {
    /**
     * Returns the value of the '<em><b>State</b></em>' attribute.
     * The literals are from the enumeration {@link smarthome.OnOff}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>State</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>State</em>' attribute.
     * @see smarthome.OnOff
     * @see #setState(OnOff)
     * @see smarthome.SmarthomePackage#getOnOffType_State()
     * @model
     * @generated
     */
    OnOff getState();

    /**
     * Sets the value of the '{@link smarthome.OnOffType#getState <em>State</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>State</em>' attribute.
     * @see smarthome.OnOff
     * @see #getState()
     * @generated
     */
    void setState(OnOff value);

} // OnOffType
