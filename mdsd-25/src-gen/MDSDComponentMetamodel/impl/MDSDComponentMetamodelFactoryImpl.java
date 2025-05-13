/**
 */
package MDSDComponentMetamodel.impl;

import MDSDComponentMetamodel.*;

import org.eclipse.emf.ecore.EClass;
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
public class MDSDComponentMetamodelFactoryImpl extends EFactoryImpl implements MDSDComponentMetamodelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MDSDComponentMetamodelFactory init() {
		try {
			MDSDComponentMetamodelFactory theMDSDComponentMetamodelFactory = (MDSDComponentMetamodelFactory) EPackage.Registry.INSTANCE
					.getEFactory(MDSDComponentMetamodelPackage.eNS_URI);
			if (theMDSDComponentMetamodelFactory != null) {
				return theMDSDComponentMetamodelFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MDSDComponentMetamodelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MDSDComponentMetamodelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case MDSDComponentMetamodelPackage.COMPONENT_SYSTEM:
			return createComponentSystem();
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
	public ComponentSystem createComponentSystem() {
		ComponentSystemImpl componentSystem = new ComponentSystemImpl();
		return componentSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MDSDComponentMetamodelPackage getMDSDComponentMetamodelPackage() {
		return (MDSDComponentMetamodelPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MDSDComponentMetamodelPackage getPackage() {
		return MDSDComponentMetamodelPackage.eINSTANCE;
	}

} //MDSDComponentMetamodelFactoryImpl
