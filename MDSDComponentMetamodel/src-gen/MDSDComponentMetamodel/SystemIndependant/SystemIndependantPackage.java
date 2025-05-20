/**
 */
package MDSDComponentMetamodel.SystemIndependant;

import MDSDComponentMetamodel.MDSDComponentMetamodelPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see MDSDComponentMetamodel.SystemIndependant.SystemIndependantFactory
 * @model kind="package"
 * @generated
 */
public interface SystemIndependantPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "SystemIndependant";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/SystemIndependant";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "SystemIndependant";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SystemIndependantPackage eINSTANCE = MDSDComponentMetamodel.SystemIndependant.impl.SystemIndependantPackageImpl
			.init();

	/**
	 * The meta object id for the '{@link MDSDComponentMetamodel.SystemIndependant.impl.ServiceImpl <em>Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MDSDComponentMetamodel.SystemIndependant.impl.ServiceImpl
	 * @see MDSDComponentMetamodel.SystemIndependant.impl.SystemIndependantPackageImpl#getService()
	 * @generated
	 */
	int SERVICE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__NAME = MDSDComponentMetamodelPackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Corresponding Signature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__CORRESPONDING_SIGNATURE = MDSDComponentMetamodelPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FEATURE_COUNT = MDSDComponentMetamodelPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_OPERATION_COUNT = MDSDComponentMetamodelPackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MDSDComponentMetamodel.SystemIndependant.impl.TypeImpl <em>Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MDSDComponentMetamodel.SystemIndependant.impl.TypeImpl
	 * @see MDSDComponentMetamodel.SystemIndependant.impl.SystemIndependantPackageImpl#getType()
	 * @generated
	 */
	int TYPE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__NAME = MDSDComponentMetamodelPackage.NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_FEATURE_COUNT = MDSDComponentMetamodelPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_OPERATION_COUNT = MDSDComponentMetamodelPackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MDSDComponentMetamodel.SystemIndependant.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MDSDComponentMetamodel.SystemIndependant.impl.ParameterImpl
	 * @see MDSDComponentMetamodel.SystemIndependant.impl.SystemIndependantPackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__NAME = MDSDComponentMetamodelPackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__TYPE = MDSDComponentMetamodelPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = MDSDComponentMetamodelPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OPERATION_COUNT = MDSDComponentMetamodelPackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MDSDComponentMetamodel.SystemIndependant.impl.RepositoryImpl <em>Repository</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MDSDComponentMetamodel.SystemIndependant.impl.RepositoryImpl
	 * @see MDSDComponentMetamodel.SystemIndependant.impl.SystemIndependantPackageImpl#getRepository()
	 * @generated
	 */
	int REPOSITORY = 3;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__COMPONENTS = 0;

	/**
	 * The feature id for the '<em><b>Interfaces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__INTERFACES = 1;

	/**
	 * The feature id for the '<em><b>Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__TYPES = 2;

	/**
	 * The number of structural features of the '<em>Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link MDSDComponentMetamodel.SystemIndependant.impl.ComplexTypeImpl <em>Complex Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MDSDComponentMetamodel.SystemIndependant.impl.ComplexTypeImpl
	 * @see MDSDComponentMetamodel.SystemIndependant.impl.SystemIndependantPackageImpl#getComplexType()
	 * @generated
	 */
	int COMPLEX_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_TYPE__NAME = TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_TYPE__TYPE = TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_TYPE__ATTRIBUTES = TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Complex Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Complex Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_TYPE_OPERATION_COUNT = TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MDSDComponentMetamodel.SystemIndependant.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MDSDComponentMetamodel.SystemIndependant.impl.ActionImpl
	 * @see MDSDComponentMetamodel.SystemIndependant.impl.SystemIndependantPackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__NAME = MDSDComponentMetamodelPackage.NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_FEATURE_COUNT = MDSDComponentMetamodelPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_OPERATION_COUNT = MDSDComponentMetamodelPackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MDSDComponentMetamodel.SystemIndependant.impl.ExternalCallImpl <em>External Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MDSDComponentMetamodel.SystemIndependant.impl.ExternalCallImpl
	 * @see MDSDComponentMetamodel.SystemIndependant.impl.SystemIndependantPackageImpl#getExternalCall()
	 * @generated
	 */
	int EXTERNAL_CALL = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_CALL__NAME = ACTION__NAME;

	/**
	 * The number of structural features of the '<em>External Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_CALL_FEATURE_COUNT = ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>External Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_CALL_OPERATION_COUNT = ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MDSDComponentMetamodel.SystemIndependant.impl.SignatureImpl <em>Signature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MDSDComponentMetamodel.SystemIndependant.impl.SignatureImpl
	 * @see MDSDComponentMetamodel.SystemIndependant.impl.SystemIndependantPackageImpl#getSignature()
	 * @generated
	 */
	int SIGNATURE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE__NAME = MDSDComponentMetamodelPackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE__PARAMETERS = MDSDComponentMetamodelPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE__RETURN_TYPE = MDSDComponentMetamodelPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Signature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE_FEATURE_COUNT = MDSDComponentMetamodelPackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Signature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE_OPERATION_COUNT = MDSDComponentMetamodelPackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MDSDComponentMetamodel.SystemIndependant.impl.InternalActionImpl <em>Internal Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MDSDComponentMetamodel.SystemIndependant.impl.InternalActionImpl
	 * @see MDSDComponentMetamodel.SystemIndependant.impl.SystemIndependantPackageImpl#getInternalAction()
	 * @generated
	 */
	int INTERNAL_ACTION = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ACTION__NAME = ACTION__NAME;

	/**
	 * The number of structural features of the '<em>Internal Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Internal Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ACTION_OPERATION_COUNT = ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MDSDComponentMetamodel.SystemIndependant.impl.BranchImpl <em>Branch</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MDSDComponentMetamodel.SystemIndependant.impl.BranchImpl
	 * @see MDSDComponentMetamodel.SystemIndependant.impl.SystemIndependantPackageImpl#getBranch()
	 * @generated
	 */
	int BRANCH = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH__NAME = ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH__ACTIONS = ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH__CONDITION = ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Branch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_FEATURE_COUNT = ACTION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Branch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_OPERATION_COUNT = ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MDSDComponentMetamodel.SystemIndependant.impl.InterfaceImpl <em>Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MDSDComponentMetamodel.SystemIndependant.impl.InterfaceImpl
	 * @see MDSDComponentMetamodel.SystemIndependant.impl.SystemIndependantPackageImpl#getInterface()
	 * @generated
	 */
	int INTERFACE = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__NAME = MDSDComponentMetamodelPackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Signatures</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__SIGNATURES = MDSDComponentMetamodelPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_FEATURE_COUNT = MDSDComponentMetamodelPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_OPERATION_COUNT = MDSDComponentMetamodelPackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MDSDComponentMetamodel.SystemIndependant.impl.ComponentImpl <em>Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MDSDComponentMetamodel.SystemIndependant.impl.ComponentImpl
	 * @see MDSDComponentMetamodel.SystemIndependant.impl.SystemIndependantPackageImpl#getComponent()
	 * @generated
	 */
	int COMPONENT = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__NAME = MDSDComponentMetamodelPackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Provided Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__PROVIDED_INTERFACES = MDSDComponentMetamodelPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Provided Services</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__PROVIDED_SERVICES = MDSDComponentMetamodelPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Required Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__REQUIRED_INTERFACES = MDSDComponentMetamodelPackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Behavior Description</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__BEHAVIOR_DESCRIPTION = MDSDComponentMetamodelPackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_FEATURE_COUNT = MDSDComponentMetamodelPackage.NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_OPERATION_COUNT = MDSDComponentMetamodelPackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MDSDComponentMetamodel.SystemIndependant.impl.SimpleTypeImpl <em>Simple Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MDSDComponentMetamodel.SystemIndependant.impl.SimpleTypeImpl
	 * @see MDSDComponentMetamodel.SystemIndependant.impl.SystemIndependantPackageImpl#getSimpleType()
	 * @generated
	 */
	int SIMPLE_TYPE = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TYPE__NAME = TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TYPE__TYPE = TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Simple Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Simple Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TYPE_OPERATION_COUNT = TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MDSDComponentMetamodel.SystemIndependant.impl.BasicComponentImpl <em>Basic Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MDSDComponentMetamodel.SystemIndependant.impl.BasicComponentImpl
	 * @see MDSDComponentMetamodel.SystemIndependant.impl.SystemIndependantPackageImpl#getBasicComponent()
	 * @generated
	 */
	int BASIC_COMPONENT = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_COMPONENT__NAME = COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Provided Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_COMPONENT__PROVIDED_INTERFACES = COMPONENT__PROVIDED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Provided Services</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_COMPONENT__PROVIDED_SERVICES = COMPONENT__PROVIDED_SERVICES;

	/**
	 * The feature id for the '<em><b>Required Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_COMPONENT__REQUIRED_INTERFACES = COMPONENT__REQUIRED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Behavior Description</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_COMPONENT__BEHAVIOR_DESCRIPTION = COMPONENT__BEHAVIOR_DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Basic Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_COMPONENT_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Basic Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_COMPONENT_OPERATION_COUNT = COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MDSDComponentMetamodel.SystemIndependant.impl.LoopImpl <em>Loop</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MDSDComponentMetamodel.SystemIndependant.impl.LoopImpl
	 * @see MDSDComponentMetamodel.SystemIndependant.impl.SystemIndependantPackageImpl#getLoop()
	 * @generated
	 */
	int LOOP = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP__NAME = ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP__ACTIONS = ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP__CONDITION = ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Loop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_FEATURE_COUNT = ACTION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Loop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_OPERATION_COUNT = ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MDSDComponentMetamodel.SystemIndependant.SimpleTypeEnum <em>Simple Type Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MDSDComponentMetamodel.SystemIndependant.SimpleTypeEnum
	 * @see MDSDComponentMetamodel.SystemIndependant.impl.SystemIndependantPackageImpl#getSimpleTypeEnum()
	 * @generated
	 */
	int SIMPLE_TYPE_ENUM = 15;

	/**
	 * Returns the meta object for class '{@link MDSDComponentMetamodel.SystemIndependant.Service <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service</em>'.
	 * @see MDSDComponentMetamodel.SystemIndependant.Service
	 * @generated
	 */
	EClass getService();

	/**
	 * Returns the meta object for the reference '{@link MDSDComponentMetamodel.SystemIndependant.Service#getCorrespondingSignature <em>Corresponding Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Corresponding Signature</em>'.
	 * @see MDSDComponentMetamodel.SystemIndependant.Service#getCorrespondingSignature()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_CorrespondingSignature();

	/**
	 * Returns the meta object for class '{@link MDSDComponentMetamodel.SystemIndependant.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type</em>'.
	 * @see MDSDComponentMetamodel.SystemIndependant.Type
	 * @generated
	 */
	EClass getType();

	/**
	 * Returns the meta object for class '{@link MDSDComponentMetamodel.SystemIndependant.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see MDSDComponentMetamodel.SystemIndependant.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for the reference '{@link MDSDComponentMetamodel.SystemIndependant.Parameter#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see MDSDComponentMetamodel.SystemIndependant.Parameter#getType()
	 * @see #getParameter()
	 * @generated
	 */
	EReference getParameter_Type();

	/**
	 * Returns the meta object for class '{@link MDSDComponentMetamodel.SystemIndependant.Repository <em>Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Repository</em>'.
	 * @see MDSDComponentMetamodel.SystemIndependant.Repository
	 * @generated
	 */
	EClass getRepository();

	/**
	 * Returns the meta object for the containment reference list '{@link MDSDComponentMetamodel.SystemIndependant.Repository#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Components</em>'.
	 * @see MDSDComponentMetamodel.SystemIndependant.Repository#getComponents()
	 * @see #getRepository()
	 * @generated
	 */
	EReference getRepository_Components();

	/**
	 * Returns the meta object for the containment reference list '{@link MDSDComponentMetamodel.SystemIndependant.Repository#getInterfaces <em>Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interfaces</em>'.
	 * @see MDSDComponentMetamodel.SystemIndependant.Repository#getInterfaces()
	 * @see #getRepository()
	 * @generated
	 */
	EReference getRepository_Interfaces();

	/**
	 * Returns the meta object for the containment reference list '{@link MDSDComponentMetamodel.SystemIndependant.Repository#getTypes <em>Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Types</em>'.
	 * @see MDSDComponentMetamodel.SystemIndependant.Repository#getTypes()
	 * @see #getRepository()
	 * @generated
	 */
	EReference getRepository_Types();

	/**
	 * Returns the meta object for class '{@link MDSDComponentMetamodel.SystemIndependant.ComplexType <em>Complex Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Complex Type</em>'.
	 * @see MDSDComponentMetamodel.SystemIndependant.ComplexType
	 * @generated
	 */
	EClass getComplexType();

	/**
	 * Returns the meta object for the attribute '{@link MDSDComponentMetamodel.SystemIndependant.ComplexType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see MDSDComponentMetamodel.SystemIndependant.ComplexType#getType()
	 * @see #getComplexType()
	 * @generated
	 */
	EAttribute getComplexType_Type();

	/**
	 * Returns the meta object for the containment reference list '{@link MDSDComponentMetamodel.SystemIndependant.ComplexType#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see MDSDComponentMetamodel.SystemIndependant.ComplexType#getAttributes()
	 * @see #getComplexType()
	 * @generated
	 */
	EReference getComplexType_Attributes();

	/**
	 * Returns the meta object for class '{@link MDSDComponentMetamodel.SystemIndependant.ExternalCall <em>External Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>External Call</em>'.
	 * @see MDSDComponentMetamodel.SystemIndependant.ExternalCall
	 * @generated
	 */
	EClass getExternalCall();

	/**
	 * Returns the meta object for class '{@link MDSDComponentMetamodel.SystemIndependant.Signature <em>Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Signature</em>'.
	 * @see MDSDComponentMetamodel.SystemIndependant.Signature
	 * @generated
	 */
	EClass getSignature();

	/**
	 * Returns the meta object for the containment reference list '{@link MDSDComponentMetamodel.SystemIndependant.Signature#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see MDSDComponentMetamodel.SystemIndependant.Signature#getParameters()
	 * @see #getSignature()
	 * @generated
	 */
	EReference getSignature_Parameters();

	/**
	 * Returns the meta object for the reference '{@link MDSDComponentMetamodel.SystemIndependant.Signature#getReturnType <em>Return Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Return Type</em>'.
	 * @see MDSDComponentMetamodel.SystemIndependant.Signature#getReturnType()
	 * @see #getSignature()
	 * @generated
	 */
	EReference getSignature_ReturnType();

	/**
	 * Returns the meta object for class '{@link MDSDComponentMetamodel.SystemIndependant.InternalAction <em>Internal Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Internal Action</em>'.
	 * @see MDSDComponentMetamodel.SystemIndependant.InternalAction
	 * @generated
	 */
	EClass getInternalAction();

	/**
	 * Returns the meta object for class '{@link MDSDComponentMetamodel.SystemIndependant.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see MDSDComponentMetamodel.SystemIndependant.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for class '{@link MDSDComponentMetamodel.SystemIndependant.Branch <em>Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Branch</em>'.
	 * @see MDSDComponentMetamodel.SystemIndependant.Branch
	 * @generated
	 */
	EClass getBranch();

	/**
	 * Returns the meta object for the containment reference list '{@link MDSDComponentMetamodel.SystemIndependant.Branch#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actions</em>'.
	 * @see MDSDComponentMetamodel.SystemIndependant.Branch#getActions()
	 * @see #getBranch()
	 * @generated
	 */
	EReference getBranch_Actions();

	/**
	 * Returns the meta object for the attribute '{@link MDSDComponentMetamodel.SystemIndependant.Branch#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition</em>'.
	 * @see MDSDComponentMetamodel.SystemIndependant.Branch#getCondition()
	 * @see #getBranch()
	 * @generated
	 */
	EAttribute getBranch_Condition();

	/**
	 * Returns the meta object for class '{@link MDSDComponentMetamodel.SystemIndependant.Interface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface</em>'.
	 * @see MDSDComponentMetamodel.SystemIndependant.Interface
	 * @generated
	 */
	EClass getInterface();

	/**
	 * Returns the meta object for the containment reference list '{@link MDSDComponentMetamodel.SystemIndependant.Interface#getSignatures <em>Signatures</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Signatures</em>'.
	 * @see MDSDComponentMetamodel.SystemIndependant.Interface#getSignatures()
	 * @see #getInterface()
	 * @generated
	 */
	EReference getInterface_Signatures();

	/**
	 * Returns the meta object for class '{@link MDSDComponentMetamodel.SystemIndependant.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component</em>'.
	 * @see MDSDComponentMetamodel.SystemIndependant.Component
	 * @generated
	 */
	EClass getComponent();

	/**
	 * Returns the meta object for the reference list '{@link MDSDComponentMetamodel.SystemIndependant.Component#getProvidedInterfaces <em>Provided Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Provided Interfaces</em>'.
	 * @see MDSDComponentMetamodel.SystemIndependant.Component#getProvidedInterfaces()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_ProvidedInterfaces();

	/**
	 * Returns the meta object for the containment reference list '{@link MDSDComponentMetamodel.SystemIndependant.Component#getProvidedServices <em>Provided Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Provided Services</em>'.
	 * @see MDSDComponentMetamodel.SystemIndependant.Component#getProvidedServices()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_ProvidedServices();

	/**
	 * Returns the meta object for the reference list '{@link MDSDComponentMetamodel.SystemIndependant.Component#getRequiredInterfaces <em>Required Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Required Interfaces</em>'.
	 * @see MDSDComponentMetamodel.SystemIndependant.Component#getRequiredInterfaces()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_RequiredInterfaces();

	/**
	 * Returns the meta object for the containment reference list '{@link MDSDComponentMetamodel.SystemIndependant.Component#getBehaviorDescription <em>Behavior Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Behavior Description</em>'.
	 * @see MDSDComponentMetamodel.SystemIndependant.Component#getBehaviorDescription()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_BehaviorDescription();

	/**
	 * Returns the meta object for class '{@link MDSDComponentMetamodel.SystemIndependant.SimpleType <em>Simple Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Type</em>'.
	 * @see MDSDComponentMetamodel.SystemIndependant.SimpleType
	 * @generated
	 */
	EClass getSimpleType();

	/**
	 * Returns the meta object for the attribute '{@link MDSDComponentMetamodel.SystemIndependant.SimpleType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see MDSDComponentMetamodel.SystemIndependant.SimpleType#getType()
	 * @see #getSimpleType()
	 * @generated
	 */
	EAttribute getSimpleType_Type();

	/**
	 * Returns the meta object for class '{@link MDSDComponentMetamodel.SystemIndependant.BasicComponent <em>Basic Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Basic Component</em>'.
	 * @see MDSDComponentMetamodel.SystemIndependant.BasicComponent
	 * @generated
	 */
	EClass getBasicComponent();

	/**
	 * Returns the meta object for class '{@link MDSDComponentMetamodel.SystemIndependant.Loop <em>Loop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Loop</em>'.
	 * @see MDSDComponentMetamodel.SystemIndependant.Loop
	 * @generated
	 */
	EClass getLoop();

	/**
	 * Returns the meta object for the containment reference list '{@link MDSDComponentMetamodel.SystemIndependant.Loop#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actions</em>'.
	 * @see MDSDComponentMetamodel.SystemIndependant.Loop#getActions()
	 * @see #getLoop()
	 * @generated
	 */
	EReference getLoop_Actions();

	/**
	 * Returns the meta object for the attribute '{@link MDSDComponentMetamodel.SystemIndependant.Loop#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition</em>'.
	 * @see MDSDComponentMetamodel.SystemIndependant.Loop#getCondition()
	 * @see #getLoop()
	 * @generated
	 */
	EAttribute getLoop_Condition();

	/**
	 * Returns the meta object for enum '{@link MDSDComponentMetamodel.SystemIndependant.SimpleTypeEnum <em>Simple Type Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Simple Type Enum</em>'.
	 * @see MDSDComponentMetamodel.SystemIndependant.SimpleTypeEnum
	 * @generated
	 */
	EEnum getSimpleTypeEnum();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SystemIndependantFactory getSystemIndependantFactory();

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
		 * The meta object literal for the '{@link MDSDComponentMetamodel.SystemIndependant.impl.ServiceImpl <em>Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MDSDComponentMetamodel.SystemIndependant.impl.ServiceImpl
		 * @see MDSDComponentMetamodel.SystemIndependant.impl.SystemIndependantPackageImpl#getService()
		 * @generated
		 */
		EClass SERVICE = eINSTANCE.getService();

		/**
		 * The meta object literal for the '<em><b>Corresponding Signature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE__CORRESPONDING_SIGNATURE = eINSTANCE.getService_CorrespondingSignature();

		/**
		 * The meta object literal for the '{@link MDSDComponentMetamodel.SystemIndependant.impl.TypeImpl <em>Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MDSDComponentMetamodel.SystemIndependant.impl.TypeImpl
		 * @see MDSDComponentMetamodel.SystemIndependant.impl.SystemIndependantPackageImpl#getType()
		 * @generated
		 */
		EClass TYPE = eINSTANCE.getType();

		/**
		 * The meta object literal for the '{@link MDSDComponentMetamodel.SystemIndependant.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MDSDComponentMetamodel.SystemIndependant.impl.ParameterImpl
		 * @see MDSDComponentMetamodel.SystemIndependant.impl.SystemIndependantPackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER__TYPE = eINSTANCE.getParameter_Type();

		/**
		 * The meta object literal for the '{@link MDSDComponentMetamodel.SystemIndependant.impl.RepositoryImpl <em>Repository</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MDSDComponentMetamodel.SystemIndependant.impl.RepositoryImpl
		 * @see MDSDComponentMetamodel.SystemIndependant.impl.SystemIndependantPackageImpl#getRepository()
		 * @generated
		 */
		EClass REPOSITORY = eINSTANCE.getRepository();

		/**
		 * The meta object literal for the '<em><b>Components</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPOSITORY__COMPONENTS = eINSTANCE.getRepository_Components();

		/**
		 * The meta object literal for the '<em><b>Interfaces</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPOSITORY__INTERFACES = eINSTANCE.getRepository_Interfaces();

		/**
		 * The meta object literal for the '<em><b>Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPOSITORY__TYPES = eINSTANCE.getRepository_Types();

		/**
		 * The meta object literal for the '{@link MDSDComponentMetamodel.SystemIndependant.impl.ComplexTypeImpl <em>Complex Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MDSDComponentMetamodel.SystemIndependant.impl.ComplexTypeImpl
		 * @see MDSDComponentMetamodel.SystemIndependant.impl.SystemIndependantPackageImpl#getComplexType()
		 * @generated
		 */
		EClass COMPLEX_TYPE = eINSTANCE.getComplexType();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPLEX_TYPE__TYPE = eINSTANCE.getComplexType_Type();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPLEX_TYPE__ATTRIBUTES = eINSTANCE.getComplexType_Attributes();

		/**
		 * The meta object literal for the '{@link MDSDComponentMetamodel.SystemIndependant.impl.ExternalCallImpl <em>External Call</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MDSDComponentMetamodel.SystemIndependant.impl.ExternalCallImpl
		 * @see MDSDComponentMetamodel.SystemIndependant.impl.SystemIndependantPackageImpl#getExternalCall()
		 * @generated
		 */
		EClass EXTERNAL_CALL = eINSTANCE.getExternalCall();

		/**
		 * The meta object literal for the '{@link MDSDComponentMetamodel.SystemIndependant.impl.SignatureImpl <em>Signature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MDSDComponentMetamodel.SystemIndependant.impl.SignatureImpl
		 * @see MDSDComponentMetamodel.SystemIndependant.impl.SystemIndependantPackageImpl#getSignature()
		 * @generated
		 */
		EClass SIGNATURE = eINSTANCE.getSignature();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGNATURE__PARAMETERS = eINSTANCE.getSignature_Parameters();

		/**
		 * The meta object literal for the '<em><b>Return Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGNATURE__RETURN_TYPE = eINSTANCE.getSignature_ReturnType();

		/**
		 * The meta object literal for the '{@link MDSDComponentMetamodel.SystemIndependant.impl.InternalActionImpl <em>Internal Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MDSDComponentMetamodel.SystemIndependant.impl.InternalActionImpl
		 * @see MDSDComponentMetamodel.SystemIndependant.impl.SystemIndependantPackageImpl#getInternalAction()
		 * @generated
		 */
		EClass INTERNAL_ACTION = eINSTANCE.getInternalAction();

		/**
		 * The meta object literal for the '{@link MDSDComponentMetamodel.SystemIndependant.impl.ActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MDSDComponentMetamodel.SystemIndependant.impl.ActionImpl
		 * @see MDSDComponentMetamodel.SystemIndependant.impl.SystemIndependantPackageImpl#getAction()
		 * @generated
		 */
		EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '{@link MDSDComponentMetamodel.SystemIndependant.impl.BranchImpl <em>Branch</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MDSDComponentMetamodel.SystemIndependant.impl.BranchImpl
		 * @see MDSDComponentMetamodel.SystemIndependant.impl.SystemIndependantPackageImpl#getBranch()
		 * @generated
		 */
		EClass BRANCH = eINSTANCE.getBranch();

		/**
		 * The meta object literal for the '<em><b>Actions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BRANCH__ACTIONS = eINSTANCE.getBranch_Actions();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BRANCH__CONDITION = eINSTANCE.getBranch_Condition();

		/**
		 * The meta object literal for the '{@link MDSDComponentMetamodel.SystemIndependant.impl.InterfaceImpl <em>Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MDSDComponentMetamodel.SystemIndependant.impl.InterfaceImpl
		 * @see MDSDComponentMetamodel.SystemIndependant.impl.SystemIndependantPackageImpl#getInterface()
		 * @generated
		 */
		EClass INTERFACE = eINSTANCE.getInterface();

		/**
		 * The meta object literal for the '<em><b>Signatures</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE__SIGNATURES = eINSTANCE.getInterface_Signatures();

		/**
		 * The meta object literal for the '{@link MDSDComponentMetamodel.SystemIndependant.impl.ComponentImpl <em>Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MDSDComponentMetamodel.SystemIndependant.impl.ComponentImpl
		 * @see MDSDComponentMetamodel.SystemIndependant.impl.SystemIndependantPackageImpl#getComponent()
		 * @generated
		 */
		EClass COMPONENT = eINSTANCE.getComponent();

		/**
		 * The meta object literal for the '<em><b>Provided Interfaces</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__PROVIDED_INTERFACES = eINSTANCE.getComponent_ProvidedInterfaces();

		/**
		 * The meta object literal for the '<em><b>Provided Services</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__PROVIDED_SERVICES = eINSTANCE.getComponent_ProvidedServices();

		/**
		 * The meta object literal for the '<em><b>Required Interfaces</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__REQUIRED_INTERFACES = eINSTANCE.getComponent_RequiredInterfaces();

		/**
		 * The meta object literal for the '<em><b>Behavior Description</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__BEHAVIOR_DESCRIPTION = eINSTANCE.getComponent_BehaviorDescription();

		/**
		 * The meta object literal for the '{@link MDSDComponentMetamodel.SystemIndependant.impl.SimpleTypeImpl <em>Simple Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MDSDComponentMetamodel.SystemIndependant.impl.SimpleTypeImpl
		 * @see MDSDComponentMetamodel.SystemIndependant.impl.SystemIndependantPackageImpl#getSimpleType()
		 * @generated
		 */
		EClass SIMPLE_TYPE = eINSTANCE.getSimpleType();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_TYPE__TYPE = eINSTANCE.getSimpleType_Type();

		/**
		 * The meta object literal for the '{@link MDSDComponentMetamodel.SystemIndependant.impl.BasicComponentImpl <em>Basic Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MDSDComponentMetamodel.SystemIndependant.impl.BasicComponentImpl
		 * @see MDSDComponentMetamodel.SystemIndependant.impl.SystemIndependantPackageImpl#getBasicComponent()
		 * @generated
		 */
		EClass BASIC_COMPONENT = eINSTANCE.getBasicComponent();

		/**
		 * The meta object literal for the '{@link MDSDComponentMetamodel.SystemIndependant.impl.LoopImpl <em>Loop</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MDSDComponentMetamodel.SystemIndependant.impl.LoopImpl
		 * @see MDSDComponentMetamodel.SystemIndependant.impl.SystemIndependantPackageImpl#getLoop()
		 * @generated
		 */
		EClass LOOP = eINSTANCE.getLoop();

		/**
		 * The meta object literal for the '<em><b>Actions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOOP__ACTIONS = eINSTANCE.getLoop_Actions();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOOP__CONDITION = eINSTANCE.getLoop_Condition();

		/**
		 * The meta object literal for the '{@link MDSDComponentMetamodel.SystemIndependant.SimpleTypeEnum <em>Simple Type Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MDSDComponentMetamodel.SystemIndependant.SimpleTypeEnum
		 * @see MDSDComponentMetamodel.SystemIndependant.impl.SystemIndependantPackageImpl#getSimpleTypeEnum()
		 * @generated
		 */
		EEnum SIMPLE_TYPE_ENUM = eINSTANCE.getSimpleTypeEnum();

	}

} //SystemIndependantPackage
