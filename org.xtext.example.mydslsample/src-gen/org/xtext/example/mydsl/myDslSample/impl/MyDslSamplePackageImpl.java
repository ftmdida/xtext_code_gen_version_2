/**
 */
package org.xtext.example.mydsl.myDslSample.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.xtext.example.mydsl.myDslSample.Action;
import org.xtext.example.mydsl.myDslSample.Agent;
import org.xtext.example.mydsl.myDslSample.Attacker;
import org.xtext.example.mydsl.myDslSample.BlockSender;
import org.xtext.example.mydsl.myDslSample.Condition;
import org.xtext.example.mydsl.myDslSample.Defender;
import org.xtext.example.mydsl.myDslSample.DropRequest;
import org.xtext.example.mydsl.myDslSample.EndPoint;
import org.xtext.example.mydsl.myDslSample.FrequencyCheck;
import org.xtext.example.mydsl.myDslSample.HTTPMethodCheck;
import org.xtext.example.mydsl.myDslSample.HTTPParamLenCheck;
import org.xtext.example.mydsl.myDslSample.HttpShieldModel;
import org.xtext.example.mydsl.myDslSample.IPAddress;
import org.xtext.example.mydsl.myDslSample.MaliciousRequest;
import org.xtext.example.mydsl.myDslSample.MyDslSampleFactory;
import org.xtext.example.mydsl.myDslSample.MyDslSamplePackage;
import org.xtext.example.mydsl.myDslSample.NormalRequest;
import org.xtext.example.mydsl.myDslSample.PassRequest;
import org.xtext.example.mydsl.myDslSample.Protocol;
import org.xtext.example.mydsl.myDslSample.ProtocolCheck;
import org.xtext.example.mydsl.myDslSample.RegExpMatch;
import org.xtext.example.mydsl.myDslSample.Request;
import org.xtext.example.mydsl.myDslSample.SecurityPolicy;
import org.xtext.example.mydsl.myDslSample.SecurityPolicyList;
import org.xtext.example.mydsl.myDslSample.SubCondition;
import org.xtext.example.mydsl.myDslSample.User;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MyDslSamplePackageImpl extends EPackageImpl implements MyDslSamplePackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass httpShieldModelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass agentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass userEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass attackerEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass requestEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass maliciousRequestEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass normalRequestEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass defenderEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass securityPolicyListEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass securityPolicyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass conditionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass actionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass subConditionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass protocolCheckEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass httpMethodCheckEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass regExpMatchEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass frequencyCheckEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass httpParamLenCheckEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass endPointEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dropRequestEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass blockSenderEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass passRequestEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ipAddressEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum protocolEEnum = null;

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
   * @see org.xtext.example.mydsl.myDslSample.MyDslSamplePackage#eNS_URI
   * @see #init()
   * @generated
   */
  private MyDslSamplePackageImpl()
  {
    super(eNS_URI, MyDslSampleFactory.eINSTANCE);
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
   * <p>This method is used to initialize {@link MyDslSamplePackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static MyDslSamplePackage init()
  {
    if (isInited) return (MyDslSamplePackage)EPackage.Registry.INSTANCE.getEPackage(MyDslSamplePackage.eNS_URI);

    // Obtain or create and register package
    MyDslSamplePackageImpl theMyDslSamplePackage = (MyDslSamplePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof MyDslSamplePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new MyDslSamplePackageImpl());

    isInited = true;

    // Create package meta-data objects
    theMyDslSamplePackage.createPackageContents();

    // Initialize created meta-data
    theMyDslSamplePackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theMyDslSamplePackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(MyDslSamplePackage.eNS_URI, theMyDslSamplePackage);
    return theMyDslSamplePackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getHttpShieldModel()
  {
    return httpShieldModelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getHttpShieldModel_Agents()
  {
    return (EReference)httpShieldModelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAgent()
  {
    return agentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAgent_Type()
  {
    return (EAttribute)agentEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAgent_Name()
  {
    return (EAttribute)agentEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAgent_Filename()
  {
    return (EAttribute)agentEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAgent_Source()
  {
    return (EReference)agentEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUser()
  {
    return userEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUser_Requests()
  {
    return (EReference)userEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAttacker()
  {
    return attackerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAttacker_Requests()
  {
    return (EReference)attackerEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRequest()
  {
    return requestEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRequest_Name()
  {
    return (EAttribute)requestEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRequest_Source()
  {
    return (EReference)requestEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRequest_Destination()
  {
    return (EReference)requestEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRequest_Port()
  {
    return (EAttribute)requestEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRequest_Data()
  {
    return (EAttribute)requestEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRequest_Protocol()
  {
    return (EAttribute)requestEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMaliciousRequest()
  {
    return maliciousRequestEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNormalRequest()
  {
    return normalRequestEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDefender()
  {
    return defenderEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDefender_SecurityPolicylist()
  {
    return (EReference)defenderEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSecurityPolicyList()
  {
    return securityPolicyListEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSecurityPolicyList_Name()
  {
    return (EAttribute)securityPolicyListEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSecurityPolicyList_SecurityPolicies()
  {
    return (EReference)securityPolicyListEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSecurityPolicyList_Conditions()
  {
    return (EReference)securityPolicyListEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSecurityPolicy()
  {
    return securityPolicyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSecurityPolicy_Name()
  {
    return (EAttribute)securityPolicyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSecurityPolicy_EndPoint()
  {
    return (EReference)securityPolicyEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSecurityPolicy_Conditionlist()
  {
    return (EReference)securityPolicyEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSecurityPolicy_OperationList()
  {
    return (EAttribute)securityPolicyEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSecurityPolicy_TrueActionList()
  {
    return (EReference)securityPolicyEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSecurityPolicy_FalseActionList()
  {
    return (EReference)securityPolicyEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCondition()
  {
    return conditionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCondition_Name()
  {
    return (EAttribute)conditionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCondition_SubConditionList()
  {
    return (EReference)conditionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAction()
  {
    return actionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAction_Action()
  {
    return (EAttribute)actionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSubCondition()
  {
    return subConditionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSubCondition_Name()
  {
    return (EAttribute)subConditionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getProtocolCheck()
  {
    return protocolCheckEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getProtocolCheck_Value()
  {
    return (EAttribute)protocolCheckEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getHTTPMethodCheck()
  {
    return httpMethodCheckEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getHTTPMethodCheck_Value()
  {
    return (EAttribute)httpMethodCheckEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRegExpMatch()
  {
    return regExpMatchEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRegExpMatch_Value()
  {
    return (EAttribute)regExpMatchEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFrequencyCheck()
  {
    return frequencyCheckEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFrequencyCheck_Value()
  {
    return (EAttribute)frequencyCheckEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getHTTPParamLenCheck()
  {
    return httpParamLenCheckEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getHTTPParamLenCheck_Value()
  {
    return (EAttribute)httpParamLenCheckEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEndPoint()
  {
    return endPointEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEndPoint_Port()
  {
    return (EAttribute)endPointEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEndPoint_Protocol()
  {
    return (EAttribute)endPointEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDropRequest()
  {
    return dropRequestEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBlockSender()
  {
    return blockSenderEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPassRequest()
  {
    return passRequestEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIPAddress()
  {
    return ipAddressEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIPAddress_Byte1()
  {
    return (EAttribute)ipAddressEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIPAddress_Byte2()
  {
    return (EAttribute)ipAddressEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIPAddress_Byte3()
  {
    return (EAttribute)ipAddressEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIPAddress_Byte4()
  {
    return (EAttribute)ipAddressEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getProtocol()
  {
    return protocolEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MyDslSampleFactory getMyDslSampleFactory()
  {
    return (MyDslSampleFactory)getEFactoryInstance();
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
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    httpShieldModelEClass = createEClass(HTTP_SHIELD_MODEL);
    createEReference(httpShieldModelEClass, HTTP_SHIELD_MODEL__AGENTS);

    agentEClass = createEClass(AGENT);
    createEAttribute(agentEClass, AGENT__TYPE);
    createEAttribute(agentEClass, AGENT__NAME);
    createEAttribute(agentEClass, AGENT__FILENAME);
    createEReference(agentEClass, AGENT__SOURCE);

    userEClass = createEClass(USER);
    createEReference(userEClass, USER__REQUESTS);

    attackerEClass = createEClass(ATTACKER);
    createEReference(attackerEClass, ATTACKER__REQUESTS);

    requestEClass = createEClass(REQUEST);
    createEAttribute(requestEClass, REQUEST__NAME);
    createEReference(requestEClass, REQUEST__SOURCE);
    createEReference(requestEClass, REQUEST__DESTINATION);
    createEAttribute(requestEClass, REQUEST__PORT);
    createEAttribute(requestEClass, REQUEST__DATA);
    createEAttribute(requestEClass, REQUEST__PROTOCOL);

    maliciousRequestEClass = createEClass(MALICIOUS_REQUEST);

    normalRequestEClass = createEClass(NORMAL_REQUEST);

    defenderEClass = createEClass(DEFENDER);
    createEReference(defenderEClass, DEFENDER__SECURITY_POLICYLIST);

    securityPolicyListEClass = createEClass(SECURITY_POLICY_LIST);
    createEAttribute(securityPolicyListEClass, SECURITY_POLICY_LIST__NAME);
    createEReference(securityPolicyListEClass, SECURITY_POLICY_LIST__SECURITY_POLICIES);
    createEReference(securityPolicyListEClass, SECURITY_POLICY_LIST__CONDITIONS);

    securityPolicyEClass = createEClass(SECURITY_POLICY);
    createEAttribute(securityPolicyEClass, SECURITY_POLICY__NAME);
    createEReference(securityPolicyEClass, SECURITY_POLICY__END_POINT);
    createEReference(securityPolicyEClass, SECURITY_POLICY__CONDITIONLIST);
    createEAttribute(securityPolicyEClass, SECURITY_POLICY__OPERATION_LIST);
    createEReference(securityPolicyEClass, SECURITY_POLICY__TRUE_ACTION_LIST);
    createEReference(securityPolicyEClass, SECURITY_POLICY__FALSE_ACTION_LIST);

    conditionEClass = createEClass(CONDITION);
    createEAttribute(conditionEClass, CONDITION__NAME);
    createEReference(conditionEClass, CONDITION__SUB_CONDITION_LIST);

    actionEClass = createEClass(ACTION);
    createEAttribute(actionEClass, ACTION__ACTION);

    subConditionEClass = createEClass(SUB_CONDITION);
    createEAttribute(subConditionEClass, SUB_CONDITION__NAME);

    protocolCheckEClass = createEClass(PROTOCOL_CHECK);
    createEAttribute(protocolCheckEClass, PROTOCOL_CHECK__VALUE);

    httpMethodCheckEClass = createEClass(HTTP_METHOD_CHECK);
    createEAttribute(httpMethodCheckEClass, HTTP_METHOD_CHECK__VALUE);

    regExpMatchEClass = createEClass(REG_EXP_MATCH);
    createEAttribute(regExpMatchEClass, REG_EXP_MATCH__VALUE);

    frequencyCheckEClass = createEClass(FREQUENCY_CHECK);
    createEAttribute(frequencyCheckEClass, FREQUENCY_CHECK__VALUE);

    httpParamLenCheckEClass = createEClass(HTTP_PARAM_LEN_CHECK);
    createEAttribute(httpParamLenCheckEClass, HTTP_PARAM_LEN_CHECK__VALUE);

    endPointEClass = createEClass(END_POINT);
    createEAttribute(endPointEClass, END_POINT__PORT);
    createEAttribute(endPointEClass, END_POINT__PROTOCOL);

    dropRequestEClass = createEClass(DROP_REQUEST);

    blockSenderEClass = createEClass(BLOCK_SENDER);

    passRequestEClass = createEClass(PASS_REQUEST);

    ipAddressEClass = createEClass(IP_ADDRESS);
    createEAttribute(ipAddressEClass, IP_ADDRESS__BYTE1);
    createEAttribute(ipAddressEClass, IP_ADDRESS__BYTE2);
    createEAttribute(ipAddressEClass, IP_ADDRESS__BYTE3);
    createEAttribute(ipAddressEClass, IP_ADDRESS__BYTE4);

    // Create enums
    protocolEEnum = createEEnum(PROTOCOL);
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
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    userEClass.getESuperTypes().add(this.getAgent());
    attackerEClass.getESuperTypes().add(this.getAgent());
    maliciousRequestEClass.getESuperTypes().add(this.getRequest());
    normalRequestEClass.getESuperTypes().add(this.getRequest());
    defenderEClass.getESuperTypes().add(this.getAgent());
    protocolCheckEClass.getESuperTypes().add(this.getSubCondition());
    httpMethodCheckEClass.getESuperTypes().add(this.getSubCondition());
    regExpMatchEClass.getESuperTypes().add(this.getSubCondition());
    frequencyCheckEClass.getESuperTypes().add(this.getSubCondition());
    httpParamLenCheckEClass.getESuperTypes().add(this.getSubCondition());
    dropRequestEClass.getESuperTypes().add(this.getAction());
    blockSenderEClass.getESuperTypes().add(this.getAction());
    passRequestEClass.getESuperTypes().add(this.getAction());

    // Initialize classes and features; add operations and parameters
    initEClass(httpShieldModelEClass, HttpShieldModel.class, "HttpShieldModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getHttpShieldModel_Agents(), this.getAgent(), null, "agents", null, 0, -1, HttpShieldModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(agentEClass, Agent.class, "Agent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAgent_Type(), ecorePackage.getEString(), "type", null, 0, 1, Agent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAgent_Name(), ecorePackage.getEString(), "name", null, 0, 1, Agent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAgent_Filename(), ecorePackage.getEString(), "filename", null, 0, 1, Agent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAgent_Source(), this.getIPAddress(), null, "source", null, 0, 1, Agent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(userEClass, User.class, "User", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getUser_Requests(), this.getNormalRequest(), null, "requests", null, 0, -1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(attackerEClass, Attacker.class, "Attacker", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAttacker_Requests(), this.getMaliciousRequest(), null, "requests", null, 0, -1, Attacker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(requestEClass, Request.class, "Request", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRequest_Name(), ecorePackage.getEString(), "name", null, 0, 1, Request.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRequest_Source(), this.getIPAddress(), null, "source", null, 0, 1, Request.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRequest_Destination(), this.getIPAddress(), null, "destination", null, 0, 1, Request.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRequest_Port(), ecorePackage.getEInt(), "port", null, 0, 1, Request.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRequest_Data(), ecorePackage.getEString(), "data", null, 0, 1, Request.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRequest_Protocol(), this.getProtocol(), "protocol", null, 0, 1, Request.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(maliciousRequestEClass, MaliciousRequest.class, "MaliciousRequest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(normalRequestEClass, NormalRequest.class, "NormalRequest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(defenderEClass, Defender.class, "Defender", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDefender_SecurityPolicylist(), this.getSecurityPolicyList(), null, "securityPolicylist", null, 0, 1, Defender.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(securityPolicyListEClass, SecurityPolicyList.class, "SecurityPolicyList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSecurityPolicyList_Name(), ecorePackage.getEString(), "name", null, 0, 1, SecurityPolicyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSecurityPolicyList_SecurityPolicies(), this.getSecurityPolicy(), null, "securityPolicies", null, 0, -1, SecurityPolicyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSecurityPolicyList_Conditions(), this.getCondition(), null, "conditions", null, 0, -1, SecurityPolicyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(securityPolicyEClass, SecurityPolicy.class, "SecurityPolicy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSecurityPolicy_Name(), ecorePackage.getEString(), "name", null, 0, 1, SecurityPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSecurityPolicy_EndPoint(), this.getEndPoint(), null, "endPoint", null, 0, 1, SecurityPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSecurityPolicy_Conditionlist(), this.getCondition(), null, "conditionlist", null, 0, -1, SecurityPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSecurityPolicy_OperationList(), ecorePackage.getEString(), "operationList", null, 0, -1, SecurityPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSecurityPolicy_TrueActionList(), this.getAction(), null, "trueActionList", null, 0, -1, SecurityPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSecurityPolicy_FalseActionList(), this.getAction(), null, "falseActionList", null, 0, -1, SecurityPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(conditionEClass, Condition.class, "Condition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCondition_Name(), ecorePackage.getEString(), "name", null, 0, 1, Condition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCondition_SubConditionList(), this.getSubCondition(), null, "subConditionList", null, 0, -1, Condition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(actionEClass, Action.class, "Action", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAction_Action(), ecorePackage.getEString(), "action", null, 0, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(subConditionEClass, SubCondition.class, "SubCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSubCondition_Name(), ecorePackage.getEString(), "name", null, 0, 1, SubCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(protocolCheckEClass, ProtocolCheck.class, "ProtocolCheck", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getProtocolCheck_Value(), this.getProtocol(), "value", null, 0, 1, ProtocolCheck.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(httpMethodCheckEClass, HTTPMethodCheck.class, "HTTPMethodCheck", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getHTTPMethodCheck_Value(), ecorePackage.getEString(), "value", null, 0, 1, HTTPMethodCheck.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(regExpMatchEClass, RegExpMatch.class, "RegExpMatch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRegExpMatch_Value(), ecorePackage.getEString(), "value", null, 0, 1, RegExpMatch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(frequencyCheckEClass, FrequencyCheck.class, "FrequencyCheck", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFrequencyCheck_Value(), ecorePackage.getEInt(), "value", null, 0, 1, FrequencyCheck.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(httpParamLenCheckEClass, HTTPParamLenCheck.class, "HTTPParamLenCheck", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getHTTPParamLenCheck_Value(), ecorePackage.getEInt(), "value", null, 0, 1, HTTPParamLenCheck.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(endPointEClass, EndPoint.class, "EndPoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEndPoint_Port(), ecorePackage.getEInt(), "port", null, 0, 1, EndPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEndPoint_Protocol(), this.getProtocol(), "protocol", null, 0, 1, EndPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dropRequestEClass, DropRequest.class, "DropRequest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(blockSenderEClass, BlockSender.class, "BlockSender", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(passRequestEClass, PassRequest.class, "PassRequest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(ipAddressEClass, IPAddress.class, "IPAddress", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getIPAddress_Byte1(), ecorePackage.getEInt(), "byte1", null, 0, 1, IPAddress.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getIPAddress_Byte2(), ecorePackage.getEInt(), "byte2", null, 0, 1, IPAddress.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getIPAddress_Byte3(), ecorePackage.getEInt(), "byte3", null, 0, 1, IPAddress.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getIPAddress_Byte4(), ecorePackage.getEInt(), "byte4", null, 0, 1, IPAddress.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(protocolEEnum, Protocol.class, "Protocol");
    addEEnumLiteral(protocolEEnum, Protocol.HTTP);
    addEEnumLiteral(protocolEEnum, Protocol.HTTPS);
    addEEnumLiteral(protocolEEnum, Protocol.FTP);
    addEEnumLiteral(protocolEEnum, Protocol.SSH);

    // Create resource
    createResource(eNS_URI);
  }

} //MyDslSamplePackageImpl
