package BuildLogServer.MainWindow;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;

public class Controller extends AnchorPane implements Initializable  {
	
	@FXML
    public TableView<BuildModel> buildListTableView;
	
	@FXML
    public TableColumn<BuildModel, Integer> columnID;
	
	@FXML
    public TableColumn<BuildModel, String> columnMachine;
	
	@FXML
	public TableColumn<BuildModel, String> columnWorkspace;
	
	@FXML
    public TableColumn<BuildModel, String> columnCommand;

	@FXML
    public TableColumn<BuildModel, String> columnStatus;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		System.out.println("alma");
		
		columnID.setCellValueFactory(new PropertyValueFactory<BuildModel, Integer>("id"));
		columnMachine.setCellValueFactory(new PropertyValueFactory<BuildModel, String>("machine"));
		columnWorkspace.setCellValueFactory(new PropertyValueFactory<BuildModel, String>("workspace"));
		columnCommand.setCellValueFactory(new PropertyValueFactory<BuildModel, String>("command"));
		columnStatus.setCellValueFactory(new PropertyValueFactory<BuildModel, String>("status"));
		
		buildListTableView.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
		buildListTableView.getSelectionModel().setCellSelectionEnabled(true);
		
		ObservableList<BuildModel> data = FXCollections.observableArrayList(
			   new BuildModel(1, "localhost", "B-610", "REBUILD ALL", "Success"),
			    new BuildModel(2, "localhost", "Everest Main", "REBUILD ALL", "In progress")
			);
		
		buildListTableView.setItems(data);
	}
	
	
	
}
