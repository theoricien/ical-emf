/**
 */
package iCal.impl;

import iCal.ComponentActionOptionalProperties;
import iCal.ICalPackage;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Action Optional Properties</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iCal.impl.ComponentActionOptionalPropertiesImpl#getRrule <em>Rrule</em>}</li>
 *   <li>{@link iCal.impl.ComponentActionOptionalPropertiesImpl#getAttach <em>Attach</em>}</li>
 *   <li>{@link iCal.impl.ComponentActionOptionalPropertiesImpl#getAttendee <em>Attendee</em>}</li>
 *   <li>{@link iCal.impl.ComponentActionOptionalPropertiesImpl#getCategories <em>Categories</em>}</li>
 *   <li>{@link iCal.impl.ComponentActionOptionalPropertiesImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link iCal.impl.ComponentActionOptionalPropertiesImpl#getContact <em>Contact</em>}</li>
 *   <li>{@link iCal.impl.ComponentActionOptionalPropertiesImpl#getExdate <em>Exdate</em>}</li>
 *   <li>{@link iCal.impl.ComponentActionOptionalPropertiesImpl#getRstatus <em>Rstatus</em>}</li>
 *   <li>{@link iCal.impl.ComponentActionOptionalPropertiesImpl#getRelated <em>Related</em>}</li>
 *   <li>{@link iCal.impl.ComponentActionOptionalPropertiesImpl#getResources <em>Resources</em>}</li>
 *   <li>{@link iCal.impl.ComponentActionOptionalPropertiesImpl#getRdate <em>Rdate</em>}</li>
 *   <li>{@link iCal.impl.ComponentActionOptionalPropertiesImpl#getX_prop <em>Xprop</em>}</li>
 *   <li>{@link iCal.impl.ComponentActionOptionalPropertiesImpl#getIana_prop <em>Iana prop</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentActionOptionalPropertiesImpl extends MinimalEObjectImpl.Container
		implements ComponentActionOptionalProperties {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentActionOptionalPropertiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ICalPackage.Literals.COMPONENT_ACTION_OPTIONAL_PROPERTIES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getRrule() {
		if (rrule == null) {
			rrule = new EDataTypeUniqueEList<String>(String.class, this,
					ICalPackage.COMPONENT_ACTION_OPTIONAL_PROPERTIES__RRULE);
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
			attach = new EDataTypeUniqueEList<String>(String.class, this,
					ICalPackage.COMPONENT_ACTION_OPTIONAL_PROPERTIES__ATTACH);
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
			attendee = new EDataTypeUniqueEList<String>(String.class, this,
					ICalPackage.COMPONENT_ACTION_OPTIONAL_PROPERTIES__ATTENDEE);
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
			categories = new EDataTypeUniqueEList<String>(String.class, this,
					ICalPackage.COMPONENT_ACTION_OPTIONAL_PROPERTIES__CATEGORIES);
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
			comment = new EDataTypeUniqueEList<String>(String.class, this,
					ICalPackage.COMPONENT_ACTION_OPTIONAL_PROPERTIES__COMMENT);
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
			contact = new EDataTypeUniqueEList<String>(String.class, this,
					ICalPackage.COMPONENT_ACTION_OPTIONAL_PROPERTIES__CONTACT);
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
			exdate = new EDataTypeUniqueEList<String>(String.class, this,
					ICalPackage.COMPONENT_ACTION_OPTIONAL_PROPERTIES__EXDATE);
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
			rstatus = new EDataTypeUniqueEList<String>(String.class, this,
					ICalPackage.COMPONENT_ACTION_OPTIONAL_PROPERTIES__RSTATUS);
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
			related = new EDataTypeUniqueEList<String>(String.class, this,
					ICalPackage.COMPONENT_ACTION_OPTIONAL_PROPERTIES__RELATED);
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
			resources = new EDataTypeUniqueEList<String>(String.class, this,
					ICalPackage.COMPONENT_ACTION_OPTIONAL_PROPERTIES__RESOURCES);
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
			rdate = new EDataTypeUniqueEList<String>(String.class, this,
					ICalPackage.COMPONENT_ACTION_OPTIONAL_PROPERTIES__RDATE);
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
			x_prop = new EDataTypeUniqueEList<String>(String.class, this,
					ICalPackage.COMPONENT_ACTION_OPTIONAL_PROPERTIES__XPROP);
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
			iana_prop = new EDataTypeUniqueEList<String>(String.class, this,
					ICalPackage.COMPONENT_ACTION_OPTIONAL_PROPERTIES__IANA_PROP);
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
		case ICalPackage.COMPONENT_ACTION_OPTIONAL_PROPERTIES__RRULE:
			return getRrule();
		case ICalPackage.COMPONENT_ACTION_OPTIONAL_PROPERTIES__ATTACH:
			return getAttach();
		case ICalPackage.COMPONENT_ACTION_OPTIONAL_PROPERTIES__ATTENDEE:
			return getAttendee();
		case ICalPackage.COMPONENT_ACTION_OPTIONAL_PROPERTIES__CATEGORIES:
			return getCategories();
		case ICalPackage.COMPONENT_ACTION_OPTIONAL_PROPERTIES__COMMENT:
			return getComment();
		case ICalPackage.COMPONENT_ACTION_OPTIONAL_PROPERTIES__CONTACT:
			return getContact();
		case ICalPackage.COMPONENT_ACTION_OPTIONAL_PROPERTIES__EXDATE:
			return getExdate();
		case ICalPackage.COMPONENT_ACTION_OPTIONAL_PROPERTIES__RSTATUS:
			return getRstatus();
		case ICalPackage.COMPONENT_ACTION_OPTIONAL_PROPERTIES__RELATED:
			return getRelated();
		case ICalPackage.COMPONENT_ACTION_OPTIONAL_PROPERTIES__RESOURCES:
			return getResources();
		case ICalPackage.COMPONENT_ACTION_OPTIONAL_PROPERTIES__RDATE:
			return getRdate();
		case ICalPackage.COMPONENT_ACTION_OPTIONAL_PROPERTIES__XPROP:
			return getX_prop();
		case ICalPackage.COMPONENT_ACTION_OPTIONAL_PROPERTIES__IANA_PROP:
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
		case ICalPackage.COMPONENT_ACTION_OPTIONAL_PROPERTIES__RRULE:
			getRrule().clear();
			getRrule().addAll((Collection<? extends String>) newValue);
			return;
		case ICalPackage.COMPONENT_ACTION_OPTIONAL_PROPERTIES__ATTACH:
			getAttach().clear();
			getAttach().addAll((Collection<? extends String>) newValue);
			return;
		case ICalPackage.COMPONENT_ACTION_OPTIONAL_PROPERTIES__ATTENDEE:
			getAttendee().clear();
			getAttendee().addAll((Collection<? extends String>) newValue);
			return;
		case ICalPackage.COMPONENT_ACTION_OPTIONAL_PROPERTIES__CATEGORIES:
			getCategories().clear();
			getCategories().addAll((Collection<? extends String>) newValue);
			return;
		case ICalPackage.COMPONENT_ACTION_OPTIONAL_PROPERTIES__COMMENT:
			getComment().clear();
			getComment().addAll((Collection<? extends String>) newValue);
			return;
		case ICalPackage.COMPONENT_ACTION_OPTIONAL_PROPERTIES__CONTACT:
			getContact().clear();
			getContact().addAll((Collection<? extends String>) newValue);
			return;
		case ICalPackage.COMPONENT_ACTION_OPTIONAL_PROPERTIES__EXDATE:
			getExdate().clear();
			getExdate().addAll((Collection<? extends String>) newValue);
			return;
		case ICalPackage.COMPONENT_ACTION_OPTIONAL_PROPERTIES__RSTATUS:
			getRstatus().clear();
			getRstatus().addAll((Collection<? extends String>) newValue);
			return;
		case ICalPackage.COMPONENT_ACTION_OPTIONAL_PROPERTIES__RELATED:
			getRelated().clear();
			getRelated().addAll((Collection<? extends String>) newValue);
			return;
		case ICalPackage.COMPONENT_ACTION_OPTIONAL_PROPERTIES__RESOURCES:
			getResources().clear();
			getResources().addAll((Collection<? extends String>) newValue);
			return;
		case ICalPackage.COMPONENT_ACTION_OPTIONAL_PROPERTIES__RDATE:
			getRdate().clear();
			getRdate().addAll((Collection<? extends String>) newValue);
			return;
		case ICalPackage.COMPONENT_ACTION_OPTIONAL_PROPERTIES__XPROP:
			getX_prop().clear();
			getX_prop().addAll((Collection<? extends String>) newValue);
			return;
		case ICalPackage.COMPONENT_ACTION_OPTIONAL_PROPERTIES__IANA_PROP:
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
		case ICalPackage.COMPONENT_ACTION_OPTIONAL_PROPERTIES__RRULE:
			getRrule().clear();
			return;
		case ICalPackage.COMPONENT_ACTION_OPTIONAL_PROPERTIES__ATTACH:
			getAttach().clear();
			return;
		case ICalPackage.COMPONENT_ACTION_OPTIONAL_PROPERTIES__ATTENDEE:
			getAttendee().clear();
			return;
		case ICalPackage.COMPONENT_ACTION_OPTIONAL_PROPERTIES__CATEGORIES:
			getCategories().clear();
			return;
		case ICalPackage.COMPONENT_ACTION_OPTIONAL_PROPERTIES__COMMENT:
			getComment().clear();
			return;
		case ICalPackage.COMPONENT_ACTION_OPTIONAL_PROPERTIES__CONTACT:
			getContact().clear();
			return;
		case ICalPackage.COMPONENT_ACTION_OPTIONAL_PROPERTIES__EXDATE:
			getExdate().clear();
			return;
		case ICalPackage.COMPONENT_ACTION_OPTIONAL_PROPERTIES__RSTATUS:
			getRstatus().clear();
			return;
		case ICalPackage.COMPONENT_ACTION_OPTIONAL_PROPERTIES__RELATED:
			getRelated().clear();
			return;
		case ICalPackage.COMPONENT_ACTION_OPTIONAL_PROPERTIES__RESOURCES:
			getResources().clear();
			return;
		case ICalPackage.COMPONENT_ACTION_OPTIONAL_PROPERTIES__RDATE:
			getRdate().clear();
			return;
		case ICalPackage.COMPONENT_ACTION_OPTIONAL_PROPERTIES__XPROP:
			getX_prop().clear();
			return;
		case ICalPackage.COMPONENT_ACTION_OPTIONAL_PROPERTIES__IANA_PROP:
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
		case ICalPackage.COMPONENT_ACTION_OPTIONAL_PROPERTIES__RRULE:
			return rrule != null && !rrule.isEmpty();
		case ICalPackage.COMPONENT_ACTION_OPTIONAL_PROPERTIES__ATTACH:
			return attach != null && !attach.isEmpty();
		case ICalPackage.COMPONENT_ACTION_OPTIONAL_PROPERTIES__ATTENDEE:
			return attendee != null && !attendee.isEmpty();
		case ICalPackage.COMPONENT_ACTION_OPTIONAL_PROPERTIES__CATEGORIES:
			return categories != null && !categories.isEmpty();
		case ICalPackage.COMPONENT_ACTION_OPTIONAL_PROPERTIES__COMMENT:
			return comment != null && !comment.isEmpty();
		case ICalPackage.COMPONENT_ACTION_OPTIONAL_PROPERTIES__CONTACT:
			return contact != null && !contact.isEmpty();
		case ICalPackage.COMPONENT_ACTION_OPTIONAL_PROPERTIES__EXDATE:
			return exdate != null && !exdate.isEmpty();
		case ICalPackage.COMPONENT_ACTION_OPTIONAL_PROPERTIES__RSTATUS:
			return rstatus != null && !rstatus.isEmpty();
		case ICalPackage.COMPONENT_ACTION_OPTIONAL_PROPERTIES__RELATED:
			return related != null && !related.isEmpty();
		case ICalPackage.COMPONENT_ACTION_OPTIONAL_PROPERTIES__RESOURCES:
			return resources != null && !resources.isEmpty();
		case ICalPackage.COMPONENT_ACTION_OPTIONAL_PROPERTIES__RDATE:
			return rdate != null && !rdate.isEmpty();
		case ICalPackage.COMPONENT_ACTION_OPTIONAL_PROPERTIES__XPROP:
			return x_prop != null && !x_prop.isEmpty();
		case ICalPackage.COMPONENT_ACTION_OPTIONAL_PROPERTIES__IANA_PROP:
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
		result.append(" (rrule: ");
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
		result.append(')');
		return result.toString();
	}

} //ComponentActionOptionalPropertiesImpl
