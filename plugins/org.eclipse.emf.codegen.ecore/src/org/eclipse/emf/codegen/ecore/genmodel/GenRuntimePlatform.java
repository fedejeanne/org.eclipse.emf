/**
 * Copyright (c) 2010 Ed Merks and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *   Ed Merks - Initial API and implementation
 */
package org.eclipse.emf.codegen.ecore.genmodel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Gen Runtime Platform</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage#getGenRuntimePlatform()
 * @model
 * @generated
 */
public enum GenRuntimePlatform implements Enumerator
{
  /**
   * The '<em><b>IDE</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #IDE_VALUE
   * @generated
   * @ordered
   */
  IDE(0, "IDE", "IDE"),

  /**
   * The '<em><b>RCP</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #RCP_VALUE
   * @generated
   * @ordered
   */
  RCP(1, "RCP", "RCP"),

  /**
   * The '<em><b>RAP</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #RAP_VALUE
   * @generated
   * @ordered
   */
  RAP(2, "RAP", "RAP"),

  /**
   * The '<em><b>GWT</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #GWT_VALUE
   * @generated
   * @ordered
   */
  GWT(3, "GWT", "GWT");

  /**
   * The '<em><b>IDE</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * Target Eclipse's IDE.
   * </p>
   * <!-- end-user-doc -->
   * @see #IDE
   * @model
   * @generated
   * @ordered
   */
  public static final int IDE_VALUE = 0;

  /**
   * The '<em><b>RCP</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * Target Eclipse's Rich Client Platform.
   * </p>
   * <!-- end-user-doc -->
   * @see #RCP
   * @model
   * @generated
   * @ordered
   */
  public static final int RCP_VALUE = 1;

  /**
   * The '<em><b>RAP</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * Target Eclipse's Rich Ajax Platform.
   * </p>
   * <!-- end-user-doc -->
   * @see #RAP
   * @model
   * @generated
   * @ordered
   */
  public static final int RAP_VALUE = 2;

  /**
   * The '<em><b>GWT</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * Target Google Widget Toolkit.
   * </p>
   * <!-- end-user-doc -->
   * @see #GWT
   * @model
   * @generated
   * @ordered
   */
  public static final int GWT_VALUE = 3;

  /**
   * An array of all the '<em><b>Gen Runtime Platform</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final GenRuntimePlatform[] VALUES_ARRAY =
    new GenRuntimePlatform[]
    {
      IDE,
      RCP,
      RAP,
      GWT,
    };

  /**
   * A public read-only list of all the '<em><b>Gen Runtime Platform</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<GenRuntimePlatform> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Gen Runtime Platform</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param literal the literal.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static GenRuntimePlatform get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      GenRuntimePlatform result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Gen Runtime Platform</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param name the name.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static GenRuntimePlatform getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      GenRuntimePlatform result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Gen Runtime Platform</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the integer value.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static GenRuntimePlatform get(int value)
  {
    switch (value)
    {
      case IDE_VALUE: return IDE;
      case RCP_VALUE: return RCP;
      case RAP_VALUE: return RAP;
      case GWT_VALUE: return GWT;
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
  private GenRuntimePlatform(int value, String name, String literal)
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
  @Override
  public int getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
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
  
} //GenRuntimePlatform
