package CHOOSE.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;

import CHOOSE.diagram.edit.parts.ActorNameEditPart;
import CHOOSE.diagram.edit.parts.DeviceNameEditPart;
import CHOOSE.diagram.edit.parts.GoalNameEditPart;
import CHOOSE.diagram.edit.parts.HumanActorNameEditPart;
import CHOOSE.diagram.edit.parts.ObjectNameEditPart;
import CHOOSE.diagram.edit.parts.OperationNameEditPart;
import CHOOSE.diagram.edit.parts.ProcessNameEditPart;
import CHOOSE.diagram.edit.parts.ProjectNameEditPart;
import CHOOSE.diagram.edit.parts.RoleNameEditPart;
import CHOOSE.diagram.edit.parts.SoftwareActorNameEditPart;
import CHOOSE.diagram.parsers.MessageFormatParser;
import CHOOSE.diagram.part.ChooseEditorVisualIDRegistry;
import chooseeditor.ChooseeditorPackage;

/**
 * @generated
 */
public class ChooseEditorParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	private IParser goalName_5001Parser;

	/**
	 * @generated
	 */
	private IParser getGoalName_5001Parser() {
		if (goalName_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { ChooseeditorPackage.eINSTANCE
					.getGoal_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			goalName_5001Parser = parser;
		}
		return goalName_5001Parser;
	}

	/**
	 * @generated
	 */
	private IParser actorName_5002Parser;

	/**
	 * @generated
	 */
	private IParser getActorName_5002Parser() {
		if (actorName_5002Parser == null) {
			EAttribute[] features = new EAttribute[] { ChooseeditorPackage.eINSTANCE
					.getActorContainer_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			actorName_5002Parser = parser;
		}
		return actorName_5002Parser;
	}

	/**
	 * @generated
	 */
	private IParser humanActorName_5003Parser;

	/**
	 * @generated
	 */
	private IParser getHumanActorName_5003Parser() {
		if (humanActorName_5003Parser == null) {
			EAttribute[] features = new EAttribute[] { ChooseeditorPackage.eINSTANCE
					.getActorContainer_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			humanActorName_5003Parser = parser;
		}
		return humanActorName_5003Parser;
	}

	/**
	 * @generated
	 */
	private IParser roleName_5004Parser;

	/**
	 * @generated
	 */
	private IParser getRoleName_5004Parser() {
		if (roleName_5004Parser == null) {
			EAttribute[] features = new EAttribute[] { ChooseeditorPackage.eINSTANCE
					.getActorContainer_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			roleName_5004Parser = parser;
		}
		return roleName_5004Parser;
	}

	/**
	 * @generated
	 */
	private IParser softwareActorName_5005Parser;

	/**
	 * @generated
	 */
	private IParser getSoftwareActorName_5005Parser() {
		if (softwareActorName_5005Parser == null) {
			EAttribute[] features = new EAttribute[] { ChooseeditorPackage.eINSTANCE
					.getActorContainer_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			softwareActorName_5005Parser = parser;
		}
		return softwareActorName_5005Parser;
	}

	/**
	 * @generated
	 */
	private IParser deviceName_5006Parser;

	/**
	 * @generated
	 */
	private IParser getDeviceName_5006Parser() {
		if (deviceName_5006Parser == null) {
			EAttribute[] features = new EAttribute[] { ChooseeditorPackage.eINSTANCE
					.getActorContainer_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			deviceName_5006Parser = parser;
		}
		return deviceName_5006Parser;
	}

	/**
	 * @generated
	 */
	private IParser operationName_5007Parser;

	/**
	 * @generated
	 */
	private IParser getOperationName_5007Parser() {
		if (operationName_5007Parser == null) {
			EAttribute[] features = new EAttribute[] { ChooseeditorPackage.eINSTANCE
					.getOperationContainer_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			operationName_5007Parser = parser;
		}
		return operationName_5007Parser;
	}

	/**
	 * @generated
	 */
	private IParser processName_5008Parser;

	/**
	 * @generated
	 */
	private IParser getProcessName_5008Parser() {
		if (processName_5008Parser == null) {
			EAttribute[] features = new EAttribute[] { ChooseeditorPackage.eINSTANCE
					.getOperationContainer_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			processName_5008Parser = parser;
		}
		return processName_5008Parser;
	}

	/**
	 * @generated
	 */
	private IParser projectName_5009Parser;

	/**
	 * @generated
	 */
	private IParser getProjectName_5009Parser() {
		if (projectName_5009Parser == null) {
			EAttribute[] features = new EAttribute[] { ChooseeditorPackage.eINSTANCE
					.getOperationContainer_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			projectName_5009Parser = parser;
		}
		return projectName_5009Parser;
	}

	/**
	 * @generated
	 */
	private IParser objectName_5010Parser;

	/**
	 * @generated
	 */
	private IParser getObjectName_5010Parser() {
		if (objectName_5010Parser == null) {
			EAttribute[] features = new EAttribute[] { ChooseeditorPackage.eINSTANCE
					.getObject_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			objectName_5010Parser = parser;
		}
		return objectName_5010Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case GoalNameEditPart.VISUAL_ID:
			return getGoalName_5001Parser();
		case ActorNameEditPart.VISUAL_ID:
			return getActorName_5002Parser();
		case HumanActorNameEditPart.VISUAL_ID:
			return getHumanActorName_5003Parser();
		case RoleNameEditPart.VISUAL_ID:
			return getRoleName_5004Parser();
		case SoftwareActorNameEditPart.VISUAL_ID:
			return getSoftwareActorName_5005Parser();
		case DeviceNameEditPart.VISUAL_ID:
			return getDeviceName_5006Parser();
		case OperationNameEditPart.VISUAL_ID:
			return getOperationName_5007Parser();
		case ProcessNameEditPart.VISUAL_ID:
			return getProcessName_5008Parser();
		case ProjectNameEditPart.VISUAL_ID:
			return getProjectName_5009Parser();
		case ObjectNameEditPart.VISUAL_ID:
			return getObjectName_5010Parser();
		}
		return null;
	}

	/**
	 * Utility method that consults ParserService
	 * @generated
	 */
	public static IParser getParser(IElementType type, EObject object,
			String parserHint) {
		return ParserService.getInstance().getParser(
				new HintAdapter(type, object, parserHint));
	}

	/**
	 * @generated
	 */
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(ChooseEditorVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(ChooseEditorVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (ChooseEditorElementTypes.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	 * @generated
	 */
	private static class HintAdapter extends ParserHintAdapter {

		/**
		 * @generated
		 */
		private final IElementType elementType;

		/**
		 * @generated
		 */
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		 * @generated
		 */
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
