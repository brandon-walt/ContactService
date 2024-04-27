package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


import task.Task;

class TaskTest {

	@Test
	void testTaskClass() {
		Task task = new Task("001","Brandon","Hello World!");
		assertTrue(task.getTaskID().equals("001"));
		assertTrue(task.getName().equals("Brandon"));
		assertTrue(task.getDescription().equals("Hello World!"));
	}
	
	@Test
	void testTaskClassIdToLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Task("01234567890", "Brandon", "Hello World!");
		});
	}
	
	@Test
	void testTaskClassNameToLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Task("001", "Brandon Nathan Walters", "Hello World!");
		});
	}
	
	@Test
	void testTaskClassDescriptionToLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Task("001", "Brandon", "Hello World! 0123456789 0123456789 0123456789 0123456789");
		});
	}
	
	@Test
	void testTaskClassIdIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Task(null, "Brandon", "Hello World!");
		});
	}
	
	@Test
	void testTaskClassNameIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Task("001", null, "Hello World!");
		});
	}
	
	@Test
	void testTaskClassDescriptionIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Task("001", "Brandon", null);
		});
	}
}
