/**
 */
package org.simulation.devs.model.devsModel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.simulation.devs.model.devsModel.DevsModelFactory
 * @model kind="package"
 * @generated
 */
public interface DevsModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "devsModel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/devsModel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "devsModel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DevsModelPackage eINSTANCE = org.simulation.devs.model.devsModel.impl.DevsModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.simulation.devs.model.devsModel.impl.DevsEditorImpl <em>Devs Editor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.simulation.devs.model.devsModel.impl.DevsEditorImpl
	 * @see org.simulation.devs.model.devsModel.impl.DevsModelPackageImpl#getDevsEditor()
	 * @generated
	 */
	int DEVS_EDITOR = 0;

	/**
	 * The feature id for the '<em><b>Devsmodel</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVS_EDITOR__DEVSMODEL = 0;

	/**
	 * The feature id for the '<em><b>Devsport</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVS_EDITOR__DEVSPORT = 1;

	/**
	 * The feature id for the '<em><b>Devscoupling</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVS_EDITOR__DEVSCOUPLING = 2;

	/**
	 * The number of structural features of the '<em>Devs Editor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVS_EDITOR_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Devs Editor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVS_EDITOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.simulation.devs.model.devsModel.impl.DevsModelImpl <em>Devs Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.simulation.devs.model.devsModel.impl.DevsModelImpl
	 * @see org.simulation.devs.model.devsModel.impl.DevsModelPackageImpl#getDevsModel()
	 * @generated
	 */
	int DEVS_MODEL = 1;

	/**
	 * The feature id for the '<em><b>Contains Devs Port</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVS_MODEL__CONTAINS_DEVS_PORT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVS_MODEL__NAME = 1;

	/**
	 * The number of structural features of the '<em>Devs Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVS_MODEL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Devs Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVS_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.simulation.devs.model.devsModel.impl.DevsAtomicModelImpl <em>Devs Atomic Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.simulation.devs.model.devsModel.impl.DevsAtomicModelImpl
	 * @see org.simulation.devs.model.devsModel.impl.DevsModelPackageImpl#getDevsAtomicModel()
	 * @generated
	 */
	int DEVS_ATOMIC_MODEL = 2;

	/**
	 * The feature id for the '<em><b>Contains Devs Port</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVS_ATOMIC_MODEL__CONTAINS_DEVS_PORT = DEVS_MODEL__CONTAINS_DEVS_PORT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVS_ATOMIC_MODEL__NAME = DEVS_MODEL__NAME;

	/**
	 * The number of structural features of the '<em>Devs Atomic Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVS_ATOMIC_MODEL_FEATURE_COUNT = DEVS_MODEL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Devs Atomic Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVS_ATOMIC_MODEL_OPERATION_COUNT = DEVS_MODEL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.simulation.devs.model.devsModel.impl.DevsCoupleModelImpl <em>Devs Couple Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.simulation.devs.model.devsModel.impl.DevsCoupleModelImpl
	 * @see org.simulation.devs.model.devsModel.impl.DevsModelPackageImpl#getDevsCoupleModel()
	 * @generated
	 */
	int DEVS_COUPLE_MODEL = 3;

	/**
	 * The feature id for the '<em><b>Contains Devs Port</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVS_COUPLE_MODEL__CONTAINS_DEVS_PORT = DEVS_MODEL__CONTAINS_DEVS_PORT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVS_COUPLE_MODEL__NAME = DEVS_MODEL__NAME;

	/**
	 * The feature id for the '<em><b>Contains Devs Model</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVS_COUPLE_MODEL__CONTAINS_DEVS_MODEL = DEVS_MODEL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Contains Devs Atomic Model</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVS_COUPLE_MODEL__CONTAINS_DEVS_ATOMIC_MODEL = DEVS_MODEL_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Devs Couple Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVS_COUPLE_MODEL_FEATURE_COUNT = DEVS_MODEL_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Devs Couple Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVS_COUPLE_MODEL_OPERATION_COUNT = DEVS_MODEL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.simulation.devs.model.devsModel.impl.DevsPortImpl <em>Devs Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.simulation.devs.model.devsModel.impl.DevsPortImpl
	 * @see org.simulation.devs.model.devsModel.impl.DevsModelPackageImpl#getDevsPort()
	 * @generated
	 */
	int DEVS_PORT = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVS_PORT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Contains Devs Coupling</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVS_PORT__CONTAINS_DEVS_COUPLING = 1;

	/**
	 * The feature id for the '<em><b>Target Connection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVS_PORT__TARGET_CONNECTION = 2;

	/**
	 * The number of structural features of the '<em>Devs Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVS_PORT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Devs Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVS_PORT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.simulation.devs.model.devsModel.impl.CouplingImpl <em>Coupling</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.simulation.devs.model.devsModel.impl.CouplingImpl
	 * @see org.simulation.devs.model.devsModel.impl.DevsModelPackageImpl#getCoupling()
	 * @generated
	 */
	int COUPLING = 5;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUPLING__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUPLING__TARGET = 1;

	/**
	 * The feature id for the '<em><b>Source Connection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUPLING__SOURCE_CONNECTION = 2;

	/**
	 * The number of structural features of the '<em>Coupling</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUPLING_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Coupling</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUPLING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.simulation.devs.model.devsModel.impl.InputImpl <em>Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.simulation.devs.model.devsModel.impl.InputImpl
	 * @see org.simulation.devs.model.devsModel.impl.DevsModelPackageImpl#getInput()
	 * @generated
	 */
	int INPUT = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__NAME = DEVS_PORT__NAME;

	/**
	 * The feature id for the '<em><b>Contains Devs Coupling</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__CONTAINS_DEVS_COUPLING = DEVS_PORT__CONTAINS_DEVS_COUPLING;

	/**
	 * The feature id for the '<em><b>Target Connection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__TARGET_CONNECTION = DEVS_PORT__TARGET_CONNECTION;

	/**
	 * The number of structural features of the '<em>Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_FEATURE_COUNT = DEVS_PORT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_OPERATION_COUNT = DEVS_PORT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.simulation.devs.model.devsModel.impl.OutputImpl <em>Output</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.simulation.devs.model.devsModel.impl.OutputImpl
	 * @see org.simulation.devs.model.devsModel.impl.DevsModelPackageImpl#getOutput()
	 * @generated
	 */
	int OUTPUT = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__NAME = DEVS_PORT__NAME;

	/**
	 * The feature id for the '<em><b>Contains Devs Coupling</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__CONTAINS_DEVS_COUPLING = DEVS_PORT__CONTAINS_DEVS_COUPLING;

	/**
	 * The feature id for the '<em><b>Target Connection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__TARGET_CONNECTION = DEVS_PORT__TARGET_CONNECTION;

	/**
	 * The number of structural features of the '<em>Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_FEATURE_COUNT = DEVS_PORT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_OPERATION_COUNT = DEVS_PORT_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link org.simulation.devs.model.devsModel.DevsEditor <em>Devs Editor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Devs Editor</em>'.
	 * @see org.simulation.devs.model.devsModel.DevsEditor
	 * @generated
	 */
	EClass getDevsEditor();

	/**
	 * Returns the meta object for the containment reference list '{@link org.simulation.devs.model.devsModel.DevsEditor#getDevsmodel <em>Devsmodel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Devsmodel</em>'.
	 * @see org.simulation.devs.model.devsModel.DevsEditor#getDevsmodel()
	 * @see #getDevsEditor()
	 * @generated
	 */
	EReference getDevsEditor_Devsmodel();

	/**
	 * Returns the meta object for the containment reference list '{@link org.simulation.devs.model.devsModel.DevsEditor#getDevsport <em>Devsport</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Devsport</em>'.
	 * @see org.simulation.devs.model.devsModel.DevsEditor#getDevsport()
	 * @see #getDevsEditor()
	 * @generated
	 */
	EReference getDevsEditor_Devsport();

	/**
	 * Returns the meta object for the containment reference list '{@link org.simulation.devs.model.devsModel.DevsEditor#getDevscoupling <em>Devscoupling</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Devscoupling</em>'.
	 * @see org.simulation.devs.model.devsModel.DevsEditor#getDevscoupling()
	 * @see #getDevsEditor()
	 * @generated
	 */
	EReference getDevsEditor_Devscoupling();

	/**
	 * Returns the meta object for class '{@link org.simulation.devs.model.devsModel.DevsModel <em>Devs Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Devs Model</em>'.
	 * @see org.simulation.devs.model.devsModel.DevsModel
	 * @generated
	 */
	EClass getDevsModel();

	/**
	 * Returns the meta object for the containment reference list '{@link org.simulation.devs.model.devsModel.DevsModel#getContainsDevsPort <em>Contains Devs Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contains Devs Port</em>'.
	 * @see org.simulation.devs.model.devsModel.DevsModel#getContainsDevsPort()
	 * @see #getDevsModel()
	 * @generated
	 */
	EReference getDevsModel_ContainsDevsPort();

	/**
	 * Returns the meta object for the attribute '{@link org.simulation.devs.model.devsModel.DevsModel#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.simulation.devs.model.devsModel.DevsModel#getName()
	 * @see #getDevsModel()
	 * @generated
	 */
	EAttribute getDevsModel_Name();

	/**
	 * Returns the meta object for class '{@link org.simulation.devs.model.devsModel.DevsAtomicModel <em>Devs Atomic Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Devs Atomic Model</em>'.
	 * @see org.simulation.devs.model.devsModel.DevsAtomicModel
	 * @generated
	 */
	EClass getDevsAtomicModel();

	/**
	 * Returns the meta object for class '{@link org.simulation.devs.model.devsModel.DevsCoupleModel <em>Devs Couple Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Devs Couple Model</em>'.
	 * @see org.simulation.devs.model.devsModel.DevsCoupleModel
	 * @generated
	 */
	EClass getDevsCoupleModel();

	/**
	 * Returns the meta object for the containment reference list '{@link org.simulation.devs.model.devsModel.DevsCoupleModel#getContainsDevsModel <em>Contains Devs Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contains Devs Model</em>'.
	 * @see org.simulation.devs.model.devsModel.DevsCoupleModel#getContainsDevsModel()
	 * @see #getDevsCoupleModel()
	 * @generated
	 */
	EReference getDevsCoupleModel_ContainsDevsModel();

	/**
	 * Returns the meta object for the containment reference list '{@link org.simulation.devs.model.devsModel.DevsCoupleModel#getContainsDevsAtomicModel <em>Contains Devs Atomic Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contains Devs Atomic Model</em>'.
	 * @see org.simulation.devs.model.devsModel.DevsCoupleModel#getContainsDevsAtomicModel()
	 * @see #getDevsCoupleModel()
	 * @generated
	 */
	EReference getDevsCoupleModel_ContainsDevsAtomicModel();

	/**
	 * Returns the meta object for class '{@link org.simulation.devs.model.devsModel.DevsPort <em>Devs Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Devs Port</em>'.
	 * @see org.simulation.devs.model.devsModel.DevsPort
	 * @generated
	 */
	EClass getDevsPort();

	/**
	 * Returns the meta object for the attribute '{@link org.simulation.devs.model.devsModel.DevsPort#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.simulation.devs.model.devsModel.DevsPort#getName()
	 * @see #getDevsPort()
	 * @generated
	 */
	EAttribute getDevsPort_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.simulation.devs.model.devsModel.DevsPort#getContainsDevsCoupling <em>Contains Devs Coupling</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contains Devs Coupling</em>'.
	 * @see org.simulation.devs.model.devsModel.DevsPort#getContainsDevsCoupling()
	 * @see #getDevsPort()
	 * @generated
	 */
	EReference getDevsPort_ContainsDevsCoupling();

	/**
	 * Returns the meta object for the reference '{@link org.simulation.devs.model.devsModel.DevsPort#getTargetConnection <em>Target Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Connection</em>'.
	 * @see org.simulation.devs.model.devsModel.DevsPort#getTargetConnection()
	 * @see #getDevsPort()
	 * @generated
	 */
	EReference getDevsPort_TargetConnection();

	/**
	 * Returns the meta object for class '{@link org.simulation.devs.model.devsModel.Coupling <em>Coupling</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Coupling</em>'.
	 * @see org.simulation.devs.model.devsModel.Coupling
	 * @generated
	 */
	EClass getCoupling();

	/**
	 * Returns the meta object for the reference '{@link org.simulation.devs.model.devsModel.Coupling#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.simulation.devs.model.devsModel.Coupling#getSource()
	 * @see #getCoupling()
	 * @generated
	 */
	EReference getCoupling_Source();

	/**
	 * Returns the meta object for the reference '{@link org.simulation.devs.model.devsModel.Coupling#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.simulation.devs.model.devsModel.Coupling#getTarget()
	 * @see #getCoupling()
	 * @generated
	 */
	EReference getCoupling_Target();

	/**
	 * Returns the meta object for the reference '{@link org.simulation.devs.model.devsModel.Coupling#getSourceConnection <em>Source Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source Connection</em>'.
	 * @see org.simulation.devs.model.devsModel.Coupling#getSourceConnection()
	 * @see #getCoupling()
	 * @generated
	 */
	EReference getCoupling_SourceConnection();

	/**
	 * Returns the meta object for class '{@link org.simulation.devs.model.devsModel.Input <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input</em>'.
	 * @see org.simulation.devs.model.devsModel.Input
	 * @generated
	 */
	EClass getInput();

	/**
	 * Returns the meta object for class '{@link org.simulation.devs.model.devsModel.Output <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output</em>'.
	 * @see org.simulation.devs.model.devsModel.Output
	 * @generated
	 */
	EClass getOutput();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DevsModelFactory getDevsModelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.simulation.devs.model.devsModel.impl.DevsEditorImpl <em>Devs Editor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.simulation.devs.model.devsModel.impl.DevsEditorImpl
		 * @see org.simulation.devs.model.devsModel.impl.DevsModelPackageImpl#getDevsEditor()
		 * @generated
		 */
		EClass DEVS_EDITOR = eINSTANCE.getDevsEditor();

		/**
		 * The meta object literal for the '<em><b>Devsmodel</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVS_EDITOR__DEVSMODEL = eINSTANCE.getDevsEditor_Devsmodel();

		/**
		 * The meta object literal for the '<em><b>Devsport</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVS_EDITOR__DEVSPORT = eINSTANCE.getDevsEditor_Devsport();

		/**
		 * The meta object literal for the '<em><b>Devscoupling</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVS_EDITOR__DEVSCOUPLING = eINSTANCE.getDevsEditor_Devscoupling();

		/**
		 * The meta object literal for the '{@link org.simulation.devs.model.devsModel.impl.DevsModelImpl <em>Devs Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.simulation.devs.model.devsModel.impl.DevsModelImpl
		 * @see org.simulation.devs.model.devsModel.impl.DevsModelPackageImpl#getDevsModel()
		 * @generated
		 */
		EClass DEVS_MODEL = eINSTANCE.getDevsModel();

		/**
		 * The meta object literal for the '<em><b>Contains Devs Port</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVS_MODEL__CONTAINS_DEVS_PORT = eINSTANCE.getDevsModel_ContainsDevsPort();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVS_MODEL__NAME = eINSTANCE.getDevsModel_Name();

		/**
		 * The meta object literal for the '{@link org.simulation.devs.model.devsModel.impl.DevsAtomicModelImpl <em>Devs Atomic Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.simulation.devs.model.devsModel.impl.DevsAtomicModelImpl
		 * @see org.simulation.devs.model.devsModel.impl.DevsModelPackageImpl#getDevsAtomicModel()
		 * @generated
		 */
		EClass DEVS_ATOMIC_MODEL = eINSTANCE.getDevsAtomicModel();

		/**
		 * The meta object literal for the '{@link org.simulation.devs.model.devsModel.impl.DevsCoupleModelImpl <em>Devs Couple Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.simulation.devs.model.devsModel.impl.DevsCoupleModelImpl
		 * @see org.simulation.devs.model.devsModel.impl.DevsModelPackageImpl#getDevsCoupleModel()
		 * @generated
		 */
		EClass DEVS_COUPLE_MODEL = eINSTANCE.getDevsCoupleModel();

		/**
		 * The meta object literal for the '<em><b>Contains Devs Model</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVS_COUPLE_MODEL__CONTAINS_DEVS_MODEL = eINSTANCE.getDevsCoupleModel_ContainsDevsModel();

		/**
		 * The meta object literal for the '<em><b>Contains Devs Atomic Model</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVS_COUPLE_MODEL__CONTAINS_DEVS_ATOMIC_MODEL = eINSTANCE
				.getDevsCoupleModel_ContainsDevsAtomicModel();

		/**
		 * The meta object literal for the '{@link org.simulation.devs.model.devsModel.impl.DevsPortImpl <em>Devs Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.simulation.devs.model.devsModel.impl.DevsPortImpl
		 * @see org.simulation.devs.model.devsModel.impl.DevsModelPackageImpl#getDevsPort()
		 * @generated
		 */
		EClass DEVS_PORT = eINSTANCE.getDevsPort();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVS_PORT__NAME = eINSTANCE.getDevsPort_Name();

		/**
		 * The meta object literal for the '<em><b>Contains Devs Coupling</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVS_PORT__CONTAINS_DEVS_COUPLING = eINSTANCE.getDevsPort_ContainsDevsCoupling();

		/**
		 * The meta object literal for the '<em><b>Target Connection</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVS_PORT__TARGET_CONNECTION = eINSTANCE.getDevsPort_TargetConnection();

		/**
		 * The meta object literal for the '{@link org.simulation.devs.model.devsModel.impl.CouplingImpl <em>Coupling</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.simulation.devs.model.devsModel.impl.CouplingImpl
		 * @see org.simulation.devs.model.devsModel.impl.DevsModelPackageImpl#getCoupling()
		 * @generated
		 */
		EClass COUPLING = eINSTANCE.getCoupling();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COUPLING__SOURCE = eINSTANCE.getCoupling_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COUPLING__TARGET = eINSTANCE.getCoupling_Target();

		/**
		 * The meta object literal for the '<em><b>Source Connection</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COUPLING__SOURCE_CONNECTION = eINSTANCE.getCoupling_SourceConnection();

		/**
		 * The meta object literal for the '{@link org.simulation.devs.model.devsModel.impl.InputImpl <em>Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.simulation.devs.model.devsModel.impl.InputImpl
		 * @see org.simulation.devs.model.devsModel.impl.DevsModelPackageImpl#getInput()
		 * @generated
		 */
		EClass INPUT = eINSTANCE.getInput();

		/**
		 * The meta object literal for the '{@link org.simulation.devs.model.devsModel.impl.OutputImpl <em>Output</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.simulation.devs.model.devsModel.impl.OutputImpl
		 * @see org.simulation.devs.model.devsModel.impl.DevsModelPackageImpl#getOutput()
		 * @generated
		 */
		EClass OUTPUT = eINSTANCE.getOutput();

	}

} //DevsModelPackage
