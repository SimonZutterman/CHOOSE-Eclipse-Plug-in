package CHOOSE.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

import CHOOSE.diagram.edit.policies.ChooseEditorBaseItemSemanticEditPolicy;
import chooseeditor.ActorContainer;
import chooseeditor.OperationContainer;

/**
 * @generated
 */
public class OperationContainerResponsibleReorientCommand extends
		EditElementCommand {

	/**
	 * @generated
	 */
	private final int reorientDirection;

	/**
	 * @generated
	 */
	private final EObject referenceOwner;

	/**
	 * @generated
	 */
	private final EObject oldEnd;

	/**
	 * @generated
	 */
	private final EObject newEnd;

	/**
	 * @generated
	 */
	public OperationContainerResponsibleReorientCommand(
			ReorientReferenceRelationshipRequest request) {
		super(request.getLabel(), null, request);
		reorientDirection = request.getDirection();
		referenceOwner = request.getReferenceOwner();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == referenceOwner instanceof OperationContainer) {
			return false;
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return canReorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return canReorientTarget();
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean canReorientSource() {
		if (!(oldEnd instanceof ActorContainer && newEnd instanceof OperationContainer)) {
			return false;
		}
		return ChooseEditorBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistOperationContainerResponsible_4025(getNewSource(),
						getOldTarget());
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof ActorContainer && newEnd instanceof ActorContainer)) {
			return false;
		}
		return ChooseEditorBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistOperationContainerResponsible_4025(getOldSource(),
						getNewTarget());
	}

	/**
	 * @generated
	 */
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor,
			IAdaptable info) throws ExecutionException {
		if (!canExecute()) {
			throw new ExecutionException(
					"Invalid arguments in reorient link command"); //$NON-NLS-1$
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return reorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return reorientTarget();
		}
		throw new IllegalStateException();
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientSource() throws ExecutionException {
		getOldSource().getResponsible().remove(getOldTarget());
		getNewSource().getResponsible().add(getOldTarget());
		return CommandResult.newOKCommandResult(referenceOwner);
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {
		getOldSource().getResponsible().remove(getOldTarget());
		getOldSource().getResponsible().add(getNewTarget());
		return CommandResult.newOKCommandResult(referenceOwner);
	}

	/**
	 * @generated
	 */
	protected OperationContainer getOldSource() {
		return (OperationContainer) referenceOwner;
	}

	/**
	 * @generated
	 */
	protected OperationContainer getNewSource() {
		return (OperationContainer) newEnd;
	}

	/**
	 * @generated
	 */
	protected ActorContainer getOldTarget() {
		return (ActorContainer) oldEnd;
	}

	/**
	 * @generated
	 */
	protected ActorContainer getNewTarget() {
		return (ActorContainer) newEnd;
	}
}
