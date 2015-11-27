/**
 */
package org.xtext.example.mydsl.myDslSample;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Defender</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDslSample.Defender#getSecurityPolicylist <em>Security Policylist</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.myDslSample.MyDslSamplePackage#getDefender()
 * @model
 * @generated
 */
public interface Defender extends Agent
{
  /**
   * Returns the value of the '<em><b>Security Policylist</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Security Policylist</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Security Policylist</em>' containment reference.
   * @see #setSecurityPolicylist(SecurityPolicyList)
   * @see org.xtext.example.mydsl.myDslSample.MyDslSamplePackage#getDefender_SecurityPolicylist()
   * @model containment="true"
   * @generated
   */
  SecurityPolicyList getSecurityPolicylist();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDslSample.Defender#getSecurityPolicylist <em>Security Policylist</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Security Policylist</em>' containment reference.
   * @see #getSecurityPolicylist()
   * @generated
   */
  void setSecurityPolicylist(SecurityPolicyList value);

} // Defender
