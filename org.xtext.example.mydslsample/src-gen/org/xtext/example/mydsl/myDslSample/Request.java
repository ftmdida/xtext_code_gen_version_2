/**
 */
package org.xtext.example.mydsl.myDslSample;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Request</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDslSample.Request#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDslSample.Request#getSource <em>Source</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDslSample.Request#getDestination <em>Destination</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDslSample.Request#getPort <em>Port</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDslSample.Request#getData <em>Data</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDslSample.Request#getProtocol <em>Protocol</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.myDslSample.MyDslSamplePackage#getRequest()
 * @model
 * @generated
 */
public interface Request extends EObject
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
   * @see org.xtext.example.mydsl.myDslSample.MyDslSamplePackage#getRequest_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDslSample.Request#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Source</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Source</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Source</em>' containment reference.
   * @see #setSource(IPAddress)
   * @see org.xtext.example.mydsl.myDslSample.MyDslSamplePackage#getRequest_Source()
   * @model containment="true"
   * @generated
   */
  IPAddress getSource();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDslSample.Request#getSource <em>Source</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Source</em>' containment reference.
   * @see #getSource()
   * @generated
   */
  void setSource(IPAddress value);

  /**
   * Returns the value of the '<em><b>Destination</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Destination</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Destination</em>' containment reference.
   * @see #setDestination(IPAddress)
   * @see org.xtext.example.mydsl.myDslSample.MyDslSamplePackage#getRequest_Destination()
   * @model containment="true"
   * @generated
   */
  IPAddress getDestination();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDslSample.Request#getDestination <em>Destination</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Destination</em>' containment reference.
   * @see #getDestination()
   * @generated
   */
  void setDestination(IPAddress value);

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
   * @see org.xtext.example.mydsl.myDslSample.MyDslSamplePackage#getRequest_Port()
   * @model
   * @generated
   */
  int getPort();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDslSample.Request#getPort <em>Port</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Port</em>' attribute.
   * @see #getPort()
   * @generated
   */
  void setPort(int value);

  /**
   * Returns the value of the '<em><b>Data</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Data</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Data</em>' attribute.
   * @see #setData(String)
   * @see org.xtext.example.mydsl.myDslSample.MyDslSamplePackage#getRequest_Data()
   * @model
   * @generated
   */
  String getData();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDslSample.Request#getData <em>Data</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Data</em>' attribute.
   * @see #getData()
   * @generated
   */
  void setData(String value);

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
   * @see org.xtext.example.mydsl.myDslSample.MyDslSamplePackage#getRequest_Protocol()
   * @model
   * @generated
   */
  Protocol getProtocol();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDslSample.Request#getProtocol <em>Protocol</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Protocol</em>' attribute.
   * @see org.xtext.example.mydsl.myDslSample.Protocol
   * @see #getProtocol()
   * @generated
   */
  void setProtocol(Protocol value);

} // Request
