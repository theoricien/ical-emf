/**
 */
package iCal;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event C</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iCal.EventC#getTransp <em>Transp</em>}</li>
 *   <li>{@link iCal.EventC#getDescription <em>Description</em>}</li>
 *   <li>{@link iCal.EventC#getPriority <em>Priority</em>}</li>
 *   <li>{@link iCal.EventC#getGeo <em>Geo</em>}</li>
 *   <li>{@link iCal.EventC#getLocation <em>Location</em>}</li>
 *   <li>{@link iCal.EventC#getDuration <em>Duration</em>}</li>
 * </ul>
 *
 * @see iCal.ICalPackage#getEventC()
 * @model
 * @generated
 */
public interface EventC extends ComponentAction {
	/**
	 * Returns the value of the '<em><b>Transp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transp</em>' attribute.
	 * @see #setTransp(String)
	 * @see iCal.ICalPackage#getEventC_Transp()
	 * @model dataType="iCal.String"
	 * @generated
	 */
	String getTransp();

	/**
	 * Sets the value of the '{@link iCal.EventC#getTransp <em>Transp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transp</em>' attribute.
	 * @see #getTransp()
	 * @generated
	 */
	void setTransp(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see iCal.ICalPackage#getEventC_Description()
	 * @model dataType="iCal.String"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link iCal.EventC#getDescription <em>Description</em>}' attribute.
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
	 * @see iCal.ICalPackage#getEventC_Priority()
	 * @model dataType="iCal.String"
	 * @generated
	 */
	String getPriority();

	/**
	 * Sets the value of the '{@link iCal.EventC#getPriority <em>Priority</em>}' attribute.
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
	 * @see iCal.ICalPackage#getEventC_Geo()
	 * @model dataType="iCal.String"
	 * @generated
	 */
	String getGeo();

	/**
	 * Sets the value of the '{@link iCal.EventC#getGeo <em>Geo</em>}' attribute.
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
	 * @see iCal.ICalPackage#getEventC_Location()
	 * @model dataType="iCal.String"
	 * @generated
	 */
	String getLocation();

	/**
	 * Sets the value of the '{@link iCal.EventC#getLocation <em>Location</em>}' attribute.
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
	 * @see iCal.ICalPackage#getEventC_Duration()
	 * @model dataType="iCal.String"
	 * @generated
	 */
	String getDuration();

	/**
	 * Sets the value of the '{@link iCal.EventC#getDuration <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration</em>' attribute.
	 * @see #getDuration()
	 * @generated
	 */
	void setDuration(String value);

} // EventC
