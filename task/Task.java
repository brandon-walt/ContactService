package task;

public class Task {
	// Fields 
	private String taskID;
	private String name;
	private String description;
	
	
	// Constructor 
	public Task(String taskID, String name, String description) {
		validateTaskID(taskID);
		validateName(name);
		validateDescription(description);
		this.taskID = taskID;
		this.name = name;
		this.description = description;
	}
	
	
	// Getters
	public String getTaskID() {
		return taskID;
	}
	public String getName() {
		return name;
	}
	public String getDescription() {
		return description;
	}
	
	
	// Setters
	public void setName(String name) {
		this.name = name;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	

	// Input validation methods
	private void validateTaskID(String taskID) {
		if(taskID == null || taskID.length() > 10) {
			throw new IllegalArgumentException("Invalid task ID");
		}
	}
	
	private void validateName(String name) {
		if(name == null || name.length() > 20) {
			throw new IllegalArgumentException("Invalid name");
		}
	}
	
	private void validateDescription(String description) {
		if(description == null || description.length() > 50) {
			throw new IllegalArgumentException("Invalid description");
		}
	}
	
	
}

