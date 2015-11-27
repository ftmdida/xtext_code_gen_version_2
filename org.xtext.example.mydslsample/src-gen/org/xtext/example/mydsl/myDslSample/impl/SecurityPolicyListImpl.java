/**
 */
package org.xtext.example.mydsl.myDslSample.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.mydsl.myDslSample.Condition;
import org.xtext.example.mydsl.myDslSample.MyDslSamplePackage;
import org.xtext.example.mydsl.myDslSample.SecurityPolicy;
import org.xtext.example.mydsl.myDslSample.SecurityPolicyList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Security Policy List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDslSample.impl.SecurityPolicyListImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDslSample.impl.SecurityPolicyListImpl#getSecurityPolicies <em>Security Policies</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDslSample.impl.SecurityPolicyListImpl#getConditions <em>Conditions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SecurityPolicyListImpl extends MinimalEObjectImpl.Container implements SecurityPolicyList
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getSecurityPolicies() <em>Security Policies</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSecurityPolicies()
   * @generated
   * @ordered
   */
  protected EList<SecurityPolicy> securityPolicies;

  /**
   * The cached value of the '{@link #getConditions() <em>Conditions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConditions()
   * @generated
   * @ordered
   */
  protected EList<Condition> conditions;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SecurityPolicyListImpl()
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
    return MyDslSamplePackage.Literals.SECURITY_POLICY_LIST;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslSamplePackage.SECURITY_POLICY_LIST__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<SecurityPolicy> getSecurityPolicies()
  {
    if (securityPolicies == null)
    {
      securityPolicies = new EObjectContainmentEList<SecurityPolicy>(SecurityPolicy.class, this, MyDslSamplePackage.SECURITY_POLICY_LIST__SECURITY_POLICIES);
    }
    return securityPolicies;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Condition> getConditions()
  {
    if (conditions == null)
    {
      conditions = new EObjectContainmentEList<Condition>(Condition.class, this, MyDslSamplePackage.SECURITY_POLICY_LIST__CONDITIONS);
    }
    return conditions;
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
      case MyDslSamplePackage.SECURITY_POLICY_LIST__SECURITY_POLICIES:
        return ((InternalEList<?>)getSecurityPolicies()).basicRemove(otherEnd, msgs);
      case MyDslSamplePackage.SECURITY_POLICY_LIST__CONDITIONS:
        return ((InternalEList<?>)getConditions()).basicRemove(otherEnd, msgs);
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
      case MyDslSamplePackage.SECURITY_POLICY_LIST__NAME:
        return getName();
      case MyDslSamplePackage.SECURITY_POLICY_LIST__SECURITY_POLICIES:
        return getSecurityPolicies();
      case MyDslSamplePackage.SECURITY_POLICY_LIST__CONDITIONS:
        return getConditions();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MyDslSamplePackage.SECURITY_POLICY_LIST__NAME:
        setName((String)newValue);
        return;
      case MyDslSamplePackage.SECURITY_POLICY_LIST__SECURITY_POLICIES:
        getSecurityPolicies().clear();
        getSecurityPolicies().addAll((Collection<? extends SecurityPolicy>)newValue);
        return;
      case MyDslSamplePackage.SECURITY_POLICY_LIST__CONDITIONS:
        getConditions().clear();
        getConditions().addAll((Collection<? extends Condition>)newValue);
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
      case MyDslSamplePackage.SECURITY_POLICY_LIST__NAME:
        setName(NAME_EDEFAULT);
        return;
      case MyDslSamplePackage.SECURITY_POLICY_LIST__SECURITY_POLICIES:
        getSecurityPolicies().clear();
        return;
      case MyDslSamplePackage.SECURITY_POLICY_LIST__CONDITIONS:
        getConditions().clear();
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
      case MyDslSamplePackage.SECURITY_POLICY_LIST__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case MyDslSamplePackage.SECURITY_POLICY_LIST__SECURITY_POLICIES:
        return securityPolicies != null && !securityPolicies.isEmpty();
      case MyDslSamplePackage.SECURITY_POLICY_LIST__CONDITIONS:
        return conditions != null && !conditions.isEmpty();
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
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //SecurityPolicyListImpl
