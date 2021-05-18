/**
 */
package iCal;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>tzprop</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iCal.tzprop#getDtstart <em>Dtstart</em>}</li>
 *   <li>{@link iCal.tzprop#getTzoffseto <em>Tzoffseto</em>}</li>
 *   <li>{@link iCal.tzprop#getTzoffsetfrom <em>Tzoffsetfrom</em>}</li>
 *   <li>{@link iCal.tzprop#getRrule <em>Rrule</em>}</li>
 *   <li>{@link iCal.tzprop#getOpt <em>Opt</em>}</li>
 * </ul>
 *
 * @see iCal.ICalPackage#gettzprop()
 * @model
 * @generated
 */
public interface tzprop extends EObject {
	/**
	 * Returns the value of the '<em><b>Dtstart</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dtstart</em>' attribute.
	 * @see #setDtstart(String)
	 * @see iCal.ICalPackage#gettzprop_Dtstart()
	 * @model dataType="iCal.String" required="true"
	 * @generated
	 */
	String getDtstart();

	/**
	 * Sets the value of the '{@link iCal.tzprop#getDtstart <em>Dtstart</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dtstart</em>' attribute.
	 * @see #getDtstart()
	 * @generated
	 */
	void setDtstart(String value);

	/**
	 * Returns the value of the '<em><b>Tzoffseto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tzoffseto</em>' attribute.
	 * @see #setTzoffseto(String)
	 * @see iCal.ICalPackage#gettzprop_Tzoffseto()
	 * @model dataType="iCal.String" required="true"
	 * @generated
	 */
	String getTzoffseto();

	/**
	 * Sets the value of the '{@link iCal.tzprop#getTzoffseto <em>Tzoffseto</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tzoffseto</em>' attribute.
	 * @see #getTzoffseto()
	 * @generated
	 */
	void setTzoffseto(String value);

	/**
	 * Returns the value of the '<em><b>Tzoffsetfrom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tzoffsetfrom</em>' attribute.
	 * @see #setTzoffsetfrom(String)
	 * @see iCal.ICalPackage#gettzprop_Tzoffsetfrom()
	 * @model dataType="iCal.String" required="true"
	 * @generated
	 */
	String getTzoffsetfrom();

	/**
	 * Sets the value of the '{@link iCal.tzprop#getTzoffsetfrom <em>Tzoffsetfrom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tzoffsetfrom</em>' attribute.
	 * @see #getTzoffsetfrom()
	 * @generated
	 */
	void setTzoffsetfrom(String value);

	/**
	 * Returns the value of the '<em><b>Rrule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rrule</em>' attribute.
	 * @see #setRrule(String)
	 * @see iCal.ICalPackage#gettzprop_Rrule()
	 * @model dataType="iCal.String"
	 * @generated
	 */
	String getRrule();

	/**
	 * Sets the value of the '{@link iCal.tzprop#getRrule <em>Rrule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rrule</em>' attribute.
	 * @see #getRrule()
	 * @generated
	 */
	void setRrule(String value);

	/**
	 * Returns the value of the '<em><b>Opt</b></em>' containment reference list.
	 * The list contents are of type {@link iCal.tzpropOptional}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Opt</em>' containment reference list.
	 * @see iCal.ICalPackage#gettzprop_Opt()
	 * @model containment="true"
	 * @generated
	 */
	EList<tzpropOptional> getOpt();

} // tzprop
