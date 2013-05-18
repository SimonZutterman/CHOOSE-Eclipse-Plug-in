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

import CHOOSE.diagram.edit.commands.ActorContainerAssignmentsCreateCommand;
import CHOOSE.diagram.edit.commands.ActorContainerAssignmentsReorientCommand;
import CHOOSE.diagram.edit.commands.ActorContainerWishesCreateCommand;
import CHOOSE.diagram.edit.commands.ActorContainerWishesReorientCommand;
import CHOOSE.diagram.edit.commands.GoalAndCreateCommand;
import CHOOSE.diagram.edit.commands.GoalAndReorientCommand;
import CHOOSE.diagram.edit.commands.GoalAssignedToCreateCommand;
import CHOOSE.diagram.edit.commands.GoalAssignedToReorientCommand;
import CHOOSE.diagram.edit.commands.GoalConcernsObjectsCreateCommand;
import CHOOSE.diagram.edit.commands.GoalConcernsObjectsReorientCommand;
import CHOOSE.diagram.edit.commands.GoalConflictedCreateCommand;
import CHOOSE.diagram.edit.commands.GoalConflictedReorientCommand;
import CHOOSE.diagram.edit.commands.GoalConflictsCreateCommand;
import CHOOSE.diagram.edit.commands.GoalConflictsReorientCommand;
import CHOOSE.diagram.edit.commands.GoalOperationalizedByCreateCommand;
import CHOOSE.diagram.edit.commands.GoalOperationalizedByReorientCommand;
import CHOOSE.diagram.edit.commands.GoalOrCreateCommand;
import CHOOSE.diagram.edit.commands.GoalOrReorientCommand;
import CHOOSE.diagram.edit.commands.GoalWishedByCreateCommand;
import CHOOSE.diagram.edit.commands.GoalWishedByReorientCommand;
import CHOOSE.diagram.edit.commands.ObjectConcernsGoalsCreateCommand;
import CHOOSE.diagram.edit.commands.ObjectConcernsGoalsReorientCommand;
import CHOOSE.diagram.edit.commands.OperationContainerOperationalizesCreateCommand;
import CHOOSE.diagram.edit.commands.OperationContainerOperationalizesReorientCommand;
import CHOOSE.diagram.edit.commands.RefinementSubgoalsCreateCommand;
import CHOOSE.diagram.edit.commands.RefinementSubgoalsReorientCommand;
import CHOOSE.diagram.edit.commands.RefinementSupergoalCreateCommand;
import CHOOSE.diagram.edit.commands.RefinementSupergoalReorientCommand;
import CHOOSE.diagram.edit.parts.ActorContainerAssignmentsEditPart;
import CHOOSE.diagram.edit.parts.ActorContainerWishesEditPart;
import CHOOSE.diagram.edit.parts.GoalAndEditPart;
import CHOOSE.diagram.edit.parts.GoalAssignedToEditPart;
import CHOOSE.diagram.edit.parts.GoalConcernsObjectsEditPart;
import CHOOSE.diagram.edit.parts.GoalConflictedEditPart;
import CHOOSE.diagram.edit.parts.GoalConflictsEditPart;
import CHOOSE.diagram.edit.parts.GoalOperationalizedByEditPart;
import CHOOSE.diagram.edit.parts.GoalOrEditPart;
import CHOOSE.diagram.edit.parts.GoalWishedByEditPart;
import CHOOSE.diagram.edit.parts.ObjectConcernsGoalsEditPart;
import CHOOSE.diagram.edit.parts.OperationContainerOperationalizesEditPart;
import CHOOSE.diagram.edit.parts.RefinementSubgoalsEditPart;
import CHOOSE.diagram.edit.parts.RefinementSupergoalEditPart;
import CHOOSE.diagram.part.ChooseEditorVisualIDRegistry;
import CHOOSE.diagram.providers.ChooseEditorElementTypes;

