package com.robert.mvcdemo.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.robert.mvcdemo.models.Donation;
import com.robert.mvcdemo.repositories.DonationRepository;

@Service
public class DonationService {

	private final DonationRepository donationRepo;
	
	public DonationService(DonationRepository donationRepo) {
		this.donationRepo = donationRepo;
	}
	
	public List<Donation> getAll(){
		return (List<Donation>) donationRepo.findAll();
	}
	
	public Donation create(Donation donation) {
		return donationRepo.save(donation);
	}

}
