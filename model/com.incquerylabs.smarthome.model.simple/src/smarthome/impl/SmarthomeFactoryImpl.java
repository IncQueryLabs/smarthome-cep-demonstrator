/**
 */
package smarthome.impl;

import org.eclipse.emf.ecore.EClass;
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
            case SmarthomePackage.SWITCH_ITEM: return createSwitchItem();
            case SmarthomePackage.CONTACT_ITEM: return createContactItem();
            case SmarthomePackage.STATE: return createState();
            case SmarthomePackage.ITEM_BINDING: return createItemBinding();
            case SmarthomePackage.ITEM_STATE: return createItemState();
            case SmarthomePackage.COMMAND: return createCommand();
            default:
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
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
    public State createState() {
        StateImpl state = new StateImpl();
        return state;
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
    public ItemState createItemState() {
        ItemStateImpl itemState = new ItemStateImpl();
        return itemState;
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
