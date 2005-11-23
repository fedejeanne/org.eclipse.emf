/**
 * <copyright>
 * 
 * Copyright (c) 2004-2005 IBM Corporation and others.
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
 * $Id: Ecore2EcoreMappingRootImpl.java,v 1.7 2005/11/23 18:10:08 emerks Exp $
 */
package org.eclipse.emf.mapping.ecore2ecore.impl;


import java.util.Collection;
import java.util.Iterator;


import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.mapping.Mapping;

import org.eclipse.emf.mapping.ecore2ecore.Ecore2EcoreMappingRoot;
import org.eclipse.emf.mapping.ecore2ecore.Ecore2EcorePackage;

import org.eclipse.emf.mapping.impl.MappingRootImpl;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mapping Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class Ecore2EcoreMappingRootImpl extends MappingRootImpl implements Ecore2EcoreMappingRoot
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Ecore2EcoreMappingRootImpl()
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
    return Ecore2EcorePackage.Literals.ECORE2_ECORE_MAPPING_ROOT;
  }

  /* (non-Javadoc)
   * @see org.eclipse.emf.mapping.ecore2ecore.Ecore2EcoreMapping#getInputEPackage()
   */
  public EPackage getInputEPackage()
  {
    return getInputs().isEmpty() ? null : (EPackage)getInputs().get(0);
  }

  /* (non-Javadoc)
   * @see org.eclipse.emf.mapping.ecore2ecore.Ecore2EcoreMapping#getOutputEPackage()
   */
  public EPackage getOutputEPackage()
  {
    return getOutputs().isEmpty() ? null : (EPackage)getOutputs().get(0);
  }
  
  /* (non-Javadoc)
   * @see org.eclipse.emf.mapping.MappingRoot#canCreateMapping(java.util.Collection, java.util.Collection, org.eclipse.emf.mapping.Mapping)
   */
  public boolean canCreateMapping(Collection inputs, Collection outputs, Mapping mapping)
  {
    if (mapping == this)
    {
      for (Iterator i = inputs.iterator(); i.hasNext();)
      {
        if (!(i.next() instanceof EPackage))
        {
          return false;
        }
      }
      for (Iterator i = outputs.iterator(); i.hasNext();)
      {
        if (!(i.next() instanceof EPackage))
        {
          return false;
        }
      }
      return true;
    }
    else
    {
      return super.canCreateMapping(inputs, outputs, mapping);
    }
  }
} //Ecore2EcoreMappingRootImpl
