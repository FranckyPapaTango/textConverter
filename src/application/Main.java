package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Main extends Application {
	
	public static void main(String[] args) {
		launch(args);
	}


	@Override
	public void start(final Stage primaryStage) {

		try {
			BorderPane root = (BorderPane) FXMLLoader.load(getClass().getResource("Sample.fxml"));
			Scene scene = new Scene(root, 800, 800);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			
			primaryStage.setTitle("TEXT CONVERTER (JavaFX)");
			primaryStage.setScene(scene);
			primaryStage.show();
			
//			Button button = new Button();
//			button.setText("Open a New Window");


		} catch (Exception e) {
			e.printStackTrace();
		}


	}

	
}
