/**
 */
package chooseeditor.impl;

import chooseeditor.Actor;
import chooseeditor.ActorContainer;
import chooseeditor.ChooseeditorFactory;
import chooseeditor.ChooseeditorPackage;
import chooseeditor.Device;
import chooseeditor.Diagram;
import chooseeditor.Goal;
import chooseeditor.HumanActor;
import chooseeditor.Operation;
import chooseeditor.OperationContainer;
import chooseeditor.Project;
import chooseeditor.Refinement;
import chooseeditor.Role;
import chooseeditor.SoftwareActor;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ChooseeditorFactoryImpl extends EFactoryImpl implements ChooseeditorFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ChooseeditorFactory init() {
		try {
			ChooseeditorFactory theChooseeditorFactory = (ChooseeditorFactory)EPackage.Registry.INSTANCE.getEFactory("http://chooseeditor/1.0"); 
			if (theChooseeditorFactory != null) {
				return theChooseeditorFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ChooseeditorFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChooseeditorFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ChooseeditorPackage.DIAGRAM: return createDiagram();
			case ChooseeditorPackage.GOAL: return createGoal();
			case ChooseeditorPackage.REFINEMENT: return createRefinement();
			case ChooseeditorPackage.ACTOR_CONTAINER: return createActorContainer();
			case ChooseeditorPackage.OPERATION_CONTAINER: return createOperationContainer();
			case ChooseeditorPackage.OBJECT: return createObject();
			case ChooseeditorPackage.ACTOR: return createActor();
			case ChooseeditorPackage.HUMAN_ACTOR: return createHumanActor();
			case ChooseeditorPackage.ROLE: return createRole();
			case ChooseeditorPackage.DEVICE: return createDevice();
			case ChooseeditorPackage.SOFTWARE_ACTOR: return createSoftwareActor();
			case ChooseeditorPackage.OPERATION: return createOperation();
			case ChooseeditorPackage.PROCESS: return createProcess();
			case ChooseeditorPackage.PROJECT: return createProject();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Diagram createDiagram() {
		DiagramImpl diagram = new DiagramImpl();
		return diagram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Goal createGoal() {
		GoalImpl goal = new GoalImpl();
		return goal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Refinement createRefinement() {
		RefinementImpl refinement = new RefinementImpl();
		return refinement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActorContainer createActorContainer() {
		ActorContainerImpl actorContainer = new ActorContainerImpl();
		return actorContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationContainer createOperationContainer() {
		OperationContainerImpl operationContainer = new OperationContainerImpl();
		return operationContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public chooseeditor.Object createObject() {
		ObjectImpl object = new ObjectImpl();
		return object;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Actor createActor() {
		ActorImpl actor = new ActorImpl();
		return actor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HumanActor createHumanActor() {
		HumanActorImpl humanActor = new HumanActorImpl();
		return humanActor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role createRole() {
		RoleImpl role = new RoleImpl();
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Device createDevice() {
		DeviceImpl device = new DeviceImpl();
		return device;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SoftwareActor createSoftwareActor() {
		SoftwareActorImpl softwareActor = new SoftwareActorImpl();
		return softwareActor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation createOperation() {
		OperationImpl operation = new OperationImpl();
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public chooseeditor.Process createProcess() {
		ProcessImpl process = new ProcessImpl();
		return process;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Project createProject() {
		ProjectImpl project = new ProjectImpl();
		return project;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChooseeditorPackage getChooseeditorPackage() {
		return (ChooseeditorPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ChooseeditorPackage getPackage() {
		return ChooseeditorPackage.eINSTANCE;
	}

} //ChooseeditorFactoryImpl
