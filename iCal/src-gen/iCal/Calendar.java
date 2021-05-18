/**
 */
package iCal;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Calendar</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iCal.Calendar#getProdid <em>Prodid</em>}</li>
 *   <li>{@link iCal.Calendar#getVersion <em>Version</em>}</li>
 *   <li>{@link iCal.Calendar#getCalscale <em>Calscale</em>}</li>
 *   <li>{@link iCal.Calendar#getMethod <em>Method</em>}</li>
 *   <li>{@link iCal.Calendar#getX_prop <em>Xprop</em>}</li>
 *   <li>{@link iCal.Calendar#getIana_prop <em>Iana prop</em>}</li>
 * </ul>
 *
 * @see iCal.ICalPackage#getCalendar()
 * @model
 * @generated
 */
public interface Calendar extends Component {
	/**
	 * Returns the value of the '<em><b>Prodid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prodid</em>' attribute.
	 * @see #setProdid(String)
	 * @see iCal.ICalPackage#getCalendar_Prodid()
	 * @model dataType="iCal.String" required="true"
	 * @generated
	 */
	String getProdid();

	/**
	 * Sets the value of the '{@link iCal.Calendar#getProdid <em>Prodid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prodid</em>' attribute.
	 * @see #getProdid()
	 * @generated
	 */
	void setProdid(String value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see iCal.ICalPackage#getCalendar_Version()
	 * @model dataType="iCal.String" required="true"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link iCal.Calendar#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Returns the value of the '<em><b>Calscale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Calscale</em>' attribute.
	 * @see #setCalscale(String)
	 * @see iCal.ICalPackage#getCalendar_Calscale()
	 * @model dataType="iCal.String"
	 * @generated
	 */
	String getCalscale();

	/**
	 * Sets the value of the '{@link iCal.Calendar#getCalscale <em>Calscale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Calscale</em>' attribute.
	 * @see #getCalscale()
	 * @generated
	 */
	void setCalscale(String value);

	/**
	 * Returns the value of the '<em><b>Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method</em>' attribute.
	 * @see #setMethod(String)
	 * @see iCal.ICalPackage#getCalendar_Method()
	 * @model dataType="iCal.String"
	 * @generated
	 */
	String getMethod();

	/**
	 * Sets the value of the '{@link iCal.Calendar#getMethod <em>Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method</em>' attribute.
	 * @see #getMethod()
	 * @generated
	 */
	void setMethod(String value);

	/**
	 * Returns the value of the '<em><b>Xprop</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Xprop</em>' attribute list.
	 * @see iCal.ICalPackage#getCalendar_X_prop()
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
	 * @see iCal.ICalPackage#getCalendar_Iana_prop()
	 * @model dataType="iCal.String"
	 * @generated
	 */
	EList<String> getIana_prop();

} // Calendar
