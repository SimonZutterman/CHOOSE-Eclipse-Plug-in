package CHOOSE.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

import CHOOSE.diagram.edit.parts.ActorEditPart;
import CHOOSE.diagram.edit.parts.ActorNameEditPart;
import CHOOSE.diagram.edit.parts.DeviceEditPart;
import CHOOSE.diagram.edit.parts.DeviceNameEditPart;
import CHOOSE.diagram.edit.parts.DiagramEditPart;
import CHOOSE.diagram.edit.parts.GoalEditPart;
import CHOOSE.diagram.edit.parts.GoalNameEditPart;
import CHOOSE.diagram.edit.parts.HumanActorEditPart;
import CHOOSE.diagram.edit.parts.HumanActorNameEditPart;
import CHOOSE.diagram.edit.parts.ObjectEditPart;
import CHOOSE.diagram.edit.parts.ObjectNameEditPart;
import CHOOSE.diagram.edit.parts.OperationEditPart;
import CHOOSE.diagram.edit.parts.OperationNameEditPart;
import CHOOSE.diagram.edit.parts.ProcessEditPart;
import CHOOSE.diagram.edit.parts.ProcessNameEditPart;
import CHOOSE.diagram.edit.parts.ProjectEditPart;
import CHOOSE.diagram.edit.parts.ProjectNameEditPart;
import CHOOSE.diagram.edit.parts.RefinementEditPart;
import CHOOSE.diagram.edit.parts.RoleEditPart;
import CHOOSE.diagram.edit.parts.RoleNameEditPart;
import CHOOSE.diagram.edit.parts.SoftwareActorEditPart;
import CHOOSE.diagram.edit.parts.SoftwareActorNameEditPart;
import chooseeditor.ChooseeditorPackage;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class ChooseEditorVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "CHOOSE.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (DiagramEditPart.MODEL_ID.equals(view.getType())) {
				return DiagramEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return CHOOSE.diagram.part.ChooseEditorVisualIDRegistry
				.getVisualID(view.getType());
	}

	/**
	 * @generated
	 */
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	 * @generated
	 */
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(
					Platform.getDebugOption(DEBUG_KEY))) {
				ChooseEditorDiagramEditorPlugin.getInstance().logError(
						"Unable to parse view type as a visualID number: "
								+ type);
			}
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	 * @generated
	 */
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (ChooseeditorPackage.eINSTANCE.getDiagram().isSuperTypeOf(
				domainElement.eClass())
				&& isDiagram((chooseeditor.Diagram) domainElement)) {
			return DiagramEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = CHOOSE.diagram.part.ChooseEditorVisualIDRegistry
				.getModelID(containerView);
		if (!DiagramEditPart.MODEL_ID.equals(containerModelID)
				&& !"choose".equals(containerModelID) && !"choose_diagram".equals(containerModelID)) { //$NON-NLS-1$ //$NON-NLS-2$
			return -1;
		}
		int containerVisualID;
		if (DiagramEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = CHOOSE.diagram.part.ChooseEditorVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = DiagramEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case DiagramEditPart.VISUAL_ID:
			if (ChooseeditorPackage.eINSTANCE.getGoal().isSuperTypeOf(
					domainElement.eClass())) {
				return GoalEditPart.VISUAL_ID;
			}
			if (ChooseeditorPackage.eINSTANCE.getRefinement().isSuperTypeOf(
					domainElement.eClass())) {
				return RefinementEditPart.VISUAL_ID;
			}
			if (ChooseeditorPackage.eINSTANCE.getActor().isSuperTypeOf(
					domainElement.eClass())) {
				return ActorEditPart.VISUAL_ID;
			}
			if (ChooseeditorPackage.eINSTANCE.getHumanActor().isSuperTypeOf(
					domainElement.eClass())) {
				return HumanActorEditPart.VISUAL_ID;
			}
			if (ChooseeditorPackage.eINSTANCE.getRole().isSuperTypeOf(
					domainElement.eClass())) {
				return RoleEditPart.VISUAL_ID;
			}
			if (ChooseeditorPackage.eINSTANCE.getSoftwareActor().isSuperTypeOf(
					domainElement.eClass())) {
				return SoftwareActorEditPart.VISUAL_ID;
			}
			if (ChooseeditorPackage.eINSTANCE.getDevice().isSuperTypeOf(
					domainElement.eClass())) {
				return DeviceEditPart.VISUAL_ID;
			}
			if (ChooseeditorPackage.eINSTANCE.getOperation().isSuperTypeOf(
					domainElement.eClass())) {
				return OperationEditPart.VISUAL_ID;
			}
			if (ChooseeditorPackage.eINSTANCE.getProcess().isSuperTypeOf(
					domainElement.eClass())) {
				return ProcessEditPart.VISUAL_ID;
			}
			if (ChooseeditorPackage.eINSTANCE.getProject().isSuperTypeOf(
					domainElement.eClass())) {
				return ProjectEditPart.VISUAL_ID;
			}
			if (ChooseeditorPackage.eINSTANCE.getObject().isSuperTypeOf(
					domainElement.eClass())) {
				return ObjectEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = CHOOSE.diagram.part.ChooseEditorVisualIDRegistry
				.getModelID(containerView);
		if (!DiagramEditPart.MODEL_ID.equals(containerModelID)
				&& !"choose".equals(containerModelID) && !"choose_diagram".equals(containerModelID)) { //$NON-NLS-1$ //$NON-NLS-2$
			return false;
		}
		int containerVisualID;
		if (DiagramEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = CHOOSE.diagram.part.ChooseEditorVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = DiagramEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case DiagramEditPart.VISUAL_ID:
			if (GoalEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RefinementEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ActorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (HumanActorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RoleEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SoftwareActorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DeviceEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OperationEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ProcessEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ProjectEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ObjectEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case GoalEditPart.VISUAL_ID:
			if (GoalNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ActorEditPart.VISUAL_ID:
			if (ActorNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case HumanActorEditPart.VISUAL_ID:
			if (HumanActorNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RoleEditPart.VISUAL_ID:
			if (RoleNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SoftwareActorEditPart.VISUAL_ID:
			if (SoftwareActorNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DeviceEditPart.VISUAL_ID:
			if (DeviceNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case OperationEditPart.VISUAL_ID:
			if (OperationNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ProcessEditPart.VISUAL_ID:
			if (ProcessNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ProjectEditPart.VISUAL_ID:
			if (ProjectNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ObjectEditPart.VISUAL_ID:
			if (ObjectNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(chooseeditor.Diagram element) {
		return true;
	}

	/**
	 * @generated
	 */
	public static boolean checkNodeVisualID(View containerView,
			EObject domainElement, int candidate) {
		if (candidate == -1) {
			//unrecognized id is always bad
			return false;
		}
		int basic = getNodeVisualID(containerView, domainElement);
		return basic == candidate;
	}

	/**
	 * @generated
	 */
	public static boolean isCompartmentVisualID(int visualID) {
		return false;
	}

	/**
	 * @generated
	 */
	public static boolean isSemanticLeafVisualID(int visualID) {
		switch (visualID) {
		case DiagramEditPart.VISUAL_ID:
			return false;
		case GoalEditPart.VISUAL_ID:
		case RefinementEditPart.VISUAL_ID:
		case ActorEditPart.VISUAL_ID:
		case HumanActorEditPart.VISUAL_ID:
		case RoleEditPart.VISUAL_ID:
		case SoftwareActorEditPart.VISUAL_ID:
		case DeviceEditPart.VISUAL_ID:
		case OperationEditPart.VISUAL_ID:
		case ProcessEditPart.VISUAL_ID:
		case ProjectEditPart.VISUAL_ID:
		case ObjectEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static final DiagramStructure TYPED_INSTANCE = new DiagramStructure() {
		/**
		 * @generated
		 */
		@Override
		public int getVisualID(View view) {
			return CHOOSE.diagram.part.ChooseEditorVisualIDRegistry
					.getVisualID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public String getModelID(View view) {
			return CHOOSE.diagram.part.ChooseEditorVisualIDRegistry
					.getModelID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public int getNodeVisualID(View containerView, EObject domainElement) {
			return CHOOSE.diagram.part.ChooseEditorVisualIDRegistry
					.getNodeVisualID(containerView, domainElement);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean checkNodeVisualID(View containerView,
				EObject domainElement, int candidate) {
			return CHOOSE.diagram.part.ChooseEditorVisualIDRegistry
					.checkNodeVisualID(containerView, domainElement, candidate);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isCompartmentVisualID(int visualID) {
			return CHOOSE.diagram.part.ChooseEditorVisualIDRegistry
					.isCompartmentVisualID(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isSemanticLeafVisualID(int visualID) {
			return CHOOSE.diagram.part.ChooseEditorVisualIDRegistry
					.isSemanticLeafVisualID(visualID);
		}
	};

}
