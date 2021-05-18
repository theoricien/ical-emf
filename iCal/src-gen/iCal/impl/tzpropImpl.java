/**
 */
package iCal.impl;

import iCal.ICalPackage;
import iCal.tzprop;
import iCal.tzpropOptional;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>tzprop</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iCal.impl.tzpropImpl#getDtstart <em>Dtstart</em>}</li>
 *   <li>{@link iCal.impl.tzpropImpl#getTzoffseto <em>Tzoffseto</em>}</li>
 *   <li>{@link iCal.impl.tzpropImpl#getTzoffsetfrom <em>Tzoffsetfrom</em>}</li>
 *   <li>{@link iCal.impl.tzpropImpl#getRrule <em>Rrule</em>}</li>
 *   <li>{@link iCal.impl.tzpropImpl#getOpt <em>Opt</em>}</li>
 * </ul>
 *
 * @generated
 */
public class tzpropImpl extends MinimalEObjectImpl.Container implements tzprop {
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
	 * The default value of the '{@link #getTzoffseto() <em>Tzoffseto</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTzoffseto()
	 * @generated
	 * @ordered
	 */
	protected static final String TZOFFSETO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTzoffseto() <em>Tzoffseto</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTzoffseto()
	 * @generated
	 * @ordered
	 */
	protected String tzoffseto = TZOFFSETO_EDEFAULT;

	/**
	 * The default value of the '{@link #getTzoffsetfrom() <em>Tzoffsetfrom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTzoffsetfrom()
	 * @generated
	 * @ordered
	 */
	protected static final String TZOFFSETFROM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTzoffsetfrom() <em>Tzoffsetfrom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTzoffsetfrom()
	 * @generated
	 * @ordered
	 */
	protected String tzoffsetfrom = TZOFFSETFROM_EDEFAULT;

	/**
	 * The default value of the '{@link #getRrule() <em>Rrule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRrule()
	 * @generated
	 * @ordered
	 */
	protected static final String RRULE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRrule() <em>Rrule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRrule()
	 * @generated
	 * @ordered
	 */
	protected String rrule = RRULE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOpt() <em>Opt</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpt()
	 * @generated
	 * @ordered
	 */
	protected EList<tzpropOptional> opt;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected tzpropImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ICalPackage.Literals.TZPROP;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ICalPackage.TZPROP__DTSTART, oldDtstart, dtstart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTzoffseto() {
		return tzoffseto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTzoffseto(String newTzoffseto) {
		String oldTzoffseto = tzoffseto;
		tzoffseto = newTzoffseto;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ICalPackage.TZPROP__TZOFFSETO, oldTzoffseto,
					tzoffseto));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTzoffsetfrom() {
		return tzoffsetfrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTzoffsetfrom(String newTzoffsetfrom) {
		String oldTzoffsetfrom = tzoffsetfrom;
		tzoffsetfrom = newTzoffsetfrom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ICalPackage.TZPROP__TZOFFSETFROM, oldTzoffsetfrom,
					tzoffsetfrom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRrule() {
		return rrule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRrule(String newRrule) {
		String oldRrule = rrule;
		rrule = newRrule;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ICalPackage.TZPROP__RRULE, oldRrule, rrule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<tzpropOptional> getOpt() {
		if (opt == null) {
			opt = new EObjectContainmentEList<tzpropOptional>(tzpropOptional.class, this, ICalPackage.TZPROP__OPT);
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
		case ICalPackage.TZPROP__OPT:
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
		case ICalPackage.TZPROP__DTSTART:
			return getDtstart();
		case ICalPackage.TZPROP__TZOFFSETO:
			return getTzoffseto();
		case ICalPackage.TZPROP__TZOFFSETFROM:
			return getTzoffsetfrom();
		case ICalPackage.TZPROP__RRULE:
			return getRrule();
		case ICalPackage.TZPROP__OPT:
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
		case ICalPackage.TZPROP__DTSTART:
			setDtstart((String) newValue);
			return;
		case ICalPackage.TZPROP__TZOFFSETO:
			setTzoffseto((String) newValue);
			return;
		case ICalPackage.TZPROP__TZOFFSETFROM:
			setTzoffsetfrom((String) newValue);
			return;
		case ICalPackage.TZPROP__RRULE:
			setRrule((String) newValue);
			return;
		case ICalPackage.TZPROP__OPT:
			getOpt().clear();
			getOpt().addAll((Collection<? extends tzpropOptional>) newValue);
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
		case ICalPackage.TZPROP__DTSTART:
			setDtstart(DTSTART_EDEFAULT);
			return;
		case ICalPackage.TZPROP__TZOFFSETO:
			setTzoffseto(TZOFFSETO_EDEFAULT);
			return;
		case ICalPackage.TZPROP__TZOFFSETFROM:
			setTzoffsetfrom(TZOFFSETFROM_EDEFAULT);
			return;
		case ICalPackage.TZPROP__RRULE:
			setRrule(RRULE_EDEFAULT);
			return;
		case ICalPackage.TZPROP__OPT:
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
		case ICalPackage.TZPROP__DTSTART:
			return DTSTART_EDEFAULT == null ? dtstart != null : !DTSTART_EDEFAULT.equals(dtstart);
		case ICalPackage.TZPROP__TZOFFSETO:
			return TZOFFSETO_EDEFAULT == null ? tzoffseto != null : !TZOFFSETO_EDEFAULT.equals(tzoffseto);
		case ICalPackage.TZPROP__TZOFFSETFROM:
			return TZOFFSETFROM_EDEFAULT == null ? tzoffsetfrom != null : !TZOFFSETFROM_EDEFAULT.equals(tzoffsetfrom);
		case ICalPackage.TZPROP__RRULE:
			return RRULE_EDEFAULT == null ? rrule != null : !RRULE_EDEFAULT.equals(rrule);
		case ICalPackage.TZPROP__OPT:
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
		result.append(", tzoffseto: ");
		result.append(tzoffseto);
		result.append(", tzoffsetfrom: ");
		result.append(tzoffsetfrom);
		result.append(", rrule: ");
		result.append(rrule);
		result.append(')');
		return result.toString();
	}

} //tzpropImpl
