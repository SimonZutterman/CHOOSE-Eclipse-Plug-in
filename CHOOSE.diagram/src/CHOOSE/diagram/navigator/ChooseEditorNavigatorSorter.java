package CHOOSE.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

import CHOOSE.diagram.part.ChooseEditorVisualIDRegistry;

/**
 * @generated
 */
public class ChooseEditorNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 4046;

	/**
	 * @generated
	 */
	private static final int SHORTCUTS_CATEGORY = 4045;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof ChooseEditorNavigatorItem) {
			ChooseEditorNavigatorItem item = (ChooseEditorNavigatorItem) element;
			if (item.getView().getEAnnotation("Shortcut") != null) { //$NON-NLS-1$
				return SHORTCUTS_CATEGORY;
			}
			return ChooseEditorVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
