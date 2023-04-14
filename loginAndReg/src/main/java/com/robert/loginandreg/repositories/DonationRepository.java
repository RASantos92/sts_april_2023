package com.robert.loginandreg.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.robert.loginandreg.models.Donation;

@Repository
public interface DonationRepository extends CrudRepository<Donation, Long>{
	List<Donation> findAll();
}
