package CHOOSE.diagram.edit.parts;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Connection;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.draw2d.ArrowLocator;
import org.eclipse.draw2d.ConnectionLocator;
import org.eclipse.draw2d.PolygonDecoration;
import org.eclipse.draw2d.RotatableDecoration;
import org.eclipse.draw2d.geometry.PointList;

import CHOOSE.diagram.edit.policies.GoalConflictedItemSemanticEditPolicy;

/**
 * @generated
 */
public class GoalConflictedEditPart extends ConnectionNodeEditPart implements
		ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4005;

	/**
	 * @generated
	 */
	public GoalConflictedEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new GoalConflictedItemSemanticEditPolicy());
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
		return new GoalConflictedFigure();
	}

	/**
	 * @generated
	 */
	public GoalConflictedFigure getPrimaryShape() {
		return (GoalConflictedFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class GoalConflictedFigure extends PolylineConnectionEx {

		/**
		 * @generated NOT
		 */
		public GoalConflictedFigure() {
			this.setForegroundColor(ColorConstants.darkGray);
			setTargetDecoration(createTargetDecoration(), new ArrowLocator(
					this, ConnectionLocator.MIDDLE));
		}

		/**
		 * @generated NOT
		 */
		private RotatableDecoration createTargetDecoration() {
			PolygonDecoration df = new PolygonDecoration();
			df.setFill(true);
			df.setBackgroundColor(ColorConstants.red);
			PointList pl = new PointList();
			pl.addPoint(getMapMode().DPtoLP(0), getMapMode().DPtoLP(0));
			pl.addPoint(getMapMode().DPtoLP(-1), getMapMode().DPtoLP(0));
			pl.addPoint(getMapMode().DPtoLP(2), getMapMode().DPtoLP(-4));
			pl.addPoint(getMapMode().DPtoLP(1), getMapMode().DPtoLP(-1));
			pl.addPoint(getMapMode().DPtoLP(2), getMapMode().DPtoLP(-1));
			pl.addPoint(getMapMode().DPtoLP(-1), getMapMode().DPtoLP(3));
			pl.addPoint(getMapMode().DPtoLP(0), getMapMode().DPtoLP(0));
			df.setTemplate(pl);
			df.setScale(getMapMode().DPtoLP(7), getMapMode().DPtoLP(3));
			return df;
		}
	}

}
