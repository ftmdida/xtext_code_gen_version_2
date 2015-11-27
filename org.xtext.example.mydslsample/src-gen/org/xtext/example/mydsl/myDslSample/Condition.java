/**
 */
package org.xtext.example.mydsl.myDslSample;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDslSample.Condition#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDslSample.Condition#getSubConditionList <em>Sub Condition List</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.myDslSample.MyDslSamplePackage#getCondition()
 * @model
 * @generated
 */
public interface Condition extends EObject
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
   * @see org.xtext.example.mydsl.myDslSample.MyDslSamplePackage#getCondition_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDslSample.Condition#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Sub Condition List</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDslSample.SubCondition}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sub Condition List</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sub Condition List</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDslSample.MyDslSamplePackage#getCondition_SubConditionList()
   * @model containment="true"
   * @generated
   */
  EList<SubCondition> getSubConditionList();

} // Condition
