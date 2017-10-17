/**
 */
package smarthome;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Open Closed Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link smarthome.OpenClosedType#getState <em>State</em>}</li>
 * </ul>
 *
 * @see smarthome.SmarthomePackage#getOpenClosedType()
 * @model
 * @generated
 */
public interface OpenClosedType extends State {
    /**
     * Returns the value of the '<em><b>State</b></em>' attribute.
     * The literals are from the enumeration {@link smarthome.OpenClosed}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>State</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>State</em>' attribute.
     * @see smarthome.OpenClosed
     * @see #setState(OpenClosed)
     * @see smarthome.SmarthomePackage#getOpenClosedType_State()
     * @model
     * @generated
     */
    OpenClosed getState();

    /**
     * Sets the value of the '{@link smarthome.OpenClosedType#getState <em>State</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>State</em>' attribute.
     * @see smarthome.OpenClosed
     * @see #getState()
     * @generated
     */
    void setState(OpenClosed value);

} // OpenClosedType
