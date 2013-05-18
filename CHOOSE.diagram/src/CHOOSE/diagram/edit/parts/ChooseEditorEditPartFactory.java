package CHOOSE.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

import CHOOSE.diagram.part.ChooseEditorVisualIDRegistry;

/**
 * @generated
 */
public class ChooseEditorEditPartFactory implements EditPartFactory {

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (ChooseEditorVisualIDRegistry.getVisualID(view)) {

			case DiagramEditPart.VISUAL_ID:
				return new DiagramEditPart(view);

			case GoalEditPart.VISUAL_ID:
				return new GoalEditPart(view);

			case GoalNameEditPart.VISUAL_ID:
				return new GoalNameEditPart(view);

			case RefinementEditPart.VISUAL_ID:
				return new RefinementEditPart(view);

			case ActorEditPart.VISUAL_ID:
				return new ActorEditPart(view);

			case ActorNameEditPart.VISUAL_ID:
				return new ActorNameEditPart(view);

			case HumanActorEditPart.VISUAL_ID:
				return new HumanActorEditPart(view);

			case HumanActorNameEditPart.VISUAL_ID:
				return new HumanActorNameEditPart(view);

			case RoleEditPart.VISUAL_ID:
				return new RoleEditPart(view);

			case RoleNameEditPart.VISUAL_ID:
				return new RoleNameEditPart(view);

			case SoftwareActorEditPart.VISUAL_ID:
				return new SoftwareActorEditPart(view);

			case SoftwareActorNameEditPart.VISUAL_ID:
				return new SoftwareActorNameEditPart(view);

			case DeviceEditPart.VISUAL_ID:
				return new DeviceEditPart(view);

			case DeviceNameEditPart.VISUAL_ID:
				return new DeviceNameEditPart(view);

			case OperationEditPart.VISUAL_ID:
				return new OperationEditPart(view);

			case OperationNameEditPart.VISUAL_ID:
				return new OperationNameEditPart(view);

			case ProcessEditPart.VISUAL_ID:
				return new ProcessEditPart(view);

			case ProcessNameEditPart.VISUAL_ID:
				return new ProcessNameEditPart(view);

			case ProjectEditPart.VISUAL_ID:
				return new ProjectEditPart(view);

			case ProjectNameEditPart.VISUAL_ID:
				return new ProjectNameEditPart(view);

			case ObjectEditPart.VISUAL_ID:
				return new ObjectEditPart(view);

			case ObjectNameEditPart.VISUAL_ID:
				return new ObjectNameEditPart(view);

			case GoalAssignedToEditPart.VISUAL_ID:
				return new GoalAssignedToEditPart(view);

			case GoalWishedByEditPart.VISUAL_ID:
				return new GoalWishedByEditPart(view);

			case GoalOrEditPart.VISUAL_ID:
				return new GoalOrEditPart(view);

			case GoalAndEditPart.VISUAL_ID:
				return new GoalAndEditPart(view);

			case GoalConflictedEditPart.VISUAL_ID:
				return new GoalConflictedEditPart(view);

			case GoalConflictsEditPart.VISUAL_ID:
				return new GoalConflictsEditPart(view);

			case GoalConcernsObjectsEditPart.VISUAL_ID:
				return new GoalConcernsObjectsEditPart(view);

			case GoalOperationalizedByEditPart.VISUAL_ID:
				return new GoalOperationalizedByEditPart(view);

			case RefinementSupergoalEditPart.VISUAL_ID:
				return new RefinementSupergoalEditPart(view);

			case RefinementSubgoalsEditPart.VISUAL_ID:
				return new RefinementSubgoalsEditPart(view);

			case ActorContainerWishesEditPart.VISUAL_ID:
				return new ActorContainerWishesEditPart(view);

			case ActorContainerConsultedForEditPart.VISUAL_ID:
				return new ActorContainerConsultedForEditPart(view);

			case ActorContainerInformedForEditPart.VISUAL_ID:
				return new ActorContainerInformedForEditPart(view);

			case HumanActorSupervisorsEditPart.VISUAL_ID:
				return new HumanActorSupervisorsEditPart(view);

			case HumanActorSuperviseesEditPart.VISUAL_ID:
				return new HumanActorSuperviseesEditPart(view);

			case ActorContainerAssignmentsEditPart.VISUAL_ID:
				return new ActorContainerAssignmentsEditPart(view);

			case RolePerformedByEditPart.VISUAL_ID:
				return new RolePerformedByEditPart(view);

			case HumanActorPerformsEditPart.VISUAL_ID:
				return new HumanActorPerformsEditPart(view);

			case ActorContainerMonitorsEditPart.VISUAL_ID:
				return new ActorContainerMonitorsEditPart(view);

			case ActorContainerControlsEditPart.VISUAL_ID:
				return new ActorContainerControlsEditPart(view);

			case ActorContainerAccountableForEditPart.VISUAL_ID:
				return new ActorContainerAccountableForEditPart(view);

			case ActorContainerResponsibleForEditPart.VISUAL_ID:
				return new ActorContainerResponsibleForEditPart(view);

			case ActorContainerPartOfEditPart.VISUAL_ID:
				return new ActorContainerPartOfEditPart(view);

			case ActorContainerIncludesEditPart.VISUAL_ID:
				return new ActorContainerIncludesEditPart(view);

			case OperationContainerResponsibleEditPart.VISUAL_ID:
				return new OperationContainerResponsibleEditPart(view);

			case OperationContainerInformEditPart.VISUAL_ID:
				return new OperationContainerInformEditPart(view);

			case OperationContainerConsultEditPart.VISUAL_ID:
				return new OperationContainerConsultEditPart(view);

			case OperationContainerAccountableEditPart.VISUAL_ID:
				return new OperationContainerAccountableEditPart(view);

			case OperationContainerPartOfEditPart.VISUAL_ID:
				return new OperationContainerPartOfEditPart(view);

			case OperationContainerIncludesEditPart.VISUAL_ID:
				return new OperationContainerIncludesEditPart(view);

			case OperationContainerOperationalizesEditPart.VISUAL_ID:
				return new OperationContainerOperationalizesEditPart(view);

			case OperationContainerOutputEditPart.VISUAL_ID:
				return new OperationContainerOutputEditPart(view);

			case OperationContainerInputEditPart.VISUAL_ID:
				return new OperationContainerInputEditPart(view);

			case ObjectConcernsGoalsEditPart.VISUAL_ID:
				return new ObjectConcernsGoalsEditPart(view);

			case ObjectMonitoredByEditPart.VISUAL_ID:
				return new ObjectMonitoredByEditPart(view);

			case ObjectInputForEditPart.VISUAL_ID:
				return new ObjectInputForEditPart(view);

			case ObjectOutputOfEditPart.VISUAL_ID:
				return new ObjectOutputOfEditPart(view);

			case ObjectControlledByEditPart.VISUAL_ID:
				return new ObjectControlledByEditPart(view);

			case ObjectAssociatesEditPart.VISUAL_ID:
				return new ObjectAssociatesEditPart(view);

			case ObjectAssociatedEditPart.VISUAL_ID:
				return new ObjectAssociatedEditPart(view);

			case ObjectSpecializationEditPart.VISUAL_ID:
				return new ObjectSpecializationEditPart(view);

			case ObjectSpecializedByEditPart.VISUAL_ID:
				return new ObjectSpecializedByEditPart(view);

			case ObjectPartOfEditPart.VISUAL_ID:
				return new ObjectPartOfEditPart(view);

			case ObjectIncludesEditPart.VISUAL_ID:
				return new ObjectIncludesEditPart(view);

			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	 * @generated
	 */
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	 * @generated
	 */
	public static CellEditorLocator getTextCellEditorLocator(
			ITextAwareEditPart source) {
		return CellEditorLocatorAccess.INSTANCE
				.getTextCellEditorLocator(source);
	}

}
