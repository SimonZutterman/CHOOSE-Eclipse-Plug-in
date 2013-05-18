package CHOOSE.diagram.edit.policies;

import java.util.Iterator;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.View;

import CHOOSE.diagram.edit.commands.ActorContainerAccountableForCreateCommand;
import CHOOSE.diagram.edit.commands.ActorContainerAccountableForReorientCommand;
import CHOOSE.diagram.edit.commands.ActorContainerAssignmentsCreateCommand;
import CHOOSE.diagram.edit.commands.ActorContainerAssignmentsReorientCommand;
import CHOOSE.diagram.edit.commands.ActorContainerConsultedForCreateCommand;
import CHOOSE.diagram.edit.commands.ActorContainerConsultedForReorientCommand;
import CHOOSE.diagram.edit.commands.ActorContainerControlsCreateCommand;
import CHOOSE.diagram.edit.commands.ActorContainerControlsReorientCommand;
import CHOOSE.diagram.edit.commands.ActorContainerIncludesCreateCommand;
import CHOOSE.diagram.edit.commands.ActorContainerIncludesReorientCommand;
import CHOOSE.diagram.edit.commands.ActorContainerInformedForCreateCommand;
import CHOOSE.diagram.edit.commands.ActorContainerInformedForReorientCommand;
import CHOOSE.diagram.edit.commands.ActorContainerMonitorsCreateCommand;
import CHOOSE.diagram.edit.commands.ActorContainerMonitorsReorientCommand;
import CHOOSE.diagram.edit.commands.ActorContainerPartOfCreateCommand;
import CHOOSE.diagram.edit.commands.ActorContainerPartOfReorientCommand;
import CHOOSE.diagram.edit.commands.ActorContainerResponsibleForCreateCommand;
import CHOOSE.diagram.edit.commands.ActorContainerResponsibleForReorientCommand;
import CHOOSE.diagram.edit.commands.ActorContainerWishesCreateCommand;
import CHOOSE.diagram.edit.commands.ActorContainerWishesReorientCommand;
import CHOOSE.diagram.edit.commands.GoalAssignedToCreateCommand;
import CHOOSE.diagram.edit.commands.GoalAssignedToReorientCommand;
import CHOOSE.diagram.edit.commands.GoalWishedByCreateCommand;
import CHOOSE.diagram.edit.commands.GoalWishedByReorientCommand;
import CHOOSE.diagram.edit.commands.ObjectControlledByCreateCommand;
import CHOOSE.diagram.edit.commands.ObjectControlledByReorientCommand;
import CHOOSE.diagram.edit.commands.ObjectMonitoredByCreateCommand;
import CHOOSE.diagram.edit.commands.ObjectMonitoredByReorientCommand;
import CHOOSE.diagram.edit.commands.OperationContainerAccountableCreateCommand;
import CHOOSE.diagram.edit.commands.OperationContainerAccountableReorientCommand;
import CHOOSE.diagram.edit.commands.OperationContainerConsultCreateCommand;
import CHOOSE.diagram.edit.commands.OperationContainerConsultReorientCommand;
import CHOOSE.diagram.edit.commands.OperationContainerInformCreateCommand;
import CHOOSE.diagram.edit.commands.OperationContainerInformReorientCommand;
import CHOOSE.diagram.edit.commands.OperationContainerResponsibleCreateCommand;
import CHOOSE.diagram.edit.commands.OperationContainerResponsibleReorientCommand;
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
import CHOOSE.diagram.edit.parts.GoalAssignedToEditPart;
import CHOOSE.diagram.edit.parts.GoalWishedByEditPart;
import CHOOSE.diagram.edit.parts.ObjectControlledByEditPart;
import CHOOSE.diagram.edit.parts.ObjectMonitoredByEditPart;
import CHOOSE.diagram.edit.parts.OperationContainerAccountableEditPart;
import CHOOSE.diagram.edit.parts.OperationContainerConsultEditPart;
import CHOOSE.diagram.edit.parts.OperationContainerInformEditPart;
import CHOOSE.diagram.edit.parts.OperationContainerResponsibleEditPart;
import CHOOSE.diagram.part.ChooseEditorVisualIDRegistry;
import CHOOSE.diagram.providers.ChooseEditorElementTypes;

