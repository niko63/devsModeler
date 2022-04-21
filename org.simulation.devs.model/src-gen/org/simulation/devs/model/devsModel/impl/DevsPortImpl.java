/**
 */
package org.simulation.devs.model.devsModel.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.simulation.devs.model.devsModel.Coupling;
import org.simulation.devs.model.devsModel.DevsModelPackage;
import org.simulation.devs.model.devsModel.DevsPort;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Devs Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.simulation.devs.model.devsModel.impl.DevsPortImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.simulation.devs.model.devsModel.impl.DevsPortImpl#getContainsDevsCoupling <em>Contains Devs Coupling</em>}</li>
 *   <li>{@link org.simulation.devs.model.devsModel.impl.DevsPortImpl#getTargetConnection <em>Target Connection</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class DevsPortImpl extends MinimalEObjectImpl.Container implements DevsPort {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getContainsDevsCoupling() <em>Contains Devs Coupling</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainsDevsCoupling()
	 * @generated
	 * @ordered
	 */
	protected EList<Coupling> containsDevsCoupling;

	/**
	 * The cached value of the '{@link #getTargetConnection() <em>Target Connection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetConnection()
	 * @generated
	 * @ordered
	 */
	protected Coupling targetConnection;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DevsPortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DevsModelPackage.Literals.DEVS_PORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DevsModelPackage.DEVS_PORT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Coupling> getContainsDevsCoupling() {
		if (containsDevsCoupling == null) {
			containsDevsCoupling = new EObjectContainmentEList<Coupling>(Coupling.class, this,
					DevsModelPackage.DEVS_PORT__CONTAINS_DEVS_COUPLING);
		}
		return containsDevsCoupling;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coupling getTargetConnection() {
		if (targetConnection != null && targetConnection.eIsProxy()) {
			InternalEObject oldTargetConnection = (InternalEObject) targetConnection;
			targetConnection = (Coupling) eResolveProxy(oldTargetConnection);
			if (targetConnection != oldTargetConnection) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							DevsModelPackage.DEVS_PORT__TARGET_CONNECTION, oldTargetConnection, targetConnection));
			}
		}
		return targetConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coupling basicGetTargetConnection() {
		return targetConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTargetConnection(Coupling newTargetConnection, NotificationChain msgs) {
		Coupling oldTargetConnection = targetConnection;
		targetConnection = newTargetConnection;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					DevsModelPackage.DEVS_PORT__TARGET_CONNECTION, oldTargetConnection, newTargetConnection);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetConnection(Coupling newTargetConnection) {
		if (newTargetConnection != targetConnection) {
			NotificationChain msgs = null;
			if (targetConnection != null)
				msgs = ((InternalEObject) targetConnection).eInverseRemove(this, DevsModelPackage.COUPLING__SOURCE,
						Coupling.class, msgs);
			if (newTargetConnection != null)
				msgs = ((InternalEObject) newTargetConnection).eInverseAdd(this, DevsModelPackage.COUPLING__SOURCE,
						Coupling.class, msgs);
			msgs = basicSetTargetConnection(newTargetConnection, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DevsModelPackage.DEVS_PORT__TARGET_CONNECTION,
					newTargetConnection, newTargetConnection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case DevsModelPackage.DEVS_PORT__TARGET_CONNECTION:
			if (targetConnection != null)
				msgs = ((InternalEObject) targetConnection).eInverseRemove(this, DevsModelPackage.COUPLING__SOURCE,
						Coupling.class, msgs);
			return basicSetTargetConnection((Coupling) otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case DevsModelPackage.DEVS_PORT__CONTAINS_DEVS_COUPLING:
			return ((InternalEList<?>) getContainsDevsCoupling()).basicRemove(otherEnd, msgs);
		case DevsModelPackage.DEVS_PORT__TARGET_CONNECTION:
			return basicSetTargetConnection(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case DevsModelPackage.DEVS_PORT__NAME:
			return getName();
		case DevsModelPackage.DEVS_PORT__CONTAINS_DEVS_COUPLING:
			return getContainsDevsCoupling();
		case DevsModelPackage.DEVS_PORT__TARGET_CONNECTION:
			if (resolve)
				return getTargetConnection();
			return basicGetTargetConnection();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case DevsModelPackage.DEVS_PORT__NAME:
			setName((String) newValue);
			return;
		case DevsModelPackage.DEVS_PORT__CONTAINS_DEVS_COUPLING:
			getContainsDevsCoupling().clear();
			getContainsDevsCoupling().addAll((Collection<? extends Coupling>) newValue);
			return;
		case DevsModelPackage.DEVS_PORT__TARGET_CONNECTION:
			setTargetConnection((Coupling) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case DevsModelPackage.DEVS_PORT__NAME:
			setName(NAME_EDEFAULT);
			return;
		case DevsModelPackage.DEVS_PORT__CONTAINS_DEVS_COUPLING:
			getContainsDevsCoupling().clear();
			return;
		case DevsModelPackage.DEVS_PORT__TARGET_CONNECTION:
			setTargetConnection((Coupling) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case DevsModelPackage.DEVS_PORT__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case DevsModelPackage.DEVS_PORT__CONTAINS_DEVS_COUPLING:
			return containsDevsCoupling != null && !containsDevsCoupling.isEmpty();
		case DevsModelPackage.DEVS_PORT__TARGET_CONNECTION:
			return targetConnection != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //DevsPortImpl
