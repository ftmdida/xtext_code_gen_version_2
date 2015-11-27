/**
 */
package org.xtext.example.mydsl.myDslSample;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Security Policy List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDslSample.SecurityPolicyList#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDslSample.SecurityPolicyList#getSecurityPolicies <em>Security Policies</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDslSample.SecurityPolicyList#getConditions <em>Conditions</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.myDslSample.MyDslSamplePackage#getSecurityPolicyList()
 * @model
 * @generated
 */
public interface SecurityPolicyList extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.example.mydsl.myDslSample.MyDslSamplePackage#getSecurityPolicyList_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDslSample.SecurityPolicyList#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Security Policies</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDslSample.SecurityPolicy}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Security Policies</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Security Policies</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDslSample.MyDslSamplePackage#getSecurityPolicyList_SecurityPolicies()
   * @model containment="true"
   * @generated
   */
  EList<SecurityPolicy> getSecurityPolicies();

  /**
   * Returns the value of the '<em><b>Conditions</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDslSample.Condition}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Conditions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Conditions</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDslSample.MyDslSamplePackage#getSecurityPolicyList_Conditions()
   * @model containment="true"
   * @generated
   */
  EList<Condition> getConditions();

} // SecurityPolicyList
