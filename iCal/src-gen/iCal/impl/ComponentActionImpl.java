/**
 */
package iCal.impl;

import iCal.ComponentAction;
import iCal.ICalPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iCal.impl.ComponentActionImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link iCal.impl.ComponentActionImpl#getCreated <em>Created</em>}</li>
 *   <li>{@link iCal.impl.ComponentActionImpl#getLast_mod <em>Last mod</em>}</li>
 *   <li>{@link iCal.impl.ComponentActionImpl#getOrganizer <em>Organizer</em>}</li>
 *   <li>{@link iCal.impl.ComponentActionImpl#getSeq <em>Seq</em>}</li>
 *   <li>{@link iCal.impl.ComponentActionImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link iCal.impl.ComponentActionImpl#getSummary <em>Summary</em>}</li>
 *   <li>{@link iCal.impl.ComponentActionImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link iCal.impl.ComponentActionImpl#getRecurid <em>Recurid</em>}</li>
 *   <li>{@link iCal.impl.ComponentActionImpl#getRrule <em>Rrule</em>}</li>
 *   <li>{@link iCal.impl.ComponentActionImpl#getAttach <em>Attach</em>}</li>
 *   <li>{@link iCal.impl.ComponentActionImpl#getAttendee <em>Attendee</em>}</li>
 *   <li>{@link iCal.impl.ComponentActionImpl#getCategories <em>Categories</em>}</li>
 *   <li>{@link iCal.impl.ComponentActionImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link iCal.impl.ComponentActionImpl#getContact <em>Contact</em>}</li>
 *   <li>{@link iCal.impl.ComponentActionImpl#getExdate <em>Exdate</em>}</li>
 *   <li>{@link iCal.impl.ComponentActionImpl#getRstatus <em>Rstatus</em>}</li>
 *   <li>{@link iCal.impl.ComponentActionImpl#getRelated <em>Related</em>}</li>
 *   <li>{@link iCal.impl.ComponentActionImpl#getResources <em>Resources</em>}</li>
 *   <li>{@link iCal.impl.ComponentActionImpl#getRdate <em>Rdate</em>}</li>
 *   <li>{@link iCal.impl.ComponentActionImpl#getX_prop <em>Xprop</em>}</li>
 *   <li>{@link iCal.impl.ComponentActionImpl#getIana_prop <em>Iana prop</em>}</li>
 *   <li>{@link iCal.impl.ComponentActionImpl#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ComponentActionImpl extends ComponentRequiredImpl implements ComponentAction {
	/**
	 * The default value of the '{@link #getClass_() <em>Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass_()
	 * @generated
	 * @ordered
	 */
	protected static final String CLASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClass_() <em>Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass_()
	 * @generated
	 * @ordered
	 */
	protected String class_ = CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getCreated() <em>Created</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreated()
	 * @generated
	 * @ordered
	 */
	protected static final String CREATED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCreated() <em>Created</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreated()
	 * @generated
	 * @ordered
	 */
	protected String created = CREATED_EDEFAULT;

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
	 * The default value of the '{@link #getSeq() <em>Seq</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeq()
	 * @generated
	 * @ordered
	 */
	protected static final String SEQ_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSeq() <em>Seq</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeq()
	 * @generated
	 * @ordered
	 */
	protected String seq = SEQ_EDEFAULT;

	/**
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final String STATUS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected String status = STATUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getSummary() <em>Summary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSummary()
	 * @generated
	 * @ordered
	 */
	protected static final String SUMMARY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSummary() <em>Summary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSummary()
	 * @generated
	 * @ordered
	 */
	protected String summary = SUMMARY_EDEFAULT;

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
	 * The default value of the '{@link #getRecurid() <em>Recurid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecurid()
	 * @generated
	 * @ordered
	 */
	protected static final String RECURID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRecurid() <em>Recurid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecurid()
	 * @generated
	 * @ordered
	 */
	protected String recurid = RECURID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRrule() <em>Rrule</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRrule()
	 * @generated
	 * @ordered
	 */
	protected EList<String> rrule;

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
	 * The cached value of the '{@link #getAttendee() <em>Attendee</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttendee()
	 * @generated
	 * @ordered
	 */
	protected EList<String> attendee;

	/**
	 * The cached value of the '{@link #getCategories() <em>Categories</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategories()
	 * @generated
	 * @ordered
	 */
	protected EList<String> categories;

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
	 * The cached value of the '{@link #getContact() <em>Contact</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContact()
	 * @generated
	 * @ordered
	 */
	protected EList<String> contact;

	/**
	 * The cached value of the '{@link #getExdate() <em>Exdate</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExdate()
	 * @generated
	 * @ordered
	 */
	protected EList<String> exdate;

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
	 * The cached value of the '{@link #getRelated() <em>Related</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelated()
	 * @generated
	 * @ordered
	 */
	protected EList<String> related;

	/**
	 * The cached value of the '{@link #getResources() <em>Resources</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResources()
	 * @generated
	 * @ordered
	 */
	protected EList<String> resources;

	/**
	 * The cached value of the '{@link #getRdate() <em>Rdate</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRdate()
	 * @generated
	 * @ordered
	 */
	protected EList<String> rdate;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ICalPackage.Literals.COMPONENT_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getClass_() {
		return class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClass(String newClass) {
		String oldClass = class_;
		class_ = newClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ICalPackage.COMPONENT_ACTION__CLASS, oldClass,
					class_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreated() {
		return created;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreated(String newCreated) {
		String oldCreated = created;
		created = newCreated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ICalPackage.COMPONENT_ACTION__CREATED, oldCreated,
					created));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ICalPackage.COMPONENT_ACTION__LAST_MOD, oldLast_mod,
					last_mod));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ICalPackage.COMPONENT_ACTION__ORGANIZER, oldOrganizer,
					organizer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSeq() {
		return seq;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSeq(String newSeq) {
		String oldSeq = seq;
		seq = newSeq;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ICalPackage.COMPONENT_ACTION__SEQ, oldSeq, seq));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatus(String newStatus) {
		String oldStatus = status;
		status = newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ICalPackage.COMPONENT_ACTION__STATUS, oldStatus,
					status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSummary() {
		return summary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSummary(String newSummary) {
		String oldSummary = summary;
		summary = newSummary;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ICalPackage.COMPONENT_ACTION__SUMMARY, oldSummary,
					summary));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ICalPackage.COMPONENT_ACTION__URL, oldUrl, url));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRecurid() {
		return recurid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRecurid(String newRecurid) {
		String oldRecurid = recurid;
		recurid = newRecurid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ICalPackage.COMPONENT_ACTION__RECURID, oldRecurid,
					recurid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getRrule() {
		if (rrule == null) {
			rrule = new EDataTypeUniqueEList<String>(String.class, this, ICalPackage.COMPONENT_ACTION__RRULE);
		}
		return rrule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getAttach() {
		if (attach == null) {
			attach = new EDataTypeUniqueEList<String>(String.class, this, ICalPackage.COMPONENT_ACTION__ATTACH);
		}
		return attach;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getAttendee() {
		if (attendee == null) {
			attendee = new EDataTypeUniqueEList<String>(String.class, this, ICalPackage.COMPONENT_ACTION__ATTENDEE);
		}
		return attendee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getCategories() {
		if (categories == null) {
			categories = new EDataTypeUniqueEList<String>(String.class, this, ICalPackage.COMPONENT_ACTION__CATEGORIES);
		}
		return categories;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getComment() {
		if (comment == null) {
			comment = new EDataTypeUniqueEList<String>(String.class, this, ICalPackage.COMPONENT_ACTION__COMMENT);
		}
		return comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getContact() {
		if (contact == null) {
			contact = new EDataTypeUniqueEList<String>(String.class, this, ICalPackage.COMPONENT_ACTION__CONTACT);
		}
		return contact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getExdate() {
		if (exdate == null) {
			exdate = new EDataTypeUniqueEList<String>(String.class, this, ICalPackage.COMPONENT_ACTION__EXDATE);
		}
		return exdate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getRstatus() {
		if (rstatus == null) {
			rstatus = new EDataTypeUniqueEList<String>(String.class, this, ICalPackage.COMPONENT_ACTION__RSTATUS);
		}
		return rstatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getRelated() {
		if (related == null) {
			related = new EDataTypeUniqueEList<String>(String.class, this, ICalPackage.COMPONENT_ACTION__RELATED);
		}
		return related;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getResources() {
		if (resources == null) {
			resources = new EDataTypeUniqueEList<String>(String.class, this, ICalPackage.COMPONENT_ACTION__RESOURCES);
		}
		return resources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getRdate() {
		if (rdate == null) {
			rdate = new EDataTypeUniqueEList<String>(String.class, this, ICalPackage.COMPONENT_ACTION__RDATE);
		}
		return rdate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getX_prop() {
		if (x_prop == null) {
			x_prop = new EDataTypeUniqueEList<String>(String.class, this, ICalPackage.COMPONENT_ACTION__XPROP);
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
			iana_prop = new EDataTypeUniqueEList<String>(String.class, this, ICalPackage.COMPONENT_ACTION__IANA_PROP);
		}
		return iana_prop;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ICalPackage.COMPONENT_ACTION__DESCRIPTION,
					oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ICalPackage.COMPONENT_ACTION__CLASS:
			return getClass_();
		case ICalPackage.COMPONENT_ACTION__CREATED:
			return getCreated();
		case ICalPackage.COMPONENT_ACTION__LAST_MOD:
			return getLast_mod();
		case ICalPackage.COMPONENT_ACTION__ORGANIZER:
			return getOrganizer();
		case ICalPackage.COMPONENT_ACTION__SEQ:
			return getSeq();
		case ICalPackage.COMPONENT_ACTION__STATUS:
			return getStatus();
		case ICalPackage.COMPONENT_ACTION__SUMMARY:
			return getSummary();
		case ICalPackage.COMPONENT_ACTION__URL:
			return getUrl();
		case ICalPackage.COMPONENT_ACTION__RECURID:
			return getRecurid();
		case ICalPackage.COMPONENT_ACTION__RRULE:
			return getRrule();
		case ICalPackage.COMPONENT_ACTION__ATTACH:
			return getAttach();
		case ICalPackage.COMPONENT_ACTION__ATTENDEE:
			return getAttendee();
		case ICalPackage.COMPONENT_ACTION__CATEGORIES:
			return getCategories();
		case ICalPackage.COMPONENT_ACTION__COMMENT:
			return getComment();
		case ICalPackage.COMPONENT_ACTION__CONTACT:
			return getContact();
		case ICalPackage.COMPONENT_ACTION__EXDATE:
			return getExdate();
		case ICalPackage.COMPONENT_ACTION__RSTATUS:
			return getRstatus();
		case ICalPackage.COMPONENT_ACTION__RELATED:
			return getRelated();
		case ICalPackage.COMPONENT_ACTION__RESOURCES:
			return getResources();
		case ICalPackage.COMPONENT_ACTION__RDATE:
			return getRdate();
		case ICalPackage.COMPONENT_ACTION__XPROP:
			return getX_prop();
		case ICalPackage.COMPONENT_ACTION__IANA_PROP:
			return getIana_prop();
		case ICalPackage.COMPONENT_ACTION__DESCRIPTION:
			return getDescription();
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
		case ICalPackage.COMPONENT_ACTION__CLASS:
			setClass((String) newValue);
			return;
		case ICalPackage.COMPONENT_ACTION__CREATED:
			setCreated((String) newValue);
			return;
		case ICalPackage.COMPONENT_ACTION__LAST_MOD:
			setLast_mod((String) newValue);
			return;
		case ICalPackage.COMPONENT_ACTION__ORGANIZER:
			setOrganizer((String) newValue);
			return;
		case ICalPackage.COMPONENT_ACTION__SEQ:
			setSeq((String) newValue);
			return;
		case ICalPackage.COMPONENT_ACTION__STATUS:
			setStatus((String) newValue);
			return;
		case ICalPackage.COMPONENT_ACTION__SUMMARY:
			setSummary((String) newValue);
			return;
		case ICalPackage.COMPONENT_ACTION__URL:
			setUrl((String) newValue);
			return;
		case ICalPackage.COMPONENT_ACTION__RECURID:
			setRecurid((String) newValue);
			return;
		case ICalPackage.COMPONENT_ACTION__RRULE:
			getRrule().clear();
			getRrule().addAll((Collection<? extends String>) newValue);
			return;
		case ICalPackage.COMPONENT_ACTION__ATTACH:
			getAttach().clear();
			getAttach().addAll((Collection<? extends String>) newValue);
			return;
		case ICalPackage.COMPONENT_ACTION__ATTENDEE:
			getAttendee().clear();
			getAttendee().addAll((Collection<? extends String>) newValue);
			return;
		case ICalPackage.COMPONENT_ACTION__CATEGORIES:
			getCategories().clear();
			getCategories().addAll((Collection<? extends String>) newValue);
			return;
		case ICalPackage.COMPONENT_ACTION__COMMENT:
			getComment().clear();
			getComment().addAll((Collection<? extends String>) newValue);
			return;
		case ICalPackage.COMPONENT_ACTION__CONTACT:
			getContact().clear();
			getContact().addAll((Collection<? extends String>) newValue);
			return;
		case ICalPackage.COMPONENT_ACTION__EXDATE:
			getExdate().clear();
			getExdate().addAll((Collection<? extends String>) newValue);
			return;
		case ICalPackage.COMPONENT_ACTION__RSTATUS:
			getRstatus().clear();
			getRstatus().addAll((Collection<? extends String>) newValue);
			return;
		case ICalPackage.COMPONENT_ACTION__RELATED:
			getRelated().clear();
			getRelated().addAll((Collection<? extends String>) newValue);
			return;
		case ICalPackage.COMPONENT_ACTION__RESOURCES:
			getResources().clear();
			getResources().addAll((Collection<? extends String>) newValue);
			return;
		case ICalPackage.COMPONENT_ACTION__RDATE:
			getRdate().clear();
			getRdate().addAll((Collection<? extends String>) newValue);
			return;
		case ICalPackage.COMPONENT_ACTION__XPROP:
			getX_prop().clear();
			getX_prop().addAll((Collection<? extends String>) newValue);
			return;
		case ICalPackage.COMPONENT_ACTION__IANA_PROP:
			getIana_prop().clear();
			getIana_prop().addAll((Collection<? extends String>) newValue);
			return;
		case ICalPackage.COMPONENT_ACTION__DESCRIPTION:
			setDescription((String) newValue);
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
		case ICalPackage.COMPONENT_ACTION__CLASS:
			setClass(CLASS_EDEFAULT);
			return;
		case ICalPackage.COMPONENT_ACTION__CREATED:
			setCreated(CREATED_EDEFAULT);
			return;
		case ICalPackage.COMPONENT_ACTION__LAST_MOD:
			setLast_mod(LAST_MOD_EDEFAULT);
			return;
		case ICalPackage.COMPONENT_ACTION__ORGANIZER:
			setOrganizer(ORGANIZER_EDEFAULT);
			return;
		case ICalPackage.COMPONENT_ACTION__SEQ:
			setSeq(SEQ_EDEFAULT);
			return;
		case ICalPackage.COMPONENT_ACTION__STATUS:
			setStatus(STATUS_EDEFAULT);
			return;
		case ICalPackage.COMPONENT_ACTION__SUMMARY:
			setSummary(SUMMARY_EDEFAULT);
			return;
		case ICalPackage.COMPONENT_ACTION__URL:
			setUrl(URL_EDEFAULT);
			return;
		case ICalPackage.COMPONENT_ACTION__RECURID:
			setRecurid(RECURID_EDEFAULT);
			return;
		case ICalPackage.COMPONENT_ACTION__RRULE:
			getRrule().clear();
			return;
		case ICalPackage.COMPONENT_ACTION__ATTACH:
			getAttach().clear();
			return;
		case ICalPackage.COMPONENT_ACTION__ATTENDEE:
			getAttendee().clear();
			return;
		case ICalPackage.COMPONENT_ACTION__CATEGORIES:
			getCategories().clear();
			return;
		case ICalPackage.COMPONENT_ACTION__COMMENT:
			getComment().clear();
			return;
		case ICalPackage.COMPONENT_ACTION__CONTACT:
			getContact().clear();
			return;
		case ICalPackage.COMPONENT_ACTION__EXDATE:
			getExdate().clear();
			return;
		case ICalPackage.COMPONENT_ACTION__RSTATUS:
			getRstatus().clear();
			return;
		case ICalPackage.COMPONENT_ACTION__RELATED:
			getRelated().clear();
			return;
		case ICalPackage.COMPONENT_ACTION__RESOURCES:
			getResources().clear();
			return;
		case ICalPackage.COMPONENT_ACTION__RDATE:
			getRdate().clear();
			return;
		case ICalPackage.COMPONENT_ACTION__XPROP:
			getX_prop().clear();
			return;
		case ICalPackage.COMPONENT_ACTION__IANA_PROP:
			getIana_prop().clear();
			return;
		case ICalPackage.COMPONENT_ACTION__DESCRIPTION:
			setDescription(DESCRIPTION_EDEFAULT);
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
		case ICalPackage.COMPONENT_ACTION__CLASS:
			return CLASS_EDEFAULT == null ? class_ != null : !CLASS_EDEFAULT.equals(class_);
		case ICalPackage.COMPONENT_ACTION__CREATED:
			return CREATED_EDEFAULT == null ? created != null : !CREATED_EDEFAULT.equals(created);
		case ICalPackage.COMPONENT_ACTION__LAST_MOD:
			return LAST_MOD_EDEFAULT == null ? last_mod != null : !LAST_MOD_EDEFAULT.equals(last_mod);
		case ICalPackage.COMPONENT_ACTION__ORGANIZER:
			return ORGANIZER_EDEFAULT == null ? organizer != null : !ORGANIZER_EDEFAULT.equals(organizer);
		case ICalPackage.COMPONENT_ACTION__SEQ:
			return SEQ_EDEFAULT == null ? seq != null : !SEQ_EDEFAULT.equals(seq);
		case ICalPackage.COMPONENT_ACTION__STATUS:
			return STATUS_EDEFAULT == null ? status != null : !STATUS_EDEFAULT.equals(status);
		case ICalPackage.COMPONENT_ACTION__SUMMARY:
			return SUMMARY_EDEFAULT == null ? summary != null : !SUMMARY_EDEFAULT.equals(summary);
		case ICalPackage.COMPONENT_ACTION__URL:
			return URL_EDEFAULT == null ? url != null : !URL_EDEFAULT.equals(url);
		case ICalPackage.COMPONENT_ACTION__RECURID:
			return RECURID_EDEFAULT == null ? recurid != null : !RECURID_EDEFAULT.equals(recurid);
		case ICalPackage.COMPONENT_ACTION__RRULE:
			return rrule != null && !rrule.isEmpty();
		case ICalPackage.COMPONENT_ACTION__ATTACH:
			return attach != null && !attach.isEmpty();
		case ICalPackage.COMPONENT_ACTION__ATTENDEE:
			return attendee != null && !attendee.isEmpty();
		case ICalPackage.COMPONENT_ACTION__CATEGORIES:
			return categories != null && !categories.isEmpty();
		case ICalPackage.COMPONENT_ACTION__COMMENT:
			return comment != null && !comment.isEmpty();
		case ICalPackage.COMPONENT_ACTION__CONTACT:
			return contact != null && !contact.isEmpty();
		case ICalPackage.COMPONENT_ACTION__EXDATE:
			return exdate != null && !exdate.isEmpty();
		case ICalPackage.COMPONENT_ACTION__RSTATUS:
			return rstatus != null && !rstatus.isEmpty();
		case ICalPackage.COMPONENT_ACTION__RELATED:
			return related != null && !related.isEmpty();
		case ICalPackage.COMPONENT_ACTION__RESOURCES:
			return resources != null && !resources.isEmpty();
		case ICalPackage.COMPONENT_ACTION__RDATE:
			return rdate != null && !rdate.isEmpty();
		case ICalPackage.COMPONENT_ACTION__XPROP:
			return x_prop != null && !x_prop.isEmpty();
		case ICalPackage.COMPONENT_ACTION__IANA_PROP:
			return iana_prop != null && !iana_prop.isEmpty();
		case ICalPackage.COMPONENT_ACTION__DESCRIPTION:
			return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
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
		result.append(" (class: ");
		result.append(class_);
		result.append(", created: ");
		result.append(created);
		result.append(", last_mod: ");
		result.append(last_mod);
		result.append(", organizer: ");
		result.append(organizer);
		result.append(", seq: ");
		result.append(seq);
		result.append(", status: ");
		result.append(status);
		result.append(", summary: ");
		result.append(summary);
		result.append(", url: ");
		result.append(url);
		result.append(", recurid: ");
		result.append(recurid);
		result.append(", rrule: ");
		result.append(rrule);
		result.append(", attach: ");
		result.append(attach);
		result.append(", attendee: ");
		result.append(attendee);
		result.append(", categories: ");
		result.append(categories);
		result.append(", comment: ");
		result.append(comment);
		result.append(", contact: ");
		result.append(contact);
		result.append(", exdate: ");
		result.append(exdate);
		result.append(", rstatus: ");
		result.append(rstatus);
		result.append(", related: ");
		result.append(related);
		result.append(", resources: ");
		result.append(resources);
		result.append(", rdate: ");
		result.append(rdate);
		result.append(", x_prop: ");
		result.append(x_prop);
		result.append(", iana_prop: ");
		result.append(iana_prop);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //ComponentActionImpl
