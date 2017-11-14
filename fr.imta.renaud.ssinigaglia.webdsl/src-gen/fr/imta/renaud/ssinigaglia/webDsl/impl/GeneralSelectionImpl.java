/**
 * generated by Xtext 2.12.0
 */
package fr.imta.renaud.ssinigaglia.webDsl.impl;

import fr.imta.renaud.ssinigaglia.webDsl.GeneralAction;
import fr.imta.renaud.ssinigaglia.webDsl.GeneralSelection;
import fr.imta.renaud.ssinigaglia.webDsl.TypeSelection;
import fr.imta.renaud.ssinigaglia.webDsl.WebDslPackage;

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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>General Selection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.imta.renaud.ssinigaglia.webDsl.impl.GeneralSelectionImpl#getTypeSelection <em>Type Selection</em>}</li>
 *   <li>{@link fr.imta.renaud.ssinigaglia.webDsl.impl.GeneralSelectionImpl#getGeneralActions <em>General Actions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GeneralSelectionImpl extends MinimalEObjectImpl.Container implements GeneralSelection
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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected GeneralSelectionImpl()
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
    return WebDslPackage.Literals.GENERAL_SELECTION;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WebDslPackage.GENERAL_SELECTION__TYPE_SELECTION, oldTypeSelection, newTypeSelection);
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
        msgs = ((InternalEObject)typeSelection).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WebDslPackage.GENERAL_SELECTION__TYPE_SELECTION, null, msgs);
      if (newTypeSelection != null)
        msgs = ((InternalEObject)newTypeSelection).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WebDslPackage.GENERAL_SELECTION__TYPE_SELECTION, null, msgs);
      msgs = basicSetTypeSelection(newTypeSelection, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WebDslPackage.GENERAL_SELECTION__TYPE_SELECTION, newTypeSelection, newTypeSelection));
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
      generalActions = new EObjectContainmentEList<GeneralAction>(GeneralAction.class, this, WebDslPackage.GENERAL_SELECTION__GENERAL_ACTIONS);
    }
    return generalActions;
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
      case WebDslPackage.GENERAL_SELECTION__TYPE_SELECTION:
        return basicSetTypeSelection(null, msgs);
      case WebDslPackage.GENERAL_SELECTION__GENERAL_ACTIONS:
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
      case WebDslPackage.GENERAL_SELECTION__TYPE_SELECTION:
        return getTypeSelection();
      case WebDslPackage.GENERAL_SELECTION__GENERAL_ACTIONS:
        return getGeneralActions();
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
      case WebDslPackage.GENERAL_SELECTION__TYPE_SELECTION:
        setTypeSelection((TypeSelection)newValue);
        return;
      case WebDslPackage.GENERAL_SELECTION__GENERAL_ACTIONS:
        getGeneralActions().clear();
        getGeneralActions().addAll((Collection<? extends GeneralAction>)newValue);
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
      case WebDslPackage.GENERAL_SELECTION__TYPE_SELECTION:
        setTypeSelection((TypeSelection)null);
        return;
      case WebDslPackage.GENERAL_SELECTION__GENERAL_ACTIONS:
        getGeneralActions().clear();
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
      case WebDslPackage.GENERAL_SELECTION__TYPE_SELECTION:
        return typeSelection != null;
      case WebDslPackage.GENERAL_SELECTION__GENERAL_ACTIONS:
        return generalActions != null && !generalActions.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //GeneralSelectionImpl
