package application;




import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.URL;

import java.util.ResourceBundle;

import javafx.fxml.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.scene.Scene;

import javafx.scene.Parent;
import javafx.animation.RotateTransition;
import javafx.event.ActionEvent;
import javafx.scene.*;


//Controller for enter game screen

public class Controller {
	
	
	public void fn(ActionEvent e) throws Exception{
		
		Parent root=FXMLLoader.load(getClass().getResource("Menu.fxml"));
		
		Scene scene=new Scene(root);
		
		Stage stage=(Stage)((Node)e.getSource()).getScene().getWindow();

		
		stage.setScene(scene);
		
		
		
		stage.show();
	}
	
	@FXML
	private ImageView img;
	
	@FXML
	private Circle c1;
	
	@FXML
	private Circle c2;
	
	@FXML
	private Circle c3;
	
	
	
	
	public void initialize() throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		 
	        img.setImage(new Image(new FileInputStream("/home/alabhinav/Documents/Java Code/Test/src/application/colorswitch_img.png")));
	        rotate_circles();
	}
	
	public void exit(ActionEvent e) throws Exception{
		
		System.exit(0);
	}
	
	private void rotate(Circle c,boolean reverse,int angle,int duration) {
		
		RotateTransition r=new RotateTransition(Duration.seconds(duration),c);
		
		r.setAutoReverse(reverse);
		r.setByAngle(angle);
		r.setDelay(Duration.seconds(0));
		r.setRate(3);
		r.setCycleCount(18);
		r.play();
	}
	
	private void rotate_circles() {
		
		rotate(c1,true,360,10);
		rotate(c2,true,180,18);
		rotate(c3,true,145,24);
		
	}
	
	
	
}
