/**
 */
package org.simulation.devs.model.devsModel;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Devs Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.simulation.devs.model.devsModel.DevsPort#getName <em>Name</em>}</li>
 *   <li>{@link org.simulation.devs.model.devsModel.DevsPort#getContainsDevsCoupling <em>Contains Devs Coupling</em>}</li>
 *   <li>{@link org.simulation.devs.model.devsModel.DevsPort#getTargetConnection <em>Target Connection</em>}</li>
 * </ul>
 *
 * @see org.simulation.devs.model.devsModel.DevsModelPackage#getDevsPort()
 * @model abstract="true"
 * @generated
 */
public interface DevsPort extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.simulation.devs.model.devsModel.DevsModelPackage#getDevsPort_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.simulation.devs.model.devsModel.DevsPort#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Contains Devs Coupling</b></em>' containment reference list.
	 * The list contents are of type {@link org.simulation.devs.model.devsModel.Coupling}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains Devs Coupling</em>' containment reference list.
	 * @see org.simulation.devs.model.devsModel.DevsModelPackage#getDevsPort_ContainsDevsCoupling()
	 * @model containment="true"
	 * @generated
	 */
	EList<Coupling> getContainsDevsCoupling();

	/**
	 * Returns the value of the '<em><b>Target Connection</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.simulation.devs.model.devsModel.Coupling#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Connection</em>' reference.
	 * @see #setTargetConnection(Coupling)
	 * @see org.simulation.devs.model.devsModel.DevsModelPackage#getDevsPort_TargetConnection()
	 * @see org.simulation.devs.model.devsModel.Coupling#getSource
	 * @model opposite="source"
	 * @generated
	 */
	Coupling getTargetConnection();

	/**
	 * Sets the value of the '{@link org.simulation.devs.model.devsModel.DevsPort#getTargetConnection <em>Target Connection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Connection</em>' reference.
	 * @see #getTargetConnection()
	 * @generated
	 */
	void setTargetConnection(Coupling value);

} // DevsPort
