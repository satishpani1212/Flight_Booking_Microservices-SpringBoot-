package com.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.entities.Flight;
import com.demo.entities.Passenger;
import com.demo.services.FlightService;
import com.demo.services.PassengerService;

@RestController
@CrossOrigin(value = "*")
public class PassengerController {
	
	@Autowired
	private PassengerService passengerService; 

	@GetMapping(value = "/passengers", produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
	public List<Passenger> getAllPassenger() {
		return passengerService.getAllPassengers();
	}
	@GetMapping("passengers/{id}")
	public Passenger findById(@PathVariable int id) {
		return passengerService.findById(id);
	}
	@PostMapping("/passengers")
	public ResponseEntity<?> savePassenger(@RequestBody Passenger b) {
		return new ResponseEntity<Passenger>(passengerService.savePassenger(b), HttpStatus.CREATED);
	}
	@PutMapping("/passengers")
	public Passenger updatePassenger(@RequestBody Passenger b) {
		return passengerService.updatePassenger(b);
	}
	@DeleteMapping("/passengers/{id}")
	public boolean deletePassenger(@PathVariable int id) {
		return passengerService.deletePassenger(id);
	}
}
