package com.robert.loginandreg.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.robert.loginandreg.models.Donation;
import com.robert.loginandreg.repositories.DonationRepository;

@Service
public class DonationService {
	@Autowired
	private DonationRepository donationRepo;

	public Donation getOne(Long id) {
		Optional<Donation> donation = donationRepo.findById(id);
		return donation.isPresent() ? donation.get() : null;
	}

	public List<Donation> getAll() {
		return (List<Donation>) donationRepo.findAll();
	}

	public Donation create(Donation donation) {
		return donationRepo.save(donation);
	}

	public Donation update(Donation donation) {
		return donationRepo.save(donation);
	}

	public void delete(Long id) {
		donationRepo.deleteById(id);
	}

}
