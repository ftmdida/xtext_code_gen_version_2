/**
 */
package org.xtext.example.mydsl.myDslSample;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDslSample.User#getRequests <em>Requests</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.myDslSample.MyDslSamplePackage#getUser()
 * @model
 * @generated
 */
public interface User extends Agent
{
  /**
   * Returns the value of the '<em><b>Requests</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDslSample.NormalRequest}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Requests</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Requests</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDslSample.MyDslSamplePackage#getUser_Requests()
   * @model containment="true"
   * @generated
   */
  EList<NormalRequest> getRequests();

} // User
