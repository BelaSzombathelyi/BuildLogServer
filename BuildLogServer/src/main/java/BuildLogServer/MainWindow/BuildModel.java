package BuildLogServer.MainWindow;

public class BuildModel {

	public int id;
	public String machine;
	public String workspace;
	public String command;
	public String status;
	
	public BuildModel(int id, String machine, String workspace, String command, String status) {
		super();
		this.id = id;
		this.machine = machine;
		this.workspace = workspace;
		this.command = command;
		this.status = status;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getMachine() {
		return machine;
	}

	public void setMachine(String machine) {
		this.machine = machine;
	}

	public String getWorkspace() {
		return workspace;
	}

	public void setWorkspace(String workspace) {
		this.workspace = workspace;
	}

	public String getCommand() {
		return command;
	}

	public void setCommand(String command) {
		this.command = command;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}