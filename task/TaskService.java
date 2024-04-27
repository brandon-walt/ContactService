package task;

import java.util.HashMap;
import java.util.Map;



public class TaskService {
	private Map<String, Task> tasks;

    public TaskService() {
        tasks = new HashMap<>();
    }
    
    public void addTask(Task task) {
       tasks.put(task.getTaskID(), task);
    }
    
    public void deleteTask(String taskID) {
        tasks.remove(taskID);
    }
    
    public void updateName(String taskID, String name) {
        if (tasks.containsKey(taskID)) {
            Task task = tasks.get(taskID);
            task.setName(name);
            tasks.put(taskID, task);
        }
    }
    
    public void updateDescription(String taskID, String description) {
    	if (tasks.containsKey(taskID)) {
    		Task task = tasks.get(taskID);
    		task.setDescription(description);
    		tasks.put(taskID, task);
    		}
    }
    
    public Task getTask(String taskID) {
        return tasks.get(taskID);
    }
}
