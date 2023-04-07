package com.robert.springroutesdemo.contollers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	@GetMapping("/test")
	public String test(Model model) {
		model.addAttribute("dataFromController" , "this is from the controller");
		return "index.jsp";
	}
}
