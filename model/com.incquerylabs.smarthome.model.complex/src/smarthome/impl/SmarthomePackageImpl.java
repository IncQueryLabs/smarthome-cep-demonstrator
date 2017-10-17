/**
 */
package smarthome.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import smarthome.Command;
import smarthome.Condition;
import smarthome.ConnectionType;
import smarthome.ContactItem;
import smarthome.Item;
import smarthome.ItemBinding;
import smarthome.NewEClass12;
import smarthome.OnOff;
import smarthome.OnOffType;
import smarthome.OpenClosed;
import smarthome.OpenClosedType;
import smarthome.SmartHome;
import smarthome.SmarthomeFactory;
import smarthome.SmarthomePackage;
import smarthome.State;
import smarthome.SwitchItem;

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
    private EClass itemEClass = null;

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
    private EClass stateEClass = null;

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
    private EClass itemBindingEClass = null;

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
    private EClass contactItemEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass onOffTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass openClosedTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass newEClass12EClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass conditionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum connectionTypeEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum openClosedEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum onOffEEnum = null;

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
     * @see smarthome.SmarthomePackage#eNS_URI
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
    public EClass getState() {
        return stateEClass;
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
    public EReference getCommand_Item() {
        return (EReference)commandEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getItemBinding() {
        return itemBindingEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getItemBinding_Command() {
        return (EReference)itemBindingEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getItemBinding_Conditions() {
        return (EReference)itemBindingEClass.getEStructuralFeatures().get(1);
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
    public EReference getSwitchItem_State() {
        return (EReference)switchItemEClass.getEStructuralFeatures().get(0);
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
    public EReference getContactItem_State() {
        return (EReference)contactItemEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getOnOffType() {
        return onOffTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getOnOffType_State() {
        return (EAttribute)onOffTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getOpenClosedType() {
        return openClosedTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getOpenClosedType_State() {
        return (EAttribute)openClosedTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getNewEClass12() {
        return newEClass12EClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getCondition() {
        return conditionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCondition_ConnectionType() {
        return (EAttribute)conditionEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getCondition_State() {
        return (EReference)conditionEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getCondition_Item() {
        return (EReference)conditionEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getConnectionType() {
        return connectionTypeEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getOpenClosed() {
        return openClosedEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getOnOff() {
        return onOffEEnum;
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
        itemEClass = createEClass(ITEM);
        createEAttribute(itemEClass, ITEM__NAME);

        smartHomeEClass = createEClass(SMART_HOME);
        createEAttribute(smartHomeEClass, SMART_HOME__NAME);
        createEReference(smartHomeEClass, SMART_HOME__ITEMS);
        createEReference(smartHomeEClass, SMART_HOME__RULES);

        stateEClass = createEClass(STATE);

        commandEClass = createEClass(COMMAND);
        createEAttribute(commandEClass, COMMAND__COMMAND);
        createEReference(commandEClass, COMMAND__ITEM);

        itemBindingEClass = createEClass(ITEM_BINDING);
        createEReference(itemBindingEClass, ITEM_BINDING__COMMAND);
        createEReference(itemBindingEClass, ITEM_BINDING__CONDITIONS);

        switchItemEClass = createEClass(SWITCH_ITEM);
        createEReference(switchItemEClass, SWITCH_ITEM__STATE);

        contactItemEClass = createEClass(CONTACT_ITEM);
        createEReference(contactItemEClass, CONTACT_ITEM__STATE);

        onOffTypeEClass = createEClass(ON_OFF_TYPE);
        createEAttribute(onOffTypeEClass, ON_OFF_TYPE__STATE);

        openClosedTypeEClass = createEClass(OPEN_CLOSED_TYPE);
        createEAttribute(openClosedTypeEClass, OPEN_CLOSED_TYPE__STATE);

        newEClass12EClass = createEClass(NEW_ECLASS12);

        conditionEClass = createEClass(CONDITION);
        createEAttribute(conditionEClass, CONDITION__CONNECTION_TYPE);
        createEReference(conditionEClass, CONDITION__STATE);
        createEReference(conditionEClass, CONDITION__ITEM);

        // Create enums
        connectionTypeEEnum = createEEnum(CONNECTION_TYPE);
        openClosedEEnum = createEEnum(OPEN_CLOSED);
        onOffEEnum = createEEnum(ON_OFF);
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
        switchItemEClass.getESuperTypes().add(this.getItem());
        contactItemEClass.getESuperTypes().add(this.getItem());
        onOffTypeEClass.getESuperTypes().add(this.getState());
        openClosedTypeEClass.getESuperTypes().add(this.getState());

        // Initialize classes, features, and operations; add parameters
        initEClass(itemEClass, Item.class, "Item", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getItem_Name(), ecorePackage.getEString(), "name", null, 0, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(smartHomeEClass, SmartHome.class, "SmartHome", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getSmartHome_Name(), ecorePackage.getEString(), "name", null, 0, 1, SmartHome.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getSmartHome_Items(), this.getItem(), null, "items", null, 0, -1, SmartHome.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getSmartHome_Rules(), this.getItemBinding(), null, "rules", null, 0, -1, SmartHome.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(stateEClass, State.class, "State", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(commandEClass, Command.class, "Command", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getCommand_Command(), ecorePackage.getEString(), "command", null, 0, 1, Command.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getCommand_Item(), this.getItem(), null, "item", null, 1, -1, Command.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(itemBindingEClass, ItemBinding.class, "ItemBinding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getItemBinding_Command(), this.getCommand(), null, "command", null, 1, 1, ItemBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getItemBinding_Conditions(), this.getCondition(), null, "conditions", null, 1, -1, ItemBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(switchItemEClass, SwitchItem.class, "SwitchItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getSwitchItem_State(), this.getOnOffType(), null, "state", null, 1, 1, SwitchItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(contactItemEClass, ContactItem.class, "ContactItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getContactItem_State(), this.getOpenClosedType(), null, "state", null, 1, 1, ContactItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(onOffTypeEClass, OnOffType.class, "OnOffType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getOnOffType_State(), this.getOnOff(), "state", null, 0, 1, OnOffType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(openClosedTypeEClass, OpenClosedType.class, "OpenClosedType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getOpenClosedType_State(), this.getOpenClosed(), "state", null, 0, 1, OpenClosedType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(newEClass12EClass, NewEClass12.class, "NewEClass12", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(conditionEClass, Condition.class, "Condition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getCondition_ConnectionType(), this.getConnectionType(), "connectionType", null, 0, 1, Condition.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getCondition_State(), this.getState(), null, "state", null, 1, 1, Condition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getCondition_Item(), this.getItem(), null, "item", null, 1, 1, Condition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        // Initialize enums and add enum literals
        initEEnum(connectionTypeEEnum, ConnectionType.class, "ConnectionType");
        addEEnumLiteral(connectionTypeEEnum, ConnectionType.STATE_CHANGE);
        addEEnumLiteral(connectionTypeEEnum, ConnectionType.CURRENT);

        initEEnum(openClosedEEnum, OpenClosed.class, "OpenClosed");
        addEEnumLiteral(openClosedEEnum, OpenClosed.OPEN);
        addEEnumLiteral(openClosedEEnum, OpenClosed.CLOSED);

        initEEnum(onOffEEnum, OnOff.class, "OnOff");
        addEEnumLiteral(onOffEEnum, OnOff.ON);
        addEEnumLiteral(onOffEEnum, OnOff.OFF);

        // Create resource
        createResource(eNS_URI);
    }

} //SmarthomePackageImpl
