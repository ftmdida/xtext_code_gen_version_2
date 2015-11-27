/**
 */
package org.xtext.example.mydsl.myDslSample;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attacker</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDslSample.Attacker#getRequests <em>Requests</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.myDslSample.MyDslSamplePackage#getAttacker()
 * @model
 * @generated
 */
public interface Attacker extends Agent
{
  /**
   * Returns the value of the '<em><b>Requests</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDslSample.MaliciousRequest}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Requests</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Requests</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDslSample.MyDslSamplePackage#getAttacker_Requests()
   * @model containment="true"
   * @generated
   */
  EList<MaliciousRequest> getRequests();

} // Attacker
