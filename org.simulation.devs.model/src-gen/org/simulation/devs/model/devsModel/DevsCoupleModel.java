/**
 */
package org.simulation.devs.model.devsModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Devs Couple Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.simulation.devs.model.devsModel.DevsCoupleModel#getContainsDevsModel <em>Contains Devs Model</em>}</li>
 *   <li>{@link org.simulation.devs.model.devsModel.DevsCoupleModel#getContainsDevsAtomicModel <em>Contains Devs Atomic Model</em>}</li>
 * </ul>
 *
 * @see org.simulation.devs.model.devsModel.DevsModelPackage#getDevsCoupleModel()
 * @model
 * @generated
 */
public interface DevsCoupleModel extends DevsModel {
	/**
	 * Returns the value of the '<em><b>Contains Devs Model</b></em>' containment reference list.
	 * The list contents are of type {@link org.simulation.devs.model.devsModel.DevsCoupleModel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains Devs Model</em>' containment reference list.
	 * @see org.simulation.devs.model.devsModel.DevsModelPackage#getDevsCoupleModel_ContainsDevsModel()
	 * @model containment="true"
	 * @generated
	 */
	EList<DevsCoupleModel> getContainsDevsModel();

	/**
	 * Returns the value of the '<em><b>Contains Devs Atomic Model</b></em>' containment reference list.
	 * The list contents are of type {@link org.simulation.devs.model.devsModel.DevsAtomicModel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains Devs Atomic Model</em>' containment reference list.
	 * @see org.simulation.devs.model.devsModel.DevsModelPackage#getDevsCoupleModel_ContainsDevsAtomicModel()
	 * @model containment="true"
	 * @generated
	 */
	EList<DevsAtomicModel> getContainsDevsAtomicModel();

} // DevsCoupleModel
