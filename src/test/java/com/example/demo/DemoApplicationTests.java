package com.example.demo;

import com.example.demo.exception.TaskNotFoundException;
import com.example.demo.service.TaskService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertThrows;

@SpringBootTest
class TaskServiceTest {

	@Autowired
	private TaskService taskService;

	@Test
	void shouldThrowExceptionWhenTaskNotFound() {
		assertThrows(TaskNotFoundException.class, () -> {
			taskService.getById(999L);
		});
	}
}