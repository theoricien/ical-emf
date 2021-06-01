/**
 */
package iCal;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>To Do C</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iCal.ToDoC#getCompleted <em>Completed</em>}</li>
 *   <li>{@link iCal.ToDoC#getPriority <em>Priority</em>}</li>
 *   <li>{@link iCal.ToDoC#getGeo <em>Geo</em>}</li>
 *   <li>{@link iCal.ToDoC#getLocation <em>Location</em>}</li>
 *   <li>{@link iCal.ToDoC#getAlarmc <em>Alarmc</em>}</li>
 *   <li>{@link iCal.ToDoC#getDtend <em>Dtend</em>}</li>
 * </ul>
 *
 * @see iCal.ICalPackage#getToDoC()
 * @model
 * @generated
 */
public interface ToDoC extends ComponentAction {
	/**
	 * Returns the value of the '<em><b>Completed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Completed</em>' attribute.
	 * @see #setCompleted(String)
	 * @see iCal.ICalPackage#getToDoC_Completed()
	 * @model dataType="iCal.String"
	 * @generated
	 */
	String getCompleted();

	/**
	 * Sets the value of the '{@link iCal.ToDoC#getCompleted <em>Completed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Completed</em>' attribute.
	 * @see #getCompleted()
	 * @generated
	 */
	void setCompleted(String value);

	/**
	 * Returns the value of the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Priority</em>' attribute.
	 * @see #setPriority(String)
	 * @see iCal.ICalPackage#getToDoC_Priority()
	 * @model dataType="iCal.String"
	 * @generated
	 */
	String getPriority();

	/**
	 * Sets the value of the '{@link iCal.ToDoC#getPriority <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' attribute.
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(String value);

	/**
	 * Returns the value of the '<em><b>Geo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Geo</em>' attribute.
	 * @see #setGeo(String)
	 * @see iCal.ICalPackage#getToDoC_Geo()
	 * @model dataType="iCal.String"
	 * @generated
	 */
	String getGeo();

	/**
	 * Sets the value of the '{@link iCal.ToDoC#getGeo <em>Geo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Geo</em>' attribute.
	 * @see #getGeo()
	 * @generated
	 */
	void setGeo(String value);

	/**
	 * Returns the value of the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' attribute.
	 * @see #setLocation(String)
	 * @see iCal.ICalPackage#getToDoC_Location()
	 * @model dataType="iCal.String"
	 * @generated
	 */
	String getLocation();

	/**
	 * Sets the value of the '{@link iCal.ToDoC#getLocation <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' attribute.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(String value);

	/**
	 * Returns the value of the '<em><b>Alarmc</b></em>' containment reference list.
	 * The list contents are of type {@link iCal.AlarmC}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alarmc</em>' containment reference list.
	 * @see iCal.ICalPackage#getToDoC_Alarmc()
	 * @model containment="true"
	 * @generated
	 */
	EList<AlarmC> getAlarmc();

	/**
	 * Returns the value of the '<em><b>Dtend</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dtend</em>' containment reference.
	 * @see #setDtend(DateT)
	 * @see iCal.ICalPackage#getToDoC_Dtend()
	 * @model containment="true"
	 * @generated
	 */
	DateT getDtend();

	/**
	 * Sets the value of the '{@link iCal.ToDoC#getDtend <em>Dtend</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dtend</em>' containment reference.
	 * @see #getDtend()
	 * @generated
	 */
	void setDtend(DateT value);

} // ToDoC
