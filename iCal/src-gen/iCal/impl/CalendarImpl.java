/**
 */
package iCal.impl;

import iCal.Calendar;
import iCal.ICalPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Calendar</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iCal.impl.CalendarImpl#getProdid <em>Prodid</em>}</li>
 *   <li>{@link iCal.impl.CalendarImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link iCal.impl.CalendarImpl#getCalscale <em>Calscale</em>}</li>
 *   <li>{@link iCal.impl.CalendarImpl#getMethod <em>Method</em>}</li>
 *   <li>{@link iCal.impl.CalendarImpl#getX_prop <em>Xprop</em>}</li>
 *   <li>{@link iCal.impl.CalendarImpl#getIana_prop <em>Iana prop</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CalendarImpl extends ComponentImpl implements Calendar {
	/**
	 * The default value of the '{@link #getProdid() <em>Prodid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProdid()
	 * @generated
	 * @ordered
	 */
	protected static final String PRODID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProdid() <em>Prodid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProdid()
	 * @generated
	 * @ordered
	 */
	protected String prodid = PRODID_EDEFAULT;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getCalscale() <em>Calscale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalscale()
	 * @generated
	 * @ordered
	 */
	protected static final String CALSCALE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCalscale() <em>Calscale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalscale()
	 * @generated
	 * @ordered
	 */
	protected String calscale = CALSCALE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMethod() <em>Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethod()
	 * @generated
	 * @ordered
	 */
	protected static final String METHOD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMethod() <em>Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethod()
	 * @generated
	 * @ordered
	 */
	protected String method = METHOD_EDEFAULT;

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
	protected CalendarImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ICalPackage.Literals.CALENDAR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProdid() {
		return prodid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProdid(String newProdid) {
		String oldProdid = prodid;
		prodid = newProdid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ICalPackage.CALENDAR__PRODID, oldProdid, prodid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ICalPackage.CALENDAR__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCalscale() {
		return calscale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCalscale(String newCalscale) {
		String oldCalscale = calscale;
		calscale = newCalscale;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ICalPackage.CALENDAR__CALSCALE, oldCalscale,
					calscale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMethod() {
		return method;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMethod(String newMethod) {
		String oldMethod = method;
		method = newMethod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ICalPackage.CALENDAR__METHOD, oldMethod, method));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getX_prop() {
		if (x_prop == null) {
			x_prop = new EDataTypeUniqueEList<String>(String.class, this, ICalPackage.CALENDAR__XPROP);
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
			iana_prop = new EDataTypeUniqueEList<String>(String.class, this, ICalPackage.CALENDAR__IANA_PROP);
		}
		return iana_prop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ICalPackage.CALENDAR__PRODID:
			return getProdid();
		case ICalPackage.CALENDAR__VERSION:
			return getVersion();
		case ICalPackage.CALENDAR__CALSCALE:
			return getCalscale();
		case ICalPackage.CALENDAR__METHOD:
			return getMethod();
		case ICalPackage.CALENDAR__XPROP:
			return getX_prop();
		case ICalPackage.CALENDAR__IANA_PROP:
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
		case ICalPackage.CALENDAR__PRODID:
			setProdid((String) newValue);
			return;
		case ICalPackage.CALENDAR__VERSION:
			setVersion((String) newValue);
			return;
		case ICalPackage.CALENDAR__CALSCALE:
			setCalscale((String) newValue);
			return;
		case ICalPackage.CALENDAR__METHOD:
			setMethod((String) newValue);
			return;
		case ICalPackage.CALENDAR__XPROP:
			getX_prop().clear();
			getX_prop().addAll((Collection<? extends String>) newValue);
			return;
		case ICalPackage.CALENDAR__IANA_PROP:
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
		case ICalPackage.CALENDAR__PRODID:
			setProdid(PRODID_EDEFAULT);
			return;
		case ICalPackage.CALENDAR__VERSION:
			setVersion(VERSION_EDEFAULT);
			return;
		case ICalPackage.CALENDAR__CALSCALE:
			setCalscale(CALSCALE_EDEFAULT);
			return;
		case ICalPackage.CALENDAR__METHOD:
			setMethod(METHOD_EDEFAULT);
			return;
		case ICalPackage.CALENDAR__XPROP:
			getX_prop().clear();
			return;
		case ICalPackage.CALENDAR__IANA_PROP:
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
		case ICalPackage.CALENDAR__PRODID:
			return PRODID_EDEFAULT == null ? prodid != null : !PRODID_EDEFAULT.equals(prodid);
		case ICalPackage.CALENDAR__VERSION:
			return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
		case ICalPackage.CALENDAR__CALSCALE:
			return CALSCALE_EDEFAULT == null ? calscale != null : !CALSCALE_EDEFAULT.equals(calscale);
		case ICalPackage.CALENDAR__METHOD:
			return METHOD_EDEFAULT == null ? method != null : !METHOD_EDEFAULT.equals(method);
		case ICalPackage.CALENDAR__XPROP:
			return x_prop != null && !x_prop.isEmpty();
		case ICalPackage.CALENDAR__IANA_PROP:
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
		result.append(" (prodid: ");
		result.append(prodid);
		result.append(", version: ");
		result.append(version);
		result.append(", calscale: ");
		result.append(calscale);
		result.append(", method: ");
		result.append(method);
		result.append(", x_prop: ");
		result.append(x_prop);
		result.append(", iana_prop: ");
		result.append(iana_prop);
		result.append(')');
		return result.toString();
	}

} //CalendarImpl
