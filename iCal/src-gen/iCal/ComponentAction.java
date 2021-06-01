/**
 */
package iCal;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iCal.ComponentAction#getClass_ <em>Class</em>}</li>
 *   <li>{@link iCal.ComponentAction#getCreated <em>Created</em>}</li>
 *   <li>{@link iCal.ComponentAction#getLast_mod <em>Last mod</em>}</li>
 *   <li>{@link iCal.ComponentAction#getOrganizer <em>Organizer</em>}</li>
 *   <li>{@link iCal.ComponentAction#getSeq <em>Seq</em>}</li>
 *   <li>{@link iCal.ComponentAction#getStatus <em>Status</em>}</li>
 *   <li>{@link iCal.ComponentAction#getSummary <em>Summary</em>}</li>
 *   <li>{@link iCal.ComponentAction#getUrl <em>Url</em>}</li>
 *   <li>{@link iCal.ComponentAction#getRecurid <em>Recurid</em>}</li>
 *   <li>{@link iCal.ComponentAction#getRrule <em>Rrule</em>}</li>
 *   <li>{@link iCal.ComponentAction#getAttach <em>Attach</em>}</li>
 *   <li>{@link iCal.ComponentAction#getAttendee <em>Attendee</em>}</li>
 *   <li>{@link iCal.ComponentAction#getCategories <em>Categories</em>}</li>
 *   <li>{@link iCal.ComponentAction#getComment <em>Comment</em>}</li>
 *   <li>{@link iCal.ComponentAction#getContact <em>Contact</em>}</li>
 *   <li>{@link iCal.ComponentAction#getExdate <em>Exdate</em>}</li>
 *   <li>{@link iCal.ComponentAction#getRstatus <em>Rstatus</em>}</li>
 *   <li>{@link iCal.ComponentAction#getRelated <em>Related</em>}</li>
 *   <li>{@link iCal.ComponentAction#getResources <em>Resources</em>}</li>
 *   <li>{@link iCal.ComponentAction#getRdate <em>Rdate</em>}</li>
 *   <li>{@link iCal.ComponentAction#getX_prop <em>Xprop</em>}</li>
 *   <li>{@link iCal.ComponentAction#getIana_prop <em>Iana prop</em>}</li>
 *   <li>{@link iCal.ComponentAction#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see iCal.ICalPackage#getComponentAction()
 * @model abstract="true"
 * @generated
 */
public interface ComponentAction extends ComponentRequired {
	/**
	 * Returns the value of the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class</em>' attribute.
	 * @see #setClass(String)
	 * @see iCal.ICalPackage#getComponentAction_Class()
	 * @model dataType="iCal.String"
	 * @generated
	 */
	String getClass_();

	/**
	 * Sets the value of the '{@link iCal.ComponentAction#getClass_ <em>Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class</em>' attribute.
	 * @see #getClass_()
	 * @generated
	 */
	void setClass(String value);

	/**
	 * Returns the value of the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Created</em>' attribute.
	 * @see #setCreated(String)
	 * @see iCal.ICalPackage#getComponentAction_Created()
	 * @model dataType="iCal.String"
	 * @generated
	 */
	String getCreated();

	/**
	 * Sets the value of the '{@link iCal.ComponentAction#getCreated <em>Created</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created</em>' attribute.
	 * @see #getCreated()
	 * @generated
	 */
	void setCreated(String value);

	/**
	 * Returns the value of the '<em><b>Last mod</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last mod</em>' attribute.
	 * @see #setLast_mod(String)
	 * @see iCal.ICalPackage#getComponentAction_Last_mod()
	 * @model dataType="iCal.String"
	 * @generated
	 */
	String getLast_mod();

	/**
	 * Sets the value of the '{@link iCal.ComponentAction#getLast_mod <em>Last mod</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last mod</em>' attribute.
	 * @see #getLast_mod()
	 * @generated
	 */
	void setLast_mod(String value);

	/**
	 * Returns the value of the '<em><b>Organizer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Organizer</em>' attribute.
	 * @see #setOrganizer(String)
	 * @see iCal.ICalPackage#getComponentAction_Organizer()
	 * @model dataType="iCal.String"
	 * @generated
	 */
	String getOrganizer();

	/**
	 * Sets the value of the '{@link iCal.ComponentAction#getOrganizer <em>Organizer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Organizer</em>' attribute.
	 * @see #getOrganizer()
	 * @generated
	 */
	void setOrganizer(String value);

	/**
	 * Returns the value of the '<em><b>Seq</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Seq</em>' attribute.
	 * @see #setSeq(String)
	 * @see iCal.ICalPackage#getComponentAction_Seq()
	 * @model dataType="iCal.String"
	 * @generated
	 */
	String getSeq();

	/**
	 * Sets the value of the '{@link iCal.ComponentAction#getSeq <em>Seq</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Seq</em>' attribute.
	 * @see #getSeq()
	 * @generated
	 */
	void setSeq(String value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see #setStatus(String)
	 * @see iCal.ICalPackage#getComponentAction_Status()
	 * @model dataType="iCal.String"
	 * @generated
	 */
	String getStatus();

	/**
	 * Sets the value of the '{@link iCal.ComponentAction#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(String value);

	/**
	 * Returns the value of the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Summary</em>' attribute.
	 * @see #setSummary(String)
	 * @see iCal.ICalPackage#getComponentAction_Summary()
	 * @model dataType="iCal.String"
	 * @generated
	 */
	String getSummary();

	/**
	 * Sets the value of the '{@link iCal.ComponentAction#getSummary <em>Summary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Summary</em>' attribute.
	 * @see #getSummary()
	 * @generated
	 */
	void setSummary(String value);

	/**
	 * Returns the value of the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Url</em>' attribute.
	 * @see #setUrl(String)
	 * @see iCal.ICalPackage#getComponentAction_Url()
	 * @model dataType="iCal.String"
	 * @generated
	 */
	String getUrl();

	/**
	 * Sets the value of the '{@link iCal.ComponentAction#getUrl <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' attribute.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(String value);

	/**
	 * Returns the value of the '<em><b>Recurid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recurid</em>' attribute.
	 * @see #setRecurid(String)
	 * @see iCal.ICalPackage#getComponentAction_Recurid()
	 * @model dataType="iCal.String"
	 * @generated
	 */
	String getRecurid();

	/**
	 * Sets the value of the '{@link iCal.ComponentAction#getRecurid <em>Recurid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recurid</em>' attribute.
	 * @see #getRecurid()
	 * @generated
	 */
	void setRecurid(String value);

	/**
	 * Returns the value of the '<em><b>Rrule</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rrule</em>' attribute list.
	 * @see iCal.ICalPackage#getComponentAction_Rrule()
	 * @model dataType="iCal.String"
	 * @generated
	 */
	EList<String> getRrule();

	/**
	 * Returns the value of the '<em><b>Attach</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attach</em>' attribute list.
	 * @see iCal.ICalPackage#getComponentAction_Attach()
	 * @model dataType="iCal.String"
	 * @generated
	 */
	EList<String> getAttach();

	/**
	 * Returns the value of the '<em><b>Attendee</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attendee</em>' attribute list.
	 * @see iCal.ICalPackage#getComponentAction_Attendee()
	 * @model dataType="iCal.String"
	 * @generated
	 */
	EList<String> getAttendee();

	/**
	 * Returns the value of the '<em><b>Categories</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categories</em>' attribute list.
	 * @see iCal.ICalPackage#getComponentAction_Categories()
	 * @model dataType="iCal.String"
	 * @generated
	 */
	EList<String> getCategories();

	/**
	 * Returns the value of the '<em><b>Comment</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comment</em>' attribute list.
	 * @see iCal.ICalPackage#getComponentAction_Comment()
	 * @model dataType="iCal.String"
	 * @generated
	 */
	EList<String> getComment();

	/**
	 * Returns the value of the '<em><b>Contact</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contact</em>' attribute list.
	 * @see iCal.ICalPackage#getComponentAction_Contact()
	 * @model dataType="iCal.String"
	 * @generated
	 */
	EList<String> getContact();

	/**
	 * Returns the value of the '<em><b>Exdate</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exdate</em>' attribute list.
	 * @see iCal.ICalPackage#getComponentAction_Exdate()
	 * @model dataType="iCal.String"
	 * @generated
	 */
	EList<String> getExdate();

	/**
	 * Returns the value of the '<em><b>Rstatus</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rstatus</em>' attribute list.
	 * @see iCal.ICalPackage#getComponentAction_Rstatus()
	 * @model dataType="iCal.String"
	 * @generated
	 */
	EList<String> getRstatus();

	/**
	 * Returns the value of the '<em><b>Related</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Related</em>' attribute list.
	 * @see iCal.ICalPackage#getComponentAction_Related()
	 * @model dataType="iCal.String"
	 * @generated
	 */
	EList<String> getRelated();

	/**
	 * Returns the value of the '<em><b>Resources</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resources</em>' attribute list.
	 * @see iCal.ICalPackage#getComponentAction_Resources()
	 * @model dataType="iCal.String"
	 * @generated
	 */
	EList<String> getResources();

	/**
	 * Returns the value of the '<em><b>Rdate</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rdate</em>' attribute list.
	 * @see iCal.ICalPackage#getComponentAction_Rdate()
	 * @model dataType="iCal.String"
	 * @generated
	 */
	EList<String> getRdate();

	/**
	 * Returns the value of the '<em><b>Xprop</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Xprop</em>' attribute list.
	 * @see iCal.ICalPackage#getComponentAction_X_prop()
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
	 * @see iCal.ICalPackage#getComponentAction_Iana_prop()
	 * @model dataType="iCal.String"
	 * @generated
	 */
	EList<String> getIana_prop();

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see iCal.ICalPackage#getComponentAction_Description()
	 * @model dataType="iCal.String"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link iCal.ComponentAction#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

} // ComponentAction
