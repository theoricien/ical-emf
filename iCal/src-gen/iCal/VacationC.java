/**
 */
package iCal;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vacation C</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iCal.VacationC#getOrganizer <em>Organizer</em>}</li>
 *   <li>{@link iCal.VacationC#getUrl <em>Url</em>}</li>
 *   <li>{@link iCal.VacationC#getContact <em>Contact</em>}</li>
 *   <li>{@link iCal.VacationC#getDtend <em>Dtend</em>}</li>
 *   <li>{@link iCal.VacationC#getAttendee <em>Attendee</em>}</li>
 *   <li>{@link iCal.VacationC#getComment <em>Comment</em>}</li>
 *   <li>{@link iCal.VacationC#getFreebusy <em>Freebusy</em>}</li>
 *   <li>{@link iCal.VacationC#getRstatus <em>Rstatus</em>}</li>
 *   <li>{@link iCal.VacationC#getX_prop <em>Xprop</em>}</li>
 *   <li>{@link iCal.VacationC#getIana_prop <em>Iana prop</em>}</li>
 * </ul>
 *
 * @see iCal.ICalPackage#getVacationC()
 * @model
 * @generated
 */
public interface VacationC extends ComponentRequired {
	/**
	 * Returns the value of the '<em><b>Organizer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Organizer</em>' attribute.
	 * @see #setOrganizer(String)
	 * @see iCal.ICalPackage#getVacationC_Organizer()
	 * @model dataType="iCal.String"
	 * @generated
	 */
	String getOrganizer();

	/**
	 * Sets the value of the '{@link iCal.VacationC#getOrganizer <em>Organizer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Organizer</em>' attribute.
	 * @see #getOrganizer()
	 * @generated
	 */
	void setOrganizer(String value);

	/**
	 * Returns the value of the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Url</em>' attribute.
	 * @see #setUrl(String)
	 * @see iCal.ICalPackage#getVacationC_Url()
	 * @model dataType="iCal.String"
	 * @generated
	 */
	String getUrl();

	/**
	 * Sets the value of the '{@link iCal.VacationC#getUrl <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' attribute.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(String value);

	/**
	 * Returns the value of the '<em><b>Contact</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contact</em>' attribute.
	 * @see #setContact(String)
	 * @see iCal.ICalPackage#getVacationC_Contact()
	 * @model dataType="iCal.String"
	 * @generated
	 */
	String getContact();

	/**
	 * Sets the value of the '{@link iCal.VacationC#getContact <em>Contact</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contact</em>' attribute.
	 * @see #getContact()
	 * @generated
	 */
	void setContact(String value);

	/**
	 * Returns the value of the '<em><b>Dtend</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dtend</em>' attribute.
	 * @see #setDtend(String)
	 * @see iCal.ICalPackage#getVacationC_Dtend()
	 * @model dataType="iCal.String"
	 * @generated
	 */
	String getDtend();

	/**
	 * Sets the value of the '{@link iCal.VacationC#getDtend <em>Dtend</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dtend</em>' attribute.
	 * @see #getDtend()
	 * @generated
	 */
	void setDtend(String value);

	/**
	 * Returns the value of the '<em><b>Attendee</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attendee</em>' attribute list.
	 * @see iCal.ICalPackage#getVacationC_Attendee()
	 * @model dataType="iCal.String"
	 * @generated
	 */
	EList<String> getAttendee();

	/**
	 * Returns the value of the '<em><b>Comment</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comment</em>' attribute list.
	 * @see iCal.ICalPackage#getVacationC_Comment()
	 * @model dataType="iCal.String"
	 * @generated
	 */
	EList<String> getComment();

	/**
	 * Returns the value of the '<em><b>Freebusy</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Freebusy</em>' attribute list.
	 * @see iCal.ICalPackage#getVacationC_Freebusy()
	 * @model dataType="iCal.String"
	 * @generated
	 */
	EList<String> getFreebusy();

	/**
	 * Returns the value of the '<em><b>Rstatus</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rstatus</em>' attribute list.
	 * @see iCal.ICalPackage#getVacationC_Rstatus()
	 * @model dataType="iCal.String"
	 * @generated
	 */
	EList<String> getRstatus();

	/**
	 * Returns the value of the '<em><b>Xprop</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Xprop</em>' attribute list.
	 * @see iCal.ICalPackage#getVacationC_X_prop()
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
	 * @see iCal.ICalPackage#getVacationC_Iana_prop()
	 * @model dataType="iCal.String"
	 * @generated
	 */
	EList<String> getIana_prop();

} // VacationC
