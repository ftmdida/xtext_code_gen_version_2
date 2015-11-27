/**
 */
package org.xtext.example.mydsl.myDslSample.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.mydsl.myDslSample.Agent;
import org.xtext.example.mydsl.myDslSample.HttpShieldModel;
import org.xtext.example.mydsl.myDslSample.MyDslSamplePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Http Shield Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDslSample.impl.HttpShieldModelImpl#getAgents <em>Agents</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HttpShieldModelImpl extends MinimalEObjectImpl.Container implements HttpShieldModel
{
  /**
   * The cached value of the '{@link #getAgents() <em>Agents</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAgents()
   * @generated
   * @ordered
   */
  protected EList<Agent> agents;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected HttpShieldModelImpl()
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
    return MyDslSamplePackage.Literals.HTTP_SHIELD_MODEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Agent> getAgents()
  {
    if (agents == null)
    {
      agents = new EObjectContainmentEList<Agent>(Agent.class, this, MyDslSamplePackage.HTTP_SHIELD_MODEL__AGENTS);
    }
    return agents;
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
      case MyDslSamplePackage.HTTP_SHIELD_MODEL__AGENTS:
        return ((InternalEList<?>)getAgents()).basicRemove(otherEnd, msgs);
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
      case MyDslSamplePackage.HTTP_SHIELD_MODEL__AGENTS:
        return getAgents();
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
      case MyDslSamplePackage.HTTP_SHIELD_MODEL__AGENTS:
        getAgents().clear();
        getAgents().addAll((Collection<? extends Agent>)newValue);
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
      case MyDslSamplePackage.HTTP_SHIELD_MODEL__AGENTS:
        getAgents().clear();
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
      case MyDslSamplePackage.HTTP_SHIELD_MODEL__AGENTS:
        return agents != null && !agents.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //HttpShieldModelImpl
