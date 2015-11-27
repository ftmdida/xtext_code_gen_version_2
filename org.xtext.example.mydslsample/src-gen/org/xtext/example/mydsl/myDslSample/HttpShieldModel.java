/**
 */
package org.xtext.example.mydsl.myDslSample;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Http Shield Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDslSample.HttpShieldModel#getAgents <em>Agents</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.myDslSample.MyDslSamplePackage#getHttpShieldModel()
 * @model
 * @generated
 */
public interface HttpShieldModel extends EObject
{
  /**
   * Returns the value of the '<em><b>Agents</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDslSample.Agent}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Agents</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Agents</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDslSample.MyDslSamplePackage#getHttpShieldModel_Agents()
   * @model containment="true"
   * @generated
   */
  EList<Agent> getAgents();

} // HttpShieldModel
