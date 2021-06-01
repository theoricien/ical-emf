/**
 */
package iCal.impl;

import iCal.AMonthT;
import iCal.DateT;
import iCal.ICalPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Date T</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iCal.impl.DateTImpl#getDay <em>Day</em>}</li>
 *   <li>{@link iCal.impl.DateTImpl#getDay_name <em>Day name</em>}</li>
 *   <li>{@link iCal.impl.DateTImpl#getMonth <em>Month</em>}</li>
 *   <li>{@link iCal.impl.DateTImpl#getYear <em>Year</em>}</li>
 *   <li>{@link iCal.impl.DateTImpl#getHours <em>Hours</em>}</li>
 *   <li>{@link iCal.impl.DateTImpl#getMinutes <em>Minutes</em>}</li>
 *   <li>{@link iCal.impl.DateTImpl#getSeconds <em>Seconds</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DateTImpl extends MinimalEObjectImpl.Container implements DateT {
	/**
	 * The default value of the '{@link #getDay() <em>Day</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDay()
	 * @generated
	 * @ordered
	 */
	protected static final Integer DAY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDay() <em>Day</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDay()
	 * @generated
	 * @ordered
	 */
	protected Integer day = DAY_EDEFAULT;

	/**
	 * The default value of the '{@link #getDay_name() <em>Day name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDay_name()
	 * @generated
	 * @ordered
	 */
	protected static final String DAY_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDay_name() <em>Day name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDay_name()
	 * @generated
	 * @ordered
	 */
	protected String day_name = DAY_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMonth() <em>Month</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMonth()
	 * @generated
	 * @ordered
	 */
	protected AMonthT month;

	/**
	 * The default value of the '{@link #getYear() <em>Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYear()
	 * @generated
	 * @ordered
	 */
	protected static final Integer YEAR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getYear() <em>Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYear()
	 * @generated
	 * @ordered
	 */
	protected Integer year = YEAR_EDEFAULT;

	/**
	 * The default value of the '{@link #getHours() <em>Hours</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHours()
	 * @generated
	 * @ordered
	 */
	protected static final Integer HOURS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHours() <em>Hours</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHours()
	 * @generated
	 * @ordered
	 */
	protected Integer hours = HOURS_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinutes() <em>Minutes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinutes()
	 * @generated
	 * @ordered
	 */
	protected static final Integer MINUTES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMinutes() <em>Minutes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinutes()
	 * @generated
	 * @ordered
	 */
	protected Integer minutes = MINUTES_EDEFAULT;

	/**
	 * The default value of the '{@link #getSeconds() <em>Seconds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeconds()
	 * @generated
	 * @ordered
	 */
	protected static final Integer SECONDS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSeconds() <em>Seconds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeconds()
	 * @generated
	 * @ordered
	 */
	protected Integer seconds = SECONDS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DateTImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ICalPackage.Literals.DATE_T;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getDay() {
		return day;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDay(Integer newDay) {
		Integer oldDay = day;
		day = newDay;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ICalPackage.DATE_T__DAY, oldDay, day));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDay_name() {
		return day_name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDay_name(String newDay_name) {
		String oldDay_name = day_name;
		day_name = newDay_name;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ICalPackage.DATE_T__DAY_NAME, oldDay_name, day_name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AMonthT getMonth() {
		return month;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMonth(AMonthT newMonth, NotificationChain msgs) {
		AMonthT oldMonth = month;
		month = newMonth;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ICalPackage.DATE_T__MONTH,
					oldMonth, newMonth);
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
	public void setMonth(AMonthT newMonth) {
		if (newMonth != month) {
			NotificationChain msgs = null;
			if (month != null)
				msgs = ((InternalEObject) month).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ICalPackage.DATE_T__MONTH, null, msgs);
			if (newMonth != null)
				msgs = ((InternalEObject) newMonth).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ICalPackage.DATE_T__MONTH, null, msgs);
			msgs = basicSetMonth(newMonth, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ICalPackage.DATE_T__MONTH, newMonth, newMonth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getYear() {
		return year;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setYear(Integer newYear) {
		Integer oldYear = year;
		year = newYear;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ICalPackage.DATE_T__YEAR, oldYear, year));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getHours() {
		return hours;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHours(Integer newHours) {
		Integer oldHours = hours;
		hours = newHours;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ICalPackage.DATE_T__HOURS, oldHours, hours));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getMinutes() {
		return minutes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMinutes(Integer newMinutes) {
		Integer oldMinutes = minutes;
		minutes = newMinutes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ICalPackage.DATE_T__MINUTES, oldMinutes, minutes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getSeconds() {
		return seconds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSeconds(Integer newSeconds) {
		Integer oldSeconds = seconds;
		seconds = newSeconds;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ICalPackage.DATE_T__SECONDS, oldSeconds, seconds));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ICalPackage.DATE_T__MONTH:
			return basicSetMonth(null, msgs);
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
		case ICalPackage.DATE_T__DAY:
			return getDay();
		case ICalPackage.DATE_T__DAY_NAME:
			return getDay_name();
		case ICalPackage.DATE_T__MONTH:
			return getMonth();
		case ICalPackage.DATE_T__YEAR:
			return getYear();
		case ICalPackage.DATE_T__HOURS:
			return getHours();
		case ICalPackage.DATE_T__MINUTES:
			return getMinutes();
		case ICalPackage.DATE_T__SECONDS:
			return getSeconds();
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
		case ICalPackage.DATE_T__DAY:
			setDay((Integer) newValue);
			return;
		case ICalPackage.DATE_T__DAY_NAME:
			setDay_name((String) newValue);
			return;
		case ICalPackage.DATE_T__MONTH:
			setMonth((AMonthT) newValue);
			return;
		case ICalPackage.DATE_T__YEAR:
			setYear((Integer) newValue);
			return;
		case ICalPackage.DATE_T__HOURS:
			setHours((Integer) newValue);
			return;
		case ICalPackage.DATE_T__MINUTES:
			setMinutes((Integer) newValue);
			return;
		case ICalPackage.DATE_T__SECONDS:
			setSeconds((Integer) newValue);
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
		case ICalPackage.DATE_T__DAY:
			setDay(DAY_EDEFAULT);
			return;
		case ICalPackage.DATE_T__DAY_NAME:
			setDay_name(DAY_NAME_EDEFAULT);
			return;
		case ICalPackage.DATE_T__MONTH:
			setMonth((AMonthT) null);
			return;
		case ICalPackage.DATE_T__YEAR:
			setYear(YEAR_EDEFAULT);
			return;
		case ICalPackage.DATE_T__HOURS:
			setHours(HOURS_EDEFAULT);
			return;
		case ICalPackage.DATE_T__MINUTES:
			setMinutes(MINUTES_EDEFAULT);
			return;
		case ICalPackage.DATE_T__SECONDS:
			setSeconds(SECONDS_EDEFAULT);
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
		case ICalPackage.DATE_T__DAY:
			return DAY_EDEFAULT == null ? day != null : !DAY_EDEFAULT.equals(day);
		case ICalPackage.DATE_T__DAY_NAME:
			return DAY_NAME_EDEFAULT == null ? day_name != null : !DAY_NAME_EDEFAULT.equals(day_name);
		case ICalPackage.DATE_T__MONTH:
			return month != null;
		case ICalPackage.DATE_T__YEAR:
			return YEAR_EDEFAULT == null ? year != null : !YEAR_EDEFAULT.equals(year);
		case ICalPackage.DATE_T__HOURS:
			return HOURS_EDEFAULT == null ? hours != null : !HOURS_EDEFAULT.equals(hours);
		case ICalPackage.DATE_T__MINUTES:
			return MINUTES_EDEFAULT == null ? minutes != null : !MINUTES_EDEFAULT.equals(minutes);
		case ICalPackage.DATE_T__SECONDS:
			return SECONDS_EDEFAULT == null ? seconds != null : !SECONDS_EDEFAULT.equals(seconds);
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
		result.append(" (day: ");
		result.append(day);
		result.append(", day_name: ");
		result.append(day_name);
		result.append(", year: ");
		result.append(year);
		result.append(", hours: ");
		result.append(hours);
		result.append(", minutes: ");
		result.append(minutes);
		result.append(", seconds: ");
		result.append(seconds);
		result.append(')');
		return result.toString();
	}

} //DateTImpl
