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

import CHOOSE.diagram.edit.policies.ProcessItemSemanticEditPolicy;
import CHOOSE.diagram.part.ChooseEditorVisualIDRegistry;
import CHOOSE.diagram.providers.ChooseEditorElementTypes;

/**
 * @generated
 */
public class ProcessEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2009;

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
	public ProcessEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new ProcessItemSemanticEditPolicy());
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
		return primaryShape = new ProcessFigure();
	}

	/**
	 * @generated
	 */
	public ProcessFigure getPrimaryShape() {
		return (ProcessFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof ProcessNameEditPart) {
			((ProcessNameEditPart) childEditPart).setLabel(getPrimaryShape()
					.getFigureProcessOperationNameLabel());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof ProcessNameEditPart) {
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
				.getType(ProcessNameEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSource() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(9);
		types.add(ChooseEditorElementTypes.OperationContainerResponsible_4025);
		types.add(ChooseEditorElementTypes.OperationContainerInform_4027);
		types.add(ChooseEditorElementTypes.OperationContainerConsult_4026);
		types.add(ChooseEditorElementTypes.OperationContainerAccountable_4028);
		types.add(ChooseEditorElementTypes.OperationContainerPartOf_4029);
		types.add(ChooseEditorElementTypes.OperationContainerIncludes_4030);
		types.add(ChooseEditorElementTypes.OperationContainerOperationalizes_4031);
		types.add(ChooseEditorElementTypes.OperationContainerOutput_4032);
		types.add(ChooseEditorElementTypes.OperationContainerInput_4033);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSourceAndTarget(
			IGraphicalEditPart targetEditPart) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof ActorEditPart) {
			types.add(ChooseEditorElementTypes.OperationContainerResponsible_4025);
		}
		if (targetEditPart instanceof HumanActorEditPart) {
			types.add(ChooseEditorElementTypes.OperationContainerResponsible_4025);
		}
		if (targetEditPart instanceof RoleEditPart) {
			types.add(ChooseEditorElementTypes.OperationContainerResponsible_4025);
		}
		if (targetEditPart instanceof SoftwareActorEditPart) {
			types.add(ChooseEditorElementTypes.OperationContainerResponsible_4025);
		}
		if (targetEditPart instanceof DeviceEditPart) {
			types.add(ChooseEditorElementTypes.OperationContainerResponsible_4025);
		}
		if (targetEditPart instanceof ActorEditPart) {
			types.add(ChooseEditorElementTypes.OperationContainerInform_4027);
		}
		if (targetEditPart instanceof HumanActorEditPart) {
			types.add(ChooseEditorElementTypes.OperationContainerInform_4027);
		}
		if (targetEditPart instanceof RoleEditPart) {
			types.add(ChooseEditorElementTypes.OperationContainerInform_4027);
		}
		if (targetEditPart instanceof SoftwareActorEditPart) {
			types.add(ChooseEditorElementTypes.OperationContainerInform_4027);
		}
		if (targetEditPart instanceof DeviceEditPart) {
			types.add(ChooseEditorElementTypes.OperationContainerInform_4027);
		}
		if (targetEditPart instanceof ActorEditPart) {
			types.add(ChooseEditorElementTypes.OperationContainerConsult_4026);
		}
		if (targetEditPart instanceof HumanActorEditPart) {
			types.add(ChooseEditorElementTypes.OperationContainerConsult_4026);
		}
		if (targetEditPart instanceof RoleEditPart) {
			types.add(ChooseEditorElementTypes.OperationContainerConsult_4026);
		}
		if (targetEditPart instanceof SoftwareActorEditPart) {
			types.add(ChooseEditorElementTypes.OperationContainerConsult_4026);
		}
		if (targetEditPart instanceof DeviceEditPart) {
			types.add(ChooseEditorElementTypes.OperationContainerConsult_4026);
		}
		if (targetEditPart instanceof ActorEditPart) {
			types.add(ChooseEditorElementTypes.OperationContainerAccountable_4028);
		}
		if (targetEditPart instanceof HumanActorEditPart) {
			types.add(ChooseEditorElementTypes.OperationContainerAccountable_4028);
		}
		if (targetEditPart instanceof RoleEditPart) {
			types.add(ChooseEditorElementTypes.OperationContainerAccountable_4028);
		}
		if (targetEditPart instanceof SoftwareActorEditPart) {
			types.add(ChooseEditorElementTypes.OperationContainerAccountable_4028);
		}
		if (targetEditPart instanceof DeviceEditPart) {
			types.add(ChooseEditorElementTypes.OperationContainerAccountable_4028);
		}
		if (targetEditPart instanceof OperationEditPart) {
			types.add(ChooseEditorElementTypes.OperationContainerPartOf_4029);
		}
		if (targetEditPart instanceof CHOOSE.diagram.edit.parts.ProcessEditPart) {
			types.add(ChooseEditorElementTypes.OperationContainerPartOf_4029);
		}
		if (targetEditPart instanceof ProjectEditPart) {
			types.add(ChooseEditorElementTypes.OperationContainerPartOf_4029);
		}
		if (targetEditPart instanceof OperationEditPart) {
			types.add(ChooseEditorElementTypes.OperationContainerIncludes_4030);
		}
		if (targetEditPart instanceof CHOOSE.diagram.edit.parts.ProcessEditPart) {
			types.add(ChooseEditorElementTypes.OperationContainerIncludes_4030);
		}
		if (targetEditPart instanceof ProjectEditPart) {
			types.add(ChooseEditorElementTypes.OperationContainerIncludes_4030);
		}
		if (targetEditPart instanceof GoalEditPart) {
			types.add(ChooseEditorElementTypes.OperationContainerOperationalizes_4031);
		}
		if (targetEditPart instanceof ObjectEditPart) {
			types.add(ChooseEditorElementTypes.OperationContainerOutput_4032);
		}
		if (targetEditPart instanceof ObjectEditPart) {
			types.add(ChooseEditorElementTypes.OperationContainerInput_4033);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForTarget(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == ChooseEditorElementTypes.OperationContainerResponsible_4025) {
			types.add(ChooseEditorElementTypes.Actor_2003);
			types.add(ChooseEditorElementTypes.HumanActor_2004);
			types.add(ChooseEditorElementTypes.Role_2005);
			types.add(ChooseEditorElementTypes.SoftwareActor_2006);
			types.add(ChooseEditorElementTypes.Device_2007);
		} else if (relationshipType == ChooseEditorElementTypes.OperationContainerInform_4027) {
			types.add(ChooseEditorElementTypes.Actor_2003);
			types.add(ChooseEditorElementTypes.HumanActor_2004);
			types.add(ChooseEditorElementTypes.Role_2005);
			types.add(ChooseEditorElementTypes.SoftwareActor_2006);
			types.add(ChooseEditorElementTypes.Device_2007);
		} else if (relationshipType == ChooseEditorElementTypes.OperationContainerConsult_4026) {
			types.add(ChooseEditorElementTypes.Actor_2003);
			types.add(ChooseEditorElementTypes.HumanActor_2004);
			types.add(ChooseEditorElementTypes.Role_2005);
			types.add(ChooseEditorElementTypes.SoftwareActor_2006);
			types.add(ChooseEditorElementTypes.Device_2007);
		} else if (relationshipType == ChooseEditorElementTypes.OperationContainerAccountable_4028) {
			types.add(ChooseEditorElementTypes.Actor_2003);
			types.add(ChooseEditorElementTypes.HumanActor_2004);
			types.add(ChooseEditorElementTypes.Role_2005);
			types.add(ChooseEditorElementTypes.SoftwareActor_2006);
			types.add(ChooseEditorElementTypes.Device_2007);
		} else if (relationshipType == ChooseEditorElementTypes.OperationContainerPartOf_4029) {
			types.add(ChooseEditorElementTypes.Operation_2008);
			types.add(ChooseEditorElementTypes.Process_2009);
			types.add(ChooseEditorElementTypes.Project_2010);
		} else if (relationshipType == ChooseEditorElementTypes.OperationContainerIncludes_4030) {
			types.add(ChooseEditorElementTypes.Operation_2008);
			types.add(ChooseEditorElementTypes.Process_2009);
			types.add(ChooseEditorElementTypes.Project_2010);
		} else if (relationshipType == ChooseEditorElementTypes.OperationContainerOperationalizes_4031) {
			types.add(ChooseEditorElementTypes.Goal_2001);
		} else if (relationshipType == ChooseEditorElementTypes.OperationContainerOutput_4032) {
			types.add(ChooseEditorElementTypes.Object_2011);
		} else if (relationshipType == ChooseEditorElementTypes.OperationContainerInput_4033) {
			types.add(ChooseEditorElementTypes.Object_2011);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnTarget() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(9);
		types.add(ChooseEditorElementTypes.GoalOperationalizedBy_4008);
		types.add(ChooseEditorElementTypes.ActorContainerConsultedFor_4012);
		types.add(ChooseEditorElementTypes.ActorContainerInformedFor_4013);
		types.add(ChooseEditorElementTypes.ActorContainerAccountableFor_4021);
		types.add(ChooseEditorElementTypes.ActorContainerResponsibleFor_4022);
		types.add(ChooseEditorElementTypes.OperationContainerPartOf_4029);
		types.add(ChooseEditorElementTypes.OperationContainerIncludes_4030);
		types.add(ChooseEditorElementTypes.ObjectInputFor_4036);
		types.add(ChooseEditorElementTypes.ObjectOutputOf_4037);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForSource(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == ChooseEditorElementTypes.GoalOperationalizedBy_4008) {
			types.add(ChooseEditorElementTypes.Goal_2001);
		} else if (relationshipType == ChooseEditorElementTypes.ActorContainerConsultedFor_4012) {
			types.add(ChooseEditorElementTypes.Actor_2003);
			types.add(ChooseEditorElementTypes.HumanActor_2004);
			types.add(ChooseEditorElementTypes.Role_2005);
			types.add(ChooseEditorElementTypes.SoftwareActor_2006);
			types.add(ChooseEditorElementTypes.Device_2007);
		} else if (relationshipType == ChooseEditorElementTypes.ActorContainerInformedFor_4013) {
			types.add(ChooseEditorElementTypes.Actor_2003);
			types.add(ChooseEditorElementTypes.HumanActor_2004);
			types.add(ChooseEditorElementTypes.Role_2005);
			types.add(ChooseEditorElementTypes.SoftwareActor_2006);
			types.add(ChooseEditorElementTypes.Device_2007);
		} else if (relationshipType == ChooseEditorElementTypes.ActorContainerAccountableFor_4021) {
			types.add(ChooseEditorElementTypes.Actor_2003);
			types.add(ChooseEditorElementTypes.HumanActor_2004);
			types.add(ChooseEditorElementTypes.Role_2005);
			types.add(ChooseEditorElementTypes.SoftwareActor_2006);
			types.add(ChooseEditorElementTypes.Device_2007);
		} else if (relationshipType == ChooseEditorElementTypes.ActorContainerResponsibleFor_4022) {
			types.add(ChooseEditorElementTypes.Actor_2003);
			types.add(ChooseEditorElementTypes.HumanActor_2004);
			types.add(ChooseEditorElementTypes.Role_2005);
			types.add(ChooseEditorElementTypes.SoftwareActor_2006);
			types.add(ChooseEditorElementTypes.Device_2007);
		} else if (relationshipType == ChooseEditorElementTypes.OperationContainerPartOf_4029) {
			types.add(ChooseEditorElementTypes.Operation_2008);
			types.add(ChooseEditorElementTypes.Process_2009);
			types.add(ChooseEditorElementTypes.Project_2010);
		} else if (relationshipType == ChooseEditorElementTypes.OperationContainerIncludes_4030) {
			types.add(ChooseEditorElementTypes.Operation_2008);
			types.add(ChooseEditorElementTypes.Process_2009);
			types.add(ChooseEditorElementTypes.Project_2010);
		} else if (relationshipType == ChooseEditorElementTypes.ObjectInputFor_4036) {
			types.add(ChooseEditorElementTypes.Object_2011);
		} else if (relationshipType == ChooseEditorElementTypes.ObjectOutputOf_4037) {
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
	public class ProcessFigure extends RoundedRectangle {

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
		private WrappingLabel fFigureProcessOperationNameLabel;

		/**
		 * @generated
		 */
		public ProcessFigure() {

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

			fFigureProcessOperationNameLabel = new WrappingLabel();

			fFigureProcessOperationNameLabel.setText("<...>");
			fFigureProcessOperationNameLabel.setTextWrap(true);
			fFigureProcessOperationNameLabel
					.setFont(FFIGUREPROCESSOPERATIONNAMELABEL_FONT);

			GridData constraintFFigureProcessOperationNameLabel = new GridData();
			constraintFFigureProcessOperationNameLabel.verticalAlignment = GridData.CENTER;
			constraintFFigureProcessOperationNameLabel.horizontalAlignment = GridData.CENTER;
			constraintFFigureProcessOperationNameLabel.horizontalIndent = 1;
			constraintFFigureProcessOperationNameLabel.horizontalSpan = 1;
			constraintFFigureProcessOperationNameLabel.verticalSpan = 1;
			constraintFFigureProcessOperationNameLabel.grabExcessHorizontalSpace = true;
			constraintFFigureProcessOperationNameLabel.grabExcessVerticalSpace = true;
			this.add(fFigureProcessOperationNameLabel,
					constraintFFigureProcessOperationNameLabel);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureProcessOperationNameLabel() {
			return fFigureProcessOperationNameLabel;
		}

	}

	/**
	 * @generated
	 */
	static final Color THIS_BACK = new Color(null, 204, 204, 255);

	/**
	 * @generated
	 */
	static final Font FFIGUREPROCESSOPERATIONNAMELABEL_FONT = new Font(
			Display.getCurrent(), Display.getDefault().getSystemFont()
					.getFontData()[0].getName(), 8, SWT.NORMAL);

}
