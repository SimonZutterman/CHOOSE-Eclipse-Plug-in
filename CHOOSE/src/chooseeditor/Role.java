/**
 */
package chooseeditor;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link chooseeditor.Role#getPerformedBy <em>Performed By</em>}</li>
 * </ul>
 * </p>
 *
 * @see chooseeditor.ChooseeditorPackage#getRole()
 * @model
 * @generated
 */
public interface Role extends ActorContainer {
	/**
	 * Returns the value of the '<em><b>Performed By</b></em>' reference list.
	 * The list contents are of type {@link chooseeditor.HumanActor}.
	 * It is bidirectional and its opposite is '{@link chooseeditor.HumanActor#getPerforms <em>Performs</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Performed By</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Performed By</em>' reference list.
	 * @see chooseeditor.ChooseeditorPackage#getRole_PerformedBy()
	 * @see chooseeditor.HumanActor#getPerforms
	 * @model opposite="Performs"
	 * @generated
	 */
	EList<HumanActor> getPerformedBy();

} // Role
