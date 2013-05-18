package CHOOSE.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.swt.graphics.Image;

import CHOOSE.diagram.edit.parts.ActorContainerAccountableForEditPart;
import CHOOSE.diagram.edit.parts.ActorContainerAssignmentsEditPart;
import CHOOSE.diagram.edit.parts.ActorContainerConsultedForEditPart;
import CHOOSE.diagram.edit.parts.ActorContainerControlsEditPart;
import CHOOSE.diagram.edit.parts.ActorContainerIncludesEditPart;
import CHOOSE.diagram.edit.parts.ActorContainerInformedForEditPart;
import CHOOSE.diagram.edit.parts.ActorContainerMonitorsEditPart;
import CHOOSE.diagram.edit.parts.ActorContainerPartOfEditPart;
import CHOOSE.diagram.edit.parts.ActorContainerResponsibleForEditPart;
import CHOOSE.diagram.edit.parts.ActorContainerWishesEditPart;
import CHOOSE.diagram.edit.parts.ActorEditPart;
import CHOOSE.diagram.edit.parts.DeviceEditPart;
import CHOOSE.diagram.edit.parts.DiagramEditPart;
import CHOOSE.diagram.edit.parts.GoalAndEditPart;
import CHOOSE.diagram.edit.parts.GoalAssignedToEditPart;
import CHOOSE.diagram.edit.parts.GoalConcernsObjectsEditPart;
import CHOOSE.diagram.edit.parts.GoalConflictedEditPart;
import CHOOSE.diagram.edit.parts.GoalConflictsEditPart;
import CHOOSE.diagram.edit.parts.GoalEditPart;
import CHOOSE.diagram.edit.parts.GoalOperationalizedByEditPart;
import CHOOSE.diagram.edit.parts.GoalOrEditPart;
import CHOOSE.diagram.edit.parts.GoalWishedByEditPart;
import CHOOSE.diagram.edit.parts.HumanActorEditPart;
import CHOOSE.diagram.edit.parts.HumanActorPerformsEditPart;
import CHOOSE.diagram.edit.parts.HumanActorSuperviseesEditPart;
import CHOOSE.diagram.edit.parts.HumanActorSupervisorsEditPart;
import CHOOSE.diagram.edit.parts.ObjectAssociatedEditPart;
import CHOOSE.diagram.edit.parts.ObjectAssociatesEditPart;
import CHOOSE.diagram.edit.parts.ObjectConcernsGoalsEditPart;
import CHOOSE.diagram.edit.parts.ObjectControlledByEditPart;
import CHOOSE.diagram.edit.parts.ObjectEditPart;
import CHOOSE.diagram.edit.parts.ObjectIncludesEditPart;
import CHOOSE.diagram.edit.parts.ObjectInputForEditPart;
import CHOOSE.diagram.edit.parts.ObjectMonitoredByEditPart;
import CHOOSE.diagram.edit.parts.ObjectOutputOfEditPart;
import CHOOSE.diagram.edit.parts.ObjectPartOfEditPart;
import CHOOSE.diagram.edit.parts.ObjectSpecializationEditPart;
import CHOOSE.diagram.edit.parts.ObjectSpecializedByEditPart;
import CHOOSE.diagram.edit.parts.OperationContainerAccountableEditPart;
import CHOOSE.diagram.edit.parts.OperationContainerConsultEditPart;
import CHOOSE.diagram.edit.parts.OperationContainerIncludesEditPart;
import CHOOSE.diagram.edit.parts.OperationContainerInformEditPart;
import CHOOSE.diagram.edit.parts.OperationContainerInputEditPart;
import CHOOSE.diagram.edit.parts.OperationContainerOperationalizesEditPart;
import CHOOSE.diagram.edit.parts.OperationContainerOutputEditPart;
import CHOOSE.diagram.edit.parts.OperationContainerPartOfEditPart;
import CHOOSE.diagram.edit.parts.OperationContainerResponsibleEditPart;
import CHOOSE.diagram.edit.parts.OperationEditPart;
import CHOOSE.diagram.edit.parts.ProcessEditPart;
import CHOOSE.diagram.edit.parts.ProjectEditPart;
import CHOOSE.diagram.edit.parts.RefinementEditPart;
import CHOOSE.diagram.edit.parts.RefinementSubgoalsEditPart;
import CHOOSE.diagram.edit.parts.RefinementSupergoalEditPart;
import CHOOSE.diagram.edit.parts.RoleEditPart;
import CHOOSE.diagram.edit.parts.RolePerformedByEditPart;
import CHOOSE.diagram.edit.parts.SoftwareActorEditPart;
import CHOOSE.diagram.part.ChooseEditorDiagramEditorPlugin;
import chooseeditor.ChooseeditorPackage;

