package CHOOSE.diagram.edit.policies;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.UnexecutableCommand;
import org.eclipse.gef.requests.ReconnectRequest;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.common.core.command.ICompositeCommand;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.diagram.ui.commands.CommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.SemanticEditPolicy;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.requests.ConfigureRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.GetEditContextRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.IEditCommandRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.MoveRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.SetRequest;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.edit.helpers.GeneratedEditHelperBase;

import CHOOSE.diagram.expressions.ChooseEditorOCLFactory;
import CHOOSE.diagram.part.ChooseEditorDiagramEditorPlugin;
import CHOOSE.diagram.part.ChooseEditorVisualIDRegistry;
import CHOOSE.diagram.providers.ChooseEditorElementTypes;
import chooseeditor.ActorContainer;
import chooseeditor.ChooseeditorPackage;
import chooseeditor.Goal;
import chooseeditor.HumanActor;
import chooseeditor.OperationContainer;
import chooseeditor.Refinement;
import chooseeditor.Role;

/**
 * @generated
 */
public class ChooseEditorBaseItemSemanticEditPolicy extends SemanticEditPolicy {

	/**
	 * Extended request data key to hold editpart visual id.
	 * @generated
	 */
	public static final String VISUAL_ID_KEY = "visual_id"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	private final IElementType myElementType;

	/**
	 * @generated
	 */
	protected ChooseEditorBaseItemSemanticEditPolicy(IElementType elementType) {
		myElementType = elementType;
	}

	/**
	 * Extended request data key to hold editpart visual id.
	 * Add visual id of edited editpart to extended data of the request
	 * so command switch can decide what kind of diagram element is being edited.
	 * It is done in those cases when it's not possible to deduce diagram
	 * element kind from domain element.
	 * 
	 * @generated
	 */
	public Command getCommand(Request request) {
		if (request instanceof ReconnectRequest) {
			Object view = ((ReconnectRequest) request).getConnectionEditPart()
					.getModel();
			if (view instanceof View) {
				Integer id = new Integer(
						ChooseEditorVisualIDRegistry.getVisualID((View) view));
				request.getExtendedData().put(VISUAL_ID_KEY, id);
			}
		}
		return super.getCommand(request);
	}

	/**
	 * Returns visual id from request parameters.
	 * @generated
	 */
	protected int getVisualID(IEditCommandRequest request) {
		Object id = request.getParameter(VISUAL_ID_KEY);
		return id instanceof Integer ? ((Integer) id).intValue() : -1;
	}

	/**
	 * @generated
	 */
	protected Command getSemanticCommand(IEditCommandRequest request) {
		IEditCommandRequest completedRequest = completeRequest(request);
		Command semanticCommand = getSemanticCommandSwitch(completedRequest);
		semanticCommand = getEditHelperCommand(completedRequest,
				semanticCommand);
		if (completedRequest instanceof DestroyRequest) {
			DestroyRequest destroyRequest = (DestroyRequest) completedRequest;
			return shouldProceed(destroyRequest) ? addDeleteViewCommand(
					semanticCommand, destroyRequest) : null;
		}
		return semanticCommand;
	}

	/**
	 * @generated
	 */
	protected Command addDeleteViewCommand(Command mainCommand,
			DestroyRequest completedRequest) {
		Command deleteViewCommand = getGEFWrapper(new DeleteCommand(
				getEditingDomain(), (View) getHost().getModel()));
		return mainCommand == null ? deleteViewCommand : mainCommand
				.chain(deleteViewCommand);
	}

	/**
	 * @generated
	 */
	private Command getEditHelperCommand(IEditCommandRequest request,
			Command editPolicyCommand) {
		if (editPolicyCommand != null) {
			ICommand command = editPolicyCommand instanceof ICommandProxy ? ((ICommandProxy) editPolicyCommand)
					.getICommand() : new CommandProxy(editPolicyCommand);
			request.setParameter(GeneratedEditHelperBase.EDIT_POLICY_COMMAND,
					command);
		}
		IElementType requestContextElementType = getContextElementType(request);
		request.setParameter(GeneratedEditHelperBase.CONTEXT_ELEMENT_TYPE,
				requestContextElementType);
		ICommand command = requestContextElementType.getEditCommand(request);
		request.setParameter(GeneratedEditHelperBase.EDIT_POLICY_COMMAND, null);
		request.setParameter(GeneratedEditHelperBase.CONTEXT_ELEMENT_TYPE, null);
		if (command != null) {
			if (!(command instanceof CompositeTransactionalCommand)) {
				command = new CompositeTransactionalCommand(getEditingDomain(),
						command.getLabel()).compose(command);
			}
			return new ICommandProxy(command);
		}
		return editPolicyCommand;
	}

	/**
	 * @generated
	 */
	private IElementType getContextElementType(IEditCommandRequest request) {
		IElementType requestContextElementType = ChooseEditorElementTypes
				.getElementType(getVisualID(request));
		return requestContextElementType != null ? requestContextElementType
				: myElementType;
	}

