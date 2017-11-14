/**
 * generated by Xtext 2.12.0
 */
package org.imt.sinigaglia.renaud.testDsl;

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
 *   <li>{@link org.imt.sinigaglia.renaud.testDsl.ComboboxSelection#getTypeSelection <em>Type Selection</em>}</li>
 *   <li>{@link org.imt.sinigaglia.renaud.testDsl.ComboboxSelection#getGeneralAction <em>General Action</em>}</li>
 *   <li>{@link org.imt.sinigaglia.renaud.testDsl.ComboboxSelection#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.imt.sinigaglia.renaud.testDsl.TestDslPackage#getComboboxSelection()
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
   * @see org.imt.sinigaglia.renaud.testDsl.TestDslPackage#getComboboxSelection_TypeSelection()
   * @model containment="true"
   * @generated
   */
  TypeSelection getTypeSelection();

  /**
   * Sets the value of the '{@link org.imt.sinigaglia.renaud.testDsl.ComboboxSelection#getTypeSelection <em>Type Selection</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type Selection</em>' containment reference.
   * @see #getTypeSelection()
   * @generated
   */
  void setTypeSelection(TypeSelection value);

  /**
   * Returns the value of the '<em><b>General Action</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>General Action</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>General Action</em>' containment reference.
   * @see #setGeneralAction(GeneralAction)
   * @see org.imt.sinigaglia.renaud.testDsl.TestDslPackage#getComboboxSelection_GeneralAction()
   * @model containment="true"
   * @generated
   */
  GeneralAction getGeneralAction();

  /**
   * Sets the value of the '{@link org.imt.sinigaglia.renaud.testDsl.ComboboxSelection#getGeneralAction <em>General Action</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>General Action</em>' containment reference.
   * @see #getGeneralAction()
   * @generated
   */
  void setGeneralAction(GeneralAction value);

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
   * @see org.imt.sinigaglia.renaud.testDsl.TestDslPackage#getComboboxSelection_Value()
   * @model
   * @generated
   */
  String getValue();

  /**
   * Sets the value of the '{@link org.imt.sinigaglia.renaud.testDsl.ComboboxSelection#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(String value);

} // ComboboxSelection
