package com.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.entities.Admin;
import com.demo.repositories.AdminRepository;

//@Repository, @Service, @Component, @Configuration
@Service
public class AdminService {

	@Autowired
	private AdminRepository adminRepository;
	
	public List<Admin> getAllAdmins() {
		return adminRepository.findAll();
	}
	public Admin findById(int id) {
		Optional<Admin> optional = adminRepository.findById(id);
		if(optional.isPresent()) {
			Admin admin = optional.get();
			return admin;
		} else {
			// throw exception
			throw new RuntimeException("Book with id "+id+" is not found in database");
		}
	}
	public Admin saveAdmin(Admin b) {
		return adminRepository.save(b);
	}
	public Admin updateAdmin(Admin b) {
		if(adminRepository.existsById(b.getFlightId())) {
			return adminRepository.save(b); // save if id not found, edit where id is found 
		} else {
			throw new RuntimeException("Invalid id, update operation failed");
		}
	}
	
	public boolean deleteAdmin(int id) {
		boolean isFound = adminRepository.existsById(id);
		adminRepository.deleteById(id);
		return isFound;
	}
}
