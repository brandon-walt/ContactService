package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import task.Task;
import task.TaskService;

class TaskServiceTest {
	private TaskService taskService;
	
	@BeforeEach
	public void setUp() {
		taskService = new TaskService();
	}
	
	@Test
	void testAddTask() {
		Task task = new Task("001","Brandon","Hello World!");
		taskService.addTask(task);
		assertEquals(task, taskService.getTask("001"));
	}
	
	@Test
	void testDeleteTask() {
		Task task = new Task("001","Brandon","Hello World!");
		taskService.addTask(task);
		taskService.deleteTask("001");
		assertNull(taskService.getTask("001"));
	}

	@Test
    public void testUpdateName() {
		Task task = new Task("001","Brandon","Hello World!");
		taskService.addTask(task);
        taskService.updateName("001", "Bran");
        assertEquals("Bran", taskService.getTask("001").getName());
    }
	
	@Test
    public void testUpdateDescription() {
		Task task = new Task("001","Brandon","Hello World!");
		taskService.addTask(task);
        taskService.updateDescription("001", "Goodbye");
        assertEquals("Goodbye", taskService.getTask("001").getDescription());
    }
}
