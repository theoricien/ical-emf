/**
 */
package iCal;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see iCal.ICalPackage
 * @generated
 */
public interface ICalFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ICalFactory eINSTANCE = iCal.impl.ICalFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>iCal Format</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>iCal Format</em>'.
	 * @generated
	 */
	iCalFormat createiCalFormat();

	/**
	 * Returns a new object of class '<em>Event C</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event C</em>'.
	 * @generated
	 */
	EventC createEventC();

	/**
	 * Returns a new object of class '<em>To Do C</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>To Do C</em>'.
	 * @generated
	 */
	ToDoC createToDoC();

	/**
	 * Returns a new object of class '<em>Calendar</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Calendar</em>'.
	 * @generated
	 */
	Calendar createCalendar();

	/**
	 * Returns a new object of class '<em>Journal C</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Journal C</em>'.
	 * @generated
	 */
	JournalC createJournalC();

	/**
	 * Returns a new object of class '<em>Vacation C</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Vacation C</em>'.
	 * @generated
	 */
	VacationC createVacationC();

	/**
	 * Returns a new object of class '<em>Time Zone C</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Time Zone C</em>'.
	 * @generated
	 */
	TimeZoneC createTimeZoneC();

	/**
	 * Returns a new object of class '<em>tzprop</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>tzprop</em>'.
	 * @generated
	 */
	tzprop createtzprop();

	/**
	 * Returns a new object of class '<em>Alarm C</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Alarm C</em>'.
	 * @generated
	 */
	AlarmC createAlarmC();

	/**
	 * Returns a new object of class '<em>Component Alarm Time</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component Alarm Time</em>'.
	 * @generated
	 */
	ComponentAlarmTime createComponentAlarmTime();

	/**
	 * Returns a new object of class '<em>Component Alarm Audio Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component Alarm Audio Property</em>'.
	 * @generated
	 */
	ComponentAlarmAudioProperty createComponentAlarmAudioProperty();

	/**
	 * Returns a new object of class '<em>Component Alarm Disp Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component Alarm Disp Property</em>'.
	 * @generated
	 */
	ComponentAlarmDispProperty createComponentAlarmDispProperty();

	/**
	 * Returns a new object of class '<em>Component Alarm Email Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component Alarm Email Property</em>'.
	 * @generated
	 */
	ComponentAlarmEmailProperty createComponentAlarmEmailProperty();

	/**
	 * Returns a new object of class '<em>Component Action Optional Properties</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component Action Optional Properties</em>'.
	 * @generated
	 */
	ComponentActionOptionalProperties createComponentActionOptionalProperties();

	/**
	 * Returns a new object of class '<em>tzprop Optional</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>tzprop Optional</em>'.
	 * @generated
	 */
	tzpropOptional createtzpropOptional();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ICalPackage getICalPackage();

} //ICalFactory