/**
 * @generated
 */
public class GoalItemSemanticEditPolicy extends
		ChooseEditorBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public GoalItemSemanticEditPolicy() {
		super(ChooseEditorElementTypes.Goal_2001);
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
			if (ChooseEditorVisualIDRegistry.getVisualID(incomingLink) == GoalConflictedEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (ChooseEditorVisualIDRegistry.getVisualID(incomingLink) == GoalConflictsEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (ChooseEditorVisualIDRegistry.getVisualID(incomingLink) == RefinementSupergoalEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (ChooseEditorVisualIDRegistry.getVisualID(incomingLink) == RefinementSubgoalsEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (ChooseEditorVisualIDRegistry.getVisualID(incomingLink) == ActorContainerWishesEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (ChooseEditorVisualIDRegistry.getVisualID(incomingLink) == ActorContainerAssignmentsEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (ChooseEditorVisualIDRegistry.getVisualID(incomingLink) == OperationContainerOperationalizesEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (ChooseEditorVisualIDRegistry.getVisualID(incomingLink) == ObjectConcernsGoalsEditPart.VISUAL_ID) {
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
			if (ChooseEditorVisualIDRegistry.getVisualID(outgoingLink) == GoalAssignedToEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (ChooseEditorVisualIDRegistry.getVisualID(outgoingLink) == GoalWishedByEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (ChooseEditorVisualIDRegistry.getVisualID(outgoingLink) == GoalOrEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (ChooseEditorVisualIDRegistry.getVisualID(outgoingLink) == GoalAndEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (ChooseEditorVisualIDRegistry.getVisualID(outgoingLink) == GoalConflictedEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (ChooseEditorVisualIDRegistry.getVisualID(outgoingLink) == GoalConflictsEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (ChooseEditorVisualIDRegistry.getVisualID(outgoingLink) == GoalConcernsObjectsEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (ChooseEditorVisualIDRegistry.getVisualID(outgoingLink) == GoalOperationalizedByEditPart.VISUAL_ID) {
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
			return getGEFWrapper(new GoalAssignedToCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (ChooseEditorElementTypes.GoalWishedBy_4002 == req.getElementType()) {
			return getGEFWrapper(new GoalWishedByCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (ChooseEditorElementTypes.GoalOr_4003 == req.getElementType()) {
			return getGEFWrapper(new GoalOrCreateCommand(req, req.getSource(),
					req.getTarget()));
		}
		if (ChooseEditorElementTypes.GoalAnd_4004 == req.getElementType()) {
			return getGEFWrapper(new GoalAndCreateCommand(req, req.getSource(),
					req.getTarget()));
		}
		if (ChooseEditorElementTypes.GoalConflicted_4005 == req
				.getElementType()) {
			return getGEFWrapper(new GoalConflictedCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (ChooseEditorElementTypes.GoalConflicts_4006 == req.getElementType()) {
			return getGEFWrapper(new GoalConflictsCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (ChooseEditorElementTypes.GoalConcernsObjects_4007 == req
				.getElementType()) {
			return getGEFWrapper(new GoalConcernsObjectsCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (ChooseEditorElementTypes.GoalOperationalizedBy_4008 == req
				.getElementType()) {
			return getGEFWrapper(new GoalOperationalizedByCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (ChooseEditorElementTypes.RefinementSupergoal_4009 == req
				.getElementType()) {
			return null;
		}
		if (ChooseEditorElementTypes.RefinementSubgoals_4010 == req
				.getElementType()) {
			return null;
		}
		if (ChooseEditorElementTypes.ActorContainerWishes_4018 == req
				.getElementType()) {
			return null;
		}
		if (ChooseEditorElementTypes.ActorContainerAssignments_4011 == req
				.getElementType()) {
			return null;
		}
		if (ChooseEditorElementTypes.OperationContainerOperationalizes_4031 == req
				.getElementType()) {
			return null;
		}
		if (ChooseEditorElementTypes.ObjectConcernsGoals_4038 == req
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
			return null;
		}
		if (ChooseEditorElementTypes.GoalWishedBy_4002 == req.getElementType()) {
			return null;
		}
		if (ChooseEditorElementTypes.GoalOr_4003 == req.getElementType()) {
			return null;
		}
		if (ChooseEditorElementTypes.GoalAnd_4004 == req.getElementType()) {
			return null;
		}
		if (ChooseEditorElementTypes.GoalConflicted_4005 == req
				.getElementType()) {
			return getGEFWrapper(new GoalConflictedCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (ChooseEditorElementTypes.GoalConflicts_4006 == req.getElementType()) {
			return getGEFWrapper(new GoalConflictsCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (ChooseEditorElementTypes.GoalConcernsObjects_4007 == req
				.getElementType()) {
			return null;
		}
		if (ChooseEditorElementTypes.GoalOperationalizedBy_4008 == req
				.getElementType()) {
			return null;
		}
		if (ChooseEditorElementTypes.RefinementSupergoal_4009 == req
				.getElementType()) {
			return getGEFWrapper(new RefinementSupergoalCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (ChooseEditorElementTypes.RefinementSubgoals_4010 == req
				.getElementType()) {
			return getGEFWrapper(new RefinementSubgoalsCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (ChooseEditorElementTypes.ActorContainerWishes_4018 == req
				.getElementType()) {
			return getGEFWrapper(new ActorContainerWishesCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (ChooseEditorElementTypes.ActorContainerAssignments_4011 == req
				.getElementType()) {
			return getGEFWrapper(new ActorContainerAssignmentsCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (ChooseEditorElementTypes.OperationContainerOperationalizes_4031 == req
				.getElementType()) {
			return getGEFWrapper(new OperationContainerOperationalizesCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (ChooseEditorElementTypes.ObjectConcernsGoals_4038 == req
				.getElementType()) {
			return getGEFWrapper(new ObjectConcernsGoalsCreateCommand(req,
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
		case GoalOrEditPart.VISUAL_ID:
			return getGEFWrapper(new GoalOrReorientCommand(req));
		case GoalAndEditPart.VISUAL_ID:
			return getGEFWrapper(new GoalAndReorientCommand(req));
		case GoalConflictedEditPart.VISUAL_ID:
			return getGEFWrapper(new GoalConflictedReorientCommand(req));
		case GoalConflictsEditPart.VISUAL_ID:
			return getGEFWrapper(new GoalConflictsReorientCommand(req));
		case GoalConcernsObjectsEditPart.VISUAL_ID:
			return getGEFWrapper(new GoalConcernsObjectsReorientCommand(req));
		case GoalOperationalizedByEditPart.VISUAL_ID:
			return getGEFWrapper(new GoalOperationalizedByReorientCommand(req));
		case RefinementSupergoalEditPart.VISUAL_ID:
			return getGEFWrapper(new RefinementSupergoalReorientCommand(req));
		case RefinementSubgoalsEditPart.VISUAL_ID:
			return getGEFWrapper(new RefinementSubgoalsReorientCommand(req));
		case ActorContainerWishesEditPart.VISUAL_ID:
			return getGEFWrapper(new ActorContainerWishesReorientCommand(req));
		case ActorContainerAssignmentsEditPart.VISUAL_ID:
			return getGEFWrapper(new ActorContainerAssignmentsReorientCommand(
					req));
		case OperationContainerOperationalizesEditPart.VISUAL_ID:
			return getGEFWrapper(new OperationContainerOperationalizesReorientCommand(
					req));
		case ObjectConcernsGoalsEditPart.VISUAL_ID:
			return getGEFWrapper(new ObjectConcernsGoalsReorientCommand(req));
		}
		return super.getReorientReferenceRelationshipCommand(req);
	}

}
