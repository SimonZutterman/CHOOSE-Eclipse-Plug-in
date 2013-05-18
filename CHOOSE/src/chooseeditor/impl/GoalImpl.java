/**
 */
package chooseeditor.impl;

import chooseeditor.ActorContainer;
import chooseeditor.ChooseeditorPackage;
import chooseeditor.Goal;
import chooseeditor.OperationContainer;
import chooseeditor.Refinement;

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
 * An implementation of the model object '<em><b>Goal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link chooseeditor.impl.GoalImpl#getName <em>Name</em>}</li>
 *   <li>{@link chooseeditor.impl.GoalImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link chooseeditor.impl.GoalImpl#getConflicts <em>Conflicts</em>}</li>
 *   <li>{@link chooseeditor.impl.GoalImpl#getConflicted <em>Conflicted</em>}</li>
 *   <li>{@link chooseeditor.impl.GoalImpl#getAssignedTo <em>Assigned To</em>}</li>
 *   <li>{@link chooseeditor.impl.GoalImpl#getWishedBy <em>Wished By</em>}</li>
 *   <li>{@link chooseeditor.impl.GoalImpl#getOperationalizedBy <em>Operationalized By</em>}</li>
 *   <li>{@link chooseeditor.impl.GoalImpl#getConcernsObjects <em>Concerns Objects</em>}</li>
 *   <li>{@link chooseeditor.impl.GoalImpl#getOr <em>Or</em>}</li>
 *   <li>{@link chooseeditor.impl.GoalImpl#getAnd <em>And</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GoalImpl extends EObjectImpl implements Goal {
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
	 * The cached value of the '{@link #getConflicts() <em>Conflicts</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConflicts()
	 * @generated
	 * @ordered
	 */
	protected EList<Goal> conflicts;

	/**
	 * The cached value of the '{@link #getConflicted() <em>Conflicted</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConflicted()
	 * @generated
	 * @ordered
	 */
	protected EList<Goal> conflicted;

	/**
	 * The cached value of the '{@link #getAssignedTo() <em>Assigned To</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssignedTo()
	 * @generated
	 * @ordered
	 */
	protected EList<ActorContainer> assignedTo;

	/**
	 * The cached value of the '{@link #getWishedBy() <em>Wished By</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWishedBy()
	 * @generated
	 * @ordered
	 */
	protected EList<ActorContainer> wishedBy;

	/**
	 * The cached value of the '{@link #getOperationalizedBy() <em>Operationalized By</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationalizedBy()
	 * @generated
	 * @ordered
	 */
	protected EList<OperationContainer> operationalizedBy;

	/**
	 * The cached value of the '{@link #getConcernsObjects() <em>Concerns Objects</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcernsObjects()
	 * @generated
	 * @ordered
	 */
	protected EList<chooseeditor.Object> concernsObjects;

	/**
	 * The cached value of the '{@link #getOr() <em>Or</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOr()
	 * @generated
	 * @ordered
	 */
	protected EList<Refinement> or;

	/**
	 * The cached value of the '{@link #getAnd() <em>And</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnd()
	 * @generated
	 * @ordered
	 */
	protected EList<Refinement> and;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GoalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ChooseeditorPackage.Literals.GOAL;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ChooseeditorPackage.GOAL__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ChooseeditorPackage.GOAL__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Goal> getConflicts() {
		if (conflicts == null) {
			conflicts = new EObjectWithInverseResolvingEList.ManyInverse<Goal>(Goal.class, this, ChooseeditorPackage.GOAL__CONFLICTS, ChooseeditorPackage.GOAL__CONFLICTED);
		}
		return conflicts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Goal> getConflicted() {
		if (conflicted == null) {
			conflicted = new EObjectWithInverseResolvingEList.ManyInverse<Goal>(Goal.class, this, ChooseeditorPackage.GOAL__CONFLICTED, ChooseeditorPackage.GOAL__CONFLICTS);
		}
		return conflicted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActorContainer> getAssignedTo() {
		if (assignedTo == null) {
			assignedTo = new EObjectWithInverseResolvingEList.ManyInverse<ActorContainer>(ActorContainer.class, this, ChooseeditorPackage.GOAL__ASSIGNED_TO, ChooseeditorPackage.ACTOR_CONTAINER__ASSIGNMENTS);
		}
		return assignedTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActorContainer> getWishedBy() {
		if (wishedBy == null) {
			wishedBy = new EObjectWithInverseResolvingEList.ManyInverse<ActorContainer>(ActorContainer.class, this, ChooseeditorPackage.GOAL__WISHED_BY, ChooseeditorPackage.ACTOR_CONTAINER__WISHES);
		}
		return wishedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OperationContainer> getOperationalizedBy() {
		if (operationalizedBy == null) {
			operationalizedBy = new EObjectWithInverseResolvingEList.ManyInverse<OperationContainer>(OperationContainer.class, this, ChooseeditorPackage.GOAL__OPERATIONALIZED_BY, ChooseeditorPackage.OPERATION_CONTAINER__OPERATIONALIZES);
		}
		return operationalizedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<chooseeditor.Object> getConcernsObjects() {
		if (concernsObjects == null) {
			concernsObjects = new EObjectWithInverseResolvingEList.ManyInverse<chooseeditor.Object>(chooseeditor.Object.class, this, ChooseeditorPackage.GOAL__CONCERNS_OBJECTS, ChooseeditorPackage.OBJECT__CONCERNS_GOALS);
		}
		return concernsObjects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Refinement> getOr() {
		if (or == null) {
			or = new EObjectWithInverseResolvingEList<Refinement>(Refinement.class, this, ChooseeditorPackage.GOAL__OR, ChooseeditorPackage.REFINEMENT__SUPERGOAL);
		}
		return or;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Refinement> getAnd() {
		if (and == null) {
			and = new EObjectWithInverseResolvingEList.ManyInverse<Refinement>(Refinement.class, this, ChooseeditorPackage.GOAL__AND, ChooseeditorPackage.REFINEMENT__SUBGOALS);
		}
		return and;
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
			case ChooseeditorPackage.GOAL__CONFLICTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getConflicts()).basicAdd(otherEnd, msgs);
			case ChooseeditorPackage.GOAL__CONFLICTED:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getConflicted()).basicAdd(otherEnd, msgs);
			case ChooseeditorPackage.GOAL__ASSIGNED_TO:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAssignedTo()).basicAdd(otherEnd, msgs);
			case ChooseeditorPackage.GOAL__WISHED_BY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getWishedBy()).basicAdd(otherEnd, msgs);
			case ChooseeditorPackage.GOAL__OPERATIONALIZED_BY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOperationalizedBy()).basicAdd(otherEnd, msgs);
			case ChooseeditorPackage.GOAL__CONCERNS_OBJECTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getConcernsObjects()).basicAdd(otherEnd, msgs);
			case ChooseeditorPackage.GOAL__OR:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOr()).basicAdd(otherEnd, msgs);
			case ChooseeditorPackage.GOAL__AND:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAnd()).basicAdd(otherEnd, msgs);
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
			case ChooseeditorPackage.GOAL__CONFLICTS:
				return ((InternalEList<?>)getConflicts()).basicRemove(otherEnd, msgs);
			case ChooseeditorPackage.GOAL__CONFLICTED:
				return ((InternalEList<?>)getConflicted()).basicRemove(otherEnd, msgs);
			case ChooseeditorPackage.GOAL__ASSIGNED_TO:
				return ((InternalEList<?>)getAssignedTo()).basicRemove(otherEnd, msgs);
			case ChooseeditorPackage.GOAL__WISHED_BY:
				return ((InternalEList<?>)getWishedBy()).basicRemove(otherEnd, msgs);
			case ChooseeditorPackage.GOAL__OPERATIONALIZED_BY:
				return ((InternalEList<?>)getOperationalizedBy()).basicRemove(otherEnd, msgs);
			case ChooseeditorPackage.GOAL__CONCERNS_OBJECTS:
				return ((InternalEList<?>)getConcernsObjects()).basicRemove(otherEnd, msgs);
			case ChooseeditorPackage.GOAL__OR:
				return ((InternalEList<?>)getOr()).basicRemove(otherEnd, msgs);
			case ChooseeditorPackage.GOAL__AND:
				return ((InternalEList<?>)getAnd()).basicRemove(otherEnd, msgs);
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
			case ChooseeditorPackage.GOAL__NAME:
				return getName();
			case ChooseeditorPackage.GOAL__DESCRIPTION:
				return getDescription();
			case ChooseeditorPackage.GOAL__CONFLICTS:
				return getConflicts();
			case ChooseeditorPackage.GOAL__CONFLICTED:
				return getConflicted();
			case ChooseeditorPackage.GOAL__ASSIGNED_TO:
				return getAssignedTo();
			case ChooseeditorPackage.GOAL__WISHED_BY:
				return getWishedBy();
			case ChooseeditorPackage.GOAL__OPERATIONALIZED_BY:
				return getOperationalizedBy();
			case ChooseeditorPackage.GOAL__CONCERNS_OBJECTS:
				return getConcernsObjects();
			case ChooseeditorPackage.GOAL__OR:
				return getOr();
			case ChooseeditorPackage.GOAL__AND:
				return getAnd();
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
			case ChooseeditorPackage.GOAL__NAME:
				setName((String)newValue);
				return;
			case ChooseeditorPackage.GOAL__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case ChooseeditorPackage.GOAL__CONFLICTS:
				getConflicts().clear();
				getConflicts().addAll((Collection<? extends Goal>)newValue);
				return;
			case ChooseeditorPackage.GOAL__CONFLICTED:
				getConflicted().clear();
				getConflicted().addAll((Collection<? extends Goal>)newValue);
				return;
			case ChooseeditorPackage.GOAL__ASSIGNED_TO:
				getAssignedTo().clear();
				getAssignedTo().addAll((Collection<? extends ActorContainer>)newValue);
				return;
			case ChooseeditorPackage.GOAL__WISHED_BY:
				getWishedBy().clear();
				getWishedBy().addAll((Collection<? extends ActorContainer>)newValue);
				return;
			case ChooseeditorPackage.GOAL__OPERATIONALIZED_BY:
				getOperationalizedBy().clear();
				getOperationalizedBy().addAll((Collection<? extends OperationContainer>)newValue);
				return;
			case ChooseeditorPackage.GOAL__CONCERNS_OBJECTS:
				getConcernsObjects().clear();
				getConcernsObjects().addAll((Collection<? extends chooseeditor.Object>)newValue);
				return;
			case ChooseeditorPackage.GOAL__OR:
				getOr().clear();
				getOr().addAll((Collection<? extends Refinement>)newValue);
				return;
			case ChooseeditorPackage.GOAL__AND:
				getAnd().clear();
				getAnd().addAll((Collection<? extends Refinement>)newValue);
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
			case ChooseeditorPackage.GOAL__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ChooseeditorPackage.GOAL__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case ChooseeditorPackage.GOAL__CONFLICTS:
				getConflicts().clear();
				return;
			case ChooseeditorPackage.GOAL__CONFLICTED:
				getConflicted().clear();
				return;
			case ChooseeditorPackage.GOAL__ASSIGNED_TO:
				getAssignedTo().clear();
				return;
			case ChooseeditorPackage.GOAL__WISHED_BY:
				getWishedBy().clear();
				return;
			case ChooseeditorPackage.GOAL__OPERATIONALIZED_BY:
				getOperationalizedBy().clear();
				return;
			case ChooseeditorPackage.GOAL__CONCERNS_OBJECTS:
				getConcernsObjects().clear();
				return;
			case ChooseeditorPackage.GOAL__OR:
				getOr().clear();
				return;
			case ChooseeditorPackage.GOAL__AND:
				getAnd().clear();
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
			case ChooseeditorPackage.GOAL__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ChooseeditorPackage.GOAL__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case ChooseeditorPackage.GOAL__CONFLICTS:
				return conflicts != null && !conflicts.isEmpty();
			case ChooseeditorPackage.GOAL__CONFLICTED:
				return conflicted != null && !conflicted.isEmpty();
			case ChooseeditorPackage.GOAL__ASSIGNED_TO:
				return assignedTo != null && !assignedTo.isEmpty();
			case ChooseeditorPackage.GOAL__WISHED_BY:
				return wishedBy != null && !wishedBy.isEmpty();
			case ChooseeditorPackage.GOAL__OPERATIONALIZED_BY:
				return operationalizedBy != null && !operationalizedBy.isEmpty();
			case ChooseeditorPackage.GOAL__CONCERNS_OBJECTS:
				return concernsObjects != null && !concernsObjects.isEmpty();
			case ChooseeditorPackage.GOAL__OR:
				return or != null && !or.isEmpty();
			case ChooseeditorPackage.GOAL__AND:
				return and != null && !and.isEmpty();
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

} //GoalImpl
