package com.robert.jspjstldemo.controllers;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	@GetMapping("/vinilla/java")
	public String vinillaJava() {
		return "vinilla.jsp";
	}
	
	@GetMapping("/jstl/java")
	public String jstlJava(Model model) {
		String name = "Calvin";
		Integer age = 23;
		Boolean isHungry = true;
		model.addAttribute("name" , name);
		model.addAttribute("age" , age);
		model.addAttribute("isHungry" , isHungry);
		model.addAttribute("test", "<script>alert('h1')</script>");
		
		ArrayList<String> users = new ArrayList<String>();
		users.add("Kimly");
		users.add("Tyrik");
		users.add("Shreyas");
		users.add("Reece");
		
		model.addAttribute("allUsers", users);
		return "jstl.jsp";
	}
}

