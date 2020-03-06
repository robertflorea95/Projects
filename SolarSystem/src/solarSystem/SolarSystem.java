package solarSystem;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;


public class SolarSystem extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		
		String path;
		Group root = new Group();
		
		try {
			path = new File(".").getCanonicalPath() + System.getProperty("file.separator") + "src" + System.getProperty("file.separator") + "SolarSystem" + System.getProperty("file.separator") + "Configuration.xml";
			
			
			
			ArrayList<CelestialBody> cBodies = getInfoFromXMLConfigFile.getConfig(path);
			
			for(CelestialBody cb : cBodies) {
				
				Circle body = new Circle(cb.getxCoord(),cb.getyCoord(),cb.getRadius());
				body.setStrokeWidth(5);
				body.setFill(Paint.valueOf(cb.getColor()));
				root.getChildren().add(body);
				
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Scene scene = new Scene(root,700,700);
		stage.setTitle("Solar system");
		stage.setScene(scene);
		stage.show();
		
		
	}
	
	public static void main (String args[]) {
		
		launch(args);
		
		
	}

}
