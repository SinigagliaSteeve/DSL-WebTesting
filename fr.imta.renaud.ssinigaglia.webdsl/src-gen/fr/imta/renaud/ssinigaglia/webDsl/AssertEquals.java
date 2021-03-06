/**
 * generated by Xtext 2.12.0
 */
package fr.imta.renaud.ssinigaglia.webDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assert Equals</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.imta.renaud.ssinigaglia.webDsl.AssertEquals#getC1 <em>C1</em>}</li>
 *   <li>{@link fr.imta.renaud.ssinigaglia.webDsl.AssertEquals#getC2 <em>C2</em>}</li>
 * </ul>
 *
 * @see fr.imta.renaud.ssinigaglia.webDsl.WebDslPackage#getAssertEquals()
 * @model
 * @generated
 */
public interface AssertEquals extends Assert
{
  /**
   * Returns the value of the '<em><b>C1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>C1</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>C1</em>' containment reference.
   * @see #setC1(fr.imta.renaud.ssinigaglia.webDsl.Comparable)
   * @see fr.imta.renaud.ssinigaglia.webDsl.WebDslPackage#getAssertEquals_C1()
   * @model containment="true"
   * @generated
   */
  fr.imta.renaud.ssinigaglia.webDsl.Comparable getC1();

  /**
   * Sets the value of the '{@link fr.imta.renaud.ssinigaglia.webDsl.AssertEquals#getC1 <em>C1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>C1</em>' containment reference.
   * @see #getC1()
   * @generated
   */
  void setC1(fr.imta.renaud.ssinigaglia.webDsl.Comparable value);

  /**
   * Returns the value of the '<em><b>C2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>C2</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>C2</em>' containment reference.
   * @see #setC2(fr.imta.renaud.ssinigaglia.webDsl.Comparable)
   * @see fr.imta.renaud.ssinigaglia.webDsl.WebDslPackage#getAssertEquals_C2()
   * @model containment="true"
   * @generated
   */
  fr.imta.renaud.ssinigaglia.webDsl.Comparable getC2();

  /**
   * Sets the value of the '{@link fr.imta.renaud.ssinigaglia.webDsl.AssertEquals#getC2 <em>C2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>C2</em>' containment reference.
   * @see #getC2()
   * @generated
   */
  void setC2(fr.imta.renaud.ssinigaglia.webDsl.Comparable value);

} // AssertEquals
