package pl.chemik77.calculator;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Main extends Application{

	public static void main(String[] args) {
		
		launch(args);
		
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(this.getClass().getResource("Window.fxml"));
		
		GridPane grid = new GridPane();
		loader.setRoot(grid);
		
		Controller controller = loader.getController();
		
		grid = loader.load();
		
		Scene scene = new Scene(grid);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Kalkulator");
		primaryStage.setResizable(false);
		primaryStage.show();
		
	}

}
