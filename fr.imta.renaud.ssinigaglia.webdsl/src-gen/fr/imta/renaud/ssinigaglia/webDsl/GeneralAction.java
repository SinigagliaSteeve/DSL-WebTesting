/**
 * generated by Xtext 2.12.0
 */
package fr.imta.renaud.ssinigaglia.webDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>General Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.imta.renaud.ssinigaglia.webDsl.GeneralAction#getSetAction <em>Set Action</em>}</li>
 *   <li>{@link fr.imta.renaud.ssinigaglia.webDsl.GeneralAction#getStoreAction <em>Store Action</em>}</li>
 *   <li>{@link fr.imta.renaud.ssinigaglia.webDsl.GeneralAction#getSelection <em>Selection</em>}</li>
 * </ul>
 *
 * @see fr.imta.renaud.ssinigaglia.webDsl.WebDslPackage#getGeneralAction()
 * @model
 * @generated
 */
public interface GeneralAction extends EObject
{
  /**
   * Returns the value of the '<em><b>Set Action</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Set Action</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Set Action</em>' containment reference.
   * @see #setSetAction(SetAction)
   * @see fr.imta.renaud.ssinigaglia.webDsl.WebDslPackage#getGeneralAction_SetAction()
   * @model containment="true"
   * @generated
   */
  SetAction getSetAction();

  /**
   * Sets the value of the '{@link fr.imta.renaud.ssinigaglia.webDsl.GeneralAction#getSetAction <em>Set Action</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Set Action</em>' containment reference.
   * @see #getSetAction()
   * @generated
   */
  void setSetAction(SetAction value);

  /**
   * Returns the value of the '<em><b>Store Action</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Store Action</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Store Action</em>' containment reference.
   * @see #setStoreAction(StoreAction)
   * @see fr.imta.renaud.ssinigaglia.webDsl.WebDslPackage#getGeneralAction_StoreAction()
   * @model containment="true"
   * @generated
   */
  StoreAction getStoreAction();

  /**
   * Sets the value of the '{@link fr.imta.renaud.ssinigaglia.webDsl.GeneralAction#getStoreAction <em>Store Action</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Store Action</em>' containment reference.
   * @see #getStoreAction()
   * @generated
   */
  void setStoreAction(StoreAction value);

  /**
   * Returns the value of the '<em><b>Selection</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Selection</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Selection</em>' containment reference.
   * @see #setSelection(Selection)
   * @see fr.imta.renaud.ssinigaglia.webDsl.WebDslPackage#getGeneralAction_Selection()
   * @model containment="true"
   * @generated
   */
  Selection getSelection();

  /**
   * Sets the value of the '{@link fr.imta.renaud.ssinigaglia.webDsl.GeneralAction#getSelection <em>Selection</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Selection</em>' containment reference.
   * @see #getSelection()
   * @generated
   */
  void setSelection(Selection value);

} // GeneralAction
