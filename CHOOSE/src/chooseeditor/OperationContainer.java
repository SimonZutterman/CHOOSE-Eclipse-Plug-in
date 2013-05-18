/**
 */
package chooseeditor;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link chooseeditor.OperationContainer#getName <em>Name</em>}</li>
 *   <li>{@link chooseeditor.OperationContainer#getDescription <em>Description</em>}</li>
 *   <li>{@link chooseeditor.OperationContainer#getOperationalizes <em>Operationalizes</em>}</li>
 *   <li>{@link chooseeditor.OperationContainer#getResponsible <em>Responsible</em>}</li>
 *   <li>{@link chooseeditor.OperationContainer#getAccountable <em>Accountable</em>}</li>
 *   <li>{@link chooseeditor.OperationContainer#getConsult <em>Consult</em>}</li>
 *   <li>{@link chooseeditor.OperationContainer#getInform <em>Inform</em>}</li>
 *   <li>{@link chooseeditor.OperationContainer#getInput <em>Input</em>}</li>
 *   <li>{@link chooseeditor.OperationContainer#getOutput <em>Output</em>}</li>
 *   <li>{@link chooseeditor.OperationContainer#getPartOf <em>Part Of</em>}</li>
 *   <li>{@link chooseeditor.OperationContainer#getIncludes <em>Includes</em>}</li>
 * </ul>
 * </p>
 *
 * @see chooseeditor.ChooseeditorPackage#getOperationContainer()
 * @model
 * @generated
 */
public interface OperationContainer extends EObject {
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
	 * @see chooseeditor.ChooseeditorPackage#getOperationContainer_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link chooseeditor.OperationContainer#getName <em>Name</em>}' attribute.
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
	 * @see chooseeditor.ChooseeditorPackage#getOperationContainer_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link chooseeditor.OperationContainer#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Operationalizes</b></em>' reference list.
	 * The list contents are of type {@link chooseeditor.Goal}.
	 * It is bidirectional and its opposite is '{@link chooseeditor.Goal#getOperationalizedBy <em>Operationalized By</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operationalizes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operationalizes</em>' reference list.
	 * @see chooseeditor.ChooseeditorPackage#getOperationContainer_Operationalizes()
	 * @see chooseeditor.Goal#getOperationalizedBy
	 * @model opposite="OperationalizedBy"
	 * @generated
	 */
	EList<Goal> getOperationalizes();

	/**
	 * Returns the value of the '<em><b>Responsible</b></em>' reference list.
	 * The list contents are of type {@link chooseeditor.ActorContainer}.
	 * It is bidirectional and its opposite is '{@link chooseeditor.ActorContainer#getResponsibleFor <em>Responsible For</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Responsible</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Responsible</em>' reference list.
	 * @see chooseeditor.ChooseeditorPackage#getOperationContainer_Responsible()
	 * @see chooseeditor.ActorContainer#getResponsibleFor
	 * @model opposite="ResponsibleFor"
	 * @generated
	 */
	EList<ActorContainer> getResponsible();

	/**
	 * Returns the value of the '<em><b>Accountable</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link chooseeditor.ActorContainer#getAccountableFor <em>Accountable For</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Accountable</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accountable</em>' reference.
	 * @see #setAccountable(ActorContainer)
	 * @see chooseeditor.ChooseeditorPackage#getOperationContainer_Accountable()
	 * @see chooseeditor.ActorContainer#getAccountableFor
	 * @model opposite="AccountableFor" required="true"
	 * @generated
	 */
	ActorContainer getAccountable();

	/**
	 * Sets the value of the '{@link chooseeditor.OperationContainer#getAccountable <em>Accountable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Accountable</em>' reference.
	 * @see #getAccountable()
	 * @generated
	 */
	void setAccountable(ActorContainer value);

	/**
	 * Returns the value of the '<em><b>Consult</b></em>' reference list.
	 * The list contents are of type {@link chooseeditor.ActorContainer}.
	 * It is bidirectional and its opposite is '{@link chooseeditor.ActorContainer#getConsultedFor <em>Consulted For</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Consult</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Consult</em>' reference list.
	 * @see chooseeditor.ChooseeditorPackage#getOperationContainer_Consult()
	 * @see chooseeditor.ActorContainer#getConsultedFor
	 * @model opposite="ConsultedFor"
	 * @generated
	 */
	EList<ActorContainer> getConsult();

	/**
	 * Returns the value of the '<em><b>Inform</b></em>' reference list.
	 * The list contents are of type {@link chooseeditor.ActorContainer}.
	 * It is bidirectional and its opposite is '{@link chooseeditor.ActorContainer#getInformedFor <em>Informed For</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inform</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inform</em>' reference list.
	 * @see chooseeditor.ChooseeditorPackage#getOperationContainer_Inform()
	 * @see chooseeditor.ActorContainer#getInformedFor
	 * @model opposite="InformedFor"
	 * @generated
	 */
	EList<ActorContainer> getInform();

	/**
	 * Returns the value of the '<em><b>Input</b></em>' reference list.
	 * The list contents are of type {@link chooseeditor.Object}.
	 * It is bidirectional and its opposite is '{@link chooseeditor.Object#getInputFor <em>Input For</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input</em>' reference list.
	 * @see chooseeditor.ChooseeditorPackage#getOperationContainer_Input()
	 * @see chooseeditor.Object#getInputFor
	 * @model opposite="InputFor"
	 * @generated
	 */
	EList<chooseeditor.Object> getInput();

	/**
	 * Returns the value of the '<em><b>Output</b></em>' reference list.
	 * The list contents are of type {@link chooseeditor.Object}.
	 * It is bidirectional and its opposite is '{@link chooseeditor.Object#getOutputOf <em>Output Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output</em>' reference list.
	 * @see chooseeditor.ChooseeditorPackage#getOperationContainer_Output()
	 * @see chooseeditor.Object#getOutputOf
	 * @model opposite="OutputOf"
	 * @generated
	 */
	EList<chooseeditor.Object> getOutput();

	/**
	 * Returns the value of the '<em><b>Part Of</b></em>' reference list.
	 * The list contents are of type {@link chooseeditor.OperationContainer}.
	 * It is bidirectional and its opposite is '{@link chooseeditor.OperationContainer#getIncludes <em>Includes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Part Of</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Part Of</em>' reference list.
	 * @see chooseeditor.ChooseeditorPackage#getOperationContainer_PartOf()
	 * @see chooseeditor.OperationContainer#getIncludes
	 * @model opposite="Includes"
	 * @generated
	 */
	EList<OperationContainer> getPartOf();

	/**
	 * Returns the value of the '<em><b>Includes</b></em>' reference list.
	 * The list contents are of type {@link chooseeditor.OperationContainer}.
	 * It is bidirectional and its opposite is '{@link chooseeditor.OperationContainer#getPartOf <em>Part Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Includes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Includes</em>' reference list.
	 * @see chooseeditor.ChooseeditorPackage#getOperationContainer_Includes()
	 * @see chooseeditor.OperationContainer#getPartOf
	 * @model opposite="PartOf"
	 * @generated
	 */
	EList<OperationContainer> getIncludes();

} // OperationContainer
