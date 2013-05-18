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

import CHOOSE.diagram.edit.commands.GoalAndCreateCommand;
import CHOOSE.diagram.edit.commands.GoalAndReorientCommand;
import CHOOSE.diagram.edit.commands.GoalOrCreateCommand;
import CHOOSE.diagram.edit.commands.GoalOrReorientCommand;
import CHOOSE.diagram.edit.commands.RefinementSubgoalsCreateCommand;
import CHOOSE.diagram.edit.commands.RefinementSubgoalsReorientCommand;
import CHOOSE.diagram.edit.commands.RefinementSupergoalCreateCommand;
import CHOOSE.diagram.edit.commands.RefinementSupergoalReorientCommand;
import CHOOSE.diagram.edit.parts.GoalAndEditPart;
import CHOOSE.diagram.edit.parts.GoalOrEditPart;
import CHOOSE.diagram.edit.parts.RefinementSubgoalsEditPart;
import CHOOSE.diagram.edit.parts.RefinementSupergoalEditPart;
import CHOOSE.diagram.part.ChooseEditorVisualIDRegistry;
import CHOOSE.diagram.providers.ChooseEditorElementTypes;

/**
 * @generated
 */
public class RefinementItemSemanticEditPolicy extends
		ChooseEditorBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public RefinementItemSemanticEditPolicy() {
		super(ChooseEditorElementTypes.Refinement_2002);
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
			if (ChooseEditorVisualIDRegistry.getVisualID(incomingLink) == GoalOrEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (ChooseEditorVisualIDRegistry.getVisualID(incomingLink) == GoalAndEditPart.VISUAL_ID) {
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
			if (ChooseEditorVisualIDRegistry.getVisualID(outgoingLink) == RefinementSupergoalEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (ChooseEditorVisualIDRegistry.getVisualID(outgoingLink) == RefinementSubgoalsEditPart.VISUAL_ID) {
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
		if (ChooseEditorElementTypes.GoalOr_4003 == req.getElementType()) {
			return null;
		}
		if (ChooseEditorElementTypes.GoalAnd_4004 == req.getElementType()) {
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
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (ChooseEditorElementTypes.GoalOr_4003 == req.getElementType()) {
			return getGEFWrapper(new GoalOrCreateCommand(req, req.getSource(),
					req.getTarget()));
		}
		if (ChooseEditorElementTypes.GoalAnd_4004 == req.getElementType()) {
			return getGEFWrapper(new GoalAndCreateCommand(req, req.getSource(),
					req.getTarget()));
		}
		if (ChooseEditorElementTypes.RefinementSupergoal_4009 == req
				.getElementType()) {
			return null;
		}
		if (ChooseEditorElementTypes.RefinementSubgoals_4010 == req
				.getElementType()) {
			return null;
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
		case GoalOrEditPart.VISUAL_ID:
			return getGEFWrapper(new GoalOrReorientCommand(req));
		case GoalAndEditPart.VISUAL_ID:
			return getGEFWrapper(new GoalAndReorientCommand(req));
		case RefinementSupergoalEditPart.VISUAL_ID:
			return getGEFWrapper(new RefinementSupergoalReorientCommand(req));
		case RefinementSubgoalsEditPart.VISUAL_ID:
			return getGEFWrapper(new RefinementSubgoalsReorientCommand(req));
		}
		return super.getReorientReferenceRelationshipCommand(req);
	}

}
