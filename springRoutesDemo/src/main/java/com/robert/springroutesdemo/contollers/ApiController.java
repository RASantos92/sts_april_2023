package com.robert.springroutesdemo.contollers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ApiController {
	// option 1:  request mapping default: GET;
	@RequestMapping("/option/1")
	public String option1() {
		return "Option 1 request Mapping";
	}
	
	@RequestMapping(value = "/option/2", method = RequestMethod.GET)
	public String option2() {
		return "option 2 request mapping";
	}
	
	@GetMapping("/option/3")
	public String option3() {
		return "option 3 request mapping";
	}
	
	@GetMapping("/option/4")
	public Double option4() {
		return 10.10;
	}
	

	
	

}
