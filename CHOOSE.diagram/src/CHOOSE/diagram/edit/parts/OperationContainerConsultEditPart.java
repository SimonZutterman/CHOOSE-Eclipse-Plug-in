package CHOOSE.diagram.edit.parts;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.PolygonDecoration;
import org.eclipse.draw2d.RotatableDecoration;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.notation.View;

import CHOOSE.diagram.edit.policies.OperationContainerConsultItemSemanticEditPolicy;

/**
 * @generated
 */
public class OperationContainerConsultEditPart extends ConnectionNodeEditPart
		implements ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4026;

	/**
	 * @generated
	 */
	public OperationContainerConsultEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new OperationContainerConsultItemSemanticEditPolicy());
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
		return new OperationConsultedFigure();
	}

	/**
	 * @generated
	 */
	public OperationConsultedFigure getPrimaryShape() {
		return (OperationConsultedFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class OperationConsultedFigure extends PolylineConnectionEx {

		/**
		 * @generated NOT
		 */
		public OperationConsultedFigure() {
			this.setLineStyle(Graphics.LINE_DASH);
			this.setForegroundColor(ColorConstants.darkGray);

			setSourceDecoration(createSourceDecoration());
			setTargetDecoration(createTargetDecoration());
		}

		/**
		 * @generated NOT
		 */
		private RotatableDecoration createSourceDecoration() {
			PolygonDecoration df = new PolygonDecoration();
			df.setFill(true);
			df.setForegroundColor(ColorConstants.darkGray);
			df.setBackgroundColor(ColorConstants.white);
			PointList pl = new PointList();
			pl.addPoint(getMapMode().DPtoLP(0), getMapMode().DPtoLP(0));
			pl.addPoint(getMapMode().DPtoLP(-2), getMapMode().DPtoLP(0));
			pl.addPoint(getMapMode().DPtoLP(-3), getMapMode().DPtoLP(1));
			pl.addPoint(getMapMode().DPtoLP(-3), getMapMode().DPtoLP(-1));
			pl.addPoint(getMapMode().DPtoLP(-2), getMapMode().DPtoLP(0));
			pl.addPoint(getMapMode().DPtoLP(0), getMapMode().DPtoLP(0));
			df.setTemplate(pl);
			df.setScale(getMapMode().DPtoLP(7), getMapMode().DPtoLP(3));
			return df;
		}

		/**
		 * @generated NOT
		 */
		private RotatableDecoration createTargetDecoration() {
			PolygonDecoration df = new PolygonDecoration();
			df.setFill(true);
			df.setForegroundColor(ColorConstants.darkGray);
			df.setBackgroundColor(ColorConstants.white);
			PointList pl = new PointList();
			pl.addPoint(getMapMode().DPtoLP(0), getMapMode().DPtoLP(0));
			pl.addPoint(getMapMode().DPtoLP(-2), getMapMode().DPtoLP(0));
			pl.addPoint(getMapMode().DPtoLP(-3), getMapMode().DPtoLP(1));
			pl.addPoint(getMapMode().DPtoLP(-3), getMapMode().DPtoLP(-1));
			pl.addPoint(getMapMode().DPtoLP(-2), getMapMode().DPtoLP(0));
			pl.addPoint(getMapMode().DPtoLP(0), getMapMode().DPtoLP(0));
			df.setTemplate(pl);
			df.setScale(getMapMode().DPtoLP(7), getMapMode().DPtoLP(3));
			return df;
		}

	}

}
