/**
 * generated by Xtext 2.12.0
 */
package fr.imta.renaud.ssinigaglia.webDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assert Contains</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.imta.renaud.ssinigaglia.webDsl.AssertContains#getHtmlElement <em>Html Element</em>}</li>
 *   <li>{@link fr.imta.renaud.ssinigaglia.webDsl.AssertContains#getAttribute <em>Attribute</em>}</li>
 * </ul>
 *
 * @see fr.imta.renaud.ssinigaglia.webDsl.WebDslPackage#getAssertContains()
 * @model
 * @generated
 */
public interface AssertContains extends EObject
{
  /**
   * Returns the value of the '<em><b>Html Element</b></em>' attribute.
   * The literals are from the enumeration {@link fr.imta.renaud.ssinigaglia.webDsl.HtmlElement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Html Element</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Html Element</em>' attribute.
   * @see fr.imta.renaud.ssinigaglia.webDsl.HtmlElement
   * @see #setHtmlElement(HtmlElement)
   * @see fr.imta.renaud.ssinigaglia.webDsl.WebDslPackage#getAssertContains_HtmlElement()
   * @model
   * @generated
   */
  HtmlElement getHtmlElement();

  /**
   * Sets the value of the '{@link fr.imta.renaud.ssinigaglia.webDsl.AssertContains#getHtmlElement <em>Html Element</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Html Element</em>' attribute.
   * @see fr.imta.renaud.ssinigaglia.webDsl.HtmlElement
   * @see #getHtmlElement()
   * @generated
   */
  void setHtmlElement(HtmlElement value);

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
   * @see fr.imta.renaud.ssinigaglia.webDsl.WebDslPackage#getAssertContains_Attribute()
   * @model
   * @generated
   */
  Attribute getAttribute();

  /**
   * Sets the value of the '{@link fr.imta.renaud.ssinigaglia.webDsl.AssertContains#getAttribute <em>Attribute</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Attribute</em>' attribute.
   * @see fr.imta.renaud.ssinigaglia.webDsl.Attribute
   * @see #getAttribute()
   * @generated
   */
  void setAttribute(Attribute value);

} // AssertContains