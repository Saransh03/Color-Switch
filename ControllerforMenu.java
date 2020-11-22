package application;


import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.animation.AnimationTimer;
import javafx.event.ActionEvent;
import javafx.scene.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Circle;

public class ControllerforMenu implements Initializable {
	
	public void play(ActionEvent e) throws Exception{
		
		Parent root=FXMLLoader.load(getClass().getResource("Loading.fxml"));
		
		Scene scene=new Scene(root);
		
		Stage stage=(Stage)((Node)e.getSource()).getScene().getWindow();

		stage.setScene(scene);
		
		
		stage.show();
	}
	
	public void view_high_score(ActionEvent e) throws Exception{
		
		Parent root=FXMLLoader.load(getClass().getResource("View_High_Score.fxml"));
		
		Scene scene=new Scene(root);
		
		Stage stage=(Stage)((Node)e.getSource()).getScene().getWindow();

		stage.setScene(scene);
		
		
		stage.show();
	}
	
	public void exit(ActionEvent e) throws Exception{
		
		System.exit(0);
	}
	
	public void load(ActionEvent e) throws Exception{
		
	}
	
	public void back(ActionEvent e) throws Exception{
		
		Parent root=FXMLLoader.load(getClass().getResource("Fxml.fxml"));
		
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
		img.setImage(new Image(new FileInputStream("/home/alabhinav/Documents/Java Code/Test/src/application/backgroundmenu.jpg")));
		}
		
		catch(Exception e) { System.out.println(e);}
		
		
		
		
		
	
	
	
		
		
	}

}
