/**
 * <copyright>
 * </copyright>
 *
 * $Id: LibraryFactory.java,v 1.2 2005/04/01 17:57:37 marcelop Exp $
 */
package org.examples.library;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.examples.library.LibraryPackage
 * @generated
 */
public interface LibraryFactory extends EFactory
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String copyright = "This is my code.";

  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  LibraryFactory eINSTANCE = new org.examples.library.impl.LibraryFactoryImpl();

  /**
   * Returns a new object of class '<em>Library</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Library</em>'.
   * @generated
   */
  Library createLibrary();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  LibraryPackage getLibraryPackage();

} //LibraryFactory
