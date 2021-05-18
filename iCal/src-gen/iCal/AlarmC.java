/**
 */
package iCal;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Alarm C</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iCal.AlarmC#getAction <em>Action</em>}</li>
 *   <li>{@link iCal.AlarmC#getTrigger <em>Trigger</em>}</li>
 *   <li>{@link iCal.AlarmC#getX_prop <em>Xprop</em>}</li>
 *   <li>{@link iCal.AlarmC#getIana_prop <em>Iana prop</em>}</li>
 *   <li>{@link iCal.AlarmC#getAttach <em>Attach</em>}</li>
 *   <li>{@link iCal.AlarmC#getDescription <em>Description</em>}</li>
 *   <li>{@link iCal.AlarmC#getType <em>Type</em>}</li>
 *   <li>{@link iCal.AlarmC#getTime <em>Time</em>}</li>
 * </ul>
 *
 * @see iCal.ICalPackage#getAlarmC()
 * @model
 * @generated
 */
public interface AlarmC extends Component {
	/**
	 * Returns the value of the '<em><b>Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' attribute.
	 * @see #setAction(String)
	 * @see iCal.ICalPackage#getAlarmC_Action()
	 * @model dataType="iCal.String" required="true"
	 * @generated
	 */
	String getAction();

	/**
	 * Sets the value of the '{@link iCal.AlarmC#getAction <em>Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action</em>' attribute.
	 * @see #getAction()
	 * @generated
	 */
	void setAction(String value);

	/**
	 * Returns the value of the '<em><b>Trigger</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trigger</em>' attribute.
	 * @see #setTrigger(String)
	 * @see iCal.ICalPackage#getAlarmC_Trigger()
	 * @model dataType="iCal.String" required="true"
	 * @generated
	 */
	String getTrigger();

	/**
	 * Sets the value of the '{@link iCal.AlarmC#getTrigger <em>Trigger</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trigger</em>' attribute.
	 * @see #getTrigger()
	 * @generated
	 */
	void setTrigger(String value);

	/**
	 * Returns the value of the '<em><b>Xprop</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Xprop</em>' attribute list.
	 * @see iCal.ICalPackage#getAlarmC_X_prop()
	 * @model dataType="iCal.String"
	 * @generated
	 */
	EList<String> getX_prop();

	/**
	 * Returns the value of the '<em><b>Iana prop</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Iana prop</em>' attribute list.
	 * @see iCal.ICalPackage#getAlarmC_Iana_prop()
	 * @model dataType="iCal.String"
	 * @generated
	 */
	EList<String> getIana_prop();

	/**
	 * Returns the value of the '<em><b>Attach</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attach</em>' attribute.
	 * @see #setAttach(String)
	 * @see iCal.ICalPackage#getAlarmC_Attach()
	 * @model dataType="iCal.String"
	 * @generated
	 */
	String getAttach();

	/**
	 * Sets the value of the '{@link iCal.AlarmC#getAttach <em>Attach</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attach</em>' attribute.
	 * @see #getAttach()
	 * @generated
	 */
	void setAttach(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see iCal.ICalPackage#getAlarmC_Description()
	 * @model dataType="iCal.String"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link iCal.AlarmC#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(AlarmType)
	 * @see iCal.ICalPackage#getAlarmC_Type()
	 * @model containment="true" required="true"
	 * @generated
	 */
	AlarmType getType();

	/**
	 * Sets the value of the '{@link iCal.AlarmC#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(AlarmType value);

	/**
	 * Returns the value of the '<em><b>Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time</em>' containment reference.
	 * @see #setTime(ComponentAlarmTime)
	 * @see iCal.ICalPackage#getAlarmC_Time()
	 * @model containment="true"
	 * @generated
	 */
	ComponentAlarmTime getTime();

	/**
	 * Sets the value of the '{@link iCal.AlarmC#getTime <em>Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time</em>' containment reference.
	 * @see #getTime()
	 * @generated
	 */
	void setTime(ComponentAlarmTime value);

} // AlarmC
