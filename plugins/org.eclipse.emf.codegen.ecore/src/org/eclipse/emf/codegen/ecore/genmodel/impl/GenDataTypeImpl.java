/**
 * Copyright (c) 2002-2010 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors: 
 *   IBM - Initial API and implementation
 */
package org.eclipse.emf.codegen.ecore.genmodel.impl;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.codegen.ecore.genmodel.GenClassifier;
import org.eclipse.emf.codegen.ecore.genmodel.GenDataType;
import org.eclipse.emf.codegen.ecore.genmodel.GenEnum;
import org.eclipse.emf.codegen.ecore.genmodel.GenJDKLevel;
import org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage;
import org.eclipse.emf.codegen.ecore.genmodel.GenTypeParameter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.UniqueEList;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.ETypeParameter;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.ExtendedMetaData;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gen Data Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.emf.codegen.ecore.genmodel.impl.GenDataTypeImpl#getEcoreDataType <em>Ecore Data Type</em>}</li>
 *   <li>{@link org.eclipse.emf.codegen.ecore.genmodel.impl.GenDataTypeImpl#getCreate <em>Create</em>}</li>
 *   <li>{@link org.eclipse.emf.codegen.ecore.genmodel.impl.GenDataTypeImpl#getConvert <em>Convert</em>}</li>
 *   <li>{@link org.eclipse.emf.codegen.ecore.genmodel.impl.GenDataTypeImpl#getPropertyEditorFactory <em>Property Editor Factory</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GenDataTypeImpl extends GenClassifierImpl implements GenDataType
{
  /**
   * The cached value of the '{@link #getEcoreDataType() <em>Ecore Data Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEcoreDataType()
   * @generated
   * @ordered
   */
  protected EDataType ecoreDataType;

  /**
   * The default value of the '{@link #getCreate() <em>Create</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCreate()
   * @since 2.14
   * @generated
   * @ordered
   */
  protected static final String CREATE_EDEFAULT = null;
  /**
   * The cached value of the '{@link #getCreate() <em>Create</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCreate()
   * @since 2.14
   * @generated
   * @ordered
   */
  protected String create = CREATE_EDEFAULT;
  /**
   * This is true if the Create attribute has been set.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @since 2.14
   * @generated
   * @ordered
   */
  protected boolean createESet;
  /**
   * The default value of the '{@link #getConvert() <em>Convert</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConvert()
   * @since 2.14
   * @generated
   * @ordered
   */
  protected static final String CONVERT_EDEFAULT = null;
  /**
   * The cached value of the '{@link #getConvert() <em>Convert</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConvert()
   * @since 2.14
   * @generated
   * @ordered
   */
  protected String convert = CONVERT_EDEFAULT;
  /**
   * This is true if the Convert attribute has been set.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @since 2.14
   * @generated
   * @ordered
   */
  protected boolean convertESet;

  /**
   * The default value of the '{@link #getPropertyEditorFactory() <em>Property Editor Factory</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPropertyEditorFactory()
   * @since 2.14
   * @generated
   * @ordered
   */
  protected static final String PROPERTY_EDITOR_FACTORY_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPropertyEditorFactory() <em>Property Editor Factory</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPropertyEditorFactory()
   * @since 2.14
   * @generated
   * @ordered
   */
  protected String propertyEditorFactory = PROPERTY_EDITOR_FACTORY_EDEFAULT;

  /**
   * This is true if the Property Editor Factory attribute has been set.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @since 2.14
   * @generated
   * @ordered
   */
  protected boolean propertyEditorFactoryESet;

  protected GenDataTypeImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return GenModelPackage.Literals.GEN_DATA_TYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EDataType getEcoreDataType()
  {
    if (ecoreDataType != null && ecoreDataType.eIsProxy())
    {
      InternalEObject oldEcoreDataType = (InternalEObject)ecoreDataType;
      ecoreDataType = (EDataType)eResolveProxy(oldEcoreDataType);
      if (ecoreDataType != oldEcoreDataType)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, GenModelPackage.GEN_DATA_TYPE__ECORE_DATA_TYPE, oldEcoreDataType, ecoreDataType));
      }
    }
    return ecoreDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType basicGetEcoreDataType()
  {
    return ecoreDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setEcoreDataType(EDataType newEcoreDataType)
  {
    EDataType oldEcoreDataType = ecoreDataType;
    ecoreDataType = newEcoreDataType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GenModelPackage.GEN_DATA_TYPE__ECORE_DATA_TYPE, oldEcoreDataType, ecoreDataType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @since 2.14
   * @generated
   */
  public String getCreate()
  {
    return create;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @since 2.14
   * @generated
   */
  public void setCreate(String newCreate)
  {
    String oldCreate = create;
    create = newCreate;
    boolean oldCreateESet = createESet;
    createESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GenModelPackage.GEN_DATA_TYPE__CREATE, oldCreate, create, !oldCreateESet));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @since 2.14
   * @generated
   */
  public void unsetCreate()
  {
    String oldCreate = create;
    boolean oldCreateESet = createESet;
    create = CREATE_EDEFAULT;
    createESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, GenModelPackage.GEN_DATA_TYPE__CREATE, oldCreate, CREATE_EDEFAULT, oldCreateESet));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @since 2.14
   * @generated
   */
  public boolean isSetCreate()
  {
    return createESet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @since 2.14
   * @generated
   */
  public String getConvert()
  {
    return convert;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @since 2.14
   * @generated
   */
  public void setConvert(String newConvert)
  {
    String oldConvert = convert;
    convert = newConvert;
    boolean oldConvertESet = convertESet;
    convertESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GenModelPackage.GEN_DATA_TYPE__CONVERT, oldConvert, convert, !oldConvertESet));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @since 2.14
   * @generated
   */
  public void unsetConvert()
  {
    String oldConvert = convert;
    boolean oldConvertESet = convertESet;
    convert = CONVERT_EDEFAULT;
    convertESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, GenModelPackage.GEN_DATA_TYPE__CONVERT, oldConvert, CONVERT_EDEFAULT, oldConvertESet));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @since 2.14
   * @generated
   */
  public boolean isSetConvert()
  {
    return convertESet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @since 2.14
   * @generated
   */
  public String getPropertyEditorFactoryGen()
  {
    return propertyEditorFactory;
  }

  /**
   * @since 2.14
   */
  public String getPropertyEditorFactory()
  {
    if (isSetPropertyEditorFactory())
    {
      return getPropertyEditorFactoryGen();
    }
    else
    {
      EDataType ecoreDataType = getEcoreDataType();
      if (ecoreDataType != null)
      {
        return EcoreUtil.getAnnotation(ecoreDataType, GenModelPackage.eNS_URI, "propertyEditorFactory");
      }
      else
      {
        return null;
      }
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @since 2.14
   * @generated
   */
  @Override
  public void setPropertyEditorFactory(String newPropertyEditorFactory)
  {
    String oldPropertyEditorFactory = propertyEditorFactory;
    propertyEditorFactory = newPropertyEditorFactory;
    boolean oldPropertyEditorFactoryESet = propertyEditorFactoryESet;
    propertyEditorFactoryESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GenModelPackage.GEN_DATA_TYPE__PROPERTY_EDITOR_FACTORY, oldPropertyEditorFactory, propertyEditorFactory, !oldPropertyEditorFactoryESet));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @since 2.14
   * @generated
   */
  public void unsetPropertyEditorFactory()
  {
    String oldPropertyEditorFactory = propertyEditorFactory;
    boolean oldPropertyEditorFactoryESet = propertyEditorFactoryESet;
    propertyEditorFactory = PROPERTY_EDITOR_FACTORY_EDEFAULT;
    propertyEditorFactoryESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, GenModelPackage.GEN_DATA_TYPE__PROPERTY_EDITOR_FACTORY, oldPropertyEditorFactory, PROPERTY_EDITOR_FACTORY_EDEFAULT, oldPropertyEditorFactoryESet));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @since 2.14
   * @generated
   */
  public boolean isSetPropertyEditorFactory()
  {
    return propertyEditorFactoryESet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case GenModelPackage.GEN_DATA_TYPE__ECORE_DATA_TYPE:
        if (resolve) return getEcoreDataType();
        return basicGetEcoreDataType();
      case GenModelPackage.GEN_DATA_TYPE__CREATE:
        return getCreate();
      case GenModelPackage.GEN_DATA_TYPE__CONVERT:
        return getConvert();
      case GenModelPackage.GEN_DATA_TYPE__PROPERTY_EDITOR_FACTORY:
        return getPropertyEditorFactory();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case GenModelPackage.GEN_DATA_TYPE__ECORE_DATA_TYPE:
        setEcoreDataType((EDataType)newValue);
        return;
      case GenModelPackage.GEN_DATA_TYPE__CREATE:
        setCreate((String)newValue);
        return;
      case GenModelPackage.GEN_DATA_TYPE__CONVERT:
        setConvert((String)newValue);
        return;
      case GenModelPackage.GEN_DATA_TYPE__PROPERTY_EDITOR_FACTORY:
        setPropertyEditorFactory((String)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case GenModelPackage.GEN_DATA_TYPE__ECORE_DATA_TYPE:
        setEcoreDataType((EDataType)null);
        return;
      case GenModelPackage.GEN_DATA_TYPE__CREATE:
        unsetCreate();
        return;
      case GenModelPackage.GEN_DATA_TYPE__CONVERT:
        unsetConvert();
        return;
      case GenModelPackage.GEN_DATA_TYPE__PROPERTY_EDITOR_FACTORY:
        unsetPropertyEditorFactory();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case GenModelPackage.GEN_DATA_TYPE__ECORE_DATA_TYPE:
        return ecoreDataType != null;
      case GenModelPackage.GEN_DATA_TYPE__CREATE:
        return isSetCreate();
      case GenModelPackage.GEN_DATA_TYPE__CONVERT:
        return isSetConvert();
      case GenModelPackage.GEN_DATA_TYPE__PROPERTY_EDITOR_FACTORY:
        return isSetPropertyEditorFactory();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (create: ");
    if (createESet) result.append(create); else result.append("<unset>");
    result.append(", convert: ");
    if (convertESet) result.append(convert); else result.append("<unset>");
    result.append(", propertyEditorFactory: ");
    if (propertyEditorFactoryESet) result.append(propertyEditorFactory); else result.append("<unset>");
    result.append(')');
    return result.toString();
  }

  @Override
  public EClassifier getEcoreClassifier()
  {
    return getEcoreDataType();
  }

  @Override
  protected EModelElement basicGetEcoreModelElement()
  {
    return ecoreDataType;
  }

  @Override
  public String getImportedMetaType()
  {
    return getGenModel().getImportedName("org.eclipse.emf.ecore.EDataType");
  }

  public String getQualifiedInstanceClassName()
  {
    return getRawQualifiedInstanceClassName().replace('$','.');
  }

  public String getRawQualifiedInstanceClassName()
  {
    return getInternalQualifiedInstanceClassName(getEffectiveComplianceLevel().getValue() >= GenJDKLevel.JDK50);
  }

  protected String getInternalQualifiedInstanceClassName(boolean includeTemplateArguments)
  {
    return getType(null, getEcoreDataType(), false, !includeTemplateArguments);
  }

  public String getRawImportedInstanceClassName()
  {  
   return getGenModel().getImportedName(getInternalQualifiedInstanceClassName(false)); 
  }

  public String getRawInstanceClassName()
  {  
    String internalQualifiedInstanceClassName = getInternalQualifiedInstanceClassName(false);
    return internalQualifiedInstanceClassName == null ? null : internalQualifiedInstanceClassName.replace('$', '.'); 
  }

  public String getImportedInstanceClassName()
  {
   return getGenModel().getImportedName(getRawQualifiedInstanceClassName()); 
  }

  @Override
  public String getImportedParameterizedInstanceClassName()
  {
    String result = getImportedInstanceClassName();
    if (getEffectiveComplianceLevel().getValue() >= GenJDKLevel.JDK50)
    {
      if (getEffectiveItemType() != null)
      {
        result += "<" + getEffectiveItemType().getObjectType().getImportedParameterizedInstanceClassName() + ">";
      }
      else if (!getEcoreDataType().getETypeParameters().isEmpty())
      {
        result += "<";
        for (Iterator<ETypeParameter> i = getEcoreDataType().getETypeParameters().iterator(); i.hasNext(); )
        {
          i.next();
          result += "?";
          if (i.hasNext())
          {
            result += ", ";
          }
        }
        result += ">";
      }
    }
    return result;
  }

  @Override
  public String getImportedWildcardInstanceClassName()
  {
    String result = getImportedInstanceClassName();
    if (getEffectiveComplianceLevel().getValue() >= GenJDKLevel.JDK50)
    {
      if (getEffectiveItemType() != null)
      {
        result += "<?>";
      }
      else if (!getEcoreDataType().getETypeParameters().isEmpty())
      {
        result += "<";
        for (Iterator<ETypeParameter> i = getEcoreDataType().getETypeParameters().iterator(); i.hasNext(); )
        {
          i.next();
          result += "?";
          if (i.hasNext())
          {
            result += ", ";
          }
        }
        result += ">";
      }
    }
    return result;
  }

  public String getImportedWildcardObjectInstanceClassName()
  {
    String result = getObjectInstanceClassName();
    if (getEffectiveComplianceLevel().getValue() >= GenJDKLevel.JDK50)
    {
      if (getEffectiveItemType() != null)
      {
        result += "<?>";
      }
      else if (!getEcoreDataType().getETypeParameters().isEmpty())
      {
        result += "<";
        for (Iterator<ETypeParameter> i = getEcoreDataType().getETypeParameters().iterator(); i.hasNext(); )
        {
          i.next();
          result += "?";
          if (i.hasNext())
          {
            result += ", ";
          }
        }
        result += ">";
      }
    }
    return result;
  }
  
  @Override
  public String getImportedBoundedWildcardInstanceClassName()
  {
    String result = getImportedInstanceClassName();
    if (getEffectiveComplianceLevel().getValue() >= GenJDKLevel.JDK50)
    {
      if (getEffectiveItemType() != null)
      {
        result += "<? extends " + getEffectiveItemType().getObjectType().getImportedParameterizedInstanceClassName() + ">";
      }
      else if (!getEcoreDataType().getETypeParameters().isEmpty())
      {
        result += "<";
        for (Iterator<ETypeParameter> i = getEcoreDataType().getETypeParameters().iterator(); i.hasNext(); )
        {
          i.next();
          result += "?";
          if (i.hasNext())
          {
            result += ", ";
          }
        }
        result += ">";
      }
    }
    return result;
  }

  public String getImportedParameterizedObjectInstanceClassName()
  {
    boolean erased = getEffectiveComplianceLevel().getValue() < GenJDKLevel.JDK50;
    String result = getImportedType(null, getEcoreDataType(), true, erased);
    if (!erased)
    {
      if (getEffectiveItemType() != null)
      {
        result += "<" + getEffectiveItemType().getObjectType().getImportedParameterizedInstanceClassName() + ">";
      }
      else if (!getEcoreDataType().getETypeParameters().isEmpty())
      {
        result += "<";
        for (Iterator<ETypeParameter> i = getEcoreDataType().getETypeParameters().iterator(); i.hasNext(); )
        {
          i.next();
          result += "?";
          if (i.hasNext())
          {
            result += ", ";
          }
        }
        result += ">";
      }
    }
    return result;
  }

  public String getObjectInstanceClassName()
  {
    return getImportedType(null, getEcoreDataType(), true, true);
  }

  public boolean isSerializable()
  {
    return getEcoreDataType().isSerializable();
  }

  public String getSerializableFlag()
  {
    String result = !getEcoreDataType().isSerializable() ? "!" : "";
    return result + "IS_SERIALIZABLE";
  }

  public String getGeneratedInstanceClassFlag()
  {
    String result = this instanceof GenEnum || getBaseType() instanceof GenEnum ? "" : "!";
    return result + "IS_GENERATED_INSTANCE_CLASS";
  }

  public boolean isPrimitiveType()
  {
    return isPrimitiveType(getEcoreDataType());
  }

  public boolean isArrayType()
  {
    String instanceClassName = getEcoreDataType().getInstanceClassName();
    return instanceClassName != null && instanceClassName.indexOf('[') != -1;
  }

  public boolean isObjectType()
  {
    EDataType eDataType = getEcoreDataType();
    return "java.lang.Object".equals(eDataType.getInstanceClassName()) || isRemappedXMLType(eDataType);
  }

  public String getPrimitiveValueFunction()
  {
    Class<?> instanceClass = getEcoreDataType().getInstanceClass();
    if (instanceClass == java.lang.Boolean.TYPE)
      return "booleanValue";
    if (instanceClass == java.lang.Byte.TYPE)
      return "byteValue";
    if (instanceClass == java.lang.Character.TYPE)
      return "charValue";
    if (instanceClass == java.lang.Double.TYPE)
      return "doubleValue";
    if (instanceClass == java.lang.Float.TYPE)
      return "floatValue";
    if (instanceClass == java.lang.Integer.TYPE)
      return "intValue";
    if (instanceClass == java.lang.Long.TYPE)
      return "longValue";
    if (instanceClass == java.lang.Short.TYPE)
      return "shortValue";
    return null;
  }

  @Override
  public String getModelInfo()
  {
    StringBuffer result = new StringBuffer();
  
    EDataType eDataType = getEcoreDataType();
    if (eDataType.eIsSet(EcorePackage.Literals.ECLASSIFIER__INSTANCE_CLASS_NAME) || 
          eDataType.eIsSet(EcorePackage.Literals.ECLASSIFIER__INSTANCE_TYPE_NAME))
    {
      appendModelSetting(result, "instanceClass", getRawQualifiedInstanceClassName());
    }
  
    if (!isSerializable())
    {
      appendModelSetting(result, "serializeable", "false");
    }
  
    if (!getGenTypeParameters().isEmpty())
    {
      StringBuilder typeParameterNames = new StringBuilder();
      for (Iterator<GenTypeParameter> i = getGenTypeParameters().iterator(); i.hasNext(); )
      {
        typeParameterNames.append(i.next().getName());
        if (i.hasNext())
        {
          typeParameterNames.append(' ');
        }
      }
      appendModelSetting(result, "typeParameters", typeParameterNames.toString());
      for (GenTypeParameter genTypeParameter : getGenTypeParameters())
      {
        String info = genTypeParameter.getQualifiedModelInfo();
        if (info.length() != 0)
        {
          result.append(info);
          result.append(' ');
        }
      }
    }
  
    appendAnnotationInfo(result, getEcoreDataType());
  
    return result.toString().trim();
  }

  public GenDataType getBaseType()
  {
    EDataType baseType = getExtendedMetaData().getBaseType(getEcoreDataType());
    return baseType == null ? null : (GenDataType)findGenClassifier(baseType);
  }

  public GenDataType getItemType()
  {
    EDataType itemType = getExtendedMetaData().getItemType(getEcoreDataType());
    return itemType == null ? null : (GenDataType)findGenClassifier(itemType);
  }

  public GenDataType getEffectiveItemType()
  {
    ExtendedMetaData extendedMetaData = getExtendedMetaData();
    for (EDataType eDataType = getEcoreDataType(); eDataType != null; eDataType = extendedMetaData.getBaseType(eDataType))
    {
      EDataType itemType = getExtendedMetaData().getItemType(eDataType);
      if (itemType != null)
      {
        return (GenDataType)findGenClassifier(itemType);
      }
    }
    return null;
  }

  public List<GenDataType> getMemberTypes()
  {
    List<GenDataType> result = new ArrayList<GenDataType>();
    for (EDataType memberType : getExtendedMetaData().getMemberTypes(getEcoreDataType()))
    {
      result.add((GenDataType)findGenClassifier(memberType));
    }
    return result;
  }

  public List<GenDataType> getEffectiveMemberTypes()
  {
    ExtendedMetaData extendedMetaData = getExtendedMetaData();
    for (EDataType eDataType = getEcoreDataType(); eDataType != null; eDataType = extendedMetaData.getBaseType(eDataType))
    {
      List<GenDataType> result = new ArrayList<GenDataType>();
      for (EDataType memberType : getExtendedMetaData().getMemberTypes(eDataType))
      {
        result.add((GenDataType)findGenClassifier(memberType));
      }
      if (!result.isEmpty())
      {
        return result;
      }
    }
    return null;
  }

  public GenDataType getObjectType()
  {
    ExtendedMetaData extendedMetaData = getExtendedMetaData();
    EDataType eDataType = getEcoreDataType();
    EClassifier eClassifier = extendedMetaData.getType(eDataType.getEPackage(), extendedMetaData.getName(eDataType) + ":Object");
    if (eClassifier instanceof EDataType)
    {
      GenDataType result = findGenDataType((EDataType)eClassifier);
      if (result != null)
      {
        return result;
      }
    }
    return this;
  }

  public String getMinLiteral()
  {
    ExtendedMetaData extendedMetaData = getExtendedMetaData();
    for (EDataType eDataType = getEcoreDataType(); eDataType != null; eDataType = extendedMetaData.getBaseType(eDataType))
    {
      String min = extendedMetaData.getMinExclusiveFacet(eDataType);
      if (min != null)
      {
        return min;
      }
      min = extendedMetaData.getMinInclusiveFacet(eDataType);
      if (min != null)
      {
        return min;
      }
    }
    return null;
  }

  public boolean isMinInclusive()
  {
    ExtendedMetaData extendedMetaData = getExtendedMetaData();
    for (EDataType eDataType = getEcoreDataType(); eDataType != null; eDataType = extendedMetaData.getBaseType(eDataType))
    {
      String min = extendedMetaData.getMinExclusiveFacet(eDataType);
      if (min != null)
      {
        return false;
      }
      min = extendedMetaData.getMinInclusiveFacet(eDataType);
      if (min != null)
      {
        return true;
      }
    }
    return true;
  }

  public String getMaxLiteral()
  {
    ExtendedMetaData extendedMetaData = getExtendedMetaData();
    for (EDataType eDataType = getEcoreDataType(); eDataType != null; eDataType = extendedMetaData.getBaseType(eDataType))
    {
      String max = extendedMetaData.getMaxExclusiveFacet(eDataType);
      if (max != null)
      {
        return max;
      }
      max = extendedMetaData.getMaxInclusiveFacet(eDataType);
      if (max != null)
      {
        return max;
      }
    }
    return null;
  }

  public boolean isMaxInclusive()
  {
    ExtendedMetaData extendedMetaData = getExtendedMetaData();
    for (EDataType eDataType = getEcoreDataType(); eDataType != null; eDataType = extendedMetaData.getBaseType(eDataType))
    {
      String max = extendedMetaData.getMaxExclusiveFacet(eDataType);
      if (max != null)
      {
        return false;
      }
      max = extendedMetaData.getMaxInclusiveFacet(eDataType);
      if (max != null)
      {
        return true;
      }
    }
    return true;
  }

  public String getLengthAccessorFunction()
  {
    if (isArrayType())
    {
      return "length";
    }
    else if ("java.lang.String".equals(getEcoreDataType().getInstanceClassName()))
    {
      return "length()";
    }
    else
    {
      return "size()";
    }
  }

  public int getMinLength()
  {
    ExtendedMetaData extendedMetaData = getExtendedMetaData();
    for (EDataType eDataType = getEcoreDataType(); eDataType != null; eDataType = extendedMetaData.getBaseType(eDataType))
    {
      int minLength = extendedMetaData.getMinLengthFacet(eDataType);
      if (minLength != -1)
      {
        return minLength;
      }
      minLength = extendedMetaData.getLengthFacet(eDataType);
      if (minLength != -1)
      {
        return minLength;
      }
    }
    return -1;
  }

  public int getMaxLength()
  {
    ExtendedMetaData extendedMetaData = getExtendedMetaData();
    for (EDataType eDataType = getEcoreDataType(); eDataType != null; eDataType = extendedMetaData.getBaseType(eDataType))
    {
      int maxLength = extendedMetaData.getMaxLengthFacet(eDataType);
      if (maxLength != -1)
      {
        return maxLength;
      }
      maxLength = extendedMetaData.getLengthFacet(eDataType);
      if (maxLength != -1)
      {
        return maxLength;
      }
    }
    return -1;
  }

  public int getTotalDigits()
  {
    ExtendedMetaData extendedMetaData = getExtendedMetaData();
    for (EDataType eDataType = getEcoreDataType(); eDataType != null; eDataType = extendedMetaData.getBaseType(eDataType))
    {
      int totalDigits = extendedMetaData.getTotalDigitsFacet(eDataType);
      if (totalDigits != -1)
      {
        if (validTotalDigits(eDataType, totalDigits))
        {
          return totalDigits;
        }
        else
        {
          return -1;
        }
      }
    }
    return -1;
  }

  protected boolean validTotalDigits(EDataType eDataType, int totalDigits)
  {
    if (totalDigits > 0)
    {
      if (eDataType.getInstanceClassName() == "java.math.BigDecimal")
      {
        return true;
      }
      else
      {
        StringBuilder literal = new StringBuilder("1"); 
        for (int digitCount = totalDigits; digitCount > 0; --digitCount)
        {
          literal.append("0");
        }
        return !"".equals(getStaticValue(literal.toString())) && !"".equals(getStaticValue(literal.insert(0, "-").toString()));
      }
    }
    else
    {
      return false;
    }
  }

  public int getFractionDigits()
  {
    ExtendedMetaData extendedMetaData = getExtendedMetaData();
    for (EDataType eDataType = getEcoreDataType(); eDataType != null; eDataType = extendedMetaData.getBaseType(eDataType))
    {
      int fractionDigits = extendedMetaData.getFractionDigitsFacet(eDataType);
      if (fractionDigits != -1)
      {
        return fractionDigits;
      }
    }
    return -1;
  }

  public List<String> getEnumerationLiterals()
  {
    ExtendedMetaData extendedMetaData = getExtendedMetaData();
    for (EDataType eDataType = getEcoreDataType(); eDataType != null; eDataType = extendedMetaData.getBaseType(eDataType))
    {
      List<String> literals = extendedMetaData.getEnumerationFacet(eDataType);
      if (!literals.isEmpty())
      {
        return literals;
      }
    }
    return Collections.emptyList();
  }

  public String getWhiteSpace()
  {
    ExtendedMetaData extendedMetaData = getExtendedMetaData();
    for (EDataType eDataType = getEcoreDataType(); eDataType != null; eDataType = extendedMetaData.getBaseType(eDataType))
    {
      int whiteSpace = extendedMetaData.getWhiteSpaceFacet(eDataType);
      if (whiteSpace != ExtendedMetaData.UNSPECIFIED_WHITE_SPACE)
      {
        return ExtendedMetaData.WHITE_SPACE_KINDS[whiteSpace];
      }
    }
    return ExtendedMetaData.WHITE_SPACE_KINDS[ExtendedMetaData.UNSPECIFIED_WHITE_SPACE];
  }

  protected static final List<String> xmlCalendarTypes = 
    Arrays.asList
      (new String[]
       {
         "date",
         "dateTime",
         "gDay",
         "gMonth",
         "gMonthDay",
         "gYear",
         "gYearMonth",
         "time"
       });

  public boolean isXMLCalendar()
  {
    return isDerivedType(getEcoreDataType(), XMLTypePackage.eNS_URI, null, xmlCalendarTypes);
  }

  public boolean isXMLDuration()
  {
    return isDerivedType(getEcoreDataType(), XMLTypePackage.eNS_URI, "duration", null);
  }

  public boolean isXMLBoolean()
  {
    return isDerivedType(getEcoreDataType(), XMLTypePackage.eNS_URI, "boolean", null);
  }

  public List<List<String>> getPatterns()
  {
    List<List<String>> result = new ArrayList<List<String>>();
    ExtendedMetaData extendedMetaData = getExtendedMetaData();
    for (EDataType eDataType = getEcoreDataType(); eDataType != null; eDataType = extendedMetaData.getBaseType(eDataType))
    {
      List<String> patterns = extendedMetaData.getPatternFacet(eDataType);
      if (!patterns.isEmpty())
      {
        List<String> literals = new ArrayList<String>();
        for (String pattern : patterns)
        {
          literals.add(Literals.toLiteral(pattern));
        }
        result.add(literals);
      }
    }
    return result;
  }

  public void initialize(EDataType eDataType)
  {
    if (eDataType != getEcoreDataType())
    {
      setEcoreDataType(eDataType);
    }

    List<ETypeParameter> typeParameters = eDataType.getETypeParameters();
    LOOP:
    for (int i = 0; i < typeParameters.size(); ++i) 
    {
      ETypeParameter typeParameter = typeParameters.get(i);

      for (int j = 0; j < getGenTypeParameters().size(); ++j)
      {
        GenTypeParameter genTypeParameter = getGenTypeParameters().get(j);
        if (genTypeParameter.getEcoreTypeParameter() == typeParameter)
        {
          genTypeParameter.initialize(typeParameter);
          if (i != j)
          {
            getGenTypeParameters().move(i, j);
          }

          continue LOOP;
        }
      }

      GenTypeParameter genTypeParameter = getGenModel().createGenTypeParameter();
      getGenTypeParameters().add(genTypeParameter);
      genTypeParameter.initialize(typeParameter);
    }
  }

  public boolean reconcile(GenDataType oldGenDataTypeVersion)
  {
    if (getEcoreDataType().getName().equals(oldGenDataTypeVersion.getEcoreDataType().getName()))
    {
      for (int i = 0, size = Math.min(getGenTypeParameters().size(), oldGenDataTypeVersion.getGenTypeParameters().size()); i < size; i++)
      {
        GenTypeParameter genTypeParameter = getGenTypeParameters().get(i);
        GenTypeParameter oldGenTypeParameterVersion = oldGenDataTypeVersion.getGenTypeParameters().get(i);
        genTypeParameter.reconcile(oldGenTypeParameterVersion);
      }

      reconcileSettings(oldGenDataTypeVersion);
      return true;
    }
    else
    {
      return false;
    }
  }

  protected void reconcileSettings(GenDataType oldGenDataTypeVersion)
  {
    reconcileGenAnnotations(oldGenDataTypeVersion);
    if (oldGenDataTypeVersion.eIsSet(GenModelPackage.Literals.GEN_CLASSIFIER__DOCUMENTATION))
    {
      setDocumentation(oldGenDataTypeVersion.getDocumentation());
    }

    if (oldGenDataTypeVersion.eIsSet(GenModelPackage.Literals.GEN_DATA_TYPE__CREATE))
    {
      setCreate((String)oldGenDataTypeVersion.eGet(GenModelPackage.Literals.GEN_DATA_TYPE__CREATE));
    }

    if (oldGenDataTypeVersion.eIsSet(GenModelPackage.Literals.GEN_DATA_TYPE__CONVERT))
    {
      setConvert((String)oldGenDataTypeVersion.eGet(GenModelPackage.Literals.GEN_DATA_TYPE__CONVERT));
    }

    if (oldGenDataTypeVersion.eIsSet(GenModelPackage.Literals.GEN_DATA_TYPE__PROPERTY_EDITOR_FACTORY))
    {
      setConvert(oldGenDataTypeVersion.getPropertyEditorFactory());
    }
  }

  public boolean reconcile()
  {
    try
    {
      EDataType eDataType = getEcoreDataType();
      if (eDataType == null || eDataType.eIsProxy() || eDataType.eResource() == null)
      {
        return false;
      }
      else
      {
        for (Iterator<GenTypeParameter> i = getGenTypeParameters().iterator(); i.hasNext(); )
        {
          GenTypeParameter genTypeParameter = i.next();
          if (!genTypeParameter.reconcile())
          {
            i.remove();
          }
        }

        return true;
      }
    }
    catch (RuntimeException exception)
    {
      return false;
    }
  }

  @Override
  public List<String> getGenConstraints()
  {
    List<String> constraints = new UniqueEList<String>(super.getGenConstraints());
    ExtendedMetaData extendedMetaData = getExtendedMetaData();
    EDataType eDataType = getEcoreDataType();
    // White space is not a constraint; it should affect createFromString only.
    //
    // if (extendedMetaData.getWhiteSpaceFacet(eDataType) != ExtendedMetaData.UNSPECIFIED_WHITE_SPACE)
    // {
    //   constraints.add("WhiteSpace");
    // }
    if (!extendedMetaData.getEnumerationFacet(eDataType).isEmpty())
    {
      constraints.add("Enumeration");
    }
    if (!extendedMetaData.getPatternFacet(eDataType).isEmpty())
    {
      constraints.add("Pattern");
    }
    if (validTotalDigits(eDataType, extendedMetaData.getTotalDigitsFacet(eDataType)))
    {
      constraints.add("TotalDigits");
    }
    if (extendedMetaData.getFractionDigitsFacet(eDataType) != -1)
    {
      constraints.add("FractionDigits");
    }
    if (extendedMetaData.getLengthFacet(eDataType) != -1)
    {
      constraints.add("MinLength");
      constraints.add("MaxLength");
    }
    if (extendedMetaData.getMinLengthFacet(eDataType) != -1)
    {
      constraints.add("MinLength");
    }
    if (extendedMetaData.getMaxLengthFacet(eDataType) != -1)
    {
      constraints.add("MaxLength");
    }
    if (extendedMetaData.getMinExclusiveFacet(eDataType) != null || extendedMetaData.getMinInclusiveFacet(eDataType) != null)
    {
      constraints.add("Min");
    }
    if (extendedMetaData.getMaxExclusiveFacet(eDataType) != null || extendedMetaData.getMaxInclusiveFacet(eDataType) != null)
    {
      constraints.add("Max");
    }
    if (getItemType() != null)
    {
      constraints.add("ItemType");
    }
    if (!getMemberTypes().isEmpty())
    {
      constraints.add("MemberTypes");
    }
    return constraints;
  }

  @Override
  public List<String> getAllGenConstraints()
  {
    List<GenDataType> allBaseTypes = new ArrayList<GenDataType>();
    if (getExtendedMetaData().getEnumerationFacet(getEcoreDataType()).isEmpty())
    {
      for (GenDataType baseType = getBaseType(); baseType != null; baseType = baseType.getBaseType())
      {
        allBaseTypes.add(baseType);
        if (!getExtendedMetaData().getEnumerationFacet(baseType.getEcoreDataType()).isEmpty())
        {
          break;
        }
      }
    }
    return collectGenConstraints(allBaseTypes, getGenConstraints(), null);
  }

  @Override
  public GenClassifier getConstraintImplementor(String constraint)
  {
    for (GenDataType baseType = this; baseType != null; baseType = baseType.getBaseType())
    {
      if (baseType.getGenConstraints().contains(constraint))
      {
        return baseType;
      }
    }
    return null;
  }

  public GenClassifier getConstraintDelegate(String constraint)
  {
    for (GenDataType baseType = getBaseType(); baseType != null; baseType = baseType.getBaseType())
    {
      if (baseType.getGenConstraints().contains(constraint))
      {
        return baseType;
      }
    }
    return null;
  }

  /**
   * First follows base types in extended metadata, returning the first data type from Ecore or XMLTypes encountered.
   * In none, looks for a serializable Ecore data type that represents the Java type.
   * This Ecore type matching is unfortunately not so great, but required for backwards compatibility.
   */
  EDataType getBasicType()
  {
    ExtendedMetaData extendedMetaData = getExtendedMetaData();
    for (EDataType eDataType = getEcoreDataType(); eDataType != null; eDataType = extendedMetaData.getBaseType(eDataType))
    {
      String namespace = extendedMetaData.getNamespace(eDataType);
      if (EcorePackage.eNS_URI.equals(namespace))
      {
        if (eDataType.getEPackage() != EcorePackage.eINSTANCE)
        {
          return (EDataType)EcorePackage.eINSTANCE.getEClassifier(eDataType.getName());
          
        }

        return eDataType;
      }

      if (XMLTypePackage.eNS_URI.equals(namespace))
      {
        if (eDataType.getEPackage() != XMLTypePackage.eINSTANCE)
        {
          return (EDataType)XMLTypePackage.eINSTANCE.getEClassifier(eDataType.getName());
        }

        return eDataType;
      }
    }

    String instanceClassName = getEcoreDataType().getInstanceClassName();
    for (EClassifier eClassifier : EcorePackage.eINSTANCE.getEClassifiers())
    {
      if (eClassifier instanceof EDataType && eClassifier.getInstanceClassName().equals(instanceClassName))
      {
        EDataType eDataType = (EDataType)eClassifier;
        if (eDataType.isSerializable())
        {
          return eDataType;
        }
      }
    }
    return null;
  }

  boolean useFactoryFor(EDataType eDataType)
  {
    String nsURI = eDataType.getEPackage().getNsURI();
    if (XMLTypePackage.eNS_URI.equals(nsURI))
    {
      // Some XML types declare nebulous Object mappings.
      // They actually map to internal types that shouldn't be generated into code.
      //
      String name = eDataType.getName();
      return
        "Date".equals(name) ||
        "DateTime".equals(name) ||
        "Duration".equals(name) ||
        "GDay".equals(name) ||
        "GMonth".equals(name) ||
        "GMonthDay".equals(name) ||
        "GYear".equals(name) ||
        "GYearMonth".equals(name) ||
        "NOTATION".equals(name) ||
        "QName".equals(name) ||
        "Time".equals(name) ||
        "ENTITIES".equals(name) ||
        "ENTITIESBASE".equals(name) ||
        "IDREFS".equals(name) ||
        "IDREFSBase".equals(name) ||
        "NMTOKENS".equals(name) ||
        "NMTOKENSBase".equals(name);
    }
    else if (EcorePackage.eNS_URI.equals(nsURI))
    {
      // EDate is far too often overridden to provide a different mapping, and therefore the default is somewhat obscure.
      // So, it's best to delegate to the factory.
      //
      if ("EDate".equals(eDataType.getName()))
      {
        return true;
      }
      else if ("EJavaObject".equals(eDataType.getName()))
      {
        ExtendedMetaData extendedMetaData = getExtendedMetaData();
        for (EDataType base = getEcoreDataType(); base != null; base = extendedMetaData.getBaseType(base))
        {
          if (!extendedMetaData.getMemberTypes(base).isEmpty())
          {
            return true;
          }
        }
      }
      return false;
    }
    return true;
  }

  public String getStaticValue(String literal)
  {
    return getStaticValue(literal, true);
    
  }

  public String getStaticValue(String literal, boolean includeCast)
  {
    EDataType eDataType = getEcoreDataType();
    if (eDataType instanceof EEnum)
    {
      GenEnum genEnum = findGenEnum((EEnum)eDataType);
      if (genEnum != null)
      {
        return genEnum.getStaticValue(literal);
      }
    }

    if (!hasConversionDelegate() || (literal == null && isPrimitiveType()))
    {
      // If there is a base XML or Ecore type, use one of the two corresponding built-in factories to create a value from the literal string.
      //
      EDataType base = getBasicType();
      if (base != null && !useFactoryFor(base))
      {
        Object value = isPrimitiveType() ? base.getDefaultValue() : null;
  
        if (literal != null)
        {
          try
          {
            value = EcoreUtil.createFromString(base, literal);
          }
          catch (Exception e)
          {
            return "";  // cause a syntax error
          }
        }
  
        // Get the Java literal expression for the value.
        //
        if (value == null) return "null";
        Class<?> typeClass = getInstanceClass(base);
        return Literals.toLiteral(value, typeClass != null && !typeClass.isPrimitive(), getGenModel().getMainGenModel());
      }
    }

    // Otherwise, produce an expression that uses the appropriate factory to create a value from the literal.
    //
    if (literal == null) return "null";

    StringBuilder result = new StringBuilder(getGenPackage().getQualifiedEFactoryInstanceAccessor());
    result.append(".createFromString(");
    result.append(getGenPackage().getImportedPackageInterfaceName()); 
    result.append(".eINSTANCE.get"); 
    result.append(getName()); 
    result.append("(), "); 
    result.append(Literals.toStringLiteral(literal, getGenModel().getMainGenModel()));
    result.append(')');

    // If the type isn't Object, we need to cast. If it's a primitive, we need to unbox.
    //
    if (includeCast ? !isObjectType() : isPrimitiveType())
    {
      StringBuilder cast = new StringBuilder();
      if (isPrimitiveType())
      {
        cast.append("((");
        cast.append(getObjectInstanceClassName());
        cast.append(')');
        cast.append(result);
        cast.append(").");
        cast.append(getPrimitiveValueFunction());
        cast.append("()");
      }
      else
      {
        cast.append('(');
        cast.append(getImportedParameterizedInstanceClassName());
        cast.append(')');
        cast.append(result);
      }
      result = cast;
    }
    return result.toString();
  }

  protected String getCreatorBody()
  {
    if (isSetCreate())
    {
      return getCreate();
    }
    else
    {
      EDataType eDataType = getEcoreDataType();
      EAnnotation eAnnotation = eDataType.getEAnnotation(GenModelPackage.eNS_URI);
      return eAnnotation == null ? null : (String)eAnnotation.getDetails().get("create");
    }
  }

  public boolean hasCreatorBody()
  {
    return getCreatorBody() != null;
  }

  public String getCreatorBody(String indentation)
  {
    return indentAndImport(getCreatorBody(), indentation);
  }

  public boolean hasConversionDelegate()
  {
    List<String> conversionDelegates = EcoreUtil.getConversionDelegates(getGenPackage().getEcorePackage());
    if (!conversionDelegates.isEmpty())
    {
      EDataType eDataType = getEcoreDataType();
      for (String eDataTypeDelegateURI : conversionDelegates)
      {
        if (eDataType.getEAnnotation(eDataTypeDelegateURI) != null)
        {
          return true;
        }
      }
    }
    return false;
  }

  protected String getConverterBody()
  {
    if (isSetConvert())
    {
      return getConvert();
    }
    else
    {
      EDataType eDataType = getEcoreDataType();
      EAnnotation eAnnotation = eDataType.getEAnnotation(GenModelPackage.eNS_URI);
      return eAnnotation == null ? null : (String)eAnnotation.getDetails().get("convert");
    }
  }

  public boolean hasConverterBody()
  {
    return getConverterBody() != null;
  }

  public String getConverterBody(String indentation)
  {
    return indentAndImport(getConverterBody(), indentation);
  }

  @Override
  protected String getLink()
  {
    return getGenPackage().getQualifiedPackageInterfaceName() + "#get" + getClassifierAccessorName() + "()";
  }
}
