/**
 */
package chooseeditor.impl;

import chooseeditor.ChooseeditorPackage;
import chooseeditor.HumanActor;
import chooseeditor.Role;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Human Actor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link chooseeditor.impl.HumanActorImpl#getSupervisees <em>Supervisees</em>}</li>
 *   <li>{@link chooseeditor.impl.HumanActorImpl#getSupervisors <em>Supervisors</em>}</li>
 *   <li>{@link chooseeditor.impl.HumanActorImpl#getPerforms <em>Performs</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HumanActorImpl extends ActorContainerImpl implements HumanActor {
	/**
	 * The cached value of the '{@link #getSupervisees() <em>Supervisees</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupervisees()
	 * @generated
	 * @ordered
	 */
	protected EList<HumanActor> supervisees;

	/**
	 * The cached value of the '{@link #getSupervisors() <em>Supervisors</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupervisors()
	 * @generated
	 * @ordered
	 */
	protected EList<HumanActor> supervisors;

	/**
	 * The cached value of the '{@link #getPerforms() <em>Performs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerforms()
	 * @generated
	 * @ordered
	 */
	protected EList<Role> performs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HumanActorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ChooseeditorPackage.Literals.HUMAN_ACTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HumanActor> getSupervisees() {
		if (supervisees == null) {
			supervisees = new EObjectWithInverseResolvingEList.ManyInverse<HumanActor>(HumanActor.class, this, ChooseeditorPackage.HUMAN_ACTOR__SUPERVISEES, ChooseeditorPackage.HUMAN_ACTOR__SUPERVISORS);
		}
		return supervisees;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HumanActor> getSupervisors() {
		if (supervisors == null) {
			supervisors = new EObjectWithInverseResolvingEList.ManyInverse<HumanActor>(HumanActor.class, this, ChooseeditorPackage.HUMAN_ACTOR__SUPERVISORS, ChooseeditorPackage.HUMAN_ACTOR__SUPERVISEES);
		}
		return supervisors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Role> getPerforms() {
		if (performs == null) {
			performs = new EObjectWithInverseResolvingEList.ManyInverse<Role>(Role.class, this, ChooseeditorPackage.HUMAN_ACTOR__PERFORMS, ChooseeditorPackage.ROLE__PERFORMED_BY);
		}
		return performs;
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
			case ChooseeditorPackage.HUMAN_ACTOR__SUPERVISEES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSupervisees()).basicAdd(otherEnd, msgs);
			case ChooseeditorPackage.HUMAN_ACTOR__SUPERVISORS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSupervisors()).basicAdd(otherEnd, msgs);
			case ChooseeditorPackage.HUMAN_ACTOR__PERFORMS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPerforms()).basicAdd(otherEnd, msgs);
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
			case ChooseeditorPackage.HUMAN_ACTOR__SUPERVISEES:
				return ((InternalEList<?>)getSupervisees()).basicRemove(otherEnd, msgs);
			case ChooseeditorPackage.HUMAN_ACTOR__SUPERVISORS:
				return ((InternalEList<?>)getSupervisors()).basicRemove(otherEnd, msgs);
			case ChooseeditorPackage.HUMAN_ACTOR__PERFORMS:
				return ((InternalEList<?>)getPerforms()).basicRemove(otherEnd, msgs);
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
			case ChooseeditorPackage.HUMAN_ACTOR__SUPERVISEES:
				return getSupervisees();
			case ChooseeditorPackage.HUMAN_ACTOR__SUPERVISORS:
				return getSupervisors();
			case ChooseeditorPackage.HUMAN_ACTOR__PERFORMS:
				return getPerforms();
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
			case ChooseeditorPackage.HUMAN_ACTOR__SUPERVISEES:
				getSupervisees().clear();
				getSupervisees().addAll((Collection<? extends HumanActor>)newValue);
				return;
			case ChooseeditorPackage.HUMAN_ACTOR__SUPERVISORS:
				getSupervisors().clear();
				getSupervisors().addAll((Collection<? extends HumanActor>)newValue);
				return;
			case ChooseeditorPackage.HUMAN_ACTOR__PERFORMS:
				getPerforms().clear();
				getPerforms().addAll((Collection<? extends Role>)newValue);
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
			case ChooseeditorPackage.HUMAN_ACTOR__SUPERVISEES:
				getSupervisees().clear();
				return;
			case ChooseeditorPackage.HUMAN_ACTOR__SUPERVISORS:
				getSupervisors().clear();
				return;
			case ChooseeditorPackage.HUMAN_ACTOR__PERFORMS:
				getPerforms().clear();
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
			case ChooseeditorPackage.HUMAN_ACTOR__SUPERVISEES:
				return supervisees != null && !supervisees.isEmpty();
			case ChooseeditorPackage.HUMAN_ACTOR__SUPERVISORS:
				return supervisors != null && !supervisors.isEmpty();
			case ChooseeditorPackage.HUMAN_ACTOR__PERFORMS:
				return performs != null && !performs.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //HumanActorImpl
