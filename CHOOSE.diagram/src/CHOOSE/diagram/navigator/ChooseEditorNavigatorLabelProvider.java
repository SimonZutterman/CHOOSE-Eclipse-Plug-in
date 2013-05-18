package CHOOSE.diagram.navigator;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

import CHOOSE.diagram.edit.parts.ActorContainerAccountableForEditPart;
import CHOOSE.diagram.edit.parts.ActorContainerAssignmentsEditPart;
import CHOOSE.diagram.edit.parts.ActorContainerConsultedForEditPart;
import CHOOSE.diagram.edit.parts.ActorContainerControlsEditPart;
import CHOOSE.diagram.edit.parts.ActorContainerIncludesEditPart;
import CHOOSE.diagram.edit.parts.ActorContainerInformedForEditPart;
import CHOOSE.diagram.edit.parts.ActorContainerMonitorsEditPart;
import CHOOSE.diagram.edit.parts.ActorContainerPartOfEditPart;
import CHOOSE.diagram.edit.parts.ActorContainerResponsibleForEditPart;
import CHOOSE.diagram.edit.parts.ActorContainerWishesEditPart;
import CHOOSE.diagram.edit.parts.ActorEditPart;
import CHOOSE.diagram.edit.parts.ActorNameEditPart;
import CHOOSE.diagram.edit.parts.DeviceEditPart;
import CHOOSE.diagram.edit.parts.DeviceNameEditPart;
import CHOOSE.diagram.edit.parts.DiagramEditPart;
import CHOOSE.diagram.edit.parts.GoalAndEditPart;
import CHOOSE.diagram.edit.parts.GoalAssignedToEditPart;
import CHOOSE.diagram.edit.parts.GoalConcernsObjectsEditPart;
import CHOOSE.diagram.edit.parts.GoalConflictedEditPart;
import CHOOSE.diagram.edit.parts.GoalConflictsEditPart;
import CHOOSE.diagram.edit.parts.GoalEditPart;
import CHOOSE.diagram.edit.parts.GoalNameEditPart;
import CHOOSE.diagram.edit.parts.GoalOperationalizedByEditPart;
import CHOOSE.diagram.edit.parts.GoalOrEditPart;
import CHOOSE.diagram.edit.parts.GoalWishedByEditPart;
import CHOOSE.diagram.edit.parts.HumanActorEditPart;
import CHOOSE.diagram.edit.parts.HumanActorNameEditPart;
import CHOOSE.diagram.edit.parts.HumanActorPerformsEditPart;
import CHOOSE.diagram.edit.parts.HumanActorSuperviseesEditPart;
import CHOOSE.diagram.edit.parts.HumanActorSupervisorsEditPart;
import CHOOSE.diagram.edit.parts.ObjectAssociatedEditPart;
import CHOOSE.diagram.edit.parts.ObjectAssociatesEditPart;
import CHOOSE.diagram.edit.parts.ObjectConcernsGoalsEditPart;
import CHOOSE.diagram.edit.parts.ObjectControlledByEditPart;
import CHOOSE.diagram.edit.parts.ObjectEditPart;
import CHOOSE.diagram.edit.parts.ObjectIncludesEditPart;
import CHOOSE.diagram.edit.parts.ObjectInputForEditPart;
import CHOOSE.diagram.edit.parts.ObjectMonitoredByEditPart;
import CHOOSE.diagram.edit.parts.ObjectNameEditPart;
import CHOOSE.diagram.edit.parts.ObjectOutputOfEditPart;
import CHOOSE.diagram.edit.parts.ObjectPartOfEditPart;
import CHOOSE.diagram.edit.parts.ObjectSpecializationEditPart;
import CHOOSE.diagram.edit.parts.ObjectSpecializedByEditPart;
import CHOOSE.diagram.edit.parts.OperationContainerAccountableEditPart;
import CHOOSE.diagram.edit.parts.OperationContainerConsultEditPart;
import CHOOSE.diagram.edit.parts.OperationContainerIncludesEditPart;
import CHOOSE.diagram.edit.parts.OperationContainerInformEditPart;
import CHOOSE.diagram.edit.parts.OperationContainerInputEditPart;
import CHOOSE.diagram.edit.parts.OperationContainerOperationalizesEditPart;
import CHOOSE.diagram.edit.parts.OperationContainerOutputEditPart;
import CHOOSE.diagram.edit.parts.OperationContainerPartOfEditPart;
import CHOOSE.diagram.edit.parts.OperationContainerResponsibleEditPart;
import CHOOSE.diagram.edit.parts.OperationEditPart;
import CHOOSE.diagram.edit.parts.OperationNameEditPart;
import CHOOSE.diagram.edit.parts.ProcessEditPart;
import CHOOSE.diagram.edit.parts.ProcessNameEditPart;
import CHOOSE.diagram.edit.parts.ProjectEditPart;
import CHOOSE.diagram.edit.parts.ProjectNameEditPart;
import CHOOSE.diagram.edit.parts.RefinementEditPart;
import CHOOSE.diagram.edit.parts.RefinementSubgoalsEditPart;
import CHOOSE.diagram.edit.parts.RefinementSupergoalEditPart;
import CHOOSE.diagram.edit.parts.RoleEditPart;
import CHOOSE.diagram.edit.parts.RoleNameEditPart;
import CHOOSE.diagram.edit.parts.RolePerformedByEditPart;
import CHOOSE.diagram.edit.parts.SoftwareActorEditPart;
import CHOOSE.diagram.edit.parts.SoftwareActorNameEditPart;
import CHOOSE.diagram.part.ChooseEditorDiagramEditorPlugin;
import CHOOSE.diagram.part.ChooseEditorVisualIDRegistry;
import CHOOSE.diagram.providers.ChooseEditorElementTypes;
import CHOOSE.diagram.providers.ChooseEditorParserProvider;

