/**
 */
package iCal;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Alarm Email Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iCal.ComponentAlarmEmailProperty#getAttendee <em>Attendee</em>}</li>
 *   <li>{@link iCal.ComponentAlarmEmailProperty#getDescription <em>Description</em>}</li>
 *   <li>{@link iCal.ComponentAlarmEmailProperty#getAttach <em>Attach</em>}</li>
 * </ul>
 *
 * @see iCal.ICalPackage#getComponentAlarmEmailProperty()
 * @model
 * @generated
 */
public interface ComponentAlarmEmailProperty extends AlarmType {
	/**
	 * Returns the value of the '<em><b>Attendee</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attendee</em>' attribute list.
	 * @see iCal.ICalPackage#getComponentAlarmEmailProperty_Attendee()
	 * @model dataType="iCal.String" required="true"
	 * @generated
	 */
	EList<String> getAttendee();

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see iCal.ICalPackage#getComponentAlarmEmailProperty_Description()
	 * @model dataType="iCal.String" required="true"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link iCal.ComponentAlarmEmailProperty#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Attach</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attach</em>' attribute list.
	 * @see iCal.ICalPackage#getComponentAlarmEmailProperty_Attach()
	 * @model dataType="iCal.String"
	 * @generated
	 */
	EList<String> getAttach();

} // ComponentAlarmEmailProperty
