/**
 */
package chooseeditor;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Refinement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link chooseeditor.Refinement#getSupergoal <em>Supergoal</em>}</li>
 *   <li>{@link chooseeditor.Refinement#getSubgoals <em>Subgoals</em>}</li>
 * </ul>
 * </p>
 *
 * @see chooseeditor.ChooseeditorPackage#getRefinement()
 * @model
 * @generated
 */
public interface Refinement extends EObject {
	/**
	 * Returns the value of the '<em><b>Supergoal</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link chooseeditor.Goal#getOr <em>Or</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supergoal</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supergoal</em>' reference.
	 * @see #setSupergoal(Goal)
	 * @see chooseeditor.ChooseeditorPackage#getRefinement_Supergoal()
	 * @see chooseeditor.Goal#getOr
	 * @model opposite="Or" required="true"
	 * @generated
	 */
	Goal getSupergoal();

	/**
	 * Sets the value of the '{@link chooseeditor.Refinement#getSupergoal <em>Supergoal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Supergoal</em>' reference.
	 * @see #getSupergoal()
	 * @generated
	 */
	void setSupergoal(Goal value);

	/**
	 * Returns the value of the '<em><b>Subgoals</b></em>' reference list.
	 * The list contents are of type {@link chooseeditor.Goal}.
	 * It is bidirectional and its opposite is '{@link chooseeditor.Goal#getAnd <em>And</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subgoals</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subgoals</em>' reference list.
	 * @see chooseeditor.ChooseeditorPackage#getRefinement_Subgoals()
	 * @see chooseeditor.Goal#getAnd
	 * @model opposite="And" required="true"
	 * @generated
	 */
	EList<Goal> getSubgoals();

} // Refinement
