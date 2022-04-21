/**
 */
package org.simulation.devs.model.devsModel.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.simulation.devs.model.devsModel.*;

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
 * @see org.simulation.devs.model.devsModel.DevsModelPackage
 * @generated
 */
public class DevsModelSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DevsModelPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DevsModelSwitch() {
		if (modelPackage == null) {
			modelPackage = DevsModelPackage.eINSTANCE;
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
		case DevsModelPackage.DEVS_EDITOR: {
			DevsEditor devsEditor = (DevsEditor) theEObject;
			T result = caseDevsEditor(devsEditor);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DevsModelPackage.DEVS_MODEL: {
			DevsModel devsModel = (DevsModel) theEObject;
			T result = caseDevsModel(devsModel);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DevsModelPackage.DEVS_ATOMIC_MODEL: {
			DevsAtomicModel devsAtomicModel = (DevsAtomicModel) theEObject;
			T result = caseDevsAtomicModel(devsAtomicModel);
			if (result == null)
				result = caseDevsModel(devsAtomicModel);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DevsModelPackage.DEVS_COUPLE_MODEL: {
			DevsCoupleModel devsCoupleModel = (DevsCoupleModel) theEObject;
			T result = caseDevsCoupleModel(devsCoupleModel);
			if (result == null)
				result = caseDevsModel(devsCoupleModel);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DevsModelPackage.DEVS_PORT: {
			DevsPort devsPort = (DevsPort) theEObject;
			T result = caseDevsPort(devsPort);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DevsModelPackage.COUPLING: {
			Coupling coupling = (Coupling) theEObject;
			T result = caseCoupling(coupling);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DevsModelPackage.INPUT: {
			Input input = (Input) theEObject;
			T result = caseInput(input);
			if (result == null)
				result = caseDevsPort(input);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DevsModelPackage.OUTPUT: {
			Output output = (Output) theEObject;
			T result = caseOutput(output);
			if (result == null)
				result = caseDevsPort(output);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Devs Editor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Devs Editor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDevsEditor(DevsEditor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Devs Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Devs Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDevsModel(DevsModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Devs Atomic Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Devs Atomic Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDevsAtomicModel(DevsAtomicModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Devs Couple Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Devs Couple Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDevsCoupleModel(DevsCoupleModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Devs Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Devs Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDevsPort(DevsPort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Coupling</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Coupling</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCoupling(Coupling object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Input</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInput(Input object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Output</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Output</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOutput(Output object) {
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

} //DevsModelSwitch
