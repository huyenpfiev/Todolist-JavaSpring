package com.polytech.Todolist.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {
	@GetMapping("/registerPage")
    public String registerPage() {
		return "/register.html"; 
	}
	@GetMapping("/")
	public String home() {
		return "/index.html";
	}
	@GetMapping("/todolist")
    public String todolist() {
		return "/todolist.html"; 
	}
}
