/**
 * generated by Xtext 2.12.0
 */
package fr.imta.renaud.ssinigaglia.webDsl.impl;

import fr.imta.renaud.ssinigaglia.webDsl.AssertEquals;
import fr.imta.renaud.ssinigaglia.webDsl.WebDslPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assert Equals</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.imta.renaud.ssinigaglia.webDsl.impl.AssertEqualsImpl#getC1 <em>C1</em>}</li>
 *   <li>{@link fr.imta.renaud.ssinigaglia.webDsl.impl.AssertEqualsImpl#getC2 <em>C2</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssertEqualsImpl extends MinimalEObjectImpl.Container implements AssertEquals
{
  /**
   * The cached value of the '{@link #getC1() <em>C1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getC1()
   * @generated
   * @ordered
   */
  protected fr.imta.renaud.ssinigaglia.webDsl.Comparable c1;

  /**
   * The cached value of the '{@link #getC2() <em>C2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getC2()
   * @generated
   * @ordered
   */
  protected fr.imta.renaud.ssinigaglia.webDsl.Comparable c2;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AssertEqualsImpl()
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
    return WebDslPackage.Literals.ASSERT_EQUALS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public fr.imta.renaud.ssinigaglia.webDsl.Comparable getC1()
  {
    return c1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetC1(fr.imta.renaud.ssinigaglia.webDsl.Comparable newC1, NotificationChain msgs)
  {
    fr.imta.renaud.ssinigaglia.webDsl.Comparable oldC1 = c1;
    c1 = newC1;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WebDslPackage.ASSERT_EQUALS__C1, oldC1, newC1);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setC1(fr.imta.renaud.ssinigaglia.webDsl.Comparable newC1)
  {
    if (newC1 != c1)
    {
      NotificationChain msgs = null;
      if (c1 != null)
        msgs = ((InternalEObject)c1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WebDslPackage.ASSERT_EQUALS__C1, null, msgs);
      if (newC1 != null)
        msgs = ((InternalEObject)newC1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WebDslPackage.ASSERT_EQUALS__C1, null, msgs);
      msgs = basicSetC1(newC1, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WebDslPackage.ASSERT_EQUALS__C1, newC1, newC1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public fr.imta.renaud.ssinigaglia.webDsl.Comparable getC2()
  {
    return c2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetC2(fr.imta.renaud.ssinigaglia.webDsl.Comparable newC2, NotificationChain msgs)
  {
    fr.imta.renaud.ssinigaglia.webDsl.Comparable oldC2 = c2;
    c2 = newC2;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WebDslPackage.ASSERT_EQUALS__C2, oldC2, newC2);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setC2(fr.imta.renaud.ssinigaglia.webDsl.Comparable newC2)
  {
    if (newC2 != c2)
    {
      NotificationChain msgs = null;
      if (c2 != null)
        msgs = ((InternalEObject)c2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WebDslPackage.ASSERT_EQUALS__C2, null, msgs);
      if (newC2 != null)
        msgs = ((InternalEObject)newC2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WebDslPackage.ASSERT_EQUALS__C2, null, msgs);
      msgs = basicSetC2(newC2, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WebDslPackage.ASSERT_EQUALS__C2, newC2, newC2));
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
      case WebDslPackage.ASSERT_EQUALS__C1:
        return basicSetC1(null, msgs);
      case WebDslPackage.ASSERT_EQUALS__C2:
        return basicSetC2(null, msgs);
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
      case WebDslPackage.ASSERT_EQUALS__C1:
        return getC1();
      case WebDslPackage.ASSERT_EQUALS__C2:
        return getC2();
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
      case WebDslPackage.ASSERT_EQUALS__C1:
        setC1((fr.imta.renaud.ssinigaglia.webDsl.Comparable)newValue);
        return;
      case WebDslPackage.ASSERT_EQUALS__C2:
        setC2((fr.imta.renaud.ssinigaglia.webDsl.Comparable)newValue);
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
      case WebDslPackage.ASSERT_EQUALS__C1:
        setC1((fr.imta.renaud.ssinigaglia.webDsl.Comparable)null);
        return;
      case WebDslPackage.ASSERT_EQUALS__C2:
        setC2((fr.imta.renaud.ssinigaglia.webDsl.Comparable)null);
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
      case WebDslPackage.ASSERT_EQUALS__C1:
        return c1 != null;
      case WebDslPackage.ASSERT_EQUALS__C2:
        return c2 != null;
    }
    return super.eIsSet(featureID);
  }

} //AssertEqualsImpl
