/**
 */
package org.simulation.devs.model.devsModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Devs Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.simulation.devs.model.devsModel.DevsModel#getContainsDevsPort <em>Contains Devs Port</em>}</li>
 *   <li>{@link org.simulation.devs.model.devsModel.DevsModel#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see org.simulation.devs.model.devsModel.DevsModelPackage#getDevsModel()
 * @model abstract="true"
 * @generated
 */
public interface DevsModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Contains Devs Port</b></em>' containment reference list.
	 * The list contents are of type {@link org.simulation.devs.model.devsModel.DevsPort}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains Devs Port</em>' containment reference list.
	 * @see org.simulation.devs.model.devsModel.DevsModelPackage#getDevsModel_ContainsDevsPort()
	 * @model containment="true"
	 * @generated
	 */
	EList<DevsPort> getContainsDevsPort();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.simulation.devs.model.devsModel.DevsModelPackage#getDevsModel_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.simulation.devs.model.devsModel.DevsModel#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // DevsModel
