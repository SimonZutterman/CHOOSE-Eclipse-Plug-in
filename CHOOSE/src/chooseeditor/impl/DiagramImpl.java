/**
 */
package chooseeditor.impl;

import chooseeditor.ActorContainer;
import chooseeditor.ChooseeditorPackage;
import chooseeditor.Diagram;
import chooseeditor.Goal;
import chooseeditor.OperationContainer;
import chooseeditor.Refinement;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Diagram</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link chooseeditor.impl.DiagramImpl#getGoals <em>Goals</em>}</li>
 *   <li>{@link chooseeditor.impl.DiagramImpl#getRefinements <em>Refinements</em>}</li>
 *   <li>{@link chooseeditor.impl.DiagramImpl#getActors <em>Actors</em>}</li>
 *   <li>{@link chooseeditor.impl.DiagramImpl#getObjects <em>Objects</em>}</li>
 *   <li>{@link chooseeditor.impl.DiagramImpl#getOperations <em>Operations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DiagramImpl extends EObjectImpl implements Diagram {
	/**
	 * The cached value of the '{@link #getGoals() <em>Goals</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGoals()
	 * @generated
	 * @ordered
	 */
	protected EList<Goal> goals;

	/**
	 * The cached value of the '{@link #getRefinements() <em>Refinements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefinements()
	 * @generated
	 * @ordered
	 */
	protected EList<Refinement> refinements;

	/**
	 * The cached value of the '{@link #getActors() <em>Actors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActors()
	 * @generated
	 * @ordered
	 */
	protected EList<ActorContainer> actors;

	/**
	 * The cached value of the '{@link #getObjects() <em>Objects</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjects()
	 * @generated
	 * @ordered
	 */
	protected EList<chooseeditor.Object> objects;

	/**
	 * The cached value of the '{@link #getOperations() <em>Operations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperations()
	 * @generated
	 * @ordered
	 */
	protected EList<OperationContainer> operations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiagramImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ChooseeditorPackage.Literals.DIAGRAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Goal> getGoals() {
		if (goals == null) {
			goals = new EObjectContainmentEList<Goal>(Goal.class, this, ChooseeditorPackage.DIAGRAM__GOALS);
		}
		return goals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Refinement> getRefinements() {
		if (refinements == null) {
			refinements = new EObjectContainmentEList<Refinement>(Refinement.class, this, ChooseeditorPackage.DIAGRAM__REFINEMENTS);
		}
		return refinements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActorContainer> getActors() {
		if (actors == null) {
			actors = new EObjectContainmentEList<ActorContainer>(ActorContainer.class, this, ChooseeditorPackage.DIAGRAM__ACTORS);
		}
		return actors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<chooseeditor.Object> getObjects() {
		if (objects == null) {
			objects = new EObjectContainmentEList<chooseeditor.Object>(chooseeditor.Object.class, this, ChooseeditorPackage.DIAGRAM__OBJECTS);
		}
		return objects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OperationContainer> getOperations() {
		if (operations == null) {
			operations = new EObjectContainmentEList<OperationContainer>(OperationContainer.class, this, ChooseeditorPackage.DIAGRAM__OPERATIONS);
		}
		return operations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ChooseeditorPackage.DIAGRAM__GOALS:
				return ((InternalEList<?>)getGoals()).basicRemove(otherEnd, msgs);
			case ChooseeditorPackage.DIAGRAM__REFINEMENTS:
				return ((InternalEList<?>)getRefinements()).basicRemove(otherEnd, msgs);
			case ChooseeditorPackage.DIAGRAM__ACTORS:
				return ((InternalEList<?>)getActors()).basicRemove(otherEnd, msgs);
			case ChooseeditorPackage.DIAGRAM__OBJECTS:
				return ((InternalEList<?>)getObjects()).basicRemove(otherEnd, msgs);
			case ChooseeditorPackage.DIAGRAM__OPERATIONS:
				return ((InternalEList<?>)getOperations()).basicRemove(otherEnd, msgs);
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
			case ChooseeditorPackage.DIAGRAM__GOALS:
				return getGoals();
			case ChooseeditorPackage.DIAGRAM__REFINEMENTS:
				return getRefinements();
			case ChooseeditorPackage.DIAGRAM__ACTORS:
				return getActors();
			case ChooseeditorPackage.DIAGRAM__OBJECTS:
				return getObjects();
			case ChooseeditorPackage.DIAGRAM__OPERATIONS:
				return getOperations();
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
			case ChooseeditorPackage.DIAGRAM__GOALS:
				getGoals().clear();
				getGoals().addAll((Collection<? extends Goal>)newValue);
				return;
			case ChooseeditorPackage.DIAGRAM__REFINEMENTS:
				getRefinements().clear();
				getRefinements().addAll((Collection<? extends Refinement>)newValue);
				return;
			case ChooseeditorPackage.DIAGRAM__ACTORS:
				getActors().clear();
				getActors().addAll((Collection<? extends ActorContainer>)newValue);
				return;
			case ChooseeditorPackage.DIAGRAM__OBJECTS:
				getObjects().clear();
				getObjects().addAll((Collection<? extends chooseeditor.Object>)newValue);
				return;
			case ChooseeditorPackage.DIAGRAM__OPERATIONS:
				getOperations().clear();
				getOperations().addAll((Collection<? extends OperationContainer>)newValue);
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
			case ChooseeditorPackage.DIAGRAM__GOALS:
				getGoals().clear();
				return;
			case ChooseeditorPackage.DIAGRAM__REFINEMENTS:
				getRefinements().clear();
				return;
			case ChooseeditorPackage.DIAGRAM__ACTORS:
				getActors().clear();
				return;
			case ChooseeditorPackage.DIAGRAM__OBJECTS:
				getObjects().clear();
				return;
			case ChooseeditorPackage.DIAGRAM__OPERATIONS:
				getOperations().clear();
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
			case ChooseeditorPackage.DIAGRAM__GOALS:
				return goals != null && !goals.isEmpty();
			case ChooseeditorPackage.DIAGRAM__REFINEMENTS:
				return refinements != null && !refinements.isEmpty();
			case ChooseeditorPackage.DIAGRAM__ACTORS:
				return actors != null && !actors.isEmpty();
			case ChooseeditorPackage.DIAGRAM__OBJECTS:
				return objects != null && !objects.isEmpty();
			case ChooseeditorPackage.DIAGRAM__OPERATIONS:
				return operations != null && !operations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DiagramImpl
