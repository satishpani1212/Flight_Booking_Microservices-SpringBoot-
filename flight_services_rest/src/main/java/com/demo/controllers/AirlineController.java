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

import com.demo.entities.Airline;
import com.demo.services.AirlineService;

@RestController
//@CrossOrigin
@CrossOrigin(value = "*")
public class AirlineController {
	
	@Autowired
	private AirlineService airlineService; 

	@GetMapping(value = "/airlines", produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
	public List<Airline> getAllAirlines() {
		return airlineService.getAllAirlines();
	}
	@GetMapping("airlines/{id}")
	public Airline findById(@PathVariable int id) {
		return airlineService.findById(id);
	}
	
	@PostMapping("/airlines")
	public ResponseEntity<?> saveAirline(@RequestBody Airline b) {
		return new ResponseEntity<Airline>(airlineService.saveAirline(b), HttpStatus.CREATED);
	}
	@PutMapping("/airlines")
	public Airline updateAirline(@RequestBody Airline b) {
		return airlineService.updateAirline(b);
	}
	@DeleteMapping("/airlines/{id}")
	public boolean deleteAirline(@PathVariable int id) {
		return airlineService.deleteAirline(id);
	}
}
