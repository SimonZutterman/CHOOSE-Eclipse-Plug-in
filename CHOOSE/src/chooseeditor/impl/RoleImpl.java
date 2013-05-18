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
 * An implementation of the model object '<em><b>Role</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link chooseeditor.impl.RoleImpl#getPerformedBy <em>Performed By</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RoleImpl extends ActorContainerImpl implements Role {
	/**
	 * The cached value of the '{@link #getPerformedBy() <em>Performed By</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerformedBy()
	 * @generated
	 * @ordered
	 */
	protected EList<HumanActor> performedBy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ChooseeditorPackage.Literals.ROLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HumanActor> getPerformedBy() {
		if (performedBy == null) {
			performedBy = new EObjectWithInverseResolvingEList.ManyInverse<HumanActor>(HumanActor.class, this, ChooseeditorPackage.ROLE__PERFORMED_BY, ChooseeditorPackage.HUMAN_ACTOR__PERFORMS);
		}
		return performedBy;
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
			case ChooseeditorPackage.ROLE__PERFORMED_BY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPerformedBy()).basicAdd(otherEnd, msgs);
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
			case ChooseeditorPackage.ROLE__PERFORMED_BY:
				return ((InternalEList<?>)getPerformedBy()).basicRemove(otherEnd, msgs);
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
			case ChooseeditorPackage.ROLE__PERFORMED_BY:
				return getPerformedBy();
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
			case ChooseeditorPackage.ROLE__PERFORMED_BY:
				getPerformedBy().clear();
				getPerformedBy().addAll((Collection<? extends HumanActor>)newValue);
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
			case ChooseeditorPackage.ROLE__PERFORMED_BY:
				getPerformedBy().clear();
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
			case ChooseeditorPackage.ROLE__PERFORMED_BY:
				return performedBy != null && !performedBy.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RoleImpl
