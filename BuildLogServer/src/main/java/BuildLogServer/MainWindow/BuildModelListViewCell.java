package BuildLogServer.MainWindow;

import java.io.IOException;
import java.net.URL;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.GridPane;

public class BuildModelListViewCell extends ListCell<BuildModel> {
	
	@FXML
	private Label idLabel;

	@FXML
	private Label machineLabel;

	@FXML
	private Label workspaceLabel;
	
	@FXML
	private Label statusLabel;
		
	private FXMLLoader loader;
	
	private GridPane rootPane;

	private Tooltip tooltip;

	
	@Override
	public void updateItem(BuildModel build, boolean empty) {
		super.updateItem(build, empty);
		setText(null);
		if (empty) {
            setGraphic(null);
        } else {
        	if(loader == null) {
        		URL location = getClass().getResource("BuildModelListViewCell.fxml");
        		loader = new FXMLLoader(location);
        		loader.setController(this);
        		try {
        			rootPane = loader.load();
				} catch (IOException e) {
					e.printStackTrace();
				}
        		tooltip = new Tooltip();
        		Tooltip.install(rootPane, tooltip);
        	}
        	
        	idLabel.setText(build.getId().toString());
        	machineLabel.setText(build.getMachine());
        	statusLabel.setText(build.getStatus());
        	tooltip.setText(build.getCommand());
            setGraphic(loader.getRoot());
        }

	}
}
