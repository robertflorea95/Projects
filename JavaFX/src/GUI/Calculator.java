package GUI;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Calculator extends Application {
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		
		GridPane grid = new GridPane();
		
		//UI define
		Label Num1 = new Label("Number 1 : ");
		
		TextField txtNumber1 = new TextField();
		
		Label Num2 = new Label("Number 2 : ");
		
		TextField txtNumber2 = new TextField();
		
		Label result = new Label("Result : ");
		
		Button btn = new Button();
		btn.setText("Multiply");
		
		btn.setOnAction(event  -> {
			
			int n1 = Integer.parseInt(txtNumber1.getText().toString());
			int n2 = Integer.parseInt(txtNumber2.getText().toString());
			
			int multiply = n1 * n2;
			
			result.setText("Result : "+multiply);
			
			});
		
		grid.setAlignment(Pos.CENTER);
		grid.setHgap(10);
		grid.setVgap(10);
		grid.setPadding(new Insets(25,25,25,25));
		
		
		grid.add(Num1, 0, 0);
		grid.add(txtNumber1, 1, 0);
		grid.add(Num2, 0, 1);
		grid.add(txtNumber2, 1, 1);
		grid.add(result, 1, 2);
		grid.add(btn, 1, 3);
		
		Scene scene = new Scene(grid, 400,250);
		
		primaryStage.setTitle("Calculator");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	StackPane root = new StackPane();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			launch(args);
	}

	

}
