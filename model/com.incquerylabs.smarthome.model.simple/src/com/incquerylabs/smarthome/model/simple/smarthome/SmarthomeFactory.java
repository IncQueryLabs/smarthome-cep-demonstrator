/**
 */
package com.incquerylabs.smarthome.model.simple.smarthome;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.incquerylabs.smarthome.model.simple.smarthome.SmarthomePackage
 * @generated
 */
public interface SmarthomeFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    SmarthomeFactory eINSTANCE = com.incquerylabs.smarthome.model.simple.smarthome.impl.SmarthomeFactoryImpl.init();

    /**
     * Returns a new object of class '<em>Smart Home</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Smart Home</em>'.
     * @generated
     */
    SmartHome createSmartHome();

    /**
     * Returns a new object of class '<em>Contact Item</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Contact Item</em>'.
     * @generated
     */
    ContactItem createContactItem();

    /**
     * Returns a new object of class '<em>State</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>State</em>'.
     * @generated
     */
    State createState();

    /**
     * Returns a new object of class '<em>Evaluating Node</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Evaluating Node</em>'.
     * @generated
     */
    EvaluatingNode createEvaluatingNode();

    /**
     * Returns a new object of class '<em>Command</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Command</em>'.
     * @generated
     */
    Command createCommand();

    /**
     * Returns a new object of class '<em>Switch Item</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Switch Item</em>'.
     * @generated
     */
    SwitchItem createSwitchItem();

    /**
     * Returns a new object of class '<em>State Change Connection</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>State Change Connection</em>'.
     * @generated
     */
    StateChangeConnection createStateChangeConnection();

    /**
     * Returns a new object of class '<em>Filter Connection</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Filter Connection</em>'.
     * @generated
     */
    FilterConnection createFilterConnection();

    /**
     * Returns a new object of class '<em>Dimmer Item</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Dimmer Item</em>'.
     * @generated
     */
    DimmerItem createDimmerItem();

    /**
     * Returns a new object of class '<em>Number Item</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Number Item</em>'.
     * @generated
     */
    NumberItem createNumberItem();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    SmarthomePackage getSmarthomePackage();

} //SmarthomeFactory
