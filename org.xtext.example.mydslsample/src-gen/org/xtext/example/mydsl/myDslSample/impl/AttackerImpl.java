/**
 */
package org.xtext.example.mydsl.myDslSample.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.mydsl.myDslSample.Attacker;
import org.xtext.example.mydsl.myDslSample.MaliciousRequest;
import org.xtext.example.mydsl.myDslSample.MyDslSamplePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attacker</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDslSample.impl.AttackerImpl#getRequests <em>Requests</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AttackerImpl extends AgentImpl implements Attacker
{
  /**
   * The cached value of the '{@link #getRequests() <em>Requests</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRequests()
   * @generated
   * @ordered
   */
  protected EList<MaliciousRequest> requests;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AttackerImpl()
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
    return MyDslSamplePackage.Literals.ATTACKER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<MaliciousRequest> getRequests()
  {
    if (requests == null)
    {
      requests = new EObjectContainmentEList<MaliciousRequest>(MaliciousRequest.class, this, MyDslSamplePackage.ATTACKER__REQUESTS);
    }
    return requests;
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
      case MyDslSamplePackage.ATTACKER__REQUESTS:
        return ((InternalEList<?>)getRequests()).basicRemove(otherEnd, msgs);
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
      case MyDslSamplePackage.ATTACKER__REQUESTS:
        return getRequests();
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
      case MyDslSamplePackage.ATTACKER__REQUESTS:
        getRequests().clear();
        getRequests().addAll((Collection<? extends MaliciousRequest>)newValue);
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
      case MyDslSamplePackage.ATTACKER__REQUESTS:
        getRequests().clear();
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
      case MyDslSamplePackage.ATTACKER__REQUESTS:
        return requests != null && !requests.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //AttackerImpl
