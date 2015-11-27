/**
 */
package org.xtext.example.mydsl.myDslSample;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Protocol Check</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDslSample.ProtocolCheck#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.myDslSample.MyDslSamplePackage#getProtocolCheck()
 * @model
 * @generated
 */
public interface ProtocolCheck extends SubCondition
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * The literals are from the enumeration {@link org.xtext.example.mydsl.myDslSample.Protocol}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see org.xtext.example.mydsl.myDslSample.Protocol
   * @see #setValue(Protocol)
   * @see org.xtext.example.mydsl.myDslSample.MyDslSamplePackage#getProtocolCheck_Value()
   * @model
   * @generated
   */
  Protocol getValue();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDslSample.ProtocolCheck#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see org.xtext.example.mydsl.myDslSample.Protocol
   * @see #getValue()
   * @generated
   */
  void setValue(Protocol value);

} // ProtocolCheck
