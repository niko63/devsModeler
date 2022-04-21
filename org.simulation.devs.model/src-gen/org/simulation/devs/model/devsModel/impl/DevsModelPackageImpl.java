/**
 */
package org.simulation.devs.model.devsModel.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.simulation.devs.model.devsModel.Coupling;
import org.simulation.devs.model.devsModel.DevsAtomicModel;
import org.simulation.devs.model.devsModel.DevsCoupleModel;
import org.simulation.devs.model.devsModel.DevsEditor;
import org.simulation.devs.model.devsModel.DevsModel;
import org.simulation.devs.model.devsModel.DevsModelFactory;
import org.simulation.devs.model.devsModel.DevsModelPackage;
import org.simulation.devs.model.devsModel.DevsPort;
import org.simulation.devs.model.devsModel.Input;
import org.simulation.devs.model.devsModel.Output;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DevsModelPackageImpl extends EPackageImpl implements DevsModelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass devsEditorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass devsModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass devsAtomicModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass devsCoupleModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass devsPortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass couplingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outputEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.simulation.devs.model.devsModel.DevsModelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DevsModelPackageImpl() {
		super(eNS_URI, DevsModelFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link DevsModelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DevsModelPackage init() {
		if (isInited)
			return (DevsModelPackage) EPackage.Registry.INSTANCE.getEPackage(DevsModelPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredDevsModelPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		DevsModelPackageImpl theDevsModelPackage = registeredDevsModelPackage instanceof DevsModelPackageImpl
				? (DevsModelPackageImpl) registeredDevsModelPackage
				: new DevsModelPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theDevsModelPackage.createPackageContents();

		// Initialize created meta-data
		theDevsModelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDevsModelPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DevsModelPackage.eNS_URI, theDevsModelPackage);
		return theDevsModelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDevsEditor() {
		return devsEditorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDevsEditor_Devsmodel() {
		return (EReference) devsEditorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDevsEditor_Devsport() {
		return (EReference) devsEditorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDevsEditor_Devscoupling() {
		return (EReference) devsEditorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDevsModel() {
		return devsModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDevsModel_ContainsDevsPort() {
		return (EReference) devsModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDevsModel_Name() {
		return (EAttribute) devsModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDevsAtomicModel() {
		return devsAtomicModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDevsCoupleModel() {
		return devsCoupleModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDevsCoupleModel_ContainsDevsModel() {
		return (EReference) devsCoupleModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDevsCoupleModel_ContainsDevsAtomicModel() {
		return (EReference) devsCoupleModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDevsPort() {
		return devsPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDevsPort_Name() {
		return (EAttribute) devsPortEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDevsPort_ContainsDevsCoupling() {
		return (EReference) devsPortEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDevsPort_TargetConnection() {
		return (EReference) devsPortEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCoupling() {
		return couplingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCoupling_Source() {
		return (EReference) couplingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCoupling_Target() {
		return (EReference) couplingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCoupling_SourceConnection() {
		return (EReference) couplingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInput() {
		return inputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOutput() {
		return outputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DevsModelFactory getDevsModelFactory() {
		return (DevsModelFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		devsEditorEClass = createEClass(DEVS_EDITOR);
		createEReference(devsEditorEClass, DEVS_EDITOR__DEVSMODEL);
		createEReference(devsEditorEClass, DEVS_EDITOR__DEVSPORT);
		createEReference(devsEditorEClass, DEVS_EDITOR__DEVSCOUPLING);

		devsModelEClass = createEClass(DEVS_MODEL);
		createEReference(devsModelEClass, DEVS_MODEL__CONTAINS_DEVS_PORT);
		createEAttribute(devsModelEClass, DEVS_MODEL__NAME);

		devsAtomicModelEClass = createEClass(DEVS_ATOMIC_MODEL);

		devsCoupleModelEClass = createEClass(DEVS_COUPLE_MODEL);
		createEReference(devsCoupleModelEClass, DEVS_COUPLE_MODEL__CONTAINS_DEVS_MODEL);
		createEReference(devsCoupleModelEClass, DEVS_COUPLE_MODEL__CONTAINS_DEVS_ATOMIC_MODEL);

		devsPortEClass = createEClass(DEVS_PORT);
		createEAttribute(devsPortEClass, DEVS_PORT__NAME);
		createEReference(devsPortEClass, DEVS_PORT__CONTAINS_DEVS_COUPLING);
		createEReference(devsPortEClass, DEVS_PORT__TARGET_CONNECTION);

		couplingEClass = createEClass(COUPLING);
		createEReference(couplingEClass, COUPLING__SOURCE);
		createEReference(couplingEClass, COUPLING__TARGET);
		createEReference(couplingEClass, COUPLING__SOURCE_CONNECTION);

		inputEClass = createEClass(INPUT);

		outputEClass = createEClass(OUTPUT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		devsAtomicModelEClass.getESuperTypes().add(this.getDevsModel());
		devsCoupleModelEClass.getESuperTypes().add(this.getDevsModel());
		inputEClass.getESuperTypes().add(this.getDevsPort());
		outputEClass.getESuperTypes().add(this.getDevsPort());

		// Initialize classes, features, and operations; add parameters
		initEClass(devsEditorEClass, DevsEditor.class, "DevsEditor", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDevsEditor_Devsmodel(), this.getDevsModel(), null, "devsmodel", null, 0, -1, DevsEditor.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDevsEditor_Devsport(), this.getDevsPort(), null, "devsport", null, 0, -1, DevsEditor.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDevsEditor_Devscoupling(), this.getCoupling(), null, "devscoupling", null, 0, -1,
				DevsEditor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(devsModelEClass, DevsModel.class, "DevsModel", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDevsModel_ContainsDevsPort(), this.getDevsPort(), null, "containsDevsPort", null, 0, -1,
				DevsModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDevsModel_Name(), ecorePackage.getEString(), "name", null, 0, 1, DevsModel.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(devsAtomicModelEClass, DevsAtomicModel.class, "DevsAtomicModel", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(devsCoupleModelEClass, DevsCoupleModel.class, "DevsCoupleModel", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDevsCoupleModel_ContainsDevsModel(), this.getDevsCoupleModel(), null, "containsDevsModel",
				null, 0, -1, DevsCoupleModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDevsCoupleModel_ContainsDevsAtomicModel(), this.getDevsAtomicModel(), null,
				"containsDevsAtomicModel", null, 0, -1, DevsCoupleModel.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(devsPortEClass, DevsPort.class, "DevsPort", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDevsPort_Name(), ecorePackage.getEString(), "name", null, 0, 1, DevsPort.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDevsPort_ContainsDevsCoupling(), this.getCoupling(), null, "containsDevsCoupling", null, 0,
				-1, DevsPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDevsPort_TargetConnection(), this.getCoupling(), this.getCoupling_Source(),
				"targetConnection", null, 0, 1, DevsPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(couplingEClass, Coupling.class, "Coupling", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCoupling_Source(), this.getDevsPort(), this.getDevsPort_TargetConnection(), "source", null, 0,
				1, Coupling.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCoupling_Target(), this.getDevsPort(), null, "target", null, 0, 1, Coupling.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCoupling_SourceConnection(), this.getDevsPort(), null, "sourceConnection", null, 0, 1,
				Coupling.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inputEClass, Input.class, "Input", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(outputEClass, Output.class, "Output", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //DevsModelPackageImpl
