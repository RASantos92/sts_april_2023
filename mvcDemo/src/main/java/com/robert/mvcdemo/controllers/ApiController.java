package com.robert.mvcdemo.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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

}
