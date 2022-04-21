/**
 */
package org.simulation.devs.model.devsModel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.simulation.devs.model.devsModel.DevsModelPackage
 * @generated
 */
public interface DevsModelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DevsModelFactory eINSTANCE = org.simulation.devs.model.devsModel.impl.DevsModelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Devs Editor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Devs Editor</em>'.
	 * @generated
	 */
	DevsEditor createDevsEditor();

	/**
	 * Returns a new object of class '<em>Devs Atomic Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Devs Atomic Model</em>'.
	 * @generated
	 */
	DevsAtomicModel createDevsAtomicModel();

	/**
	 * Returns a new object of class '<em>Devs Couple Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Devs Couple Model</em>'.
	 * @generated
	 */
	DevsCoupleModel createDevsCoupleModel();

	/**
	 * Returns a new object of class '<em>Coupling</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Coupling</em>'.
	 * @generated
	 */
	Coupling createCoupling();

	/**
	 * Returns a new object of class '<em>Input</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Input</em>'.
	 * @generated
	 */
	Input createInput();

	/**
	 * Returns a new object of class '<em>Output</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Output</em>'.
	 * @generated
	 */
	Output createOutput();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DevsModelPackage getDevsModelPackage();

} //DevsModelFactory
