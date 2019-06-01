package com.polytech.Todolist.business;

import java.util.List;

public interface TaskService {

	List<Task> fetchAll(String username);

	List<Task> addTask(Task task);

	List<Task> deleteTask(Long id,String username);
	
	List<Task> updateDone(Task task);
	
	List<Task> updateTask(Task task);

}
