/**
 * generated by Xtext 2.12.0
 */
package fr.imta.renaud.ssinigaglia.webDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Set Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.imta.renaud.ssinigaglia.webDsl.SetAction#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link fr.imta.renaud.ssinigaglia.webDsl.SetAction#getValue <em>Value</em>}</li>
 *   <li>{@link fr.imta.renaud.ssinigaglia.webDsl.SetAction#getVar <em>Var</em>}</li>
 * </ul>
 *
 * @see fr.imta.renaud.ssinigaglia.webDsl.WebDslPackage#getSetAction()
 * @model
 * @generated
 */
public interface SetAction extends GeneralAction
{
  /**
   * Returns the value of the '<em><b>Attribute</b></em>' attribute.
   * The literals are from the enumeration {@link fr.imta.renaud.ssinigaglia.webDsl.Attribute}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attribute</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attribute</em>' attribute.
   * @see fr.imta.renaud.ssinigaglia.webDsl.Attribute
   * @see #setAttribute(Attribute)
   * @see fr.imta.renaud.ssinigaglia.webDsl.WebDslPackage#getSetAction_Attribute()
   * @model
   * @generated
   */
  Attribute getAttribute();

  /**
   * Sets the value of the '{@link fr.imta.renaud.ssinigaglia.webDsl.SetAction#getAttribute <em>Attribute</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Attribute</em>' attribute.
   * @see fr.imta.renaud.ssinigaglia.webDsl.Attribute
   * @see #getAttribute()
   * @generated
   */
  void setAttribute(Attribute value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(String)
   * @see fr.imta.renaud.ssinigaglia.webDsl.WebDslPackage#getSetAction_Value()
   * @model
   * @generated
   */
  String getValue();

  /**
   * Sets the value of the '{@link fr.imta.renaud.ssinigaglia.webDsl.SetAction#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(String value);

  /**
   * Returns the value of the '<em><b>Var</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Var</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Var</em>' reference.
   * @see #setVar(Var)
   * @see fr.imta.renaud.ssinigaglia.webDsl.WebDslPackage#getSetAction_Var()
   * @model
   * @generated
   */
  Var getVar();

  /**
   * Sets the value of the '{@link fr.imta.renaud.ssinigaglia.webDsl.SetAction#getVar <em>Var</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Var</em>' reference.
   * @see #getVar()
   * @generated
   */
  void setVar(Var value);

} // SetAction
