/**
 */
package iCal;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time Zone C</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iCal.TimeZoneC#getTzid <em>Tzid</em>}</li>
 *   <li>{@link iCal.TimeZoneC#getLast_mod <em>Last mod</em>}</li>
 *   <li>{@link iCal.TimeZoneC#getTzurl <em>Tzurl</em>}</li>
 *   <li>{@link iCal.TimeZoneC#getStandardc <em>Standardc</em>}</li>
 *   <li>{@link iCal.TimeZoneC#getDaylightc <em>Daylightc</em>}</li>
 *   <li>{@link iCal.TimeZoneC#getX_prop <em>Xprop</em>}</li>
 *   <li>{@link iCal.TimeZoneC#getIana_prop <em>Iana prop</em>}</li>
 * </ul>
 *
 * @see iCal.ICalPackage#getTimeZoneC()
 * @model
 * @generated
 */
public interface TimeZoneC extends Component {
	/**
	 * Returns the value of the '<em><b>Tzid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tzid</em>' attribute.
	 * @see #setTzid(String)
	 * @see iCal.ICalPackage#getTimeZoneC_Tzid()
	 * @model dataType="iCal.String" required="true"
	 * @generated
	 */
	String getTzid();

	/**
	 * Sets the value of the '{@link iCal.TimeZoneC#getTzid <em>Tzid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tzid</em>' attribute.
	 * @see #getTzid()
	 * @generated
	 */
	void setTzid(String value);

	/**
	 * Returns the value of the '<em><b>Last mod</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last mod</em>' attribute.
	 * @see #setLast_mod(String)
	 * @see iCal.ICalPackage#getTimeZoneC_Last_mod()
	 * @model dataType="iCal.String"
	 * @generated
	 */
	String getLast_mod();

	/**
	 * Sets the value of the '{@link iCal.TimeZoneC#getLast_mod <em>Last mod</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last mod</em>' attribute.
	 * @see #getLast_mod()
	 * @generated
	 */
	void setLast_mod(String value);

	/**
	 * Returns the value of the '<em><b>Tzurl</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tzurl</em>' attribute.
	 * @see #setTzurl(String)
	 * @see iCal.ICalPackage#getTimeZoneC_Tzurl()
	 * @model dataType="iCal.String"
	 * @generated
	 */
	String getTzurl();

	/**
	 * Sets the value of the '{@link iCal.TimeZoneC#getTzurl <em>Tzurl</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tzurl</em>' attribute.
	 * @see #getTzurl()
	 * @generated
	 */
	void setTzurl(String value);

	/**
	 * Returns the value of the '<em><b>Standardc</b></em>' containment reference list.
	 * The list contents are of type {@link iCal.tzprop}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Standardc</em>' containment reference list.
	 * @see iCal.ICalPackage#getTimeZoneC_Standardc()
	 * @model containment="true"
	 * @generated
	 */
	EList<tzprop> getStandardc();

	/**
	 * Returns the value of the '<em><b>Daylightc</b></em>' containment reference list.
	 * The list contents are of type {@link iCal.tzprop}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Daylightc</em>' containment reference list.
	 * @see iCal.ICalPackage#getTimeZoneC_Daylightc()
	 * @model containment="true"
	 * @generated
	 */
	EList<tzprop> getDaylightc();

	/**
	 * Returns the value of the '<em><b>Xprop</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Xprop</em>' attribute list.
	 * @see iCal.ICalPackage#getTimeZoneC_X_prop()
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
	 * @see iCal.ICalPackage#getTimeZoneC_Iana_prop()
	 * @model dataType="iCal.String"
	 * @generated
	 */
	EList<String> getIana_prop();

} // TimeZoneC
