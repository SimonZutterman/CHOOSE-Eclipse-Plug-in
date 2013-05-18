/**
 */
package chooseeditor.impl;

import chooseeditor.ActorContainer;
import chooseeditor.ChooseeditorPackage;
import chooseeditor.Goal;
import chooseeditor.OperationContainer;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operation Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link chooseeditor.impl.OperationContainerImpl#getName <em>Name</em>}</li>
 *   <li>{@link chooseeditor.impl.OperationContainerImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link chooseeditor.impl.OperationContainerImpl#getOperationalizes <em>Operationalizes</em>}</li>
 *   <li>{@link chooseeditor.impl.OperationContainerImpl#getResponsible <em>Responsible</em>}</li>
 *   <li>{@link chooseeditor.impl.OperationContainerImpl#getAccountable <em>Accountable</em>}</li>
 *   <li>{@link chooseeditor.impl.OperationContainerImpl#getConsult <em>Consult</em>}</li>
 *   <li>{@link chooseeditor.impl.OperationContainerImpl#getInform <em>Inform</em>}</li>
 *   <li>{@link chooseeditor.impl.OperationContainerImpl#getInput <em>Input</em>}</li>
 *   <li>{@link chooseeditor.impl.OperationContainerImpl#getOutput <em>Output</em>}</li>
 *   <li>{@link chooseeditor.impl.OperationContainerImpl#getPartOf <em>Part Of</em>}</li>
 *   <li>{@link chooseeditor.impl.OperationContainerImpl#getIncludes <em>Includes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OperationContainerImpl extends EObjectImpl implements OperationContainer {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOperationalizes() <em>Operationalizes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationalizes()
	 * @generated
	 * @ordered
	 */
	protected EList<Goal> operationalizes;

	/**
	 * The cached value of the '{@link #getResponsible() <em>Responsible</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponsible()
	 * @generated
	 * @ordered
	 */
	protected EList<ActorContainer> responsible;

	/**
	 * The cached value of the '{@link #getAccountable() <em>Accountable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccountable()
	 * @generated
	 * @ordered
	 */
	protected ActorContainer accountable;

	/**
	 * The cached value of the '{@link #getConsult() <em>Consult</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsult()
	 * @generated
	 * @ordered
	 */
	protected EList<ActorContainer> consult;

	/**
	 * The cached value of the '{@link #getInform() <em>Inform</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInform()
	 * @generated
	 * @ordered
	 */
	protected EList<ActorContainer> inform;

	/**
	 * The cached value of the '{@link #getInput() <em>Input</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput()
	 * @generated
	 * @ordered
	 */
	protected EList<chooseeditor.Object> input;

	/**
	 * The cached value of the '{@link #getOutput() <em>Output</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput()
	 * @generated
	 * @ordered
	 */
	protected EList<chooseeditor.Object> output;

	/**
	 * The cached value of the '{@link #getPartOf() <em>Part Of</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartOf()
	 * @generated
	 * @ordered
	 */
	protected EList<OperationContainer> partOf;

	/**
	 * The cached value of the '{@link #getIncludes() <em>Includes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludes()
	 * @generated
	 * @ordered
	 */
	protected EList<OperationContainer> includes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ChooseeditorPackage.Literals.OPERATION_CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChooseeditorPackage.OPERATION_CONTAINER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChooseeditorPackage.OPERATION_CONTAINER__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Goal> getOperationalizes() {
		if (operationalizes == null) {
			operationalizes = new EObjectWithInverseResolvingEList.ManyInverse<Goal>(Goal.class, this, ChooseeditorPackage.OPERATION_CONTAINER__OPERATIONALIZES, ChooseeditorPackage.GOAL__OPERATIONALIZED_BY);
		}
		return operationalizes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActorContainer> getResponsible() {
		if (responsible == null) {
			responsible = new EObjectWithInverseResolvingEList.ManyInverse<ActorContainer>(ActorContainer.class, this, ChooseeditorPackage.OPERATION_CONTAINER__RESPONSIBLE, ChooseeditorPackage.ACTOR_CONTAINER__RESPONSIBLE_FOR);
		}
		return responsible;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActorContainer getAccountable() {
		if (accountable != null && accountable.eIsProxy()) {
			InternalEObject oldAccountable = (InternalEObject)accountable;
			accountable = (ActorContainer)eResolveProxy(oldAccountable);
			if (accountable != oldAccountable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ChooseeditorPackage.OPERATION_CONTAINER__ACCOUNTABLE, oldAccountable, accountable));
			}
		}
		return accountable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActorContainer basicGetAccountable() {
		return accountable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAccountable(ActorContainer newAccountable, NotificationChain msgs) {
		ActorContainer oldAccountable = accountable;
		accountable = newAccountable;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ChooseeditorPackage.OPERATION_CONTAINER__ACCOUNTABLE, oldAccountable, newAccountable);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccountable(ActorContainer newAccountable) {
		if (newAccountable != accountable) {
			NotificationChain msgs = null;
			if (accountable != null)
				msgs = ((InternalEObject)accountable).eInverseRemove(this, ChooseeditorPackage.ACTOR_CONTAINER__ACCOUNTABLE_FOR, ActorContainer.class, msgs);
			if (newAccountable != null)
				msgs = ((InternalEObject)newAccountable).eInverseAdd(this, ChooseeditorPackage.ACTOR_CONTAINER__ACCOUNTABLE_FOR, ActorContainer.class, msgs);
			msgs = basicSetAccountable(newAccountable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChooseeditorPackage.OPERATION_CONTAINER__ACCOUNTABLE, newAccountable, newAccountable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActorContainer> getConsult() {
		if (consult == null) {
			consult = new EObjectWithInverseResolvingEList.ManyInverse<ActorContainer>(ActorContainer.class, this, ChooseeditorPackage.OPERATION_CONTAINER__CONSULT, ChooseeditorPackage.ACTOR_CONTAINER__CONSULTED_FOR);
		}
		return consult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActorContainer> getInform() {
		if (inform == null) {
			inform = new EObjectWithInverseResolvingEList.ManyInverse<ActorContainer>(ActorContainer.class, this, ChooseeditorPackage.OPERATION_CONTAINER__INFORM, ChooseeditorPackage.ACTOR_CONTAINER__INFORMED_FOR);
		}
		return inform;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<chooseeditor.Object> getInput() {
		if (input == null) {
			input = new EObjectWithInverseResolvingEList.ManyInverse<chooseeditor.Object>(chooseeditor.Object.class, this, ChooseeditorPackage.OPERATION_CONTAINER__INPUT, ChooseeditorPackage.OBJECT__INPUT_FOR);
		}
		return input;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<chooseeditor.Object> getOutput() {
		if (output == null) {
			output = new EObjectWithInverseResolvingEList.ManyInverse<chooseeditor.Object>(chooseeditor.Object.class, this, ChooseeditorPackage.OPERATION_CONTAINER__OUTPUT, ChooseeditorPackage.OBJECT__OUTPUT_OF);
		}
		return output;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OperationContainer> getPartOf() {
		if (partOf == null) {
			partOf = new EObjectWithInverseResolvingEList.ManyInverse<OperationContainer>(OperationContainer.class, this, ChooseeditorPackage.OPERATION_CONTAINER__PART_OF, ChooseeditorPackage.OPERATION_CONTAINER__INCLUDES);
		}
		return partOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OperationContainer> getIncludes() {
		if (includes == null) {
			includes = new EObjectWithInverseResolvingEList.ManyInverse<OperationContainer>(OperationContainer.class, this, ChooseeditorPackage.OPERATION_CONTAINER__INCLUDES, ChooseeditorPackage.OPERATION_CONTAINER__PART_OF);
		}
		return includes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ChooseeditorPackage.OPERATION_CONTAINER__OPERATIONALIZES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOperationalizes()).basicAdd(otherEnd, msgs);
			case ChooseeditorPackage.OPERATION_CONTAINER__RESPONSIBLE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getResponsible()).basicAdd(otherEnd, msgs);
			case ChooseeditorPackage.OPERATION_CONTAINER__ACCOUNTABLE:
				if (accountable != null)
					msgs = ((InternalEObject)accountable).eInverseRemove(this, ChooseeditorPackage.ACTOR_CONTAINER__ACCOUNTABLE_FOR, ActorContainer.class, msgs);
				return basicSetAccountable((ActorContainer)otherEnd, msgs);
			case ChooseeditorPackage.OPERATION_CONTAINER__CONSULT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getConsult()).basicAdd(otherEnd, msgs);
			case ChooseeditorPackage.OPERATION_CONTAINER__INFORM:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInform()).basicAdd(otherEnd, msgs);
			case ChooseeditorPackage.OPERATION_CONTAINER__INPUT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInput()).basicAdd(otherEnd, msgs);
			case ChooseeditorPackage.OPERATION_CONTAINER__OUTPUT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutput()).basicAdd(otherEnd, msgs);
			case ChooseeditorPackage.OPERATION_CONTAINER__PART_OF:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPartOf()).basicAdd(otherEnd, msgs);
			case ChooseeditorPackage.OPERATION_CONTAINER__INCLUDES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIncludes()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ChooseeditorPackage.OPERATION_CONTAINER__OPERATIONALIZES:
				return ((InternalEList<?>)getOperationalizes()).basicRemove(otherEnd, msgs);
			case ChooseeditorPackage.OPERATION_CONTAINER__RESPONSIBLE:
				return ((InternalEList<?>)getResponsible()).basicRemove(otherEnd, msgs);
			case ChooseeditorPackage.OPERATION_CONTAINER__ACCOUNTABLE:
				return basicSetAccountable(null, msgs);
			case ChooseeditorPackage.OPERATION_CONTAINER__CONSULT:
				return ((InternalEList<?>)getConsult()).basicRemove(otherEnd, msgs);
			case ChooseeditorPackage.OPERATION_CONTAINER__INFORM:
				return ((InternalEList<?>)getInform()).basicRemove(otherEnd, msgs);
			case ChooseeditorPackage.OPERATION_CONTAINER__INPUT:
				return ((InternalEList<?>)getInput()).basicRemove(otherEnd, msgs);
			case ChooseeditorPackage.OPERATION_CONTAINER__OUTPUT:
				return ((InternalEList<?>)getOutput()).basicRemove(otherEnd, msgs);
			case ChooseeditorPackage.OPERATION_CONTAINER__PART_OF:
				return ((InternalEList<?>)getPartOf()).basicRemove(otherEnd, msgs);
			case ChooseeditorPackage.OPERATION_CONTAINER__INCLUDES:
				return ((InternalEList<?>)getIncludes()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ChooseeditorPackage.OPERATION_CONTAINER__NAME:
				return getName();
			case ChooseeditorPackage.OPERATION_CONTAINER__DESCRIPTION:
				return getDescription();
			case ChooseeditorPackage.OPERATION_CONTAINER__OPERATIONALIZES:
				return getOperationalizes();
			case ChooseeditorPackage.OPERATION_CONTAINER__RESPONSIBLE:
				return getResponsible();
			case ChooseeditorPackage.OPERATION_CONTAINER__ACCOUNTABLE:
				if (resolve) return getAccountable();
				return basicGetAccountable();
			case ChooseeditorPackage.OPERATION_CONTAINER__CONSULT:
				return getConsult();
			case ChooseeditorPackage.OPERATION_CONTAINER__INFORM:
				return getInform();
			case ChooseeditorPackage.OPERATION_CONTAINER__INPUT:
				return getInput();
			case ChooseeditorPackage.OPERATION_CONTAINER__OUTPUT:
				return getOutput();
			case ChooseeditorPackage.OPERATION_CONTAINER__PART_OF:
				return getPartOf();
			case ChooseeditorPackage.OPERATION_CONTAINER__INCLUDES:
				return getIncludes();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ChooseeditorPackage.OPERATION_CONTAINER__NAME:
				setName((String)newValue);
				return;
			case ChooseeditorPackage.OPERATION_CONTAINER__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case ChooseeditorPackage.OPERATION_CONTAINER__OPERATIONALIZES:
				getOperationalizes().clear();
				getOperationalizes().addAll((Collection<? extends Goal>)newValue);
				return;
			case ChooseeditorPackage.OPERATION_CONTAINER__RESPONSIBLE:
				getResponsible().clear();
				getResponsible().addAll((Collection<? extends ActorContainer>)newValue);
				return;
			case ChooseeditorPackage.OPERATION_CONTAINER__ACCOUNTABLE:
				setAccountable((ActorContainer)newValue);
				return;
			case ChooseeditorPackage.OPERATION_CONTAINER__CONSULT:
				getConsult().clear();
				getConsult().addAll((Collection<? extends ActorContainer>)newValue);
				return;
			case ChooseeditorPackage.OPERATION_CONTAINER__INFORM:
				getInform().clear();
				getInform().addAll((Collection<? extends ActorContainer>)newValue);
				return;
			case ChooseeditorPackage.OPERATION_CONTAINER__INPUT:
				getInput().clear();
				getInput().addAll((Collection<? extends chooseeditor.Object>)newValue);
				return;
			case ChooseeditorPackage.OPERATION_CONTAINER__OUTPUT:
				getOutput().clear();
				getOutput().addAll((Collection<? extends chooseeditor.Object>)newValue);
				return;
			case ChooseeditorPackage.OPERATION_CONTAINER__PART_OF:
				getPartOf().clear();
				getPartOf().addAll((Collection<? extends OperationContainer>)newValue);
				return;
			case ChooseeditorPackage.OPERATION_CONTAINER__INCLUDES:
				getIncludes().clear();
				getIncludes().addAll((Collection<? extends OperationContainer>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ChooseeditorPackage.OPERATION_CONTAINER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ChooseeditorPackage.OPERATION_CONTAINER__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case ChooseeditorPackage.OPERATION_CONTAINER__OPERATIONALIZES:
				getOperationalizes().clear();
				return;
			case ChooseeditorPackage.OPERATION_CONTAINER__RESPONSIBLE:
				getResponsible().clear();
				return;
			case ChooseeditorPackage.OPERATION_CONTAINER__ACCOUNTABLE:
				setAccountable((ActorContainer)null);
				return;
			case ChooseeditorPackage.OPERATION_CONTAINER__CONSULT:
				getConsult().clear();
				return;
			case ChooseeditorPackage.OPERATION_CONTAINER__INFORM:
				getInform().clear();
				return;
			case ChooseeditorPackage.OPERATION_CONTAINER__INPUT:
				getInput().clear();
				return;
			case ChooseeditorPackage.OPERATION_CONTAINER__OUTPUT:
				getOutput().clear();
				return;
			case ChooseeditorPackage.OPERATION_CONTAINER__PART_OF:
				getPartOf().clear();
				return;
			case ChooseeditorPackage.OPERATION_CONTAINER__INCLUDES:
				getIncludes().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ChooseeditorPackage.OPERATION_CONTAINER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ChooseeditorPackage.OPERATION_CONTAINER__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case ChooseeditorPackage.OPERATION_CONTAINER__OPERATIONALIZES:
				return operationalizes != null && !operationalizes.isEmpty();
			case ChooseeditorPackage.OPERATION_CONTAINER__RESPONSIBLE:
				return responsible != null && !responsible.isEmpty();
			case ChooseeditorPackage.OPERATION_CONTAINER__ACCOUNTABLE:
				return accountable != null;
			case ChooseeditorPackage.OPERATION_CONTAINER__CONSULT:
				return consult != null && !consult.isEmpty();
			case ChooseeditorPackage.OPERATION_CONTAINER__INFORM:
				return inform != null && !inform.isEmpty();
			case ChooseeditorPackage.OPERATION_CONTAINER__INPUT:
				return input != null && !input.isEmpty();
			case ChooseeditorPackage.OPERATION_CONTAINER__OUTPUT:
				return output != null && !output.isEmpty();
			case ChooseeditorPackage.OPERATION_CONTAINER__PART_OF:
				return partOf != null && !partOf.isEmpty();
			case ChooseeditorPackage.OPERATION_CONTAINER__INCLUDES:
				return includes != null && !includes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (Name: ");
		result.append(name);
		result.append(", Description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //OperationContainerImpl
