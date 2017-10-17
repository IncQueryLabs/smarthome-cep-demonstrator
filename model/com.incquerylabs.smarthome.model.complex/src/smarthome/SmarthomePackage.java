/**
 */
package smarthome;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
     * The meta object id for the '{@link smarthome.Item <em>Item</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see smarthome.Item
     * @see smarthome.impl.SmarthomePackageImpl#getItem()
     * @generated
     */
    int ITEM = 0;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ITEM__NAME = 0;

    /**
     * The number of structural features of the '<em>Item</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ITEM_FEATURE_COUNT = 1;

    /**
     * The number of operations of the '<em>Item</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ITEM_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link smarthome.impl.SmartHomeImpl <em>Smart Home</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see smarthome.impl.SmartHomeImpl
     * @see smarthome.impl.SmarthomePackageImpl#getSmartHome()
     * @generated
     */
    int SMART_HOME = 1;

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
     * The feature id for the '<em><b>Rules</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SMART_HOME__RULES = 2;

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
     * The meta object id for the '{@link smarthome.State <em>State</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see smarthome.State
     * @see smarthome.impl.SmarthomePackageImpl#getState()
     * @generated
     */
    int STATE = 2;

    /**
     * The number of structural features of the '<em>State</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATE_FEATURE_COUNT = 0;

    /**
     * The number of operations of the '<em>State</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATE_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link smarthome.impl.CommandImpl <em>Command</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see smarthome.impl.CommandImpl
     * @see smarthome.impl.SmarthomePackageImpl#getCommand()
     * @generated
     */
    int COMMAND = 3;

    /**
     * The feature id for the '<em><b>Command</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMAND__COMMAND = 0;

    /**
     * The feature id for the '<em><b>Item</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMAND__ITEM = 1;

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
     * The meta object id for the '{@link smarthome.impl.ItemBindingImpl <em>Item Binding</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see smarthome.impl.ItemBindingImpl
     * @see smarthome.impl.SmarthomePackageImpl#getItemBinding()
     * @generated
     */
    int ITEM_BINDING = 4;

    /**
     * The feature id for the '<em><b>Command</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ITEM_BINDING__COMMAND = 0;

    /**
     * The feature id for the '<em><b>Conditions</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ITEM_BINDING__CONDITIONS = 1;

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
     * The meta object id for the '{@link smarthome.impl.SwitchItemImpl <em>Switch Item</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see smarthome.impl.SwitchItemImpl
     * @see smarthome.impl.SmarthomePackageImpl#getSwitchItem()
     * @generated
     */
    int SWITCH_ITEM = 5;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SWITCH_ITEM__NAME = ITEM__NAME;

    /**
     * The feature id for the '<em><b>State</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SWITCH_ITEM__STATE = ITEM_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Switch Item</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SWITCH_ITEM_FEATURE_COUNT = ITEM_FEATURE_COUNT + 1;

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
    int CONTACT_ITEM = 6;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTACT_ITEM__NAME = ITEM__NAME;

    /**
     * The feature id for the '<em><b>State</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTACT_ITEM__STATE = ITEM_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Contact Item</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTACT_ITEM_FEATURE_COUNT = ITEM_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Contact Item</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTACT_ITEM_OPERATION_COUNT = ITEM_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link smarthome.impl.OnOffTypeImpl <em>On Off Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see smarthome.impl.OnOffTypeImpl
     * @see smarthome.impl.SmarthomePackageImpl#getOnOffType()
     * @generated
     */
    int ON_OFF_TYPE = 7;

    /**
     * The feature id for the '<em><b>State</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ON_OFF_TYPE__STATE = STATE_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>On Off Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ON_OFF_TYPE_FEATURE_COUNT = STATE_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>On Off Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ON_OFF_TYPE_OPERATION_COUNT = STATE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link smarthome.impl.OpenClosedTypeImpl <em>Open Closed Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see smarthome.impl.OpenClosedTypeImpl
     * @see smarthome.impl.SmarthomePackageImpl#getOpenClosedType()
     * @generated
     */
    int OPEN_CLOSED_TYPE = 8;

    /**
     * The feature id for the '<em><b>State</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPEN_CLOSED_TYPE__STATE = STATE_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Open Closed Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPEN_CLOSED_TYPE_FEATURE_COUNT = STATE_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Open Closed Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPEN_CLOSED_TYPE_OPERATION_COUNT = STATE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link smarthome.impl.NewEClass12Impl <em>New EClass12</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see smarthome.impl.NewEClass12Impl
     * @see smarthome.impl.SmarthomePackageImpl#getNewEClass12()
     * @generated
     */
    int NEW_ECLASS12 = 9;

    /**
     * The number of structural features of the '<em>New EClass12</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NEW_ECLASS12_FEATURE_COUNT = 0;

    /**
     * The number of operations of the '<em>New EClass12</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NEW_ECLASS12_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link smarthome.impl.ConditionImpl <em>Condition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see smarthome.impl.ConditionImpl
     * @see smarthome.impl.SmarthomePackageImpl#getCondition()
     * @generated
     */
    int CONDITION = 10;

    /**
     * The feature id for the '<em><b>Connection Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITION__CONNECTION_TYPE = 0;

    /**
     * The feature id for the '<em><b>State</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITION__STATE = 1;

    /**
     * The feature id for the '<em><b>Item</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITION__ITEM = 2;

    /**
     * The number of structural features of the '<em>Condition</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITION_FEATURE_COUNT = 3;

    /**
     * The number of operations of the '<em>Condition</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITION_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link smarthome.ConnectionType <em>Connection Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see smarthome.ConnectionType
     * @see smarthome.impl.SmarthomePackageImpl#getConnectionType()
     * @generated
     */
    int CONNECTION_TYPE = 11;

    /**
     * The meta object id for the '{@link smarthome.OpenClosed <em>Open Closed</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see smarthome.OpenClosed
     * @see smarthome.impl.SmarthomePackageImpl#getOpenClosed()
     * @generated
     */
    int OPEN_CLOSED = 12;

    /**
     * The meta object id for the '{@link smarthome.OnOff <em>On Off</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see smarthome.OnOff
     * @see smarthome.impl.SmarthomePackageImpl#getOnOff()
     * @generated
     */
    int ON_OFF = 13;


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
     * Returns the meta object for the containment reference list '{@link smarthome.SmartHome#getRules <em>Rules</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Rules</em>'.
     * @see smarthome.SmartHome#getRules()
     * @see #getSmartHome()
     * @generated
     */
    EReference getSmartHome_Rules();

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
     * Returns the meta object for class '{@link smarthome.Command <em>Command</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Command</em>'.
     * @see smarthome.Command
     * @generated
     */
    EClass getCommand();

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
     * Returns the meta object for the reference list '{@link smarthome.Command#getItem <em>Item</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Item</em>'.
     * @see smarthome.Command#getItem()
     * @see #getCommand()
     * @generated
     */
    EReference getCommand_Item();

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
     * Returns the meta object for the containment reference list '{@link smarthome.ItemBinding#getConditions <em>Conditions</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Conditions</em>'.
     * @see smarthome.ItemBinding#getConditions()
     * @see #getItemBinding()
     * @generated
     */
    EReference getItemBinding_Conditions();

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
     * Returns the meta object for the containment reference '{@link smarthome.SwitchItem#getState <em>State</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>State</em>'.
     * @see smarthome.SwitchItem#getState()
     * @see #getSwitchItem()
     * @generated
     */
    EReference getSwitchItem_State();

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
     * Returns the meta object for the containment reference '{@link smarthome.ContactItem#getState <em>State</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>State</em>'.
     * @see smarthome.ContactItem#getState()
     * @see #getContactItem()
     * @generated
     */
    EReference getContactItem_State();

    /**
     * Returns the meta object for class '{@link smarthome.OnOffType <em>On Off Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>On Off Type</em>'.
     * @see smarthome.OnOffType
     * @generated
     */
    EClass getOnOffType();

    /**
     * Returns the meta object for the attribute '{@link smarthome.OnOffType#getState <em>State</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>State</em>'.
     * @see smarthome.OnOffType#getState()
     * @see #getOnOffType()
     * @generated
     */
    EAttribute getOnOffType_State();

    /**
     * Returns the meta object for class '{@link smarthome.OpenClosedType <em>Open Closed Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Open Closed Type</em>'.
     * @see smarthome.OpenClosedType
     * @generated
     */
    EClass getOpenClosedType();

    /**
     * Returns the meta object for the attribute '{@link smarthome.OpenClosedType#getState <em>State</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>State</em>'.
     * @see smarthome.OpenClosedType#getState()
     * @see #getOpenClosedType()
     * @generated
     */
    EAttribute getOpenClosedType_State();

    /**
     * Returns the meta object for class '{@link smarthome.NewEClass12 <em>New EClass12</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>New EClass12</em>'.
     * @see smarthome.NewEClass12
     * @generated
     */
    EClass getNewEClass12();

    /**
     * Returns the meta object for class '{@link smarthome.Condition <em>Condition</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Condition</em>'.
     * @see smarthome.Condition
     * @generated
     */
    EClass getCondition();

    /**
     * Returns the meta object for the attribute '{@link smarthome.Condition#getConnectionType <em>Connection Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Connection Type</em>'.
     * @see smarthome.Condition#getConnectionType()
     * @see #getCondition()
     * @generated
     */
    EAttribute getCondition_ConnectionType();

    /**
     * Returns the meta object for the containment reference '{@link smarthome.Condition#getState <em>State</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>State</em>'.
     * @see smarthome.Condition#getState()
     * @see #getCondition()
     * @generated
     */
    EReference getCondition_State();

    /**
     * Returns the meta object for the reference '{@link smarthome.Condition#getItem <em>Item</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Item</em>'.
     * @see smarthome.Condition#getItem()
     * @see #getCondition()
     * @generated
     */
    EReference getCondition_Item();

    /**
     * Returns the meta object for enum '{@link smarthome.ConnectionType <em>Connection Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Connection Type</em>'.
     * @see smarthome.ConnectionType
     * @generated
     */
    EEnum getConnectionType();

    /**
     * Returns the meta object for enum '{@link smarthome.OpenClosed <em>Open Closed</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Open Closed</em>'.
     * @see smarthome.OpenClosed
     * @generated
     */
    EEnum getOpenClosed();

    /**
     * Returns the meta object for enum '{@link smarthome.OnOff <em>On Off</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>On Off</em>'.
     * @see smarthome.OnOff
     * @generated
     */
    EEnum getOnOff();

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
         * The meta object literal for the '{@link smarthome.Item <em>Item</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see smarthome.Item
         * @see smarthome.impl.SmarthomePackageImpl#getItem()
         * @generated
         */
        EClass ITEM = eINSTANCE.getItem();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ITEM__NAME = eINSTANCE.getItem_Name();

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
         * The meta object literal for the '<em><b>Rules</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SMART_HOME__RULES = eINSTANCE.getSmartHome_Rules();

        /**
         * The meta object literal for the '{@link smarthome.State <em>State</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see smarthome.State
         * @see smarthome.impl.SmarthomePackageImpl#getState()
         * @generated
         */
        EClass STATE = eINSTANCE.getState();

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
         * The meta object literal for the '<em><b>Command</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute COMMAND__COMMAND = eINSTANCE.getCommand_Command();

        /**
         * The meta object literal for the '<em><b>Item</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference COMMAND__ITEM = eINSTANCE.getCommand_Item();

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
         * The meta object literal for the '<em><b>Command</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ITEM_BINDING__COMMAND = eINSTANCE.getItemBinding_Command();

        /**
         * The meta object literal for the '<em><b>Conditions</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ITEM_BINDING__CONDITIONS = eINSTANCE.getItemBinding_Conditions();

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
         * The meta object literal for the '<em><b>State</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SWITCH_ITEM__STATE = eINSTANCE.getSwitchItem_State();

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
         * The meta object literal for the '<em><b>State</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CONTACT_ITEM__STATE = eINSTANCE.getContactItem_State();

        /**
         * The meta object literal for the '{@link smarthome.impl.OnOffTypeImpl <em>On Off Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see smarthome.impl.OnOffTypeImpl
         * @see smarthome.impl.SmarthomePackageImpl#getOnOffType()
         * @generated
         */
        EClass ON_OFF_TYPE = eINSTANCE.getOnOffType();

        /**
         * The meta object literal for the '<em><b>State</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ON_OFF_TYPE__STATE = eINSTANCE.getOnOffType_State();

        /**
         * The meta object literal for the '{@link smarthome.impl.OpenClosedTypeImpl <em>Open Closed Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see smarthome.impl.OpenClosedTypeImpl
         * @see smarthome.impl.SmarthomePackageImpl#getOpenClosedType()
         * @generated
         */
        EClass OPEN_CLOSED_TYPE = eINSTANCE.getOpenClosedType();

        /**
         * The meta object literal for the '<em><b>State</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute OPEN_CLOSED_TYPE__STATE = eINSTANCE.getOpenClosedType_State();

        /**
         * The meta object literal for the '{@link smarthome.impl.NewEClass12Impl <em>New EClass12</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see smarthome.impl.NewEClass12Impl
         * @see smarthome.impl.SmarthomePackageImpl#getNewEClass12()
         * @generated
         */
        EClass NEW_ECLASS12 = eINSTANCE.getNewEClass12();

        /**
         * The meta object literal for the '{@link smarthome.impl.ConditionImpl <em>Condition</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see smarthome.impl.ConditionImpl
         * @see smarthome.impl.SmarthomePackageImpl#getCondition()
         * @generated
         */
        EClass CONDITION = eINSTANCE.getCondition();

        /**
         * The meta object literal for the '<em><b>Connection Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CONDITION__CONNECTION_TYPE = eINSTANCE.getCondition_ConnectionType();

        /**
         * The meta object literal for the '<em><b>State</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CONDITION__STATE = eINSTANCE.getCondition_State();

        /**
         * The meta object literal for the '<em><b>Item</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CONDITION__ITEM = eINSTANCE.getCondition_Item();

        /**
         * The meta object literal for the '{@link smarthome.ConnectionType <em>Connection Type</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see smarthome.ConnectionType
         * @see smarthome.impl.SmarthomePackageImpl#getConnectionType()
         * @generated
         */
        EEnum CONNECTION_TYPE = eINSTANCE.getConnectionType();

        /**
         * The meta object literal for the '{@link smarthome.OpenClosed <em>Open Closed</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see smarthome.OpenClosed
         * @see smarthome.impl.SmarthomePackageImpl#getOpenClosed()
         * @generated
         */
        EEnum OPEN_CLOSED = eINSTANCE.getOpenClosed();

        /**
         * The meta object literal for the '{@link smarthome.OnOff <em>On Off</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see smarthome.OnOff
         * @see smarthome.impl.SmarthomePackageImpl#getOnOff()
         * @generated
         */
        EEnum ON_OFF = eINSTANCE.getOnOff();

    }

} //SmarthomePackage
