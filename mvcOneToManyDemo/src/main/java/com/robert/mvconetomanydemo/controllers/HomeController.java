package com.robert.mvconetomanydemo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.robert.mvconetomanydemo.services.DonationService;
import com.robert.mvconetomanydemo.services.UserService;

@Controller
public class HomeController {
	
	private UserService userServ;
	private DonationService donationServ;
	
	public HomeController(UserService userServ,DonationService donationServ) {
		this.userServ = userServ;
		this.donationServ = donationServ;
	}

	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("allDonations", donationServ.getAll());
		model.addAttribute("allUsers", userServ.getAll());
		return "main/dashboard.jsp";
	}
}
