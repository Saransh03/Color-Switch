package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button; 
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.Parent;
import javafx.event.ActionEvent;

public class Main extends Application  {
	
	
	@Override
	public void start(Stage stage) throws Exception {
		
			Parent  root= FXMLLoader.load(getClass().getResource("Fxml.fxml"));
				
			
			Scene scene = new Scene(root);
			//scene.getStylesheets().add("application.css");
			
			stage.setScene(scene);
			
			stage.show();
		
	}
	
	
	
	public static void main(String[] args) {
		launch(args);
	}
}
