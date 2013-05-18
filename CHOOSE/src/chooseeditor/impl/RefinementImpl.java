/**
 */
package chooseeditor.impl;

import chooseeditor.ChooseeditorPackage;
import chooseeditor.Goal;
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
 * An implementation of the model object '<em><b>Refinement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link chooseeditor.impl.RefinementImpl#getSupergoal <em>Supergoal</em>}</li>
 *   <li>{@link chooseeditor.impl.RefinementImpl#getSubgoals <em>Subgoals</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RefinementImpl extends EObjectImpl implements Refinement {
	/**
	 * The cached value of the '{@link #getSupergoal() <em>Supergoal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupergoal()
	 * @generated
	 * @ordered
	 */
	protected Goal supergoal;

	/**
	 * The cached value of the '{@link #getSubgoals() <em>Subgoals</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubgoals()
	 * @generated
	 * @ordered
	 */
	protected EList<Goal> subgoals;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RefinementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ChooseeditorPackage.Literals.REFINEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Goal getSupergoal() {
		if (supergoal != null && supergoal.eIsProxy()) {
			InternalEObject oldSupergoal = (InternalEObject)supergoal;
			supergoal = (Goal)eResolveProxy(oldSupergoal);
			if (supergoal != oldSupergoal) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ChooseeditorPackage.REFINEMENT__SUPERGOAL, oldSupergoal, supergoal));
			}
		}
		return supergoal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Goal basicGetSupergoal() {
		return supergoal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSupergoal(Goal newSupergoal, NotificationChain msgs) {
		Goal oldSupergoal = supergoal;
		supergoal = newSupergoal;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ChooseeditorPackage.REFINEMENT__SUPERGOAL, oldSupergoal, newSupergoal);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSupergoal(Goal newSupergoal) {
		if (newSupergoal != supergoal) {
			NotificationChain msgs = null;
			if (supergoal != null)
				msgs = ((InternalEObject)supergoal).eInverseRemove(this, ChooseeditorPackage.GOAL__OR, Goal.class, msgs);
			if (newSupergoal != null)
				msgs = ((InternalEObject)newSupergoal).eInverseAdd(this, ChooseeditorPackage.GOAL__OR, Goal.class, msgs);
			msgs = basicSetSupergoal(newSupergoal, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChooseeditorPackage.REFINEMENT__SUPERGOAL, newSupergoal, newSupergoal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Goal> getSubgoals() {
		if (subgoals == null) {
			subgoals = new EObjectWithInverseResolvingEList.ManyInverse<Goal>(Goal.class, this, ChooseeditorPackage.REFINEMENT__SUBGOALS, ChooseeditorPackage.GOAL__AND);
		}
		return subgoals;
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
			case ChooseeditorPackage.REFINEMENT__SUPERGOAL:
				if (supergoal != null)
					msgs = ((InternalEObject)supergoal).eInverseRemove(this, ChooseeditorPackage.GOAL__OR, Goal.class, msgs);
				return basicSetSupergoal((Goal)otherEnd, msgs);
			case ChooseeditorPackage.REFINEMENT__SUBGOALS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSubgoals()).basicAdd(otherEnd, msgs);
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
			case ChooseeditorPackage.REFINEMENT__SUPERGOAL:
				return basicSetSupergoal(null, msgs);
			case ChooseeditorPackage.REFINEMENT__SUBGOALS:
				return ((InternalEList<?>)getSubgoals()).basicRemove(otherEnd, msgs);
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
			case ChooseeditorPackage.REFINEMENT__SUPERGOAL:
				if (resolve) return getSupergoal();
				return basicGetSupergoal();
			case ChooseeditorPackage.REFINEMENT__SUBGOALS:
				return getSubgoals();
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
			case ChooseeditorPackage.REFINEMENT__SUPERGOAL:
				setSupergoal((Goal)newValue);
				return;
			case ChooseeditorPackage.REFINEMENT__SUBGOALS:
				getSubgoals().clear();
				getSubgoals().addAll((Collection<? extends Goal>)newValue);
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
			case ChooseeditorPackage.REFINEMENT__SUPERGOAL:
				setSupergoal((Goal)null);
				return;
			case ChooseeditorPackage.REFINEMENT__SUBGOALS:
				getSubgoals().clear();
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
			case ChooseeditorPackage.REFINEMENT__SUPERGOAL:
				return supergoal != null;
			case ChooseeditorPackage.REFINEMENT__SUBGOALS:
				return subgoals != null && !subgoals.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RefinementImpl
