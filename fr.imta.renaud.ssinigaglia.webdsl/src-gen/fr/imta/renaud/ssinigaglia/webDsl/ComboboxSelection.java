/**
 * generated by Xtext 2.12.0
 */
package fr.imta.renaud.ssinigaglia.webDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Combobox Selection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.imta.renaud.ssinigaglia.webDsl.ComboboxSelection#getTypeSelection <em>Type Selection</em>}</li>
 *   <li>{@link fr.imta.renaud.ssinigaglia.webDsl.ComboboxSelection#getGeneralActions <em>General Actions</em>}</li>
 * </ul>
 *
 * @see fr.imta.renaud.ssinigaglia.webDsl.WebDslPackage#getComboboxSelection()
 * @model
 * @generated
 */
public interface ComboboxSelection extends EObject
{
  /**
   * Returns the value of the '<em><b>Type Selection</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type Selection</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type Selection</em>' containment reference.
   * @see #setTypeSelection(TypeSelection)
   * @see fr.imta.renaud.ssinigaglia.webDsl.WebDslPackage#getComboboxSelection_TypeSelection()
   * @model containment="true"
   * @generated
   */
  TypeSelection getTypeSelection();

  /**
   * Sets the value of the '{@link fr.imta.renaud.ssinigaglia.webDsl.ComboboxSelection#getTypeSelection <em>Type Selection</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type Selection</em>' containment reference.
   * @see #getTypeSelection()
   * @generated
   */
  void setTypeSelection(TypeSelection value);

  /**
   * Returns the value of the '<em><b>General Actions</b></em>' containment reference list.
   * The list contents are of type {@link fr.imta.renaud.ssinigaglia.webDsl.GeneralAction}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>General Actions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>General Actions</em>' containment reference list.
   * @see fr.imta.renaud.ssinigaglia.webDsl.WebDslPackage#getComboboxSelection_GeneralActions()
   * @model containment="true"
   * @generated
   */
  EList<GeneralAction> getGeneralActions();

} // ComboboxSelection
