package com.polytech.Todolist;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class main {

	public static void main(String[] args) {
	      BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
	      System.out.println(passwordEncoder.encode("huyen1234"));      
	}

}
