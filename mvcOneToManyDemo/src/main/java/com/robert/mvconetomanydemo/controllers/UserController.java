package com.robert.mvconetomanydemo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.robert.mvconetomanydemo.models.User;
import com.robert.mvconetomanydemo.services.UserService;

import jakarta.validation.Valid;

@Controller
@RequestMapping("/users")
public class UserController {
	
	private final UserService userServ;
	
	public UserController(UserService userServ) {
		this.userServ = userServ;
	}
	
	 @GetMapping("/create")
	 public String createUser(@ModelAttribute("user") User user) {
		 return "user/create.jsp";
	 }
	 
	 @PostMapping("/process/create")
	 public String userProcessCreate(@Valid @ModelAttribute("user") User user, BindingResult result) {
		 if(result.hasErrors()) {
			 return "user/create.jsp";
		 }
		 userServ.create(user);
		 return "redirect:/";
	 }

}	
