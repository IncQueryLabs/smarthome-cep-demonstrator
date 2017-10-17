/**
 */
package smarthome;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Command</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link smarthome.Command#getCommand <em>Command</em>}</li>
 *   <li>{@link smarthome.Command#getItem <em>Item</em>}</li>
 * </ul>
 *
 * @see smarthome.SmarthomePackage#getCommand()
 * @model
 * @generated
 */
public interface Command extends EObject {
    /**
     * Returns the value of the '<em><b>Command</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Command</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Command</em>' attribute.
     * @see #setCommand(String)
     * @see smarthome.SmarthomePackage#getCommand_Command()
     * @model
     * @generated
     */
    String getCommand();

    /**
     * Sets the value of the '{@link smarthome.Command#getCommand <em>Command</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Command</em>' attribute.
     * @see #getCommand()
     * @generated
     */
    void setCommand(String value);

    /**
     * Returns the value of the '<em><b>Item</b></em>' reference list.
     * The list contents are of type {@link smarthome.Item}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Item</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Item</em>' reference list.
     * @see smarthome.SmarthomePackage#getCommand_Item()
     * @model required="true"
     * @generated
     */
    EList<Item> getItem();

} // Command
