/**
 */
package org.simulation.devs.model.devsModel.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.simulation.devs.model.devsModel.Coupling;
import org.simulation.devs.model.devsModel.DevsModelPackage;
import org.simulation.devs.model.devsModel.DevsPort;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Coupling</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.simulation.devs.model.devsModel.impl.CouplingImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.simulation.devs.model.devsModel.impl.CouplingImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.simulation.devs.model.devsModel.impl.CouplingImpl#getSourceConnection <em>Source Connection</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CouplingImpl extends MinimalEObjectImpl.Container implements Coupling {
	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected DevsPort source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected DevsPort target;

	/**
	 * The cached value of the '{@link #getSourceConnection() <em>Source Connection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceConnection()
	 * @generated
	 * @ordered
	 */
	protected DevsPort sourceConnection;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CouplingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DevsModelPackage.Literals.COUPLING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DevsPort getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject) source;
			source = (DevsPort) eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DevsModelPackage.COUPLING__SOURCE,
							oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DevsPort basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSource(DevsPort newSource, NotificationChain msgs) {
		DevsPort oldSource = source;
		source = newSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					DevsModelPackage.COUPLING__SOURCE, oldSource, newSource);
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
	public void setSource(DevsPort newSource) {
		if (newSource != source) {
			NotificationChain msgs = null;
			if (source != null)
				msgs = ((InternalEObject) source).eInverseRemove(this, DevsModelPackage.DEVS_PORT__TARGET_CONNECTION,
						DevsPort.class, msgs);
			if (newSource != null)
				msgs = ((InternalEObject) newSource).eInverseAdd(this, DevsModelPackage.DEVS_PORT__TARGET_CONNECTION,
						DevsPort.class, msgs);
			msgs = basicSetSource(newSource, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DevsModelPackage.COUPLING__SOURCE, newSource,
					newSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DevsPort getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject) target;
			target = (DevsPort) eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DevsModelPackage.COUPLING__TARGET,
							oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DevsPort basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(DevsPort newTarget) {
		DevsPort oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DevsModelPackage.COUPLING__TARGET, oldTarget,
					target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DevsPort getSourceConnection() {
		if (sourceConnection != null && sourceConnection.eIsProxy()) {
			InternalEObject oldSourceConnection = (InternalEObject) sourceConnection;
			sourceConnection = (DevsPort) eResolveProxy(oldSourceConnection);
			if (sourceConnection != oldSourceConnection) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							DevsModelPackage.COUPLING__SOURCE_CONNECTION, oldSourceConnection, sourceConnection));
			}
		}
		return sourceConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DevsPort basicGetSourceConnection() {
		return sourceConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceConnection(DevsPort newSourceConnection) {
		DevsPort oldSourceConnection = sourceConnection;
		sourceConnection = newSourceConnection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DevsModelPackage.COUPLING__SOURCE_CONNECTION,
					oldSourceConnection, sourceConnection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case DevsModelPackage.COUPLING__SOURCE:
			if (source != null)
				msgs = ((InternalEObject) source).eInverseRemove(this, DevsModelPackage.DEVS_PORT__TARGET_CONNECTION,
						DevsPort.class, msgs);
			return basicSetSource((DevsPort) otherEnd, msgs);
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
		case DevsModelPackage.COUPLING__SOURCE:
			return basicSetSource(null, msgs);
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
		case DevsModelPackage.COUPLING__SOURCE:
			if (resolve)
				return getSource();
			return basicGetSource();
		case DevsModelPackage.COUPLING__TARGET:
			if (resolve)
				return getTarget();
			return basicGetTarget();
		case DevsModelPackage.COUPLING__SOURCE_CONNECTION:
			if (resolve)
				return getSourceConnection();
			return basicGetSourceConnection();
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
		case DevsModelPackage.COUPLING__SOURCE:
			setSource((DevsPort) newValue);
			return;
		case DevsModelPackage.COUPLING__TARGET:
			setTarget((DevsPort) newValue);
			return;
		case DevsModelPackage.COUPLING__SOURCE_CONNECTION:
			setSourceConnection((DevsPort) newValue);
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
		case DevsModelPackage.COUPLING__SOURCE:
			setSource((DevsPort) null);
			return;
		case DevsModelPackage.COUPLING__TARGET:
			setTarget((DevsPort) null);
			return;
		case DevsModelPackage.COUPLING__SOURCE_CONNECTION:
			setSourceConnection((DevsPort) null);
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
		case DevsModelPackage.COUPLING__SOURCE:
			return source != null;
		case DevsModelPackage.COUPLING__TARGET:
			return target != null;
		case DevsModelPackage.COUPLING__SOURCE_CONNECTION:
			return sourceConnection != null;
		}
		return super.eIsSet(featureID);
	}

} //CouplingImpl
