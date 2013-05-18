package CHOOSE.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

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
import CHOOSE.diagram.providers.ChooseEditorElementTypes;
import chooseeditor.Actor;
import chooseeditor.ActorContainer;
import chooseeditor.ChooseeditorPackage;
import chooseeditor.Device;
import chooseeditor.Diagram;
import chooseeditor.Goal;
import chooseeditor.HumanActor;
import chooseeditor.Object;
import chooseeditor.Operation;
import chooseeditor.OperationContainer;
import chooseeditor.Process;
import chooseeditor.Project;
import chooseeditor.Refinement;
import chooseeditor.Role;
import chooseeditor.SoftwareActor;

/**
 * @generated
 */
public class ChooseEditorDiagramUpdater {

	/**
	 * @generated
	 */
	public static boolean isShortcutOrphaned(View view) {
		return !view.isSetElement() || view.getElement() == null
				|| view.getElement().eIsProxy();
	}

	/**
	 * @generated
	 */
	public static List<ChooseEditorNodeDescriptor> getSemanticChildren(View view) {
		switch (ChooseEditorVisualIDRegistry.getVisualID(view)) {
		case DiagramEditPart.VISUAL_ID:
			return getDiagram_1000SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ChooseEditorNodeDescriptor> getDiagram_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		Diagram modelElement = (Diagram) view.getElement();
		LinkedList<ChooseEditorNodeDescriptor> result = new LinkedList<ChooseEditorNodeDescriptor>();
		for (Iterator<?> it = modelElement.getGoals().iterator(); it.hasNext();) {
			Goal childElement = (Goal) it.next();
			int visualID = ChooseEditorVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == GoalEditPart.VISUAL_ID) {
				result.add(new ChooseEditorNodeDescriptor(childElement,
						visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getRefinements().iterator(); it
				.hasNext();) {
			Refinement childElement = (Refinement) it.next();
			int visualID = ChooseEditorVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == RefinementEditPart.VISUAL_ID) {
				result.add(new ChooseEditorNodeDescriptor(childElement,
						visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getActors().iterator(); it.hasNext();) {
			ActorContainer childElement = (ActorContainer) it.next();
			int visualID = ChooseEditorVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ActorEditPart.VISUAL_ID) {
				result.add(new ChooseEditorNodeDescriptor(childElement,
						visualID));
				continue;
			}
			if (visualID == HumanActorEditPart.VISUAL_ID) {
				result.add(new ChooseEditorNodeDescriptor(childElement,
						visualID));
				continue;
			}
			if (visualID == RoleEditPart.VISUAL_ID) {
				result.add(new ChooseEditorNodeDescriptor(childElement,
						visualID));
				continue;
			}
			if (visualID == SoftwareActorEditPart.VISUAL_ID) {
				result.add(new ChooseEditorNodeDescriptor(childElement,
						visualID));
				continue;
			}
			if (visualID == DeviceEditPart.VISUAL_ID) {
				result.add(new ChooseEditorNodeDescriptor(childElement,
						visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getOperations().iterator(); it
				.hasNext();) {
			OperationContainer childElement = (OperationContainer) it.next();
			int visualID = ChooseEditorVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == OperationEditPart.VISUAL_ID) {
				result.add(new ChooseEditorNodeDescriptor(childElement,
						visualID));
				continue;
			}
			if (visualID == ProcessEditPart.VISUAL_ID) {
				result.add(new ChooseEditorNodeDescriptor(childElement,
						visualID));
				continue;
			}
			if (visualID == ProjectEditPart.VISUAL_ID) {
				result.add(new ChooseEditorNodeDescriptor(childElement,
						visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getObjects().iterator(); it
				.hasNext();) {
			Object childElement = (Object) it.next();
			int visualID = ChooseEditorVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ObjectEditPart.VISUAL_ID) {
				result.add(new ChooseEditorNodeDescriptor(childElement,
						visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ChooseEditorLinkDescriptor> getContainedLinks(View view) {
		switch (ChooseEditorVisualIDRegistry.getVisualID(view)) {
		case DiagramEditPart.VISUAL_ID:
			return getDiagram_1000ContainedLinks(view);
		case GoalEditPart.VISUAL_ID:
			return getGoal_2001ContainedLinks(view);
		case RefinementEditPart.VISUAL_ID:
			return getRefinement_2002ContainedLinks(view);
		case ActorEditPart.VISUAL_ID:
			return getActor_2003ContainedLinks(view);
		case HumanActorEditPart.VISUAL_ID:
			return getHumanActor_2004ContainedLinks(view);
		case RoleEditPart.VISUAL_ID:
			return getRole_2005ContainedLinks(view);
		case SoftwareActorEditPart.VISUAL_ID:
			return getSoftwareActor_2006ContainedLinks(view);
		case DeviceEditPart.VISUAL_ID:
			return getDevice_2007ContainedLinks(view);
		case OperationEditPart.VISUAL_ID:
			return getOperation_2008ContainedLinks(view);
		case ProcessEditPart.VISUAL_ID:
			return getProcess_2009ContainedLinks(view);
		case ProjectEditPart.VISUAL_ID:
			return getProject_2010ContainedLinks(view);
		case ObjectEditPart.VISUAL_ID:
			return getObject_2011ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ChooseEditorLinkDescriptor> getIncomingLinks(View view) {
		switch (ChooseEditorVisualIDRegistry.getVisualID(view)) {
		case GoalEditPart.VISUAL_ID:
			return getGoal_2001IncomingLinks(view);
		case RefinementEditPart.VISUAL_ID:
			return getRefinement_2002IncomingLinks(view);
		case ActorEditPart.VISUAL_ID:
			return getActor_2003IncomingLinks(view);
		case HumanActorEditPart.VISUAL_ID:
			return getHumanActor_2004IncomingLinks(view);
		case RoleEditPart.VISUAL_ID:
			return getRole_2005IncomingLinks(view);
		case SoftwareActorEditPart.VISUAL_ID:
			return getSoftwareActor_2006IncomingLinks(view);
		case DeviceEditPart.VISUAL_ID:
			return getDevice_2007IncomingLinks(view);
		case OperationEditPart.VISUAL_ID:
			return getOperation_2008IncomingLinks(view);
		case ProcessEditPart.VISUAL_ID:
			return getProcess_2009IncomingLinks(view);
		case ProjectEditPart.VISUAL_ID:
			return getProject_2010IncomingLinks(view);
		case ObjectEditPart.VISUAL_ID:
			return getObject_2011IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ChooseEditorLinkDescriptor> getOutgoingLinks(View view) {
		switch (ChooseEditorVisualIDRegistry.getVisualID(view)) {
		case GoalEditPart.VISUAL_ID:
			return getGoal_2001OutgoingLinks(view);
		case RefinementEditPart.VISUAL_ID:
			return getRefinement_2002OutgoingLinks(view);
		case ActorEditPart.VISUAL_ID:
			return getActor_2003OutgoingLinks(view);
		case HumanActorEditPart.VISUAL_ID:
			return getHumanActor_2004OutgoingLinks(view);
		case RoleEditPart.VISUAL_ID:
			return getRole_2005OutgoingLinks(view);
		case SoftwareActorEditPart.VISUAL_ID:
			return getSoftwareActor_2006OutgoingLinks(view);
		case DeviceEditPart.VISUAL_ID:
			return getDevice_2007OutgoingLinks(view);
		case OperationEditPart.VISUAL_ID:
			return getOperation_2008OutgoingLinks(view);
		case ProcessEditPart.VISUAL_ID:
			return getProcess_2009OutgoingLinks(view);
		case ProjectEditPart.VISUAL_ID:
			return getProject_2010OutgoingLinks(view);
		case ObjectEditPart.VISUAL_ID:
			return getObject_2011OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ChooseEditorLinkDescriptor> getDiagram_1000ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ChooseEditorLinkDescriptor> getGoal_2001ContainedLinks(
			View view) {
		Goal modelElement = (Goal) view.getElement();
		LinkedList<ChooseEditorLinkDescriptor> result = new LinkedList<ChooseEditorLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Goal_AssignedTo_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Goal_WishedBy_4002(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Goal_Or_4003(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Goal_And_4004(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Goal_Conflicted_4005(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Goal_Conflicts_4006(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Goal_ConcernsObjects_4007(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Goal_OperationalizedBy_4008(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ChooseEditorLinkDescriptor> getRefinement_2002ContainedLinks(
			View view) {
		Refinement modelElement = (Refinement) view.getElement();
		LinkedList<ChooseEditorLinkDescriptor> result = new LinkedList<ChooseEditorLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Refinement_Supergoal_4009(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Refinement_Subgoals_4010(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ChooseEditorLinkDescriptor> getActor_2003ContainedLinks(
			View view) {
		Actor modelElement = (Actor) view.getElement();
		LinkedList<ChooseEditorLinkDescriptor> result = new LinkedList<ChooseEditorLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_ActorContainer_Wishes_4018(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_ActorContainer_ConsultedFor_4012(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_ActorContainer_InformedFor_4013(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_ActorContainer_Assignments_4011(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_ActorContainer_Monitors_4019(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_ActorContainer_Controls_4020(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_ActorContainer_AccountableFor_4021(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_ActorContainer_ResponsibleFor_4022(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_ActorContainer_PartOf_4023(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_ActorContainer_Includes_4024(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ChooseEditorLinkDescriptor> getHumanActor_2004ContainedLinks(
			View view) {
		HumanActor modelElement = (HumanActor) view.getElement();
		LinkedList<ChooseEditorLinkDescriptor> result = new LinkedList<ChooseEditorLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_ActorContainer_Wishes_4018(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_ActorContainer_ConsultedFor_4012(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_ActorContainer_InformedFor_4013(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_HumanActor_Supervisors_4014(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_HumanActor_Supervisees_4015(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_ActorContainer_Assignments_4011(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_HumanActor_Performs_4016(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_ActorContainer_Monitors_4019(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_ActorContainer_Controls_4020(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_ActorContainer_AccountableFor_4021(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_ActorContainer_ResponsibleFor_4022(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_ActorContainer_PartOf_4023(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_ActorContainer_Includes_4024(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ChooseEditorLinkDescriptor> getRole_2005ContainedLinks(
			View view) {
		Role modelElement = (Role) view.getElement();
		LinkedList<ChooseEditorLinkDescriptor> result = new LinkedList<ChooseEditorLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_ActorContainer_Wishes_4018(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_ActorContainer_ConsultedFor_4012(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_ActorContainer_InformedFor_4013(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_ActorContainer_Assignments_4011(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Role_PerformedBy_4017(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_ActorContainer_Monitors_4019(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_ActorContainer_Controls_4020(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_ActorContainer_AccountableFor_4021(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_ActorContainer_ResponsibleFor_4022(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_ActorContainer_PartOf_4023(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_ActorContainer_Includes_4024(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ChooseEditorLinkDescriptor> getSoftwareActor_2006ContainedLinks(
			View view) {
		SoftwareActor modelElement = (SoftwareActor) view.getElement();
		LinkedList<ChooseEditorLinkDescriptor> result = new LinkedList<ChooseEditorLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_ActorContainer_Wishes_4018(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_ActorContainer_ConsultedFor_4012(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_ActorContainer_InformedFor_4013(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_ActorContainer_Assignments_4011(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_ActorContainer_Monitors_4019(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_ActorContainer_Controls_4020(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_ActorContainer_AccountableFor_4021(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_ActorContainer_ResponsibleFor_4022(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_ActorContainer_PartOf_4023(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_ActorContainer_Includes_4024(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ChooseEditorLinkDescriptor> getDevice_2007ContainedLinks(
			View view) {
		Device modelElement = (Device) view.getElement();
		LinkedList<ChooseEditorLinkDescriptor> result = new LinkedList<ChooseEditorLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_ActorContainer_Wishes_4018(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_ActorContainer_ConsultedFor_4012(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_ActorContainer_InformedFor_4013(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_ActorContainer_Assignments_4011(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_ActorContainer_Monitors_4019(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_ActorContainer_Controls_4020(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_ActorContainer_AccountableFor_4021(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_ActorContainer_ResponsibleFor_4022(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_ActorContainer_PartOf_4023(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_ActorContainer_Includes_4024(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ChooseEditorLinkDescriptor> getOperation_2008ContainedLinks(
			View view) {
		Operation modelElement = (Operation) view.getElement();
		LinkedList<ChooseEditorLinkDescriptor> result = new LinkedList<ChooseEditorLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_OperationContainer_Responsible_4025(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_OperationContainer_Inform_4027(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_OperationContainer_Consult_4026(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_OperationContainer_Accountable_4028(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_OperationContainer_PartOf_4029(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_OperationContainer_Includes_4030(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_OperationContainer_Operationalizes_4031(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_OperationContainer_Output_4032(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_OperationContainer_Input_4033(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ChooseEditorLinkDescriptor> getProcess_2009ContainedLinks(
			View view) {
		Process modelElement = (Process) view.getElement();
		LinkedList<ChooseEditorLinkDescriptor> result = new LinkedList<ChooseEditorLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_OperationContainer_Responsible_4025(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_OperationContainer_Inform_4027(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_OperationContainer_Consult_4026(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_OperationContainer_Accountable_4028(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_OperationContainer_PartOf_4029(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_OperationContainer_Includes_4030(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_OperationContainer_Operationalizes_4031(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_OperationContainer_Output_4032(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_OperationContainer_Input_4033(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ChooseEditorLinkDescriptor> getProject_2010ContainedLinks(
			View view) {
		Project modelElement = (Project) view.getElement();
		LinkedList<ChooseEditorLinkDescriptor> result = new LinkedList<ChooseEditorLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_OperationContainer_Responsible_4025(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_OperationContainer_Inform_4027(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_OperationContainer_Consult_4026(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_OperationContainer_Accountable_4028(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_OperationContainer_PartOf_4029(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_OperationContainer_Includes_4030(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_OperationContainer_Operationalizes_4031(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_OperationContainer_Output_4032(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_OperationContainer_Input_4033(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ChooseEditorLinkDescriptor> getObject_2011ContainedLinks(
			View view) {
		Object modelElement = (Object) view.getElement();
		LinkedList<ChooseEditorLinkDescriptor> result = new LinkedList<ChooseEditorLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Object_ConcernsGoals_4038(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Object_MonitoredBy_4034(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Object_InputFor_4036(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Object_OutputOf_4037(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Object_ControlledBy_4035(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Object_Associates_4039(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Object_Associated_4040(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Object_Specialization_4041(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Object_SpecializedBy_4042(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Object_PartOf_4043(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Object_Includes_4044(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ChooseEditorLinkDescriptor> getGoal_2001IncomingLinks(
			View view) {
		Goal modelElement = (Goal) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ChooseEditorLinkDescriptor> result = new LinkedList<ChooseEditorLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Goal_Conflicted_4005(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Goal_Conflicts_4006(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Refinement_Supergoal_4009(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Refinement_Subgoals_4010(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_ActorContainer_Wishes_4018(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_ActorContainer_Assignments_4011(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_OperationContainer_Operationalizes_4031(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Object_ConcernsGoals_4038(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ChooseEditorLinkDescriptor> getRefinement_2002IncomingLinks(
			View view) {
		Refinement modelElement = (Refinement) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ChooseEditorLinkDescriptor> result = new LinkedList<ChooseEditorLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Goal_Or_4003(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Goal_And_4004(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ChooseEditorLinkDescriptor> getActor_2003IncomingLinks(
			View view) {
		Actor modelElement = (Actor) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ChooseEditorLinkDescriptor> result = new LinkedList<ChooseEditorLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Goal_AssignedTo_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Goal_WishedBy_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_ActorContainer_PartOf_4023(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_ActorContainer_Includes_4024(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_OperationContainer_Responsible_4025(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_OperationContainer_Inform_4027(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_OperationContainer_Consult_4026(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_OperationContainer_Accountable_4028(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Object_MonitoredBy_4034(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Object_ControlledBy_4035(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ChooseEditorLinkDescriptor> getHumanActor_2004IncomingLinks(
			View view) {
		HumanActor modelElement = (HumanActor) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ChooseEditorLinkDescriptor> result = new LinkedList<ChooseEditorLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Goal_AssignedTo_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Goal_WishedBy_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_HumanActor_Supervisors_4014(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_HumanActor_Supervisees_4015(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Role_PerformedBy_4017(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_ActorContainer_PartOf_4023(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_ActorContainer_Includes_4024(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_OperationContainer_Responsible_4025(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_OperationContainer_Inform_4027(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_OperationContainer_Consult_4026(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_OperationContainer_Accountable_4028(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Object_MonitoredBy_4034(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Object_ControlledBy_4035(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ChooseEditorLinkDescriptor> getRole_2005IncomingLinks(
			View view) {
		Role modelElement = (Role) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ChooseEditorLinkDescriptor> result = new LinkedList<ChooseEditorLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Goal_AssignedTo_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Goal_WishedBy_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_HumanActor_Performs_4016(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_ActorContainer_PartOf_4023(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_ActorContainer_Includes_4024(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_OperationContainer_Responsible_4025(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_OperationContainer_Inform_4027(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_OperationContainer_Consult_4026(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_OperationContainer_Accountable_4028(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Object_MonitoredBy_4034(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Object_ControlledBy_4035(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ChooseEditorLinkDescriptor> getSoftwareActor_2006IncomingLinks(
			View view) {
		SoftwareActor modelElement = (SoftwareActor) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ChooseEditorLinkDescriptor> result = new LinkedList<ChooseEditorLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Goal_AssignedTo_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Goal_WishedBy_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_ActorContainer_PartOf_4023(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_ActorContainer_Includes_4024(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_OperationContainer_Responsible_4025(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_OperationContainer_Inform_4027(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_OperationContainer_Consult_4026(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_OperationContainer_Accountable_4028(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Object_MonitoredBy_4034(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Object_ControlledBy_4035(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ChooseEditorLinkDescriptor> getDevice_2007IncomingLinks(
			View view) {
		Device modelElement = (Device) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ChooseEditorLinkDescriptor> result = new LinkedList<ChooseEditorLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Goal_AssignedTo_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Goal_WishedBy_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_ActorContainer_PartOf_4023(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_ActorContainer_Includes_4024(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_OperationContainer_Responsible_4025(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_OperationContainer_Inform_4027(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_OperationContainer_Consult_4026(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_OperationContainer_Accountable_4028(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Object_MonitoredBy_4034(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Object_ControlledBy_4035(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ChooseEditorLinkDescriptor> getOperation_2008IncomingLinks(
			View view) {
		Operation modelElement = (Operation) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ChooseEditorLinkDescriptor> result = new LinkedList<ChooseEditorLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Goal_OperationalizedBy_4008(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_ActorContainer_ConsultedFor_4012(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_ActorContainer_InformedFor_4013(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_ActorContainer_AccountableFor_4021(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_ActorContainer_ResponsibleFor_4022(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_OperationContainer_PartOf_4029(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_OperationContainer_Includes_4030(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Object_InputFor_4036(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Object_OutputOf_4037(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ChooseEditorLinkDescriptor> getProcess_2009IncomingLinks(
			View view) {
		Process modelElement = (Process) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ChooseEditorLinkDescriptor> result = new LinkedList<ChooseEditorLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Goal_OperationalizedBy_4008(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_ActorContainer_ConsultedFor_4012(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_ActorContainer_InformedFor_4013(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_ActorContainer_AccountableFor_4021(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_ActorContainer_ResponsibleFor_4022(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_OperationContainer_PartOf_4029(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_OperationContainer_Includes_4030(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Object_InputFor_4036(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Object_OutputOf_4037(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ChooseEditorLinkDescriptor> getProject_2010IncomingLinks(
			View view) {
		Project modelElement = (Project) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ChooseEditorLinkDescriptor> result = new LinkedList<ChooseEditorLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Goal_OperationalizedBy_4008(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_ActorContainer_ConsultedFor_4012(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_ActorContainer_InformedFor_4013(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_ActorContainer_AccountableFor_4021(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_ActorContainer_ResponsibleFor_4022(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_OperationContainer_PartOf_4029(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_OperationContainer_Includes_4030(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Object_InputFor_4036(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Object_OutputOf_4037(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ChooseEditorLinkDescriptor> getObject_2011IncomingLinks(
			View view) {
		Object modelElement = (Object) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ChooseEditorLinkDescriptor> result = new LinkedList<ChooseEditorLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Goal_ConcernsObjects_4007(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_ActorContainer_Monitors_4019(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_ActorContainer_Controls_4020(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_OperationContainer_Output_4032(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_OperationContainer_Input_4033(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Object_Associates_4039(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Object_Associated_4040(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Object_Specialization_4041(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Object_SpecializedBy_4042(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Object_PartOf_4043(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Object_Includes_4044(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ChooseEditorLinkDescriptor> getGoal_2001OutgoingLinks(
			View view) {
		Goal modelElement = (Goal) view.getElement();
		LinkedList<ChooseEditorLinkDescriptor> result = new LinkedList<ChooseEditorLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Goal_AssignedTo_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Goal_WishedBy_4002(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Goal_Or_4003(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Goal_And_4004(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Goal_Conflicted_4005(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Goal_Conflicts_4006(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Goal_ConcernsObjects_4007(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Goal_OperationalizedBy_4008(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ChooseEditorLinkDescriptor> getRefinement_2002OutgoingLinks(
			View view) {
		Refinement modelElement = (Refinement) view.getElement();
		LinkedList<ChooseEditorLinkDescriptor> result = new LinkedList<ChooseEditorLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Refinement_Supergoal_4009(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Refinement_Subgoals_4010(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ChooseEditorLinkDescriptor> getActor_2003OutgoingLinks(
			View view) {
		Actor modelElement = (Actor) view.getElement();
		LinkedList<ChooseEditorLinkDescriptor> result = new LinkedList<ChooseEditorLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_ActorContainer_Wishes_4018(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_ActorContainer_ConsultedFor_4012(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_ActorContainer_InformedFor_4013(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_ActorContainer_Assignments_4011(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_ActorContainer_Monitors_4019(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_ActorContainer_Controls_4020(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_ActorContainer_AccountableFor_4021(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_ActorContainer_ResponsibleFor_4022(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_ActorContainer_PartOf_4023(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_ActorContainer_Includes_4024(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ChooseEditorLinkDescriptor> getHumanActor_2004OutgoingLinks(
			View view) {
		HumanActor modelElement = (HumanActor) view.getElement();
		LinkedList<ChooseEditorLinkDescriptor> result = new LinkedList<ChooseEditorLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_ActorContainer_Wishes_4018(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_ActorContainer_ConsultedFor_4012(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_ActorContainer_InformedFor_4013(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_HumanActor_Supervisors_4014(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_HumanActor_Supervisees_4015(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_ActorContainer_Assignments_4011(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_HumanActor_Performs_4016(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_ActorContainer_Monitors_4019(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_ActorContainer_Controls_4020(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_ActorContainer_AccountableFor_4021(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_ActorContainer_ResponsibleFor_4022(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_ActorContainer_PartOf_4023(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_ActorContainer_Includes_4024(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ChooseEditorLinkDescriptor> getRole_2005OutgoingLinks(
			View view) {
		Role modelElement = (Role) view.getElement();
		LinkedList<ChooseEditorLinkDescriptor> result = new LinkedList<ChooseEditorLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_ActorContainer_Wishes_4018(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_ActorContainer_ConsultedFor_4012(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_ActorContainer_InformedFor_4013(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_ActorContainer_Assignments_4011(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Role_PerformedBy_4017(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_ActorContainer_Monitors_4019(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_ActorContainer_Controls_4020(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_ActorContainer_AccountableFor_4021(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_ActorContainer_ResponsibleFor_4022(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_ActorContainer_PartOf_4023(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_ActorContainer_Includes_4024(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ChooseEditorLinkDescriptor> getSoftwareActor_2006OutgoingLinks(
			View view) {
		SoftwareActor modelElement = (SoftwareActor) view.getElement();
		LinkedList<ChooseEditorLinkDescriptor> result = new LinkedList<ChooseEditorLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_ActorContainer_Wishes_4018(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_ActorContainer_ConsultedFor_4012(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_ActorContainer_InformedFor_4013(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_ActorContainer_Assignments_4011(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_ActorContainer_Monitors_4019(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_ActorContainer_Controls_4020(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_ActorContainer_AccountableFor_4021(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_ActorContainer_ResponsibleFor_4022(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_ActorContainer_PartOf_4023(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_ActorContainer_Includes_4024(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ChooseEditorLinkDescriptor> getDevice_2007OutgoingLinks(
			View view) {
		Device modelElement = (Device) view.getElement();
		LinkedList<ChooseEditorLinkDescriptor> result = new LinkedList<ChooseEditorLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_ActorContainer_Wishes_4018(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_ActorContainer_ConsultedFor_4012(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_ActorContainer_InformedFor_4013(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_ActorContainer_Assignments_4011(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_ActorContainer_Monitors_4019(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_ActorContainer_Controls_4020(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_ActorContainer_AccountableFor_4021(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_ActorContainer_ResponsibleFor_4022(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_ActorContainer_PartOf_4023(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_ActorContainer_Includes_4024(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ChooseEditorLinkDescriptor> getOperation_2008OutgoingLinks(
			View view) {
		Operation modelElement = (Operation) view.getElement();
		LinkedList<ChooseEditorLinkDescriptor> result = new LinkedList<ChooseEditorLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_OperationContainer_Responsible_4025(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_OperationContainer_Inform_4027(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_OperationContainer_Consult_4026(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_OperationContainer_Accountable_4028(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_OperationContainer_PartOf_4029(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_OperationContainer_Includes_4030(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_OperationContainer_Operationalizes_4031(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_OperationContainer_Output_4032(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_OperationContainer_Input_4033(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ChooseEditorLinkDescriptor> getProcess_2009OutgoingLinks(
			View view) {
		Process modelElement = (Process) view.getElement();
		LinkedList<ChooseEditorLinkDescriptor> result = new LinkedList<ChooseEditorLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_OperationContainer_Responsible_4025(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_OperationContainer_Inform_4027(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_OperationContainer_Consult_4026(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_OperationContainer_Accountable_4028(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_OperationContainer_PartOf_4029(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_OperationContainer_Includes_4030(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_OperationContainer_Operationalizes_4031(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_OperationContainer_Output_4032(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_OperationContainer_Input_4033(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ChooseEditorLinkDescriptor> getProject_2010OutgoingLinks(
			View view) {
		Project modelElement = (Project) view.getElement();
		LinkedList<ChooseEditorLinkDescriptor> result = new LinkedList<ChooseEditorLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_OperationContainer_Responsible_4025(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_OperationContainer_Inform_4027(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_OperationContainer_Consult_4026(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_OperationContainer_Accountable_4028(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_OperationContainer_PartOf_4029(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_OperationContainer_Includes_4030(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_OperationContainer_Operationalizes_4031(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_OperationContainer_Output_4032(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_OperationContainer_Input_4033(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ChooseEditorLinkDescriptor> getObject_2011OutgoingLinks(
			View view) {
		Object modelElement = (Object) view.getElement();
		LinkedList<ChooseEditorLinkDescriptor> result = new LinkedList<ChooseEditorLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Object_ConcernsGoals_4038(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Object_MonitoredBy_4034(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Object_InputFor_4036(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Object_OutputOf_4037(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Object_ControlledBy_4035(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Object_Associates_4039(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Object_Associated_4040(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Object_Specialization_4041(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Object_SpecializedBy_4042(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Object_PartOf_4043(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Object_Includes_4044(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ChooseEditorLinkDescriptor> getIncomingFeatureModelFacetLinks_Goal_AssignedTo_4001(
			ActorContainer target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ChooseEditorLinkDescriptor> result = new LinkedList<ChooseEditorLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == ChooseeditorPackage.eINSTANCE
					.getGoal_AssignedTo()) {
				result.add(new ChooseEditorLinkDescriptor(setting.getEObject(),
						target, ChooseEditorElementTypes.GoalAssignedTo_4001,
						GoalAssignedToEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ChooseEditorLinkDescriptor> getIncomingFeatureModelFacetLinks_Goal_WishedBy_4002(
			ActorContainer target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ChooseEditorLinkDescriptor> result = new LinkedList<ChooseEditorLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == ChooseeditorPackage.eINSTANCE
					.getGoal_WishedBy()) {
				result.add(new ChooseEditorLinkDescriptor(setting.getEObject(),
						target, ChooseEditorElementTypes.GoalWishedBy_4002,
						GoalWishedByEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ChooseEditorLinkDescriptor> getIncomingFeatureModelFacetLinks_Goal_Or_4003(
			Refinement target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ChooseEditorLinkDescriptor> result = new LinkedList<ChooseEditorLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == ChooseeditorPackage.eINSTANCE
					.getGoal_Or()) {
				result.add(new ChooseEditorLinkDescriptor(setting.getEObject(),
						target, ChooseEditorElementTypes.GoalOr_4003,
						GoalOrEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ChooseEditorLinkDescriptor> getIncomingFeatureModelFacetLinks_Goal_And_4004(
			Refinement target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ChooseEditorLinkDescriptor> result = new LinkedList<ChooseEditorLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == ChooseeditorPackage.eINSTANCE
					.getGoal_And()) {
				result.add(new ChooseEditorLinkDescriptor(setting.getEObject(),
						target, ChooseEditorElementTypes.GoalAnd_4004,
						GoalAndEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ChooseEditorLinkDescriptor> getIncomingFeatureModelFacetLinks_Goal_Conflicted_4005(
			Goal target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ChooseEditorLinkDescriptor> result = new LinkedList<ChooseEditorLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == ChooseeditorPackage.eINSTANCE
					.getGoal_Conflicted()) {
				result.add(new ChooseEditorLinkDescriptor(setting.getEObject(),
						target, ChooseEditorElementTypes.GoalConflicted_4005,
						GoalConflictedEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ChooseEditorLinkDescriptor> getIncomingFeatureModelFacetLinks_Goal_Conflicts_4006(
			Goal target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ChooseEditorLinkDescriptor> result = new LinkedList<ChooseEditorLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == ChooseeditorPackage.eINSTANCE
					.getGoal_Conflicts()) {
				result.add(new ChooseEditorLinkDescriptor(setting.getEObject(),
						target, ChooseEditorElementTypes.GoalConflicts_4006,
						GoalConflictsEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ChooseEditorLinkDescriptor> getIncomingFeatureModelFacetLinks_Goal_ConcernsObjects_4007(
			Object target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ChooseEditorLinkDescriptor> result = new LinkedList<ChooseEditorLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == ChooseeditorPackage.eINSTANCE
					.getGoal_ConcernsObjects()) {
				result.add(new ChooseEditorLinkDescriptor(setting.getEObject(),
						target,
						ChooseEditorElementTypes.GoalConcernsObjects_4007,
						GoalConcernsObjectsEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ChooseEditorLinkDescriptor> getIncomingFeatureModelFacetLinks_Goal_OperationalizedBy_4008(
			OperationContainer target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ChooseEditorLinkDescriptor> result = new LinkedList<ChooseEditorLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == ChooseeditorPackage.eINSTANCE
					.getGoal_OperationalizedBy()) {
				result.add(new ChooseEditorLinkDescriptor(setting.getEObject(),
						target,
						ChooseEditorElementTypes.GoalOperationalizedBy_4008,
						GoalOperationalizedByEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ChooseEditorLinkDescriptor> getIncomingFeatureModelFacetLinks_Refinement_Supergoal_4009(
			Goal target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ChooseEditorLinkDescriptor> result = new LinkedList<ChooseEditorLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == ChooseeditorPackage.eINSTANCE
					.getRefinement_Supergoal()) {
				result.add(new ChooseEditorLinkDescriptor(setting.getEObject(),
						target,
						ChooseEditorElementTypes.RefinementSupergoal_4009,
						RefinementSupergoalEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ChooseEditorLinkDescriptor> getIncomingFeatureModelFacetLinks_Refinement_Subgoals_4010(
			Goal target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ChooseEditorLinkDescriptor> result = new LinkedList<ChooseEditorLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == ChooseeditorPackage.eINSTANCE
					.getRefinement_Subgoals()) {
				result.add(new ChooseEditorLinkDescriptor(setting.getEObject(),
						target,
						ChooseEditorElementTypes.RefinementSubgoals_4010,
						RefinementSubgoalsEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ChooseEditorLinkDescriptor> getIncomingFeatureModelFacetLinks_ActorContainer_Wishes_4018(
			Goal target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ChooseEditorLinkDescriptor> result = new LinkedList<ChooseEditorLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == ChooseeditorPackage.eINSTANCE
					.getActorContainer_Wishes()) {
				result.add(new ChooseEditorLinkDescriptor(setting.getEObject(),
						target,
						ChooseEditorElementTypes.ActorContainerWishes_4018,
						ActorContainerWishesEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ChooseEditorLinkDescriptor> getIncomingFeatureModelFacetLinks_ActorContainer_ConsultedFor_4012(
			OperationContainer target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ChooseEditorLinkDescriptor> result = new LinkedList<ChooseEditorLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == ChooseeditorPackage.eINSTANCE
					.getActorContainer_ConsultedFor()) {
				result.add(new ChooseEditorLinkDescriptor(
						setting.getEObject(),
						target,
						ChooseEditorElementTypes.ActorContainerConsultedFor_4012,
						ActorContainerConsultedForEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ChooseEditorLinkDescriptor> getIncomingFeatureModelFacetLinks_ActorContainer_InformedFor_4013(
			OperationContainer target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ChooseEditorLinkDescriptor> result = new LinkedList<ChooseEditorLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == ChooseeditorPackage.eINSTANCE
					.getActorContainer_InformedFor()) {
				result.add(new ChooseEditorLinkDescriptor(
						setting.getEObject(),
						target,
						ChooseEditorElementTypes.ActorContainerInformedFor_4013,
						ActorContainerInformedForEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ChooseEditorLinkDescriptor> getIncomingFeatureModelFacetLinks_HumanActor_Supervisors_4014(
			HumanActor target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ChooseEditorLinkDescriptor> result = new LinkedList<ChooseEditorLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == ChooseeditorPackage.eINSTANCE
					.getHumanActor_Supervisors()) {
				result.add(new ChooseEditorLinkDescriptor(setting.getEObject(),
						target,
						ChooseEditorElementTypes.HumanActorSupervisors_4014,
						HumanActorSupervisorsEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ChooseEditorLinkDescriptor> getIncomingFeatureModelFacetLinks_HumanActor_Supervisees_4015(
			HumanActor target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ChooseEditorLinkDescriptor> result = new LinkedList<ChooseEditorLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == ChooseeditorPackage.eINSTANCE
					.getHumanActor_Supervisees()) {
				result.add(new ChooseEditorLinkDescriptor(setting.getEObject(),
						target,
						ChooseEditorElementTypes.HumanActorSupervisees_4015,
						HumanActorSuperviseesEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ChooseEditorLinkDescriptor> getIncomingFeatureModelFacetLinks_ActorContainer_Assignments_4011(
			Goal target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ChooseEditorLinkDescriptor> result = new LinkedList<ChooseEditorLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == ChooseeditorPackage.eINSTANCE
					.getActorContainer_Assignments()) {
				result.add(new ChooseEditorLinkDescriptor(
						setting.getEObject(),
						target,
						ChooseEditorElementTypes.ActorContainerAssignments_4011,
						ActorContainerAssignmentsEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ChooseEditorLinkDescriptor> getIncomingFeatureModelFacetLinks_Role_PerformedBy_4017(
			HumanActor target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ChooseEditorLinkDescriptor> result = new LinkedList<ChooseEditorLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == ChooseeditorPackage.eINSTANCE
					.getRole_PerformedBy()) {
				result.add(new ChooseEditorLinkDescriptor(setting.getEObject(),
						target, ChooseEditorElementTypes.RolePerformedBy_4017,
						RolePerformedByEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ChooseEditorLinkDescriptor> getIncomingFeatureModelFacetLinks_HumanActor_Performs_4016(
			Role target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ChooseEditorLinkDescriptor> result = new LinkedList<ChooseEditorLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == ChooseeditorPackage.eINSTANCE
					.getHumanActor_Performs()) {
				result.add(new ChooseEditorLinkDescriptor(setting.getEObject(),
						target,
						ChooseEditorElementTypes.HumanActorPerforms_4016,
						HumanActorPerformsEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ChooseEditorLinkDescriptor> getIncomingFeatureModelFacetLinks_ActorContainer_Monitors_4019(
			Object target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ChooseEditorLinkDescriptor> result = new LinkedList<ChooseEditorLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == ChooseeditorPackage.eINSTANCE
					.getActorContainer_Monitors()) {
				result.add(new ChooseEditorLinkDescriptor(setting.getEObject(),
						target,
						ChooseEditorElementTypes.ActorContainerMonitors_4019,
						ActorContainerMonitorsEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ChooseEditorLinkDescriptor> getIncomingFeatureModelFacetLinks_ActorContainer_Controls_4020(
			Object target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ChooseEditorLinkDescriptor> result = new LinkedList<ChooseEditorLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == ChooseeditorPackage.eINSTANCE
					.getActorContainer_Controls()) {
				result.add(new ChooseEditorLinkDescriptor(setting.getEObject(),
						target,
						ChooseEditorElementTypes.ActorContainerControls_4020,
						ActorContainerControlsEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ChooseEditorLinkDescriptor> getIncomingFeatureModelFacetLinks_ActorContainer_AccountableFor_4021(
			OperationContainer target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ChooseEditorLinkDescriptor> result = new LinkedList<ChooseEditorLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == ChooseeditorPackage.eINSTANCE
					.getActorContainer_AccountableFor()) {
				result.add(new ChooseEditorLinkDescriptor(
						setting.getEObject(),
						target,
						ChooseEditorElementTypes.ActorContainerAccountableFor_4021,
						ActorContainerAccountableForEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ChooseEditorLinkDescriptor> getIncomingFeatureModelFacetLinks_ActorContainer_ResponsibleFor_4022(
			OperationContainer target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ChooseEditorLinkDescriptor> result = new LinkedList<ChooseEditorLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == ChooseeditorPackage.eINSTANCE
					.getActorContainer_ResponsibleFor()) {
				result.add(new ChooseEditorLinkDescriptor(
						setting.getEObject(),
						target,
						ChooseEditorElementTypes.ActorContainerResponsibleFor_4022,
						ActorContainerResponsibleForEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ChooseEditorLinkDescriptor> getIncomingFeatureModelFacetLinks_ActorContainer_PartOf_4023(
			ActorContainer target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ChooseEditorLinkDescriptor> result = new LinkedList<ChooseEditorLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == ChooseeditorPackage.eINSTANCE
					.getActorContainer_PartOf()) {
				result.add(new ChooseEditorLinkDescriptor(setting.getEObject(),
						target,
						ChooseEditorElementTypes.ActorContainerPartOf_4023,
						ActorContainerPartOfEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ChooseEditorLinkDescriptor> getIncomingFeatureModelFacetLinks_ActorContainer_Includes_4024(
			ActorContainer target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ChooseEditorLinkDescriptor> result = new LinkedList<ChooseEditorLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == ChooseeditorPackage.eINSTANCE
					.getActorContainer_Includes()) {
				result.add(new ChooseEditorLinkDescriptor(setting.getEObject(),
						target,
						ChooseEditorElementTypes.ActorContainerIncludes_4024,
						ActorContainerIncludesEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ChooseEditorLinkDescriptor> getIncomingFeatureModelFacetLinks_OperationContainer_Responsible_4025(
			ActorContainer target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ChooseEditorLinkDescriptor> result = new LinkedList<ChooseEditorLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == ChooseeditorPackage.eINSTANCE
					.getOperationContainer_Responsible()) {
				result.add(new ChooseEditorLinkDescriptor(
						setting.getEObject(),
						target,
						ChooseEditorElementTypes.OperationContainerResponsible_4025,
						OperationContainerResponsibleEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ChooseEditorLinkDescriptor> getIncomingFeatureModelFacetLinks_OperationContainer_Inform_4027(
			ActorContainer target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ChooseEditorLinkDescriptor> result = new LinkedList<ChooseEditorLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == ChooseeditorPackage.eINSTANCE
					.getOperationContainer_Inform()) {
				result.add(new ChooseEditorLinkDescriptor(setting.getEObject(),
						target,
						ChooseEditorElementTypes.OperationContainerInform_4027,
						OperationContainerInformEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ChooseEditorLinkDescriptor> getIncomingFeatureModelFacetLinks_OperationContainer_Consult_4026(
			ActorContainer target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ChooseEditorLinkDescriptor> result = new LinkedList<ChooseEditorLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == ChooseeditorPackage.eINSTANCE
					.getOperationContainer_Consult()) {
				result.add(new ChooseEditorLinkDescriptor(
						setting.getEObject(),
						target,
						ChooseEditorElementTypes.OperationContainerConsult_4026,
						OperationContainerConsultEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ChooseEditorLinkDescriptor> getIncomingFeatureModelFacetLinks_OperationContainer_Accountable_4028(
			ActorContainer target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ChooseEditorLinkDescriptor> result = new LinkedList<ChooseEditorLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == ChooseeditorPackage.eINSTANCE
					.getOperationContainer_Accountable()) {
				result.add(new ChooseEditorLinkDescriptor(
						setting.getEObject(),
						target,
						ChooseEditorElementTypes.OperationContainerAccountable_4028,
						OperationContainerAccountableEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ChooseEditorLinkDescriptor> getIncomingFeatureModelFacetLinks_OperationContainer_PartOf_4029(
			OperationContainer target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ChooseEditorLinkDescriptor> result = new LinkedList<ChooseEditorLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == ChooseeditorPackage.eINSTANCE
					.getOperationContainer_PartOf()) {
				result.add(new ChooseEditorLinkDescriptor(setting.getEObject(),
						target,
						ChooseEditorElementTypes.OperationContainerPartOf_4029,
						OperationContainerPartOfEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ChooseEditorLinkDescriptor> getIncomingFeatureModelFacetLinks_OperationContainer_Includes_4030(
			OperationContainer target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ChooseEditorLinkDescriptor> result = new LinkedList<ChooseEditorLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == ChooseeditorPackage.eINSTANCE
					.getOperationContainer_Includes()) {
				result.add(new ChooseEditorLinkDescriptor(
						setting.getEObject(),
						target,
						ChooseEditorElementTypes.OperationContainerIncludes_4030,
						OperationContainerIncludesEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ChooseEditorLinkDescriptor> getIncomingFeatureModelFacetLinks_OperationContainer_Operationalizes_4031(
			Goal target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ChooseEditorLinkDescriptor> result = new LinkedList<ChooseEditorLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == ChooseeditorPackage.eINSTANCE
					.getOperationContainer_Operationalizes()) {
				result.add(new ChooseEditorLinkDescriptor(
						setting.getEObject(),
						target,
						ChooseEditorElementTypes.OperationContainerOperationalizes_4031,
						OperationContainerOperationalizesEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ChooseEditorLinkDescriptor> getIncomingFeatureModelFacetLinks_OperationContainer_Output_4032(
			Object target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ChooseEditorLinkDescriptor> result = new LinkedList<ChooseEditorLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == ChooseeditorPackage.eINSTANCE
					.getOperationContainer_Output()) {
				result.add(new ChooseEditorLinkDescriptor(setting.getEObject(),
						target,
						ChooseEditorElementTypes.OperationContainerOutput_4032,
						OperationContainerOutputEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ChooseEditorLinkDescriptor> getIncomingFeatureModelFacetLinks_OperationContainer_Input_4033(
			Object target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ChooseEditorLinkDescriptor> result = new LinkedList<ChooseEditorLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == ChooseeditorPackage.eINSTANCE
					.getOperationContainer_Input()) {
				result.add(new ChooseEditorLinkDescriptor(setting.getEObject(),
						target,
						ChooseEditorElementTypes.OperationContainerInput_4033,
						OperationContainerInputEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ChooseEditorLinkDescriptor> getIncomingFeatureModelFacetLinks_Object_ConcernsGoals_4038(
			Goal target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ChooseEditorLinkDescriptor> result = new LinkedList<ChooseEditorLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == ChooseeditorPackage.eINSTANCE
					.getObject_ConcernsGoals()) {
				result.add(new ChooseEditorLinkDescriptor(setting.getEObject(),
						target,
						ChooseEditorElementTypes.ObjectConcernsGoals_4038,
						ObjectConcernsGoalsEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ChooseEditorLinkDescriptor> getIncomingFeatureModelFacetLinks_Object_MonitoredBy_4034(
			ActorContainer target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ChooseEditorLinkDescriptor> result = new LinkedList<ChooseEditorLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == ChooseeditorPackage.eINSTANCE
					.getObject_MonitoredBy()) {
				result.add(new ChooseEditorLinkDescriptor(setting.getEObject(),
						target,
						ChooseEditorElementTypes.ObjectMonitoredBy_4034,
						ObjectMonitoredByEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ChooseEditorLinkDescriptor> getIncomingFeatureModelFacetLinks_Object_InputFor_4036(
			OperationContainer target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ChooseEditorLinkDescriptor> result = new LinkedList<ChooseEditorLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == ChooseeditorPackage.eINSTANCE
					.getObject_InputFor()) {
				result.add(new ChooseEditorLinkDescriptor(setting.getEObject(),
						target, ChooseEditorElementTypes.ObjectInputFor_4036,
						ObjectInputForEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ChooseEditorLinkDescriptor> getIncomingFeatureModelFacetLinks_Object_OutputOf_4037(
			OperationContainer target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ChooseEditorLinkDescriptor> result = new LinkedList<ChooseEditorLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == ChooseeditorPackage.eINSTANCE
					.getObject_OutputOf()) {
				result.add(new ChooseEditorLinkDescriptor(setting.getEObject(),
						target, ChooseEditorElementTypes.ObjectOutputOf_4037,
						ObjectOutputOfEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ChooseEditorLinkDescriptor> getIncomingFeatureModelFacetLinks_Object_ControlledBy_4035(
			ActorContainer target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ChooseEditorLinkDescriptor> result = new LinkedList<ChooseEditorLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == ChooseeditorPackage.eINSTANCE
					.getObject_ControlledBy()) {
				result.add(new ChooseEditorLinkDescriptor(setting.getEObject(),
						target,
						ChooseEditorElementTypes.ObjectControlledBy_4035,
						ObjectControlledByEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ChooseEditorLinkDescriptor> getIncomingFeatureModelFacetLinks_Object_Associates_4039(
			Object target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ChooseEditorLinkDescriptor> result = new LinkedList<ChooseEditorLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == ChooseeditorPackage.eINSTANCE
					.getObject_Associates()) {
				result.add(new ChooseEditorLinkDescriptor(setting.getEObject(),
						target, ChooseEditorElementTypes.ObjectAssociates_4039,
						ObjectAssociatesEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ChooseEditorLinkDescriptor> getIncomingFeatureModelFacetLinks_Object_Associated_4040(
			Object target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ChooseEditorLinkDescriptor> result = new LinkedList<ChooseEditorLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == ChooseeditorPackage.eINSTANCE
					.getObject_Associated()) {
				result.add(new ChooseEditorLinkDescriptor(setting.getEObject(),
						target, ChooseEditorElementTypes.ObjectAssociated_4040,
						ObjectAssociatedEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ChooseEditorLinkDescriptor> getIncomingFeatureModelFacetLinks_Object_Specialization_4041(
			Object target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ChooseEditorLinkDescriptor> result = new LinkedList<ChooseEditorLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == ChooseeditorPackage.eINSTANCE
					.getObject_Specialization()) {
				result.add(new ChooseEditorLinkDescriptor(setting.getEObject(),
						target,
						ChooseEditorElementTypes.ObjectSpecialization_4041,
						ObjectSpecializationEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ChooseEditorLinkDescriptor> getIncomingFeatureModelFacetLinks_Object_SpecializedBy_4042(
			Object target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ChooseEditorLinkDescriptor> result = new LinkedList<ChooseEditorLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == ChooseeditorPackage.eINSTANCE
					.getObject_SpecializedBy()) {
				result.add(new ChooseEditorLinkDescriptor(setting.getEObject(),
						target,
						ChooseEditorElementTypes.ObjectSpecializedBy_4042,
						ObjectSpecializedByEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ChooseEditorLinkDescriptor> getIncomingFeatureModelFacetLinks_Object_PartOf_4043(
			Object target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ChooseEditorLinkDescriptor> result = new LinkedList<ChooseEditorLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == ChooseeditorPackage.eINSTANCE
					.getObject_PartOf()) {
				result.add(new ChooseEditorLinkDescriptor(setting.getEObject(),
						target, ChooseEditorElementTypes.ObjectPartOf_4043,
						ObjectPartOfEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ChooseEditorLinkDescriptor> getIncomingFeatureModelFacetLinks_Object_Includes_4044(
			Object target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ChooseEditorLinkDescriptor> result = new LinkedList<ChooseEditorLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == ChooseeditorPackage.eINSTANCE
					.getObject_Includes()) {
				result.add(new ChooseEditorLinkDescriptor(setting.getEObject(),
						target, ChooseEditorElementTypes.ObjectIncludes_4044,
						ObjectIncludesEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ChooseEditorLinkDescriptor> getOutgoingFeatureModelFacetLinks_Goal_AssignedTo_4001(
			Goal source) {
		LinkedList<ChooseEditorLinkDescriptor> result = new LinkedList<ChooseEditorLinkDescriptor>();
		for (Iterator<?> destinations = source.getAssignedTo().iterator(); destinations
				.hasNext();) {
			ActorContainer destination = (ActorContainer) destinations.next();
			result.add(new ChooseEditorLinkDescriptor(source, destination,
					ChooseEditorElementTypes.GoalAssignedTo_4001,
					GoalAssignedToEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ChooseEditorLinkDescriptor> getOutgoingFeatureModelFacetLinks_Goal_WishedBy_4002(
			Goal source) {
		LinkedList<ChooseEditorLinkDescriptor> result = new LinkedList<ChooseEditorLinkDescriptor>();
		for (Iterator<?> destinations = source.getWishedBy().iterator(); destinations
				.hasNext();) {
			ActorContainer destination = (ActorContainer) destinations.next();
			result.add(new ChooseEditorLinkDescriptor(source, destination,
					ChooseEditorElementTypes.GoalWishedBy_4002,
					GoalWishedByEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ChooseEditorLinkDescriptor> getOutgoingFeatureModelFacetLinks_Goal_Or_4003(
			Goal source) {
		LinkedList<ChooseEditorLinkDescriptor> result = new LinkedList<ChooseEditorLinkDescriptor>();
		for (Iterator<?> destinations = source.getOr().iterator(); destinations
				.hasNext();) {
			Refinement destination = (Refinement) destinations.next();
			result.add(new ChooseEditorLinkDescriptor(source, destination,
					ChooseEditorElementTypes.GoalOr_4003,
					GoalOrEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ChooseEditorLinkDescriptor> getOutgoingFeatureModelFacetLinks_Goal_And_4004(
			Goal source) {
		LinkedList<ChooseEditorLinkDescriptor> result = new LinkedList<ChooseEditorLinkDescriptor>();
		for (Iterator<?> destinations = source.getAnd().iterator(); destinations
				.hasNext();) {
			Refinement destination = (Refinement) destinations.next();
			result.add(new ChooseEditorLinkDescriptor(source, destination,
					ChooseEditorElementTypes.GoalAnd_4004,
					GoalAndEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ChooseEditorLinkDescriptor> getOutgoingFeatureModelFacetLinks_Goal_Conflicted_4005(
			Goal source) {
		LinkedList<ChooseEditorLinkDescriptor> result = new LinkedList<ChooseEditorLinkDescriptor>();
		for (Iterator<?> destinations = source.getConflicted().iterator(); destinations
				.hasNext();) {
			Goal destination = (Goal) destinations.next();
			result.add(new ChooseEditorLinkDescriptor(source, destination,
					ChooseEditorElementTypes.GoalConflicted_4005,
					GoalConflictedEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ChooseEditorLinkDescriptor> getOutgoingFeatureModelFacetLinks_Goal_Conflicts_4006(
			Goal source) {
		LinkedList<ChooseEditorLinkDescriptor> result = new LinkedList<ChooseEditorLinkDescriptor>();
		for (Iterator<?> destinations = source.getConflicts().iterator(); destinations
				.hasNext();) {
			Goal destination = (Goal) destinations.next();
			result.add(new ChooseEditorLinkDescriptor(source, destination,
					ChooseEditorElementTypes.GoalConflicts_4006,
					GoalConflictsEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ChooseEditorLinkDescriptor> getOutgoingFeatureModelFacetLinks_Goal_ConcernsObjects_4007(
			Goal source) {
		LinkedList<ChooseEditorLinkDescriptor> result = new LinkedList<ChooseEditorLinkDescriptor>();
		for (Iterator<?> destinations = source.getConcernsObjects().iterator(); destinations
				.hasNext();) {
			Object destination = (Object) destinations.next();
			result.add(new ChooseEditorLinkDescriptor(source, destination,
					ChooseEditorElementTypes.GoalConcernsObjects_4007,
					GoalConcernsObjectsEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ChooseEditorLinkDescriptor> getOutgoingFeatureModelFacetLinks_Goal_OperationalizedBy_4008(
			Goal source) {
		LinkedList<ChooseEditorLinkDescriptor> result = new LinkedList<ChooseEditorLinkDescriptor>();
		for (Iterator<?> destinations = source.getOperationalizedBy()
				.iterator(); destinations.hasNext();) {
			OperationContainer destination = (OperationContainer) destinations
					.next();
			result.add(new ChooseEditorLinkDescriptor(source, destination,
					ChooseEditorElementTypes.GoalOperationalizedBy_4008,
					GoalOperationalizedByEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ChooseEditorLinkDescriptor> getOutgoingFeatureModelFacetLinks_Refinement_Supergoal_4009(
			Refinement source) {
		LinkedList<ChooseEditorLinkDescriptor> result = new LinkedList<ChooseEditorLinkDescriptor>();
		Goal destination = source.getSupergoal();
		if (destination == null) {
			return result;
		}
		result.add(new ChooseEditorLinkDescriptor(source, destination,
				ChooseEditorElementTypes.RefinementSupergoal_4009,
				RefinementSupergoalEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ChooseEditorLinkDescriptor> getOutgoingFeatureModelFacetLinks_Refinement_Subgoals_4010(
			Refinement source) {
		LinkedList<ChooseEditorLinkDescriptor> result = new LinkedList<ChooseEditorLinkDescriptor>();
		for (Iterator<?> destinations = source.getSubgoals().iterator(); destinations
				.hasNext();) {
			Goal destination = (Goal) destinations.next();
			result.add(new ChooseEditorLinkDescriptor(source, destination,
					ChooseEditorElementTypes.RefinementSubgoals_4010,
					RefinementSubgoalsEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ChooseEditorLinkDescriptor> getOutgoingFeatureModelFacetLinks_ActorContainer_Wishes_4018(
			ActorContainer source) {
		LinkedList<ChooseEditorLinkDescriptor> result = new LinkedList<ChooseEditorLinkDescriptor>();
		for (Iterator<?> destinations = source.getWishes().iterator(); destinations
				.hasNext();) {
			Goal destination = (Goal) destinations.next();
			result.add(new ChooseEditorLinkDescriptor(source, destination,
					ChooseEditorElementTypes.ActorContainerWishes_4018,
					ActorContainerWishesEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ChooseEditorLinkDescriptor> getOutgoingFeatureModelFacetLinks_ActorContainer_ConsultedFor_4012(
			ActorContainer source) {
		LinkedList<ChooseEditorLinkDescriptor> result = new LinkedList<ChooseEditorLinkDescriptor>();
		for (Iterator<?> destinations = source.getConsultedFor().iterator(); destinations
				.hasNext();) {
			OperationContainer destination = (OperationContainer) destinations
					.next();
			result.add(new ChooseEditorLinkDescriptor(source, destination,
					ChooseEditorElementTypes.ActorContainerConsultedFor_4012,
					ActorContainerConsultedForEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ChooseEditorLinkDescriptor> getOutgoingFeatureModelFacetLinks_ActorContainer_InformedFor_4013(
			ActorContainer source) {
		LinkedList<ChooseEditorLinkDescriptor> result = new LinkedList<ChooseEditorLinkDescriptor>();
		for (Iterator<?> destinations = source.getInformedFor().iterator(); destinations
				.hasNext();) {
			OperationContainer destination = (OperationContainer) destinations
					.next();
			result.add(new ChooseEditorLinkDescriptor(source, destination,
					ChooseEditorElementTypes.ActorContainerInformedFor_4013,
					ActorContainerInformedForEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ChooseEditorLinkDescriptor> getOutgoingFeatureModelFacetLinks_HumanActor_Supervisors_4014(
			HumanActor source) {
		LinkedList<ChooseEditorLinkDescriptor> result = new LinkedList<ChooseEditorLinkDescriptor>();
		for (Iterator<?> destinations = source.getSupervisors().iterator(); destinations
				.hasNext();) {
			HumanActor destination = (HumanActor) destinations.next();
			result.add(new ChooseEditorLinkDescriptor(source, destination,
					ChooseEditorElementTypes.HumanActorSupervisors_4014,
					HumanActorSupervisorsEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ChooseEditorLinkDescriptor> getOutgoingFeatureModelFacetLinks_HumanActor_Supervisees_4015(
			HumanActor source) {
		LinkedList<ChooseEditorLinkDescriptor> result = new LinkedList<ChooseEditorLinkDescriptor>();
		for (Iterator<?> destinations = source.getSupervisees().iterator(); destinations
				.hasNext();) {
			HumanActor destination = (HumanActor) destinations.next();
			result.add(new ChooseEditorLinkDescriptor(source, destination,
					ChooseEditorElementTypes.HumanActorSupervisees_4015,
					HumanActorSuperviseesEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ChooseEditorLinkDescriptor> getOutgoingFeatureModelFacetLinks_ActorContainer_Assignments_4011(
			ActorContainer source) {
		LinkedList<ChooseEditorLinkDescriptor> result = new LinkedList<ChooseEditorLinkDescriptor>();
		for (Iterator<?> destinations = source.getAssignments().iterator(); destinations
				.hasNext();) {
			Goal destination = (Goal) destinations.next();
			result.add(new ChooseEditorLinkDescriptor(source, destination,
					ChooseEditorElementTypes.ActorContainerAssignments_4011,
					ActorContainerAssignmentsEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ChooseEditorLinkDescriptor> getOutgoingFeatureModelFacetLinks_Role_PerformedBy_4017(
			Role source) {
		LinkedList<ChooseEditorLinkDescriptor> result = new LinkedList<ChooseEditorLinkDescriptor>();
		for (Iterator<?> destinations = source.getPerformedBy().iterator(); destinations
				.hasNext();) {
			HumanActor destination = (HumanActor) destinations.next();
			result.add(new ChooseEditorLinkDescriptor(source, destination,
					ChooseEditorElementTypes.RolePerformedBy_4017,
					RolePerformedByEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ChooseEditorLinkDescriptor> getOutgoingFeatureModelFacetLinks_HumanActor_Performs_4016(
			HumanActor source) {
		LinkedList<ChooseEditorLinkDescriptor> result = new LinkedList<ChooseEditorLinkDescriptor>();
		for (Iterator<?> destinations = source.getPerforms().iterator(); destinations
				.hasNext();) {
			Role destination = (Role) destinations.next();
			result.add(new ChooseEditorLinkDescriptor(source, destination,
					ChooseEditorElementTypes.HumanActorPerforms_4016,
					HumanActorPerformsEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ChooseEditorLinkDescriptor> getOutgoingFeatureModelFacetLinks_ActorContainer_Monitors_4019(
			ActorContainer source) {
		LinkedList<ChooseEditorLinkDescriptor> result = new LinkedList<ChooseEditorLinkDescriptor>();
		for (Iterator<?> destinations = source.getMonitors().iterator(); destinations
				.hasNext();) {
			Object destination = (Object) destinations.next();
			result.add(new ChooseEditorLinkDescriptor(source, destination,
					ChooseEditorElementTypes.ActorContainerMonitors_4019,
					ActorContainerMonitorsEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ChooseEditorLinkDescriptor> getOutgoingFeatureModelFacetLinks_ActorContainer_Controls_4020(
			ActorContainer source) {
		LinkedList<ChooseEditorLinkDescriptor> result = new LinkedList<ChooseEditorLinkDescriptor>();
		for (Iterator<?> destinations = source.getControls().iterator(); destinations
				.hasNext();) {
			Object destination = (Object) destinations.next();
			result.add(new ChooseEditorLinkDescriptor(source, destination,
					ChooseEditorElementTypes.ActorContainerControls_4020,
					ActorContainerControlsEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ChooseEditorLinkDescriptor> getOutgoingFeatureModelFacetLinks_ActorContainer_AccountableFor_4021(
			ActorContainer source) {
		LinkedList<ChooseEditorLinkDescriptor> result = new LinkedList<ChooseEditorLinkDescriptor>();
		for (Iterator<?> destinations = source.getAccountableFor().iterator(); destinations
				.hasNext();) {
			OperationContainer destination = (OperationContainer) destinations
					.next();
			result.add(new ChooseEditorLinkDescriptor(source, destination,
					ChooseEditorElementTypes.ActorContainerAccountableFor_4021,
					ActorContainerAccountableForEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ChooseEditorLinkDescriptor> getOutgoingFeatureModelFacetLinks_ActorContainer_ResponsibleFor_4022(
			ActorContainer source) {
		LinkedList<ChooseEditorLinkDescriptor> result = new LinkedList<ChooseEditorLinkDescriptor>();
		for (Iterator<?> destinations = source.getResponsibleFor().iterator(); destinations
				.hasNext();) {
			OperationContainer destination = (OperationContainer) destinations
					.next();
			result.add(new ChooseEditorLinkDescriptor(source, destination,
					ChooseEditorElementTypes.ActorContainerResponsibleFor_4022,
					ActorContainerResponsibleForEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ChooseEditorLinkDescriptor> getOutgoingFeatureModelFacetLinks_ActorContainer_PartOf_4023(
			ActorContainer source) {
		LinkedList<ChooseEditorLinkDescriptor> result = new LinkedList<ChooseEditorLinkDescriptor>();
		for (Iterator<?> destinations = source.getPartOf().iterator(); destinations
				.hasNext();) {
			ActorContainer destination = (ActorContainer) destinations.next();
			result.add(new ChooseEditorLinkDescriptor(source, destination,
					ChooseEditorElementTypes.ActorContainerPartOf_4023,
					ActorContainerPartOfEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ChooseEditorLinkDescriptor> getOutgoingFeatureModelFacetLinks_ActorContainer_Includes_4024(
			ActorContainer source) {
		LinkedList<ChooseEditorLinkDescriptor> result = new LinkedList<ChooseEditorLinkDescriptor>();
		for (Iterator<?> destinations = source.getIncludes().iterator(); destinations
				.hasNext();) {
			ActorContainer destination = (ActorContainer) destinations.next();
			result.add(new ChooseEditorLinkDescriptor(source, destination,
					ChooseEditorElementTypes.ActorContainerIncludes_4024,
					ActorContainerIncludesEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ChooseEditorLinkDescriptor> getOutgoingFeatureModelFacetLinks_OperationContainer_Responsible_4025(
			OperationContainer source) {
		LinkedList<ChooseEditorLinkDescriptor> result = new LinkedList<ChooseEditorLinkDescriptor>();
		for (Iterator<?> destinations = source.getResponsible().iterator(); destinations
				.hasNext();) {
			ActorContainer destination = (ActorContainer) destinations.next();
			result.add(new ChooseEditorLinkDescriptor(
					source,
					destination,
					ChooseEditorElementTypes.OperationContainerResponsible_4025,
					OperationContainerResponsibleEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ChooseEditorLinkDescriptor> getOutgoingFeatureModelFacetLinks_OperationContainer_Inform_4027(
			OperationContainer source) {
		LinkedList<ChooseEditorLinkDescriptor> result = new LinkedList<ChooseEditorLinkDescriptor>();
		for (Iterator<?> destinations = source.getInform().iterator(); destinations
				.hasNext();) {
			ActorContainer destination = (ActorContainer) destinations.next();
			result.add(new ChooseEditorLinkDescriptor(source, destination,
					ChooseEditorElementTypes.OperationContainerInform_4027,
					OperationContainerInformEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ChooseEditorLinkDescriptor> getOutgoingFeatureModelFacetLinks_OperationContainer_Consult_4026(
			OperationContainer source) {
		LinkedList<ChooseEditorLinkDescriptor> result = new LinkedList<ChooseEditorLinkDescriptor>();
		for (Iterator<?> destinations = source.getConsult().iterator(); destinations
				.hasNext();) {
			ActorContainer destination = (ActorContainer) destinations.next();
			result.add(new ChooseEditorLinkDescriptor(source, destination,
					ChooseEditorElementTypes.OperationContainerConsult_4026,
					OperationContainerConsultEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ChooseEditorLinkDescriptor> getOutgoingFeatureModelFacetLinks_OperationContainer_Accountable_4028(
			OperationContainer source) {
		LinkedList<ChooseEditorLinkDescriptor> result = new LinkedList<ChooseEditorLinkDescriptor>();
		ActorContainer destination = source.getAccountable();
		if (destination == null) {
			return result;
		}
		result.add(new ChooseEditorLinkDescriptor(source, destination,
				ChooseEditorElementTypes.OperationContainerAccountable_4028,
				OperationContainerAccountableEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ChooseEditorLinkDescriptor> getOutgoingFeatureModelFacetLinks_OperationContainer_PartOf_4029(
			OperationContainer source) {
		LinkedList<ChooseEditorLinkDescriptor> result = new LinkedList<ChooseEditorLinkDescriptor>();
		for (Iterator<?> destinations = source.getPartOf().iterator(); destinations
				.hasNext();) {
			OperationContainer destination = (OperationContainer) destinations
					.next();
			result.add(new ChooseEditorLinkDescriptor(source, destination,
					ChooseEditorElementTypes.OperationContainerPartOf_4029,
					OperationContainerPartOfEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ChooseEditorLinkDescriptor> getOutgoingFeatureModelFacetLinks_OperationContainer_Includes_4030(
			OperationContainer source) {
		LinkedList<ChooseEditorLinkDescriptor> result = new LinkedList<ChooseEditorLinkDescriptor>();
		for (Iterator<?> destinations = source.getIncludes().iterator(); destinations
				.hasNext();) {
			OperationContainer destination = (OperationContainer) destinations
					.next();
			result.add(new ChooseEditorLinkDescriptor(source, destination,
					ChooseEditorElementTypes.OperationContainerIncludes_4030,
					OperationContainerIncludesEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ChooseEditorLinkDescriptor> getOutgoingFeatureModelFacetLinks_OperationContainer_Operationalizes_4031(
			OperationContainer source) {
		LinkedList<ChooseEditorLinkDescriptor> result = new LinkedList<ChooseEditorLinkDescriptor>();
		for (Iterator<?> destinations = source.getOperationalizes().iterator(); destinations
				.hasNext();) {
			Goal destination = (Goal) destinations.next();
			result.add(new ChooseEditorLinkDescriptor(
					source,
					destination,
					ChooseEditorElementTypes.OperationContainerOperationalizes_4031,
					OperationContainerOperationalizesEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ChooseEditorLinkDescriptor> getOutgoingFeatureModelFacetLinks_OperationContainer_Output_4032(
			OperationContainer source) {
		LinkedList<ChooseEditorLinkDescriptor> result = new LinkedList<ChooseEditorLinkDescriptor>();
		for (Iterator<?> destinations = source.getOutput().iterator(); destinations
				.hasNext();) {
			Object destination = (Object) destinations.next();
			result.add(new ChooseEditorLinkDescriptor(source, destination,
					ChooseEditorElementTypes.OperationContainerOutput_4032,
					OperationContainerOutputEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ChooseEditorLinkDescriptor> getOutgoingFeatureModelFacetLinks_OperationContainer_Input_4033(
			OperationContainer source) {
		LinkedList<ChooseEditorLinkDescriptor> result = new LinkedList<ChooseEditorLinkDescriptor>();
		for (Iterator<?> destinations = source.getInput().iterator(); destinations
				.hasNext();) {
			Object destination = (Object) destinations.next();
			result.add(new ChooseEditorLinkDescriptor(source, destination,
					ChooseEditorElementTypes.OperationContainerInput_4033,
					OperationContainerInputEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ChooseEditorLinkDescriptor> getOutgoingFeatureModelFacetLinks_Object_ConcernsGoals_4038(
			Object source) {
		LinkedList<ChooseEditorLinkDescriptor> result = new LinkedList<ChooseEditorLinkDescriptor>();
		for (Iterator<?> destinations = source.getConcernsGoals().iterator(); destinations
				.hasNext();) {
			Goal destination = (Goal) destinations.next();
			result.add(new ChooseEditorLinkDescriptor(source, destination,
					ChooseEditorElementTypes.ObjectConcernsGoals_4038,
					ObjectConcernsGoalsEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ChooseEditorLinkDescriptor> getOutgoingFeatureModelFacetLinks_Object_MonitoredBy_4034(
			Object source) {
		LinkedList<ChooseEditorLinkDescriptor> result = new LinkedList<ChooseEditorLinkDescriptor>();
		for (Iterator<?> destinations = source.getMonitoredBy().iterator(); destinations
				.hasNext();) {
			ActorContainer destination = (ActorContainer) destinations.next();
			result.add(new ChooseEditorLinkDescriptor(source, destination,
					ChooseEditorElementTypes.ObjectMonitoredBy_4034,
					ObjectMonitoredByEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ChooseEditorLinkDescriptor> getOutgoingFeatureModelFacetLinks_Object_InputFor_4036(
			Object source) {
		LinkedList<ChooseEditorLinkDescriptor> result = new LinkedList<ChooseEditorLinkDescriptor>();
		for (Iterator<?> destinations = source.getInputFor().iterator(); destinations
				.hasNext();) {
			OperationContainer destination = (OperationContainer) destinations
					.next();
			result.add(new ChooseEditorLinkDescriptor(source, destination,
					ChooseEditorElementTypes.ObjectInputFor_4036,
					ObjectInputForEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ChooseEditorLinkDescriptor> getOutgoingFeatureModelFacetLinks_Object_OutputOf_4037(
			Object source) {
		LinkedList<ChooseEditorLinkDescriptor> result = new LinkedList<ChooseEditorLinkDescriptor>();
		for (Iterator<?> destinations = source.getOutputOf().iterator(); destinations
				.hasNext();) {
			OperationContainer destination = (OperationContainer) destinations
					.next();
			result.add(new ChooseEditorLinkDescriptor(source, destination,
					ChooseEditorElementTypes.ObjectOutputOf_4037,
					ObjectOutputOfEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ChooseEditorLinkDescriptor> getOutgoingFeatureModelFacetLinks_Object_ControlledBy_4035(
			Object source) {
		LinkedList<ChooseEditorLinkDescriptor> result = new LinkedList<ChooseEditorLinkDescriptor>();
		for (Iterator<?> destinations = source.getControlledBy().iterator(); destinations
				.hasNext();) {
			ActorContainer destination = (ActorContainer) destinations.next();
			result.add(new ChooseEditorLinkDescriptor(source, destination,
					ChooseEditorElementTypes.ObjectControlledBy_4035,
					ObjectControlledByEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ChooseEditorLinkDescriptor> getOutgoingFeatureModelFacetLinks_Object_Associates_4039(
			Object source) {
		LinkedList<ChooseEditorLinkDescriptor> result = new LinkedList<ChooseEditorLinkDescriptor>();
		for (Iterator<?> destinations = source.getAssociates().iterator(); destinations
				.hasNext();) {
			Object destination = (Object) destinations.next();
			result.add(new ChooseEditorLinkDescriptor(source, destination,
					ChooseEditorElementTypes.ObjectAssociates_4039,
					ObjectAssociatesEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ChooseEditorLinkDescriptor> getOutgoingFeatureModelFacetLinks_Object_Associated_4040(
			Object source) {
		LinkedList<ChooseEditorLinkDescriptor> result = new LinkedList<ChooseEditorLinkDescriptor>();
		for (Iterator<?> destinations = source.getAssociated().iterator(); destinations
				.hasNext();) {
			Object destination = (Object) destinations.next();
			result.add(new ChooseEditorLinkDescriptor(source, destination,
					ChooseEditorElementTypes.ObjectAssociated_4040,
					ObjectAssociatedEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ChooseEditorLinkDescriptor> getOutgoingFeatureModelFacetLinks_Object_Specialization_4041(
			Object source) {
		LinkedList<ChooseEditorLinkDescriptor> result = new LinkedList<ChooseEditorLinkDescriptor>();
		for (Iterator<?> destinations = source.getSpecialization().iterator(); destinations
				.hasNext();) {
			Object destination = (Object) destinations.next();
			result.add(new ChooseEditorLinkDescriptor(source, destination,
					ChooseEditorElementTypes.ObjectSpecialization_4041,
					ObjectSpecializationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ChooseEditorLinkDescriptor> getOutgoingFeatureModelFacetLinks_Object_SpecializedBy_4042(
			Object source) {
		LinkedList<ChooseEditorLinkDescriptor> result = new LinkedList<ChooseEditorLinkDescriptor>();
		for (Iterator<?> destinations = source.getSpecializedBy().iterator(); destinations
				.hasNext();) {
			Object destination = (Object) destinations.next();
			result.add(new ChooseEditorLinkDescriptor(source, destination,
					ChooseEditorElementTypes.ObjectSpecializedBy_4042,
					ObjectSpecializedByEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ChooseEditorLinkDescriptor> getOutgoingFeatureModelFacetLinks_Object_PartOf_4043(
			Object source) {
		LinkedList<ChooseEditorLinkDescriptor> result = new LinkedList<ChooseEditorLinkDescriptor>();
		for (Iterator<?> destinations = source.getPartOf().iterator(); destinations
				.hasNext();) {
			Object destination = (Object) destinations.next();
			result.add(new ChooseEditorLinkDescriptor(source, destination,
					ChooseEditorElementTypes.ObjectPartOf_4043,
					ObjectPartOfEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ChooseEditorLinkDescriptor> getOutgoingFeatureModelFacetLinks_Object_Includes_4044(
			Object source) {
		LinkedList<ChooseEditorLinkDescriptor> result = new LinkedList<ChooseEditorLinkDescriptor>();
		for (Iterator<?> destinations = source.getIncludes().iterator(); destinations
				.hasNext();) {
			Object destination = (Object) destinations.next();
			result.add(new ChooseEditorLinkDescriptor(source, destination,
					ChooseEditorElementTypes.ObjectIncludes_4044,
					ObjectIncludesEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		 * @generated
		 */
		@Override
		public List<ChooseEditorNodeDescriptor> getSemanticChildren(View view) {
			return ChooseEditorDiagramUpdater.getSemanticChildren(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<ChooseEditorLinkDescriptor> getContainedLinks(View view) {
			return ChooseEditorDiagramUpdater.getContainedLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<ChooseEditorLinkDescriptor> getIncomingLinks(View view) {
			return ChooseEditorDiagramUpdater.getIncomingLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<ChooseEditorLinkDescriptor> getOutgoingLinks(View view) {
			return ChooseEditorDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
