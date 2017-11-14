/**
 * generated by Xtext 2.12.0
 */
package fr.imta.renaud.ssinigaglia.webDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Program</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.imta.renaud.ssinigaglia.webDsl.Program#getCore <em>Core</em>}</li>
 * </ul>
 *
 * @see fr.imta.renaud.ssinigaglia.webDsl.WebDslPackage#getProgram()
 * @model
 * @generated
 */
public interface Program extends EObject
{
  /**
   * Returns the value of the '<em><b>Core</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Core</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Core</em>' containment reference.
   * @see #setCore(Core)
   * @see fr.imta.renaud.ssinigaglia.webDsl.WebDslPackage#getProgram_Core()
   * @model containment="true"
   * @generated
   */
  Core getCore();

  /**
   * Sets the value of the '{@link fr.imta.renaud.ssinigaglia.webDsl.Program#getCore <em>Core</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Core</em>' containment reference.
   * @see #getCore()
   * @generated
   */
  void setCore(Core value);

} // Program
