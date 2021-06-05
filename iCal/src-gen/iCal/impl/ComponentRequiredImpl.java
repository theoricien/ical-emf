/**
 */
package iCal.impl;

import iCal.ComponentRequired;
import iCal.DateT;
import iCal.ICalPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Required</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iCal.impl.ComponentRequiredImpl#getUid <em>Uid</em>}</li>
 *   <li>{@link iCal.impl.ComponentRequiredImpl#getDtstart <em>Dtstart</em>}</li>
 *   <li>{@link iCal.impl.ComponentRequiredImpl#getDtstamp <em>Dtstamp</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ComponentRequiredImpl extends ComponentImpl implements ComponentRequired {
	/**
	 * The default value of the '{@link #getUid() <em>Uid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUid()
	 * @generated
	 * @ordered
	 */
	protected static final String UID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUid() <em>Uid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUid()
	 * @generated
	 * @ordered
	 */
	protected String uid = UID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDtstart() <em>Dtstart</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDtstart()
	 * @generated
	 * @ordered
	 */
	protected DateT dtstart;

	/**
	 * The cached value of the '{@link #getDtstamp() <em>Dtstamp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDtstamp()
	 * @generated
	 * @ordered
	 */
	protected DateT dtstamp;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentRequiredImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ICalPackage.Literals.COMPONENT_REQUIRED;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DateT getDtstamp() {
		return dtstamp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDtstamp(DateT newDtstamp, NotificationChain msgs) {
		DateT oldDtstamp = dtstamp;
		dtstamp = newDtstamp;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ICalPackage.COMPONENT_REQUIRED__DTSTAMP, oldDtstamp, newDtstamp);
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
	public void setDtstamp(DateT newDtstamp) {
		if (newDtstamp != dtstamp) {
			NotificationChain msgs = null;
			if (dtstamp != null)
				msgs = ((InternalEObject) dtstamp).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ICalPackage.COMPONENT_REQUIRED__DTSTAMP, null, msgs);
			if (newDtstamp != null)
				msgs = ((InternalEObject) newDtstamp).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ICalPackage.COMPONENT_REQUIRED__DTSTAMP, null, msgs);
			msgs = basicSetDtstamp(newDtstamp, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ICalPackage.COMPONENT_REQUIRED__DTSTAMP, newDtstamp,
					newDtstamp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUid() {
		return uid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUid(String newUid) {
		String oldUid = uid;
		uid = newUid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ICalPackage.COMPONENT_REQUIRED__UID, oldUid, uid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DateT getDtstart() {
		return dtstart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDtstart(DateT newDtstart, NotificationChain msgs) {
		DateT oldDtstart = dtstart;
		dtstart = newDtstart;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ICalPackage.COMPONENT_REQUIRED__DTSTART, oldDtstart, newDtstart);
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
	public void setDtstart(DateT newDtstart) {
		if (newDtstart != dtstart) {
			NotificationChain msgs = null;
			if (dtstart != null)
				msgs = ((InternalEObject) dtstart).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ICalPackage.COMPONENT_REQUIRED__DTSTART, null, msgs);
			if (newDtstart != null)
				msgs = ((InternalEObject) newDtstart).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ICalPackage.COMPONENT_REQUIRED__DTSTART, null, msgs);
			msgs = basicSetDtstart(newDtstart, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ICalPackage.COMPONENT_REQUIRED__DTSTART, newDtstart,
					newDtstart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ICalPackage.COMPONENT_REQUIRED__DTSTART:
			return basicSetDtstart(null, msgs);
		case ICalPackage.COMPONENT_REQUIRED__DTSTAMP:
			return basicSetDtstamp(null, msgs);
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
		case ICalPackage.COMPONENT_REQUIRED__UID:
			return getUid();
		case ICalPackage.COMPONENT_REQUIRED__DTSTART:
			return getDtstart();
		case ICalPackage.COMPONENT_REQUIRED__DTSTAMP:
			return getDtstamp();
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
		case ICalPackage.COMPONENT_REQUIRED__UID:
			setUid((String) newValue);
			return;
		case ICalPackage.COMPONENT_REQUIRED__DTSTART:
			setDtstart((DateT) newValue);
			return;
		case ICalPackage.COMPONENT_REQUIRED__DTSTAMP:
			setDtstamp((DateT) newValue);
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
		case ICalPackage.COMPONENT_REQUIRED__UID:
			setUid(UID_EDEFAULT);
			return;
		case ICalPackage.COMPONENT_REQUIRED__DTSTART:
			setDtstart((DateT) null);
			return;
		case ICalPackage.COMPONENT_REQUIRED__DTSTAMP:
			setDtstamp((DateT) null);
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
		case ICalPackage.COMPONENT_REQUIRED__UID:
			return UID_EDEFAULT == null ? uid != null : !UID_EDEFAULT.equals(uid);
		case ICalPackage.COMPONENT_REQUIRED__DTSTART:
			return dtstart != null;
		case ICalPackage.COMPONENT_REQUIRED__DTSTAMP:
			return dtstamp != null;
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
		result.append(" (uid: ");
		result.append(uid);
		result.append(')');
		return result.toString();
	}

} //ComponentRequiredImpl
