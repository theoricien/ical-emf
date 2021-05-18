/**
 */
package iCal.util;

import iCal.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see iCal.ICalPackage
 * @generated
 */
public class ICalSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ICalPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ICalSwitch() {
		if (modelPackage == null) {
			modelPackage = ICalPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case ICalPackage.ICAL_FORMAT: {
			iCalFormat iCalFormat = (iCalFormat) theEObject;
			T result = caseiCalFormat(iCalFormat);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ICalPackage.COMPONENT: {
			Component component = (Component) theEObject;
			T result = caseComponent(component);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ICalPackage.EVENT_C: {
			EventC eventC = (EventC) theEObject;
			T result = caseEventC(eventC);
			if (result == null)
				result = caseComponentAction(eventC);
			if (result == null)
				result = caseComponentRequired(eventC);
			if (result == null)
				result = caseComponent(eventC);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ICalPackage.TO_DO_C: {
			ToDoC toDoC = (ToDoC) theEObject;
			T result = caseToDoC(toDoC);
			if (result == null)
				result = caseComponentAction(toDoC);
			if (result == null)
				result = caseComponentRequired(toDoC);
			if (result == null)
				result = caseComponent(toDoC);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ICalPackage.CALENDAR: {
			Calendar calendar = (Calendar) theEObject;
			T result = caseCalendar(calendar);
			if (result == null)
				result = caseComponent(calendar);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ICalPackage.COMPONENT_ACTION: {
			ComponentAction componentAction = (ComponentAction) theEObject;
			T result = caseComponentAction(componentAction);
			if (result == null)
				result = caseComponentRequired(componentAction);
			if (result == null)
				result = caseComponent(componentAction);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ICalPackage.JOURNAL_C: {
			JournalC journalC = (JournalC) theEObject;
			T result = caseJournalC(journalC);
			if (result == null)
				result = caseComponentAction(journalC);
			if (result == null)
				result = caseComponentRequired(journalC);
			if (result == null)
				result = caseComponent(journalC);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ICalPackage.VACATION_C: {
			VacationC vacationC = (VacationC) theEObject;
			T result = caseVacationC(vacationC);
			if (result == null)
				result = caseComponentRequired(vacationC);
			if (result == null)
				result = caseComponent(vacationC);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ICalPackage.COMPONENT_REQUIRED: {
			ComponentRequired componentRequired = (ComponentRequired) theEObject;
			T result = caseComponentRequired(componentRequired);
			if (result == null)
				result = caseComponent(componentRequired);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ICalPackage.TIME_ZONE_C: {
			TimeZoneC timeZoneC = (TimeZoneC) theEObject;
			T result = caseTimeZoneC(timeZoneC);
			if (result == null)
				result = caseComponent(timeZoneC);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ICalPackage.TZPROP: {
			tzprop tzprop = (tzprop) theEObject;
			T result = casetzprop(tzprop);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ICalPackage.ALARM_C: {
			AlarmC alarmC = (AlarmC) theEObject;
			T result = caseAlarmC(alarmC);
			if (result == null)
				result = caseComponent(alarmC);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ICalPackage.COMPONENT_ALARM_TIME: {
			ComponentAlarmTime componentAlarmTime = (ComponentAlarmTime) theEObject;
			T result = caseComponentAlarmTime(componentAlarmTime);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ICalPackage.COMPONENT_ALARM_AUDIO_PROPERTY: {
			ComponentAlarmAudioProperty componentAlarmAudioProperty = (ComponentAlarmAudioProperty) theEObject;
			T result = caseComponentAlarmAudioProperty(componentAlarmAudioProperty);
			if (result == null)
				result = caseAlarmType(componentAlarmAudioProperty);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ICalPackage.COMPONENT_ALARM_DISP_PROPERTY: {
			ComponentAlarmDispProperty componentAlarmDispProperty = (ComponentAlarmDispProperty) theEObject;
			T result = caseComponentAlarmDispProperty(componentAlarmDispProperty);
			if (result == null)
				result = caseAlarmType(componentAlarmDispProperty);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ICalPackage.COMPONENT_ALARM_EMAIL_PROPERTY: {
			ComponentAlarmEmailProperty componentAlarmEmailProperty = (ComponentAlarmEmailProperty) theEObject;
			T result = caseComponentAlarmEmailProperty(componentAlarmEmailProperty);
			if (result == null)
				result = caseAlarmType(componentAlarmEmailProperty);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ICalPackage.ALARM_TYPE: {
			AlarmType alarmType = (AlarmType) theEObject;
			T result = caseAlarmType(alarmType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ICalPackage.COMPONENT_ACTION_OPTIONAL_PROPERTIES: {
			ComponentActionOptionalProperties componentActionOptionalProperties = (ComponentActionOptionalProperties) theEObject;
			T result = caseComponentActionOptionalProperties(componentActionOptionalProperties);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ICalPackage.TZPROP_OPTIONAL: {
			tzpropOptional tzpropOptional = (tzpropOptional) theEObject;
			T result = casetzpropOptional(tzpropOptional);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>iCal Format</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>iCal Format</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseiCalFormat(iCalFormat object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponent(Component object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event C</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event C</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventC(EventC object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>To Do C</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>To Do C</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseToDoC(ToDoC object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Calendar</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Calendar</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCalendar(Calendar object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponentAction(ComponentAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Journal C</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Journal C</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJournalC(JournalC object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vacation C</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vacation C</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVacationC(VacationC object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Required</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Required</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponentRequired(ComponentRequired object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Zone C</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Zone C</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeZoneC(TimeZoneC object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>tzprop</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>tzprop</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casetzprop(tzprop object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Alarm C</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Alarm C</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAlarmC(AlarmC object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Alarm Time</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Alarm Time</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponentAlarmTime(ComponentAlarmTime object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Alarm Audio Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Alarm Audio Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponentAlarmAudioProperty(ComponentAlarmAudioProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Alarm Disp Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Alarm Disp Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponentAlarmDispProperty(ComponentAlarmDispProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Alarm Email Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Alarm Email Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponentAlarmEmailProperty(ComponentAlarmEmailProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Alarm Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Alarm Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAlarmType(AlarmType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Action Optional Properties</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Action Optional Properties</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponentActionOptionalProperties(ComponentActionOptionalProperties object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>tzprop Optional</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>tzprop Optional</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casetzpropOptional(tzpropOptional object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ICalSwitch
