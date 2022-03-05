package com.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.entities.Admin;
import com.demo.services.AdminService;

@RestController
public class AdminController {
	
	@Autowired
	private AdminService adminService; // new FlightService();

	@GetMapping(value = "/admins", produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
	public List<Admin> getAllAdmins() {
		return adminService.getAllAdmins();
	}
	@GetMapping("flights/{id}")
	public Admin findById(@PathVariable int id) {
		return adminService.findById(id);
	}
	@PostMapping("/admins")
	public ResponseEntity<?> saveadmin(@RequestBody Admin b) {
		return new ResponseEntity<Admin>(adminService.saveAdmin(b), HttpStatus.CREATED);
	}
	@PutMapping("/admins")
	public Admin updateAdmin(@RequestBody Admin b) {
		return adminService.updateAdmin(b);
	}
	@DeleteMapping("/flights/{id}")
	public boolean deleteAdmin(@PathVariable int id) {
		return adminService.deleteAdmin(id);
	}
}
