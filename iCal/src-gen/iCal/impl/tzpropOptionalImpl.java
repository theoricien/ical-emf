/**
 */
package iCal.impl;

import iCal.ICalPackage;
import iCal.tzpropOptional;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>tzprop Optional</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iCal.impl.tzpropOptionalImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link iCal.impl.tzpropOptionalImpl#getRdate <em>Rdate</em>}</li>
 *   <li>{@link iCal.impl.tzpropOptionalImpl#getTzname <em>Tzname</em>}</li>
 *   <li>{@link iCal.impl.tzpropOptionalImpl#getX_prop <em>Xprop</em>}</li>
 *   <li>{@link iCal.impl.tzpropOptionalImpl#getIana_prop <em>Iana prop</em>}</li>
 * </ul>
 *
 * @generated
 */
public class tzpropOptionalImpl extends MinimalEObjectImpl.Container implements tzpropOptional {
	/**
	 * The default value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected String comment = COMMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getRdate() <em>Rdate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRdate()
	 * @generated
	 * @ordered
	 */
	protected static final String RDATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRdate() <em>Rdate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRdate()
	 * @generated
	 * @ordered
	 */
	protected String rdate = RDATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTzname() <em>Tzname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTzname()
	 * @generated
	 * @ordered
	 */
	protected static final String TZNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTzname() <em>Tzname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTzname()
	 * @generated
	 * @ordered
	 */
	protected String tzname = TZNAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getX_prop() <em>Xprop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX_prop()
	 * @generated
	 * @ordered
	 */
	protected static final String XPROP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getX_prop() <em>Xprop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX_prop()
	 * @generated
	 * @ordered
	 */
	protected String x_prop = XPROP_EDEFAULT;

	/**
	 * The default value of the '{@link #getIana_prop() <em>Iana prop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIana_prop()
	 * @generated
	 * @ordered
	 */
	protected static final String IANA_PROP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIana_prop() <em>Iana prop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIana_prop()
	 * @generated
	 * @ordered
	 */
	protected String iana_prop = IANA_PROP_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected tzpropOptionalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ICalPackage.Literals.TZPROP_OPTIONAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getComment() {
		return comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setComment(String newComment) {
		String oldComment = comment;
		comment = newComment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ICalPackage.TZPROP_OPTIONAL__COMMENT, oldComment,
					comment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRdate() {
		return rdate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRdate(String newRdate) {
		String oldRdate = rdate;
		rdate = newRdate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ICalPackage.TZPROP_OPTIONAL__RDATE, oldRdate, rdate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTzname() {
		return tzname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTzname(String newTzname) {
		String oldTzname = tzname;
		tzname = newTzname;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ICalPackage.TZPROP_OPTIONAL__TZNAME, oldTzname,
					tzname));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getX_prop() {
		return x_prop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setX_prop(String newX_prop) {
		String oldX_prop = x_prop;
		x_prop = newX_prop;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ICalPackage.TZPROP_OPTIONAL__XPROP, oldX_prop,
					x_prop));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIana_prop() {
		return iana_prop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIana_prop(String newIana_prop) {
		String oldIana_prop = iana_prop;
		iana_prop = newIana_prop;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ICalPackage.TZPROP_OPTIONAL__IANA_PROP, oldIana_prop,
					iana_prop));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ICalPackage.TZPROP_OPTIONAL__COMMENT:
			return getComment();
		case ICalPackage.TZPROP_OPTIONAL__RDATE:
			return getRdate();
		case ICalPackage.TZPROP_OPTIONAL__TZNAME:
			return getTzname();
		case ICalPackage.TZPROP_OPTIONAL__XPROP:
			return getX_prop();
		case ICalPackage.TZPROP_OPTIONAL__IANA_PROP:
			return getIana_prop();
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
		case ICalPackage.TZPROP_OPTIONAL__COMMENT:
			setComment((String) newValue);
			return;
		case ICalPackage.TZPROP_OPTIONAL__RDATE:
			setRdate((String) newValue);
			return;
		case ICalPackage.TZPROP_OPTIONAL__TZNAME:
			setTzname((String) newValue);
			return;
		case ICalPackage.TZPROP_OPTIONAL__XPROP:
			setX_prop((String) newValue);
			return;
		case ICalPackage.TZPROP_OPTIONAL__IANA_PROP:
			setIana_prop((String) newValue);
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
		case ICalPackage.TZPROP_OPTIONAL__COMMENT:
			setComment(COMMENT_EDEFAULT);
			return;
		case ICalPackage.TZPROP_OPTIONAL__RDATE:
			setRdate(RDATE_EDEFAULT);
			return;
		case ICalPackage.TZPROP_OPTIONAL__TZNAME:
			setTzname(TZNAME_EDEFAULT);
			return;
		case ICalPackage.TZPROP_OPTIONAL__XPROP:
			setX_prop(XPROP_EDEFAULT);
			return;
		case ICalPackage.TZPROP_OPTIONAL__IANA_PROP:
			setIana_prop(IANA_PROP_EDEFAULT);
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
		case ICalPackage.TZPROP_OPTIONAL__COMMENT:
			return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
		case ICalPackage.TZPROP_OPTIONAL__RDATE:
			return RDATE_EDEFAULT == null ? rdate != null : !RDATE_EDEFAULT.equals(rdate);
		case ICalPackage.TZPROP_OPTIONAL__TZNAME:
			return TZNAME_EDEFAULT == null ? tzname != null : !TZNAME_EDEFAULT.equals(tzname);
		case ICalPackage.TZPROP_OPTIONAL__XPROP:
			return XPROP_EDEFAULT == null ? x_prop != null : !XPROP_EDEFAULT.equals(x_prop);
		case ICalPackage.TZPROP_OPTIONAL__IANA_PROP:
			return IANA_PROP_EDEFAULT == null ? iana_prop != null : !IANA_PROP_EDEFAULT.equals(iana_prop);
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
		result.append(" (comment: ");
		result.append(comment);
		result.append(", rdate: ");
		result.append(rdate);
		result.append(", tzname: ");
		result.append(tzname);
		result.append(", x_prop: ");
		result.append(x_prop);
		result.append(", iana_prop: ");
		result.append(iana_prop);
		result.append(')');
		return result.toString();
	}

} //tzpropOptionalImpl
