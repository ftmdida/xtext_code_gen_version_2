/**
 */
package org.xtext.example.mydsl.myDslSample;

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
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.xtext.example.mydsl.myDslSample.MyDslSampleFactory
 * @model kind="package"
 * @generated
 */
public interface MyDslSamplePackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "myDslSample";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.xtext.org/example/mydsl/MyDslSample";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "myDslSample";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  MyDslSamplePackage eINSTANCE = org.xtext.example.mydsl.myDslSample.impl.MyDslSamplePackageImpl.init();

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDslSample.impl.HttpShieldModelImpl <em>Http Shield Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDslSample.impl.HttpShieldModelImpl
   * @see org.xtext.example.mydsl.myDslSample.impl.MyDslSamplePackageImpl#getHttpShieldModel()
   * @generated
   */
  int HTTP_SHIELD_MODEL = 0;

  /**
   * The feature id for the '<em><b>Agents</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HTTP_SHIELD_MODEL__AGENTS = 0;

  /**
   * The number of structural features of the '<em>Http Shield Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HTTP_SHIELD_MODEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDslSample.impl.AgentImpl <em>Agent</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDslSample.impl.AgentImpl
   * @see org.xtext.example.mydsl.myDslSample.impl.MyDslSamplePackageImpl#getAgent()
   * @generated
   */
  int AGENT = 1;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AGENT__TYPE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AGENT__NAME = 1;

  /**
   * The feature id for the '<em><b>Filename</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AGENT__FILENAME = 2;

  /**
   * The feature id for the '<em><b>Source</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AGENT__SOURCE = 3;

  /**
   * The number of structural features of the '<em>Agent</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AGENT_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDslSample.impl.UserImpl <em>User</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDslSample.impl.UserImpl
   * @see org.xtext.example.mydsl.myDslSample.impl.MyDslSamplePackageImpl#getUser()
   * @generated
   */
  int USER = 2;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USER__TYPE = AGENT__TYPE;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USER__NAME = AGENT__NAME;

  /**
   * The feature id for the '<em><b>Filename</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USER__FILENAME = AGENT__FILENAME;

  /**
   * The feature id for the '<em><b>Source</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USER__SOURCE = AGENT__SOURCE;

  /**
   * The feature id for the '<em><b>Requests</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USER__REQUESTS = AGENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>User</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USER_FEATURE_COUNT = AGENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDslSample.impl.AttackerImpl <em>Attacker</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDslSample.impl.AttackerImpl
   * @see org.xtext.example.mydsl.myDslSample.impl.MyDslSamplePackageImpl#getAttacker()
   * @generated
   */
  int ATTACKER = 3;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTACKER__TYPE = AGENT__TYPE;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTACKER__NAME = AGENT__NAME;

  /**
   * The feature id for the '<em><b>Filename</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTACKER__FILENAME = AGENT__FILENAME;

  /**
   * The feature id for the '<em><b>Source</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTACKER__SOURCE = AGENT__SOURCE;

  /**
   * The feature id for the '<em><b>Requests</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTACKER__REQUESTS = AGENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Attacker</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTACKER_FEATURE_COUNT = AGENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDslSample.impl.RequestImpl <em>Request</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDslSample.impl.RequestImpl
   * @see org.xtext.example.mydsl.myDslSample.impl.MyDslSamplePackageImpl#getRequest()
   * @generated
   */
  int REQUEST = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUEST__NAME = 0;

  /**
   * The feature id for the '<em><b>Source</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUEST__SOURCE = 1;

  /**
   * The feature id for the '<em><b>Destination</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUEST__DESTINATION = 2;

  /**
   * The feature id for the '<em><b>Port</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUEST__PORT = 3;

  /**
   * The feature id for the '<em><b>Data</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUEST__DATA = 4;

  /**
   * The feature id for the '<em><b>Protocol</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUEST__PROTOCOL = 5;

  /**
   * The number of structural features of the '<em>Request</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUEST_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDslSample.impl.MaliciousRequestImpl <em>Malicious Request</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDslSample.impl.MaliciousRequestImpl
   * @see org.xtext.example.mydsl.myDslSample.impl.MyDslSamplePackageImpl#getMaliciousRequest()
   * @generated
   */
  int MALICIOUS_REQUEST = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MALICIOUS_REQUEST__NAME = REQUEST__NAME;

  /**
   * The feature id for the '<em><b>Source</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MALICIOUS_REQUEST__SOURCE = REQUEST__SOURCE;

  /**
   * The feature id for the '<em><b>Destination</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MALICIOUS_REQUEST__DESTINATION = REQUEST__DESTINATION;

  /**
   * The feature id for the '<em><b>Port</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MALICIOUS_REQUEST__PORT = REQUEST__PORT;

  /**
   * The feature id for the '<em><b>Data</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MALICIOUS_REQUEST__DATA = REQUEST__DATA;

  /**
   * The feature id for the '<em><b>Protocol</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MALICIOUS_REQUEST__PROTOCOL = REQUEST__PROTOCOL;

  /**
   * The number of structural features of the '<em>Malicious Request</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MALICIOUS_REQUEST_FEATURE_COUNT = REQUEST_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDslSample.impl.NormalRequestImpl <em>Normal Request</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDslSample.impl.NormalRequestImpl
   * @see org.xtext.example.mydsl.myDslSample.impl.MyDslSamplePackageImpl#getNormalRequest()
   * @generated
   */
  int NORMAL_REQUEST = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NORMAL_REQUEST__NAME = REQUEST__NAME;

  /**
   * The feature id for the '<em><b>Source</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NORMAL_REQUEST__SOURCE = REQUEST__SOURCE;

  /**
   * The feature id for the '<em><b>Destination</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NORMAL_REQUEST__DESTINATION = REQUEST__DESTINATION;

  /**
   * The feature id for the '<em><b>Port</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NORMAL_REQUEST__PORT = REQUEST__PORT;

  /**
   * The feature id for the '<em><b>Data</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NORMAL_REQUEST__DATA = REQUEST__DATA;

  /**
   * The feature id for the '<em><b>Protocol</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NORMAL_REQUEST__PROTOCOL = REQUEST__PROTOCOL;

  /**
   * The number of structural features of the '<em>Normal Request</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NORMAL_REQUEST_FEATURE_COUNT = REQUEST_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDslSample.impl.DefenderImpl <em>Defender</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDslSample.impl.DefenderImpl
   * @see org.xtext.example.mydsl.myDslSample.impl.MyDslSamplePackageImpl#getDefender()
   * @generated
   */
  int DEFENDER = 7;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFENDER__TYPE = AGENT__TYPE;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFENDER__NAME = AGENT__NAME;

  /**
   * The feature id for the '<em><b>Filename</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFENDER__FILENAME = AGENT__FILENAME;

  /**
   * The feature id for the '<em><b>Source</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFENDER__SOURCE = AGENT__SOURCE;

  /**
   * The feature id for the '<em><b>Security Policylist</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFENDER__SECURITY_POLICYLIST = AGENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Defender</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFENDER_FEATURE_COUNT = AGENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDslSample.impl.SecurityPolicyListImpl <em>Security Policy List</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDslSample.impl.SecurityPolicyListImpl
   * @see org.xtext.example.mydsl.myDslSample.impl.MyDslSamplePackageImpl#getSecurityPolicyList()
   * @generated
   */
  int SECURITY_POLICY_LIST = 8;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECURITY_POLICY_LIST__NAME = 0;

  /**
   * The feature id for the '<em><b>Security Policies</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECURITY_POLICY_LIST__SECURITY_POLICIES = 1;

  /**
   * The feature id for the '<em><b>Conditions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECURITY_POLICY_LIST__CONDITIONS = 2;

  /**
   * The number of structural features of the '<em>Security Policy List</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECURITY_POLICY_LIST_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDslSample.impl.SecurityPolicyImpl <em>Security Policy</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDslSample.impl.SecurityPolicyImpl
   * @see org.xtext.example.mydsl.myDslSample.impl.MyDslSamplePackageImpl#getSecurityPolicy()
   * @generated
   */
  int SECURITY_POLICY = 9;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECURITY_POLICY__NAME = 0;

  /**
   * The feature id for the '<em><b>End Point</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECURITY_POLICY__END_POINT = 1;

  /**
   * The feature id for the '<em><b>Conditionlist</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECURITY_POLICY__CONDITIONLIST = 2;

  /**
   * The feature id for the '<em><b>Operation List</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECURITY_POLICY__OPERATION_LIST = 3;

  /**
   * The feature id for the '<em><b>True Action List</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECURITY_POLICY__TRUE_ACTION_LIST = 4;

  /**
   * The feature id for the '<em><b>False Action List</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECURITY_POLICY__FALSE_ACTION_LIST = 5;

  /**
   * The number of structural features of the '<em>Security Policy</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECURITY_POLICY_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDslSample.impl.ConditionImpl <em>Condition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDslSample.impl.ConditionImpl
   * @see org.xtext.example.mydsl.myDslSample.impl.MyDslSamplePackageImpl#getCondition()
   * @generated
   */
  int CONDITION = 10;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION__NAME = 0;

  /**
   * The feature id for the '<em><b>Sub Condition List</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION__SUB_CONDITION_LIST = 1;

  /**
   * The number of structural features of the '<em>Condition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDslSample.impl.ActionImpl <em>Action</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDslSample.impl.ActionImpl
   * @see org.xtext.example.mydsl.myDslSample.impl.MyDslSamplePackageImpl#getAction()
   * @generated
   */
  int ACTION = 11;

  /**
   * The feature id for the '<em><b>Action</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION__ACTION = 0;

  /**
   * The number of structural features of the '<em>Action</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDslSample.impl.SubConditionImpl <em>Sub Condition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDslSample.impl.SubConditionImpl
   * @see org.xtext.example.mydsl.myDslSample.impl.MyDslSamplePackageImpl#getSubCondition()
   * @generated
   */
  int SUB_CONDITION = 12;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_CONDITION__NAME = 0;

  /**
   * The number of structural features of the '<em>Sub Condition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_CONDITION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDslSample.impl.ProtocolCheckImpl <em>Protocol Check</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDslSample.impl.ProtocolCheckImpl
   * @see org.xtext.example.mydsl.myDslSample.impl.MyDslSamplePackageImpl#getProtocolCheck()
   * @generated
   */
  int PROTOCOL_CHECK = 13;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROTOCOL_CHECK__NAME = SUB_CONDITION__NAME;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROTOCOL_CHECK__VALUE = SUB_CONDITION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Protocol Check</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROTOCOL_CHECK_FEATURE_COUNT = SUB_CONDITION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDslSample.impl.HTTPMethodCheckImpl <em>HTTP Method Check</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDslSample.impl.HTTPMethodCheckImpl
   * @see org.xtext.example.mydsl.myDslSample.impl.MyDslSamplePackageImpl#getHTTPMethodCheck()
   * @generated
   */
  int HTTP_METHOD_CHECK = 14;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HTTP_METHOD_CHECK__NAME = SUB_CONDITION__NAME;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HTTP_METHOD_CHECK__VALUE = SUB_CONDITION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>HTTP Method Check</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HTTP_METHOD_CHECK_FEATURE_COUNT = SUB_CONDITION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDslSample.impl.RegExpMatchImpl <em>Reg Exp Match</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDslSample.impl.RegExpMatchImpl
   * @see org.xtext.example.mydsl.myDslSample.impl.MyDslSamplePackageImpl#getRegExpMatch()
   * @generated
   */
  int REG_EXP_MATCH = 15;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REG_EXP_MATCH__NAME = SUB_CONDITION__NAME;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REG_EXP_MATCH__VALUE = SUB_CONDITION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Reg Exp Match</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REG_EXP_MATCH_FEATURE_COUNT = SUB_CONDITION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDslSample.impl.FrequencyCheckImpl <em>Frequency Check</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDslSample.impl.FrequencyCheckImpl
   * @see org.xtext.example.mydsl.myDslSample.impl.MyDslSamplePackageImpl#getFrequencyCheck()
   * @generated
   */
  int FREQUENCY_CHECK = 16;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FREQUENCY_CHECK__NAME = SUB_CONDITION__NAME;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FREQUENCY_CHECK__VALUE = SUB_CONDITION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Frequency Check</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FREQUENCY_CHECK_FEATURE_COUNT = SUB_CONDITION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDslSample.impl.HTTPParamLenCheckImpl <em>HTTP Param Len Check</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDslSample.impl.HTTPParamLenCheckImpl
   * @see org.xtext.example.mydsl.myDslSample.impl.MyDslSamplePackageImpl#getHTTPParamLenCheck()
   * @generated
   */
  int HTTP_PARAM_LEN_CHECK = 17;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HTTP_PARAM_LEN_CHECK__NAME = SUB_CONDITION__NAME;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HTTP_PARAM_LEN_CHECK__VALUE = SUB_CONDITION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>HTTP Param Len Check</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HTTP_PARAM_LEN_CHECK_FEATURE_COUNT = SUB_CONDITION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDslSample.impl.EndPointImpl <em>End Point</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDslSample.impl.EndPointImpl
   * @see org.xtext.example.mydsl.myDslSample.impl.MyDslSamplePackageImpl#getEndPoint()
   * @generated
   */
  int END_POINT = 18;

  /**
   * The feature id for the '<em><b>Port</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int END_POINT__PORT = 0;

  /**
   * The feature id for the '<em><b>Protocol</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int END_POINT__PROTOCOL = 1;

  /**
   * The number of structural features of the '<em>End Point</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int END_POINT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDslSample.impl.DropRequestImpl <em>Drop Request</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDslSample.impl.DropRequestImpl
   * @see org.xtext.example.mydsl.myDslSample.impl.MyDslSamplePackageImpl#getDropRequest()
   * @generated
   */
  int DROP_REQUEST = 19;

  /**
   * The feature id for the '<em><b>Action</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DROP_REQUEST__ACTION = ACTION__ACTION;

  /**
   * The number of structural features of the '<em>Drop Request</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DROP_REQUEST_FEATURE_COUNT = ACTION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDslSample.impl.BlockSenderImpl <em>Block Sender</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDslSample.impl.BlockSenderImpl
   * @see org.xtext.example.mydsl.myDslSample.impl.MyDslSamplePackageImpl#getBlockSender()
   * @generated
   */
  int BLOCK_SENDER = 20;

  /**
   * The feature id for the '<em><b>Action</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOCK_SENDER__ACTION = ACTION__ACTION;

  /**
   * The number of structural features of the '<em>Block Sender</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOCK_SENDER_FEATURE_COUNT = ACTION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDslSample.impl.PassRequestImpl <em>Pass Request</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDslSample.impl.PassRequestImpl
   * @see org.xtext.example.mydsl.myDslSample.impl.MyDslSamplePackageImpl#getPassRequest()
   * @generated
   */
  int PASS_REQUEST = 21;

  /**
   * The feature id for the '<em><b>Action</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PASS_REQUEST__ACTION = ACTION__ACTION;

  /**
   * The number of structural features of the '<em>Pass Request</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PASS_REQUEST_FEATURE_COUNT = ACTION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDslSample.impl.IPAddressImpl <em>IP Address</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDslSample.impl.IPAddressImpl
   * @see org.xtext.example.mydsl.myDslSample.impl.MyDslSamplePackageImpl#getIPAddress()
   * @generated
   */
  int IP_ADDRESS = 22;

  /**
   * The feature id for the '<em><b>Byte1</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IP_ADDRESS__BYTE1 = 0;

  /**
   * The feature id for the '<em><b>Byte2</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IP_ADDRESS__BYTE2 = 1;

  /**
   * The feature id for the '<em><b>Byte3</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IP_ADDRESS__BYTE3 = 2;

  /**
   * The feature id for the '<em><b>Byte4</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IP_ADDRESS__BYTE4 = 3;

  /**
   * The number of structural features of the '<em>IP Address</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IP_ADDRESS_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDslSample.Protocol <em>Protocol</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDslSample.Protocol
   * @see org.xtext.example.mydsl.myDslSample.impl.MyDslSamplePackageImpl#getProtocol()
   * @generated
   */
  int PROTOCOL = 23;


  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDslSample.HttpShieldModel <em>Http Shield Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Http Shield Model</em>'.
   * @see org.xtext.example.mydsl.myDslSample.HttpShieldModel
   * @generated
   */
  EClass getHttpShieldModel();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDslSample.HttpShieldModel#getAgents <em>Agents</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Agents</em>'.
   * @see org.xtext.example.mydsl.myDslSample.HttpShieldModel#getAgents()
   * @see #getHttpShieldModel()
   * @generated
   */
  EReference getHttpShieldModel_Agents();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDslSample.Agent <em>Agent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Agent</em>'.
   * @see org.xtext.example.mydsl.myDslSample.Agent
   * @generated
   */
  EClass getAgent();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDslSample.Agent#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see org.xtext.example.mydsl.myDslSample.Agent#getType()
   * @see #getAgent()
   * @generated
   */
  EAttribute getAgent_Type();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDslSample.Agent#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.mydsl.myDslSample.Agent#getName()
   * @see #getAgent()
   * @generated
   */
  EAttribute getAgent_Name();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDslSample.Agent#getFilename <em>Filename</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Filename</em>'.
   * @see org.xtext.example.mydsl.myDslSample.Agent#getFilename()
   * @see #getAgent()
   * @generated
   */
  EAttribute getAgent_Filename();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDslSample.Agent#getSource <em>Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Source</em>'.
   * @see org.xtext.example.mydsl.myDslSample.Agent#getSource()
   * @see #getAgent()
   * @generated
   */
  EReference getAgent_Source();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDslSample.User <em>User</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>User</em>'.
   * @see org.xtext.example.mydsl.myDslSample.User
   * @generated
   */
  EClass getUser();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDslSample.User#getRequests <em>Requests</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Requests</em>'.
   * @see org.xtext.example.mydsl.myDslSample.User#getRequests()
   * @see #getUser()
   * @generated
   */
  EReference getUser_Requests();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDslSample.Attacker <em>Attacker</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Attacker</em>'.
   * @see org.xtext.example.mydsl.myDslSample.Attacker
   * @generated
   */
  EClass getAttacker();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDslSample.Attacker#getRequests <em>Requests</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Requests</em>'.
   * @see org.xtext.example.mydsl.myDslSample.Attacker#getRequests()
   * @see #getAttacker()
   * @generated
   */
  EReference getAttacker_Requests();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDslSample.Request <em>Request</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Request</em>'.
   * @see org.xtext.example.mydsl.myDslSample.Request
   * @generated
   */
  EClass getRequest();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDslSample.Request#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.mydsl.myDslSample.Request#getName()
   * @see #getRequest()
   * @generated
   */
  EAttribute getRequest_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDslSample.Request#getSource <em>Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Source</em>'.
   * @see org.xtext.example.mydsl.myDslSample.Request#getSource()
   * @see #getRequest()
   * @generated
   */
  EReference getRequest_Source();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDslSample.Request#getDestination <em>Destination</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Destination</em>'.
   * @see org.xtext.example.mydsl.myDslSample.Request#getDestination()
   * @see #getRequest()
   * @generated
   */
  EReference getRequest_Destination();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDslSample.Request#getPort <em>Port</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Port</em>'.
   * @see org.xtext.example.mydsl.myDslSample.Request#getPort()
   * @see #getRequest()
   * @generated
   */
  EAttribute getRequest_Port();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDslSample.Request#getData <em>Data</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Data</em>'.
   * @see org.xtext.example.mydsl.myDslSample.Request#getData()
   * @see #getRequest()
   * @generated
   */
  EAttribute getRequest_Data();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDslSample.Request#getProtocol <em>Protocol</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Protocol</em>'.
   * @see org.xtext.example.mydsl.myDslSample.Request#getProtocol()
   * @see #getRequest()
   * @generated
   */
  EAttribute getRequest_Protocol();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDslSample.MaliciousRequest <em>Malicious Request</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Malicious Request</em>'.
   * @see org.xtext.example.mydsl.myDslSample.MaliciousRequest
   * @generated
   */
  EClass getMaliciousRequest();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDslSample.NormalRequest <em>Normal Request</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Normal Request</em>'.
   * @see org.xtext.example.mydsl.myDslSample.NormalRequest
   * @generated
   */
  EClass getNormalRequest();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDslSample.Defender <em>Defender</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Defender</em>'.
   * @see org.xtext.example.mydsl.myDslSample.Defender
   * @generated
   */
  EClass getDefender();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDslSample.Defender#getSecurityPolicylist <em>Security Policylist</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Security Policylist</em>'.
   * @see org.xtext.example.mydsl.myDslSample.Defender#getSecurityPolicylist()
   * @see #getDefender()
   * @generated
   */
  EReference getDefender_SecurityPolicylist();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDslSample.SecurityPolicyList <em>Security Policy List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Security Policy List</em>'.
   * @see org.xtext.example.mydsl.myDslSample.SecurityPolicyList
   * @generated
   */
  EClass getSecurityPolicyList();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDslSample.SecurityPolicyList#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.mydsl.myDslSample.SecurityPolicyList#getName()
   * @see #getSecurityPolicyList()
   * @generated
   */
  EAttribute getSecurityPolicyList_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDslSample.SecurityPolicyList#getSecurityPolicies <em>Security Policies</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Security Policies</em>'.
   * @see org.xtext.example.mydsl.myDslSample.SecurityPolicyList#getSecurityPolicies()
   * @see #getSecurityPolicyList()
   * @generated
   */
  EReference getSecurityPolicyList_SecurityPolicies();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDslSample.SecurityPolicyList#getConditions <em>Conditions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Conditions</em>'.
   * @see org.xtext.example.mydsl.myDslSample.SecurityPolicyList#getConditions()
   * @see #getSecurityPolicyList()
   * @generated
   */
  EReference getSecurityPolicyList_Conditions();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDslSample.SecurityPolicy <em>Security Policy</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Security Policy</em>'.
   * @see org.xtext.example.mydsl.myDslSample.SecurityPolicy
   * @generated
   */
  EClass getSecurityPolicy();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDslSample.SecurityPolicy#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.mydsl.myDslSample.SecurityPolicy#getName()
   * @see #getSecurityPolicy()
   * @generated
   */
  EAttribute getSecurityPolicy_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDslSample.SecurityPolicy#getEndPoint <em>End Point</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>End Point</em>'.
   * @see org.xtext.example.mydsl.myDslSample.SecurityPolicy#getEndPoint()
   * @see #getSecurityPolicy()
   * @generated
   */
  EReference getSecurityPolicy_EndPoint();

  /**
   * Returns the meta object for the reference list '{@link org.xtext.example.mydsl.myDslSample.SecurityPolicy#getConditionlist <em>Conditionlist</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Conditionlist</em>'.
   * @see org.xtext.example.mydsl.myDslSample.SecurityPolicy#getConditionlist()
   * @see #getSecurityPolicy()
   * @generated
   */
  EReference getSecurityPolicy_Conditionlist();

  /**
   * Returns the meta object for the attribute list '{@link org.xtext.example.mydsl.myDslSample.SecurityPolicy#getOperationList <em>Operation List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Operation List</em>'.
   * @see org.xtext.example.mydsl.myDslSample.SecurityPolicy#getOperationList()
   * @see #getSecurityPolicy()
   * @generated
   */
  EAttribute getSecurityPolicy_OperationList();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDslSample.SecurityPolicy#getTrueActionList <em>True Action List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>True Action List</em>'.
   * @see org.xtext.example.mydsl.myDslSample.SecurityPolicy#getTrueActionList()
   * @see #getSecurityPolicy()
   * @generated
   */
  EReference getSecurityPolicy_TrueActionList();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDslSample.SecurityPolicy#getFalseActionList <em>False Action List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>False Action List</em>'.
   * @see org.xtext.example.mydsl.myDslSample.SecurityPolicy#getFalseActionList()
   * @see #getSecurityPolicy()
   * @generated
   */
  EReference getSecurityPolicy_FalseActionList();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDslSample.Condition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Condition</em>'.
   * @see org.xtext.example.mydsl.myDslSample.Condition
   * @generated
   */
  EClass getCondition();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDslSample.Condition#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.mydsl.myDslSample.Condition#getName()
   * @see #getCondition()
   * @generated
   */
  EAttribute getCondition_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDslSample.Condition#getSubConditionList <em>Sub Condition List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Sub Condition List</em>'.
   * @see org.xtext.example.mydsl.myDslSample.Condition#getSubConditionList()
   * @see #getCondition()
   * @generated
   */
  EReference getCondition_SubConditionList();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDslSample.Action <em>Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Action</em>'.
   * @see org.xtext.example.mydsl.myDslSample.Action
   * @generated
   */
  EClass getAction();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDslSample.Action#getAction <em>Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Action</em>'.
   * @see org.xtext.example.mydsl.myDslSample.Action#getAction()
   * @see #getAction()
   * @generated
   */
  EAttribute getAction_Action();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDslSample.SubCondition <em>Sub Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sub Condition</em>'.
   * @see org.xtext.example.mydsl.myDslSample.SubCondition
   * @generated
   */
  EClass getSubCondition();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDslSample.SubCondition#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.mydsl.myDslSample.SubCondition#getName()
   * @see #getSubCondition()
   * @generated
   */
  EAttribute getSubCondition_Name();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDslSample.ProtocolCheck <em>Protocol Check</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Protocol Check</em>'.
   * @see org.xtext.example.mydsl.myDslSample.ProtocolCheck
   * @generated
   */
  EClass getProtocolCheck();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDslSample.ProtocolCheck#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.xtext.example.mydsl.myDslSample.ProtocolCheck#getValue()
   * @see #getProtocolCheck()
   * @generated
   */
  EAttribute getProtocolCheck_Value();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDslSample.HTTPMethodCheck <em>HTTP Method Check</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>HTTP Method Check</em>'.
   * @see org.xtext.example.mydsl.myDslSample.HTTPMethodCheck
   * @generated
   */
  EClass getHTTPMethodCheck();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDslSample.HTTPMethodCheck#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.xtext.example.mydsl.myDslSample.HTTPMethodCheck#getValue()
   * @see #getHTTPMethodCheck()
   * @generated
   */
  EAttribute getHTTPMethodCheck_Value();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDslSample.RegExpMatch <em>Reg Exp Match</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Reg Exp Match</em>'.
   * @see org.xtext.example.mydsl.myDslSample.RegExpMatch
   * @generated
   */
  EClass getRegExpMatch();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDslSample.RegExpMatch#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.xtext.example.mydsl.myDslSample.RegExpMatch#getValue()
   * @see #getRegExpMatch()
   * @generated
   */
  EAttribute getRegExpMatch_Value();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDslSample.FrequencyCheck <em>Frequency Check</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Frequency Check</em>'.
   * @see org.xtext.example.mydsl.myDslSample.FrequencyCheck
   * @generated
   */
  EClass getFrequencyCheck();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDslSample.FrequencyCheck#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.xtext.example.mydsl.myDslSample.FrequencyCheck#getValue()
   * @see #getFrequencyCheck()
   * @generated
   */
  EAttribute getFrequencyCheck_Value();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDslSample.HTTPParamLenCheck <em>HTTP Param Len Check</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>HTTP Param Len Check</em>'.
   * @see org.xtext.example.mydsl.myDslSample.HTTPParamLenCheck
   * @generated
   */
  EClass getHTTPParamLenCheck();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDslSample.HTTPParamLenCheck#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.xtext.example.mydsl.myDslSample.HTTPParamLenCheck#getValue()
   * @see #getHTTPParamLenCheck()
   * @generated
   */
  EAttribute getHTTPParamLenCheck_Value();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDslSample.EndPoint <em>End Point</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>End Point</em>'.
   * @see org.xtext.example.mydsl.myDslSample.EndPoint
   * @generated
   */
  EClass getEndPoint();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDslSample.EndPoint#getPort <em>Port</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Port</em>'.
   * @see org.xtext.example.mydsl.myDslSample.EndPoint#getPort()
   * @see #getEndPoint()
   * @generated
   */
  EAttribute getEndPoint_Port();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDslSample.EndPoint#getProtocol <em>Protocol</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Protocol</em>'.
   * @see org.xtext.example.mydsl.myDslSample.EndPoint#getProtocol()
   * @see #getEndPoint()
   * @generated
   */
  EAttribute getEndPoint_Protocol();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDslSample.DropRequest <em>Drop Request</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Drop Request</em>'.
   * @see org.xtext.example.mydsl.myDslSample.DropRequest
   * @generated
   */
  EClass getDropRequest();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDslSample.BlockSender <em>Block Sender</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Block Sender</em>'.
   * @see org.xtext.example.mydsl.myDslSample.BlockSender
   * @generated
   */
  EClass getBlockSender();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDslSample.PassRequest <em>Pass Request</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Pass Request</em>'.
   * @see org.xtext.example.mydsl.myDslSample.PassRequest
   * @generated
   */
  EClass getPassRequest();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDslSample.IPAddress <em>IP Address</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>IP Address</em>'.
   * @see org.xtext.example.mydsl.myDslSample.IPAddress
   * @generated
   */
  EClass getIPAddress();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDslSample.IPAddress#getByte1 <em>Byte1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Byte1</em>'.
   * @see org.xtext.example.mydsl.myDslSample.IPAddress#getByte1()
   * @see #getIPAddress()
   * @generated
   */
  EAttribute getIPAddress_Byte1();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDslSample.IPAddress#getByte2 <em>Byte2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Byte2</em>'.
   * @see org.xtext.example.mydsl.myDslSample.IPAddress#getByte2()
   * @see #getIPAddress()
   * @generated
   */
  EAttribute getIPAddress_Byte2();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDslSample.IPAddress#getByte3 <em>Byte3</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Byte3</em>'.
   * @see org.xtext.example.mydsl.myDslSample.IPAddress#getByte3()
   * @see #getIPAddress()
   * @generated
   */
  EAttribute getIPAddress_Byte3();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDslSample.IPAddress#getByte4 <em>Byte4</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Byte4</em>'.
   * @see org.xtext.example.mydsl.myDslSample.IPAddress#getByte4()
   * @see #getIPAddress()
   * @generated
   */
  EAttribute getIPAddress_Byte4();

  /**
   * Returns the meta object for enum '{@link org.xtext.example.mydsl.myDslSample.Protocol <em>Protocol</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Protocol</em>'.
   * @see org.xtext.example.mydsl.myDslSample.Protocol
   * @generated
   */
  EEnum getProtocol();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  MyDslSampleFactory getMyDslSampleFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDslSample.impl.HttpShieldModelImpl <em>Http Shield Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDslSample.impl.HttpShieldModelImpl
     * @see org.xtext.example.mydsl.myDslSample.impl.MyDslSamplePackageImpl#getHttpShieldModel()
     * @generated
     */
    EClass HTTP_SHIELD_MODEL = eINSTANCE.getHttpShieldModel();

    /**
     * The meta object literal for the '<em><b>Agents</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HTTP_SHIELD_MODEL__AGENTS = eINSTANCE.getHttpShieldModel_Agents();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDslSample.impl.AgentImpl <em>Agent</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDslSample.impl.AgentImpl
     * @see org.xtext.example.mydsl.myDslSample.impl.MyDslSamplePackageImpl#getAgent()
     * @generated
     */
    EClass AGENT = eINSTANCE.getAgent();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute AGENT__TYPE = eINSTANCE.getAgent_Type();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute AGENT__NAME = eINSTANCE.getAgent_Name();

    /**
     * The meta object literal for the '<em><b>Filename</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute AGENT__FILENAME = eINSTANCE.getAgent_Filename();

    /**
     * The meta object literal for the '<em><b>Source</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AGENT__SOURCE = eINSTANCE.getAgent_Source();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDslSample.impl.UserImpl <em>User</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDslSample.impl.UserImpl
     * @see org.xtext.example.mydsl.myDslSample.impl.MyDslSamplePackageImpl#getUser()
     * @generated
     */
    EClass USER = eINSTANCE.getUser();

    /**
     * The meta object literal for the '<em><b>Requests</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference USER__REQUESTS = eINSTANCE.getUser_Requests();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDslSample.impl.AttackerImpl <em>Attacker</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDslSample.impl.AttackerImpl
     * @see org.xtext.example.mydsl.myDslSample.impl.MyDslSamplePackageImpl#getAttacker()
     * @generated
     */
    EClass ATTACKER = eINSTANCE.getAttacker();

    /**
     * The meta object literal for the '<em><b>Requests</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATTACKER__REQUESTS = eINSTANCE.getAttacker_Requests();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDslSample.impl.RequestImpl <em>Request</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDslSample.impl.RequestImpl
     * @see org.xtext.example.mydsl.myDslSample.impl.MyDslSamplePackageImpl#getRequest()
     * @generated
     */
    EClass REQUEST = eINSTANCE.getRequest();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REQUEST__NAME = eINSTANCE.getRequest_Name();

    /**
     * The meta object literal for the '<em><b>Source</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REQUEST__SOURCE = eINSTANCE.getRequest_Source();

    /**
     * The meta object literal for the '<em><b>Destination</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REQUEST__DESTINATION = eINSTANCE.getRequest_Destination();

    /**
     * The meta object literal for the '<em><b>Port</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REQUEST__PORT = eINSTANCE.getRequest_Port();

    /**
     * The meta object literal for the '<em><b>Data</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REQUEST__DATA = eINSTANCE.getRequest_Data();

    /**
     * The meta object literal for the '<em><b>Protocol</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REQUEST__PROTOCOL = eINSTANCE.getRequest_Protocol();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDslSample.impl.MaliciousRequestImpl <em>Malicious Request</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDslSample.impl.MaliciousRequestImpl
     * @see org.xtext.example.mydsl.myDslSample.impl.MyDslSamplePackageImpl#getMaliciousRequest()
     * @generated
     */
    EClass MALICIOUS_REQUEST = eINSTANCE.getMaliciousRequest();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDslSample.impl.NormalRequestImpl <em>Normal Request</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDslSample.impl.NormalRequestImpl
     * @see org.xtext.example.mydsl.myDslSample.impl.MyDslSamplePackageImpl#getNormalRequest()
     * @generated
     */
    EClass NORMAL_REQUEST = eINSTANCE.getNormalRequest();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDslSample.impl.DefenderImpl <em>Defender</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDslSample.impl.DefenderImpl
     * @see org.xtext.example.mydsl.myDslSample.impl.MyDslSamplePackageImpl#getDefender()
     * @generated
     */
    EClass DEFENDER = eINSTANCE.getDefender();

    /**
     * The meta object literal for the '<em><b>Security Policylist</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEFENDER__SECURITY_POLICYLIST = eINSTANCE.getDefender_SecurityPolicylist();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDslSample.impl.SecurityPolicyListImpl <em>Security Policy List</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDslSample.impl.SecurityPolicyListImpl
     * @see org.xtext.example.mydsl.myDslSample.impl.MyDslSamplePackageImpl#getSecurityPolicyList()
     * @generated
     */
    EClass SECURITY_POLICY_LIST = eINSTANCE.getSecurityPolicyList();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SECURITY_POLICY_LIST__NAME = eINSTANCE.getSecurityPolicyList_Name();

    /**
     * The meta object literal for the '<em><b>Security Policies</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SECURITY_POLICY_LIST__SECURITY_POLICIES = eINSTANCE.getSecurityPolicyList_SecurityPolicies();

    /**
     * The meta object literal for the '<em><b>Conditions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SECURITY_POLICY_LIST__CONDITIONS = eINSTANCE.getSecurityPolicyList_Conditions();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDslSample.impl.SecurityPolicyImpl <em>Security Policy</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDslSample.impl.SecurityPolicyImpl
     * @see org.xtext.example.mydsl.myDslSample.impl.MyDslSamplePackageImpl#getSecurityPolicy()
     * @generated
     */
    EClass SECURITY_POLICY = eINSTANCE.getSecurityPolicy();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SECURITY_POLICY__NAME = eINSTANCE.getSecurityPolicy_Name();

    /**
     * The meta object literal for the '<em><b>End Point</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SECURITY_POLICY__END_POINT = eINSTANCE.getSecurityPolicy_EndPoint();

    /**
     * The meta object literal for the '<em><b>Conditionlist</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SECURITY_POLICY__CONDITIONLIST = eINSTANCE.getSecurityPolicy_Conditionlist();

    /**
     * The meta object literal for the '<em><b>Operation List</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SECURITY_POLICY__OPERATION_LIST = eINSTANCE.getSecurityPolicy_OperationList();

    /**
     * The meta object literal for the '<em><b>True Action List</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SECURITY_POLICY__TRUE_ACTION_LIST = eINSTANCE.getSecurityPolicy_TrueActionList();

    /**
     * The meta object literal for the '<em><b>False Action List</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SECURITY_POLICY__FALSE_ACTION_LIST = eINSTANCE.getSecurityPolicy_FalseActionList();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDslSample.impl.ConditionImpl <em>Condition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDslSample.impl.ConditionImpl
     * @see org.xtext.example.mydsl.myDslSample.impl.MyDslSamplePackageImpl#getCondition()
     * @generated
     */
    EClass CONDITION = eINSTANCE.getCondition();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONDITION__NAME = eINSTANCE.getCondition_Name();

    /**
     * The meta object literal for the '<em><b>Sub Condition List</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONDITION__SUB_CONDITION_LIST = eINSTANCE.getCondition_SubConditionList();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDslSample.impl.ActionImpl <em>Action</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDslSample.impl.ActionImpl
     * @see org.xtext.example.mydsl.myDslSample.impl.MyDslSamplePackageImpl#getAction()
     * @generated
     */
    EClass ACTION = eINSTANCE.getAction();

    /**
     * The meta object literal for the '<em><b>Action</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ACTION__ACTION = eINSTANCE.getAction_Action();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDslSample.impl.SubConditionImpl <em>Sub Condition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDslSample.impl.SubConditionImpl
     * @see org.xtext.example.mydsl.myDslSample.impl.MyDslSamplePackageImpl#getSubCondition()
     * @generated
     */
    EClass SUB_CONDITION = eINSTANCE.getSubCondition();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SUB_CONDITION__NAME = eINSTANCE.getSubCondition_Name();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDslSample.impl.ProtocolCheckImpl <em>Protocol Check</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDslSample.impl.ProtocolCheckImpl
     * @see org.xtext.example.mydsl.myDslSample.impl.MyDslSamplePackageImpl#getProtocolCheck()
     * @generated
     */
    EClass PROTOCOL_CHECK = eINSTANCE.getProtocolCheck();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROTOCOL_CHECK__VALUE = eINSTANCE.getProtocolCheck_Value();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDslSample.impl.HTTPMethodCheckImpl <em>HTTP Method Check</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDslSample.impl.HTTPMethodCheckImpl
     * @see org.xtext.example.mydsl.myDslSample.impl.MyDslSamplePackageImpl#getHTTPMethodCheck()
     * @generated
     */
    EClass HTTP_METHOD_CHECK = eINSTANCE.getHTTPMethodCheck();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute HTTP_METHOD_CHECK__VALUE = eINSTANCE.getHTTPMethodCheck_Value();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDslSample.impl.RegExpMatchImpl <em>Reg Exp Match</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDslSample.impl.RegExpMatchImpl
     * @see org.xtext.example.mydsl.myDslSample.impl.MyDslSamplePackageImpl#getRegExpMatch()
     * @generated
     */
    EClass REG_EXP_MATCH = eINSTANCE.getRegExpMatch();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REG_EXP_MATCH__VALUE = eINSTANCE.getRegExpMatch_Value();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDslSample.impl.FrequencyCheckImpl <em>Frequency Check</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDslSample.impl.FrequencyCheckImpl
     * @see org.xtext.example.mydsl.myDslSample.impl.MyDslSamplePackageImpl#getFrequencyCheck()
     * @generated
     */
    EClass FREQUENCY_CHECK = eINSTANCE.getFrequencyCheck();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FREQUENCY_CHECK__VALUE = eINSTANCE.getFrequencyCheck_Value();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDslSample.impl.HTTPParamLenCheckImpl <em>HTTP Param Len Check</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDslSample.impl.HTTPParamLenCheckImpl
     * @see org.xtext.example.mydsl.myDslSample.impl.MyDslSamplePackageImpl#getHTTPParamLenCheck()
     * @generated
     */
    EClass HTTP_PARAM_LEN_CHECK = eINSTANCE.getHTTPParamLenCheck();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute HTTP_PARAM_LEN_CHECK__VALUE = eINSTANCE.getHTTPParamLenCheck_Value();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDslSample.impl.EndPointImpl <em>End Point</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDslSample.impl.EndPointImpl
     * @see org.xtext.example.mydsl.myDslSample.impl.MyDslSamplePackageImpl#getEndPoint()
     * @generated
     */
    EClass END_POINT = eINSTANCE.getEndPoint();

    /**
     * The meta object literal for the '<em><b>Port</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute END_POINT__PORT = eINSTANCE.getEndPoint_Port();

    /**
     * The meta object literal for the '<em><b>Protocol</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute END_POINT__PROTOCOL = eINSTANCE.getEndPoint_Protocol();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDslSample.impl.DropRequestImpl <em>Drop Request</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDslSample.impl.DropRequestImpl
     * @see org.xtext.example.mydsl.myDslSample.impl.MyDslSamplePackageImpl#getDropRequest()
     * @generated
     */
    EClass DROP_REQUEST = eINSTANCE.getDropRequest();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDslSample.impl.BlockSenderImpl <em>Block Sender</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDslSample.impl.BlockSenderImpl
     * @see org.xtext.example.mydsl.myDslSample.impl.MyDslSamplePackageImpl#getBlockSender()
     * @generated
     */
    EClass BLOCK_SENDER = eINSTANCE.getBlockSender();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDslSample.impl.PassRequestImpl <em>Pass Request</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDslSample.impl.PassRequestImpl
     * @see org.xtext.example.mydsl.myDslSample.impl.MyDslSamplePackageImpl#getPassRequest()
     * @generated
     */
    EClass PASS_REQUEST = eINSTANCE.getPassRequest();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDslSample.impl.IPAddressImpl <em>IP Address</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDslSample.impl.IPAddressImpl
     * @see org.xtext.example.mydsl.myDslSample.impl.MyDslSamplePackageImpl#getIPAddress()
     * @generated
     */
    EClass IP_ADDRESS = eINSTANCE.getIPAddress();

    /**
     * The meta object literal for the '<em><b>Byte1</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IP_ADDRESS__BYTE1 = eINSTANCE.getIPAddress_Byte1();

    /**
     * The meta object literal for the '<em><b>Byte2</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IP_ADDRESS__BYTE2 = eINSTANCE.getIPAddress_Byte2();

    /**
     * The meta object literal for the '<em><b>Byte3</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IP_ADDRESS__BYTE3 = eINSTANCE.getIPAddress_Byte3();

    /**
     * The meta object literal for the '<em><b>Byte4</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IP_ADDRESS__BYTE4 = eINSTANCE.getIPAddress_Byte4();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDslSample.Protocol <em>Protocol</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDslSample.Protocol
     * @see org.xtext.example.mydsl.myDslSample.impl.MyDslSamplePackageImpl#getProtocol()
     * @generated
     */
    EEnum PROTOCOL = eINSTANCE.getProtocol();

  }

} //MyDslSamplePackage
