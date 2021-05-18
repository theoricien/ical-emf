/**
 */
package iCal.impl;

import iCal.ICalPackage;
import iCal.VacationC;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vacation C</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iCal.impl.VacationCImpl#getDtstart <em>Dtstart</em>}</li>
 *   <li>{@link iCal.impl.VacationCImpl#getOrganizer <em>Organizer</em>}</li>
 *   <li>{@link iCal.impl.VacationCImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link iCal.impl.VacationCImpl#getContact <em>Contact</em>}</li>
 *   <li>{@link iCal.impl.VacationCImpl#getDtend <em>Dtend</em>}</li>
 *   <li>{@link iCal.impl.VacationCImpl#getAttendee <em>Attendee</em>}</li>
 *   <li>{@link iCal.impl.VacationCImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link iCal.impl.VacationCImpl#getFreebusy <em>Freebusy</em>}</li>
 *   <li>{@link iCal.impl.VacationCImpl#getRstatus <em>Rstatus</em>}</li>
 *   <li>{@link iCal.impl.VacationCImpl#getX_prop <em>Xprop</em>}</li>
 *   <li>{@link iCal.impl.VacationCImpl#getIana_prop <em>Iana prop</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VacationCImpl extends ComponentRequiredImpl implements VacationC {
	/**
	 * The default value of the '{@link #getDtstart() <em>Dtstart</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDtstart()
	 * @generated
	 * @ordered
	 */
	protected static final String DTSTART_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDtstart() <em>Dtstart</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDtstart()
	 * @generated
	 * @ordered
	 */
	protected String dtstart = DTSTART_EDEFAULT;

	/**
	 * The default value of the '{@link #getOrganizer() <em>Organizer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganizer()
	 * @generated
	 * @ordered
	 */
	protected static final String ORGANIZER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOrganizer() <em>Organizer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganizer()
	 * @generated
	 * @ordered
	 */
	protected String organizer = ORGANIZER_EDEFAULT;

	/**
	 * The default value of the '{@link #getUrl() <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUrl() <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected String url = URL_EDEFAULT;

	/**
	 * The default value of the '{@link #getContact() <em>Contact</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContact()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTACT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContact() <em>Contact</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContact()
	 * @generated
	 * @ordered
	 */
	protected String contact = CONTACT_EDEFAULT;

	/**
	 * The default value of the '{@link #getDtend() <em>Dtend</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDtend()
	 * @generated
	 * @ordered
	 */
	protected static final String DTEND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDtend() <em>Dtend</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDtend()
	 * @generated
	 * @ordered
	 */
	protected String dtend = DTEND_EDEFAULT;

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
	 * The cached value of the '{@link #getComment() <em>Comment</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected EList<String> comment;

	/**
	 * The cached value of the '{@link #getFreebusy() <em>Freebusy</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFreebusy()
	 * @generated
	 * @ordered
	 */
	protected EList<String> freebusy;

	/**
	 * The cached value of the '{@link #getRstatus() <em>Rstatus</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRstatus()
	 * @generated
	 * @ordered
	 */
	protected EList<String> rstatus;

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
	protected VacationCImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ICalPackage.Literals.VACATION_C;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDtstart() {
		return dtstart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDtstart(String newDtstart) {
		String oldDtstart = dtstart;
		dtstart = newDtstart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ICalPackage.VACATION_C__DTSTART, oldDtstart,
					dtstart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOrganizer() {
		return organizer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrganizer(String newOrganizer) {
		String oldOrganizer = organizer;
		organizer = newOrganizer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ICalPackage.VACATION_C__ORGANIZER, oldOrganizer,
					organizer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUrl() {
		return url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUrl(String newUrl) {
		String oldUrl = url;
		url = newUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ICalPackage.VACATION_C__URL, oldUrl, url));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getContact() {
		return contact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContact(String newContact) {
		String oldContact = contact;
		contact = newContact;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ICalPackage.VACATION_C__CONTACT, oldContact,
					contact));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDtend() {
		return dtend;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDtend(String newDtend) {
		String oldDtend = dtend;
		dtend = newDtend;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ICalPackage.VACATION_C__DTEND, oldDtend, dtend));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getAttendee() {
		if (attendee == null) {
			attendee = new EDataTypeUniqueEList<String>(String.class, this, ICalPackage.VACATION_C__ATTENDEE);
		}
		return attendee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getComment() {
		if (comment == null) {
			comment = new EDataTypeUniqueEList<String>(String.class, this, ICalPackage.VACATION_C__COMMENT);
		}
		return comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getFreebusy() {
		if (freebusy == null) {
			freebusy = new EDataTypeUniqueEList<String>(String.class, this, ICalPackage.VACATION_C__FREEBUSY);
		}
		return freebusy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getRstatus() {
		if (rstatus == null) {
			rstatus = new EDataTypeUniqueEList<String>(String.class, this, ICalPackage.VACATION_C__RSTATUS);
		}
		return rstatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getX_prop() {
		if (x_prop == null) {
			x_prop = new EDataTypeUniqueEList<String>(String.class, this, ICalPackage.VACATION_C__XPROP);
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
			iana_prop = new EDataTypeUniqueEList<String>(String.class, this, ICalPackage.VACATION_C__IANA_PROP);
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
		case ICalPackage.VACATION_C__DTSTART:
			return getDtstart();
		case ICalPackage.VACATION_C__ORGANIZER:
			return getOrganizer();
		case ICalPackage.VACATION_C__URL:
			return getUrl();
		case ICalPackage.VACATION_C__CONTACT:
			return getContact();
		case ICalPackage.VACATION_C__DTEND:
			return getDtend();
		case ICalPackage.VACATION_C__ATTENDEE:
			return getAttendee();
		case ICalPackage.VACATION_C__COMMENT:
			return getComment();
		case ICalPackage.VACATION_C__FREEBUSY:
			return getFreebusy();
		case ICalPackage.VACATION_C__RSTATUS:
			return getRstatus();
		case ICalPackage.VACATION_C__XPROP:
			return getX_prop();
		case ICalPackage.VACATION_C__IANA_PROP:
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
		case ICalPackage.VACATION_C__DTSTART:
			setDtstart((String) newValue);
			return;
		case ICalPackage.VACATION_C__ORGANIZER:
			setOrganizer((String) newValue);
			return;
		case ICalPackage.VACATION_C__URL:
			setUrl((String) newValue);
			return;
		case ICalPackage.VACATION_C__CONTACT:
			setContact((String) newValue);
			return;
		case ICalPackage.VACATION_C__DTEND:
			setDtend((String) newValue);
			return;
		case ICalPackage.VACATION_C__ATTENDEE:
			getAttendee().clear();
			getAttendee().addAll((Collection<? extends String>) newValue);
			return;
		case ICalPackage.VACATION_C__COMMENT:
			getComment().clear();
			getComment().addAll((Collection<? extends String>) newValue);
			return;
		case ICalPackage.VACATION_C__FREEBUSY:
			getFreebusy().clear();
			getFreebusy().addAll((Collection<? extends String>) newValue);
			return;
		case ICalPackage.VACATION_C__RSTATUS:
			getRstatus().clear();
			getRstatus().addAll((Collection<? extends String>) newValue);
			return;
		case ICalPackage.VACATION_C__XPROP:
			getX_prop().clear();
			getX_prop().addAll((Collection<? extends String>) newValue);
			return;
		case ICalPackage.VACATION_C__IANA_PROP:
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
		case ICalPackage.VACATION_C__DTSTART:
			setDtstart(DTSTART_EDEFAULT);
			return;
		case ICalPackage.VACATION_C__ORGANIZER:
			setOrganizer(ORGANIZER_EDEFAULT);
			return;
		case ICalPackage.VACATION_C__URL:
			setUrl(URL_EDEFAULT);
			return;
		case ICalPackage.VACATION_C__CONTACT:
			setContact(CONTACT_EDEFAULT);
			return;
		case ICalPackage.VACATION_C__DTEND:
			setDtend(DTEND_EDEFAULT);
			return;
		case ICalPackage.VACATION_C__ATTENDEE:
			getAttendee().clear();
			return;
		case ICalPackage.VACATION_C__COMMENT:
			getComment().clear();
			return;
		case ICalPackage.VACATION_C__FREEBUSY:
			getFreebusy().clear();
			return;
		case ICalPackage.VACATION_C__RSTATUS:
			getRstatus().clear();
			return;
		case ICalPackage.VACATION_C__XPROP:
			getX_prop().clear();
			return;
		case ICalPackage.VACATION_C__IANA_PROP:
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
		case ICalPackage.VACATION_C__DTSTART:
			return DTSTART_EDEFAULT == null ? dtstart != null : !DTSTART_EDEFAULT.equals(dtstart);
		case ICalPackage.VACATION_C__ORGANIZER:
			return ORGANIZER_EDEFAULT == null ? organizer != null : !ORGANIZER_EDEFAULT.equals(organizer);
		case ICalPackage.VACATION_C__URL:
			return URL_EDEFAULT == null ? url != null : !URL_EDEFAULT.equals(url);
		case ICalPackage.VACATION_C__CONTACT:
			return CONTACT_EDEFAULT == null ? contact != null : !CONTACT_EDEFAULT.equals(contact);
		case ICalPackage.VACATION_C__DTEND:
			return DTEND_EDEFAULT == null ? dtend != null : !DTEND_EDEFAULT.equals(dtend);
		case ICalPackage.VACATION_C__ATTENDEE:
			return attendee != null && !attendee.isEmpty();
		case ICalPackage.VACATION_C__COMMENT:
			return comment != null && !comment.isEmpty();
		case ICalPackage.VACATION_C__FREEBUSY:
			return freebusy != null && !freebusy.isEmpty();
		case ICalPackage.VACATION_C__RSTATUS:
			return rstatus != null && !rstatus.isEmpty();
		case ICalPackage.VACATION_C__XPROP:
			return x_prop != null && !x_prop.isEmpty();
		case ICalPackage.VACATION_C__IANA_PROP:
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
		result.append(" (dtstart: ");
		result.append(dtstart);
		result.append(", organizer: ");
		result.append(organizer);
		result.append(", url: ");
		result.append(url);
		result.append(", contact: ");
		result.append(contact);
		result.append(", dtend: ");
		result.append(dtend);
		result.append(", attendee: ");
		result.append(attendee);
		result.append(", comment: ");
		result.append(comment);
		result.append(", freebusy: ");
		result.append(freebusy);
		result.append(", rstatus: ");
		result.append(rstatus);
		result.append(", x_prop: ");
		result.append(x_prop);
		result.append(", iana_prop: ");
		result.append(iana_prop);
		result.append(')');
		return result.toString();
	}

} //VacationCImpl
