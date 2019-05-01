package BuildLogServer.MainWindow;

import java.net.URL;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Application extends javafx.application.Application {
	
	/*
	 * 
	static public class BuildRow {

		public int id;
		public String machine;
		public String workspace;
		public String command;
		public String status;
		
		public BuildRow(int id, String machine, String workspace, String command, String status) {
			super();
			this.id = id;
			this.machine = machine;
			this.workspace = workspace;
			this.command = command;
			this.status = status;
		}
	
		
	}
	
	
	static public class Root extends AnchorPane implements Initializable  {
		
		@FXML
        public TableView<BuildRow> buildList;

		@Override
		public void initialize(URL location, ResourceBundle resources) {
		}
		
	}
	
		
			
			
			 * 
			 * List<String> columns = new ArrayList<String>();
    columns.add("col1");
    columns.add("col2");
    TableColumn [] tableColumns = new TableColumn[columns.size()];     
    int columnIndex = 0;
    for(int i=0 ; i<columns.size(); i++) {
        final int j = i;
        TableColumn col = new TableColumn(columns.get(i));
        col.setCellValueFactory(new Callback<CellDataFeatures<ObservableList,String>,ObservableValue<String>>(){                   
           public ObservableValue<String> call(CellDataFeatures<ObservableList, String> param) {                                                                                             
                return new SimpleStringProperty(param.getValue().get(j).toString());                       
            }                   
        });
        tableView.getColumns().addAll(col);
    }       
    ObservableList<String> row = FXCollections.observableArrayList();
    ObservableList<String> row1 = FXCollections.observableArrayList();
    row.addAll("d1");
    row.addAll("d11");
    row1.addAll("d2");
    row1.addAll("d22");
    tableView.getItems().add(row);
    tableView.getItems().add(row1);
    }    

			 */
		
	
	@Override
	public void start(Stage stage) throws Exception {
		
		URL location = getClass().getResource("MainWindow.fxml");
		
		Parent root = FXMLLoader.load(location);
		stage.setTitle("Registration Form FXML Application");
		stage.setScene(new Scene(root, 800, 500));
		
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
