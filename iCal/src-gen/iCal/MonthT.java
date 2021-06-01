/**
 */
package iCal;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Month T</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iCal.MonthT#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see iCal.ICalPackage#getMonthT()
 * @model
 * @generated
 */
public interface MonthT extends AMonthT {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(Integer)
	 * @see iCal.ICalPackage#getMonthT_Value()
	 * @model dataType="iCal.Integer" required="true"
	 * @generated
	 */
	Integer getValue();

	/**
	 * Sets the value of the '{@link iCal.MonthT#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Integer value);

} // MonthT
