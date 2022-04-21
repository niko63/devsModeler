/**
 */
package org.simulation.devs.model.devsModel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.simulation.devs.model.devsModel.Coupling;
import org.simulation.devs.model.devsModel.DevsEditor;
import org.simulation.devs.model.devsModel.DevsModel;
import org.simulation.devs.model.devsModel.DevsModelPackage;
import org.simulation.devs.model.devsModel.DevsPort;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Devs Editor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.simulation.devs.model.devsModel.impl.DevsEditorImpl#getDevsmodel <em>Devsmodel</em>}</li>
 *   <li>{@link org.simulation.devs.model.devsModel.impl.DevsEditorImpl#getDevsport <em>Devsport</em>}</li>
 *   <li>{@link org.simulation.devs.model.devsModel.impl.DevsEditorImpl#getDevscoupling <em>Devscoupling</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DevsEditorImpl extends MinimalEObjectImpl.Container implements DevsEditor {
	/**
	 * The cached value of the '{@link #getDevsmodel() <em>Devsmodel</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDevsmodel()
	 * @generated
	 * @ordered
	 */
	protected EList<DevsModel> devsmodel;

	/**
	 * The cached value of the '{@link #getDevsport() <em>Devsport</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDevsport()
	 * @generated
	 * @ordered
	 */
	protected EList<DevsPort> devsport;

	/**
	 * The cached value of the '{@link #getDevscoupling() <em>Devscoupling</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDevscoupling()
	 * @generated
	 * @ordered
	 */
	protected EList<Coupling> devscoupling;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DevsEditorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DevsModelPackage.Literals.DEVS_EDITOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DevsModel> getDevsmodel() {
		if (devsmodel == null) {
			devsmodel = new EObjectContainmentEList<DevsModel>(DevsModel.class, this,
					DevsModelPackage.DEVS_EDITOR__DEVSMODEL);
		}
		return devsmodel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DevsPort> getDevsport() {
		if (devsport == null) {
			devsport = new EObjectContainmentEList<DevsPort>(DevsPort.class, this,
					DevsModelPackage.DEVS_EDITOR__DEVSPORT);
		}
		return devsport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Coupling> getDevscoupling() {
		if (devscoupling == null) {
			devscoupling = new EObjectContainmentEList<Coupling>(Coupling.class, this,
					DevsModelPackage.DEVS_EDITOR__DEVSCOUPLING);
		}
		return devscoupling;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case DevsModelPackage.DEVS_EDITOR__DEVSMODEL:
			return ((InternalEList<?>) getDevsmodel()).basicRemove(otherEnd, msgs);
		case DevsModelPackage.DEVS_EDITOR__DEVSPORT:
			return ((InternalEList<?>) getDevsport()).basicRemove(otherEnd, msgs);
		case DevsModelPackage.DEVS_EDITOR__DEVSCOUPLING:
			return ((InternalEList<?>) getDevscoupling()).basicRemove(otherEnd, msgs);
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
		case DevsModelPackage.DEVS_EDITOR__DEVSMODEL:
			return getDevsmodel();
		case DevsModelPackage.DEVS_EDITOR__DEVSPORT:
			return getDevsport();
		case DevsModelPackage.DEVS_EDITOR__DEVSCOUPLING:
			return getDevscoupling();
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
		case DevsModelPackage.DEVS_EDITOR__DEVSMODEL:
			getDevsmodel().clear();
			getDevsmodel().addAll((Collection<? extends DevsModel>) newValue);
			return;
		case DevsModelPackage.DEVS_EDITOR__DEVSPORT:
			getDevsport().clear();
			getDevsport().addAll((Collection<? extends DevsPort>) newValue);
			return;
		case DevsModelPackage.DEVS_EDITOR__DEVSCOUPLING:
			getDevscoupling().clear();
			getDevscoupling().addAll((Collection<? extends Coupling>) newValue);
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
		case DevsModelPackage.DEVS_EDITOR__DEVSMODEL:
			getDevsmodel().clear();
			return;
		case DevsModelPackage.DEVS_EDITOR__DEVSPORT:
			getDevsport().clear();
			return;
		case DevsModelPackage.DEVS_EDITOR__DEVSCOUPLING:
			getDevscoupling().clear();
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
		case DevsModelPackage.DEVS_EDITOR__DEVSMODEL:
			return devsmodel != null && !devsmodel.isEmpty();
		case DevsModelPackage.DEVS_EDITOR__DEVSPORT:
			return devsport != null && !devsport.isEmpty();
		case DevsModelPackage.DEVS_EDITOR__DEVSCOUPLING:
			return devscoupling != null && !devscoupling.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DevsEditorImpl