/**
 * @generated
 */
public class ChooseEditorNavigatorLabelProvider extends LabelProvider implements
		ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		ChooseEditorDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		ChooseEditorDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof ChooseEditorNavigatorItem
				&& !isOwnView(((ChooseEditorNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (element instanceof ChooseEditorNavigatorGroup) {
			ChooseEditorNavigatorGroup group = (ChooseEditorNavigatorGroup) element;
			return ChooseEditorDiagramEditorPlugin.getInstance()
					.getBundledImage(group.getIcon());
		}

		if (element instanceof ChooseEditorNavigatorItem) {
			ChooseEditorNavigatorItem navigatorItem = (ChooseEditorNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getImage(view);
			}
		}

		return super.getImage(element);
	}

	/**
	 * @generated
	 */
	public Image getImage(View view) {
		switch (ChooseEditorVisualIDRegistry.getVisualID(view)) {
		case OperationEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://chooseeditor/1.0?Operation", ChooseEditorElementTypes.Operation_2008); //$NON-NLS-1$
		case ObjectAssociatesEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://chooseeditor/1.0?Object?Associates", ChooseEditorElementTypes.ObjectAssociates_4039); //$NON-NLS-1$
		case ActorContainerAccountableForEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://chooseeditor/1.0?ActorContainer?AccountableFor", ChooseEditorElementTypes.ActorContainerAccountableFor_4021); //$NON-NLS-1$
		case ActorContainerInformedForEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://chooseeditor/1.0?ActorContainer?InformedFor", ChooseEditorElementTypes.ActorContainerInformedFor_4013); //$NON-NLS-1$
		case ActorContainerPartOfEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://chooseeditor/1.0?ActorContainer?PartOf", ChooseEditorElementTypes.ActorContainerPartOf_4023); //$NON-NLS-1$
		case HumanActorSupervisorsEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://chooseeditor/1.0?HumanActor?Supervisors", ChooseEditorElementTypes.HumanActorSupervisors_4014); //$NON-NLS-1$
		case GoalAndEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://chooseeditor/1.0?Goal?And", ChooseEditorElementTypes.GoalAnd_4004); //$NON-NLS-1$
		case ActorContainerControlsEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://chooseeditor/1.0?ActorContainer?Controls", ChooseEditorElementTypes.ActorContainerControls_4020); //$NON-NLS-1$
		case OperationContainerInformEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://chooseeditor/1.0?OperationContainer?Inform", ChooseEditorElementTypes.OperationContainerInform_4027); //$NON-NLS-1$
		case ObjectAssociatedEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://chooseeditor/1.0?Object?Associated", ChooseEditorElementTypes.ObjectAssociated_4040); //$NON-NLS-1$
		case GoalOperationalizedByEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://chooseeditor/1.0?Goal?OperationalizedBy", ChooseEditorElementTypes.GoalOperationalizedBy_4008); //$NON-NLS-1$
		case GoalWishedByEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://chooseeditor/1.0?Goal?WishedBy", ChooseEditorElementTypes.GoalWishedBy_4002); //$NON-NLS-1$
		case GoalEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://chooseeditor/1.0?Goal", ChooseEditorElementTypes.Goal_2001); //$NON-NLS-1$
		case HumanActorSuperviseesEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://chooseeditor/1.0?HumanActor?Supervisees", ChooseEditorElementTypes.HumanActorSupervisees_4015); //$NON-NLS-1$
		case OperationContainerOutputEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://chooseeditor/1.0?OperationContainer?Output", ChooseEditorElementTypes.OperationContainerOutput_4032); //$NON-NLS-1$
		case ProjectEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://chooseeditor/1.0?Project", ChooseEditorElementTypes.Project_2010); //$NON-NLS-1$
		case DeviceEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://chooseeditor/1.0?Device", ChooseEditorElementTypes.Device_2007); //$NON-NLS-1$
		case OperationContainerConsultEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://chooseeditor/1.0?OperationContainer?Consult", ChooseEditorElementTypes.OperationContainerConsult_4026); //$NON-NLS-1$
		case OperationContainerOperationalizesEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://chooseeditor/1.0?OperationContainer?Operationalizes", ChooseEditorElementTypes.OperationContainerOperationalizes_4031); //$NON-NLS-1$
		case ObjectInputForEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://chooseeditor/1.0?Object?InputFor", ChooseEditorElementTypes.ObjectInputFor_4036); //$NON-NLS-1$
		case ObjectPartOfEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://chooseeditor/1.0?Object?PartOf", ChooseEditorElementTypes.ObjectPartOf_4043); //$NON-NLS-1$
		case ActorContainerConsultedForEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://chooseeditor/1.0?ActorContainer?ConsultedFor", ChooseEditorElementTypes.ActorContainerConsultedFor_4012); //$NON-NLS-1$
		case RefinementSubgoalsEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://chooseeditor/1.0?Refinement?Subgoals", ChooseEditorElementTypes.RefinementSubgoals_4010); //$NON-NLS-1$
		case ActorContainerWishesEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://chooseeditor/1.0?ActorContainer?Wishes", ChooseEditorElementTypes.ActorContainerWishes_4018); //$NON-NLS-1$
		case RefinementSupergoalEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://chooseeditor/1.0?Refinement?Supergoal", ChooseEditorElementTypes.RefinementSupergoal_4009); //$NON-NLS-1$
		case ActorContainerMonitorsEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://chooseeditor/1.0?ActorContainer?Monitors", ChooseEditorElementTypes.ActorContainerMonitors_4019); //$NON-NLS-1$
		case ObjectSpecializationEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://chooseeditor/1.0?Object?Specialization", ChooseEditorElementTypes.ObjectSpecialization_4041); //$NON-NLS-1$
		case GoalAssignedToEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://chooseeditor/1.0?Goal?AssignedTo", ChooseEditorElementTypes.GoalAssignedTo_4001); //$NON-NLS-1$
		case SoftwareActorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://chooseeditor/1.0?SoftwareActor", ChooseEditorElementTypes.SoftwareActor_2006); //$NON-NLS-1$
		case OperationContainerAccountableEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://chooseeditor/1.0?OperationContainer?Accountable", ChooseEditorElementTypes.OperationContainerAccountable_4028); //$NON-NLS-1$
		case OperationContainerPartOfEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://chooseeditor/1.0?OperationContainer?PartOf", ChooseEditorElementTypes.OperationContainerPartOf_4029); //$NON-NLS-1$
		case ObjectConcernsGoalsEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://chooseeditor/1.0?Object?ConcernsGoals", ChooseEditorElementTypes.ObjectConcernsGoals_4038); //$NON-NLS-1$
		case ProcessEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://chooseeditor/1.0?Process", ChooseEditorElementTypes.Process_2009); //$NON-NLS-1$
		case RolePerformedByEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://chooseeditor/1.0?Role?PerformedBy", ChooseEditorElementTypes.RolePerformedBy_4017); //$NON-NLS-1$
		case GoalConcernsObjectsEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://chooseeditor/1.0?Goal?ConcernsObjects", ChooseEditorElementTypes.GoalConcernsObjects_4007); //$NON-NLS-1$
		case ActorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://chooseeditor/1.0?Actor", ChooseEditorElementTypes.Actor_2003); //$NON-NLS-1$
		case ActorContainerAssignmentsEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://chooseeditor/1.0?ActorContainer?Assignments", ChooseEditorElementTypes.ActorContainerAssignments_4011); //$NON-NLS-1$
		case GoalConflictedEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://chooseeditor/1.0?Goal?Conflicted", ChooseEditorElementTypes.GoalConflicted_4005); //$NON-NLS-1$
		case ObjectSpecializedByEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://chooseeditor/1.0?Object?SpecializedBy", ChooseEditorElementTypes.ObjectSpecializedBy_4042); //$NON-NLS-1$
		case GoalConflictsEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://chooseeditor/1.0?Goal?Conflicts", ChooseEditorElementTypes.GoalConflicts_4006); //$NON-NLS-1$
		case ObjectControlledByEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://chooseeditor/1.0?Object?ControlledBy", ChooseEditorElementTypes.ObjectControlledBy_4035); //$NON-NLS-1$
		case ActorContainerResponsibleForEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://chooseeditor/1.0?ActorContainer?ResponsibleFor", ChooseEditorElementTypes.ActorContainerResponsibleFor_4022); //$NON-NLS-1$
		case ObjectIncludesEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://chooseeditor/1.0?Object?Includes", ChooseEditorElementTypes.ObjectIncludes_4044); //$NON-NLS-1$
		case ObjectOutputOfEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://chooseeditor/1.0?Object?OutputOf", ChooseEditorElementTypes.ObjectOutputOf_4037); //$NON-NLS-1$
		case HumanActorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://chooseeditor/1.0?HumanActor", ChooseEditorElementTypes.HumanActor_2004); //$NON-NLS-1$
		case DiagramEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http://chooseeditor/1.0?Diagram", ChooseEditorElementTypes.Diagram_1000); //$NON-NLS-1$
		case RoleEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://chooseeditor/1.0?Role", ChooseEditorElementTypes.Role_2005); //$NON-NLS-1$
		case ObjectEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://chooseeditor/1.0?Object", ChooseEditorElementTypes.Object_2011); //$NON-NLS-1$
		case OperationContainerInputEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://chooseeditor/1.0?OperationContainer?Input", ChooseEditorElementTypes.OperationContainerInput_4033); //$NON-NLS-1$
		case GoalOrEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://chooseeditor/1.0?Goal?Or", ChooseEditorElementTypes.GoalOr_4003); //$NON-NLS-1$
		case ActorContainerIncludesEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://chooseeditor/1.0?ActorContainer?Includes", ChooseEditorElementTypes.ActorContainerIncludes_4024); //$NON-NLS-1$
		case OperationContainerResponsibleEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://chooseeditor/1.0?OperationContainer?Responsible", ChooseEditorElementTypes.OperationContainerResponsible_4025); //$NON-NLS-1$
		case OperationContainerIncludesEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://chooseeditor/1.0?OperationContainer?Includes", ChooseEditorElementTypes.OperationContainerIncludes_4030); //$NON-NLS-1$
		case HumanActorPerformsEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://chooseeditor/1.0?HumanActor?Performs", ChooseEditorElementTypes.HumanActorPerforms_4016); //$NON-NLS-1$
		case RefinementEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://chooseeditor/1.0?Refinement", ChooseEditorElementTypes.Refinement_2002); //$NON-NLS-1$
		case ObjectMonitoredByEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://chooseeditor/1.0?Object?MonitoredBy", ChooseEditorElementTypes.ObjectMonitoredBy_4034); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = ChooseEditorDiagramEditorPlugin
				.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null
				&& ChooseEditorElementTypes.isKnownElementType(elementType)) {
			image = ChooseEditorElementTypes.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public String getText(Object element) {
		if (element instanceof ChooseEditorNavigatorGroup) {
			ChooseEditorNavigatorGroup group = (ChooseEditorNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof ChooseEditorNavigatorItem) {
			ChooseEditorNavigatorItem navigatorItem = (ChooseEditorNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getText(view);
			}
		}

		return super.getText(element);
	}

	/**
	 * @generated
	 */
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (ChooseEditorVisualIDRegistry.getVisualID(view)) {
		case OperationEditPart.VISUAL_ID:
			return getOperation_2008Text(view);
		case ObjectAssociatesEditPart.VISUAL_ID:
			return getObjectAssociates_4039Text(view);
		case ActorContainerAccountableForEditPart.VISUAL_ID:
			return getActorContainerAccountableFor_4021Text(view);
		case ActorContainerInformedForEditPart.VISUAL_ID:
			return getActorContainerInformedFor_4013Text(view);
		case ActorContainerPartOfEditPart.VISUAL_ID:
			return getActorContainerPartOf_4023Text(view);
		case HumanActorSupervisorsEditPart.VISUAL_ID:
			return getHumanActorSupervisors_4014Text(view);
		case GoalAndEditPart.VISUAL_ID:
			return getGoalAnd_4004Text(view);
		case ActorContainerControlsEditPart.VISUAL_ID:
			return getActorContainerControls_4020Text(view);
		case OperationContainerInformEditPart.VISUAL_ID:
			return getOperationContainerInform_4027Text(view);
		case ObjectAssociatedEditPart.VISUAL_ID:
			return getObjectAssociated_4040Text(view);
		case GoalOperationalizedByEditPart.VISUAL_ID:
			return getGoalOperationalizedBy_4008Text(view);
		case GoalWishedByEditPart.VISUAL_ID:
			return getGoalWishedBy_4002Text(view);
		case GoalEditPart.VISUAL_ID:
			return getGoal_2001Text(view);
		case HumanActorSuperviseesEditPart.VISUAL_ID:
			return getHumanActorSupervisees_4015Text(view);
		case OperationContainerOutputEditPart.VISUAL_ID:
			return getOperationContainerOutput_4032Text(view);
		case ProjectEditPart.VISUAL_ID:
			return getProject_2010Text(view);
		case DeviceEditPart.VISUAL_ID:
			return getDevice_2007Text(view);
		case OperationContainerConsultEditPart.VISUAL_ID:
			return getOperationContainerConsult_4026Text(view);
		case OperationContainerOperationalizesEditPart.VISUAL_ID:
			return getOperationContainerOperationalizes_4031Text(view);
		case ObjectInputForEditPart.VISUAL_ID:
			return getObjectInputFor_4036Text(view);
		case ObjectPartOfEditPart.VISUAL_ID:
			return getObjectPartOf_4043Text(view);
		case ActorContainerConsultedForEditPart.VISUAL_ID:
			return getActorContainerConsultedFor_4012Text(view);
		case RefinementSubgoalsEditPart.VISUAL_ID:
			return getRefinementSubgoals_4010Text(view);
		case ActorContainerWishesEditPart.VISUAL_ID:
			return getActorContainerWishes_4018Text(view);
		case RefinementSupergoalEditPart.VISUAL_ID:
			return getRefinementSupergoal_4009Text(view);
		case ActorContainerMonitorsEditPart.VISUAL_ID:
			return getActorContainerMonitors_4019Text(view);
		case ObjectSpecializationEditPart.VISUAL_ID:
			return getObjectSpecialization_4041Text(view);
		case GoalAssignedToEditPart.VISUAL_ID:
			return getGoalAssignedTo_4001Text(view);
		case SoftwareActorEditPart.VISUAL_ID:
			return getSoftwareActor_2006Text(view);
		case OperationContainerAccountableEditPart.VISUAL_ID:
			return getOperationContainerAccountable_4028Text(view);
		case OperationContainerPartOfEditPart.VISUAL_ID:
			return getOperationContainerPartOf_4029Text(view);
		case ObjectConcernsGoalsEditPart.VISUAL_ID:
			return getObjectConcernsGoals_4038Text(view);
		case ProcessEditPart.VISUAL_ID:
			return getProcess_2009Text(view);
		case RolePerformedByEditPart.VISUAL_ID:
			return getRolePerformedBy_4017Text(view);
		case GoalConcernsObjectsEditPart.VISUAL_ID:
			return getGoalConcernsObjects_4007Text(view);
		case ActorEditPart.VISUAL_ID:
			return getActor_2003Text(view);
		case ActorContainerAssignmentsEditPart.VISUAL_ID:
			return getActorContainerAssignments_4011Text(view);
		case GoalConflictedEditPart.VISUAL_ID:
			return getGoalConflicted_4005Text(view);
		case ObjectSpecializedByEditPart.VISUAL_ID:
			return getObjectSpecializedBy_4042Text(view);
		case GoalConflictsEditPart.VISUAL_ID:
			return getGoalConflicts_4006Text(view);
		case ObjectControlledByEditPart.VISUAL_ID:
			return getObjectControlledBy_4035Text(view);
		case ActorContainerResponsibleForEditPart.VISUAL_ID:
			return getActorContainerResponsibleFor_4022Text(view);
		case ObjectIncludesEditPart.VISUAL_ID:
			return getObjectIncludes_4044Text(view);
		case ObjectOutputOfEditPart.VISUAL_ID:
			return getObjectOutputOf_4037Text(view);
		case HumanActorEditPart.VISUAL_ID:
			return getHumanActor_2004Text(view);
		case DiagramEditPart.VISUAL_ID:
			return getDiagram_1000Text(view);
		case RoleEditPart.VISUAL_ID:
			return getRole_2005Text(view);
		case ObjectEditPart.VISUAL_ID:
			return getObject_2011Text(view);
		case OperationContainerInputEditPart.VISUAL_ID:
			return getOperationContainerInput_4033Text(view);
		case GoalOrEditPart.VISUAL_ID:
			return getGoalOr_4003Text(view);
		case ActorContainerIncludesEditPart.VISUAL_ID:
			return getActorContainerIncludes_4024Text(view);
		case OperationContainerResponsibleEditPart.VISUAL_ID:
			return getOperationContainerResponsible_4025Text(view);
		case OperationContainerIncludesEditPart.VISUAL_ID:
			return getOperationContainerIncludes_4030Text(view);
		case HumanActorPerformsEditPart.VISUAL_ID:
			return getHumanActorPerforms_4016Text(view);
		case RefinementEditPart.VISUAL_ID:
			return getRefinement_2002Text(view);
		case ObjectMonitoredByEditPart.VISUAL_ID:
			return getObjectMonitoredBy_4034Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getRefinement_2002Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getActorContainerControls_4020Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getOperationContainerPartOf_4029Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getOperationContainerIncludes_4030Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getHumanActorPerforms_4016Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getObjectMonitoredBy_4034Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getObjectAssociated_4040Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getSoftwareActor_2006Text(View view) {
		IParser parser = ChooseEditorParserProvider.getParser(
				ChooseEditorElementTypes.SoftwareActor_2006,
				view.getElement() != null ? view.getElement() : view,
				ChooseEditorVisualIDRegistry
						.getType(SoftwareActorNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ChooseEditorDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getObjectIncludes_4044Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getGoalAssignedTo_4001Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getActorContainerAssignments_4011Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getObjectControlledBy_4035Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getHumanActorSupervisors_4014Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getGoalAnd_4004Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getRefinementSupergoal_4009Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getGoalConcernsObjects_4007Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getActorContainerWishes_4018Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getOperationContainerInput_4033Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getProject_2010Text(View view) {
		IParser parser = ChooseEditorParserProvider.getParser(
				ChooseEditorElementTypes.Project_2010,
				view.getElement() != null ? view.getElement() : view,
				ChooseEditorVisualIDRegistry
						.getType(ProjectNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ChooseEditorDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5009); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getActorContainerResponsibleFor_4022Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getGoalWishedBy_4002Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getObjectInputFor_4036Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getObjectSpecialization_4041Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getActorContainerPartOf_4023Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getGoalOperationalizedBy_4008Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getGoalOr_4003Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getRolePerformedBy_4017Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getOperationContainerOperationalizes_4031Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getOperationContainerConsult_4026Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getActorContainerConsultedFor_4012Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getDevice_2007Text(View view) {
		IParser parser = ChooseEditorParserProvider.getParser(
				ChooseEditorElementTypes.Device_2007,
				view.getElement() != null ? view.getElement() : view,
				ChooseEditorVisualIDRegistry
						.getType(DeviceNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ChooseEditorDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5006); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getActorContainerMonitors_4019Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getOperationContainerOutput_4032Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getObjectConcernsGoals_4038Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getObjectSpecializedBy_4042Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getOperationContainerInform_4027Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getActorContainerInformedFor_4013Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getDiagram_1000Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getGoal_2001Text(View view) {
		IParser parser = ChooseEditorParserProvider.getParser(
				ChooseEditorElementTypes.Goal_2001,
				view.getElement() != null ? view.getElement() : view,
				ChooseEditorVisualIDRegistry
						.getType(GoalNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ChooseEditorDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getGoalConflicts_4006Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getActorContainerIncludes_4024Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getProcess_2009Text(View view) {
		IParser parser = ChooseEditorParserProvider.getParser(
				ChooseEditorElementTypes.Process_2009,
				view.getElement() != null ? view.getElement() : view,
				ChooseEditorVisualIDRegistry
						.getType(ProcessNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ChooseEditorDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5008); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getOperation_2008Text(View view) {
		IParser parser = ChooseEditorParserProvider.getParser(
				ChooseEditorElementTypes.Operation_2008,
				view.getElement() != null ? view.getElement() : view,
				ChooseEditorVisualIDRegistry
						.getType(OperationNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ChooseEditorDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5007); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getGoalConflicted_4005Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getObjectAssociates_4039Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getObjectPartOf_4043Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getActorContainerAccountableFor_4021Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getRefinementSubgoals_4010Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getHumanActor_2004Text(View view) {
		IParser parser = ChooseEditorParserProvider.getParser(
				ChooseEditorElementTypes.HumanActor_2004,
				view.getElement() != null ? view.getElement() : view,
				ChooseEditorVisualIDRegistry
						.getType(HumanActorNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ChooseEditorDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getActor_2003Text(View view) {
		IParser parser = ChooseEditorParserProvider.getParser(
				ChooseEditorElementTypes.Actor_2003,
				view.getElement() != null ? view.getElement() : view,
				ChooseEditorVisualIDRegistry
						.getType(ActorNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ChooseEditorDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getHumanActorSupervisees_4015Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getObject_2011Text(View view) {
		IParser parser = ChooseEditorParserProvider.getParser(
				ChooseEditorElementTypes.Object_2011,
				view.getElement() != null ? view.getElement() : view,
				ChooseEditorVisualIDRegistry
						.getType(ObjectNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ChooseEditorDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5010); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getObjectOutputOf_4037Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getRole_2005Text(View view) {
		IParser parser = ChooseEditorParserProvider.getParser(
				ChooseEditorElementTypes.Role_2005,
				view.getElement() != null ? view.getElement() : view,
				ChooseEditorVisualIDRegistry
						.getType(RoleNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ChooseEditorDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getOperationContainerAccountable_4028Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getOperationContainerResponsible_4025Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public void restoreState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void saveState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return DiagramEditPart.MODEL_ID.equals(ChooseEditorVisualIDRegistry
				.getModelID(view));
	}

}
