package com.robert.mvconetomanydemo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.robert.mvconetomanydemo.models.Donation;
import com.robert.mvconetomanydemo.services.DonationService;
import com.robert.mvconetomanydemo.services.UserService;

import jakarta.validation.Valid;

@Controller
@RequestMapping("/donations")
public class DonationController {

	private final DonationService donationServ;
	private final UserService userServ;
	public DonationController(DonationService donationServ,UserService userServ) {
		this.donationServ = donationServ;
		this.userServ = userServ;
	}
	
	@GetMapping("/create")
	public String createDonation(@ModelAttribute("donation") Donation donation, Model model) {
		model.addAttribute("allUsers", userServ.getAll());
		return "donation/create.jsp";
	}
	
	@PostMapping("/process/create")
	public String processCreateDonation(@Valid @ModelAttribute("donation") Donation donation, BindingResult result, Model model) {
		if(result.hasErrors()) {
			model.addAttribute("allUsers", userServ.getAll());
			return "donation/create.jsp";
		}
		donationServ.create(donation);
		return "redirect:/";
	}

}
