/**
 */
package org.simulation.devs.model.devsModel.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.simulation.devs.model.devsModel.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.simulation.devs.model.devsModel.DevsModelPackage
 * @generated
 */
public class DevsModelAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DevsModelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DevsModelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = DevsModelPackage.eINSTANCE;
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
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DevsModelSwitch<Adapter> modelSwitch = new DevsModelSwitch<Adapter>() {
		@Override
		public Adapter caseDevsEditor(DevsEditor object) {
			return createDevsEditorAdapter();
		}

		@Override
		public Adapter caseDevsModel(DevsModel object) {
			return createDevsModelAdapter();
		}

		@Override
		public Adapter caseDevsAtomicModel(DevsAtomicModel object) {
			return createDevsAtomicModelAdapter();
		}

		@Override
		public Adapter caseDevsCoupleModel(DevsCoupleModel object) {
			return createDevsCoupleModelAdapter();
		}

		@Override
		public Adapter caseDevsPort(DevsPort object) {
			return createDevsPortAdapter();
		}

		@Override
		public Adapter caseCoupling(Coupling object) {
			return createCouplingAdapter();
		}

		@Override
		public Adapter caseInput(Input object) {
			return createInputAdapter();
		}

		@Override
		public Adapter caseOutput(Output object) {
			return createOutputAdapter();
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
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.simulation.devs.model.devsModel.DevsEditor <em>Devs Editor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.simulation.devs.model.devsModel.DevsEditor
	 * @generated
	 */
	public Adapter createDevsEditorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.simulation.devs.model.devsModel.DevsModel <em>Devs Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.simulation.devs.model.devsModel.DevsModel
	 * @generated
	 */
	public Adapter createDevsModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.simulation.devs.model.devsModel.DevsAtomicModel <em>Devs Atomic Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.simulation.devs.model.devsModel.DevsAtomicModel
	 * @generated
	 */
	public Adapter createDevsAtomicModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.simulation.devs.model.devsModel.DevsCoupleModel <em>Devs Couple Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.simulation.devs.model.devsModel.DevsCoupleModel
	 * @generated
	 */
	public Adapter createDevsCoupleModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.simulation.devs.model.devsModel.DevsPort <em>Devs Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.simulation.devs.model.devsModel.DevsPort
	 * @generated
	 */
	public Adapter createDevsPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.simulation.devs.model.devsModel.Coupling <em>Coupling</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.simulation.devs.model.devsModel.Coupling
	 * @generated
	 */
	public Adapter createCouplingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.simulation.devs.model.devsModel.Input <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.simulation.devs.model.devsModel.Input
	 * @generated
	 */
	public Adapter createInputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.simulation.devs.model.devsModel.Output <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.simulation.devs.model.devsModel.Output
	 * @generated
	 */
	public Adapter createOutputAdapter() {
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

} //DevsModelAdapterFactory
