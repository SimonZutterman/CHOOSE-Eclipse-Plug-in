package CHOOSE.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;

import CHOOSE.diagram.providers.ChooseEditorElementTypes;

/**
 * @generated
 */
public class OperationContainerInputItemSemanticEditPolicy extends
		ChooseEditorBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public OperationContainerInputItemSemanticEditPolicy() {
		super(ChooseEditorElementTypes.OperationContainerInput_4033);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return getGEFWrapper(new DestroyReferenceCommand(req));
	}

}
