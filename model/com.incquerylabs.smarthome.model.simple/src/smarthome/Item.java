/**
 */
package smarthome;

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
 *   <li>{@link smarthome.Item#getState <em>State</em>}</li>
 *   <li>{@link smarthome.Item#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see smarthome.SmarthomePackage#getItem()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Item extends EObject {
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
     * @see smarthome.SmarthomePackage#getItem_State()
     * @model containment="true"
     * @generated
     */
    State getState();

    /**
     * Sets the value of the '{@link smarthome.Item#getState <em>State</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>State</em>' containment reference.
     * @see #getState()
     * @generated
     */
    void setState(State value);

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
     * @see smarthome.SmarthomePackage#getItem_Name()
     * @model
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link smarthome.Item#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

} // Item
