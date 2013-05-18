/**
 */
package chooseeditor;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see chooseeditor.ChooseeditorFactory
 * @model kind="package"
 * @generated
 */
public interface ChooseeditorPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "chooseeditor";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://chooseeditor/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "chooseeditor";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ChooseeditorPackage eINSTANCE = chooseeditor.impl.ChooseeditorPackageImpl.init();

	/**
	 * The meta object id for the '{@link chooseeditor.impl.DiagramImpl <em>Diagram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see chooseeditor.impl.DiagramImpl
	 * @see chooseeditor.impl.ChooseeditorPackageImpl#getDiagram()
	 * @generated
	 */
	int DIAGRAM = 0;

	/**
	 * The feature id for the '<em><b>Goals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__GOALS = 0;

	/**
	 * The feature id for the '<em><b>Refinements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__REFINEMENTS = 1;

	/**
	 * The feature id for the '<em><b>Actors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__ACTORS = 2;

	/**
	 * The feature id for the '<em><b>Objects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__OBJECTS = 3;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__OPERATIONS = 4;

	/**
	 * The number of structural features of the '<em>Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link chooseeditor.impl.GoalImpl <em>Goal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see chooseeditor.impl.GoalImpl
	 * @see chooseeditor.impl.ChooseeditorPackageImpl#getGoal()
	 * @generated
	 */
	int GOAL = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Conflicts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__CONFLICTS = 2;

	/**
	 * The feature id for the '<em><b>Conflicted</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__CONFLICTED = 3;

	/**
	 * The feature id for the '<em><b>Assigned To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__ASSIGNED_TO = 4;

	/**
	 * The feature id for the '<em><b>Wished By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__WISHED_BY = 5;

	/**
	 * The feature id for the '<em><b>Operationalized By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__OPERATIONALIZED_BY = 6;

	/**
	 * The feature id for the '<em><b>Concerns Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__CONCERNS_OBJECTS = 7;

	/**
	 * The feature id for the '<em><b>Or</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__OR = 8;

	/**
	 * The feature id for the '<em><b>And</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__AND = 9;

	/**
	 * The number of structural features of the '<em>Goal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_FEATURE_COUNT = 10;

	/**
	 * The meta object id for the '{@link chooseeditor.impl.RefinementImpl <em>Refinement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see chooseeditor.impl.RefinementImpl
	 * @see chooseeditor.impl.ChooseeditorPackageImpl#getRefinement()
	 * @generated
	 */
	int REFINEMENT = 2;

	/**
	 * The feature id for the '<em><b>Supergoal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINEMENT__SUPERGOAL = 0;

	/**
	 * The feature id for the '<em><b>Subgoals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINEMENT__SUBGOALS = 1;

	/**
	 * The number of structural features of the '<em>Refinement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINEMENT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link chooseeditor.impl.ActorContainerImpl <em>Actor Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see chooseeditor.impl.ActorContainerImpl
	 * @see chooseeditor.impl.ChooseeditorPackageImpl#getActorContainer()
	 * @generated
	 */
	int ACTOR_CONTAINER = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_CONTAINER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_CONTAINER__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Assignments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_CONTAINER__ASSIGNMENTS = 2;

	/**
	 * The feature id for the '<em><b>Wishes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_CONTAINER__WISHES = 3;

	/**
	 * The feature id for the '<em><b>Includes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_CONTAINER__INCLUDES = 4;

	/**
	 * The feature id for the '<em><b>Part Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_CONTAINER__PART_OF = 5;

	/**
	 * The feature id for the '<em><b>Responsible For</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_CONTAINER__RESPONSIBLE_FOR = 6;

	/**
	 * The feature id for the '<em><b>Accountable For</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_CONTAINER__ACCOUNTABLE_FOR = 7;

	/**
	 * The feature id for the '<em><b>Consulted For</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_CONTAINER__CONSULTED_FOR = 8;

	/**
	 * The feature id for the '<em><b>Informed For</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_CONTAINER__INFORMED_FOR = 9;

	/**
	 * The feature id for the '<em><b>Controls</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_CONTAINER__CONTROLS = 10;

	/**
	 * The feature id for the '<em><b>Monitors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_CONTAINER__MONITORS = 11;

	/**
	 * The number of structural features of the '<em>Actor Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_CONTAINER_FEATURE_COUNT = 12;

	/**
	 * The meta object id for the '{@link chooseeditor.impl.OperationContainerImpl <em>Operation Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see chooseeditor.impl.OperationContainerImpl
	 * @see chooseeditor.impl.ChooseeditorPackageImpl#getOperationContainer()
	 * @generated
	 */
	int OPERATION_CONTAINER = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CONTAINER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CONTAINER__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Operationalizes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CONTAINER__OPERATIONALIZES = 2;

	/**
	 * The feature id for the '<em><b>Responsible</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CONTAINER__RESPONSIBLE = 3;

	/**
	 * The feature id for the '<em><b>Accountable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CONTAINER__ACCOUNTABLE = 4;

	/**
	 * The feature id for the '<em><b>Consult</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CONTAINER__CONSULT = 5;

	/**
	 * The feature id for the '<em><b>Inform</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CONTAINER__INFORM = 6;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CONTAINER__INPUT = 7;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CONTAINER__OUTPUT = 8;

	/**
	 * The feature id for the '<em><b>Part Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CONTAINER__PART_OF = 9;

	/**
	 * The feature id for the '<em><b>Includes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CONTAINER__INCLUDES = 10;

	/**
	 * The number of structural features of the '<em>Operation Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CONTAINER_FEATURE_COUNT = 11;

	/**
	 * The meta object id for the '{@link chooseeditor.impl.ObjectImpl <em>Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see chooseeditor.impl.ObjectImpl
	 * @see chooseeditor.impl.ChooseeditorPackageImpl#getObject()
	 * @generated
	 */
	int OBJECT = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Concerns Goals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__CONCERNS_GOALS = 2;

	/**
	 * The feature id for the '<em><b>Controlled By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__CONTROLLED_BY = 3;

	/**
	 * The feature id for the '<em><b>Monitored By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__MONITORED_BY = 4;

	/**
	 * The feature id for the '<em><b>Input For</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__INPUT_FOR = 5;

	/**
	 * The feature id for the '<em><b>Output Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__OUTPUT_OF = 6;

	/**
	 * The feature id for the '<em><b>Associates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__ASSOCIATES = 7;

	/**
	 * The feature id for the '<em><b>Associated</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__ASSOCIATED = 8;

	/**
	 * The feature id for the '<em><b>Specialization</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__SPECIALIZATION = 9;

	/**
	 * The feature id for the '<em><b>Specialized By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__SPECIALIZED_BY = 10;

	/**
	 * The feature id for the '<em><b>Includes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__INCLUDES = 11;

	/**
	 * The feature id for the '<em><b>Part Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__PART_OF = 12;

	/**
	 * The number of structural features of the '<em>Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_FEATURE_COUNT = 13;

	/**
	 * The meta object id for the '{@link chooseeditor.impl.ActorImpl <em>Actor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see chooseeditor.impl.ActorImpl
	 * @see chooseeditor.impl.ChooseeditorPackageImpl#getActor()
	 * @generated
	 */
	int ACTOR = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__NAME = ACTOR_CONTAINER__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__DESCRIPTION = ACTOR_CONTAINER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Assignments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__ASSIGNMENTS = ACTOR_CONTAINER__ASSIGNMENTS;

	/**
	 * The feature id for the '<em><b>Wishes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__WISHES = ACTOR_CONTAINER__WISHES;

	/**
	 * The feature id for the '<em><b>Includes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__INCLUDES = ACTOR_CONTAINER__INCLUDES;

	/**
	 * The feature id for the '<em><b>Part Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__PART_OF = ACTOR_CONTAINER__PART_OF;

	/**
	 * The feature id for the '<em><b>Responsible For</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__RESPONSIBLE_FOR = ACTOR_CONTAINER__RESPONSIBLE_FOR;

	/**
	 * The feature id for the '<em><b>Accountable For</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__ACCOUNTABLE_FOR = ACTOR_CONTAINER__ACCOUNTABLE_FOR;

	/**
	 * The feature id for the '<em><b>Consulted For</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__CONSULTED_FOR = ACTOR_CONTAINER__CONSULTED_FOR;

	/**
	 * The feature id for the '<em><b>Informed For</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__INFORMED_FOR = ACTOR_CONTAINER__INFORMED_FOR;

	/**
	 * The feature id for the '<em><b>Controls</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__CONTROLS = ACTOR_CONTAINER__CONTROLS;

	/**
	 * The feature id for the '<em><b>Monitors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__MONITORS = ACTOR_CONTAINER__MONITORS;

	/**
	 * The number of structural features of the '<em>Actor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_FEATURE_COUNT = ACTOR_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link chooseeditor.impl.HumanActorImpl <em>Human Actor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see chooseeditor.impl.HumanActorImpl
	 * @see chooseeditor.impl.ChooseeditorPackageImpl#getHumanActor()
	 * @generated
	 */
	int HUMAN_ACTOR = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUMAN_ACTOR__NAME = ACTOR_CONTAINER__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUMAN_ACTOR__DESCRIPTION = ACTOR_CONTAINER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Assignments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUMAN_ACTOR__ASSIGNMENTS = ACTOR_CONTAINER__ASSIGNMENTS;

	/**
	 * The feature id for the '<em><b>Wishes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUMAN_ACTOR__WISHES = ACTOR_CONTAINER__WISHES;

	/**
	 * The feature id for the '<em><b>Includes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUMAN_ACTOR__INCLUDES = ACTOR_CONTAINER__INCLUDES;

	/**
	 * The feature id for the '<em><b>Part Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUMAN_ACTOR__PART_OF = ACTOR_CONTAINER__PART_OF;

	/**
	 * The feature id for the '<em><b>Responsible For</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUMAN_ACTOR__RESPONSIBLE_FOR = ACTOR_CONTAINER__RESPONSIBLE_FOR;

	/**
	 * The feature id for the '<em><b>Accountable For</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUMAN_ACTOR__ACCOUNTABLE_FOR = ACTOR_CONTAINER__ACCOUNTABLE_FOR;

	/**
	 * The feature id for the '<em><b>Consulted For</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUMAN_ACTOR__CONSULTED_FOR = ACTOR_CONTAINER__CONSULTED_FOR;

	/**
	 * The feature id for the '<em><b>Informed For</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUMAN_ACTOR__INFORMED_FOR = ACTOR_CONTAINER__INFORMED_FOR;

	/**
	 * The feature id for the '<em><b>Controls</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUMAN_ACTOR__CONTROLS = ACTOR_CONTAINER__CONTROLS;

	/**
	 * The feature id for the '<em><b>Monitors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUMAN_ACTOR__MONITORS = ACTOR_CONTAINER__MONITORS;

	/**
	 * The feature id for the '<em><b>Supervisees</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUMAN_ACTOR__SUPERVISEES = ACTOR_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Supervisors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUMAN_ACTOR__SUPERVISORS = ACTOR_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Performs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUMAN_ACTOR__PERFORMS = ACTOR_CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Human Actor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUMAN_ACTOR_FEATURE_COUNT = ACTOR_CONTAINER_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link chooseeditor.impl.RoleImpl <em>Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see chooseeditor.impl.RoleImpl
	 * @see chooseeditor.impl.ChooseeditorPackageImpl#getRole()
	 * @generated
	 */
	int ROLE = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__NAME = ACTOR_CONTAINER__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__DESCRIPTION = ACTOR_CONTAINER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Assignments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__ASSIGNMENTS = ACTOR_CONTAINER__ASSIGNMENTS;

	/**
	 * The feature id for the '<em><b>Wishes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__WISHES = ACTOR_CONTAINER__WISHES;

	/**
	 * The feature id for the '<em><b>Includes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__INCLUDES = ACTOR_CONTAINER__INCLUDES;

	/**
	 * The feature id for the '<em><b>Part Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__PART_OF = ACTOR_CONTAINER__PART_OF;

	/**
	 * The feature id for the '<em><b>Responsible For</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__RESPONSIBLE_FOR = ACTOR_CONTAINER__RESPONSIBLE_FOR;

	/**
	 * The feature id for the '<em><b>Accountable For</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__ACCOUNTABLE_FOR = ACTOR_CONTAINER__ACCOUNTABLE_FOR;

	/**
	 * The feature id for the '<em><b>Consulted For</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__CONSULTED_FOR = ACTOR_CONTAINER__CONSULTED_FOR;

	/**
	 * The feature id for the '<em><b>Informed For</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__INFORMED_FOR = ACTOR_CONTAINER__INFORMED_FOR;

	/**
	 * The feature id for the '<em><b>Controls</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__CONTROLS = ACTOR_CONTAINER__CONTROLS;

	/**
	 * The feature id for the '<em><b>Monitors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__MONITORS = ACTOR_CONTAINER__MONITORS;

	/**
	 * The feature id for the '<em><b>Performed By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__PERFORMED_BY = ACTOR_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FEATURE_COUNT = ACTOR_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link chooseeditor.impl.DeviceImpl <em>Device</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see chooseeditor.impl.DeviceImpl
	 * @see chooseeditor.impl.ChooseeditorPackageImpl#getDevice()
	 * @generated
	 */
	int DEVICE = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__NAME = ACTOR_CONTAINER__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__DESCRIPTION = ACTOR_CONTAINER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Assignments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__ASSIGNMENTS = ACTOR_CONTAINER__ASSIGNMENTS;

	/**
	 * The feature id for the '<em><b>Wishes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__WISHES = ACTOR_CONTAINER__WISHES;

	/**
	 * The feature id for the '<em><b>Includes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__INCLUDES = ACTOR_CONTAINER__INCLUDES;

	/**
	 * The feature id for the '<em><b>Part Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__PART_OF = ACTOR_CONTAINER__PART_OF;

	/**
	 * The feature id for the '<em><b>Responsible For</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__RESPONSIBLE_FOR = ACTOR_CONTAINER__RESPONSIBLE_FOR;

	/**
	 * The feature id for the '<em><b>Accountable For</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__ACCOUNTABLE_FOR = ACTOR_CONTAINER__ACCOUNTABLE_FOR;

	/**
	 * The feature id for the '<em><b>Consulted For</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__CONSULTED_FOR = ACTOR_CONTAINER__CONSULTED_FOR;

	/**
	 * The feature id for the '<em><b>Informed For</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__INFORMED_FOR = ACTOR_CONTAINER__INFORMED_FOR;

	/**
	 * The feature id for the '<em><b>Controls</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__CONTROLS = ACTOR_CONTAINER__CONTROLS;

	/**
	 * The feature id for the '<em><b>Monitors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__MONITORS = ACTOR_CONTAINER__MONITORS;

	/**
	 * The number of structural features of the '<em>Device</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_FEATURE_COUNT = ACTOR_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link chooseeditor.impl.SoftwareActorImpl <em>Software Actor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see chooseeditor.impl.SoftwareActorImpl
	 * @see chooseeditor.impl.ChooseeditorPackageImpl#getSoftwareActor()
	 * @generated
	 */
	int SOFTWARE_ACTOR = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_ACTOR__NAME = ACTOR_CONTAINER__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_ACTOR__DESCRIPTION = ACTOR_CONTAINER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Assignments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_ACTOR__ASSIGNMENTS = ACTOR_CONTAINER__ASSIGNMENTS;

	/**
	 * The feature id for the '<em><b>Wishes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_ACTOR__WISHES = ACTOR_CONTAINER__WISHES;

	/**
	 * The feature id for the '<em><b>Includes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_ACTOR__INCLUDES = ACTOR_CONTAINER__INCLUDES;

	/**
	 * The feature id for the '<em><b>Part Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_ACTOR__PART_OF = ACTOR_CONTAINER__PART_OF;

	/**
	 * The feature id for the '<em><b>Responsible For</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_ACTOR__RESPONSIBLE_FOR = ACTOR_CONTAINER__RESPONSIBLE_FOR;

	/**
	 * The feature id for the '<em><b>Accountable For</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_ACTOR__ACCOUNTABLE_FOR = ACTOR_CONTAINER__ACCOUNTABLE_FOR;

	/**
	 * The feature id for the '<em><b>Consulted For</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_ACTOR__CONSULTED_FOR = ACTOR_CONTAINER__CONSULTED_FOR;

	/**
	 * The feature id for the '<em><b>Informed For</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_ACTOR__INFORMED_FOR = ACTOR_CONTAINER__INFORMED_FOR;

	/**
	 * The feature id for the '<em><b>Controls</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_ACTOR__CONTROLS = ACTOR_CONTAINER__CONTROLS;

	/**
	 * The feature id for the '<em><b>Monitors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_ACTOR__MONITORS = ACTOR_CONTAINER__MONITORS;

	/**
	 * The number of structural features of the '<em>Software Actor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_ACTOR_FEATURE_COUNT = ACTOR_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link chooseeditor.impl.OperationImpl <em>Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see chooseeditor.impl.OperationImpl
	 * @see chooseeditor.impl.ChooseeditorPackageImpl#getOperation()
	 * @generated
	 */
	int OPERATION = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__NAME = OPERATION_CONTAINER__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__DESCRIPTION = OPERATION_CONTAINER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Operationalizes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__OPERATIONALIZES = OPERATION_CONTAINER__OPERATIONALIZES;

	/**
	 * The feature id for the '<em><b>Responsible</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__RESPONSIBLE = OPERATION_CONTAINER__RESPONSIBLE;

	/**
	 * The feature id for the '<em><b>Accountable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__ACCOUNTABLE = OPERATION_CONTAINER__ACCOUNTABLE;

	/**
	 * The feature id for the '<em><b>Consult</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__CONSULT = OPERATION_CONTAINER__CONSULT;

	/**
	 * The feature id for the '<em><b>Inform</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__INFORM = OPERATION_CONTAINER__INFORM;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__INPUT = OPERATION_CONTAINER__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__OUTPUT = OPERATION_CONTAINER__OUTPUT;

	/**
	 * The feature id for the '<em><b>Part Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__PART_OF = OPERATION_CONTAINER__PART_OF;

	/**
	 * The feature id for the '<em><b>Includes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__INCLUDES = OPERATION_CONTAINER__INCLUDES;

	/**
	 * The number of structural features of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_FEATURE_COUNT = OPERATION_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link chooseeditor.impl.ProcessImpl <em>Process</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see chooseeditor.impl.ProcessImpl
	 * @see chooseeditor.impl.ChooseeditorPackageImpl#getProcess()
	 * @generated
	 */
	int PROCESS = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__NAME = OPERATION_CONTAINER__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__DESCRIPTION = OPERATION_CONTAINER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Operationalizes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__OPERATIONALIZES = OPERATION_CONTAINER__OPERATIONALIZES;

	/**
	 * The feature id for the '<em><b>Responsible</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__RESPONSIBLE = OPERATION_CONTAINER__RESPONSIBLE;

	/**
	 * The feature id for the '<em><b>Accountable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__ACCOUNTABLE = OPERATION_CONTAINER__ACCOUNTABLE;

	/**
	 * The feature id for the '<em><b>Consult</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__CONSULT = OPERATION_CONTAINER__CONSULT;

	/**
	 * The feature id for the '<em><b>Inform</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__INFORM = OPERATION_CONTAINER__INFORM;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__INPUT = OPERATION_CONTAINER__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__OUTPUT = OPERATION_CONTAINER__OUTPUT;

	/**
	 * The feature id for the '<em><b>Part Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__PART_OF = OPERATION_CONTAINER__PART_OF;

	/**
	 * The feature id for the '<em><b>Includes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__INCLUDES = OPERATION_CONTAINER__INCLUDES;

	/**
	 * The number of structural features of the '<em>Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_FEATURE_COUNT = OPERATION_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link chooseeditor.impl.ProjectImpl <em>Project</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see chooseeditor.impl.ProjectImpl
	 * @see chooseeditor.impl.ChooseeditorPackageImpl#getProject()
	 * @generated
	 */
	int PROJECT = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__NAME = OPERATION_CONTAINER__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__DESCRIPTION = OPERATION_CONTAINER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Operationalizes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__OPERATIONALIZES = OPERATION_CONTAINER__OPERATIONALIZES;

	/**
	 * The feature id for the '<em><b>Responsible</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__RESPONSIBLE = OPERATION_CONTAINER__RESPONSIBLE;

	/**
	 * The feature id for the '<em><b>Accountable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__ACCOUNTABLE = OPERATION_CONTAINER__ACCOUNTABLE;

	/**
	 * The feature id for the '<em><b>Consult</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__CONSULT = OPERATION_CONTAINER__CONSULT;

	/**
	 * The feature id for the '<em><b>Inform</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__INFORM = OPERATION_CONTAINER__INFORM;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__INPUT = OPERATION_CONTAINER__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__OUTPUT = OPERATION_CONTAINER__OUTPUT;

	/**
	 * The feature id for the '<em><b>Part Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__PART_OF = OPERATION_CONTAINER__PART_OF;

	/**
	 * The feature id for the '<em><b>Includes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__INCLUDES = OPERATION_CONTAINER__INCLUDES;

	/**
	 * The number of structural features of the '<em>Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_FEATURE_COUNT = OPERATION_CONTAINER_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link chooseeditor.Diagram <em>Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diagram</em>'.
	 * @see chooseeditor.Diagram
	 * @generated
	 */
	EClass getDiagram();

	/**
	 * Returns the meta object for the containment reference list '{@link chooseeditor.Diagram#getGoals <em>Goals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Goals</em>'.
	 * @see chooseeditor.Diagram#getGoals()
	 * @see #getDiagram()
	 * @generated
	 */
	EReference getDiagram_Goals();

	/**
	 * Returns the meta object for the containment reference list '{@link chooseeditor.Diagram#getRefinements <em>Refinements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Refinements</em>'.
	 * @see chooseeditor.Diagram#getRefinements()
	 * @see #getDiagram()
	 * @generated
	 */
	EReference getDiagram_Refinements();

	/**
	 * Returns the meta object for the containment reference list '{@link chooseeditor.Diagram#getActors <em>Actors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actors</em>'.
	 * @see chooseeditor.Diagram#getActors()
	 * @see #getDiagram()
	 * @generated
	 */
	EReference getDiagram_Actors();

	/**
	 * Returns the meta object for the containment reference list '{@link chooseeditor.Diagram#getObjects <em>Objects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Objects</em>'.
	 * @see chooseeditor.Diagram#getObjects()
	 * @see #getDiagram()
	 * @generated
	 */
	EReference getDiagram_Objects();

	/**
	 * Returns the meta object for the containment reference list '{@link chooseeditor.Diagram#getOperations <em>Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operations</em>'.
	 * @see chooseeditor.Diagram#getOperations()
	 * @see #getDiagram()
	 * @generated
	 */
	EReference getDiagram_Operations();

	/**
	 * Returns the meta object for class '{@link chooseeditor.Goal <em>Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Goal</em>'.
	 * @see chooseeditor.Goal
	 * @generated
	 */
	EClass getGoal();

	/**
	 * Returns the meta object for the attribute '{@link chooseeditor.Goal#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see chooseeditor.Goal#getName()
	 * @see #getGoal()
	 * @generated
	 */
	EAttribute getGoal_Name();

	/**
	 * Returns the meta object for the attribute '{@link chooseeditor.Goal#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see chooseeditor.Goal#getDescription()
	 * @see #getGoal()
	 * @generated
	 */
	EAttribute getGoal_Description();

	/**
	 * Returns the meta object for the reference list '{@link chooseeditor.Goal#getConflicts <em>Conflicts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Conflicts</em>'.
	 * @see chooseeditor.Goal#getConflicts()
	 * @see #getGoal()
	 * @generated
	 */
	EReference getGoal_Conflicts();

	/**
	 * Returns the meta object for the reference list '{@link chooseeditor.Goal#getConflicted <em>Conflicted</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Conflicted</em>'.
	 * @see chooseeditor.Goal#getConflicted()
	 * @see #getGoal()
	 * @generated
	 */
	EReference getGoal_Conflicted();

	/**
	 * Returns the meta object for the reference list '{@link chooseeditor.Goal#getAssignedTo <em>Assigned To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Assigned To</em>'.
	 * @see chooseeditor.Goal#getAssignedTo()
	 * @see #getGoal()
	 * @generated
	 */
	EReference getGoal_AssignedTo();

	/**
	 * Returns the meta object for the reference list '{@link chooseeditor.Goal#getWishedBy <em>Wished By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Wished By</em>'.
	 * @see chooseeditor.Goal#getWishedBy()
	 * @see #getGoal()
	 * @generated
	 */
	EReference getGoal_WishedBy();

	/**
	 * Returns the meta object for the reference list '{@link chooseeditor.Goal#getOperationalizedBy <em>Operationalized By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Operationalized By</em>'.
	 * @see chooseeditor.Goal#getOperationalizedBy()
	 * @see #getGoal()
	 * @generated
	 */
	EReference getGoal_OperationalizedBy();

	/**
	 * Returns the meta object for the reference list '{@link chooseeditor.Goal#getConcernsObjects <em>Concerns Objects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Concerns Objects</em>'.
	 * @see chooseeditor.Goal#getConcernsObjects()
	 * @see #getGoal()
	 * @generated
	 */
	EReference getGoal_ConcernsObjects();

	/**
	 * Returns the meta object for the reference list '{@link chooseeditor.Goal#getOr <em>Or</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Or</em>'.
	 * @see chooseeditor.Goal#getOr()
	 * @see #getGoal()
	 * @generated
	 */
	EReference getGoal_Or();

	/**
	 * Returns the meta object for the reference list '{@link chooseeditor.Goal#getAnd <em>And</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>And</em>'.
	 * @see chooseeditor.Goal#getAnd()
	 * @see #getGoal()
	 * @generated
	 */
	EReference getGoal_And();

	/**
	 * Returns the meta object for class '{@link chooseeditor.Refinement <em>Refinement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Refinement</em>'.
	 * @see chooseeditor.Refinement
	 * @generated
	 */
	EClass getRefinement();

	/**
	 * Returns the meta object for the reference '{@link chooseeditor.Refinement#getSupergoal <em>Supergoal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Supergoal</em>'.
	 * @see chooseeditor.Refinement#getSupergoal()
	 * @see #getRefinement()
	 * @generated
	 */
	EReference getRefinement_Supergoal();

	/**
	 * Returns the meta object for the reference list '{@link chooseeditor.Refinement#getSubgoals <em>Subgoals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Subgoals</em>'.
	 * @see chooseeditor.Refinement#getSubgoals()
	 * @see #getRefinement()
	 * @generated
	 */
	EReference getRefinement_Subgoals();

	/**
	 * Returns the meta object for class '{@link chooseeditor.ActorContainer <em>Actor Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actor Container</em>'.
	 * @see chooseeditor.ActorContainer
	 * @generated
	 */
	EClass getActorContainer();

	/**
	 * Returns the meta object for the attribute '{@link chooseeditor.ActorContainer#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see chooseeditor.ActorContainer#getName()
	 * @see #getActorContainer()
	 * @generated
	 */
	EAttribute getActorContainer_Name();

	/**
	 * Returns the meta object for the attribute '{@link chooseeditor.ActorContainer#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see chooseeditor.ActorContainer#getDescription()
	 * @see #getActorContainer()
	 * @generated
	 */
	EAttribute getActorContainer_Description();

	/**
	 * Returns the meta object for the reference list '{@link chooseeditor.ActorContainer#getAssignments <em>Assignments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Assignments</em>'.
	 * @see chooseeditor.ActorContainer#getAssignments()
	 * @see #getActorContainer()
	 * @generated
	 */
	EReference getActorContainer_Assignments();

	/**
	 * Returns the meta object for the reference list '{@link chooseeditor.ActorContainer#getWishes <em>Wishes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Wishes</em>'.
	 * @see chooseeditor.ActorContainer#getWishes()
	 * @see #getActorContainer()
	 * @generated
	 */
	EReference getActorContainer_Wishes();

	/**
	 * Returns the meta object for the reference list '{@link chooseeditor.ActorContainer#getIncludes <em>Includes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Includes</em>'.
	 * @see chooseeditor.ActorContainer#getIncludes()
	 * @see #getActorContainer()
	 * @generated
	 */
	EReference getActorContainer_Includes();

	/**
	 * Returns the meta object for the reference list '{@link chooseeditor.ActorContainer#getPartOf <em>Part Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Part Of</em>'.
	 * @see chooseeditor.ActorContainer#getPartOf()
	 * @see #getActorContainer()
	 * @generated
	 */
	EReference getActorContainer_PartOf();

	/**
	 * Returns the meta object for the reference list '{@link chooseeditor.ActorContainer#getResponsibleFor <em>Responsible For</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Responsible For</em>'.
	 * @see chooseeditor.ActorContainer#getResponsibleFor()
	 * @see #getActorContainer()
	 * @generated
	 */
	EReference getActorContainer_ResponsibleFor();

	/**
	 * Returns the meta object for the reference list '{@link chooseeditor.ActorContainer#getAccountableFor <em>Accountable For</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Accountable For</em>'.
	 * @see chooseeditor.ActorContainer#getAccountableFor()
	 * @see #getActorContainer()
	 * @generated
	 */
	EReference getActorContainer_AccountableFor();

	/**
	 * Returns the meta object for the reference list '{@link chooseeditor.ActorContainer#getConsultedFor <em>Consulted For</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Consulted For</em>'.
	 * @see chooseeditor.ActorContainer#getConsultedFor()
	 * @see #getActorContainer()
	 * @generated
	 */
	EReference getActorContainer_ConsultedFor();

	/**
	 * Returns the meta object for the reference list '{@link chooseeditor.ActorContainer#getInformedFor <em>Informed For</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Informed For</em>'.
	 * @see chooseeditor.ActorContainer#getInformedFor()
	 * @see #getActorContainer()
	 * @generated
	 */
	EReference getActorContainer_InformedFor();

	/**
	 * Returns the meta object for the reference list '{@link chooseeditor.ActorContainer#getControls <em>Controls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Controls</em>'.
	 * @see chooseeditor.ActorContainer#getControls()
	 * @see #getActorContainer()
	 * @generated
	 */
	EReference getActorContainer_Controls();

	/**
	 * Returns the meta object for the reference list '{@link chooseeditor.ActorContainer#getMonitors <em>Monitors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Monitors</em>'.
	 * @see chooseeditor.ActorContainer#getMonitors()
	 * @see #getActorContainer()
	 * @generated
	 */
	EReference getActorContainer_Monitors();

	/**
	 * Returns the meta object for class '{@link chooseeditor.OperationContainer <em>Operation Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation Container</em>'.
	 * @see chooseeditor.OperationContainer
	 * @generated
	 */
	EClass getOperationContainer();

	/**
	 * Returns the meta object for the attribute '{@link chooseeditor.OperationContainer#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see chooseeditor.OperationContainer#getName()
	 * @see #getOperationContainer()
	 * @generated
	 */
	EAttribute getOperationContainer_Name();

	/**
	 * Returns the meta object for the attribute '{@link chooseeditor.OperationContainer#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see chooseeditor.OperationContainer#getDescription()
	 * @see #getOperationContainer()
	 * @generated
	 */
	EAttribute getOperationContainer_Description();

	/**
	 * Returns the meta object for the reference list '{@link chooseeditor.OperationContainer#getOperationalizes <em>Operationalizes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Operationalizes</em>'.
	 * @see chooseeditor.OperationContainer#getOperationalizes()
	 * @see #getOperationContainer()
	 * @generated
	 */
	EReference getOperationContainer_Operationalizes();

	/**
	 * Returns the meta object for the reference list '{@link chooseeditor.OperationContainer#getResponsible <em>Responsible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Responsible</em>'.
	 * @see chooseeditor.OperationContainer#getResponsible()
	 * @see #getOperationContainer()
	 * @generated
	 */
	EReference getOperationContainer_Responsible();

	/**
	 * Returns the meta object for the reference '{@link chooseeditor.OperationContainer#getAccountable <em>Accountable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Accountable</em>'.
	 * @see chooseeditor.OperationContainer#getAccountable()
	 * @see #getOperationContainer()
	 * @generated
	 */
	EReference getOperationContainer_Accountable();

	/**
	 * Returns the meta object for the reference list '{@link chooseeditor.OperationContainer#getConsult <em>Consult</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Consult</em>'.
	 * @see chooseeditor.OperationContainer#getConsult()
	 * @see #getOperationContainer()
	 * @generated
	 */
	EReference getOperationContainer_Consult();

	/**
	 * Returns the meta object for the reference list '{@link chooseeditor.OperationContainer#getInform <em>Inform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Inform</em>'.
	 * @see chooseeditor.OperationContainer#getInform()
	 * @see #getOperationContainer()
	 * @generated
	 */
	EReference getOperationContainer_Inform();

	/**
	 * Returns the meta object for the reference list '{@link chooseeditor.OperationContainer#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Input</em>'.
	 * @see chooseeditor.OperationContainer#getInput()
	 * @see #getOperationContainer()
	 * @generated
	 */
	EReference getOperationContainer_Input();

	/**
	 * Returns the meta object for the reference list '{@link chooseeditor.OperationContainer#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Output</em>'.
	 * @see chooseeditor.OperationContainer#getOutput()
	 * @see #getOperationContainer()
	 * @generated
	 */
	EReference getOperationContainer_Output();

	/**
	 * Returns the meta object for the reference list '{@link chooseeditor.OperationContainer#getPartOf <em>Part Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Part Of</em>'.
	 * @see chooseeditor.OperationContainer#getPartOf()
	 * @see #getOperationContainer()
	 * @generated
	 */
	EReference getOperationContainer_PartOf();

	/**
	 * Returns the meta object for the reference list '{@link chooseeditor.OperationContainer#getIncludes <em>Includes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Includes</em>'.
	 * @see chooseeditor.OperationContainer#getIncludes()
	 * @see #getOperationContainer()
	 * @generated
	 */
	EReference getOperationContainer_Includes();

	/**
	 * Returns the meta object for class '{@link chooseeditor.Object <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object</em>'.
	 * @see chooseeditor.Object
	 * @generated
	 */
	EClass getObject();

	/**
	 * Returns the meta object for the attribute '{@link chooseeditor.Object#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see chooseeditor.Object#getName()
	 * @see #getObject()
	 * @generated
	 */
	EAttribute getObject_Name();

	/**
	 * Returns the meta object for the attribute '{@link chooseeditor.Object#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see chooseeditor.Object#getDescription()
	 * @see #getObject()
	 * @generated
	 */
	EAttribute getObject_Description();

	/**
	 * Returns the meta object for the reference list '{@link chooseeditor.Object#getConcernsGoals <em>Concerns Goals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Concerns Goals</em>'.
	 * @see chooseeditor.Object#getConcernsGoals()
	 * @see #getObject()
	 * @generated
	 */
	EReference getObject_ConcernsGoals();

	/**
	 * Returns the meta object for the reference list '{@link chooseeditor.Object#getControlledBy <em>Controlled By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Controlled By</em>'.
	 * @see chooseeditor.Object#getControlledBy()
	 * @see #getObject()
	 * @generated
	 */
	EReference getObject_ControlledBy();

	/**
	 * Returns the meta object for the reference list '{@link chooseeditor.Object#getMonitoredBy <em>Monitored By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Monitored By</em>'.
	 * @see chooseeditor.Object#getMonitoredBy()
	 * @see #getObject()
	 * @generated
	 */
	EReference getObject_MonitoredBy();

	/**
	 * Returns the meta object for the reference list '{@link chooseeditor.Object#getInputFor <em>Input For</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Input For</em>'.
	 * @see chooseeditor.Object#getInputFor()
	 * @see #getObject()
	 * @generated
	 */
	EReference getObject_InputFor();

	/**
	 * Returns the meta object for the reference list '{@link chooseeditor.Object#getOutputOf <em>Output Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Output Of</em>'.
	 * @see chooseeditor.Object#getOutputOf()
	 * @see #getObject()
	 * @generated
	 */
	EReference getObject_OutputOf();

	/**
	 * Returns the meta object for the reference list '{@link chooseeditor.Object#getAssociates <em>Associates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Associates</em>'.
	 * @see chooseeditor.Object#getAssociates()
	 * @see #getObject()
	 * @generated
	 */
	EReference getObject_Associates();

	/**
	 * Returns the meta object for the reference list '{@link chooseeditor.Object#getAssociated <em>Associated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Associated</em>'.
	 * @see chooseeditor.Object#getAssociated()
	 * @see #getObject()
	 * @generated
	 */
	EReference getObject_Associated();

	/**
	 * Returns the meta object for the reference list '{@link chooseeditor.Object#getSpecialization <em>Specialization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Specialization</em>'.
	 * @see chooseeditor.Object#getSpecialization()
	 * @see #getObject()
	 * @generated
	 */
	EReference getObject_Specialization();

	/**
	 * Returns the meta object for the reference list '{@link chooseeditor.Object#getSpecializedBy <em>Specialized By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Specialized By</em>'.
	 * @see chooseeditor.Object#getSpecializedBy()
	 * @see #getObject()
	 * @generated
	 */
	EReference getObject_SpecializedBy();

	/**
	 * Returns the meta object for the reference list '{@link chooseeditor.Object#getIncludes <em>Includes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Includes</em>'.
	 * @see chooseeditor.Object#getIncludes()
	 * @see #getObject()
	 * @generated
	 */
	EReference getObject_Includes();

	/**
	 * Returns the meta object for the reference list '{@link chooseeditor.Object#getPartOf <em>Part Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Part Of</em>'.
	 * @see chooseeditor.Object#getPartOf()
	 * @see #getObject()
	 * @generated
	 */
	EReference getObject_PartOf();

	/**
	 * Returns the meta object for class '{@link chooseeditor.Actor <em>Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actor</em>'.
	 * @see chooseeditor.Actor
	 * @generated
	 */
	EClass getActor();

	/**
	 * Returns the meta object for class '{@link chooseeditor.HumanActor <em>Human Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Human Actor</em>'.
	 * @see chooseeditor.HumanActor
	 * @generated
	 */
	EClass getHumanActor();

	/**
	 * Returns the meta object for the reference list '{@link chooseeditor.HumanActor#getSupervisees <em>Supervisees</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Supervisees</em>'.
	 * @see chooseeditor.HumanActor#getSupervisees()
	 * @see #getHumanActor()
	 * @generated
	 */
	EReference getHumanActor_Supervisees();

	/**
	 * Returns the meta object for the reference list '{@link chooseeditor.HumanActor#getSupervisors <em>Supervisors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Supervisors</em>'.
	 * @see chooseeditor.HumanActor#getSupervisors()
	 * @see #getHumanActor()
	 * @generated
	 */
	EReference getHumanActor_Supervisors();

	/**
	 * Returns the meta object for the reference list '{@link chooseeditor.HumanActor#getPerforms <em>Performs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Performs</em>'.
	 * @see chooseeditor.HumanActor#getPerforms()
	 * @see #getHumanActor()
	 * @generated
	 */
	EReference getHumanActor_Performs();

	/**
	 * Returns the meta object for class '{@link chooseeditor.Role <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role</em>'.
	 * @see chooseeditor.Role
	 * @generated
	 */
	EClass getRole();

	/**
	 * Returns the meta object for the reference list '{@link chooseeditor.Role#getPerformedBy <em>Performed By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Performed By</em>'.
	 * @see chooseeditor.Role#getPerformedBy()
	 * @see #getRole()
	 * @generated
	 */
	EReference getRole_PerformedBy();

	/**
	 * Returns the meta object for class '{@link chooseeditor.Device <em>Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Device</em>'.
	 * @see chooseeditor.Device
	 * @generated
	 */
	EClass getDevice();

	/**
	 * Returns the meta object for class '{@link chooseeditor.SoftwareActor <em>Software Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Software Actor</em>'.
	 * @see chooseeditor.SoftwareActor
	 * @generated
	 */
	EClass getSoftwareActor();

	/**
	 * Returns the meta object for class '{@link chooseeditor.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation</em>'.
	 * @see chooseeditor.Operation
	 * @generated
	 */
	EClass getOperation();

	/**
	 * Returns the meta object for class '{@link chooseeditor.Process <em>Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Process</em>'.
	 * @see chooseeditor.Process
	 * @generated
	 */
	EClass getProcess();

	/**
	 * Returns the meta object for class '{@link chooseeditor.Project <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Project</em>'.
	 * @see chooseeditor.Project
	 * @generated
	 */
	EClass getProject();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ChooseeditorFactory getChooseeditorFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link chooseeditor.impl.DiagramImpl <em>Diagram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see chooseeditor.impl.DiagramImpl
		 * @see chooseeditor.impl.ChooseeditorPackageImpl#getDiagram()
		 * @generated
		 */
		EClass DIAGRAM = eINSTANCE.getDiagram();

		/**
		 * The meta object literal for the '<em><b>Goals</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIAGRAM__GOALS = eINSTANCE.getDiagram_Goals();

		/**
		 * The meta object literal for the '<em><b>Refinements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIAGRAM__REFINEMENTS = eINSTANCE.getDiagram_Refinements();

		/**
		 * The meta object literal for the '<em><b>Actors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIAGRAM__ACTORS = eINSTANCE.getDiagram_Actors();

		/**
		 * The meta object literal for the '<em><b>Objects</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIAGRAM__OBJECTS = eINSTANCE.getDiagram_Objects();

		/**
		 * The meta object literal for the '<em><b>Operations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIAGRAM__OPERATIONS = eINSTANCE.getDiagram_Operations();

		/**
		 * The meta object literal for the '{@link chooseeditor.impl.GoalImpl <em>Goal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see chooseeditor.impl.GoalImpl
		 * @see chooseeditor.impl.ChooseeditorPackageImpl#getGoal()
		 * @generated
		 */
		EClass GOAL = eINSTANCE.getGoal();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GOAL__NAME = eINSTANCE.getGoal_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GOAL__DESCRIPTION = eINSTANCE.getGoal_Description();

		/**
		 * The meta object literal for the '<em><b>Conflicts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GOAL__CONFLICTS = eINSTANCE.getGoal_Conflicts();

		/**
		 * The meta object literal for the '<em><b>Conflicted</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GOAL__CONFLICTED = eINSTANCE.getGoal_Conflicted();

		/**
		 * The meta object literal for the '<em><b>Assigned To</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GOAL__ASSIGNED_TO = eINSTANCE.getGoal_AssignedTo();

		/**
		 * The meta object literal for the '<em><b>Wished By</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GOAL__WISHED_BY = eINSTANCE.getGoal_WishedBy();

		/**
		 * The meta object literal for the '<em><b>Operationalized By</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GOAL__OPERATIONALIZED_BY = eINSTANCE.getGoal_OperationalizedBy();

		/**
		 * The meta object literal for the '<em><b>Concerns Objects</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GOAL__CONCERNS_OBJECTS = eINSTANCE.getGoal_ConcernsObjects();

		/**
		 * The meta object literal for the '<em><b>Or</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GOAL__OR = eINSTANCE.getGoal_Or();

		/**
		 * The meta object literal for the '<em><b>And</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GOAL__AND = eINSTANCE.getGoal_And();

		/**
		 * The meta object literal for the '{@link chooseeditor.impl.RefinementImpl <em>Refinement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see chooseeditor.impl.RefinementImpl
		 * @see chooseeditor.impl.ChooseeditorPackageImpl#getRefinement()
		 * @generated
		 */
		EClass REFINEMENT = eINSTANCE.getRefinement();

		/**
		 * The meta object literal for the '<em><b>Supergoal</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFINEMENT__SUPERGOAL = eINSTANCE.getRefinement_Supergoal();

		/**
		 * The meta object literal for the '<em><b>Subgoals</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFINEMENT__SUBGOALS = eINSTANCE.getRefinement_Subgoals();

		/**
		 * The meta object literal for the '{@link chooseeditor.impl.ActorContainerImpl <em>Actor Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see chooseeditor.impl.ActorContainerImpl
		 * @see chooseeditor.impl.ChooseeditorPackageImpl#getActorContainer()
		 * @generated
		 */
		EClass ACTOR_CONTAINER = eINSTANCE.getActorContainer();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTOR_CONTAINER__NAME = eINSTANCE.getActorContainer_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTOR_CONTAINER__DESCRIPTION = eINSTANCE.getActorContainer_Description();

		/**
		 * The meta object literal for the '<em><b>Assignments</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTOR_CONTAINER__ASSIGNMENTS = eINSTANCE.getActorContainer_Assignments();

		/**
		 * The meta object literal for the '<em><b>Wishes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTOR_CONTAINER__WISHES = eINSTANCE.getActorContainer_Wishes();

		/**
		 * The meta object literal for the '<em><b>Includes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTOR_CONTAINER__INCLUDES = eINSTANCE.getActorContainer_Includes();

		/**
		 * The meta object literal for the '<em><b>Part Of</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTOR_CONTAINER__PART_OF = eINSTANCE.getActorContainer_PartOf();

		/**
		 * The meta object literal for the '<em><b>Responsible For</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTOR_CONTAINER__RESPONSIBLE_FOR = eINSTANCE.getActorContainer_ResponsibleFor();

		/**
		 * The meta object literal for the '<em><b>Accountable For</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTOR_CONTAINER__ACCOUNTABLE_FOR = eINSTANCE.getActorContainer_AccountableFor();

		/**
		 * The meta object literal for the '<em><b>Consulted For</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTOR_CONTAINER__CONSULTED_FOR = eINSTANCE.getActorContainer_ConsultedFor();

		/**
		 * The meta object literal for the '<em><b>Informed For</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTOR_CONTAINER__INFORMED_FOR = eINSTANCE.getActorContainer_InformedFor();

		/**
		 * The meta object literal for the '<em><b>Controls</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTOR_CONTAINER__CONTROLS = eINSTANCE.getActorContainer_Controls();

		/**
		 * The meta object literal for the '<em><b>Monitors</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTOR_CONTAINER__MONITORS = eINSTANCE.getActorContainer_Monitors();

		/**
		 * The meta object literal for the '{@link chooseeditor.impl.OperationContainerImpl <em>Operation Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see chooseeditor.impl.OperationContainerImpl
		 * @see chooseeditor.impl.ChooseeditorPackageImpl#getOperationContainer()
		 * @generated
		 */
		EClass OPERATION_CONTAINER = eINSTANCE.getOperationContainer();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION_CONTAINER__NAME = eINSTANCE.getOperationContainer_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION_CONTAINER__DESCRIPTION = eINSTANCE.getOperationContainer_Description();

		/**
		 * The meta object literal for the '<em><b>Operationalizes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION_CONTAINER__OPERATIONALIZES = eINSTANCE.getOperationContainer_Operationalizes();

		/**
		 * The meta object literal for the '<em><b>Responsible</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION_CONTAINER__RESPONSIBLE = eINSTANCE.getOperationContainer_Responsible();

		/**
		 * The meta object literal for the '<em><b>Accountable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION_CONTAINER__ACCOUNTABLE = eINSTANCE.getOperationContainer_Accountable();

		/**
		 * The meta object literal for the '<em><b>Consult</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION_CONTAINER__CONSULT = eINSTANCE.getOperationContainer_Consult();

		/**
		 * The meta object literal for the '<em><b>Inform</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION_CONTAINER__INFORM = eINSTANCE.getOperationContainer_Inform();

		/**
		 * The meta object literal for the '<em><b>Input</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION_CONTAINER__INPUT = eINSTANCE.getOperationContainer_Input();

		/**
		 * The meta object literal for the '<em><b>Output</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION_CONTAINER__OUTPUT = eINSTANCE.getOperationContainer_Output();

		/**
		 * The meta object literal for the '<em><b>Part Of</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION_CONTAINER__PART_OF = eINSTANCE.getOperationContainer_PartOf();

		/**
		 * The meta object literal for the '<em><b>Includes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION_CONTAINER__INCLUDES = eINSTANCE.getOperationContainer_Includes();

		/**
		 * The meta object literal for the '{@link chooseeditor.impl.ObjectImpl <em>Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see chooseeditor.impl.ObjectImpl
		 * @see chooseeditor.impl.ChooseeditorPackageImpl#getObject()
		 * @generated
		 */
		EClass OBJECT = eINSTANCE.getObject();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJECT__NAME = eINSTANCE.getObject_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJECT__DESCRIPTION = eINSTANCE.getObject_Description();

		/**
		 * The meta object literal for the '<em><b>Concerns Goals</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT__CONCERNS_GOALS = eINSTANCE.getObject_ConcernsGoals();

		/**
		 * The meta object literal for the '<em><b>Controlled By</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT__CONTROLLED_BY = eINSTANCE.getObject_ControlledBy();

		/**
		 * The meta object literal for the '<em><b>Monitored By</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT__MONITORED_BY = eINSTANCE.getObject_MonitoredBy();

		/**
		 * The meta object literal for the '<em><b>Input For</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT__INPUT_FOR = eINSTANCE.getObject_InputFor();

		/**
		 * The meta object literal for the '<em><b>Output Of</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT__OUTPUT_OF = eINSTANCE.getObject_OutputOf();

		/**
		 * The meta object literal for the '<em><b>Associates</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT__ASSOCIATES = eINSTANCE.getObject_Associates();

		/**
		 * The meta object literal for the '<em><b>Associated</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT__ASSOCIATED = eINSTANCE.getObject_Associated();

		/**
		 * The meta object literal for the '<em><b>Specialization</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT__SPECIALIZATION = eINSTANCE.getObject_Specialization();

		/**
		 * The meta object literal for the '<em><b>Specialized By</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT__SPECIALIZED_BY = eINSTANCE.getObject_SpecializedBy();

		/**
		 * The meta object literal for the '<em><b>Includes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT__INCLUDES = eINSTANCE.getObject_Includes();

		/**
		 * The meta object literal for the '<em><b>Part Of</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT__PART_OF = eINSTANCE.getObject_PartOf();

		/**
		 * The meta object literal for the '{@link chooseeditor.impl.ActorImpl <em>Actor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see chooseeditor.impl.ActorImpl
		 * @see chooseeditor.impl.ChooseeditorPackageImpl#getActor()
		 * @generated
		 */
		EClass ACTOR = eINSTANCE.getActor();

		/**
		 * The meta object literal for the '{@link chooseeditor.impl.HumanActorImpl <em>Human Actor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see chooseeditor.impl.HumanActorImpl
		 * @see chooseeditor.impl.ChooseeditorPackageImpl#getHumanActor()
		 * @generated
		 */
		EClass HUMAN_ACTOR = eINSTANCE.getHumanActor();

		/**
		 * The meta object literal for the '<em><b>Supervisees</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HUMAN_ACTOR__SUPERVISEES = eINSTANCE.getHumanActor_Supervisees();

		/**
		 * The meta object literal for the '<em><b>Supervisors</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HUMAN_ACTOR__SUPERVISORS = eINSTANCE.getHumanActor_Supervisors();

		/**
		 * The meta object literal for the '<em><b>Performs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HUMAN_ACTOR__PERFORMS = eINSTANCE.getHumanActor_Performs();

		/**
		 * The meta object literal for the '{@link chooseeditor.impl.RoleImpl <em>Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see chooseeditor.impl.RoleImpl
		 * @see chooseeditor.impl.ChooseeditorPackageImpl#getRole()
		 * @generated
		 */
		EClass ROLE = eINSTANCE.getRole();

		/**
		 * The meta object literal for the '<em><b>Performed By</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE__PERFORMED_BY = eINSTANCE.getRole_PerformedBy();

		/**
		 * The meta object literal for the '{@link chooseeditor.impl.DeviceImpl <em>Device</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see chooseeditor.impl.DeviceImpl
		 * @see chooseeditor.impl.ChooseeditorPackageImpl#getDevice()
		 * @generated
		 */
		EClass DEVICE = eINSTANCE.getDevice();

		/**
		 * The meta object literal for the '{@link chooseeditor.impl.SoftwareActorImpl <em>Software Actor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see chooseeditor.impl.SoftwareActorImpl
		 * @see chooseeditor.impl.ChooseeditorPackageImpl#getSoftwareActor()
		 * @generated
		 */
		EClass SOFTWARE_ACTOR = eINSTANCE.getSoftwareActor();

		/**
		 * The meta object literal for the '{@link chooseeditor.impl.OperationImpl <em>Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see chooseeditor.impl.OperationImpl
		 * @see chooseeditor.impl.ChooseeditorPackageImpl#getOperation()
		 * @generated
		 */
		EClass OPERATION = eINSTANCE.getOperation();

		/**
		 * The meta object literal for the '{@link chooseeditor.impl.ProcessImpl <em>Process</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see chooseeditor.impl.ProcessImpl
		 * @see chooseeditor.impl.ChooseeditorPackageImpl#getProcess()
		 * @generated
		 */
		EClass PROCESS = eINSTANCE.getProcess();

		/**
		 * The meta object literal for the '{@link chooseeditor.impl.ProjectImpl <em>Project</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see chooseeditor.impl.ProjectImpl
		 * @see chooseeditor.impl.ChooseeditorPackageImpl#getProject()
		 * @generated
		 */
		EClass PROJECT = eINSTANCE.getProject();

	}

} //ChooseeditorPackage
