package GUI;


import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.MultipleSelectionModel;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class ListViewDemo extends Application {

	@Override
	public void start(Stage primaryStage) {
		
		FlowPane root = new FlowPane();
		
		root.setOrientation(Orientation.VERTICAL);
		
		Label l = new Label("Select");
		
		Label la = new Label("You select : ");
		
		root.getChildren().add(l);
		
		root.getChildren().add(la);
		
		//create list
		//define set
		
		ObservableList<String> name = FXCollections.observableArrayList("John", "Matt", "Jack", "Ben", "Harry");
		
		ListView<String> lv = new ListView<String> (name); 
		
		lv.setPrefSize(300, 150);
		lv.setOrientation(Orientation.VERTICAL);
		
		// defining multi slect option
		
		MultipleSelectionModel<String> lvModule = lv.getSelectionModel();
		
		lvModule.selectedItemProperty().addListener(new ChangeListener<String>() {

			@Override
			public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
				// TODO Auto-generated method stub
				
				System.out.println("Selected : " + newValue);
				la.setText("Name is : " + newValue);
				
				
				
				
				
				
			}
			
			
			
		});
		
		root.getChildren().add(lv);
		
		Scene scene = new Scene(root, 300, 250);
		
		primaryStage.setTitle("List View");
		primaryStage.setScene(scene);
		primaryStage.show();
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			launch(args);
	}

}
