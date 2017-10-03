/**
 */
package smarthome;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see smarthome.SmarthomeFactory
 * @model kind="package"
 * @generated
 */
public interface SmarthomePackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "smarthome";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://www.example.org/smarthome";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "smarthome";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    SmarthomePackage eINSTANCE = smarthome.impl.SmarthomePackageImpl.init();

    /**
     * The meta object id for the '{@link smarthome.impl.SmartHomeImpl <em>Smart Home</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see smarthome.impl.SmartHomeImpl
     * @see smarthome.impl.SmarthomePackageImpl#getSmartHome()
     * @generated
     */
    int SMART_HOME = 0;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SMART_HOME__NAME = 0;

    /**
     * The feature id for the '<em><b>Items</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SMART_HOME__ITEMS = 1;

    /**
     * The feature id for the '<em><b>Control</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SMART_HOME__CONTROL = 2;

    /**
     * The number of structural features of the '<em>Smart Home</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SMART_HOME_FEATURE_COUNT = 3;

    /**
     * The number of operations of the '<em>Smart Home</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SMART_HOME_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link smarthome.Item <em>Item</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see smarthome.Item
     * @see smarthome.impl.SmarthomePackageImpl#getItem()
     * @generated
     */
    int ITEM = 2;

    /**
     * The feature id for the '<em><b>State</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ITEM__STATE = 0;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ITEM__NAME = 1;

    /**
     * The number of structural features of the '<em>Item</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ITEM_FEATURE_COUNT = 2;

    /**
     * The number of operations of the '<em>Item</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ITEM_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link smarthome.impl.SwitchItemImpl <em>Switch Item</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see smarthome.impl.SwitchItemImpl
     * @see smarthome.impl.SmarthomePackageImpl#getSwitchItem()
     * @generated
     */
    int SWITCH_ITEM = 1;

    /**
     * The feature id for the '<em><b>State</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SWITCH_ITEM__STATE = ITEM__STATE;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SWITCH_ITEM__NAME = ITEM__NAME;

    /**
     * The number of structural features of the '<em>Switch Item</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SWITCH_ITEM_FEATURE_COUNT = ITEM_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Switch Item</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SWITCH_ITEM_OPERATION_COUNT = ITEM_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link smarthome.impl.ContactItemImpl <em>Contact Item</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see smarthome.impl.ContactItemImpl
     * @see smarthome.impl.SmarthomePackageImpl#getContactItem()
     * @generated
     */
    int CONTACT_ITEM = 3;

    /**
     * The feature id for the '<em><b>State</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTACT_ITEM__STATE = ITEM__STATE;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTACT_ITEM__NAME = ITEM__NAME;

    /**
     * The number of structural features of the '<em>Contact Item</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTACT_ITEM_FEATURE_COUNT = ITEM_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Contact Item</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTACT_ITEM_OPERATION_COUNT = ITEM_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link smarthome.impl.StateImpl <em>State</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see smarthome.impl.StateImpl
     * @see smarthome.impl.SmarthomePackageImpl#getState()
     * @generated
     */
    int STATE = 4;

    /**
     * The feature id for the '<em><b>State</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATE__STATE = 0;

    /**
     * The number of structural features of the '<em>State</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATE_FEATURE_COUNT = 1;

    /**
     * The number of operations of the '<em>State</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATE_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link smarthome.impl.ItemBindingImpl <em>Item Binding</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see smarthome.impl.ItemBindingImpl
     * @see smarthome.impl.SmarthomePackageImpl#getItemBinding()
     * @generated
     */
    int ITEM_BINDING = 5;

    /**
     * The feature id for the '<em><b>Itemstate</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ITEM_BINDING__ITEMSTATE = 0;

    /**
     * The feature id for the '<em><b>Command</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ITEM_BINDING__COMMAND = 1;

    /**
     * The number of structural features of the '<em>Item Binding</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ITEM_BINDING_FEATURE_COUNT = 2;

    /**
     * The number of operations of the '<em>Item Binding</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ITEM_BINDING_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link smarthome.impl.ItemStateImpl <em>Item State</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see smarthome.impl.ItemStateImpl
     * @see smarthome.impl.SmarthomePackageImpl#getItemState()
     * @generated
     */
    int ITEM_STATE = 6;

    /**
     * The feature id for the '<em><b>Item</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ITEM_STATE__ITEM = 0;

    /**
     * The feature id for the '<em><b>State</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ITEM_STATE__STATE = 1;

    /**
     * The number of structural features of the '<em>Item State</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ITEM_STATE_FEATURE_COUNT = 2;

    /**
     * The number of operations of the '<em>Item State</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ITEM_STATE_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link smarthome.impl.CommandImpl <em>Command</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see smarthome.impl.CommandImpl
     * @see smarthome.impl.SmarthomePackageImpl#getCommand()
     * @generated
     */
    int COMMAND = 7;

    /**
     * The feature id for the '<em><b>Item</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMAND__ITEM = 0;

    /**
     * The feature id for the '<em><b>Command</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMAND__COMMAND = 1;

    /**
     * The number of structural features of the '<em>Command</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMAND_FEATURE_COUNT = 2;

    /**
     * The number of operations of the '<em>Command</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMAND_OPERATION_COUNT = 0;


    /**
     * Returns the meta object for class '{@link smarthome.SmartHome <em>Smart Home</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Smart Home</em>'.
     * @see smarthome.SmartHome
     * @generated
     */
    EClass getSmartHome();

    /**
     * Returns the meta object for the attribute '{@link smarthome.SmartHome#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see smarthome.SmartHome#getName()
     * @see #getSmartHome()
     * @generated
     */
    EAttribute getSmartHome_Name();

    /**
     * Returns the meta object for the containment reference list '{@link smarthome.SmartHome#getItems <em>Items</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Items</em>'.
     * @see smarthome.SmartHome#getItems()
     * @see #getSmartHome()
     * @generated
     */
    EReference getSmartHome_Items();

    /**
     * Returns the meta object for the containment reference list '{@link smarthome.SmartHome#getControl <em>Control</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Control</em>'.
     * @see smarthome.SmartHome#getControl()
     * @see #getSmartHome()
     * @generated
     */
    EReference getSmartHome_Control();

    /**
     * Returns the meta object for class '{@link smarthome.SwitchItem <em>Switch Item</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Switch Item</em>'.
     * @see smarthome.SwitchItem
     * @generated
     */
    EClass getSwitchItem();

    /**
     * Returns the meta object for class '{@link smarthome.Item <em>Item</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Item</em>'.
     * @see smarthome.Item
     * @generated
     */
    EClass getItem();

    /**
     * Returns the meta object for the containment reference '{@link smarthome.Item#getState <em>State</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>State</em>'.
     * @see smarthome.Item#getState()
     * @see #getItem()
     * @generated
     */
    EReference getItem_State();

    /**
     * Returns the meta object for the attribute '{@link smarthome.Item#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see smarthome.Item#getName()
     * @see #getItem()
     * @generated
     */
    EAttribute getItem_Name();

    /**
     * Returns the meta object for class '{@link smarthome.ContactItem <em>Contact Item</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Contact Item</em>'.
     * @see smarthome.ContactItem
     * @generated
     */
    EClass getContactItem();

    /**
     * Returns the meta object for class '{@link smarthome.State <em>State</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>State</em>'.
     * @see smarthome.State
     * @generated
     */
    EClass getState();

    /**
     * Returns the meta object for the attribute '{@link smarthome.State#getState <em>State</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>State</em>'.
     * @see smarthome.State#getState()
     * @see #getState()
     * @generated
     */
    EAttribute getState_State();

    /**
     * Returns the meta object for class '{@link smarthome.ItemBinding <em>Item Binding</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Item Binding</em>'.
     * @see smarthome.ItemBinding
     * @generated
     */
    EClass getItemBinding();

    /**
     * Returns the meta object for the containment reference list '{@link smarthome.ItemBinding#getItemstate <em>Itemstate</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Itemstate</em>'.
     * @see smarthome.ItemBinding#getItemstate()
     * @see #getItemBinding()
     * @generated
     */
    EReference getItemBinding_Itemstate();

    /**
     * Returns the meta object for the containment reference '{@link smarthome.ItemBinding#getCommand <em>Command</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Command</em>'.
     * @see smarthome.ItemBinding#getCommand()
     * @see #getItemBinding()
     * @generated
     */
    EReference getItemBinding_Command();

    /**
     * Returns the meta object for class '{@link smarthome.ItemState <em>Item State</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Item State</em>'.
     * @see smarthome.ItemState
     * @generated
     */
    EClass getItemState();

    /**
     * Returns the meta object for the reference '{@link smarthome.ItemState#getItem <em>Item</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Item</em>'.
     * @see smarthome.ItemState#getItem()
     * @see #getItemState()
     * @generated
     */
    EReference getItemState_Item();

    /**
     * Returns the meta object for the containment reference '{@link smarthome.ItemState#getState <em>State</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>State</em>'.
     * @see smarthome.ItemState#getState()
     * @see #getItemState()
     * @generated
     */
    EReference getItemState_State();

    /**
     * Returns the meta object for class '{@link smarthome.Command <em>Command</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Command</em>'.
     * @see smarthome.Command
     * @generated
     */
    EClass getCommand();

    /**
     * Returns the meta object for the reference '{@link smarthome.Command#getItem <em>Item</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Item</em>'.
     * @see smarthome.Command#getItem()
     * @see #getCommand()
     * @generated
     */
    EReference getCommand_Item();

    /**
     * Returns the meta object for the attribute '{@link smarthome.Command#getCommand <em>Command</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Command</em>'.
     * @see smarthome.Command#getCommand()
     * @see #getCommand()
     * @generated
     */
    EAttribute getCommand_Command();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    SmarthomeFactory getSmarthomeFactory();

    /**
     * <!-- begin-user-doc -->
     * Defines literals for the meta objects that represent
     * <ul>
     *   <li>each class,</li>
     *   <li>each feature of each class,</li>
     *   <li>each operation of each class,</li>
     *   <li>each enum,</li>
     *   <li>and each data type</li>
     * </ul>
     * <!-- end-user-doc -->
     * @generated
     */
    interface Literals {
        /**
         * The meta object literal for the '{@link smarthome.impl.SmartHomeImpl <em>Smart Home</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see smarthome.impl.SmartHomeImpl
         * @see smarthome.impl.SmarthomePackageImpl#getSmartHome()
         * @generated
         */
        EClass SMART_HOME = eINSTANCE.getSmartHome();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SMART_HOME__NAME = eINSTANCE.getSmartHome_Name();

        /**
         * The meta object literal for the '<em><b>Items</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SMART_HOME__ITEMS = eINSTANCE.getSmartHome_Items();

        /**
         * The meta object literal for the '<em><b>Control</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SMART_HOME__CONTROL = eINSTANCE.getSmartHome_Control();

        /**
         * The meta object literal for the '{@link smarthome.impl.SwitchItemImpl <em>Switch Item</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see smarthome.impl.SwitchItemImpl
         * @see smarthome.impl.SmarthomePackageImpl#getSwitchItem()
         * @generated
         */
        EClass SWITCH_ITEM = eINSTANCE.getSwitchItem();

        /**
         * The meta object literal for the '{@link smarthome.Item <em>Item</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see smarthome.Item
         * @see smarthome.impl.SmarthomePackageImpl#getItem()
         * @generated
         */
        EClass ITEM = eINSTANCE.getItem();

        /**
         * The meta object literal for the '<em><b>State</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ITEM__STATE = eINSTANCE.getItem_State();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ITEM__NAME = eINSTANCE.getItem_Name();

        /**
         * The meta object literal for the '{@link smarthome.impl.ContactItemImpl <em>Contact Item</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see smarthome.impl.ContactItemImpl
         * @see smarthome.impl.SmarthomePackageImpl#getContactItem()
         * @generated
         */
        EClass CONTACT_ITEM = eINSTANCE.getContactItem();

        /**
         * The meta object literal for the '{@link smarthome.impl.StateImpl <em>State</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see smarthome.impl.StateImpl
         * @see smarthome.impl.SmarthomePackageImpl#getState()
         * @generated
         */
        EClass STATE = eINSTANCE.getState();

        /**
         * The meta object literal for the '<em><b>State</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute STATE__STATE = eINSTANCE.getState_State();

        /**
         * The meta object literal for the '{@link smarthome.impl.ItemBindingImpl <em>Item Binding</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see smarthome.impl.ItemBindingImpl
         * @see smarthome.impl.SmarthomePackageImpl#getItemBinding()
         * @generated
         */
        EClass ITEM_BINDING = eINSTANCE.getItemBinding();

        /**
         * The meta object literal for the '<em><b>Itemstate</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ITEM_BINDING__ITEMSTATE = eINSTANCE.getItemBinding_Itemstate();

        /**
         * The meta object literal for the '<em><b>Command</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ITEM_BINDING__COMMAND = eINSTANCE.getItemBinding_Command();

        /**
         * The meta object literal for the '{@link smarthome.impl.ItemStateImpl <em>Item State</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see smarthome.impl.ItemStateImpl
         * @see smarthome.impl.SmarthomePackageImpl#getItemState()
         * @generated
         */
        EClass ITEM_STATE = eINSTANCE.getItemState();

        /**
         * The meta object literal for the '<em><b>Item</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ITEM_STATE__ITEM = eINSTANCE.getItemState_Item();

        /**
         * The meta object literal for the '<em><b>State</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ITEM_STATE__STATE = eINSTANCE.getItemState_State();

        /**
         * The meta object literal for the '{@link smarthome.impl.CommandImpl <em>Command</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see smarthome.impl.CommandImpl
         * @see smarthome.impl.SmarthomePackageImpl#getCommand()
         * @generated
         */
        EClass COMMAND = eINSTANCE.getCommand();

        /**
         * The meta object literal for the '<em><b>Item</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference COMMAND__ITEM = eINSTANCE.getCommand_Item();

        /**
         * The meta object literal for the '<em><b>Command</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute COMMAND__COMMAND = eINSTANCE.getCommand_Command();

    }

} //SmarthomePackage
