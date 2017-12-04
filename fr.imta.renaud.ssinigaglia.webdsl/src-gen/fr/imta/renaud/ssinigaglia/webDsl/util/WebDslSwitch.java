/**
 * generated by Xtext 2.12.0
 */
package fr.imta.renaud.ssinigaglia.webDsl.util;

import fr.imta.renaud.ssinigaglia.webDsl.Action;
import fr.imta.renaud.ssinigaglia.webDsl.Assert;
import fr.imta.renaud.ssinigaglia.webDsl.AssertContains;
import fr.imta.renaud.ssinigaglia.webDsl.AssertEquals;
import fr.imta.renaud.ssinigaglia.webDsl.CallProcedure;
import fr.imta.renaud.ssinigaglia.webDsl.CheckboxSelection;
import fr.imta.renaud.ssinigaglia.webDsl.ComboboxSelection;
import fr.imta.renaud.ssinigaglia.webDsl.Core;
import fr.imta.renaud.ssinigaglia.webDsl.CountAction;
import fr.imta.renaud.ssinigaglia.webDsl.GeneralAction;
import fr.imta.renaud.ssinigaglia.webDsl.GeneralSelection;
import fr.imta.renaud.ssinigaglia.webDsl.GoAction;
import fr.imta.renaud.ssinigaglia.webDsl.LinkButtonSelection;
import fr.imta.renaud.ssinigaglia.webDsl.PageSelection;
import fr.imta.renaud.ssinigaglia.webDsl.Procedure;
import fr.imta.renaud.ssinigaglia.webDsl.Program;
import fr.imta.renaud.ssinigaglia.webDsl.Selection;
import fr.imta.renaud.ssinigaglia.webDsl.SetAction;
import fr.imta.renaud.ssinigaglia.webDsl.StoreAction;
import fr.imta.renaud.ssinigaglia.webDsl.TypeSelection;
import fr.imta.renaud.ssinigaglia.webDsl.Var;
import fr.imta.renaud.ssinigaglia.webDsl.WebDslPackage;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see fr.imta.renaud.ssinigaglia.webDsl.WebDslPackage
 * @generated
 */
