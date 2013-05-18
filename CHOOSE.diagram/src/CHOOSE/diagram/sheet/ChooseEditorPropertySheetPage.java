package CHOOSE.diagram.sheet;

import org.eclipse.ui.views.properties.PropertySheetPage;

public class ChooseEditorPropertySheetPage extends PropertySheetPage{
	 public ChooseEditorPropertySheetPage()
	   {
	      super();
	      setSorter(new ChooseEditorPropertySheetSorter());
	   }
}
