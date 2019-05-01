package BuildLogServer.MainWindow;

import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;

import javafx.animation.AnimationTimer;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

public class Controller extends AnchorPane implements Initializable  {
	
	@FXML
    public ListView<BuildModel> buildListView;
	
	@FXML
    public ListView<BuildLogLine> buildLogListView;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		System.out.println("alma");
				
		ObservableList<BuildModel> data = FXCollections.observableArrayList(
			   new BuildModel(1, "localhost", "B-610", "Make.pl stb... REBUILD ALL", "Success"),
			    new BuildModel(2, "localhost", "Everest Main", "Valami REBUILD ALL", "In progress")
			);
		
		final BuildModel build = new BuildModel(1, "localhost", "B-610", "REBUILD ALL", "Success");

		final Random random = new Random();
		buildListView.setOnMouseClicked((MouseEvent event) -> {
			System.out.println("clicked on " + buildListView.getSelectionModel().getSelectedItem());
			buildLogListView.getItems().add(0, new BuildLogLine(build, "alma " + random.nextInt(100)));
		});
		
		buildListView.setCellFactory((ListView<BuildModel> list) -> new BuildModelListViewCell());
		buildListView.setItems(data);
		
		ObservableList<BuildLogLine> logs = FXCollections.observableArrayList(
				   new BuildLogLine(build, "start"),
				   new BuildLogLine(build, "alma"),
				   new BuildLogLine(build, "alma"),
				   new BuildLogLine(build, "alma"),
				   new BuildLogLine(build, "alma"),
				   new BuildLogLine(build, "a23lma"),
				   new BuildLogLine(build, "alma"),
				   new BuildLogLine(build, "alma"),
				   new BuildLogLine(build, "al21ma"),
				   new BuildLogLine(build, "alma"),
				   new BuildLogLine(build, "asdflma"),
				   new BuildLogLine(build, "alma"),
				   new BuildLogLine(build, "alma"),
				   new BuildLogLine(build, "alma"),
				   new BuildLogLine(build, "al4ma"),
				   new BuildLogLine(build, "alma"),
				   new BuildLogLine(build, "alma"),
				   new BuildLogLine(build, "aldsma"),
				   new BuildLogLine(build, "almfdsa"),
				   new BuildLogLine(build, "banan")
		);
		
		buildLogListView.setCellFactory((ListView<BuildLogLine> list) -> new ListCell<BuildLogLine>(){
			
			@Override
			public void updateItem(BuildLogLine line, boolean empty) {
				super.updateItem(line, empty);
				if (empty) {
					setText(null);
		        } else {
		        	setText(line.line);
		        }
			}
		});
		
		
		buildLogListView.setItems(logs);
		
		/*
		new AnimationTimer() {


            @Override
            public void handle(long now) {
            	
    			buildLogListView.getItems().add(0, new BuildLogLine(build, "alma " + random.nextInt(100)));
            }

        }.start();

*/
	}
	
	
	
}
