/**
 */
package iCal;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Alarm Audio Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iCal.ComponentAlarmAudioProperty#getAttach <em>Attach</em>}</li>
 * </ul>
 *
 * @see iCal.ICalPackage#getComponentAlarmAudioProperty()
 * @model
 * @generated
 */
public interface ComponentAlarmAudioProperty extends AlarmType {
	/**
	 * Returns the value of the '<em><b>Attach</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attach</em>' attribute.
	 * @see #setAttach(String)
	 * @see iCal.ICalPackage#getComponentAlarmAudioProperty_Attach()
	 * @model dataType="iCal.String"
	 * @generated
	 */
	String getAttach();

	/**
	 * Sets the value of the '{@link iCal.ComponentAlarmAudioProperty#getAttach <em>Attach</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attach</em>' attribute.
	 * @see #getAttach()
	 * @generated
	 */
	void setAttach(String value);

} // ComponentAlarmAudioProperty
