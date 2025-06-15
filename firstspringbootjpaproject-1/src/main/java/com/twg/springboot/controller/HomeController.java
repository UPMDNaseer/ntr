package com.twg.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.twg.springboot.entity.Details;
import com.twg.springboot.service.DetailsService;

@RestController
public class HomeController {

	@Autowired
	private DetailsService detailsService;
	
	@PostMapping("/")
	public String insertDetails() {
		
		Details details = new Details();
		details.setName("Raghu");
		details.setAdress("Gandhinagar");
		details.setDepartment("Kalupumokka");
		details.setRole("Student");
		
		Details emp=detailsService.saveDetails(details);
		
		return "Details " +emp.getName()+ " with id " +emp.getId()+ " is saved successfully";
		
	}
	
	@GetMapping("/")
	public String insertDetails1() {
		
		Details details = new Details();
		details.setName("Raghu");
		details.setAdress("Gandhinagar");
		details.setDepartment("Kalupumokka");
		details.setRole("Student");
		
		Details emp=detailsService.saveDetails(details);
		
		return "Details " +emp.getName()+ " with id " +emp.getId()+ " is saved successfully";
		
	}
	
}