/**
 * @generated
 */
public class ChooseEditorElementTypes {

	/**
	 * @generated
	 */
	private ChooseEditorElementTypes() {
	}

	/**
	 * @generated
	 */
	private static Map<IElementType, ENamedElement> elements;

	/**
	 * @generated
	 */
	private static ImageRegistry imageRegistry;

	/**
	 * @generated
	 */
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType Diagram_1000 = getElementType("CHOOSE.diagram.Diagram_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Goal_2001 = getElementType("CHOOSE.diagram.Goal_2001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Refinement_2002 = getElementType("CHOOSE.diagram.Refinement_2002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Actor_2003 = getElementType("CHOOSE.diagram.Actor_2003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType HumanActor_2004 = getElementType("CHOOSE.diagram.HumanActor_2004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Role_2005 = getElementType("CHOOSE.diagram.Role_2005"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType SoftwareActor_2006 = getElementType("CHOOSE.diagram.SoftwareActor_2006"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Device_2007 = getElementType("CHOOSE.diagram.Device_2007"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Operation_2008 = getElementType("CHOOSE.diagram.Operation_2008"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Process_2009 = getElementType("CHOOSE.diagram.Process_2009"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Project_2010 = getElementType("CHOOSE.diagram.Project_2010"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Object_2011 = getElementType("CHOOSE.diagram.Object_2011"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType GoalAssignedTo_4001 = getElementType("CHOOSE.diagram.GoalAssignedTo_4001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType GoalWishedBy_4002 = getElementType("CHOOSE.diagram.GoalWishedBy_4002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType GoalOr_4003 = getElementType("CHOOSE.diagram.GoalOr_4003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType GoalAnd_4004 = getElementType("CHOOSE.diagram.GoalAnd_4004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType GoalConflicted_4005 = getElementType("CHOOSE.diagram.GoalConflicted_4005"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType GoalConflicts_4006 = getElementType("CHOOSE.diagram.GoalConflicts_4006"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType GoalConcernsObjects_4007 = getElementType("CHOOSE.diagram.GoalConcernsObjects_4007"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType GoalOperationalizedBy_4008 = getElementType("CHOOSE.diagram.GoalOperationalizedBy_4008"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType RefinementSupergoal_4009 = getElementType("CHOOSE.diagram.RefinementSupergoal_4009"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType RefinementSubgoals_4010 = getElementType("CHOOSE.diagram.RefinementSubgoals_4010"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ActorContainerWishes_4018 = getElementType("CHOOSE.diagram.ActorContainerWishes_4018"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ActorContainerConsultedFor_4012 = getElementType("CHOOSE.diagram.ActorContainerConsultedFor_4012"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ActorContainerInformedFor_4013 = getElementType("CHOOSE.diagram.ActorContainerInformedFor_4013"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType HumanActorSupervisors_4014 = getElementType("CHOOSE.diagram.HumanActorSupervisors_4014"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType HumanActorSupervisees_4015 = getElementType("CHOOSE.diagram.HumanActorSupervisees_4015"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ActorContainerAssignments_4011 = getElementType("CHOOSE.diagram.ActorContainerAssignments_4011"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType RolePerformedBy_4017 = getElementType("CHOOSE.diagram.RolePerformedBy_4017"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType HumanActorPerforms_4016 = getElementType("CHOOSE.diagram.HumanActorPerforms_4016"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ActorContainerMonitors_4019 = getElementType("CHOOSE.diagram.ActorContainerMonitors_4019"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ActorContainerControls_4020 = getElementType("CHOOSE.diagram.ActorContainerControls_4020"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ActorContainerAccountableFor_4021 = getElementType("CHOOSE.diagram.ActorContainerAccountableFor_4021"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ActorContainerResponsibleFor_4022 = getElementType("CHOOSE.diagram.ActorContainerResponsibleFor_4022"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ActorContainerPartOf_4023 = getElementType("CHOOSE.diagram.ActorContainerPartOf_4023"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ActorContainerIncludes_4024 = getElementType("CHOOSE.diagram.ActorContainerIncludes_4024"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType OperationContainerResponsible_4025 = getElementType("CHOOSE.diagram.OperationContainerResponsible_4025"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType OperationContainerInform_4027 = getElementType("CHOOSE.diagram.OperationContainerInform_4027"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType OperationContainerConsult_4026 = getElementType("CHOOSE.diagram.OperationContainerConsult_4026"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType OperationContainerAccountable_4028 = getElementType("CHOOSE.diagram.OperationContainerAccountable_4028"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType OperationContainerPartOf_4029 = getElementType("CHOOSE.diagram.OperationContainerPartOf_4029"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType OperationContainerIncludes_4030 = getElementType("CHOOSE.diagram.OperationContainerIncludes_4030"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType OperationContainerOperationalizes_4031 = getElementType("CHOOSE.diagram.OperationContainerOperationalizes_4031"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType OperationContainerOutput_4032 = getElementType("CHOOSE.diagram.OperationContainerOutput_4032"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType OperationContainerInput_4033 = getElementType("CHOOSE.diagram.OperationContainerInput_4033"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ObjectConcernsGoals_4038 = getElementType("CHOOSE.diagram.ObjectConcernsGoals_4038"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ObjectMonitoredBy_4034 = getElementType("CHOOSE.diagram.ObjectMonitoredBy_4034"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ObjectInputFor_4036 = getElementType("CHOOSE.diagram.ObjectInputFor_4036"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ObjectOutputOf_4037 = getElementType("CHOOSE.diagram.ObjectOutputOf_4037"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ObjectControlledBy_4035 = getElementType("CHOOSE.diagram.ObjectControlledBy_4035"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ObjectAssociates_4039 = getElementType("CHOOSE.diagram.ObjectAssociates_4039"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ObjectAssociated_4040 = getElementType("CHOOSE.diagram.ObjectAssociated_4040"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ObjectSpecialization_4041 = getElementType("CHOOSE.diagram.ObjectSpecialization_4041"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ObjectSpecializedBy_4042 = getElementType("CHOOSE.diagram.ObjectSpecializedBy_4042"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ObjectPartOf_4043 = getElementType("CHOOSE.diagram.ObjectPartOf_4043"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ObjectIncludes_4044 = getElementType("CHOOSE.diagram.ObjectIncludes_4044"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	private static ImageRegistry getImageRegistry() {
		if (imageRegistry == null) {
			imageRegistry = new ImageRegistry();
		}
		return imageRegistry;
	}

	/**
	 * @generated
	 */
	private static String getImageRegistryKey(ENamedElement element) {
		return element.getName();
	}

	/**
	 * @generated
	 */
	private static ImageDescriptor getProvidedImageDescriptor(
			ENamedElement element) {
		if (element instanceof EStructuralFeature) {
			EStructuralFeature feature = ((EStructuralFeature) element);
			EClass eContainingClass = feature.getEContainingClass();
			EClassifier eType = feature.getEType();
			if (eContainingClass != null && !eContainingClass.isAbstract()) {
				element = eContainingClass;
			} else if (eType instanceof EClass
					&& !((EClass) eType).isAbstract()) {
				element = eType;
			}
		}
		if (element instanceof EClass) {
			EClass eClass = (EClass) element;
			if (!eClass.isAbstract()) {
				return ChooseEditorDiagramEditorPlugin.getInstance()
						.getItemImageDescriptor(
								eClass.getEPackage().getEFactoryInstance()
										.create(eClass));
			}
		}
		// TODO : support structural features
		return null;
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		String key = getImageRegistryKey(element);
		ImageDescriptor imageDescriptor = getImageRegistry().getDescriptor(key);
		if (imageDescriptor == null) {
			imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null) {
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
		}
		return imageDescriptor;
	}

	/**
	 * @generated
	 */
	public static Image getImage(ENamedElement element) {
		String key = getImageRegistryKey(element);
		Image image = getImageRegistry().get(key);
		if (image == null) {
			ImageDescriptor imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null) {
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
			image = getImageRegistry().get(key);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		ENamedElement element = getElement(hint);
		if (element == null) {
			return null;
		}
		return getImageDescriptor(element);
	}

	/**
	 * @generated
	 */
	public static Image getImage(IAdaptable hint) {
		ENamedElement element = getElement(hint);
		if (element == null) {
			return null;
		}
		return getImage(element);
	}

	/**
	 * Returns 'type' of the ecore object associated with the hint.
	 * 
	 * @generated
	 */
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(Diagram_1000,
					ChooseeditorPackage.eINSTANCE.getDiagram());

			elements.put(Goal_2001, ChooseeditorPackage.eINSTANCE.getGoal());

			elements.put(Refinement_2002,
					ChooseeditorPackage.eINSTANCE.getRefinement());

			elements.put(Actor_2003, ChooseeditorPackage.eINSTANCE.getActor());

			elements.put(HumanActor_2004,
					ChooseeditorPackage.eINSTANCE.getHumanActor());

			elements.put(Role_2005, ChooseeditorPackage.eINSTANCE.getRole());

			elements.put(SoftwareActor_2006,
					ChooseeditorPackage.eINSTANCE.getSoftwareActor());

			elements.put(Device_2007, ChooseeditorPackage.eINSTANCE.getDevice());

			elements.put(Operation_2008,
					ChooseeditorPackage.eINSTANCE.getOperation());

			elements.put(Process_2009,
					ChooseeditorPackage.eINSTANCE.getProcess());

			elements.put(Project_2010,
					ChooseeditorPackage.eINSTANCE.getProject());

			elements.put(Object_2011, ChooseeditorPackage.eINSTANCE.getObject());

			elements.put(GoalAssignedTo_4001,
					ChooseeditorPackage.eINSTANCE.getGoal_AssignedTo());

			elements.put(GoalWishedBy_4002,
					ChooseeditorPackage.eINSTANCE.getGoal_WishedBy());

			elements.put(GoalOr_4003,
					ChooseeditorPackage.eINSTANCE.getGoal_Or());

			elements.put(GoalAnd_4004,
					ChooseeditorPackage.eINSTANCE.getGoal_And());

			elements.put(GoalConflicted_4005,
					ChooseeditorPackage.eINSTANCE.getGoal_Conflicted());

			elements.put(GoalConflicts_4006,
					ChooseeditorPackage.eINSTANCE.getGoal_Conflicts());

			elements.put(GoalConcernsObjects_4007,
					ChooseeditorPackage.eINSTANCE.getGoal_ConcernsObjects());

			elements.put(GoalOperationalizedBy_4008,
					ChooseeditorPackage.eINSTANCE.getGoal_OperationalizedBy());

			elements.put(RefinementSupergoal_4009,
					ChooseeditorPackage.eINSTANCE.getRefinement_Supergoal());

			elements.put(RefinementSubgoals_4010,
					ChooseeditorPackage.eINSTANCE.getRefinement_Subgoals());

			elements.put(ActorContainerWishes_4018,
					ChooseeditorPackage.eINSTANCE.getActorContainer_Wishes());

			elements.put(ActorContainerConsultedFor_4012,
					ChooseeditorPackage.eINSTANCE
							.getActorContainer_ConsultedFor());

			elements.put(ActorContainerInformedFor_4013,
					ChooseeditorPackage.eINSTANCE
							.getActorContainer_InformedFor());

			elements.put(HumanActorSupervisors_4014,
					ChooseeditorPackage.eINSTANCE.getHumanActor_Supervisors());

			elements.put(HumanActorSupervisees_4015,
					ChooseeditorPackage.eINSTANCE.getHumanActor_Supervisees());

			elements.put(ActorContainerAssignments_4011,
					ChooseeditorPackage.eINSTANCE
							.getActorContainer_Assignments());

			elements.put(RolePerformedBy_4017,
					ChooseeditorPackage.eINSTANCE.getRole_PerformedBy());

			elements.put(HumanActorPerforms_4016,
					ChooseeditorPackage.eINSTANCE.getHumanActor_Performs());

			elements.put(ActorContainerMonitors_4019,
					ChooseeditorPackage.eINSTANCE.getActorContainer_Monitors());

			elements.put(ActorContainerControls_4020,
					ChooseeditorPackage.eINSTANCE.getActorContainer_Controls());

			elements.put(ActorContainerAccountableFor_4021,
					ChooseeditorPackage.eINSTANCE
							.getActorContainer_AccountableFor());

			elements.put(ActorContainerResponsibleFor_4022,
					ChooseeditorPackage.eINSTANCE
							.getActorContainer_ResponsibleFor());

			elements.put(ActorContainerPartOf_4023,
					ChooseeditorPackage.eINSTANCE.getActorContainer_PartOf());

			elements.put(ActorContainerIncludes_4024,
					ChooseeditorPackage.eINSTANCE.getActorContainer_Includes());

			elements.put(OperationContainerResponsible_4025,
					ChooseeditorPackage.eINSTANCE
							.getOperationContainer_Responsible());

			elements.put(OperationContainerInform_4027,
					ChooseeditorPackage.eINSTANCE
							.getOperationContainer_Inform());

			elements.put(OperationContainerConsult_4026,
					ChooseeditorPackage.eINSTANCE
							.getOperationContainer_Consult());

			elements.put(OperationContainerAccountable_4028,
					ChooseeditorPackage.eINSTANCE
							.getOperationContainer_Accountable());

			elements.put(OperationContainerPartOf_4029,
					ChooseeditorPackage.eINSTANCE
							.getOperationContainer_PartOf());

			elements.put(OperationContainerIncludes_4030,
					ChooseeditorPackage.eINSTANCE
							.getOperationContainer_Includes());

			elements.put(OperationContainerOperationalizes_4031,
					ChooseeditorPackage.eINSTANCE
							.getOperationContainer_Operationalizes());

			elements.put(OperationContainerOutput_4032,
					ChooseeditorPackage.eINSTANCE
							.getOperationContainer_Output());

			elements.put(OperationContainerInput_4033,
					ChooseeditorPackage.eINSTANCE.getOperationContainer_Input());

			elements.put(ObjectConcernsGoals_4038,
					ChooseeditorPackage.eINSTANCE.getObject_ConcernsGoals());

			elements.put(ObjectMonitoredBy_4034,
					ChooseeditorPackage.eINSTANCE.getObject_MonitoredBy());

			elements.put(ObjectInputFor_4036,
					ChooseeditorPackage.eINSTANCE.getObject_InputFor());

			elements.put(ObjectOutputOf_4037,
					ChooseeditorPackage.eINSTANCE.getObject_OutputOf());

			elements.put(ObjectControlledBy_4035,
					ChooseeditorPackage.eINSTANCE.getObject_ControlledBy());

			elements.put(ObjectAssociates_4039,
					ChooseeditorPackage.eINSTANCE.getObject_Associates());

			elements.put(ObjectAssociated_4040,
					ChooseeditorPackage.eINSTANCE.getObject_Associated());

			elements.put(ObjectSpecialization_4041,
					ChooseeditorPackage.eINSTANCE.getObject_Specialization());

			elements.put(ObjectSpecializedBy_4042,
					ChooseeditorPackage.eINSTANCE.getObject_SpecializedBy());

			elements.put(ObjectPartOf_4043,
					ChooseeditorPackage.eINSTANCE.getObject_PartOf());

			elements.put(ObjectIncludes_4044,
					ChooseeditorPackage.eINSTANCE.getObject_Includes());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	 * @generated
	 */
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	 * @generated
	 */
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(Diagram_1000);
			KNOWN_ELEMENT_TYPES.add(Goal_2001);
			KNOWN_ELEMENT_TYPES.add(Refinement_2002);
			KNOWN_ELEMENT_TYPES.add(Actor_2003);
			KNOWN_ELEMENT_TYPES.add(HumanActor_2004);
			KNOWN_ELEMENT_TYPES.add(Role_2005);
			KNOWN_ELEMENT_TYPES.add(SoftwareActor_2006);
			KNOWN_ELEMENT_TYPES.add(Device_2007);
			KNOWN_ELEMENT_TYPES.add(Operation_2008);
			KNOWN_ELEMENT_TYPES.add(Process_2009);
			KNOWN_ELEMENT_TYPES.add(Project_2010);
			KNOWN_ELEMENT_TYPES.add(Object_2011);
			KNOWN_ELEMENT_TYPES.add(GoalAssignedTo_4001);
			KNOWN_ELEMENT_TYPES.add(GoalWishedBy_4002);
			KNOWN_ELEMENT_TYPES.add(GoalOr_4003);
			KNOWN_ELEMENT_TYPES.add(GoalAnd_4004);
			KNOWN_ELEMENT_TYPES.add(GoalConflicted_4005);
			KNOWN_ELEMENT_TYPES.add(GoalConflicts_4006);
			KNOWN_ELEMENT_TYPES.add(GoalConcernsObjects_4007);
			KNOWN_ELEMENT_TYPES.add(GoalOperationalizedBy_4008);
			KNOWN_ELEMENT_TYPES.add(RefinementSupergoal_4009);
			KNOWN_ELEMENT_TYPES.add(RefinementSubgoals_4010);
			KNOWN_ELEMENT_TYPES.add(ActorContainerWishes_4018);
			KNOWN_ELEMENT_TYPES.add(ActorContainerConsultedFor_4012);
			KNOWN_ELEMENT_TYPES.add(ActorContainerInformedFor_4013);
			KNOWN_ELEMENT_TYPES.add(HumanActorSupervisors_4014);
			KNOWN_ELEMENT_TYPES.add(HumanActorSupervisees_4015);
			KNOWN_ELEMENT_TYPES.add(ActorContainerAssignments_4011);
			KNOWN_ELEMENT_TYPES.add(RolePerformedBy_4017);
			KNOWN_ELEMENT_TYPES.add(HumanActorPerforms_4016);
			KNOWN_ELEMENT_TYPES.add(ActorContainerMonitors_4019);
			KNOWN_ELEMENT_TYPES.add(ActorContainerControls_4020);
			KNOWN_ELEMENT_TYPES.add(ActorContainerAccountableFor_4021);
			KNOWN_ELEMENT_TYPES.add(ActorContainerResponsibleFor_4022);
			KNOWN_ELEMENT_TYPES.add(ActorContainerPartOf_4023);
			KNOWN_ELEMENT_TYPES.add(ActorContainerIncludes_4024);
			KNOWN_ELEMENT_TYPES.add(OperationContainerResponsible_4025);
			KNOWN_ELEMENT_TYPES.add(OperationContainerInform_4027);
			KNOWN_ELEMENT_TYPES.add(OperationContainerConsult_4026);
			KNOWN_ELEMENT_TYPES.add(OperationContainerAccountable_4028);
			KNOWN_ELEMENT_TYPES.add(OperationContainerPartOf_4029);
			KNOWN_ELEMENT_TYPES.add(OperationContainerIncludes_4030);
			KNOWN_ELEMENT_TYPES.add(OperationContainerOperationalizes_4031);
			KNOWN_ELEMENT_TYPES.add(OperationContainerOutput_4032);
			KNOWN_ELEMENT_TYPES.add(OperationContainerInput_4033);
			KNOWN_ELEMENT_TYPES.add(ObjectConcernsGoals_4038);
			KNOWN_ELEMENT_TYPES.add(ObjectMonitoredBy_4034);
			KNOWN_ELEMENT_TYPES.add(ObjectInputFor_4036);
			KNOWN_ELEMENT_TYPES.add(ObjectOutputOf_4037);
			KNOWN_ELEMENT_TYPES.add(ObjectControlledBy_4035);
			KNOWN_ELEMENT_TYPES.add(ObjectAssociates_4039);
			KNOWN_ELEMENT_TYPES.add(ObjectAssociated_4040);
			KNOWN_ELEMENT_TYPES.add(ObjectSpecialization_4041);
			KNOWN_ELEMENT_TYPES.add(ObjectSpecializedBy_4042);
			KNOWN_ELEMENT_TYPES.add(ObjectPartOf_4043);
			KNOWN_ELEMENT_TYPES.add(ObjectIncludes_4044);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case DiagramEditPart.VISUAL_ID:
			return Diagram_1000;
		case GoalEditPart.VISUAL_ID:
			return Goal_2001;
		case RefinementEditPart.VISUAL_ID:
			return Refinement_2002;
		case ActorEditPart.VISUAL_ID:
			return Actor_2003;
		case HumanActorEditPart.VISUAL_ID:
			return HumanActor_2004;
		case RoleEditPart.VISUAL_ID:
			return Role_2005;
		case SoftwareActorEditPart.VISUAL_ID:
			return SoftwareActor_2006;
		case DeviceEditPart.VISUAL_ID:
			return Device_2007;
		case OperationEditPart.VISUAL_ID:
			return Operation_2008;
		case ProcessEditPart.VISUAL_ID:
			return Process_2009;
		case ProjectEditPart.VISUAL_ID:
			return Project_2010;
		case ObjectEditPart.VISUAL_ID:
			return Object_2011;
		case GoalAssignedToEditPart.VISUAL_ID:
			return GoalAssignedTo_4001;
		case GoalWishedByEditPart.VISUAL_ID:
			return GoalWishedBy_4002;
		case GoalOrEditPart.VISUAL_ID:
			return GoalOr_4003;
		case GoalAndEditPart.VISUAL_ID:
			return GoalAnd_4004;
		case GoalConflictedEditPart.VISUAL_ID:
			return GoalConflicted_4005;
		case GoalConflictsEditPart.VISUAL_ID:
			return GoalConflicts_4006;
		case GoalConcernsObjectsEditPart.VISUAL_ID:
			return GoalConcernsObjects_4007;
		case GoalOperationalizedByEditPart.VISUAL_ID:
			return GoalOperationalizedBy_4008;
		case RefinementSupergoalEditPart.VISUAL_ID:
			return RefinementSupergoal_4009;
		case RefinementSubgoalsEditPart.VISUAL_ID:
			return RefinementSubgoals_4010;
		case ActorContainerWishesEditPart.VISUAL_ID:
			return ActorContainerWishes_4018;
		case ActorContainerConsultedForEditPart.VISUAL_ID:
			return ActorContainerConsultedFor_4012;
		case ActorContainerInformedForEditPart.VISUAL_ID:
			return ActorContainerInformedFor_4013;
		case HumanActorSupervisorsEditPart.VISUAL_ID:
			return HumanActorSupervisors_4014;
		case HumanActorSuperviseesEditPart.VISUAL_ID:
			return HumanActorSupervisees_4015;
		case ActorContainerAssignmentsEditPart.VISUAL_ID:
			return ActorContainerAssignments_4011;
		case RolePerformedByEditPart.VISUAL_ID:
			return RolePerformedBy_4017;
		case HumanActorPerformsEditPart.VISUAL_ID:
			return HumanActorPerforms_4016;
		case ActorContainerMonitorsEditPart.VISUAL_ID:
			return ActorContainerMonitors_4019;
		case ActorContainerControlsEditPart.VISUAL_ID:
			return ActorContainerControls_4020;
		case ActorContainerAccountableForEditPart.VISUAL_ID:
			return ActorContainerAccountableFor_4021;
		case ActorContainerResponsibleForEditPart.VISUAL_ID:
			return ActorContainerResponsibleFor_4022;
		case ActorContainerPartOfEditPart.VISUAL_ID:
			return ActorContainerPartOf_4023;
		case ActorContainerIncludesEditPart.VISUAL_ID:
			return ActorContainerIncludes_4024;
		case OperationContainerResponsibleEditPart.VISUAL_ID:
			return OperationContainerResponsible_4025;
		case OperationContainerInformEditPart.VISUAL_ID:
			return OperationContainerInform_4027;
		case OperationContainerConsultEditPart.VISUAL_ID:
			return OperationContainerConsult_4026;
		case OperationContainerAccountableEditPart.VISUAL_ID:
			return OperationContainerAccountable_4028;
		case OperationContainerPartOfEditPart.VISUAL_ID:
			return OperationContainerPartOf_4029;
		case OperationContainerIncludesEditPart.VISUAL_ID:
			return OperationContainerIncludes_4030;
		case OperationContainerOperationalizesEditPart.VISUAL_ID:
			return OperationContainerOperationalizes_4031;
		case OperationContainerOutputEditPart.VISUAL_ID:
			return OperationContainerOutput_4032;
		case OperationContainerInputEditPart.VISUAL_ID:
			return OperationContainerInput_4033;
		case ObjectConcernsGoalsEditPart.VISUAL_ID:
			return ObjectConcernsGoals_4038;
		case ObjectMonitoredByEditPart.VISUAL_ID:
			return ObjectMonitoredBy_4034;
		case ObjectInputForEditPart.VISUAL_ID:
			return ObjectInputFor_4036;
		case ObjectOutputOfEditPart.VISUAL_ID:
			return ObjectOutputOf_4037;
		case ObjectControlledByEditPart.VISUAL_ID:
			return ObjectControlledBy_4035;
		case ObjectAssociatesEditPart.VISUAL_ID:
			return ObjectAssociates_4039;
		case ObjectAssociatedEditPart.VISUAL_ID:
			return ObjectAssociated_4040;
		case ObjectSpecializationEditPart.VISUAL_ID:
			return ObjectSpecialization_4041;
		case ObjectSpecializedByEditPart.VISUAL_ID:
			return ObjectSpecializedBy_4042;
		case ObjectPartOfEditPart.VISUAL_ID:
			return ObjectPartOf_4043;
		case ObjectIncludesEditPart.VISUAL_ID:
			return ObjectIncludes_4044;
		}
		return null;
	}

}
