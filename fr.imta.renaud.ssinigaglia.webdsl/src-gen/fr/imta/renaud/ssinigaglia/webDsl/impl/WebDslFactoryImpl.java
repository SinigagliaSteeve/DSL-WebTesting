/**
 * generated by Xtext 2.12.0
 */
package fr.imta.renaud.ssinigaglia.webDsl.impl;

import fr.imta.renaud.ssinigaglia.webDsl.Action;
import fr.imta.renaud.ssinigaglia.webDsl.Assert;
import fr.imta.renaud.ssinigaglia.webDsl.AssertContains;
import fr.imta.renaud.ssinigaglia.webDsl.AssertEquals;
import fr.imta.renaud.ssinigaglia.webDsl.Attribute;
import fr.imta.renaud.ssinigaglia.webDsl.Browser;
import fr.imta.renaud.ssinigaglia.webDsl.CallProcedure;
import fr.imta.renaud.ssinigaglia.webDsl.CheckboxSelection;
import fr.imta.renaud.ssinigaglia.webDsl.ComboboxSelection;
import fr.imta.renaud.ssinigaglia.webDsl.Core;
import fr.imta.renaud.ssinigaglia.webDsl.CountAction;
import fr.imta.renaud.ssinigaglia.webDsl.GeneralAction;
import fr.imta.renaud.ssinigaglia.webDsl.GeneralSelection;
import fr.imta.renaud.ssinigaglia.webDsl.GoAction;
import fr.imta.renaud.ssinigaglia.webDsl.HtmlElement;
import fr.imta.renaud.ssinigaglia.webDsl.LinkButtonSelection;
import fr.imta.renaud.ssinigaglia.webDsl.PageSelection;
import fr.imta.renaud.ssinigaglia.webDsl.Procedure;
import fr.imta.renaud.ssinigaglia.webDsl.Program;
import fr.imta.renaud.ssinigaglia.webDsl.Selection;
import fr.imta.renaud.ssinigaglia.webDsl.SetAction;
import fr.imta.renaud.ssinigaglia.webDsl.StoreAction;
import fr.imta.renaud.ssinigaglia.webDsl.TypeSelection;
import fr.imta.renaud.ssinigaglia.webDsl.Var;
import fr.imta.renaud.ssinigaglia.webDsl.WebDslFactory;
import fr.imta.renaud.ssinigaglia.webDsl.WebDslPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class WebDslFactoryImpl extends EFactoryImpl implements WebDslFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static WebDslFactory init()
  {
    try
    {
      WebDslFactory theWebDslFactory = (WebDslFactory)EPackage.Registry.INSTANCE.getEFactory(WebDslPackage.eNS_URI);
      if (theWebDslFactory != null)
      {
        return theWebDslFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new WebDslFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WebDslFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case WebDslPackage.PROGRAM: return createProgram();
      case WebDslPackage.CORE: return createCore();
      case WebDslPackage.PROCEDURE: return createProcedure();
      case WebDslPackage.ACTION: return createAction();
      case WebDslPackage.CALL_PROCEDURE: return createCallProcedure();
      case WebDslPackage.GO_ACTION: return createGoAction();
      case WebDslPackage.SELECTION: return createSelection();
      case WebDslPackage.LINK_BUTTON_SELECTION: return createLinkButtonSelection();
      case WebDslPackage.GENERAL_SELECTION: return createGeneralSelection();
      case WebDslPackage.CHECKBOX_SELECTION: return createCheckboxSelection();
      case WebDslPackage.COMBOBOX_SELECTION: return createComboboxSelection();
      case WebDslPackage.PAGE_SELECTION: return createPageSelection();
      case WebDslPackage.GENERAL_ACTION: return createGeneralAction();
      case WebDslPackage.STORE_ACTION: return createStoreAction();
      case WebDslPackage.COUNT_ACTION: return createCountAction();
      case WebDslPackage.VAR: return createVar();
      case WebDslPackage.SET_ACTION: return createSetAction();
      case WebDslPackage.TYPE_SELECTION: return createTypeSelection();
      case WebDslPackage.ASSERT: return createAssert();
      case WebDslPackage.ASSERT_CONTAINS: return createAssertContains();
      case WebDslPackage.ASSERT_EQUALS: return createAssertEquals();
      case WebDslPackage.COMPARABLE: return createComparable();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case WebDslPackage.BROWSER:
        return createBrowserFromString(eDataType, initialValue);
      case WebDslPackage.HTML_ELEMENT:
        return createHtmlElementFromString(eDataType, initialValue);
      case WebDslPackage.ATTRIBUTE:
        return createAttributeFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case WebDslPackage.BROWSER:
        return convertBrowserToString(eDataType, instanceValue);
      case WebDslPackage.HTML_ELEMENT:
        return convertHtmlElementToString(eDataType, instanceValue);
      case WebDslPackage.ATTRIBUTE:
        return convertAttributeToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Program createProgram()
  {
    ProgramImpl program = new ProgramImpl();
    return program;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Core createCore()
  {
    CoreImpl core = new CoreImpl();
    return core;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Procedure createProcedure()
  {
    ProcedureImpl procedure = new ProcedureImpl();
    return procedure;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Action createAction()
  {
    ActionImpl action = new ActionImpl();
    return action;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CallProcedure createCallProcedure()
  {
    CallProcedureImpl callProcedure = new CallProcedureImpl();
    return callProcedure;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GoAction createGoAction()
  {
    GoActionImpl goAction = new GoActionImpl();
    return goAction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Selection createSelection()
  {
    SelectionImpl selection = new SelectionImpl();
    return selection;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LinkButtonSelection createLinkButtonSelection()
  {
    LinkButtonSelectionImpl linkButtonSelection = new LinkButtonSelectionImpl();
    return linkButtonSelection;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GeneralSelection createGeneralSelection()
  {
    GeneralSelectionImpl generalSelection = new GeneralSelectionImpl();
    return generalSelection;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CheckboxSelection createCheckboxSelection()
  {
    CheckboxSelectionImpl checkboxSelection = new CheckboxSelectionImpl();
    return checkboxSelection;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComboboxSelection createComboboxSelection()
  {
    ComboboxSelectionImpl comboboxSelection = new ComboboxSelectionImpl();
    return comboboxSelection;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PageSelection createPageSelection()
  {
    PageSelectionImpl pageSelection = new PageSelectionImpl();
    return pageSelection;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GeneralAction createGeneralAction()
  {
    GeneralActionImpl generalAction = new GeneralActionImpl();
    return generalAction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StoreAction createStoreAction()
  {
    StoreActionImpl storeAction = new StoreActionImpl();
    return storeAction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CountAction createCountAction()
  {
    CountActionImpl countAction = new CountActionImpl();
    return countAction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Var createVar()
  {
    VarImpl var = new VarImpl();
    return var;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SetAction createSetAction()
  {
    SetActionImpl setAction = new SetActionImpl();
    return setAction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeSelection createTypeSelection()
  {
    TypeSelectionImpl typeSelection = new TypeSelectionImpl();
    return typeSelection;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Assert createAssert()
  {
    AssertImpl assert_ = new AssertImpl();
    return assert_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AssertContains createAssertContains()
  {
    AssertContainsImpl assertContains = new AssertContainsImpl();
    return assertContains;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AssertEquals createAssertEquals()
  {
    AssertEqualsImpl assertEquals = new AssertEqualsImpl();
    return assertEquals;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public fr.imta.renaud.ssinigaglia.webDsl.Comparable createComparable()
  {
    ComparableImpl comparable = new ComparableImpl();
    return comparable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Browser createBrowserFromString(EDataType eDataType, String initialValue)
  {
    Browser result = Browser.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertBrowserToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HtmlElement createHtmlElementFromString(EDataType eDataType, String initialValue)
  {
    HtmlElement result = HtmlElement.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertHtmlElementToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Attribute createAttributeFromString(EDataType eDataType, String initialValue)
  {
    Attribute result = Attribute.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertAttributeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WebDslPackage getWebDslPackage()
  {
    return (WebDslPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static WebDslPackage getPackage()
  {
    return WebDslPackage.eINSTANCE;
  }

} //WebDslFactoryImpl
