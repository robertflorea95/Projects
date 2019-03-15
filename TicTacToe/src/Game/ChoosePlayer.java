package Game;

import java.util.ArrayList;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class ChoosePlayer extends Application{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
		
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		
		Button b1 = new Button();
		b1.setText("One Player");
		b1.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				// TODO Auto-generated method stub
				
				
				
			}

			
		});
		
		Button b2 = new Button();
		b2.setText("Two Players");
		b2.setOnAction(event -> {
			
			
			
		});
	
		
		
		StackPane root2 =new StackPane();
		
		GridPane grid2 = new GridPane();
		grid2.setAlignment(Pos.CENTER);
		grid2.setHgap(10);
		grid2.setVgap(10);
		grid2.add(b1,0,0);
		grid2.add(b2, 0, 1);
		
		root2.getChildren().add(grid2);
		
		Scene scene =new Scene(root2, 200, 100);
		
		primaryStage.setTitle("Tic Tac Toe");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}

}
