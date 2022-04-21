/**
 */
package org.simulation.devs.model.devsModel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.simulation.devs.model.devsModel.DevsAtomicModel;
import org.simulation.devs.model.devsModel.DevsCoupleModel;
import org.simulation.devs.model.devsModel.DevsModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Devs Couple Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.simulation.devs.model.devsModel.impl.DevsCoupleModelImpl#getContainsDevsModel <em>Contains Devs Model</em>}</li>
 *   <li>{@link org.simulation.devs.model.devsModel.impl.DevsCoupleModelImpl#getContainsDevsAtomicModel <em>Contains Devs Atomic Model</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DevsCoupleModelImpl extends DevsModelImpl implements DevsCoupleModel {
	/**
	 * The cached value of the '{@link #getContainsDevsModel() <em>Contains Devs Model</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainsDevsModel()
	 * @generated
	 * @ordered
	 */
	protected EList<DevsCoupleModel> containsDevsModel;

	/**
	 * The cached value of the '{@link #getContainsDevsAtomicModel() <em>Contains Devs Atomic Model</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainsDevsAtomicModel()
	 * @generated
	 * @ordered
	 */
	protected EList<DevsAtomicModel> containsDevsAtomicModel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DevsCoupleModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DevsModelPackage.Literals.DEVS_COUPLE_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DevsCoupleModel> getContainsDevsModel() {
		if (containsDevsModel == null) {
			containsDevsModel = new EObjectContainmentEList<DevsCoupleModel>(DevsCoupleModel.class, this,
					DevsModelPackage.DEVS_COUPLE_MODEL__CONTAINS_DEVS_MODEL);
		}
		return containsDevsModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DevsAtomicModel> getContainsDevsAtomicModel() {
		if (containsDevsAtomicModel == null) {
			containsDevsAtomicModel = new EObjectContainmentEList<DevsAtomicModel>(DevsAtomicModel.class, this,
					DevsModelPackage.DEVS_COUPLE_MODEL__CONTAINS_DEVS_ATOMIC_MODEL);
		}
		return containsDevsAtomicModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case DevsModelPackage.DEVS_COUPLE_MODEL__CONTAINS_DEVS_MODEL:
			return ((InternalEList<?>) getContainsDevsModel()).basicRemove(otherEnd, msgs);
		case DevsModelPackage.DEVS_COUPLE_MODEL__CONTAINS_DEVS_ATOMIC_MODEL:
			return ((InternalEList<?>) getContainsDevsAtomicModel()).basicRemove(otherEnd, msgs);
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
		case DevsModelPackage.DEVS_COUPLE_MODEL__CONTAINS_DEVS_MODEL:
			return getContainsDevsModel();
		case DevsModelPackage.DEVS_COUPLE_MODEL__CONTAINS_DEVS_ATOMIC_MODEL:
			return getContainsDevsAtomicModel();
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
		case DevsModelPackage.DEVS_COUPLE_MODEL__CONTAINS_DEVS_MODEL:
			getContainsDevsModel().clear();
			getContainsDevsModel().addAll((Collection<? extends DevsCoupleModel>) newValue);
			return;
		case DevsModelPackage.DEVS_COUPLE_MODEL__CONTAINS_DEVS_ATOMIC_MODEL:
			getContainsDevsAtomicModel().clear();
			getContainsDevsAtomicModel().addAll((Collection<? extends DevsAtomicModel>) newValue);
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
		case DevsModelPackage.DEVS_COUPLE_MODEL__CONTAINS_DEVS_MODEL:
			getContainsDevsModel().clear();
			return;
		case DevsModelPackage.DEVS_COUPLE_MODEL__CONTAINS_DEVS_ATOMIC_MODEL:
			getContainsDevsAtomicModel().clear();
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
		case DevsModelPackage.DEVS_COUPLE_MODEL__CONTAINS_DEVS_MODEL:
			return containsDevsModel != null && !containsDevsModel.isEmpty();
		case DevsModelPackage.DEVS_COUPLE_MODEL__CONTAINS_DEVS_ATOMIC_MODEL:
			return containsDevsAtomicModel != null && !containsDevsAtomicModel.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DevsCoupleModelImpl
