/**
 * generated by Xtext 2.12.0
 */
package fr.imta.renaud.ssinigaglia.webDsl;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Browser</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fr.imta.renaud.ssinigaglia.webDsl.WebDslPackage#getBrowser()
 * @model
 * @generated
 */
public enum Browser implements Enumerator
{
  /**
   * The '<em><b>CHROME</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #CHROME_VALUE
   * @generated
   * @ordered
   */
  CHROME(0, "CHROME", "chrome"),

  /**
   * The '<em><b>FIREFOX</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #FIREFOX_VALUE
   * @generated
   * @ordered
   */
  FIREFOX(1, "FIREFOX", "firefox"),

  /**
   * The '<em><b>SAFARI</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SAFARI_VALUE
   * @generated
   * @ordered
   */
  SAFARI(2, "SAFARI", "safari"),

  /**
   * The '<em><b>EDGE</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #EDGE_VALUE
   * @generated
   * @ordered
   */
  EDGE(3, "EDGE", "edge"),

  /**
   * The '<em><b>IE</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #IE_VALUE
   * @generated
   * @ordered
   */
  IE(4, "IE", "ie");

  /**
   * The '<em><b>CHROME</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>CHROME</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #CHROME
   * @model literal="chrome"
   * @generated
   * @ordered
   */
  public static final int CHROME_VALUE = 0;

  /**
   * The '<em><b>FIREFOX</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>FIREFOX</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #FIREFOX
   * @model literal="firefox"
   * @generated
   * @ordered
   */
  public static final int FIREFOX_VALUE = 1;

  /**
   * The '<em><b>SAFARI</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>SAFARI</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #SAFARI
   * @model literal="safari"
   * @generated
   * @ordered
   */
  public static final int SAFARI_VALUE = 2;

  /**
   * The '<em><b>EDGE</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>EDGE</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #EDGE
   * @model literal="edge"
   * @generated
   * @ordered
   */
  public static final int EDGE_VALUE = 3;

  /**
   * The '<em><b>IE</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>IE</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #IE
   * @model literal="ie"
   * @generated
   * @ordered
   */
  public static final int IE_VALUE = 4;

  /**
   * An array of all the '<em><b>Browser</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final Browser[] VALUES_ARRAY =
    new Browser[]
    {
      CHROME,
      FIREFOX,
      SAFARI,
      EDGE,
      IE,
    };

  /**
   * A public read-only list of all the '<em><b>Browser</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<Browser> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Browser</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param literal the literal.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static Browser get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      Browser result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Browser</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param name the name.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static Browser getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      Browser result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Browser</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the integer value.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static Browser get(int value)
  {
    switch (value)
    {
      case CHROME_VALUE: return CHROME;
      case FIREFOX_VALUE: return FIREFOX;
      case SAFARI_VALUE: return SAFARI;
      case EDGE_VALUE: return EDGE;
      case IE_VALUE: return IE;
    }
    return null;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final int value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String name;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String literal;

  /**
   * Only this class can construct instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private Browser(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }
  
} //Browser
