/**
 */
package iCal.util;

import iCal.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see iCal.ICalPackage
 * @generated
 */
public class ICalAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ICalPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ICalAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ICalPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ICalSwitch<Adapter> modelSwitch = new ICalSwitch<Adapter>() {
		@Override
		public Adapter caseiCalFormat(iCalFormat object) {
			return createiCalFormatAdapter();
		}

		@Override
		public Adapter caseComponent(Component object) {
			return createComponentAdapter();
		}

		@Override
		public Adapter caseEventC(EventC object) {
			return createEventCAdapter();
		}

		@Override
		public Adapter caseToDoC(ToDoC object) {
			return createToDoCAdapter();
		}

		@Override
		public Adapter caseCalendar(Calendar object) {
			return createCalendarAdapter();
		}

		@Override
		public Adapter caseComponentAction(ComponentAction object) {
			return createComponentActionAdapter();
		}

		@Override
		public Adapter caseJournalC(JournalC object) {
			return createJournalCAdapter();
		}

		@Override
		public Adapter caseVacationC(VacationC object) {
			return createVacationCAdapter();
		}

		@Override
		public Adapter caseComponentRequired(ComponentRequired object) {
			return createComponentRequiredAdapter();
		}

		@Override
		public Adapter caseTimeZoneC(TimeZoneC object) {
			return createTimeZoneCAdapter();
		}

		@Override
		public Adapter casetzprop(tzprop object) {
			return createtzpropAdapter();
		}

		@Override
		public Adapter caseAlarmC(AlarmC object) {
			return createAlarmCAdapter();
		}

		@Override
		public Adapter caseComponentAlarmTime(ComponentAlarmTime object) {
			return createComponentAlarmTimeAdapter();
		}

		@Override
		public Adapter caseComponentAlarmAudioProperty(ComponentAlarmAudioProperty object) {
			return createComponentAlarmAudioPropertyAdapter();
		}

		@Override
		public Adapter caseComponentAlarmDispProperty(ComponentAlarmDispProperty object) {
			return createComponentAlarmDispPropertyAdapter();
		}

		@Override
		public Adapter caseComponentAlarmEmailProperty(ComponentAlarmEmailProperty object) {
			return createComponentAlarmEmailPropertyAdapter();
		}

		@Override
		public Adapter caseAlarmType(AlarmType object) {
			return createAlarmTypeAdapter();
		}

		@Override
		public Adapter casetzpropOptional(tzpropOptional object) {
			return createtzpropOptionalAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link iCal.iCalFormat <em>iCal Format</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iCal.iCalFormat
	 * @generated
	 */
	public Adapter createiCalFormatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iCal.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iCal.Component
	 * @generated
	 */
	public Adapter createComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iCal.EventC <em>Event C</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iCal.EventC
	 * @generated
	 */
	public Adapter createEventCAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iCal.ToDoC <em>To Do C</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iCal.ToDoC
	 * @generated
	 */
	public Adapter createToDoCAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iCal.Calendar <em>Calendar</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iCal.Calendar
	 * @generated
	 */
	public Adapter createCalendarAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iCal.ComponentAction <em>Component Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iCal.ComponentAction
	 * @generated
	 */
	public Adapter createComponentActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iCal.JournalC <em>Journal C</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iCal.JournalC
	 * @generated
	 */
	public Adapter createJournalCAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iCal.VacationC <em>Vacation C</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iCal.VacationC
	 * @generated
	 */
	public Adapter createVacationCAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iCal.ComponentRequired <em>Component Required</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iCal.ComponentRequired
	 * @generated
	 */
	public Adapter createComponentRequiredAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iCal.TimeZoneC <em>Time Zone C</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iCal.TimeZoneC
	 * @generated
	 */
	public Adapter createTimeZoneCAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iCal.tzprop <em>tzprop</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iCal.tzprop
	 * @generated
	 */
	public Adapter createtzpropAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iCal.AlarmC <em>Alarm C</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iCal.AlarmC
	 * @generated
	 */
	public Adapter createAlarmCAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iCal.ComponentAlarmTime <em>Component Alarm Time</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iCal.ComponentAlarmTime
	 * @generated
	 */
	public Adapter createComponentAlarmTimeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iCal.ComponentAlarmAudioProperty <em>Component Alarm Audio Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iCal.ComponentAlarmAudioProperty
	 * @generated
	 */
	public Adapter createComponentAlarmAudioPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iCal.ComponentAlarmDispProperty <em>Component Alarm Disp Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iCal.ComponentAlarmDispProperty
	 * @generated
	 */
	public Adapter createComponentAlarmDispPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iCal.ComponentAlarmEmailProperty <em>Component Alarm Email Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iCal.ComponentAlarmEmailProperty
	 * @generated
	 */
	public Adapter createComponentAlarmEmailPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iCal.AlarmType <em>Alarm Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iCal.AlarmType
	 * @generated
	 */
	public Adapter createAlarmTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iCal.tzpropOptional <em>tzprop Optional</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iCal.tzpropOptional
	 * @generated
	 */
	public Adapter createtzpropOptionalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ICalAdapterFactory
