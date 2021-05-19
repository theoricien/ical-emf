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
 *   <li>{@link iCal.ToDoC#getDescription <em>Description</em>}</li>
 *   <li>{@link iCal.ToDoC#getPriority <em>Priority</em>}</li>
 *   <li>{@link iCal.ToDoC#getGeo <em>Geo</em>}</li>
 *   <li>{@link iCal.ToDoC#getLocation <em>Location</em>}</li>
 *   <li>{@link iCal.ToDoC#getDuration <em>Duration</em>}</li>
 *   <li>{@link iCal.ToDoC#getAlarmc <em>Alarmc</em>}</li>
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
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see iCal.ICalPackage#getToDoC_Description()
	 * @model dataType="iCal.String"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link iCal.ToDoC#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

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
	 * Returns the value of the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration</em>' attribute.
	 * @see #setDuration(String)
	 * @see iCal.ICalPackage#getToDoC_Duration()
	 * @model dataType="iCal.String"
	 * @generated
	 */
	String getDuration();

	/**
	 * Sets the value of the '{@link iCal.ToDoC#getDuration <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration</em>' attribute.
	 * @see #getDuration()
	 * @generated
	 */
	void setDuration(String value);

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

} // ToDoC
