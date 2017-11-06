/**
 */
package com.incquerylabs.smarthome.model.simple.smarthome.impl;

import com.incquerylabs.smarthome.model.simple.smarthome.Command;
import com.incquerylabs.smarthome.model.simple.smarthome.CommandConnection;
import com.incquerylabs.smarthome.model.simple.smarthome.ContactItem;
import com.incquerylabs.smarthome.model.simple.smarthome.DimmerItem;
import com.incquerylabs.smarthome.model.simple.smarthome.EvaluatingNode;
import com.incquerylabs.smarthome.model.simple.smarthome.FilterConnection;
import com.incquerylabs.smarthome.model.simple.smarthome.Item;
import com.incquerylabs.smarthome.model.simple.smarthome.NumberItem;
import com.incquerylabs.smarthome.model.simple.smarthome.SmartHome;
import com.incquerylabs.smarthome.model.simple.smarthome.SmarthomeFactory;
import com.incquerylabs.smarthome.model.simple.smarthome.SmarthomePackage;
import com.incquerylabs.smarthome.model.simple.smarthome.State;
import com.incquerylabs.smarthome.model.simple.smarthome.StateChangeConnection;
import com.incquerylabs.smarthome.model.simple.smarthome.SwitchItem;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SmarthomePackageImpl extends EPackageImpl implements SmarthomePackage {
    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass smartHomeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass itemEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass contactItemEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass stateEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass evaluatingNodeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass commandConnectionEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass commandEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass switchItemEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass stateChangeConnectionEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass filterConnectionEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass dimmerItemEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass numberItemEClass = null;

    /**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see com.incquerylabs.smarthome.model.simple.smarthome.SmarthomePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
    private SmarthomePackageImpl() {
		super(eNS_URI, SmarthomeFactory.eINSTANCE);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private static boolean isInited = false;

    /**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link SmarthomePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
    public static SmarthomePackage init() {
		if (isInited) return (SmarthomePackage)EPackage.Registry.INSTANCE.getEPackage(SmarthomePackage.eNS_URI);

		// Obtain or create and register package
		SmarthomePackageImpl theSmarthomePackage = (SmarthomePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SmarthomePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SmarthomePackageImpl());

		isInited = true;

		// Create package meta-data objects
		theSmarthomePackage.createPackageContents();

		// Initialize created meta-data
		theSmarthomePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSmarthomePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SmarthomePackage.eNS_URI, theSmarthomePackage);
		return theSmarthomePackage;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getSmartHome() {
		return smartHomeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getSmartHome_Name() {
		return (EAttribute)smartHomeEClass.getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getSmartHome_Items() {
		return (EReference)smartHomeEClass.getEStructuralFeatures().get(1);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getSmartHome_Rules() {
		return (EReference)smartHomeEClass.getEStructuralFeatures().get(2);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getItem() {
		return itemEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getItem_Name() {
		return (EAttribute)itemEClass.getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getItem_States() {
		return (EReference)itemEClass.getEStructuralFeatures().get(1);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getItem_AccaptedCommands() {
		return (EReference)itemEClass.getEStructuralFeatures().get(2);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getContactItem() {
		return contactItemEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getState() {
		return stateEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getState_State() {
		return (EAttribute)stateEClass.getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getEvaluatingNode() {
		return evaluatingNodeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getEvaluatingNode_Events() {
		return (EReference)evaluatingNodeEClass.getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getEvaluatingNode_Commands() {
		return (EReference)evaluatingNodeEClass.getEStructuralFeatures().get(1);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getEvaluatingNode_Filters() {
		return (EReference)evaluatingNodeEClass.getEStructuralFeatures().get(2);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getCommandConnection() {
		return commandConnectionEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getCommandConnection_Item() {
		return (EReference)commandConnectionEClass.getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getCommandConnection_Command() {
		return (EReference)commandConnectionEClass.getEStructuralFeatures().get(1);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getCommand() {
		return commandEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getCommand_Command() {
		return (EAttribute)commandEClass.getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getSwitchItem() {
		return switchItemEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getStateChangeConnection() {
		return stateChangeConnectionEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getStateChangeConnection_NewState() {
		return (EReference)stateChangeConnectionEClass.getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getStateChangeConnection_Item() {
		return (EReference)stateChangeConnectionEClass.getEStructuralFeatures().get(1);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getFilterConnection() {
		return filterConnectionEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getFilterConnection_RequiredState() {
		return (EReference)filterConnectionEClass.getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getFilterConnection_Item() {
		return (EReference)filterConnectionEClass.getEStructuralFeatures().get(1);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getDimmerItem() {
		return dimmerItemEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getNumberItem() {
		return numberItemEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public SmarthomeFactory getSmarthomeFactory() {
		return (SmarthomeFactory)getEFactoryInstance();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private boolean isCreated = false;

    /**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		smartHomeEClass = createEClass(SMART_HOME);
		createEAttribute(smartHomeEClass, SMART_HOME__NAME);
		createEReference(smartHomeEClass, SMART_HOME__ITEMS);
		createEReference(smartHomeEClass, SMART_HOME__RULES);

		itemEClass = createEClass(ITEM);
		createEAttribute(itemEClass, ITEM__NAME);
		createEReference(itemEClass, ITEM__STATES);
		createEReference(itemEClass, ITEM__ACCAPTED_COMMANDS);

		contactItemEClass = createEClass(CONTACT_ITEM);

		stateEClass = createEClass(STATE);
		createEAttribute(stateEClass, STATE__STATE);

		evaluatingNodeEClass = createEClass(EVALUATING_NODE);
		createEReference(evaluatingNodeEClass, EVALUATING_NODE__EVENTS);
		createEReference(evaluatingNodeEClass, EVALUATING_NODE__COMMANDS);
		createEReference(evaluatingNodeEClass, EVALUATING_NODE__FILTERS);

		commandConnectionEClass = createEClass(COMMAND_CONNECTION);
		createEReference(commandConnectionEClass, COMMAND_CONNECTION__ITEM);
		createEReference(commandConnectionEClass, COMMAND_CONNECTION__COMMAND);

		switchItemEClass = createEClass(SWITCH_ITEM);

		stateChangeConnectionEClass = createEClass(STATE_CHANGE_CONNECTION);
		createEReference(stateChangeConnectionEClass, STATE_CHANGE_CONNECTION__NEW_STATE);
		createEReference(stateChangeConnectionEClass, STATE_CHANGE_CONNECTION__ITEM);

		filterConnectionEClass = createEClass(FILTER_CONNECTION);
		createEReference(filterConnectionEClass, FILTER_CONNECTION__REQUIRED_STATE);
		createEReference(filterConnectionEClass, FILTER_CONNECTION__ITEM);

		dimmerItemEClass = createEClass(DIMMER_ITEM);

		numberItemEClass = createEClass(NUMBER_ITEM);

		commandEClass = createEClass(COMMAND);
		createEAttribute(commandEClass, COMMAND__COMMAND);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private boolean isInitialized = false;

    /**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		contactItemEClass.getESuperTypes().add(this.getItem());
		switchItemEClass.getESuperTypes().add(this.getItem());
		dimmerItemEClass.getESuperTypes().add(this.getItem());
		numberItemEClass.getESuperTypes().add(this.getItem());

		// Initialize classes, features, and operations; add parameters
		initEClass(smartHomeEClass, SmartHome.class, "SmartHome", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSmartHome_Name(), ecorePackage.getEString(), "name", null, 0, 1, SmartHome.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSmartHome_Items(), this.getItem(), null, "items", null, 0, -1, SmartHome.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSmartHome_Rules(), this.getEvaluatingNode(), null, "rules", null, 0, -1, SmartHome.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(itemEClass, Item.class, "Item", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getItem_Name(), ecorePackage.getEString(), "name", null, 0, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getItem_States(), this.getState(), null, "states", null, 0, -1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getItem_AccaptedCommands(), this.getCommand(), null, "accaptedCommands", null, 0, -1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(contactItemEClass, ContactItem.class, "ContactItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(stateEClass, State.class, "State", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getState_State(), ecorePackage.getEString(), "state", null, 0, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(evaluatingNodeEClass, EvaluatingNode.class, "EvaluatingNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEvaluatingNode_Events(), this.getStateChangeConnection(), null, "events", null, 1, -1, EvaluatingNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEvaluatingNode_Commands(), this.getCommandConnection(), null, "commands", null, 1, -1, EvaluatingNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEvaluatingNode_Filters(), this.getFilterConnection(), null, "filters", null, 0, -1, EvaluatingNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(commandConnectionEClass, CommandConnection.class, "CommandConnection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCommandConnection_Item(), this.getItem(), null, "item", null, 1, 1, CommandConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCommandConnection_Command(), this.getCommand(), null, "command", null, 1, 1, CommandConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(switchItemEClass, SwitchItem.class, "SwitchItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(stateChangeConnectionEClass, StateChangeConnection.class, "StateChangeConnection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStateChangeConnection_NewState(), this.getState(), null, "newState", null, 1, 1, StateChangeConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStateChangeConnection_Item(), this.getItem(), null, "item", null, 1, 1, StateChangeConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(filterConnectionEClass, FilterConnection.class, "FilterConnection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFilterConnection_RequiredState(), this.getState(), null, "requiredState", null, 1, 1, FilterConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFilterConnection_Item(), this.getItem(), null, "item", null, 1, 1, FilterConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dimmerItemEClass, DimmerItem.class, "DimmerItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(numberItemEClass, NumberItem.class, "NumberItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(commandEClass, Command.class, "Command", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCommand_Command(), ecorePackage.getEString(), "command", null, 0, 1, Command.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //SmarthomePackageImpl
