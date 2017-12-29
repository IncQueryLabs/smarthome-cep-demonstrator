/**
 */
package com.incquerylabs.smarthome.model.simple.smarthome.util;

import com.incquerylabs.smarthome.model.simple.smarthome.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see com.incquerylabs.smarthome.model.simple.smarthome.SmarthomePackage
 * @generated
 */
public class SmarthomeSwitch<T> extends Switch<T> {
    /**
	 * The cached model package
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected static SmarthomePackage modelPackage;

    /**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public SmarthomeSwitch() {
		if (modelPackage == null) {
			modelPackage = SmarthomePackage.eINSTANCE;
		}
	}

    /**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
    @Override
    protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

    /**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
    @Override
    protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case SmarthomePackage.SMART_HOME: {
				SmartHome smartHome = (SmartHome)theEObject;
				T result = caseSmartHome(smartHome);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SmarthomePackage.ITEM: {
				Item item = (Item)theEObject;
				T result = caseItem(item);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SmarthomePackage.CONTACT_ITEM: {
				ContactItem contactItem = (ContactItem)theEObject;
				T result = caseContactItem(contactItem);
				if (result == null) result = caseItem(contactItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SmarthomePackage.STATE: {
				State state = (State)theEObject;
				T result = caseState(state);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SmarthomePackage.EVALUATING_NODE: {
				EvaluatingNode evaluatingNode = (EvaluatingNode)theEObject;
				T result = caseEvaluatingNode(evaluatingNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SmarthomePackage.COMMAND_CONNECTION: {
				CommandConnection commandConnection = (CommandConnection)theEObject;
				T result = caseCommandConnection(commandConnection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SmarthomePackage.SWITCH_ITEM: {
				SwitchItem switchItem = (SwitchItem)theEObject;
				T result = caseSwitchItem(switchItem);
				if (result == null) result = caseItem(switchItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SmarthomePackage.STATE_CHANGE_CONNECTION: {
				StateChangeConnection stateChangeConnection = (StateChangeConnection)theEObject;
				T result = caseStateChangeConnection(stateChangeConnection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SmarthomePackage.FILTER_CONNECTION: {
				FilterConnection filterConnection = (FilterConnection)theEObject;
				T result = caseFilterConnection(filterConnection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SmarthomePackage.DIMMER_ITEM: {
				DimmerItem dimmerItem = (DimmerItem)theEObject;
				T result = caseDimmerItem(dimmerItem);
				if (result == null) result = caseItem(dimmerItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SmarthomePackage.NUMBER_ITEM: {
				NumberItem numberItem = (NumberItem)theEObject;
				T result = caseNumberItem(numberItem);
				if (result == null) result = caseItem(numberItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SmarthomePackage.COMMAND: {
				Command command = (Command)theEObject;
				T result = caseCommand(command);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Smart Home</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Smart Home</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseSmartHome(SmartHome object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Item</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseItem(Item object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Contact Item</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contact Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseContactItem(ContactItem object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>State</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseState(State object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Evaluating Node</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Evaluating Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseEvaluatingNode(EvaluatingNode object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Command Connection</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Command Connection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseCommandConnection(CommandConnection object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Command</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Command</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseCommand(Command object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Switch Item</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Switch Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseSwitchItem(SwitchItem object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>State Change Connection</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>State Change Connection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseStateChangeConnection(StateChangeConnection object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Filter Connection</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Filter Connection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseFilterConnection(FilterConnection object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Dimmer Item</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dimmer Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseDimmerItem(DimmerItem object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Number Item</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Number Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseNumberItem(NumberItem object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch, but this is the last case anyway.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
    @Override
    public T defaultCase(EObject object) {
		return null;
	}

} //SmarthomeSwitch
