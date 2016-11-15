package application;							//javafx application package

import javafx.application.Application;			//import statements
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

//Class: GUI Class
//Description: This class consists of the main method and the setting of the stage and fxml loaders in order to ve able to user fxml with the ide
public class GUI extends Application{

	public void start (Stage stage) throws Exception{
		
		//Load the FXML file
		Parent parent = FXMLLoader.load(
				getClass().getResource("rockPaperScissorsLizardSpock.fxml")); 	
		
		//Build the scene graph
		Scene scene = new Scene(parent);
		
		//Display our window, using the scene graph
		stage.setTitle("Rock  Paper  Scissors  Lizard  Spock"); //sets the title for the program in the display
		stage.setScene(scene);
		stage.show();
	}
	
	//Class: Main Method
	//Description: This method calls the launch method
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Launch the application
		launch(args);
		
	}

}
