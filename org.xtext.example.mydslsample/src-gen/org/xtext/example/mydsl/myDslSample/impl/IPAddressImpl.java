/**
 */
package org.xtext.example.mydsl.myDslSample.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.mydsl.myDslSample.IPAddress;
import org.xtext.example.mydsl.myDslSample.MyDslSamplePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>IP Address</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDslSample.impl.IPAddressImpl#getByte1 <em>Byte1</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDslSample.impl.IPAddressImpl#getByte2 <em>Byte2</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDslSample.impl.IPAddressImpl#getByte3 <em>Byte3</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDslSample.impl.IPAddressImpl#getByte4 <em>Byte4</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IPAddressImpl extends MinimalEObjectImpl.Container implements IPAddress
{
  /**
   * The default value of the '{@link #getByte1() <em>Byte1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getByte1()
   * @generated
   * @ordered
   */
  protected static final int BYTE1_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getByte1() <em>Byte1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getByte1()
   * @generated
   * @ordered
   */
  protected int byte1 = BYTE1_EDEFAULT;

  /**
   * The default value of the '{@link #getByte2() <em>Byte2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getByte2()
   * @generated
   * @ordered
   */
  protected static final int BYTE2_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getByte2() <em>Byte2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getByte2()
   * @generated
   * @ordered
   */
  protected int byte2 = BYTE2_EDEFAULT;

  /**
   * The default value of the '{@link #getByte3() <em>Byte3</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getByte3()
   * @generated
   * @ordered
   */
  protected static final int BYTE3_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getByte3() <em>Byte3</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getByte3()
   * @generated
   * @ordered
   */
  protected int byte3 = BYTE3_EDEFAULT;

  /**
   * The default value of the '{@link #getByte4() <em>Byte4</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getByte4()
   * @generated
   * @ordered
   */
  protected static final int BYTE4_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getByte4() <em>Byte4</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getByte4()
   * @generated
   * @ordered
   */
  protected int byte4 = BYTE4_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected IPAddressImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return MyDslSamplePackage.Literals.IP_ADDRESS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getByte1()
  {
    return byte1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setByte1(int newByte1)
  {
    int oldByte1 = byte1;
    byte1 = newByte1;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslSamplePackage.IP_ADDRESS__BYTE1, oldByte1, byte1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getByte2()
  {
    return byte2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setByte2(int newByte2)
  {
    int oldByte2 = byte2;
    byte2 = newByte2;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslSamplePackage.IP_ADDRESS__BYTE2, oldByte2, byte2));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getByte3()
  {
    return byte3;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setByte3(int newByte3)
  {
    int oldByte3 = byte3;
    byte3 = newByte3;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslSamplePackage.IP_ADDRESS__BYTE3, oldByte3, byte3));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getByte4()
  {
    return byte4;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setByte4(int newByte4)
  {
    int oldByte4 = byte4;
    byte4 = newByte4;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslSamplePackage.IP_ADDRESS__BYTE4, oldByte4, byte4));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case MyDslSamplePackage.IP_ADDRESS__BYTE1:
        return getByte1();
      case MyDslSamplePackage.IP_ADDRESS__BYTE2:
        return getByte2();
      case MyDslSamplePackage.IP_ADDRESS__BYTE3:
        return getByte3();
      case MyDslSamplePackage.IP_ADDRESS__BYTE4:
        return getByte4();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MyDslSamplePackage.IP_ADDRESS__BYTE1:
        setByte1((Integer)newValue);
        return;
      case MyDslSamplePackage.IP_ADDRESS__BYTE2:
        setByte2((Integer)newValue);
        return;
      case MyDslSamplePackage.IP_ADDRESS__BYTE3:
        setByte3((Integer)newValue);
        return;
      case MyDslSamplePackage.IP_ADDRESS__BYTE4:
        setByte4((Integer)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case MyDslSamplePackage.IP_ADDRESS__BYTE1:
        setByte1(BYTE1_EDEFAULT);
        return;
      case MyDslSamplePackage.IP_ADDRESS__BYTE2:
        setByte2(BYTE2_EDEFAULT);
        return;
      case MyDslSamplePackage.IP_ADDRESS__BYTE3:
        setByte3(BYTE3_EDEFAULT);
        return;
      case MyDslSamplePackage.IP_ADDRESS__BYTE4:
        setByte4(BYTE4_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case MyDslSamplePackage.IP_ADDRESS__BYTE1:
        return byte1 != BYTE1_EDEFAULT;
      case MyDslSamplePackage.IP_ADDRESS__BYTE2:
        return byte2 != BYTE2_EDEFAULT;
      case MyDslSamplePackage.IP_ADDRESS__BYTE3:
        return byte3 != BYTE3_EDEFAULT;
      case MyDslSamplePackage.IP_ADDRESS__BYTE4:
        return byte4 != BYTE4_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (byte1: ");
    result.append(byte1);
    result.append(", byte2: ");
    result.append(byte2);
    result.append(", byte3: ");
    result.append(byte3);
    result.append(", byte4: ");
    result.append(byte4);
    result.append(')');
    return result.toString();
  }

} //IPAddressImpl
