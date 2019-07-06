package View;

import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application{
	public static void main(String args[]) {
		launch(args);
	}
	
	@Override
	public void start(Stage stage) throws Exception {
//		stage.setResizable(false);
		stage.setHeight(767);
		stage.setWidth(1298);
		stage.setMaxHeight(767);
		stage.setMinHeight(767);
		stage.setMaxWidth(1298);
		stage.setMinWidth(1298);
		mainMenu mainmenu = new mainMenu(stage);
		mainmenu.buildScene();
		stage.show();
		
	}

}