public class WebDslSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static WebDslPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WebDslSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = WebDslPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case WebDslPackage.PROGRAM:
      {
        Program program = (Program)theEObject;
        T result = caseProgram(program);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case WebDslPackage.CORE:
      {
        Core core = (Core)theEObject;
        T result = caseCore(core);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case WebDslPackage.PROCEDURE:
      {
        Procedure procedure = (Procedure)theEObject;
        T result = caseProcedure(procedure);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case WebDslPackage.ACTION:
      {
        Action action = (Action)theEObject;
        T result = caseAction(action);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case WebDslPackage.CALL_PROCEDURE:
      {
        CallProcedure callProcedure = (CallProcedure)theEObject;
        T result = caseCallProcedure(callProcedure);
        if (result == null) result = caseAction(callProcedure);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case WebDslPackage.GO_ACTION:
      {
        GoAction goAction = (GoAction)theEObject;
        T result = caseGoAction(goAction);
        if (result == null) result = caseAction(goAction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case WebDslPackage.SELECTION:
      {
        Selection selection = (Selection)theEObject;
        T result = caseSelection(selection);
        if (result == null) result = caseAction(selection);
        if (result == null) result = caseGeneralAction(selection);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case WebDslPackage.LINK_BUTTON_SELECTION:
      {
        LinkButtonSelection linkButtonSelection = (LinkButtonSelection)theEObject;
        T result = caseLinkButtonSelection(linkButtonSelection);
        if (result == null) result = caseSelection(linkButtonSelection);
        if (result == null) result = caseAction(linkButtonSelection);
        if (result == null) result = caseGeneralAction(linkButtonSelection);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case WebDslPackage.GENERAL_SELECTION:
      {
        GeneralSelection generalSelection = (GeneralSelection)theEObject;
        T result = caseGeneralSelection(generalSelection);
        if (result == null) result = caseSelection(generalSelection);
        if (result == null) result = caseAction(generalSelection);
        if (result == null) result = caseGeneralAction(generalSelection);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case WebDslPackage.CHECKBOX_SELECTION:
      {
        CheckboxSelection checkboxSelection = (CheckboxSelection)theEObject;
        T result = caseCheckboxSelection(checkboxSelection);
        if (result == null) result = caseSelection(checkboxSelection);
        if (result == null) result = caseAction(checkboxSelection);
        if (result == null) result = caseGeneralAction(checkboxSelection);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case WebDslPackage.COMBOBOX_SELECTION:
      {
        ComboboxSelection comboboxSelection = (ComboboxSelection)theEObject;
        T result = caseComboboxSelection(comboboxSelection);
        if (result == null) result = caseSelection(comboboxSelection);
        if (result == null) result = caseAction(comboboxSelection);
        if (result == null) result = caseGeneralAction(comboboxSelection);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case WebDslPackage.PAGE_SELECTION:
      {
        PageSelection pageSelection = (PageSelection)theEObject;
        T result = casePageSelection(pageSelection);
        if (result == null) result = caseSelection(pageSelection);
        if (result == null) result = caseAction(pageSelection);
        if (result == null) result = caseGeneralAction(pageSelection);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case WebDslPackage.GENERAL_ACTION:
      {
        GeneralAction generalAction = (GeneralAction)theEObject;
        T result = caseGeneralAction(generalAction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case WebDslPackage.STORE_ACTION:
      {
        StoreAction storeAction = (StoreAction)theEObject;
        T result = caseStoreAction(storeAction);
        if (result == null) result = caseGeneralAction(storeAction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case WebDslPackage.COUNT_ACTION:
      {
        CountAction countAction = (CountAction)theEObject;
        T result = caseCountAction(countAction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case WebDslPackage.VAR:
      {
        Var var = (Var)theEObject;
        T result = caseVar(var);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case WebDslPackage.SET_ACTION:
      {
        SetAction setAction = (SetAction)theEObject;
        T result = caseSetAction(setAction);
        if (result == null) result = caseGeneralAction(setAction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case WebDslPackage.TYPE_SELECTION:
      {
        TypeSelection typeSelection = (TypeSelection)theEObject;
        T result = caseTypeSelection(typeSelection);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case WebDslPackage.ASSERT:
      {
        Assert assert_ = (Assert)theEObject;
        T result = caseAssert(assert_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case WebDslPackage.ASSERT_CONTAINS:
      {
        AssertContains assertContains = (AssertContains)theEObject;
        T result = caseAssertContains(assertContains);
        if (result == null) result = caseAssert(assertContains);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case WebDslPackage.ASSERT_EQUALS:
      {
        AssertEquals assertEquals = (AssertEquals)theEObject;
        T result = caseAssertEquals(assertEquals);
        if (result == null) result = caseAssert(assertEquals);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case WebDslPackage.COMPARABLE:
      {
        fr.imta.renaud.ssinigaglia.webDsl.Comparable comparable = (fr.imta.renaud.ssinigaglia.webDsl.Comparable)theEObject;
        T result = caseComparable(comparable);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Program</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Program</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProgram(Program object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Core</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Core</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCore(Core object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Procedure</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Procedure</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProcedure(Procedure object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Action</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Action</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAction(Action object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Call Procedure</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Call Procedure</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCallProcedure(CallProcedure object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Go Action</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Go Action</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGoAction(GoAction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Selection</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Selection</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSelection(Selection object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Link Button Selection</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Link Button Selection</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLinkButtonSelection(LinkButtonSelection object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>General Selection</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>General Selection</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGeneralSelection(GeneralSelection object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Checkbox Selection</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Checkbox Selection</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCheckboxSelection(CheckboxSelection object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Combobox Selection</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Combobox Selection</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseComboboxSelection(ComboboxSelection object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Page Selection</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Page Selection</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePageSelection(PageSelection object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>General Action</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>General Action</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGeneralAction(GeneralAction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Store Action</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Store Action</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStoreAction(StoreAction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Count Action</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Count Action</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCountAction(CountAction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Var</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Var</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVar(Var object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Set Action</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Set Action</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSetAction(SetAction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Type Selection</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Type Selection</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTypeSelection(TypeSelection object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Assert</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Assert</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAssert(Assert object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Assert Contains</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Assert Contains</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAssertContains(AssertContains object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Assert Equals</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Assert Equals</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAssertEquals(AssertEquals object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Comparable</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Comparable</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseComparable(fr.imta.renaud.ssinigaglia.webDsl.Comparable object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //WebDslSwitch
