package ask2_gui;

public class TheGUI {
	
	public TheGUI(){
		
		GUIView theView = new GUIView();
		GUIModel theModel = new GUIModel();
		
		GUIController theController = new GUIController(theView,theModel);
		theView.setVisible( true );
		
	}
}
