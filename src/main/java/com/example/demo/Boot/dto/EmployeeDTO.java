package com.example.demo.Boot.dto;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDTO {
	
	private Long id;
	private String name;
	private LocalDate dateOfJoining;
	private boolean isActive;
	
//	public EmployeeDTO(Long id, String name, LocalDate dateOfJoining, boolean isActive) {
//		this.id = id;
//		this.name = name;
//		this.dateOfJoining = dateOfJoining;
//		this.isActive = isActive;
//	}
	
	
	
}
