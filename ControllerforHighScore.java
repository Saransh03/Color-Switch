package application;

import java.io.FileInputStream;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class ControllerforHighScore implements Initializable {
	
	public void back(ActionEvent e) throws Exception{
		
		Parent root=FXMLLoader.load(getClass().getResource("Menu.fxml"));
		
		Scene scene=new Scene(root);
		
		Stage stage=(Stage)((Node)e.getSource()).getScene().getWindow();
		
		stage.setScene(scene);
		
		stage.show();
	}
	
	@FXML
	private ImageView img;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
		try {
		img.setImage(new Image(new FileInputStream("/home/alabhinav/Documents/Java Code/Test/src/application/highscore.jpg")));
		}
		
		catch(Exception e) {
			
			System.out.println(e);
		}
		
	}
}
