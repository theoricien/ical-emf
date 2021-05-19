/**
 */
package iCal;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see iCal.ICalFactory
 * @model kind="package"
 * @generated
 */
public interface ICalPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "iCal";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/iCal";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "iCal";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ICalPackage eINSTANCE = iCal.impl.ICalPackageImpl.init();

	/**
	 * The meta object id for the '{@link iCal.impl.iCalFormatImpl <em>iCal Format</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iCal.impl.iCalFormatImpl
	 * @see iCal.impl.ICalPackageImpl#getiCalFormat()
	 * @generated
	 */
	int ICAL_FORMAT = 0;

	/**
	 * The feature id for the '<em><b>Calendar</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICAL_FORMAT__CALENDAR = 0;

	/**
	 * The number of structural features of the '<em>iCal Format</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICAL_FORMAT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>iCal Format</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICAL_FORMAT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iCal.impl.ComponentImpl <em>Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iCal.impl.ComponentImpl
	 * @see iCal.impl.ICalPackageImpl#getComponent()
	 * @generated
	 */
	int COMPONENT = 1;

	/**
	 * The number of structural features of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iCal.impl.ComponentRequiredImpl <em>Component Required</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iCal.impl.ComponentRequiredImpl
	 * @see iCal.impl.ICalPackageImpl#getComponentRequired()
	 * @generated
	 */
	int COMPONENT_REQUIRED = 8;

	/**
	 * The feature id for the '<em><b>Dtstamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_REQUIRED__DTSTAMP = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_REQUIRED__UID = COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Component Required</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_REQUIRED_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Component Required</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_REQUIRED_OPERATION_COUNT = COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iCal.impl.ComponentActionImpl <em>Component Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iCal.impl.ComponentActionImpl
	 * @see iCal.impl.ICalPackageImpl#getComponentAction()
	 * @generated
	 */
	int COMPONENT_ACTION = 5;

	/**
	 * The feature id for the '<em><b>Dtstamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_ACTION__DTSTAMP = COMPONENT_REQUIRED__DTSTAMP;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_ACTION__UID = COMPONENT_REQUIRED__UID;

	/**
	 * The feature id for the '<em><b>Dtstart</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_ACTION__DTSTART = COMPONENT_REQUIRED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_ACTION__CLASS = COMPONENT_REQUIRED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_ACTION__CREATED = COMPONENT_REQUIRED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last mod</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_ACTION__LAST_MOD = COMPONENT_REQUIRED_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Organizer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_ACTION__ORGANIZER = COMPONENT_REQUIRED_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Seq</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_ACTION__SEQ = COMPONENT_REQUIRED_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_ACTION__STATUS = COMPONENT_REQUIRED_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_ACTION__SUMMARY = COMPONENT_REQUIRED_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_ACTION__URL = COMPONENT_REQUIRED_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Recurid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_ACTION__RECURID = COMPONENT_REQUIRED_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Rrule</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_ACTION__RRULE = COMPONENT_REQUIRED_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Attach</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_ACTION__ATTACH = COMPONENT_REQUIRED_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Attendee</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_ACTION__ATTENDEE = COMPONENT_REQUIRED_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Categories</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_ACTION__CATEGORIES = COMPONENT_REQUIRED_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_ACTION__COMMENT = COMPONENT_REQUIRED_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Contact</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_ACTION__CONTACT = COMPONENT_REQUIRED_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Exdate</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_ACTION__EXDATE = COMPONENT_REQUIRED_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Rstatus</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_ACTION__RSTATUS = COMPONENT_REQUIRED_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Related</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_ACTION__RELATED = COMPONENT_REQUIRED_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_ACTION__RESOURCES = COMPONENT_REQUIRED_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Rdate</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_ACTION__RDATE = COMPONENT_REQUIRED_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Xprop</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_ACTION__XPROP = COMPONENT_REQUIRED_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Iana prop</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_ACTION__IANA_PROP = COMPONENT_REQUIRED_FEATURE_COUNT + 22;

	/**
	 * The number of structural features of the '<em>Component Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_ACTION_FEATURE_COUNT = COMPONENT_REQUIRED_FEATURE_COUNT + 23;

	/**
	 * The number of operations of the '<em>Component Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_ACTION_OPERATION_COUNT = COMPONENT_REQUIRED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iCal.impl.EventCImpl <em>Event C</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iCal.impl.EventCImpl
	 * @see iCal.impl.ICalPackageImpl#getEventC()
	 * @generated
	 */
	int EVENT_C = 2;

	/**
	 * The feature id for the '<em><b>Dtstamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_C__DTSTAMP = COMPONENT_ACTION__DTSTAMP;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_C__UID = COMPONENT_ACTION__UID;

	/**
	 * The feature id for the '<em><b>Dtstart</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_C__DTSTART = COMPONENT_ACTION__DTSTART;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_C__CLASS = COMPONENT_ACTION__CLASS;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_C__CREATED = COMPONENT_ACTION__CREATED;

	/**
	 * The feature id for the '<em><b>Last mod</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_C__LAST_MOD = COMPONENT_ACTION__LAST_MOD;

	/**
	 * The feature id for the '<em><b>Organizer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_C__ORGANIZER = COMPONENT_ACTION__ORGANIZER;

	/**
	 * The feature id for the '<em><b>Seq</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_C__SEQ = COMPONENT_ACTION__SEQ;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_C__STATUS = COMPONENT_ACTION__STATUS;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_C__SUMMARY = COMPONENT_ACTION__SUMMARY;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_C__URL = COMPONENT_ACTION__URL;

	/**
	 * The feature id for the '<em><b>Recurid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_C__RECURID = COMPONENT_ACTION__RECURID;

	/**
	 * The feature id for the '<em><b>Rrule</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_C__RRULE = COMPONENT_ACTION__RRULE;

	/**
	 * The feature id for the '<em><b>Attach</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_C__ATTACH = COMPONENT_ACTION__ATTACH;

	/**
	 * The feature id for the '<em><b>Attendee</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_C__ATTENDEE = COMPONENT_ACTION__ATTENDEE;

	/**
	 * The feature id for the '<em><b>Categories</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_C__CATEGORIES = COMPONENT_ACTION__CATEGORIES;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_C__COMMENT = COMPONENT_ACTION__COMMENT;

	/**
	 * The feature id for the '<em><b>Contact</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_C__CONTACT = COMPONENT_ACTION__CONTACT;

	/**
	 * The feature id for the '<em><b>Exdate</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_C__EXDATE = COMPONENT_ACTION__EXDATE;

	/**
	 * The feature id for the '<em><b>Rstatus</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_C__RSTATUS = COMPONENT_ACTION__RSTATUS;

	/**
	 * The feature id for the '<em><b>Related</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_C__RELATED = COMPONENT_ACTION__RELATED;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_C__RESOURCES = COMPONENT_ACTION__RESOURCES;

	/**
	 * The feature id for the '<em><b>Rdate</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_C__RDATE = COMPONENT_ACTION__RDATE;

	/**
	 * The feature id for the '<em><b>Xprop</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_C__XPROP = COMPONENT_ACTION__XPROP;

	/**
	 * The feature id for the '<em><b>Iana prop</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_C__IANA_PROP = COMPONENT_ACTION__IANA_PROP;

	/**
	 * The feature id for the '<em><b>Transp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_C__TRANSP = COMPONENT_ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_C__DESCRIPTION = COMPONENT_ACTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_C__PRIORITY = COMPONENT_ACTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Geo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_C__GEO = COMPONENT_ACTION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_C__LOCATION = COMPONENT_ACTION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_C__DURATION = COMPONENT_ACTION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Alarmc</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_C__ALARMC = COMPONENT_ACTION_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Event C</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_C_FEATURE_COUNT = COMPONENT_ACTION_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Event C</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_C_OPERATION_COUNT = COMPONENT_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iCal.impl.ToDoCImpl <em>To Do C</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iCal.impl.ToDoCImpl
	 * @see iCal.impl.ICalPackageImpl#getToDoC()
	 * @generated
	 */
	int TO_DO_C = 3;

	/**
	 * The feature id for the '<em><b>Dtstamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_DO_C__DTSTAMP = COMPONENT_ACTION__DTSTAMP;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_DO_C__UID = COMPONENT_ACTION__UID;

	/**
	 * The feature id for the '<em><b>Dtstart</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_DO_C__DTSTART = COMPONENT_ACTION__DTSTART;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_DO_C__CLASS = COMPONENT_ACTION__CLASS;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_DO_C__CREATED = COMPONENT_ACTION__CREATED;

	/**
	 * The feature id for the '<em><b>Last mod</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_DO_C__LAST_MOD = COMPONENT_ACTION__LAST_MOD;

	/**
	 * The feature id for the '<em><b>Organizer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_DO_C__ORGANIZER = COMPONENT_ACTION__ORGANIZER;

	/**
	 * The feature id for the '<em><b>Seq</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_DO_C__SEQ = COMPONENT_ACTION__SEQ;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_DO_C__STATUS = COMPONENT_ACTION__STATUS;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_DO_C__SUMMARY = COMPONENT_ACTION__SUMMARY;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_DO_C__URL = COMPONENT_ACTION__URL;

	/**
	 * The feature id for the '<em><b>Recurid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_DO_C__RECURID = COMPONENT_ACTION__RECURID;

	/**
	 * The feature id for the '<em><b>Rrule</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_DO_C__RRULE = COMPONENT_ACTION__RRULE;

	/**
	 * The feature id for the '<em><b>Attach</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_DO_C__ATTACH = COMPONENT_ACTION__ATTACH;

	/**
	 * The feature id for the '<em><b>Attendee</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_DO_C__ATTENDEE = COMPONENT_ACTION__ATTENDEE;

	/**
	 * The feature id for the '<em><b>Categories</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_DO_C__CATEGORIES = COMPONENT_ACTION__CATEGORIES;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_DO_C__COMMENT = COMPONENT_ACTION__COMMENT;

	/**
	 * The feature id for the '<em><b>Contact</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_DO_C__CONTACT = COMPONENT_ACTION__CONTACT;

	/**
	 * The feature id for the '<em><b>Exdate</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_DO_C__EXDATE = COMPONENT_ACTION__EXDATE;

	/**
	 * The feature id for the '<em><b>Rstatus</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_DO_C__RSTATUS = COMPONENT_ACTION__RSTATUS;

	/**
	 * The feature id for the '<em><b>Related</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_DO_C__RELATED = COMPONENT_ACTION__RELATED;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_DO_C__RESOURCES = COMPONENT_ACTION__RESOURCES;

	/**
	 * The feature id for the '<em><b>Rdate</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_DO_C__RDATE = COMPONENT_ACTION__RDATE;

	/**
	 * The feature id for the '<em><b>Xprop</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_DO_C__XPROP = COMPONENT_ACTION__XPROP;

	/**
	 * The feature id for the '<em><b>Iana prop</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_DO_C__IANA_PROP = COMPONENT_ACTION__IANA_PROP;

	/**
	 * The feature id for the '<em><b>Completed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_DO_C__COMPLETED = COMPONENT_ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_DO_C__DESCRIPTION = COMPONENT_ACTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_DO_C__PRIORITY = COMPONENT_ACTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Geo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_DO_C__GEO = COMPONENT_ACTION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_DO_C__LOCATION = COMPONENT_ACTION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_DO_C__DURATION = COMPONENT_ACTION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Alarmc</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_DO_C__ALARMC = COMPONENT_ACTION_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>To Do C</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_DO_C_FEATURE_COUNT = COMPONENT_ACTION_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>To Do C</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_DO_C_OPERATION_COUNT = COMPONENT_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iCal.impl.CalendarImpl <em>Calendar</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iCal.impl.CalendarImpl
	 * @see iCal.impl.ICalPackageImpl#getCalendar()
	 * @generated
	 */
	int CALENDAR = 4;

	/**
	 * The feature id for the '<em><b>Prodid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALENDAR__PRODID = 0;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALENDAR__VERSION = 1;

	/**
	 * The feature id for the '<em><b>Calscale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALENDAR__CALSCALE = 2;

	/**
	 * The feature id for the '<em><b>Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALENDAR__METHOD = 3;

	/**
	 * The feature id for the '<em><b>Xprop</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALENDAR__XPROP = 4;

	/**
	 * The feature id for the '<em><b>Iana prop</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALENDAR__IANA_PROP = 5;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALENDAR__COMPONENT = 6;

	/**
	 * The number of structural features of the '<em>Calendar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALENDAR_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Calendar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALENDAR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iCal.impl.JournalCImpl <em>Journal C</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iCal.impl.JournalCImpl
	 * @see iCal.impl.ICalPackageImpl#getJournalC()
	 * @generated
	 */
	int JOURNAL_C = 6;

	/**
	 * The feature id for the '<em><b>Dtstamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNAL_C__DTSTAMP = COMPONENT_ACTION__DTSTAMP;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNAL_C__UID = COMPONENT_ACTION__UID;

	/**
	 * The feature id for the '<em><b>Dtstart</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNAL_C__DTSTART = COMPONENT_ACTION__DTSTART;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNAL_C__CLASS = COMPONENT_ACTION__CLASS;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNAL_C__CREATED = COMPONENT_ACTION__CREATED;

	/**
	 * The feature id for the '<em><b>Last mod</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNAL_C__LAST_MOD = COMPONENT_ACTION__LAST_MOD;

	/**
	 * The feature id for the '<em><b>Organizer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNAL_C__ORGANIZER = COMPONENT_ACTION__ORGANIZER;

	/**
	 * The feature id for the '<em><b>Seq</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNAL_C__SEQ = COMPONENT_ACTION__SEQ;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNAL_C__STATUS = COMPONENT_ACTION__STATUS;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNAL_C__SUMMARY = COMPONENT_ACTION__SUMMARY;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNAL_C__URL = COMPONENT_ACTION__URL;

	/**
	 * The feature id for the '<em><b>Recurid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNAL_C__RECURID = COMPONENT_ACTION__RECURID;

	/**
	 * The feature id for the '<em><b>Rrule</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNAL_C__RRULE = COMPONENT_ACTION__RRULE;

	/**
	 * The feature id for the '<em><b>Attach</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNAL_C__ATTACH = COMPONENT_ACTION__ATTACH;

	/**
	 * The feature id for the '<em><b>Attendee</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNAL_C__ATTENDEE = COMPONENT_ACTION__ATTENDEE;

	/**
	 * The feature id for the '<em><b>Categories</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNAL_C__CATEGORIES = COMPONENT_ACTION__CATEGORIES;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNAL_C__COMMENT = COMPONENT_ACTION__COMMENT;

	/**
	 * The feature id for the '<em><b>Contact</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNAL_C__CONTACT = COMPONENT_ACTION__CONTACT;

	/**
	 * The feature id for the '<em><b>Exdate</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNAL_C__EXDATE = COMPONENT_ACTION__EXDATE;

	/**
	 * The feature id for the '<em><b>Rstatus</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNAL_C__RSTATUS = COMPONENT_ACTION__RSTATUS;

	/**
	 * The feature id for the '<em><b>Related</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNAL_C__RELATED = COMPONENT_ACTION__RELATED;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNAL_C__RESOURCES = COMPONENT_ACTION__RESOURCES;

	/**
	 * The feature id for the '<em><b>Rdate</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNAL_C__RDATE = COMPONENT_ACTION__RDATE;

	/**
	 * The feature id for the '<em><b>Xprop</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNAL_C__XPROP = COMPONENT_ACTION__XPROP;

	/**
	 * The feature id for the '<em><b>Iana prop</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNAL_C__IANA_PROP = COMPONENT_ACTION__IANA_PROP;

	/**
	 * The number of structural features of the '<em>Journal C</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNAL_C_FEATURE_COUNT = COMPONENT_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Journal C</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNAL_C_OPERATION_COUNT = COMPONENT_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iCal.impl.VacationCImpl <em>Vacation C</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iCal.impl.VacationCImpl
	 * @see iCal.impl.ICalPackageImpl#getVacationC()
	 * @generated
	 */
	int VACATION_C = 7;

	/**
	 * The feature id for the '<em><b>Dtstamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VACATION_C__DTSTAMP = COMPONENT_REQUIRED__DTSTAMP;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VACATION_C__UID = COMPONENT_REQUIRED__UID;

	/**
	 * The feature id for the '<em><b>Dtstart</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VACATION_C__DTSTART = COMPONENT_REQUIRED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Organizer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VACATION_C__ORGANIZER = COMPONENT_REQUIRED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VACATION_C__URL = COMPONENT_REQUIRED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Contact</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VACATION_C__CONTACT = COMPONENT_REQUIRED_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Dtend</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VACATION_C__DTEND = COMPONENT_REQUIRED_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Attendee</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VACATION_C__ATTENDEE = COMPONENT_REQUIRED_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VACATION_C__COMMENT = COMPONENT_REQUIRED_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Freebusy</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VACATION_C__FREEBUSY = COMPONENT_REQUIRED_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Rstatus</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VACATION_C__RSTATUS = COMPONENT_REQUIRED_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Xprop</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VACATION_C__XPROP = COMPONENT_REQUIRED_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Iana prop</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VACATION_C__IANA_PROP = COMPONENT_REQUIRED_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Vacation C</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VACATION_C_FEATURE_COUNT = COMPONENT_REQUIRED_FEATURE_COUNT + 11;

	/**
	 * The number of operations of the '<em>Vacation C</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VACATION_C_OPERATION_COUNT = COMPONENT_REQUIRED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iCal.impl.TimeZoneCImpl <em>Time Zone C</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iCal.impl.TimeZoneCImpl
	 * @see iCal.impl.ICalPackageImpl#getTimeZoneC()
	 * @generated
	 */
	int TIME_ZONE_C = 9;

	/**
	 * The feature id for the '<em><b>Tzid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_ZONE_C__TZID = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Last mod</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_ZONE_C__LAST_MOD = COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Tzurl</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_ZONE_C__TZURL = COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Standardc</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_ZONE_C__STANDARDC = COMPONENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Daylightc</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_ZONE_C__DAYLIGHTC = COMPONENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Xprop</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_ZONE_C__XPROP = COMPONENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Iana prop</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_ZONE_C__IANA_PROP = COMPONENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Time Zone C</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_ZONE_C_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Time Zone C</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_ZONE_C_OPERATION_COUNT = COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iCal.impl.tzpropImpl <em>tzprop</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iCal.impl.tzpropImpl
	 * @see iCal.impl.ICalPackageImpl#gettzprop()
	 * @generated
	 */
	int TZPROP = 10;

	/**
	 * The feature id for the '<em><b>Dtstart</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TZPROP__DTSTART = 0;

	/**
	 * The feature id for the '<em><b>Tzoffseto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TZPROP__TZOFFSETO = 1;

	/**
	 * The feature id for the '<em><b>Tzoffsetfrom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TZPROP__TZOFFSETFROM = 2;

	/**
	 * The feature id for the '<em><b>Rrule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TZPROP__RRULE = 3;

	/**
	 * The feature id for the '<em><b>Opt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TZPROP__OPT = 4;

	/**
	 * The number of structural features of the '<em>tzprop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TZPROP_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>tzprop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TZPROP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iCal.impl.AlarmCImpl <em>Alarm C</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iCal.impl.AlarmCImpl
	 * @see iCal.impl.ICalPackageImpl#getAlarmC()
	 * @generated
	 */
	int ALARM_C = 11;

	/**
	 * The feature id for the '<em><b>Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALARM_C__ACTION = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Trigger</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALARM_C__TRIGGER = COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Xprop</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALARM_C__XPROP = COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Iana prop</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALARM_C__IANA_PROP = COMPONENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Attach</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALARM_C__ATTACH = COMPONENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALARM_C__DESCRIPTION = COMPONENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALARM_C__TYPE = COMPONENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALARM_C__TIME = COMPONENT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Alarm C</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALARM_C_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Alarm C</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALARM_C_OPERATION_COUNT = COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iCal.impl.ComponentAlarmTimeImpl <em>Component Alarm Time</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iCal.impl.ComponentAlarmTimeImpl
	 * @see iCal.impl.ICalPackageImpl#getComponentAlarmTime()
	 * @generated
	 */
	int COMPONENT_ALARM_TIME = 12;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_ALARM_TIME__DURATION = 0;

	/**
	 * The feature id for the '<em><b>Repeat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_ALARM_TIME__REPEAT = 1;

	/**
	 * The number of structural features of the '<em>Component Alarm Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_ALARM_TIME_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Component Alarm Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_ALARM_TIME_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iCal.impl.AlarmTypeImpl <em>Alarm Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iCal.impl.AlarmTypeImpl
	 * @see iCal.impl.ICalPackageImpl#getAlarmType()
	 * @generated
	 */
	int ALARM_TYPE = 16;

	/**
	 * The number of structural features of the '<em>Alarm Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALARM_TYPE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Alarm Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALARM_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iCal.impl.ComponentAlarmAudioPropertyImpl <em>Component Alarm Audio Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iCal.impl.ComponentAlarmAudioPropertyImpl
	 * @see iCal.impl.ICalPackageImpl#getComponentAlarmAudioProperty()
	 * @generated
	 */
	int COMPONENT_ALARM_AUDIO_PROPERTY = 13;

	/**
	 * The feature id for the '<em><b>Attach</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_ALARM_AUDIO_PROPERTY__ATTACH = ALARM_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Component Alarm Audio Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_ALARM_AUDIO_PROPERTY_FEATURE_COUNT = ALARM_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Component Alarm Audio Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_ALARM_AUDIO_PROPERTY_OPERATION_COUNT = ALARM_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iCal.impl.ComponentAlarmDispPropertyImpl <em>Component Alarm Disp Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iCal.impl.ComponentAlarmDispPropertyImpl
	 * @see iCal.impl.ICalPackageImpl#getComponentAlarmDispProperty()
	 * @generated
	 */
	int COMPONENT_ALARM_DISP_PROPERTY = 14;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_ALARM_DISP_PROPERTY__DESCRIPTION = ALARM_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Component Alarm Disp Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_ALARM_DISP_PROPERTY_FEATURE_COUNT = ALARM_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Component Alarm Disp Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_ALARM_DISP_PROPERTY_OPERATION_COUNT = ALARM_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iCal.impl.ComponentAlarmEmailPropertyImpl <em>Component Alarm Email Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iCal.impl.ComponentAlarmEmailPropertyImpl
	 * @see iCal.impl.ICalPackageImpl#getComponentAlarmEmailProperty()
	 * @generated
	 */
	int COMPONENT_ALARM_EMAIL_PROPERTY = 15;

	/**
	 * The feature id for the '<em><b>Attendee</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_ALARM_EMAIL_PROPERTY__ATTENDEE = ALARM_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_ALARM_EMAIL_PROPERTY__DESCRIPTION = ALARM_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Attach</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_ALARM_EMAIL_PROPERTY__ATTACH = ALARM_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Component Alarm Email Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_ALARM_EMAIL_PROPERTY_FEATURE_COUNT = ALARM_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Component Alarm Email Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_ALARM_EMAIL_PROPERTY_OPERATION_COUNT = ALARM_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iCal.impl.tzpropOptionalImpl <em>tzprop Optional</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iCal.impl.tzpropOptionalImpl
	 * @see iCal.impl.ICalPackageImpl#gettzpropOptional()
	 * @generated
	 */
	int TZPROP_OPTIONAL = 17;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TZPROP_OPTIONAL__COMMENT = 0;

	/**
	 * The feature id for the '<em><b>Rdate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TZPROP_OPTIONAL__RDATE = 1;

	/**
	 * The feature id for the '<em><b>Tzname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TZPROP_OPTIONAL__TZNAME = 2;

	/**
	 * The feature id for the '<em><b>Xprop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TZPROP_OPTIONAL__XPROP = 3;

	/**
	 * The feature id for the '<em><b>Iana prop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TZPROP_OPTIONAL__IANA_PROP = 4;

	/**
	 * The number of structural features of the '<em>tzprop Optional</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TZPROP_OPTIONAL_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>tzprop Optional</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TZPROP_OPTIONAL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '<em>String</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see iCal.impl.ICalPackageImpl#getString()
	 * @generated
	 */
	int STRING = 18;

	/**
	 * The meta object id for the '<em>Integer</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Integer
	 * @see iCal.impl.ICalPackageImpl#getInteger()
	 * @generated
	 */
	int INTEGER = 19;

	/**
	 * The meta object id for the '<em>Float</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Float
	 * @see iCal.impl.ICalPackageImpl#getFloat()
	 * @generated
	 */
	int FLOAT = 20;

	/**
	 * Returns the meta object for class '{@link iCal.iCalFormat <em>iCal Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>iCal Format</em>'.
	 * @see iCal.iCalFormat
	 * @generated
	 */
	EClass getiCalFormat();

	/**
	 * Returns the meta object for the containment reference '{@link iCal.iCalFormat#getCalendar <em>Calendar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Calendar</em>'.
	 * @see iCal.iCalFormat#getCalendar()
	 * @see #getiCalFormat()
	 * @generated
	 */
	EReference getiCalFormat_Calendar();

	/**
	 * Returns the meta object for class '{@link iCal.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component</em>'.
	 * @see iCal.Component
	 * @generated
	 */
	EClass getComponent();

	/**
	 * Returns the meta object for class '{@link iCal.EventC <em>Event C</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event C</em>'.
	 * @see iCal.EventC
	 * @generated
	 */
	EClass getEventC();

	/**
	 * Returns the meta object for the attribute '{@link iCal.EventC#getTransp <em>Transp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transp</em>'.
	 * @see iCal.EventC#getTransp()
	 * @see #getEventC()
	 * @generated
	 */
	EAttribute getEventC_Transp();

	/**
	 * Returns the meta object for the attribute '{@link iCal.EventC#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see iCal.EventC#getDescription()
	 * @see #getEventC()
	 * @generated
	 */
	EAttribute getEventC_Description();

	/**
	 * Returns the meta object for the attribute '{@link iCal.EventC#getPriority <em>Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Priority</em>'.
	 * @see iCal.EventC#getPriority()
	 * @see #getEventC()
	 * @generated
	 */
	EAttribute getEventC_Priority();

	/**
	 * Returns the meta object for the attribute '{@link iCal.EventC#getGeo <em>Geo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Geo</em>'.
	 * @see iCal.EventC#getGeo()
	 * @see #getEventC()
	 * @generated
	 */
	EAttribute getEventC_Geo();

	/**
	 * Returns the meta object for the attribute '{@link iCal.EventC#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see iCal.EventC#getLocation()
	 * @see #getEventC()
	 * @generated
	 */
	EAttribute getEventC_Location();

	/**
	 * Returns the meta object for the attribute '{@link iCal.EventC#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration</em>'.
	 * @see iCal.EventC#getDuration()
	 * @see #getEventC()
	 * @generated
	 */
	EAttribute getEventC_Duration();

	/**
	 * Returns the meta object for the containment reference list '{@link iCal.EventC#getAlarmc <em>Alarmc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Alarmc</em>'.
	 * @see iCal.EventC#getAlarmc()
	 * @see #getEventC()
	 * @generated
	 */
	EReference getEventC_Alarmc();

	/**
	 * Returns the meta object for class '{@link iCal.ToDoC <em>To Do C</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>To Do C</em>'.
	 * @see iCal.ToDoC
	 * @generated
	 */
	EClass getToDoC();

	/**
	 * Returns the meta object for the attribute '{@link iCal.ToDoC#getCompleted <em>Completed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Completed</em>'.
	 * @see iCal.ToDoC#getCompleted()
	 * @see #getToDoC()
	 * @generated
	 */
	EAttribute getToDoC_Completed();

	/**
	 * Returns the meta object for the attribute '{@link iCal.ToDoC#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see iCal.ToDoC#getDescription()
	 * @see #getToDoC()
	 * @generated
	 */
	EAttribute getToDoC_Description();

	/**
	 * Returns the meta object for the attribute '{@link iCal.ToDoC#getPriority <em>Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Priority</em>'.
	 * @see iCal.ToDoC#getPriority()
	 * @see #getToDoC()
	 * @generated
	 */
	EAttribute getToDoC_Priority();

	/**
	 * Returns the meta object for the attribute '{@link iCal.ToDoC#getGeo <em>Geo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Geo</em>'.
	 * @see iCal.ToDoC#getGeo()
	 * @see #getToDoC()
	 * @generated
	 */
	EAttribute getToDoC_Geo();

	/**
	 * Returns the meta object for the attribute '{@link iCal.ToDoC#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see iCal.ToDoC#getLocation()
	 * @see #getToDoC()
	 * @generated
	 */
	EAttribute getToDoC_Location();

	/**
	 * Returns the meta object for the attribute '{@link iCal.ToDoC#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration</em>'.
	 * @see iCal.ToDoC#getDuration()
	 * @see #getToDoC()
	 * @generated
	 */
	EAttribute getToDoC_Duration();

	/**
	 * Returns the meta object for the containment reference list '{@link iCal.ToDoC#getAlarmc <em>Alarmc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Alarmc</em>'.
	 * @see iCal.ToDoC#getAlarmc()
	 * @see #getToDoC()
	 * @generated
	 */
	EReference getToDoC_Alarmc();

	/**
	 * Returns the meta object for class '{@link iCal.Calendar <em>Calendar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Calendar</em>'.
	 * @see iCal.Calendar
	 * @generated
	 */
	EClass getCalendar();

	/**
	 * Returns the meta object for the attribute '{@link iCal.Calendar#getProdid <em>Prodid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prodid</em>'.
	 * @see iCal.Calendar#getProdid()
	 * @see #getCalendar()
	 * @generated
	 */
	EAttribute getCalendar_Prodid();

	/**
	 * Returns the meta object for the attribute '{@link iCal.Calendar#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see iCal.Calendar#getVersion()
	 * @see #getCalendar()
	 * @generated
	 */
	EAttribute getCalendar_Version();

	/**
	 * Returns the meta object for the attribute '{@link iCal.Calendar#getCalscale <em>Calscale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Calscale</em>'.
	 * @see iCal.Calendar#getCalscale()
	 * @see #getCalendar()
	 * @generated
	 */
	EAttribute getCalendar_Calscale();

	/**
	 * Returns the meta object for the attribute '{@link iCal.Calendar#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Method</em>'.
	 * @see iCal.Calendar#getMethod()
	 * @see #getCalendar()
	 * @generated
	 */
	EAttribute getCalendar_Method();

	/**
	 * Returns the meta object for the attribute list '{@link iCal.Calendar#getX_prop <em>Xprop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Xprop</em>'.
	 * @see iCal.Calendar#getX_prop()
	 * @see #getCalendar()
	 * @generated
	 */
	EAttribute getCalendar_X_prop();

	/**
	 * Returns the meta object for the attribute list '{@link iCal.Calendar#getIana_prop <em>Iana prop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Iana prop</em>'.
	 * @see iCal.Calendar#getIana_prop()
	 * @see #getCalendar()
	 * @generated
	 */
	EAttribute getCalendar_Iana_prop();

	/**
	 * Returns the meta object for the containment reference list '{@link iCal.Calendar#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Component</em>'.
	 * @see iCal.Calendar#getComponent()
	 * @see #getCalendar()
	 * @generated
	 */
	EReference getCalendar_Component();

	/**
	 * Returns the meta object for class '{@link iCal.ComponentAction <em>Component Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Action</em>'.
	 * @see iCal.ComponentAction
	 * @generated
	 */
	EClass getComponentAction();

	/**
	 * Returns the meta object for the attribute '{@link iCal.ComponentAction#getDtstart <em>Dtstart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dtstart</em>'.
	 * @see iCal.ComponentAction#getDtstart()
	 * @see #getComponentAction()
	 * @generated
	 */
	EAttribute getComponentAction_Dtstart();

	/**
	 * Returns the meta object for the attribute '{@link iCal.ComponentAction#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see iCal.ComponentAction#getClass_()
	 * @see #getComponentAction()
	 * @generated
	 */
	EAttribute getComponentAction_Class();

	/**
	 * Returns the meta object for the attribute '{@link iCal.ComponentAction#getCreated <em>Created</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Created</em>'.
	 * @see iCal.ComponentAction#getCreated()
	 * @see #getComponentAction()
	 * @generated
	 */
	EAttribute getComponentAction_Created();

	/**
	 * Returns the meta object for the attribute '{@link iCal.ComponentAction#getLast_mod <em>Last mod</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last mod</em>'.
	 * @see iCal.ComponentAction#getLast_mod()
	 * @see #getComponentAction()
	 * @generated
	 */
	EAttribute getComponentAction_Last_mod();

	/**
	 * Returns the meta object for the attribute '{@link iCal.ComponentAction#getOrganizer <em>Organizer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Organizer</em>'.
	 * @see iCal.ComponentAction#getOrganizer()
	 * @see #getComponentAction()
	 * @generated
	 */
	EAttribute getComponentAction_Organizer();

	/**
	 * Returns the meta object for the attribute '{@link iCal.ComponentAction#getSeq <em>Seq</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Seq</em>'.
	 * @see iCal.ComponentAction#getSeq()
	 * @see #getComponentAction()
	 * @generated
	 */
	EAttribute getComponentAction_Seq();

	/**
	 * Returns the meta object for the attribute '{@link iCal.ComponentAction#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see iCal.ComponentAction#getStatus()
	 * @see #getComponentAction()
	 * @generated
	 */
	EAttribute getComponentAction_Status();

	/**
	 * Returns the meta object for the attribute '{@link iCal.ComponentAction#getSummary <em>Summary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Summary</em>'.
	 * @see iCal.ComponentAction#getSummary()
	 * @see #getComponentAction()
	 * @generated
	 */
	EAttribute getComponentAction_Summary();

	/**
	 * Returns the meta object for the attribute '{@link iCal.ComponentAction#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see iCal.ComponentAction#getUrl()
	 * @see #getComponentAction()
	 * @generated
	 */
	EAttribute getComponentAction_Url();

	/**
	 * Returns the meta object for the attribute '{@link iCal.ComponentAction#getRecurid <em>Recurid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Recurid</em>'.
	 * @see iCal.ComponentAction#getRecurid()
	 * @see #getComponentAction()
	 * @generated
	 */
	EAttribute getComponentAction_Recurid();

	/**
	 * Returns the meta object for the attribute list '{@link iCal.ComponentAction#getRrule <em>Rrule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Rrule</em>'.
	 * @see iCal.ComponentAction#getRrule()
	 * @see #getComponentAction()
	 * @generated
	 */
	EAttribute getComponentAction_Rrule();

	/**
	 * Returns the meta object for the attribute list '{@link iCal.ComponentAction#getAttach <em>Attach</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Attach</em>'.
	 * @see iCal.ComponentAction#getAttach()
	 * @see #getComponentAction()
	 * @generated
	 */
	EAttribute getComponentAction_Attach();

	/**
	 * Returns the meta object for the attribute list '{@link iCal.ComponentAction#getAttendee <em>Attendee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Attendee</em>'.
	 * @see iCal.ComponentAction#getAttendee()
	 * @see #getComponentAction()
	 * @generated
	 */
	EAttribute getComponentAction_Attendee();

	/**
	 * Returns the meta object for the attribute list '{@link iCal.ComponentAction#getCategories <em>Categories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Categories</em>'.
	 * @see iCal.ComponentAction#getCategories()
	 * @see #getComponentAction()
	 * @generated
	 */
	EAttribute getComponentAction_Categories();

	/**
	 * Returns the meta object for the attribute list '{@link iCal.ComponentAction#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Comment</em>'.
	 * @see iCal.ComponentAction#getComment()
	 * @see #getComponentAction()
	 * @generated
	 */
	EAttribute getComponentAction_Comment();

	/**
	 * Returns the meta object for the attribute list '{@link iCal.ComponentAction#getContact <em>Contact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Contact</em>'.
	 * @see iCal.ComponentAction#getContact()
	 * @see #getComponentAction()
	 * @generated
	 */
	EAttribute getComponentAction_Contact();

	/**
	 * Returns the meta object for the attribute list '{@link iCal.ComponentAction#getExdate <em>Exdate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Exdate</em>'.
	 * @see iCal.ComponentAction#getExdate()
	 * @see #getComponentAction()
	 * @generated
	 */
	EAttribute getComponentAction_Exdate();

	/**
	 * Returns the meta object for the attribute list '{@link iCal.ComponentAction#getRstatus <em>Rstatus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Rstatus</em>'.
	 * @see iCal.ComponentAction#getRstatus()
	 * @see #getComponentAction()
	 * @generated
	 */
	EAttribute getComponentAction_Rstatus();

	/**
	 * Returns the meta object for the attribute list '{@link iCal.ComponentAction#getRelated <em>Related</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Related</em>'.
	 * @see iCal.ComponentAction#getRelated()
	 * @see #getComponentAction()
	 * @generated
	 */
	EAttribute getComponentAction_Related();

	/**
	 * Returns the meta object for the attribute list '{@link iCal.ComponentAction#getResources <em>Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Resources</em>'.
	 * @see iCal.ComponentAction#getResources()
	 * @see #getComponentAction()
	 * @generated
	 */
	EAttribute getComponentAction_Resources();

	/**
	 * Returns the meta object for the attribute list '{@link iCal.ComponentAction#getRdate <em>Rdate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Rdate</em>'.
	 * @see iCal.ComponentAction#getRdate()
	 * @see #getComponentAction()
	 * @generated
	 */
	EAttribute getComponentAction_Rdate();

	/**
	 * Returns the meta object for the attribute list '{@link iCal.ComponentAction#getX_prop <em>Xprop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Xprop</em>'.
	 * @see iCal.ComponentAction#getX_prop()
	 * @see #getComponentAction()
	 * @generated
	 */
	EAttribute getComponentAction_X_prop();

	/**
	 * Returns the meta object for the attribute list '{@link iCal.ComponentAction#getIana_prop <em>Iana prop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Iana prop</em>'.
	 * @see iCal.ComponentAction#getIana_prop()
	 * @see #getComponentAction()
	 * @generated
	 */
	EAttribute getComponentAction_Iana_prop();

	/**
	 * Returns the meta object for class '{@link iCal.JournalC <em>Journal C</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Journal C</em>'.
	 * @see iCal.JournalC
	 * @generated
	 */
	EClass getJournalC();

	/**
	 * Returns the meta object for class '{@link iCal.VacationC <em>Vacation C</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vacation C</em>'.
	 * @see iCal.VacationC
	 * @generated
	 */
	EClass getVacationC();

	/**
	 * Returns the meta object for the attribute '{@link iCal.VacationC#getDtstart <em>Dtstart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dtstart</em>'.
	 * @see iCal.VacationC#getDtstart()
	 * @see #getVacationC()
	 * @generated
	 */
	EAttribute getVacationC_Dtstart();

	/**
	 * Returns the meta object for the attribute '{@link iCal.VacationC#getOrganizer <em>Organizer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Organizer</em>'.
	 * @see iCal.VacationC#getOrganizer()
	 * @see #getVacationC()
	 * @generated
	 */
	EAttribute getVacationC_Organizer();

	/**
	 * Returns the meta object for the attribute '{@link iCal.VacationC#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see iCal.VacationC#getUrl()
	 * @see #getVacationC()
	 * @generated
	 */
	EAttribute getVacationC_Url();

	/**
	 * Returns the meta object for the attribute '{@link iCal.VacationC#getContact <em>Contact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Contact</em>'.
	 * @see iCal.VacationC#getContact()
	 * @see #getVacationC()
	 * @generated
	 */
	EAttribute getVacationC_Contact();

	/**
	 * Returns the meta object for the attribute '{@link iCal.VacationC#getDtend <em>Dtend</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dtend</em>'.
	 * @see iCal.VacationC#getDtend()
	 * @see #getVacationC()
	 * @generated
	 */
	EAttribute getVacationC_Dtend();

	/**
	 * Returns the meta object for the attribute list '{@link iCal.VacationC#getAttendee <em>Attendee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Attendee</em>'.
	 * @see iCal.VacationC#getAttendee()
	 * @see #getVacationC()
	 * @generated
	 */
	EAttribute getVacationC_Attendee();

	/**
	 * Returns the meta object for the attribute list '{@link iCal.VacationC#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Comment</em>'.
	 * @see iCal.VacationC#getComment()
	 * @see #getVacationC()
	 * @generated
	 */
	EAttribute getVacationC_Comment();

	/**
	 * Returns the meta object for the attribute list '{@link iCal.VacationC#getFreebusy <em>Freebusy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Freebusy</em>'.
	 * @see iCal.VacationC#getFreebusy()
	 * @see #getVacationC()
	 * @generated
	 */
	EAttribute getVacationC_Freebusy();

	/**
	 * Returns the meta object for the attribute list '{@link iCal.VacationC#getRstatus <em>Rstatus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Rstatus</em>'.
	 * @see iCal.VacationC#getRstatus()
	 * @see #getVacationC()
	 * @generated
	 */
	EAttribute getVacationC_Rstatus();

	/**
	 * Returns the meta object for the attribute list '{@link iCal.VacationC#getX_prop <em>Xprop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Xprop</em>'.
	 * @see iCal.VacationC#getX_prop()
	 * @see #getVacationC()
	 * @generated
	 */
	EAttribute getVacationC_X_prop();

	/**
	 * Returns the meta object for the attribute list '{@link iCal.VacationC#getIana_prop <em>Iana prop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Iana prop</em>'.
	 * @see iCal.VacationC#getIana_prop()
	 * @see #getVacationC()
	 * @generated
	 */
	EAttribute getVacationC_Iana_prop();

	/**
	 * Returns the meta object for class '{@link iCal.ComponentRequired <em>Component Required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Required</em>'.
	 * @see iCal.ComponentRequired
	 * @generated
	 */
	EClass getComponentRequired();

	/**
	 * Returns the meta object for the attribute '{@link iCal.ComponentRequired#getDtstamp <em>Dtstamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dtstamp</em>'.
	 * @see iCal.ComponentRequired#getDtstamp()
	 * @see #getComponentRequired()
	 * @generated
	 */
	EAttribute getComponentRequired_Dtstamp();

	/**
	 * Returns the meta object for the attribute '{@link iCal.ComponentRequired#getUid <em>Uid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uid</em>'.
	 * @see iCal.ComponentRequired#getUid()
	 * @see #getComponentRequired()
	 * @generated
	 */
	EAttribute getComponentRequired_Uid();

	/**
	 * Returns the meta object for class '{@link iCal.TimeZoneC <em>Time Zone C</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Zone C</em>'.
	 * @see iCal.TimeZoneC
	 * @generated
	 */
	EClass getTimeZoneC();

	/**
	 * Returns the meta object for the attribute '{@link iCal.TimeZoneC#getTzid <em>Tzid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tzid</em>'.
	 * @see iCal.TimeZoneC#getTzid()
	 * @see #getTimeZoneC()
	 * @generated
	 */
	EAttribute getTimeZoneC_Tzid();

	/**
	 * Returns the meta object for the attribute '{@link iCal.TimeZoneC#getLast_mod <em>Last mod</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last mod</em>'.
	 * @see iCal.TimeZoneC#getLast_mod()
	 * @see #getTimeZoneC()
	 * @generated
	 */
	EAttribute getTimeZoneC_Last_mod();

	/**
	 * Returns the meta object for the attribute '{@link iCal.TimeZoneC#getTzurl <em>Tzurl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tzurl</em>'.
	 * @see iCal.TimeZoneC#getTzurl()
	 * @see #getTimeZoneC()
	 * @generated
	 */
	EAttribute getTimeZoneC_Tzurl();

	/**
	 * Returns the meta object for the containment reference list '{@link iCal.TimeZoneC#getStandardc <em>Standardc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Standardc</em>'.
	 * @see iCal.TimeZoneC#getStandardc()
	 * @see #getTimeZoneC()
	 * @generated
	 */
	EReference getTimeZoneC_Standardc();

	/**
	 * Returns the meta object for the containment reference list '{@link iCal.TimeZoneC#getDaylightc <em>Daylightc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Daylightc</em>'.
	 * @see iCal.TimeZoneC#getDaylightc()
	 * @see #getTimeZoneC()
	 * @generated
	 */
	EReference getTimeZoneC_Daylightc();

	/**
	 * Returns the meta object for the attribute list '{@link iCal.TimeZoneC#getX_prop <em>Xprop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Xprop</em>'.
	 * @see iCal.TimeZoneC#getX_prop()
	 * @see #getTimeZoneC()
	 * @generated
	 */
	EAttribute getTimeZoneC_X_prop();

	/**
	 * Returns the meta object for the attribute list '{@link iCal.TimeZoneC#getIana_prop <em>Iana prop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Iana prop</em>'.
	 * @see iCal.TimeZoneC#getIana_prop()
	 * @see #getTimeZoneC()
	 * @generated
	 */
	EAttribute getTimeZoneC_Iana_prop();

	/**
	 * Returns the meta object for class '{@link iCal.tzprop <em>tzprop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>tzprop</em>'.
	 * @see iCal.tzprop
	 * @generated
	 */
	EClass gettzprop();

	/**
	 * Returns the meta object for the attribute '{@link iCal.tzprop#getDtstart <em>Dtstart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dtstart</em>'.
	 * @see iCal.tzprop#getDtstart()
	 * @see #gettzprop()
	 * @generated
	 */
	EAttribute gettzprop_Dtstart();

	/**
	 * Returns the meta object for the attribute '{@link iCal.tzprop#getTzoffseto <em>Tzoffseto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tzoffseto</em>'.
	 * @see iCal.tzprop#getTzoffseto()
	 * @see #gettzprop()
	 * @generated
	 */
	EAttribute gettzprop_Tzoffseto();

	/**
	 * Returns the meta object for the attribute '{@link iCal.tzprop#getTzoffsetfrom <em>Tzoffsetfrom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tzoffsetfrom</em>'.
	 * @see iCal.tzprop#getTzoffsetfrom()
	 * @see #gettzprop()
	 * @generated
	 */
	EAttribute gettzprop_Tzoffsetfrom();

	/**
	 * Returns the meta object for the attribute '{@link iCal.tzprop#getRrule <em>Rrule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rrule</em>'.
	 * @see iCal.tzprop#getRrule()
	 * @see #gettzprop()
	 * @generated
	 */
	EAttribute gettzprop_Rrule();

	/**
	 * Returns the meta object for the containment reference list '{@link iCal.tzprop#getOpt <em>Opt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Opt</em>'.
	 * @see iCal.tzprop#getOpt()
	 * @see #gettzprop()
	 * @generated
	 */
	EReference gettzprop_Opt();

	/**
	 * Returns the meta object for class '{@link iCal.AlarmC <em>Alarm C</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Alarm C</em>'.
	 * @see iCal.AlarmC
	 * @generated
	 */
	EClass getAlarmC();

	/**
	 * Returns the meta object for the attribute '{@link iCal.AlarmC#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action</em>'.
	 * @see iCal.AlarmC#getAction()
	 * @see #getAlarmC()
	 * @generated
	 */
	EAttribute getAlarmC_Action();

	/**
	 * Returns the meta object for the attribute '{@link iCal.AlarmC#getTrigger <em>Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Trigger</em>'.
	 * @see iCal.AlarmC#getTrigger()
	 * @see #getAlarmC()
	 * @generated
	 */
	EAttribute getAlarmC_Trigger();

	/**
	 * Returns the meta object for the attribute list '{@link iCal.AlarmC#getX_prop <em>Xprop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Xprop</em>'.
	 * @see iCal.AlarmC#getX_prop()
	 * @see #getAlarmC()
	 * @generated
	 */
	EAttribute getAlarmC_X_prop();

	/**
	 * Returns the meta object for the attribute list '{@link iCal.AlarmC#getIana_prop <em>Iana prop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Iana prop</em>'.
	 * @see iCal.AlarmC#getIana_prop()
	 * @see #getAlarmC()
	 * @generated
	 */
	EAttribute getAlarmC_Iana_prop();

	/**
	 * Returns the meta object for the attribute '{@link iCal.AlarmC#getAttach <em>Attach</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attach</em>'.
	 * @see iCal.AlarmC#getAttach()
	 * @see #getAlarmC()
	 * @generated
	 */
	EAttribute getAlarmC_Attach();

	/**
	 * Returns the meta object for the attribute '{@link iCal.AlarmC#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see iCal.AlarmC#getDescription()
	 * @see #getAlarmC()
	 * @generated
	 */
	EAttribute getAlarmC_Description();

	/**
	 * Returns the meta object for the containment reference '{@link iCal.AlarmC#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see iCal.AlarmC#getType()
	 * @see #getAlarmC()
	 * @generated
	 */
	EReference getAlarmC_Type();

	/**
	 * Returns the meta object for the containment reference '{@link iCal.AlarmC#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Time</em>'.
	 * @see iCal.AlarmC#getTime()
	 * @see #getAlarmC()
	 * @generated
	 */
	EReference getAlarmC_Time();

	/**
	 * Returns the meta object for class '{@link iCal.ComponentAlarmTime <em>Component Alarm Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Alarm Time</em>'.
	 * @see iCal.ComponentAlarmTime
	 * @generated
	 */
	EClass getComponentAlarmTime();

	/**
	 * Returns the meta object for the attribute '{@link iCal.ComponentAlarmTime#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration</em>'.
	 * @see iCal.ComponentAlarmTime#getDuration()
	 * @see #getComponentAlarmTime()
	 * @generated
	 */
	EAttribute getComponentAlarmTime_Duration();

	/**
	 * Returns the meta object for the attribute '{@link iCal.ComponentAlarmTime#getRepeat <em>Repeat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Repeat</em>'.
	 * @see iCal.ComponentAlarmTime#getRepeat()
	 * @see #getComponentAlarmTime()
	 * @generated
	 */
	EAttribute getComponentAlarmTime_Repeat();

	/**
	 * Returns the meta object for class '{@link iCal.ComponentAlarmAudioProperty <em>Component Alarm Audio Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Alarm Audio Property</em>'.
	 * @see iCal.ComponentAlarmAudioProperty
	 * @generated
	 */
	EClass getComponentAlarmAudioProperty();

	/**
	 * Returns the meta object for the attribute '{@link iCal.ComponentAlarmAudioProperty#getAttach <em>Attach</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attach</em>'.
	 * @see iCal.ComponentAlarmAudioProperty#getAttach()
	 * @see #getComponentAlarmAudioProperty()
	 * @generated
	 */
	EAttribute getComponentAlarmAudioProperty_Attach();

	/**
	 * Returns the meta object for class '{@link iCal.ComponentAlarmDispProperty <em>Component Alarm Disp Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Alarm Disp Property</em>'.
	 * @see iCal.ComponentAlarmDispProperty
	 * @generated
	 */
	EClass getComponentAlarmDispProperty();

	/**
	 * Returns the meta object for the attribute '{@link iCal.ComponentAlarmDispProperty#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see iCal.ComponentAlarmDispProperty#getDescription()
	 * @see #getComponentAlarmDispProperty()
	 * @generated
	 */
	EAttribute getComponentAlarmDispProperty_Description();

	/**
	 * Returns the meta object for class '{@link iCal.ComponentAlarmEmailProperty <em>Component Alarm Email Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Alarm Email Property</em>'.
	 * @see iCal.ComponentAlarmEmailProperty
	 * @generated
	 */
	EClass getComponentAlarmEmailProperty();

	/**
	 * Returns the meta object for the attribute list '{@link iCal.ComponentAlarmEmailProperty#getAttendee <em>Attendee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Attendee</em>'.
	 * @see iCal.ComponentAlarmEmailProperty#getAttendee()
	 * @see #getComponentAlarmEmailProperty()
	 * @generated
	 */
	EAttribute getComponentAlarmEmailProperty_Attendee();

	/**
	 * Returns the meta object for the attribute '{@link iCal.ComponentAlarmEmailProperty#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see iCal.ComponentAlarmEmailProperty#getDescription()
	 * @see #getComponentAlarmEmailProperty()
	 * @generated
	 */
	EAttribute getComponentAlarmEmailProperty_Description();

	/**
	 * Returns the meta object for the attribute list '{@link iCal.ComponentAlarmEmailProperty#getAttach <em>Attach</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Attach</em>'.
	 * @see iCal.ComponentAlarmEmailProperty#getAttach()
	 * @see #getComponentAlarmEmailProperty()
	 * @generated
	 */
	EAttribute getComponentAlarmEmailProperty_Attach();

	/**
	 * Returns the meta object for class '{@link iCal.AlarmType <em>Alarm Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Alarm Type</em>'.
	 * @see iCal.AlarmType
	 * @generated
	 */
	EClass getAlarmType();

	/**
	 * Returns the meta object for class '{@link iCal.tzpropOptional <em>tzprop Optional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>tzprop Optional</em>'.
	 * @see iCal.tzpropOptional
	 * @generated
	 */
	EClass gettzpropOptional();

	/**
	 * Returns the meta object for the attribute '{@link iCal.tzpropOptional#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see iCal.tzpropOptional#getComment()
	 * @see #gettzpropOptional()
	 * @generated
	 */
	EAttribute gettzpropOptional_Comment();

	/**
	 * Returns the meta object for the attribute '{@link iCal.tzpropOptional#getRdate <em>Rdate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rdate</em>'.
	 * @see iCal.tzpropOptional#getRdate()
	 * @see #gettzpropOptional()
	 * @generated
	 */
	EAttribute gettzpropOptional_Rdate();

	/**
	 * Returns the meta object for the attribute '{@link iCal.tzpropOptional#getTzname <em>Tzname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tzname</em>'.
	 * @see iCal.tzpropOptional#getTzname()
	 * @see #gettzpropOptional()
	 * @generated
	 */
	EAttribute gettzpropOptional_Tzname();

	/**
	 * Returns the meta object for the attribute '{@link iCal.tzpropOptional#getX_prop <em>Xprop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Xprop</em>'.
	 * @see iCal.tzpropOptional#getX_prop()
	 * @see #gettzpropOptional()
	 * @generated
	 */
	EAttribute gettzpropOptional_X_prop();

	/**
	 * Returns the meta object for the attribute '{@link iCal.tzpropOptional#getIana_prop <em>Iana prop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Iana prop</em>'.
	 * @see iCal.tzpropOptional#getIana_prop()
	 * @see #gettzpropOptional()
	 * @generated
	 */
	EAttribute gettzpropOptional_Iana_prop();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>String</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 * @generated
	 */
	EDataType getString();

	/**
	 * Returns the meta object for data type '{@link java.lang.Integer <em>Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Integer</em>'.
	 * @see java.lang.Integer
	 * @model instanceClass="java.lang.Integer"
	 * @generated
	 */
	EDataType getInteger();

	/**
	 * Returns the meta object for data type '{@link java.lang.Float <em>Float</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Float</em>'.
	 * @see java.lang.Float
	 * @model instanceClass="java.lang.Float"
	 * @generated
	 */
	EDataType getFloat();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ICalFactory getICalFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link iCal.impl.iCalFormatImpl <em>iCal Format</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iCal.impl.iCalFormatImpl
		 * @see iCal.impl.ICalPackageImpl#getiCalFormat()
		 * @generated
		 */
		EClass ICAL_FORMAT = eINSTANCE.getiCalFormat();

		/**
		 * The meta object literal for the '<em><b>Calendar</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ICAL_FORMAT__CALENDAR = eINSTANCE.getiCalFormat_Calendar();

		/**
		 * The meta object literal for the '{@link iCal.impl.ComponentImpl <em>Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iCal.impl.ComponentImpl
		 * @see iCal.impl.ICalPackageImpl#getComponent()
		 * @generated
		 */
		EClass COMPONENT = eINSTANCE.getComponent();

		/**
		 * The meta object literal for the '{@link iCal.impl.EventCImpl <em>Event C</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iCal.impl.EventCImpl
		 * @see iCal.impl.ICalPackageImpl#getEventC()
		 * @generated
		 */
		EClass EVENT_C = eINSTANCE.getEventC();

		/**
		 * The meta object literal for the '<em><b>Transp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT_C__TRANSP = eINSTANCE.getEventC_Transp();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT_C__DESCRIPTION = eINSTANCE.getEventC_Description();

		/**
		 * The meta object literal for the '<em><b>Priority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT_C__PRIORITY = eINSTANCE.getEventC_Priority();

		/**
		 * The meta object literal for the '<em><b>Geo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT_C__GEO = eINSTANCE.getEventC_Geo();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT_C__LOCATION = eINSTANCE.getEventC_Location();

		/**
		 * The meta object literal for the '<em><b>Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT_C__DURATION = eINSTANCE.getEventC_Duration();

		/**
		 * The meta object literal for the '<em><b>Alarmc</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT_C__ALARMC = eINSTANCE.getEventC_Alarmc();

		/**
		 * The meta object literal for the '{@link iCal.impl.ToDoCImpl <em>To Do C</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iCal.impl.ToDoCImpl
		 * @see iCal.impl.ICalPackageImpl#getToDoC()
		 * @generated
		 */
		EClass TO_DO_C = eINSTANCE.getToDoC();

		/**
		 * The meta object literal for the '<em><b>Completed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TO_DO_C__COMPLETED = eINSTANCE.getToDoC_Completed();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TO_DO_C__DESCRIPTION = eINSTANCE.getToDoC_Description();

		/**
		 * The meta object literal for the '<em><b>Priority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TO_DO_C__PRIORITY = eINSTANCE.getToDoC_Priority();

		/**
		 * The meta object literal for the '<em><b>Geo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TO_DO_C__GEO = eINSTANCE.getToDoC_Geo();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TO_DO_C__LOCATION = eINSTANCE.getToDoC_Location();

		/**
		 * The meta object literal for the '<em><b>Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TO_DO_C__DURATION = eINSTANCE.getToDoC_Duration();

		/**
		 * The meta object literal for the '<em><b>Alarmc</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TO_DO_C__ALARMC = eINSTANCE.getToDoC_Alarmc();

		/**
		 * The meta object literal for the '{@link iCal.impl.CalendarImpl <em>Calendar</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iCal.impl.CalendarImpl
		 * @see iCal.impl.ICalPackageImpl#getCalendar()
		 * @generated
		 */
		EClass CALENDAR = eINSTANCE.getCalendar();

		/**
		 * The meta object literal for the '<em><b>Prodid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALENDAR__PRODID = eINSTANCE.getCalendar_Prodid();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALENDAR__VERSION = eINSTANCE.getCalendar_Version();

		/**
		 * The meta object literal for the '<em><b>Calscale</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALENDAR__CALSCALE = eINSTANCE.getCalendar_Calscale();

		/**
		 * The meta object literal for the '<em><b>Method</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALENDAR__METHOD = eINSTANCE.getCalendar_Method();

		/**
		 * The meta object literal for the '<em><b>Xprop</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALENDAR__XPROP = eINSTANCE.getCalendar_X_prop();

		/**
		 * The meta object literal for the '<em><b>Iana prop</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALENDAR__IANA_PROP = eINSTANCE.getCalendar_Iana_prop();

		/**
		 * The meta object literal for the '<em><b>Component</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALENDAR__COMPONENT = eINSTANCE.getCalendar_Component();

		/**
		 * The meta object literal for the '{@link iCal.impl.ComponentActionImpl <em>Component Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iCal.impl.ComponentActionImpl
		 * @see iCal.impl.ICalPackageImpl#getComponentAction()
		 * @generated
		 */
		EClass COMPONENT_ACTION = eINSTANCE.getComponentAction();

		/**
		 * The meta object literal for the '<em><b>Dtstart</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_ACTION__DTSTART = eINSTANCE.getComponentAction_Dtstart();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_ACTION__CLASS = eINSTANCE.getComponentAction_Class();

		/**
		 * The meta object literal for the '<em><b>Created</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_ACTION__CREATED = eINSTANCE.getComponentAction_Created();

		/**
		 * The meta object literal for the '<em><b>Last mod</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_ACTION__LAST_MOD = eINSTANCE.getComponentAction_Last_mod();

		/**
		 * The meta object literal for the '<em><b>Organizer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_ACTION__ORGANIZER = eINSTANCE.getComponentAction_Organizer();

		/**
		 * The meta object literal for the '<em><b>Seq</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_ACTION__SEQ = eINSTANCE.getComponentAction_Seq();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_ACTION__STATUS = eINSTANCE.getComponentAction_Status();

		/**
		 * The meta object literal for the '<em><b>Summary</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_ACTION__SUMMARY = eINSTANCE.getComponentAction_Summary();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_ACTION__URL = eINSTANCE.getComponentAction_Url();

		/**
		 * The meta object literal for the '<em><b>Recurid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_ACTION__RECURID = eINSTANCE.getComponentAction_Recurid();

		/**
		 * The meta object literal for the '<em><b>Rrule</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_ACTION__RRULE = eINSTANCE.getComponentAction_Rrule();

		/**
		 * The meta object literal for the '<em><b>Attach</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_ACTION__ATTACH = eINSTANCE.getComponentAction_Attach();

		/**
		 * The meta object literal for the '<em><b>Attendee</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_ACTION__ATTENDEE = eINSTANCE.getComponentAction_Attendee();

		/**
		 * The meta object literal for the '<em><b>Categories</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_ACTION__CATEGORIES = eINSTANCE.getComponentAction_Categories();

		/**
		 * The meta object literal for the '<em><b>Comment</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_ACTION__COMMENT = eINSTANCE.getComponentAction_Comment();

		/**
		 * The meta object literal for the '<em><b>Contact</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_ACTION__CONTACT = eINSTANCE.getComponentAction_Contact();

		/**
		 * The meta object literal for the '<em><b>Exdate</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_ACTION__EXDATE = eINSTANCE.getComponentAction_Exdate();

		/**
		 * The meta object literal for the '<em><b>Rstatus</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_ACTION__RSTATUS = eINSTANCE.getComponentAction_Rstatus();

		/**
		 * The meta object literal for the '<em><b>Related</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_ACTION__RELATED = eINSTANCE.getComponentAction_Related();

		/**
		 * The meta object literal for the '<em><b>Resources</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_ACTION__RESOURCES = eINSTANCE.getComponentAction_Resources();

		/**
		 * The meta object literal for the '<em><b>Rdate</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_ACTION__RDATE = eINSTANCE.getComponentAction_Rdate();

		/**
		 * The meta object literal for the '<em><b>Xprop</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_ACTION__XPROP = eINSTANCE.getComponentAction_X_prop();

		/**
		 * The meta object literal for the '<em><b>Iana prop</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_ACTION__IANA_PROP = eINSTANCE.getComponentAction_Iana_prop();

		/**
		 * The meta object literal for the '{@link iCal.impl.JournalCImpl <em>Journal C</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iCal.impl.JournalCImpl
		 * @see iCal.impl.ICalPackageImpl#getJournalC()
		 * @generated
		 */
		EClass JOURNAL_C = eINSTANCE.getJournalC();

		/**
		 * The meta object literal for the '{@link iCal.impl.VacationCImpl <em>Vacation C</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iCal.impl.VacationCImpl
		 * @see iCal.impl.ICalPackageImpl#getVacationC()
		 * @generated
		 */
		EClass VACATION_C = eINSTANCE.getVacationC();

		/**
		 * The meta object literal for the '<em><b>Dtstart</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VACATION_C__DTSTART = eINSTANCE.getVacationC_Dtstart();

		/**
		 * The meta object literal for the '<em><b>Organizer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VACATION_C__ORGANIZER = eINSTANCE.getVacationC_Organizer();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VACATION_C__URL = eINSTANCE.getVacationC_Url();

		/**
		 * The meta object literal for the '<em><b>Contact</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VACATION_C__CONTACT = eINSTANCE.getVacationC_Contact();

		/**
		 * The meta object literal for the '<em><b>Dtend</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VACATION_C__DTEND = eINSTANCE.getVacationC_Dtend();

		/**
		 * The meta object literal for the '<em><b>Attendee</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VACATION_C__ATTENDEE = eINSTANCE.getVacationC_Attendee();

		/**
		 * The meta object literal for the '<em><b>Comment</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VACATION_C__COMMENT = eINSTANCE.getVacationC_Comment();

		/**
		 * The meta object literal for the '<em><b>Freebusy</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VACATION_C__FREEBUSY = eINSTANCE.getVacationC_Freebusy();

		/**
		 * The meta object literal for the '<em><b>Rstatus</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VACATION_C__RSTATUS = eINSTANCE.getVacationC_Rstatus();

		/**
		 * The meta object literal for the '<em><b>Xprop</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VACATION_C__XPROP = eINSTANCE.getVacationC_X_prop();

		/**
		 * The meta object literal for the '<em><b>Iana prop</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VACATION_C__IANA_PROP = eINSTANCE.getVacationC_Iana_prop();

		/**
		 * The meta object literal for the '{@link iCal.impl.ComponentRequiredImpl <em>Component Required</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iCal.impl.ComponentRequiredImpl
		 * @see iCal.impl.ICalPackageImpl#getComponentRequired()
		 * @generated
		 */
		EClass COMPONENT_REQUIRED = eINSTANCE.getComponentRequired();

		/**
		 * The meta object literal for the '<em><b>Dtstamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_REQUIRED__DTSTAMP = eINSTANCE.getComponentRequired_Dtstamp();

		/**
		 * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_REQUIRED__UID = eINSTANCE.getComponentRequired_Uid();

		/**
		 * The meta object literal for the '{@link iCal.impl.TimeZoneCImpl <em>Time Zone C</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iCal.impl.TimeZoneCImpl
		 * @see iCal.impl.ICalPackageImpl#getTimeZoneC()
		 * @generated
		 */
		EClass TIME_ZONE_C = eINSTANCE.getTimeZoneC();

		/**
		 * The meta object literal for the '<em><b>Tzid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_ZONE_C__TZID = eINSTANCE.getTimeZoneC_Tzid();

		/**
		 * The meta object literal for the '<em><b>Last mod</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_ZONE_C__LAST_MOD = eINSTANCE.getTimeZoneC_Last_mod();

		/**
		 * The meta object literal for the '<em><b>Tzurl</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_ZONE_C__TZURL = eINSTANCE.getTimeZoneC_Tzurl();

		/**
		 * The meta object literal for the '<em><b>Standardc</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIME_ZONE_C__STANDARDC = eINSTANCE.getTimeZoneC_Standardc();

		/**
		 * The meta object literal for the '<em><b>Daylightc</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIME_ZONE_C__DAYLIGHTC = eINSTANCE.getTimeZoneC_Daylightc();

		/**
		 * The meta object literal for the '<em><b>Xprop</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_ZONE_C__XPROP = eINSTANCE.getTimeZoneC_X_prop();

		/**
		 * The meta object literal for the '<em><b>Iana prop</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_ZONE_C__IANA_PROP = eINSTANCE.getTimeZoneC_Iana_prop();

		/**
		 * The meta object literal for the '{@link iCal.impl.tzpropImpl <em>tzprop</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iCal.impl.tzpropImpl
		 * @see iCal.impl.ICalPackageImpl#gettzprop()
		 * @generated
		 */
		EClass TZPROP = eINSTANCE.gettzprop();

		/**
		 * The meta object literal for the '<em><b>Dtstart</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TZPROP__DTSTART = eINSTANCE.gettzprop_Dtstart();

		/**
		 * The meta object literal for the '<em><b>Tzoffseto</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TZPROP__TZOFFSETO = eINSTANCE.gettzprop_Tzoffseto();

		/**
		 * The meta object literal for the '<em><b>Tzoffsetfrom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TZPROP__TZOFFSETFROM = eINSTANCE.gettzprop_Tzoffsetfrom();

		/**
		 * The meta object literal for the '<em><b>Rrule</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TZPROP__RRULE = eINSTANCE.gettzprop_Rrule();

		/**
		 * The meta object literal for the '<em><b>Opt</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TZPROP__OPT = eINSTANCE.gettzprop_Opt();

		/**
		 * The meta object literal for the '{@link iCal.impl.AlarmCImpl <em>Alarm C</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iCal.impl.AlarmCImpl
		 * @see iCal.impl.ICalPackageImpl#getAlarmC()
		 * @generated
		 */
		EClass ALARM_C = eINSTANCE.getAlarmC();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALARM_C__ACTION = eINSTANCE.getAlarmC_Action();

		/**
		 * The meta object literal for the '<em><b>Trigger</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALARM_C__TRIGGER = eINSTANCE.getAlarmC_Trigger();

		/**
		 * The meta object literal for the '<em><b>Xprop</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALARM_C__XPROP = eINSTANCE.getAlarmC_X_prop();

		/**
		 * The meta object literal for the '<em><b>Iana prop</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALARM_C__IANA_PROP = eINSTANCE.getAlarmC_Iana_prop();

		/**
		 * The meta object literal for the '<em><b>Attach</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALARM_C__ATTACH = eINSTANCE.getAlarmC_Attach();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALARM_C__DESCRIPTION = eINSTANCE.getAlarmC_Description();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALARM_C__TYPE = eINSTANCE.getAlarmC_Type();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALARM_C__TIME = eINSTANCE.getAlarmC_Time();

		/**
		 * The meta object literal for the '{@link iCal.impl.ComponentAlarmTimeImpl <em>Component Alarm Time</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iCal.impl.ComponentAlarmTimeImpl
		 * @see iCal.impl.ICalPackageImpl#getComponentAlarmTime()
		 * @generated
		 */
		EClass COMPONENT_ALARM_TIME = eINSTANCE.getComponentAlarmTime();

		/**
		 * The meta object literal for the '<em><b>Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_ALARM_TIME__DURATION = eINSTANCE.getComponentAlarmTime_Duration();

		/**
		 * The meta object literal for the '<em><b>Repeat</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_ALARM_TIME__REPEAT = eINSTANCE.getComponentAlarmTime_Repeat();

		/**
		 * The meta object literal for the '{@link iCal.impl.ComponentAlarmAudioPropertyImpl <em>Component Alarm Audio Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iCal.impl.ComponentAlarmAudioPropertyImpl
		 * @see iCal.impl.ICalPackageImpl#getComponentAlarmAudioProperty()
		 * @generated
		 */
		EClass COMPONENT_ALARM_AUDIO_PROPERTY = eINSTANCE.getComponentAlarmAudioProperty();

		/**
		 * The meta object literal for the '<em><b>Attach</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_ALARM_AUDIO_PROPERTY__ATTACH = eINSTANCE.getComponentAlarmAudioProperty_Attach();

		/**
		 * The meta object literal for the '{@link iCal.impl.ComponentAlarmDispPropertyImpl <em>Component Alarm Disp Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iCal.impl.ComponentAlarmDispPropertyImpl
		 * @see iCal.impl.ICalPackageImpl#getComponentAlarmDispProperty()
		 * @generated
		 */
		EClass COMPONENT_ALARM_DISP_PROPERTY = eINSTANCE.getComponentAlarmDispProperty();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_ALARM_DISP_PROPERTY__DESCRIPTION = eINSTANCE.getComponentAlarmDispProperty_Description();

		/**
		 * The meta object literal for the '{@link iCal.impl.ComponentAlarmEmailPropertyImpl <em>Component Alarm Email Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iCal.impl.ComponentAlarmEmailPropertyImpl
		 * @see iCal.impl.ICalPackageImpl#getComponentAlarmEmailProperty()
		 * @generated
		 */
		EClass COMPONENT_ALARM_EMAIL_PROPERTY = eINSTANCE.getComponentAlarmEmailProperty();

		/**
		 * The meta object literal for the '<em><b>Attendee</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_ALARM_EMAIL_PROPERTY__ATTENDEE = eINSTANCE.getComponentAlarmEmailProperty_Attendee();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_ALARM_EMAIL_PROPERTY__DESCRIPTION = eINSTANCE.getComponentAlarmEmailProperty_Description();

		/**
		 * The meta object literal for the '<em><b>Attach</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_ALARM_EMAIL_PROPERTY__ATTACH = eINSTANCE.getComponentAlarmEmailProperty_Attach();

		/**
		 * The meta object literal for the '{@link iCal.impl.AlarmTypeImpl <em>Alarm Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iCal.impl.AlarmTypeImpl
		 * @see iCal.impl.ICalPackageImpl#getAlarmType()
		 * @generated
		 */
		EClass ALARM_TYPE = eINSTANCE.getAlarmType();

		/**
		 * The meta object literal for the '{@link iCal.impl.tzpropOptionalImpl <em>tzprop Optional</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iCal.impl.tzpropOptionalImpl
		 * @see iCal.impl.ICalPackageImpl#gettzpropOptional()
		 * @generated
		 */
		EClass TZPROP_OPTIONAL = eINSTANCE.gettzpropOptional();

		/**
		 * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TZPROP_OPTIONAL__COMMENT = eINSTANCE.gettzpropOptional_Comment();

		/**
		 * The meta object literal for the '<em><b>Rdate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TZPROP_OPTIONAL__RDATE = eINSTANCE.gettzpropOptional_Rdate();

		/**
		 * The meta object literal for the '<em><b>Tzname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TZPROP_OPTIONAL__TZNAME = eINSTANCE.gettzpropOptional_Tzname();

		/**
		 * The meta object literal for the '<em><b>Xprop</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TZPROP_OPTIONAL__XPROP = eINSTANCE.gettzpropOptional_X_prop();

		/**
		 * The meta object literal for the '<em><b>Iana prop</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TZPROP_OPTIONAL__IANA_PROP = eINSTANCE.gettzpropOptional_Iana_prop();

		/**
		 * The meta object literal for the '<em>String</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see iCal.impl.ICalPackageImpl#getString()
		 * @generated
		 */
		EDataType STRING = eINSTANCE.getString();

		/**
		 * The meta object literal for the '<em>Integer</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Integer
		 * @see iCal.impl.ICalPackageImpl#getInteger()
		 * @generated
		 */
		EDataType INTEGER = eINSTANCE.getInteger();

		/**
		 * The meta object literal for the '<em>Float</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Float
		 * @see iCal.impl.ICalPackageImpl#getFloat()
		 * @generated
		 */
		EDataType FLOAT = eINSTANCE.getFloat();

	}

} //ICalPackage
