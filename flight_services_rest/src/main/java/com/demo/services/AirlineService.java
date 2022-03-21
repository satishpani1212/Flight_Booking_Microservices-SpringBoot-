package com.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.entities.Airline;
import com.demo.entities.Passenger;
import com.demo.repositories.AirlineRepository;

//@Repository, @Service, @Component, @Configuration
@Service
public class AirlineService {

	@Autowired
	private AirlineRepository airlineRepository;
	
	public List<Airline> getAllAirlines() {
		return airlineRepository.findAll();
	}
	public Airline findById(int id) {
		Optional<Airline> optional = airlineRepository.findById(id);
		if(optional.isPresent()) {
			Airline airline = optional.get();
			return airline;
		} else {
			// throw exception
			throw new RuntimeException("Airline with id "+id+" is not found in database");
		}
	}
	public Airline saveAirline(Airline b) {
		return airlineRepository.save(b);
	}
	public Airline updateAirline(Airline b) {
		if(airlineRepository.existsById(b.getId())) {
			return airlineRepository.save(b); // save if id not found, edit where id is found 
		} else {
			throw new RuntimeException("Invalid id, update operation failed");
		}
	}
	
	public boolean deleteAirline(int id) {
		boolean isFound = airlineRepository.existsById(id);
		airlineRepository.deleteById(id);
		return isFound;
	}
	public String isBlocked(String airline) {
	return  airlineRepository.isFound(airline);
	}
}
