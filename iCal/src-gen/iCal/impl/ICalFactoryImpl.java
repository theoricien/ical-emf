/**
 */
package iCal.impl;

import iCal.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ICalFactoryImpl extends EFactoryImpl implements ICalFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ICalFactory init() {
		try {
			ICalFactory theICalFactory = (ICalFactory) EPackage.Registry.INSTANCE.getEFactory(ICalPackage.eNS_URI);
			if (theICalFactory != null) {
				return theICalFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ICalFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ICalFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case ICalPackage.ICAL_FORMAT:
			return createiCalFormat();
		case ICalPackage.EVENT_C:
			return createEventC();
		case ICalPackage.TO_DO_C:
			return createToDoC();
		case ICalPackage.CALENDAR:
			return createCalendar();
		case ICalPackage.JOURNAL_C:
			return createJournalC();
		case ICalPackage.VACATION_C:
			return createVacationC();
		case ICalPackage.TIME_ZONE_C:
			return createTimeZoneC();
		case ICalPackage.TZPROP:
			return createtzprop();
		case ICalPackage.ALARM_C:
			return createAlarmC();
		case ICalPackage.COMPONENT_ALARM_TIME:
			return createComponentAlarmTime();
		case ICalPackage.COMPONENT_ALARM_AUDIO_PROPERTY:
			return createComponentAlarmAudioProperty();
		case ICalPackage.COMPONENT_ALARM_DISP_PROPERTY:
			return createComponentAlarmDispProperty();
		case ICalPackage.COMPONENT_ALARM_EMAIL_PROPERTY:
			return createComponentAlarmEmailProperty();
		case ICalPackage.COMPONENT_ACTION_OPTIONAL_PROPERTIES:
			return createComponentActionOptionalProperties();
		case ICalPackage.TZPROP_OPTIONAL:
			return createtzpropOptional();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case ICalPackage.STRING:
			return createStringFromString(eDataType, initialValue);
		case ICalPackage.INTEGER:
			return createIntegerFromString(eDataType, initialValue);
		case ICalPackage.FLOAT:
			return createFloatFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case ICalPackage.STRING:
			return convertStringToString(eDataType, instanceValue);
		case ICalPackage.INTEGER:
			return convertIntegerToString(eDataType, instanceValue);
		case ICalPackage.FLOAT:
			return convertFloatToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public iCalFormat createiCalFormat() {
		iCalFormatImpl iCalFormat = new iCalFormatImpl();
		return iCalFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EventC createEventC() {
		EventCImpl eventC = new EventCImpl();
		return eventC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ToDoC createToDoC() {
		ToDoCImpl toDoC = new ToDoCImpl();
		return toDoC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Calendar createCalendar() {
		CalendarImpl calendar = new CalendarImpl();
		return calendar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JournalC createJournalC() {
		JournalCImpl journalC = new JournalCImpl();
		return journalC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VacationC createVacationC() {
		VacationCImpl vacationC = new VacationCImpl();
		return vacationC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TimeZoneC createTimeZoneC() {
		TimeZoneCImpl timeZoneC = new TimeZoneCImpl();
		return timeZoneC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public tzprop createtzprop() {
		tzpropImpl tzprop = new tzpropImpl();
		return tzprop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AlarmC createAlarmC() {
		AlarmCImpl alarmC = new AlarmCImpl();
		return alarmC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComponentAlarmTime createComponentAlarmTime() {
		ComponentAlarmTimeImpl componentAlarmTime = new ComponentAlarmTimeImpl();
		return componentAlarmTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComponentAlarmAudioProperty createComponentAlarmAudioProperty() {
		ComponentAlarmAudioPropertyImpl componentAlarmAudioProperty = new ComponentAlarmAudioPropertyImpl();
		return componentAlarmAudioProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComponentAlarmDispProperty createComponentAlarmDispProperty() {
		ComponentAlarmDispPropertyImpl componentAlarmDispProperty = new ComponentAlarmDispPropertyImpl();
		return componentAlarmDispProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComponentAlarmEmailProperty createComponentAlarmEmailProperty() {
		ComponentAlarmEmailPropertyImpl componentAlarmEmailProperty = new ComponentAlarmEmailPropertyImpl();
		return componentAlarmEmailProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComponentActionOptionalProperties createComponentActionOptionalProperties() {
		ComponentActionOptionalPropertiesImpl componentActionOptionalProperties = new ComponentActionOptionalPropertiesImpl();
		return componentActionOptionalProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public tzpropOptional createtzpropOptional() {
		tzpropOptionalImpl tzpropOptional = new tzpropOptionalImpl();
		return tzpropOptional;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createStringFromString(EDataType eDataType, String initialValue) {
		return (String) super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStringToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer createIntegerFromString(EDataType eDataType, String initialValue) {
		return (Integer) super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIntegerToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Float createFloatFromString(EDataType eDataType, String initialValue) {
		return (Float) super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFloatToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ICalPackage getICalPackage() {
		return (ICalPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ICalPackage getPackage() {
		return ICalPackage.eINSTANCE;
	}

} //ICalFactoryImpl
