/**
 * generated by Xtext 2.12.0
 */
package fr.imta.renaud.ssinigaglia.webDsl.impl;

import fr.imta.renaud.ssinigaglia.webDsl.GeneralAction;
import fr.imta.renaud.ssinigaglia.webDsl.LinkButtonSelection;
import fr.imta.renaud.ssinigaglia.webDsl.TypeSelection;
import fr.imta.renaud.ssinigaglia.webDsl.WebDslPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Link Button Selection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.imta.renaud.ssinigaglia.webDsl.impl.LinkButtonSelectionImpl#getTypeSelection <em>Type Selection</em>}</li>
 *   <li>{@link fr.imta.renaud.ssinigaglia.webDsl.impl.LinkButtonSelectionImpl#getGeneralActions <em>General Actions</em>}</li>
 *   <li>{@link fr.imta.renaud.ssinigaglia.webDsl.impl.LinkButtonSelectionImpl#getClicks <em>Clicks</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LinkButtonSelectionImpl extends SelectionImpl implements LinkButtonSelection
{
  /**
   * The cached value of the '{@link #getTypeSelection() <em>Type Selection</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypeSelection()
   * @generated
   * @ordered
   */
  protected TypeSelection typeSelection;

  /**
   * The cached value of the '{@link #getGeneralActions() <em>General Actions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGeneralActions()
   * @generated
   * @ordered
   */
  protected EList<GeneralAction> generalActions;

  /**
   * The cached value of the '{@link #getClicks() <em>Clicks</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClicks()
   * @generated
   * @ordered
   */
  protected EList<String> clicks;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LinkButtonSelectionImpl()
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
    return WebDslPackage.Literals.LINK_BUTTON_SELECTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeSelection getTypeSelection()
  {
    return typeSelection;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTypeSelection(TypeSelection newTypeSelection, NotificationChain msgs)
  {
    TypeSelection oldTypeSelection = typeSelection;
    typeSelection = newTypeSelection;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WebDslPackage.LINK_BUTTON_SELECTION__TYPE_SELECTION, oldTypeSelection, newTypeSelection);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTypeSelection(TypeSelection newTypeSelection)
  {
    if (newTypeSelection != typeSelection)
    {
      NotificationChain msgs = null;
      if (typeSelection != null)
        msgs = ((InternalEObject)typeSelection).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WebDslPackage.LINK_BUTTON_SELECTION__TYPE_SELECTION, null, msgs);
      if (newTypeSelection != null)
        msgs = ((InternalEObject)newTypeSelection).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WebDslPackage.LINK_BUTTON_SELECTION__TYPE_SELECTION, null, msgs);
      msgs = basicSetTypeSelection(newTypeSelection, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WebDslPackage.LINK_BUTTON_SELECTION__TYPE_SELECTION, newTypeSelection, newTypeSelection));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<GeneralAction> getGeneralActions()
  {
    if (generalActions == null)
    {
      generalActions = new EObjectContainmentEList<GeneralAction>(GeneralAction.class, this, WebDslPackage.LINK_BUTTON_SELECTION__GENERAL_ACTIONS);
    }
    return generalActions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getClicks()
  {
    if (clicks == null)
    {
      clicks = new EDataTypeEList<String>(String.class, this, WebDslPackage.LINK_BUTTON_SELECTION__CLICKS);
    }
    return clicks;
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
      case WebDslPackage.LINK_BUTTON_SELECTION__TYPE_SELECTION:
        return basicSetTypeSelection(null, msgs);
      case WebDslPackage.LINK_BUTTON_SELECTION__GENERAL_ACTIONS:
        return ((InternalEList<?>)getGeneralActions()).basicRemove(otherEnd, msgs);
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
      case WebDslPackage.LINK_BUTTON_SELECTION__TYPE_SELECTION:
        return getTypeSelection();
      case WebDslPackage.LINK_BUTTON_SELECTION__GENERAL_ACTIONS:
        return getGeneralActions();
      case WebDslPackage.LINK_BUTTON_SELECTION__CLICKS:
        return getClicks();
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
      case WebDslPackage.LINK_BUTTON_SELECTION__TYPE_SELECTION:
        setTypeSelection((TypeSelection)newValue);
        return;
      case WebDslPackage.LINK_BUTTON_SELECTION__GENERAL_ACTIONS:
        getGeneralActions().clear();
        getGeneralActions().addAll((Collection<? extends GeneralAction>)newValue);
        return;
      case WebDslPackage.LINK_BUTTON_SELECTION__CLICKS:
        getClicks().clear();
        getClicks().addAll((Collection<? extends String>)newValue);
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
      case WebDslPackage.LINK_BUTTON_SELECTION__TYPE_SELECTION:
        setTypeSelection((TypeSelection)null);
        return;
      case WebDslPackage.LINK_BUTTON_SELECTION__GENERAL_ACTIONS:
        getGeneralActions().clear();
        return;
      case WebDslPackage.LINK_BUTTON_SELECTION__CLICKS:
        getClicks().clear();
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
      case WebDslPackage.LINK_BUTTON_SELECTION__TYPE_SELECTION:
        return typeSelection != null;
      case WebDslPackage.LINK_BUTTON_SELECTION__GENERAL_ACTIONS:
        return generalActions != null && !generalActions.isEmpty();
      case WebDslPackage.LINK_BUTTON_SELECTION__CLICKS:
        return clicks != null && !clicks.isEmpty();
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
    result.append(" (clicks: ");
    result.append(clicks);
    result.append(')');
    return result.toString();
  }

} //LinkButtonSelectionImpl
