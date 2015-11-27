/**
 */
package org.xtext.example.mydsl.myDslSample.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.xtext.example.mydsl.myDslSample.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.xtext.example.mydsl.myDslSample.MyDslSamplePackage
 * @generated
 */
public class MyDslSampleSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static MyDslSamplePackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MyDslSampleSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = MyDslSamplePackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case MyDslSamplePackage.HTTP_SHIELD_MODEL:
      {
        HttpShieldModel httpShieldModel = (HttpShieldModel)theEObject;
        T result = caseHttpShieldModel(httpShieldModel);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslSamplePackage.AGENT:
      {
        Agent agent = (Agent)theEObject;
        T result = caseAgent(agent);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslSamplePackage.USER:
      {
        User user = (User)theEObject;
        T result = caseUser(user);
        if (result == null) result = caseAgent(user);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslSamplePackage.ATTACKER:
      {
        Attacker attacker = (Attacker)theEObject;
        T result = caseAttacker(attacker);
        if (result == null) result = caseAgent(attacker);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslSamplePackage.REQUEST:
      {
        Request request = (Request)theEObject;
        T result = caseRequest(request);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslSamplePackage.MALICIOUS_REQUEST:
      {
        MaliciousRequest maliciousRequest = (MaliciousRequest)theEObject;
        T result = caseMaliciousRequest(maliciousRequest);
        if (result == null) result = caseRequest(maliciousRequest);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslSamplePackage.NORMAL_REQUEST:
      {
        NormalRequest normalRequest = (NormalRequest)theEObject;
        T result = caseNormalRequest(normalRequest);
        if (result == null) result = caseRequest(normalRequest);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslSamplePackage.DEFENDER:
      {
        Defender defender = (Defender)theEObject;
        T result = caseDefender(defender);
        if (result == null) result = caseAgent(defender);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslSamplePackage.SECURITY_POLICY_LIST:
      {
        SecurityPolicyList securityPolicyList = (SecurityPolicyList)theEObject;
        T result = caseSecurityPolicyList(securityPolicyList);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslSamplePackage.SECURITY_POLICY:
      {
        SecurityPolicy securityPolicy = (SecurityPolicy)theEObject;
        T result = caseSecurityPolicy(securityPolicy);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslSamplePackage.CONDITION:
      {
        Condition condition = (Condition)theEObject;
        T result = caseCondition(condition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslSamplePackage.ACTION:
      {
        Action action = (Action)theEObject;
        T result = caseAction(action);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslSamplePackage.SUB_CONDITION:
      {
        SubCondition subCondition = (SubCondition)theEObject;
        T result = caseSubCondition(subCondition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslSamplePackage.PROTOCOL_CHECK:
      {
        ProtocolCheck protocolCheck = (ProtocolCheck)theEObject;
        T result = caseProtocolCheck(protocolCheck);
        if (result == null) result = caseSubCondition(protocolCheck);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslSamplePackage.HTTP_METHOD_CHECK:
      {
        HTTPMethodCheck httpMethodCheck = (HTTPMethodCheck)theEObject;
        T result = caseHTTPMethodCheck(httpMethodCheck);
        if (result == null) result = caseSubCondition(httpMethodCheck);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslSamplePackage.REG_EXP_MATCH:
      {
        RegExpMatch regExpMatch = (RegExpMatch)theEObject;
        T result = caseRegExpMatch(regExpMatch);
        if (result == null) result = caseSubCondition(regExpMatch);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslSamplePackage.FREQUENCY_CHECK:
      {
        FrequencyCheck frequencyCheck = (FrequencyCheck)theEObject;
        T result = caseFrequencyCheck(frequencyCheck);
        if (result == null) result = caseSubCondition(frequencyCheck);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslSamplePackage.HTTP_PARAM_LEN_CHECK:
      {
        HTTPParamLenCheck httpParamLenCheck = (HTTPParamLenCheck)theEObject;
        T result = caseHTTPParamLenCheck(httpParamLenCheck);
        if (result == null) result = caseSubCondition(httpParamLenCheck);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslSamplePackage.END_POINT:
      {
        EndPoint endPoint = (EndPoint)theEObject;
        T result = caseEndPoint(endPoint);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslSamplePackage.DROP_REQUEST:
      {
        DropRequest dropRequest = (DropRequest)theEObject;
        T result = caseDropRequest(dropRequest);
        if (result == null) result = caseAction(dropRequest);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslSamplePackage.BLOCK_SENDER:
      {
        BlockSender blockSender = (BlockSender)theEObject;
        T result = caseBlockSender(blockSender);
        if (result == null) result = caseAction(blockSender);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslSamplePackage.PASS_REQUEST:
      {
        PassRequest passRequest = (PassRequest)theEObject;
        T result = casePassRequest(passRequest);
        if (result == null) result = caseAction(passRequest);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslSamplePackage.IP_ADDRESS:
      {
        IPAddress ipAddress = (IPAddress)theEObject;
        T result = caseIPAddress(ipAddress);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Http Shield Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Http Shield Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseHttpShieldModel(HttpShieldModel object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Agent</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Agent</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAgent(Agent object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>User</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>User</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUser(User object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Attacker</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Attacker</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAttacker(Attacker object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Request</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Request</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRequest(Request object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Malicious Request</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Malicious Request</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMaliciousRequest(MaliciousRequest object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Normal Request</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Normal Request</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNormalRequest(NormalRequest object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Defender</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Defender</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDefender(Defender object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Security Policy List</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Security Policy List</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSecurityPolicyList(SecurityPolicyList object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Security Policy</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Security Policy</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSecurityPolicy(SecurityPolicy object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Condition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Condition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCondition(Condition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Action</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Action</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAction(Action object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Sub Condition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Sub Condition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSubCondition(SubCondition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Protocol Check</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Protocol Check</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProtocolCheck(ProtocolCheck object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>HTTP Method Check</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>HTTP Method Check</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseHTTPMethodCheck(HTTPMethodCheck object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Reg Exp Match</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Reg Exp Match</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRegExpMatch(RegExpMatch object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Frequency Check</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Frequency Check</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFrequencyCheck(FrequencyCheck object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>HTTP Param Len Check</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>HTTP Param Len Check</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseHTTPParamLenCheck(HTTPParamLenCheck object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>End Point</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>End Point</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEndPoint(EndPoint object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Drop Request</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Drop Request</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDropRequest(DropRequest object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Block Sender</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Block Sender</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBlockSender(BlockSender object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Pass Request</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Pass Request</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePassRequest(PassRequest object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>IP Address</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>IP Address</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIPAddress(IPAddress object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //MyDslSampleSwitch
