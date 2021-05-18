/**
 */
package iCal.impl;

import iCal.ComponentAction;
import iCal.ComponentActionOptionalProperties;
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
 * An implementation of the model object '<em><b>Component Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iCal.impl.ComponentActionImpl#getDtstart <em>Dtstart</em>}</li>
 *   <li>{@link iCal.impl.ComponentActionImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link iCal.impl.ComponentActionImpl#getCreated <em>Created</em>}</li>
 *   <li>{@link iCal.impl.ComponentActionImpl#getLast_mod <em>Last mod</em>}</li>
 *   <li>{@link iCal.impl.ComponentActionImpl#getOrganizer <em>Organizer</em>}</li>
 *   <li>{@link iCal.impl.ComponentActionImpl#getSeq <em>Seq</em>}</li>
 *   <li>{@link iCal.impl.ComponentActionImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link iCal.impl.ComponentActionImpl#getSummary <em>Summary</em>}</li>
 *   <li>{@link iCal.impl.ComponentActionImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link iCal.impl.ComponentActionImpl#getRecurid <em>Recurid</em>}</li>
 *   <li>{@link iCal.impl.ComponentActionImpl#getOpt <em>Opt</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ComponentActionImpl extends ComponentRequiredImpl implements ComponentAction {
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
	 * The cached value of the '{@link #getOpt() <em>Opt</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpt()
	 * @generated
	 * @ordered
	 */
	protected EList<ComponentActionOptionalProperties> opt;

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
			eNotify(new ENotificationImpl(this, Notification.SET, ICalPackage.COMPONENT_ACTION__DTSTART, oldDtstart,
					dtstart));
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
	public EList<ComponentActionOptionalProperties> getOpt() {
		if (opt == null) {
			opt = new EObjectContainmentEList<ComponentActionOptionalProperties>(
					ComponentActionOptionalProperties.class, this, ICalPackage.COMPONENT_ACTION__OPT);
		}
		return opt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ICalPackage.COMPONENT_ACTION__OPT:
			return ((InternalEList<?>) getOpt()).basicRemove(otherEnd, msgs);
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
		case ICalPackage.COMPONENT_ACTION__DTSTART:
			return getDtstart();
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
		case ICalPackage.COMPONENT_ACTION__OPT:
			return getOpt();
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
		case ICalPackage.COMPONENT_ACTION__DTSTART:
			setDtstart((String) newValue);
			return;
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
		case ICalPackage.COMPONENT_ACTION__OPT:
			getOpt().clear();
			getOpt().addAll((Collection<? extends ComponentActionOptionalProperties>) newValue);
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
		case ICalPackage.COMPONENT_ACTION__DTSTART:
			setDtstart(DTSTART_EDEFAULT);
			return;
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
		case ICalPackage.COMPONENT_ACTION__OPT:
			getOpt().clear();
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
		case ICalPackage.COMPONENT_ACTION__DTSTART:
			return DTSTART_EDEFAULT == null ? dtstart != null : !DTSTART_EDEFAULT.equals(dtstart);
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
		case ICalPackage.COMPONENT_ACTION__OPT:
			return opt != null && !opt.isEmpty();
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
		result.append(", class: ");
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
		result.append(')');
		return result.toString();
	}

} //ComponentActionImpl
