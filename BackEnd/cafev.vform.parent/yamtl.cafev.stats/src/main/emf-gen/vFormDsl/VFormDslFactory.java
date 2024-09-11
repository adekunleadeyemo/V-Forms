/**
 */
package vFormDsl;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see vFormDsl.VFormDslPackage
 * @generated
 */
public interface VFormDslFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	VFormDslFactory eINSTANCE = vFormDsl.impl.VFormDslFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model</em>'.
	 * @generated
	 */
	Model createModel();

	/**
	 * Returns a new object of class '<em>Form Layout</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Form Layout</em>'.
	 * @generated
	 */
	FormLayout createFormLayout();

	/**
	 * Returns a new object of class '<em>Form Input</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Form Input</em>'.
	 * @generated
	 */
	FormInput createFormInput();

	/**
	 * Returns a new object of class '<em>Form Input Basic</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Form Input Basic</em>'.
	 * @generated
	 */
	FormInputBasic createFormInputBasic();

	/**
	 * Returns a new object of class '<em>Form Input Range</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Form Input Range</em>'.
	 * @generated
	 */
	FormInputRange createFormInputRange();

	/**
	 * Returns a new object of class '<em>Form Input Select</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Form Input Select</em>'.
	 * @generated
	 */
	FormInputSelect createFormInputSelect();

	/**
	 * Returns a new object of class '<em>Option</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Option</em>'.
	 * @generated
	 */
	Option createOption();

	/**
	 * Returns a new object of class '<em>Data Option</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Option</em>'.
	 * @generated
	 */
	DataOption createDataOption();

	/**
	 * Returns a new object of class '<em>Enum Option</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Enum Option</em>'.
	 * @generated
	 */
	EnumOption createEnumOption();

	/**
	 * Returns a new object of class '<em>Number Option</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Number Option</em>'.
	 * @generated
	 */
	NumberOption createNumberOption();

	/**
	 * Returns a new object of class '<em>Form Input Search</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Form Input Search</em>'.
	 * @generated
	 */
	FormInputSearch createFormInputSearch();

	/**
	 * Returns a new object of class '<em>Option Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Option Item</em>'.
	 * @generated
	 */
	OptionItem createOptionItem();

	/**
	 * Returns a new object of class '<em>String Option Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>String Option Item</em>'.
	 * @generated
	 */
	StringOptionItem createStringOptionItem();

	/**
	 * Returns a new object of class '<em>Int Option Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Int Option Item</em>'.
	 * @generated
	 */
	IntOptionItem createIntOptionItem();

	/**
	 * Returns a new object of class '<em>Data Option Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Option Item</em>'.
	 * @generated
	 */
	DataOptionItem createDataOptionItem();

	/**
	 * Returns a new object of class '<em>Form Input Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Form Input Group</em>'.
	 * @generated
	 */
	FormInputGroup createFormInputGroup();

	/**
	 * Returns a new object of class '<em>Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data</em>'.
	 * @generated
	 */
	Data createData();

	/**
	 * Returns a new object of class '<em>String Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>String Data</em>'.
	 * @generated
	 */
	StringData createStringData();

	/**
	 * Returns a new object of class '<em>Int Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Int Data</em>'.
	 * @generated
	 */
	IntData createIntData();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	VFormDslPackage getVFormDslPackage();

} //VFormDslFactory
