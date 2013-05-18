/**
 */
package chooseeditor;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Actor Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link chooseeditor.ActorContainer#getName <em>Name</em>}</li>
 *   <li>{@link chooseeditor.ActorContainer#getDescription <em>Description</em>}</li>
 *   <li>{@link chooseeditor.ActorContainer#getAssignments <em>Assignments</em>}</li>
 *   <li>{@link chooseeditor.ActorContainer#getWishes <em>Wishes</em>}</li>
 *   <li>{@link chooseeditor.ActorContainer#getIncludes <em>Includes</em>}</li>
 *   <li>{@link chooseeditor.ActorContainer#getPartOf <em>Part Of</em>}</li>
 *   <li>{@link chooseeditor.ActorContainer#getResponsibleFor <em>Responsible For</em>}</li>
 *   <li>{@link chooseeditor.ActorContainer#getAccountableFor <em>Accountable For</em>}</li>
 *   <li>{@link chooseeditor.ActorContainer#getConsultedFor <em>Consulted For</em>}</li>
 *   <li>{@link chooseeditor.ActorContainer#getInformedFor <em>Informed For</em>}</li>
 *   <li>{@link chooseeditor.ActorContainer#getControls <em>Controls</em>}</li>
 *   <li>{@link chooseeditor.ActorContainer#getMonitors <em>Monitors</em>}</li>
 * </ul>
 * </p>
 *
 * @see chooseeditor.ChooseeditorPackage#getActorContainer()
 * @model
 * @generated
 */
public interface ActorContainer extends EObject {
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
	 * @see chooseeditor.ChooseeditorPackage#getActorContainer_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link chooseeditor.ActorContainer#getName <em>Name</em>}' attribute.
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
	 * @see chooseeditor.ChooseeditorPackage#getActorContainer_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link chooseeditor.ActorContainer#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Assignments</b></em>' reference list.
	 * The list contents are of type {@link chooseeditor.Goal}.
	 * It is bidirectional and its opposite is '{@link chooseeditor.Goal#getAssignedTo <em>Assigned To</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assignments</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assignments</em>' reference list.
	 * @see chooseeditor.ChooseeditorPackage#getActorContainer_Assignments()
	 * @see chooseeditor.Goal#getAssignedTo
	 * @model opposite="AssignedTo"
	 * @generated
	 */
	EList<Goal> getAssignments();

	/**
	 * Returns the value of the '<em><b>Wishes</b></em>' reference list.
	 * The list contents are of type {@link chooseeditor.Goal}.
	 * It is bidirectional and its opposite is '{@link chooseeditor.Goal#getWishedBy <em>Wished By</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wishes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wishes</em>' reference list.
	 * @see chooseeditor.ChooseeditorPackage#getActorContainer_Wishes()
	 * @see chooseeditor.Goal#getWishedBy
	 * @model opposite="WishedBy"
	 * @generated
	 */
	EList<Goal> getWishes();

	/**
	 * Returns the value of the '<em><b>Includes</b></em>' reference list.
	 * The list contents are of type {@link chooseeditor.ActorContainer}.
	 * It is bidirectional and its opposite is '{@link chooseeditor.ActorContainer#getPartOf <em>Part Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Includes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Includes</em>' reference list.
	 * @see chooseeditor.ChooseeditorPackage#getActorContainer_Includes()
	 * @see chooseeditor.ActorContainer#getPartOf
	 * @model opposite="PartOf"
	 * @generated
	 */
	EList<ActorContainer> getIncludes();

	/**
	 * Returns the value of the '<em><b>Part Of</b></em>' reference list.
	 * The list contents are of type {@link chooseeditor.ActorContainer}.
	 * It is bidirectional and its opposite is '{@link chooseeditor.ActorContainer#getIncludes <em>Includes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Part Of</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Part Of</em>' reference list.
	 * @see chooseeditor.ChooseeditorPackage#getActorContainer_PartOf()
	 * @see chooseeditor.ActorContainer#getIncludes
	 * @model opposite="Includes"
	 * @generated
	 */
	EList<ActorContainer> getPartOf();

	/**
	 * Returns the value of the '<em><b>Responsible For</b></em>' reference list.
	 * The list contents are of type {@link chooseeditor.OperationContainer}.
	 * It is bidirectional and its opposite is '{@link chooseeditor.OperationContainer#getResponsible <em>Responsible</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Responsible For</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Responsible For</em>' reference list.
	 * @see chooseeditor.ChooseeditorPackage#getActorContainer_ResponsibleFor()
	 * @see chooseeditor.OperationContainer#getResponsible
	 * @model opposite="Responsible"
	 * @generated
	 */
	EList<OperationContainer> getResponsibleFor();

	/**
	 * Returns the value of the '<em><b>Accountable For</b></em>' reference list.
	 * The list contents are of type {@link chooseeditor.OperationContainer}.
	 * It is bidirectional and its opposite is '{@link chooseeditor.OperationContainer#getAccountable <em>Accountable</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Accountable For</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accountable For</em>' reference list.
	 * @see chooseeditor.ChooseeditorPackage#getActorContainer_AccountableFor()
	 * @see chooseeditor.OperationContainer#getAccountable
	 * @model opposite="Accountable"
	 * @generated
	 */
	EList<OperationContainer> getAccountableFor();

	/**
	 * Returns the value of the '<em><b>Consulted For</b></em>' reference list.
	 * The list contents are of type {@link chooseeditor.OperationContainer}.
	 * It is bidirectional and its opposite is '{@link chooseeditor.OperationContainer#getConsult <em>Consult</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Consulted For</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Consulted For</em>' reference list.
	 * @see chooseeditor.ChooseeditorPackage#getActorContainer_ConsultedFor()
	 * @see chooseeditor.OperationContainer#getConsult
	 * @model opposite="Consult"
	 * @generated
	 */
	EList<OperationContainer> getConsultedFor();

	/**
	 * Returns the value of the '<em><b>Informed For</b></em>' reference list.
	 * The list contents are of type {@link chooseeditor.OperationContainer}.
	 * It is bidirectional and its opposite is '{@link chooseeditor.OperationContainer#getInform <em>Inform</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Informed For</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Informed For</em>' reference list.
	 * @see chooseeditor.ChooseeditorPackage#getActorContainer_InformedFor()
	 * @see chooseeditor.OperationContainer#getInform
	 * @model opposite="Inform"
	 * @generated
	 */
	EList<OperationContainer> getInformedFor();

	/**
	 * Returns the value of the '<em><b>Controls</b></em>' reference list.
	 * The list contents are of type {@link chooseeditor.Object}.
	 * It is bidirectional and its opposite is '{@link chooseeditor.Object#getControlledBy <em>Controlled By</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Controls</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Controls</em>' reference list.
	 * @see chooseeditor.ChooseeditorPackage#getActorContainer_Controls()
	 * @see chooseeditor.Object#getControlledBy
	 * @model opposite="ControlledBy"
	 * @generated
	 */
	EList<chooseeditor.Object> getControls();

	/**
	 * Returns the value of the '<em><b>Monitors</b></em>' reference list.
	 * The list contents are of type {@link chooseeditor.Object}.
	 * It is bidirectional and its opposite is '{@link chooseeditor.Object#getMonitoredBy <em>Monitored By</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Monitors</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Monitors</em>' reference list.
	 * @see chooseeditor.ChooseeditorPackage#getActorContainer_Monitors()
	 * @see chooseeditor.Object#getMonitoredBy
	 * @model opposite="MonitoredBy"
	 * @generated
	 */
	EList<chooseeditor.Object> getMonitors();

} // ActorContainer
