package Game;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.util.ArrayList;

import javafx.*;

public class TicTacToe extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		Button btn1 = new Button();
		
		btn1.setText("");
		btn1.setOnAction(event -> {
			
			playGame(1,btn1);
			
		});
		
		Button btn2 = new Button();
		
		btn2.setText("");
		btn2.setOnAction(event -> {
			
			playGame(2,btn2);
			
		});
		
		Button btn3 = new Button();
		
		btn3.setText("");
		btn3.setOnAction(event -> {
			
			playGame(3,btn3);
			
		});
		
		Button btn4 = new Button();
		
		btn4.setText("");
		btn4.setOnAction(event -> {
			
			playGame(4,btn4);
			
		});
		
		Button btn5 = new Button();
		
		btn5.setText("");
		btn5.setOnAction(event -> {
			
			playGame(5,btn5);
			
		});
		
		Button btn6 = new Button();
		
		btn6.setText("");
		btn6.setOnAction(event -> {
			
			playGame(6,btn6);
			
		});
		
		Button btn7 = new Button();
		
		btn7.setText("");
		btn7.setOnAction(event -> {
			
			playGame(7,btn7);
			
		});
		
		Button btn8 = new Button();
		
		btn8.setText("");
		btn8.setOnAction(event -> {
			
			playGame(8,btn8);
			
		});
		
		Button btn9 = new Button();
		
		btn9.setText("");
		btn9.setOnAction(event -> {
			
			playGame(9,btn9);
			
		});
		
		GridPane grid = new GridPane();
		grid.setAlignment(Pos.CENTER);
		grid.setHgap(10);
		grid.setVgap(10);
		grid.setPadding(new Insets(25,25,25,25));
		grid.add(btn1, 0, 0);
		grid.add(btn2, 1, 0);
		grid.add(btn3, 2, 0);
		grid.add(btn4, 0, 1);
		grid.add(btn5, 1, 1);
		grid.add(btn6, 2, 1);
		grid.add(btn7, 0, 2);
		grid.add(btn8, 1, 2);
		grid.add(btn9, 2, 2);
		
		StackPane root = new StackPane();
		//root.getChildren().add(btn1);
		root.getChildren().add(grid);
		
		Scene scene = new Scene(root, 400, 400);
		scene.getStylesheets().add(TicTacToe.class.getResource("style.css").toExternalForm());
		
		primaryStage.setTitle("Tic Tac Toe");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	
	ArrayList<Integer> Player1 = new ArrayList<Integer>();
	
	ArrayList<Integer> Player2 = new ArrayList<Integer>();
	
	int ActivePlayer = 1;
	
	int buttonFlag = 0;

	private void playGame(int cellId, Button selectedButton) {
		// TODO Auto-generated method stub
		
		System.out.println("CELL ID " +cellId);
		
		if(ActivePlayer == 1) {
			
			selectedButton.setText("X");
			
			Player1.add(cellId);
			ActivePlayer = 2;
		}else if(ActivePlayer == 2) {
			
			selectedButton.setText("O");
			Player2.add(cellId);
			
			ActivePlayer = 1;
		}
		
		selectedButton.setDisable(true);
		
		buttonFlag++;
		
		checkWinner(buttonFlag);
		
	}
	
	private void checkWinner(int flag) {
		// TODO Auto-generated method stub
		
		int winner = -1;
		
		if(Player1.contains(1) && Player1.contains(2) && Player1.contains(3)) {
			 
			winner = 1;
			
		}
		if(Player2.contains(1) && Player2.contains(2) && Player2.contains(3)) {
			
			winner = 2;
			
		}
		
		if(Player1.contains(4) && Player1.contains(5) && Player1.contains(6)) {
			 
			winner = 1;
			
		}
		if(Player2.contains(4) && Player2.contains(5) && Player2.contains(6)) {
			
			winner = 2;
			
		}
		
		if(Player1.contains(7) && Player1.contains(8) && Player1.contains(9)) {
			 
			winner = 1;
			
		}
		if(Player2.contains(7) && Player2.contains(8) && Player2.contains(9)) {
			
			winner = 2;
			
		}
		
		if((Player1.contains(1) && Player1.contains(4) && Player1.contains(7)) || (Player1.contains(2) && Player1.contains(5) && Player1.contains(8)) || (Player1.contains(3) && Player1.contains(6) && Player1.contains(9))) {
			
			winner = 1;
			
		}
		
		if((Player2.contains(1) && Player2.contains(4) && Player2.contains(7)) || (Player2.contains(2) && Player2.contains(5) && Player2.contains(8)) || (Player2.contains(3) && Player2.contains(6) && Player2.contains(9))) {
			
			winner = 2;
			
		}
		
		if((Player1.contains(1) && Player1.contains(5) && Player1.contains(9)) || (Player1.contains(3) && Player1.contains(5) && Player1.contains(7)) ) {
			
			winner = 1;
			
		}
		
		if((Player2.contains(1) && Player2.contains(5) && Player2.contains(9)) || (Player2.contains(3) && Player2.contains(5) && Player2.contains(7)) ) {
			
			winner = 2;
			
		}
		
		if(winner != -1) {
			
			String msg = " ";
			if(winner == 1) {
				
				msg = "Player 1 won";
				
			}
			
			if(winner ==2) {
				
				msg = "Player 2 won";
				
			}
			
			Alert alert = new Alert(Alert.AlertType.INFORMATION);
			alert.setTitle("Result: ");
			alert.setContentText(msg);
			alert.setHeaderText("Hoooray!");
			alert.show();
			
		}else if((winner == -1) && (flag == 9)) {
			
			Alert alert = new Alert(Alert.AlertType.INFORMATION);
			alert.setTitle("Result: ");
			alert.setContentText("There is no winner");
			alert.show();
			
		}
		
		
	}

	public static void main(String args[]) {
		launch(args);
		
	}
	
}
