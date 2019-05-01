package BuildLogServer.MainWindow;

import java.net.URL;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Application extends javafx.application.Application {
	
	@Override
	public void start(Stage stage) throws Exception {
		
		URL location = getClass().getResource("MainWindow.fxml");
		
		Parent root = FXMLLoader.load(location);
		stage.setTitle("Build Log Server");
		stage.setScene(new Scene(root, 800, 500));
		stage.setMinWidth(800);
		stage.setMinHeight(300);
		stage.show();
		
		/*
		FXMLLoader loader = new FXMLLoader(location);
		
		loader.setClassLoader(getClass().getClassLoader());

		Controller controller = new Controller();
		loader.setController(controller);
		Root root = new Root();
		//loader.setRoot(root);

		loader.load();
		
		Scene scene = new Scene(loader.getRoot());
		stage.setScene(scene);
		stage.setTitle("Build Log Server");
		stage.show();
		
		/ *
		ObservableList<BuildRow> items = FXCollections.observableArrayList (
			    new BuildRow(1, "localhost", "B-610", "REBUILD ALL", "Success"),
			    new BuildRow(2, "localhost", "Everest Main", "REBUILD ALL", "In progress"));
				
		Controller c = loader.getController();
		c.buildList.setItems(items);
		*/
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
