/**
 */
package org.xtext.example.mydsl.myDslSample;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Security Policy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDslSample.SecurityPolicy#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDslSample.SecurityPolicy#getEndPoint <em>End Point</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDslSample.SecurityPolicy#getConditionlist <em>Conditionlist</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDslSample.SecurityPolicy#getOperationList <em>Operation List</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDslSample.SecurityPolicy#getTrueActionList <em>True Action List</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDslSample.SecurityPolicy#getFalseActionList <em>False Action List</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.myDslSample.MyDslSamplePackage#getSecurityPolicy()
 * @model
 * @generated
 */
public interface SecurityPolicy extends EObject
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
   * @see org.xtext.example.mydsl.myDslSample.MyDslSamplePackage#getSecurityPolicy_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDslSample.SecurityPolicy#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>End Point</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>End Point</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>End Point</em>' containment reference.
   * @see #setEndPoint(EndPoint)
   * @see org.xtext.example.mydsl.myDslSample.MyDslSamplePackage#getSecurityPolicy_EndPoint()
   * @model containment="true"
   * @generated
   */
  EndPoint getEndPoint();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDslSample.SecurityPolicy#getEndPoint <em>End Point</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>End Point</em>' containment reference.
   * @see #getEndPoint()
   * @generated
   */
  void setEndPoint(EndPoint value);

  /**
   * Returns the value of the '<em><b>Conditionlist</b></em>' reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDslSample.Condition}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Conditionlist</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Conditionlist</em>' reference list.
   * @see org.xtext.example.mydsl.myDslSample.MyDslSamplePackage#getSecurityPolicy_Conditionlist()
   * @model
   * @generated
   */
  EList<Condition> getConditionlist();

  /**
   * Returns the value of the '<em><b>Operation List</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Operation List</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operation List</em>' attribute list.
   * @see org.xtext.example.mydsl.myDslSample.MyDslSamplePackage#getSecurityPolicy_OperationList()
   * @model unique="false"
   * @generated
   */
  EList<String> getOperationList();

  /**
   * Returns the value of the '<em><b>True Action List</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDslSample.Action}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>True Action List</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>True Action List</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDslSample.MyDslSamplePackage#getSecurityPolicy_TrueActionList()
   * @model containment="true"
   * @generated
   */
  EList<Action> getTrueActionList();

  /**
   * Returns the value of the '<em><b>False Action List</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDslSample.Action}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>False Action List</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>False Action List</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDslSample.MyDslSamplePackage#getSecurityPolicy_FalseActionList()
   * @model containment="true"
   * @generated
   */
  EList<Action> getFalseActionList();

} // SecurityPolicy
