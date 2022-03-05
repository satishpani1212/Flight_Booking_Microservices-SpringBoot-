package com.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.entities.Passenger;
import com.demo.repositories.PassengerRepository;

//@Repository, @Service, @Component, @Configuration
@Service
public class PassengerService {

	@Autowired
	private PassengerRepository passengerRepository;
	
	public List<Passenger> getAllPassengers() {
		return passengerRepository.findAll();
	}
	public Passenger findById(int id) {
		Optional<Passenger> optional = passengerRepository.findById(id);
		if(optional.isPresent()) {
			Passenger passenger = optional.get();
			return passenger;
		} else {
			// throw exception
			throw new RuntimeException("Passenger with id "+id+" is not found in database");
		}
	}
	public Passenger savePassenger(Passenger b) {
		return passengerRepository.save(b);
	}
	public Passenger updatePassenger(Passenger b) {
		if(passengerRepository.existsById(b.getId())) {
			return passengerRepository.save(b); // save if id not found, edit where id is found 
		} else {
			throw new RuntimeException("Invalid id, update operation failed");
		}
	}
	
	public boolean deletePassenger(int id) {
		boolean isFound = passengerRepository.existsById(id);
		passengerRepository.deleteById(id);
		return isFound;
	}
}
