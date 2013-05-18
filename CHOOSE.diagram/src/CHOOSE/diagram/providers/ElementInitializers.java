package CHOOSE.diagram.providers;

import CHOOSE.diagram.part.ChooseEditorDiagramEditorPlugin;

/**
 * @generated
 */
public class ElementInitializers {

	protected ElementInitializers() {
		// use #getInstance to access cached instance
	}

	/**
	 * @generated
	 */
	public static ElementInitializers getInstance() {
		ElementInitializers cached = ChooseEditorDiagramEditorPlugin
				.getInstance().getElementInitializers();
		if (cached == null) {
			ChooseEditorDiagramEditorPlugin.getInstance()
					.setElementInitializers(cached = new ElementInitializers());
		}
		return cached;
	}
}
