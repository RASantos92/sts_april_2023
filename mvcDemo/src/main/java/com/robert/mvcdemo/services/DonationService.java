package com.robert.mvcdemo.services;

import java.util.List;
import java.util.Optional;

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
	
	public Donation findOne(Long id) {
		Optional<Donation> donation = donationRepo.findById(id);
//		if(donation.isPresent()) {
//			return donation.get();
//		}
		return donation.isPresent() ? donation.get() : null;
	}
	
	public Donation edit(Donation donation) {
		return donationRepo.save(donation);
	}
	
	
	public void deleteDonation(Long id) {
		donationRepo.deleteById(id);
	}

}
