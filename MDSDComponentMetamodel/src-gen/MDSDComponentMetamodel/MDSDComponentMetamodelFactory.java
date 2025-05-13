/**
 */
package MDSDComponentMetamodel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see MDSDComponentMetamodel.MDSDComponentMetamodelPackage
 * @generated
 */
public interface MDSDComponentMetamodelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MDSDComponentMetamodelFactory eINSTANCE = MDSDComponentMetamodel.impl.MDSDComponentMetamodelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Component System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component System</em>'.
	 * @generated
	 */
	ComponentSystem createComponentSystem();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	MDSDComponentMetamodelPackage getMDSDComponentMetamodelPackage();

} //MDSDComponentMetamodelFactory
