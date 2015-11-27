/**
 */
package org.xtext.example.mydsl.myDslSample.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.mydsl.myDslSample.IPAddress;
import org.xtext.example.mydsl.myDslSample.MyDslSamplePackage;
import org.xtext.example.mydsl.myDslSample.Protocol;
import org.xtext.example.mydsl.myDslSample.Request;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Request</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDslSample.impl.RequestImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDslSample.impl.RequestImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDslSample.impl.RequestImpl#getDestination <em>Destination</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDslSample.impl.RequestImpl#getPort <em>Port</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDslSample.impl.RequestImpl#getData <em>Data</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDslSample.impl.RequestImpl#getProtocol <em>Protocol</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RequestImpl extends MinimalEObjectImpl.Container implements Request
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
   * The cached value of the '{@link #getSource() <em>Source</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSource()
   * @generated
   * @ordered
   */
  protected IPAddress source;

  /**
   * The cached value of the '{@link #getDestination() <em>Destination</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDestination()
   * @generated
   * @ordered
   */
  protected IPAddress destination;

  /**
   * The default value of the '{@link #getPort() <em>Port</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPort()
   * @generated
   * @ordered
   */
  protected static final int PORT_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getPort() <em>Port</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPort()
   * @generated
   * @ordered
   */
  protected int port = PORT_EDEFAULT;

  /**
   * The default value of the '{@link #getData() <em>Data</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getData()
   * @generated
   * @ordered
   */
  protected static final String DATA_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getData() <em>Data</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getData()
   * @generated
   * @ordered
   */
  protected String data = DATA_EDEFAULT;

  /**
   * The default value of the '{@link #getProtocol() <em>Protocol</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProtocol()
   * @generated
   * @ordered
   */
  protected static final Protocol PROTOCOL_EDEFAULT = Protocol.HTTP;

  /**
   * The cached value of the '{@link #getProtocol() <em>Protocol</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProtocol()
   * @generated
   * @ordered
   */
  protected Protocol protocol = PROTOCOL_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RequestImpl()
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
    return MyDslSamplePackage.Literals.REQUEST;
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
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslSamplePackage.REQUEST__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IPAddress getSource()
  {
    return source;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSource(IPAddress newSource, NotificationChain msgs)
  {
    IPAddress oldSource = source;
    source = newSource;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslSamplePackage.REQUEST__SOURCE, oldSource, newSource);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSource(IPAddress newSource)
  {
    if (newSource != source)
    {
      NotificationChain msgs = null;
      if (source != null)
        msgs = ((InternalEObject)source).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslSamplePackage.REQUEST__SOURCE, null, msgs);
      if (newSource != null)
        msgs = ((InternalEObject)newSource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslSamplePackage.REQUEST__SOURCE, null, msgs);
      msgs = basicSetSource(newSource, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslSamplePackage.REQUEST__SOURCE, newSource, newSource));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IPAddress getDestination()
  {
    return destination;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDestination(IPAddress newDestination, NotificationChain msgs)
  {
    IPAddress oldDestination = destination;
    destination = newDestination;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslSamplePackage.REQUEST__DESTINATION, oldDestination, newDestination);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDestination(IPAddress newDestination)
  {
    if (newDestination != destination)
    {
      NotificationChain msgs = null;
      if (destination != null)
        msgs = ((InternalEObject)destination).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslSamplePackage.REQUEST__DESTINATION, null, msgs);
      if (newDestination != null)
        msgs = ((InternalEObject)newDestination).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslSamplePackage.REQUEST__DESTINATION, null, msgs);
      msgs = basicSetDestination(newDestination, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslSamplePackage.REQUEST__DESTINATION, newDestination, newDestination));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getPort()
  {
    return port;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPort(int newPort)
  {
    int oldPort = port;
    port = newPort;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslSamplePackage.REQUEST__PORT, oldPort, port));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getData()
  {
    return data;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setData(String newData)
  {
    String oldData = data;
    data = newData;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslSamplePackage.REQUEST__DATA, oldData, data));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Protocol getProtocol()
  {
    return protocol;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setProtocol(Protocol newProtocol)
  {
    Protocol oldProtocol = protocol;
    protocol = newProtocol == null ? PROTOCOL_EDEFAULT : newProtocol;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslSamplePackage.REQUEST__PROTOCOL, oldProtocol, protocol));
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
      case MyDslSamplePackage.REQUEST__SOURCE:
        return basicSetSource(null, msgs);
      case MyDslSamplePackage.REQUEST__DESTINATION:
        return basicSetDestination(null, msgs);
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
      case MyDslSamplePackage.REQUEST__NAME:
        return getName();
      case MyDslSamplePackage.REQUEST__SOURCE:
        return getSource();
      case MyDslSamplePackage.REQUEST__DESTINATION:
        return getDestination();
      case MyDslSamplePackage.REQUEST__PORT:
        return getPort();
      case MyDslSamplePackage.REQUEST__DATA:
        return getData();
      case MyDslSamplePackage.REQUEST__PROTOCOL:
        return getProtocol();
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
      case MyDslSamplePackage.REQUEST__NAME:
        setName((String)newValue);
        return;
      case MyDslSamplePackage.REQUEST__SOURCE:
        setSource((IPAddress)newValue);
        return;
      case MyDslSamplePackage.REQUEST__DESTINATION:
        setDestination((IPAddress)newValue);
        return;
      case MyDslSamplePackage.REQUEST__PORT:
        setPort((Integer)newValue);
        return;
      case MyDslSamplePackage.REQUEST__DATA:
        setData((String)newValue);
        return;
      case MyDslSamplePackage.REQUEST__PROTOCOL:
        setProtocol((Protocol)newValue);
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
      case MyDslSamplePackage.REQUEST__NAME:
        setName(NAME_EDEFAULT);
        return;
      case MyDslSamplePackage.REQUEST__SOURCE:
        setSource((IPAddress)null);
        return;
      case MyDslSamplePackage.REQUEST__DESTINATION:
        setDestination((IPAddress)null);
        return;
      case MyDslSamplePackage.REQUEST__PORT:
        setPort(PORT_EDEFAULT);
        return;
      case MyDslSamplePackage.REQUEST__DATA:
        setData(DATA_EDEFAULT);
        return;
      case MyDslSamplePackage.REQUEST__PROTOCOL:
        setProtocol(PROTOCOL_EDEFAULT);
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
      case MyDslSamplePackage.REQUEST__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case MyDslSamplePackage.REQUEST__SOURCE:
        return source != null;
      case MyDslSamplePackage.REQUEST__DESTINATION:
        return destination != null;
      case MyDslSamplePackage.REQUEST__PORT:
        return port != PORT_EDEFAULT;
      case MyDslSamplePackage.REQUEST__DATA:
        return DATA_EDEFAULT == null ? data != null : !DATA_EDEFAULT.equals(data);
      case MyDslSamplePackage.REQUEST__PROTOCOL:
        return protocol != PROTOCOL_EDEFAULT;
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
    result.append(", port: ");
    result.append(port);
    result.append(", data: ");
    result.append(data);
    result.append(", protocol: ");
    result.append(protocol);
    result.append(')');
    return result.toString();
  }

} //RequestImpl
