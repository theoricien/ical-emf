/**
 */
package iCal.impl;

import iCal.ComponentAlarmAudioProperty;
import iCal.ICalPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Alarm Audio Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iCal.impl.ComponentAlarmAudioPropertyImpl#getAttach <em>Attach</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentAlarmAudioPropertyImpl extends AlarmTypeImpl implements ComponentAlarmAudioProperty {
	/**
	 * The default value of the '{@link #getAttach() <em>Attach</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttach()
	 * @generated
	 * @ordered
	 */
	protected static final String ATTACH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAttach() <em>Attach</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttach()
	 * @generated
	 * @ordered
	 */
	protected String attach = ATTACH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentAlarmAudioPropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ICalPackage.Literals.COMPONENT_ALARM_AUDIO_PROPERTY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAttach() {
		return attach;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAttach(String newAttach) {
		String oldAttach = attach;
		attach = newAttach;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ICalPackage.COMPONENT_ALARM_AUDIO_PROPERTY__ATTACH,
					oldAttach, attach));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ICalPackage.COMPONENT_ALARM_AUDIO_PROPERTY__ATTACH:
			return getAttach();
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
		case ICalPackage.COMPONENT_ALARM_AUDIO_PROPERTY__ATTACH:
			setAttach((String) newValue);
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
		case ICalPackage.COMPONENT_ALARM_AUDIO_PROPERTY__ATTACH:
			setAttach(ATTACH_EDEFAULT);
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
		case ICalPackage.COMPONENT_ALARM_AUDIO_PROPERTY__ATTACH:
			return ATTACH_EDEFAULT == null ? attach != null : !ATTACH_EDEFAULT.equals(attach);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (attach: ");
		result.append(attach);
		result.append(')');
		return result.toString();
	}

} //ComponentAlarmAudioPropertyImpl
