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
 * An implementation of the model object '<em><b>Actor Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link chooseeditor.impl.ActorContainerImpl#getName <em>Name</em>}</li>
 *   <li>{@link chooseeditor.impl.ActorContainerImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link chooseeditor.impl.ActorContainerImpl#getAssignments <em>Assignments</em>}</li>
 *   <li>{@link chooseeditor.impl.ActorContainerImpl#getWishes <em>Wishes</em>}</li>
 *   <li>{@link chooseeditor.impl.ActorContainerImpl#getIncludes <em>Includes</em>}</li>
 *   <li>{@link chooseeditor.impl.ActorContainerImpl#getPartOf <em>Part Of</em>}</li>
 *   <li>{@link chooseeditor.impl.ActorContainerImpl#getResponsibleFor <em>Responsible For</em>}</li>
 *   <li>{@link chooseeditor.impl.ActorContainerImpl#getAccountableFor <em>Accountable For</em>}</li>
 *   <li>{@link chooseeditor.impl.ActorContainerImpl#getConsultedFor <em>Consulted For</em>}</li>
 *   <li>{@link chooseeditor.impl.ActorContainerImpl#getInformedFor <em>Informed For</em>}</li>
 *   <li>{@link chooseeditor.impl.ActorContainerImpl#getControls <em>Controls</em>}</li>
 *   <li>{@link chooseeditor.impl.ActorContainerImpl#getMonitors <em>Monitors</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActorContainerImpl extends EObjectImpl implements ActorContainer {
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
	 * The cached value of the '{@link #getAssignments() <em>Assignments</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssignments()
	 * @generated
	 * @ordered
	 */
	protected EList<Goal> assignments;

	/**
	 * The cached value of the '{@link #getWishes() <em>Wishes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWishes()
	 * @generated
	 * @ordered
	 */
	protected EList<Goal> wishes;

	/**
	 * The cached value of the '{@link #getIncludes() <em>Includes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludes()
	 * @generated
	 * @ordered
	 */
	protected EList<ActorContainer> includes;

	/**
	 * The cached value of the '{@link #getPartOf() <em>Part Of</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartOf()
	 * @generated
	 * @ordered
	 */
	protected EList<ActorContainer> partOf;

	/**
	 * The cached value of the '{@link #getResponsibleFor() <em>Responsible For</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponsibleFor()
	 * @generated
	 * @ordered
	 */
	protected EList<OperationContainer> responsibleFor;

	/**
	 * The cached value of the '{@link #getAccountableFor() <em>Accountable For</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccountableFor()
	 * @generated
	 * @ordered
	 */
	protected EList<OperationContainer> accountableFor;

	/**
	 * The cached value of the '{@link #getConsultedFor() <em>Consulted For</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsultedFor()
	 * @generated
	 * @ordered
	 */
	protected EList<OperationContainer> consultedFor;

	/**
	 * The cached value of the '{@link #getInformedFor() <em>Informed For</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInformedFor()
	 * @generated
	 * @ordered
	 */
	protected EList<OperationContainer> informedFor;

	/**
	 * The cached value of the '{@link #getControls() <em>Controls</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControls()
	 * @generated
	 * @ordered
	 */
	protected EList<chooseeditor.Object> controls;

	/**
	 * The cached value of the '{@link #getMonitors() <em>Monitors</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMonitors()
	 * @generated
	 * @ordered
	 */
	protected EList<chooseeditor.Object> monitors;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActorContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ChooseeditorPackage.Literals.ACTOR_CONTAINER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ChooseeditorPackage.ACTOR_CONTAINER__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ChooseeditorPackage.ACTOR_CONTAINER__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Goal> getAssignments() {
		if (assignments == null) {
			assignments = new EObjectWithInverseResolvingEList.ManyInverse<Goal>(Goal.class, this, ChooseeditorPackage.ACTOR_CONTAINER__ASSIGNMENTS, ChooseeditorPackage.GOAL__ASSIGNED_TO);
		}
		return assignments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Goal> getWishes() {
		if (wishes == null) {
			wishes = new EObjectWithInverseResolvingEList.ManyInverse<Goal>(Goal.class, this, ChooseeditorPackage.ACTOR_CONTAINER__WISHES, ChooseeditorPackage.GOAL__WISHED_BY);
		}
		return wishes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActorContainer> getIncludes() {
		if (includes == null) {
			includes = new EObjectWithInverseResolvingEList.ManyInverse<ActorContainer>(ActorContainer.class, this, ChooseeditorPackage.ACTOR_CONTAINER__INCLUDES, ChooseeditorPackage.ACTOR_CONTAINER__PART_OF);
		}
		return includes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActorContainer> getPartOf() {
		if (partOf == null) {
			partOf = new EObjectWithInverseResolvingEList.ManyInverse<ActorContainer>(ActorContainer.class, this, ChooseeditorPackage.ACTOR_CONTAINER__PART_OF, ChooseeditorPackage.ACTOR_CONTAINER__INCLUDES);
		}
		return partOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OperationContainer> getResponsibleFor() {
		if (responsibleFor == null) {
			responsibleFor = new EObjectWithInverseResolvingEList.ManyInverse<OperationContainer>(OperationContainer.class, this, ChooseeditorPackage.ACTOR_CONTAINER__RESPONSIBLE_FOR, ChooseeditorPackage.OPERATION_CONTAINER__RESPONSIBLE);
		}
		return responsibleFor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OperationContainer> getAccountableFor() {
		if (accountableFor == null) {
			accountableFor = new EObjectWithInverseResolvingEList<OperationContainer>(OperationContainer.class, this, ChooseeditorPackage.ACTOR_CONTAINER__ACCOUNTABLE_FOR, ChooseeditorPackage.OPERATION_CONTAINER__ACCOUNTABLE);
		}
		return accountableFor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OperationContainer> getConsultedFor() {
		if (consultedFor == null) {
			consultedFor = new EObjectWithInverseResolvingEList.ManyInverse<OperationContainer>(OperationContainer.class, this, ChooseeditorPackage.ACTOR_CONTAINER__CONSULTED_FOR, ChooseeditorPackage.OPERATION_CONTAINER__CONSULT);
		}
		return consultedFor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OperationContainer> getInformedFor() {
		if (informedFor == null) {
			informedFor = new EObjectWithInverseResolvingEList.ManyInverse<OperationContainer>(OperationContainer.class, this, ChooseeditorPackage.ACTOR_CONTAINER__INFORMED_FOR, ChooseeditorPackage.OPERATION_CONTAINER__INFORM);
		}
		return informedFor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<chooseeditor.Object> getControls() {
		if (controls == null) {
			controls = new EObjectWithInverseResolvingEList.ManyInverse<chooseeditor.Object>(chooseeditor.Object.class, this, ChooseeditorPackage.ACTOR_CONTAINER__CONTROLS, ChooseeditorPackage.OBJECT__CONTROLLED_BY);
		}
		return controls;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<chooseeditor.Object> getMonitors() {
		if (monitors == null) {
			monitors = new EObjectWithInverseResolvingEList.ManyInverse<chooseeditor.Object>(chooseeditor.Object.class, this, ChooseeditorPackage.ACTOR_CONTAINER__MONITORS, ChooseeditorPackage.OBJECT__MONITORED_BY);
		}
		return monitors;
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
			case ChooseeditorPackage.ACTOR_CONTAINER__ASSIGNMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAssignments()).basicAdd(otherEnd, msgs);
			case ChooseeditorPackage.ACTOR_CONTAINER__WISHES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getWishes()).basicAdd(otherEnd, msgs);
			case ChooseeditorPackage.ACTOR_CONTAINER__INCLUDES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIncludes()).basicAdd(otherEnd, msgs);
			case ChooseeditorPackage.ACTOR_CONTAINER__PART_OF:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPartOf()).basicAdd(otherEnd, msgs);
			case ChooseeditorPackage.ACTOR_CONTAINER__RESPONSIBLE_FOR:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getResponsibleFor()).basicAdd(otherEnd, msgs);
			case ChooseeditorPackage.ACTOR_CONTAINER__ACCOUNTABLE_FOR:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAccountableFor()).basicAdd(otherEnd, msgs);
			case ChooseeditorPackage.ACTOR_CONTAINER__CONSULTED_FOR:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getConsultedFor()).basicAdd(otherEnd, msgs);
			case ChooseeditorPackage.ACTOR_CONTAINER__INFORMED_FOR:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInformedFor()).basicAdd(otherEnd, msgs);
			case ChooseeditorPackage.ACTOR_CONTAINER__CONTROLS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getControls()).basicAdd(otherEnd, msgs);
			case ChooseeditorPackage.ACTOR_CONTAINER__MONITORS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMonitors()).basicAdd(otherEnd, msgs);
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
			case ChooseeditorPackage.ACTOR_CONTAINER__ASSIGNMENTS:
				return ((InternalEList<?>)getAssignments()).basicRemove(otherEnd, msgs);
			case ChooseeditorPackage.ACTOR_CONTAINER__WISHES:
				return ((InternalEList<?>)getWishes()).basicRemove(otherEnd, msgs);
			case ChooseeditorPackage.ACTOR_CONTAINER__INCLUDES:
				return ((InternalEList<?>)getIncludes()).basicRemove(otherEnd, msgs);
			case ChooseeditorPackage.ACTOR_CONTAINER__PART_OF:
				return ((InternalEList<?>)getPartOf()).basicRemove(otherEnd, msgs);
			case ChooseeditorPackage.ACTOR_CONTAINER__RESPONSIBLE_FOR:
				return ((InternalEList<?>)getResponsibleFor()).basicRemove(otherEnd, msgs);
			case ChooseeditorPackage.ACTOR_CONTAINER__ACCOUNTABLE_FOR:
				return ((InternalEList<?>)getAccountableFor()).basicRemove(otherEnd, msgs);
			case ChooseeditorPackage.ACTOR_CONTAINER__CONSULTED_FOR:
				return ((InternalEList<?>)getConsultedFor()).basicRemove(otherEnd, msgs);
			case ChooseeditorPackage.ACTOR_CONTAINER__INFORMED_FOR:
				return ((InternalEList<?>)getInformedFor()).basicRemove(otherEnd, msgs);
			case ChooseeditorPackage.ACTOR_CONTAINER__CONTROLS:
				return ((InternalEList<?>)getControls()).basicRemove(otherEnd, msgs);
			case ChooseeditorPackage.ACTOR_CONTAINER__MONITORS:
				return ((InternalEList<?>)getMonitors()).basicRemove(otherEnd, msgs);
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
			case ChooseeditorPackage.ACTOR_CONTAINER__NAME:
				return getName();
			case ChooseeditorPackage.ACTOR_CONTAINER__DESCRIPTION:
				return getDescription();
			case ChooseeditorPackage.ACTOR_CONTAINER__ASSIGNMENTS:
				return getAssignments();
			case ChooseeditorPackage.ACTOR_CONTAINER__WISHES:
				return getWishes();
			case ChooseeditorPackage.ACTOR_CONTAINER__INCLUDES:
				return getIncludes();
			case ChooseeditorPackage.ACTOR_CONTAINER__PART_OF:
				return getPartOf();
			case ChooseeditorPackage.ACTOR_CONTAINER__RESPONSIBLE_FOR:
				return getResponsibleFor();
			case ChooseeditorPackage.ACTOR_CONTAINER__ACCOUNTABLE_FOR:
				return getAccountableFor();
			case ChooseeditorPackage.ACTOR_CONTAINER__CONSULTED_FOR:
				return getConsultedFor();
			case ChooseeditorPackage.ACTOR_CONTAINER__INFORMED_FOR:
				return getInformedFor();
			case ChooseeditorPackage.ACTOR_CONTAINER__CONTROLS:
				return getControls();
			case ChooseeditorPackage.ACTOR_CONTAINER__MONITORS:
				return getMonitors();
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
			case ChooseeditorPackage.ACTOR_CONTAINER__NAME:
				setName((String)newValue);
				return;
			case ChooseeditorPackage.ACTOR_CONTAINER__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case ChooseeditorPackage.ACTOR_CONTAINER__ASSIGNMENTS:
				getAssignments().clear();
				getAssignments().addAll((Collection<? extends Goal>)newValue);
				return;
			case ChooseeditorPackage.ACTOR_CONTAINER__WISHES:
				getWishes().clear();
				getWishes().addAll((Collection<? extends Goal>)newValue);
				return;
			case ChooseeditorPackage.ACTOR_CONTAINER__INCLUDES:
				getIncludes().clear();
				getIncludes().addAll((Collection<? extends ActorContainer>)newValue);
				return;
			case ChooseeditorPackage.ACTOR_CONTAINER__PART_OF:
				getPartOf().clear();
				getPartOf().addAll((Collection<? extends ActorContainer>)newValue);
				return;
			case ChooseeditorPackage.ACTOR_CONTAINER__RESPONSIBLE_FOR:
				getResponsibleFor().clear();
				getResponsibleFor().addAll((Collection<? extends OperationContainer>)newValue);
				return;
			case ChooseeditorPackage.ACTOR_CONTAINER__ACCOUNTABLE_FOR:
				getAccountableFor().clear();
				getAccountableFor().addAll((Collection<? extends OperationContainer>)newValue);
				return;
			case ChooseeditorPackage.ACTOR_CONTAINER__CONSULTED_FOR:
				getConsultedFor().clear();
				getConsultedFor().addAll((Collection<? extends OperationContainer>)newValue);
				return;
			case ChooseeditorPackage.ACTOR_CONTAINER__INFORMED_FOR:
				getInformedFor().clear();
				getInformedFor().addAll((Collection<? extends OperationContainer>)newValue);
				return;
			case ChooseeditorPackage.ACTOR_CONTAINER__CONTROLS:
				getControls().clear();
				getControls().addAll((Collection<? extends chooseeditor.Object>)newValue);
				return;
			case ChooseeditorPackage.ACTOR_CONTAINER__MONITORS:
				getMonitors().clear();
				getMonitors().addAll((Collection<? extends chooseeditor.Object>)newValue);
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
			case ChooseeditorPackage.ACTOR_CONTAINER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ChooseeditorPackage.ACTOR_CONTAINER__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case ChooseeditorPackage.ACTOR_CONTAINER__ASSIGNMENTS:
				getAssignments().clear();
				return;
			case ChooseeditorPackage.ACTOR_CONTAINER__WISHES:
				getWishes().clear();
				return;
			case ChooseeditorPackage.ACTOR_CONTAINER__INCLUDES:
				getIncludes().clear();
				return;
			case ChooseeditorPackage.ACTOR_CONTAINER__PART_OF:
				getPartOf().clear();
				return;
			case ChooseeditorPackage.ACTOR_CONTAINER__RESPONSIBLE_FOR:
				getResponsibleFor().clear();
				return;
			case ChooseeditorPackage.ACTOR_CONTAINER__ACCOUNTABLE_FOR:
				getAccountableFor().clear();
				return;
			case ChooseeditorPackage.ACTOR_CONTAINER__CONSULTED_FOR:
				getConsultedFor().clear();
				return;
			case ChooseeditorPackage.ACTOR_CONTAINER__INFORMED_FOR:
				getInformedFor().clear();
				return;
			case ChooseeditorPackage.ACTOR_CONTAINER__CONTROLS:
				getControls().clear();
				return;
			case ChooseeditorPackage.ACTOR_CONTAINER__MONITORS:
				getMonitors().clear();
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
			case ChooseeditorPackage.ACTOR_CONTAINER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ChooseeditorPackage.ACTOR_CONTAINER__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case ChooseeditorPackage.ACTOR_CONTAINER__ASSIGNMENTS:
				return assignments != null && !assignments.isEmpty();
			case ChooseeditorPackage.ACTOR_CONTAINER__WISHES:
				return wishes != null && !wishes.isEmpty();
			case ChooseeditorPackage.ACTOR_CONTAINER__INCLUDES:
				return includes != null && !includes.isEmpty();
			case ChooseeditorPackage.ACTOR_CONTAINER__PART_OF:
				return partOf != null && !partOf.isEmpty();
			case ChooseeditorPackage.ACTOR_CONTAINER__RESPONSIBLE_FOR:
				return responsibleFor != null && !responsibleFor.isEmpty();
			case ChooseeditorPackage.ACTOR_CONTAINER__ACCOUNTABLE_FOR:
				return accountableFor != null && !accountableFor.isEmpty();
			case ChooseeditorPackage.ACTOR_CONTAINER__CONSULTED_FOR:
				return consultedFor != null && !consultedFor.isEmpty();
			case ChooseeditorPackage.ACTOR_CONTAINER__INFORMED_FOR:
				return informedFor != null && !informedFor.isEmpty();
			case ChooseeditorPackage.ACTOR_CONTAINER__CONTROLS:
				return controls != null && !controls.isEmpty();
			case ChooseeditorPackage.ACTOR_CONTAINER__MONITORS:
				return monitors != null && !monitors.isEmpty();
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

} //ActorContainerImpl
