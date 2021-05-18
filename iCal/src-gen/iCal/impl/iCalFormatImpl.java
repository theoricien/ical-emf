/**
 */
package iCal.impl;

import iCal.Calendar;
import iCal.ICalPackage;
import iCal.iCalFormat;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>iCal Format</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iCal.impl.iCalFormatImpl#getCalendar <em>Calendar</em>}</li>
 * </ul>
 *
 * @generated
 */
public class iCalFormatImpl extends MinimalEObjectImpl.Container implements iCalFormat {
	/**
	 * The cached value of the '{@link #getCalendar() <em>Calendar</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalendar()
	 * @generated
	 * @ordered
	 */
	protected Calendar calendar;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected iCalFormatImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ICalPackage.Literals.ICAL_FORMAT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Calendar getCalendar() {
		return calendar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCalendar(Calendar newCalendar, NotificationChain msgs) {
		Calendar oldCalendar = calendar;
		calendar = newCalendar;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ICalPackage.ICAL_FORMAT__CALENDAR, oldCalendar, newCalendar);
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
	public void setCalendar(Calendar newCalendar) {
		if (newCalendar != calendar) {
			NotificationChain msgs = null;
			if (calendar != null)
				msgs = ((InternalEObject) calendar).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ICalPackage.ICAL_FORMAT__CALENDAR, null, msgs);
			if (newCalendar != null)
				msgs = ((InternalEObject) newCalendar).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ICalPackage.ICAL_FORMAT__CALENDAR, null, msgs);
			msgs = basicSetCalendar(newCalendar, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ICalPackage.ICAL_FORMAT__CALENDAR, newCalendar,
					newCalendar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ICalPackage.ICAL_FORMAT__CALENDAR:
			return basicSetCalendar(null, msgs);
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
		case ICalPackage.ICAL_FORMAT__CALENDAR:
			return getCalendar();
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
		case ICalPackage.ICAL_FORMAT__CALENDAR:
			setCalendar((Calendar) newValue);
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
		case ICalPackage.ICAL_FORMAT__CALENDAR:
			setCalendar((Calendar) null);
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
		case ICalPackage.ICAL_FORMAT__CALENDAR:
			return calendar != null;
		}
		return super.eIsSet(featureID);
	}

} //iCalFormatImpl
