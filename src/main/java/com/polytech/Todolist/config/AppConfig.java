package com.polytech.Todolist.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.mysql.cj.jdbc.MysqlDataSource;
import com.polytech.Todolist.business.RegisterService;
import com.polytech.Todolist.business.RegisterServiceImpl;
import com.polytech.Todolist.business.TaskService;
import com.polytech.Todolist.business.TaskServiceImpl;
import com.polytech.Todolist.repository.JpaTaskRepository;
import com.polytech.Todolist.repository.JpaUserRepository;
import com.polytech.Todolist.repository.TaskRepository;
import com.polytech.Todolist.repository.UserRepository;


@Configuration
public class AppConfig {
	@Bean
    TaskRepository taskRepository() {
        return new JpaTaskRepository(dataSource());
    }
    @Bean
    UserRepository userRepository() {
        return new JpaUserRepository(dataSource());
    }

    @Bean
    DataSource dataSource() {
        MysqlDataSource dataSource = new MysqlDataSource();
        dataSource.setURL("jdbc:mysql://127.0.0.1:3306/todolist?serverTimezone=UTC");
        dataSource.setUser("root");
        dataSource.setPassword("password");
        dataSource.setDatabaseName("todolist");
        return dataSource;
    }
    
    @Bean
    RegisterService registerService() {
    	return new RegisterServiceImpl(userRepository());
    }
    @Bean
    TaskService taskService() {
    	return new TaskServiceImpl(taskRepository());
    }
    

}
