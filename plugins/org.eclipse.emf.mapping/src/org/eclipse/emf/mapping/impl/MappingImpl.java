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
 * $Id: MappingImpl.java,v 1.5 2005/11/23 18:10:08 emerks Exp $
 */
package org.eclipse.emf.mapping.impl;


import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.AbstractTreeIterator;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.mapping.Mapping;
import org.eclipse.emf.mapping.MappingHelper;
import org.eclipse.emf.mapping.MappingPackage;
import org.eclipse.emf.mapping.MappingRoot;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mapping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.mapping.impl.MappingImpl#getHelper <em>Helper</em>}</li>
 *   <li>{@link org.eclipse.emf.mapping.impl.MappingImpl#getNested <em>Nested</em>}</li>
 *   <li>{@link org.eclipse.emf.mapping.impl.MappingImpl#getNestedIn <em>Nested In</em>}</li>
 *   <li>{@link org.eclipse.emf.mapping.impl.MappingImpl#getInputs <em>Inputs</em>}</li>
 *   <li>{@link org.eclipse.emf.mapping.impl.MappingImpl#getOutputs <em>Outputs</em>}</li>
 *   <li>{@link org.eclipse.emf.mapping.impl.MappingImpl#getTypeMapping <em>Type Mapping</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MappingImpl extends EObjectImpl implements Mapping
{
  /**
   * The cached value of the '{@link #getHelper() <em>Helper</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHelper()
   * @generated
   * @ordered
   */
  protected MappingHelper helper = null;

  /**
   * The cached value of the '{@link #getNested() <em>Nested</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNested()
   * @generated
   * @ordered
   */
  protected EList nested = null;

  /**
   * The cached value of the '{@link #getInputs() <em>Inputs</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInputs()
   * @generated
   * @ordered
   */
  protected EList inputs = null;

  /**
   * The cached value of the '{@link #getOutputs() <em>Outputs</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOutputs()
   * @generated
   * @ordered
   */
  protected EList outputs = null;

  /**
   * The cached value of the '{@link #getTypeMapping() <em>Type Mapping</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypeMapping()
   * @generated
   * @ordered
   */
  protected Mapping typeMapping = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MappingImpl()
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
    return MappingPackage.Literals.MAPPING;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MappingHelper getHelper()
  {
    return helper;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetHelper(MappingHelper newHelper, NotificationChain msgs)
  {
    MappingHelper oldHelper = helper;
    helper = newHelper;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MappingPackage.MAPPING__HELPER, oldHelper, newHelper);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHelper(MappingHelper newHelper)
  {
    if (newHelper != helper)
    {
      NotificationChain msgs = null;
      if (helper != null)
        msgs = ((InternalEObject)helper).eInverseRemove(this, MappingPackage.MAPPING_HELPER__MAPPER, MappingHelper.class, msgs);
      if (newHelper != null)
        msgs = ((InternalEObject)newHelper).eInverseAdd(this, MappingPackage.MAPPING_HELPER__MAPPER, MappingHelper.class, msgs);
      msgs = basicSetHelper(newHelper, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MappingPackage.MAPPING__HELPER, newHelper, newHelper));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList getNested()
  {
    if (nested == null)
    {
      nested = new EObjectContainmentWithInverseEList(Mapping.class, this, MappingPackage.MAPPING__NESTED, MappingPackage.MAPPING__NESTED_IN);
    }
    return nested;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Mapping getNestedIn()
  {
    if (eContainerFeatureID != MappingPackage.MAPPING__NESTED_IN) return null;
    return (Mapping)eContainer();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNestedIn(Mapping newNestedIn)
  {
    if (newNestedIn != eInternalContainer() || (eContainerFeatureID != MappingPackage.MAPPING__NESTED_IN && newNestedIn != null))
    {
      if (EcoreUtil.isAncestor(this, newNestedIn))
        throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
      NotificationChain msgs = null;
      if (eInternalContainer() != null)
        msgs = eBasicRemoveFromContainer(msgs);
      if (newNestedIn != null)
        msgs = ((InternalEObject)newNestedIn).eInverseAdd(this, MappingPackage.MAPPING__NESTED, Mapping.class, msgs);
      msgs = eBasicSetContainer((InternalEObject)newNestedIn, MappingPackage.MAPPING__NESTED_IN, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MappingPackage.MAPPING__NESTED_IN, newNestedIn, newNestedIn));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList getInputs()
  {
    if (inputs == null)
    {
      inputs = new EObjectResolvingEList(EObject.class, this, MappingPackage.MAPPING__INPUTS);
    }
    return inputs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList getOutputs()
  {
    if (outputs == null)
    {
      outputs = new EObjectResolvingEList(EObject.class, this, MappingPackage.MAPPING__OUTPUTS);
    }
    return outputs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Mapping getTypeMapping()
  {
    if (typeMapping != null && typeMapping.eIsProxy())
    {
      InternalEObject oldTypeMapping = (InternalEObject)typeMapping;
      typeMapping = (Mapping)eResolveProxy(oldTypeMapping);
      if (typeMapping != oldTypeMapping)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MappingPackage.MAPPING__TYPE_MAPPING, oldTypeMapping, typeMapping));
      }
    }
    return typeMapping;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Mapping basicGetTypeMapping()
  {
    return typeMapping;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTypeMapping(Mapping newTypeMapping)
  {
    Mapping oldTypeMapping = typeMapping;
    typeMapping = newTypeMapping;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MappingPackage.MAPPING__TYPE_MAPPING, oldTypeMapping, typeMapping));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs)
  {
    if (featureID >= 0)
    {
      switch (eDerivedStructuralFeatureID(featureID, baseClass))
      {
        case MappingPackage.MAPPING__HELPER:
          if (helper != null)
            msgs = ((InternalEObject)helper).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MappingPackage.MAPPING__HELPER, null, msgs);
          return basicSetHelper((MappingHelper)otherEnd, msgs);
        case MappingPackage.MAPPING__NESTED:
          return ((InternalEList)getNested()).basicAdd(otherEnd, msgs);
        case MappingPackage.MAPPING__NESTED_IN:
          if (eInternalContainer() != null)
            msgs = eBasicRemoveFromContainer(msgs);
          return eBasicSetContainer(otherEnd, MappingPackage.MAPPING__NESTED_IN, msgs);
        default:
          return eDynamicInverseAdd(otherEnd, featureID, baseClass, msgs);
      }
    }
    if (eInternalContainer() != null)
      msgs = eBasicRemoveFromContainer(msgs);
    return eBasicSetContainer(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs)
  {
    if (featureID >= 0)
    {
      switch (eDerivedStructuralFeatureID(featureID, baseClass))
      {
        case MappingPackage.MAPPING__HELPER:
          return basicSetHelper(null, msgs);
        case MappingPackage.MAPPING__NESTED:
          return ((InternalEList)getNested()).basicRemove(otherEnd, msgs);
        case MappingPackage.MAPPING__NESTED_IN:
          return eBasicSetContainer(null, MappingPackage.MAPPING__NESTED_IN, msgs);
        default:
          return eDynamicInverseRemove(otherEnd, featureID, baseClass, msgs);
      }
    }
    return eBasicSetContainer(null, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain eBasicRemoveFromContainer(NotificationChain msgs)
  {
    if (eContainerFeatureID >= 0)
    {
      switch (eContainerFeatureID)
      {
        case MappingPackage.MAPPING__NESTED_IN:
          return eInternalContainer().eInverseRemove(this, MappingPackage.MAPPING__NESTED, Mapping.class, msgs);
        default:
          return eDynamicBasicRemoveFromContainer(msgs);
      }
    }
    return eInternalContainer().eInverseRemove(this, EOPPOSITE_FEATURE_BASE - eContainerFeatureID, null, msgs);
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
      case MappingPackage.MAPPING__HELPER:
        return getHelper();
      case MappingPackage.MAPPING__NESTED:
        return getNested();
      case MappingPackage.MAPPING__NESTED_IN:
        return getNestedIn();
      case MappingPackage.MAPPING__INPUTS:
        return getInputs();
      case MappingPackage.MAPPING__OUTPUTS:
        return getOutputs();
      case MappingPackage.MAPPING__TYPE_MAPPING:
        if (resolve) return getTypeMapping();
        return basicGetTypeMapping();
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
      case MappingPackage.MAPPING__HELPER:
        setHelper((MappingHelper)newValue);
        return;
      case MappingPackage.MAPPING__NESTED:
        getNested().clear();
        getNested().addAll((Collection)newValue);
        return;
      case MappingPackage.MAPPING__NESTED_IN:
        setNestedIn((Mapping)newValue);
        return;
      case MappingPackage.MAPPING__INPUTS:
        getInputs().clear();
        getInputs().addAll((Collection)newValue);
        return;
      case MappingPackage.MAPPING__OUTPUTS:
        getOutputs().clear();
        getOutputs().addAll((Collection)newValue);
        return;
      case MappingPackage.MAPPING__TYPE_MAPPING:
        setTypeMapping((Mapping)newValue);
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
      case MappingPackage.MAPPING__HELPER:
        setHelper((MappingHelper)null);
        return;
      case MappingPackage.MAPPING__NESTED:
        getNested().clear();
        return;
      case MappingPackage.MAPPING__NESTED_IN:
        setNestedIn((Mapping)null);
        return;
      case MappingPackage.MAPPING__INPUTS:
        getInputs().clear();
        return;
      case MappingPackage.MAPPING__OUTPUTS:
        getOutputs().clear();
        return;
      case MappingPackage.MAPPING__TYPE_MAPPING:
        setTypeMapping((Mapping)null);
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
      case MappingPackage.MAPPING__HELPER:
        return helper != null;
      case MappingPackage.MAPPING__NESTED:
        return nested != null && !nested.isEmpty();
      case MappingPackage.MAPPING__NESTED_IN:
        return getNestedIn() != null;
      case MappingPackage.MAPPING__INPUTS:
        return inputs != null && !inputs.isEmpty();
      case MappingPackage.MAPPING__OUTPUTS:
        return outputs != null && !outputs.isEmpty();
      case MappingPackage.MAPPING__TYPE_MAPPING:
        return typeMapping != null;
    }
    return eDynamicIsSet(featureID);
  }

  public Collection getMappedObjects()
  {
    Collection result = new HashSet();
    result.addAll(getInputs());
    result.addAll(getOutputs());
    return result;
  }

  public MappingRoot getMappingRoot()
  {
    Mapping mapping = this; 
    while (mapping != null && !(mapping instanceof MappingRoot))
    {
      mapping = mapping.getNestedIn();
    }
    return (MappingRoot)mapping;
  }

  public MappingHelper getEffectiveHelper()
  {
    MappingHelper helper = getHelper();
    if (helper == null && getTypeMapping() != null)
    {
      helper = getTypeMapping().getHelper();
    }
    return helper;
  }

  public boolean isReverse()
  {
    Mapping mapping = getNestedIn();
    if (mapping != null)
    {
      return mapping.isReverse();
    }
    return false;
  }

  public EList getSenders()
  {
    return
      isReverse() ?
        getOutputs() :
        getInputs();
  }

  public EList getReceivers()
  {
    return
      isReverse() ?
        getInputs() : 
        getOutputs();
  }

  public EList getTops()
  {
    MappingRoot mappingRoot = getMappingRoot();
    return
      mappingRoot == null || mappingRoot.isTopToBottom() ?
        getInputs() :
        getOutputs();
  }

  public EList getBottoms()
  {
    MappingRoot mappingRoot = getMappingRoot();
    return
      mappingRoot == null || mappingRoot.isTopToBottom() ?
        getOutputs() :
        getInputs();
  }

  /**
   * This implements a tree iterator that will iterate over a mapping, all it's nested mappings, all their nested mappings, and so on.
   */
  public static class MappingTreeIterator extends AbstractTreeIterator
  {
    /**
     * This creates a tree iterator that will iterate over a mapping, all it's nested mappings, all their nested mappings, and so on.
     */
    public MappingTreeIterator(Mapping mapping)
    {
      super(mapping);
    }

    /**
     * This creates a tree iterator that will iterate over a mapping (but only if includeRoot is true), 
     * all it's nested mappings, all their nested mappings, and so on.
     */
    public MappingTreeIterator(Mapping mapping, boolean includeRoot)
    {
      super(mapping, includeRoot);
    }

    protected Iterator getChildren(Object o)
    {
      return ((Mapping)o).getNested().iterator();
    }

    public void remove()
    {
      // We either remove the root mapping or we use the iterator that returned the most recent next mapping.
      //
      if (nextRemoveIterator == null)
      {
        ((Mapping)object).setNestedIn(null);
      }
      else
      {
        super.remove();
      }
    }
  }

  public TreeIterator treeIterator()
  {
    return new MappingTreeIterator(this);
  }

  public TreeIterator treeIterator(boolean includeRoot)
  {
    return new MappingTreeIterator(this, includeRoot);
  }

  public String toString()
  {
    StringBuffer result = new StringBuffer(super.toString());
    result.append("(inputs: ");
    result.append(getInputs());
    result.append(", outputs: ");
    result.append(getOutputs());
    result.append(")");
    return result.toString();
  }
} //MappingImpl


