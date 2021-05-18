/**
 */
package iCal.impl;

import iCal.AlarmC;
import iCal.AlarmType;
import iCal.ComponentAlarmTime;
import iCal.ICalPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Alarm C</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iCal.impl.AlarmCImpl#getAction <em>Action</em>}</li>
 *   <li>{@link iCal.impl.AlarmCImpl#getTrigger <em>Trigger</em>}</li>
 *   <li>{@link iCal.impl.AlarmCImpl#getX_prop <em>Xprop</em>}</li>
 *   <li>{@link iCal.impl.AlarmCImpl#getIana_prop <em>Iana prop</em>}</li>
 *   <li>{@link iCal.impl.AlarmCImpl#getAttach <em>Attach</em>}</li>
 *   <li>{@link iCal.impl.AlarmCImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link iCal.impl.AlarmCImpl#getType <em>Type</em>}</li>
 *   <li>{@link iCal.impl.AlarmCImpl#getTime <em>Time</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AlarmCImpl extends ComponentImpl implements AlarmC {
	/**
	 * The default value of the '{@link #getAction() <em>Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected static final String ACTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAction() <em>Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected String action = ACTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getTrigger() <em>Trigger</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrigger()
	 * @generated
	 * @ordered
	 */
	protected static final String TRIGGER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTrigger() <em>Trigger</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrigger()
	 * @generated
	 * @ordered
	 */
	protected String trigger = TRIGGER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getX_prop() <em>Xprop</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX_prop()
	 * @generated
	 * @ordered
	 */
	protected EList<String> x_prop;

	/**
	 * The cached value of the '{@link #getIana_prop() <em>Iana prop</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIana_prop()
	 * @generated
	 * @ordered
	 */
	protected EList<String> iana_prop;

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
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected AlarmType type;

	/**
	 * The cached value of the '{@link #getTime() <em>Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime()
	 * @generated
	 * @ordered
	 */
	protected ComponentAlarmTime time;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AlarmCImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ICalPackage.Literals.ALARM_C;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAction() {
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAction(String newAction) {
		String oldAction = action;
		action = newAction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ICalPackage.ALARM_C__ACTION, oldAction, action));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTrigger() {
		return trigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTrigger(String newTrigger) {
		String oldTrigger = trigger;
		trigger = newTrigger;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ICalPackage.ALARM_C__TRIGGER, oldTrigger, trigger));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getX_prop() {
		if (x_prop == null) {
			x_prop = new EDataTypeUniqueEList<String>(String.class, this, ICalPackage.ALARM_C__XPROP);
		}
		return x_prop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getIana_prop() {
		if (iana_prop == null) {
			iana_prop = new EDataTypeUniqueEList<String>(String.class, this, ICalPackage.ALARM_C__IANA_PROP);
		}
		return iana_prop;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ICalPackage.ALARM_C__ATTACH, oldAttach, attach));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ICalPackage.ALARM_C__DESCRIPTION, oldDescription,
					description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AlarmType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(AlarmType newType, NotificationChain msgs) {
		AlarmType oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ICalPackage.ALARM_C__TYPE,
					oldType, newType);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(AlarmType newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject) type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ICalPackage.ALARM_C__TYPE,
						null, msgs);
			if (newType != null)
				msgs = ((InternalEObject) newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ICalPackage.ALARM_C__TYPE,
						null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ICalPackage.ALARM_C__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComponentAlarmTime getTime() {
		return time;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTime(ComponentAlarmTime newTime, NotificationChain msgs) {
		ComponentAlarmTime oldTime = time;
		time = newTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ICalPackage.ALARM_C__TIME,
					oldTime, newTime);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTime(ComponentAlarmTime newTime) {
		if (newTime != time) {
			NotificationChain msgs = null;
			if (time != null)
				msgs = ((InternalEObject) time).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ICalPackage.ALARM_C__TIME,
						null, msgs);
			if (newTime != null)
				msgs = ((InternalEObject) newTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ICalPackage.ALARM_C__TIME,
						null, msgs);
			msgs = basicSetTime(newTime, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ICalPackage.ALARM_C__TIME, newTime, newTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ICalPackage.ALARM_C__TYPE:
			return basicSetType(null, msgs);
		case ICalPackage.ALARM_C__TIME:
			return basicSetTime(null, msgs);
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
		case ICalPackage.ALARM_C__ACTION:
			return getAction();
		case ICalPackage.ALARM_C__TRIGGER:
			return getTrigger();
		case ICalPackage.ALARM_C__XPROP:
			return getX_prop();
		case ICalPackage.ALARM_C__IANA_PROP:
			return getIana_prop();
		case ICalPackage.ALARM_C__ATTACH:
			return getAttach();
		case ICalPackage.ALARM_C__DESCRIPTION:
			return getDescription();
		case ICalPackage.ALARM_C__TYPE:
			return getType();
		case ICalPackage.ALARM_C__TIME:
			return getTime();
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
		case ICalPackage.ALARM_C__ACTION:
			setAction((String) newValue);
			return;
		case ICalPackage.ALARM_C__TRIGGER:
			setTrigger((String) newValue);
			return;
		case ICalPackage.ALARM_C__XPROP:
			getX_prop().clear();
			getX_prop().addAll((Collection<? extends String>) newValue);
			return;
		case ICalPackage.ALARM_C__IANA_PROP:
			getIana_prop().clear();
			getIana_prop().addAll((Collection<? extends String>) newValue);
			return;
		case ICalPackage.ALARM_C__ATTACH:
			setAttach((String) newValue);
			return;
		case ICalPackage.ALARM_C__DESCRIPTION:
			setDescription((String) newValue);
			return;
		case ICalPackage.ALARM_C__TYPE:
			setType((AlarmType) newValue);
			return;
		case ICalPackage.ALARM_C__TIME:
			setTime((ComponentAlarmTime) newValue);
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
		case ICalPackage.ALARM_C__ACTION:
			setAction(ACTION_EDEFAULT);
			return;
		case ICalPackage.ALARM_C__TRIGGER:
			setTrigger(TRIGGER_EDEFAULT);
			return;
		case ICalPackage.ALARM_C__XPROP:
			getX_prop().clear();
			return;
		case ICalPackage.ALARM_C__IANA_PROP:
			getIana_prop().clear();
			return;
		case ICalPackage.ALARM_C__ATTACH:
			setAttach(ATTACH_EDEFAULT);
			return;
		case ICalPackage.ALARM_C__DESCRIPTION:
			setDescription(DESCRIPTION_EDEFAULT);
			return;
		case ICalPackage.ALARM_C__TYPE:
			setType((AlarmType) null);
			return;
		case ICalPackage.ALARM_C__TIME:
			setTime((ComponentAlarmTime) null);
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
		case ICalPackage.ALARM_C__ACTION:
			return ACTION_EDEFAULT == null ? action != null : !ACTION_EDEFAULT.equals(action);
		case ICalPackage.ALARM_C__TRIGGER:
			return TRIGGER_EDEFAULT == null ? trigger != null : !TRIGGER_EDEFAULT.equals(trigger);
		case ICalPackage.ALARM_C__XPROP:
			return x_prop != null && !x_prop.isEmpty();
		case ICalPackage.ALARM_C__IANA_PROP:
			return iana_prop != null && !iana_prop.isEmpty();
		case ICalPackage.ALARM_C__ATTACH:
			return ATTACH_EDEFAULT == null ? attach != null : !ATTACH_EDEFAULT.equals(attach);
		case ICalPackage.ALARM_C__DESCRIPTION:
			return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
		case ICalPackage.ALARM_C__TYPE:
			return type != null;
		case ICalPackage.ALARM_C__TIME:
			return time != null;
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
		result.append(" (action: ");
		result.append(action);
		result.append(", trigger: ");
		result.append(trigger);
		result.append(", x_prop: ");
		result.append(x_prop);
		result.append(", iana_prop: ");
		result.append(iana_prop);
		result.append(", attach: ");
		result.append(attach);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //AlarmCImpl
