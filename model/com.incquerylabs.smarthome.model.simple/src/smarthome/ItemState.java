/**
 */
package smarthome;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Item State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link smarthome.ItemState#getItem <em>Item</em>}</li>
 *   <li>{@link smarthome.ItemState#getState <em>State</em>}</li>
 * </ul>
 *
 * @see smarthome.SmarthomePackage#getItemState()
 * @model
 * @generated
 */
public interface ItemState extends EObject {
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
     * @see smarthome.SmarthomePackage#getItemState_Item()
     * @model required="true"
     * @generated
     */
    Item getItem();

    /**
     * Sets the value of the '{@link smarthome.ItemState#getItem <em>Item</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Item</em>' reference.
     * @see #getItem()
     * @generated
     */
    void setItem(Item value);

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
     * @see smarthome.SmarthomePackage#getItemState_State()
     * @model containment="true" required="true"
     * @generated
     */
    State getState();

    /**
     * Sets the value of the '{@link smarthome.ItemState#getState <em>State</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>State</em>' containment reference.
     * @see #getState()
     * @generated
     */
    void setState(State value);

} // ItemState
