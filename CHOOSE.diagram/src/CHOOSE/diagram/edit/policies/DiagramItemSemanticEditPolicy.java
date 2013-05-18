package CHOOSE.diagram.edit.policies;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

import CHOOSE.diagram.edit.commands.ActorCreateCommand;
import CHOOSE.diagram.edit.commands.DeviceCreateCommand;
import CHOOSE.diagram.edit.commands.GoalCreateCommand;
import CHOOSE.diagram.edit.commands.HumanActorCreateCommand;
import CHOOSE.diagram.edit.commands.ObjectCreateCommand;
import CHOOSE.diagram.edit.commands.OperationCreateCommand;
import CHOOSE.diagram.edit.commands.ProcessCreateCommand;
import CHOOSE.diagram.edit.commands.ProjectCreateCommand;
import CHOOSE.diagram.edit.commands.RefinementCreateCommand;
import CHOOSE.diagram.edit.commands.RoleCreateCommand;
import CHOOSE.diagram.edit.commands.SoftwareActorCreateCommand;
import CHOOSE.diagram.providers.ChooseEditorElementTypes;

/**
 * @generated
 */
public class DiagramItemSemanticEditPolicy extends
		ChooseEditorBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public DiagramItemSemanticEditPolicy() {
		super(ChooseEditorElementTypes.Diagram_1000);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ChooseEditorElementTypes.Goal_2001 == req.getElementType()) {
			return getGEFWrapper(new GoalCreateCommand(req));
		}
		if (ChooseEditorElementTypes.Refinement_2002 == req.getElementType()) {
			return getGEFWrapper(new RefinementCreateCommand(req));
		}
		if (ChooseEditorElementTypes.Actor_2003 == req.getElementType()) {
			return getGEFWrapper(new ActorCreateCommand(req));
		}
		if (ChooseEditorElementTypes.HumanActor_2004 == req.getElementType()) {
			return getGEFWrapper(new HumanActorCreateCommand(req));
		}
		if (ChooseEditorElementTypes.Role_2005 == req.getElementType()) {
			return getGEFWrapper(new RoleCreateCommand(req));
		}
		if (ChooseEditorElementTypes.SoftwareActor_2006 == req.getElementType()) {
			return getGEFWrapper(new SoftwareActorCreateCommand(req));
		}
		if (ChooseEditorElementTypes.Device_2007 == req.getElementType()) {
			return getGEFWrapper(new DeviceCreateCommand(req));
		}
		if (ChooseEditorElementTypes.Operation_2008 == req.getElementType()) {
			return getGEFWrapper(new OperationCreateCommand(req));
		}
		if (ChooseEditorElementTypes.Process_2009 == req.getElementType()) {
			return getGEFWrapper(new ProcessCreateCommand(req));
		}
		if (ChooseEditorElementTypes.Project_2010 == req.getElementType()) {
			return getGEFWrapper(new ProjectCreateCommand(req));
		}
		if (ChooseEditorElementTypes.Object_2011 == req.getElementType()) {
			return getGEFWrapper(new ObjectCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost())
				.getEditingDomain();
		return getGEFWrapper(new DuplicateAnythingCommand(editingDomain, req));
	}

	/**
	 * @generated
	 */
	private static class DuplicateAnythingCommand extends
			DuplicateEObjectsCommand {

		/**
		 * @generated
		 */
		public DuplicateAnythingCommand(
				TransactionalEditingDomain editingDomain,
				DuplicateElementsRequest req) {
			super(editingDomain, req.getLabel(), req
					.getElementsToBeDuplicated(), req
					.getAllDuplicatedElementsMap());
		}

	}

}
