/**
 */
package org.xtext.example.mydsl.myDslSample.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xtext.example.mydsl.myDslSample.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MyDslSampleFactoryImpl extends EFactoryImpl implements MyDslSampleFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static MyDslSampleFactory init()
  {
    try
    {
      MyDslSampleFactory theMyDslSampleFactory = (MyDslSampleFactory)EPackage.Registry.INSTANCE.getEFactory(MyDslSamplePackage.eNS_URI);
      if (theMyDslSampleFactory != null)
      {
        return theMyDslSampleFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new MyDslSampleFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MyDslSampleFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case MyDslSamplePackage.HTTP_SHIELD_MODEL: return createHttpShieldModel();
      case MyDslSamplePackage.AGENT: return createAgent();
      case MyDslSamplePackage.USER: return createUser();
      case MyDslSamplePackage.ATTACKER: return createAttacker();
      case MyDslSamplePackage.REQUEST: return createRequest();
      case MyDslSamplePackage.MALICIOUS_REQUEST: return createMaliciousRequest();
      case MyDslSamplePackage.NORMAL_REQUEST: return createNormalRequest();
      case MyDslSamplePackage.DEFENDER: return createDefender();
      case MyDslSamplePackage.SECURITY_POLICY_LIST: return createSecurityPolicyList();
      case MyDslSamplePackage.SECURITY_POLICY: return createSecurityPolicy();
      case MyDslSamplePackage.CONDITION: return createCondition();
      case MyDslSamplePackage.ACTION: return createAction();
      case MyDslSamplePackage.SUB_CONDITION: return createSubCondition();
      case MyDslSamplePackage.PROTOCOL_CHECK: return createProtocolCheck();
      case MyDslSamplePackage.HTTP_METHOD_CHECK: return createHTTPMethodCheck();
      case MyDslSamplePackage.REG_EXP_MATCH: return createRegExpMatch();
      case MyDslSamplePackage.FREQUENCY_CHECK: return createFrequencyCheck();
      case MyDslSamplePackage.HTTP_PARAM_LEN_CHECK: return createHTTPParamLenCheck();
      case MyDslSamplePackage.END_POINT: return createEndPoint();
      case MyDslSamplePackage.DROP_REQUEST: return createDropRequest();
      case MyDslSamplePackage.BLOCK_SENDER: return createBlockSender();
      case MyDslSamplePackage.PASS_REQUEST: return createPassRequest();
      case MyDslSamplePackage.IP_ADDRESS: return createIPAddress();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case MyDslSamplePackage.PROTOCOL:
        return createProtocolFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case MyDslSamplePackage.PROTOCOL:
        return convertProtocolToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HttpShieldModel createHttpShieldModel()
  {
    HttpShieldModelImpl httpShieldModel = new HttpShieldModelImpl();
    return httpShieldModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Agent createAgent()
  {
    AgentImpl agent = new AgentImpl();
    return agent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public User createUser()
  {
    UserImpl user = new UserImpl();
    return user;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Attacker createAttacker()
  {
    AttackerImpl attacker = new AttackerImpl();
    return attacker;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Request createRequest()
  {
    RequestImpl request = new RequestImpl();
    return request;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MaliciousRequest createMaliciousRequest()
  {
    MaliciousRequestImpl maliciousRequest = new MaliciousRequestImpl();
    return maliciousRequest;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NormalRequest createNormalRequest()
  {
    NormalRequestImpl normalRequest = new NormalRequestImpl();
    return normalRequest;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Defender createDefender()
  {
    DefenderImpl defender = new DefenderImpl();
    return defender;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SecurityPolicyList createSecurityPolicyList()
  {
    SecurityPolicyListImpl securityPolicyList = new SecurityPolicyListImpl();
    return securityPolicyList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SecurityPolicy createSecurityPolicy()
  {
    SecurityPolicyImpl securityPolicy = new SecurityPolicyImpl();
    return securityPolicy;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Condition createCondition()
  {
    ConditionImpl condition = new ConditionImpl();
    return condition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Action createAction()
  {
    ActionImpl action = new ActionImpl();
    return action;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SubCondition createSubCondition()
  {
    SubConditionImpl subCondition = new SubConditionImpl();
    return subCondition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProtocolCheck createProtocolCheck()
  {
    ProtocolCheckImpl protocolCheck = new ProtocolCheckImpl();
    return protocolCheck;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HTTPMethodCheck createHTTPMethodCheck()
  {
    HTTPMethodCheckImpl httpMethodCheck = new HTTPMethodCheckImpl();
    return httpMethodCheck;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RegExpMatch createRegExpMatch()
  {
    RegExpMatchImpl regExpMatch = new RegExpMatchImpl();
    return regExpMatch;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FrequencyCheck createFrequencyCheck()
  {
    FrequencyCheckImpl frequencyCheck = new FrequencyCheckImpl();
    return frequencyCheck;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HTTPParamLenCheck createHTTPParamLenCheck()
  {
    HTTPParamLenCheckImpl httpParamLenCheck = new HTTPParamLenCheckImpl();
    return httpParamLenCheck;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EndPoint createEndPoint()
  {
    EndPointImpl endPoint = new EndPointImpl();
    return endPoint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DropRequest createDropRequest()
  {
    DropRequestImpl dropRequest = new DropRequestImpl();
    return dropRequest;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BlockSender createBlockSender()
  {
    BlockSenderImpl blockSender = new BlockSenderImpl();
    return blockSender;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PassRequest createPassRequest()
  {
    PassRequestImpl passRequest = new PassRequestImpl();
    return passRequest;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IPAddress createIPAddress()
  {
    IPAddressImpl ipAddress = new IPAddressImpl();
    return ipAddress;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Protocol createProtocolFromString(EDataType eDataType, String initialValue)
  {
    Protocol result = Protocol.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertProtocolToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MyDslSamplePackage getMyDslSamplePackage()
  {
    return (MyDslSamplePackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static MyDslSamplePackage getPackage()
  {
    return MyDslSamplePackage.eINSTANCE;
  }

} //MyDslSampleFactoryImpl
