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
import CHOOSE.diagram.edit.commands.ActorContainerConsultedForCreateCommand;
import CHOOSE.diagram.edit.commands.ActorContainerConsultedForReorientCommand;
import CHOOSE.diagram.edit.commands.ActorContainerInformedForCreateCommand;
import CHOOSE.diagram.edit.commands.ActorContainerInformedForReorientCommand;
import CHOOSE.diagram.edit.commands.ActorContainerResponsibleForCreateCommand;
import CHOOSE.diagram.edit.commands.ActorContainerResponsibleForReorientCommand;
import CHOOSE.diagram.edit.commands.GoalOperationalizedByCreateCommand;
import CHOOSE.diagram.edit.commands.GoalOperationalizedByReorientCommand;
import CHOOSE.diagram.edit.commands.ObjectInputForCreateCommand;
import CHOOSE.diagram.edit.commands.ObjectInputForReorientCommand;
import CHOOSE.diagram.edit.commands.ObjectOutputOfCreateCommand;
import CHOOSE.diagram.edit.commands.ObjectOutputOfReorientCommand;
import CHOOSE.diagram.edit.commands.OperationContainerAccountableCreateCommand;
import CHOOSE.diagram.edit.commands.OperationContainerAccountableReorientCommand;
import CHOOSE.diagram.edit.commands.OperationContainerConsultCreateCommand;
import CHOOSE.diagram.edit.commands.OperationContainerConsultReorientCommand;
import CHOOSE.diagram.edit.commands.OperationContainerIncludesCreateCommand;
import CHOOSE.diagram.edit.commands.OperationContainerIncludesReorientCommand;
import CHOOSE.diagram.edit.commands.OperationContainerInformCreateCommand;
import CHOOSE.diagram.edit.commands.OperationContainerInformReorientCommand;
import CHOOSE.diagram.edit.commands.OperationContainerInputCreateCommand;
import CHOOSE.diagram.edit.commands.OperationContainerInputReorientCommand;
import CHOOSE.diagram.edit.commands.OperationContainerOperationalizesCreateCommand;
import CHOOSE.diagram.edit.commands.OperationContainerOperationalizesReorientCommand;
import CHOOSE.diagram.edit.commands.OperationContainerOutputCreateCommand;
import CHOOSE.diagram.edit.commands.OperationContainerOutputReorientCommand;
import CHOOSE.diagram.edit.commands.OperationContainerPartOfCreateCommand;
import CHOOSE.diagram.edit.commands.OperationContainerPartOfReorientCommand;
import CHOOSE.diagram.edit.commands.OperationContainerResponsibleCreateCommand;
import CHOOSE.diagram.edit.commands.OperationContainerResponsibleReorientCommand;
import CHOOSE.diagram.edit.parts.ActorContainerAccountableForEditPart;
import CHOOSE.diagram.edit.parts.ActorContainerConsultedForEditPart;
import CHOOSE.diagram.edit.parts.ActorContainerInformedForEditPart;
import CHOOSE.diagram.edit.parts.ActorContainerResponsibleForEditPart;
import CHOOSE.diagram.edit.parts.GoalOperationalizedByEditPart;
import CHOOSE.diagram.edit.parts.ObjectInputForEditPart;
import CHOOSE.diagram.edit.parts.ObjectOutputOfEditPart;
import CHOOSE.diagram.edit.parts.OperationContainerAccountableEditPart;
import CHOOSE.diagram.edit.parts.OperationContainerConsultEditPart;
import CHOOSE.diagram.edit.parts.OperationContainerIncludesEditPart;
import CHOOSE.diagram.edit.parts.OperationContainerInformEditPart;
import CHOOSE.diagram.edit.parts.OperationContainerInputEditPart;
import CHOOSE.diagram.edit.parts.OperationContainerOperationalizesEditPart;
import CHOOSE.diagram.edit.parts.OperationContainerOutputEditPart;
import CHOOSE.diagram.edit.parts.OperationContainerPartOfEditPart;
import CHOOSE.diagram.edit.parts.OperationContainerResponsibleEditPart;
import CHOOSE.diagram.part.ChooseEditorVisualIDRegistry;
import CHOOSE.diagram.providers.ChooseEditorElementTypes;

/**
 * @generated
 */
