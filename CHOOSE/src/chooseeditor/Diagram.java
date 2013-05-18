/**
 */
package chooseeditor;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diagram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link chooseeditor.Diagram#getGoals <em>Goals</em>}</li>
 *   <li>{@link chooseeditor.Diagram#getRefinements <em>Refinements</em>}</li>
 *   <li>{@link chooseeditor.Diagram#getActors <em>Actors</em>}</li>
 *   <li>{@link chooseeditor.Diagram#getObjects <em>Objects</em>}</li>
 *   <li>{@link chooseeditor.Diagram#getOperations <em>Operations</em>}</li>
 * </ul>
 * </p>
 *
 * @see chooseeditor.ChooseeditorPackage#getDiagram()
 * @model
 * @generated
 */
public interface Diagram extends EObject {
	/**
	 * Returns the value of the '<em><b>Goals</b></em>' containment reference list.
	 * The list contents are of type {@link chooseeditor.Goal}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Goals</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Goals</em>' containment reference list.
	 * @see chooseeditor.ChooseeditorPackage#getDiagram_Goals()
	 * @model containment="true"
	 * @generated
	 */
	EList<Goal> getGoals();

	/**
	 * Returns the value of the '<em><b>Refinements</b></em>' containment reference list.
	 * The list contents are of type {@link chooseeditor.Refinement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Refinements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refinements</em>' containment reference list.
	 * @see chooseeditor.ChooseeditorPackage#getDiagram_Refinements()
	 * @model containment="true"
	 * @generated
	 */
	EList<Refinement> getRefinements();

	/**
	 * Returns the value of the '<em><b>Actors</b></em>' containment reference list.
	 * The list contents are of type {@link chooseeditor.ActorContainer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actors</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actors</em>' containment reference list.
	 * @see chooseeditor.ChooseeditorPackage#getDiagram_Actors()
	 * @model containment="true"
	 * @generated
	 */
	EList<ActorContainer> getActors();

	/**
	 * Returns the value of the '<em><b>Objects</b></em>' containment reference list.
	 * The list contents are of type {@link chooseeditor.Object}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Objects</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Objects</em>' containment reference list.
	 * @see chooseeditor.ChooseeditorPackage#getDiagram_Objects()
	 * @model containment="true"
	 * @generated
	 */
	EList<chooseeditor.Object> getObjects();

	/**
	 * Returns the value of the '<em><b>Operations</b></em>' containment reference list.
	 * The list contents are of type {@link chooseeditor.OperationContainer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operations</em>' containment reference list.
	 * @see chooseeditor.ChooseeditorPackage#getDiagram_Operations()
	 * @model containment="true"
	 * @generated
	 */
	EList<OperationContainer> getOperations();

} // Diagram
