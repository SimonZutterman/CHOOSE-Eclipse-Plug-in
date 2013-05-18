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

import CHOOSE.diagram.edit.policies.DeviceItemSemanticEditPolicy;
import CHOOSE.diagram.part.ChooseEditorVisualIDRegistry;
import CHOOSE.diagram.providers.ChooseEditorElementTypes;

/**
 * @generated
 */
public class DeviceEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2007;

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
	public DeviceEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new DeviceItemSemanticEditPolicy());
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
		return primaryShape = new DeviceFigure();
	}

	/**
	 * @generated
	 */
	public DeviceFigure getPrimaryShape() {
		return (DeviceFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof DeviceNameEditPart) {
			((DeviceNameEditPart) childEditPart).setLabel(getPrimaryShape()
					.getFigureDeviceNameLabel());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof DeviceNameEditPart) {
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
				.getType(DeviceNameEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSource() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(10);
		types.add(ChooseEditorElementTypes.ActorContainerWishes_4018);
		types.add(ChooseEditorElementTypes.ActorContainerConsultedFor_4012);
		types.add(ChooseEditorElementTypes.ActorContainerInformedFor_4013);
		types.add(ChooseEditorElementTypes.ActorContainerAssignments_4011);
		types.add(ChooseEditorElementTypes.ActorContainerMonitors_4019);
		types.add(ChooseEditorElementTypes.ActorContainerControls_4020);
		types.add(ChooseEditorElementTypes.ActorContainerAccountableFor_4021);
		types.add(ChooseEditorElementTypes.ActorContainerResponsibleFor_4022);
		types.add(ChooseEditorElementTypes.ActorContainerPartOf_4023);
		types.add(ChooseEditorElementTypes.ActorContainerIncludes_4024);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSourceAndTarget(
			IGraphicalEditPart targetEditPart) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof GoalEditPart) {
			types.add(ChooseEditorElementTypes.ActorContainerWishes_4018);
		}
		if (targetEditPart instanceof OperationEditPart) {
			types.add(ChooseEditorElementTypes.ActorContainerConsultedFor_4012);
		}
		if (targetEditPart instanceof ProcessEditPart) {
			types.add(ChooseEditorElementTypes.ActorContainerConsultedFor_4012);
		}
		if (targetEditPart instanceof ProjectEditPart) {
			types.add(ChooseEditorElementTypes.ActorContainerConsultedFor_4012);
		}
		if (targetEditPart instanceof OperationEditPart) {
			types.add(ChooseEditorElementTypes.ActorContainerInformedFor_4013);
		}
		if (targetEditPart instanceof ProcessEditPart) {
			types.add(ChooseEditorElementTypes.ActorContainerInformedFor_4013);
		}
		if (targetEditPart instanceof ProjectEditPart) {
			types.add(ChooseEditorElementTypes.ActorContainerInformedFor_4013);
		}
		if (targetEditPart instanceof GoalEditPart) {
			types.add(ChooseEditorElementTypes.ActorContainerAssignments_4011);
		}
		if (targetEditPart instanceof ObjectEditPart) {
			types.add(ChooseEditorElementTypes.ActorContainerMonitors_4019);
		}
		if (targetEditPart instanceof ObjectEditPart) {
			types.add(ChooseEditorElementTypes.ActorContainerControls_4020);
		}
		if (targetEditPart instanceof OperationEditPart) {
			types.add(ChooseEditorElementTypes.ActorContainerAccountableFor_4021);
		}
		if (targetEditPart instanceof ProcessEditPart) {
			types.add(ChooseEditorElementTypes.ActorContainerAccountableFor_4021);
		}
		if (targetEditPart instanceof ProjectEditPart) {
			types.add(ChooseEditorElementTypes.ActorContainerAccountableFor_4021);
		}
		if (targetEditPart instanceof OperationEditPart) {
			types.add(ChooseEditorElementTypes.ActorContainerResponsibleFor_4022);
		}
		if (targetEditPart instanceof ProcessEditPart) {
			types.add(ChooseEditorElementTypes.ActorContainerResponsibleFor_4022);
		}
		if (targetEditPart instanceof ProjectEditPart) {
			types.add(ChooseEditorElementTypes.ActorContainerResponsibleFor_4022);
		}
		if (targetEditPart instanceof ActorEditPart) {
			types.add(ChooseEditorElementTypes.ActorContainerPartOf_4023);
		}
		if (targetEditPart instanceof HumanActorEditPart) {
			types.add(ChooseEditorElementTypes.ActorContainerPartOf_4023);
		}
		if (targetEditPart instanceof RoleEditPart) {
			types.add(ChooseEditorElementTypes.ActorContainerPartOf_4023);
		}
		if (targetEditPart instanceof SoftwareActorEditPart) {
			types.add(ChooseEditorElementTypes.ActorContainerPartOf_4023);
		}
		if (targetEditPart instanceof CHOOSE.diagram.edit.parts.DeviceEditPart) {
			types.add(ChooseEditorElementTypes.ActorContainerPartOf_4023);
		}
		if (targetEditPart instanceof ActorEditPart) {
			types.add(ChooseEditorElementTypes.ActorContainerIncludes_4024);
		}
		if (targetEditPart instanceof HumanActorEditPart) {
			types.add(ChooseEditorElementTypes.ActorContainerIncludes_4024);
		}
		if (targetEditPart instanceof RoleEditPart) {
			types.add(ChooseEditorElementTypes.ActorContainerIncludes_4024);
		}
		if (targetEditPart instanceof SoftwareActorEditPart) {
			types.add(ChooseEditorElementTypes.ActorContainerIncludes_4024);
		}
		if (targetEditPart instanceof CHOOSE.diagram.edit.parts.DeviceEditPart) {
			types.add(ChooseEditorElementTypes.ActorContainerIncludes_4024);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForTarget(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == ChooseEditorElementTypes.ActorContainerWishes_4018) {
			types.add(ChooseEditorElementTypes.Goal_2001);
		} else if (relationshipType == ChooseEditorElementTypes.ActorContainerConsultedFor_4012) {
			types.add(ChooseEditorElementTypes.Operation_2008);
			types.add(ChooseEditorElementTypes.Process_2009);
			types.add(ChooseEditorElementTypes.Project_2010);
		} else if (relationshipType == ChooseEditorElementTypes.ActorContainerInformedFor_4013) {
			types.add(ChooseEditorElementTypes.Operation_2008);
			types.add(ChooseEditorElementTypes.Process_2009);
			types.add(ChooseEditorElementTypes.Project_2010);
		} else if (relationshipType == ChooseEditorElementTypes.ActorContainerAssignments_4011) {
			types.add(ChooseEditorElementTypes.Goal_2001);
		} else if (relationshipType == ChooseEditorElementTypes.ActorContainerMonitors_4019) {
			types.add(ChooseEditorElementTypes.Object_2011);
		} else if (relationshipType == ChooseEditorElementTypes.ActorContainerControls_4020) {
			types.add(ChooseEditorElementTypes.Object_2011);
		} else if (relationshipType == ChooseEditorElementTypes.ActorContainerAccountableFor_4021) {
			types.add(ChooseEditorElementTypes.Operation_2008);
			types.add(ChooseEditorElementTypes.Process_2009);
			types.add(ChooseEditorElementTypes.Project_2010);
		} else if (relationshipType == ChooseEditorElementTypes.ActorContainerResponsibleFor_4022) {
			types.add(ChooseEditorElementTypes.Operation_2008);
			types.add(ChooseEditorElementTypes.Process_2009);
			types.add(ChooseEditorElementTypes.Project_2010);
		} else if (relationshipType == ChooseEditorElementTypes.ActorContainerPartOf_4023) {
			types.add(ChooseEditorElementTypes.Actor_2003);
			types.add(ChooseEditorElementTypes.HumanActor_2004);
			types.add(ChooseEditorElementTypes.Role_2005);
			types.add(ChooseEditorElementTypes.SoftwareActor_2006);
			types.add(ChooseEditorElementTypes.Device_2007);
		} else if (relationshipType == ChooseEditorElementTypes.ActorContainerIncludes_4024) {
			types.add(ChooseEditorElementTypes.Actor_2003);
			types.add(ChooseEditorElementTypes.HumanActor_2004);
			types.add(ChooseEditorElementTypes.Role_2005);
			types.add(ChooseEditorElementTypes.SoftwareActor_2006);
			types.add(ChooseEditorElementTypes.Device_2007);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnTarget() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(10);
		types.add(ChooseEditorElementTypes.GoalAssignedTo_4001);
		types.add(ChooseEditorElementTypes.GoalWishedBy_4002);
		types.add(ChooseEditorElementTypes.ActorContainerPartOf_4023);
		types.add(ChooseEditorElementTypes.ActorContainerIncludes_4024);
		types.add(ChooseEditorElementTypes.OperationContainerResponsible_4025);
		types.add(ChooseEditorElementTypes.OperationContainerInform_4027);
		types.add(ChooseEditorElementTypes.OperationContainerConsult_4026);
		types.add(ChooseEditorElementTypes.OperationContainerAccountable_4028);
		types.add(ChooseEditorElementTypes.ObjectMonitoredBy_4034);
		types.add(ChooseEditorElementTypes.ObjectControlledBy_4035);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForSource(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == ChooseEditorElementTypes.GoalAssignedTo_4001) {
			types.add(ChooseEditorElementTypes.Goal_2001);
		} else if (relationshipType == ChooseEditorElementTypes.GoalWishedBy_4002) {
			types.add(ChooseEditorElementTypes.Goal_2001);
		} else if (relationshipType == ChooseEditorElementTypes.ActorContainerPartOf_4023) {
			types.add(ChooseEditorElementTypes.Actor_2003);
			types.add(ChooseEditorElementTypes.HumanActor_2004);
			types.add(ChooseEditorElementTypes.Role_2005);
			types.add(ChooseEditorElementTypes.SoftwareActor_2006);
			types.add(ChooseEditorElementTypes.Device_2007);
		} else if (relationshipType == ChooseEditorElementTypes.ActorContainerIncludes_4024) {
			types.add(ChooseEditorElementTypes.Actor_2003);
			types.add(ChooseEditorElementTypes.HumanActor_2004);
			types.add(ChooseEditorElementTypes.Role_2005);
			types.add(ChooseEditorElementTypes.SoftwareActor_2006);
			types.add(ChooseEditorElementTypes.Device_2007);
		} else if (relationshipType == ChooseEditorElementTypes.OperationContainerResponsible_4025) {
			types.add(ChooseEditorElementTypes.Operation_2008);
			types.add(ChooseEditorElementTypes.Process_2009);
			types.add(ChooseEditorElementTypes.Project_2010);
		} else if (relationshipType == ChooseEditorElementTypes.OperationContainerInform_4027) {
			types.add(ChooseEditorElementTypes.Operation_2008);
			types.add(ChooseEditorElementTypes.Process_2009);
			types.add(ChooseEditorElementTypes.Project_2010);
		} else if (relationshipType == ChooseEditorElementTypes.OperationContainerConsult_4026) {
			types.add(ChooseEditorElementTypes.Operation_2008);
			types.add(ChooseEditorElementTypes.Process_2009);
			types.add(ChooseEditorElementTypes.Project_2010);
		} else if (relationshipType == ChooseEditorElementTypes.OperationContainerAccountable_4028) {
			types.add(ChooseEditorElementTypes.Operation_2008);
			types.add(ChooseEditorElementTypes.Process_2009);
			types.add(ChooseEditorElementTypes.Project_2010);
		} else if (relationshipType == ChooseEditorElementTypes.ObjectMonitoredBy_4034) {
			types.add(ChooseEditorElementTypes.Object_2011);
		} else if (relationshipType == ChooseEditorElementTypes.ObjectControlledBy_4035) {
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
	public class DeviceFigure extends RoundedRectangle {

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
		private WrappingLabel fFigureDeviceNameLabel;

		/**
		 * @generated
		 */
		public DeviceFigure() {

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
					getMapMode().DPtoLP(80)));
			this.setMinimumSize(new Dimension(getMapMode().DPtoLP(110),
					getMapMode().DPtoLP(50)));
			createContents();
		}

		/**
		 * @generated NOT
		 */
		private void createContents() {

			fFigureDeviceNameLabel = new WrappingLabel();

			fFigureDeviceNameLabel.setText("<...>");
			fFigureDeviceNameLabel.setTextWrap(true);
			fFigureDeviceNameLabel.setFont(FFIGUREDEVICENAMELABEL_FONT);

			GridData constraintFFigureDeviceNameLabel = new GridData();
			constraintFFigureDeviceNameLabel.verticalAlignment = GridData.CENTER;
			constraintFFigureDeviceNameLabel.horizontalAlignment = GridData.CENTER;
			constraintFFigureDeviceNameLabel.horizontalIndent = 1;
			constraintFFigureDeviceNameLabel.horizontalSpan = 1;
			constraintFFigureDeviceNameLabel.verticalSpan = 1;
			constraintFFigureDeviceNameLabel.grabExcessHorizontalSpace = true;
			constraintFFigureDeviceNameLabel.grabExcessVerticalSpace = true;
			this.add(fFigureDeviceNameLabel, constraintFFigureDeviceNameLabel);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureDeviceNameLabel() {
			return fFigureDeviceNameLabel;
		}

	}

	/**
	 * @generated
	 */
	static final Color THIS_BACK = new Color(null, 255, 216, 208);

	/**
	 * @generated
	 */
	static final Font FFIGUREDEVICENAMELABEL_FONT = new Font(
			Display.getCurrent(), Display.getDefault().getSystemFont()
					.getFontData()[0].getName(), 8, SWT.NORMAL);

}
