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

import CHOOSE.diagram.edit.commands.ActorContainerControlsCreateCommand;
import CHOOSE.diagram.edit.commands.ActorContainerControlsReorientCommand;
import CHOOSE.diagram.edit.commands.ActorContainerMonitorsCreateCommand;
import CHOOSE.diagram.edit.commands.ActorContainerMonitorsReorientCommand;
import CHOOSE.diagram.edit.commands.GoalConcernsObjectsCreateCommand;
import CHOOSE.diagram.edit.commands.GoalConcernsObjectsReorientCommand;
import CHOOSE.diagram.edit.commands.ObjectAssociatedCreateCommand;
import CHOOSE.diagram.edit.commands.ObjectAssociatedReorientCommand;
import CHOOSE.diagram.edit.commands.ObjectAssociatesCreateCommand;
import CHOOSE.diagram.edit.commands.ObjectAssociatesReorientCommand;
import CHOOSE.diagram.edit.commands.ObjectConcernsGoalsCreateCommand;
import CHOOSE.diagram.edit.commands.ObjectConcernsGoalsReorientCommand;
import CHOOSE.diagram.edit.commands.ObjectControlledByCreateCommand;
import CHOOSE.diagram.edit.commands.ObjectControlledByReorientCommand;
import CHOOSE.diagram.edit.commands.ObjectIncludesCreateCommand;
import CHOOSE.diagram.edit.commands.ObjectIncludesReorientCommand;
import CHOOSE.diagram.edit.commands.ObjectInputForCreateCommand;
import CHOOSE.diagram.edit.commands.ObjectInputForReorientCommand;
import CHOOSE.diagram.edit.commands.ObjectMonitoredByCreateCommand;
import CHOOSE.diagram.edit.commands.ObjectMonitoredByReorientCommand;
import CHOOSE.diagram.edit.commands.ObjectOutputOfCreateCommand;
import CHOOSE.diagram.edit.commands.ObjectOutputOfReorientCommand;
import CHOOSE.diagram.edit.commands.ObjectPartOfCreateCommand;
import CHOOSE.diagram.edit.commands.ObjectPartOfReorientCommand;
import CHOOSE.diagram.edit.commands.ObjectSpecializationCreateCommand;
import CHOOSE.diagram.edit.commands.ObjectSpecializationReorientCommand;
import CHOOSE.diagram.edit.commands.ObjectSpecializedByCreateCommand;
import CHOOSE.diagram.edit.commands.ObjectSpecializedByReorientCommand;
import CHOOSE.diagram.edit.commands.OperationContainerInputCreateCommand;
import CHOOSE.diagram.edit.commands.OperationContainerInputReorientCommand;
import CHOOSE.diagram.edit.commands.OperationContainerOutputCreateCommand;
import CHOOSE.diagram.edit.commands.OperationContainerOutputReorientCommand;
import CHOOSE.diagram.edit.parts.ActorContainerControlsEditPart;
import CHOOSE.diagram.edit.parts.ActorContainerMonitorsEditPart;
import CHOOSE.diagram.edit.parts.GoalConcernsObjectsEditPart;
import CHOOSE.diagram.edit.parts.ObjectAssociatedEditPart;
import CHOOSE.diagram.edit.parts.ObjectAssociatesEditPart;
import CHOOSE.diagram.edit.parts.ObjectConcernsGoalsEditPart;
import CHOOSE.diagram.edit.parts.ObjectControlledByEditPart;
import CHOOSE.diagram.edit.parts.ObjectIncludesEditPart;
import CHOOSE.diagram.edit.parts.ObjectInputForEditPart;
import CHOOSE.diagram.edit.parts.ObjectMonitoredByEditPart;
import CHOOSE.diagram.edit.parts.ObjectOutputOfEditPart;
import CHOOSE.diagram.edit.parts.ObjectPartOfEditPart;
import CHOOSE.diagram.edit.parts.ObjectSpecializationEditPart;
import CHOOSE.diagram.edit.parts.ObjectSpecializedByEditPart;
import CHOOSE.diagram.edit.parts.OperationContainerInputEditPart;
import CHOOSE.diagram.edit.parts.OperationContainerOutputEditPart;
import CHOOSE.diagram.part.ChooseEditorVisualIDRegistry;
import CHOOSE.diagram.providers.ChooseEditorElementTypes;

/**
 * @generated
 */
