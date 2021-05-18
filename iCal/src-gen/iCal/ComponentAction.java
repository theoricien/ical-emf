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
 *   <li>{@link iCal.ComponentAction#getDtstart <em>Dtstart</em>}</li>
 *   <li>{@link iCal.ComponentAction#getClass_ <em>Class</em>}</li>
 *   <li>{@link iCal.ComponentAction#getCreated <em>Created</em>}</li>
 *   <li>{@link iCal.ComponentAction#getLast_mod <em>Last mod</em>}</li>
 *   <li>{@link iCal.ComponentAction#getOrganizer <em>Organizer</em>}</li>
 *   <li>{@link iCal.ComponentAction#getSeq <em>Seq</em>}</li>
 *   <li>{@link iCal.ComponentAction#getStatus <em>Status</em>}</li>
 *   <li>{@link iCal.ComponentAction#getSummary <em>Summary</em>}</li>
 *   <li>{@link iCal.ComponentAction#getUrl <em>Url</em>}</li>
 *   <li>{@link iCal.ComponentAction#getRecurid <em>Recurid</em>}</li>
 *   <li>{@link iCal.ComponentAction#getOpt <em>Opt</em>}</li>
 * </ul>
 *
 * @see iCal.ICalPackage#getComponentAction()
 * @model abstract="true"
 * @generated
 */
public interface ComponentAction extends ComponentRequired {
	/**
	 * Returns the value of the '<em><b>Dtstart</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dtstart</em>' attribute.
	 * @see #setDtstart(String)
	 * @see iCal.ICalPackage#getComponentAction_Dtstart()
	 * @model dataType="iCal.String"
	 * @generated
	 */
	String getDtstart();

	/**
	 * Sets the value of the '{@link iCal.ComponentAction#getDtstart <em>Dtstart</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dtstart</em>' attribute.
	 * @see #getDtstart()
	 * @generated
	 */
	void setDtstart(String value);

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
	 * Returns the value of the '<em><b>Opt</b></em>' containment reference list.
	 * The list contents are of type {@link iCal.ComponentActionOptionalProperties}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Opt</em>' containment reference list.
	 * @see iCal.ICalPackage#getComponentAction_Opt()
	 * @model containment="true"
	 * @generated
	 */
	EList<ComponentActionOptionalProperties> getOpt();

} // ComponentAction
