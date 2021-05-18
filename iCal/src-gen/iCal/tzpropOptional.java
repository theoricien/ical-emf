/**
 */
package iCal;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>tzprop Optional</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iCal.tzpropOptional#getComment <em>Comment</em>}</li>
 *   <li>{@link iCal.tzpropOptional#getRdate <em>Rdate</em>}</li>
 *   <li>{@link iCal.tzpropOptional#getTzname <em>Tzname</em>}</li>
 *   <li>{@link iCal.tzpropOptional#getX_prop <em>Xprop</em>}</li>
 *   <li>{@link iCal.tzpropOptional#getIana_prop <em>Iana prop</em>}</li>
 * </ul>
 *
 * @see iCal.ICalPackage#gettzpropOptional()
 * @model
 * @generated
 */
public interface tzpropOptional extends EObject {
	/**
	 * Returns the value of the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comment</em>' attribute.
	 * @see #setComment(String)
	 * @see iCal.ICalPackage#gettzpropOptional_Comment()
	 * @model dataType="iCal.String"
	 * @generated
	 */
	String getComment();

	/**
	 * Sets the value of the '{@link iCal.tzpropOptional#getComment <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comment</em>' attribute.
	 * @see #getComment()
	 * @generated
	 */
	void setComment(String value);

	/**
	 * Returns the value of the '<em><b>Rdate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rdate</em>' attribute.
	 * @see #setRdate(String)
	 * @see iCal.ICalPackage#gettzpropOptional_Rdate()
	 * @model dataType="iCal.String"
	 * @generated
	 */
	String getRdate();

	/**
	 * Sets the value of the '{@link iCal.tzpropOptional#getRdate <em>Rdate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rdate</em>' attribute.
	 * @see #getRdate()
	 * @generated
	 */
	void setRdate(String value);

	/**
	 * Returns the value of the '<em><b>Tzname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tzname</em>' attribute.
	 * @see #setTzname(String)
	 * @see iCal.ICalPackage#gettzpropOptional_Tzname()
	 * @model dataType="iCal.String"
	 * @generated
	 */
	String getTzname();

	/**
	 * Sets the value of the '{@link iCal.tzpropOptional#getTzname <em>Tzname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tzname</em>' attribute.
	 * @see #getTzname()
	 * @generated
	 */
	void setTzname(String value);

	/**
	 * Returns the value of the '<em><b>Xprop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Xprop</em>' attribute.
	 * @see #setX_prop(String)
	 * @see iCal.ICalPackage#gettzpropOptional_X_prop()
	 * @model dataType="iCal.String"
	 * @generated
	 */
	String getX_prop();

	/**
	 * Sets the value of the '{@link iCal.tzpropOptional#getX_prop <em>Xprop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xprop</em>' attribute.
	 * @see #getX_prop()
	 * @generated
	 */
	void setX_prop(String value);

	/**
	 * Returns the value of the '<em><b>Iana prop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Iana prop</em>' attribute.
	 * @see #setIana_prop(String)
	 * @see iCal.ICalPackage#gettzpropOptional_Iana_prop()
	 * @model dataType="iCal.String"
	 * @generated
	 */
	String getIana_prop();

	/**
	 * Sets the value of the '{@link iCal.tzpropOptional#getIana_prop <em>Iana prop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Iana prop</em>' attribute.
	 * @see #getIana_prop()
	 * @generated
	 */
	void setIana_prop(String value);

} // tzpropOptional
