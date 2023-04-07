package com.robert.springroutesdemo.contollers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RouterController {
	
	//https://www.google.com/search?q=husky+pictures
	
	@RequestMapping("/search")
	public String searchKeyword(@RequestParam("keyword") String keyword) {
		return "you are searching for : " + keyword;
	}

	@RequestMapping("/search/pet")
	public String searchKeyword(@RequestParam("name") String name, @RequestParam("age") int age) {
		return "your pet name is :  " + name + " your pets age is: " + age;
	}
	
	@RequestMapping("/search/pet/optional")
	public String searchKeywordOptional(@RequestParam(value="name", required=false) String name, @RequestParam(value ="age", required=false) Integer age) {
		return "your pet name is :  " + name + " your pets age is: " + age;
	}
	
	//Path Variables https://login.codingdojo.com/m/315/9532/64272
	@RequestMapping("/path/m/{name}/{color}")
	public String petWithColor(@PathVariable("name") String name, @PathVariable("color") String color) {
		return name + " is " + color;
	}
	
}
