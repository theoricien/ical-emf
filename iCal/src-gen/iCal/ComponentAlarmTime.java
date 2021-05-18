/**
 */
package iCal;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Alarm Time</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iCal.ComponentAlarmTime#getDuration <em>Duration</em>}</li>
 *   <li>{@link iCal.ComponentAlarmTime#getRepeat <em>Repeat</em>}</li>
 * </ul>
 *
 * @see iCal.ICalPackage#getComponentAlarmTime()
 * @model
 * @generated
 */
public interface ComponentAlarmTime extends EObject {
	/**
	 * Returns the value of the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration</em>' attribute.
	 * @see #setDuration(String)
	 * @see iCal.ICalPackage#getComponentAlarmTime_Duration()
	 * @model dataType="iCal.String"
	 * @generated
	 */
	String getDuration();

	/**
	 * Sets the value of the '{@link iCal.ComponentAlarmTime#getDuration <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration</em>' attribute.
	 * @see #getDuration()
	 * @generated
	 */
	void setDuration(String value);

	/**
	 * Returns the value of the '<em><b>Repeat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repeat</em>' attribute.
	 * @see #setRepeat(String)
	 * @see iCal.ICalPackage#getComponentAlarmTime_Repeat()
	 * @model dataType="iCal.String"
	 * @generated
	 */
	String getRepeat();

	/**
	 * Sets the value of the '{@link iCal.ComponentAlarmTime#getRepeat <em>Repeat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repeat</em>' attribute.
	 * @see #getRepeat()
	 * @generated
	 */
	void setRepeat(String value);

} // ComponentAlarmTime
