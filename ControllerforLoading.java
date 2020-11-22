package application;




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
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class ControllerforLoading implements Initializable  {
	
	@FXML
	private Circle c1;
	
	@FXML
	private Circle c2;
	
	@FXML
	private Circle c3;
	
	
	private boolean off=false;
	
	public void loadscreen(ActionEvent e) throws Exception   {
		// TODO Auto-generated method stub
		
		
		
		
		
		
		Parent root=FXMLLoader.load(getClass().getResource("Play.fxml"));
		
		Scene scene=new Scene(root);
		
		Stage stage=(Stage)((Node)e.getSource()).getScene().getWindow();

		stage.setScene(scene);
		
		
		stage.show();
		
		off=true;
		
		
		
		
	}

	
	class Animation extends AnimationTimer{
		
		private long time=0;private boolean alternate=false;private int number=1;

		@Override
		public void handle(long t1) {
			// TODO Auto-generated method stub
			
			long t2=t1-time;
			
			if(t2>15e7) {
				
				time=t1;
				
				if(alternate) {
				
				if(number==1) {
					c1.setCenterY(c1.getCenterY()-40);
					number=2;
				}
				
				else if(number==2) {
					
					c2.setCenterY(c2.getCenterY()-40);
					number=3;
				}
				
				else {
					c3.setCenterY(c3.getCenterY()-40);
					number=4;
				}
					
				
				if(number==4) {
				alternate=false;
				number=1;
				}
				
				}
				
				else {

					if(number==1) {
						c1.setCenterY(c1.getCenterY()+40);
						number=2;
					}
					
					else if(number==2) {
						
						c2.setCenterY(c2.getCenterY()+40);
						number=3;
					}
					
					else {
						c3.setCenterY(c3.getCenterY()+40);
						number=4;
					}
					
					if(number==4) {
						alternate=true;
						number=1;
						}
					
				}
				
				//System.out.println(off);
			}
			
			
		}
		
		
		
	}


	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
		try
		{
		Animation an=new Animation();
		
		an.start();
		
		
		
		
		
		
		
		}
		
		catch(Exception e) {
			
			System.out.println("Eror");
		}
		
	}
	

}


