/**
 */
package org.xtext.example.mydsl.myDslSample.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.example.mydsl.myDslSample.Defender;
import org.xtext.example.mydsl.myDslSample.MyDslSamplePackage;
import org.xtext.example.mydsl.myDslSample.SecurityPolicyList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Defender</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDslSample.impl.DefenderImpl#getSecurityPolicylist <em>Security Policylist</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DefenderImpl extends AgentImpl implements Defender
{
  /**
   * The cached value of the '{@link #getSecurityPolicylist() <em>Security Policylist</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSecurityPolicylist()
   * @generated
   * @ordered
   */
  protected SecurityPolicyList securityPolicylist;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DefenderImpl()
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
    return MyDslSamplePackage.Literals.DEFENDER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SecurityPolicyList getSecurityPolicylist()
  {
    return securityPolicylist;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSecurityPolicylist(SecurityPolicyList newSecurityPolicylist, NotificationChain msgs)
  {
    SecurityPolicyList oldSecurityPolicylist = securityPolicylist;
    securityPolicylist = newSecurityPolicylist;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslSamplePackage.DEFENDER__SECURITY_POLICYLIST, oldSecurityPolicylist, newSecurityPolicylist);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSecurityPolicylist(SecurityPolicyList newSecurityPolicylist)
  {
    if (newSecurityPolicylist != securityPolicylist)
    {
      NotificationChain msgs = null;
      if (securityPolicylist != null)
        msgs = ((InternalEObject)securityPolicylist).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslSamplePackage.DEFENDER__SECURITY_POLICYLIST, null, msgs);
      if (newSecurityPolicylist != null)
        msgs = ((InternalEObject)newSecurityPolicylist).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslSamplePackage.DEFENDER__SECURITY_POLICYLIST, null, msgs);
      msgs = basicSetSecurityPolicylist(newSecurityPolicylist, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslSamplePackage.DEFENDER__SECURITY_POLICYLIST, newSecurityPolicylist, newSecurityPolicylist));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case MyDslSamplePackage.DEFENDER__SECURITY_POLICYLIST:
        return basicSetSecurityPolicylist(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case MyDslSamplePackage.DEFENDER__SECURITY_POLICYLIST:
        return getSecurityPolicylist();
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
      case MyDslSamplePackage.DEFENDER__SECURITY_POLICYLIST:
        setSecurityPolicylist((SecurityPolicyList)newValue);
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
      case MyDslSamplePackage.DEFENDER__SECURITY_POLICYLIST:
        setSecurityPolicylist((SecurityPolicyList)null);
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
      case MyDslSamplePackage.DEFENDER__SECURITY_POLICYLIST:
        return securityPolicylist != null;
    }
    return super.eIsSet(featureID);
  }

} //DefenderImpl
