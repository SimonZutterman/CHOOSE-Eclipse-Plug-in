package CHOOSE.diagram.part;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.PaletteSeparator;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeConnectionTool;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import CHOOSE.diagram.providers.ChooseEditorElementTypes;

/**
 * @generated
 */
public class ChooseEditorPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createElements1Group());
	}

	/**
	 * Creates "Elements" palette tool group
	 * @generated
	 */
	private PaletteContainer createElements1Group() {
		PaletteGroup paletteContainer = new PaletteGroup(
				Messages.Elements1Group_title);
		paletteContainer.setId("createElements1Group"); //$NON-NLS-1$
		paletteContainer.add(createConnector1CreationTool());
		paletteContainer.add(new PaletteSeparator());
		paletteContainer.add(createGoal3CreationTool());
		paletteContainer.add(createRefinement4CreationTool());
		paletteContainer.add(new PaletteSeparator());
		paletteContainer.add(createActor6CreationTool());
		paletteContainer.add(createHumanActor7CreationTool());
		paletteContainer.add(createRole8CreationTool());
		paletteContainer.add(createSoftwareActor9CreationTool());
		paletteContainer.add(createDevice10CreationTool());
		paletteContainer.add(new PaletteSeparator());
		paletteContainer.add(createOperation12CreationTool());
		paletteContainer.add(createProcess13CreationTool());
		paletteContainer.add(createProject14CreationTool());
		paletteContainer.add(new PaletteSeparator());
		paletteContainer.add(createObject16CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnector1CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(41);
		types.add(ChooseEditorElementTypes.GoalAssignedTo_4001);
		types.add(ChooseEditorElementTypes.GoalWishedBy_4002);
		types.add(ChooseEditorElementTypes.GoalOr_4003);
		types.add(ChooseEditorElementTypes.GoalAnd_4004);
		types.add(ChooseEditorElementTypes.GoalConflicts_4006);
		types.add(ChooseEditorElementTypes.GoalConcernsObjects_4007);
		types.add(ChooseEditorElementTypes.GoalOperationalizedBy_4008);
		types.add(ChooseEditorElementTypes.RefinementSupergoal_4009);
		types.add(ChooseEditorElementTypes.RefinementSubgoals_4010);
		types.add(ChooseEditorElementTypes.ActorContainerWishes_4018);
		types.add(ChooseEditorElementTypes.ActorContainerConsultedFor_4012);
		types.add(ChooseEditorElementTypes.ActorContainerInformedFor_4013);
		types.add(ChooseEditorElementTypes.HumanActorSupervisors_4014);
		types.add(ChooseEditorElementTypes.HumanActorSupervisees_4015);
		types.add(ChooseEditorElementTypes.ActorContainerAssignments_4011);
		types.add(ChooseEditorElementTypes.RolePerformedBy_4017);
		types.add(ChooseEditorElementTypes.HumanActorPerforms_4016);
		types.add(ChooseEditorElementTypes.ActorContainerMonitors_4019);
		types.add(ChooseEditorElementTypes.ActorContainerControls_4020);
		types.add(ChooseEditorElementTypes.ActorContainerAccountableFor_4021);
		types.add(ChooseEditorElementTypes.ActorContainerResponsibleFor_4022);
		types.add(ChooseEditorElementTypes.ActorContainerPartOf_4023);
		types.add(ChooseEditorElementTypes.ActorContainerIncludes_4024);
		types.add(ChooseEditorElementTypes.OperationContainerResponsible_4025);
		types.add(ChooseEditorElementTypes.OperationContainerInform_4027);
		types.add(ChooseEditorElementTypes.OperationContainerConsult_4026);
		types.add(ChooseEditorElementTypes.OperationContainerAccountable_4028);
		types.add(ChooseEditorElementTypes.OperationContainerPartOf_4029);
		types.add(ChooseEditorElementTypes.OperationContainerIncludes_4030);
		types.add(ChooseEditorElementTypes.OperationContainerOperationalizes_4031);
		types.add(ChooseEditorElementTypes.OperationContainerOutput_4032);
		types.add(ChooseEditorElementTypes.OperationContainerInput_4033);
		types.add(ChooseEditorElementTypes.ObjectConcernsGoals_4038);
		types.add(ChooseEditorElementTypes.ObjectMonitoredBy_4034);
		types.add(ChooseEditorElementTypes.ObjectInputFor_4036);
		types.add(ChooseEditorElementTypes.ObjectOutputOf_4037);
		types.add(ChooseEditorElementTypes.ObjectControlledBy_4035);
		types.add(ChooseEditorElementTypes.ObjectAssociates_4039);
		types.add(ChooseEditorElementTypes.ObjectSpecialization_4041);
		types.add(ChooseEditorElementTypes.ObjectPartOf_4043);
		types.add(ChooseEditorElementTypes.ObjectIncludes_4044);
		LinkToolEntry entry = new LinkToolEntry(
				Messages.Connector1CreationTool_title,
				Messages.Connector1CreationTool_desc, types);
		entry.setId("createConnector1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ChooseEditorDiagramEditorPlugin
				.findImageDescriptor("/CHOOSE.edit/icons/full/obj16/Connection.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createGoal3CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Goal3CreationTool_title,
				Messages.Goal3CreationTool_desc,
				Collections.singletonList(ChooseEditorElementTypes.Goal_2001));
		entry.setId("createGoal3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ChooseEditorDiagramEditorPlugin
				.findImageDescriptor("/CHOOSE.edit/icons/full/obj16/Goal.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRefinement4CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Refinement4CreationTool_title,
				Messages.Refinement4CreationTool_desc,
				Collections
						.singletonList(ChooseEditorElementTypes.Refinement_2002));
		entry.setId("createRefinement4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ChooseEditorDiagramEditorPlugin
				.findImageDescriptor("/CHOOSE.edit/icons/full/obj16/Refinement.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createActor6CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Actor6CreationTool_title,
				Messages.Actor6CreationTool_desc,
				Collections.singletonList(ChooseEditorElementTypes.Actor_2003));
		entry.setId("createActor6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ChooseEditorDiagramEditorPlugin
				.findImageDescriptor("/CHOOSE.edit/icons/full/obj16/Actor.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createHumanActor7CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.HumanActor7CreationTool_title,
				Messages.HumanActor7CreationTool_desc,
				Collections
						.singletonList(ChooseEditorElementTypes.HumanActor_2004));
		entry.setId("createHumanActor7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ChooseEditorDiagramEditorPlugin
				.findImageDescriptor("/CHOOSE.edit/icons/full/obj16/HumanActor.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRole8CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Role8CreationTool_title,
				Messages.Role8CreationTool_desc,
				Collections.singletonList(ChooseEditorElementTypes.Role_2005));
		entry.setId("createRole8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ChooseEditorDiagramEditorPlugin
				.findImageDescriptor("/CHOOSE.edit/icons/full/obj16/Role.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSoftwareActor9CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.SoftwareActor9CreationTool_title,
				Messages.SoftwareActor9CreationTool_desc,
				Collections
						.singletonList(ChooseEditorElementTypes.SoftwareActor_2006));
		entry.setId("createSoftwareActor9CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ChooseEditorDiagramEditorPlugin
				.findImageDescriptor("/CHOOSE.edit/icons/full/obj16/SoftwareActor.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDevice10CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Device10CreationTool_title,
				Messages.Device10CreationTool_desc,
				Collections.singletonList(ChooseEditorElementTypes.Device_2007));
		entry.setId("createDevice10CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ChooseEditorDiagramEditorPlugin
				.findImageDescriptor("/CHOOSE.edit/icons/full/obj16/Device.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createOperation12CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Operation12CreationTool_title,
				Messages.Operation12CreationTool_desc,
				Collections
						.singletonList(ChooseEditorElementTypes.Operation_2008));
		entry.setId("createOperation12CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ChooseEditorDiagramEditorPlugin
				.findImageDescriptor("/CHOOSE.edit/icons/full/obj16/Operation.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createProcess13CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Process13CreationTool_title,
				Messages.Process13CreationTool_desc,
				Collections
						.singletonList(ChooseEditorElementTypes.Process_2009));
		entry.setId("createProcess13CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ChooseEditorDiagramEditorPlugin
				.findImageDescriptor("/CHOOSE.edit/icons/full/obj16/Process.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createProject14CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Project14CreationTool_title,
				Messages.Project14CreationTool_desc,
				Collections
						.singletonList(ChooseEditorElementTypes.Project_2010));
		entry.setId("createProject14CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ChooseEditorDiagramEditorPlugin
				.findImageDescriptor("/CHOOSE.edit/icons/full/obj16/Project.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createObject16CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Object16CreationTool_title,
				Messages.Object16CreationTool_desc,
				Collections.singletonList(ChooseEditorElementTypes.Object_2011));
		entry.setId("createObject16CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ChooseEditorDiagramEditorPlugin
				.findImageDescriptor("/CHOOSE.edit/icons/full/obj16/Object.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private static class NodeToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List<IElementType> elementTypes;

		/**
		 * @generated
		 */
		private NodeToolEntry(String title, String description,
				List<IElementType> elementTypes) {
			super(title, description, null, null);
			this.elementTypes = elementTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeCreationTool(elementTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}

	/**
	 * @generated
	 */
	private static class LinkToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List<IElementType> relationshipTypes;

		/**
		 * @generated
		 */
		private LinkToolEntry(String title, String description,
				List<IElementType> relationshipTypes) {
			super(title, description, null, null);
			this.relationshipTypes = relationshipTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeConnectionTool(relationshipTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}
}
