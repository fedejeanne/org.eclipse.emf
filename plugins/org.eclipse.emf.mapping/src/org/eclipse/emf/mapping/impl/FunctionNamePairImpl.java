/**
 * <copyright>
 *
 * Copyright (c) 2002-2004 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - Initial API and implementation
 *
 * </copyright>
 *
 * $Id: FunctionNamePairImpl.java,v 1.6 2005/11/23 18:10:08 emerks Exp $
 */
package org.eclipse.emf.mapping.impl;


import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.mapping.FunctionNamePair;
import org.eclipse.emf.mapping.Mapping;
import org.eclipse.emf.mapping.MappingHelper;
import org.eclipse.emf.mapping.MappingPackage;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function Name Pair</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.mapping.impl.FunctionNamePairImpl#getIn2out <em>In2out</em>}</li>
 *   <li>{@link org.eclipse.emf.mapping.impl.FunctionNamePairImpl#getOut2in <em>Out2in</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */ 
public class FunctionNamePairImpl extends TypeConverterImpl implements FunctionNamePair
{
  /**
   * The default value of the '{@link #getIn2out() <em>In2out</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIn2out()
   * @generated
   * @ordered
   */
  protected static final String IN2OUT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getIn2out() <em>In2out</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIn2out()
   * @generated
   * @ordered
   */
  protected String in2out = IN2OUT_EDEFAULT;

  /**
   * The default value of the '{@link #getOut2in() <em>Out2in</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOut2in()
   * @generated
   * @ordered
   */
  protected static final String OUT2IN_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getOut2in() <em>Out2in</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOut2in()
   * @generated
   * @ordered
   */
  protected String out2in = OUT2IN_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FunctionNamePairImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EClass eStaticClass()
  {
    return MappingPackage.Literals.FUNCTION_NAME_PAIR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getIn2out()
  {
    return in2out;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIn2out(String newIn2out)
  {
    String oldIn2out = in2out;
    in2out = newIn2out;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MappingPackage.FUNCTION_NAME_PAIR__IN2OUT, oldIn2out, in2out));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getOut2in()
  {
    return out2in;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOut2in(String newOut2in)
  {
    String oldOut2in = out2in;
    out2in = newOut2in;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MappingPackage.FUNCTION_NAME_PAIR__OUT2IN, oldOut2in, out2in));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case MappingPackage.FUNCTION_NAME_PAIR__MAPPER:
        return getMapper();
      case MappingPackage.FUNCTION_NAME_PAIR__HELPED_OBJECT:
        if (resolve) return getHelpedObject();
        return basicGetHelpedObject();
      case MappingPackage.FUNCTION_NAME_PAIR__NESTED_IN:
        return getNestedIn();
      case MappingPackage.FUNCTION_NAME_PAIR__NESTED:
        return getNested();
      case MappingPackage.FUNCTION_NAME_PAIR__IN2OUT:
        return getIn2out();
      case MappingPackage.FUNCTION_NAME_PAIR__OUT2IN:
        return getOut2in();
    }
    return eDynamicGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MappingPackage.FUNCTION_NAME_PAIR__MAPPER:
        setMapper((Mapping)newValue);
        return;
      case MappingPackage.FUNCTION_NAME_PAIR__HELPED_OBJECT:
        setHelpedObject((EObject)newValue);
        return;
      case MappingPackage.FUNCTION_NAME_PAIR__NESTED_IN:
        setNestedIn((MappingHelper)newValue);
        return;
      case MappingPackage.FUNCTION_NAME_PAIR__NESTED:
        getNested().clear();
        getNested().addAll((Collection)newValue);
        return;
      case MappingPackage.FUNCTION_NAME_PAIR__IN2OUT:
        setIn2out((String)newValue);
        return;
      case MappingPackage.FUNCTION_NAME_PAIR__OUT2IN:
        setOut2in((String)newValue);
        return;
    }
    eDynamicSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case MappingPackage.FUNCTION_NAME_PAIR__MAPPER:
        setMapper((Mapping)null);
        return;
      case MappingPackage.FUNCTION_NAME_PAIR__HELPED_OBJECT:
        setHelpedObject((EObject)null);
        return;
      case MappingPackage.FUNCTION_NAME_PAIR__NESTED_IN:
        setNestedIn((MappingHelper)null);
        return;
      case MappingPackage.FUNCTION_NAME_PAIR__NESTED:
        getNested().clear();
        return;
      case MappingPackage.FUNCTION_NAME_PAIR__IN2OUT:
        setIn2out(IN2OUT_EDEFAULT);
        return;
      case MappingPackage.FUNCTION_NAME_PAIR__OUT2IN:
        setOut2in(OUT2IN_EDEFAULT);
        return;
    }
    eDynamicUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case MappingPackage.FUNCTION_NAME_PAIR__MAPPER:
        return getMapper() != null;
      case MappingPackage.FUNCTION_NAME_PAIR__HELPED_OBJECT:
        return helpedObject != null;
      case MappingPackage.FUNCTION_NAME_PAIR__NESTED_IN:
        return getNestedIn() != null;
      case MappingPackage.FUNCTION_NAME_PAIR__NESTED:
        return nested != null && !nested.isEmpty();
      case MappingPackage.FUNCTION_NAME_PAIR__IN2OUT:
        return IN2OUT_EDEFAULT == null ? in2out != null : !IN2OUT_EDEFAULT.equals(in2out);
      case MappingPackage.FUNCTION_NAME_PAIR__OUT2IN:
        return OUT2IN_EDEFAULT == null ? out2in != null : !OUT2IN_EDEFAULT.equals(out2in);
    }
    return eDynamicIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (in2out: ");
    result.append(in2out);
    result.append(", out2in: ");
    result.append(out2in);
    result.append(')');
    return result.toString();
  }

} //FunctionNamePairImpl
