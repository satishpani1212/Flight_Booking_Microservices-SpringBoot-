package com.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.entities.Flight;
import com.demo.repositories.FlightRepository;

//@Repository, @Service, @Component, @Configuration
@Service
public class FlightService {

	@Autowired
	private FlightRepository flightRepository;
	
	public List<Flight> getAllFlights() {
		return flightRepository.findAll();
	}
	public Flight findById(int id) {
		Optional<Flight> optional = flightRepository.findById(id);
		if(optional.isPresent()) {
			Flight flight = optional.get();
			return flight;
		} else {
			// throw exception
			throw new RuntimeException("Book with id "+id+" is not found in database");
		}
	}
	public Flight saveFlight(Flight b) {
		return flightRepository.save(b);
	}
	public Flight updateFlight(Flight b) {
		if(flightRepository.existsById(b.getFlightId())) {
			return flightRepository.save(b); // save if id not found, edit where id is found 
		} else {
			throw new RuntimeException("Invalid id, update operation failed");
		}
	}
	
	public boolean deleteFlight(int id) {
		boolean isFound = flightRepository.existsById(id);
		flightRepository.deleteById(id);
		return isFound;
	}
}
