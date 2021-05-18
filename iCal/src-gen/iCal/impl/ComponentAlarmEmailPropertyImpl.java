/**
 */
package iCal.impl;

import iCal.ComponentAlarmEmailProperty;
import iCal.ICalPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Alarm Email Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iCal.impl.ComponentAlarmEmailPropertyImpl#getAttendee <em>Attendee</em>}</li>
 *   <li>{@link iCal.impl.ComponentAlarmEmailPropertyImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link iCal.impl.ComponentAlarmEmailPropertyImpl#getAttach <em>Attach</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentAlarmEmailPropertyImpl extends AlarmTypeImpl implements ComponentAlarmEmailProperty {
	/**
	 * The cached value of the '{@link #getAttendee() <em>Attendee</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttendee()
	 * @generated
	 * @ordered
	 */
	protected EList<String> attendee;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAttach() <em>Attach</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttach()
	 * @generated
	 * @ordered
	 */
	protected EList<String> attach;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentAlarmEmailPropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ICalPackage.Literals.COMPONENT_ALARM_EMAIL_PROPERTY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getAttendee() {
		if (attendee == null) {
			attendee = new EDataTypeUniqueEList<String>(String.class, this,
					ICalPackage.COMPONENT_ALARM_EMAIL_PROPERTY__ATTENDEE);
		}
		return attendee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ICalPackage.COMPONENT_ALARM_EMAIL_PROPERTY__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getAttach() {
		if (attach == null) {
			attach = new EDataTypeUniqueEList<String>(String.class, this,
					ICalPackage.COMPONENT_ALARM_EMAIL_PROPERTY__ATTACH);
		}
		return attach;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ICalPackage.COMPONENT_ALARM_EMAIL_PROPERTY__ATTENDEE:
			return getAttendee();
		case ICalPackage.COMPONENT_ALARM_EMAIL_PROPERTY__DESCRIPTION:
			return getDescription();
		case ICalPackage.COMPONENT_ALARM_EMAIL_PROPERTY__ATTACH:
			return getAttach();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ICalPackage.COMPONENT_ALARM_EMAIL_PROPERTY__ATTENDEE:
			getAttendee().clear();
			getAttendee().addAll((Collection<? extends String>) newValue);
			return;
		case ICalPackage.COMPONENT_ALARM_EMAIL_PROPERTY__DESCRIPTION:
			setDescription((String) newValue);
			return;
		case ICalPackage.COMPONENT_ALARM_EMAIL_PROPERTY__ATTACH:
			getAttach().clear();
			getAttach().addAll((Collection<? extends String>) newValue);
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
		case ICalPackage.COMPONENT_ALARM_EMAIL_PROPERTY__ATTENDEE:
			getAttendee().clear();
			return;
		case ICalPackage.COMPONENT_ALARM_EMAIL_PROPERTY__DESCRIPTION:
			setDescription(DESCRIPTION_EDEFAULT);
			return;
		case ICalPackage.COMPONENT_ALARM_EMAIL_PROPERTY__ATTACH:
			getAttach().clear();
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
		case ICalPackage.COMPONENT_ALARM_EMAIL_PROPERTY__ATTENDEE:
			return attendee != null && !attendee.isEmpty();
		case ICalPackage.COMPONENT_ALARM_EMAIL_PROPERTY__DESCRIPTION:
			return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
		case ICalPackage.COMPONENT_ALARM_EMAIL_PROPERTY__ATTACH:
			return attach != null && !attach.isEmpty();
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
		result.append(" (attendee: ");
		result.append(attendee);
		result.append(", description: ");
		result.append(description);
		result.append(", attach: ");
		result.append(attach);
		result.append(')');
		return result.toString();
	}

} //ComponentAlarmEmailPropertyImpl
