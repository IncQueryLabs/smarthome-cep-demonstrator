/**
 */
package com.incquerylabs.smarthome.model.simple.smarthome;

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
 * @see com.incquerylabs.smarthome.model.simple.smarthome.SmarthomeFactory
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
    SmarthomePackage eINSTANCE = com.incquerylabs.smarthome.model.simple.smarthome.impl.SmarthomePackageImpl.init();

    /**
	 * The meta object id for the '{@link com.incquerylabs.smarthome.model.simple.smarthome.impl.SmartHomeImpl <em>Smart Home</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see com.incquerylabs.smarthome.model.simple.smarthome.impl.SmartHomeImpl
	 * @see com.incquerylabs.smarthome.model.simple.smarthome.impl.SmarthomePackageImpl#getSmartHome()
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
	 * The meta object id for the '{@link com.incquerylabs.smarthome.model.simple.smarthome.Item <em>Item</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see com.incquerylabs.smarthome.model.simple.smarthome.Item
	 * @see com.incquerylabs.smarthome.model.simple.smarthome.impl.SmarthomePackageImpl#getItem()
	 * @generated
	 */
    int ITEM = 1;

    /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ITEM__NAME = 0;

    /**
	 * The feature id for the '<em><b>States</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ITEM__STATES = 1;

    /**
	 * The feature id for the '<em><b>Accapted Commands</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ITEM__ACCAPTED_COMMANDS = 2;

    /**
	 * The number of structural features of the '<em>Item</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ITEM_FEATURE_COUNT = 3;

    /**
	 * The number of operations of the '<em>Item</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ITEM_OPERATION_COUNT = 0;

    /**
	 * The meta object id for the '{@link com.incquerylabs.smarthome.model.simple.smarthome.impl.ContactItemImpl <em>Contact Item</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see com.incquerylabs.smarthome.model.simple.smarthome.impl.ContactItemImpl
	 * @see com.incquerylabs.smarthome.model.simple.smarthome.impl.SmarthomePackageImpl#getContactItem()
	 * @generated
	 */
    int CONTACT_ITEM = 2;

    /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int CONTACT_ITEM__NAME = ITEM__NAME;

    /**
	 * The feature id for the '<em><b>States</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int CONTACT_ITEM__STATES = ITEM__STATES;

    /**
	 * The feature id for the '<em><b>Accapted Commands</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int CONTACT_ITEM__ACCAPTED_COMMANDS = ITEM__ACCAPTED_COMMANDS;

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
	 * The meta object id for the '{@link com.incquerylabs.smarthome.model.simple.smarthome.impl.StateImpl <em>State</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see com.incquerylabs.smarthome.model.simple.smarthome.impl.StateImpl
	 * @see com.incquerylabs.smarthome.model.simple.smarthome.impl.SmarthomePackageImpl#getState()
	 * @generated
	 */
    int STATE = 3;

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
	 * The meta object id for the '{@link com.incquerylabs.smarthome.model.simple.smarthome.impl.EvaluatingNodeImpl <em>Evaluating Node</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see com.incquerylabs.smarthome.model.simple.smarthome.impl.EvaluatingNodeImpl
	 * @see com.incquerylabs.smarthome.model.simple.smarthome.impl.SmarthomePackageImpl#getEvaluatingNode()
	 * @generated
	 */
    int EVALUATING_NODE = 4;

    /**
	 * The feature id for the '<em><b>Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int EVALUATING_NODE__EVENTS = 0;

    /**
	 * The feature id for the '<em><b>Commands</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int EVALUATING_NODE__COMMANDS = 1;

    /**
	 * The feature id for the '<em><b>Filters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int EVALUATING_NODE__FILTERS = 2;

    /**
	 * The number of structural features of the '<em>Evaluating Node</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int EVALUATING_NODE_FEATURE_COUNT = 3;

    /**
	 * The number of operations of the '<em>Evaluating Node</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int EVALUATING_NODE_OPERATION_COUNT = 0;

    /**
	 * The meta object id for the '{@link com.incquerylabs.smarthome.model.simple.smarthome.impl.CommandConnectionImpl <em>Command Connection</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see com.incquerylabs.smarthome.model.simple.smarthome.impl.CommandConnectionImpl
	 * @see com.incquerylabs.smarthome.model.simple.smarthome.impl.SmarthomePackageImpl#getCommandConnection()
	 * @generated
	 */
    int COMMAND_CONNECTION = 5;

    /**
	 * The feature id for the '<em><b>Item</b></em>' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int COMMAND_CONNECTION__ITEM = 0;

    /**
	 * The feature id for the '<em><b>Command</b></em>' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int COMMAND_CONNECTION__COMMAND = 1;

    /**
	 * The number of structural features of the '<em>Command Connection</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int COMMAND_CONNECTION_FEATURE_COUNT = 2;

    /**
	 * The number of operations of the '<em>Command Connection</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int COMMAND_CONNECTION_OPERATION_COUNT = 0;

    /**
	 * The meta object id for the '{@link com.incquerylabs.smarthome.model.simple.smarthome.impl.CommandImpl <em>Command</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see com.incquerylabs.smarthome.model.simple.smarthome.impl.CommandImpl
	 * @see com.incquerylabs.smarthome.model.simple.smarthome.impl.SmarthomePackageImpl#getCommand()
	 * @generated
	 */
    int COMMAND = 11;

    /**
	 * The meta object id for the '{@link com.incquerylabs.smarthome.model.simple.smarthome.impl.SwitchItemImpl <em>Switch Item</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see com.incquerylabs.smarthome.model.simple.smarthome.impl.SwitchItemImpl
	 * @see com.incquerylabs.smarthome.model.simple.smarthome.impl.SmarthomePackageImpl#getSwitchItem()
	 * @generated
	 */
    int SWITCH_ITEM = 6;

    /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SWITCH_ITEM__NAME = ITEM__NAME;

    /**
	 * The feature id for the '<em><b>States</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SWITCH_ITEM__STATES = ITEM__STATES;

    /**
	 * The feature id for the '<em><b>Accapted Commands</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SWITCH_ITEM__ACCAPTED_COMMANDS = ITEM__ACCAPTED_COMMANDS;

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
	 * The meta object id for the '{@link com.incquerylabs.smarthome.model.simple.smarthome.impl.StateChangeConnectionImpl <em>State Change Connection</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see com.incquerylabs.smarthome.model.simple.smarthome.impl.StateChangeConnectionImpl
	 * @see com.incquerylabs.smarthome.model.simple.smarthome.impl.SmarthomePackageImpl#getStateChangeConnection()
	 * @generated
	 */
    int STATE_CHANGE_CONNECTION = 7;

    /**
	 * The feature id for the '<em><b>New State</b></em>' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int STATE_CHANGE_CONNECTION__NEW_STATE = 0;

    /**
	 * The feature id for the '<em><b>Item</b></em>' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int STATE_CHANGE_CONNECTION__ITEM = 1;

    /**
	 * The number of structural features of the '<em>State Change Connection</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int STATE_CHANGE_CONNECTION_FEATURE_COUNT = 2;

    /**
	 * The number of operations of the '<em>State Change Connection</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int STATE_CHANGE_CONNECTION_OPERATION_COUNT = 0;

    /**
	 * The meta object id for the '{@link com.incquerylabs.smarthome.model.simple.smarthome.impl.FilterConnectionImpl <em>Filter Connection</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see com.incquerylabs.smarthome.model.simple.smarthome.impl.FilterConnectionImpl
	 * @see com.incquerylabs.smarthome.model.simple.smarthome.impl.SmarthomePackageImpl#getFilterConnection()
	 * @generated
	 */
    int FILTER_CONNECTION = 8;

    /**
	 * The feature id for the '<em><b>Required State</b></em>' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int FILTER_CONNECTION__REQUIRED_STATE = 0;

    /**
	 * The feature id for the '<em><b>Item</b></em>' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int FILTER_CONNECTION__ITEM = 1;

    /**
	 * The number of structural features of the '<em>Filter Connection</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int FILTER_CONNECTION_FEATURE_COUNT = 2;

    /**
	 * The number of operations of the '<em>Filter Connection</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int FILTER_CONNECTION_OPERATION_COUNT = 0;

    /**
	 * The meta object id for the '{@link com.incquerylabs.smarthome.model.simple.smarthome.impl.DimmerItemImpl <em>Dimmer Item</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see com.incquerylabs.smarthome.model.simple.smarthome.impl.DimmerItemImpl
	 * @see com.incquerylabs.smarthome.model.simple.smarthome.impl.SmarthomePackageImpl#getDimmerItem()
	 * @generated
	 */
    int DIMMER_ITEM = 9;

    /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int DIMMER_ITEM__NAME = ITEM__NAME;

    /**
	 * The feature id for the '<em><b>States</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int DIMMER_ITEM__STATES = ITEM__STATES;

    /**
	 * The feature id for the '<em><b>Accapted Commands</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int DIMMER_ITEM__ACCAPTED_COMMANDS = ITEM__ACCAPTED_COMMANDS;

    /**
	 * The number of structural features of the '<em>Dimmer Item</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int DIMMER_ITEM_FEATURE_COUNT = ITEM_FEATURE_COUNT + 0;

    /**
	 * The number of operations of the '<em>Dimmer Item</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int DIMMER_ITEM_OPERATION_COUNT = ITEM_OPERATION_COUNT + 0;

    /**
	 * The meta object id for the '{@link com.incquerylabs.smarthome.model.simple.smarthome.impl.NumberItemImpl <em>Number Item</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see com.incquerylabs.smarthome.model.simple.smarthome.impl.NumberItemImpl
	 * @see com.incquerylabs.smarthome.model.simple.smarthome.impl.SmarthomePackageImpl#getNumberItem()
	 * @generated
	 */
    int NUMBER_ITEM = 10;

    /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int NUMBER_ITEM__NAME = ITEM__NAME;

    /**
	 * The feature id for the '<em><b>States</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int NUMBER_ITEM__STATES = ITEM__STATES;

    /**
	 * The feature id for the '<em><b>Accapted Commands</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int NUMBER_ITEM__ACCAPTED_COMMANDS = ITEM__ACCAPTED_COMMANDS;

    /**
	 * The number of structural features of the '<em>Number Item</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int NUMBER_ITEM_FEATURE_COUNT = ITEM_FEATURE_COUNT + 0;

    /**
	 * The number of operations of the '<em>Number Item</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int NUMBER_ITEM_OPERATION_COUNT = ITEM_OPERATION_COUNT + 0;

    /**
	 * The feature id for the '<em><b>Command</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int COMMAND__COMMAND = 0;

    /**
	 * The number of structural features of the '<em>Command</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int COMMAND_FEATURE_COUNT = 1;

    /**
	 * The number of operations of the '<em>Command</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int COMMAND_OPERATION_COUNT = 0;


    /**
	 * Returns the meta object for class '{@link com.incquerylabs.smarthome.model.simple.smarthome.SmartHome <em>Smart Home</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Smart Home</em>'.
	 * @see com.incquerylabs.smarthome.model.simple.smarthome.SmartHome
	 * @generated
	 */
    EClass getSmartHome();

    /**
	 * Returns the meta object for the attribute '{@link com.incquerylabs.smarthome.model.simple.smarthome.SmartHome#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.incquerylabs.smarthome.model.simple.smarthome.SmartHome#getName()
	 * @see #getSmartHome()
	 * @generated
	 */
    EAttribute getSmartHome_Name();

    /**
	 * Returns the meta object for the containment reference list '{@link com.incquerylabs.smarthome.model.simple.smarthome.SmartHome#getItems <em>Items</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Items</em>'.
	 * @see com.incquerylabs.smarthome.model.simple.smarthome.SmartHome#getItems()
	 * @see #getSmartHome()
	 * @generated
	 */
    EReference getSmartHome_Items();

    /**
	 * Returns the meta object for the containment reference list '{@link com.incquerylabs.smarthome.model.simple.smarthome.SmartHome#getRules <em>Rules</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rules</em>'.
	 * @see com.incquerylabs.smarthome.model.simple.smarthome.SmartHome#getRules()
	 * @see #getSmartHome()
	 * @generated
	 */
    EReference getSmartHome_Rules();

    /**
	 * Returns the meta object for class '{@link com.incquerylabs.smarthome.model.simple.smarthome.Item <em>Item</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item</em>'.
	 * @see com.incquerylabs.smarthome.model.simple.smarthome.Item
	 * @generated
	 */
    EClass getItem();

    /**
	 * Returns the meta object for the attribute '{@link com.incquerylabs.smarthome.model.simple.smarthome.Item#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.incquerylabs.smarthome.model.simple.smarthome.Item#getName()
	 * @see #getItem()
	 * @generated
	 */
    EAttribute getItem_Name();

    /**
	 * Returns the meta object for the containment reference list '{@link com.incquerylabs.smarthome.model.simple.smarthome.Item#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>States</em>'.
	 * @see com.incquerylabs.smarthome.model.simple.smarthome.Item#getStates()
	 * @see #getItem()
	 * @generated
	 */
    EReference getItem_States();

    /**
	 * Returns the meta object for the containment reference list '{@link com.incquerylabs.smarthome.model.simple.smarthome.Item#getAccaptedCommands <em>Accapted Commands</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Accapted Commands</em>'.
	 * @see com.incquerylabs.smarthome.model.simple.smarthome.Item#getAccaptedCommands()
	 * @see #getItem()
	 * @generated
	 */
    EReference getItem_AccaptedCommands();

    /**
	 * Returns the meta object for class '{@link com.incquerylabs.smarthome.model.simple.smarthome.ContactItem <em>Contact Item</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contact Item</em>'.
	 * @see com.incquerylabs.smarthome.model.simple.smarthome.ContactItem
	 * @generated
	 */
    EClass getContactItem();

    /**
	 * Returns the meta object for class '{@link com.incquerylabs.smarthome.model.simple.smarthome.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State</em>'.
	 * @see com.incquerylabs.smarthome.model.simple.smarthome.State
	 * @generated
	 */
    EClass getState();

    /**
	 * Returns the meta object for the attribute '{@link com.incquerylabs.smarthome.model.simple.smarthome.State#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State</em>'.
	 * @see com.incquerylabs.smarthome.model.simple.smarthome.State#getState()
	 * @see #getState()
	 * @generated
	 */
    EAttribute getState_State();

    /**
	 * Returns the meta object for class '{@link com.incquerylabs.smarthome.model.simple.smarthome.EvaluatingNode <em>Evaluating Node</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Evaluating Node</em>'.
	 * @see com.incquerylabs.smarthome.model.simple.smarthome.EvaluatingNode
	 * @generated
	 */
    EClass getEvaluatingNode();

    /**
	 * Returns the meta object for the containment reference list '{@link com.incquerylabs.smarthome.model.simple.smarthome.EvaluatingNode#getEvents <em>Events</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Events</em>'.
	 * @see com.incquerylabs.smarthome.model.simple.smarthome.EvaluatingNode#getEvents()
	 * @see #getEvaluatingNode()
	 * @generated
	 */
    EReference getEvaluatingNode_Events();

    /**
	 * Returns the meta object for the containment reference list '{@link com.incquerylabs.smarthome.model.simple.smarthome.EvaluatingNode#getCommands <em>Commands</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Commands</em>'.
	 * @see com.incquerylabs.smarthome.model.simple.smarthome.EvaluatingNode#getCommands()
	 * @see #getEvaluatingNode()
	 * @generated
	 */
    EReference getEvaluatingNode_Commands();

    /**
	 * Returns the meta object for the containment reference list '{@link com.incquerylabs.smarthome.model.simple.smarthome.EvaluatingNode#getFilters <em>Filters</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Filters</em>'.
	 * @see com.incquerylabs.smarthome.model.simple.smarthome.EvaluatingNode#getFilters()
	 * @see #getEvaluatingNode()
	 * @generated
	 */
    EReference getEvaluatingNode_Filters();

    /**
	 * Returns the meta object for class '{@link com.incquerylabs.smarthome.model.simple.smarthome.CommandConnection <em>Command Connection</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Command Connection</em>'.
	 * @see com.incquerylabs.smarthome.model.simple.smarthome.CommandConnection
	 * @generated
	 */
    EClass getCommandConnection();

    /**
	 * Returns the meta object for the reference '{@link com.incquerylabs.smarthome.model.simple.smarthome.CommandConnection#getItem <em>Item</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Item</em>'.
	 * @see com.incquerylabs.smarthome.model.simple.smarthome.CommandConnection#getItem()
	 * @see #getCommandConnection()
	 * @generated
	 */
    EReference getCommandConnection_Item();

    /**
	 * Returns the meta object for the reference '{@link com.incquerylabs.smarthome.model.simple.smarthome.CommandConnection#getCommand <em>Command</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Command</em>'.
	 * @see com.incquerylabs.smarthome.model.simple.smarthome.CommandConnection#getCommand()
	 * @see #getCommandConnection()
	 * @generated
	 */
    EReference getCommandConnection_Command();

    /**
	 * Returns the meta object for class '{@link com.incquerylabs.smarthome.model.simple.smarthome.Command <em>Command</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Command</em>'.
	 * @see com.incquerylabs.smarthome.model.simple.smarthome.Command
	 * @generated
	 */
    EClass getCommand();

    /**
	 * Returns the meta object for the attribute '{@link com.incquerylabs.smarthome.model.simple.smarthome.Command#getCommand <em>Command</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Command</em>'.
	 * @see com.incquerylabs.smarthome.model.simple.smarthome.Command#getCommand()
	 * @see #getCommand()
	 * @generated
	 */
    EAttribute getCommand_Command();

    /**
	 * Returns the meta object for class '{@link com.incquerylabs.smarthome.model.simple.smarthome.SwitchItem <em>Switch Item</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Switch Item</em>'.
	 * @see com.incquerylabs.smarthome.model.simple.smarthome.SwitchItem
	 * @generated
	 */
    EClass getSwitchItem();

    /**
	 * Returns the meta object for class '{@link com.incquerylabs.smarthome.model.simple.smarthome.StateChangeConnection <em>State Change Connection</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State Change Connection</em>'.
	 * @see com.incquerylabs.smarthome.model.simple.smarthome.StateChangeConnection
	 * @generated
	 */
    EClass getStateChangeConnection();

    /**
	 * Returns the meta object for the reference '{@link com.incquerylabs.smarthome.model.simple.smarthome.StateChangeConnection#getNewState <em>New State</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>New State</em>'.
	 * @see com.incquerylabs.smarthome.model.simple.smarthome.StateChangeConnection#getNewState()
	 * @see #getStateChangeConnection()
	 * @generated
	 */
    EReference getStateChangeConnection_NewState();

    /**
	 * Returns the meta object for the reference '{@link com.incquerylabs.smarthome.model.simple.smarthome.StateChangeConnection#getItem <em>Item</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Item</em>'.
	 * @see com.incquerylabs.smarthome.model.simple.smarthome.StateChangeConnection#getItem()
	 * @see #getStateChangeConnection()
	 * @generated
	 */
    EReference getStateChangeConnection_Item();

    /**
	 * Returns the meta object for class '{@link com.incquerylabs.smarthome.model.simple.smarthome.FilterConnection <em>Filter Connection</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Filter Connection</em>'.
	 * @see com.incquerylabs.smarthome.model.simple.smarthome.FilterConnection
	 * @generated
	 */
    EClass getFilterConnection();

    /**
	 * Returns the meta object for the reference '{@link com.incquerylabs.smarthome.model.simple.smarthome.FilterConnection#getRequiredState <em>Required State</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Required State</em>'.
	 * @see com.incquerylabs.smarthome.model.simple.smarthome.FilterConnection#getRequiredState()
	 * @see #getFilterConnection()
	 * @generated
	 */
    EReference getFilterConnection_RequiredState();

    /**
	 * Returns the meta object for the reference '{@link com.incquerylabs.smarthome.model.simple.smarthome.FilterConnection#getItem <em>Item</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Item</em>'.
	 * @see com.incquerylabs.smarthome.model.simple.smarthome.FilterConnection#getItem()
	 * @see #getFilterConnection()
	 * @generated
	 */
    EReference getFilterConnection_Item();

    /**
	 * Returns the meta object for class '{@link com.incquerylabs.smarthome.model.simple.smarthome.DimmerItem <em>Dimmer Item</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dimmer Item</em>'.
	 * @see com.incquerylabs.smarthome.model.simple.smarthome.DimmerItem
	 * @generated
	 */
    EClass getDimmerItem();

    /**
	 * Returns the meta object for class '{@link com.incquerylabs.smarthome.model.simple.smarthome.NumberItem <em>Number Item</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Number Item</em>'.
	 * @see com.incquerylabs.smarthome.model.simple.smarthome.NumberItem
	 * @generated
	 */
    EClass getNumberItem();

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
		 * The meta object literal for the '{@link com.incquerylabs.smarthome.model.simple.smarthome.impl.SmartHomeImpl <em>Smart Home</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see com.incquerylabs.smarthome.model.simple.smarthome.impl.SmartHomeImpl
		 * @see com.incquerylabs.smarthome.model.simple.smarthome.impl.SmarthomePackageImpl#getSmartHome()
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
		 * The meta object literal for the '{@link com.incquerylabs.smarthome.model.simple.smarthome.Item <em>Item</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see com.incquerylabs.smarthome.model.simple.smarthome.Item
		 * @see com.incquerylabs.smarthome.model.simple.smarthome.impl.SmarthomePackageImpl#getItem()
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
		 * The meta object literal for the '<em><b>States</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference ITEM__STATES = eINSTANCE.getItem_States();

        /**
		 * The meta object literal for the '<em><b>Accapted Commands</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference ITEM__ACCAPTED_COMMANDS = eINSTANCE.getItem_AccaptedCommands();

        /**
		 * The meta object literal for the '{@link com.incquerylabs.smarthome.model.simple.smarthome.impl.ContactItemImpl <em>Contact Item</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see com.incquerylabs.smarthome.model.simple.smarthome.impl.ContactItemImpl
		 * @see com.incquerylabs.smarthome.model.simple.smarthome.impl.SmarthomePackageImpl#getContactItem()
		 * @generated
		 */
        EClass CONTACT_ITEM = eINSTANCE.getContactItem();

        /**
		 * The meta object literal for the '{@link com.incquerylabs.smarthome.model.simple.smarthome.impl.StateImpl <em>State</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see com.incquerylabs.smarthome.model.simple.smarthome.impl.StateImpl
		 * @see com.incquerylabs.smarthome.model.simple.smarthome.impl.SmarthomePackageImpl#getState()
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
		 * The meta object literal for the '{@link com.incquerylabs.smarthome.model.simple.smarthome.impl.EvaluatingNodeImpl <em>Evaluating Node</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see com.incquerylabs.smarthome.model.simple.smarthome.impl.EvaluatingNodeImpl
		 * @see com.incquerylabs.smarthome.model.simple.smarthome.impl.SmarthomePackageImpl#getEvaluatingNode()
		 * @generated
		 */
        EClass EVALUATING_NODE = eINSTANCE.getEvaluatingNode();

        /**
		 * The meta object literal for the '<em><b>Events</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference EVALUATING_NODE__EVENTS = eINSTANCE.getEvaluatingNode_Events();

        /**
		 * The meta object literal for the '<em><b>Commands</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference EVALUATING_NODE__COMMANDS = eINSTANCE.getEvaluatingNode_Commands();

        /**
		 * The meta object literal for the '<em><b>Filters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference EVALUATING_NODE__FILTERS = eINSTANCE.getEvaluatingNode_Filters();

        /**
		 * The meta object literal for the '{@link com.incquerylabs.smarthome.model.simple.smarthome.impl.CommandConnectionImpl <em>Command Connection</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see com.incquerylabs.smarthome.model.simple.smarthome.impl.CommandConnectionImpl
		 * @see com.incquerylabs.smarthome.model.simple.smarthome.impl.SmarthomePackageImpl#getCommandConnection()
		 * @generated
		 */
        EClass COMMAND_CONNECTION = eINSTANCE.getCommandConnection();

        /**
		 * The meta object literal for the '<em><b>Item</b></em>' reference feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference COMMAND_CONNECTION__ITEM = eINSTANCE.getCommandConnection_Item();

        /**
		 * The meta object literal for the '<em><b>Command</b></em>' reference feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference COMMAND_CONNECTION__COMMAND = eINSTANCE.getCommandConnection_Command();

        /**
		 * The meta object literal for the '{@link com.incquerylabs.smarthome.model.simple.smarthome.impl.CommandImpl <em>Command</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see com.incquerylabs.smarthome.model.simple.smarthome.impl.CommandImpl
		 * @see com.incquerylabs.smarthome.model.simple.smarthome.impl.SmarthomePackageImpl#getCommand()
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
		 * The meta object literal for the '{@link com.incquerylabs.smarthome.model.simple.smarthome.impl.SwitchItemImpl <em>Switch Item</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see com.incquerylabs.smarthome.model.simple.smarthome.impl.SwitchItemImpl
		 * @see com.incquerylabs.smarthome.model.simple.smarthome.impl.SmarthomePackageImpl#getSwitchItem()
		 * @generated
		 */
        EClass SWITCH_ITEM = eINSTANCE.getSwitchItem();

        /**
		 * The meta object literal for the '{@link com.incquerylabs.smarthome.model.simple.smarthome.impl.StateChangeConnectionImpl <em>State Change Connection</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see com.incquerylabs.smarthome.model.simple.smarthome.impl.StateChangeConnectionImpl
		 * @see com.incquerylabs.smarthome.model.simple.smarthome.impl.SmarthomePackageImpl#getStateChangeConnection()
		 * @generated
		 */
        EClass STATE_CHANGE_CONNECTION = eINSTANCE.getStateChangeConnection();

        /**
		 * The meta object literal for the '<em><b>New State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference STATE_CHANGE_CONNECTION__NEW_STATE = eINSTANCE.getStateChangeConnection_NewState();

        /**
		 * The meta object literal for the '<em><b>Item</b></em>' reference feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference STATE_CHANGE_CONNECTION__ITEM = eINSTANCE.getStateChangeConnection_Item();

        /**
		 * The meta object literal for the '{@link com.incquerylabs.smarthome.model.simple.smarthome.impl.FilterConnectionImpl <em>Filter Connection</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see com.incquerylabs.smarthome.model.simple.smarthome.impl.FilterConnectionImpl
		 * @see com.incquerylabs.smarthome.model.simple.smarthome.impl.SmarthomePackageImpl#getFilterConnection()
		 * @generated
		 */
        EClass FILTER_CONNECTION = eINSTANCE.getFilterConnection();

        /**
		 * The meta object literal for the '<em><b>Required State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference FILTER_CONNECTION__REQUIRED_STATE = eINSTANCE.getFilterConnection_RequiredState();

        /**
		 * The meta object literal for the '<em><b>Item</b></em>' reference feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference FILTER_CONNECTION__ITEM = eINSTANCE.getFilterConnection_Item();

        /**
		 * The meta object literal for the '{@link com.incquerylabs.smarthome.model.simple.smarthome.impl.DimmerItemImpl <em>Dimmer Item</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see com.incquerylabs.smarthome.model.simple.smarthome.impl.DimmerItemImpl
		 * @see com.incquerylabs.smarthome.model.simple.smarthome.impl.SmarthomePackageImpl#getDimmerItem()
		 * @generated
		 */
        EClass DIMMER_ITEM = eINSTANCE.getDimmerItem();

        /**
		 * The meta object literal for the '{@link com.incquerylabs.smarthome.model.simple.smarthome.impl.NumberItemImpl <em>Number Item</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see com.incquerylabs.smarthome.model.simple.smarthome.impl.NumberItemImpl
		 * @see com.incquerylabs.smarthome.model.simple.smarthome.impl.SmarthomePackageImpl#getNumberItem()
		 * @generated
		 */
        EClass NUMBER_ITEM = eINSTANCE.getNumberItem();

    }

} //SmarthomePackage
