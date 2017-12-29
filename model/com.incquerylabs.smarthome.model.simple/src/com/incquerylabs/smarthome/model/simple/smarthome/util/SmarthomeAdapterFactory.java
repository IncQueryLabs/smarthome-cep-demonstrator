/**
 */
package com.incquerylabs.smarthome.model.simple.smarthome.util;

import com.incquerylabs.smarthome.model.simple.smarthome.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.incquerylabs.smarthome.model.simple.smarthome.SmarthomePackage
 * @generated
 */
public class SmarthomeAdapterFactory extends AdapterFactoryImpl {
    /**
	 * The cached model package.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected static SmarthomePackage modelPackage;

    /**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public SmarthomeAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = SmarthomePackage.eINSTANCE;
		}
	}

    /**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
     * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
     * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
    @Override
    public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

    /**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected SmarthomeSwitch<Adapter> modelSwitch =
        new SmarthomeSwitch<Adapter>() {
			@Override
			public Adapter caseSmartHome(SmartHome object) {
				return createSmartHomeAdapter();
			}
			@Override
			public Adapter caseItem(Item object) {
				return createItemAdapter();
			}
			@Override
			public Adapter caseContactItem(ContactItem object) {
				return createContactItemAdapter();
			}
			@Override
			public Adapter caseState(State object) {
				return createStateAdapter();
			}
			@Override
			public Adapter caseEvaluatingNode(EvaluatingNode object) {
				return createEvaluatingNodeAdapter();
			}
			@Override
			public Adapter caseCommandConnection(CommandConnection object) {
				return createCommandConnectionAdapter();
			}
			@Override
			public Adapter caseSwitchItem(SwitchItem object) {
				return createSwitchItemAdapter();
			}
			@Override
			public Adapter caseStateChangeConnection(StateChangeConnection object) {
				return createStateChangeConnectionAdapter();
			}
			@Override
			public Adapter caseFilterConnection(FilterConnection object) {
				return createFilterConnectionAdapter();
			}
			@Override
			public Adapter caseDimmerItem(DimmerItem object) {
				return createDimmerItemAdapter();
			}
			@Override
			public Adapter caseNumberItem(NumberItem object) {
				return createNumberItemAdapter();
			}
			@Override
			public Adapter caseCommand(Command object) {
				return createCommandAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

    /**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
    @Override
    public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


    /**
	 * Creates a new adapter for an object of class '{@link com.incquerylabs.smarthome.model.simple.smarthome.SmartHome <em>Smart Home</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.incquerylabs.smarthome.model.simple.smarthome.SmartHome
	 * @generated
	 */
    public Adapter createSmartHomeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link com.incquerylabs.smarthome.model.simple.smarthome.Item <em>Item</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.incquerylabs.smarthome.model.simple.smarthome.Item
	 * @generated
	 */
    public Adapter createItemAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link com.incquerylabs.smarthome.model.simple.smarthome.ContactItem <em>Contact Item</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.incquerylabs.smarthome.model.simple.smarthome.ContactItem
	 * @generated
	 */
    public Adapter createContactItemAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link com.incquerylabs.smarthome.model.simple.smarthome.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.incquerylabs.smarthome.model.simple.smarthome.State
	 * @generated
	 */
    public Adapter createStateAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link com.incquerylabs.smarthome.model.simple.smarthome.EvaluatingNode <em>Evaluating Node</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.incquerylabs.smarthome.model.simple.smarthome.EvaluatingNode
	 * @generated
	 */
    public Adapter createEvaluatingNodeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link com.incquerylabs.smarthome.model.simple.smarthome.CommandConnection <em>Command Connection</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.incquerylabs.smarthome.model.simple.smarthome.CommandConnection
	 * @generated
	 */
    public Adapter createCommandConnectionAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link com.incquerylabs.smarthome.model.simple.smarthome.Command <em>Command</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.incquerylabs.smarthome.model.simple.smarthome.Command
	 * @generated
	 */
    public Adapter createCommandAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link com.incquerylabs.smarthome.model.simple.smarthome.SwitchItem <em>Switch Item</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.incquerylabs.smarthome.model.simple.smarthome.SwitchItem
	 * @generated
	 */
    public Adapter createSwitchItemAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link com.incquerylabs.smarthome.model.simple.smarthome.StateChangeConnection <em>State Change Connection</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.incquerylabs.smarthome.model.simple.smarthome.StateChangeConnection
	 * @generated
	 */
    public Adapter createStateChangeConnectionAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link com.incquerylabs.smarthome.model.simple.smarthome.FilterConnection <em>Filter Connection</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.incquerylabs.smarthome.model.simple.smarthome.FilterConnection
	 * @generated
	 */
    public Adapter createFilterConnectionAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link com.incquerylabs.smarthome.model.simple.smarthome.DimmerItem <em>Dimmer Item</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.incquerylabs.smarthome.model.simple.smarthome.DimmerItem
	 * @generated
	 */
    public Adapter createDimmerItemAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link com.incquerylabs.smarthome.model.simple.smarthome.NumberItem <em>Number Item</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.incquerylabs.smarthome.model.simple.smarthome.NumberItem
	 * @generated
	 */
    public Adapter createNumberItemAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
     * This default implementation returns null.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
    public Adapter createEObjectAdapter() {
		return null;
	}

} //SmarthomeAdapterFactory
