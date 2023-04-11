package com.robert.mvcdemo.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.robert.mvcdemo.models.Donation;
import com.robert.mvcdemo.services.DonationService;

@RestController
@RequestMapping("/api")
public class ApiController {

	private final DonationService donationServ;
	
	public ApiController(DonationService donationServ) {
		this.donationServ = donationServ;
	}
	
	@GetMapping("/donations")
	public List<Donation> findAllDonations(){
		return donationServ.getAll();
	}
	
	@PostMapping("/donations")
	public Donation createDonation(@RequestParam("name") String name, @RequestParam("quantity") Integer quantity, @RequestParam("donor") String donor) {
		Donation newDonation = new Donation(name,quantity, donor);
		return donationServ.create(newDonation);
	}
	
	@GetMapping("/donations/{id}")
	public Donation findOneDonation(@PathVariable("id") Long id) {
		return donationServ.findOne(id);
	}
	
	//-------------Edit (/donations/{id})----------------
	//1. id from the @PathVariables
	//2. data from @ReqeustParam
	@PutMapping("/donations/{id}")
	public Donation editOneDonation(@PathVariable("id") Long id,@RequestParam("name") String name, @RequestParam("quantity") Integer quantity, @RequestParam("donor") String donor ) {
		Donation foundDonation = donationServ.findOne(id);
		if(foundDonation == null) {
			return foundDonation;
		}
		foundDonation.setDonor(donor);
		foundDonation.setName(name);
		foundDonation.setQuantity(quantity);
		return donationServ.edit(foundDonation);
	}

	
	//-------------Delete (/donations/{id})----------------
	@DeleteMapping("/donations/{id}")
	public String deleteDonation(@PathVariable("id") Long id) {
		donationServ.deleteDonation(id);
		return id + " has been deleted";
	}

}
