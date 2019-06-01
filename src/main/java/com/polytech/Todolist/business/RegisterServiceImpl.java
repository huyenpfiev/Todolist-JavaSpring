package com.polytech.Todolist.business;

import com.polytech.Todolist.repository.UserRepository;

public class RegisterServiceImpl implements RegisterService {
	private UserRepository userRepository;
	public RegisterServiceImpl (UserRepository userRepository) {
		this.userRepository=userRepository;
	}
	public int register(Users user) {
		return userRepository.register(user);
		
	}

}
