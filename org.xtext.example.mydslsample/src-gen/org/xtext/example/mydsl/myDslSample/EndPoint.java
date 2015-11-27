/**
 */
package org.xtext.example.mydsl.myDslSample;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>End Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDslSample.EndPoint#getPort <em>Port</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDslSample.EndPoint#getProtocol <em>Protocol</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.myDslSample.MyDslSamplePackage#getEndPoint()
 * @model
 * @generated
 */
public interface EndPoint extends EObject
{
  /**
   * Returns the value of the '<em><b>Port</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Port</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Port</em>' attribute.
   * @see #setPort(int)
   * @see org.xtext.example.mydsl.myDslSample.MyDslSamplePackage#getEndPoint_Port()
   * @model
   * @generated
   */
  int getPort();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDslSample.EndPoint#getPort <em>Port</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Port</em>' attribute.
   * @see #getPort()
   * @generated
   */
  void setPort(int value);

  /**
   * Returns the value of the '<em><b>Protocol</b></em>' attribute.
   * The literals are from the enumeration {@link org.xtext.example.mydsl.myDslSample.Protocol}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Protocol</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Protocol</em>' attribute.
   * @see org.xtext.example.mydsl.myDslSample.Protocol
   * @see #setProtocol(Protocol)
   * @see org.xtext.example.mydsl.myDslSample.MyDslSamplePackage#getEndPoint_Protocol()
   * @model
   * @generated
   */
  Protocol getProtocol();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDslSample.EndPoint#getProtocol <em>Protocol</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Protocol</em>' attribute.
   * @see org.xtext.example.mydsl.myDslSample.Protocol
   * @see #getProtocol()
   * @generated
   */
  void setProtocol(Protocol value);

} // EndPoint
