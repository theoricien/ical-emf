/**
 */
package iCal.impl;

import iCal.ICalPackage;
import iCal.TimeZoneC;
import iCal.tzprop;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Time Zone C</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iCal.impl.TimeZoneCImpl#getTzid <em>Tzid</em>}</li>
 *   <li>{@link iCal.impl.TimeZoneCImpl#getLast_mod <em>Last mod</em>}</li>
 *   <li>{@link iCal.impl.TimeZoneCImpl#getTzurl <em>Tzurl</em>}</li>
 *   <li>{@link iCal.impl.TimeZoneCImpl#getStandardc <em>Standardc</em>}</li>
 *   <li>{@link iCal.impl.TimeZoneCImpl#getDaylightc <em>Daylightc</em>}</li>
 *   <li>{@link iCal.impl.TimeZoneCImpl#getX_prop <em>Xprop</em>}</li>
 *   <li>{@link iCal.impl.TimeZoneCImpl#getIana_prop <em>Iana prop</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TimeZoneCImpl extends ComponentImpl implements TimeZoneC {
	/**
	 * The default value of the '{@link #getTzid() <em>Tzid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTzid()
	 * @generated
	 * @ordered
	 */
	protected static final String TZID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTzid() <em>Tzid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTzid()
	 * @generated
	 * @ordered
	 */
	protected String tzid = TZID_EDEFAULT;

	/**
	 * The default value of the '{@link #getLast_mod() <em>Last mod</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLast_mod()
	 * @generated
	 * @ordered
	 */
	protected static final String LAST_MOD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLast_mod() <em>Last mod</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLast_mod()
	 * @generated
	 * @ordered
	 */
	protected String last_mod = LAST_MOD_EDEFAULT;

	/**
	 * The default value of the '{@link #getTzurl() <em>Tzurl</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTzurl()
	 * @generated
	 * @ordered
	 */
	protected static final String TZURL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTzurl() <em>Tzurl</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTzurl()
	 * @generated
	 * @ordered
	 */
	protected String tzurl = TZURL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStandardc() <em>Standardc</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStandardc()
	 * @generated
	 * @ordered
	 */
	protected EList<tzprop> standardc;

	/**
	 * The cached value of the '{@link #getDaylightc() <em>Daylightc</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDaylightc()
	 * @generated
	 * @ordered
	 */
	protected EList<tzprop> daylightc;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimeZoneCImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ICalPackage.Literals.TIME_ZONE_C;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTzid() {
		return tzid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTzid(String newTzid) {
		String oldTzid = tzid;
		tzid = newTzid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ICalPackage.TIME_ZONE_C__TZID, oldTzid, tzid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLast_mod() {
		return last_mod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLast_mod(String newLast_mod) {
		String oldLast_mod = last_mod;
		last_mod = newLast_mod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ICalPackage.TIME_ZONE_C__LAST_MOD, oldLast_mod,
					last_mod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTzurl() {
		return tzurl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTzurl(String newTzurl) {
		String oldTzurl = tzurl;
		tzurl = newTzurl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ICalPackage.TIME_ZONE_C__TZURL, oldTzurl, tzurl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<tzprop> getStandardc() {
		if (standardc == null) {
			standardc = new EObjectContainmentEList<tzprop>(tzprop.class, this, ICalPackage.TIME_ZONE_C__STANDARDC);
		}
		return standardc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<tzprop> getDaylightc() {
		if (daylightc == null) {
			daylightc = new EObjectContainmentEList<tzprop>(tzprop.class, this, ICalPackage.TIME_ZONE_C__DAYLIGHTC);
		}
		return daylightc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getX_prop() {
		if (x_prop == null) {
			x_prop = new EDataTypeUniqueEList<String>(String.class, this, ICalPackage.TIME_ZONE_C__XPROP);
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
			iana_prop = new EDataTypeUniqueEList<String>(String.class, this, ICalPackage.TIME_ZONE_C__IANA_PROP);
		}
		return iana_prop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ICalPackage.TIME_ZONE_C__STANDARDC:
			return ((InternalEList<?>) getStandardc()).basicRemove(otherEnd, msgs);
		case ICalPackage.TIME_ZONE_C__DAYLIGHTC:
			return ((InternalEList<?>) getDaylightc()).basicRemove(otherEnd, msgs);
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
		case ICalPackage.TIME_ZONE_C__TZID:
			return getTzid();
		case ICalPackage.TIME_ZONE_C__LAST_MOD:
			return getLast_mod();
		case ICalPackage.TIME_ZONE_C__TZURL:
			return getTzurl();
		case ICalPackage.TIME_ZONE_C__STANDARDC:
			return getStandardc();
		case ICalPackage.TIME_ZONE_C__DAYLIGHTC:
			return getDaylightc();
		case ICalPackage.TIME_ZONE_C__XPROP:
			return getX_prop();
		case ICalPackage.TIME_ZONE_C__IANA_PROP:
			return getIana_prop();
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
		case ICalPackage.TIME_ZONE_C__TZID:
			setTzid((String) newValue);
			return;
		case ICalPackage.TIME_ZONE_C__LAST_MOD:
			setLast_mod((String) newValue);
			return;
		case ICalPackage.TIME_ZONE_C__TZURL:
			setTzurl((String) newValue);
			return;
		case ICalPackage.TIME_ZONE_C__STANDARDC:
			getStandardc().clear();
			getStandardc().addAll((Collection<? extends tzprop>) newValue);
			return;
		case ICalPackage.TIME_ZONE_C__DAYLIGHTC:
			getDaylightc().clear();
			getDaylightc().addAll((Collection<? extends tzprop>) newValue);
			return;
		case ICalPackage.TIME_ZONE_C__XPROP:
			getX_prop().clear();
			getX_prop().addAll((Collection<? extends String>) newValue);
			return;
		case ICalPackage.TIME_ZONE_C__IANA_PROP:
			getIana_prop().clear();
			getIana_prop().addAll((Collection<? extends String>) newValue);
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
		case ICalPackage.TIME_ZONE_C__TZID:
			setTzid(TZID_EDEFAULT);
			return;
		case ICalPackage.TIME_ZONE_C__LAST_MOD:
			setLast_mod(LAST_MOD_EDEFAULT);
			return;
		case ICalPackage.TIME_ZONE_C__TZURL:
			setTzurl(TZURL_EDEFAULT);
			return;
		case ICalPackage.TIME_ZONE_C__STANDARDC:
			getStandardc().clear();
			return;
		case ICalPackage.TIME_ZONE_C__DAYLIGHTC:
			getDaylightc().clear();
			return;
		case ICalPackage.TIME_ZONE_C__XPROP:
			getX_prop().clear();
			return;
		case ICalPackage.TIME_ZONE_C__IANA_PROP:
			getIana_prop().clear();
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
		case ICalPackage.TIME_ZONE_C__TZID:
			return TZID_EDEFAULT == null ? tzid != null : !TZID_EDEFAULT.equals(tzid);
		case ICalPackage.TIME_ZONE_C__LAST_MOD:
			return LAST_MOD_EDEFAULT == null ? last_mod != null : !LAST_MOD_EDEFAULT.equals(last_mod);
		case ICalPackage.TIME_ZONE_C__TZURL:
			return TZURL_EDEFAULT == null ? tzurl != null : !TZURL_EDEFAULT.equals(tzurl);
		case ICalPackage.TIME_ZONE_C__STANDARDC:
			return standardc != null && !standardc.isEmpty();
		case ICalPackage.TIME_ZONE_C__DAYLIGHTC:
			return daylightc != null && !daylightc.isEmpty();
		case ICalPackage.TIME_ZONE_C__XPROP:
			return x_prop != null && !x_prop.isEmpty();
		case ICalPackage.TIME_ZONE_C__IANA_PROP:
			return iana_prop != null && !iana_prop.isEmpty();
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
		result.append(" (tzid: ");
		result.append(tzid);
		result.append(", last_mod: ");
		result.append(last_mod);
		result.append(", tzurl: ");
		result.append(tzurl);
		result.append(", x_prop: ");
		result.append(x_prop);
		result.append(", iana_prop: ");
		result.append(iana_prop);
		result.append(')');
		return result.toString();
	}

} //TimeZoneCImpl
