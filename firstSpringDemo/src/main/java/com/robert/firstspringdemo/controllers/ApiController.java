package com.robert.firstspringdemo.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
	
	@RequestMapping("/api/test")
	public String test() {
		return "Testing...";
	}
	
	@RequestMapping("/api/number")
	public int testNumber() {
		return 20;
	}

}
