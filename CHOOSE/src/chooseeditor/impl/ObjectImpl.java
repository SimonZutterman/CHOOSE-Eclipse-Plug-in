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
 * An implementation of the model object '<em><b>Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link chooseeditor.impl.ObjectImpl#getName <em>Name</em>}</li>
 *   <li>{@link chooseeditor.impl.ObjectImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link chooseeditor.impl.ObjectImpl#getConcernsGoals <em>Concerns Goals</em>}</li>
 *   <li>{@link chooseeditor.impl.ObjectImpl#getControlledBy <em>Controlled By</em>}</li>
 *   <li>{@link chooseeditor.impl.ObjectImpl#getMonitoredBy <em>Monitored By</em>}</li>
 *   <li>{@link chooseeditor.impl.ObjectImpl#getInputFor <em>Input For</em>}</li>
 *   <li>{@link chooseeditor.impl.ObjectImpl#getOutputOf <em>Output Of</em>}</li>
 *   <li>{@link chooseeditor.impl.ObjectImpl#getAssociates <em>Associates</em>}</li>
 *   <li>{@link chooseeditor.impl.ObjectImpl#getAssociated <em>Associated</em>}</li>
 *   <li>{@link chooseeditor.impl.ObjectImpl#getSpecialization <em>Specialization</em>}</li>
 *   <li>{@link chooseeditor.impl.ObjectImpl#getSpecializedBy <em>Specialized By</em>}</li>
 *   <li>{@link chooseeditor.impl.ObjectImpl#getIncludes <em>Includes</em>}</li>
 *   <li>{@link chooseeditor.impl.ObjectImpl#getPartOf <em>Part Of</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ObjectImpl extends EObjectImpl implements chooseeditor.Object {
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
	 * The cached value of the '{@link #getConcernsGoals() <em>Concerns Goals</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcernsGoals()
	 * @generated
	 * @ordered
	 */
	protected EList<Goal> concernsGoals;

	/**
	 * The cached value of the '{@link #getControlledBy() <em>Controlled By</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlledBy()
	 * @generated
	 * @ordered
	 */
	protected EList<ActorContainer> controlledBy;

	/**
	 * The cached value of the '{@link #getMonitoredBy() <em>Monitored By</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMonitoredBy()
	 * @generated
	 * @ordered
	 */
	protected EList<ActorContainer> monitoredBy;

	/**
	 * The cached value of the '{@link #getInputFor() <em>Input For</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputFor()
	 * @generated
	 * @ordered
	 */
	protected EList<OperationContainer> inputFor;

	/**
	 * The cached value of the '{@link #getOutputOf() <em>Output Of</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputOf()
	 * @generated
	 * @ordered
	 */
	protected EList<OperationContainer> outputOf;

	/**
	 * The cached value of the '{@link #getAssociates() <em>Associates</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociates()
	 * @generated
	 * @ordered
	 */
	protected EList<chooseeditor.Object> associates;

	/**
	 * The cached value of the '{@link #getAssociated() <em>Associated</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociated()
	 * @generated
	 * @ordered
	 */
	protected EList<chooseeditor.Object> associated;

	/**
	 * The cached value of the '{@link #getSpecialization() <em>Specialization</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecialization()
	 * @generated
	 * @ordered
	 */
	protected EList<chooseeditor.Object> specialization;

	/**
	 * The cached value of the '{@link #getSpecializedBy() <em>Specialized By</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecializedBy()
	 * @generated
	 * @ordered
	 */
	protected EList<chooseeditor.Object> specializedBy;

	/**
	 * The cached value of the '{@link #getIncludes() <em>Includes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludes()
	 * @generated
	 * @ordered
	 */
	protected EList<chooseeditor.Object> includes;

	/**
	 * The cached value of the '{@link #getPartOf() <em>Part Of</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartOf()
	 * @generated
	 * @ordered
	 */
	protected EList<chooseeditor.Object> partOf;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ChooseeditorPackage.Literals.OBJECT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ChooseeditorPackage.OBJECT__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ChooseeditorPackage.OBJECT__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Goal> getConcernsGoals() {
		if (concernsGoals == null) {
			concernsGoals = new EObjectWithInverseResolvingEList.ManyInverse<Goal>(Goal.class, this, ChooseeditorPackage.OBJECT__CONCERNS_GOALS, ChooseeditorPackage.GOAL__CONCERNS_OBJECTS);
		}
		return concernsGoals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActorContainer> getControlledBy() {
		if (controlledBy == null) {
			controlledBy = new EObjectWithInverseResolvingEList.ManyInverse<ActorContainer>(ActorContainer.class, this, ChooseeditorPackage.OBJECT__CONTROLLED_BY, ChooseeditorPackage.ACTOR_CONTAINER__CONTROLS);
		}
		return controlledBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActorContainer> getMonitoredBy() {
		if (monitoredBy == null) {
			monitoredBy = new EObjectWithInverseResolvingEList.ManyInverse<ActorContainer>(ActorContainer.class, this, ChooseeditorPackage.OBJECT__MONITORED_BY, ChooseeditorPackage.ACTOR_CONTAINER__MONITORS);
		}
		return monitoredBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OperationContainer> getInputFor() {
		if (inputFor == null) {
			inputFor = new EObjectWithInverseResolvingEList.ManyInverse<OperationContainer>(OperationContainer.class, this, ChooseeditorPackage.OBJECT__INPUT_FOR, ChooseeditorPackage.OPERATION_CONTAINER__INPUT);
		}
		return inputFor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OperationContainer> getOutputOf() {
		if (outputOf == null) {
			outputOf = new EObjectWithInverseResolvingEList.ManyInverse<OperationContainer>(OperationContainer.class, this, ChooseeditorPackage.OBJECT__OUTPUT_OF, ChooseeditorPackage.OPERATION_CONTAINER__OUTPUT);
		}
		return outputOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<chooseeditor.Object> getAssociates() {
		if (associates == null) {
			associates = new EObjectWithInverseResolvingEList.ManyInverse<chooseeditor.Object>(chooseeditor.Object.class, this, ChooseeditorPackage.OBJECT__ASSOCIATES, ChooseeditorPackage.OBJECT__ASSOCIATED);
		}
		return associates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<chooseeditor.Object> getAssociated() {
		if (associated == null) {
			associated = new EObjectWithInverseResolvingEList.ManyInverse<chooseeditor.Object>(chooseeditor.Object.class, this, ChooseeditorPackage.OBJECT__ASSOCIATED, ChooseeditorPackage.OBJECT__ASSOCIATES);
		}
		return associated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<chooseeditor.Object> getSpecialization() {
		if (specialization == null) {
			specialization = new EObjectWithInverseResolvingEList.ManyInverse<chooseeditor.Object>(chooseeditor.Object.class, this, ChooseeditorPackage.OBJECT__SPECIALIZATION, ChooseeditorPackage.OBJECT__SPECIALIZED_BY);
		}
		return specialization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<chooseeditor.Object> getSpecializedBy() {
		if (specializedBy == null) {
			specializedBy = new EObjectWithInverseResolvingEList.ManyInverse<chooseeditor.Object>(chooseeditor.Object.class, this, ChooseeditorPackage.OBJECT__SPECIALIZED_BY, ChooseeditorPackage.OBJECT__SPECIALIZATION);
		}
		return specializedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<chooseeditor.Object> getIncludes() {
		if (includes == null) {
			includes = new EObjectWithInverseResolvingEList.ManyInverse<chooseeditor.Object>(chooseeditor.Object.class, this, ChooseeditorPackage.OBJECT__INCLUDES, ChooseeditorPackage.OBJECT__PART_OF);
		}
		return includes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<chooseeditor.Object> getPartOf() {
		if (partOf == null) {
			partOf = new EObjectWithInverseResolvingEList.ManyInverse<chooseeditor.Object>(chooseeditor.Object.class, this, ChooseeditorPackage.OBJECT__PART_OF, ChooseeditorPackage.OBJECT__INCLUDES);
		}
		return partOf;
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
			case ChooseeditorPackage.OBJECT__CONCERNS_GOALS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getConcernsGoals()).basicAdd(otherEnd, msgs);
			case ChooseeditorPackage.OBJECT__CONTROLLED_BY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getControlledBy()).basicAdd(otherEnd, msgs);
			case ChooseeditorPackage.OBJECT__MONITORED_BY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMonitoredBy()).basicAdd(otherEnd, msgs);
			case ChooseeditorPackage.OBJECT__INPUT_FOR:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInputFor()).basicAdd(otherEnd, msgs);
			case ChooseeditorPackage.OBJECT__OUTPUT_OF:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutputOf()).basicAdd(otherEnd, msgs);
			case ChooseeditorPackage.OBJECT__ASSOCIATES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAssociates()).basicAdd(otherEnd, msgs);
			case ChooseeditorPackage.OBJECT__ASSOCIATED:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAssociated()).basicAdd(otherEnd, msgs);
			case ChooseeditorPackage.OBJECT__SPECIALIZATION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSpecialization()).basicAdd(otherEnd, msgs);
			case ChooseeditorPackage.OBJECT__SPECIALIZED_BY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSpecializedBy()).basicAdd(otherEnd, msgs);
			case ChooseeditorPackage.OBJECT__INCLUDES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIncludes()).basicAdd(otherEnd, msgs);
			case ChooseeditorPackage.OBJECT__PART_OF:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPartOf()).basicAdd(otherEnd, msgs);
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
			case ChooseeditorPackage.OBJECT__CONCERNS_GOALS:
				return ((InternalEList<?>)getConcernsGoals()).basicRemove(otherEnd, msgs);
			case ChooseeditorPackage.OBJECT__CONTROLLED_BY:
				return ((InternalEList<?>)getControlledBy()).basicRemove(otherEnd, msgs);
			case ChooseeditorPackage.OBJECT__MONITORED_BY:
				return ((InternalEList<?>)getMonitoredBy()).basicRemove(otherEnd, msgs);
			case ChooseeditorPackage.OBJECT__INPUT_FOR:
				return ((InternalEList<?>)getInputFor()).basicRemove(otherEnd, msgs);
			case ChooseeditorPackage.OBJECT__OUTPUT_OF:
				return ((InternalEList<?>)getOutputOf()).basicRemove(otherEnd, msgs);
			case ChooseeditorPackage.OBJECT__ASSOCIATES:
				return ((InternalEList<?>)getAssociates()).basicRemove(otherEnd, msgs);
			case ChooseeditorPackage.OBJECT__ASSOCIATED:
				return ((InternalEList<?>)getAssociated()).basicRemove(otherEnd, msgs);
			case ChooseeditorPackage.OBJECT__SPECIALIZATION:
				return ((InternalEList<?>)getSpecialization()).basicRemove(otherEnd, msgs);
			case ChooseeditorPackage.OBJECT__SPECIALIZED_BY:
				return ((InternalEList<?>)getSpecializedBy()).basicRemove(otherEnd, msgs);
			case ChooseeditorPackage.OBJECT__INCLUDES:
				return ((InternalEList<?>)getIncludes()).basicRemove(otherEnd, msgs);
			case ChooseeditorPackage.OBJECT__PART_OF:
				return ((InternalEList<?>)getPartOf()).basicRemove(otherEnd, msgs);
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
			case ChooseeditorPackage.OBJECT__NAME:
				return getName();
			case ChooseeditorPackage.OBJECT__DESCRIPTION:
				return getDescription();
			case ChooseeditorPackage.OBJECT__CONCERNS_GOALS:
				return getConcernsGoals();
			case ChooseeditorPackage.OBJECT__CONTROLLED_BY:
				return getControlledBy();
			case ChooseeditorPackage.OBJECT__MONITORED_BY:
				return getMonitoredBy();
			case ChooseeditorPackage.OBJECT__INPUT_FOR:
				return getInputFor();
			case ChooseeditorPackage.OBJECT__OUTPUT_OF:
				return getOutputOf();
			case ChooseeditorPackage.OBJECT__ASSOCIATES:
				return getAssociates();
			case ChooseeditorPackage.OBJECT__ASSOCIATED:
				return getAssociated();
			case ChooseeditorPackage.OBJECT__SPECIALIZATION:
				return getSpecialization();
			case ChooseeditorPackage.OBJECT__SPECIALIZED_BY:
				return getSpecializedBy();
			case ChooseeditorPackage.OBJECT__INCLUDES:
				return getIncludes();
			case ChooseeditorPackage.OBJECT__PART_OF:
				return getPartOf();
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
			case ChooseeditorPackage.OBJECT__NAME:
				setName((String)newValue);
				return;
			case ChooseeditorPackage.OBJECT__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case ChooseeditorPackage.OBJECT__CONCERNS_GOALS:
				getConcernsGoals().clear();
				getConcernsGoals().addAll((Collection<? extends Goal>)newValue);
				return;
			case ChooseeditorPackage.OBJECT__CONTROLLED_BY:
				getControlledBy().clear();
				getControlledBy().addAll((Collection<? extends ActorContainer>)newValue);
				return;
			case ChooseeditorPackage.OBJECT__MONITORED_BY:
				getMonitoredBy().clear();
				getMonitoredBy().addAll((Collection<? extends ActorContainer>)newValue);
				return;
			case ChooseeditorPackage.OBJECT__INPUT_FOR:
				getInputFor().clear();
				getInputFor().addAll((Collection<? extends OperationContainer>)newValue);
				return;
			case ChooseeditorPackage.OBJECT__OUTPUT_OF:
				getOutputOf().clear();
				getOutputOf().addAll((Collection<? extends OperationContainer>)newValue);
				return;
			case ChooseeditorPackage.OBJECT__ASSOCIATES:
				getAssociates().clear();
				getAssociates().addAll((Collection<? extends chooseeditor.Object>)newValue);
				return;
			case ChooseeditorPackage.OBJECT__ASSOCIATED:
				getAssociated().clear();
				getAssociated().addAll((Collection<? extends chooseeditor.Object>)newValue);
				return;
			case ChooseeditorPackage.OBJECT__SPECIALIZATION:
				getSpecialization().clear();
				getSpecialization().addAll((Collection<? extends chooseeditor.Object>)newValue);
				return;
			case ChooseeditorPackage.OBJECT__SPECIALIZED_BY:
				getSpecializedBy().clear();
				getSpecializedBy().addAll((Collection<? extends chooseeditor.Object>)newValue);
				return;
			case ChooseeditorPackage.OBJECT__INCLUDES:
				getIncludes().clear();
				getIncludes().addAll((Collection<? extends chooseeditor.Object>)newValue);
				return;
			case ChooseeditorPackage.OBJECT__PART_OF:
				getPartOf().clear();
				getPartOf().addAll((Collection<? extends chooseeditor.Object>)newValue);
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
			case ChooseeditorPackage.OBJECT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ChooseeditorPackage.OBJECT__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case ChooseeditorPackage.OBJECT__CONCERNS_GOALS:
				getConcernsGoals().clear();
				return;
			case ChooseeditorPackage.OBJECT__CONTROLLED_BY:
				getControlledBy().clear();
				return;
			case ChooseeditorPackage.OBJECT__MONITORED_BY:
				getMonitoredBy().clear();
				return;
			case ChooseeditorPackage.OBJECT__INPUT_FOR:
				getInputFor().clear();
				return;
			case ChooseeditorPackage.OBJECT__OUTPUT_OF:
				getOutputOf().clear();
				return;
			case ChooseeditorPackage.OBJECT__ASSOCIATES:
				getAssociates().clear();
				return;
			case ChooseeditorPackage.OBJECT__ASSOCIATED:
				getAssociated().clear();
				return;
			case ChooseeditorPackage.OBJECT__SPECIALIZATION:
				getSpecialization().clear();
				return;
			case ChooseeditorPackage.OBJECT__SPECIALIZED_BY:
				getSpecializedBy().clear();
				return;
			case ChooseeditorPackage.OBJECT__INCLUDES:
				getIncludes().clear();
				return;
			case ChooseeditorPackage.OBJECT__PART_OF:
				getPartOf().clear();
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
			case ChooseeditorPackage.OBJECT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ChooseeditorPackage.OBJECT__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case ChooseeditorPackage.OBJECT__CONCERNS_GOALS:
				return concernsGoals != null && !concernsGoals.isEmpty();
			case ChooseeditorPackage.OBJECT__CONTROLLED_BY:
				return controlledBy != null && !controlledBy.isEmpty();
			case ChooseeditorPackage.OBJECT__MONITORED_BY:
				return monitoredBy != null && !monitoredBy.isEmpty();
			case ChooseeditorPackage.OBJECT__INPUT_FOR:
				return inputFor != null && !inputFor.isEmpty();
			case ChooseeditorPackage.OBJECT__OUTPUT_OF:
				return outputOf != null && !outputOf.isEmpty();
			case ChooseeditorPackage.OBJECT__ASSOCIATES:
				return associates != null && !associates.isEmpty();
			case ChooseeditorPackage.OBJECT__ASSOCIATED:
				return associated != null && !associated.isEmpty();
			case ChooseeditorPackage.OBJECT__SPECIALIZATION:
				return specialization != null && !specialization.isEmpty();
			case ChooseeditorPackage.OBJECT__SPECIALIZED_BY:
				return specializedBy != null && !specializedBy.isEmpty();
			case ChooseeditorPackage.OBJECT__INCLUDES:
				return includes != null && !includes.isEmpty();
			case ChooseeditorPackage.OBJECT__PART_OF:
				return partOf != null && !partOf.isEmpty();
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

} //ObjectImpl