public class ObjectItemSemanticEditPolicy extends
		ChooseEditorBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ObjectItemSemanticEditPolicy() {
		super(ChooseEditorElementTypes.Object_2011);
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
			if (ChooseEditorVisualIDRegistry.getVisualID(incomingLink) == GoalConcernsObjectsEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (ChooseEditorVisualIDRegistry.getVisualID(incomingLink) == ActorContainerMonitorsEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (ChooseEditorVisualIDRegistry.getVisualID(incomingLink) == ActorContainerControlsEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (ChooseEditorVisualIDRegistry.getVisualID(incomingLink) == OperationContainerOutputEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (ChooseEditorVisualIDRegistry.getVisualID(incomingLink) == OperationContainerInputEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (ChooseEditorVisualIDRegistry.getVisualID(incomingLink) == ObjectAssociatesEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (ChooseEditorVisualIDRegistry.getVisualID(incomingLink) == ObjectAssociatedEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (ChooseEditorVisualIDRegistry.getVisualID(incomingLink) == ObjectSpecializationEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (ChooseEditorVisualIDRegistry.getVisualID(incomingLink) == ObjectSpecializedByEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (ChooseEditorVisualIDRegistry.getVisualID(incomingLink) == ObjectPartOfEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (ChooseEditorVisualIDRegistry.getVisualID(incomingLink) == ObjectIncludesEditPart.VISUAL_ID) {
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
			if (ChooseEditorVisualIDRegistry.getVisualID(outgoingLink) == ObjectConcernsGoalsEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (ChooseEditorVisualIDRegistry.getVisualID(outgoingLink) == ObjectMonitoredByEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (ChooseEditorVisualIDRegistry.getVisualID(outgoingLink) == ObjectInputForEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (ChooseEditorVisualIDRegistry.getVisualID(outgoingLink) == ObjectOutputOfEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (ChooseEditorVisualIDRegistry.getVisualID(outgoingLink) == ObjectControlledByEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (ChooseEditorVisualIDRegistry.getVisualID(outgoingLink) == ObjectAssociatesEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (ChooseEditorVisualIDRegistry.getVisualID(outgoingLink) == ObjectAssociatedEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (ChooseEditorVisualIDRegistry.getVisualID(outgoingLink) == ObjectSpecializationEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (ChooseEditorVisualIDRegistry.getVisualID(outgoingLink) == ObjectSpecializedByEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (ChooseEditorVisualIDRegistry.getVisualID(outgoingLink) == ObjectPartOfEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (ChooseEditorVisualIDRegistry.getVisualID(outgoingLink) == ObjectIncludesEditPart.VISUAL_ID) {
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
		if (ChooseEditorElementTypes.GoalConcernsObjects_4007 == req
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
		if (ChooseEditorElementTypes.OperationContainerOutput_4032 == req
				.getElementType()) {
			return null;
		}
		if (ChooseEditorElementTypes.OperationContainerInput_4033 == req
				.getElementType()) {
			return null;
		}
		if (ChooseEditorElementTypes.ObjectConcernsGoals_4038 == req
				.getElementType()) {
			return getGEFWrapper(new ObjectConcernsGoalsCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (ChooseEditorElementTypes.ObjectMonitoredBy_4034 == req
				.getElementType()) {
			return getGEFWrapper(new ObjectMonitoredByCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (ChooseEditorElementTypes.ObjectInputFor_4036 == req
				.getElementType()) {
			return getGEFWrapper(new ObjectInputForCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (ChooseEditorElementTypes.ObjectOutputOf_4037 == req
				.getElementType()) {
			return getGEFWrapper(new ObjectOutputOfCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (ChooseEditorElementTypes.ObjectControlledBy_4035 == req
				.getElementType()) {
			return getGEFWrapper(new ObjectControlledByCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (ChooseEditorElementTypes.ObjectAssociates_4039 == req
				.getElementType()) {
			return getGEFWrapper(new ObjectAssociatesCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (ChooseEditorElementTypes.ObjectAssociated_4040 == req
				.getElementType()) {
			return getGEFWrapper(new ObjectAssociatedCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (ChooseEditorElementTypes.ObjectSpecialization_4041 == req
				.getElementType()) {
			return getGEFWrapper(new ObjectSpecializationCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (ChooseEditorElementTypes.ObjectSpecializedBy_4042 == req
				.getElementType()) {
			return getGEFWrapper(new ObjectSpecializedByCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (ChooseEditorElementTypes.ObjectPartOf_4043 == req.getElementType()) {
			return getGEFWrapper(new ObjectPartOfCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (ChooseEditorElementTypes.ObjectIncludes_4044 == req
				.getElementType()) {
			return getGEFWrapper(new ObjectIncludesCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (ChooseEditorElementTypes.GoalConcernsObjects_4007 == req
				.getElementType()) {
			return getGEFWrapper(new GoalConcernsObjectsCreateCommand(req,
					req.getSource(), req.getTarget()));
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
		if (ChooseEditorElementTypes.OperationContainerOutput_4032 == req
				.getElementType()) {
			return getGEFWrapper(new OperationContainerOutputCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (ChooseEditorElementTypes.OperationContainerInput_4033 == req
				.getElementType()) {
			return getGEFWrapper(new OperationContainerInputCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (ChooseEditorElementTypes.ObjectConcernsGoals_4038 == req
				.getElementType()) {
			return null;
		}
		if (ChooseEditorElementTypes.ObjectMonitoredBy_4034 == req
				.getElementType()) {
			return null;
		}
		if (ChooseEditorElementTypes.ObjectInputFor_4036 == req
				.getElementType()) {
			return null;
		}
		if (ChooseEditorElementTypes.ObjectOutputOf_4037 == req
				.getElementType()) {
			return null;
		}
		if (ChooseEditorElementTypes.ObjectControlledBy_4035 == req
				.getElementType()) {
			return null;
		}
		if (ChooseEditorElementTypes.ObjectAssociates_4039 == req
				.getElementType()) {
			return getGEFWrapper(new ObjectAssociatesCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (ChooseEditorElementTypes.ObjectAssociated_4040 == req
				.getElementType()) {
			return getGEFWrapper(new ObjectAssociatedCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (ChooseEditorElementTypes.ObjectSpecialization_4041 == req
				.getElementType()) {
			return getGEFWrapper(new ObjectSpecializationCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (ChooseEditorElementTypes.ObjectSpecializedBy_4042 == req
				.getElementType()) {
			return getGEFWrapper(new ObjectSpecializedByCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (ChooseEditorElementTypes.ObjectPartOf_4043 == req.getElementType()) {
			return getGEFWrapper(new ObjectPartOfCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (ChooseEditorElementTypes.ObjectIncludes_4044 == req
				.getElementType()) {
			return getGEFWrapper(new ObjectIncludesCreateCommand(req,
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
		case GoalConcernsObjectsEditPart.VISUAL_ID:
			return getGEFWrapper(new GoalConcernsObjectsReorientCommand(req));
		case ActorContainerMonitorsEditPart.VISUAL_ID:
			return getGEFWrapper(new ActorContainerMonitorsReorientCommand(req));
		case ActorContainerControlsEditPart.VISUAL_ID:
			return getGEFWrapper(new ActorContainerControlsReorientCommand(req));
		case OperationContainerOutputEditPart.VISUAL_ID:
			return getGEFWrapper(new OperationContainerOutputReorientCommand(
					req));
		case OperationContainerInputEditPart.VISUAL_ID:
			return getGEFWrapper(new OperationContainerInputReorientCommand(req));
		case ObjectConcernsGoalsEditPart.VISUAL_ID:
			return getGEFWrapper(new ObjectConcernsGoalsReorientCommand(req));
		case ObjectMonitoredByEditPart.VISUAL_ID:
			return getGEFWrapper(new ObjectMonitoredByReorientCommand(req));
		case ObjectInputForEditPart.VISUAL_ID:
			return getGEFWrapper(new ObjectInputForReorientCommand(req));
		case ObjectOutputOfEditPart.VISUAL_ID:
			return getGEFWrapper(new ObjectOutputOfReorientCommand(req));
		case ObjectControlledByEditPart.VISUAL_ID:
			return getGEFWrapper(new ObjectControlledByReorientCommand(req));
		case ObjectAssociatesEditPart.VISUAL_ID:
			return getGEFWrapper(new ObjectAssociatesReorientCommand(req));
		case ObjectAssociatedEditPart.VISUAL_ID:
			return getGEFWrapper(new ObjectAssociatedReorientCommand(req));
		case ObjectSpecializationEditPart.VISUAL_ID:
			return getGEFWrapper(new ObjectSpecializationReorientCommand(req));
		case ObjectSpecializedByEditPart.VISUAL_ID:
			return getGEFWrapper(new ObjectSpecializedByReorientCommand(req));
		case ObjectPartOfEditPart.VISUAL_ID:
			return getGEFWrapper(new ObjectPartOfReorientCommand(req));
		case ObjectIncludesEditPart.VISUAL_ID:
			return getGEFWrapper(new ObjectIncludesReorientCommand(req));
		}
		return super.getReorientReferenceRelationshipCommand(req);
	}

}
