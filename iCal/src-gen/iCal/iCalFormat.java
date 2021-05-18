/**
 */
package iCal;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>iCal Format</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iCal.iCalFormat#getCalendar <em>Calendar</em>}</li>
 * </ul>
 *
 * @see iCal.ICalPackage#getiCalFormat()
 * @model
 * @generated
 */
public interface iCalFormat extends EObject {
	/**
	 * Returns the value of the '<em><b>Calendar</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Calendar</em>' containment reference.
	 * @see #setCalendar(Calendar)
	 * @see iCal.ICalPackage#getiCalFormat_Calendar()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Calendar getCalendar();

	/**
	 * Sets the value of the '{@link iCal.iCalFormat#getCalendar <em>Calendar</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Calendar</em>' containment reference.
	 * @see #getCalendar()
	 * @generated
	 */
	void setCalendar(Calendar value);

} // iCalFormat
