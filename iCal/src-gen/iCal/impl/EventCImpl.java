/**
 */
package iCal.impl;

import iCal.AlarmC;
import iCal.EventC;
import iCal.ICalPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Event C</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iCal.impl.EventCImpl#getTransp <em>Transp</em>}</li>
 *   <li>{@link iCal.impl.EventCImpl#getPriority <em>Priority</em>}</li>
 *   <li>{@link iCal.impl.EventCImpl#getGeo <em>Geo</em>}</li>
 *   <li>{@link iCal.impl.EventCImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link iCal.impl.EventCImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link iCal.impl.EventCImpl#getAlarmc <em>Alarmc</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EventCImpl extends ComponentActionImpl implements EventC {
	/**
	 * The default value of the '{@link #getTransp() <em>Transp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransp()
	 * @generated
	 * @ordered
	 */
	protected static final String TRANSP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTransp() <em>Transp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransp()
	 * @generated
	 * @ordered
	 */
	protected String transp = TRANSP_EDEFAULT;

	/**
	 * The default value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected static final String PRIORITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected String priority = PRIORITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getGeo() <em>Geo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeo()
	 * @generated
	 * @ordered
	 */
	protected static final String GEO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGeo() <em>Geo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeo()
	 * @generated
	 * @ordered
	 */
	protected String geo = GEO_EDEFAULT;

	/**
	 * The default value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected String location = LOCATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected static final String DURATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected String duration = DURATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAlarmc() <em>Alarmc</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlarmc()
	 * @generated
	 * @ordered
	 */
	protected EList<AlarmC> alarmc;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventCImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ICalPackage.Literals.EVENT_C;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTransp() {
		return transp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTransp(String newTransp) {
		String oldTransp = transp;
		transp = newTransp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ICalPackage.EVENT_C__TRANSP, oldTransp, transp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPriority() {
		return priority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPriority(String newPriority) {
		String oldPriority = priority;
		priority = newPriority;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ICalPackage.EVENT_C__PRIORITY, oldPriority,
					priority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getGeo() {
		return geo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGeo(String newGeo) {
		String oldGeo = geo;
		geo = newGeo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ICalPackage.EVENT_C__GEO, oldGeo, geo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLocation(String newLocation) {
		String oldLocation = location;
		location = newLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ICalPackage.EVENT_C__LOCATION, oldLocation,
					location));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDuration() {
		return duration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDuration(String newDuration) {
		String oldDuration = duration;
		duration = newDuration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ICalPackage.EVENT_C__DURATION, oldDuration,
					duration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AlarmC> getAlarmc() {
		if (alarmc == null) {
			alarmc = new EObjectContainmentEList<AlarmC>(AlarmC.class, this, ICalPackage.EVENT_C__ALARMC);
		}
		return alarmc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ICalPackage.EVENT_C__ALARMC:
			return ((InternalEList<?>) getAlarmc()).basicRemove(otherEnd, msgs);
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
		case ICalPackage.EVENT_C__TRANSP:
			return getTransp();
		case ICalPackage.EVENT_C__PRIORITY:
			return getPriority();
		case ICalPackage.EVENT_C__GEO:
			return getGeo();
		case ICalPackage.EVENT_C__LOCATION:
			return getLocation();
		case ICalPackage.EVENT_C__DURATION:
			return getDuration();
		case ICalPackage.EVENT_C__ALARMC:
			return getAlarmc();
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
		case ICalPackage.EVENT_C__TRANSP:
			setTransp((String) newValue);
			return;
		case ICalPackage.EVENT_C__PRIORITY:
			setPriority((String) newValue);
			return;
		case ICalPackage.EVENT_C__GEO:
			setGeo((String) newValue);
			return;
		case ICalPackage.EVENT_C__LOCATION:
			setLocation((String) newValue);
			return;
		case ICalPackage.EVENT_C__DURATION:
			setDuration((String) newValue);
			return;
		case ICalPackage.EVENT_C__ALARMC:
			getAlarmc().clear();
			getAlarmc().addAll((Collection<? extends AlarmC>) newValue);
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
		case ICalPackage.EVENT_C__TRANSP:
			setTransp(TRANSP_EDEFAULT);
			return;
		case ICalPackage.EVENT_C__PRIORITY:
			setPriority(PRIORITY_EDEFAULT);
			return;
		case ICalPackage.EVENT_C__GEO:
			setGeo(GEO_EDEFAULT);
			return;
		case ICalPackage.EVENT_C__LOCATION:
			setLocation(LOCATION_EDEFAULT);
			return;
		case ICalPackage.EVENT_C__DURATION:
			setDuration(DURATION_EDEFAULT);
			return;
		case ICalPackage.EVENT_C__ALARMC:
			getAlarmc().clear();
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
		case ICalPackage.EVENT_C__TRANSP:
			return TRANSP_EDEFAULT == null ? transp != null : !TRANSP_EDEFAULT.equals(transp);
		case ICalPackage.EVENT_C__PRIORITY:
			return PRIORITY_EDEFAULT == null ? priority != null : !PRIORITY_EDEFAULT.equals(priority);
		case ICalPackage.EVENT_C__GEO:
			return GEO_EDEFAULT == null ? geo != null : !GEO_EDEFAULT.equals(geo);
		case ICalPackage.EVENT_C__LOCATION:
			return LOCATION_EDEFAULT == null ? location != null : !LOCATION_EDEFAULT.equals(location);
		case ICalPackage.EVENT_C__DURATION:
			return DURATION_EDEFAULT == null ? duration != null : !DURATION_EDEFAULT.equals(duration);
		case ICalPackage.EVENT_C__ALARMC:
			return alarmc != null && !alarmc.isEmpty();
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
		result.append(" (transp: ");
		result.append(transp);
		result.append(", priority: ");
		result.append(priority);
		result.append(", geo: ");
		result.append(geo);
		result.append(", location: ");
		result.append(location);
		result.append(", duration: ");
		result.append(duration);
		result.append(')');
		return result.toString();
	}

} //EventCImpl
