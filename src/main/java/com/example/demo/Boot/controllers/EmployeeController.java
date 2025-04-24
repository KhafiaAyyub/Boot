package com.example.demo.Boot.controllers;

import java.time.LocalDate;
import java.util.Date;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Boot.dto.EmployeeDTO;

//Operations
//GET /employees
//POST /employees - create 
//DELETE /employees


//restcontroller ka parent controller
@RestController
public class EmployeeController {

//	@GetMapping(path = "/employees")
//	public String getEmployess() {
//		return "Hello world";
//	}
	
	@GetMapping(path = "/employees",  produces = "application/json")
	public EmployeeDTO getEmployess() {
		return new EmployeeDTO(12L,"Khafia",LocalDate.of(2024, 1, 2),true);
	}
	
	
	
}
