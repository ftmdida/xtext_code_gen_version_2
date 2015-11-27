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

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.mydsl.myDslSample.Action;
import org.xtext.example.mydsl.myDslSample.Condition;
import org.xtext.example.mydsl.myDslSample.EndPoint;
import org.xtext.example.mydsl.myDslSample.MyDslSamplePackage;
import org.xtext.example.mydsl.myDslSample.SecurityPolicy;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Security Policy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDslSample.impl.SecurityPolicyImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDslSample.impl.SecurityPolicyImpl#getEndPoint <em>End Point</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDslSample.impl.SecurityPolicyImpl#getConditionlist <em>Conditionlist</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDslSample.impl.SecurityPolicyImpl#getOperationList <em>Operation List</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDslSample.impl.SecurityPolicyImpl#getTrueActionList <em>True Action List</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDslSample.impl.SecurityPolicyImpl#getFalseActionList <em>False Action List</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SecurityPolicyImpl extends MinimalEObjectImpl.Container implements SecurityPolicy
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
   * The cached value of the '{@link #getEndPoint() <em>End Point</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEndPoint()
   * @generated
   * @ordered
   */
  protected EndPoint endPoint;

  /**
   * The cached value of the '{@link #getConditionlist() <em>Conditionlist</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConditionlist()
   * @generated
   * @ordered
   */
  protected EList<Condition> conditionlist;

  /**
   * The cached value of the '{@link #getOperationList() <em>Operation List</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperationList()
   * @generated
   * @ordered
   */
  protected EList<String> operationList;

  /**
   * The cached value of the '{@link #getTrueActionList() <em>True Action List</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTrueActionList()
   * @generated
   * @ordered
   */
  protected EList<Action> trueActionList;

  /**
   * The cached value of the '{@link #getFalseActionList() <em>False Action List</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFalseActionList()
   * @generated
   * @ordered
   */
  protected EList<Action> falseActionList;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SecurityPolicyImpl()
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
    return MyDslSamplePackage.Literals.SECURITY_POLICY;
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
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslSamplePackage.SECURITY_POLICY__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EndPoint getEndPoint()
  {
    return endPoint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEndPoint(EndPoint newEndPoint, NotificationChain msgs)
  {
    EndPoint oldEndPoint = endPoint;
    endPoint = newEndPoint;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslSamplePackage.SECURITY_POLICY__END_POINT, oldEndPoint, newEndPoint);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEndPoint(EndPoint newEndPoint)
  {
    if (newEndPoint != endPoint)
    {
      NotificationChain msgs = null;
      if (endPoint != null)
        msgs = ((InternalEObject)endPoint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslSamplePackage.SECURITY_POLICY__END_POINT, null, msgs);
      if (newEndPoint != null)
        msgs = ((InternalEObject)newEndPoint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslSamplePackage.SECURITY_POLICY__END_POINT, null, msgs);
      msgs = basicSetEndPoint(newEndPoint, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslSamplePackage.SECURITY_POLICY__END_POINT, newEndPoint, newEndPoint));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Condition> getConditionlist()
  {
    if (conditionlist == null)
    {
      conditionlist = new EObjectResolvingEList<Condition>(Condition.class, this, MyDslSamplePackage.SECURITY_POLICY__CONDITIONLIST);
    }
    return conditionlist;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getOperationList()
  {
    if (operationList == null)
    {
      operationList = new EDataTypeEList<String>(String.class, this, MyDslSamplePackage.SECURITY_POLICY__OPERATION_LIST);
    }
    return operationList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Action> getTrueActionList()
  {
    if (trueActionList == null)
    {
      trueActionList = new EObjectContainmentEList<Action>(Action.class, this, MyDslSamplePackage.SECURITY_POLICY__TRUE_ACTION_LIST);
    }
    return trueActionList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Action> getFalseActionList()
  {
    if (falseActionList == null)
    {
      falseActionList = new EObjectContainmentEList<Action>(Action.class, this, MyDslSamplePackage.SECURITY_POLICY__FALSE_ACTION_LIST);
    }
    return falseActionList;
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
      case MyDslSamplePackage.SECURITY_POLICY__END_POINT:
        return basicSetEndPoint(null, msgs);
      case MyDslSamplePackage.SECURITY_POLICY__TRUE_ACTION_LIST:
        return ((InternalEList<?>)getTrueActionList()).basicRemove(otherEnd, msgs);
      case MyDslSamplePackage.SECURITY_POLICY__FALSE_ACTION_LIST:
        return ((InternalEList<?>)getFalseActionList()).basicRemove(otherEnd, msgs);
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
      case MyDslSamplePackage.SECURITY_POLICY__NAME:
        return getName();
      case MyDslSamplePackage.SECURITY_POLICY__END_POINT:
        return getEndPoint();
      case MyDslSamplePackage.SECURITY_POLICY__CONDITIONLIST:
        return getConditionlist();
      case MyDslSamplePackage.SECURITY_POLICY__OPERATION_LIST:
        return getOperationList();
      case MyDslSamplePackage.SECURITY_POLICY__TRUE_ACTION_LIST:
        return getTrueActionList();
      case MyDslSamplePackage.SECURITY_POLICY__FALSE_ACTION_LIST:
        return getFalseActionList();
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
      case MyDslSamplePackage.SECURITY_POLICY__NAME:
        setName((String)newValue);
        return;
      case MyDslSamplePackage.SECURITY_POLICY__END_POINT:
        setEndPoint((EndPoint)newValue);
        return;
      case MyDslSamplePackage.SECURITY_POLICY__CONDITIONLIST:
        getConditionlist().clear();
        getConditionlist().addAll((Collection<? extends Condition>)newValue);
        return;
      case MyDslSamplePackage.SECURITY_POLICY__OPERATION_LIST:
        getOperationList().clear();
        getOperationList().addAll((Collection<? extends String>)newValue);
        return;
      case MyDslSamplePackage.SECURITY_POLICY__TRUE_ACTION_LIST:
        getTrueActionList().clear();
        getTrueActionList().addAll((Collection<? extends Action>)newValue);
        return;
      case MyDslSamplePackage.SECURITY_POLICY__FALSE_ACTION_LIST:
        getFalseActionList().clear();
        getFalseActionList().addAll((Collection<? extends Action>)newValue);
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
      case MyDslSamplePackage.SECURITY_POLICY__NAME:
        setName(NAME_EDEFAULT);
        return;
      case MyDslSamplePackage.SECURITY_POLICY__END_POINT:
        setEndPoint((EndPoint)null);
        return;
      case MyDslSamplePackage.SECURITY_POLICY__CONDITIONLIST:
        getConditionlist().clear();
        return;
      case MyDslSamplePackage.SECURITY_POLICY__OPERATION_LIST:
        getOperationList().clear();
        return;
      case MyDslSamplePackage.SECURITY_POLICY__TRUE_ACTION_LIST:
        getTrueActionList().clear();
        return;
      case MyDslSamplePackage.SECURITY_POLICY__FALSE_ACTION_LIST:
        getFalseActionList().clear();
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
      case MyDslSamplePackage.SECURITY_POLICY__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case MyDslSamplePackage.SECURITY_POLICY__END_POINT:
        return endPoint != null;
      case MyDslSamplePackage.SECURITY_POLICY__CONDITIONLIST:
        return conditionlist != null && !conditionlist.isEmpty();
      case MyDslSamplePackage.SECURITY_POLICY__OPERATION_LIST:
        return operationList != null && !operationList.isEmpty();
      case MyDslSamplePackage.SECURITY_POLICY__TRUE_ACTION_LIST:
        return trueActionList != null && !trueActionList.isEmpty();
      case MyDslSamplePackage.SECURITY_POLICY__FALSE_ACTION_LIST:
        return falseActionList != null && !falseActionList.isEmpty();
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
    result.append(", operationList: ");
    result.append(operationList);
    result.append(')');
    return result.toString();
  }

} //SecurityPolicyImpl