	/**
	 * @generated
	 */
	protected Command getSemanticCommandSwitch(IEditCommandRequest req) {
		if (req instanceof CreateRelationshipRequest) {
			return getCreateRelationshipCommand((CreateRelationshipRequest) req);
		} else if (req instanceof CreateElementRequest) {
			return getCreateCommand((CreateElementRequest) req);
		} else if (req instanceof ConfigureRequest) {
			return getConfigureCommand((ConfigureRequest) req);
		} else if (req instanceof DestroyElementRequest) {
			return getDestroyElementCommand((DestroyElementRequest) req);
		} else if (req instanceof DestroyReferenceRequest) {
			return getDestroyReferenceCommand((DestroyReferenceRequest) req);
		} else if (req instanceof DuplicateElementsRequest) {
			return getDuplicateCommand((DuplicateElementsRequest) req);
		} else if (req instanceof GetEditContextRequest) {
			return getEditContextCommand((GetEditContextRequest) req);
		} else if (req instanceof MoveRequest) {
			return getMoveCommand((MoveRequest) req);
		} else if (req instanceof ReorientReferenceRelationshipRequest) {
			return getReorientReferenceRelationshipCommand((ReorientReferenceRelationshipRequest) req);
		} else if (req instanceof ReorientRelationshipRequest) {
			return getReorientRelationshipCommand((ReorientRelationshipRequest) req);
		} else if (req instanceof SetRequest) {
			return getSetCommand((SetRequest) req);
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getConfigureCommand(ConfigureRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getSetCommand(SetRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getEditContextCommand(GetEditContextRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getMoveCommand(MoveRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getReorientReferenceRelationshipCommand(
			ReorientReferenceRelationshipRequest req) {
		return UnexecutableCommand.INSTANCE;
	}

	/**
	 * @generated
	 */
	protected Command getReorientRelationshipCommand(
			ReorientRelationshipRequest req) {
		return UnexecutableCommand.INSTANCE;
	}

	/**
	 * @generated
	 */
	protected final Command getGEFWrapper(ICommand cmd) {
		return new ICommandProxy(cmd);
	}

	/**
	 * Returns editing domain from the host edit part.
	 * @generated
	 */
	protected TransactionalEditingDomain getEditingDomain() {
		return ((IGraphicalEditPart) getHost()).getEditingDomain();
	}

	/**
	 * Clean all shortcuts to the host element from the same diagram
	 * @generated
	 */
	protected void addDestroyShortcutsCommand(ICompositeCommand cmd, View view) {
		assert view.getEAnnotation("Shortcut") == null; //$NON-NLS-1$
		for (Iterator it = view.getDiagram().getChildren().iterator(); it
				.hasNext();) {
			View nextView = (View) it.next();
			if (nextView.getEAnnotation("Shortcut") == null || !nextView.isSetElement() || nextView.getElement() != view.getElement()) { //$NON-NLS-1$
				continue;
			}
			cmd.add(new DeleteCommand(getEditingDomain(), nextView));
		}
	}

	/**
	 * @generated
	 */
	public static LinkConstraints getLinkConstraints() {
		LinkConstraints cached = ChooseEditorDiagramEditorPlugin.getInstance()
				.getLinkConstraints();
		if (cached == null) {
			ChooseEditorDiagramEditorPlugin.getInstance().setLinkConstraints(
					cached = new LinkConstraints());
		}
		return cached;
	}

	/**
	 * @generated
	 */
	public static class LinkConstraints {

		/**
		 * @generated
		 */
		LinkConstraints() {
			// use static method #getLinkConstraints() to access instance
		}

		/**
		 * @generated
		 */
		public boolean canCreateGoalAssignedTo_4001(Goal source,
				ActorContainer target) {
			if (source != null) {
				if (source.getAssignedTo().contains(target)) {
					return false;
				}
			}
			if (target != null && (target.getAssignments().contains(target))) {
				return false;
			}

			return canExistGoalAssignedTo_4001(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateGoalWishedBy_4002(Goal source,
				ActorContainer target) {
			if (source != null) {
				if (source.getWishedBy().contains(target)) {
					return false;
				}
			}
			if (target != null && (target.getWishes().contains(target))) {
				return false;
			}

			return canExistGoalWishedBy_4002(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateGoalOr_4003(Goal source, Refinement target) {
			if (source != null) {
				if (source.getOr().contains(target)) {
					return false;
				}
			}
			if (target != null && (target.getSupergoal() != null)) {
				return false;
			}

			return canExistGoalOr_4003(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateGoalAnd_4004(Goal source, Refinement target) {
			if (source != null) {
				if (source.getAnd().contains(target)) {
					return false;
				}
			}
			if (target != null && (target.getSubgoals().contains(target))) {
				return false;
			}

			return canExistGoalAnd_4004(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateGoalConflicted_4005(Goal source, Goal target) {
			if (source != null) {
				if (source.getConflicted().contains(target)) {
					return false;
				}
			}
			if (target != null && (target.getConflicts().contains(target))) {
				return false;
			}

			return canExistGoalConflicted_4005(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateGoalConflicts_4006(Goal source, Goal target) {
			if (source != null) {
				if (source.getConflicts().contains(target)) {
					return false;
				}
			}
			if (target != null && (target.getConflicted().contains(target))) {
				return false;
			}

			return canExistGoalConflicts_4006(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateGoalConcernsObjects_4007(Goal source,
				chooseeditor.Object target) {
			if (source != null) {
				if (source.getConcernsObjects().contains(target)) {
					return false;
				}
			}
			if (target != null && (target.getConcernsGoals().contains(target))) {
				return false;
			}

			return canExistGoalConcernsObjects_4007(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateGoalOperationalizedBy_4008(Goal source,
				OperationContainer target) {
			if (source != null) {
				if (source.getOperationalizedBy().contains(target)) {
					return false;
				}
			}
			if (target != null
					&& (target.getOperationalizes().contains(target))) {
				return false;
			}

			return canExistGoalOperationalizedBy_4008(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateRefinementSupergoal_4009(Refinement source,
				Goal target) {
			if (source != null) {
				if (source.getSupergoal() != null) {
					return false;
				}
			}
			if (target != null && (target.getOr().contains(target))) {
				return false;
			}

			return canExistRefinementSupergoal_4009(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateRefinementSubgoals_4010(Refinement source,
				Goal target) {
			if (source != null) {
				if (source.getSubgoals().contains(target)) {
					return false;
				}
			}
			if (target != null && (target.getAnd().contains(target))) {
				return false;
			}

			return canExistRefinementSubgoals_4010(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateActorContainerWishes_4018(
				ActorContainer source, Goal target) {
			if (source != null) {
				if (source.getWishes().contains(target)) {
					return false;
				}
			}
			if (target != null && (target.getWishedBy().contains(target))) {
				return false;
			}

			return canExistActorContainerWishes_4018(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateActorContainerConsultedFor_4012(
				ActorContainer source, OperationContainer target) {
			if (source != null) {
				if (source.getConsultedFor().contains(target)) {
					return false;
				}
			}
			if (target != null && (target.getConsult().contains(target))) {
				return false;
			}

			return canExistActorContainerConsultedFor_4012(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateActorContainerInformedFor_4013(
				ActorContainer source, OperationContainer target) {
			if (source != null) {
				if (source.getInformedFor().contains(target)) {
					return false;
				}
			}
			if (target != null && (target.getInform().contains(target))) {
				return false;
			}

			return canExistActorContainerInformedFor_4013(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateHumanActorSupervisors_4014(HumanActor source,
				HumanActor target) {
			if (source != null) {
				if (source.getSupervisors().contains(target)) {
					return false;
				}
			}
			if (target != null && (target.getSupervisees().contains(target))) {
				return false;
			}

			return canExistHumanActorSupervisors_4014(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateHumanActorSupervisees_4015(HumanActor source,
				HumanActor target) {
			if (source != null) {
				if (source.getSupervisees().contains(target)) {
					return false;
				}
			}
			if (target != null && (target.getSupervisors().contains(target))) {
				return false;
			}

			return canExistHumanActorSupervisees_4015(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateActorContainerAssignments_4011(
				ActorContainer source, Goal target) {
			if (source != null) {
				if (source.getAssignments().contains(target)) {
					return false;
				}
			}
			if (target != null && (target.getAssignedTo().contains(target))) {
				return false;
			}

			return canExistActorContainerAssignments_4011(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateRolePerformedBy_4017(Role source,
				HumanActor target) {
			if (source != null) {
				if (source.getPerformedBy().contains(target)) {
					return false;
				}
			}
			if (target != null && (target.getPerforms().contains(target))) {
				return false;
			}

			return canExistRolePerformedBy_4017(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateHumanActorPerforms_4016(HumanActor source,
				Role target) {
			if (source != null) {
				if (source.getPerforms().contains(target)) {
					return false;
				}
			}
			if (target != null && (target.getPerformedBy().contains(target))) {
				return false;
			}

			return canExistHumanActorPerforms_4016(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateActorContainerMonitors_4019(
				ActorContainer source, chooseeditor.Object target) {
			if (source != null) {
				if (source.getMonitors().contains(target)) {
					return false;
				}
			}
			if (target != null && (target.getMonitoredBy().contains(target))) {
				return false;
			}

			return canExistActorContainerMonitors_4019(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateActorContainerControls_4020(
				ActorContainer source, chooseeditor.Object target) {
			if (source != null) {
				if (source.getControls().contains(target)) {
					return false;
				}
			}
			if (target != null && (target.getControlledBy().contains(target))) {
				return false;
			}

			return canExistActorContainerControls_4020(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateActorContainerAccountableFor_4021(
				ActorContainer source, OperationContainer target) {
			if (source != null) {
				if (source.getAccountableFor().contains(target)) {
					return false;
				}
			}
			if (target != null && (target.getAccountable() != null)) {
				return false;
			}

			return canExistActorContainerAccountableFor_4021(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateActorContainerResponsibleFor_4022(
				ActorContainer source, OperationContainer target) {
			if (source != null) {
				if (source.getResponsibleFor().contains(target)) {
					return false;
				}
			}
			if (target != null && (target.getResponsible().contains(target))) {
				return false;
			}

			return canExistActorContainerResponsibleFor_4022(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateActorContainerPartOf_4023(
				ActorContainer source, ActorContainer target) {
			if (source != null) {
				if (source.getPartOf().contains(target)) {
					return false;
				}
			}
			if (target != null && (target.getIncludes().contains(target))) {
				return false;
			}

			return canExistActorContainerPartOf_4023(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateActorContainerIncludes_4024(
				ActorContainer source, ActorContainer target) {
			if (source != null) {
				if (source.getIncludes().contains(target)) {
					return false;
				}
			}
			if (target != null && (target.getPartOf().contains(target))) {
				return false;
			}

			return canExistActorContainerIncludes_4024(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateOperationContainerResponsible_4025(
				OperationContainer source, ActorContainer target) {
			if (source != null) {
				if (source.getResponsible().contains(target)) {
					return false;
				}
			}
			if (target != null && (target.getResponsibleFor().contains(target))) {
				return false;
			}

			return canExistOperationContainerResponsible_4025(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateOperationContainerInform_4027(
				OperationContainer source, ActorContainer target) {
			if (source != null) {
				if (source.getInform().contains(target)) {
					return false;
				}
			}
			if (target != null && (target.getInformedFor().contains(target))) {
				return false;
			}

			return canExistOperationContainerInform_4027(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateOperationContainerConsult_4026(
				OperationContainer source, ActorContainer target) {
			if (source != null) {
				if (source.getConsult().contains(target)) {
					return false;
				}
			}
			if (target != null && (target.getConsultedFor().contains(target))) {
				return false;
			}

			return canExistOperationContainerConsult_4026(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateOperationContainerAccountable_4028(
				OperationContainer source, ActorContainer target) {
			if (source != null) {
				if (source.getAccountable() != null) {
					return false;
				}
			}
			if (target != null && (target.getAccountableFor().contains(target))) {
				return false;
			}

			return canExistOperationContainerAccountable_4028(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateOperationContainerPartOf_4029(
				OperationContainer source, OperationContainer target) {
			if (source != null) {
				if (source.getPartOf().contains(target)) {
					return false;
				}
			}
			if (target != null && (target.getIncludes().contains(target))) {
				return false;
			}

			return canExistOperationContainerPartOf_4029(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateOperationContainerIncludes_4030(
				OperationContainer source, OperationContainer target) {
			if (source != null) {
				if (source.getIncludes().contains(target)) {
					return false;
				}
			}
			if (target != null && (target.getPartOf().contains(target))) {
				return false;
			}

			return canExistOperationContainerIncludes_4030(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateOperationContainerOperationalizes_4031(
				OperationContainer source, Goal target) {
			if (source != null) {
				if (source.getOperationalizes().contains(target)) {
					return false;
				}
			}
			if (target != null
					&& (target.getOperationalizedBy().contains(target))) {
				return false;
			}

			return canExistOperationContainerOperationalizes_4031(source,
					target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateOperationContainerOutput_4032(
				OperationContainer source, chooseeditor.Object target) {
			if (source != null) {
				if (source.getOutput().contains(target)) {
					return false;
				}
			}
			if (target != null && (target.getOutputOf().contains(target))) {
				return false;
			}

			return canExistOperationContainerOutput_4032(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateOperationContainerInput_4033(
				OperationContainer source, chooseeditor.Object target) {
			if (source != null) {
				if (source.getInput().contains(target)) {
					return false;
				}
			}
			if (target != null && (target.getInputFor().contains(target))) {
				return false;
			}

			return canExistOperationContainerInput_4033(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateObjectConcernsGoals_4038(
				chooseeditor.Object source, Goal target) {
			if (source != null) {
				if (source.getConcernsGoals().contains(target)) {
					return false;
				}
			}
			if (target != null
					&& (target.getConcernsObjects().contains(target))) {
				return false;
			}

			return canExistObjectConcernsGoals_4038(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateObjectMonitoredBy_4034(
				chooseeditor.Object source, ActorContainer target) {
			if (source != null) {
				if (source.getMonitoredBy().contains(target)) {
					return false;
				}
			}
			if (target != null && (target.getMonitors().contains(target))) {
				return false;
			}

			return canExistObjectMonitoredBy_4034(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateObjectInputFor_4036(chooseeditor.Object source,
				OperationContainer target) {
			if (source != null) {
				if (source.getInputFor().contains(target)) {
					return false;
				}
			}
			if (target != null && (target.getInput().contains(target))) {
				return false;
			}

			return canExistObjectInputFor_4036(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateObjectOutputOf_4037(chooseeditor.Object source,
				OperationContainer target) {
			if (source != null) {
				if (source.getOutputOf().contains(target)) {
					return false;
				}
			}
			if (target != null && (target.getOutput().contains(target))) {
				return false;
			}

			return canExistObjectOutputOf_4037(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateObjectControlledBy_4035(
				chooseeditor.Object source, ActorContainer target) {
			if (source != null) {
				if (source.getControlledBy().contains(target)) {
					return false;
				}
			}
			if (target != null && (target.getControls().contains(target))) {
				return false;
			}

			return canExistObjectControlledBy_4035(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateObjectAssociates_4039(
				chooseeditor.Object source, chooseeditor.Object target) {
			if (source != null) {
				if (source.getAssociates().contains(target)) {
					return false;
				}
			}
			if (target != null && (target.getAssociated().contains(target))) {
				return false;
			}

			return canExistObjectAssociates_4039(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateObjectAssociated_4040(
				chooseeditor.Object source, chooseeditor.Object target) {
			if (source != null) {
				if (source.getAssociated().contains(target)) {
					return false;
				}
			}
			if (target != null && (target.getAssociates().contains(target))) {
				return false;
			}

			return canExistObjectAssociated_4040(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateObjectSpecialization_4041(
				chooseeditor.Object source, chooseeditor.Object target) {
			if (source != null) {
				if (source.getSpecialization().contains(target)) {
					return false;
				}
			}
			if (target != null && (target.getSpecializedBy().contains(target))) {
				return false;
			}

			return canExistObjectSpecialization_4041(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateObjectSpecializedBy_4042(
				chooseeditor.Object source, chooseeditor.Object target) {
			if (source != null) {
				if (source.getSpecializedBy().contains(target)) {
					return false;
				}
			}
			if (target != null && (target.getSpecialization().contains(target))) {
				return false;
			}

			return canExistObjectSpecializedBy_4042(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateObjectPartOf_4043(chooseeditor.Object source,
				chooseeditor.Object target) {
			if (source != null) {
				if (source.getPartOf().contains(target)) {
					return false;
				}
			}
			if (target != null && (target.getIncludes().contains(target))) {
				return false;
			}

			return canExistObjectPartOf_4043(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateObjectIncludes_4044(chooseeditor.Object source,
				chooseeditor.Object target) {
			if (source != null) {
				if (source.getIncludes().contains(target)) {
					return false;
				}
			}
			if (target != null && (target.getPartOf().contains(target))) {
				return false;
			}

			return canExistObjectIncludes_4044(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canExistGoalAssignedTo_4001(Goal source,
				ActorContainer target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistGoalWishedBy_4002(Goal source,
				ActorContainer target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistGoalOr_4003(Goal source, Refinement target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistGoalAnd_4004(Goal source, Refinement target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistGoalConflicted_4005(Goal source, Goal target) {
			try {
				if (target == null) {
					return true;
				} else {
					Map<String, EClassifier> env = Collections
							.<String, EClassifier> singletonMap(
									"oppositeEnd", ChooseeditorPackage.eINSTANCE.getGoal()); //$NON-NLS-1$
					Object targetVal = ChooseEditorOCLFactory.getExpression(0,
							ChooseeditorPackage.eINSTANCE.getGoal(), env)
							.evaluate(
									target,
									Collections.singletonMap(
											"oppositeEnd", source)); //$NON-NLS-1$
					if (false == targetVal instanceof Boolean
							|| !((Boolean) targetVal).booleanValue()) {
						return false;
					} // else fall-through
				}
				return true;
			} catch (Exception e) {
				ChooseEditorDiagramEditorPlugin.getInstance().logError(
						"Link constraint evaluation error", e); //$NON-NLS-1$
				return false;
			}
		}

		/**
		 * @generated
		 */
		public boolean canExistGoalConflicts_4006(Goal source, Goal target) {
			try {
				if (target == null) {
					return true;
				} else {
					Map<String, EClassifier> env = Collections
							.<String, EClassifier> singletonMap(
									"oppositeEnd", ChooseeditorPackage.eINSTANCE.getGoal()); //$NON-NLS-1$
					Object targetVal = ChooseEditorOCLFactory.getExpression(1,
							ChooseeditorPackage.eINSTANCE.getGoal(), env)
							.evaluate(
									target,
									Collections.singletonMap(
											"oppositeEnd", source)); //$NON-NLS-1$
					if (false == targetVal instanceof Boolean
							|| !((Boolean) targetVal).booleanValue()) {
						return false;
					} // else fall-through
				}
				return true;
			} catch (Exception e) {
				ChooseEditorDiagramEditorPlugin.getInstance().logError(
						"Link constraint evaluation error", e); //$NON-NLS-1$
				return false;
			}
		}

		/**
		 * @generated
		 */
		public boolean canExistGoalConcernsObjects_4007(Goal source,
				chooseeditor.Object target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistGoalOperationalizedBy_4008(Goal source,
				OperationContainer target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistRefinementSupergoal_4009(Refinement source,
				Goal target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistRefinementSubgoals_4010(Refinement source,
				Goal target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistActorContainerWishes_4018(ActorContainer source,
				Goal target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistActorContainerConsultedFor_4012(
				ActorContainer source, OperationContainer target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistActorContainerInformedFor_4013(
				ActorContainer source, OperationContainer target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistHumanActorSupervisors_4014(HumanActor source,
				HumanActor target) {
			try {
				if (source == null) {
					return true;
				} else {
					Map<String, EClassifier> env = Collections
							.<String, EClassifier> singletonMap(
									"oppositeEnd", ChooseeditorPackage.eINSTANCE.getHumanActor()); //$NON-NLS-1$
					Object sourceVal = ChooseEditorOCLFactory.getExpression(2,
							ChooseeditorPackage.eINSTANCE.getHumanActor(), env)
							.evaluate(
									source,
									Collections.singletonMap(
											"oppositeEnd", target)); //$NON-NLS-1$
					if (false == sourceVal instanceof Boolean
							|| !((Boolean) sourceVal).booleanValue()) {
						return false;
					} // else fall-through
				}
				if (target == null) {
					return true;
				} else {
					Map<String, EClassifier> env = Collections
							.<String, EClassifier> singletonMap(
									"oppositeEnd", ChooseeditorPackage.eINSTANCE.getHumanActor()); //$NON-NLS-1$
					Object targetVal = ChooseEditorOCLFactory.getExpression(3,
							ChooseeditorPackage.eINSTANCE.getHumanActor(), env)
							.evaluate(
									target,
									Collections.singletonMap(
											"oppositeEnd", source)); //$NON-NLS-1$
					if (false == targetVal instanceof Boolean
							|| !((Boolean) targetVal).booleanValue()) {
						return false;
					} // else fall-through
				}
				return true;
			} catch (Exception e) {
				ChooseEditorDiagramEditorPlugin.getInstance().logError(
						"Link constraint evaluation error", e); //$NON-NLS-1$
				return false;
			}
		}

		/**
		 * @generated
		 */
		public boolean canExistHumanActorSupervisees_4015(HumanActor source,
				HumanActor target) {
			try {
				if (source == null) {
					return true;
				} else {
					Map<String, EClassifier> env = Collections
							.<String, EClassifier> singletonMap(
									"oppositeEnd", ChooseeditorPackage.eINSTANCE.getHumanActor()); //$NON-NLS-1$
					Object sourceVal = ChooseEditorOCLFactory.getExpression(4,
							ChooseeditorPackage.eINSTANCE.getHumanActor(), env)
							.evaluate(
									source,
									Collections.singletonMap(
											"oppositeEnd", target)); //$NON-NLS-1$
					if (false == sourceVal instanceof Boolean
							|| !((Boolean) sourceVal).booleanValue()) {
						return false;
					} // else fall-through
				}
				if (target == null) {
					return true;
				} else {
					Map<String, EClassifier> env = Collections
							.<String, EClassifier> singletonMap(
									"oppositeEnd", ChooseeditorPackage.eINSTANCE.getHumanActor()); //$NON-NLS-1$
					Object targetVal = ChooseEditorOCLFactory.getExpression(5,
							ChooseeditorPackage.eINSTANCE.getHumanActor(), env)
							.evaluate(
									target,
									Collections.singletonMap(
											"oppositeEnd", source)); //$NON-NLS-1$
					if (false == targetVal instanceof Boolean
							|| !((Boolean) targetVal).booleanValue()) {
						return false;
					} // else fall-through
				}
				return true;
			} catch (Exception e) {
				ChooseEditorDiagramEditorPlugin.getInstance().logError(
						"Link constraint evaluation error", e); //$NON-NLS-1$
				return false;
			}
		}

		/**
		 * @generated
		 */
		public boolean canExistActorContainerAssignments_4011(
				ActorContainer source, Goal target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistRolePerformedBy_4017(Role source,
				HumanActor target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistHumanActorPerforms_4016(HumanActor source,
				Role target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistActorContainerMonitors_4019(
				ActorContainer source, chooseeditor.Object target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistActorContainerControls_4020(
				ActorContainer source, chooseeditor.Object target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistActorContainerAccountableFor_4021(
				ActorContainer source, OperationContainer target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistActorContainerResponsibleFor_4022(
				ActorContainer source, OperationContainer target) {
			try {
				if (target == null) {
					return true;
				} else {
					Map<String, EClassifier> env = Collections
							.<String, EClassifier> singletonMap(
									"oppositeEnd", ChooseeditorPackage.eINSTANCE.getActorContainer()); //$NON-NLS-1$
					Object targetVal = ChooseEditorOCLFactory.getExpression(
							6,
							ChooseeditorPackage.eINSTANCE
									.getOperationContainer(), env).evaluate(
							target,
							Collections.singletonMap("oppositeEnd", source)); //$NON-NLS-1$
					if (false == targetVal instanceof Boolean
							|| !((Boolean) targetVal).booleanValue()) {
						return false;
					} // else fall-through
				}
				return true;
			} catch (Exception e) {
				ChooseEditorDiagramEditorPlugin.getInstance().logError(
						"Link constraint evaluation error", e); //$NON-NLS-1$
				return false;
			}
		}

		/**
		 * @generated
		 */
		public boolean canExistActorContainerPartOf_4023(ActorContainer source,
				ActorContainer target) {
			try {
				if (source == null) {
					return true;
				} else {
					Map<String, EClassifier> env = Collections
							.<String, EClassifier> singletonMap(
									"oppositeEnd", ChooseeditorPackage.eINSTANCE.getActorContainer()); //$NON-NLS-1$
					Object sourceVal = ChooseEditorOCLFactory.getExpression(7,
							ChooseeditorPackage.eINSTANCE.getActorContainer(),
							env).evaluate(source,
							Collections.singletonMap("oppositeEnd", target)); //$NON-NLS-1$
					if (false == sourceVal instanceof Boolean
							|| !((Boolean) sourceVal).booleanValue()) {
						return false;
					} // else fall-through
				}
				if (target == null) {
					return true;
				} else {
					Map<String, EClassifier> env = Collections
							.<String, EClassifier> singletonMap(
									"oppositeEnd", ChooseeditorPackage.eINSTANCE.getActorContainer()); //$NON-NLS-1$
					Object targetVal = ChooseEditorOCLFactory.getExpression(8,
							ChooseeditorPackage.eINSTANCE.getActorContainer(),
							env).evaluate(target,
							Collections.singletonMap("oppositeEnd", source)); //$NON-NLS-1$
					if (false == targetVal instanceof Boolean
							|| !((Boolean) targetVal).booleanValue()) {
						return false;
					} // else fall-through
				}
				return true;
			} catch (Exception e) {
				ChooseEditorDiagramEditorPlugin.getInstance().logError(
						"Link constraint evaluation error", e); //$NON-NLS-1$
				return false;
			}
		}

		/**
		 * @generated
		 */
		public boolean canExistActorContainerIncludes_4024(
				ActorContainer source, ActorContainer target) {
			try {
				if (source == null) {
					return true;
				} else {
					Map<String, EClassifier> env = Collections
							.<String, EClassifier> singletonMap(
									"oppositeEnd", ChooseeditorPackage.eINSTANCE.getActorContainer()); //$NON-NLS-1$
					Object sourceVal = ChooseEditorOCLFactory.getExpression(9,
							ChooseeditorPackage.eINSTANCE.getActorContainer(),
							env).evaluate(source,
							Collections.singletonMap("oppositeEnd", target)); //$NON-NLS-1$
					if (false == sourceVal instanceof Boolean
							|| !((Boolean) sourceVal).booleanValue()) {
						return false;
					} // else fall-through
				}
				if (target == null) {
					return true;
				} else {
					Map<String, EClassifier> env = Collections
							.<String, EClassifier> singletonMap(
									"oppositeEnd", ChooseeditorPackage.eINSTANCE.getActorContainer()); //$NON-NLS-1$
					Object targetVal = ChooseEditorOCLFactory.getExpression(10,
							ChooseeditorPackage.eINSTANCE.getActorContainer(),
							env).evaluate(target,
							Collections.singletonMap("oppositeEnd", source)); //$NON-NLS-1$
					if (false == targetVal instanceof Boolean
							|| !((Boolean) targetVal).booleanValue()) {
						return false;
					} // else fall-through
				}
				return true;
			} catch (Exception e) {
				ChooseEditorDiagramEditorPlugin.getInstance().logError(
						"Link constraint evaluation error", e); //$NON-NLS-1$
				return false;
			}
		}

		/**
		 * @generated
		 */
		public boolean canExistOperationContainerResponsible_4025(
				OperationContainer source, ActorContainer target) {
			try {
				if (target == null) {
					return true;
				} else {
					Map<String, EClassifier> env = Collections
							.<String, EClassifier> singletonMap(
									"oppositeEnd", ChooseeditorPackage.eINSTANCE.getOperationContainer()); //$NON-NLS-1$
					Object targetVal = ChooseEditorOCLFactory.getExpression(11,
							ChooseeditorPackage.eINSTANCE.getActorContainer(),
							env).evaluate(target,
							Collections.singletonMap("oppositeEnd", source)); //$NON-NLS-1$
					if (false == targetVal instanceof Boolean
							|| !((Boolean) targetVal).booleanValue()) {
						return false;
					} // else fall-through
				}
				return true;
			} catch (Exception e) {
				ChooseEditorDiagramEditorPlugin.getInstance().logError(
						"Link constraint evaluation error", e); //$NON-NLS-1$
				return false;
			}
		}

		/**
		 * @generated
		 */
		public boolean canExistOperationContainerInform_4027(
				OperationContainer source, ActorContainer target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistOperationContainerConsult_4026(
				OperationContainer source, ActorContainer target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistOperationContainerAccountable_4028(
				OperationContainer source, ActorContainer target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistOperationContainerPartOf_4029(
				OperationContainer source, OperationContainer target) {
			try {
				if (source == null) {
					return true;
				} else {
					Map<String, EClassifier> env = Collections
							.<String, EClassifier> singletonMap(
									"oppositeEnd", ChooseeditorPackage.eINSTANCE.getOperationContainer()); //$NON-NLS-1$
					Object sourceVal = ChooseEditorOCLFactory.getExpression(
							12,
							ChooseeditorPackage.eINSTANCE
									.getOperationContainer(), env).evaluate(
							source,
							Collections.singletonMap("oppositeEnd", target)); //$NON-NLS-1$
					if (false == sourceVal instanceof Boolean
							|| !((Boolean) sourceVal).booleanValue()) {
						return false;
					} // else fall-through
				}
				if (target == null) {
					return true;
				} else {
					Map<String, EClassifier> env = Collections
							.<String, EClassifier> singletonMap(
									"oppositeEnd", ChooseeditorPackage.eINSTANCE.getOperationContainer()); //$NON-NLS-1$
					Object targetVal = ChooseEditorOCLFactory.getExpression(
							13,
							ChooseeditorPackage.eINSTANCE
									.getOperationContainer(), env).evaluate(
							target,
							Collections.singletonMap("oppositeEnd", source)); //$NON-NLS-1$
					if (false == targetVal instanceof Boolean
							|| !((Boolean) targetVal).booleanValue()) {
						return false;
					} // else fall-through
				}
				return true;
			} catch (Exception e) {
				ChooseEditorDiagramEditorPlugin.getInstance().logError(
						"Link constraint evaluation error", e); //$NON-NLS-1$
				return false;
			}
		}

		/**
		 * @generated
		 */
		public boolean canExistOperationContainerIncludes_4030(
				OperationContainer source, OperationContainer target) {
			try {
				if (source == null) {
					return true;
				} else {
					Map<String, EClassifier> env = Collections
							.<String, EClassifier> singletonMap(
									"oppositeEnd", ChooseeditorPackage.eINSTANCE.getOperationContainer()); //$NON-NLS-1$
					Object sourceVal = ChooseEditorOCLFactory.getExpression(
							14,
							ChooseeditorPackage.eINSTANCE
									.getOperationContainer(), env).evaluate(
							source,
							Collections.singletonMap("oppositeEnd", target)); //$NON-NLS-1$
					if (false == sourceVal instanceof Boolean
							|| !((Boolean) sourceVal).booleanValue()) {
						return false;
					} // else fall-through
				}
				if (target == null) {
					return true;
				} else {
					Map<String, EClassifier> env = Collections
							.<String, EClassifier> singletonMap(
									"oppositeEnd", ChooseeditorPackage.eINSTANCE.getOperationContainer()); //$NON-NLS-1$
					Object targetVal = ChooseEditorOCLFactory.getExpression(
							15,
							ChooseeditorPackage.eINSTANCE
									.getOperationContainer(), env).evaluate(
							target,
							Collections.singletonMap("oppositeEnd", source)); //$NON-NLS-1$
					if (false == targetVal instanceof Boolean
							|| !((Boolean) targetVal).booleanValue()) {
						return false;
					} // else fall-through
				}
				return true;
			} catch (Exception e) {
				ChooseEditorDiagramEditorPlugin.getInstance().logError(
						"Link constraint evaluation error", e); //$NON-NLS-1$
				return false;
			}
		}

		/**
		 * @generated
		 */
		public boolean canExistOperationContainerOperationalizes_4031(
				OperationContainer source, Goal target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistOperationContainerOutput_4032(
				OperationContainer source, chooseeditor.Object target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistOperationContainerInput_4033(
				OperationContainer source, chooseeditor.Object target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistObjectConcernsGoals_4038(
				chooseeditor.Object source, Goal target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistObjectMonitoredBy_4034(
				chooseeditor.Object source, ActorContainer target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistObjectInputFor_4036(chooseeditor.Object source,
				OperationContainer target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistObjectOutputOf_4037(chooseeditor.Object source,
				OperationContainer target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistObjectControlledBy_4035(
				chooseeditor.Object source, ActorContainer target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistObjectAssociates_4039(
				chooseeditor.Object source, chooseeditor.Object target) {
			try {
				if (target == null) {
					return true;
				} else {
					Map<String, EClassifier> env = Collections
							.<String, EClassifier> singletonMap(
									"oppositeEnd", ChooseeditorPackage.eINSTANCE.getObject()); //$NON-NLS-1$
					Object targetVal = ChooseEditorOCLFactory.getExpression(16,
							ChooseeditorPackage.eINSTANCE.getObject(), env)
							.evaluate(
									target,
									Collections.singletonMap(
											"oppositeEnd", source)); //$NON-NLS-1$
					if (false == targetVal instanceof Boolean
							|| !((Boolean) targetVal).booleanValue()) {
						return false;
					} // else fall-through
				}
				return true;
			} catch (Exception e) {
				ChooseEditorDiagramEditorPlugin.getInstance().logError(
						"Link constraint evaluation error", e); //$NON-NLS-1$
				return false;
			}
		}

		/**
		 * @generated
		 */
		public boolean canExistObjectAssociated_4040(
				chooseeditor.Object source, chooseeditor.Object target) {
			try {
				if (target == null) {
					return true;
				} else {
					Map<String, EClassifier> env = Collections
							.<String, EClassifier> singletonMap(
									"oppositeEnd", ChooseeditorPackage.eINSTANCE.getObject()); //$NON-NLS-1$
					Object targetVal = ChooseEditorOCLFactory.getExpression(17,
							ChooseeditorPackage.eINSTANCE.getObject(), env)
							.evaluate(
									target,
									Collections.singletonMap(
											"oppositeEnd", source)); //$NON-NLS-1$
					if (false == targetVal instanceof Boolean
							|| !((Boolean) targetVal).booleanValue()) {
						return false;
					} // else fall-through
				}
				return true;
			} catch (Exception e) {
				ChooseEditorDiagramEditorPlugin.getInstance().logError(
						"Link constraint evaluation error", e); //$NON-NLS-1$
				return false;
			}
		}

		/**
		 * @generated
		 */
		public boolean canExistObjectSpecialization_4041(
				chooseeditor.Object source, chooseeditor.Object target) {
			try {
				if (source == null) {
					return true;
				} else {
					Map<String, EClassifier> env = Collections
							.<String, EClassifier> singletonMap(
									"oppositeEnd", ChooseeditorPackage.eINSTANCE.getObject()); //$NON-NLS-1$
					Object sourceVal = ChooseEditorOCLFactory.getExpression(18,
							ChooseeditorPackage.eINSTANCE.getObject(), env)
							.evaluate(
									source,
									Collections.singletonMap(
											"oppositeEnd", target)); //$NON-NLS-1$
					if (false == sourceVal instanceof Boolean
							|| !((Boolean) sourceVal).booleanValue()) {
						return false;
					} // else fall-through
				}
				if (target == null) {
					return true;
				} else {
					Map<String, EClassifier> env = Collections
							.<String, EClassifier> singletonMap(
									"oppositeEnd", ChooseeditorPackage.eINSTANCE.getObject()); //$NON-NLS-1$
					Object targetVal = ChooseEditorOCLFactory.getExpression(19,
							ChooseeditorPackage.eINSTANCE.getObject(), env)
							.evaluate(
									target,
									Collections.singletonMap(
											"oppositeEnd", source)); //$NON-NLS-1$
					if (false == targetVal instanceof Boolean
							|| !((Boolean) targetVal).booleanValue()) {
						return false;
					} // else fall-through
				}
				return true;
			} catch (Exception e) {
				ChooseEditorDiagramEditorPlugin.getInstance().logError(
						"Link constraint evaluation error", e); //$NON-NLS-1$
				return false;
			}
		}

		/**
		 * @generated
		 */
		public boolean canExistObjectSpecializedBy_4042(
				chooseeditor.Object source, chooseeditor.Object target) {
			try {
				if (source == null) {
					return true;
				} else {
					Map<String, EClassifier> env = Collections
							.<String, EClassifier> singletonMap(
									"oppositeEnd", ChooseeditorPackage.eINSTANCE.getObject()); //$NON-NLS-1$
					Object sourceVal = ChooseEditorOCLFactory.getExpression(20,
							ChooseeditorPackage.eINSTANCE.getObject(), env)
							.evaluate(
									source,
									Collections.singletonMap(
											"oppositeEnd", target)); //$NON-NLS-1$
					if (false == sourceVal instanceof Boolean
							|| !((Boolean) sourceVal).booleanValue()) {
						return false;
					} // else fall-through
				}
				if (target == null) {
					return true;
				} else {
					Map<String, EClassifier> env = Collections
							.<String, EClassifier> singletonMap(
									"oppositeEnd", ChooseeditorPackage.eINSTANCE.getObject()); //$NON-NLS-1$
					Object targetVal = ChooseEditorOCLFactory.getExpression(21,
							ChooseeditorPackage.eINSTANCE.getObject(), env)
							.evaluate(
									target,
									Collections.singletonMap(
											"oppositeEnd", source)); //$NON-NLS-1$
					if (false == targetVal instanceof Boolean
							|| !((Boolean) targetVal).booleanValue()) {
						return false;
					} // else fall-through
				}
				return true;
			} catch (Exception e) {
				ChooseEditorDiagramEditorPlugin.getInstance().logError(
						"Link constraint evaluation error", e); //$NON-NLS-1$
				return false;
			}
		}

		/**
		 * @generated
		 */
		public boolean canExistObjectPartOf_4043(chooseeditor.Object source,
				chooseeditor.Object target) {
			try {
				if (source == null) {
					return true;
				} else {
					Map<String, EClassifier> env = Collections
							.<String, EClassifier> singletonMap(
									"oppositeEnd", ChooseeditorPackage.eINSTANCE.getObject()); //$NON-NLS-1$
					Object sourceVal = ChooseEditorOCLFactory.getExpression(22,
							ChooseeditorPackage.eINSTANCE.getObject(), env)
							.evaluate(
									source,
									Collections.singletonMap(
											"oppositeEnd", target)); //$NON-NLS-1$
					if (false == sourceVal instanceof Boolean
							|| !((Boolean) sourceVal).booleanValue()) {
						return false;
					} // else fall-through
				}
				if (target == null) {
					return true;
				} else {
					Map<String, EClassifier> env = Collections
							.<String, EClassifier> singletonMap(
									"oppositeEnd", ChooseeditorPackage.eINSTANCE.getObject()); //$NON-NLS-1$
					Object targetVal = ChooseEditorOCLFactory.getExpression(23,
							ChooseeditorPackage.eINSTANCE.getObject(), env)
							.evaluate(
									target,
									Collections.singletonMap(
											"oppositeEnd", source)); //$NON-NLS-1$
					if (false == targetVal instanceof Boolean
							|| !((Boolean) targetVal).booleanValue()) {
						return false;
					} // else fall-through
				}
				return true;
			} catch (Exception e) {
				ChooseEditorDiagramEditorPlugin.getInstance().logError(
						"Link constraint evaluation error", e); //$NON-NLS-1$
				return false;
			}
		}

		/**
		 * @generated
		 */
		public boolean canExistObjectIncludes_4044(chooseeditor.Object source,
				chooseeditor.Object target) {
			try {
				if (source == null) {
					return true;
				} else {
					Map<String, EClassifier> env = Collections
							.<String, EClassifier> singletonMap(
									"oppositeEnd", ChooseeditorPackage.eINSTANCE.getObject()); //$NON-NLS-1$
					Object sourceVal = ChooseEditorOCLFactory.getExpression(24,
							ChooseeditorPackage.eINSTANCE.getObject(), env)
							.evaluate(
									source,
									Collections.singletonMap(
											"oppositeEnd", target)); //$NON-NLS-1$
					if (false == sourceVal instanceof Boolean
							|| !((Boolean) sourceVal).booleanValue()) {
						return false;
					} // else fall-through
				}
				if (target == null) {
					return true;
				} else {
					Map<String, EClassifier> env = Collections
							.<String, EClassifier> singletonMap(
									"oppositeEnd", ChooseeditorPackage.eINSTANCE.getObject()); //$NON-NLS-1$
					Object targetVal = ChooseEditorOCLFactory.getExpression(25,
							ChooseeditorPackage.eINSTANCE.getObject(), env)
							.evaluate(
									target,
									Collections.singletonMap(
											"oppositeEnd", source)); //$NON-NLS-1$
					if (false == targetVal instanceof Boolean
							|| !((Boolean) targetVal).booleanValue()) {
						return false;
					} // else fall-through
				}
				return true;
			} catch (Exception e) {
				ChooseEditorDiagramEditorPlugin.getInstance().logError(
						"Link constraint evaluation error", e); //$NON-NLS-1$
				return false;
			}
		}
	}

}
