/**
 * generated by Xtext 2.12.0
 */
package fr.imta.renaud.ssinigaglia.webDsl.impl;

import fr.imta.renaud.ssinigaglia.webDsl.Attribute;
import fr.imta.renaud.ssinigaglia.webDsl.HtmlElement;
import fr.imta.renaud.ssinigaglia.webDsl.Var;
import fr.imta.renaud.ssinigaglia.webDsl.WebDslPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Comparable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.imta.renaud.ssinigaglia.webDsl.impl.ComparableImpl#getVar <em>Var</em>}</li>
 *   <li>{@link fr.imta.renaud.ssinigaglia.webDsl.impl.ComparableImpl#getHtmlElement <em>Html Element</em>}</li>
 *   <li>{@link fr.imta.renaud.ssinigaglia.webDsl.impl.ComparableImpl#getAttribute <em>Attribute</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComparableImpl extends MinimalEObjectImpl.Container implements fr.imta.renaud.ssinigaglia.webDsl.Comparable
{
  /**
   * The cached value of the '{@link #getVar() <em>Var</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVar()
   * @generated
   * @ordered
   */
  protected Var var;

  /**
   * The default value of the '{@link #getHtmlElement() <em>Html Element</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHtmlElement()
   * @generated
   * @ordered
   */
  protected static final HtmlElement HTML_ELEMENT_EDEFAULT = HtmlElement.LINK;

  /**
   * The cached value of the '{@link #getHtmlElement() <em>Html Element</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHtmlElement()
   * @generated
   * @ordered
   */
  protected HtmlElement htmlElement = HTML_ELEMENT_EDEFAULT;

  /**
   * The default value of the '{@link #getAttribute() <em>Attribute</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttribute()
   * @generated
   * @ordered
   */
  protected static final Attribute ATTRIBUTE_EDEFAULT = Attribute.LABEL;

  /**
   * The cached value of the '{@link #getAttribute() <em>Attribute</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttribute()
   * @generated
   * @ordered
   */
  protected Attribute attribute = ATTRIBUTE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ComparableImpl()
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
    return WebDslPackage.Literals.COMPARABLE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Var getVar()
  {
    return var;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVar(Var newVar, NotificationChain msgs)
  {
    Var oldVar = var;
    var = newVar;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WebDslPackage.COMPARABLE__VAR, oldVar, newVar);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVar(Var newVar)
  {
    if (newVar != var)
    {
      NotificationChain msgs = null;
      if (var != null)
        msgs = ((InternalEObject)var).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WebDslPackage.COMPARABLE__VAR, null, msgs);
      if (newVar != null)
        msgs = ((InternalEObject)newVar).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WebDslPackage.COMPARABLE__VAR, null, msgs);
      msgs = basicSetVar(newVar, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WebDslPackage.COMPARABLE__VAR, newVar, newVar));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HtmlElement getHtmlElement()
  {
    return htmlElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHtmlElement(HtmlElement newHtmlElement)
  {
    HtmlElement oldHtmlElement = htmlElement;
    htmlElement = newHtmlElement == null ? HTML_ELEMENT_EDEFAULT : newHtmlElement;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WebDslPackage.COMPARABLE__HTML_ELEMENT, oldHtmlElement, htmlElement));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Attribute getAttribute()
  {
    return attribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAttribute(Attribute newAttribute)
  {
    Attribute oldAttribute = attribute;
    attribute = newAttribute == null ? ATTRIBUTE_EDEFAULT : newAttribute;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WebDslPackage.COMPARABLE__ATTRIBUTE, oldAttribute, attribute));
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
      case WebDslPackage.COMPARABLE__VAR:
        return basicSetVar(null, msgs);
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
      case WebDslPackage.COMPARABLE__VAR:
        return getVar();
      case WebDslPackage.COMPARABLE__HTML_ELEMENT:
        return getHtmlElement();
      case WebDslPackage.COMPARABLE__ATTRIBUTE:
        return getAttribute();
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
      case WebDslPackage.COMPARABLE__VAR:
        setVar((Var)newValue);
        return;
      case WebDslPackage.COMPARABLE__HTML_ELEMENT:
        setHtmlElement((HtmlElement)newValue);
        return;
      case WebDslPackage.COMPARABLE__ATTRIBUTE:
        setAttribute((Attribute)newValue);
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
      case WebDslPackage.COMPARABLE__VAR:
        setVar((Var)null);
        return;
      case WebDslPackage.COMPARABLE__HTML_ELEMENT:
        setHtmlElement(HTML_ELEMENT_EDEFAULT);
        return;
      case WebDslPackage.COMPARABLE__ATTRIBUTE:
        setAttribute(ATTRIBUTE_EDEFAULT);
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
      case WebDslPackage.COMPARABLE__VAR:
        return var != null;
      case WebDslPackage.COMPARABLE__HTML_ELEMENT:
        return htmlElement != HTML_ELEMENT_EDEFAULT;
      case WebDslPackage.COMPARABLE__ATTRIBUTE:
        return attribute != ATTRIBUTE_EDEFAULT;
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
    result.append(" (htmlElement: ");
    result.append(htmlElement);
    result.append(", attribute: ");
    result.append(attribute);
    result.append(')');
    return result.toString();
  }

} //ComparableImpl
