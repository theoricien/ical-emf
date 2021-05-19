/**
 */
package iCal.impl;

import iCal.AlarmC;
import iCal.AlarmType;
import iCal.Calendar;
import iCal.Component;
import iCal.ComponentAction;
import iCal.ComponentAlarmAudioProperty;
import iCal.ComponentAlarmDispProperty;
import iCal.ComponentAlarmEmailProperty;
import iCal.ComponentAlarmTime;
import iCal.ComponentRequired;
import iCal.EventC;
import iCal.ICalFactory;
import iCal.ICalPackage;
import iCal.JournalC;
import iCal.TimeZoneC;
import iCal.ToDoC;
import iCal.VacationC;
import iCal.iCalFormat;
import iCal.tzprop;
import iCal.tzpropOptional;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ICalPackageImpl extends EPackageImpl implements ICalPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iCalFormatEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventCEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass toDoCEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass calendarEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass journalCEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vacationCEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentRequiredEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeZoneCEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tzpropEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass alarmCEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentAlarmTimeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentAlarmAudioPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentAlarmDispPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentAlarmEmailPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass alarmTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tzpropOptionalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType stringEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType integerEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType floatEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see iCal.ICalPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ICalPackageImpl() {
		super(eNS_URI, ICalFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link ICalPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ICalPackage init() {
		if (isInited)
			return (ICalPackage) EPackage.Registry.INSTANCE.getEPackage(ICalPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredICalPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ICalPackageImpl theICalPackage = registeredICalPackage instanceof ICalPackageImpl
				? (ICalPackageImpl) registeredICalPackage
				: new ICalPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theICalPackage.createPackageContents();

		// Initialize created meta-data
		theICalPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theICalPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ICalPackage.eNS_URI, theICalPackage);
		return theICalPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getiCalFormat() {
		return iCalFormatEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getiCalFormat_Calendar() {
		return (EReference) iCalFormatEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getComponent() {
		return componentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEventC() {
		return eventCEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEventC_Transp() {
		return (EAttribute) eventCEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEventC_Description() {
		return (EAttribute) eventCEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEventC_Priority() {
		return (EAttribute) eventCEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEventC_Geo() {
		return (EAttribute) eventCEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEventC_Location() {
		return (EAttribute) eventCEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEventC_Duration() {
		return (EAttribute) eventCEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEventC_Alarmc() {
		return (EReference) eventCEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getToDoC() {
		return toDoCEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getToDoC_Completed() {
		return (EAttribute) toDoCEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getToDoC_Description() {
		return (EAttribute) toDoCEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getToDoC_Priority() {
		return (EAttribute) toDoCEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getToDoC_Geo() {
		return (EAttribute) toDoCEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getToDoC_Location() {
		return (EAttribute) toDoCEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getToDoC_Duration() {
		return (EAttribute) toDoCEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getToDoC_Alarmc() {
		return (EReference) toDoCEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCalendar() {
		return calendarEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCalendar_Prodid() {
		return (EAttribute) calendarEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCalendar_Version() {
		return (EAttribute) calendarEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCalendar_Calscale() {
		return (EAttribute) calendarEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCalendar_Method() {
		return (EAttribute) calendarEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCalendar_X_prop() {
		return (EAttribute) calendarEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCalendar_Iana_prop() {
		return (EAttribute) calendarEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCalendar_Component() {
		return (EReference) calendarEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getComponentAction() {
		return componentActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComponentAction_Dtstart() {
		return (EAttribute) componentActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComponentAction_Class() {
		return (EAttribute) componentActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComponentAction_Created() {
		return (EAttribute) componentActionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComponentAction_Last_mod() {
		return (EAttribute) componentActionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComponentAction_Organizer() {
		return (EAttribute) componentActionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComponentAction_Seq() {
		return (EAttribute) componentActionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComponentAction_Status() {
		return (EAttribute) componentActionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComponentAction_Summary() {
		return (EAttribute) componentActionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComponentAction_Url() {
		return (EAttribute) componentActionEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComponentAction_Recurid() {
		return (EAttribute) componentActionEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComponentAction_Rrule() {
		return (EAttribute) componentActionEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComponentAction_Attach() {
		return (EAttribute) componentActionEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComponentAction_Attendee() {
		return (EAttribute) componentActionEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComponentAction_Categories() {
		return (EAttribute) componentActionEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComponentAction_Comment() {
		return (EAttribute) componentActionEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComponentAction_Contact() {
		return (EAttribute) componentActionEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComponentAction_Exdate() {
		return (EAttribute) componentActionEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComponentAction_Rstatus() {
		return (EAttribute) componentActionEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComponentAction_Related() {
		return (EAttribute) componentActionEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComponentAction_Resources() {
		return (EAttribute) componentActionEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComponentAction_Rdate() {
		return (EAttribute) componentActionEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComponentAction_X_prop() {
		return (EAttribute) componentActionEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComponentAction_Iana_prop() {
		return (EAttribute) componentActionEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getJournalC() {
		return journalCEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVacationC() {
		return vacationCEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVacationC_Dtstart() {
		return (EAttribute) vacationCEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVacationC_Organizer() {
		return (EAttribute) vacationCEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVacationC_Url() {
		return (EAttribute) vacationCEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVacationC_Contact() {
		return (EAttribute) vacationCEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVacationC_Dtend() {
		return (EAttribute) vacationCEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVacationC_Attendee() {
		return (EAttribute) vacationCEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVacationC_Comment() {
		return (EAttribute) vacationCEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVacationC_Freebusy() {
		return (EAttribute) vacationCEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVacationC_Rstatus() {
		return (EAttribute) vacationCEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVacationC_X_prop() {
		return (EAttribute) vacationCEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVacationC_Iana_prop() {
		return (EAttribute) vacationCEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getComponentRequired() {
		return componentRequiredEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComponentRequired_Dtstamp() {
		return (EAttribute) componentRequiredEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComponentRequired_Uid() {
		return (EAttribute) componentRequiredEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTimeZoneC() {
		return timeZoneCEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTimeZoneC_Tzid() {
		return (EAttribute) timeZoneCEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTimeZoneC_Last_mod() {
		return (EAttribute) timeZoneCEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTimeZoneC_Tzurl() {
		return (EAttribute) timeZoneCEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTimeZoneC_Standardc() {
		return (EReference) timeZoneCEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTimeZoneC_Daylightc() {
		return (EReference) timeZoneCEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTimeZoneC_X_prop() {
		return (EAttribute) timeZoneCEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTimeZoneC_Iana_prop() {
		return (EAttribute) timeZoneCEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass gettzprop() {
		return tzpropEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute gettzprop_Dtstart() {
		return (EAttribute) tzpropEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute gettzprop_Tzoffseto() {
		return (EAttribute) tzpropEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute gettzprop_Tzoffsetfrom() {
		return (EAttribute) tzpropEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute gettzprop_Rrule() {
		return (EAttribute) tzpropEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference gettzprop_Opt() {
		return (EReference) tzpropEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAlarmC() {
		return alarmCEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAlarmC_Action() {
		return (EAttribute) alarmCEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAlarmC_Trigger() {
		return (EAttribute) alarmCEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAlarmC_X_prop() {
		return (EAttribute) alarmCEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAlarmC_Iana_prop() {
		return (EAttribute) alarmCEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAlarmC_Attach() {
		return (EAttribute) alarmCEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAlarmC_Description() {
		return (EAttribute) alarmCEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAlarmC_Type() {
		return (EReference) alarmCEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAlarmC_Time() {
		return (EReference) alarmCEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getComponentAlarmTime() {
		return componentAlarmTimeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComponentAlarmTime_Duration() {
		return (EAttribute) componentAlarmTimeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComponentAlarmTime_Repeat() {
		return (EAttribute) componentAlarmTimeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getComponentAlarmAudioProperty() {
		return componentAlarmAudioPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComponentAlarmAudioProperty_Attach() {
		return (EAttribute) componentAlarmAudioPropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getComponentAlarmDispProperty() {
		return componentAlarmDispPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComponentAlarmDispProperty_Description() {
		return (EAttribute) componentAlarmDispPropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getComponentAlarmEmailProperty() {
		return componentAlarmEmailPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComponentAlarmEmailProperty_Attendee() {
		return (EAttribute) componentAlarmEmailPropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComponentAlarmEmailProperty_Description() {
		return (EAttribute) componentAlarmEmailPropertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComponentAlarmEmailProperty_Attach() {
		return (EAttribute) componentAlarmEmailPropertyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAlarmType() {
		return alarmTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass gettzpropOptional() {
		return tzpropOptionalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute gettzpropOptional_Comment() {
		return (EAttribute) tzpropOptionalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute gettzpropOptional_Rdate() {
		return (EAttribute) tzpropOptionalEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute gettzpropOptional_Tzname() {
		return (EAttribute) tzpropOptionalEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute gettzpropOptional_X_prop() {
		return (EAttribute) tzpropOptionalEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute gettzpropOptional_Iana_prop() {
		return (EAttribute) tzpropOptionalEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getString() {
		return stringEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getInteger() {
		return integerEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getFloat() {
		return floatEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ICalFactory getICalFactory() {
		return (ICalFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		iCalFormatEClass = createEClass(ICAL_FORMAT);
		createEReference(iCalFormatEClass, ICAL_FORMAT__CALENDAR);

		componentEClass = createEClass(COMPONENT);

		eventCEClass = createEClass(EVENT_C);
		createEAttribute(eventCEClass, EVENT_C__TRANSP);
		createEAttribute(eventCEClass, EVENT_C__DESCRIPTION);
		createEAttribute(eventCEClass, EVENT_C__PRIORITY);
		createEAttribute(eventCEClass, EVENT_C__GEO);
		createEAttribute(eventCEClass, EVENT_C__LOCATION);
		createEAttribute(eventCEClass, EVENT_C__DURATION);
		createEReference(eventCEClass, EVENT_C__ALARMC);

		toDoCEClass = createEClass(TO_DO_C);
		createEAttribute(toDoCEClass, TO_DO_C__COMPLETED);
		createEAttribute(toDoCEClass, TO_DO_C__DESCRIPTION);
		createEAttribute(toDoCEClass, TO_DO_C__PRIORITY);
		createEAttribute(toDoCEClass, TO_DO_C__GEO);
		createEAttribute(toDoCEClass, TO_DO_C__LOCATION);
		createEAttribute(toDoCEClass, TO_DO_C__DURATION);
		createEReference(toDoCEClass, TO_DO_C__ALARMC);

		calendarEClass = createEClass(CALENDAR);
		createEAttribute(calendarEClass, CALENDAR__PRODID);
		createEAttribute(calendarEClass, CALENDAR__VERSION);
		createEAttribute(calendarEClass, CALENDAR__CALSCALE);
		createEAttribute(calendarEClass, CALENDAR__METHOD);
		createEAttribute(calendarEClass, CALENDAR__XPROP);
		createEAttribute(calendarEClass, CALENDAR__IANA_PROP);
		createEReference(calendarEClass, CALENDAR__COMPONENT);

		componentActionEClass = createEClass(COMPONENT_ACTION);
		createEAttribute(componentActionEClass, COMPONENT_ACTION__DTSTART);
		createEAttribute(componentActionEClass, COMPONENT_ACTION__CLASS);
		createEAttribute(componentActionEClass, COMPONENT_ACTION__CREATED);
		createEAttribute(componentActionEClass, COMPONENT_ACTION__LAST_MOD);
		createEAttribute(componentActionEClass, COMPONENT_ACTION__ORGANIZER);
		createEAttribute(componentActionEClass, COMPONENT_ACTION__SEQ);
		createEAttribute(componentActionEClass, COMPONENT_ACTION__STATUS);
		createEAttribute(componentActionEClass, COMPONENT_ACTION__SUMMARY);
		createEAttribute(componentActionEClass, COMPONENT_ACTION__URL);
		createEAttribute(componentActionEClass, COMPONENT_ACTION__RECURID);
		createEAttribute(componentActionEClass, COMPONENT_ACTION__RRULE);
		createEAttribute(componentActionEClass, COMPONENT_ACTION__ATTACH);
		createEAttribute(componentActionEClass, COMPONENT_ACTION__ATTENDEE);
		createEAttribute(componentActionEClass, COMPONENT_ACTION__CATEGORIES);
		createEAttribute(componentActionEClass, COMPONENT_ACTION__COMMENT);
		createEAttribute(componentActionEClass, COMPONENT_ACTION__CONTACT);
		createEAttribute(componentActionEClass, COMPONENT_ACTION__EXDATE);
		createEAttribute(componentActionEClass, COMPONENT_ACTION__RSTATUS);
		createEAttribute(componentActionEClass, COMPONENT_ACTION__RELATED);
		createEAttribute(componentActionEClass, COMPONENT_ACTION__RESOURCES);
		createEAttribute(componentActionEClass, COMPONENT_ACTION__RDATE);
		createEAttribute(componentActionEClass, COMPONENT_ACTION__XPROP);
		createEAttribute(componentActionEClass, COMPONENT_ACTION__IANA_PROP);

		journalCEClass = createEClass(JOURNAL_C);

		vacationCEClass = createEClass(VACATION_C);
		createEAttribute(vacationCEClass, VACATION_C__DTSTART);
		createEAttribute(vacationCEClass, VACATION_C__ORGANIZER);
		createEAttribute(vacationCEClass, VACATION_C__URL);
		createEAttribute(vacationCEClass, VACATION_C__CONTACT);
		createEAttribute(vacationCEClass, VACATION_C__DTEND);
		createEAttribute(vacationCEClass, VACATION_C__ATTENDEE);
		createEAttribute(vacationCEClass, VACATION_C__COMMENT);
		createEAttribute(vacationCEClass, VACATION_C__FREEBUSY);
		createEAttribute(vacationCEClass, VACATION_C__RSTATUS);
		createEAttribute(vacationCEClass, VACATION_C__XPROP);
		createEAttribute(vacationCEClass, VACATION_C__IANA_PROP);

		componentRequiredEClass = createEClass(COMPONENT_REQUIRED);
		createEAttribute(componentRequiredEClass, COMPONENT_REQUIRED__DTSTAMP);
		createEAttribute(componentRequiredEClass, COMPONENT_REQUIRED__UID);

		timeZoneCEClass = createEClass(TIME_ZONE_C);
		createEAttribute(timeZoneCEClass, TIME_ZONE_C__TZID);
		createEAttribute(timeZoneCEClass, TIME_ZONE_C__LAST_MOD);
		createEAttribute(timeZoneCEClass, TIME_ZONE_C__TZURL);
		createEReference(timeZoneCEClass, TIME_ZONE_C__STANDARDC);
		createEReference(timeZoneCEClass, TIME_ZONE_C__DAYLIGHTC);
		createEAttribute(timeZoneCEClass, TIME_ZONE_C__XPROP);
		createEAttribute(timeZoneCEClass, TIME_ZONE_C__IANA_PROP);

		tzpropEClass = createEClass(TZPROP);
		createEAttribute(tzpropEClass, TZPROP__DTSTART);
		createEAttribute(tzpropEClass, TZPROP__TZOFFSETO);
		createEAttribute(tzpropEClass, TZPROP__TZOFFSETFROM);
		createEAttribute(tzpropEClass, TZPROP__RRULE);
		createEReference(tzpropEClass, TZPROP__OPT);

		alarmCEClass = createEClass(ALARM_C);
		createEAttribute(alarmCEClass, ALARM_C__ACTION);
		createEAttribute(alarmCEClass, ALARM_C__TRIGGER);
		createEAttribute(alarmCEClass, ALARM_C__XPROP);
		createEAttribute(alarmCEClass, ALARM_C__IANA_PROP);
		createEAttribute(alarmCEClass, ALARM_C__ATTACH);
		createEAttribute(alarmCEClass, ALARM_C__DESCRIPTION);
		createEReference(alarmCEClass, ALARM_C__TYPE);
		createEReference(alarmCEClass, ALARM_C__TIME);

		componentAlarmTimeEClass = createEClass(COMPONENT_ALARM_TIME);
		createEAttribute(componentAlarmTimeEClass, COMPONENT_ALARM_TIME__DURATION);
		createEAttribute(componentAlarmTimeEClass, COMPONENT_ALARM_TIME__REPEAT);

		componentAlarmAudioPropertyEClass = createEClass(COMPONENT_ALARM_AUDIO_PROPERTY);
		createEAttribute(componentAlarmAudioPropertyEClass, COMPONENT_ALARM_AUDIO_PROPERTY__ATTACH);

		componentAlarmDispPropertyEClass = createEClass(COMPONENT_ALARM_DISP_PROPERTY);
		createEAttribute(componentAlarmDispPropertyEClass, COMPONENT_ALARM_DISP_PROPERTY__DESCRIPTION);

		componentAlarmEmailPropertyEClass = createEClass(COMPONENT_ALARM_EMAIL_PROPERTY);
		createEAttribute(componentAlarmEmailPropertyEClass, COMPONENT_ALARM_EMAIL_PROPERTY__ATTENDEE);
		createEAttribute(componentAlarmEmailPropertyEClass, COMPONENT_ALARM_EMAIL_PROPERTY__DESCRIPTION);
		createEAttribute(componentAlarmEmailPropertyEClass, COMPONENT_ALARM_EMAIL_PROPERTY__ATTACH);

		alarmTypeEClass = createEClass(ALARM_TYPE);

		tzpropOptionalEClass = createEClass(TZPROP_OPTIONAL);
		createEAttribute(tzpropOptionalEClass, TZPROP_OPTIONAL__COMMENT);
		createEAttribute(tzpropOptionalEClass, TZPROP_OPTIONAL__RDATE);
		createEAttribute(tzpropOptionalEClass, TZPROP_OPTIONAL__TZNAME);
		createEAttribute(tzpropOptionalEClass, TZPROP_OPTIONAL__XPROP);
		createEAttribute(tzpropOptionalEClass, TZPROP_OPTIONAL__IANA_PROP);

		// Create data types
		stringEDataType = createEDataType(STRING);
		integerEDataType = createEDataType(INTEGER);
		floatEDataType = createEDataType(FLOAT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		eventCEClass.getESuperTypes().add(this.getComponentAction());
		toDoCEClass.getESuperTypes().add(this.getComponentAction());
		componentActionEClass.getESuperTypes().add(this.getComponentRequired());
		journalCEClass.getESuperTypes().add(this.getComponentAction());
		vacationCEClass.getESuperTypes().add(this.getComponentRequired());
		componentRequiredEClass.getESuperTypes().add(this.getComponent());
		timeZoneCEClass.getESuperTypes().add(this.getComponent());
		alarmCEClass.getESuperTypes().add(this.getComponent());
		componentAlarmAudioPropertyEClass.getESuperTypes().add(this.getAlarmType());
		componentAlarmDispPropertyEClass.getESuperTypes().add(this.getAlarmType());
		componentAlarmEmailPropertyEClass.getESuperTypes().add(this.getAlarmType());

		// Initialize classes, features, and operations; add parameters
		initEClass(iCalFormatEClass, iCalFormat.class, "iCalFormat", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getiCalFormat_Calendar(), this.getCalendar(), null, "calendar", null, 1, 1, iCalFormat.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(componentEClass, Component.class, "Component", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(eventCEClass, EventC.class, "EventC", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEventC_Transp(), this.getString(), "transp", null, 0, 1, EventC.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEventC_Description(), this.getString(), "description", null, 0, 1, EventC.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEventC_Priority(), this.getString(), "priority", null, 0, 1, EventC.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEventC_Geo(), this.getString(), "geo", null, 0, 1, EventC.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEventC_Location(), this.getString(), "location", null, 0, 1, EventC.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEventC_Duration(), this.getString(), "duration", null, 0, 1, EventC.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEventC_Alarmc(), this.getAlarmC(), null, "alarmc", null, 0, -1, EventC.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(toDoCEClass, ToDoC.class, "ToDoC", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getToDoC_Completed(), this.getString(), "completed", null, 0, 1, ToDoC.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getToDoC_Description(), this.getString(), "description", null, 0, 1, ToDoC.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getToDoC_Priority(), this.getString(), "priority", null, 0, 1, ToDoC.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getToDoC_Geo(), this.getString(), "geo", null, 0, 1, ToDoC.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getToDoC_Location(), this.getString(), "location", null, 0, 1, ToDoC.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getToDoC_Duration(), this.getString(), "duration", null, 0, 1, ToDoC.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getToDoC_Alarmc(), this.getAlarmC(), null, "alarmc", null, 0, -1, ToDoC.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(calendarEClass, Calendar.class, "Calendar", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCalendar_Prodid(), this.getString(), "prodid", null, 1, 1, Calendar.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCalendar_Version(), this.getString(), "version", null, 1, 1, Calendar.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCalendar_Calscale(), this.getString(), "calscale", null, 0, 1, Calendar.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCalendar_Method(), this.getString(), "method", null, 0, 1, Calendar.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCalendar_X_prop(), this.getString(), "x_prop", null, 0, -1, Calendar.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCalendar_Iana_prop(), this.getString(), "iana_prop", null, 0, -1, Calendar.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCalendar_Component(), this.getComponent(), null, "component", null, 1, -1, Calendar.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(componentActionEClass, ComponentAction.class, "ComponentAction", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComponentAction_Dtstart(), this.getString(), "dtstart", null, 0, 1, ComponentAction.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponentAction_Class(), this.getString(), "class", null, 0, 1, ComponentAction.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponentAction_Created(), this.getString(), "created", null, 0, 1, ComponentAction.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponentAction_Last_mod(), this.getString(), "last_mod", null, 0, 1, ComponentAction.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponentAction_Organizer(), this.getString(), "organizer", null, 0, 1, ComponentAction.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponentAction_Seq(), this.getString(), "seq", null, 0, 1, ComponentAction.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponentAction_Status(), this.getString(), "status", null, 0, 1, ComponentAction.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponentAction_Summary(), this.getString(), "summary", null, 0, 1, ComponentAction.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponentAction_Url(), this.getString(), "url", null, 0, 1, ComponentAction.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponentAction_Recurid(), this.getString(), "recurid", null, 0, 1, ComponentAction.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponentAction_Rrule(), this.getString(), "rrule", null, 0, -1, ComponentAction.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponentAction_Attach(), this.getString(), "attach", null, 0, -1, ComponentAction.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponentAction_Attendee(), this.getString(), "attendee", null, 0, -1, ComponentAction.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponentAction_Categories(), this.getString(), "categories", null, 0, -1,
				ComponentAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponentAction_Comment(), this.getString(), "comment", null, 0, -1, ComponentAction.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponentAction_Contact(), this.getString(), "contact", null, 0, -1, ComponentAction.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponentAction_Exdate(), this.getString(), "exdate", null, 0, -1, ComponentAction.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponentAction_Rstatus(), this.getString(), "rstatus", null, 0, -1, ComponentAction.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponentAction_Related(), this.getString(), "related", null, 0, -1, ComponentAction.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponentAction_Resources(), this.getString(), "resources", null, 0, -1,
				ComponentAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponentAction_Rdate(), this.getString(), "rdate", null, 0, -1, ComponentAction.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponentAction_X_prop(), this.getString(), "x_prop", null, 0, -1, ComponentAction.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponentAction_Iana_prop(), this.getString(), "iana_prop", null, 0, -1,
				ComponentAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(journalCEClass, JournalC.class, "JournalC", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(vacationCEClass, VacationC.class, "VacationC", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVacationC_Dtstart(), this.getString(), "dtstart", null, 0, 1, VacationC.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVacationC_Organizer(), this.getString(), "organizer", null, 0, 1, VacationC.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVacationC_Url(), this.getString(), "url", null, 0, 1, VacationC.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVacationC_Contact(), this.getString(), "contact", null, 0, 1, VacationC.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVacationC_Dtend(), this.getString(), "dtend", null, 0, 1, VacationC.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVacationC_Attendee(), this.getString(), "attendee", null, 0, -1, VacationC.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVacationC_Comment(), this.getString(), "comment", null, 0, -1, VacationC.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVacationC_Freebusy(), this.getString(), "freebusy", null, 0, -1, VacationC.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVacationC_Rstatus(), this.getString(), "rstatus", null, 0, -1, VacationC.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVacationC_X_prop(), this.getString(), "x_prop", null, 0, -1, VacationC.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVacationC_Iana_prop(), this.getString(), "iana_prop", null, 0, -1, VacationC.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(componentRequiredEClass, ComponentRequired.class, "ComponentRequired", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComponentRequired_Dtstamp(), this.getString(), "dtstamp", null, 1, 1, ComponentRequired.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponentRequired_Uid(), this.getString(), "uid", null, 1, 1, ComponentRequired.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(timeZoneCEClass, TimeZoneC.class, "TimeZoneC", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTimeZoneC_Tzid(), this.getString(), "tzid", null, 1, 1, TimeZoneC.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimeZoneC_Last_mod(), this.getString(), "last_mod", null, 0, 1, TimeZoneC.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimeZoneC_Tzurl(), this.getString(), "tzurl", null, 0, 1, TimeZoneC.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTimeZoneC_Standardc(), this.gettzprop(), null, "standardc", null, 0, -1, TimeZoneC.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTimeZoneC_Daylightc(), this.gettzprop(), null, "daylightc", null, 0, -1, TimeZoneC.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimeZoneC_X_prop(), this.getString(), "x_prop", null, 0, -1, TimeZoneC.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimeZoneC_Iana_prop(), this.getString(), "iana_prop", null, 0, -1, TimeZoneC.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tzpropEClass, tzprop.class, "tzprop", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(gettzprop_Dtstart(), this.getString(), "dtstart", null, 1, 1, tzprop.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(gettzprop_Tzoffseto(), this.getString(), "tzoffseto", null, 1, 1, tzprop.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(gettzprop_Tzoffsetfrom(), this.getString(), "tzoffsetfrom", null, 1, 1, tzprop.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(gettzprop_Rrule(), this.getString(), "rrule", null, 0, 1, tzprop.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(gettzprop_Opt(), this.gettzpropOptional(), null, "opt", null, 0, -1, tzprop.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(alarmCEClass, AlarmC.class, "AlarmC", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAlarmC_Action(), this.getString(), "action", null, 1, 1, AlarmC.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAlarmC_Trigger(), this.getString(), "trigger", null, 1, 1, AlarmC.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAlarmC_X_prop(), this.getString(), "x_prop", null, 0, -1, AlarmC.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAlarmC_Iana_prop(), this.getString(), "iana_prop", null, 0, -1, AlarmC.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAlarmC_Attach(), this.getString(), "attach", null, 0, 1, AlarmC.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAlarmC_Description(), this.getString(), "description", null, 0, 1, AlarmC.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAlarmC_Type(), this.getAlarmType(), null, "type", null, 1, 1, AlarmC.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getAlarmC_Time(), this.getComponentAlarmTime(), null, "time", null, 0, 1, AlarmC.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(componentAlarmTimeEClass, ComponentAlarmTime.class, "ComponentAlarmTime", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComponentAlarmTime_Duration(), this.getString(), "duration", null, 0, 1,
				ComponentAlarmTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponentAlarmTime_Repeat(), this.getString(), "repeat", null, 0, 1, ComponentAlarmTime.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(componentAlarmAudioPropertyEClass, ComponentAlarmAudioProperty.class, "ComponentAlarmAudioProperty",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComponentAlarmAudioProperty_Attach(), this.getString(), "attach", null, 0, 1,
				ComponentAlarmAudioProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(componentAlarmDispPropertyEClass, ComponentAlarmDispProperty.class, "ComponentAlarmDispProperty",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComponentAlarmDispProperty_Description(), this.getString(), "description", null, 1, 1,
				ComponentAlarmDispProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(componentAlarmEmailPropertyEClass, ComponentAlarmEmailProperty.class, "ComponentAlarmEmailProperty",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComponentAlarmEmailProperty_Attendee(), this.getString(), "attendee", null, 1, -1,
				ComponentAlarmEmailProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponentAlarmEmailProperty_Description(), this.getString(), "description", null, 1, 1,
				ComponentAlarmEmailProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponentAlarmEmailProperty_Attach(), this.getString(), "attach", null, 0, -1,
				ComponentAlarmEmailProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(alarmTypeEClass, AlarmType.class, "AlarmType", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(tzpropOptionalEClass, tzpropOptional.class, "tzpropOptional", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(gettzpropOptional_Comment(), this.getString(), "comment", null, 0, 1, tzpropOptional.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(gettzpropOptional_Rdate(), this.getString(), "rdate", null, 0, 1, tzpropOptional.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(gettzpropOptional_Tzname(), this.getString(), "tzname", null, 0, 1, tzpropOptional.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(gettzpropOptional_X_prop(), this.getString(), "x_prop", null, 0, 1, tzpropOptional.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(gettzpropOptional_Iana_prop(), this.getString(), "iana_prop", null, 0, 1, tzpropOptional.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize data types
		initEDataType(stringEDataType, String.class, "String", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(integerEDataType, Integer.class, "Integer", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(floatEDataType, Float.class, "Float", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //ICalPackageImpl
