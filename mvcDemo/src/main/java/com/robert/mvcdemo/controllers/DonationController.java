package com.robert.mvcdemo.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.robert.mvcdemo.models.Donation;
import com.robert.mvcdemo.services.DonationService;

import jakarta.validation.Valid;

@Controller
@RequestMapping("/donations")
public class DonationController {
	
	public final DonationService donationServ;
	
	public DonationController(DonationService donationServ) {
		this.donationServ = donationServ;
	}
	
	@GetMapping("/all")
	public String allDonations(Model model, @ModelAttribute("donation") Donation donation) {
		model.addAttribute("allDonations", donationServ.getAll());
		return "donation/showAll.jsp";
	}
	
	@GetMapping("/display/{id}")
	public String oneDonation(@PathVariable("id") Long id, Model model) {
		model.addAttribute("donation", donationServ.findOne(id));
		return "donation/display.jsp";
	}
	
	@GetMapping("/create")
	public String createDonation(@ModelAttribute("donation") Donation donation) {
		return "donation/create.jsp";
	}
	
	@GetMapping("/search")
	public String searchDonation(@RequestParam("searchValue") String searchValue, Model model, @ModelAttribute("donation") Donation donation) {
		List<Donation> allDonations = donationServ.searchByDonationName(searchValue);
		model.addAttribute("allDonations" , allDonations);
		return "donation/showAll.jsp";
	}
	
	
	
	@PostMapping("/process/create")
	public String processCreateDonation(@Valid @ModelAttribute("donation") Donation newDonation, BindingResult result,Model model) {
		if(result.hasErrors()) {
			model.addAttribute("allDonations", donationServ.getAll());
			return "donation/showAll.jsp";
		}
		donationServ.create(newDonation);
		return "redirect:/donations/all";			
	}
	
	
	
	
	@GetMapping("/edit/{id}")
	public String editDonation(@PathVariable("id") Long id, Model model) {
		Donation donation = donationServ.findOne(id);
		model.addAttribute("donation", donation);
		return "donation/edit.jsp";
	}
	
	@PutMapping("/process/edit/{id}")
	public String processEditDonation(@Valid @ModelAttribute("donation") Donation donation, BindingResult result, @PathVariable("id") Long id) {
		
		if(result.hasErrors()) {
			return "donation/edit.jsp";
		}
		donationServ.edit(donation);
		return "redirect:/donations/display/" + id;
	}
	
	
	
	
	
	
	@DeleteMapping("/delete/{id}")
	public String deleteDonation(@PathVariable("id") Long id) {
		donationServ.deleteDonation(id);
		return "redirect:/donations/all";
	}

}
