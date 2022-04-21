/**
 */
package org.simulation.devs.model.devsModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Coupling</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.simulation.devs.model.devsModel.Coupling#getSource <em>Source</em>}</li>
 *   <li>{@link org.simulation.devs.model.devsModel.Coupling#getTarget <em>Target</em>}</li>
 *   <li>{@link org.simulation.devs.model.devsModel.Coupling#getSourceConnection <em>Source Connection</em>}</li>
 * </ul>
 *
 * @see org.simulation.devs.model.devsModel.DevsModelPackage#getCoupling()
 * @model
 * @generated
 */
public interface Coupling extends EObject {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.simulation.devs.model.devsModel.DevsPort#getTargetConnection <em>Target Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(DevsPort)
	 * @see org.simulation.devs.model.devsModel.DevsModelPackage#getCoupling_Source()
	 * @see org.simulation.devs.model.devsModel.DevsPort#getTargetConnection
	 * @model opposite="targetConnection"
	 * @generated
	 */
	DevsPort getSource();

	/**
	 * Sets the value of the '{@link org.simulation.devs.model.devsModel.Coupling#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(DevsPort value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(DevsPort)
	 * @see org.simulation.devs.model.devsModel.DevsModelPackage#getCoupling_Target()
	 * @model
	 * @generated
	 */
	DevsPort getTarget();

	/**
	 * Sets the value of the '{@link org.simulation.devs.model.devsModel.Coupling#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(DevsPort value);

	/**
	 * Returns the value of the '<em><b>Source Connection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Connection</em>' reference.
	 * @see #setSourceConnection(DevsPort)
	 * @see org.simulation.devs.model.devsModel.DevsModelPackage#getCoupling_SourceConnection()
	 * @model
	 * @generated
	 */
	DevsPort getSourceConnection();

	/**
	 * Sets the value of the '{@link org.simulation.devs.model.devsModel.Coupling#getSourceConnection <em>Source Connection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Connection</em>' reference.
	 * @see #getSourceConnection()
	 * @generated
	 */
	void setSourceConnection(DevsPort value);

} // Coupling
