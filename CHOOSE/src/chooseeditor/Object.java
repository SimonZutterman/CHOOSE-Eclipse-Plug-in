/**
 */
package chooseeditor;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link chooseeditor.Object#getName <em>Name</em>}</li>
 *   <li>{@link chooseeditor.Object#getDescription <em>Description</em>}</li>
 *   <li>{@link chooseeditor.Object#getConcernsGoals <em>Concerns Goals</em>}</li>
 *   <li>{@link chooseeditor.Object#getControlledBy <em>Controlled By</em>}</li>
 *   <li>{@link chooseeditor.Object#getMonitoredBy <em>Monitored By</em>}</li>
 *   <li>{@link chooseeditor.Object#getInputFor <em>Input For</em>}</li>
 *   <li>{@link chooseeditor.Object#getOutputOf <em>Output Of</em>}</li>
 *   <li>{@link chooseeditor.Object#getAssociates <em>Associates</em>}</li>
 *   <li>{@link chooseeditor.Object#getAssociated <em>Associated</em>}</li>
 *   <li>{@link chooseeditor.Object#getSpecialization <em>Specialization</em>}</li>
 *   <li>{@link chooseeditor.Object#getSpecializedBy <em>Specialized By</em>}</li>
 *   <li>{@link chooseeditor.Object#getIncludes <em>Includes</em>}</li>
 *   <li>{@link chooseeditor.Object#getPartOf <em>Part Of</em>}</li>
 * </ul>
 * </p>
 *
 * @see chooseeditor.ChooseeditorPackage#getObject()
 * @model
 * @generated
 */
public interface Object extends EObject {
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
	 * @see chooseeditor.ChooseeditorPackage#getObject_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link chooseeditor.Object#getName <em>Name</em>}' attribute.
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
	 * @see chooseeditor.ChooseeditorPackage#getObject_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link chooseeditor.Object#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Concerns Goals</b></em>' reference list.
	 * The list contents are of type {@link chooseeditor.Goal}.
	 * It is bidirectional and its opposite is '{@link chooseeditor.Goal#getConcernsObjects <em>Concerns Objects</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concerns Goals</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concerns Goals</em>' reference list.
	 * @see chooseeditor.ChooseeditorPackage#getObject_ConcernsGoals()
	 * @see chooseeditor.Goal#getConcernsObjects
	 * @model opposite="ConcernsObjects"
	 * @generated
	 */
	EList<Goal> getConcernsGoals();

	/**
	 * Returns the value of the '<em><b>Controlled By</b></em>' reference list.
	 * The list contents are of type {@link chooseeditor.ActorContainer}.
	 * It is bidirectional and its opposite is '{@link chooseeditor.ActorContainer#getControls <em>Controls</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Controlled By</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Controlled By</em>' reference list.
	 * @see chooseeditor.ChooseeditorPackage#getObject_ControlledBy()
	 * @see chooseeditor.ActorContainer#getControls
	 * @model opposite="Controls"
	 * @generated
	 */
	EList<ActorContainer> getControlledBy();

	/**
	 * Returns the value of the '<em><b>Monitored By</b></em>' reference list.
	 * The list contents are of type {@link chooseeditor.ActorContainer}.
	 * It is bidirectional and its opposite is '{@link chooseeditor.ActorContainer#getMonitors <em>Monitors</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Monitored By</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Monitored By</em>' reference list.
	 * @see chooseeditor.ChooseeditorPackage#getObject_MonitoredBy()
	 * @see chooseeditor.ActorContainer#getMonitors
	 * @model opposite="Monitors"
	 * @generated
	 */
	EList<ActorContainer> getMonitoredBy();

	/**
	 * Returns the value of the '<em><b>Input For</b></em>' reference list.
	 * The list contents are of type {@link chooseeditor.OperationContainer}.
	 * It is bidirectional and its opposite is '{@link chooseeditor.OperationContainer#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input For</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input For</em>' reference list.
	 * @see chooseeditor.ChooseeditorPackage#getObject_InputFor()
	 * @see chooseeditor.OperationContainer#getInput
	 * @model opposite="Input"
	 * @generated
	 */
	EList<OperationContainer> getInputFor();

	/**
	 * Returns the value of the '<em><b>Output Of</b></em>' reference list.
	 * The list contents are of type {@link chooseeditor.OperationContainer}.
	 * It is bidirectional and its opposite is '{@link chooseeditor.OperationContainer#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Of</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Of</em>' reference list.
	 * @see chooseeditor.ChooseeditorPackage#getObject_OutputOf()
	 * @see chooseeditor.OperationContainer#getOutput
	 * @model opposite="Output"
	 * @generated
	 */
	EList<OperationContainer> getOutputOf();

	/**
	 * Returns the value of the '<em><b>Associates</b></em>' reference list.
	 * The list contents are of type {@link chooseeditor.Object}.
	 * It is bidirectional and its opposite is '{@link chooseeditor.Object#getAssociated <em>Associated</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Associates</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Associates</em>' reference list.
	 * @see chooseeditor.ChooseeditorPackage#getObject_Associates()
	 * @see chooseeditor.Object#getAssociated
	 * @model opposite="Associated"
	 * @generated
	 */
	EList<Object> getAssociates();

	/**
	 * Returns the value of the '<em><b>Associated</b></em>' reference list.
	 * The list contents are of type {@link chooseeditor.Object}.
	 * It is bidirectional and its opposite is '{@link chooseeditor.Object#getAssociates <em>Associates</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Associated</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Associated</em>' reference list.
	 * @see chooseeditor.ChooseeditorPackage#getObject_Associated()
	 * @see chooseeditor.Object#getAssociates
	 * @model opposite="Associates"
	 * @generated
	 */
	EList<Object> getAssociated();

	/**
	 * Returns the value of the '<em><b>Specialization</b></em>' reference list.
	 * The list contents are of type {@link chooseeditor.Object}.
	 * It is bidirectional and its opposite is '{@link chooseeditor.Object#getSpecializedBy <em>Specialized By</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Specialization</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specialization</em>' reference list.
	 * @see chooseeditor.ChooseeditorPackage#getObject_Specialization()
	 * @see chooseeditor.Object#getSpecializedBy
	 * @model opposite="SpecializedBy"
	 * @generated
	 */
	EList<Object> getSpecialization();

	/**
	 * Returns the value of the '<em><b>Specialized By</b></em>' reference list.
	 * The list contents are of type {@link chooseeditor.Object}.
	 * It is bidirectional and its opposite is '{@link chooseeditor.Object#getSpecialization <em>Specialization</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Specialized By</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specialized By</em>' reference list.
	 * @see chooseeditor.ChooseeditorPackage#getObject_SpecializedBy()
	 * @see chooseeditor.Object#getSpecialization
	 * @model opposite="Specialization"
	 * @generated
	 */
	EList<Object> getSpecializedBy();

	/**
	 * Returns the value of the '<em><b>Includes</b></em>' reference list.
	 * The list contents are of type {@link chooseeditor.Object}.
	 * It is bidirectional and its opposite is '{@link chooseeditor.Object#getPartOf <em>Part Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Includes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Includes</em>' reference list.
	 * @see chooseeditor.ChooseeditorPackage#getObject_Includes()
	 * @see chooseeditor.Object#getPartOf
	 * @model opposite="PartOf"
	 * @generated
	 */
	EList<Object> getIncludes();

	/**
	 * Returns the value of the '<em><b>Part Of</b></em>' reference list.
	 * The list contents are of type {@link chooseeditor.Object}.
	 * It is bidirectional and its opposite is '{@link chooseeditor.Object#getIncludes <em>Includes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Part Of</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Part Of</em>' reference list.
	 * @see chooseeditor.ChooseeditorPackage#getObject_PartOf()
	 * @see chooseeditor.Object#getIncludes
	 * @model opposite="Includes"
	 * @generated
	 */
	EList<Object> getPartOf();

} // Object
