package com.polytech.Todolist.repository;

import java.util.List;

import com.polytech.Todolist.business.Task;

public interface TaskRepository {
	List<Task> fetchAll(String username);

	List<Task> addTask(Task task);

	List<Task> deleteTask(Long id,String username);
	
	List<Task> updateDone(Task task);
	
	List<Task> updateTask(Task task);
}
