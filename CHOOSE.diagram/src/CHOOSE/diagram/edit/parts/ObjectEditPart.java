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

import CHOOSE.diagram.edit.policies.ObjectItemSemanticEditPolicy;
import CHOOSE.diagram.part.ChooseEditorVisualIDRegistry;
import CHOOSE.diagram.providers.ChooseEditorElementTypes;

/**
 * @generated
 */
public class ObjectEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2011;

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
	public ObjectEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new ObjectItemSemanticEditPolicy());
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
		return primaryShape = new ObjectFigure();
	}

	/**
	 * @generated
	 */
	public ObjectFigure getPrimaryShape() {
		return (ObjectFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof ObjectNameEditPart) {
			((ObjectNameEditPart) childEditPart).setLabel(getPrimaryShape()
					.getFigureObjectNameFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof ObjectNameEditPart) {
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
				.getType(ObjectNameEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSource() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(11);
		types.add(ChooseEditorElementTypes.ObjectConcernsGoals_4038);
		types.add(ChooseEditorElementTypes.ObjectMonitoredBy_4034);
		types.add(ChooseEditorElementTypes.ObjectInputFor_4036);
		types.add(ChooseEditorElementTypes.ObjectOutputOf_4037);
		types.add(ChooseEditorElementTypes.ObjectControlledBy_4035);
		types.add(ChooseEditorElementTypes.ObjectAssociates_4039);
		types.add(ChooseEditorElementTypes.ObjectAssociated_4040);
		types.add(ChooseEditorElementTypes.ObjectSpecialization_4041);
		types.add(ChooseEditorElementTypes.ObjectSpecializedBy_4042);
		types.add(ChooseEditorElementTypes.ObjectPartOf_4043);
		types.add(ChooseEditorElementTypes.ObjectIncludes_4044);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSourceAndTarget(
			IGraphicalEditPart targetEditPart) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof GoalEditPart) {
			types.add(ChooseEditorElementTypes.ObjectConcernsGoals_4038);
		}
		if (targetEditPart instanceof ActorEditPart) {
			types.add(ChooseEditorElementTypes.ObjectMonitoredBy_4034);
		}
		if (targetEditPart instanceof HumanActorEditPart) {
			types.add(ChooseEditorElementTypes.ObjectMonitoredBy_4034);
		}
		if (targetEditPart instanceof RoleEditPart) {
			types.add(ChooseEditorElementTypes.ObjectMonitoredBy_4034);
		}
		if (targetEditPart instanceof SoftwareActorEditPart) {
			types.add(ChooseEditorElementTypes.ObjectMonitoredBy_4034);
		}
		if (targetEditPart instanceof DeviceEditPart) {
			types.add(ChooseEditorElementTypes.ObjectMonitoredBy_4034);
		}
		if (targetEditPart instanceof OperationEditPart) {
			types.add(ChooseEditorElementTypes.ObjectInputFor_4036);
		}
		if (targetEditPart instanceof ProcessEditPart) {
			types.add(ChooseEditorElementTypes.ObjectInputFor_4036);
		}
		if (targetEditPart instanceof ProjectEditPart) {
			types.add(ChooseEditorElementTypes.ObjectInputFor_4036);
		}
		if (targetEditPart instanceof OperationEditPart) {
			types.add(ChooseEditorElementTypes.ObjectOutputOf_4037);
		}
		if (targetEditPart instanceof ProcessEditPart) {
			types.add(ChooseEditorElementTypes.ObjectOutputOf_4037);
		}
		if (targetEditPart instanceof ProjectEditPart) {
			types.add(ChooseEditorElementTypes.ObjectOutputOf_4037);
		}
		if (targetEditPart instanceof ActorEditPart) {
			types.add(ChooseEditorElementTypes.ObjectControlledBy_4035);
		}
		if (targetEditPart instanceof HumanActorEditPart) {
			types.add(ChooseEditorElementTypes.ObjectControlledBy_4035);
		}
		if (targetEditPart instanceof RoleEditPart) {
			types.add(ChooseEditorElementTypes.ObjectControlledBy_4035);
		}
		if (targetEditPart instanceof SoftwareActorEditPart) {
			types.add(ChooseEditorElementTypes.ObjectControlledBy_4035);
		}
		if (targetEditPart instanceof DeviceEditPart) {
			types.add(ChooseEditorElementTypes.ObjectControlledBy_4035);
		}
		if (targetEditPart instanceof CHOOSE.diagram.edit.parts.ObjectEditPart) {
			types.add(ChooseEditorElementTypes.ObjectAssociates_4039);
		}
		if (targetEditPart instanceof CHOOSE.diagram.edit.parts.ObjectEditPart) {
			types.add(ChooseEditorElementTypes.ObjectAssociated_4040);
		}
		if (targetEditPart instanceof CHOOSE.diagram.edit.parts.ObjectEditPart) {
			types.add(ChooseEditorElementTypes.ObjectSpecialization_4041);
		}
		if (targetEditPart instanceof CHOOSE.diagram.edit.parts.ObjectEditPart) {
			types.add(ChooseEditorElementTypes.ObjectSpecializedBy_4042);
		}
		if (targetEditPart instanceof CHOOSE.diagram.edit.parts.ObjectEditPart) {
			types.add(ChooseEditorElementTypes.ObjectPartOf_4043);
		}
		if (targetEditPart instanceof CHOOSE.diagram.edit.parts.ObjectEditPart) {
			types.add(ChooseEditorElementTypes.ObjectIncludes_4044);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForTarget(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == ChooseEditorElementTypes.ObjectConcernsGoals_4038) {
			types.add(ChooseEditorElementTypes.Goal_2001);
		} else if (relationshipType == ChooseEditorElementTypes.ObjectMonitoredBy_4034) {
			types.add(ChooseEditorElementTypes.Actor_2003);
			types.add(ChooseEditorElementTypes.HumanActor_2004);
			types.add(ChooseEditorElementTypes.Role_2005);
			types.add(ChooseEditorElementTypes.SoftwareActor_2006);
			types.add(ChooseEditorElementTypes.Device_2007);
		} else if (relationshipType == ChooseEditorElementTypes.ObjectInputFor_4036) {
			types.add(ChooseEditorElementTypes.Operation_2008);
			types.add(ChooseEditorElementTypes.Process_2009);
			types.add(ChooseEditorElementTypes.Project_2010);
		} else if (relationshipType == ChooseEditorElementTypes.ObjectOutputOf_4037) {
			types.add(ChooseEditorElementTypes.Operation_2008);
			types.add(ChooseEditorElementTypes.Process_2009);
			types.add(ChooseEditorElementTypes.Project_2010);
		} else if (relationshipType == ChooseEditorElementTypes.ObjectControlledBy_4035) {
			types.add(ChooseEditorElementTypes.Actor_2003);
			types.add(ChooseEditorElementTypes.HumanActor_2004);
			types.add(ChooseEditorElementTypes.Role_2005);
			types.add(ChooseEditorElementTypes.SoftwareActor_2006);
			types.add(ChooseEditorElementTypes.Device_2007);
		} else if (relationshipType == ChooseEditorElementTypes.ObjectAssociates_4039) {
			types.add(ChooseEditorElementTypes.Object_2011);
		} else if (relationshipType == ChooseEditorElementTypes.ObjectAssociated_4040) {
			types.add(ChooseEditorElementTypes.Object_2011);
		} else if (relationshipType == ChooseEditorElementTypes.ObjectSpecialization_4041) {
			types.add(ChooseEditorElementTypes.Object_2011);
		} else if (relationshipType == ChooseEditorElementTypes.ObjectSpecializedBy_4042) {
			types.add(ChooseEditorElementTypes.Object_2011);
		} else if (relationshipType == ChooseEditorElementTypes.ObjectPartOf_4043) {
			types.add(ChooseEditorElementTypes.Object_2011);
		} else if (relationshipType == ChooseEditorElementTypes.ObjectIncludes_4044) {
			types.add(ChooseEditorElementTypes.Object_2011);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnTarget() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(11);
		types.add(ChooseEditorElementTypes.GoalConcernsObjects_4007);
		types.add(ChooseEditorElementTypes.ActorContainerMonitors_4019);
		types.add(ChooseEditorElementTypes.ActorContainerControls_4020);
		types.add(ChooseEditorElementTypes.OperationContainerOutput_4032);
		types.add(ChooseEditorElementTypes.OperationContainerInput_4033);
		types.add(ChooseEditorElementTypes.ObjectAssociates_4039);
		types.add(ChooseEditorElementTypes.ObjectAssociated_4040);
		types.add(ChooseEditorElementTypes.ObjectSpecialization_4041);
		types.add(ChooseEditorElementTypes.ObjectSpecializedBy_4042);
		types.add(ChooseEditorElementTypes.ObjectPartOf_4043);
		types.add(ChooseEditorElementTypes.ObjectIncludes_4044);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForSource(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == ChooseEditorElementTypes.GoalConcernsObjects_4007) {
			types.add(ChooseEditorElementTypes.Goal_2001);
		} else if (relationshipType == ChooseEditorElementTypes.ActorContainerMonitors_4019) {
			types.add(ChooseEditorElementTypes.Actor_2003);
			types.add(ChooseEditorElementTypes.HumanActor_2004);
			types.add(ChooseEditorElementTypes.Role_2005);
			types.add(ChooseEditorElementTypes.SoftwareActor_2006);
			types.add(ChooseEditorElementTypes.Device_2007);
		} else if (relationshipType == ChooseEditorElementTypes.ActorContainerControls_4020) {
			types.add(ChooseEditorElementTypes.Actor_2003);
			types.add(ChooseEditorElementTypes.HumanActor_2004);
			types.add(ChooseEditorElementTypes.Role_2005);
			types.add(ChooseEditorElementTypes.SoftwareActor_2006);
			types.add(ChooseEditorElementTypes.Device_2007);
		} else if (relationshipType == ChooseEditorElementTypes.OperationContainerOutput_4032) {
			types.add(ChooseEditorElementTypes.Operation_2008);
			types.add(ChooseEditorElementTypes.Process_2009);
			types.add(ChooseEditorElementTypes.Project_2010);
		} else if (relationshipType == ChooseEditorElementTypes.OperationContainerInput_4033) {
			types.add(ChooseEditorElementTypes.Operation_2008);
			types.add(ChooseEditorElementTypes.Process_2009);
			types.add(ChooseEditorElementTypes.Project_2010);
		} else if (relationshipType == ChooseEditorElementTypes.ObjectAssociates_4039) {
			types.add(ChooseEditorElementTypes.Object_2011);
		} else if (relationshipType == ChooseEditorElementTypes.ObjectAssociated_4040) {
			types.add(ChooseEditorElementTypes.Object_2011);
		} else if (relationshipType == ChooseEditorElementTypes.ObjectSpecialization_4041) {
			types.add(ChooseEditorElementTypes.Object_2011);
		} else if (relationshipType == ChooseEditorElementTypes.ObjectSpecializedBy_4042) {
			types.add(ChooseEditorElementTypes.Object_2011);
		} else if (relationshipType == ChooseEditorElementTypes.ObjectPartOf_4043) {
			types.add(ChooseEditorElementTypes.Object_2011);
		} else if (relationshipType == ChooseEditorElementTypes.ObjectIncludes_4044) {
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
	public class ObjectFigure extends RoundedRectangle {

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
		private WrappingLabel fFigureObjectNameFigure;

		/**
		 * @generated
		 */
		public ObjectFigure() {

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

			fFigureObjectNameFigure = new WrappingLabel();

			fFigureObjectNameFigure.setText("<...>");
			fFigureObjectNameFigure.setTextWrap(true);
			fFigureObjectNameFigure.setFont(FFIGUREOBJECTNAMEFIGURE_FONT);

			GridData constraintFFigureObjectNameFigure = new GridData();
			constraintFFigureObjectNameFigure.verticalAlignment = GridData.CENTER;
			constraintFFigureObjectNameFigure.horizontalAlignment = GridData.CENTER;
			constraintFFigureObjectNameFigure.horizontalIndent = 1;
			constraintFFigureObjectNameFigure.horizontalSpan = 1;
			constraintFFigureObjectNameFigure.verticalSpan = 1;
			constraintFFigureObjectNameFigure.grabExcessHorizontalSpace = true;
			constraintFFigureObjectNameFigure.grabExcessVerticalSpace = true;
			this.add(fFigureObjectNameFigure, constraintFFigureObjectNameFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureObjectNameFigure() {
			return fFigureObjectNameFigure;
		}

	}

	/**
	 * @generated
	 */
	static final Color THIS_BACK = new Color(null, 145, 204, 185);

	/**
	 * @generated
	 */
	static final Font FFIGUREOBJECTNAMEFIGURE_FONT = new Font(
			Display.getCurrent(), Display.getDefault().getSystemFont()
					.getFontData()[0].getName(), 8, SWT.NORMAL);

}
