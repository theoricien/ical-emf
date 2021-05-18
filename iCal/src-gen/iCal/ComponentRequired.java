/**
 */
package iCal;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Required</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iCal.ComponentRequired#getDtstamp <em>Dtstamp</em>}</li>
 *   <li>{@link iCal.ComponentRequired#getUid <em>Uid</em>}</li>
 * </ul>
 *
 * @see iCal.ICalPackage#getComponentRequired()
 * @model abstract="true"
 * @generated
 */
public interface ComponentRequired extends Component {
	/**
	 * Returns the value of the '<em><b>Dtstamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dtstamp</em>' attribute.
	 * @see #setDtstamp(String)
	 * @see iCal.ICalPackage#getComponentRequired_Dtstamp()
	 * @model dataType="iCal.String" required="true"
	 * @generated
	 */
	String getDtstamp();

	/**
	 * Sets the value of the '{@link iCal.ComponentRequired#getDtstamp <em>Dtstamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dtstamp</em>' attribute.
	 * @see #getDtstamp()
	 * @generated
	 */
	void setDtstamp(String value);

	/**
	 * Returns the value of the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uid</em>' attribute.
	 * @see #setUid(String)
	 * @see iCal.ICalPackage#getComponentRequired_Uid()
	 * @model dataType="iCal.String" required="true"
	 * @generated
	 */
	String getUid();

	/**
	 * Sets the value of the '{@link iCal.ComponentRequired#getUid <em>Uid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uid</em>' attribute.
	 * @see #getUid()
	 * @generated
	 */
	void setUid(String value);

} // ComponentRequired
