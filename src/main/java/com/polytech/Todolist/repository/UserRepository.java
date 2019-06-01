package com.polytech.Todolist.repository;

import java.util.List;

import com.polytech.Todolist.business.Users;

public interface UserRepository {
	List<Users> findUsername(String username);
	int register(Users user);
}
