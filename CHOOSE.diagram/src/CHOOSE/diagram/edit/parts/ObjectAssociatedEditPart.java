package CHOOSE.diagram.edit.parts;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Connection;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.notation.View;

import CHOOSE.diagram.edit.policies.ObjectAssociatedItemSemanticEditPolicy;

/**
 * @generated
 */
public class ObjectAssociatedEditPart extends ConnectionNodeEditPart implements
		ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4040;

	/**
	 * @generated
	 */
	public ObjectAssociatedEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new ObjectAssociatedItemSemanticEditPolicy());
	}

	/**
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model
	 * so you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * @generated
	 */

	protected Connection createConnectionFigure() {
		return new ObjectAssociatedFigure();
	}

	/**
	 * @generated
	 */
	public ObjectAssociatedFigure getPrimaryShape() {
		return (ObjectAssociatedFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class ObjectAssociatedFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		public ObjectAssociatedFigure() {
			this.setForegroundColor(ColorConstants.darkGray);

		}

	}

}
