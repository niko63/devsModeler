/**
 */
package org.simulation.devs.model.devsModel.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.simulation.devs.model.devsModel.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DevsModelFactoryImpl extends EFactoryImpl implements DevsModelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DevsModelFactory init() {
		try {
			DevsModelFactory theDevsModelFactory = (DevsModelFactory) EPackage.Registry.INSTANCE
					.getEFactory(DevsModelPackage.eNS_URI);
			if (theDevsModelFactory != null) {
				return theDevsModelFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DevsModelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DevsModelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case DevsModelPackage.DEVS_EDITOR:
			return createDevsEditor();
		case DevsModelPackage.DEVS_ATOMIC_MODEL:
			return createDevsAtomicModel();
		case DevsModelPackage.DEVS_COUPLE_MODEL:
			return createDevsCoupleModel();
		case DevsModelPackage.COUPLING:
			return createCoupling();
		case DevsModelPackage.INPUT:
			return createInput();
		case DevsModelPackage.OUTPUT:
			return createOutput();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DevsEditor createDevsEditor() {
		DevsEditorImpl devsEditor = new DevsEditorImpl();
		return devsEditor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DevsAtomicModel createDevsAtomicModel() {
		DevsAtomicModelImpl devsAtomicModel = new DevsAtomicModelImpl();
		return devsAtomicModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DevsCoupleModel createDevsCoupleModel() {
		DevsCoupleModelImpl devsCoupleModel = new DevsCoupleModelImpl();
		return devsCoupleModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coupling createCoupling() {
		CouplingImpl coupling = new CouplingImpl();
		return coupling;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Input createInput() {
		InputImpl input = new InputImpl();
		return input;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Output createOutput() {
		OutputImpl output = new OutputImpl();
		return output;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DevsModelPackage getDevsModelPackage() {
		return (DevsModelPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DevsModelPackage getPackage() {
		return DevsModelPackage.eINSTANCE;
	}

} //DevsModelFactoryImpl
