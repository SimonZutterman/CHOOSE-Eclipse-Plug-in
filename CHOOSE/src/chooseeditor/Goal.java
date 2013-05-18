/**
 */
package chooseeditor;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Goal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link chooseeditor.Goal#getName <em>Name</em>}</li>
 *   <li>{@link chooseeditor.Goal#getDescription <em>Description</em>}</li>
 *   <li>{@link chooseeditor.Goal#getConflicts <em>Conflicts</em>}</li>
 *   <li>{@link chooseeditor.Goal#getConflicted <em>Conflicted</em>}</li>
 *   <li>{@link chooseeditor.Goal#getAssignedTo <em>Assigned To</em>}</li>
 *   <li>{@link chooseeditor.Goal#getWishedBy <em>Wished By</em>}</li>
 *   <li>{@link chooseeditor.Goal#getOperationalizedBy <em>Operationalized By</em>}</li>
 *   <li>{@link chooseeditor.Goal#getConcernsObjects <em>Concerns Objects</em>}</li>
 *   <li>{@link chooseeditor.Goal#getOr <em>Or</em>}</li>
 *   <li>{@link chooseeditor.Goal#getAnd <em>And</em>}</li>
 * </ul>
 * </p>
 *
 * @see chooseeditor.ChooseeditorPackage#getGoal()
 * @model
 * @generated
 */
public interface Goal extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see chooseeditor.ChooseeditorPackage#getGoal_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link chooseeditor.Goal#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see chooseeditor.ChooseeditorPackage#getGoal_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link chooseeditor.Goal#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Conflicts</b></em>' reference list.
	 * The list contents are of type {@link chooseeditor.Goal}.
	 * It is bidirectional and its opposite is '{@link chooseeditor.Goal#getConflicted <em>Conflicted</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conflicts</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conflicts</em>' reference list.
	 * @see chooseeditor.ChooseeditorPackage#getGoal_Conflicts()
	 * @see chooseeditor.Goal#getConflicted
	 * @model opposite="Conflicted"
	 * @generated
	 */
	EList<Goal> getConflicts();

	/**
	 * Returns the value of the '<em><b>Conflicted</b></em>' reference list.
	 * The list contents are of type {@link chooseeditor.Goal}.
	 * It is bidirectional and its opposite is '{@link chooseeditor.Goal#getConflicts <em>Conflicts</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conflicted</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conflicted</em>' reference list.
	 * @see chooseeditor.ChooseeditorPackage#getGoal_Conflicted()
	 * @see chooseeditor.Goal#getConflicts
	 * @model opposite="Conflicts"
	 * @generated
	 */
	EList<Goal> getConflicted();

	/**
	 * Returns the value of the '<em><b>Assigned To</b></em>' reference list.
	 * The list contents are of type {@link chooseeditor.ActorContainer}.
	 * It is bidirectional and its opposite is '{@link chooseeditor.ActorContainer#getAssignments <em>Assignments</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assigned To</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assigned To</em>' reference list.
	 * @see chooseeditor.ChooseeditorPackage#getGoal_AssignedTo()
	 * @see chooseeditor.ActorContainer#getAssignments
	 * @model opposite="Assignments"
	 * @generated
	 */
	EList<ActorContainer> getAssignedTo();

	/**
	 * Returns the value of the '<em><b>Wished By</b></em>' reference list.
	 * The list contents are of type {@link chooseeditor.ActorContainer}.
	 * It is bidirectional and its opposite is '{@link chooseeditor.ActorContainer#getWishes <em>Wishes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wished By</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wished By</em>' reference list.
	 * @see chooseeditor.ChooseeditorPackage#getGoal_WishedBy()
	 * @see chooseeditor.ActorContainer#getWishes
	 * @model opposite="Wishes"
	 * @generated
	 */
	EList<ActorContainer> getWishedBy();

	/**
	 * Returns the value of the '<em><b>Operationalized By</b></em>' reference list.
	 * The list contents are of type {@link chooseeditor.OperationContainer}.
	 * It is bidirectional and its opposite is '{@link chooseeditor.OperationContainer#getOperationalizes <em>Operationalizes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operationalized By</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operationalized By</em>' reference list.
	 * @see chooseeditor.ChooseeditorPackage#getGoal_OperationalizedBy()
	 * @see chooseeditor.OperationContainer#getOperationalizes
	 * @model opposite="Operationalizes"
	 * @generated
	 */
	EList<OperationContainer> getOperationalizedBy();

	/**
	 * Returns the value of the '<em><b>Concerns Objects</b></em>' reference list.
	 * The list contents are of type {@link chooseeditor.Object}.
	 * It is bidirectional and its opposite is '{@link chooseeditor.Object#getConcernsGoals <em>Concerns Goals</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concerns Objects</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concerns Objects</em>' reference list.
	 * @see chooseeditor.ChooseeditorPackage#getGoal_ConcernsObjects()
	 * @see chooseeditor.Object#getConcernsGoals
	 * @model opposite="ConcernsGoals"
	 * @generated
	 */
	EList<chooseeditor.Object> getConcernsObjects();

	/**
	 * Returns the value of the '<em><b>Or</b></em>' reference list.
	 * The list contents are of type {@link chooseeditor.Refinement}.
	 * It is bidirectional and its opposite is '{@link chooseeditor.Refinement#getSupergoal <em>Supergoal</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Or</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Or</em>' reference list.
	 * @see chooseeditor.ChooseeditorPackage#getGoal_Or()
	 * @see chooseeditor.Refinement#getSupergoal
	 * @model opposite="Supergoal"
	 * @generated
	 */
	EList<Refinement> getOr();

	/**
	 * Returns the value of the '<em><b>And</b></em>' reference list.
	 * The list contents are of type {@link chooseeditor.Refinement}.
	 * It is bidirectional and its opposite is '{@link chooseeditor.Refinement#getSubgoals <em>Subgoals</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>And</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>And</em>' reference list.
	 * @see chooseeditor.ChooseeditorPackage#getGoal_And()
	 * @see chooseeditor.Refinement#getSubgoals
	 * @model opposite="Subgoals"
	 * @generated
	 */
	EList<Refinement> getAnd();

} // Goal
