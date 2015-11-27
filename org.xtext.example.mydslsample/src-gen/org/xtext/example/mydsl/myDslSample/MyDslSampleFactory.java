/**
 */
package org.xtext.example.mydsl.myDslSample;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.xtext.example.mydsl.myDslSample.MyDslSamplePackage
 * @generated
 */
public interface MyDslSampleFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  MyDslSampleFactory eINSTANCE = org.xtext.example.mydsl.myDslSample.impl.MyDslSampleFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Http Shield Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Http Shield Model</em>'.
   * @generated
   */
  HttpShieldModel createHttpShieldModel();

  /**
   * Returns a new object of class '<em>Agent</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Agent</em>'.
   * @generated
   */
  Agent createAgent();

  /**
   * Returns a new object of class '<em>User</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>User</em>'.
   * @generated
   */
  User createUser();

  /**
   * Returns a new object of class '<em>Attacker</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Attacker</em>'.
   * @generated
   */
  Attacker createAttacker();

  /**
   * Returns a new object of class '<em>Request</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Request</em>'.
   * @generated
   */
  Request createRequest();

  /**
   * Returns a new object of class '<em>Malicious Request</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Malicious Request</em>'.
   * @generated
   */
  MaliciousRequest createMaliciousRequest();

  /**
   * Returns a new object of class '<em>Normal Request</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Normal Request</em>'.
   * @generated
   */
  NormalRequest createNormalRequest();

  /**
   * Returns a new object of class '<em>Defender</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Defender</em>'.
   * @generated
   */
  Defender createDefender();

  /**
   * Returns a new object of class '<em>Security Policy List</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Security Policy List</em>'.
   * @generated
   */
  SecurityPolicyList createSecurityPolicyList();

  /**
   * Returns a new object of class '<em>Security Policy</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Security Policy</em>'.
   * @generated
   */
  SecurityPolicy createSecurityPolicy();

  /**
   * Returns a new object of class '<em>Condition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Condition</em>'.
   * @generated
   */
  Condition createCondition();

  /**
   * Returns a new object of class '<em>Action</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Action</em>'.
   * @generated
   */
  Action createAction();

  /**
   * Returns a new object of class '<em>Sub Condition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Sub Condition</em>'.
   * @generated
   */
  SubCondition createSubCondition();

  /**
   * Returns a new object of class '<em>Protocol Check</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Protocol Check</em>'.
   * @generated
   */
  ProtocolCheck createProtocolCheck();

  /**
   * Returns a new object of class '<em>HTTP Method Check</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>HTTP Method Check</em>'.
   * @generated
   */
  HTTPMethodCheck createHTTPMethodCheck();

  /**
   * Returns a new object of class '<em>Reg Exp Match</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Reg Exp Match</em>'.
   * @generated
   */
  RegExpMatch createRegExpMatch();

  /**
   * Returns a new object of class '<em>Frequency Check</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Frequency Check</em>'.
   * @generated
   */
  FrequencyCheck createFrequencyCheck();

  /**
   * Returns a new object of class '<em>HTTP Param Len Check</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>HTTP Param Len Check</em>'.
   * @generated
   */
  HTTPParamLenCheck createHTTPParamLenCheck();

  /**
   * Returns a new object of class '<em>End Point</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>End Point</em>'.
   * @generated
   */
  EndPoint createEndPoint();

  /**
   * Returns a new object of class '<em>Drop Request</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Drop Request</em>'.
   * @generated
   */
  DropRequest createDropRequest();

  /**
   * Returns a new object of class '<em>Block Sender</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Block Sender</em>'.
   * @generated
   */
  BlockSender createBlockSender();

  /**
   * Returns a new object of class '<em>Pass Request</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Pass Request</em>'.
   * @generated
   */
  PassRequest createPassRequest();

  /**
   * Returns a new object of class '<em>IP Address</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>IP Address</em>'.
   * @generated
   */
  IPAddress createIPAddress();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  MyDslSamplePackage getMyDslSamplePackage();

} //MyDslSampleFactory
