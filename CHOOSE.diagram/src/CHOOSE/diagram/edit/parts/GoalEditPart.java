package CHOOSE.diagram.edit.parts;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.GridData;
import org.eclipse.draw2d.GridLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.RoundedRectangle;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.editpolicies.ResizableEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.widgets.Display;

import CHOOSE.diagram.edit.policies.GoalItemSemanticEditPolicy;
import CHOOSE.diagram.part.ChooseEditorVisualIDRegistry;
import CHOOSE.diagram.providers.ChooseEditorElementTypes;

/**
 * @generated
 */
public class GoalEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2001;

	/**
	 * @generated
	 */
	protected IFigure contentPane;

	/**
	 * @generated
	 */
	protected IFigure primaryShape;

	/**
	 * @generated
	 */
	public GoalEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new GoalItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		// XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);
	}

	/**
	 * @generated
	 */
	protected LayoutEditPolicy createLayoutEditPolicy() {
		org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy lep = new org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy() {

			protected EditPolicy createChildEditPolicy(EditPart child) {
				EditPolicy result = child
						.getEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE);
				if (result == null) {
					result = new NonResizableEditPolicy();
				}
				return result;
			}

			protected Command getMoveChildrenCommand(Request request) {
				return null;
			}

			protected Command getCreateCommand(CreateRequest request) {
				return null;
			}
		};
		return lep;
	}

	/**
	 * @generated
	 */
	protected IFigure createNodeShape() {
		return primaryShape = new GoalFigure();
	}

	/**
	 * @generated
	 */
	public GoalFigure getPrimaryShape() {
		return (GoalFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof GoalNameEditPart) {
			((GoalNameEditPart) childEditPart).setLabel(getPrimaryShape()
					.getFigureGoalName());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof GoalNameEditPart) {
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected void addChildVisual(EditPart childEditPart, int index) {
		if (addFixedChild(childEditPart)) {
			return;
		}
		super.addChildVisual(childEditPart, -1);
	}

	/**
	 * @generated
	 */
	protected void removeChildVisual(EditPart childEditPart) {
		if (removeFixedChild(childEditPart)) {
			return;
		}
		super.removeChildVisual(childEditPart);
	}

	/**
	 * @generated
	 */
	protected IFigure getContentPaneFor(IGraphicalEditPart editPart) {
		return getContentPane();
	}

	/**
	 * @generated
	 */
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(110, 50);
		return result;
	}

	/**
	 * @generated
	 */
	public EditPolicy getPrimaryDragEditPolicy() {
		EditPolicy result = super.getPrimaryDragEditPolicy();
		if (result instanceof ResizableEditPolicy) {
			ResizableEditPolicy ep = (ResizableEditPolicy) result;
			ep.setResizeDirections(PositionConstants.EAST);
		}
		return result;
	}

	/**
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model
	 * so you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * @generated
	 */
	protected NodeFigure createNodeFigure() {
		NodeFigure figure = createNodePlate();
		figure.setLayoutManager(new StackLayout());
		IFigure shape = createNodeShape();
		figure.add(shape);
		contentPane = setupContentPane(shape);
		return figure;
	}

	/**
	 * Default implementation treats passed figure as content pane.
	 * Respects layout one may have set for generated figure.
	 * @param nodeShape instance of generated figure class
	 * @generated
	 */
	protected IFigure setupContentPane(IFigure nodeShape) {
		if (nodeShape.getLayoutManager() == null) {
			ConstrainedToolbarLayout layout = new ConstrainedToolbarLayout();
			layout.setSpacing(5);
			nodeShape.setLayoutManager(layout);
		}
		return nodeShape; // use nodeShape itself as contentPane
	}

	/**
	 * @generated
	 */
	public IFigure getContentPane() {
		if (contentPane != null) {
			return contentPane;
		}
		return super.getContentPane();
	}

	/**
	 * @generated
	 */
	protected void setForegroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setForegroundColor(color);
		}
	}

	/**
	 * @generated
	 */
	protected void setBackgroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setBackgroundColor(color);
		}
	}

	/**
	 * @generated
	 */
	protected void setLineWidth(int width) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineWidth(width);
		}
	}

	/**
	 * @generated
	 */
	protected void setLineType(int style) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineStyle(style);
		}
	}

	/**
	 * @generated
	 */
	public EditPart getPrimaryChildEditPart() {
		return getChildBySemanticHint(ChooseEditorVisualIDRegistry
				.getType(GoalNameEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSource() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(8);
		types.add(ChooseEditorElementTypes.GoalAssignedTo_4001);
		types.add(ChooseEditorElementTypes.GoalWishedBy_4002);
		types.add(ChooseEditorElementTypes.GoalOr_4003);
		types.add(ChooseEditorElementTypes.GoalAnd_4004);
		types.add(ChooseEditorElementTypes.GoalConflicted_4005);
		types.add(ChooseEditorElementTypes.GoalConflicts_4006);
		types.add(ChooseEditorElementTypes.GoalConcernsObjects_4007);
		types.add(ChooseEditorElementTypes.GoalOperationalizedBy_4008);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSourceAndTarget(
			IGraphicalEditPart targetEditPart) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof ActorEditPart) {
			types.add(ChooseEditorElementTypes.GoalAssignedTo_4001);
		}
		if (targetEditPart instanceof HumanActorEditPart) {
			types.add(ChooseEditorElementTypes.GoalAssignedTo_4001);
		}
		if (targetEditPart instanceof RoleEditPart) {
			types.add(ChooseEditorElementTypes.GoalAssignedTo_4001);
		}
		if (targetEditPart instanceof SoftwareActorEditPart) {
			types.add(ChooseEditorElementTypes.GoalAssignedTo_4001);
		}
		if (targetEditPart instanceof DeviceEditPart) {
			types.add(ChooseEditorElementTypes.GoalAssignedTo_4001);
		}
		if (targetEditPart instanceof ActorEditPart) {
			types.add(ChooseEditorElementTypes.GoalWishedBy_4002);
		}
		if (targetEditPart instanceof HumanActorEditPart) {
			types.add(ChooseEditorElementTypes.GoalWishedBy_4002);
		}
		if (targetEditPart instanceof RoleEditPart) {
			types.add(ChooseEditorElementTypes.GoalWishedBy_4002);
		}
		if (targetEditPart instanceof SoftwareActorEditPart) {
			types.add(ChooseEditorElementTypes.GoalWishedBy_4002);
		}
		if (targetEditPart instanceof DeviceEditPart) {
			types.add(ChooseEditorElementTypes.GoalWishedBy_4002);
		}
		if (targetEditPart instanceof RefinementEditPart) {
			types.add(ChooseEditorElementTypes.GoalOr_4003);
		}
		if (targetEditPart instanceof RefinementEditPart) {
			types.add(ChooseEditorElementTypes.GoalAnd_4004);
		}
		if (targetEditPart instanceof CHOOSE.diagram.edit.parts.GoalEditPart) {
			types.add(ChooseEditorElementTypes.GoalConflicted_4005);
		}
		if (targetEditPart instanceof CHOOSE.diagram.edit.parts.GoalEditPart) {
			types.add(ChooseEditorElementTypes.GoalConflicts_4006);
		}
		if (targetEditPart instanceof ObjectEditPart) {
			types.add(ChooseEditorElementTypes.GoalConcernsObjects_4007);
		}
		if (targetEditPart instanceof OperationEditPart) {
			types.add(ChooseEditorElementTypes.GoalOperationalizedBy_4008);
		}
		if (targetEditPart instanceof ProcessEditPart) {
			types.add(ChooseEditorElementTypes.GoalOperationalizedBy_4008);
		}
		if (targetEditPart instanceof ProjectEditPart) {
			types.add(ChooseEditorElementTypes.GoalOperationalizedBy_4008);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForTarget(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == ChooseEditorElementTypes.GoalAssignedTo_4001) {
			types.add(ChooseEditorElementTypes.Actor_2003);
			types.add(ChooseEditorElementTypes.HumanActor_2004);
			types.add(ChooseEditorElementTypes.Role_2005);
			types.add(ChooseEditorElementTypes.SoftwareActor_2006);
			types.add(ChooseEditorElementTypes.Device_2007);
		} else if (relationshipType == ChooseEditorElementTypes.GoalWishedBy_4002) {
			types.add(ChooseEditorElementTypes.Actor_2003);
			types.add(ChooseEditorElementTypes.HumanActor_2004);
			types.add(ChooseEditorElementTypes.Role_2005);
			types.add(ChooseEditorElementTypes.SoftwareActor_2006);
			types.add(ChooseEditorElementTypes.Device_2007);
		} else if (relationshipType == ChooseEditorElementTypes.GoalOr_4003) {
			types.add(ChooseEditorElementTypes.Refinement_2002);
		} else if (relationshipType == ChooseEditorElementTypes.GoalAnd_4004) {
			types.add(ChooseEditorElementTypes.Refinement_2002);
		} else if (relationshipType == ChooseEditorElementTypes.GoalConflicted_4005) {
			types.add(ChooseEditorElementTypes.Goal_2001);
		} else if (relationshipType == ChooseEditorElementTypes.GoalConflicts_4006) {
			types.add(ChooseEditorElementTypes.Goal_2001);
		} else if (relationshipType == ChooseEditorElementTypes.GoalConcernsObjects_4007) {
			types.add(ChooseEditorElementTypes.Object_2011);
		} else if (relationshipType == ChooseEditorElementTypes.GoalOperationalizedBy_4008) {
			types.add(ChooseEditorElementTypes.Operation_2008);
			types.add(ChooseEditorElementTypes.Process_2009);
			types.add(ChooseEditorElementTypes.Project_2010);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnTarget() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(8);
		types.add(ChooseEditorElementTypes.GoalConflicted_4005);
		types.add(ChooseEditorElementTypes.GoalConflicts_4006);
		types.add(ChooseEditorElementTypes.RefinementSupergoal_4009);
		types.add(ChooseEditorElementTypes.RefinementSubgoals_4010);
		types.add(ChooseEditorElementTypes.ActorContainerWishes_4018);
		types.add(ChooseEditorElementTypes.ActorContainerAssignments_4011);
		types.add(ChooseEditorElementTypes.OperationContainerOperationalizes_4031);
		types.add(ChooseEditorElementTypes.ObjectConcernsGoals_4038);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForSource(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == ChooseEditorElementTypes.GoalConflicted_4005) {
			types.add(ChooseEditorElementTypes.Goal_2001);
		} else if (relationshipType == ChooseEditorElementTypes.GoalConflicts_4006) {
			types.add(ChooseEditorElementTypes.Goal_2001);
		} else if (relationshipType == ChooseEditorElementTypes.RefinementSupergoal_4009) {
			types.add(ChooseEditorElementTypes.Refinement_2002);
		} else if (relationshipType == ChooseEditorElementTypes.RefinementSubgoals_4010) {
			types.add(ChooseEditorElementTypes.Refinement_2002);
		} else if (relationshipType == ChooseEditorElementTypes.ActorContainerWishes_4018) {
			types.add(ChooseEditorElementTypes.Actor_2003);
			types.add(ChooseEditorElementTypes.HumanActor_2004);
			types.add(ChooseEditorElementTypes.Role_2005);
			types.add(ChooseEditorElementTypes.SoftwareActor_2006);
			types.add(ChooseEditorElementTypes.Device_2007);
		} else if (relationshipType == ChooseEditorElementTypes.ActorContainerAssignments_4011) {
			types.add(ChooseEditorElementTypes.Actor_2003);
			types.add(ChooseEditorElementTypes.HumanActor_2004);
			types.add(ChooseEditorElementTypes.Role_2005);
			types.add(ChooseEditorElementTypes.SoftwareActor_2006);
			types.add(ChooseEditorElementTypes.Device_2007);
		} else if (relationshipType == ChooseEditorElementTypes.OperationContainerOperationalizes_4031) {
			types.add(ChooseEditorElementTypes.Operation_2008);
			types.add(ChooseEditorElementTypes.Process_2009);
			types.add(ChooseEditorElementTypes.Project_2010);
		} else if (relationshipType == ChooseEditorElementTypes.ObjectConcernsGoals_4038) {
			types.add(ChooseEditorElementTypes.Object_2011);
		}
		return types;
	}

	/**
	 * @generated
	 */
	protected void handleNotificationEvent(Notification event) {
		if (event.getNotifier() == getModel()
				&& EcorePackage.eINSTANCE.getEModelElement_EAnnotations()
						.equals(event.getFeature())) {
			handleMajorSemanticChange();
		} else {
			super.handleNotificationEvent(event);
		}
	}

	/**
	 * @generated
	 */
	public class GoalFigure extends RoundedRectangle {

		/**
		 * @generated NOT
		 */
		protected void fillShape(Graphics graphics) {
			// Backup the graphics colors
			Color bgColor = graphics.getBackgroundColor();
			Color fgColor = graphics.getForegroundColor();
			// Set the graphics color
			graphics.setBackgroundColor(ColorConstants.white);
			graphics.setForegroundColor(getBackgroundColor());
			// Restore the original colors
			graphics.fillGradient(getBounds(), true);
			graphics.setBackgroundColor(bgColor);
			graphics.setForegroundColor(fgColor);
		}

		/**
		 * @generated
		 */
		private WrappingLabel fFigureGoalName;

		/**
		 * @generated NOT
		 */
		public GoalFigure() {

			GridLayout layoutThis = new GridLayout();
			layoutThis.numColumns = 1;
			layoutThis.makeColumnsEqualWidth = true;
			this.setLayoutManager(layoutThis);

			this.setCornerDimensions(new Dimension(getMapMode().DPtoLP(8),
					getMapMode().DPtoLP(8)));
			this.setForegroundColor(ColorConstants.black);
			this.setBackgroundColor(THIS_BACK);
			this.setPreferredSize(new Dimension(getMapMode().DPtoLP(110),
					getMapMode().DPtoLP(50)));
			this.setMaximumSize(new Dimension(getMapMode().DPtoLP(160),
					getMapMode().DPtoLP(50)));
			this.setMinimumSize(new Dimension(getMapMode().DPtoLP(110),
					getMapMode().DPtoLP(50)));
			createContents();
		}

		/**
		 * @generated NOT
		 */
		private void createContents() {

			fFigureGoalName = new WrappingLabel();

			fFigureGoalName.setText("<...>");
			fFigureGoalName.setTextWrap(true);
			fFigureGoalName.setFont(FFIGUREGOALNAME_FONT);

			GridData constraintFFigureGoalName = new GridData();
			constraintFFigureGoalName.verticalAlignment = GridData.CENTER;
			constraintFFigureGoalName.horizontalAlignment = GridData.CENTER;
			constraintFFigureGoalName.horizontalIndent = 1;
			constraintFFigureGoalName.horizontalSpan = 1;
			constraintFFigureGoalName.verticalSpan = 1;
			constraintFFigureGoalName.grabExcessHorizontalSpace = true;
			constraintFFigureGoalName.grabExcessVerticalSpace = true;
			this.add(fFigureGoalName, constraintFFigureGoalName);

		}

		/**
		 * @generated NOT
		 */
		public WrappingLabel getFigureGoalName() {
			return fFigureGoalName;
		}

	}

	/**
	 * @generated
	 */
	static final Color THIS_BACK = new Color(null, 255, 255, 135);

	/**
	 * @generated
	 */
	static final Font FFIGUREGOALNAME_FONT = new Font(Display.getCurrent(),
			Display.getDefault().getSystemFont().getFontData()[0].getName(), 8,
			SWT.NORMAL);

}
