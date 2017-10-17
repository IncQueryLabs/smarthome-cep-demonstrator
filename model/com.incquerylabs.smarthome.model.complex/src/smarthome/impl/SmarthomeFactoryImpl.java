/**
 */
package smarthome.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import smarthome.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SmarthomeFactoryImpl extends EFactoryImpl implements SmarthomeFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static SmarthomeFactory init() {
        try {
            SmarthomeFactory theSmarthomeFactory = (SmarthomeFactory)EPackage.Registry.INSTANCE.getEFactory(SmarthomePackage.eNS_URI);
            if (theSmarthomeFactory != null) {
                return theSmarthomeFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new SmarthomeFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SmarthomeFactoryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EObject create(EClass eClass) {
        switch (eClass.getClassifierID()) {
            case SmarthomePackage.SMART_HOME: return createSmartHome();
            case SmarthomePackage.COMMAND: return createCommand();
            case SmarthomePackage.ITEM_BINDING: return createItemBinding();
            case SmarthomePackage.SWITCH_ITEM: return createSwitchItem();
            case SmarthomePackage.CONTACT_ITEM: return createContactItem();
            case SmarthomePackage.ON_OFF_TYPE: return createOnOffType();
            case SmarthomePackage.OPEN_CLOSED_TYPE: return createOpenClosedType();
            case SmarthomePackage.NEW_ECLASS12: return createNewEClass12();
            case SmarthomePackage.CONDITION: return createCondition();
            default:
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object createFromString(EDataType eDataType, String initialValue) {
        switch (eDataType.getClassifierID()) {
            case SmarthomePackage.CONNECTION_TYPE:
                return createConnectionTypeFromString(eDataType, initialValue);
            case SmarthomePackage.OPEN_CLOSED:
                return createOpenClosedFromString(eDataType, initialValue);
            case SmarthomePackage.ON_OFF:
                return createOnOffFromString(eDataType, initialValue);
            default:
                throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String convertToString(EDataType eDataType, Object instanceValue) {
        switch (eDataType.getClassifierID()) {
            case SmarthomePackage.CONNECTION_TYPE:
                return convertConnectionTypeToString(eDataType, instanceValue);
            case SmarthomePackage.OPEN_CLOSED:
                return convertOpenClosedToString(eDataType, instanceValue);
            case SmarthomePackage.ON_OFF:
                return convertOnOffToString(eDataType, instanceValue);
            default:
                throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SmartHome createSmartHome() {
        SmartHomeImpl smartHome = new SmartHomeImpl();
        return smartHome;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Command createCommand() {
        CommandImpl command = new CommandImpl();
        return command;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ItemBinding createItemBinding() {
        ItemBindingImpl itemBinding = new ItemBindingImpl();
        return itemBinding;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SwitchItem createSwitchItem() {
        SwitchItemImpl switchItem = new SwitchItemImpl();
        return switchItem;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ContactItem createContactItem() {
        ContactItemImpl contactItem = new ContactItemImpl();
        return contactItem;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public OnOffType createOnOffType() {
        OnOffTypeImpl onOffType = new OnOffTypeImpl();
        return onOffType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public OpenClosedType createOpenClosedType() {
        OpenClosedTypeImpl openClosedType = new OpenClosedTypeImpl();
        return openClosedType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NewEClass12 createNewEClass12() {
        NewEClass12Impl newEClass12 = new NewEClass12Impl();
        return newEClass12;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Condition createCondition() {
        ConditionImpl condition = new ConditionImpl();
        return condition;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ConnectionType createConnectionTypeFromString(EDataType eDataType, String initialValue) {
        ConnectionType result = ConnectionType.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertConnectionTypeToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public OpenClosed createOpenClosedFromString(EDataType eDataType, String initialValue) {
        OpenClosed result = OpenClosed.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertOpenClosedToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public OnOff createOnOffFromString(EDataType eDataType, String initialValue) {
        OnOff result = OnOff.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertOnOffToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SmarthomePackage getSmarthomePackage() {
        return (SmarthomePackage)getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static SmarthomePackage getPackage() {
        return SmarthomePackage.eINSTANCE;
    }

} //SmarthomeFactoryImpl