/**
 * @generated
 */
public class ActorItemSemanticEditPolicy extends
		ChooseEditorBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ActorItemSemanticEditPolicy() {
		super(ChooseEditorElementTypes.Actor_2003);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		View view = (View) getHost().getModel();
		CompositeTransactionalCommand cmd = new CompositeTransactionalCommand(
				getEditingDomain(), null);
		cmd.setTransactionNestingEnabled(false);
		for (Iterator<?> it = view.getTargetEdges().iterator(); it.hasNext();) {
			Edge incomingLink = (Edge) it.next();
			if (ChooseEditorVisualIDRegistry.getVisualID(incomingLink) == GoalAssignedToEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (ChooseEditorVisualIDRegistry.getVisualID(incomingLink) == GoalWishedByEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (ChooseEditorVisualIDRegistry.getVisualID(incomingLink) == ActorContainerPartOfEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (ChooseEditorVisualIDRegistry.getVisualID(incomingLink) == ActorContainerIncludesEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (ChooseEditorVisualIDRegistry.getVisualID(incomingLink) == OperationContainerResponsibleEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (ChooseEditorVisualIDRegistry.getVisualID(incomingLink) == OperationContainerInformEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (ChooseEditorVisualIDRegistry.getVisualID(incomingLink) == OperationContainerConsultEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (ChooseEditorVisualIDRegistry.getVisualID(incomingLink) == OperationContainerAccountableEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (ChooseEditorVisualIDRegistry.getVisualID(incomingLink) == ObjectMonitoredByEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (ChooseEditorVisualIDRegistry.getVisualID(incomingLink) == ObjectControlledByEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
		}
		for (Iterator<?> it = view.getSourceEdges().iterator(); it.hasNext();) {
			Edge outgoingLink = (Edge) it.next();
			if (ChooseEditorVisualIDRegistry.getVisualID(outgoingLink) == ActorContainerWishesEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (ChooseEditorVisualIDRegistry.getVisualID(outgoingLink) == ActorContainerConsultedForEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (ChooseEditorVisualIDRegistry.getVisualID(outgoingLink) == ActorContainerInformedForEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (ChooseEditorVisualIDRegistry.getVisualID(outgoingLink) == ActorContainerAssignmentsEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (ChooseEditorVisualIDRegistry.getVisualID(outgoingLink) == ActorContainerMonitorsEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (ChooseEditorVisualIDRegistry.getVisualID(outgoingLink) == ActorContainerControlsEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (ChooseEditorVisualIDRegistry.getVisualID(outgoingLink) == ActorContainerAccountableForEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (ChooseEditorVisualIDRegistry.getVisualID(outgoingLink) == ActorContainerResponsibleForEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (ChooseEditorVisualIDRegistry.getVisualID(outgoingLink) == ActorContainerPartOfEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (ChooseEditorVisualIDRegistry.getVisualID(outgoingLink) == ActorContainerIncludesEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
		}
		EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
		if (annotation == null) {
			// there are indirectly referenced children, need extra commands: false
			addDestroyShortcutsCommand(cmd, view);
			// delete host element
			cmd.add(new DestroyElementCommand(req));
		} else {
			cmd.add(new DeleteCommand(getEditingDomain(), view));
		}
		return getGEFWrapper(cmd.reduce());
	}

	/**
	 * @generated
	 */
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		Command command = req.getTarget() == null ? getStartCreateRelationshipCommand(req)
				: getCompleteCreateRelationshipCommand(req);
		return command != null ? command : super
				.getCreateRelationshipCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getStartCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (ChooseEditorElementTypes.GoalAssignedTo_4001 == req
				.getElementType()) {
			return null;
		}
		if (ChooseEditorElementTypes.GoalWishedBy_4002 == req.getElementType()) {
			return null;
		}
		if (ChooseEditorElementTypes.ActorContainerWishes_4018 == req
				.getElementType()) {
			return getGEFWrapper(new ActorContainerWishesCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (ChooseEditorElementTypes.ActorContainerConsultedFor_4012 == req
				.getElementType()) {
			return getGEFWrapper(new ActorContainerConsultedForCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (ChooseEditorElementTypes.ActorContainerInformedFor_4013 == req
				.getElementType()) {
			return getGEFWrapper(new ActorContainerInformedForCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (ChooseEditorElementTypes.ActorContainerAssignments_4011 == req
				.getElementType()) {
			return getGEFWrapper(new ActorContainerAssignmentsCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (ChooseEditorElementTypes.ActorContainerMonitors_4019 == req
				.getElementType()) {
			return getGEFWrapper(new ActorContainerMonitorsCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (ChooseEditorElementTypes.ActorContainerControls_4020 == req
				.getElementType()) {
			return getGEFWrapper(new ActorContainerControlsCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (ChooseEditorElementTypes.ActorContainerAccountableFor_4021 == req
				.getElementType()) {
			return getGEFWrapper(new ActorContainerAccountableForCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (ChooseEditorElementTypes.ActorContainerResponsibleFor_4022 == req
				.getElementType()) {
			return getGEFWrapper(new ActorContainerResponsibleForCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (ChooseEditorElementTypes.ActorContainerPartOf_4023 == req
				.getElementType()) {
			return getGEFWrapper(new ActorContainerPartOfCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (ChooseEditorElementTypes.ActorContainerIncludes_4024 == req
				.getElementType()) {
			return getGEFWrapper(new ActorContainerIncludesCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (ChooseEditorElementTypes.OperationContainerResponsible_4025 == req
				.getElementType()) {
			return null;
		}
		if (ChooseEditorElementTypes.OperationContainerInform_4027 == req
				.getElementType()) {
			return null;
		}
		if (ChooseEditorElementTypes.OperationContainerConsult_4026 == req
				.getElementType()) {
			return null;
		}
		if (ChooseEditorElementTypes.OperationContainerAccountable_4028 == req
				.getElementType()) {
			return null;
		}
		if (ChooseEditorElementTypes.ObjectMonitoredBy_4034 == req
				.getElementType()) {
			return null;
		}
		if (ChooseEditorElementTypes.ObjectControlledBy_4035 == req
				.getElementType()) {
			return null;
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (ChooseEditorElementTypes.GoalAssignedTo_4001 == req
				.getElementType()) {
			return getGEFWrapper(new GoalAssignedToCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (ChooseEditorElementTypes.GoalWishedBy_4002 == req.getElementType()) {
			return getGEFWrapper(new GoalWishedByCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (ChooseEditorElementTypes.ActorContainerWishes_4018 == req
				.getElementType()) {
			return null;
		}
		if (ChooseEditorElementTypes.ActorContainerConsultedFor_4012 == req
				.getElementType()) {
			return null;
		}
		if (ChooseEditorElementTypes.ActorContainerInformedFor_4013 == req
				.getElementType()) {
			return null;
		}
		if (ChooseEditorElementTypes.ActorContainerAssignments_4011 == req
				.getElementType()) {
			return null;
		}
		if (ChooseEditorElementTypes.ActorContainerMonitors_4019 == req
				.getElementType()) {
			return null;
		}
		if (ChooseEditorElementTypes.ActorContainerControls_4020 == req
				.getElementType()) {
			return null;
		}
		if (ChooseEditorElementTypes.ActorContainerAccountableFor_4021 == req
				.getElementType()) {
			return null;
		}
		if (ChooseEditorElementTypes.ActorContainerResponsibleFor_4022 == req
				.getElementType()) {
			return null;
		}
		if (ChooseEditorElementTypes.ActorContainerPartOf_4023 == req
				.getElementType()) {
			return getGEFWrapper(new ActorContainerPartOfCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (ChooseEditorElementTypes.ActorContainerIncludes_4024 == req
				.getElementType()) {
			return getGEFWrapper(new ActorContainerIncludesCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (ChooseEditorElementTypes.OperationContainerResponsible_4025 == req
				.getElementType()) {
			return getGEFWrapper(new OperationContainerResponsibleCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (ChooseEditorElementTypes.OperationContainerInform_4027 == req
				.getElementType()) {
			return getGEFWrapper(new OperationContainerInformCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (ChooseEditorElementTypes.OperationContainerConsult_4026 == req
				.getElementType()) {
			return getGEFWrapper(new OperationContainerConsultCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (ChooseEditorElementTypes.OperationContainerAccountable_4028 == req
				.getElementType()) {
			return getGEFWrapper(new OperationContainerAccountableCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (ChooseEditorElementTypes.ObjectMonitoredBy_4034 == req
				.getElementType()) {
			return getGEFWrapper(new ObjectMonitoredByCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (ChooseEditorElementTypes.ObjectControlledBy_4035 == req
				.getElementType()) {
			return getGEFWrapper(new ObjectControlledByCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * Returns command to reorient EReference based link. New link target or source
	 * should be the domain model element associated with this node.
	 * 
	 * @generated
	 */
	protected Command getReorientReferenceRelationshipCommand(
			ReorientReferenceRelationshipRequest req) {
		switch (getVisualID(req)) {
		case GoalAssignedToEditPart.VISUAL_ID:
			return getGEFWrapper(new GoalAssignedToReorientCommand(req));
		case GoalWishedByEditPart.VISUAL_ID:
			return getGEFWrapper(new GoalWishedByReorientCommand(req));
		case ActorContainerWishesEditPart.VISUAL_ID:
			return getGEFWrapper(new ActorContainerWishesReorientCommand(req));
		case ActorContainerConsultedForEditPart.VISUAL_ID:
			return getGEFWrapper(new ActorContainerConsultedForReorientCommand(
					req));
		case ActorContainerInformedForEditPart.VISUAL_ID:
			return getGEFWrapper(new ActorContainerInformedForReorientCommand(
					req));
		case ActorContainerAssignmentsEditPart.VISUAL_ID:
			return getGEFWrapper(new ActorContainerAssignmentsReorientCommand(
					req));
		case ActorContainerMonitorsEditPart.VISUAL_ID:
			return getGEFWrapper(new ActorContainerMonitorsReorientCommand(req));
		case ActorContainerControlsEditPart.VISUAL_ID:
			return getGEFWrapper(new ActorContainerControlsReorientCommand(req));
		case ActorContainerAccountableForEditPart.VISUAL_ID:
			return getGEFWrapper(new ActorContainerAccountableForReorientCommand(
					req));
		case ActorContainerResponsibleForEditPart.VISUAL_ID:
			return getGEFWrapper(new ActorContainerResponsibleForReorientCommand(
					req));
		case ActorContainerPartOfEditPart.VISUAL_ID:
			return getGEFWrapper(new ActorContainerPartOfReorientCommand(req));
		case ActorContainerIncludesEditPart.VISUAL_ID:
			return getGEFWrapper(new ActorContainerIncludesReorientCommand(req));
		case OperationContainerResponsibleEditPart.VISUAL_ID:
			return getGEFWrapper(new OperationContainerResponsibleReorientCommand(
					req));
		case OperationContainerInformEditPart.VISUAL_ID:
			return getGEFWrapper(new OperationContainerInformReorientCommand(
					req));
		case OperationContainerConsultEditPart.VISUAL_ID:
			return getGEFWrapper(new OperationContainerConsultReorientCommand(
					req));
		case OperationContainerAccountableEditPart.VISUAL_ID:
			return getGEFWrapper(new OperationContainerAccountableReorientCommand(
					req));
		case ObjectMonitoredByEditPart.VISUAL_ID:
			return getGEFWrapper(new ObjectMonitoredByReorientCommand(req));
		case ObjectControlledByEditPart.VISUAL_ID:
			return getGEFWrapper(new ObjectControlledByReorientCommand(req));
		}
		return super.getReorientReferenceRelationshipCommand(req);
	}

}
