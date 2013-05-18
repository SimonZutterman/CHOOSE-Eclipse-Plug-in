package CHOOSE.diagram.edit.parts;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Connection;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;
import org.eclipse.draw2d.ArrowLocator;
import org.eclipse.draw2d.ConnectionLocator;
import org.eclipse.draw2d.PolygonDecoration;
import org.eclipse.draw2d.RotatableDecoration;
import org.eclipse.draw2d.geometry.PointList;

import CHOOSE.diagram.edit.policies.OperationContainerOperationalizesItemSemanticEditPolicy;

/**
 * @generated
 */
public class OperationContainerOperationalizesEditPart extends
		ConnectionNodeEditPart implements ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4031;

	/**
	 * @generated
	 */
	public OperationContainerOperationalizesEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new OperationContainerOperationalizesItemSemanticEditPolicy());
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
		return new OperationOperationalizesFigure();
	}

	/**
	 * @generated
	 */
	public OperationOperationalizesFigure getPrimaryShape() {
		return (OperationOperationalizesFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class OperationOperationalizesFigure extends PolylineConnectionEx {

		/**
		 * @generated NOT
		 */
		public OperationOperationalizesFigure() {
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
			df.setForegroundColor(ColorConstants.darkGray);
			df.setBackgroundColor(DF_BACK);
			PointList pl = new PointList();
			pl.addPoint(getMapMode().DPtoLP(2), getMapMode().DPtoLP(8));
			pl.addPoint(getMapMode().DPtoLP(6), getMapMode().DPtoLP(6));
			pl.addPoint(getMapMode().DPtoLP(8), getMapMode().DPtoLP(2));
			pl.addPoint(getMapMode().DPtoLP(8), getMapMode().DPtoLP(-2));
			pl.addPoint(getMapMode().DPtoLP(6), getMapMode().DPtoLP(-6));
			pl.addPoint(getMapMode().DPtoLP(2), getMapMode().DPtoLP(-8));
			pl.addPoint(getMapMode().DPtoLP(-2), getMapMode().DPtoLP(-8));
			pl.addPoint(getMapMode().DPtoLP(-6), getMapMode().DPtoLP(-6));
			pl.addPoint(getMapMode().DPtoLP(-8), getMapMode().DPtoLP(-2));
			pl.addPoint(getMapMode().DPtoLP(-8), getMapMode().DPtoLP(2));
			pl.addPoint(getMapMode().DPtoLP(-6), getMapMode().DPtoLP(6));
			pl.addPoint(getMapMode().DPtoLP(-2), getMapMode().DPtoLP(8));
			pl.addPoint(getMapMode().DPtoLP(2), getMapMode().DPtoLP(8));
			df.setTemplate(pl);
			df.setScale(getMapMode().DPtoLP(1), getMapMode().DPtoLP(1));
			return df;
		}

	}

	/**
	 * @generated NOT
	 */
	static final Color DF_BACK = new Color(null, 204, 204, 255);

}