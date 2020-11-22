package application;

import javafx.scene.control.Button;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.animation.AnimationTimer;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class ControllerforPlay implements Initializable {
	
	

	public void pause(ActionEvent e) throws Exception{
		
		Parent root=FXMLLoader.load(getClass().getResource("Pause.fxml"));
		
		Scene scene=new Scene(root);
		
		Stage stage=(Stage)((Node)e.getSource()).getScene().getWindow();
		
		stage.setScene(scene);
		
		stage.show();
		
	}
	
	@FXML
	private Circle ball;
	
	@FXML
	private Button btn;
	
	
	
	class Animation extends AnimationTimer{

		@Override
		public void handle(long arg0) {
			// TODO Auto-generated method stub
			
			btn.setOnAction(e ->{
				
				//System.out.println(ball.getCenterY());
				
				ball.setCenterY(ball.getCenterY()-40);
				
			//	System.out.println("clicked");
				
				
				
			});
				
			
			 ball.setCenterY(ball.getCenterY()+2);
			 
			 //System.out.println(ball.getCenterY());
			
			
				
			
		}
		
		
	}



	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
		Animation an=new Animation();
		
		an.start();
		
	}
}
