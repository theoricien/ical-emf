/**
 */
package iCal;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iCal.Component#getNestedComponent <em>Nested Component</em>}</li>
 * </ul>
 *
 * @see iCal.ICalPackage#getComponent()
 * @model abstract="true"
 * @generated
 */
public interface Component extends EObject {
	/**
	 * Returns the value of the '<em><b>Nested Component</b></em>' containment reference list.
	 * The list contents are of type {@link iCal.Component}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nested Component</em>' containment reference list.
	 * @see iCal.ICalPackage#getComponent_NestedComponent()
	 * @model containment="true"
	 * @generated
	 */
	EList<Component> getNestedComponent();

} // Component
