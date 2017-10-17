/**
 */
package com.incquerylabs.smarthome.model.simple.smarthome.impl;

import com.incquerylabs.smarthome.model.simple.smarthome.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

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
            case SmarthomePackage.CONTACT_ITEM: return createContactItem();
            case SmarthomePackage.STATE: return createState();
            case SmarthomePackage.EVALUATING_NODE: return createEvaluatingNode();
            case SmarthomePackage.COMMAND: return createCommand();
            case SmarthomePackage.SWITCH_ITEM: return createSwitchItem();
            case SmarthomePackage.STATE_CHANGE_CONNECTION: return createStateChangeConnection();
            case SmarthomePackage.FILTER_CONNECTION: return createFilterConnection();
            case SmarthomePackage.DIMMER_ITEM: return createDimmerItem();
            case SmarthomePackage.NUMBER_ITEM: return createNumberItem();
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
    public EvaluatingNode createEvaluatingNode() {
        EvaluatingNodeImpl evaluatingNode = new EvaluatingNodeImpl();
        return evaluatingNode;
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
    public SwitchItem createSwitchItem() {
        SwitchItemImpl switchItem = new SwitchItemImpl();
        return switchItem;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public StateChangeConnection createStateChangeConnection() {
        StateChangeConnectionImpl stateChangeConnection = new StateChangeConnectionImpl();
        return stateChangeConnection;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FilterConnection createFilterConnection() {
        FilterConnectionImpl filterConnection = new FilterConnectionImpl();
        return filterConnection;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DimmerItem createDimmerItem() {
        DimmerItemImpl dimmerItem = new DimmerItemImpl();
        return dimmerItem;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NumberItem createNumberItem() {
        NumberItemImpl numberItem = new NumberItemImpl();
        return numberItem;
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
