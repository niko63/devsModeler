/**
 */
package org.simulation.devs.model.devsModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Devs Editor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.simulation.devs.model.devsModel.DevsEditor#getDevsmodel <em>Devsmodel</em>}</li>
 *   <li>{@link org.simulation.devs.model.devsModel.DevsEditor#getDevsport <em>Devsport</em>}</li>
 *   <li>{@link org.simulation.devs.model.devsModel.DevsEditor#getDevscoupling <em>Devscoupling</em>}</li>
 * </ul>
 *
 * @see org.simulation.devs.model.devsModel.DevsModelPackage#getDevsEditor()
 * @model
 * @generated
 */
public interface DevsEditor extends EObject {
	/**
	 * Returns the value of the '<em><b>Devsmodel</b></em>' containment reference list.
	 * The list contents are of type {@link org.simulation.devs.model.devsModel.DevsModel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Devsmodel</em>' containment reference list.
	 * @see org.simulation.devs.model.devsModel.DevsModelPackage#getDevsEditor_Devsmodel()
	 * @model containment="true"
	 * @generated
	 */
	EList<DevsModel> getDevsmodel();

	/**
	 * Returns the value of the '<em><b>Devsport</b></em>' containment reference list.
	 * The list contents are of type {@link org.simulation.devs.model.devsModel.DevsPort}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Devsport</em>' containment reference list.
	 * @see org.simulation.devs.model.devsModel.DevsModelPackage#getDevsEditor_Devsport()
	 * @model containment="true"
	 * @generated
	 */
	EList<DevsPort> getDevsport();

	/**
	 * Returns the value of the '<em><b>Devscoupling</b></em>' containment reference list.
	 * The list contents are of type {@link org.simulation.devs.model.devsModel.Coupling}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Devscoupling</em>' containment reference list.
	 * @see org.simulation.devs.model.devsModel.DevsModelPackage#getDevsEditor_Devscoupling()
	 * @model containment="true"
	 * @generated
	 */
	EList<Coupling> getDevscoupling();

} // DevsEditor
