/**
 */
package chooseeditor;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Human Actor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link chooseeditor.HumanActor#getSupervisees <em>Supervisees</em>}</li>
 *   <li>{@link chooseeditor.HumanActor#getSupervisors <em>Supervisors</em>}</li>
 *   <li>{@link chooseeditor.HumanActor#getPerforms <em>Performs</em>}</li>
 * </ul>
 * </p>
 *
 * @see chooseeditor.ChooseeditorPackage#getHumanActor()
 * @model
 * @generated
 */
public interface HumanActor extends ActorContainer {
	/**
	 * Returns the value of the '<em><b>Supervisees</b></em>' reference list.
	 * The list contents are of type {@link chooseeditor.HumanActor}.
	 * It is bidirectional and its opposite is '{@link chooseeditor.HumanActor#getSupervisors <em>Supervisors</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supervisees</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supervisees</em>' reference list.
	 * @see chooseeditor.ChooseeditorPackage#getHumanActor_Supervisees()
	 * @see chooseeditor.HumanActor#getSupervisors
	 * @model opposite="Supervisors"
	 * @generated
	 */
	EList<HumanActor> getSupervisees();

	/**
	 * Returns the value of the '<em><b>Supervisors</b></em>' reference list.
	 * The list contents are of type {@link chooseeditor.HumanActor}.
	 * It is bidirectional and its opposite is '{@link chooseeditor.HumanActor#getSupervisees <em>Supervisees</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supervisors</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supervisors</em>' reference list.
	 * @see chooseeditor.ChooseeditorPackage#getHumanActor_Supervisors()
	 * @see chooseeditor.HumanActor#getSupervisees
	 * @model opposite="Supervisees"
	 * @generated
	 */
	EList<HumanActor> getSupervisors();

	/**
	 * Returns the value of the '<em><b>Performs</b></em>' reference list.
	 * The list contents are of type {@link chooseeditor.Role}.
	 * It is bidirectional and its opposite is '{@link chooseeditor.Role#getPerformedBy <em>Performed By</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Performs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Performs</em>' reference list.
	 * @see chooseeditor.ChooseeditorPackage#getHumanActor_Performs()
	 * @see chooseeditor.Role#getPerformedBy
	 * @model opposite="PerformedBy"
	 * @generated
	 */
	EList<Role> getPerforms();

} // HumanActor
