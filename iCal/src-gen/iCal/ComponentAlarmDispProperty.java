/**
 */
package iCal;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Alarm Disp Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iCal.ComponentAlarmDispProperty#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see iCal.ICalPackage#getComponentAlarmDispProperty()
 * @model
 * @generated
 */
public interface ComponentAlarmDispProperty extends AlarmType {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see iCal.ICalPackage#getComponentAlarmDispProperty_Description()
	 * @model dataType="iCal.String" required="true"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link iCal.ComponentAlarmDispProperty#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

} // ComponentAlarmDispProperty
