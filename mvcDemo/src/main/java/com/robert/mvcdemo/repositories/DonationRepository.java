package com.robert.mvcdemo.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.robert.mvcdemo.models.Donation;

@Repository
public interface DonationRepository extends CrudRepository<Donation, Long>{
	
}
