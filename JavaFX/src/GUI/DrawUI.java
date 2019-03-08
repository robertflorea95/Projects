package GUI;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class DrawUI extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		
		Group root = new Group();
		
		Circle c =new Circle(300,100,50);
		
		c.setStrokeWidth(5);
		c.setStroke(Color.BLACK);
		c.setFill(Color.RED);
		
		root.getChildren().add(c);
		
		Line l = new Line(200,200,400,200);
		root.getChildren().add(l);
		
		l.setStroke(Color.BLACK);
		l.setStrokeWidth(8);
		
		Circle c1 = new Circle(300,300,50);
		
		c1.setStrokeWidth(5);
		c1.setStroke(Color.BLACK);
		c1.setFill(Color.YELLOW);
		
		
		root.getChildren().add(c1);
		
		Circle c2 = new Circle(300,500,50);
		
		c2.setStrokeWidth(5);
		c2.setStroke(Color.BLACK);
		c2.setFill(Color.GREEN);
		
		root.getChildren().add(c2);
		
		
		
		
		Scene scene = new Scene(root, 600, 600);
		
		primaryStage.setTitle("Shapes");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	
	public static void main(String args[]) {
		launch(args);
	}
	
	

}
