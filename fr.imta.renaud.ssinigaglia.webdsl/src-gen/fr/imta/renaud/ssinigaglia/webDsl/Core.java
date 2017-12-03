/**
 * generated by Xtext 2.12.0
 */
package fr.imta.renaud.ssinigaglia.webDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Core</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.imta.renaud.ssinigaglia.webDsl.Core#getName <em>Name</em>}</li>
 *   <li>{@link fr.imta.renaud.ssinigaglia.webDsl.Core#getBrowser <em>Browser</em>}</li>
 *   <li>{@link fr.imta.renaud.ssinigaglia.webDsl.Core#getActions <em>Actions</em>}</li>
 * </ul>
 *
 * @see fr.imta.renaud.ssinigaglia.webDsl.WebDslPackage#getCore()
 * @model
 * @generated
 */
public interface Core extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see fr.imta.renaud.ssinigaglia.webDsl.WebDslPackage#getCore_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link fr.imta.renaud.ssinigaglia.webDsl.Core#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Browser</b></em>' attribute.
   * The literals are from the enumeration {@link fr.imta.renaud.ssinigaglia.webDsl.Browser}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Browser</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Browser</em>' attribute.
   * @see fr.imta.renaud.ssinigaglia.webDsl.Browser
   * @see #setBrowser(Browser)
   * @see fr.imta.renaud.ssinigaglia.webDsl.WebDslPackage#getCore_Browser()
   * @model
   * @generated
   */
  Browser getBrowser();

  /**
   * Sets the value of the '{@link fr.imta.renaud.ssinigaglia.webDsl.Core#getBrowser <em>Browser</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Browser</em>' attribute.
   * @see fr.imta.renaud.ssinigaglia.webDsl.Browser
   * @see #getBrowser()
   * @generated
   */
  void setBrowser(Browser value);

  /**
   * Returns the value of the '<em><b>Actions</b></em>' containment reference list.
   * The list contents are of type {@link fr.imta.renaud.ssinigaglia.webDsl.Action}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Actions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Actions</em>' containment reference list.
   * @see fr.imta.renaud.ssinigaglia.webDsl.WebDslPackage#getCore_Actions()
   * @model containment="true"
   * @generated
   */
  EList<Action> getActions();

} // Core
