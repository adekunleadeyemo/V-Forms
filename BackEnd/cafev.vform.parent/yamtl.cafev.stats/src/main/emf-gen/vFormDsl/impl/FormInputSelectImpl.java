/**
 */
package vFormDsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import vFormDsl.FormInputSelect;
import vFormDsl.Option;
import vFormDsl.VFormDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Form Input Select</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link vFormDsl.impl.FormInputSelectImpl#getOption <em>Option</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FormInputSelectImpl extends FormInputImpl implements FormInputSelect {
	/**
	 * The cached value of the '{@link #getOption() <em>Option</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOption()
	 * @generated
	 * @ordered
	 */
	protected Option option;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FormInputSelectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VFormDslPackage.Literals.FORM_INPUT_SELECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Option getOption() {
		return option;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOption(Option newOption, NotificationChain msgs) {
		Option oldOption = option;
		option = newOption;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VFormDslPackage.FORM_INPUT_SELECT__OPTION, oldOption, newOption);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOption(Option newOption) {
		if (newOption != option) {
			NotificationChain msgs = null;
			if (option != null)
				msgs = ((InternalEObject)option).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VFormDslPackage.FORM_INPUT_SELECT__OPTION, null, msgs);
			if (newOption != null)
				msgs = ((InternalEObject)newOption).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VFormDslPackage.FORM_INPUT_SELECT__OPTION, null, msgs);
			msgs = basicSetOption(newOption, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VFormDslPackage.FORM_INPUT_SELECT__OPTION, newOption, newOption));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VFormDslPackage.FORM_INPUT_SELECT__OPTION:
				return basicSetOption(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VFormDslPackage.FORM_INPUT_SELECT__OPTION:
				return getOption();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case VFormDslPackage.FORM_INPUT_SELECT__OPTION:
				setOption((Option)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case VFormDslPackage.FORM_INPUT_SELECT__OPTION:
				setOption((Option)null);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case VFormDslPackage.FORM_INPUT_SELECT__OPTION:
				return option != null;
		}
		return super.eIsSet(featureID);
	}

} //FormInputSelectImpl