public class ProcessItemSemanticEditPolicy extends
		ChooseEditorBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ProcessItemSemanticEditPolicy() {
		super(ChooseEditorElementTypes.Process_2009);
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
			if (ChooseEditorVisualIDRegistry.getVisualID(incomingLink) == GoalOperationalizedByEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (ChooseEditorVisualIDRegistry.getVisualID(incomingLink) == ActorContainerConsultedForEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (ChooseEditorVisualIDRegistry.getVisualID(incomingLink) == ActorContainerInformedForEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (ChooseEditorVisualIDRegistry.getVisualID(incomingLink) == ActorContainerAccountableForEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (ChooseEditorVisualIDRegistry.getVisualID(incomingLink) == ActorContainerResponsibleForEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (ChooseEditorVisualIDRegistry.getVisualID(incomingLink) == OperationContainerPartOfEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (ChooseEditorVisualIDRegistry.getVisualID(incomingLink) == OperationContainerIncludesEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (ChooseEditorVisualIDRegistry.getVisualID(incomingLink) == ObjectInputForEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (ChooseEditorVisualIDRegistry.getVisualID(incomingLink) == ObjectOutputOfEditPart.VISUAL_ID) {
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
			if (ChooseEditorVisualIDRegistry.getVisualID(outgoingLink) == OperationContainerResponsibleEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (ChooseEditorVisualIDRegistry.getVisualID(outgoingLink) == OperationContainerInformEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (ChooseEditorVisualIDRegistry.getVisualID(outgoingLink) == OperationContainerConsultEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (ChooseEditorVisualIDRegistry.getVisualID(outgoingLink) == OperationContainerAccountableEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (ChooseEditorVisualIDRegistry.getVisualID(outgoingLink) == OperationContainerPartOfEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (ChooseEditorVisualIDRegistry.getVisualID(outgoingLink) == OperationContainerIncludesEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (ChooseEditorVisualIDRegistry.getVisualID(outgoingLink) == OperationContainerOperationalizesEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (ChooseEditorVisualIDRegistry.getVisualID(outgoingLink) == OperationContainerOutputEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (ChooseEditorVisualIDRegistry.getVisualID(outgoingLink) == OperationContainerInputEditPart.VISUAL_ID) {
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
		if (ChooseEditorElementTypes.GoalOperationalizedBy_4008 == req
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
		if (ChooseEditorElementTypes.ActorContainerAccountableFor_4021 == req
				.getElementType()) {
			return null;
		}
		if (ChooseEditorElementTypes.ActorContainerResponsibleFor_4022 == req
				.getElementType()) {
			return null;
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
		if (ChooseEditorElementTypes.OperationContainerPartOf_4029 == req
				.getElementType()) {
			return getGEFWrapper(new OperationContainerPartOfCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (ChooseEditorElementTypes.OperationContainerIncludes_4030 == req
				.getElementType()) {
			return getGEFWrapper(new OperationContainerIncludesCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (ChooseEditorElementTypes.OperationContainerOperationalizes_4031 == req
				.getElementType()) {
			return getGEFWrapper(new OperationContainerOperationalizesCreateCommand(
					req, req.getSource(), req.getTarget()));
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
		if (ChooseEditorElementTypes.ObjectInputFor_4036 == req
				.getElementType()) {
			return null;
		}
		if (ChooseEditorElementTypes.ObjectOutputOf_4037 == req
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
		if (ChooseEditorElementTypes.GoalOperationalizedBy_4008 == req
				.getElementType()) {
			return getGEFWrapper(new GoalOperationalizedByCreateCommand(req,
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
		if (ChooseEditorElementTypes.OperationContainerPartOf_4029 == req
				.getElementType()) {
			return getGEFWrapper(new OperationContainerPartOfCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (ChooseEditorElementTypes.OperationContainerIncludes_4030 == req
				.getElementType()) {
			return getGEFWrapper(new OperationContainerIncludesCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (ChooseEditorElementTypes.OperationContainerOperationalizes_4031 == req
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
		case GoalOperationalizedByEditPart.VISUAL_ID:
			return getGEFWrapper(new GoalOperationalizedByReorientCommand(req));
		case ActorContainerConsultedForEditPart.VISUAL_ID:
			return getGEFWrapper(new ActorContainerConsultedForReorientCommand(
					req));
		case ActorContainerInformedForEditPart.VISUAL_ID:
			return getGEFWrapper(new ActorContainerInformedForReorientCommand(
					req));
		case ActorContainerAccountableForEditPart.VISUAL_ID:
			return getGEFWrapper(new ActorContainerAccountableForReorientCommand(
					req));
		case ActorContainerResponsibleForEditPart.VISUAL_ID:
			return getGEFWrapper(new ActorContainerResponsibleForReorientCommand(
					req));
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
		case OperationContainerPartOfEditPart.VISUAL_ID:
			return getGEFWrapper(new OperationContainerPartOfReorientCommand(
					req));
		case OperationContainerIncludesEditPart.VISUAL_ID:
			return getGEFWrapper(new OperationContainerIncludesReorientCommand(
					req));
		case OperationContainerOperationalizesEditPart.VISUAL_ID:
			return getGEFWrapper(new OperationContainerOperationalizesReorientCommand(
					req));
		case OperationContainerOutputEditPart.VISUAL_ID:
			return getGEFWrapper(new OperationContainerOutputReorientCommand(
					req));
		case OperationContainerInputEditPart.VISUAL_ID:
			return getGEFWrapper(new OperationContainerInputReorientCommand(req));
		case ObjectInputForEditPart.VISUAL_ID:
			return getGEFWrapper(new ObjectInputForReorientCommand(req));
		case ObjectOutputOfEditPart.VISUAL_ID:
			return getGEFWrapper(new ObjectOutputOfReorientCommand(req));
		}
		return super.getReorientReferenceRelationshipCommand(req);
	}

}
